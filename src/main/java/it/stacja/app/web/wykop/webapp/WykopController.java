package it.stacja.app.web.wykop.webapp;

import it.stacja.app.web.wykop.app.WykopService;
import it.stacja.app.web.wykop.domain.Wykop;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/wykop") // przekazujemy tutaj fragment sciezki na ktory kontroler ma zareagowac
public class WykopController {

    private WykopService wykopService;

    public WykopController(WykopService wykopService) {
        this.wykopService = wykopService;
    }

    @GetMapping("/main")
    public void main() // skoro metoda nic nie zwraca to przekieruje zadanie do template w resoureces main.html
    {

    }
    @PostMapping("/add")
    public String add(CreateWykopRequest request){
        wykopService.createWykop(request);
        return "redirect:list"; // zamyka to nam bledne kolo powrotu do tego samego formularza
    }

    @GetMapping("/list")
    public void list(Map pageMap)
    {
        List<Wykop> list = wykopService.selectAll();
        pageMap.put("list", list);
    }
}
