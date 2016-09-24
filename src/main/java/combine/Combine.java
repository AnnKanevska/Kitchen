package combine;

import plant.Plant;

public class Combine implements Peeler, Cutter, Slicer {
  
    private String name;

  
    public Combine(String name) {
        this.name = name;
    }

   
    public double peelItem(Plant plant) {
        if (!plant.getPeel()) {
            plant.peel();
        }
        return plant.getWeight();
    }

   
    public double peelItems(Plant[] plants) {
        double peelWeight = 0;
        for (Plant plant:plants) {
            if (!plant.getPeel()) {
                plant.peel();
                peelWeight += plant.getWeight();
            }
        }
        return peelWeight;
    }

   
    public double cut(Plant plant) {
        if (!plant.getPeel()) {
            throw new IllegalArgumentException("Попал неочищенный фрукт/овощ!");
        }
        double cutWeight = plant.getWeight() - plant.getWeight() * 0.02;
        plant.setWeight(cutWeight);
        return cutWeight;
    }

  
    public double cutAll(Plant[] plants) {
        double cutWeight = 0;
        for (Plant plant:plants) {
            cutWeight += cut(plant);
        }
        return cutWeight;
    }

    public double slice(Plant plant) {
        if (!plant.getPeel()) {
            throw new IllegalArgumentException("Попал неочищенный фрукт/овощ!");
        }
        double sliceWeight = plant.getWeight() - plant.getWeight() * 0.02;
        plant.setWeight(sliceWeight);
        return sliceWeight;
    }

    public double sliceAll(Plant[] plants) {
        double sliceWeight = 0;
        for (Plant plant:plants) {
            sliceWeight += slice(plant);
        }
        return sliceWeight;
    }

}
