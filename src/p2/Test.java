package p2;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main (String args[]) {
		Dog d1 = new Dog(1);
		Dog d2 = new Dog(2);
		Dog d3 = new Dog(3);
		ArrayList<Dog> arrayList = new ArrayList<>();
/*		ArrayList<String> arrayList = new ArrayList<>();
		String d1 = "ddd1";
		String d2 = "ddd2";
		String d3 = "ddd3";*/
		arrayList.add(d1);
		arrayList.add(d2);
		arrayList.add(d3);
		Iterator<Dog> iterator = arrayList.iterator();
//		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Dog dog = iterator.next();
//			String dog = iterator.next();
			if (dog.age == 1) {
				//arrayList.remove(dog);  ----迭代中直接删除集合元素会有异常：java.util.ConcurrentModificationException  
				//arrayList.remove(d1);   ----迭代中直接删除集合元素会有异常：java.util.ConcurrentModificationException
				//iterator.remove();//iterator 的remove不会报错
				dog.age = 999;//迭代将d1的引用传递给了dog，所以可以修改dog的age
			}
			System.out.println(dog);//iterator 的remove不影响输出该次的dog
		
/*		if (dog.equals("ddd1")) {
			//arrayList.add("====");  迭代中添加集合元素也会报错：java.util.ConcurrentModificationException
			dog = "999";//字符串与其他对象不同，其他对象传递的是的引用，字符串传递的是字符串的值
		}*/	
		}
		System.out.println(arrayList);//迭代后iterator remove的对象从原集合里删除
	}
}
