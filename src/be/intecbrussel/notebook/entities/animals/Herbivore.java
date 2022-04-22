package be.intecbrussel.notebook.entities.animals;

import be.intecbrussel.notebook.entities.plants.Plant;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Herbivore extends Animal  {
    private Set<Plant> plantDiet=new HashSet<>();

    public Herbivore(String name) {
        super(name);

    }
  public Herbivore(String name ,double weight,double height,double length){
        super(name, weight, height, length);
      this.plantDiet=plantDiet;

  }
    public Herbivore( String name,double weight,double height,double length,Set<Plant>plantDiet){
        super(name,weight,height,length);
        this.plantDiet=plantDiet;
    }


    public  Set<Plant> getPlantDiet() {
        return plantDiet;
    }
    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public  void addPlantToDiet(Plant plant) {
        System.out.println("Adding HervivoresPlantsDiet :" + plant);
        plantDiet.add(plant);

    }
    public void printDiet() {
        System.out.println("PrintingDietPlants:");
        for (Plant p: plantDiet) {
            System.out.println(p);
        }

    }

   @Override
    public String toString() {
        return "Herbivore{" +
                "plantDiet=" + plantDiet +
                "} " + super.toString();
    }


    }

