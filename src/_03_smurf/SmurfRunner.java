package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf handy= new Smurf("Handy");
	handy.getName();
	handy.eat();
	Smurf papa= new Smurf("Papa");
	papa.getName();
	System.out.println(papa.getHatColor());
	System.out.println(papa.isGirlOrBoy());
	Smurf Smurfette = new Smurf("Smurfette");
	Smurfette.getName();
	System.out.println(Smurfette.getHatColor());
	System.out.println(Smurfette.isGirlOrBoy());
	
}
}
