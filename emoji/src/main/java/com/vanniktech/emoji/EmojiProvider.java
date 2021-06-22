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

package com.vanniktech.emoji;

import androidx.annotation.NonNull;

import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Interface for a custom emoji implementation that can be used with {@link EmojiManager}.
 *
 * @since 0.4.0
 */
public interface EmojiProvider {
    /**
     * @return The Array of categories.
     * @since 0.4.0
     */
    @NonNull
    EmojiCategory[] getCategories();

    default List<Emoji> getStickerEmojis(@NonNull String shortcodes) {
        List<Emoji> emojis = new ArrayList<Emoji>();

        for (EmojiCategory category : getCategories()) {
            Emoji emoji = category.getStickerEmoji(shortcodes);
            if (emoji != null) emojis.add(emoji);
        }

        return emojis;
    }
}
