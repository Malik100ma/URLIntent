package com.malik100ma.urlintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView ivTorrent, ivYouTube, ivTelegram, ivModrinth, ivWarT, ivGitHub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ivModrinth = findViewById(R.id.ivModrith);
        ivTelegram = findViewById(R.id.ivTelegram);
        ivTorrent = findViewById(R.id.ivTorrent);
        ivGitHub = findViewById(R.id.ivGitHub);
        ivYouTube = findViewById(R.id.ivYouTube);
        ivWarT = findViewById(R.id.ivWarT);

        ivModrinth.setOnClickListener(v -> openURL("https://modrinth.com/user/malik100ma"));
        ivYouTube.setOnClickListener(v -> openURL("https://www.youtube.com/@CodeCat_ua"));
        ivTorrent.setOnClickListener(v -> openURL("https://www.utorrent.com/intl/ru/"));
        ivGitHub.setOnClickListener(v -> openURL("https://github.com/Malik100ma/MacrosiMod"));
        ivWarT.setOnClickListener(v -> openURL("https://warthunder.com/ua/registration?r=sem_20190841188_148201679663_659834452698_kwd-42711071168&placement=&gad_source=1&gad_campaignid=20190841188&gbraid=0AAAAADpy6fNy4hgU-L32MD4KlrqFc0jZ8&gclid=CjwKCAjwrbfWBhAeEiwAc2e6PiviMf4wB0GZkTUVYA9jfK7JnG5HSJv-vt3GciGfERLF6jXdfa2UbhoCc1wQAvD_BwE#/"));
        ivTelegram.setOnClickListener(v -> openURL("https://t.me/cin_ua"));

    }

    private void openURL(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}