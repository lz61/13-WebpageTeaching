1.记得先学会js!

A.如果没有学会js,推荐先学习我的js教程.

B.TS与JS最重要的区别: 类型管理!



2.浏览器是如何理解ts代码的:

A. ts代码在执行时会先被转化成js代码(我们一般称这个过程为编译).

编译: 转换A语言的代码为B语言的过程为编译.

B. 浏览器读取ts代码转化成的js代码并执行.



3.学习: 如何将ts代码编译成js代码:

A.假设有:

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



B.语法总结:

tsc: ts+c(compile)

通用命令:

```
tsc [fileName].ts
```

生成:

```
[fileName].js
```

文件.

4.ts动态编译(实时编译):

```
tsc --watch test.ts
或者
tsc test.ts --watch
```

即可实时编译test.ts.

实时编译的定义: 一旦test.ts中的内容有所更改,立刻重新编译test.ts,重新将test.ts中的内容变成新的test.js的内容.

5.联动尝试:

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

