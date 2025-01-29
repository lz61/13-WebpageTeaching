var x= {1,2,3,4,5};
var sum = 0;
for (var i = 0; i < 1; i++) {
    s = "输入第" + (i+1) + "个数的值";
    x[i] = prompt(s);
    console.log(typeof(x[i]));
}
for (var i = 0; i < 1; i++) {
    sum = sum + x[i];
}
console.log("sum=", sum);