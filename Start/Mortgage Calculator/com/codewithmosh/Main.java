package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
        var consolePrompt = new ConsolePrompt();

        int principal = (int) consolePrompt.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) consolePrompt.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) consolePrompt.readNumber("Period (Years): ", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, years);
        var report = new MortgageReport(calculator);

        report.printMortgage();
        report.printPaymentSchedule();
    }
}
