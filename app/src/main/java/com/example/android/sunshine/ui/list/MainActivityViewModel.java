package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.SunshineRepository;

import com.example.android.sunshine.data.database.ListWeatherEntry;

import java.util.List;

/**
 * Created by rsk_mac on 3/5/18.
 */

public class MainActivityViewModel extends ViewModel {

    private final SunshineRepository mRepository;
    private final LiveData<List<ListWeatherEntry>> mForecast;

    public MainActivityViewModel(SunshineRepository repository)
    {
        this.mRepository = repository;
        this.mForecast = mRepository.getCurrentWeatherForecasts();
    }

    public LiveData<List<ListWeatherEntry>> getForecast() {
        return this.mForecast;
    }
}
