package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.android.sunshine.data.SunshineRepository;

/**
 * Created by rsk_mac on 3/5/18.
 */

public class MainViewModelFactory extends ViewModelProvider.NewInstanceFactory {


    private final SunshineRepository mRepository;

    public MainViewModelFactory(SunshineRepository repository)
    {
        this.mRepository = repository;
    }


    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        return (T) new MainActivityViewModel(mRepository);
    }
}
