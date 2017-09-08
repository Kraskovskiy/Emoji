package com.vanniktech.emoji.category;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class StickersPackTwoCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[] {
            new Emoji(200001, R.drawable.stickers_pack_2_n1, true),
            new Emoji(200002, R.drawable.stickers_pack_2_n2, true),
            new Emoji(200003, R.drawable.stickers_pack_2_n3, true),
            new Emoji(200004, R.drawable.stickers_pack_2_n4, true)
    };

    @Override @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override @DrawableRes
    public int getIcon() {
        return R.drawable.stickers_pack_2_n1;
    }
}