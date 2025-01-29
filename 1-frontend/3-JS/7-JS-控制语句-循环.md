1.2种基本循环结构:

while,for循环

2.要求: 输出10个1

使用循环写,会比较便捷.

已知写法:

```
console.log("1");
console.log("1");
console.log("1");
console.log("1");
console.log("1");
console.log("1");
console.log("1");
console.log("1");
console.log("1");
console.log("1");
```



2.while循环

```
while(expression){
	// do sth.
}

//
var i=1;
while(i<=10){
	console.log("1");
	i++;
}
```

3.for循环

```
for(declaration;judgment;do sth.){
	// do sth.
}

// example(循环执行10次):
for(var i=0;i<10;i++){
	// do sth.
}

// 等价于:
var i=0;
while(i<10){
	// do sth.
	i++;
}

// 好用的for循环:
// 循环执行n次
for(var i=0;i<n;i++){
	// 遍历: 0-(n-1)的下标
}
```

5.break和continue语句:

break: 立即退出循环

事实上,break的作用是跳出当前的{}.(结合switch-case语句)

continue: 无视本次循环的剩余语句,立即进入下一次循环.



6.实例: break和continue

```
for(var i=0;i<10;i++){
	if(i==3)
		break;
	console.log(i);
}
// 输出: 0,1,2


for(var i=0;i<10;i++){
	if(i==3)
		continue;
	console.log("The value of i is %d\n",i);
}

// 输出: 0,1,2,4,5,6,7,8,9
```

7.真题1

![image-20250123075824219](Pics/image-20250123075824219.png)

答案: D

8.真题2

```
对如下程序段的描述,正确的是:
x=-1;
while(x<0){
	x=x*x;
}
A.是死循环
B.循环执行一次
C.循环执行两次
D.有语法错误
```

B

9.总结程序套路

```
// 1.申请变量
var 变量名;
// 2.处理用户输入
变量名 = prompt("输入你的话");
// 3.内部逻辑处理
处理变量值
// 4.输出答案
console.log("你想说的话");
```



10.真题3

求解: sum=1+2+3...+n,用户会从键盘输入n.

```
// 申请变量
var n=0,sum=0;

// 读取用户输入
n=prompt("请输入n");

// 内部处理逻辑
for(var i=0;i<n;i++){
	sum+=(i+1);
}

// 输出sum
console.log("sum=",sum);
```

10.真题4

![image-20250123082241272](Pics/image-20250123082241272.png)

```
// 申请变量
var sum=0;
// 处理用户输入
// 没有输入,不用处理
// 内部处理逻辑
for(var i=1;i<=100;i++){
	if(i%3==0){
		sum+=i;
	}	
}
// 输出答案
console.log("sum=",sum);
```

11.真题5(暂时不做,等学完数组和函数之后再做)

![image-20250123082552386](Pics/image-20250123082552386.png)

```
// 申请变量
// 处理用户输入
// 程序内部处理
// 输出答案
```

