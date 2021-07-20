package com.vanniktech.emoji.category;


import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class StickersPackBunjoeCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[] {
            new Emoji(300001, new String[]{"laughing", "slightly_smiling_face", "joy", "rolling_on_the_floor_laughing", "sweat_smile", "grin", "smile", "smiley", "grinning"}, R.drawable.stickers_pack_bunjoe_n1),
            new Emoji(300002, new String[]{"kissing_heart", "heart", "kissing_smiling_eyes", "kissing_closed_eyes"}, R.drawable.stickers_pack_bunjoe_n2),
            new Emoji(300003, new String[]{"thumbsup"}, R.drawable.stickers_pack_bunjoe_n3),
            new Emoji(300004, new String[]{"scream"}, R.drawable.stickers_pack_bunjoe_n4),
            new Emoji(300005, new String[]{"wave"}, R.drawable.stickers_pack_bunjoe_n5),
            new Emoji(300006, R.drawable.stickers_pack_bunjoe_n6, true),
            new Emoji(300007, new String[]{"yum"}, R.drawable.stickers_pack_bunjoe_n7),
            new Emoji(300008, R.drawable.stickers_pack_bunjoe_n8, true),
            new Emoji(300009, R.drawable.stickers_pack_bunjoe_n9, true),
            new Emoji(300010, R.drawable.stickers_pack_bunjoe_n10, true),
            new Emoji(300011, R.drawable.stickers_pack_bunjoe_n11, true),
            new Emoji(300012, R.drawable.stickers_pack_bunjoe_n12, true),
            new Emoji(300013, R.drawable.stickers_pack_bunjoe_n13, true),
            new Emoji(300014, R.drawable.stickers_pack_bunjoe_n14, true),
            new Emoji(300015, R.drawable.stickers_pack_bunjoe_n15, true),
            new Emoji(300016, new String[]{"stuck_out_tongue_winking_eye"}, R.drawable.stickers_pack_bunjoe_n16),
            new Emoji(300017, new String[]{"pensive"}, R.drawable.stickers_pack_bunjoe_n17),
            new Emoji(300018, new String[]{"sunglasses"}, R.drawable.stickers_pack_bunjoe_n18),
            new Emoji(300019, R.drawable.stickers_pack_bunjoe_n19, true),
            new Emoji(300020, R.drawable.stickers_pack_bunjoe_n20, true),
            new Emoji(300021, new String[]{"sob"}, R.drawable.stickers_pack_bunjoe_n21),
            new Emoji(300022, R.drawable.stickers_pack_bunjoe_n22, true),
            new Emoji(300023, R.drawable.stickers_pack_bunjoe_n23, true),
            new Emoji(300024, new String[]{"cold_face"}, R.drawable.stickers_pack_bunjoe_n24),
            new Emoji(300025, R.drawable.stickers_pack_bunjoe_n25, true),
            new Emoji(300026, new String[]{"face_with_thermometer"}, R.drawable.stickers_pack_bunjoe_n26),
            new Emoji(300027, new String[]{"smiling_face_with_3_hearts", "heart_eyes"}, R.drawable.stickers_pack_bunjoe_n27),
            new Emoji(300028, R.drawable.stickers_pack_bunjoe_n28, true),
            new Emoji(300029, new String[]{"sleeping"}, R.drawable.stickers_pack_bunjoe_n29),
            new Emoji(300030, new String[]{"man-bowing", "woman-bowing"}, R.drawable.stickers_pack_bunjoe_n30),
            new Emoji(300031, new String[]{"pray"}, R.drawable.stickers_pack_bunjoe_n31),
            new Emoji(300032, R.drawable.stickers_pack_bunjoe_n32, true),
            new Emoji(300033, new String[]{"no_mouth"}, R.drawable.stickers_pack_bunjoe_n33),
            new Emoji(300034, R.drawable.stickers_pack_bunjoe_n34, true),
            new Emoji(300035, new String[]{"unamused"}, R.drawable.stickers_pack_bunjoe_n35)
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