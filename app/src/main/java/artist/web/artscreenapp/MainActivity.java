package artist.web.artscreenapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    private ViewFlipper artPics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        artPics = (ViewFlipper)findViewById(R.id.artPics);
    }

    public void previous(View view){
        artPics.showPrevious();
    }

    public void next(View view){
        artPics.showNext();
    }
}
