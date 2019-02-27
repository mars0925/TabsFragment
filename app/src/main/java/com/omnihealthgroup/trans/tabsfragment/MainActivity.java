package com.omnihealthgroup.trans.tabsfragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager_id);
        tabLayout = findViewById(R.id.tabLayout_id);


        /*把Fragment加進adapter，並把它與ViewPager綁定*/
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new OneFragment(), "ITEM ONE");
        adapter.addFragment(new TwoFragment(), "ITEM TWO");
        adapter.addFragment(new ThreeFragment(), "ITEM THREE");
        adapter.addFragment(new TabsFragment(), "多tabs");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
