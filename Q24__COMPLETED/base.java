class base{
	public static void main(String[] args){
		savings s1 = new savings("Satyam", 200);
		s1.getData();
		s1.add(400);
		s1.getData();
		s1.addMonthlyIntrest();
		s1.getData();
		s1.withdraw(4000);
		s1.getData();
		s1.withdraw(40);
		s1.getData();
		s1.withdraw(400);
		s1.getData();
		s1.add(400);
		s1.getData();
		s1.withdraw(800);
		s1.getData();
		s1.withdraw(593);
		s1.getData();


		current c1 = new current("Rohit", 200);
		c1.getData();
		c1.add(400);
		c1.getData();
		c1.addMonthlyIntrest();
		c1.getData();
		c1.withdraw(4000);
		c1.getData();
		c1.withdraw(40);
		c1.getData();
		c1.withdraw(400);
		c1.getData();
		c1.add(400);
		c1.getData();
		c1.withdraw(800);
		c1.getData();
		c1.withdraw(593);
		c1.getData();


		current c2 = new current("Rakesh", 1200);
		c2.getData();
		c2.add(400);
		c2.getData();
		c2.addMonthlyIntrest();
		c2.getData();
		c2.withdraw(4000);
		c2.getData();
		c2.withdraw(40);
		c2.getData();
		c2.withdraw(400);
		c2.getData();
		c2.add(400);
		c2.getData();
		c2.withdraw(800);
		c2.getData();
		c2.withdraw(593);
		c2.getData();
	}
}


class account{
	static int accid;
	double intrest_rate;
	int id;
	double balance;
	String account_holderName;
	account(String account_holderName, double balance){
		System.out.println();
		this.id = getid();	
		this.account_holderName = account_holderName;
		this.balance = balance;
	}
	void addIntrestRate(double intrest_rate){
		this.intrest_rate = intrest_rate;
	}
	static int getid(){
		accid++;
		return accid;
	}
	boolean addBalance(double amt){
		this.balance += amt;
		return true;
	}
	boolean withdrawBalance(double amt){
		if(amt > balance){
			return false;
		}else{
			balance -= amt;
			return true;
		}
	}
	protected void getInfo(){
		System.out.println("Account id "+ id + " Mr/Mrs "+ account_holderName + " has a balance of "+ balance + " only.");
	}
	boolean addIntrest(){
		balance*=(100+intrest_rate)/100;
		return true;
	}
}

class savings extends account{
	double intrest_rate = 5.5;
	double min_required_amt = 0;
	boolean account_created = false;
	savings(String name, double amount){
		super(name, amount);
		if(amount < min_required_amt){
			System.out.println("Account Creation Failed!! Please Provide Enough amount to open current account.");
		}else{
			super.addIntrestRate(intrest_rate);
			System.out.println("New Current Account with intrest rate of "+ intrest_rate + " and balance of "+amount+" is Created.");
			this.account_created = true;
		}
	}
	void add(double amt){
		if(checkAccount()){
			if(super.addBalance(amt)){
				System.out.println("Amount "+ amt + " added to account of Mr/Mrs. " + super.account_holderName +"'s Account");
			}else{
				System.out.println("Error!! Can't add money");
			}
		}
	}
	void withdraw(double amt){
		if(checkAccount()){
			if(super.withdrawBalance(amt)){
				System.out.println("Amount "+ amt + " has deducted from account of Mr/Mrs. " + super.account_holderName +"'s Account");
			}else{
				System.out.println("Withdrawl of "+ amt + " is cancelled because of Insufficient Balance!!!");
			}
		}
	}
	void addMonthlyIntrest(){
		if(checkAccount()){
			if(super.addIntrest()){
				System.out.println("Monthly Intrest "+intrest_rate+"% Added.");
			}else{
				System.out.println("Can't Add Monthly Intrest.");
			}
		}
	}
	void getData(){
		if(checkAccount()){
			getInfo();
		}
	}
	boolean checkAccount(){
		if(account_created){
			return true;
		}else{
			System.out.println("Invalid Account!!!");
			return false;
		}
	}
}

class current extends account{
	double intrest_rate = 7;
	double min_required_amt = 1000;
	boolean account_created = false;
	current(String name, double amount){
		super(name, amount);
		if(amount < min_required_amt){
			System.out.println("Account Creation Failed!! Please Provide Enough amount to open current account.");
		}else{
			super.addIntrestRate(intrest_rate);
			System.out.println("New Current Account with intrest rate of "+ intrest_rate + " and balance of "+amount+" is Created.");
			this.account_created = true;
		}
	}
	void add(double amt){
		if(checkAccount()){
			if(super.addBalance(amt)){
				System.out.println("Amount "+ amt + " added to account of Mr/Mrs. " + super.account_holderName +"'s Account");
			}else{
				System.out.println("Error!! Can't add money");
			}
		}
	}
	void withdraw(double amt){
		if(checkAccount()){
			if(super.withdrawBalance(amt)){
				System.out.println("Amount "+ amt + " has deducted from account of Mr/Mrs. " + super.account_holderName +"'s Account");
			}else{
				System.out.println("Withdrawl of "+ amt + " is cancelled because of Insufficient Balance!!!");
			}
		}
	}
	void addMonthlyIntrest(){
		if(checkAccount()){
			if(super.addIntrest()){
				System.out.println("Monthly Intrest "+intrest_rate+"% Added.");
			}else{
				System.out.println("Can't Add Monthly Intrest.");
			}
		}
	}
	void getData(){
		if(checkAccount()){
			getInfo();
		}
	}
	boolean checkAccount(){
		if(account_created){
			return true;
		}else{
			System.out.println("Invalid Account!!!");
			return false;
		}
	}
}