package com.dev.prithvi.deeplink;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

/**
 * A deep link is a URL that navigates to a specific destination in your app.
 * An intent filter has the following elements:
 * * action
 * * data
 * * category
 * <p>
 * In WhatsApp, we can generate a deep link to send a message
 * to a phone number with some message in it.
 */
public class MainActivity extends AppCompatActivity {

    private TextView msgText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msgText = (TextView) findViewById(R.id.idTVMessage);
        Uri uri = getIntent().getData();
        if (uri != null) {
            List<String> parameters = uri.getPathSegments();
            // after that we are extracting string from that parameters
            String param = parameters.get(parameters.size() - 1);
            msgText.setText(param);
        }

    }
}