package proj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        romb romb = new romb(-2,3);
        System.out.println("Длинна стороны ромба: " + romb.getBase());
        System.out.println("Высота ромба: " + romb.getHeight());
        System.out.println("Площадь: " + romb.getArea());
        System.out.println("Периметр: " + romb.getPerimeter());
        System.out.println("-----------------------------------");
        romb romb1 = new romb(2,4);
        System.out.println("Площадь: " + romb1.getArea());
        System.out.println("Периметр: " + romb1.getPerimeter());
        System.out.println("-----------------------------------");
        System.out.println("Введите длинну ромба: ");
        int a = scanner.nextInt();
        System.out.println("Введите высоту: ");
        int b = scanner.nextInt();
        romb romb2 = new romb(a, b);
        System.out.println("Площадь: " + romb2.getArea());
        System.out.println("Периметр: " + romb2.getPerimeter());
        System.out.println("Высота ромба: " + romb.getHeight());
        System.out.println("Длинна стороны: " + romb.getBase());


    }
}
