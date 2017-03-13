
public class arithmeticexp extends Expression {

	Expression x;
	Expression y;
	char oper;

	arithmeticexp(Expression x, char oper, Expression y) {
		this.x = x;
		this.oper = oper;
		this.y = y;

	}

	public int Interpret() {
		if (oper == '+') {

			return (x.Interpret() + y.Interpret());

		} else if (oper == '-') {

			return (x.Interpret() - y.Interpret());

		} else {

			return (x.Interpret() * y.Interpret());
		}

	}
}
