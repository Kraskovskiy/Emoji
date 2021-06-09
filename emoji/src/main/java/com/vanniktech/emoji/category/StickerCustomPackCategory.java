package com.vanniktech.emoji.category;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("PMD.MethodReturnsInternalArray")
public final class StickerCustomPackCategory implements EmojiCategory {
    private static List<Emoji> DATA = new ArrayList<>();

    public StickerCustomPackCategory(List<Emoji> emojis){
        DATA.clear();
        DATA.addAll(emojis);
    }

    public static void deleteEmoji(Emoji deletedEmoji) {
        for (Emoji emoji:DATA){
            if (emoji.equals(deletedEmoji)){
                DATA.remove(deletedEmoji);
                break;
            }
        }
    }

    @Override
    @NonNull
    public Emoji[] getEmojis() {
        return DATA.toArray(new Emoji[0]);
    }

    @Override
    @DrawableRes
    public int getIcon() {
        return R.drawable.sticker_emoji;
    }

    @Override
    public int getCategoryName() {
        return R.string.emoji_category_custom;
    }

    @Override
    public boolean isSticker() {
        return true;
    }
}