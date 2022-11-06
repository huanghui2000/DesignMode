package FactoryMethod.idCard;

import FactoryMethod.framework.*;

import java.util.ArrayList;

public class IDCardFactory extends Factory {

    private final ArrayList<String> owners = new ArrayList<>();

    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public ArrayList<String> getOwners() {
        return owners;
    }

}
