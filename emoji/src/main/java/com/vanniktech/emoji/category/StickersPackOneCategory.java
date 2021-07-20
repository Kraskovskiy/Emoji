package com.vanniktech.emoji.category;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class StickersPackOneCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[] {
            new Emoji(100001, new String[]{"slightly_smiling_face"}, R.drawable.stickers_pack_1_n1),
            new Emoji(100002, new String[]{"smiley", "joy"}, R.drawable.stickers_pack_1_n2),
            new Emoji(100003, new String[]{"sunglasses"}, R.drawable.stickers_pack_1_n3),
            new Emoji(100004, new String[]{"kissing_heart", "kissing_smiling_eyes", "kissing_closed_eyes"}, R.drawable.stickers_pack_1_n4),
            new Emoji(100005, new String[]{"ok_hand"}, R.drawable.stickers_pack_1_n5),
            new Emoji(100006, new String[]{"laughing", "slightly_smiling_face", "joy", "rolling_on_the_floor_laughing", "sweat_smile", "grin", "smile", "smiley", "grinning"}, R.drawable.stickers_pack_1_n6),
            new Emoji(100007, R.drawable.stickers_pack_1_n7, true),
            new Emoji(100008, new String[]{"thumbsup"}, R.drawable.stickers_pack_1_n8),
            new Emoji(100009, new String[]{"thumbsdown"}, R.drawable.stickers_pack_1_n9),
            new Emoji(100010, new String[]{"heart"}, R.drawable.stickers_pack_1_n10),
            new Emoji(100011, new String[]{"face_with_thermometer"}, R.drawable.stickers_pack_1_n11),
            new Emoji(100012, new String[]{"pray"}, R.drawable.stickers_pack_1_n12),
            new Emoji(100013, new String[]{"unamused"}, R.drawable.stickers_pack_1_n13)
    };

    @Override @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override @DrawableRes
    public int getIcon() {
        return R.drawable.stickers_pack_1_avatar;
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
