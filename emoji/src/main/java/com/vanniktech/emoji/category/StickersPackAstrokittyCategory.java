package com.vanniktech.emoji.category;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray")
public final class StickersPackAstrokittyCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[]{
            new Emoji(200001, R.drawable.stickers_pack_astrokitty_n1, true),
            new Emoji(200002, R.drawable.stickers_pack_astrokitty_n2, true),
            new Emoji(200003, R.drawable.stickers_pack_astrokitty_n3, true),
            new Emoji(200004, R.drawable.stickers_pack_astrokitty_n4, true),
            new Emoji(200005, R.drawable.stickers_pack_astrokitty_n5, true),
            new Emoji(200006, R.drawable.stickers_pack_astrokitty_n6, true),
            new Emoji(200007, R.drawable.stickers_pack_astrokitty_n7, true),
            new Emoji(200008, R.drawable.stickers_pack_astrokitty_n8, true),
            new Emoji(200009, R.drawable.stickers_pack_astrokitty_n9, true),
            new Emoji(200010, R.drawable.stickers_pack_astrokitty_n10, true),
            new Emoji(200011, R.drawable.stickers_pack_astrokitty_n11, true),
            new Emoji(200012, R.drawable.stickers_pack_astrokitty_n12, true),
            new Emoji(200013, R.drawable.stickers_pack_astrokitty_n13, true),
            new Emoji(200014, R.drawable.stickers_pack_astrokitty_n14, true),
            new Emoji(200015, R.drawable.stickers_pack_astrokitty_n15, true),
            new Emoji(200016, R.drawable.stickers_pack_astrokitty_n16, true),
            new Emoji(200017, R.drawable.stickers_pack_astrokitty_n17, true),
            new Emoji(200018, R.drawable.stickers_pack_astrokitty_n18, true),
            new Emoji(200019, R.drawable.stickers_pack_astrokitty_n19, true),
            new Emoji(200020, R.drawable.stickers_pack_astrokitty_n20, true),
            new Emoji(200021, R.drawable.stickers_pack_astrokitty_n21, true),
            new Emoji(200022, new String[]{"kissing_heart"}, R.drawable.stickers_pack_astrokitty_n22),
            new Emoji(200023, R.drawable.stickers_pack_astrokitty_n23, true),
            new Emoji(200024, R.drawable.stickers_pack_astrokitty_n24, true),
            new Emoji(200025, R.drawable.stickers_pack_astrokitty_n25, true)
    };

    @Override
    @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override
    @DrawableRes
    public int getIcon() {
        return R.drawable.stickers_pack_astrokitty_n1;
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