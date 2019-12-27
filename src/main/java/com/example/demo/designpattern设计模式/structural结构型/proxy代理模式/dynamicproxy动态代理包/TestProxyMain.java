package com.example.demo.designpattern设计模式.structural结构型.proxy代理模式.dynamicproxy动态代理包;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
/**
 * 通过代理类 代理接口的实现类
 * 通过反射机制,获取类的面的所有方法
 * 
 * 如果是类实现的过的方法最好用public修饰(反射机制可能没办法获取protected,默认的 和defaule 修改的方法)
 *
 */

public class TestProxyMain{
	
	public static void main(String[] args) {
		Object obj=new ProxyUtil().getInstance(TestInterface.class);
		TestInterface testInterface=(TestInterface)obj;
		//代理实现say方法
		testInterface.say();
		//代理实现getInt 方法
		int getInt=testInterface.getInt();
		//代理实现getObject 方法
		Object object=testInterface.getObject();
		//代理实现getString 方法(有参的方法)
		String str=testInterface.getString("输入的参数");
		
		System.out.println("-----------------------------");
		
		System.out.println(getInt);
		System.out.println(object);
		System.out.println(str);

	}
	
}

interface TestInterface{	
	public void say();
	public int getInt();
	public Object getObject();
	public String getString(String inputString);
	
}

/**
 * 通过代理类创建接口的实现类
 */

class ProxyUtil {
	MethodProxyImp methodProxyImp=new MethodProxyImp();
	public Object getInstance(Class<?> cls){
		Object obj=Proxy.newProxyInstance(
				cls.getClassLoader(), 
				new Class[] { cls }, 
				methodProxyImp
                ); 
		return obj;
	}
}
/**
 * import java.lang.reflect.InvocationHandler;
 * 方法代理实现
 * (实现java.lang包下的)
 * 
 */
class MethodProxyImp implements InvocationHandler{

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//如果传进来是一个已实现的具体类（本次演示略过此逻辑)
        if (Object.class.equals(method.getDeclaringClass())) {  
            try {  
                return method.invoke(this, args);  
            } catch (Throwable t) {  
                t.printStackTrace();  
            }  
        //如果传进来的是一个接口（核心)
        } else {
        	//参数返回类型
        	Type type=method.getGenericReturnType();
        	//请求参数
        	Class<?>[] requestParams=method.getParameterTypes();
        	/**
        	 * 可以根据返回类型和参数确定调用哪一个方法
        	 */
        	if("void".equals(type.getTypeName())){
        		voidMethodMainImp(method, args);
        	}else if("int".equals(type.getTypeName())){
        		return intMethodMainImp(method, args);
        	}else if(type.getTypeName().contains("Object")){
        		return objectMethodMainImp(method, args);
        	}else if(type.getTypeName().contains("String")){
        		return stringMethodMainImp(method, args);
        	}
        }  
        return null;
	}
	
	//接口的主要实现
	private void voidMethodMainImp(Method method,Object[] args){
		System.out.println("无参实现方法 方法名字"+method.getName());
	}
	private Integer intMethodMainImp(Method method,Object[] args){  
		System.out.println("返回类型 int方法被代理  方法名字"+method.getName());	
		return 1;
    }
	private Object objectMethodMainImp(Method method,Object[] args){
		System.out.println("返回类型 Object方法被代理 方法名字"+method.getName());	
		return "我是Object 类型";
	}
	private String stringMethodMainImp(Method method,Object[] args){
		System.out.println("返回类型 Object方法被代理 方法名字"+method.getName());	
		return args[0].toString();
	}
}
