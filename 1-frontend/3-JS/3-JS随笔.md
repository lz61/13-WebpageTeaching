1.JS简介

如果说html作为页面的骨架,css是修饰页面的装饰,那么js就是真正能让页面"响应"用户的输入和动态输出内容的"编程语言".

2.JS实例:

```
<html>
    <head>
        <script>
            function displayDate() {
                document.getElementById("demo").innerHTML = Date();
            }
        </script>
    </head>

    <body>
        <button type="button" onclick="displayDate()">显示日期</button>
    </body>

</html>
```

JS代码的三种放置方式与html中的css代码类似:

A.写在body里面的js代码

B.写在

```
<head> 
	<script>
		... 
	</script>
</head>
```

里面.

C.