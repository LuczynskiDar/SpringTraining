package it.stacja.app.factory.model;

import com.google.common.collect.Lists;
import it.stacja.app.factory.context.Component;
import it.stacja.app.factory.context.Prototype;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Component
@Prototype

// Andotacje do pakietu simple
@org.springframework.stereotype.Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Car {

    private List<Wheel> wheels;

    public  Car(Wheel pp, Wheel pl, Wheel tl, Wheel tp){

        wheels = Lists.newArrayList(pp, pl,tp,tl);
    }

}
