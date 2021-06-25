package com.vanniktech.emoji.category;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class StickersPackFierybobCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[] {
            new Emoji(340001, R.drawable.stickers_pack_fierybob_n1, true),
            new Emoji(340002, new String[]{"kissing_heart"}, R.drawable.stickers_pack_fierybob_n2),
            new Emoji(340003, new String[]{"thumbsup"}, R.drawable.stickers_pack_fierybob_n3),
            new Emoji(340004, R.drawable.stickers_pack_fierybob_n4, true),
            new Emoji(340005, R.drawable.stickers_pack_fierybob_n5, true),
            new Emoji(340006, R.drawable.stickers_pack_fierybob_n6, true),
            new Emoji(340007, R.drawable.stickers_pack_fierybob_n7, true),
            new Emoji(340008, R.drawable.stickers_pack_fierybob_n8, true),
            new Emoji(340009, R.drawable.stickers_pack_fierybob_n9, true),
            new Emoji(340010, R.drawable.stickers_pack_fierybob_n10, true),
            new Emoji(340011, R.drawable.stickers_pack_fierybob_n11, true),
            new Emoji(340012, R.drawable.stickers_pack_fierybob_n12, true),
            new Emoji(340013, R.drawable.stickers_pack_fierybob_n13, true),
            new Emoji(340014, R.drawable.stickers_pack_fierybob_n14, true),
            new Emoji(340015, R.drawable.stickers_pack_fierybob_n15, true),
            new Emoji(340016, R.drawable.stickers_pack_fierybob_n16, true),
            new Emoji(340017, R.drawable.stickers_pack_fierybob_n17, true),
            new Emoji(340018, R.drawable.stickers_pack_fierybob_n18, true),
            new Emoji(340019, R.drawable.stickers_pack_fierybob_n19, true),
            new Emoji(340020, R.drawable.stickers_pack_fierybob_n20, true),
            new Emoji(340021, R.drawable.stickers_pack_fierybob_n21, true),
            new Emoji(340022, R.drawable.stickers_pack_fierybob_n22, true),
            new Emoji(340023, R.drawable.stickers_pack_fierybob_n23, true),
            new Emoji(340024, R.drawable.stickers_pack_fierybob_n24, true),
            new Emoji(340025, R.drawable.stickers_pack_fierybob_n25, true),
            new Emoji(340026, R.drawable.stickers_pack_fierybob_n26, true)
    };

    @Override @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override @DrawableRes
    public int getIcon() {
        return R.drawable.stickers_pack_fierybob_n1;
    }

    @Override
    public int getCategoryName() {
        return R.string.emoji_category_stickers;
    }

    @Override
    public boolean isSticker() {
        return true;
    }
}