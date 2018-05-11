package com.thebaileybrew.mathtrainingquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;

import java.util.List;
import java.util.Vector;

public class quizSelection extends AppCompatActivity implements View.OnClickListener {

    private PagerAdapter mPagerAdapter;
    ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_your_quiz);

        //TODO: Program animation for transitioning from current view to tabbed ViewPager...


        //TODO: Setup a ViewPager with Tab Navigation

        //TODO: Setup a RecyclerView with CardView for the unique quiz types

    }

    private void fadeContentView() {
        //TODO: Set up the animation fade out for select_your_quiz.xml and fade in for quizes_all.xml (where the ViewPager is set up with Tabbed Navigation)
        setContentView(R.layout.quiz_pager_view);
    }

    private void initializeFragments() {
        List<Fragment> fragments = new Vector<>();
        fragments.add(Fragment.instantiate(this,TimeTrials.class.getName()));
        fragments.add(Fragment.instantiate(this,PatternsMatch.class.getName()));
        fragments.add(Fragment.instantiate(this,AddSubtract.class.getName()));
        fragments.add(Fragment.instantiate(this,ScoreView.class.getName()));

        mPagerAdapter = new PagerAdapter(super.getSupportFragmentManager(), fragments);
        ViewPager mPager = super.findViewById(R.id.viewPager);
        mPager.setAdapter(this.mPagerAdapter);
        mPager.setOffscreenPageLimit(4);

        mPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            public void onPageSelected(int position) {
                switch(position) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
            }
        });
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.math_time_trial:
                //Time Trials - Race The Clock
                break;
            case R.id.math_pattern_recognition:
                //Pattern Recognition
                break;
            case R.id.math_addition_subtraction:
                //Add and Subtract testing
                break;
            case R.id.math_see_your_scores:
                //Review of scores
                break;
        }
    }
}
