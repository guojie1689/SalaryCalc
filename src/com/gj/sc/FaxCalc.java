package com.gj.sc;

/**
 * 扣税
 */
public class FaxCalc {

    public double faxCalc(double salary) {

        double faxSalary = salary - 3500;

        if (faxSalary <= 1500) {
            return faxSalary * 0.03 - 0;
        } else if (faxSalary > 1500 && faxSalary <= 4500) {
            return faxSalary * 0.1 - 105;
        } else if (faxSalary > 4500 && faxSalary <= 9000) {
            return faxSalary * 0.2 - 555;
        } else if (faxSalary >= 9000 && faxSalary <= 35000) {
            return faxSalary * 0.25 - 1005;
        } else if (faxSalary >= 35000 && faxSalary <= 55000) {
            return faxSalary * 0.3 - 2755;
        } else if (faxSalary > 55000 && faxSalary <= 80000) {
            return faxSalary * 0.35 - 5505;
        } else {
            return faxSalary * 0.45 - 13505;
        }
    }

}
