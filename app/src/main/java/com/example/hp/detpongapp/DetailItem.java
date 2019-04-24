package com.example.hp.detpongapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


public class DetailItem extends AppCompatActivity {

    //private static final String TAG = "ItemDetail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_item_activity);
        getIncomingIntent();
    }
    private void getIncomingIntent() {
        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("namaTari") && getIntent().hasExtra("deskTari")) {
            String imageUrl = getIntent().getStringExtra("image_url");
            String namaTari = getIntent().getStringExtra("namaTari");
            String deskTari = getIntent().getStringExtra("deskTari");
            setImage(imageUrl, namaTari, deskTari);
        }
    }
    private void setImage(String imageUrl, String namaTari, String deskTari) {

        TextView name = findViewById(R.id.tv_item_name);
        name.setText(namaTari);
        TextView desc = findViewById(R.id.tv_item_desc);
        desc.setText(deskTari);
        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }
}
