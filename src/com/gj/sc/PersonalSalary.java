package com.gj.sc;

public class PersonalSalary {

    private ISocialSecurity personalSocSecurity = new PersonalSocialSecurity();
    private ISocialSecurity companySocSecurity = new CompanySocialSecurity();
    private FaxCalc faxCalc = new FaxCalc();
    private GongjiJInCalc gongjiJInCalc = new GongjiJInCalc();

    private static double skipFaxFee(double skipFaxSalary) {
        return Math.max(skipFaxSalary * 0.02, 70);
    }

    /**
     * 计算工资
     *
     * @param salary          薪水
     * @param socSecurityBase 社保基数
     * @param skipFaxSalary   避税工资
     */
    public void salaryCalc(double salary, double socSecurityBase, double skipFaxSalary) {

        salary = salary - skipFaxSalary;
        socSecurityBase = Math.min(socSecurityBase, salary);

        double skipFaxFee = skipFaxFee(skipFaxSalary);
        double personalYangLao = personalSocSecurity.yangLaoSecurity(socSecurityBase);
        double personalYiLiao = personalSocSecurity.yiLiaoSecurity(socSecurityBase);

        double companyYangLao = companySocSecurity.yangLaoSecurity(socSecurityBase);
        double compnayYiLiao = companySocSecurity.yiLiaoSecurity(socSecurityBase);

        double personalYiBaoReceive = compnayYiLiao * 0.014;

        double gongJiJin = gongjiJInCalc.calcGongJiJin(salary);

        double faxSalary = salary - personalYangLao - personalYiLiao - gongJiJin;

        double fax = faxCalc.faxCalc(faxSalary);

        System.out.println("社保基数：" + socSecurityBase);
        System.out.println("养老个人交：" + personalYangLao);
        System.out.println("医疗个人交：" + personalYiLiao);
        System.out.println("公积金个人交：" + gongJiJin);

        System.out.println("养老公司交：" + companyYangLao);

        System.out.println("个人医保帐户：" + (personalYiBaoReceive + personalYiLiao));

        System.out.println("扣税工资：" + faxSalary);
        System.out.println("扣税：" + fax);
        System.out.println("避税手续费：" + skipFaxFee);


        double perMonthSalary = salary - personalYangLao - fax - gongJiJin + gongJiJin * 2 + skipFaxSalary - skipFaxFee + personalYiBaoReceive;
        double totalSalary = perMonthSalary + personalYangLao + companyYangLao;

        System.out.println("每月到手工资：" + perMonthSalary);
        System.out.println("工资收益（包括养老帐户）：" + totalSalary);

    }
}
