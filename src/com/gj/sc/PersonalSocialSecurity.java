package com.gj.sc;

/**
 * 社会保险计算器
 */
public class PersonalSocialSecurity implements ISocialSecurity {

    /**
     * 养老保险
     *
     * @param salary
     * @return
     */
    public double yangLaoSecurity(double salary) {
        return Math.min(salary * 0.08, 1849.44);
    }


    /**
     * 医疗保险
     *
     * @param salary
     * @return
     */
    public double yiLiaoSecurity(double salary) {
        return Math.min(salary * 0.02 + 3, 465.36);
    }

    /**
     * 失业保险
     *
     * @param salary
     * @return
     */
    public double shiYeSecurity(double salary) {
        return Math.min(salary * 0.002, 46.236);
    }




}
