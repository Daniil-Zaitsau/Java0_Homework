package JNullOOP;

class CandyFactory {
    Confection factory(String[] array) {
        int size = 0;
        String confection = null;
        int sugar = 0;
        int weight = 0;
        try {
            size = array.length;
            confection = array[0];
            sugar = Integer.parseInt(array[size - 2]);
            weight = Integer.parseInt(array[size - 3]);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect file");
            Box.logger.warn("File wrong, incorrect input");
            System.exit(0);
        }
        StringBuilder name = new StringBuilder();
        for (int i = 1; i < size - 3; i++) {
            name.append(array[i]);
            name.append(" ");
        }

        switch (confection) {
            case "Chocolate":
                return new Chocolate(weight, sugar, name.toString());
            case "Candy":
                return new Candy(weight, sugar, name.toString());
            case "Bar":
                return new Bar(weight, sugar, name.toString());
            default:
                System.out.println("Whoops, something wrong in your file, there isn't some position in box.");
                return null;
        }
    }
}