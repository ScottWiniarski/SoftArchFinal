package org.example;

public class MagicFactory {

    public static MagicItem getMagicItem(String itemName, double damageValue, String itemType){
        return switch (itemType) {
            case "Staff" -> new Staff(itemName, damageValue);
            case "Wand" -> new Wand(itemName, damageValue);
            case "Gauntlet" -> new Gauntlet(itemName, damageValue);
            default -> null;
        };
    }
}
