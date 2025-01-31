1.JS简介

简述JS: 如果说html作为页面的**骨架**,css是修饰页面的**装饰**,那么js就是真正能让页面"响应"用户的输入和动态输出内容的"编程语言".

2.JS实例

实例作用:向控制台输出内容.

```
<html>
    <head>
        <script>
			console.log("JS Hello World!");
        </script>
    </head>
    <body></body>
</html>
```

注1: 打开控制台的方式: F~12~ or Fn+F~12~(视FnLock而定)

3.JS代码的三种放置方式(与html中的css代码类似):

三种方式: body-js,head-js,外部js(推荐后两种).

A. body-js: 写在本文件的body里面的js代码

```
<html>
    <head></head>
    <body>
        <script>
			console.log("JS Hello World!");
        </script>
    </body>
</html>
```

不推荐.

原因: 容易导致js代码与html代码混淆.

B.写在head里面.

```
<head> 
	<script>
		... 
	</script>
</head>
```

个人叫法: head-js.

C.写在html所在文件的外部文件的js代码(外联js,外部JS).

```
<head>
	<script src="myScript.js"> </script>
</head>
```

好处: 分离html与JS代码,使得代码更清晰易懂.

D.注: JS代码一定要包在

```
<script> 
... JS code 代码块
</script>
```

之中.

E.JS代码块格式:

E1.每句代码后,既可以加分号,也可以不加分号.

E2.在同一行内执行多条语句时,必须加分号.

E3.在某一行只执行一条语句时,可以不加分号.

例:

```
console.log("1"); console.log("1"); // 同一行执行多条语句,加分号->合法

console.log("1")
console.log("1") // 每一行只执行一条语句,不加分号

console.log("1") console.log("1") // 不合法
```

F.控制台清除消息:

点击禁止键即可.

G.JS如何添加注释(与C语言注释方式完全一致):

G1.单行注释: 

```
通过 "//" 添加注释
在每一行中,在//后面的内容自动无视,不管//出现在哪里.
实例:
printf("Hello World!")（有用）// ...printf("Hello World!");（无用）
```

G2.多行注释

```
通过"/* */"添加注释
/*
var x =1;
var y = 1;
*/
```

H.学习时,有如下要留心的地方:

H1.代码执行顺序

对于一段代码,它究竟是按照什么顺序执行的?

我们能知道语句A执行完之后,是什么语句B会执行嘛?

这件事非常重要.