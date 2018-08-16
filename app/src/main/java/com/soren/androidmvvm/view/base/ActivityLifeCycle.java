package com.soren.androidmvvm.view.base;

import android.content.Intent;
import android.os.Bundle;

public interface ActivityLifeCycle {
    void onCreate();
    void onStart();
    void onResume();
    void onPause();
    void onStop();
    void onActivityResult(int requestCode, int resultCode, Intent data);
    boolean onBackPressed();
}
