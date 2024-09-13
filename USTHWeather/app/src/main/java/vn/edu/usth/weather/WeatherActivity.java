package vn.edu.usth.weather;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;


public class WeatherActivity extends AppCompatActivity {
    private ViewpagerAdapter viewpagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);

        viewPager = findViewById(R.id.Viewpager);
        viewpagerAdapter = new ViewpagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewpagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);

        Log.i(TAG, "=== APP CREATED ===");

    }

    public WeatherActivity() {
        super();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "=== APP STARTED ===");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "=== APP RESUMED ===");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "=== APP PAUSED ===");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "=== APP STOPPED ===");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "=== APP DESTROYED ===");
    }
}