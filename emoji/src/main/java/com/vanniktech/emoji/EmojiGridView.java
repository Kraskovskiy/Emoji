package com.vanniktech.emoji;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.GridView;

import com.vanniktech.emoji.category.StickersPackOneCategory;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.listeners.OnEmojiClickListener;
import com.vanniktech.emoji.listeners.OnEmojiLongClickListener;

class EmojiGridView extends GridView {
  protected EmojiArrayAdapter emojiArrayAdapter;
  private final Resources resources;

  EmojiGridView(final Context context) {
    super(context);

    resources = getResources();
    final int width = resources.getDimensionPixelSize(R.dimen.emoji_grid_view_column_width);
    final int spacing = resources.getDimensionPixelSize(R.dimen.emoji_grid_view_spacing);

    setColumnWidth(width);
    setHorizontalSpacing(spacing);
    setVerticalSpacing(spacing);
    setPadding(spacing, spacing, spacing, spacing);
    setNumColumns(AUTO_FIT);
    setClipToPadding(false);
    setVerticalScrollBarEnabled(false);
  }

  public EmojiGridView init(@Nullable final OnEmojiClickListener onEmojiClickListener,
      @Nullable final OnEmojiLongClickListener onEmojiLongClickListener,
      @NonNull final EmojiCategory category, @NonNull final VariantEmoji variantManager) {
    emojiArrayAdapter = new EmojiArrayAdapter(getContext(), category.getEmojis(), variantManager,
            onEmojiClickListener, onEmojiLongClickListener);

    if (category instanceof StickersPackOneCategory) {
      final int width = resources.getDimensionPixelSize(R.dimen.emoji_stickers_grid_view_column_width);
      setColumnWidth(width);
    }
    setAdapter(emojiArrayAdapter);

    return this;
  }
}
