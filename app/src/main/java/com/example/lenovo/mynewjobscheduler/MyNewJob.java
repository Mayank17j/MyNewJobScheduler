package com.example.lenovo.mynewjobscheduler;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyNewJob extends JobService {
    public MyNewJob() {
    }

    @Override
    public boolean onStartJob(JobParameters params) {
        //put here job for scheduling or any Async task also
        Log.i("Job","Started");
        Toast.makeText(this,"Job started",Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        Log.i("Job","Stopped");
        Toast.makeText(this,"Job stopped",Toast.LENGTH_SHORT).show();
        return false;
    }

}
