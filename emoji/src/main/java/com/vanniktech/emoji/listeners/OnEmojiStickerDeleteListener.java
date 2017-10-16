package com.vanniktech.emoji.listeners;


import android.support.annotation.NonNull;

import com.vanniktech.emoji.emoji.Emoji;

public interface OnEmojiStickerDeleteListener {
    void onEmojiStickerDelete(@NonNull final Emoji emoji);
}
