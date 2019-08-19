# spring-02-dependency-injection

The goal of this very simple application is to show that Spring instanciate the classes for us and store the beans in the context. 

For that, we get the context from the main class and ask it to give us the bean "myController". We call it's hello method to verify that "Hello" is printed out.

We can see that Spring has instanciate the controller class for us, so we don't have to do that with a "new" anywhere. 