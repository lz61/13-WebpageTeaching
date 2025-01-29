var a = 10;
var b = (a++, a + 3, a - 3);
// 申请变量并输出: 可以与字符串拼接
console.log("b=", b);