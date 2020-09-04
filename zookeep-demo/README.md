# Zookeeper

## install for docker

zookeeper service
```shell script
docker run --name some-zookeeper --restart always -d zookeeper
```

zookeeper client service
```shell script
docker run -it --rm --link some-zookeeper:zookeeper zookeeper zkCli.sh -server zookeeper
```

## install for bin

reference1: [Mac上zookeeper的安装与启动](https://www.jianshu.com/p/5491d16e6abd)  
reference1: [ZooKeeper入门教程](https://www.jianshu.com/p/1f4c70d7ef40)  
reference2: [官方文档](https://zookeeper.apache.org/doc/current/zookeeperStarted.html)  

1. 下载
2. 解压
```shell script
tar -zxvf apache-zookeeper-3.5.8-bin.tar.gz
sudo mkdir -p /usr/lcoal/zookeeper
sudo mv apache-zookeeper-3.5.8-bin/ /usr/local/zookeeper/apache-zookeeper-3.5.8-bin/

```
3. 配置
```shell script
cd /usr/local/zookeeper/apache-zookeeper-3.5.8-bin/
cp conf/

```

