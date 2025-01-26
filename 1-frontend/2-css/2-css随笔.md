1.css的用处: 美化html页面.

html代码组成了页面的骨架,而css负责美化html中的内容.

2.三种css: 行内样式、内部(内嵌)样式、外部样式

3.行内css:

```
<html>
    <body style="background-color: yellow;">
        <h2 style="background-color: red;">二级标题</h2>
        <p style="background-color: green;"> 段落</p>
    </body>
</html>
```

实例:

```
<body style="background-color: yellow;"> ... </body>
<body style="background-color: yellow;color:red"> ... </body>
```

在html元素的基础上,增加了:

```
<x style="css-code"> </x>
```

4.css语法:

上一例中的css-code可以写成如下的形式:

```
{属性:值;属性:值;}的形式
最小组成单位: 属性:值;
```

5.内嵌样式:

回顾: html文件的基本格式:

```
<html>
	<head> ... </head>
	<body> ... </body>
</html>
```

css样式负责写在

```
<head> ... </head>
```

里面.

6.内嵌样式实例:

```
<html>
    <head>
        <!-- 纯CSS -->
        <style>
            h1{color:aqua;}
            p{color:blue;}
        </style>
    </head>

    <!-- 纯html -->
    <body>
        <h1>Hello Aqua</h1>
        <h1>Red</h1>
        <p>段落</p>
    </body>
</html>
```

7.普通选择器、id选择器、class选择器

8.外部样式



参考链接:

1.css教程网址: https://www.runoob.com/css/css-tutorial.html

