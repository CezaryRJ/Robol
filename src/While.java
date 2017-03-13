import java.util.ArrayList;

public class While extends Statment {
	booleanexp condition;
	ArrayList<Statment> statments;

	While(booleanexp condition, ArrayList<Statment> statments) {

		this.condition = condition;
		this.statments = statments;

	}

	public void Interpret() {

		while (condition.Interpret() != 0) {

			for (int i = 0; i < statments.size(); i++) {

				statments.get(i).Interpret();

			}

		}

	}

	public void addstat(Statment a) {
		statments.add(a);

	}

}
