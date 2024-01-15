public class Dog {
    String breed;
    int size;
    String name;
    String colour;
    int age;
 
    void eat() {
    }
 
    void run() {
    }
 
    void sleep(){
    }

    void showName(){
        System.out.println("name is " + name);
    }

    void showAge(){
        System.out.println("age is " + age);
    }

    
    public Dog(String dogName,int dogAge){
        this.name = dogName;
        this.age = dogAge;
    }


    public static void main(String[] args) {
        Dog dog = new Dog("小黑",3);
        dog.showName();
        dog.showAge();
        Dog dog2 = new Dog("小白",3);
        dog2.showName();
    }



}