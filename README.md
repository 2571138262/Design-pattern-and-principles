# Design-pattern-and-principles 设计原则与设计模式
## 设计原则
### 开闭原则
##### 定义：一个软件实体如类、模块和函数应该对扩展开放，对修改关闭
##### 用抽象构建框架，用实现扩展细节
##### 优点：提高软件系统的可复用性以及可维护性
### 依赖倒置原则
##### 定义：高层模块不应该依赖底层模块， 二者都应该依赖器抽象
##### 抽象不应该依赖细节； 细节应该依赖抽象
##### 针对接口编程，不要针对实现编程
##### 优点：可以减少类间的耦合性，提高系统稳定性，提高代码可读性和可维护性，可降低修改程序所造成的风险
### 单一职责原则
##### 定义：不要存在多于一个导致类变更的原因
##### 一个类/接口/方法只负责一项职责
##### 降低类的复杂度，提高类的可读性，提高系统的可维护性， 降低变更引起的风险
### 接口隔离原则
##### 定义：用多个专门的接口，而不使用单一的总接口，客户端不应该依赖它不需要的接口
##### 一个类对一个类的依赖应该建立在最小的接口上
##### 建立单一接口，不要建立庞大臃肿的接口
##### 尽量细化接口，接口中的方法尽量少
##### 注意适度原则， 一定要适度
##### 优点：符合我们常说的高内聚低耦合的设计思想，从而是得类具有很好的可读性，可扩展性和可维护性
#### 单一职责原则和接口隔离原则的区别：
##### 单一职责原则：
###### 1、指的是类、接口、方法的职责是单一的，也就说在一个接口里，只要是职责是单一的，有多个方法也可以，
###### 2、约束的是类、接口、方法，针对的是程序中的实现和细节
##### 接口隔离原则：
###### 1、注重的是对接口依赖的隔离，
###### 2、主要约束的是接口，针对抽象，针对整体框架的构建

#### 注意提高内聚， 减少对外的交互，用最少的方法完成最多的事情
### 迪米特法则(最少知道原则)
##### 定义：一个对象应该对其他对象保持最少的了解，又叫最少知道原则
##### 尽量降低类与类之间的耦合
##### 优点：降低类之间的耦合
##### 强调之和朋友交流， 不和陌生人说话
##### 朋友：
    出现在成员变量、方法的输入、输出参数中的类称为成员朋友类，
    而出现在方法内部的类不属于朋友类
### 里氏替换原则
##### 定义：如果对每一个类型为T1的对象o1， 都有类型T2的对象o2，使得以T1定义的所有程序P在所有的对象o1都替换成o2时，程序P的行为没有发生变化，那么类型T2是类型T1的子类型
##### 定义扩展：一个软件实体如果适用一个父类的话， 那一定适用于其子类，所有引用父类的地方必须能透明地适用其子类对象，子类对象能够替换父类对象，而程序逻辑不变
##### 引申意义：子类可以扩展父类的功能， 但不能改变父类原有的功能
##### 含义1：子类可以实现父类的抽象方法，但不能副高父类的非抽象方法。
##### 含义2：子类中可以增加自己特有的方法
##### 含义3：当子类的方法重载父类的方法时，方法的前置条件(即方法的输入/入参)要比父类方法的输入参数更宽松
##### 含义4：当子类的方法实现父类的方法时(重写/重载或实现抽象方法)，方法的后置条件(即方法的输出/返回值)要比父类更严格或相等
##### 优点1：约束继承泛滥，开闭原则的一种体现
##### 优点2：加强程序的健壮性，同时变更是也可以做到非常好的兼容性，提高程序的维护性、扩展性。降低需求变更时引入的风险
### 合成复用原则(组合/复用原则)
##### 定义：尽量使用对象组合/聚合，而不是继承关系达到软件复用的目的
##### 聚合has—A 和 组合contains-A
##### 优点：可以使系统更加灵活，降低类与类之间的耦合度，一个类的变化对其他类造成的影响比较少
##### 与继承复用相比较：
    组合/聚合复用原则优点：如上
    组合/聚合复用原则缺点：缺点是会有较多的对象需要管理
    继承复用的优点：新的扩展性比较容易实现
    继承复用的缺点：
        首先会破坏包装(因为继承会将父类的实现细节暴露给子类)----白箱复用，
        组合/聚合复用(A类里边包含一个B类，B的具体实现A是看不到的)----黑箱复用
