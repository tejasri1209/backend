public class EMICal {
    public static void main(String[] args) {
        double onRoadPrice = 2190887;
        double downpayment = 380000;
        double loanamount = onRoadPrice - downpayment;
        double annualInterestRate = 9.5;
        byte Loanperiodyears= 4;
        double monthlyInterestRate = annualInterestRate / (12*100);
        int loanperiodmonths = Loanperiodyears * 12;
        double emi = (loanamount * monthlyInterestRate * Math.pow(1+monthlyInterestRate,loanperiodmonths))/(Math.pow(1+monthlyInterestRate,loanperiodmonths)-1);
        System.out.println("Emi is:"+emi);
    }
}
