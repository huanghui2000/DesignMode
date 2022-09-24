package FactoryMethod.idCard;

import FactoryMethod.framework.Product;

public class IDCard extends Product {

    private final String owner;

    IDCard(String owner) {
        System.out.println("���� " + owner + " ��ID��");
        this.owner = owner;
    }

    public void use() {
        System.out.println("ʹ�� " + owner + " ��ID��");
    }

    public String getOwner() {
        return owner;
    }

}
