function getNum(input) {
    var x = new Array(3);
    x[2] = input % 10; // 个位数
    x[1] = ((input - x[2]) / 10) % 10;
    x[0] = (input - x[1] * 10 - x[2]) / 100;//百位数
    return x;
}

// getNum之前定义过了

function outputNum() {
    // 输出所有的答案
    for (var i = 100; i <= 999; i++) {
        // 调用getNum
        var x = getNum(i);
        if ((x[0] * x[0] * x[0] + x[1] * x[1] * x[1] + x[2] * x[2] * x[2]) == i) {
            console.log(i);
        }
    }
}

outputNum();