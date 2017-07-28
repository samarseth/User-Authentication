package com.soprasteria.auth.entities;

/**
 * Created by samarseth on 7/20/2017.
 */
public class LoginEntity {

    private int loginId;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    private String loginName;

    public String getLoginSecret() {
        return loginSecret;
    }

    public void setLoginSecret(String loginSecret) {
        this.loginSecret = loginSecret;
    }

    private String loginSecret;
}
