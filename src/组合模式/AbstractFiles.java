package 组合模式;
/**
 * 
* <p>Title: AbstractFiles</p>  
* <p>Description:in this class we are  use to test composite pattern </p>  
* @author HAND_WEILI  
* @date 2018年8月26日
 */
public abstract class AbstractFiles {
  public abstract void add(AbstractFiles af);
  public abstract void remove(AbstractFiles af);
  public abstract AbstractFiles get(int  i);
  public abstract void killVirus();
}