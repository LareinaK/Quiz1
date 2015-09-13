
public class CalculateQB {
	public static void main(String[] args) {
		int td;
		int yards;
		int INT;
		int comp;
		int att;
		double qb;
		System.out.println("Sam Bradford's touchdowns are 14");
		System.out.println("Sam Bradford's total yards are 1687");
		System.out.println("Sam Bradford's interceptions are 4");
		System.out.println("Sam Bradford's completions are 159");
		System.out.println("Sam Bradford's number of passes attempted are 262");
		td = 14;
		yards = 1687;
		INT = 4;
		comp = 159;
		att = 262;
		qb = ((comp / att - 0.3) * 5 + (yards / att - 3) * 0.25 + (td / att) * 20 + 2.375 - (INT / att) * 25) / 6 * 100;
		System.out.println("So Sam Bradford's QB rating is " + qb);
	}

}
