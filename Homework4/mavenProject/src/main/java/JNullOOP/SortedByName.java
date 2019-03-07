package JNullOOP;

import java.util.ArrayList;
import java.util.Comparator;

public class SortedByName implements Comparator<Confection> {
    //Сортировка выборкой по кодам первых букв
     static void sort(ArrayList<Confection> candyBox) {
        int min;

        for (int index = 0; index < candyBox.size()-1; index++) {
            min = index;

            for (int scan = index + 1; scan < candyBox.size(); scan++) {
                if (!candyBox.get(scan).getName().equals(candyBox.get(min).getName())){
                    int charIndex = 0;
                    boolean flag = true;
                    while (flag) {
                        if (candyBox.get(scan).getName().charAt(charIndex)
                                == candyBox.get(min).getName().charAt(charIndex)) {
                            charIndex++;
                        } else {
                            flag = false;
                        }
                    }
                    if (candyBox.get(scan).getName().charAt(charIndex)
                            < candyBox.get(min).getName().charAt(charIndex)){
                        min = scan;
                    }
                }
            }
            //switch elements
            Confection temp = candyBox.get(min);
            candyBox.set(min,candyBox.get(index));
            candyBox.set(index,temp);
        }
    }

    @Override
    public int compare(Confection o1, Confection o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
