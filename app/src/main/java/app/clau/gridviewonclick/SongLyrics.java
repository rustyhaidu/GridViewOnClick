package app.clau.gridviewonclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SongLyrics extends AppCompatActivity {

    TextView mTextView;
    String[] arrayOfLyrics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_lyrics);

        mTextView = findViewById(R.id.songTextView);
        String lyrics = getIntent().getStringExtra("position");

        mTextView.setText(lyrics);
    }



}
