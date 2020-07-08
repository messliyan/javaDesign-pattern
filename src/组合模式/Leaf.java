package 组合模式;
public class Leaf extends Component{
    //首先重写component的方法
    //叶子节点关键点在于业务
@Override
public void addComposite(Component c) {
    //提示报错呗 。
    System.out.print("不是子容器");
}
@Override
public void removeComposite(Component c) {
    //提示报错呗 。
    System.out.print("不是子容器");
}

@Override
public Component getComposite(int i) {
	// TODO 自动生成的方法存根
	return null;
}

@Override
public void operation() {
    System.out.print("业务方法");
    }

}