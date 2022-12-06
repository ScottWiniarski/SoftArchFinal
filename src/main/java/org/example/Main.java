package org.example;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        UserInput ui = new UserInput();
        String name;
        String magicChoice;
        String physChoice;

        String magicItemName = null;
        String magicItemType = null;

        String physItemName = null;
        String physItemType = null;


        Scanner scanner = new Scanner(System.in);

        // only main and wizardschool should have printlines
        WizardSchool wizardSchool = WizardSchool.getInstance();
        wizardSchool.fillRoster();

        System.out.println("Welcome to FrogSorts!\nI understand that the accident with your luggage is still being investigated, but while you're here\n" +
                "we can take care of some of the more... boring administrative issues." +
                "\nFirst and foremost, I'll need your name. Don't worry about the glowing orb on the table, it'll just ensure you're being honest.");

        do {
            System.out.print("\n*****\nYour full name: ");
            name = scanner.nextLine();
        }while(ui.checkName(name) == 1);

        System.out.printf("Thank you %s.\nNow, we need to sort out which items you'll be using while on the premises.\n" +
                "You might have noticed already that the western wall is missing,\n" +
                "and it is for that reason why we've shifted away from allowing just anyone to bring in magical items.\n" +
                "You'll have to be assigned some items, at least until you've cleared your junior exams.\n\nPlease choose" +
                "from the following magical items:\n1) Ramshackle Staff\n2) Maple Wand\n3) Gauntlet of Destruction, Doom and the Cringe.", name);

        do{
            System.out.print("\n *****\nYour choice: ");
            magicChoice = scanner.nextLine();
        }while(ui.checkChoice(magicChoice) == 0);

        switch (magicChoice){
            case "1" -> {
                magicItemName = "Ramshackle Staff" ;
                magicItemType = "Staff";
            }
            case "2" -> {
                magicItemName = "Maple Wand" ;
                magicItemType = "Wand" ;
            }
            case "3" -> {
                magicItemName = "Gauntlet of Destruction, Doom and the Cringe" ;
                magicItemType = "Gauntlet";
            }
        }

        System.out.printf("Now %s, please pick a physical item for self defense. With all the magic running around, \nit's no small wonder some things can take a magical" +
                "punch or seven. A physical weapon might be just what you need,\nto crack a soul crystal or a person's skull. I know I'm tempted to on occasion.\n\n" +
                "Please choose from the following:\n1) Sturdy Sword\n2) Solid Cane", name);

        do{
            System.out.print("\n ****** \nYour Choice: ");
            physChoice = scanner.nextLine();
        }while(ui.checkChoice(physChoice) == 0 || ui.checkChoice(physChoice) == 3);

        switch (physChoice){
            case "1" -> {
                physItemName = "Sturdy Sword" ;
                physItemType = "Sword" ;
            }
            case "2" -> {
                physItemName = "Solid Cane" ;
                physItemType = "Cane" ;
            }
        }

        wizardSchool.addToRoster(name, magicItemName, magicItemType, physItemName, physItemType);


    }
}