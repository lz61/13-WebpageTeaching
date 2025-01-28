1.函数的定义与调用

```
返回类型 函数名(变量列表){
	// do sth.
	return ...;
}
```

2.定义的实例:

```
#include <stdbool.h>
bool isPrime(int n){
	// do sth.
	if(n==1) return False;
	for(int i=2;i<n;i++){
		if(n%i==0)
			return False;
	}
	return True;
}

```

3.函数的调用(先定义后调用):

```
int main(void){
	int n=10;
	if(isPrime(n)){
		printf("n是素数\n");
	}
	else{
		printf("n不是素数\n");
	}
}
```

5.另一种函数的使用方法: 先声明再调用,后实现

```
bool isPrime(int n);
int main(void){
	...
	isPrime(n);
	...
}

bool isPrime(int n){
	...
}
```

4.传值调用与传址调用: 等到到了指针再讲.

5.数组与函数:等到了数组再讲.

6.![image-20250123084602214](Pics/image-20250123084602214.png)

7.

![image-20250123084615837](Pics/image-20250123084615837.png)

8.

![image-20250123084629790](Pics/image-20250123084629790.png)

9.

![image-20250123084641563](Pics/image-20250123084641563.png)

10.

良好的函数命名方式:

大驼峰命名法