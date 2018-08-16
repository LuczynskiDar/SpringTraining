package it.stacja.app.web.wykop.app;

import it.stacja.app.web.wykop.domain.Wykop;
import it.stacja.app.web.wykop.infrastructure.WykopRepository;
import it.stacja.app.web.wykop.webapp.CreateWykopRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultWykopServiceImpl implements WykopService {



    private WykopFactory wykopFactory;
    private WykopRepository wykopRepository;

    // @Autowired - nie dobry sposob na wstrzykiwanie zaleznosci, bo klasa jest prywatna i utrudnia testowanie

    public DefaultWykopServiceImpl(WykopFactory wykopFactory, WykopRepository wykopRepository) {
        this.wykopFactory = wykopFactory;
        this.wykopRepository = wykopRepository;
    }

    @Autowired // lepszy sposob na wstrzykiwanie zaleznosci bo przez setera
    public void setWykopFactory(WykopFactory wykopFactory) {
        this.wykopFactory = wykopFactory;
    }

    @Override
    public void createWykop(CreateWykopRequest request) {
        this.wykopFactory.createWykop(request);
    }

    @Override
    public List<Wykop> selectAll() {
        return wykopRepository.findAll();
    }
}
