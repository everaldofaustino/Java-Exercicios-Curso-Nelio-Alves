package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {

    static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();


        //  usando SUPER (escrita)
        addShapes(myShapes);

        // usando EXTENDS (leitura)
        double total = totalArea(myShapes);
        System.out.println("Total area: " + totalArea(myShapes));
    }

    //Producer
    public static double totalArea(List<? extends Shape> list) {

        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }

    //Consumer
    public static void addShapes(List<? super Shape> list){
        list.add(new Rectangle(3.0, 2.0));
        list.add(new Circle(2.0));
    }

}


