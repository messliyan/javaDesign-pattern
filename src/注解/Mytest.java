package 注解;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Mytest {

	Annotation[] annotation = null;
	
	public static void main(String[] args) throws ClassNotFoundException {
		new Mytest().getAnnotation();
	}

	private void getAnnotation() throws ClassNotFoundException {
		Class<?> clazz = Class.forName("注解.MessageImpl"); //
		boolean isEmpty = clazz.isAnnotationPresent(注解.MyAnnotation.class); //判断clazz是否使用了MyAnnotation自定义注解
		if (isEmpty) {
			annotation = clazz.getAnnotations(); //获取注解接口
			for (Annotation a : annotation) {
				MyAnnotation my = (MyAnnotation) a; //强制转换成MyAnnotation类型
				System.out.println(clazz + "--" + my.msg());
			}
		} 
		
		Method[] method = clazz.getMethods();
		System.out.println("Method");
		for (Method m : method) {
			boolean ismEmpty = clazz.isAnnotationPresent(注解.MyAnnotation.class);
			if (ismEmpty) {
				Annotation[] aa = m.getAnnotations();
				for (Annotation a : aa) {
					MyAnnotation my = (MyAnnotation) a;
					System.out.println(m + "--" + my.msg());
				}
			}
		}	
	}
}