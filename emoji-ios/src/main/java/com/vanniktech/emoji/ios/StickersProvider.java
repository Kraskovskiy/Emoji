package com.vanniktech.emoji.ios;


import android.support.annotation.NonNull;

import com.vanniktech.emoji.EmojiProvider;
import com.vanniktech.emoji.category.StickersPackOneCategory;
import com.vanniktech.emoji.category.StickersPackTwoCategory;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.ios.category.PeopleCategory;

public final class StickersProvider implements EmojiProvider {
    @Override @NonNull
    public EmojiCategory[] getCategories() {
        return new EmojiCategory[] {
                new PeopleCategory(),
                new StickersPackOneCategory(),
                new StickersPackTwoCategory()
        };
    }
}
