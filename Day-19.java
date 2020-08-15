class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        //initialising sum
        int sum =0;
        for(int i =1;i<=n;i++){
            //calculating divisors and adding...
            if(n%i==0)sum+=i;
        }
        return sum;
    }
}

