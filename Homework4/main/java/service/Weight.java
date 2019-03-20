package service;

import entity.Confection;

import java.util.ArrayList;

class Weight {

    int check(ArrayList<Confection> candyBox) {
        int weight = 0;
        for (Confection a : candyBox) {
            weight += a.getWeight();
        }
        return weight;
    }
}
