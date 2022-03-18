package com.example.pokedex.app.module;

import com.example.pokedex.app.home.HomeActivity;
import com.example.pokedex.app.home.HomeContract;
import com.example.pokedex.app.home.HomePresenter;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class HomeModule {
    @Binds
    public abstract HomeContract.View view(HomeActivity mainActivity);

    @Provides
    static HomeContract.Presenter  provideAuthPresenter(HomeContract.View view) {
        return new HomePresenter(view);
    }
}
