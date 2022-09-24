package FactoryMethod;

import FactoryMethod.framework.*;
import FactoryMethod.idCard.IDCardFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("С��");
        Product card2 = factory.create("С��");
        Product card3 = factory.create("С��");
        card1.use();
        card2.use();
        card3.use();
    }

}
