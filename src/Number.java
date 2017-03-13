
public class Number extends Expression{

	int inn;
	Number(int inn){
		this.inn = inn;
		
	}
	public int Interpret() {
	
		return inn;
	}
	
	public void changeValue(int v) {
		inn = v;
	}

}
