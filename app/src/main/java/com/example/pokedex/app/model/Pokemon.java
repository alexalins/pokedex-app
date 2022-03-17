package com.example.pokedex.app.model;

import java.util.List;

public class Pokemon {
    private Long id;
    private String name;
    private String sprite;
    private int weight;
    private List<Type> typeList;
    private List<Ability> abilityList;
    private List<Status> statusList;

    public Pokemon() {
    }

    public Pokemon(Long id, String name, String sprite, int weight, List<Type> typeList, List<Ability> abilityList, List<Status> statusList) {
        this.id = id;
        this.name = name;
        this.sprite = sprite;
        this.weight = weight;
        this.typeList = typeList;
        this.abilityList = abilityList;
        this.statusList = statusList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Type> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<Type> typeList) {
        this.typeList = typeList;
    }

    public List<Ability> getAbilityList() {
        return abilityList;
    }

    public void setAbilityList(List<Ability> abilityList) {
        this.abilityList = abilityList;
    }

    public List<Status> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<Status> statusList) {
        this.statusList = statusList;
    }
}
