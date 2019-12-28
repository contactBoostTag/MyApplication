package com.boosttag.lib;

/**
 *
 * @author Boosttag E.I.R.L.
 * @version 1.0.a 28/12/2019
 * @since 1.0.a
 */
public abstract class Callback<T extends DataResponse> {

    public abstract void throwError(APIException exception);

    public abstract void response(T bean);
}
