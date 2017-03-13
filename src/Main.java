import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		if (args[0].equals("1")) {
			Grid a = new Grid();
			a.size(new Number(64), new Number(64));
			Robot b = new Robot(a);
			Program test = new Program(a, b);

			b.start(new Number(23), new Number(30));
			b.addstat(new move(b, move.direction.west, (new Number(15))));
			b.addstat(new move(b, move.direction.south, (new Number(15))));
			b.addstat(new move(b, move.direction.east, (new arithmeticexp(new Number(2), '+', new Number(4)))));
			b.addstat(new move(b, move.direction.north, (new arithmeticexp(new Number(10), '+', new Number(27)))));

			b.addstat(new stop(b));

			test.Interpret();

		} else if (args[0].equals("2")) {
			Grid a = new Grid();
			a.size(new Number(64), new Number(64));
			Robot b = new Robot(a);
			Program test = new Program(a, b);

			b.addvariable("i", new Number(5));
			b.addvariable("j", new Number(3));
			b.start(new Number(23), new Number(6));
			b.addstat(new move(b, move.direction.north,
					(new arithmeticexp(new Number(3), '*', b.identifiers.get("i").inn.y))));
			b.addstat(new move(b, move.direction.east, (new Number(15))));
			b.addstat(new move(b, move.direction.south, (new Number(4))));

			b.addstat(new move(b, move.direction.west,
					new arithmeticexp(
							new arithmeticexp(new arithmeticexp(new Number(2), '*', b.identifiers.get("i").inn.y), '+',
									new arithmeticexp(new Number(3), '*', b.identifiers.get("j").inn.y)),

							'+', new Number(5))));
			b.addstat(new stop(b));

			test.Interpret();

		} else if (args[0].equals("3")) {
			Grid a = new Grid();
			a.size(new Number(64), new Number(64));
			Robot b = new Robot(a);
			Program test = new Program(a, b);

			b.addvariable("i", new Number(5));
			b.addvariable("j", new Number(3));
			b.start(new Number(24), new Number(6));
			b.addstat(new move(b, move.direction.north,
					new arithmeticexp(new Number(3), '*', b.identifiers.get("i").inn.y)));
			b.addstat(new move(b, move.direction.west, new Number(15)));
			b.addstat(new move(b, move.direction.east, new Number(4)));

			ArrayList<Statment> inn = new ArrayList<>();
			inn.add(new move(b, move.direction.south, b.identifiers.get("j").inn.y));
			inn.add(new Assignment(b.identifiers.get("j"),
					new arithmeticexp(b.identifiers.get("j").inn.y, '-', new Number(1))));

			b.addstat(new While(new booleanexp(b.identifiers.get("j").inn.y, '>', new Number(0)), inn));

			b.addstat(new stop(b));

			test.Interpret();
		} else if (args[0].equals("4")) {

			Grid a = new Grid();
			a.size(new Number(64), new Number(64));
			Robot b = new Robot(a);
			Program test = new Program(a, b);

			b.addvariable("j", new Number(3));
			b.start(new Number(1), new Number(1));

			ArrayList<Statment> inn = new ArrayList<>();
			inn.add(new move(b, move.direction.north, b.identifiers.get("j").inn.y));

			b.addstat(new While(new booleanexp(b.identifiers.get("j").inn.y, '>', new Number(0)), inn));

			b.addstat(new stop(b));

			test.Interpret();
		}

	}

}
