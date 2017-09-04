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
            new Emoji(100004, R.drawable.stickers_pack_1_n4, true)
    };

    @Override @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override @DrawableRes
    public int getIcon() {
        return R.drawable.sticker_emoji;
    }
}
