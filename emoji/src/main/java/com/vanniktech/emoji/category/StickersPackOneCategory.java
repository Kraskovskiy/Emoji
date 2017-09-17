package com.vanniktech.emoji.category;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class StickersPackOneCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[] {
            new Emoji(100001, R.drawable.stickers_pack_1_n1, true),
            new Emoji(100002, R.drawable.stickers_pack_1_n2, true),
            new Emoji(100003, R.drawable.stickers_pack_1_n3, true),
            new Emoji(100004, R.drawable.stickers_pack_1_n4, true),
            new Emoji(100005, R.drawable.stickers_pack_1_n5, true),
            new Emoji(100006, R.drawable.stickers_pack_1_n6, true),
            new Emoji(100007, R.drawable.stickers_pack_1_n7, true),
            new Emoji(100008, R.drawable.stickers_pack_1_n8, true),
            new Emoji(100009, R.drawable.stickers_pack_1_n9, true),
            new Emoji(100010, R.drawable.stickers_pack_1_n10, true),
            new Emoji(100011, R.drawable.stickers_pack_1_n11, true),
            new Emoji(100012, R.drawable.stickers_pack_1_n12, true),
            new Emoji(100013, R.drawable.stickers_pack_1_n13, true),
            new Emoji(100014, R.drawable.stickers_pack_1_n14, true),
            new Emoji(100015, R.drawable.stickers_pack_1_n15, true),
            new Emoji(100016, R.drawable.stickers_pack_1_n16, true),
            new Emoji(100017, R.drawable.stickers_pack_1_n17, true),
            new Emoji(100018, R.drawable.stickers_pack_1_n18, true)
    };

    @Override @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override @DrawableRes
    public int getIcon() {
        return R.drawable.stickers_pack_1_n2;
    }
}
