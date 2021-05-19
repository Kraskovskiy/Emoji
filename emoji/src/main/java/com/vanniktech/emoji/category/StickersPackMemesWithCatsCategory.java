package com.vanniktech.emoji.category;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray")
public final class StickersPackMemesWithCatsCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[]{
            new Emoji(true, 301001, R.drawable.stickers_pack_memes_with_cats_n1, true),
            new Emoji(true, 301002, R.drawable.stickers_pack_memes_with_cats_n2, true),
            new Emoji(true, 301003, R.drawable.stickers_pack_memes_with_cats_n3, true),
            new Emoji(true, 301004, R.drawable.stickers_pack_memes_with_cats_n4, true),
            new Emoji(true, 301005, R.drawable.stickers_pack_memes_with_cats_n5, true),
            new Emoji(true, 301006, R.drawable.stickers_pack_memes_with_cats_n6, true),
            new Emoji(true, 301007, R.drawable.stickers_pack_memes_with_cats_n7, true),
            new Emoji(true, 301008, R.drawable.stickers_pack_memes_with_cats_n8, true),
            new Emoji(true, 301009, R.drawable.stickers_pack_memes_with_cats_n9, true),
            new Emoji(true, 301010, R.drawable.stickers_pack_memes_with_cats_n10, true),
            new Emoji(true, 301011, R.drawable.stickers_pack_memes_with_cats_n11, true),
            new Emoji(true, 301012, R.drawable.stickers_pack_memes_with_cats_n12, true),
            new Emoji(true, 301013, R.drawable.stickers_pack_memes_with_cats_n13, true),
            new Emoji(true, 301014, R.drawable.stickers_pack_memes_with_cats_n14, true),
            new Emoji(true, 301015, R.drawable.stickers_pack_memes_with_cats_n15, true),
            new Emoji(true, 301016, R.drawable.stickers_pack_memes_with_cats_n16, true),
            new Emoji(true, 301017, R.drawable.stickers_pack_memes_with_cats_n17, true),
            new Emoji(true, 301018, R.drawable.stickers_pack_memes_with_cats_n18, true),
            new Emoji(true, 301019, R.drawable.stickers_pack_memes_with_cats_n19, true),
            new Emoji(true, 301020, R.drawable.stickers_pack_memes_with_cats_n20, true),
            new Emoji(true, 301021, R.drawable.stickers_pack_memes_with_cats_n21, true),
            new Emoji(true, 301022, R.drawable.stickers_pack_memes_with_cats_n22, true),
            new Emoji(true, 301023, R.drawable.stickers_pack_memes_with_cats_n23, true),
            new Emoji(true, 301024, R.drawable.stickers_pack_memes_with_cats_n24, true),
            new Emoji(true, 301025, R.drawable.stickers_pack_memes_with_cats_n25, true),
            new Emoji(true, 301026, R.drawable.stickers_pack_memes_with_cats_n26, true),
            new Emoji(true, 301027, R.drawable.stickers_pack_memes_with_cats_n27, true),
            new Emoji(true, 301028, R.drawable.stickers_pack_memes_with_cats_n28, true),
            new Emoji(true, 301029, R.drawable.stickers_pack_memes_with_cats_n29, true),
            new Emoji(true, 301030, R.drawable.stickers_pack_memes_with_cats_n30, true)
    };

    @Override
    @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override
    @DrawableRes
    public int getIcon() {
        return R.drawable.stickers_pack_memes_with_cats_n1;
    }

    @Override
    public boolean isSticker() {
        return true;
    }
}
