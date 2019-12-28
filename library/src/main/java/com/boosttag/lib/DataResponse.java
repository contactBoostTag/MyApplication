package com.boosttag.lib;

/**
 *
 * @author Boosttag E.I.R.L.
 * @version 1.0.a 28/12/2019
 * @since 1.0.a
 */
public abstract class DataResponse {

    private String data;

    protected DataResponse(String data)  {
        this.data = data;
    }

    protected String getData() {
        return data;
    }

    protected void setData(String data) {
        this.data = data;
    }
}