##### 何时使用合成/聚合、继承呢？
##### 聚合has—A 、组合contains-A 、继承 is-A


## 设计模式
### 简单工厂
##### 定义：由一个工厂对象决定创建出哪一种产品类的实例
##### 类型：创建型， 但不属于GOF23种设计模式
##### 工厂类负责创建的对象比较少
##### 客户端(应用层)只知道传入工厂类的参数，对于如何创建对象(逻辑)不关心
##### 简单工厂的优点: 只需要传入一个正确的参数，就可以获取你所需的对象而无须知道其创建细节
##### 简单工厂的缺点: 工厂类的职责相对过重，增加新的产品需要修改工厂类的判断逻辑， 违背了开闭原则
### 工厂方法
##### 定义: 定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行
##### 类型: 创建型
##### 适用场景：
###### 创建对象需要大量重复的代码
###### 客户端(应用层)不依赖于产品类实例如何被创建，实现等细节
###### 一个类通过其子类来指定创建哪个对象
##### 工厂方法的优点:
###### 用户只需要关系所需产品对应的工厂，无须关系创建细节
###### 加入新的产品符合开闭原则， 提高可扩展性
##### 工厂方法缺点
###### 类的个数容易过多，增加复杂度
###### 增加了系统的抽象性和理解难度
##### 源码中的工厂方法举例
    Collection 中的 Iterator<E> iterator(); 方法
    URLStreamHandlerFactory (在JDK中解决URL协议扩展) URLStreamHandler createURLStreamHandler(String protocol);方法
    LoggerFactory 
### 抽象工厂
##### 定义：抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口
###### 抽象工厂可以将一组具有同一主题单独的工厂封装起来，在使用的时候，客户端程序需要创建抽象工厂的具体实现，使用抽象工厂作为接口，来创建这一主题的具体对象，我们在使用的时候是不需要知道和关心它从这些内部的工厂方法中获得对象的具体类型，因为客户端仅使用这些对象的通用接口，抽象工厂模式，将一组对象的实现细节和他们的使用分离开来
##### 无须指定他们具体的类
##### 类型：创建型
##### 适用场景
###### 客户端(应用层)不依赖于产品类实例如何被创建，实现等细节
###### 强调一系列相关的产品对象(属于同一产品族)一起使用创建对象需要大量重复的代码
###### 提供一个产品类的库，所有的产品已同样的接口出现，从而使客户点不依赖于具体实现
##### 优点：
###### 具体产品在应用层代码隔离，无须关心创建细节
###### 将一个系列的产品族统一到一起创建
##### 缺点：
###### 规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
###### 增加了系统的抽象性和理解难度
#### 产品等级结构 与 产品族
##### 工厂方法 ---> 产品等级
##### 抽象工厂 ---> 产品族
##### 源码中的抽象工厂举例
    java.sql.Connection 中用到的就是抽象工厂设计模式
    mybatis中SqlSessionFactory用到的也是抽象工厂设计模式
### 建造者模式
##### 定义：将一个复杂对象的构建与他的表示分离， 使得同样的构建过程可以创建不同的表示
###### 通俗的讲：就是说建造者模式就是如何一步一步构建一个包含多个组件的对象，相同的构建过程可以创建不同的产品，比较适用于流程固定，顺序不固定(对象的建造过程不需要知道，但是仍然能得到一个复杂的对象)
##### 用户只需指定需要建造的类型就可以得到他们，建造的过程及细节不需要知道
##### 类型：创建型
##### 适用场景：
    1、如果一个对象有非常复杂的内部结构(很多属性)
    2、想把复杂对象的创建和使用分离
##### 优点：
    1、封装性好，创建和使用分离
    2、扩展性好、建造类之间独立、一定程度上解耦
##### 缺点：
    1、产生多余的Builder对象
    2、产品内部发生变化，建造者都要修改，成本较大
