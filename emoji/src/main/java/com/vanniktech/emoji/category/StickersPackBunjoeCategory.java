package com.vanniktech.emoji.category;


import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class StickersPackBunjoeCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[] {
            new Emoji(300001, R.drawable.stickers_pack_bunjoe_n1, true),
            new Emoji(300002, new String[]{"kissing_heart"}, R.drawable.stickers_pack_bunjoe_n2),
            new Emoji(300003, R.drawable.stickers_pack_bunjoe_n3, true),
            new Emoji(300004, R.drawable.stickers_pack_bunjoe_n4, true),
            new Emoji(300005, R.drawable.stickers_pack_bunjoe_n5, true),
            new Emoji(300006, R.drawable.stickers_pack_bunjoe_n6, true),
            new Emoji(300007, R.drawable.stickers_pack_bunjoe_n7, true),
            new Emoji(300008, R.drawable.stickers_pack_bunjoe_n8, true),
            new Emoji(300009, R.drawable.stickers_pack_bunjoe_n9, true),
            new Emoji(300010, R.drawable.stickers_pack_bunjoe_n10, true),
            new Emoji(300011, R.drawable.stickers_pack_bunjoe_n11, true),
            new Emoji(300012, R.drawable.stickers_pack_bunjoe_n12, true),
            new Emoji(300013, R.drawable.stickers_pack_bunjoe_n13, true),
            new Emoji(300014, R.drawable.stickers_pack_bunjoe_n14, true),
            new Emoji(300015, R.drawable.stickers_pack_bunjoe_n15, true),
            new Emoji(300016, R.drawable.stickers_pack_bunjoe_n16, true),
            new Emoji(300017, R.drawable.stickers_pack_bunjoe_n17, true),
            new Emoji(300018, R.drawable.stickers_pack_bunjoe_n18, true),
            new Emoji(300019, R.drawable.stickers_pack_bunjoe_n19, true),
            new Emoji(300020, R.drawable.stickers_pack_bunjoe_n20, true),
            new Emoji(300021, R.drawable.stickers_pack_bunjoe_n21, true),
            new Emoji(300022, R.drawable.stickers_pack_bunjoe_n22, true),
            new Emoji(300023, R.drawable.stickers_pack_bunjoe_n23, true),
            new Emoji(300024, R.drawable.stickers_pack_bunjoe_n24, true),
            new Emoji(300025, R.drawable.stickers_pack_bunjoe_n25, true),
            new Emoji(300026, R.drawable.stickers_pack_bunjoe_n26, true),
            new Emoji(300027, R.drawable.stickers_pack_bunjoe_n27, true),
            new Emoji(300028, R.drawable.stickers_pack_bunjoe_n28, true),
            new Emoji(300029, R.drawable.stickers_pack_bunjoe_n29, true),
            new Emoji(300030, R.drawable.stickers_pack_bunjoe_n30, true),
            new Emoji(300031, R.drawable.stickers_pack_bunjoe_n31, true),
            new Emoji(300032, R.drawable.stickers_pack_bunjoe_n32, true),
            new Emoji(300033, R.drawable.stickers_pack_bunjoe_n33, true),
            new Emoji(300034, R.drawable.stickers_pack_bunjoe_n34, true),
            new Emoji(300035, R.drawable.stickers_pack_bunjoe_n35, true)
    };

    @Override @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override @DrawableRes
    public int getIcon() {
        return R.drawable.stickers_pack_bunjoe_n1;
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