package com.example.restcontroller;

public class User {

    private String name;

    //Constructor that takes in an String value
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}








//        15.	Now we will create our UserController class. Right click on your package name com.example.restcontroller and click on New Java Class. Name it UserController.
//
//        16.	Add the @RestController annotation to your UserController class as well as the @RequestMapping annotation. The @RequestMapping annotation should map to the following endpoint: “api/user”
//
//        17.	Inside of your UserController class, create an instance of your User class and name it user. Pass in your own name as the argument here.
//
//        18.	Next inside of your UserController class create a public method with a return type of String and call it findName(). This method should return the result of calling your getName() method on your new user object that you created in step 17.
//
//        19.	Finally, add the @GetMapping annotation to your findName() method.
//
//        20.	Run your application using IntelliJ’s run button and go over to localhost:8080/api/user
//        You should see your name displayed on the page.
//        Congratulations. You just created a simple Web application using Spring boots @RestController.
//
//        18.	Next inside of your UserController class create a public method with a return type of String and call it findName(). This method should return the result of calling your getName() method on your new user object that you created in step 17.
//
//        19.	Finally, add the @GetMapping annotation to your findName() method.
//
//        20.	Run your application using IntelliJ’s run button and go over to localhost:8080/api/user
//        You should see your name displayed on the page.
//        Congratulations. You just created a simple Web application using Spring boots @RestController. */
