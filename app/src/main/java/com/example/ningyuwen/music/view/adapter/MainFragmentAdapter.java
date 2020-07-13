package com.example.ningyuwen.music.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by reapoker .
 */

public class MainFragmentAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"所有歌曲","自定歌单","我喜爱的","歌手分类"};
    private ArrayList<Fragment> mFragments;

    public MainFragmentAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}