##### 和工厂模式的区别：
    1、建造者模式更注重于方法的调用顺序，而工厂模式注重于创建产品
    2、创建对象的力度不同: 
        建造者模式可以创建一些复杂的产品，由各种复杂的控件组成
        工厂模式创建出来的对象都一个样子
    3、工厂模式注重的是只要把这个对象创建出来就OK了，而建造者模式不仅要创建出这个产品，而且要知道这个产品都由那些部件组成的
    
##### 源码中的建造者举例
    1、StringBuilder 
    2、Google guava开源库 中Immutable
    3、Spring框架中 BeanDefinitionBuilder
    4、mybatis框架中 sqlSessionFactoryBuilder
    
### 单例模式 (重点)
##### 定义: 保证一个类仅有一个实例，并提供一个全局访问点
##### 类型: 创建型
##### 适用场景
###### 想确保任何情况下都绝对只有一个实例
###### 单服务情况下的计数器可以用单例，在集群的情况下就得用共享的计数器
###### 线程池和数据库连接池
##### 单例模式的优点：
    1、在内存里只有一个实例，减少了内存开销
    2、可以避免对资源的多重占用
    3、设置了全局访问点，严格控制访问
##### 单例模式的缺点：
    没有接口，扩展困难
##### 私有构造器
##### 线程安全
##### 延迟加载
##### 序列化和反序列化安全
##### 反射   反射攻击
#### 单例 - Double Check
        |   线程 0
      时| 1、分配对象的内存空间
      间| 3、设置instance指向内存空间
        | 2、初始化对象
        | 4、初次访问对象
        |
        V
        
        
        |   线程 0                        线程 1
      时| 1、分配对象的内存空间
      间| 3、设置instance指向内存空间
        |                               判断instance是否为null
        |                               线程1初次访问对象
        | 2、初始化对象
        | 4、初次访问对象
        |
        V
#### 单例 - 静态内部类 (基于类初始化的延迟加载解决方案)
    
    线程 0  ————                                      1: 分配对象的内存空间
                 Class对象的初始化锁  ———线程0执行———>   3: 设置instance指向内存空间
    线程 1  ————                                      2：初始化对象

#### 反编译
#### 内存原理
#### 多线程Debug

#### 单例 - 相关的设计模式
##### 1、单例模式和工厂模式
    在一些设计模式中，可以将工厂类设计为单例模式
##### 2、单例模式和享元模式
#### 单例 - 序列化破坏单例模式原理解析
        /**
         * 解决序列化破坏单例模式的问题
         * @return
         */
        private Object readResolve(){
            return hungrySingleton;
        }

#### 单例 - 反射攻击
#### 通过枚举实现单例， 既能防止序列化破坏又能防止反射攻击
#### 基于ThreadLocal的线程单例
    它并不能保证对象在整个应用全局唯一， 但是能保证对象线程唯一
    对于 多线程同步阻塞： 时间换空间
         ThreadLocal： 空间换时间
         
#### 源码中单例模式的应用
    java.lang.Runtime
        private static Runtime currentRuntime = new Runtime();
    java.awt.Desktop
    Spring中的单例是基于容器的
        AbstractFactoryBean:
            public final T getObject() throws Exception {
                    if (this.isSingleton()) {
                        return this.initialized ? this.singletonInstance : this.getEarlySingletonInstance();
                    } else {
                        return this.createInstance();
                    }
                }
    Mybatis中单例的使用
        ErrorContext
### 原型模式
##### 定义：指原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象(在内存中进行二进制流的拷贝)
##### 特点：不需要知道任何创建的细节，不调用构造函数
##### 类型：创建型
#### 原型 - 适用场景
##### 1、类初始化消耗较多资源
##### 2、new产生的一个对象需要非常繁琐的过程(数据准备、访问权限等)
##### 3、构造函数比较复杂
##### 4、循环体中生产大量对象时
#### 原型 - 优点
##### 1、原型模式性能比直接new一个对象性能高
##### 2、简化创建过程
#### 原型 - 缺点
##### 1、必须配备克隆方法
##### 2、对克隆复杂对象或对克隆出的对象进行复杂改造是，容易引入风险
##### 3、深拷贝、浅拷贝要运用得当
#### 原型 - 扩展
##### 1、深克隆 需要将当前对象内部的引用变量进行clone
##### 2、浅克隆 只克隆当前的层次(当前对象内部的引用变量不进行克隆)
#### 克隆破坏单例
##### 通过原型模式中的clone来进行破坏
###### 避免克隆破坏：
    1、不要继承Cloneable接口
    2、如果实现了Cloneable， 那么重写clone()方法，直接调用getInstance()方法
