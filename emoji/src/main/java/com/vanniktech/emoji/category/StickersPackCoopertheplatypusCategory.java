package com.vanniktech.emoji.category;


import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class StickersPackCoopertheplatypusCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[] {
            new Emoji(320001, R.drawable.stickers_pack_coopertheplatypus_n1, true),
            new Emoji(320002, R.drawable.stickers_pack_coopertheplatypus_n2, true),
            new Emoji(320003, R.drawable.stickers_pack_coopertheplatypus_n3, true),
            new Emoji(320004, R.drawable.stickers_pack_coopertheplatypus_n4, true),
            new Emoji(320005, R.drawable.stickers_pack_coopertheplatypus_n5, true),
            new Emoji(320006, R.drawable.stickers_pack_coopertheplatypus_n6, true),
            new Emoji(320007, R.drawable.stickers_pack_coopertheplatypus_n7, true),
            new Emoji(320008, R.drawable.stickers_pack_coopertheplatypus_n8, true),
            new Emoji(320009, new String[]{"ok_hand"}, R.drawable.stickers_pack_coopertheplatypus_n9),
            new Emoji(320010, R.drawable.stickers_pack_coopertheplatypus_n10, true),
            new Emoji(320011, R.drawable.stickers_pack_coopertheplatypus_n11, true),
            new Emoji(320012, R.drawable.stickers_pack_coopertheplatypus_n12, true),
            new Emoji(320013, R.drawable.stickers_pack_coopertheplatypus_n13, true),
            new Emoji(320014, R.drawable.stickers_pack_coopertheplatypus_n14, true),
            new Emoji(320015, R.drawable.stickers_pack_coopertheplatypus_n15, true),
            new Emoji(320016, R.drawable.stickers_pack_coopertheplatypus_n16, true),
            new Emoji(320017, R.drawable.stickers_pack_coopertheplatypus_n17, true),
            new Emoji(320018, R.drawable.stickers_pack_coopertheplatypus_n18, true),
            new Emoji(320019, R.drawable.stickers_pack_coopertheplatypus_n19, true),
            new Emoji(320020, R.drawable.stickers_pack_coopertheplatypus_n20, true),
            new Emoji(320021, R.drawable.stickers_pack_coopertheplatypus_n21, true),
            new Emoji(320022, R.drawable.stickers_pack_coopertheplatypus_n22, true),
            new Emoji(320023, R.drawable.stickers_pack_coopertheplatypus_n23, true),
            new Emoji(320024, R.drawable.stickers_pack_coopertheplatypus_n24, true),
            new Emoji(320025, R.drawable.stickers_pack_coopertheplatypus_n25, true),
            new Emoji(320026, R.drawable.stickers_pack_coopertheplatypus_n26, true),
            new Emoji(320027, R.drawable.stickers_pack_coopertheplatypus_n27, true),
            new Emoji(320028, R.drawable.stickers_pack_coopertheplatypus_n28, true),
            new Emoji(320029, R.drawable.stickers_pack_coopertheplatypus_n29, true),
            new Emoji(320030, R.drawable.stickers_pack_coopertheplatypus_n30, true),
            new Emoji(320031, R.drawable.stickers_pack_coopertheplatypus_n31, true),
            new Emoji(320032, R.drawable.stickers_pack_coopertheplatypus_n32, true),
            new Emoji(320033, R.drawable.stickers_pack_coopertheplatypus_n33, true),
            new Emoji(320034, R.drawable.stickers_pack_coopertheplatypus_n34, true),
            new Emoji(320035, R.drawable.stickers_pack_coopertheplatypus_n35, true)
    };

    @Override @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override @DrawableRes
    public int getIcon() {
        return R.drawable.stickers_pack_coopertheplatypus_n1;
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
