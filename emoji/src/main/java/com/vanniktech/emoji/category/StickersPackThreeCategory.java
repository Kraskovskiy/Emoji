package com.vanniktech.emoji.category;


import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class StickersPackThreeCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[] {
            new Emoji(300001, R.drawable.stickers_pack_3_n1, true),
            new Emoji(300002, R.drawable.stickers_pack_3_n2, true),
            new Emoji(300003, R.drawable.stickers_pack_3_n3, true),
            new Emoji(300004, R.drawable.stickers_pack_3_n4, true),
            new Emoji(300005, R.drawable.stickers_pack_3_n5, true),
            new Emoji(300006, R.drawable.stickers_pack_3_n6, true),
            new Emoji(300007, R.drawable.stickers_pack_3_n7, true),
            new Emoji(300008, R.drawable.stickers_pack_3_n8, true),
            new Emoji(300009, R.drawable.stickers_pack_3_n9, true),
            new Emoji(300010, R.drawable.stickers_pack_3_n10, true),
            new Emoji(300011, R.drawable.stickers_pack_3_n11, true),
            new Emoji(300012, R.drawable.stickers_pack_3_n12, true)
    };

    @Override @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override @DrawableRes
    public int getIcon() {
        return R.drawable.stickers_pack_3_n2;
    }
}