package com.test;


    /**
    * @ClassName: StaticInitialization
    * @Description: TODO(该类作用为表现构造方法，静态成员变量以及一般成员变量的初始化顺序，首先
    * StaticInitialization类作为程序入口类，优先实例化了俩个静态成员变量t2和t3，说明一
    * 个类在生成对象时的顺序为初始化静态成员变量>初始化普通成员变量>调用构造方法，而且静态成员变量
    * 不论多少个对象只会被初始化一次)
    * @author dennis
    * @date 2017年8月22日
    *
    */
    
public class StaticInitialization {

	public static void main(String[] args) {
		System.out.println(
		"Creating new Cupboard() in main");
		new Cupboard();
		System.out.println(
		"Creating new Cupboard() in main");
		new Cupboard();
//		t2.f2(1);
//		t3.f3(1);
		}
//	static Table t2 = new Table();
//	static Cupboard t3 = new Cupboard();
}
