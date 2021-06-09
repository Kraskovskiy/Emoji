package com.vanniktech.emoji.category;


import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class StickersPackBunnyCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[] {
            new Emoji(310001, R.drawable.stickers_pack_bunny_n1, true),
            new Emoji(310002, R.drawable.stickers_pack_bunny_n2, true),
            new Emoji(310003, R.drawable.stickers_pack_bunny_n3, true),
            new Emoji(310004, R.drawable.stickers_pack_bunny_n4, true),
            new Emoji(310005, R.drawable.stickers_pack_bunny_n5, true),
            new Emoji(310006, R.drawable.stickers_pack_bunny_n6, true),
            new Emoji(310007, R.drawable.stickers_pack_bunny_n7, true),
            new Emoji(310008, R.drawable.stickers_pack_bunny_n8, true),
            new Emoji(310009, R.drawable.stickers_pack_bunny_n9, true),
            new Emoji(310010, R.drawable.stickers_pack_bunny_n10, true),
            new Emoji(310011, R.drawable.stickers_pack_bunny_n11, true),
            new Emoji(310012, R.drawable.stickers_pack_bunny_n12, true),
            new Emoji(310013, R.drawable.stickers_pack_bunny_n13, true),
            new Emoji(310014, R.drawable.stickers_pack_bunny_n14, true),
            new Emoji(310015, R.drawable.stickers_pack_bunny_n15, true),
            new Emoji(310016, R.drawable.stickers_pack_bunny_n16, true),
            new Emoji(310017, R.drawable.stickers_pack_bunny_n17, true),
            new Emoji(310018, R.drawable.stickers_pack_bunny_n18, true),
            new Emoji(310019, R.drawable.stickers_pack_bunny_n19, true),
            new Emoji(310020, R.drawable.stickers_pack_bunny_n20, true),
            new Emoji(310021, R.drawable.stickers_pack_bunny_n21, true),
            new Emoji(310022, R.drawable.stickers_pack_bunny_n22, true),
            new Emoji(310023, R.drawable.stickers_pack_bunny_n23, true),
            new Emoji(310024, R.drawable.stickers_pack_bunny_n24, true),
            new Emoji(310025, R.drawable.stickers_pack_bunny_n25, true),
            new Emoji(310026, R.drawable.stickers_pack_bunny_n26, true),
            new Emoji(310027, R.drawable.stickers_pack_bunny_n27, true),
            new Emoji(310028, R.drawable.stickers_pack_bunny_n28, true),
            new Emoji(310029, R.drawable.stickers_pack_bunny_n29, true),
            new Emoji(310030, R.drawable.stickers_pack_bunny_n30, true)
    };

    @Override @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override @DrawableRes
    public int getIcon() {
        return R.drawable.stickers_pack_bunny_n1;
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