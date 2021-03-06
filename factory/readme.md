## 定义
		工厂模式是类的创建模式
		工厂模式的用意是定义一个创建产品对象的工厂接口，将实际的创建工作延迟到子类中

## 案例场景
		实现一个导入导出功能，系统需要对一些数据进行导出，要支持多种格式：html,csv,pdf等，每种导出的结构又有所不同，如果
	只用简单工程，工厂类会很臃肿。因为简单工厂只有一个工厂类，需要处理所有的逻辑。如果以上需求暂时只支持3种导出格式以及。
		两种导出结构，那么工厂类中会需要6个 if else 来实现。如果再增加需求，会更加臃肿。
		这时候需要使用工厂模式来处理以上需求。在工厂模式中，核心的工厂类不再负责所有的对象创建，而是将具体创建的工作交给子类。
	这个核心工厂类成为了一个抽象工厂角色，仅负责给出具体工厂子类必须实现的接口，而不接触哪一个子类应该被实例化这种细节。
		进过这样的抽象可以用来允许系统在不修改具体工厂角色的情况下引入新的产品。
		
## 模式涉及的角色
### 抽象工厂
		工厂方法模式的核心，任何在模式中创建对象的工厂类必须实现这个接口。
### 具体工厂
		实现了抽象工厂接口的类。具体工厂角色含有与业务密切相关的逻辑，并且受到使用者的调用以创建导出类
### 抽象产品
		工厂模式创建的对象的父类
### 具体产品
		具体的对象产品
	
	
	
## 总结
### 和简单工厂模式的区别
		结构上的不同很明显。工厂方法模式的核心是一个抽象工厂类，而简单工厂模式把核心放在一个具体类上。
		工厂模式退化后就是简单工厂模式。如果非常确定一个系统只需要一个具体工厂，可以把抽象工厂合并到具体工厂中去。由于只有一个
	具体工厂，所以不妨将工厂方法改为静态方法，这时候就是一个简单工厂模式。
		
		如果系统需要加入新的导出类型，那么只要想系统加入一个导出类以及其对于的工厂类。不需要修改客户端，也不需要修改抽象工厂
	或者其他已有的具体工厂角色。对于新增的导出类型而言，这个系统完全支持“开闭原则”

		一个系统是由多人开发的，导出功能是你实现的，但是使用者可能是其他人。这个时候就应该设计的足够灵活并且尽可能降低两者之间的
	耦合度，当你修改或增加一个新的功能时，使用者不需要修改任何地方。