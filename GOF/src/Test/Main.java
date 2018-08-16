package Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import Classes.Student;

public class Main {
	public static void main(String[] args) {
		try {
			Class<?> Clazz = Class.forName("Classes.Student");
			
			Constructor<?> declaredConstructor = Clazz.getDeclaredConstructor(String.class,int.class,int.class);
             String name = Clazz.getDeclaredField("name").getName();
             Method m = Clazz.getDeclaredMethod("setAge",int.class);
             Student stu=(Student) Clazz.getDeclaredConstructor().newInstance();
             Object invoke = m.invoke(stu,12);
             System.out.println(stu.toString());
             
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
