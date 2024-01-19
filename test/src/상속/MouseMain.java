package 상속;

public class MouseMain {

	public static void main(String[] args) {
		
		Mouse m = new Mouse();
		m.leftClick();
		m.rightClick();
		m.drag();
		
		System.out.println();
		
		WheelMouse wm = new WheelMouse();	
		wm.leftClick();
		wm.rightClick();
		wm.drag();
		wm.scroll();
		
		System.out.println();
		
		ErgonomicsMouse em = new ErgonomicsMouse();
		em.leftClick();
		em.rightClick();
		em.drag();
		em.scroll();
		em.protectWrist();
	
	}
	

}
