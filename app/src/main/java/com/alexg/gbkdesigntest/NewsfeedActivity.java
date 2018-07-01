package com.alexg.gbkdesigntest;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import com.alexg.gbkdesigntest.Utils.DividerItemDecoration;
import com.alexg.gbkdesigntest.Utils.SlidingSplashView;
import com.alexg.gbkdesigntest.adapters.NewsfeedAdapter;
import com.alexg.gbkdesigntest.models.NewsfeedModel;

import java.util.ArrayList;
import java.util.List;

public class NewsfeedActivity extends AppCompatActivity {

    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_newsfeed);

        ViewPager viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout =  findViewById(R.id.newsfeed_tabs);
        tabLayout.setupWithViewPager(viewPager);

        RecyclerView newsfeedRecycler = findViewById(R.id.newsfeed_recycler);
        newsfeedRecycler.setLayoutManager(new LinearLayoutManager(this));
        newsfeedRecycler.addItemDecoration(
                new DividerItemDecoration(this, R.drawable.divider));
        NewsfeedAdapter adapter = new NewsfeedAdapter(this, makeModelsList());
        newsfeedRecycler.setAdapter(adapter);

        SlidingSplashView splashView = findViewById(R.id.splash);
    }

    private List<NewsfeedModel> makeModelsList() {
        List<NewsfeedModel> newsfeedModels = new ArrayList<>();

        String[] titlesArray = {"Morbi per tincidunt tellus sit of amet eros laoreet.",
                "Fusce ornare cursus masspretium tortor integer placera.",
                "Maecenas eu risus blanscelerisque massa non amcorpe.",
                "Pellentesque non lorem diam. Proin at ex sollicia."};
        String[] likesArray = {"26", "15", "36", "11"};
        String[] commentsArray = {"32", "21", "15", "9"};
        boolean[] isLikedArray = {false, false, true, true};

        int[] photoOneArray = {R.drawable.newsfeed_pic1, R.drawable.newsfeed_pic2,
                R.drawable.newsfeed_pic3, R.drawable.newsfeed_pic4};

        for (int i = 0; i < titlesArray.length; i++) {
            NewsfeedModel model = new NewsfeedModel(titlesArray[i], likesArray[i], commentsArray[i],
                    photoOneArray[i], isLikedArray[i]);
            newsfeedModels.add(model);
        }
        return newsfeedModels;
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new BlankFragment(), "All");
        adapter.addFragment(new BlankFragment(), "Featured");
        adapter.addFragment(new BlankFragment(), "Popular");
        adapter.addFragment(new BlankFragment(), "My Favorites");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
