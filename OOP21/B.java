package OOP21;

public class B {

	private int val;

	int val3;

	int password;

	public int getVal(int password) {
		if (this.password == password) {
			return val;
		} else {
			return -1;
		}
	}

	public void setVal(int password, int val) {
		if (this.password == password) {
			this.val += val;
		} else {
			System.out.println("inCorrect Password");
		}
	}

}
