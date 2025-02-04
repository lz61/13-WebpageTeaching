function multipleReturnValue(){
    return 1,2;
}

var a,b;
(a,b)=multipleReturnValue();
console.log("a=",a);
console.log("b=",b)