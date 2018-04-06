package p1;

public class Son extends Father {
	public Son(String name) {
		//super();            ----super()必须在构造函数的第一行。不显式调用super()，系统也会自动调用
		super(name);       //------父类没有无参构造器，则必须显式调用带参的super()
		System.out.println("son cons");
		//name = "son";
		System.out.println(name);
	}
}
