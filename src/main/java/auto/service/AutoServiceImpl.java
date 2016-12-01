package auto.service;


import auto.model.Auto;
import auto.repo.AutoRepo;

import java.util.List;

public class AutoServiceImpl implements AutoService{
    private AutoRepo autoRepo;

    public AutoServiceImpl() {
    }

    public AutoServiceImpl(AutoRepo autoRepo) {
        this.autoRepo = autoRepo;
    }

    public List<Auto> getAllAutos() {
        return autoRepo.getAllAutos();
    }

    public AutoRepo getAutoRepo() {
        return autoRepo;
    }

    public void setAutoRepo(AutoRepo autoRepo) {
        this.autoRepo = autoRepo;
    }


}
