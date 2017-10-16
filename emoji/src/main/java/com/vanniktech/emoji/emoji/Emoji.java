package com.vanniktech.emoji.emoji;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.content.res.AppCompatResources;
import android.text.TextUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class Emoji implements Serializable {
    private static final long serialVersionUID = 3L;

    @NonNull
    private final String unicode;
    @DrawableRes
    private final int resource;
    @NonNull
    private final List<Emoji> variants;
    @Nullable
    private Emoji base;
    private boolean isStickers = false;
    private boolean isCustomStickers = false;
    private Bitmap bitmapResource;
    private String pathResource;

    public Emoji(@NonNull final int[] codePoints, @DrawableRes final int resource) {
        this(codePoints, resource, new Emoji[0]);
    }

    public Emoji(final int codePoint, @DrawableRes final int resource) {
        this(codePoint, resource, new Emoji[0]);
    }

    public Emoji(final int codePoint, @DrawableRes final int resource, boolean isStickers) {
        this(codePoint, resource, new Emoji[0]);
        this.isStickers = isStickers;
    }

    public Emoji(final int codePoint, final Bitmap resource, boolean isStickers, boolean isCustomStickers) {
        this(codePoint, -1, new Emoji[0]);
        this.isStickers = isStickers;
        this.isCustomStickers = isCustomStickers;
        this.bitmapResource = resource;
    }

    public Emoji(final int codePoint, final String resource, boolean isStickers, boolean isCustomStickers) {
        this(codePoint, -1, new Emoji[0]);
        this.isStickers = isStickers;
        this.isCustomStickers = isCustomStickers;
        this.pathResource = resource;
    }

    public Emoji(final int codePoint, @DrawableRes final int resource, final Emoji... variants) {
        this(new int[]{codePoint}, resource, variants);
    }

    public Emoji(@NonNull final int[] codePoints, @DrawableRes final int resource, final Emoji... variants) {
        this.unicode = new String(codePoints, 0, codePoints.length);
        this.resource = resource;
        // asList seems to always allocate a new object, even for empty lists.
        this.variants = variants.length == 0 ? Collections.<Emoji>emptyList() : asList(variants);
        for (final Emoji variant : variants) {
            variant.base = this;
        }
    }

    @NonNull
    public String getUnicode() {
        return unicode;
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

    public boolean isStickers() {
        return isStickers;
    }

    public boolean isCustomStickers() {
        return isCustomStickers;
    }

    public int getLength() {
        return unicode.length();
    }

    public boolean hasVariants() {
        return !variants.isEmpty();
    }

    public String getPathResource() {
        return pathResource;
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
                    && variants.equals(emoji.variants);
        } else {
            return resource == emoji.resource
                    && unicode.equals(emoji.unicode)
                    && variants.equals(emoji.variants)
                    && pathResource.equals(emoji.pathResource);
        }
    }

    @Override
    public int hashCode() {
        int result = unicode.hashCode();
        result = 31 * result + resource + (TextUtils.isEmpty(pathResource) ? 0 : pathResource.hashCode());
        result = 31 * result + variants.hashCode();
        return result;
    }
}
