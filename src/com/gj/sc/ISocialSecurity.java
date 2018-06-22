package com.gj.sc;

public interface ISocialSecurity {
    /**
     * 养老保险
     *
     * @param salary
     * @return
     */
    double yangLaoSecurity(double salary);

    /**
     * 医疗保险
     *
     * @param salary
     * @return
     */
    double yiLiaoSecurity(double salary);

    /**
     * 失业保险
     *
     * @param salary
     * @return
     */
    public double shiYeSecurity(double salary);
}
