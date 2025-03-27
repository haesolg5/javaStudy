package quiz;

class Gugu {
	int num;
	int result;
	
	private void setX(int x) {
		this.num = x;
	}
	
	private int calResult(int x) {
		return this.result*x;
	}
	
	public void printGugu(int x) {
		this.setX(x);
		for(int i = 1; i<11; i++) {
			System.out.printf("%d ",this.num);
			if(i==1) {
				this.result = this.num;
				System.out.printf("X %d = %d\n",i , this.result);
			}
			else {
				for(int j = 0; j<i; j++) {
					System.out.printf("X %d", this.num);
					this.result = this.calResult(this.num);
				}
				System.out.printf(" = %d\n", this.result);
			}
		}
	}
}

public class QuUpgradeGuGu {
	
	public static void main(String[] args) {
		Gugu gugu = new Gugu();
		
		for(int i = 2; i<10;i++) {
			gugu.printGugu(i);
		}
	}
	
}

