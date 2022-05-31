package com.mirea.shakhnazaryan.viewmodel;

import android.os.Handler;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

class ProgressViewModel extends ViewModel {
    private static MutableLiveData<Boolean> isShowProgress = new MutableLiveData<>();
    // Показать прогресс в течении 10 сек.
    void showProgress() {
        isShowProgress.postValue(true);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                isShowProgress.postValue(false);
            }
        }, 10000);
    }

    MutableLiveData<Boolean> getProgressState() {
        return isShowProgress;
    }
}