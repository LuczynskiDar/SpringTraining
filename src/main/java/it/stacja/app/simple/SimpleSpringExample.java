package it.stacja.app.simple;

import it.stacja.app.factory.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleSpringExample {


    public static void main(String[] args) {

        // mozna inicjalozwac za pomoca xml nie tylko adnotacjj
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Car car = ctx.getBean(Car.class);

        //System.out.println(car);

        // przyklad postfix car.sout <---  bedzie wtedy println, postfix templates

        StringService service = ctx.getBean(StringService.class);

        // zamieni text na lower lub upper
        // mamy 3 konfiguracje: lower, upper and default. W zaleznosci co wybierzemy zmiennych srodowiskowych to dziala
        String text = "Jakis Tekst";
        System.out.println(service.processString(text));

    }

}
