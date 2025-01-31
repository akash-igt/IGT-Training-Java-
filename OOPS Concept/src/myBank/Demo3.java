package myBank;

interface Banks
{
	void OTP();
	void atm();
	void withdraw();
	default void zeroAcc()
	{
		//logic
	}
	static void netBanking()
	{
		//login
	}
}
class Sbibank implements Banks
{

	@Override
	public void OTP() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atm() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}
	
}
class Icici implements Banks
{

	@Override
	public void OTP() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atm() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}
}

public class Demo3 {
	public static void main(String[] args) {
		Sbibank s = new Sbibank();
		s.withdraw();
		s.zeroAcc();
		
		Icici ic=new Icici();
		ic.OTP();
		ic.atm();
//		ic.netBanking(); //cannot access through object
		Banks.netBanking(); // can access directly from class
	
	}

}
