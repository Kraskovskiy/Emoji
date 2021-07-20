package com.vanniktech.emoji.category;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray")
public final class StickersPackAstrokittyCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[]{
            new Emoji(200001, new String[]{"partying_face"}, R.drawable.stickers_pack_astrokitty_n1),
            new Emoji(200002, new String[]{"gift"}, R.drawable.stickers_pack_astrokitty_n2),
            new Emoji(200003, new String[]{"cold_face"}, R.drawable.stickers_pack_astrokitty_n3),
            new Emoji(200004, new String[]{"smiling_face_with_3_hearts"}, R.drawable.stickers_pack_astrokitty_n4),
            new Emoji(200005, new String[]{"sunglasses"}, R.drawable.stickers_pack_astrokitty_n5),
            new Emoji(200006, new String[]{"pray"}, R.drawable.stickers_pack_astrokitty_n6),
            new Emoji(200007, new String[]{"scream"}, R.drawable.stickers_pack_astrokitty_n7),
            new Emoji(200008, new String[]{"shushing_face", "no_mouth"}, R.drawable.stickers_pack_astrokitty_n8),
            new Emoji(200009, new String[]{"laughing", "slightly_smiling_face", "joy", "rolling_on_the_floor_laughing", "sweat_smile", "grin", "smile", "smiley", "grinning"}, R.drawable.stickers_pack_astrokitty_n9),
            new Emoji(200010, new String[]{"stuck_out_tongue_winking_eye"}, R.drawable.stickers_pack_astrokitty_n10),
            new Emoji(200011, new String[]{"heart"}, R.drawable.stickers_pack_astrokitty_n11),
            new Emoji(200012, new String[]{"wave"}, R.drawable.stickers_pack_astrokitty_n12),
            new Emoji(200013, new String[]{"yum"}, R.drawable.stickers_pack_astrokitty_n13),
            new Emoji(200014, new String[]{"camera"}, R.drawable.stickers_pack_astrokitty_n14),
            new Emoji(200015, new String[]{"sleeping"}, R.drawable.stickers_pack_astrokitty_n15),
            new Emoji(200016, new String[]{"heart_eyes"}, R.drawable.stickers_pack_astrokitty_n16),
            new Emoji(200017, new String[]{"ok_hand"}, R.drawable.stickers_pack_astrokitty_n17),
            new Emoji(200018, new String[]{"relieved"}, R.drawable.stickers_pack_astrokitty_n18),
            new Emoji(200019, new String[]{"sob"}, R.drawable.stickers_pack_astrokitty_n19),
            new Emoji(200020, new String[]{"man-bowing", "woman-bowing"}, R.drawable.stickers_pack_astrokitty_n20),
            new Emoji(200021, new String[]{"thumbsup"}, R.drawable.stickers_pack_astrokitty_n21),
            new Emoji(200022, new String[]{"kissing_heart", "kiss", "kissing_smiling_eyes", "kissing_closed_eyes"}, R.drawable.stickers_pack_astrokitty_n22),
            new Emoji(200023, new String[]{"pensive"}, R.drawable.stickers_pack_astrokitty_n23),
            new Emoji(200024, new String[]{"unamused"}, R.drawable.stickers_pack_astrokitty_n24),
            new Emoji(200025, new String[]{"face_with_thermometer"}, R.drawable.stickers_pack_astrokitty_n25)
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