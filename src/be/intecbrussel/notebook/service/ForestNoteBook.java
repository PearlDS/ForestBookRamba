package be.intecbrussel.notebook.service;

import be.intecbrussel.notebook.entities.animals.Animal;
import be.intecbrussel.notebook.entities.animals.Carnivore;
import be.intecbrussel.notebook.entities.animals.Herbivore;
import be.intecbrussel.notebook.entities.animals.Omnivore;
import be.intecbrussel.notebook.entities.plants.*;


import java.util.*;



public class ForestNoteBook   {
    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private static int plantCount = 0;
    private static int animalCount = 0;
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();


    public ForestNoteBook() {

    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public static int getPlantCount() {
        return plantCount;
    }

    public static int getAnimalCount() {
        return animalCount;
    }


    public void addAnimal(Animal animal) {
        
        if(!animals.contains(animal)){
        System.out.println("Adding animals:" + animal);
        animals.add(animal);
        animalCount++;
            
            if( animal instanceOf Carnivore){
             carnivores.add.(animal);   
            }
            
        }

    }

    public void addPlant(Plant plant) {
        System.out.println("Adding plant:" + plant);
        plants.add(plant);
        plantCount++;

    }

    public void printNoteBook() {
        System.out.println("Printing noteBook unsorted manier:");
        animals.forEach(System.out::println);
        plants.forEach(System.out::println);
        System.out.println("-----");

        System.out.println("Printing noteBook sorted manier: ");
        plants.sort(Comparator.naturalOrder());
        animals.sort(Comparator.naturalOrder());
        plants.forEach(s -> System.out.println(s));
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println("-----");

    }

    public void sortAnimalsByName() {
        System.out.println("Sorting Animals by name :");
        animals.sort(Comparator.comparing(Animal::getName));
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void sortPlantsByName() {
        System.out.println("Sorting PlantByName :");
        plants.sort(Comparator.comparing(Plant::getName));
        for (Plant p : plants) {
            System.out.println(p);
        }
            System.out.println("Printing animals:");
            printAnimals(animals);
        }
        public static void printAnimals(List<Animal>animals){
            for (Animal animal:animals) {
                System.out.println(animal.getClass());
                System.out.println("AnimalName:" + animal.getName());
                System.out.println("AnimalHeight:" + animal.getHeight());
                System.out.println("AnimalWeight:" + animal.getWeight());
                System.out.println("AnimalLength:" + animal.getLength());
                if (animal instanceof Herbivore) {
                    System.out.println("Set<Plant>plantDiet:" + ((Herbivore) animal).getPlantDiet());
                } else if (animal instanceof Omnivore) {
                    System.out.println("Set<Plant>plantDiet:" + ((Omnivore) animal).getPlantDiet());
                    System.out.println("MaxFoodSize:" + ((Omnivore) animal).getMaxFoodSize());

                } else if (animal instanceof Carnivore) {
                    System.out.println("MaxFoodSize:" + ((Carnivore) animal).getMaxFoodSize());

                }
            }

        }

    public void sortAnimalsByHeight() {
        System.out.println("Sorting AnimalsHeight :");
        animals.stream().sorted(Comparator.comparing(Animal::getHeight)).forEach(System.out::println);

    }

    public void sortPlantsByHeight() {
        System.out.println("Sorting plants by height:");
        plants.stream().sorted(Comparator.comparing(Plant::getHeight)).forEach(System.out::println);
        System.out.println("--------");

        System.out.println("Printing planten---");
        printPlants(plants);
    }

    public static void printPlants(List<Plant> plants) {
        for (Plant plant : plants) {
            System.out.println(plant.getClass());
            System.out.println("PlantName:" + plant.getName());
            System.out.println("PlantHeight:" + plant.getHeight());
            if (plant instanceof Bush) {
                System.out.println("Fruit:" + ((Bush) plant).getFruit());
                System.out.println("LeafType:" + ((Bush) plant).getLeafType());

            } else if (plant instanceof Tree) {
                System.out.println("LeafType:" + ((Tree) plant).getLeafType());

            } else if (plant instanceof Flower) {
                System.out.println("Smell:" + ((Flower) plant).getSmell());
            } else if (plant instanceof Weed) {
                System.out.println("Area :" + ((Weed) plant).getArea());
            }
        }
    }


    @Override
    public int hashCode() {
        return Objects.hash(carnivores, omnivores, herbivores, animals, plants);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForestNoteBook that = (ForestNoteBook) o;
        return Objects.equals(carnivores, that.carnivores) && Objects.equals(omnivores, that.omnivores) &&
                Objects.equals(herbivores, that.herbivores) && Objects.equals(animals,
                that.animals) && Objects.equals(plants, that.plants);
    }


}




