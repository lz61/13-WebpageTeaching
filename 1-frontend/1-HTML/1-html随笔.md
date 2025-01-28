1.html:

my-first-html:

```
<html>
	<head> </head>
	<body>
		<h1>我的第一个标题</h1>
		<p>我的第一个段落</p>
	<body>
</html>
```

2.解释:

https://www.runoob.com/html/html-tutorial.html

3.html文件基本格式:

```
<html>
	<head> </head>
	<body> </body>
</html>
```

4.html元素对:

```
<x> ... </x>
```

5.在html中添加多行注释:

```
<!-- 注释内容 -->
```

vscode快速添加注释: Ctrl+/

6.html元素属性:

实例:

```
<a href="http://www.bing.com">跳转到bing.com</a>
```

注意不能是

```
www.bing.com,会报错.
```

得是:

```
http://www.bing.com
```



属性语法:

```
name="value"
属性名="属性值"
# 实例: 
href = "http://www.bing.com"
title = "hint"
```

属性塞入html元素的方法:

```
<x 属性1 属性2 ...> ... </x>
实例:
<a href="http://www.bing.com" title="hint">跳转到bing.com</a>
```

7.撰写网页时常用的属性:

```
<p title="hint"> </p> // 在鼠标悬停时显示双引号中的内容,即hint
```

作用: 该元素在鼠标移动到其上面时会显示hint.

属性Reference: https://www.runoob.com/html/html-attributes.html

9.html**元素**和**标签**名: 定义划分

标签名:

```
<x> ... </x>
```

中的x.

例如,p和h1都是标签名.

元素:

```
<x> ... </x>
```

整体是一个元素.

例如:

```
<p> Hello World!</p>
```

是一个元素.

10.常用html元素:

A.

```
<br>
```

作用: 换行

B.

