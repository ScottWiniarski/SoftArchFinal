package org.example;

public class PhysicalFactory {

    public static PhysicalItem getPhysicalItem(String itemName, double damageValue, String itemType){
        return switch (itemType){
            case "Sword" -> new Sword(itemName, damageValue);
            case "Cane" -> new Cane(itemName, damageValue);
            default -> null;
        };
    }
}
