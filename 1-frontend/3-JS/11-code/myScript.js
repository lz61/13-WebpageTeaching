// 申请变量
var sum = 0;
// 处理用户输入
// 没有输入,不用处理
// 内部处理逻辑
for (var i = 1; i <= 100; i++) {
    if (i % 3 == 0) {
        sum += i;
    }
}
// 输出答案
console.log("sum=", sum);