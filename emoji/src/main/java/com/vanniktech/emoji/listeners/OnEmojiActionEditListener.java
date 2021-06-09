package com.vanniktech.emoji.listeners;

import androidx.annotation.NonNull;

import com.vanniktech.emoji.emoji.Emoji;

public interface OnEmojiActionEditListener {
    void editClick(@NonNull final Emoji emoji);
}
