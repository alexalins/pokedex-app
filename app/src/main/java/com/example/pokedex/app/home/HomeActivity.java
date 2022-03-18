package com.example.pokedex.app.home;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.example.pokedex.app.R;
import com.example.pokedex.app.util.ItemUtil;

import javax.inject.Inject;

public class HomeActivity extends AppCompatActivity implements HomeContract.View {

    @Inject
    HomeContract.Presenter presenter;
    //
    private ListView listView;
    private ProgressBar loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public void errorMessage() {
        ItemUtil.createToast(this, "Erro ao listar Pokemon");
    }

    @Override
    public void sucessToast() {
        ItemUtil.createToast(this, "Lista de Pokemon");
    }

    @Override
    public void loading() {
        if(this.loading.getVisibility() == View.VISIBLE) {
            this.loading.setVisibility(View.GONE);
        } else if(this.loading.getVisibility() == View.GONE)  {
            this.loading.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void mountAdpater() {

    }

    @Override
    public void bindViews() {
        listView = findViewById(R.id.list_pokemon);
        loading = findViewById(R.id.loading);
    }
}