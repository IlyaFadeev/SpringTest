package test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Fadeev on 07.04.2016.
 */

@Controller
public class MainController {
    private PersonService personService;


    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public String getPersons(Model model){
        personService = new PersonService();
        List<EMP> emps = personService.getAll();

        model.addAttribute("persons", emps);

        return "index";
    }

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String getPerson(Model model, @RequestParam(value="id", required=true) Integer id){
        personService = new PersonService();
        EMP emp = personService.getEMP(id);

        model.addAttribute("person", emp);

        return "person";
    }

}
