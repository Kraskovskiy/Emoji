package com.vanniktech.emoji;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.content.res.AppCompatResources;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.listeners.OnEmojiActionEditListener;
import com.vanniktech.emoji.listeners.OnEmojiClickListener;

import java.util.List;

import static android.view.View.MeasureSpec.makeMeasureSpec;

final class EmojiVariantPopup {
    private static final int MARGIN = 2;

    @NonNull
    private final View rootView;
    @Nullable
    private PopupWindow popupWindow;

    @Nullable
    final OnEmojiClickListener listener;
    @Nullable
    OnEmojiActionEditListener onEmojiEditClickListener;

    @Nullable
    EmojiImageView rootImageView;

    EmojiVariantPopup(@NonNull final View rootView, @Nullable final OnEmojiClickListener listener, @Nullable final OnEmojiActionEditListener onEmojiEditClickListener) {
        this.rootView = rootView;
        this.listener = listener;
        this.onEmojiEditClickListener = onEmojiEditClickListener;
    }

    void show(@NonNull final EmojiImageView clickedImage, @NonNull final Emoji emoji) {
        dismiss();

        rootImageView = clickedImage;

        final View content = initView(clickedImage, clickedImage.getContext(), emoji, clickedImage.getWidth());

        popupWindow = new PopupWindow(content, WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setInputMethodMode(PopupWindow.INPUT_METHOD_NOT_NEEDED);
        popupWindow.setBackgroundDrawable(new BitmapDrawable(clickedImage.getContext().getResources(), (Bitmap) null));

        content.measure(makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED), makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));

        final Point location = Utils.locationOnScreen(clickedImage);
        final Point desiredLocation = new Point(
                location.x - content.getMeasuredWidth() / 2 + clickedImage.getWidth() / 2,
                location.y - content.getMeasuredHeight()
        );

        popupWindow.showAtLocation(rootView, Gravity.NO_GRAVITY, desiredLocation.x, desiredLocation.y);
        rootImageView.getParent().requestDisallowInterceptTouchEvent(true);
        Utils.fixPopupLocation(popupWindow, desiredLocation);
    }

    void dismiss() {
        rootImageView = null;

        if (popupWindow != null) {
            popupWindow.dismiss();
            popupWindow = null;
        }
    }

    private View initView(@NonNull final EmojiImageView clickedImage, @NonNull final Context context, @NonNull final Emoji emoji, final int width) {
        final View result = View.inflate(context, R.layout.emoji_skin_popup, null);
        final LinearLayout imageContainer = result.findViewById(R.id.container);

        final List<Emoji> variants = emoji.getBase().getVariants();
        variants.add(0, emoji.getBase());

        final LayoutInflater inflater = LayoutInflater.from(context);

        if (!emoji.isCustomStickers()) {
            for (final Emoji variant : variants) {
                final ImageView emojiImage = (ImageView) inflater.inflate(R.layout.emoji_item, imageContainer, false);
                final ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) emojiImage.getLayoutParams();
                final int margin = Utils.dpToPx(context, MARGIN);

                // Use the same size for Emojis as in the picker.
                layoutParams.width = width;
                layoutParams.setMargins(margin, margin, margin, margin);
                emojiImage.setImageDrawable(variant.getDrawable(context));

                emojiImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        if (listener != null && rootImageView != null) {
                            listener.onEmojiClick(rootImageView, variant);
                        }
                    }
                });

                imageContainer.addView(emojiImage);
            }
        } else {
            final ImageView stickerEdit = (ImageView) inflater.inflate(R.layout.emoji_item, imageContainer, false);
            final ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) stickerEdit.getLayoutParams();
            final int margin = Utils.dpToPx(context, MARGIN);
            layoutParams.width = width/2;
            layoutParams.setMargins(margin, margin, margin, margin);
            stickerEdit.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.emoji_sticker_edit));

            stickerEdit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(final View view) {
                    if (onEmojiEditClickListener != null && rootImageView != null) {
                        onEmojiEditClickListener.editClick(emoji);
                        dismiss();
                    }
                }
            });
            imageContainer.addView(stickerEdit);

            final ImageView stickerDelete = (ImageView) inflater.inflate(R.layout.emoji_item, imageContainer, false);
            final ViewGroup.MarginLayoutParams layoutParamsDelete = (ViewGroup.MarginLayoutParams) stickerDelete.getLayoutParams();
            layoutParamsDelete.width = width/2;
            layoutParamsDelete.setMargins(margin, margin, margin, margin);
            stickerDelete.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.emoji_delete_forever));

            stickerDelete.setOnClickListener(view -> {
                if (listener != null && rootImageView != null) {
                    clickedImage.actionDeleteListener.deleteClick(emoji);
                    EmojiUtils.deleteCustomEmoji(emoji);
                    //listener.onEmojiClick(rootImageView, emoji);
                    dismiss();
                }
            });
            imageContainer.addView(stickerDelete);
        }

        return result;
    }
}
