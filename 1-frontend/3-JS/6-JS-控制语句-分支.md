1.编写一个程序,实现符号函数:

当用户输入正数时输出1.否则什么也不输出.

实例代码段:

```
var x;
x=prompt("判断x是否为正数");
if(x>0){
	console.log("1");
}
```



2.if语句的基本形式:

```
if(条件判断){
	执行语句; // 可以没有分号
}
```

实例:

```
if(x>0){
	printf("x不是一个负数\n");
	printf("x是一个正数");
}
```

注1: 如果if内只嵌套一个语句,可以不写花括号.

```
// 正确的
if(x>0)
	console.log("x是正数");

// 如果是两个语句:
if(x>0)
	console.log("x是正数");
	x--; // x--会被默认执行
```

3.else: 如果if语句内的内容不成立,则默认执行else中的代码.

if+else:

```
if(x>0){
	console.log("x是一个正数");
}
else{
	console.log("x不是正数");
}
```

4.if+else if:

```
if(x>0){
	console.log("x是一个正数");
}
// 注意: 是两个等号而非一个等号
else if(x==0){
	console.log("x=0");
}
```

5.题目1.

```
var a=12,b=-34,c=56,min=0;
min=a;
if(min>b){
	min=b;
}
if(min>c){
	min=c;
}
console.log(min);
```

问运行结果?

答案: min=-34.

7.回顾: 运算符和表达式.

补教1: `!=`的运算符的意思.

补教2: && ! ||(见`5-JS-运算符和表达式`)

![image-20250121182100650](Pics/image-20250121182100650.png)

答案:

```
	var hour = 0;
	hour = prompt("Input hour:");
	var payment = 0;
	if(hour<=10){
		payment = 30;
	}
	else if(hour<=50){
		payment = hour * 3;
	}
	else{
		payment = 150+ (hour-50) * 2.5;
	}
	console.log(payment);
```

8.switch分支结构:(js不重要,不用学)

基本形式:

```
switch(待判断变量){
	case 常量1:
		...
		break;
	case 常量2:
		...
		break;
	...
	default:
		...
		break;
	
}
```

变量会匹配对应的常量,并执行语句直到遇到break.

9.switch语句注意点

![image-20250128091333310](Pics/image-20250128091333310.png)

10.真题.

有以下程序段,程序的运行结果是:

```
var x=1,y=0,a=0,b=0;
switch(x){
	case 1:
		a++;
		b++;
		a++;
		break;
	case 2:
		a++;
		b++;
}
```



![image-20250121182835671](Pics/image-20250121182835671.png)

11.真题2.

![image-20250121183014524](Pics/image-20250121183014524.png)

注1:百分制成绩: 默认输入整数.