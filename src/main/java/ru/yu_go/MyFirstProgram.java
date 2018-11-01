package ru.yu_go;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello ("на Кипр") ;
        Square s = new Square(5);
        Rectangle r = new Rectangle(1,2);

        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
}

    public static void hello (String somebody ) {

        System.out.println("Переезжаю "  + somebody + "!");
    }



}
