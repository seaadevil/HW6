package auto;


import auto.model.Auto;
import auto.repo.AutoRepo;
import auto.service.AutoService;
import auto.service.AutoServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.List;

public class AutoManager {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sp.xml");
        AutoService autoService = context.getBean("autoService", AutoService.class);
        // AutoRepo autoRepo = context.getBean("autoRepo", AutoRepo.class);

        System.out.println(autoService);
        // System.out.println(autoRepo);

        List<Auto> allAuto = autoService.getAllAutos();
        for (Auto auto : allAuto) {
            System.out.println(auto);
        }
    }
}
