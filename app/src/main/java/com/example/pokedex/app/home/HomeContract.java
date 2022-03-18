package com.example.pokedex.app.home;

import com.example.pokedex.app.model.Pokemon;
import com.example.pokedex.app.mvp.BasicContract;

import java.util.List;

public interface HomeContract {
    interface View extends BasicContract.BaseView {
        void errorMessage();
        void sucessToast();
        void loading();
        void mountAdpater();
    }

    interface Presenter extends BasicContract.BasePresenter {
        List<Pokemon> getList();
    }
}
