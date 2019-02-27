package com.omnihealthgroup.trans.tabsfragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * fragment 裡面放tabs
 */
public class TabsFragment extends Fragment {


    private ViewPager viewPager;
    private TabLayout tabs;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fixtures_new_tabs,container, false);

        viewPager = view.findViewById(R.id.viewpager);
        tabs = view.findViewById(R.id.result_tabs);

        // Setting ViewPager for each Tabs
        setupViewPager(viewPager);
        // Set Tabs inside Toolbar
        tabs.setupWithViewPager(viewPager);

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    // Add Fragments to Tabs
    private void setupViewPager(ViewPager viewPager) {
        FragmentTabsAdapter adapter = new FragmentTabsAdapter(getChildFragmentManager());
        adapter.addFragment(new OneFragment(), "彰兵");
        adapter.addFragment(new TwoFragment(), "岡山");
        adapter.addFragment(new ThreeFragment(), "彰秀");
        viewPager.setAdapter(adapter);
    }

}
