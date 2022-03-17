package com.example.pokedex.app.mvp;

public interface BasicContract {
    interface BaseView<T> {
        void setPresenter(T presenter);
        void bindViews();
    }

    interface BasePresenter {
        void start();
    }
}