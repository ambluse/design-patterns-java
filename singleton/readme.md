## 定义
	单体模式是对象的创建模式，单例模式确保一个类只有一个实例，而且自行实例化并向整个系统提供这个实例
	
## 饿汉式

```
/**
 * 饿汉模式
 * 
 * @author BENJAMIN
 *
 */
public class EagerSingleton {

	private static EagerSingleton instance = new EagerSingleton();
	
	/**
	 * 构造函数
	 */
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
}

```
	类被加载的时候，静态变量instance会被实例化，此时类的私有构造函数会被调用。此时单例的唯一实例会被创建出来。
	饿汉模式就是在对象实例化的时候就创建出单例对象。
	饿汉模式是典型的空间换时间，在类装在的时候就会创建，不管用不用先创建出来，然后调用的时候就不用去判断，节省了时间。
	
### 懒汉式

```
public class LazySingleton {
	
	private static LazySingleton instance = null;
	
	private LazySingleton() {
		
	}
	
	public static synchronized LazySingleton getInstance() {
		if(instance!=null) {
			return new LazySingleton();
		}else {
			return instance;
		}
	}

}

```

	例子的方法对静态工程方法使用了同步化，以处理多线程环境。
	懒汉式就是在创建实例对象的时候不着急。会等到要使用对象实例的时候才创建。
	
	由于懒汉式的实现是线程安全的，这样访问的速度会降低，而且每次都需要去判断，是否有更好的办法？
	
	
### 单例和枚举
	单元素的枚举类型已经成为实现singleton的最佳方法。用枚举来实现单例，只需要便携一个包含单个元素的枚举类型。
	
 ```
 	public enum Singleton {

		singletonInstance;
	
		public void doSomething() {
			System.out.println("单例的方法");
		}
	
	}
 	
 ```
	

	