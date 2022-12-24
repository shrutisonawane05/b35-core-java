package Framework;

public abstract class BankAcc {
	 
	private int accNO;
	private String accNm;
	private float accBal;

		public BankAcc(int accNO,String accNm,float accBal) {
		super();
		this.accNO= accNO;
		this.accNm= accNm;
		this.accBal=accBal;
		
	}
		abstract public void withdraw(float accBal);
		public void deposite (float accBal){
			System.out.println(accBal);
		}

		public int getAccNO() {
			return accNO;
		}

		public void setAccNO(int accNO) {
			this.accNO = accNO;
		}

		public String getAccNm() {
			return accNm;
		}

		public void setAccNm(String accNm) {
			this.accNm = accNm;
		}

		public float getAccBal() {
			return accBal;
		}

		public void setAccBal(float accBal) {
			this.accBal = accBal;
		}
		@Override
		public String toString() {
			return String.format("BankAccount [accNo= %s , accNm= %s , accBal= %s]", accNO , accNm , accBal);
		
	
		}
}
