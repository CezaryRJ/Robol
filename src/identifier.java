
public class identifier extends Expression{

		var_decl inn;
	identifier(var_decl inn){
		this.inn = inn;
		
	}
	public int Interpret() {
		
		return inn.y.Interpret();
	}

	public void changeValue(int v) {
	inn.changeValue(v);
	}
}
