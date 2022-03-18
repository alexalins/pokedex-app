package com.example.pokedex.app.home;

import com.example.pokedex.app.model.Pokemon;

import java.util.List;

public class HomePresenter implements HomeContract.Presenter{

    private HomeContract.View view;

    public HomePresenter(HomeContract.View view) {
        this.view = view;
    }
    @Override
    public List<Pokemon> getList() {
        return null;
    }

    @Override
    public void start() {

    }
}
