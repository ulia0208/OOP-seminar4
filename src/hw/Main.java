package hw;

import java.util.ArrayList;

public class Main {
//
//    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
//    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
//    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
//    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
//    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
//    Можно сравнивать коробки с яблоками и апельсинами;
//    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
//    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
//    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
//    g. Не забываем про метод добавления фрукта в коробку.
    public static void main(String[] args) {

        Box<Apple> box1=new Box<>(new ArrayList<>());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());


        Box<Orange> box2=new Box<>(new ArrayList<>());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());


        System.out.println(box1.getBoxWeight());
        System.out.println(box2.getBoxWeight());
        System.out.println(box1.compareBoxes(box2));

        Box<Apple> box3 = new Box<>(new ArrayList<>());
        box3.addFruit(new Apple());
        box3.addFruit(new Apple());


        box1.removeFruits(box3);

        System.out.println(box1.getBoxWeight());

        System.out.println(box3.getBoxWeight());



    }
}
