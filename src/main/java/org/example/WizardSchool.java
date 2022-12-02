package org.example;

import java.util.ArrayList;

public class WizardSchool {
    ArrayList<Wizard> roster = new ArrayList<>();
    ArrayList<Enemy> enemies = new ArrayList<>();
    EasyMode easyMode = new EasyMode();

    public void fillRoster(){

        //MagicItem magicItem = new MagicItem("Staff of Oak", 12){};
        //MagicItem newMagicItem = MagicFactory.getMagicItem("Staff of Oak", 12, "Staff");

        //PhysicalItem physicalItem = new PhysicalItem("Cane of Eld", 7){};

        Wizard wizard = new Wizard("Not-Gandalf", MagicFactory.getMagicItem("Staff of Oak", 12, "Staff"), PhysicalFactory.getPhysicalItem("Cane of Eld", 7, "Cane") ) {
        };

        roster.add(wizard);
        enemies.add( new TrainingDummy("Dumbo", 200));

        Enemy trainingDummy = enemies.get(0);
        double healthPoints = trainingDummy.getHealth();

        double wizardDamage = wizard.getPrimaryWeapon().getDamageValue();

        healthPoints = healthPoints - ( wizardDamage / easyMode.getDifficultyScaling());

        System.out.println("Dumbo has: " +healthPoints + " hit-points left!");


        System.out.println(wizard.getName() + " " + wizard.getPrimaryWeapon().getItemName() + " " + wizard.getSecondaryWeapon().getItemName());
    }
}
