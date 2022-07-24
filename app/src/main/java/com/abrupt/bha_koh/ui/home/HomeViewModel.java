package com.abrupt.bha_koh.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.abrupt.bha_koh.utilities.Strings;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(Strings.DRAGONS.localizedString());
    }

    public LiveData<String> getText() {
        return mText;
    }
}