
public class S_Witcher {
	private State currentstate;
	
	public S_Witcher(){
		currentstate =  new Water();
	}
	
	public void set_state(State s) {
		currentstate = s;
	}
	
	public void increase_temp() {
        currentstate.increase(this);
    }
	public void decrease_temp() {
        currentstate.decrease(this);
    }
}
