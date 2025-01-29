# 1. 目标:使用git与github进行交互,下拉remote(远程仓库)的代码

# 2. 在本机上,首次使用git与github进行交互:方法指南

## 2.1 在github上添加/查看本地计算机的密钥是否存在

Note:只有是**第一次**使用本台计算机和github交互，才需要在github上添加本地密钥. 

不是第一次则不用重复添加密钥.

例如本台计算机已经和github在某些git仓库上交互过,则不用在github上添加对应的密钥.

### 2.1.1 检测本机的ssh key:

#### 2.1.1.1 查看本机是否已经与github交互过

注:如果已经添加了本机密钥则不必做下面工作

1.使用下面的`c.打开github,添加本地密钥`方法,进入github中的ssh keys界面

2.查看本机电脑是否有已经添加到github SSH keys的ssh key

例如下图代表电脑`拯救者(Y9000P)`已经和github交互过,添加过密钥,则不必重新添加密钥

![image-20230510103022690](Pics/image-20230510103022690.png)

### 2.1.2 如果本机与github账户地址无关联,则需寻找或生成本地密钥

寻找/查看方法:

法1：使用git命令寻找本地密钥

命令1

1.进入`git`(如果本机即Ubuntu则直接输入该命令即可)

展示本地所有密钥文件命令

```
ls ~/.ssh/*.pub
```

说明：

```
ls：展示某目录下所有文件
~/.ssh: ~/.ssh目录
/*.pub: 所有后缀为pub的文件
```



命令2

打开本地密钥文件命令(根据文件名,可能为dsa or rsa file)

```
cat ~/.ssh/id_dsa.pub
or
cat ~/.ssh/id_rsa.pub
```

说明：

```
cat:展示某文件内部内容
~/.ssh/id_dsa.pub：文件名
```





法1参考链接：

https://stackoverflow.com/questions/3828164/how-do-i-access-my-ssh-public-key



#### 法2：直接打开电脑裸机对应目录下的本地密钥

Windows对应目录：

```
格式:C:\Users\[userName]\.ssh
本例:C:\Users\YangMing\.ssh
```

密钥文件名: `id_rsa.pub`



### 2.1.3 本地密钥为空

解决方法: 生成本地密钥

在执行如上命令后,显示:

```
ls: 无法访问 '/root/.ssh/*.pub': 没有那个文件或目录
```

则需生成本地密钥.

生成本地密钥命令：

```
ssh-keygen -t rsa -b 4096 -C "email@example.com"
# 实例:
ssh-keygen -t rsa -b 4096 -C "2486851360@qq.com"
Enter file in which to save the key (/root/.ssh/id_rsa): Enter 即可.
Enter passphrase: no passphrase.
```

然后回到2.1.2步,找到本地密钥.



b.复制密钥

密钥格式应为:

```
ssh-rsa
...(神秘代码)
邮箱名

本例：
ssh-rsa
...(神秘代码)
2486851360@qq.com

密钥实例2：
ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAILY66cggMXTG4n7NRVctjKQ87o9KoEzAEPquaoEWW45H 2486851360@qq.com
完整复制其即可
```



c.打开github,添加本地密钥

按如下步骤操作

1.打开个人设置页面(即下图),头像&rarr;选项卡&rarr;Settings

2.点击`SSH and GPG keys`

3.New SSH key

(放在Legion电脑上的)

![image-20230429090637018](C:\Users\YangMing\AppData\Roaming\Typora\typora-user-images\image-20230429090637018.png)

![image-20230429090705595](C:\Users\YangMing\AppData\Roaming\Typora\typora-user-images\image-20230429090705595.png)

4.点击`New SSH key`后,将你刚刚复制的密钥黏贴入即可







