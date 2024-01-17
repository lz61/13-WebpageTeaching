public class Dog {
    String breed;
    int size;
    String colour;
    int age;
    String name;

    void eat(){

    }

    void run(){

    }

    void sleep(){

    }

    void name(){

    }

    void showName(){
        System.out.println("name is "+name);
    }

    void showAge(){
        System.out.println("age is "+age);
    }

    // constructor: 创建新的对象的时候, 会调用构造方法
    public Dog(String dogName,int age){
        this.name=dogName;
        this.age=age;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("小黑",2);
        dog.showName();
        dog.showAge();
        // dog.showName();
        // Dog dog2 = new Dog("小白");
        // dog2.showName();
    }
}

// OOP: Object Oriented Programming(面向对象编程)
