package Test;

public class casting {
	public static void main(String args[]){
		short oldage=29;
		int newage=oldage;
		
		System.out.println(oldage);
		System.out.println(newage);
		
		int salary=10000;
		double new_salary=salary;
		
		System.out.println(salary);
		System.out.println(new_salary);
		// Explicit or narrowing typecasting
		
		int cash=20000;
		short newcash= (short)cash;
		
		System.out.println(cash);
		System.out.println(newcash);
		
		int money=200000000;
		short newmoney= (short)money;
		
		System.out.println(money);
		System.out.println(newmoney);
		
		float degree=20.95f;
		int newdegree= (int)degree;
		
		System.out.println(degree);
		System.out.println(newdegree);

	}

}
