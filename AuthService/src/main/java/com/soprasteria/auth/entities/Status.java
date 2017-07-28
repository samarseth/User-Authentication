package com.soprasteria.auth.entities;

/**
 * Created by deearora on 7/20/2017.
 */
public enum Status {

    STATUS_OK(200);

    private int code;

    Status (int code)
    {
        this.code=code;
    }

    public int code()
    {
        return  code;
    }
}
