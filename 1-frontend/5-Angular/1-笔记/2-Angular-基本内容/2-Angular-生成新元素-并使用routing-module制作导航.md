1.给项目新建一个元素:

cmd:

命令:

```
ng g c test
```

语法:

```
ng g c [componentName]
```

解释:

ng: Angular命令标志

g: generate的缩写.

c: component,组件的缩写.



注1: 尽量不要在

```
ng serve
```

的时候生成新元素,很容易卡住.



2.使用`app-routing.module.ts`控制路由:

A.先将`app.component.html`中的内容替换为:

```
<router-outlet></router-outlet>
```

效果: 其中塞的html元素是程序员指定的.

B.在`app-routing.module.ts`中设定路由:

复习: ts数组与js对象.

格式: 数组,其中每个对象都是指定的路由.

语法

```
const routes: Routes =[
	对象1,
	对象2,
	...
]
```

每个对象的基本格式:

```
{path: 'pathName', component: 'AngularComponent'}
```

实例:

```
const routes: Routes = [
  {path:"test",component:TestComponent},
]
```





C.期待效果:

![image-20250203195929985](Pics/image-20250203195929985.png)



D.总结:

通过将`app.component.html`中的内容换成

```
<router-outlet></router-outlet>
```

并将`app-routing.module,ts`中的const route: Routes换成我们自定义的数组+对象形式,我们可以指定在访问某些页面时,显示我们自定义的Angular元素.