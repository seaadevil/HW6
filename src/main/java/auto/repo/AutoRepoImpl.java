package auto.repo;

import auto.model.Auto;

import java.util.Arrays;
import java.util.List;



public class AutoRepoImpl  implements AutoRepo{
    public List<Auto> getAllAutos() {
        return  Arrays.asList(
                new Auto("Toyota-Corolla", 1992),
                new Auto("Mitsubishi-Galant", 1988),
                new Auto("Nissan-350Z", 1995),
                new Auto("Shevrolet-Impala", 1966),
                new Auto("Ford-Mustang", 1960)
        );
    }


}
