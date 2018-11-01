package ru.yu_go;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello ("Кипр") ;
        double l = 5;
        double w = 4;
        double v = 17;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
        System.out.println("Площадь прямоугольника со сторонами " + w + " и " + v + " = " + area(w,v));
}

    public static void hello (String somebody ) {

        System.out.println("Переезжаю на "  + somebody + "!");
    }

    public static double area (double a){
        return a*a;
    }

    public static double area (double a, double b){
        return a*b;
    }
}
