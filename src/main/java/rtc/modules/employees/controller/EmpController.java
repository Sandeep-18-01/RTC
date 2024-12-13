package rtc.modules.employees.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class EmpController {

    @Value("${API}")
    private String hello;

    @GetMapping(path ="/start")
    public ResponseEntity<String> getHello(){
        System.out.println("Sandeep");
        return ResponseEntity.ok().body("this is Just a Start "+hello);
    }

    @RequestMapping(value = "1")
    public String getStart(){
        return "sandy";
    }

    @RequestMapping(path = "2")
    public String getEnd(){
        return "lets end this";
    }

    @GetMapping(path ="3")
    public ResponseEntity<String> getHi(){
        System.out.println("sai");
        return ResponseEntity.ok().body(" to be honest "+hello);
    }
    
}
