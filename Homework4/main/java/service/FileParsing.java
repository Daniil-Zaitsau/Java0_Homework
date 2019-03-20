package service;

import entity.Confection;
import org.apache.log4j.Logger;

class FileParsing {
        private static final Logger LOGGER = Logger.getLogger(FileParsing.class);
        Confection parse(String array){

            CandyFactory create = new CandyFactory();

            String[] sArr = array.split(" ");

            Confection confection = create.factory(sArr[0]);
            int size = 0;
            int sugar = 0;
            int weight = 0;
            int quantity = 0;

            try {
                size = sArr.length;
                sugar = Integer.parseInt(sArr[size - 2]);
                weight = Integer.parseInt(sArr[size - 3]);
                quantity = Integer.parseInt(sArr[size - 1]);
            } catch (NumberFormatException e) {
                System.out.println("Incorrect file");
                LOGGER.error(e);
                System.exit(0);
            }


            StringBuilder name = new StringBuilder();
            for (int i = 1; i < size - 3; i++) {
                name.append(sArr[i]);
                name.append(" ");
            }

            confection.setWeight(weight);
            confection.setSugar(sugar);
            confection.setName(name.toString());
            confection.setQuantity(quantity);

            return confection;
        }
}
