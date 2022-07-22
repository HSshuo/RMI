# RMI
#### Provider
1. 暴露服务：UnicastRemoteObject.exportObject()
2. 创建注册中心：LocateRegistry.createRegistry()
3. 注册服务：registry.rebind()

<br>

#### Consumer
1. 获取注册中心：LocateRegistry.getRegistry()
2. 服务发现：registry.lookup()
3. 服务调用：**就像调用本地方法一样调用，RMI会传递方法的名称、参数等信息通过注册中心找到对应提供这个方法的Provider，Provider调用后返回结果**。
