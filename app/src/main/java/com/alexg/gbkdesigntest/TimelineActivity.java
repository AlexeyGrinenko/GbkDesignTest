package com.alexg.gbkdesigntest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import com.alexg.gbkdesigntest.Utils.DividerItemDecoration;
import com.alexg.gbkdesigntest.adapters.TimelineAdapter;
import com.alexg.gbkdesigntest.models.TimelineModel;

import java.util.ArrayList;
import java.util.List;

public class TimelineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_timeline);

        RecyclerView timelineRecicler = findViewById(R.id.timeline_recycler);
        timelineRecicler.setLayoutManager(new LinearLayoutManager(this));
        timelineRecicler.addItemDecoration(
                new DividerItemDecoration(this, R.drawable.divider));
        TimelineAdapter adapter = new TimelineAdapter(this, makeModelsList());
        timelineRecicler.setAdapter(adapter);
    }

    private List<TimelineModel> makeModelsList() {
        List<TimelineModel> timelineModelList = new ArrayList<>();

        String[] titlesArray = {"Revice Wireframe", "Finish Home Screen", "External Work", "Create Workflow"};
        String[] subtitlesArray = {"Company Work", "Home App", "Company Work", "Internal Project"};

        String[] timeArray = {"4:45", "2:20", "11:20", "9:40"};
        boolean[] amPmArray = {false, false, true, true};
        boolean[] isActiveArray = {true, true, false, true};
        int[] photoOneArray = {R.drawable.timeline_photo1, R.drawable.timeline_photo1,
                R.drawable.timeline_photo1, R.drawable.timeline_photo1};
        int[] photoTwoArray = {R.drawable.timeline_photo2, R.drawable.timeline_photo2,
                R.drawable.timeline_photo2, R.drawable.timeline_photo2};
        int[] photoThreeArray = {R.drawable.timeline_photo3, R.drawable.timeline_photo3,
                R.drawable.timeline_photo3, R.drawable.timeline_photo3};

        for (int i = 0; i < titlesArray.length; i++) {
            TimelineModel model = new TimelineModel(titlesArray[i], subtitlesArray[i], timeArray[i], amPmArray[i],
                    isActiveArray[i], photoOneArray[i], photoTwoArray[i], photoThreeArray[i]);
            timelineModelList.add(model);
        }
        return timelineModelList;
    }

}
