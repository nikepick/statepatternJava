
public class Gas extends State {
	@Override 
	public void increase(S_Witcher wrapper) {
	        wrapper.set_state(new Gas());
	        System.out.println("The fuck man? What else you want me to be I WILL REMAIN GASEOUS");
	        System.out.println("");
	 }
	@Override
	 public void decrease(S_Witcher wrapper) {
	        wrapper.set_state(new Water());
	        System.out.println("Deteroit: Become Water");
	        System.out.println("");
	 }
}
