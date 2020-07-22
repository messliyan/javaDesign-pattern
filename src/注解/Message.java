package 注解;
@MyAnnotation //使用自定义注解
public interface Message {
	
	@MyAnnotation
	public void msg();
}