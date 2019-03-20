package controller.output;

import entity.Confection;

import java.util.ArrayList;

public class Output {
    public void output(ArrayList<Confection> candyBox){
        for (Confection c : candyBox) {
            System.out.println(c.toString());
        }
    }
}
