
public class Water extends State {
	@Override 
	public void increase(S_Witcher wrapper) {
	        wrapper.set_state(new Gas());
	        System.out.println("Vapourizing to become Gas");
	        System.out.println("");
	 }
	@Override
	 public void decrease(S_Witcher wrapper) {
	        wrapper.set_state(new Ice());
	        System.out.println("Do you feel Cold and Lost in Devastation? bEcAuse I am ICE");
	        System.out.println("");
	 }
}
