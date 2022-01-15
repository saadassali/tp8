package ma.cigma.pfe;

import ma.cigma.pfe.controller.FactureController;
import ma.cigma.pfe.models.Facture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context= new
                ClassPathXmlApplicationContext("spring.xml");
        FactureController fctrl = (FactureController)
                context.getBean("idCtrl");
        Facture f = new Facture(new Date(),20.05);
        fctrl.save(f);
    }
}
