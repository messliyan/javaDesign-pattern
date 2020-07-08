package 监听器模式;
//测试类
public class MonitorTestDrive {
	public static void main(String[] args) {
		EventSource eventSource = new EventSource();
		eventSource.addListener(new MonitorListener() {
			
			@Override
			public void handleEvent(PrintEvent event) {
				// TODO Auto-generated method stub
				event.doEvent();
				if(event.getSource().equals("openWindows")) {
					System.out.println("doOpen");
				}
				if(event.getSource().equals("closeWindows")){
					System.out.println("doClose");
				}
			}
		});
		eventSource.addListener(new MonitorListener() {
			
			@Override
			public void handleEvent(PrintEvent event) {
				// TODO Auto-generated method stub
				event.doEvent();
				if(event.getSource().equals("good")) {
					System.out.println("good");
				}
				if(event.getSource().equals("closeWindows")){
					System.out.println("doClose");
				}
			}
		});
		/*
		 * 传入openWindows事件，通知所有的事件监听器
		 * 对open事件感兴趣的listener将会执行
		 */
		eventSource.notifyListenerEvents(new PrintEvent("openWindows"));
		eventSource.notifyListenerEvents(new PrintEvent("good"));
	}
}
 
 
/*
result:
通知一个事件源 source: openWindows
doOpen
这就是事件监听模式
回调接口类: MonitorListener
回调函数接口: handleEvent
通过回调模型，EventSource事件源便可回调具体监听器动作
*/
