
public class stop extends Statment{
 Robot a;
 stop(Robot a){
	 this.a = a;
	 
 }

public void Interpret() {
	System.out.println("Robot has reached its destination at x" + a.identifiers.get("xpos").Interpret() + " y" + a.identifiers.get("ypos").Interpret());
	System.exit(0);
	
}
 
 
}
