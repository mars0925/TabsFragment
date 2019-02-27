package com.omnihealthgroup.trans.tabsfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mars0925 on 2019/2/27
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> fragmentTitleList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        // 取得當前頁的title
        return fragmentTitleList.get(position);
    }

    // 添加Fragment 與 Title 方法
    public void addFragment(Fragment fragment, String title) {
        fragmentList.add(fragment);
        fragmentTitleList.add(title);
    }
}
