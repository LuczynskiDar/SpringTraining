package it.stacja.app.web.wykop.infrastructure;

import it.stacja.app.web.wykop.domain.Wykop;

import java.util.ArrayList;
import java.util.List;

//@Component // komenty tu i ponizej bo jpa
public class InternalWykopRepositoryImpl {
//implements WykopRepository {

    private List<Wykop> list = new ArrayList<>();

   // @Override
    public void save(Wykop wykop) {
        list.add(wykop);
    }

   // @Override
    public List<Wykop> findAll() {
        return new ArrayList(list);
    }


}
