package service;

import controller.input.UserInput;
import entity.Confection;

import java.util.ArrayList;

class Sugar {
    private static int counter = 0;
    void check(ArrayList<Confection> candyBox) {
        //Для одного из пунктов задания нужно ввести диапазон сахара в продукте
        UserInput input = new UserInput();
        System.out.println("Enter the first point of diapason:");
        int firstPoint = input.enter();
        System.out.println("Enter the second point of diapason:");
        int secondPoint = input.enter();

        String name = "";
        System.out.println();
        //Проверяет сахар у продукта (выводит одно название один раз) и считает общий вес
        for (Confection a : candyBox) {
            if(!name.equals(a.getName())){
                checkSugar(a, firstPoint, secondPoint);
                name = a.getName();
            }
        }

        if (counter == 0){
            System.out.println("Sorry, but this gift is not for you. It has a lot of sugar!");
        }
    }

    //Проверяет количество сахара у объекта
    private static void checkSugar(Confection a, int firstPoint, int secondPoint) {
        if (a.getSugar() > firstPoint & a.getSugar() < secondPoint){
            System.out.println("You can eat " + a.getName());
            counter++;
        }
    }

}