#### 对于原型模式，我们在实际当中使用的时候必须要考虑对象是否是和预期是一致的，也就是说这个对象是新创建出来的呢，还是只是创建一个引用指向同一个地址，应用好深克隆和浅克隆
#### 原型模式在 JDK 和 一些开源框架中的应用
    查找实现了Cloneable接口的类
    ArrayList 
    HashMap
    
### 外观模式
#### 定义: 又叫门面模式，提供了一个统一的接口，用来访问子系统中的一群接口
#### 外观模式定义了一个高层接口，让子系统更容易使用
#### 类型：结构型
#### 适用场景
##### 1、子系统越来越复杂，增加外观模式提供简单调用接口
##### 2、构建多层系统结构，利用外观模式提供简单调用接口，简化层间调用
#### 优点
##### 1、简化了调用过程，无需了解深入子系统，防止带来风险
##### 2、减少系统依赖、松散耦合 
##### 3、更好的划分访问层次
##### 4、符合迪米特法则，即最少知道原则
#### 缺点
##### 1、增加子系统、扩展子系统行为容易引入风险
##### 2、不合符开不原则
#### 外观模式 - 相关的设计模式
##### 1、外观模式和中介者模式
###### 外观模式关注的是外界和子系统之间的交互，而中介者模式关注的是子系统内部之间的交互
##### 2、外观模式和单例模式
###### 通常可以把外观模式中的外观对象做成单例模式结合使用
##### 3、外观模式和抽象工厂模式
###### 外观类可以通过抽象工厂获取子系统的实例，这样子系统可以在内部对外观类进行屏蔽
#### 外观模式在源码中的应用
    org.springframework.jdbc.support.JdbcUtils;


### 装饰者模式
##### 定义：在不改变原有对象的基础之上，将功能附加到对象上，提供了比继承更有弹性的替代方案(扩展原有对象功能)
##### 类型：结构型
#### 装饰者 - 适用场景
##### 1、扩展一个类的功能或给一个类添加附加职责
##### 2、动态的给一个对象添加功能，这些功能可以在动态的删除
#### 装饰者 - 优点
##### 1、继承的有力补充，比继承灵活，不改变原有对象的情况下给一个对象扩展功能
##### 2、通过使用不同的装饰类以及这些装饰类的排列组合，可以是实现不同效果
##### 3、符合开闭原则
#### 装饰者 - 缺点
##### 1、会出现更多的代码，更多的类，增加程序复杂性
##### 2、动态装饰时，多层装饰时会更加复杂
#### 装饰者 - 相关的设计模式
##### 1、装饰者模式和代理模式
###### 装饰者模式关注于在一个类上动态的添加方法，通常在使用装饰者模式的时候，会将原始对象作为一个参数穿给装饰者的构造函数
###### 代理模式关注于控制对对象的访问，代理模式中的代理类可以对用户隐藏一个对象具体的信息，通常在使用代理模式的时候，常常在一个代理类中创建一个对象的实例
##### 2、装饰者模式和适配器模式
###### 装饰者模式和适配器模式都可以叫做包装模式(Wrapper)，装饰者和被装饰者可以实现相同的接口，或者装饰者是被装饰者的子类
###### 在适配器模式中，适配器和被适配的类具有不同的接口，当然也有可能有部分的接口是重合的，

#### 装饰者模式在源码中的应用
    Java IO ：
        BufferedReader 继承了Reader 接口， 在BufferedReader类构造的时候用Reader来进行构造
        BufferedInputStream 和 BufferedOutputStream
    Spring 
        TransactionAwareCacheDecorator
    Mybatis
        org.apache.ibatis.cache.Cache