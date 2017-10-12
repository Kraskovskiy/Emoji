package com.vanniktech.emoji;

import android.support.v4.view.PagerAdapter;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.vanniktech.emoji.listeners.OnEmojiClickListener;
import com.vanniktech.emoji.listeners.OnEmojiLongClickListener;
import com.vanniktech.emoji.listeners.OnEmojiTouchListener;

final class EmojiPagerAdapter extends PagerAdapter {
    private static final int RECENT_POSITION = 0;

    private final OnEmojiClickListener listener;
    private final OnEmojiTouchListener touchListener;
    private final OnEmojiLongClickListener longListener;
    private final RecentEmoji recentEmoji;
    private final VariantEmoji variantManager;

    private RecentEmojiGridView recentEmojiGridView;
    private EmojiGridView emojiGridView;

    EmojiPagerAdapter(final OnEmojiClickListener listener,
                      final OnEmojiTouchListener touchListener,
                      final OnEmojiLongClickListener longListener,
                      final RecentEmoji recentEmoji, final VariantEmoji variantManager) {
        this.listener = listener;
        this.longListener = longListener;
        this.recentEmoji = recentEmoji;
        this.variantManager = variantManager;
        this.recentEmojiGridView = null;
        this.touchListener = touchListener;
    }

    @Override
    public int getCount() {
        return EmojiManager.getInstance().getCategories().length + 1;
    }

    @Override
    public Object instantiateItem(final ViewGroup pager, final int position) {
        final View newView;

        if (position == RECENT_POSITION) {
            newView = new RecentEmojiGridView(pager.getContext()).init(listener, longListener, recentEmoji);
            recentEmojiGridView = (RecentEmojiGridView) newView;
        } else {
            newView = new EmojiGridView(pager.getContext()).init(listener, longListener,
                    EmojiManager.getInstance().getCategories()[position - 1], variantManager);
            emojiGridView = (EmojiGridView) newView;
        }

        newView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (touchListener != null && (motionEvent.getAction() == MotionEvent.ACTION_UP)) {
                    touchListener.onEmojiTouch();
                }
                return false;
            }
        });

        pager.addView(newView);
        return newView;
    }

    @Override
    public void destroyItem(final ViewGroup pager, final int position, final Object view) {
        pager.removeView((View) view);

        if (position == RECENT_POSITION) {
            recentEmojiGridView = null;
        }
    }

    @Override
    public boolean isViewFromObject(final View view, final Object object) {
        return view.equals(object);
    }

    //recreate page on notifyDataSetChanged
    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    int numberOfRecentEmojis() {
        return recentEmoji.getRecentEmojis().size();
    }

    void invalidateRecentEmojis() {
        if (recentEmojiGridView != null) {
            recentEmojiGridView.invalidateEmojis();
        }
    }

    void updateStickers() {
        if (emojiGridView != null) {
            this.notifyDataSetChanged();
            emojiGridView.updateStickers();
        }
    }
}
