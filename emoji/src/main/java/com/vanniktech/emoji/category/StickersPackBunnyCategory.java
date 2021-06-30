package com.vanniktech.emoji.category;


import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class StickersPackBunnyCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[] {
            new Emoji(310001, R.drawable.stickers_pack_bunny_n1, true),
            new Emoji(310002, new String[]{"scream"}, R.drawable.stickers_pack_bunny_n2),
            new Emoji(310003, R.drawable.stickers_pack_bunny_n3, true),
            new Emoji(310004, new String[]{"ok_hand"}, R.drawable.stickers_pack_bunny_n4),
            new Emoji(310005, new String[]{"yum"}, R.drawable.stickers_pack_bunny_n5),
            new Emoji(310006, R.drawable.stickers_pack_bunny_n6, true),
            new Emoji(310007, new String[]{"sleeping"}, R.drawable.stickers_pack_bunny_n7),
            new Emoji(310008, new String[]{"pensive"}, R.drawable.stickers_pack_bunny_n8),
            new Emoji(310009, new String[]{"unamused"}, R.drawable.stickers_pack_bunny_n9),
            new Emoji(310010, R.drawable.stickers_pack_bunny_n10, true),
            new Emoji(310011, new String[]{"sunglasses"}, R.drawable.stickers_pack_bunny_n11),
            new Emoji(310012, R.drawable.stickers_pack_bunny_n12, true),
            new Emoji(310013, new String[]{"stuck_out_tongue_winking_eye"}, R.drawable.stickers_pack_bunny_n13),
            new Emoji(310014, R.drawable.stickers_pack_bunny_n14, true),
            new Emoji(310015, new String[]{"man-bowing", "woman-bowing"}, R.drawable.stickers_pack_bunny_n15),
            new Emoji(310016, new String[]{"smiling_face_with_3_hearts"}, R.drawable.stickers_pack_bunny_n16),
            new Emoji(310017, R.drawable.stickers_pack_bunny_n17, true),
            new Emoji(310018, R.drawable.stickers_pack_bunny_n18, true),
            new Emoji(310019, R.drawable.stickers_pack_bunny_n19, true),
            new Emoji(310020, R.drawable.stickers_pack_bunny_n20, true),
            new Emoji(310021, R.drawable.stickers_pack_bunny_n21, true),
            new Emoji(310022, new String[]{"wave"}, R.drawable.stickers_pack_bunny_n22),
            new Emoji(310023, R.drawable.stickers_pack_bunny_n23, true),
            new Emoji(310024, new String[]{"sob"}, R.drawable.stickers_pack_bunny_n24),
            new Emoji(310025, R.drawable.stickers_pack_bunny_n25, true),
            new Emoji(310026, new String[]{"partying_face"}, R.drawable.stickers_pack_bunny_n26),
            new Emoji(310027, R.drawable.stickers_pack_bunny_n27, true),
            new Emoji(310028, new String[]{"face_with_thermometer"}, R.drawable.stickers_pack_bunny_n28),
            new Emoji(310029, R.drawable.stickers_pack_bunny_n29, true),
            new Emoji(310030, new String[]{"relieved"}, R.drawable.stickers_pack_bunny_n30)
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