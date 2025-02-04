1.对象类型(很常用的一种数据结构)

研究对象类型变量的方法: "创初读修"

创:

```
var x = new Object();
```

初:

```
x={}; // 空对象
x={name:'鸡汤来咯',age:-1,weight:200}; 
```

初始化语法:

```
x={
	[属性名1]:[属性值1],
	[属性名2]:[属性值2],
	[属性名3]:[属性值3],
	...
}
```

事实上,存储的是键值对.

其中每个属性名被称作键,而属性值被称作值.

创+初:

```
var x = {name: "鸡汤来咯"};
```

2.真题1

创建一个表示水果的对象`fruit`,包含属性 `name` 为 "Banana"，`color` 为 "Yellow"并输出.

答案:

```
var fruit = {
	name : "Banana",
	color : "Yellow",
}
console.log(fruit);
```



读:

1.读取单个元素

访问方式类似类:

```
x.name; // 返回"鸡汤来咯"
```

2.读取x中所有内容

```
console.log(x); // 输出x中所有内容
```

真题2.

**题目描述**：有一个对象 `person`，其内容为 `{ "name": "Tom", "age": 25 }`，请输出这个对象里 `name` 属性的值。



修:

```
x.name="王大队长";
```

真题3.

**题目描述**：有一个对象 `car`，其内容为 `{ "brand": "Ford", "model": "Focus" }`，将 `model` 属性的值修改为 "Mustang"。



2.习题1:对象属性的修改,添加与计算

题目描述

创建一个名为 `student` 的对象，该对象初始有两个属性：`name`（字符串类型，表示学生姓名）和 `scores`（数组类型，表示学生的各科成绩）。各自的值分别为:

```
student={
	name : "初音未来",
	scores : [1,2,3,4,5],
}
```

然后编写一个函数 `calculateAverageScore`，该函数接受上面定义的 `student` 对象作为参数，计算该学生的平均成绩，并将平均成绩作为新属性 `averageScore` 添加到 `student` 对象中，最后返回更新后的 `student` 对象。

请尽可能使用自定义学生对象进行测试.





答案:

```
var student = {
    name: "初音未来",
    scores: [1, 2, 3, 4, 5],
}

function calculateAverageScore(student): any {
    var sum = 0;
    for (var i = 0; i < student.scores.length; i++) {
        sum += student.scores[i];
    }
    var averageScore = sum / student.scores.length;
    student.averageScore = averageScore;
    return student
}

student = calculateAverageScore(student);

// 输出一个对象中的所有内容
console.log(student);
```




