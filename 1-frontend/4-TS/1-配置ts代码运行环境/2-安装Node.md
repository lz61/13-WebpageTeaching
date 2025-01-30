# 1. 安装node16.14.2, npm8.5.0

如果下载过慢,可以设置镜像源:

```
# 腾讯源:
npm config set registry http://mirrors.cloud.tencent.com/npm/
# 不要用淘宝源(不靠谱):
npm config set registry https://registry.npm.taobao.org
```

如果需要切换版本,可以用nvm:

```
nvm list // 查看所有版本
nvm use [版本名num] // 切换到指定版本
```

切换.

## 0.1 windows Node16.14.2下载

方法1: 使用nvm下载node(推荐)

1.下载nvm

Reference:https://github.com/coreybutler/nvm-windows/releases

下载nvm-setup.exe

2.点击安装

3.检验安装是否成功:

cmd:

```
nvm --version
```

2.使用nvm下载node

查看所有可用的Node版本:

```
nvm list-remote
```

下载16.14.2版本:

```
nvm install 16.14.2
```

使用该版本:

```
nvm use 16.14.2
```





方法2: 直接下载node(不推荐)

名词解释: LTS: Long Term Support

A.下载Node.js安装包: 

website: https://nodejs.org/en/blog/release/v16.14.2

B.安装

C.验证安装

进入cmd:

```
node -v
npm -v
```



## 0.2 Linux Node下载

方法1:

下载.tar.gz文件,解压到对应文件夹,再将nvm挂载到系统路径.

https://github.com/nvm-sh/nvm/releases

nvm&rarr;node和npm&rarr;Angular/CLI

方法2:

1.Install nvm:

```
curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.38.0/install.sh | bash
curl -o- https://gitee.com/mirrors/nvm/raw/v0.38.0/install.sh | bash
```

2.Install Node.js 16.14.2:

```
nvm install 16.14.2
```

3.Set Default Node.js Version:

If you want to set Node.js version 16.14.2 as the default version, you can use:

```
nvm alias default 16.14.2
```

4.Verify node installation:

```
node -v // should be 16.14.2
npm -v // should be 8.5.0
```

5.Install Angular CLI:

```
npm install -g @angular/cli@16.0.1
```

6.Verify Angular Installation:

```
ng version
```



