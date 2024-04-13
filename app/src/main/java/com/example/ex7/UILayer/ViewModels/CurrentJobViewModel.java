package com.example.ex7.UILayer.ViewModels;

import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.ex7.DataLayer.Rep.RepositoryImp;

public class CurrentJobViewModel extends ViewModel {
    private MutableLiveData<String> characterName = new MutableLiveData<>();
    private MutableLiveData<String> jobName = new MutableLiveData<>();

    public MutableLiveData<String> getCharacterName() {
        return RepositoryImp.getInstance().getCharacterName();
    }

    public MutableLiveData<String> getJobName() {
        return RepositoryImp.getInstance().getJobName();
    }
}
