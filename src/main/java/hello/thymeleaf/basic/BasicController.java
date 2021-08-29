package hello.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic")
public class BasicController {
    @GetMapping("/text-basic")
    public String textBasic(Model model) {
        // HTML 엔티티를 표현하기 위해서는 이스케이프 처리를 주의해야 한다.
        // HTML에서 사용하는 특정문자를 HTML 엔티티로 변경하는 것을 이스케이프라 한다.
        // "<"을 태크의 시작이 아닌 문자로 표현하도록 한다.
        model.addAttribute("data", "Hello <b>Spring1</b>");
        return "basic/text-basic";
    }

    @GetMapping("/text-unescaped")
    public String textUnescaped(Model model) {
        model.addAttribute("data", "Hello <b>Spring1</b>");
        return "basic/text-unescaped";
    }
}
