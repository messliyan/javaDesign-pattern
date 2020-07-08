
package 组合模式;
 
public class ImageFile extends AbstractFiles {
	private String name;
	
	public ImageFile(String name) {
		
		this.name=name;
	}
 
	@Override
	public void add(AbstractFiles af) {
		// TODO Auto-generated method stub
			System.out.println("不支持该方法");
	}
 
	@Override
	public void remove(AbstractFiles af) {
		// TODO Auto-generated method stub
		System.out.println("不支持该方法");
	}
 
	@Override
	public AbstractFiles get(int i) {
		// TODO Auto-generated method stub
		System.out.println("不支持该方法");
		return null;
	}
 
	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("开始进行--"+name+"--文件杀毒");
	}
 
}