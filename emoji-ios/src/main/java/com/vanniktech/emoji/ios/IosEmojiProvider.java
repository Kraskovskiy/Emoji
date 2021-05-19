package com.vanniktech.emoji.ios;

import android.support.annotation.NonNull;

import com.vanniktech.emoji.EmojiProvider;
import com.vanniktech.emoji.category.StickersPackBunnyCategory;
import com.vanniktech.emoji.category.StickersPackCoopertheplatypusCategory;
import com.vanniktech.emoji.category.StickersPackFierybobCategory;
import com.vanniktech.emoji.category.StickersPackKamikazecatCategory;
import com.vanniktech.emoji.category.StickersPackManoolCategory;
import com.vanniktech.emoji.category.StickersPackManoolgirlCategory;
import com.vanniktech.emoji.category.StickersPackOneCategory;
import com.vanniktech.emoji.category.StickersPackBunjoeCategory;
import com.vanniktech.emoji.category.StickersPackAstrokittyCategory;
import com.vanniktech.emoji.category.StickersPackSiamesekittyCategory;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.ios.category.ActivityCategory;
import com.vanniktech.emoji.ios.category.FlagsCategory;
import com.vanniktech.emoji.ios.category.FoodCategory;
import com.vanniktech.emoji.ios.category.NatureCategory;
import com.vanniktech.emoji.ios.category.ObjectsCategory;
import com.vanniktech.emoji.ios.category.PeopleCategory;
import com.vanniktech.emoji.ios.category.SymbolsCategory;
import com.vanniktech.emoji.ios.category.TravelCategory;

public final class IosEmojiProvider implements EmojiProvider {
    @Override
    @NonNull
    public EmojiCategory[] getCategories() {
        return new EmojiCategory[]{
                new PeopleCategory(),
                new NatureCategory(),
                new FoodCategory(),
                new ActivityCategory(),
                new TravelCategory(),
                new ObjectsCategory(),
                new SymbolsCategory(),
                new FlagsCategory(),
                new StickersPackOneCategory(),
                new StickersPackAstrokittyCategory(),
                new StickersPackBunjoeCategory(),
                new StickersPackBunnyCategory(),
                new StickersPackFierybobCategory(),
                new StickersPackKamikazecatCategory(),
                new StickersPackManoolCategory(),
                new StickersPackManoolgirlCategory(),
                new StickersPackCoopertheplatypusCategory(),
                new StickersPackSiamesekittyCategory()
        };
    }
}
