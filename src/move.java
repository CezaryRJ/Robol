
public class move extends Statment {

	Robot a;
	direction b;
	Expression c;

	enum direction {
		north, east, south, west
	}

	move(Robot a, direction b, Expression c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void Interpret() {

		if (b == direction.west) {
			if (new booleanexp(new arithmeticexp(a.identifiers.get("xpos"), '-', c), '>', new Number(0))
					.Interpret() == 1
					&& new booleanexp(new arithmeticexp(a.identifiers.get("xpos"), '-', c), '<', a.grid.x)
							.Interpret() == 1) {
				new Assignment(a.getid("xpos"), (new arithmeticexp(a.identifiers.get("xpos").inn.y, '-', c)))
						.Interpret();

			} else {
				System.out.println("command denied, destination out of bounds");
				System.exit(0);
			}

		} else if (b == direction.east) {
			if (new booleanexp(new arithmeticexp(a.identifiers.get("xpos"), '+', c), '>', new Number(0))
					.Interpret() == 1
					&& new booleanexp(new arithmeticexp(a.identifiers.get("xpos"), '+', c), '<', a.grid.x)
							.Interpret() == 1) {
				new Assignment(a.getid("xpos"), (new arithmeticexp(a.identifiers.get("xpos").inn.y, '+', c)))
						.Interpret();

			} else {
				System.out.println("command denied, destination out of bounds");
				System.exit(0);
			}

		} else if (b == direction.north) {
			if (new booleanexp(new arithmeticexp(a.identifiers.get("ypos"), '+', c), '>', new Number(0))
					.Interpret() == 1
					&& new booleanexp(new arithmeticexp(a.identifiers.get("ypos"), '+', c), '<', a.grid.y)
							.Interpret() == 1) {
				new Assignment(a.getid("ypos"), (new arithmeticexp(a.identifiers.get("ypos").inn.y, '+', c)))
						.Interpret();

			} else {
				System.out.println("command denied, destination out of bounds");
				System.exit(0);
			}

		} else {
			if (new booleanexp(new arithmeticexp(a.identifiers.get("ypos"), '-', c), '>', new Number(0))
					.Interpret() == 1
					&& new booleanexp(new arithmeticexp(a.identifiers.get("ypos"), '-', c), '<', a.grid.y)
							.Interpret() == 1) {
				new Assignment(a.getid("ypos"), (new arithmeticexp(a.identifiers.get("ypos").inn.y, '-', c)))
						.Interpret();

			} else {
				System.out.println("command denied, destination out of bounds");
				System.exit(0);
			}

		}

	}

}
