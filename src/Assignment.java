
public class Assignment extends Statment{

	
	identifier inn;
	Expression x;
	Assignment(identifier inn, Expression x){
		this.inn = inn;
		this.x = x;
		
	}
	

	public void Interpret() {
		
		inn.changeValue(x.Interpret());
		
	}



}
