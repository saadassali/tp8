package ma.cigma.pfe;

import ma.cigma.pfe.controller.FactureController;
import ma.cigma.pfe.models.Facture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class ApplicationRunner {
    public static void main(String[] args) {
        System.out.println("hello world");
        ApplicationContext context= new
                ClassPathXmlApplicationContext("spring.xml");
        FactureController fctrl = (FactureController)
                context.getBean("controller");
        Facture f = new Facture(new Date(),20.05);
        fctrl.save(f);
        System.out.println("end");
    }
}
