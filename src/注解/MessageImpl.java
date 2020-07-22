package 注解;
@MyAnnotation
public class MessageImpl implements Message {

	@Override
	@MyAnnotation(msg = "我是自定义注解信息...")
	public void msg() {
		// TODO Auto-generated method stub
	}
}