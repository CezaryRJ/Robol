import java.util.ArrayList;
import java.util.HashMap;

public class Robot implements Robol {

	Grid grid;

	HashMap<String, identifier> identifiers = new HashMap<String, identifier>();
	ArrayList<Statment> stat = new ArrayList<Statment>();
	ArrayList<var_decl> var = new ArrayList<var_decl>();

	public void addvariable(String a, Number b) {
		var.add(new var_decl(b, this));
		identifiers.put(a, new identifier(var.get(var.size() - 1)));

	}

	public identifier getid(String key) {
		return identifiers.get(key);

	}

	Robot(Grid grid) {
		this.grid = grid;

	}

	public void Interpret() {

		for (int i = 0; i < stat.size(); i++) {
			stat.get(i).Interpret();

		}

	}

	public void start(Number xpos, Number ypos) {
		addvariable("xpos", xpos);
		addvariable("ypos", ypos);

	}

	public void addstat(Statment a) {
		stat.add(a);

	}
}
