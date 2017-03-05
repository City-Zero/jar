package Stock;
import java.util.Scanner;

/**
 * Created by lyt on 17-1-4.
 */

class Stock{
    String symbol;
    String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Stock(String symbol,String name){
        this.symbol = symbol;
        this.name = name;
    }

    double changePercent(){
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String symbol1=input.next();
        String name1=input.next();
        Stock stock = new Stock(symbol1, name1);

        stock.previousClosingPrice = input.nextDouble();

        // Input current price
        stock.currentPrice = input.nextDouble();

        // Display stock info
        System.out.println(stock.name+"price changed: " + stock.changePercent() * 100 + "%");
        input.close();
    }
}