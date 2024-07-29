public class FinancialForecasting {

   
    public static double futureValue(double initialValue, double growthRate, int periods) {
    
        if (periods == 0) {
            return initialValue;
        }
        return (1 + growthRate) * futureValue(initialValue, growthRate, periods - 1);
    }

 
    public static double futureValueMemo(double initialValue, double growthRate, int periods, Double[] memo) {
    
        if (periods == 0) {
            return initialValue;
        }
        if (memo[periods] != null) {
            return memo[periods];
        }
        memo[periods] = (1 + growthRate) * futureValueMemo(initialValue, growthRate, periods - 1, memo);
        return memo[periods];
    }

    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.05; // 5% growth rate
        int periods = 10;

        System.out.println("Future value using simple recursion:");
        System.out.println(futureValue(initialValue, growthRate, periods));

     
        Double[] memo = new Double[periods + 1];
        System.out.println("Future value using memoization:");
        System.out.println(futureValueMemo(initialValue, growthRate, periods, memo));
    }
}
