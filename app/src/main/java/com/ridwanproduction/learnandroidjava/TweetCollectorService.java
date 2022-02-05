package com.ridwanproduction.learnandroidjava;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class TweetCollectorService extends Service {
    private static final String TAG = TweetCollectorService.class.getSimpleName();

    private Timer timer;

    private TimerTask updateTask = new TimerTask() {
        @Override
        public void run() {
            Log.i(TAG, "Timer task doing work");
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "Service creating");

        timer = new Timer("TweetCollectorTimer");
        timer.schedule(updateTask, 1000L, 60 * 1000L);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Service destroying");

        timer.cancel();
        timer = null;
    }

    private List<TweetCollectorListener> listeners = new ArrayList<TweetCollectorListener>();

    private TweetCollectorApi.Stub apiEndpoint = new TweetCollectorApi.Stub() {

        @Override
        public TweetSearchResult getLatestSearchResult() throws RemoteException {
            synchronized (latestSearchResultLock) {
                return latestSearchResult;
            }
        }

        @Override
        public void addListener(TweetCollectorListener listener)
                throws RemoteException {

            synchronized (listeners) {
                listeners.add(listener);
            }
        }

        @Override
        public void removeListener(TweetCollectorListener listener)
                throws RemoteException {

            synchronized (listeners) {
                listeners.remove(listener);
            }
        }

    };

}
