1.函数的定义与调用

```
function 函数名(参数列表){
	// do sth.
	return ...;
}
```

参数列表:

A.可以没有参数

B.格式:

```
参数a,参数b,参数c...
```



2.函数定义并使用的实例:

实例1:使用返回值的函数

```
function test(){
    return 1;
}

var x = test(); // x=1
// 可以看到,test()的写法和prompt("...")函数很类似.
console.log(x);
```

实例2:判断一个值是否为素数

```
function isPrime(n){
	if(n==1) return false;
	for(var i=2;i<n;i++){
		if(n%i==0)
			return true;
	}
	return true;
}
```

3.函数的调用:

```
var n=10;
if(isPrime(n)){
	console.log("n是素数");
}
else{
	console.log("n不是素数");
}
```

注: js无所谓定义调用顺序,与C不同.

4.数组与函数:等到了数组再讲.

5.(无视该内容)

![image-20250123084629790](Pics/image-20250123084629790.png)

9.真题1.

![image-20250123084641563](Pics/image-20250123084641563.png)

请重新撰写一遍,并自行测试自己定义的函数是否正确.

10.

良好的函数命名方式:

驼峰命名法

函数、变量名一般使用小驼峰命名法.

11.函数是否能改变传入的值?(不要乱动传入的值,目前学过的数据类型中,默认是函数不能改变传入的值).

以后会介绍函数到底能不能改变传入的值.

答案: JS函数不能改变传入的值.

测试代码:

```
function tryToChangeXButFailed(x){
    x=2;
}

var x = 1;
tryToChangeXButFailed(x);
console.log(x); // 事实上还是输出1
```

注: 原理之后会解释,不过请不要尝试在js的函数中改变变量的值.