package com.vanniktech.emoji.category;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class StickersPackManoolCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[] {
            new Emoji(360001, R.drawable.stickers_pack_manool_n1, true),
            new Emoji(360002, R.drawable.stickers_pack_manool_n2, true),
            new Emoji(360003, R.drawable.stickers_pack_manool_n3, true),
            new Emoji(360004, R.drawable.stickers_pack_manool_n4, true),
            new Emoji(360005, R.drawable.stickers_pack_manool_n5, true),
            new Emoji(360006, R.drawable.stickers_pack_manool_n6, true),
            new Emoji(360007, R.drawable.stickers_pack_manool_n7, true),
            new Emoji(360008, R.drawable.stickers_pack_manool_n8, true),
            new Emoji(360009, R.drawable.stickers_pack_manool_n9, true),
            new Emoji(360010, R.drawable.stickers_pack_manool_n10, true),
            new Emoji(360011, R.drawable.stickers_pack_manool_n11, true),
            new Emoji(360012, R.drawable.stickers_pack_manool_n12, true),
            new Emoji(360013, R.drawable.stickers_pack_manool_n13, true),
            new Emoji(360014, R.drawable.stickers_pack_manool_n14, true),
            new Emoji(360015, R.drawable.stickers_pack_manool_n15, true),
            new Emoji(360016, R.drawable.stickers_pack_manool_n16, true),
            new Emoji(360017, R.drawable.stickers_pack_manool_n17, true),
            new Emoji(360018, R.drawable.stickers_pack_manool_n18, true),
            new Emoji(360019, R.drawable.stickers_pack_manool_n19, true),
            new Emoji(360020, R.drawable.stickers_pack_manool_n20, true),
            new Emoji(360021, R.drawable.stickers_pack_manool_n21, true),
            new Emoji(360022, R.drawable.stickers_pack_manool_n22, true),
            new Emoji(360023, R.drawable.stickers_pack_manool_n23, true),
            new Emoji(360024, R.drawable.stickers_pack_manool_n24, true),
            new Emoji(360025, R.drawable.stickers_pack_manool_n25, true),
            new Emoji(360026, R.drawable.stickers_pack_manool_n26, true),
            new Emoji(360027, R.drawable.stickers_pack_manool_n27, true),
            new Emoji(360028, R.drawable.stickers_pack_manool_n28, true),
            new Emoji(360029, R.drawable.stickers_pack_manool_n29, true),
            new Emoji(360030, R.drawable.stickers_pack_manool_n30, true),
            new Emoji(360031, R.drawable.stickers_pack_manool_n31, true),
            new Emoji(360032, R.drawable.stickers_pack_manool_n32, true),
            new Emoji(360033, R.drawable.stickers_pack_manool_n33, true),
            new Emoji(360034, R.drawable.stickers_pack_manool_n34, true),
            new Emoji(360035, R.drawable.stickers_pack_manool_n35, true),
            new Emoji(360036, R.drawable.stickers_pack_manool_n36, true)
    };

    @Override @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override @DrawableRes
    public int getIcon() {
        return R.drawable.stickers_pack_manool_n1;
    }

    @Override
    public boolean isSticker() {
        return true;
    }
}
