1.安装Angular CLI(脚手架),版本:16.0.1

A.Angular CLI: 用于管理Angular代码的程序,负责将Angular代码转换成浏览器能读懂的html,css,js代码.

B.安装Angular CLI:

```
指定版本:
npm install -g @angular/cli@16.0.1
解释:
-g: global,指的是全局安装.
不指定版本(不推荐):
npm install -g @angular/cli
```

注1: 在本机上安装angular脚手架，以便在之后自己动手搭建项目。

注2: 最好有VPN再装.



C.检验安装是否成功

cmd:

```
ng version
```

期待：

![image-20250130091736377](Pics/image-20250130091736377.png)

注3: 只有16.14.2的node版本可以安装node-CLI,18.16.0的node版本无法正常下载并安装node-CLI.请使用nvm重装Node,可见: `2-安装Node.md`.





