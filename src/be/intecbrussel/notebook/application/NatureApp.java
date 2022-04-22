package be.intecbrussel.notebook.application;


import be.intecbrussel.notebook.entities.animals.Carnivore;
import be.intecbrussel.notebook.entities.animals.Herbivore;
import be.intecbrussel.notebook.entities.animals.Omnivore;
import be.intecbrussel.notebook.entities.plants.*;
import be.intecbrussel.notebook.service.ForestNoteBook;

import java.util.LinkedHashSet;
import java.util.Set;

public class NatureApp{
    public static void main(String[] args) {
        Set<Plant> plantDiet = new LinkedHashSet<>();

        ForestNoteBook forestNoteBook=new ForestNoteBook();

        Bush bush =new Bush("Yew",12.30,"Apple",LeafType.ROUND);//via de constructor ook ga ik leafType meegeven
        bush.setFruit("Apple");
        bush.setLeafType(LeafType.HAND);//via de set setter method
        Bush bush1 =new Bush("Flake",12.3,"MiniRedBalls",LeafType.NEEDLE);
        bush1.setFruit("MiniRedBalls");
        bush1.setLeafType(LeafType.NEEDLE);
        Tree tree =new Tree("NeemTree",12.30,LeafType.HEART);
        tree.setLeafType(LeafType.SPEAR);
        Tree tree1 =new Tree("Pipal",300.20,LeafType.HEART);
        tree1.setLeafType(LeafType.HAND);
        Flower flower =new Flower("Rose",12.43,Scent.MUSKY);
        flower.setSmell(Scent.EARTHY);
        Flower flower1=new Flower("Tulip",12.30,Scent.SOUR);
        flower1.setSmell(Scent.PINEAPPLE);
        Weed weed =new Weed("Canabis",43.20,45.32);
        weed.setArea(54.32);
        Weed weed1 =new Weed ("Marigold",20.15,53.62);
        weed1.setArea(86.32);

        Herbivore herbivore =new Herbivore("Dolly",45.64,45.30,12.30);
        herbivore.addPlantToDiet(bush);
        herbivore.setPlantDiet(plantDiet);     //planDiet Via de setter
        Herbivore herbivore2= new Herbivore("Pony", 165.3, 2.,12.30);
        herbivore2.addPlantToDiet(tree);
        Omnivore omnivore = new Omnivore("Pig ", 65.3, 11.50, 76.90,14.23);//maxFoodSize ook via de Constructor
        omnivore.addPlantToDiet(weed1);
        omnivore.setMaxFoodSize(57.32);     //maxFoodSize via de setter
        Omnivore omnivore2=new Omnivore("Hedgehogs",42.30,45.30,42.30,54.31);
        omnivore2.addPlantToDiet(bush);
        omnivore2.setPlantDiet(plantDiet);
        omnivore2.setMaxFoodSize(54.32);
        Carnivore carnivore= new Carnivore("Firefox", 20.4, 0.80, 0.40,14.25);
        carnivore.setMaxFoodSize(54.31);
        Carnivore carnivore2 = new Carnivore("Lion", 20.31, 30.12, 54.30,14.25);
        carnivore.setMaxFoodSize(32.54);
        Carnivore carnivore3 = new Carnivore("Wolfy", 52.1, 1.9, 12.54,12.31);
        carnivore3.setMaxFoodSize(65.31);
        Omnivore omnivore3 = new Omnivore("Mozilla", 175.6, 1.7, 1.40,14.50);
        omnivore3.addPlantToDiet(bush1);
        omnivore.setPlantDiet(plantDiet);
        omnivore3.setMaxFoodSize(54.32);
        Omnivore omnivore4 = new Omnivore("Triple eyes", 5.4, 0.30, 0.40,14.32);
        omnivore4.addPlantToDiet(flower);
        omnivore4.setPlantDiet(plantDiet);
        omnivore4.setMaxFoodSize(65.32);
        Omnivore omnivore5 = new Omnivore("Godzilla", 65.3, 1.50, 0.90,75.31);
        omnivore5.addPlantToDiet(weed);
        omnivore5.setPlantDiet(plantDiet);
        omnivore5.setMaxFoodSize(36.21);
       forestNoteBook.addPlant(bush);
       forestNoteBook.addPlant(bush1);
       forestNoteBook.addPlant(tree);
       forestNoteBook.addPlant(tree1);
       forestNoteBook.addPlant(weed);
       forestNoteBook.addPlant(weed1);
       forestNoteBook.addPlant(flower);
       forestNoteBook.addPlant(flower1);

       forestNoteBook.addAnimal(omnivore);
       forestNoteBook.addAnimal(omnivore2);
       forestNoteBook.addAnimal(omnivore3);
       forestNoteBook.addAnimal(omnivore4);
       forestNoteBook.addAnimal(omnivore5);
       forestNoteBook.addAnimal(herbivore);
       forestNoteBook.addAnimal(herbivore2);
       forestNoteBook.addAnimal(carnivore);
       forestNoteBook.addAnimal(carnivore2);
       forestNoteBook.addAnimal(carnivore3);
        System.out.println("------------------");

        forestNoteBook.printNoteBook();
        System.out.println("------------------");

        System.out.println("Animals and Plants sorted by their names");
       forestNoteBook.sortPlantsByName();
        System.out.println("------------------");
        forestNoteBook.sortAnimalsByName();
        System.out.println("------------------");

        System.out.println("Animals and Plants sorted by their heights:");
       forestNoteBook.sortAnimalsByHeight();
        System.out.println("------------------");
        forestNoteBook.sortPlantsByHeight();
        System.out.println("------------------");


        System.out.println("Total number of plants counted: "+ForestNoteBook.getPlantCount());
        System.out.println("Total number of animals counted: "+ForestNoteBook.getAnimalCount());
        System.out.println("The Happy end");

    }

}

       


