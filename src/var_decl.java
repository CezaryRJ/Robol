
public class var_decl extends Statment{

	
	identifier x;
	
	Robot a;
	
	Number y;
	var_decl(Number y,Robot a){
		this.a = a;
		this.y = y;
	}

	public void Interpret() {
	
		
	}

	void setidentifier(identifier x){
		this.x = x;
		
	}
	public void changeValue(int v) {
		y.changeValue(v);
	}
}
