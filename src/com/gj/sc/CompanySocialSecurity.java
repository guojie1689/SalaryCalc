package com.gj.sc;

/**
 * 社会保险计算器
 */
public class CompanySocialSecurity implements ISocialSecurity {

    /**
     * 养老保险
     *
     * @param salary
     * @return
     */
    public double yangLaoSecurity(double salary) {
        return Math.min(salary * 0.2, 4392.42);
    }


    /**
     * 医疗保险
     *
     * @param salary
     * @return
     */
    public double yiLiaoSecurity(double salary) {
        return Math.min(salary * 0.1, 2311.8);
    }

    /**
     * 失业保险
     *
     * @param salary
     * @return
     */
    public double shiYeSecurity(double salary) {
        return Math.min(salary * 0.008, 184.944);
    }



}
