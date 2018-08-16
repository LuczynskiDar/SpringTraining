package it.stacja.app.factory.model;

import it.stacja.app.factory.context.Component;
import it.stacja.app.factory.context.Prototype;
import jdk.nashorn.api.tree.Tree;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Component
@Prototype
// Andotacje do pakietu simple
@org.springframework.stereotype.Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Wheel {

    private Tire tire;
    public Wheel(Tire tire) {
        this.tire = tire;
    }


}
