package com.vanniktech.emoji.listeners;

import androidx.annotation.NonNull;

import com.vanniktech.emoji.emoji.Emoji;

public interface OnEmojiActionDeleteListener {
    void deleteClick(@NonNull final Emoji emoji);
}
