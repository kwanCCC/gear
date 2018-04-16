## Curator Framework Example

Curator 是一个很棒的 _Framework_ 提供了一套的高级API,简化 _Client_ 在 **Zookeeper** 上的操作，相对于原始的 **com.101tec.com.ZkClient** 可以不用担心那些 _RuntimeException_ 了,

> 组件
* Recipes: 对于Zookeeper的Recipes的实现
* Framework: 提供了一组high level API
* Utilities: 如果你是一个 **TDD** 的 fun, 里面的工具会对你非常有用，里面有工具类包括测试工具
* Client: Zookeeper Client的实现
* Errors: 异常的处理
* Extension: 好多，你可以很快就能写出自己的 _服务发现_ 组件 

### 1.Leader Latch

### 2.Leader Election

### 3.Shared Reentrant Lock

### 4.Shared Lock

### 5.Shared Reentrant Read Write Lock

### 6.Shared Semaphore