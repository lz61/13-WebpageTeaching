1.记得先学会js!

如果没有学会js,推荐先学习我的js教程.

TS与JS最重要的区别: 类型管理!



2.浏览器是如何理解ts代码的:

A. ts代码在执行时会先被转化成js代码(我们一般称这个过程为编译),即转换A语言的代码为B语言的过程为编译.

B. 浏览器读取ts代码转化成的js代码并执行.



3.学习: 如何将ts代码编译成js代码:

假设有:

test.ts

```
console.log("1");
```

将其编译成

test.js代码的命令为:

```
tsc test.ts
```

效果: 在同名目录下将生成test.js.

4.ts动态编译:

```
tsc --watch test.ts
```

即可实时编译test.ts.

实时编译: 一旦test.ts中的内容有所更改,立刻就会重新将test.ts中的内容变成新的test.js的内容.

4.联动:

html代码:

```
<html>
    <head>
        <script src="test.js">
        </script>
    </head>
    <body>
        
    </body>
</html>
```

ts代码:

```
console.log("1");
```

自动编译成的js代码:

```
// 自动编译成的js代码
console.log("1");
```

