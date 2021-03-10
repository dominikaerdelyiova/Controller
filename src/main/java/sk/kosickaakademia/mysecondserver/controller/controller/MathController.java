package sk.kosickaakademia.mysecondserver.controller.controller;

import netscape.javascript.JSObject;

public class MathController {
    @PostMapping(path =" /add")
    public String addTwoNumbers(@RequestBody String input){

        try {
            JSObject object = (JSObject) new JSONParser().parse(input);
            int a = Integer.parseInt(String.valueOf(object.get("a")));
            int b = Integer.parseInt(String.valueof(object.get("b")));

            int result = a + b;
            System.out.println(result);

        }catch (PerseException e) {
            e.printStackTrace();

        }
        return null;

        }
    }
}
