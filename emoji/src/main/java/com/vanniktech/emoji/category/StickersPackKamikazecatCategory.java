package com.vanniktech.emoji.category;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class StickersPackKamikazecatCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[] {
            new Emoji(350001, new String[]{"laughing"}, R.drawable.stickers_pack_kamikazecat_n1),
            new Emoji(350002, new String[]{"kissing_heart"}, R.drawable.stickers_pack_kamikazecat_n2),
            new Emoji(350003, new String[]{"thumbsup"}, R.drawable.stickers_pack_kamikazecat_n3),
            new Emoji(350004, R.drawable.stickers_pack_kamikazecat_n4, true),
            new Emoji(350005, new String[]{"wave"}, R.drawable.stickers_pack_kamikazecat_n5),
            new Emoji(350006, new String[]{"ok_hand"}, R.drawable.stickers_pack_kamikazecat_n6),
            new Emoji(350007, new String[]{"yum"}, R.drawable.stickers_pack_kamikazecat_n7),
            new Emoji(350008, R.drawable.stickers_pack_kamikazecat_n8, true),
            new Emoji(350009, R.drawable.stickers_pack_kamikazecat_n9, true),
            new Emoji(350010, R.drawable.stickers_pack_kamikazecat_n10, true),
            new Emoji(350011, R.drawable.stickers_pack_kamikazecat_n11, true),
            new Emoji(350012, R.drawable.stickers_pack_kamikazecat_n12, true),
            new Emoji(350013, R.drawable.stickers_pack_kamikazecat_n13, true),
            new Emoji(350014, R.drawable.stickers_pack_kamikazecat_n14, true),
            new Emoji(350015, R.drawable.stickers_pack_kamikazecat_n15, true),
            new Emoji(350016, R.drawable.stickers_pack_kamikazecat_n16, true),
            new Emoji(350017, new String[]{"man-bowing", "woman-bowing"}, R.drawable.stickers_pack_kamikazecat_n17),
            new Emoji(350018, R.drawable.stickers_pack_kamikazecat_n18, true),
            new Emoji(350019, new String[]{"heart"}, R.drawable.stickers_pack_kamikazecat_n19),
            new Emoji(350020, R.drawable.stickers_pack_kamikazecat_n20, true),
            new Emoji(350021, new String[]{"relieved"}, R.drawable.stickers_pack_kamikazecat_n21),
            new Emoji(350022, R.drawable.stickers_pack_kamikazecat_n22, true),
            new Emoji(350023, R.drawable.stickers_pack_kamikazecat_n23, true),
            new Emoji(350024, new String[]{"partying_face"}, R.drawable.stickers_pack_kamikazecat_n24),
            new Emoji(350025, new String[]{"shushing_face"}, R.drawable.stickers_pack_kamikazecat_n25),
            new Emoji(350026, R.drawable.stickers_pack_kamikazecat_n26, true),
            new Emoji(350027, new String[]{"sunglasses"}, R.drawable.stickers_pack_kamikazecat_n27),
            new Emoji(350028, R.drawable.stickers_pack_kamikazecat_n28, true),
            new Emoji(350029, R.drawable.stickers_pack_kamikazecat_n29, true),
            new Emoji(350030, R.drawable.stickers_pack_kamikazecat_n30, true),
            new Emoji(350031, new String[]{"sob"}, R.drawable.stickers_pack_kamikazecat_n31)
    };

    @Override @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override @DrawableRes
    public int getIcon() {
        return R.drawable.stickers_pack_kamikazecat_n1;
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
