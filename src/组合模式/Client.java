
package 组合模式;
 
public class Client {
	public static void main(String[] args) {
		//创建一个文件类型
		AbstractFiles f1 = new Folder("主文件夹");
		//创建文件
		AbstractFiles file1= new ImageFile("孙悟空。png");
		AbstractFiles file2= new ImageFile("龙珠.jpg");
		AbstractFiles file3= new ImageFile("帅哥威.gif");
		AbstractFiles file4= new ImageFile("我威.gif");
		f1.add(file1);
		f1.add(file2);
		f1.add(file3);
		file3.add(file4);
		f1.killVirus();
		file4.killVirus();
	}
 
}
