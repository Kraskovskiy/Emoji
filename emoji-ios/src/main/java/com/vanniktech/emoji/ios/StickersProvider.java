package com.vanniktech.emoji.ios;


import android.support.annotation.NonNull;

import com.vanniktech.emoji.EmojiProvider;
import com.vanniktech.emoji.category.StickersPackOneCategory;
import com.vanniktech.emoji.category.StickersPackThreeCategory;
import com.vanniktech.emoji.category.StickersPackTwoCategory;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.ios.category.ActivityCategory;
import com.vanniktech.emoji.ios.category.FlagsCategory;
import com.vanniktech.emoji.ios.category.FoodCategory;
import com.vanniktech.emoji.ios.category.NatureCategory;
import com.vanniktech.emoji.ios.category.ObjectsCategory;
import com.vanniktech.emoji.ios.category.PeopleCategory;
import com.vanniktech.emoji.ios.category.SymbolsCategory;
import com.vanniktech.emoji.ios.category.TravelCategory;

import java.util.ArrayList;
import java.util.List;

public final class StickersProvider implements EmojiProvider {
    private static List<EmojiCategory> emojiCategories = new ArrayList<>();

    public StickersProvider() {
        setDefaultEmojiCategories();
    }

    public StickersProvider(List<EmojiCategory> customEmojiCategories) {
        emojiCategories.clear();
        setDefaultEmojiCategories();
        setCustomEmojiCategories(customEmojiCategories);
    }

    public void setDefaultEmojiCategories() {
        emojiCategories.add(new PeopleCategory());
        emojiCategories.add(new NatureCategory());
        emojiCategories.add(new FoodCategory());
        emojiCategories.add(new ActivityCategory());
        emojiCategories.add(new TravelCategory());
        emojiCategories.add(new ObjectsCategory());
        emojiCategories.add(new SymbolsCategory());
        emojiCategories.add(new FlagsCategory());
        //emojiCategories.add(new StickersPackOneCategory());
        //emojiCategories.add(new StickersPackTwoCategory());
        //emojiCategories.add(new StickersPackThreeCategory());
    }

    public void setCustomEmojiCategories(List<EmojiCategory> customEmojiCategories) {
        emojiCategories.addAll(customEmojiCategories);
    }

    @Override
    @NonNull
    public EmojiCategory[] getCategories() {
        return emojiCategories.toArray(new EmojiCategory[emojiCategories.size()]);
    }
}
