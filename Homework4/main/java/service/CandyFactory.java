package service;

import entity.*;

class CandyFactory {
    Confection factory(String confection) {

        switch (confection) {
            case Constants.CHOCOLATE:
                return new Chocolate();
            case Constants.CANDY:
                return new Candy();
            case Constants.BAR:
                return new Bar();
            default:
                System.out.println("Whoops, something wrong in your file, there isn't some position in box.");
                return null;
        }
    }
}