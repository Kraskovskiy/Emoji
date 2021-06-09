package com.vanniktech.emoji.category;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class StickersPackManoolgirlCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[] {
            new Emoji(370001, R.drawable.stickers_pack_manoolgirl_n1, true),
            new Emoji(370002, R.drawable.stickers_pack_manoolgirl_n2, true),
            new Emoji(370003, R.drawable.stickers_pack_manoolgirl_n3, true),
            new Emoji(370004, R.drawable.stickers_pack_manoolgirl_n4, true),
            new Emoji(370005, R.drawable.stickers_pack_manoolgirl_n5, true),
            new Emoji(370006, R.drawable.stickers_pack_manoolgirl_n6, true),
            new Emoji(370007, R.drawable.stickers_pack_manoolgirl_n7, true),
            new Emoji(370008, R.drawable.stickers_pack_manoolgirl_n8, true),
            new Emoji(370009, R.drawable.stickers_pack_manoolgirl_n9, true),
            new Emoji(370010, R.drawable.stickers_pack_manoolgirl_n10, true),
            new Emoji(370011, R.drawable.stickers_pack_manoolgirl_n11, true),
            new Emoji(370012, R.drawable.stickers_pack_manoolgirl_n12, true),
            new Emoji(370013, R.drawable.stickers_pack_manoolgirl_n13, true),
            new Emoji(370014, R.drawable.stickers_pack_manoolgirl_n14, true),
            new Emoji(370015, R.drawable.stickers_pack_manoolgirl_n15, true),
            new Emoji(370016, R.drawable.stickers_pack_manoolgirl_n16, true),
            new Emoji(370017, R.drawable.stickers_pack_manoolgirl_n17, true),
            new Emoji(370018, R.drawable.stickers_pack_manoolgirl_n18, true),
            new Emoji(370019, R.drawable.stickers_pack_manoolgirl_n19, true),
            new Emoji(370020, R.drawable.stickers_pack_manoolgirl_n20, true),
            new Emoji(370021, R.drawable.stickers_pack_manoolgirl_n21, true),
            new Emoji(370022, R.drawable.stickers_pack_manoolgirl_n22, true),
            new Emoji(370023, R.drawable.stickers_pack_manoolgirl_n23, true),
            new Emoji(370024, R.drawable.stickers_pack_manoolgirl_n24, true),
            new Emoji(370025, R.drawable.stickers_pack_manoolgirl_n25, true),
            new Emoji(370026, R.drawable.stickers_pack_manoolgirl_n26, true),
            new Emoji(370027, R.drawable.stickers_pack_manoolgirl_n27, true),
            new Emoji(370028, R.drawable.stickers_pack_manoolgirl_n28, true),
            new Emoji(370029, R.drawable.stickers_pack_manoolgirl_n29, true),
            new Emoji(370030, R.drawable.stickers_pack_manoolgirl_n30, true),
            new Emoji(370031, R.drawable.stickers_pack_manoolgirl_n31, true),
            new Emoji(370032, R.drawable.stickers_pack_manoolgirl_n32, true),
            new Emoji(370033, R.drawable.stickers_pack_manoolgirl_n33, true),
            new Emoji(370034, R.drawable.stickers_pack_manoolgirl_n34, true),
            new Emoji(370035, R.drawable.stickers_pack_manoolgirl_n35, true),
            new Emoji(370036, R.drawable.stickers_pack_manoolgirl_n36, true)
    };

    @Override @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override @DrawableRes
    public int getIcon() {
        return R.drawable.stickers_pack_manoolgirl_n1;
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
