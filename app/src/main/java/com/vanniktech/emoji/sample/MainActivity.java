package com.vanniktech.emoji.sample;

import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Px;
import android.support.text.emoji.EmojiCompat;
import android.support.text.emoji.bundled.BundledEmojiCompatConfig;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.vanniktech.emoji.EmojiEditText;
import com.vanniktech.emoji.EmojiImageView;
import com.vanniktech.emoji.EmojiManager;
import com.vanniktech.emoji.EmojiPopup;
import com.vanniktech.emoji.EmojiTextView;
import com.vanniktech.emoji.category.StickerCustomPackCategory;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.googlecompat.GoogleCompatEmojiProvider;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.google.GoogleEmojiProvider;
import com.vanniktech.emoji.ios.IosEmojiProvider;
import com.vanniktech.emoji.ios.StickersProvider;
import com.vanniktech.emoji.listeners.OnEmojiActionEditListener;
import com.vanniktech.emoji.listeners.OnEmojiAddClickListener;
import com.vanniktech.emoji.listeners.OnEmojiBackspaceClickListener;
import com.vanniktech.emoji.listeners.OnEmojiClickListener;
import com.vanniktech.emoji.listeners.OnEmojiPopupDismissListener;
import com.vanniktech.emoji.listeners.OnEmojiPopupShownListener;
import com.vanniktech.emoji.listeners.OnEmojiTouchListener;
import com.vanniktech.emoji.listeners.OnSoftKeyboardCloseListener;
import com.vanniktech.emoji.listeners.OnSoftKeyboardOpenListener;
import com.vanniktech.emoji.one.EmojiOneProvider;
import com.vanniktech.emoji.twitter.TwitterEmojiProvider;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("CPD-START") // We don't care about duplicate code in the sample.
public class MainActivity extends AppCompatActivity {
    static final String TAG = "MainActivity";

    ChatAdapter chatAdapter;
    EmojiPopup emojiPopup;

    EmojiEditText editText;
    EmojiTextView emojiTextView;
    ViewGroup rootView;
    ImageView emojiButton;
    ImageView imageViewSticker;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        chatAdapter = new ChatAdapter();

        editText = findViewById(R.id.main_activity_chat_bottom_message_edittext);
        emojiTextView = findViewById(R.id.emojiTextView);
        rootView = findViewById(R.id.main_activity_root_view);
        imageViewSticker = findViewById(R.id.adapter_chat_image_view);
        emojiButton = findViewById(R.id.main_activity_emoji);
        final ImageView sendButton = findViewById(R.id.main_activity_send);

        emojiButton.setColorFilter(ContextCompat.getColor(this, R.color.emoji_icons), PorterDuff.Mode.SRC_IN);
        sendButton.setColorFilter(ContextCompat.getColor(this, R.color.emoji_icons), PorterDuff.Mode.SRC_IN);

        emojiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                emojiPopup.toggle();
                emojiPopup.setCurrentCustomItemPage();
            }
        });
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                final String text = editText.getText().toString().trim();

                if (text.length() > 0) {
                    chatAdapter.add(text);

                    editText.setText("");
                }
            }
        });

        final RecyclerView recyclerView = findViewById(R.id.main_activity_recycler_view);
        recyclerView.setAdapter(chatAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        setUpEmojiPopup();

        EmojiManager.install(new IosEmojiProvider());

        List<EmojiCategory> list1 = new ArrayList<>();
        List<Emoji> listEmoji1 = new ArrayList<>();
        listEmoji1.add((new Emoji(400002, BitmapFactory.decodeResource(getResources(), R.drawable.stickers_pack_1_n10),true,true)));
        listEmoji1.add((new Emoji(400003, BitmapFactory.decodeResource(getResources(), R.drawable.stickers_pack_1_n9),true,true)));
        listEmoji1.add((new Emoji(400004, BitmapFactory.decodeResource(getResources(), R.drawable.stickers_pack_1_n8),true,true)));
        listEmoji1.add((new Emoji(400005, BitmapFactory.decodeResource(getResources(), R.drawable.stickers_pack_1_n7),true,true)));
        list1.add(new StickerCustomPackCategory(listEmoji1));

        EmojiManager.install(new StickersProvider(list1));
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        switch (item.getItemId()) {
            case R.id.show_dialog:
                MainDialog.show(this);
                return true;
            case R.id.variantIos:
                //EmojiManager.install(new IosEmojiProvider());
                List<EmojiCategory> list1 = new ArrayList<>();
                List<Emoji> listEmoji1 = new ArrayList<>();
                listEmoji1.add((new Emoji(400002, BitmapFactory.decodeResource(getResources(), R.drawable.stickers_pack_1_n10),true,true)));
                listEmoji1.add((new Emoji(400003, BitmapFactory.decodeResource(getResources(), R.drawable.stickers_pack_1_n9),true,true)));
                listEmoji1.add((new Emoji(400004, BitmapFactory.decodeResource(getResources(), R.drawable.stickers_pack_1_n8),true,true)));
                listEmoji1.add((new Emoji(400005, BitmapFactory.decodeResource(getResources(), R.drawable.stickers_pack_1_n7),true,true)));
                list1.add(new StickerCustomPackCategory(listEmoji1));

                EmojiManager.install(new StickersProvider(list1));
                recreate();
                return true;
            case R.id.variantGoogle:
                List<EmojiCategory> list = new ArrayList<>();
                List<Emoji> listEmoji = new ArrayList<>();
                listEmoji.add((new Emoji(400001, BitmapFactory.decodeResource(getResources(), R.drawable.stickers_pack_1_n10),true,true)));
                list.add(new StickerCustomPackCategory(listEmoji));

                EmojiManager.install(new StickersProvider(list));
                recreate();
                return true;
            case R.id.variantTwitter:
                EmojiManager.install(new TwitterEmojiProvider());
                recreate();
                return true;
            case R.id.variantGoogleCompat:
                final EmojiCompat.Config config = new BundledEmojiCompatConfig(this);
                config.setReplaceAll(true);

                EmojiManager.install(new GoogleCompatEmojiProvider(EmojiCompat.init(config)));
                recreate();
                return true;
            case R.id.variantEmojiOne:
                EmojiManager.install(new EmojiOneProvider());
                recreate();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        if (emojiPopup != null && emojiPopup.isShowing()) {
            emojiPopup.dismiss();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onStop() {
        if (emojiPopup != null) {
            emojiPopup.dismiss();
        }

        super.onStop();
    }

    private void setUpEmojiPopup() {
        emojiPopup = EmojiPopup.Builder.fromRootView(rootView)
                .setOnEmojiBackspaceClickListener(new OnEmojiBackspaceClickListener() {
                    @Override
                    public void onEmojiBackspaceClick(final View v) {
                        Log.d(TAG, "Clicked on Backspace");
                    }
                })
                .setOnEmojiClickListener(new OnEmojiClickListener() {
                    @Override
                    public void onEmojiClick(@NonNull final EmojiImageView imageView, @NonNull final Emoji emoji) {
                        Log.d(TAG, "Clicked on emoji, is Stickers = " + emoji.isStickers());
                        if (emoji.isStickers()) {
                            emojiTextView.setText(emoji.getUnicode(), TextView.BufferType.SPANNABLE);
                            imageViewSticker.setImageBitmap(emoji.getBitmap(getApplicationContext()));
                        }
                    }
                })
                .setOnEmojiPopupShownListener(new OnEmojiPopupShownListener() {
                    @Override
                    public void onEmojiPopupShown() {
                        emojiButton.setImageResource(R.drawable.ic_keyboard);
                    }
                })
                .setOnSoftKeyboardOpenListener(new OnSoftKeyboardOpenListener() {
                    @Override
                    public void onKeyboardOpen(@Px final int keyBoardHeight) {
                        Log.d(TAG, "Opened soft keyboard");
                    }
                })
                .setOnEmojiPopupDismissListener(new OnEmojiPopupDismissListener() {
                    @Override
                    public void onEmojiPopupDismiss() {
                        emojiButton.setImageResource(R.drawable.emoji_ios_category_people);
                    }
                })
                .setOnEmojiAddClickListener(new OnEmojiAddClickListener() {
                    @Override
                    public void onEmojiAddClick() {
                        Log.e(TAG, "onEmojiAddClick");
                    }
                })
                .setOnEmojiTouchListener(new OnEmojiTouchListener() {
                    @Override
                    public void onEmojiTouch() {
                        Log.e(TAG, "OnEmojiTouchListener!!!!");
                    }
                })
                .setOnEmojiEditClickListener(new OnEmojiActionEditListener() {
                    @Override
                    public void editClick(@NonNull Emoji emoji) {
                        Log.e(TAG, "OnEmojiEditClick="+emoji.getPathResource());

                        List<EmojiCategory> list1 = new ArrayList<>();
                        List<Emoji> listEmoji1 = new ArrayList<>();
                        listEmoji1.add((new Emoji(400002, BitmapFactory.decodeResource(getResources(), R.drawable.stickers_pack_1_n10),true,true)));
                        listEmoji1.add((new Emoji(400003, BitmapFactory.decodeResource(getResources(), R.drawable.stickers_pack_1_n9),true,true)));
                        listEmoji1.add((new Emoji(400004, BitmapFactory.decodeResource(getResources(), R.drawable.stickers_pack_1_n8),true,true)));
                        listEmoji1.add((new Emoji(400005, BitmapFactory.decodeResource(getResources(), R.drawable.stickers_pack_1_n7),true,true)));
                        list1.add(new StickerCustomPackCategory(listEmoji1));
                        EmojiManager.install(new StickersProvider(list1));
                        emojiPopup.updateStickers();
                    }
                })
                .setOnSoftKeyboardCloseListener(new OnSoftKeyboardCloseListener() {
                    @Override
                    public void onKeyboardClose() {
                        Log.d(TAG, "Closed soft keyboard");
                    }
                })
                .build(editText);
    }
}
