package org.launchcode.hellospring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("hello")
public class HelloController {

//    @GetMapping("hello")
//    @ResponseBody
//    public String Hello(){
//        return "Hello, Spring!";
//    }
    //lives /hello/goodbye
    @GetMapping("Good-bye")
    public String goodBye(){
        return "Good-bye, Spring!";
    }

    @PostMapping("goodbye")
    public String welcome(){
        return "Good Morning!";
    }

    //responds to get and post requests at "/hellogoodbye"
    @RequestMapping(value="hellogoodbye",method = {RequestMethod.GET, RequestMethod.POST})
    public String hello_goodbye(){
        return "Hello, Goodbye";
    }

    //Handles request of the form /hello?name=Launchcode
    //@GetMapping("hello")
    //live /hello/hello
    @RequestMapping(value = "hello", method= {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name, Model model){
        String newGreeting = "Hello,"+ name +"!";
        model.addAttribute("greeting", newGreeting);
        return "hello";
    }

    //Handles requests of the form /hello/Launchcode
    @GetMapping("{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name){
        return "Hello, "+ name + "!";
    }


    @GetMapping("form")
    public String helloForm(){
        return "form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names", names);
        return "hello-list";
    }

    @GetMapping("integers")
    public String numbers(Model model){
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(18);
        num.add(20);
        num.add(-10);
        model.addAttribute("numbers", num);
        return "number-list";
    }



}
