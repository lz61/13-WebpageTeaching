1.ts中的prompt:

解释:

```
返回值类型: string | null
为什么可能是null? 因为用户可能点击"取消"按钮,那么返回值会变成null.

实例:
var x:string|null = prompt("Enter a string: ");

程序功能讲解:
1.当输入x并点击确定时,会得到x为string类型.
2.当点击"取消"时,会得到x为null类型变量.
```



1.题目: 使用prompt接收用户输入(默认用户会输入值),并输出到console中.

