package sk.kosickaakademia.mysecondserver.controller;

public class JokeController {

    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.RestController;

    @GetMapping()
    @RestController

    public class JokeController{
        String joke1= "Why do we tell actors to break a leg? Because every play has a cast"


    }

    public JokeController(){
        list.add(joke1);
        list.add(joke2);
        list.add(joke3);

    }
    public ResponseEntity<String> getJokes(){

    }
}
