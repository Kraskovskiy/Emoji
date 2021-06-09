package com.vanniktech.emoji.ios;


import androidx.annotation.NonNull;

import com.vanniktech.emoji.EmojiProvider;
import com.vanniktech.emoji.category.StickersPackAstrokittyCategory;
import com.vanniktech.emoji.category.StickersPackBunjoeCategory;
import com.vanniktech.emoji.category.StickersPackBunnyCategory;
import com.vanniktech.emoji.category.StickersPackCoopertheplatypusCategory;
import com.vanniktech.emoji.category.StickersPackFierybobCategory;
import com.vanniktech.emoji.category.StickersPackKamikazecatCategory;
import com.vanniktech.emoji.category.StickersPackManoolCategory;
import com.vanniktech.emoji.category.StickersPackManoolgirlCategory;
import com.vanniktech.emoji.category.StickersPackOneCategory;
import com.vanniktech.emoji.category.StickersPackSiamesekittyCategory;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.ios.category.ActivitiesCategory;
import com.vanniktech.emoji.ios.category.AnimalsAndNatureCategory;
import com.vanniktech.emoji.ios.category.FlagsCategory;
import com.vanniktech.emoji.ios.category.FoodAndDrinkCategory;
import com.vanniktech.emoji.ios.category.ObjectsCategory;
import com.vanniktech.emoji.ios.category.SmileysAndPeopleCategory;
import com.vanniktech.emoji.ios.category.SymbolsCategory;
import com.vanniktech.emoji.ios.category.TravelAndPlacesCategory;

import java.util.ArrayList;
import java.util.List;

public final class StickersProvider implements EmojiProvider {
    private static final List<EmojiCategory> emojiCategories = new ArrayList<>();

    public StickersProvider() {
        setDefaultEmojiCategories();
    }

    public StickersProvider(List<EmojiCategory> customEmojiCategories) {
        emojiCategories.clear();
        setDefaultEmojiCategories();
        setCustomEmojiCategories(customEmojiCategories);
    }

    public void setDefaultEmojiCategories() {
        emojiCategories.add(new SmileysAndPeopleCategory());
        emojiCategories.add(new AnimalsAndNatureCategory());
        emojiCategories.add(new FoodAndDrinkCategory());
        emojiCategories.add(new ActivitiesCategory());
        emojiCategories.add(new TravelAndPlacesCategory());
        emojiCategories.add(new ObjectsCategory());
        emojiCategories.add(new SymbolsCategory());
        emojiCategories.add(new FlagsCategory());
        emojiCategories.add(new StickersPackOneCategory());
        emojiCategories.add(new StickersPackAstrokittyCategory());
        emojiCategories.add(new StickersPackBunjoeCategory());
        emojiCategories.add(new StickersPackBunnyCategory());
        emojiCategories.add(new StickersPackFierybobCategory());
        emojiCategories.add(new StickersPackKamikazecatCategory());
        emojiCategories.add(new StickersPackManoolCategory());
        emojiCategories.add(new StickersPackManoolgirlCategory());
        emojiCategories.add(new StickersPackCoopertheplatypusCategory());
        emojiCategories.add(new StickersPackSiamesekittyCategory());
    }

    public void setCustomEmojiCategories(List<EmojiCategory> customEmojiCategories) {
        emojiCategories.addAll(customEmojiCategories);
    }

    @Override
    @NonNull
    public EmojiCategory[] getCategories() {
        return emojiCategories.toArray(new EmojiCategory[0]);
    }
}
