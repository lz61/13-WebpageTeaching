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
function test(){
	console.log("Hello World!");
}
test();
```



尝试编译并运行两个实例.



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

只能改变引用类型引用的值.



