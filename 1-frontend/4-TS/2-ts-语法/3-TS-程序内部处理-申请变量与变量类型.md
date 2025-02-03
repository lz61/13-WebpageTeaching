牢记: 依然是"创初读修".

1.如何创建变量(创)

TS:可以在申请变量时指定变量类型.

事实上,每个变量在TS中被申请时,都会获得一个类型.

实例:

```ts
var x : number;
var y : string;
var x ; // 最好不要这样写,虽然可以通过语法检查,但x的类型隐式为any,即任意类型的值,不好规范语法,写到后面自己都不知道x是什么类型的变量
```

与js的区别:

```
js代码:
var x ;
ts代码:
var x : number ;
仅仅多加了[:变量类型]的内容.
```



语法:

```
var [varName] : [varType] ;
```

题目1:

申请两个变量,分别为number和string类型.



注1: 又称varName为变量名,varType为变量类型.

注2: 在ts中number和Number有区别,string和String也有区别.(注意首字母大小写.)

注3: 一个变量在ts中可以有多种类型,如下:

```
var x: number | string; // x既可以是number也可以是string.
```

此时的语法为:

```
var [varName] : [varType1] | [varType2] | ...;
```

目前请只用小写字母开头的变量类型来申请变量,即使用string,number而非String,Number申请变量.

之后会解释原因.



2.变量初始化

```
var x:number;
x=1; // 即赋值
console.log(x);
```

注意区分: 变量的声明和赋值的区别.



3.在申请的同时给变量赋值

```
var x:number = 1;
console.log(x);
// 事实上也可以:
var x = 1; // x隐式具有number类型
var y = "123"; // y隐式具有string类型
```



3.题目1.

以下为不可以的写法:

```
var x = 1;
x="123"; 
```

请解释原因?

答案: x已经是number类型的变量了,不支持赋值"123"给其.

总结:

赋值语句的区别:

JS常见写法:

```
var x = 1;
x="123"; // 没问题
```

TS常见错误:

```
var x = 1;
x="123"; // 错误,因为x已默认成为了number类型变量,不能给number类型变量赋string类型值.
```



4.ts变量名的命名条件

同js.



5.ts变量的内置类型,也称基本类型.(所有的varType)

A. number类型

即js中的整数和浮点数.

B. string类型

即js中的string类型.

复习: 可以用单引号、双引号或反引号来定义字符串.

```
var x:string = 'hello';
var y:string = "world";
var z:string = `123`;
```

C. boolean类型(bool)类型:

```
var x: boolean = true;
var y: boolean = false;
```

D. undefined: 已声明但未赋值变量

```
var x; // x此时是undefined
```

E. null: 空对象,即什么都没有.

因为null类型的变量只能被申请为null的值,所以以下三句话等价.

```
var x:null = null;
var x = null;
var x:null;
```



F.区分: null类型和undefined类型?

```
null类型: 用户手动设置其为null,是"故意的".
undefined类型: 用户"犯错了",才会出来undefined值,是"不小心".
```

G.题目2.

申请两个变量,一个值为null,一个为undefined,并输出.

答案:

```
var x = null;
var y;
console.log(x);
console.log(y);
```



H. any: 任意类型,事实上与js的默认var类型一致.



6.ts变量: 强制类型转换.

事实上,大部分编程语言都是使用强制类型转换函数转换变量的.

在ts中,强制类型转换函数比js中的常用得多.

在做题时很常用.

A. Number(): 强制将类型转换为数字.

```
var x= "123";
var y = Number(x); // y=123;
```

B. String(): 强制将原类型转换为String.

```
var x = 123;
var y = String(x); // y="123";
```

注1:注意强制类型转换函数的首字母,必须大写.

```
Number() -> ok的强制类型转换函数
number() -> not ok的强制类型转换函数
```

