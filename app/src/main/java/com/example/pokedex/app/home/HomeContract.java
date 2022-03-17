package com.example.pokedex.app.home;

import com.example.pokedex.app.model.Pokemon;
import com.example.pokedex.app.mvp.BasicContract;

import java.util.List;

public class HomeContract {
    interface View extends BasicContract.BaseView<Presenter> {
        void errorMessage();
        void sucessToast();
        void loading();
        void startHomeActivity();
    }

    interface Presenter extends BasicContract.BasePresenter {
        List<Pokemon> getList();
    }
}
