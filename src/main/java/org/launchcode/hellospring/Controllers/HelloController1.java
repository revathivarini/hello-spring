package org.launchcode.hellospring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController1 {
    @ResponseBody
    @PostMapping("helloForm")
    public String helloQueryParam(@RequestParam String name){
        return "Bonjour "+ name;
    }


    @GetMapping("helloForm")
    @ResponseBody
    public String GreetingForm(){
        String html = "<html>" +
                "<body>" +
                "<form action ='Bonjour' method='post'>" +
                "<input type='text' name='coder' />" +
                "<select name='languages' id='language-select'>" +
                "<option value=''>French</option>" +
                "<option value='english'>English</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='german'>German</option>" +
                "</select>" +
                "<input type='submit' value='Greet me!' />" +
                "</form>" +
                "</body>" +
                "</html>";
        return html;
    }


}
