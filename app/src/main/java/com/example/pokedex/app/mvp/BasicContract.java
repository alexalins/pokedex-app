package com.example.pokedex.app.mvp;

public interface BasicContract {
    interface BaseView {
        void bindViews();
    }

    interface BasePresenter {
        void start();
    }
}