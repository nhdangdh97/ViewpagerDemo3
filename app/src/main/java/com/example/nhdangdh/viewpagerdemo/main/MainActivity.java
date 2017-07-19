package com.example.nhdangdh.viewpagerdemo.main;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nhdangdh.viewpagerdemo.R;
import com.example.nhdangdh.viewpagerdemo.adapter.PageApdater;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        addControls();
        addEvents();
    }

    private void addControls() {
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
    }

    private void addEvents() {
        FragmentManager fragManager = getSupportFragmentManager();
        PageApdater pageApdapter = new PageApdater(fragManager);
        viewPager.setAdapter(pageApdapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setTabsFromPagerAdapter(pageApdapter);
    }
}
