1.JS代码格式定义:

JS代码有点像C,又有点像python.

2.JS输出内容:

常用的两种方式:

```
alert("你想输出的内容");
console.log("你想输出的内容");
```

一般使用console.log.

实例:

```
<html>
	<head>
		<script>
		alert("我是傻瓜!哈哈哈哈");
		console.log("看到这条消息,不转不是中国人");
		</script>
	</head>
	<body>
	</body>
</html>
```

提问: 这是哪种JS?

body-JS? head-JS? 外部JS?

答案: 因为是在head里的JS,所以是head-JS.

3.以下使用console.log输出值,并在head-JS里面实现JS代码.

4.输出多个参数:(先讲变量类型,再讲如何输出多个参数)

一般来说,我们只对相同数据类型的变量进行多次输出.

输出的多个变量之间用一个空格隔开.

```
console.log("1","2"); // 输出"1 2"
console.log(1.1,1);  // 输出: "1.1 1"
```

console支持同时输出多个变量类型的变量,但有时会导致奇怪的后果.

一般用法:

```
console.log("x=",x);
```

5.JS结合逗号与占位符

```
// 例2: console.log结合逗号与占位符
console.log("%d",1); // 输出1
```

6.console.log多个参数(使用占位符)

```
// 例3: console.log多个参数
console.log("%d %d",1,2); // 输出"1 2"(不包含双引号)
```

