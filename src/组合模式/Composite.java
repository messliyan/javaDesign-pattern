package 组合模式;
import java.util.ArrayList;

public class Composite extends Component{
    //首先来一个存储的集合
    private ArrayList<Component> list = new ArrayList<Component>() ;
  
    public void operation(){
        for(Object obj:list){
            ((Component)obj).operation();
        }
    }
	@Override
	public void addComposite(Component c) {
        list.add(c);
        }
	@Override
	public void removeComposite(Component c) {
        list.remove(c);
        }
	@Override
	public Component getComposite(int c) {
        Component c1 =list.get(c);
        return c1;
	}  
}