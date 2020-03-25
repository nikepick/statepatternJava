
public class Ice extends State {
	@Override 
	public void increase(S_Witcher wrapper) {
	        wrapper.set_state(new Water());
	        System.out.println("Watery State");
	        System.out.println("");
	 }
	@Override
	 public void decrease(S_Witcher wrapper) {
	        wrapper.set_state(new Ice());
	        System.out.println("Keep decreasing bitch I'll stay as it is");
	        System.out.println("");
	 }
}
