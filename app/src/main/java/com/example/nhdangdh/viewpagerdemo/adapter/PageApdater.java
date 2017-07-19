package com.example.nhdangdh.viewpagerdemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.nhdangdh.viewpagerdemo.fragment.AndroidFragment;
import com.example.nhdangdh.viewpagerdemo.fragment.IOSFragment;
import com.example.nhdangdh.viewpagerdemo.fragment.JavaFragment;
import com.example.nhdangdh.viewpagerdemo.fragment.PhpFragment;
import com.example.nhdangdh.viewpagerdemo.fragment.PythonFragment;

/**
 * Created by nhdangdh on 7/19/2017.
 */

public class PageApdater extends FragmentStatePagerAdapter {

    public PageApdater(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag = null;
        switch (position) {
            case 0:
                frag = new AndroidFragment();
                break;
            case 1:
                frag = new IOSFragment();
                break;
            case 2:
                frag = new PhpFragment();
                break;
            case 3:
                frag = new JavaFragment();
                break;
            case 4:
                frag = new PythonFragment();
                break;
        }

        return frag;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title= "";
        switch (position) {
            case 0:
                title = "Android";
                break;
            case 1:
                title = "IOS";
                break;
            case 2:
                title = "PHP";
                break;
            case 3:
                title = "Java";
                break;
            case 4:
                title = "Python";
                break;
        }

        return title;
    }
}
