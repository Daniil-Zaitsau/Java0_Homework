package JNullOOP;

import java.io.*;
import java.util.*;

import org.apache.log4j.Logger;

// Перед выполнением посмотрите файл, с которого считывались данные
public class Box {
    //Логирование
    static final Logger logger = Logger.getLogger(Box.class);

    //Выводит лист
    private static void output (ArrayList<Confection> list){
        for (Confection a: list) {
            System.out.println("Weight " + a.getWeight() + " Sugar " + a.getSugar() + " Name " + a.getName() );
        }
    }

    //Проверяет количество сахара у объекта
    private static void checkSugar(Confection a, int firstPoint, int secondPoint) {
        if (a.getSugar() > firstPoint & a.getSugar() < secondPoint){
            System.out.println("You can eat " + a.getName());
        }
    }

    // Сортировка по двум параметрам применяя thenCompare
    private static void sortTwoByCompare(ArrayList<Confection> candyBox) {
        Comparator<Confection> confectionComparator = new SortedBySugar().thenComparing(new SortedByName());
        candyBox.sort(confectionComparator);
    }

    //Сортировка по двум параметрам без thenCompare
    private static void sortTwo(ArrayList<Confection> candyBox) {
        // 1- сортировка по имени (выборка)
        SortedByName.sort(candyBox);
        // 2 - сортировка по весу (вставка)
        SortedByWeight.sort(candyBox);
    }
    //Сортировка с одним параметром реализована в отдельном класса

    public static void main(String[] args) {
        ArrayList<Confection> candyBox = new ArrayList<>();

        int firstPoint = 0;
        int secondPoint = 1;
        System.out.println("Enter file path:");
        try (Scanner scanner = new Scanner(System.in);
             BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(scanner.next()))))
        {
            CandyFactory create = new CandyFactory();
            reader.readLine();   //пропускает первую строчку файла (формат ввода данных в файл)
            //Считывает данные из файла и создает объекты в листе
            while (reader.ready()) {
                String[] sArr = reader.readLine().split(" ");
                for (int i = 0; i < Integer.parseInt(sArr[sArr.length - 1]); i++) {
                    candyBox.add(create.factory(sArr));
                }
            }

            //Для одного из пунктов задания нужно ввести диапазон сахара в продукте
             System.out.println("Please, enter the range of sugar for confection in your gift:");
             firstPoint = scanner.nextInt();
             secondPoint = scanner.nextInt();
        } catch (FileNotFoundException e){
            System.out.println("File not found!");
            logger.warn("File not found");
            System.exit(0);
        } catch (IOException e){
            logger.warn("IOException");
        } catch (Exception e){
            System.out.println("Incorrect input!");
            logger.warn("Incorrect input");
            System.exit(0);
        }

        System.out.println("\nYour gift consist of:");

        output(candyBox);

        int weight = 0;
        String name = "";
        System.out.println();
        //Проверяет сахар у продукта (выводит одно название один раз) и считает общий вес
        for (Confection a : candyBox) {
            if(!name.equals(a.getName())){
                checkSugar(a, firstPoint, secondPoint);
                name = a.getName();
            }
            weight += a.getWeight();
        }
        System.out.println("\nThe weight of your gift is " + weight + " gram.\n");

        /* Три сортировки. В каждой создается новый лист,
        чтобы во второй и третий методы не передавать уже отсортированный лист*/
        ArrayList<Confection> firstSort = new ArrayList<>(candyBox);
        System.out.println("\nSorting by name:");
        SortedByName.sort(firstSort);
        output(firstSort);

        ArrayList<Confection> secondSort = new ArrayList<>(candyBox);
        System.out.println("\nSorting with \"thenComparing\" and two parameters:");
        sortTwoByCompare(secondSort);
        output(secondSort);

        ArrayList<Confection> thirdSort = new ArrayList<>(candyBox);
        System.out.println("\nSorting without \"thenComparing\" :");
        sortTwo(thirdSort);
        output(thirdSort);
    }
}
