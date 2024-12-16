package rtc.modules.employees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;
import rtc.common.configuration.AppConfiguration;


@RestController
@RequestMapping("/api")
public class EmpController {

    @Value("${API}")
    private String hello;

    private WebClient.Builder web;
    private AppConfiguration a;

    @Autowired
    public EmpController(WebClient.Builder w,AppConfiguration appConfiguration){
       web=w;
       a=appConfiguration;
    }


    @GetMapping(path ="/web")
    public Mono<String> checkWebClient1(String url){
      
        return web.baseUrl("https://dummyjson.com/products").build().get().retrieve().bodyToMono(String.class);
    }


    @GetMapping(path ="/web1")
    public Mono<String> checkWebClient(@RequestParam String url){
        WebClient k=a.getWebClientInstance();
        return k.get().uri(url).retrieve().bodyToMono(String.class);
    }




    @GetMapping(path ="/start")
    public ResponseEntity<String> getHello(){
        
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
