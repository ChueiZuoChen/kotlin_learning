package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<? extends Object> list2 = list;
        List<Object> list3 = new ArrayList<>();
        List<? super String> list4 = list3;
        System.out.println("---------");


        /*PECS: Producer Extence, Consumer Super.*/
        List<Cat> cats = new ArrayList<>();
        List<? extends Animal> animals = cats; //animals 裡面放的東西只要是extends Animal的都可以放進去
//        animals.add(new ArrayList<Cat>());
        List<? super Animal> animals1= new ArrayList<>();
        animals1.add(new Cat());

    }
}

class Animal {

}

class Cat extends Animal {

}

class Dog extends Animal {

}
