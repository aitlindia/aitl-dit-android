package com.aitl.androidapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService2 extends Service {

    boolean running = false;

    public MyService2() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);

        running = true;

        new Thread(new Runnable() {

            int Counter = 0;
            @Override
            public void run() {

                while (running){

                    Log.d("Service2","Counter "+Counter);
                    Counter++;

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
        }).start();

        return startId;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        running = false;
    }
}
