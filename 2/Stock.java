import java.util.Scanner;

public class Stock
{
	String symbol;
	String name;
	double PreviousClosingPrice = 0;
	double currentPrice = 0;

	Stock(String a,String b)
	{
		symbol = a;
		name = b;
	}
	
	void getChangePercent()
	{
		double s;
		s = (currentPrice - PreviousClosingPrice)/currentPrice;
		s = s*100;
		System.out.println("变化百分比为:" + s + "%");
	}


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入股票代码和名字:");
		String name,symbol;
		symbol = sc.next();
		name = sc.next();
		System.out.print("请输入昨日值和今日值:");
		Stock st = new Stock(symbol,name);
		st.PreviousClosingPrice = sc.nextDouble();
		st.currentPrice = sc.nextDouble();
		st.getChangePercent();
		
	}
}

