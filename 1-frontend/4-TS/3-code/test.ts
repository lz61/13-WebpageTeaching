// 输入:
// 1.2 7 5 1.8 1.6 0.8 4 1.0 6 2.2
// 代码:

// 1.申请变量
var sum = 0, average = 0, a = [1.2, 7, 5, 1.8, 1.6, 0.8, 4, 1.0, 6, 2.2];

// 2.处理用户输入: 不用处理

// 3.程序内部逻辑
for (var i = 0; i < 10; i++) {
    sum += a[i];
}
average = sum / 10;
var lessThanAverage = new Array(10);
// index用于记录小于平均值的元素在数组lessThanAverage中的最大下标,index=最大下标+1
var index = 0;
for (var i = 0; i < 10; i++) {
    if (a[i] < average) {
        // 注意:i和index不要写反
        lessThanAverage[index] = a[i];
        index++;
    }
}

// 4.输出答案
// index为实际有效的最大下标+1
// 输出平均值
console.log("average is %f\n", average);
// 输出小于平均值的元素
for (var i = 0; i < index; i++) {
    console.log("Element is %f\n", lessThanAverage[i]);
}