
public class booleanexp {

	Expression x;
	Expression y;
	char oper;

	booleanexp(Expression x, char oper, Expression y) {
		this.x = x;
		this.oper = oper;
		this.y = y;
		Interpret();

	}

	public int Interpret() {
		if (oper == '<') {

			if (x.Interpret() < y.Interpret()) {
				return 1;

			} else {
				return 0;
			}

		} else if (oper == '>') {
			if (x.Interpret() > y.Interpret()) {

				return 1;

			} else {
				return 0;
			}

		} else {

			if (x.Interpret() == y.Interpret()) {
				return 1;
			} else {
				return 0;
			}
		}

	}

	void update(Expression x, Expression y) {
		this.x = x;
		this.y = y;

	}

}
