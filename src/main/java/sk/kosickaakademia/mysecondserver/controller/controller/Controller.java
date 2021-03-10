package sk.kosickaakademia.mysecondserver.controller.controller;

import java.util.Date;

public class Controller {
    @RequestMapping(path="/hello")
    public String getHello(){
        return "<h1>Hello. How are you doing?</h1>";
    }

    @RequestMapping("/time")
    public String currentTime(){
        return new Date().toString();
    }

    @GetMapping(path = "/hello/sk")
    public String getHelloSk(){
        return "<h1>Ahoj, aky mas dnes den?</h1>";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    public String getHi(){
        return "<h2>Hi user. What are your plans for today?</h2>";
    }

    @RequestMapping(path = "/data", method = RequestMethod.POST)
    public String getHiTest(@RequestBody String text){
        return "<h2>This is a test page. Your name is: "+text;
    }
    @RequestMapping(path = "/hi/{username}")
    public String getHiWithName(@PathVariable String username){
        return "<h2>Hi "+username+". What are you up to?</h2>";
    }


}
