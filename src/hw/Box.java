package hw;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private int count;

    private double boxWeight;

    private ArrayList<T> fruitBox=new ArrayList<>();

    public Box(ArrayList<T> fruitBox) {
        this.fruitBox = new ArrayList<>();
    }

    public ArrayList<Fruit> getProduct(int i){
        return (ArrayList<Fruit>) fruitBox;
    }

    private double fruitWeight(T fruit){//////вес фрукта для добавления
        if(fruit instanceof  Apple){
            return 1.0;
        }
        else if(fruit instanceof  Orange){
            return 1.5;
        }
        else {
            return 0.0;
        }
    }





    public void addFruit(T fruit){    //////////добавление
        fruitBox.add(fruit);
        boxWeight+=fruitWeight(fruit);
    }

    public double getBoxWeight(){/////////вес коробки
        return boxWeight;

    }



    public boolean compareBoxes(Box<?>box){//////////////сравнение коробок

        return Double.compare(this.getBoxWeight(),box.boxWeight)==0;

    }

    public void removeFruits(Box<T> box2) {/////////////пересыпание
        for(T fruit:fruitBox){
            box2.addFruit(fruit);


        }
        fruitBox.clear();
        boxWeight=0;
    }




}
