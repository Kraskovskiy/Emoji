package com.vanniktech.emoji.category;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class StickersPackSiamesekittyCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[] {
            new Emoji(390001, R.drawable.stickers_pack_siamesekitty_n1, true),
            new Emoji(390002, new String[]{"kissing_heart"}, R.drawable.stickers_pack_siamesekitty_n2),
            new Emoji(390003, R.drawable.stickers_pack_siamesekitty_n3, true),
            new Emoji(390004, R.drawable.stickers_pack_siamesekitty_n4, true),
            new Emoji(390005, R.drawable.stickers_pack_siamesekitty_n5, true),
            new Emoji(390006, R.drawable.stickers_pack_siamesekitty_n6, true),
            new Emoji(390007, R.drawable.stickers_pack_siamesekitty_n7, true),
            new Emoji(390008, R.drawable.stickers_pack_siamesekitty_n8, true),
            new Emoji(390009, R.drawable.stickers_pack_siamesekitty_n9, true),
            new Emoji(390010, R.drawable.stickers_pack_siamesekitty_n10, true),
            new Emoji(390011, R.drawable.stickers_pack_siamesekitty_n11, true),
            new Emoji(390012, R.drawable.stickers_pack_siamesekitty_n12, true),
            new Emoji(390013, R.drawable.stickers_pack_siamesekitty_n13, true),
            new Emoji(390014, R.drawable.stickers_pack_siamesekitty_n14, true),
            new Emoji(390015, R.drawable.stickers_pack_siamesekitty_n15, true),
            new Emoji(390016, R.drawable.stickers_pack_siamesekitty_n16, true),
            new Emoji(390017, R.drawable.stickers_pack_siamesekitty_n17, true),
            new Emoji(390018, R.drawable.stickers_pack_siamesekitty_n18, true),
            new Emoji(390019, R.drawable.stickers_pack_siamesekitty_n19, true),
            new Emoji(390020, R.drawable.stickers_pack_siamesekitty_n20, true),
            new Emoji(390021, R.drawable.stickers_pack_siamesekitty_n21, true),
            new Emoji(390022, R.drawable.stickers_pack_siamesekitty_n22, true),
            new Emoji(390023, R.drawable.stickers_pack_siamesekitty_n23, true),
            new Emoji(390024, R.drawable.stickers_pack_siamesekitty_n24, true),
            new Emoji(390025, R.drawable.stickers_pack_siamesekitty_n25, true),
            new Emoji(390026, new String[]{"partying_face"}, R.drawable.stickers_pack_siamesekitty_n26)
    };

    @Override @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override @DrawableRes
    public int getIcon() {
        return R.drawable.stickers_pack_siamesekitty_n1;
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
