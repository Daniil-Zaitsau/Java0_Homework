package service.sorting;

import entity.Confection;

import java.util.ArrayList;

class SortedByWeight {
     static void sort(ArrayList<Confection> candyBox) {
       // 2 - сортировка по весу (вставка)
        int temp, j;
        for(int i = 0; i < candyBox.size()-1; i++){
            if (candyBox.get(i).getWeight() > candyBox.get(i+1).getWeight()) {
                temp = candyBox.get(i+1).getWeight();
                candyBox.get(i+1).setWeight(candyBox.get(i).getWeight());
                j = i;
                while (j > 0 && temp < candyBox.get(j - 1).getWeight()) {
                    candyBox.get(j).setWeight(candyBox.get(j-1).getWeight());
                    j--;
                }
                candyBox.get(j).setWeight(temp);
            }
        }
    }
}
