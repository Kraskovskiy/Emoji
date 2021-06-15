/*
 * Copyright (C) 2016 - Niklas Baudy, Ruben Gees, Mario Đanić and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.vanniktech.emoji;

import androidx.viewpager.widget.PagerAdapter;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.vanniktech.emoji.listeners.OnEmojiClickListener;
import com.vanniktech.emoji.listeners.OnEmojiLongClickListener;
import com.vanniktech.emoji.listeners.OnEmojiScrollListener;
import com.vanniktech.emoji.listeners.OnEmojiTouchListener;

public final class EmojiPagerAdapter extends PagerAdapter {
    private static final int RECENT_POSITION = 0;

    private final OnEmojiClickListener listener;
    private final OnEmojiTouchListener touchListener;
    private final OnEmojiLongClickListener longListener;
    private final OnEmojiScrollListener scrollListener;
    private final RecentEmoji recentEmoji;
    private final VariantEmoji variantManager;

    private RecentEmojiGridView recentEmojiGridView;
    private EmojiGridView emojiGridView;
    private float oldY = 0;

    EmojiPagerAdapter(final OnEmojiClickListener listener,
                      final OnEmojiTouchListener touchListener,
                      final OnEmojiLongClickListener longListener,
                      final OnEmojiScrollListener scrollListener,
                      final RecentEmoji recentEmoji, final VariantEmoji variantManager) {
        this.listener = listener;
        this.longListener = longListener;
        this.recentEmoji = recentEmoji;
        this.variantManager = variantManager;
        this.recentEmojiGridView = null;
        this.touchListener = touchListener;
        this.scrollListener = scrollListener;
    }

    @Override
    public int getCount() {
        return EmojiManager.getInstance().getCategories().length + 1;
    }

    @Override
    public Object instantiateItem(final ViewGroup pager, final int position) {
        final EmojiGridView newView;

        if (position == RECENT_POSITION) {
            newView = new RecentEmojiGridView(pager.getContext()).init(listener, longListener, recentEmoji);
            recentEmojiGridView = (RecentEmojiGridView) newView;
        } else {
            newView = new EmojiGridView(pager.getContext()).init(listener, longListener,
                    EmojiManager.getInstance().getCategories()[position - 1], variantManager);
            emojiGridView = (EmojiGridView) newView;
        }

        newView.setOnTouchListener((view, motionEvent) -> {
            if (touchListener != null && (motionEvent.getAction() == MotionEvent.ACTION_UP)) {
                touchListener.onEmojiTouch();
                oldY = 0;
            }

            if (scrollListener != null && motionEvent.getAction() == MotionEvent.ACTION_MOVE) {
                float y = motionEvent.getY();
                if ((int) oldY != 0) {
                    scrollListener.onEmojiScroll((int) y >= (int) oldY);
                }
                oldY = y;
            }
            return false;
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
