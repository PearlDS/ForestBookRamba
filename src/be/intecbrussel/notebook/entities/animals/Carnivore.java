package be.intecbrussel.notebook.entities.animals;

import be.intecbrussel.notebook.entities.plants.Plant;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Carnivore extends Animal {
    private double maxFoodSize;
    public Carnivore(String name) {
        super(name);
    }

  public Carnivore(String name,double maxFoodSize){
        super(name);
        this.maxFoodSize=maxFoodSize;
  }
    public Carnivore(String name, double weight, double height, double length,double maxFoodSize) {
        super(name, weight, height, length);
        this.maxFoodSize=maxFoodSize;
    }

    public double getMaxFoodSize() {
       Set<Plant>plantSet=new HashSet<>();
        plantSet.add(new Plant("prey",12.20));
        plantSet.add(new Plant("Corn",16.25));
        plantSet.add(new Plant("Bamboo",12.63));
        plantSet.add(new Plant("Grass",12.22));
       Plant maxHeight=Collections.max(plantSet);
        System.out.println(maxHeight);
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        Set<Plant>plantSet=new HashSet<>();
        plantSet.add(new Plant("prey",12.20));
        plantSet.add(new Plant("Corn",16.25));
        plantSet.add(new Plant("Bamboo",12.63));
        plantSet.add(new Plant("Grass",12.22));
        Plant maxHeight=Collections.max(plantSet);
        System.out.println(maxHeight+"maxFoodSize="+maxFoodSize);
        this.maxFoodSize = maxFoodSize;
    }


    @Override
    public String toString() {
        return "Carnivore{" +
                "maxFoodSize=" + maxFoodSize +
                "} " + super.toString();
    }
}
