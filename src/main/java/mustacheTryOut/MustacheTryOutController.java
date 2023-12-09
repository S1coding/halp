package mustacheTryOut;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MustacheTryOutController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/react")
    public String react() {
        return "react";
    }
}
