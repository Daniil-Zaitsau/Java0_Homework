package service;

import entity.Confection;
import java.util.ArrayList;
import controller.output.Output;
import service.sorting.SortedByName;
import service.sorting.Sorting;

public class CreateGift {

    public void start(){

        Output out = new Output();
        Weight weight = new Weight();
        FileData data = new FileData();
        ArrayList<Confection> candyBox = new ArrayList<>();

        data.read(candyBox);

        System.out.println("\nYour gift consist of:");
        out.output(candyBox);

        System.out.println("\nThe weight of your gift is " + weight.check(candyBox) + " gram.\n");

        System.out.println("Now we gonna check the sugar!");
        Sugar sugar = new Sugar();
        sugar.check(candyBox);

        /* Три сортировки. В каждой создается новый лист,
        чтобы во второй и третий методы не передавать уже отсортированный лист*/
        Sorting sorting = new Sorting();

        ArrayList<Confection> firstSort = new ArrayList<>(candyBox);
        System.out.println("\nSorting by name:");
        SortedByName.sort(firstSort);
        out.output(firstSort);

        ArrayList<Confection> secondSort = new ArrayList<>(candyBox);
        System.out.println("\nSorting with \"thenComparing\" and two parameters:");
        sorting.sortTwoByCompare(secondSort);
        out.output(secondSort);

        ArrayList<Confection> thirdSort = new ArrayList<>(candyBox);
        System.out.println("\nSorting without \"thenComparing\" :");
        sorting.sortTwo(thirdSort);
        out.output(thirdSort);
    }

}
