package be.intecbrussel.notebook.entities.animals;

import be.intecbrussel.notebook.entities.plants.Plant;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Omnivore extends Animal {
    private Set<Plant>plantDiet= new HashSet<>();
    private double maxFoodSize;
    public Omnivore(String name) {
        super(name);
    }

  public Omnivore(String name,double maxFoodSize){
        super(name);
        this.maxFoodSize=maxFoodSize;
  }
  public Omnivore(String name,double weight,double height,double length,double maxFoodSize){
        super(name, weight, height, length);
        this.maxFoodSize=maxFoodSize;
  }
    public Omnivore(String name, double weight, double height, double length,double
            maxFoodSize,Set<Plant>plantDiet) {
        super(name, weight, height, length);
        this.plantDiet=plantDiet;
        this.maxFoodSize=maxFoodSize;
    }

    public  Set<Plant> getPlantDiet() {

            return plantDiet;
}
    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }


 public  void addPlantToDiet(Plant plant) {
     System.out.println("Adding OmnivorePlantsDiet: " + plant);
     plantDiet.add(plant);

 }

    @Override
    public String toString() {
        return "Omnivore{" +
                "plantDiet=" + plantDiet +
                ", maxFoodSize=" + maxFoodSize +
                "} " + super.toString();
    }
}
