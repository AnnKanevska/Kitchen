package combine;

import plant.Plant;

public interface Cutter {
	
    double cut(Plant plant);

    double cutAll(Plant[] plants);
}

