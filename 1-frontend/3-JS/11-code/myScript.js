class Person{
    name;
    gender;
    constructor(){
        this.name = "John";
        this.gender="male";
    }

    testOutput(){
        console.log("Test output");
    }
}

var p = new Person();
p.testOutput();
