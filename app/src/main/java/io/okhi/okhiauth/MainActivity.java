package io.okhi.okhiauth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.okhi.okhi_auth.OkHiAppContext;
import io.okhi.okhi_auth.OkHiAuth;
import io.okhi.okhi_auth.OkHiDeveloperType;
import io.okhi.okhi_auth.OkHiMode;
import io.okhi.okhi_auth.OkHiPlatformType;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OkHiAppContext context = new OkHiAppContext.Builder(OkHiMode.SANDBOX)
                .setAppMeta("My Awesome App", "v1.0.0", 1)
                .setDeveloper(OkHiDeveloperType.EXTERNAL)
                .setPlatform(OkHiPlatformType.ANDROID)
                .build();
        OkHiAuth auth = new OkHiAuth.Builder("<my_branch_id>", "<my_client_key>")
                .withContext(context)
                .build();
    }
}
