1.git原理

lizeng本地: 一份webpageTeaching

JiaJia本地: 一份webpageTeaching

云端仓库代码: 一份webpageTeaching

2.git clone:

复制云端仓库代码并拉到本地.

3.问题:

A.本地代码更新,希望将本地代码发送给其他代码协作者,怎么办?

1.将本地代码发送到云端

2.另一个协作者: 

```
git pull
```

git: 共享代码和文档

3.注意新问题:

正常流程:

```
1. A  B cloud (代码一致)
2. A' B cloud
3. A' B cloud'
4. A' B' cloud'
```

完美流程.

出错流程:

```
1. A  B cloud
2. A' B cloud
3. A' B cloud'
如果: B在cloud->cloud'的过程中:
B->B''(不是通过拉取cloud文档变成的).

```

A->A'

B->B'

各自改的内容都有用.

怎么办?

有办法,可以使用.

B:

```
git add .
git commit -m "B的上传内容"
git push // 云端代码=本地仓库,不可以
// 因为本地和云端的代码都已更改,所以不能直接覆盖云端代码
// 回退版本:
git stash
git pull // 因为云端代码版本更靠前,所以要先拉取(pull)云端代码
git stash pop
```

云端代码版本比B本地的代码要领先了.



云端: 1.0

A: 1.0->1.0A.

B: 1.0->1.0B版本

1.0A->1.0B.

A做的工作就可能和B的冲突.

3.演示:

A.学生修改: test.md文件

```
git add .
git commit -m "说的话"(注意: commit -m 中间要有空格)
git push
```

重写小窍门:

```
按向上键,可以直接获取之前的命令
```

B.查看: 