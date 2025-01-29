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

3.JS代码的三种放置方式,与html中的css代码类似:

三种方式: body-js,head-js,外部的js.

A.写在本文件的body里面的js代码(body-js)

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
... JS code 代码块中
</script>
```

E.JS代码块格式:

每句代码块后,既可以加分号,也可以不加分号.

但是在同一行执行多条语句时,必须加分号.

在某一行只执行一条语句时,可以不加分号.

例:

```
console.log("1"); console.log("1"); // 合法

console.log("1")
console.log("1") // 合法

console.log("1") console.log("1") // 不合法
```

F.控制台清除消息:

点击禁止键即可.