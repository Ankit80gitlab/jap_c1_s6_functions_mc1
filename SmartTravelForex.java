package com.jap.masterychallenge1;


import java.util.Scanner;
public class SmartTravelForex {
    static double JPY= 0.67;
    static  double EUR=85.37;
    static  double GBP=94.5;
    static  double USD=74.3;
    static  double AED=20.25;
    /**
     * This method converts the given amount in INR to the currency of choice
     * @param amount
     * @param choice
     * @return the exchange rate depending on choice of currency
     */
    public static double currentExchangeRates(double amount, int choice) {
    double convertedAmountinINR=0.0;
        double JPY= 0.67;
        double EUR=85.37;
        double GBP=94.5;
        double USD=74.3;
        double AED=20.25;
        if(amount<=0){  return -1;
        }
        else
     {
        switch(choice){
                        case 1: convertedAmountinINR=(amount*JPY);
                        break;
                        case 2:convertedAmountinINR=(amount*EUR);
                        break;
                        case 3:convertedAmountinINR=(amount*GBP);
                        break;
                        case 4:convertedAmountinINR=(amount*USD);
                        break;
                        case 5:convertedAmountinINR=(amount*AED);
                        break;
                        default:
                                    }
                                    return convertedAmountinINR;
     }
    }
    /**
     * This method converts a given source currency to the desired target currency
     * @param sourceCurrency
     * @param targetCurrency
     * @param amountToBeConverted
     * @return converted amount from a source currency to the desired target currency
     */
    public static double convertGivenCurrencyIntoDesiredCurrency(int sourceCurrency, int targetCurrency, double amountToBeConverted) {
        double JPY= 0.67;
        double EUR=85.37;
        double GBP=94.5;
        double USD=74.3;
        double AED=20.25;
        double convertedAmountinINR=currentExchangeRates(amountToBeConverted,sourceCurrency);
        double convertedAmount=0.0;
        if(sourceCurrency==targetCurrency)
        {
            return-1;
        }
    else{
        switch(targetCurrency)
        {
        case 1:convertedAmount=(convertedAmountinINR/JPY);
        break;
        case 2:convertedAmount=(convertedAmountinINR/EUR);
        break;
        case 3:convertedAmount=(convertedAmountinINR/GBP);
        break;
        case 4:convertedAmount=(convertedAmountinINR/USD);
        break;
        case 5:convertedAmount=(convertedAmountinINR/AED);
        break;
        default:
        }
           return convertedAmount;
    }
    }
    /**
     *  This method displays the currency conversion rates in a tabular format
     *
     */
    public static void displayForexDetails() {
        double JPY= 0.67;
        double EUR=85.37;
        double GBP=94.5;
        double USD=74.3;
        double AED=20.25;
		
System.out.printf("%10d,%10d,%10d,%10d,%10d\n",1,10,20,50,100);
System.out.printf("JPY%7.2f%10.1f%10.1f%10.1f%10.1f\n",JPY*1,JPY*10,JPY*20,JPY*50,JPY*100);
System.out.printf("EUR%7.2f%10.1f%10.1f%10.1f%10.1f\n",EUR*1,EUR*10,EUR*20,EUR*50,EUR*100);
System.out.printf("GBP%7.1f%10.1f%10.1f%10.1f%10.1f\n",GBP*1,GBP*10,GBP*20,GBP*50,GBP*100);
System.out.printf("USD%7.1f%10.1f%10.1f%10.1f%10.1f\n",USD*1,USD*10,USD*20,USD*50,USD*100);
System.out.printf("AED%7.2f%10.1f%10.1f%10.1f%10.1f\n",AED*1,AED*10,AED*20,AED*50,AED*100);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayForexDetails();
        int source = 0;
        int target = 0;
        double amountToBeConverted = 0;
        System.out.println("Do you wish to check conversion rates today : (y/n) ");
        char choice = sc.next().charAt(0);
        if (choice == 'y') {
            System.out.println("Exchange Rate of currency can be done for \n 1. JPY \n 2. EUR \n 3. GBP \n 4. USD \n 5. AED       ");
            System.out.println("Enter the source currency(Currency I have) : ");
            // Accept the source currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            source = 0;
            System.out.println("Enter the target currency(Currency I want) : ");
            // Accept the target currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            target = 0;
            System.out.println("Enter the amount to be converted : ");
            //Accept the amount to be converted
            amountToBeConverted = 0;
            // Display the amount converted
            System.out.println("The converted exchange rate is : " + convertGivenCurrencyIntoDesiredCurrency(source, target, amountToBeConverted));
        } else {
            System.out.println("Thanks for checking into currency convertor");
        }
    }
}