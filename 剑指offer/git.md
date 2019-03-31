github 使用步骤

1. fork 到自己的 github 仓库
2. clone 到自己的的电脑上。
3. 不建议在 master 分支上直接操作，建议在 master 分支上切出一个 dev 分支，然后在 dev 分支上自由发挥。修改完后再将 dev 分支 merge 到 master 分支。
 git checkout -b dev
 做了一堆事后，我们 切换到 master 分支，准备合并
 具体使用步骤如下：
  1. git checkout dev
  2. git add git.md
  3. git commit -m "git.md"
  4. git checkout master
  5. git merge dev

4. git push
5. pull request

项目被修改，我们要保持同步怎么办？
1. fetch:   
git fetch 项目地址 master:latest 
fetch 到自己项目分支：latest  
2. merge  
先切换到 master 分支，然后 merge  
具体命令如下：  
git checkout master  
git merge latest  
3. push  
