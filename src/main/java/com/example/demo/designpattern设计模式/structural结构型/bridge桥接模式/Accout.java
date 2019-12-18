package com.example.demo.designpattern设计模式.structural结构型.bridge桥接模式;

/**
 * 账户
 *
 */
public interface Accout {

    /**
     * 打开账号？ 中国工商 | 中国农业
     * @return
     */
    Accout openAccount();

    /**
     * 查看账号类型， 活期储蓄 | 定期储蓄
     */
    void showAccountType();

}