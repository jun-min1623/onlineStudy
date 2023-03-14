import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.TimeZone;


@RestController
public class simpleController {
    @RequestMapping("/sample")
    public String sample(){
        return "Sample succes for docker";
    }
}
