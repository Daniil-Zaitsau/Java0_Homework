package service.sorting;

import entity.Confection;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorting {

    // Сортировка по двум параметрам применяя thenCompare
    public void sortTwoByCompare(ArrayList<Confection> secondSort) {
        Comparator<Confection> confectionComparator = new SortedBySugar().thenComparing(new SortedByName());
        secondSort.sort(confectionComparator);
    }

    //Сортировка по двум параметрам без thenCompare
    public void sortTwo(ArrayList<Confection> thirdSort) {
        // 1- сортировка по имени (выборка)
        SortedByName.sort(thirdSort);
        // 2 - сортировка по весу (вставка)
        SortedByWeight.sort(thirdSort);
    }


}
