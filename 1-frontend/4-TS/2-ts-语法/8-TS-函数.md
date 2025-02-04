1.函数的定义和调用

```
// 注意: 添加了":返回类型"
function 函数名(参数名:参数类型,参数名:参数类型):返回类型{
	// do sth
	return ...;
}
```

注1: 函数可以不返回任何值,这时候`:返回类型`的部分可以省略.

2.函数定义并使用的实例:

实例1: 返回两数之和

```
function add(a:number,b:number):number{
	return a+b;
}

console.log(add(1,2));
```



实例2(没有返回值的函数):

```
function outputHelloWorld(){
	console.log("Hello World!");
}
outputHelloWorld();
```



题目1.尝试自己手写后,编译并运行两个实例.



注1: 编译后为什么vscode会报错?

注意: 在使用vscode+ts+js的时候:

复习:

手动编译:

```
tsc test.ts
```

自动编译(一旦代码有修改,自动编译):

```
tsc test.ts --watch
```

最后获得的代码:

test.ts:

```
function add123():void{
    console.log("Hello");
}
add123();
```

test.js:

```
function add123() {
    console.log("Hello");
}
add123();
```

注1: vscode因为识别到同一个工作区下有两个同名函数,自动报错(事实上我们写的代码并没有任何错误).



3.实例3: 使用返回值的函数

```
// 错误写法: 没有声明返回值
// 不是错误写法!
// 对于没有声明返回值的函数,不可以写return ...
function test(){
	return 1;
}

// 正确写法:
function test():number{
	return 1;
}

var x = test();
```



4.请撰写一个函数,判断一个值: 是否为素数

答案:

```
function isPrime(n):boolean{
	if(n==1) return false;
	for(var i=2;i<n;i++){
		if(n%i==0)
			return false;
	}
	return true;
}
```



5.函数调用同JS.



6.真题1.

![image-20250130152602812](Pics/image-20250130152602812.png)

请重新撰写一遍函数,并自行测试自己定义的函数是否正确.



7.真题2.

撰写一个函数,名字为:getNum,输出:

```
101-110内所有的素数.
```

目标: 只要调用该函数,就能输出101-110内所有的素数.



8.TS函数目前也不能改变传入的值.

只能改变引用类型的值,如数组,对象等.





4.题目3

撰写一个函数,

输入(函数的参数): 一个三位数

输出(函数的返回值): 其百位数，十位数，个位数,放到数组中输出

示例:

输入: 123

输出: 数组x,其中:

```
x[0]=1
x[1]=2
x[2]=3
```

提示: 使用%和/

答案:

```
function getNum(input){
	var x = new Array(3);
	x[2]=input%10; // 个位数
	x[1]=((x-x[2])/10)%10;
	x[0]= (x-x[1]*10-x[2])/100;//百位数
	return x;
}

getNum(123);
```



5.题目4(如果题目2做出来了就不用做):

```
找出所有100-999内的数,它们满足:
百位数的三次方+十位数的三次方+个位数的三次方=它自己.
例:
153: 1的三次方+5的三次方+3的三次方=1+125+27=153=他自己.
154则不满足要求.
```

答案:

```
// getNum之前定义过了

function outputNum(){
	// 输出所有的答案
	for(var i=100;i<=999;i++){
		// 调用getNum
		var x = getNum(i);
		if((x[0]*x[0]*x[0]+x[1]*x[1]*x[1]+x[2]*x[2]*x[2]) == i){
			console.log(i);
		}
	}
}

outputNum();
```



6.题目5(可以暂时不做,等学完数组和函数之后再做)

```
打印素数.
要求:
打印100-110之间的所有素数.
```

提示:

```
// 申请变量
// 处理用户输入
// 程序内部处理
// 输出答案
```



