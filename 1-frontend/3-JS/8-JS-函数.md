1.函数的定义与调用

```
function 函数名(参数列表){
	// do sth.
	return ...;
}
```

2.定义的实例:

实例1:使用返回值的函数

```
function test(){
    return 1;
}

var x = test();
console.log(x);
```

实例2:判断一个值是否为素数

```
function isPrime(n){
	if(n==1) return false;
	for(var i=2;i<n;i++){
		if(n%i==0)
			return true;
	}
	return true;
}

```

3.函数的调用(js无所谓定义调用顺序,注意与C不同):

```
int main(void){
	var n=10;
	if(isPrime(n)){
		printf("n是素数\n");
	}
	else{
		printf("n不是素数\n");
	}
}
```

4.数组与函数:等到了数组再讲.

8.(无视该内容)

![image-20250123084629790](Pics/image-20250123084629790.png)

9.

![image-20250123084641563](Pics/image-20250123084641563.png)

请重新撰写一遍,并自行测试自己定义的函数是否正确.

10.

良好的函数命名方式:

大驼峰命名法

11.函数是否能改变传入的值?(不要乱动,目前默认是函数不能改变传入的值).

以后会介绍函数到底能不能改变传入的值.

答案: JS函数不能改变传入的值.

测试代码:

```
function tryToChangeXButFailed(x){
    x=2;
}

var x = 1;
tryToChangeXButFailed(x);
console.log(x); // 事实上还是输出1
```

注: 原理之后会解释,不过请不要尝试在js的函数中改变变量的值.