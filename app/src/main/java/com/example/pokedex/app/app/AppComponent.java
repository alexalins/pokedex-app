package com.example.pokedex.app.app;

import com.example.pokedex.app.home.HomeActivity;
import com.example.pokedex.app.module.AppModule;

import dagger.Component;

@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(HomeActivity activity);
}