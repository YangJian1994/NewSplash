package com.yangjian.newsplash.ui.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.yangjian.newsplash.R;
import com.yangjian.newsplash.adapter.FragmentAdapter;
import com.yangjian.newsplash.ui.fragment.MainFragment;
import com.yangjian.newsplash.ui.fragment.VideoFragment;
import com.yangjian.newsplash.ui.fragment.PhotoFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    
    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private FragmentAdapter adapter;

    private List<Fragment> fragments;
    private List<String> titles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        
        setSupportActionBar(toolbar);
        setupViewPager();
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager() {
        adapter = new FragmentAdapter(getSupportFragmentManager());
        fragments = new ArrayList<>();
        titles = new ArrayList<>();
        fragments.add(new PhotoFragment());
        fragments.add(new VideoFragment());
        fragments.add(new MainFragment());
        titles.add("推荐");
        titles.add("最新");
        titles.add("分类");
        adapter.setData(fragments, titles);
        viewPager.setAdapter(adapter);
    }
}
