package com.example.dsuappacademy.cookies;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        setContentView(R.layout.after_button);
        // TODO: Find a reference to the TextView in the layout. Change the text.

    }
    public void newCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        setContentView(R.layout.activity_main);
        // TODO: Find a reference to the TextView in the layout. Change the text.

    }
}