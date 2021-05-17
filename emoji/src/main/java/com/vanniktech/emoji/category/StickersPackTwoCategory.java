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
            new Emoji(200004, R.drawable.stickers_pack_2_n4, true),
            new Emoji(200005, R.drawable.stickers_pack_2_n5, true),
            new Emoji(200006, R.drawable.stickers_pack_2_n6, true),
            new Emoji(200007, R.drawable.stickers_pack_2_n7, true),
            new Emoji(200008, R.drawable.stickers_pack_2_n8, true),
            new Emoji(200009, R.drawable.stickers_pack_2_n9, true),
            new Emoji(200010, R.drawable.stickers_pack_2_n10, true),
            new Emoji(200011, R.drawable.stickers_pack_2_n11, true),
            new Emoji(200012, R.drawable.stickers_pack_2_n12, true),
            new Emoji(200013, R.drawable.stickers_pack_2_n13, true),
            new Emoji(200014, R.drawable.stickers_pack_2_n14, true)
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