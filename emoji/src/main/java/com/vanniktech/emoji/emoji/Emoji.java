/*
 * Copyright (C) 2016 - Niklas Baudy, Ruben Gees, Mario Đanić and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.vanniktech.emoji.emoji;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;

import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

@SuppressWarnings("PMD.ArrayIsStoredDirectly")
public class Emoji implements Serializable {
    private static final long serialVersionUID = 3L;
    private static final List<Emoji> EMPTY_EMOJI_LIST = emptyList();

    @NonNull
    private final String unicode;
    @NonNull
    private final String[] shortcodes;
    @DrawableRes
    private final int resource;
    private final boolean isDuplicate;
    @NonNull
    private final List<Emoji> variants;
    @Nullable
    private Emoji base;
    private boolean isStickers = false;
    private boolean isGif = false;
    private boolean isCustomStickers = false;
    private Bitmap bitmapResource;
    private String pathResource;

    public Emoji(final int codePoint, @DrawableRes final int resource, final boolean isSticker) {
        this(codePoint, new String[]{"sticker"}, resource, false, new Emoji[0]);
        this.isStickers = true;
    }

    public Emoji(final int codePoint, final String pathResource, final boolean isSticker) {
        this(codePoint, new String[]{"custom_sticker"}, -1, false, new Emoji[0]);
        this.isStickers = true;
        this.isCustomStickers = true;
        this.pathResource = pathResource;
    }

    public Emoji(@NonNull final int[] codePoints, @NonNull final String[] shortcodes,
                 @DrawableRes final int resource, final boolean isDuplicate) {
        this(codePoints, shortcodes, resource, isDuplicate, new Emoji[0]);
    }

    public Emoji(final int codePoint, @NonNull final String[] shortcodes,
                 @DrawableRes final int resource, final boolean isDuplicate) {
        this(codePoint, shortcodes, resource, isDuplicate, new Emoji[0]);
    }

    public Emoji(final int codePoint, @NonNull final String[] shortcodes,
                 @DrawableRes final int resource, final boolean isDuplicate,
                 final Emoji... variants) {
        this(new int[]{codePoint}, shortcodes, resource, isDuplicate, variants);
    }

    public Emoji(@NonNull final int[] codePoints, @NonNull final String[] shortcodes,
                 @DrawableRes final int resource, final boolean isDuplicate,
                 final Emoji... variants) {
        this.unicode = new String(codePoints, 0, codePoints.length);
        this.shortcodes = shortcodes;
        this.resource = resource;
        this.isDuplicate = isDuplicate;
        this.variants = variants.length == 0 ? EMPTY_EMOJI_LIST : asList(variants);
        for (final Emoji variant : variants) {
            variant.base = this;
        }
    }

    @NonNull
    public String getUnicode() {
        return unicode;
    }

    @Nullable
    public List<String> getShortcodes() {
        return asList(shortcodes);
    }

    /**
     * @deprecated Please migrate to getDrawable(). May return -1 in the future for providers that don't use
     * resources.
     */
    @Deprecated
    @DrawableRes
    public int getResource() {
        return resource;
    }

    @NonNull
    public Drawable getDrawable(final Context context) {
        if (!isCustomStickers) {
            return AppCompatResources.getDrawable(context, resource);
        }

        if (bitmapResource != null) {
            return new BitmapDrawable(context.getResources(), bitmapResource);
        }
        return new BitmapDrawable(context.getResources(), pathResource);
    }

    @NonNull
    public Bitmap getBitmap(final Context context) {
        if (!isCustomStickers) {
            return BitmapFactory.decodeResource(context.getResources(), resource);
        }

        if (bitmapResource != null) {
            return bitmapResource;
        }
        return new BitmapDrawable(context.getResources(), pathResource).getBitmap();
    }

    @SuppressLint("ResourceType")
    @NonNull
    public InputStream getStream(final Context context) {
        return context.getResources().openRawResource(resource);
    }

    public boolean isStickers() {
        return isStickers;
    }

    public boolean isCustomStickers() {
        return isCustomStickers;
    }

    public String getPathResource() {
        return pathResource;
    }

    public boolean isDuplicate() {
        return isDuplicate;
    }

    @NonNull
    public List<Emoji> getVariants() {
        return new ArrayList<>(variants);
    }

    @NonNull
    public Emoji getBase() {
        Emoji result = this;

        while (result.base != null) {
            result = result.base;
        }

        return result;
    }

    public int getLength() {
        return unicode.length();
    }

    public boolean hasVariants() {
        return !variants.isEmpty();
    }

    public void destroy() {
        // For inheritors to override.
    }

    public boolean isGif() {
        return isGif;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Emoji emoji = (Emoji) o;

        if (TextUtils.isEmpty(pathResource)) {
            return resource == emoji.resource
                    && unicode.equals(emoji.unicode)
                    && Arrays.equals(shortcodes, emoji.shortcodes)
                    && variants.equals(emoji.variants);
        } else {
            return resource == emoji.resource
                    && unicode.equals(emoji.unicode)
                    && variants.equals(emoji.variants)
                    && Arrays.equals(shortcodes, emoji.shortcodes)
                    && pathResource.equals(emoji.pathResource);
        }
    }

    @Override
    public int hashCode() {
        int result = unicode.hashCode();
        result = 31 * result + Arrays.hashCode(shortcodes);
        result = 31 * result + resource + (TextUtils.isEmpty(pathResource) ? 0 : pathResource.hashCode());
        result = 31 * result + variants.hashCode();
        return result;
    }
}
