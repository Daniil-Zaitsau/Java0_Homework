package JavaNull;


import java.util.Scanner;

public class Triangle {
    public static void main(String[] args)   {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates");
        System.out.print("First dot: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Second dot: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.print("Third dot: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        int xABvec = x2 - x1;
        int yABvec = y2 - y1;

        int xBCvec = x3 - x2;
        int yBCvec = y3 - y2;

        int xACvec = x3 - x1;
        int yACvec = y3 - y1;

        double ABlength = Math.pow( xABvec*xABvec + yABvec*yABvec ,1/2.);
        double BClength = Math.pow( xBCvec*xBCvec + yBCvec*yBCvec ,1/2.);
        double AClength = Math.pow( xACvec*xACvec + yACvec*yACvec ,1/2.);

        if ((ABlength < BClength + AClength) && (AClength < ABlength + BClength) && (BClength < AClength + ABlength)){
            System.out.println("It is triangle");
            if ((xABvec*xBCvec + yABvec*yBCvec == 0) || (xABvec*xACvec + yABvec*yACvec == 0) || (xBCvec*xACvec + yBCvec*yACvec ==0)){
                System.out.println("It is right triangle");
            }
        }

    }
}
