package combine;

import plant.Plant;

interface Slicer {
   
    double slice(Plant plant);
    
    double sliceAll(Plant[] plants);
}

