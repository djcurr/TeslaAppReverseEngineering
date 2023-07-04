package com.facebook.react.bridge;

import java.lang.reflect.Method;
import xf.a;

@a
/* loaded from: classes3.dex */
public class ReactCxxErrorHandler {
    private static Method mHandleErrorFunc;
    private static Object mObject;

    @a
    private static void handleError(String str) {
        if (mHandleErrorFunc != null) {
            try {
                mHandleErrorFunc.invoke(mObject, new Exception(str));
            } catch (Exception e11) {
                nd.a.k("ReactCxxErrorHandler", "Failed to invole error hanlder function", e11);
            }
        }
    }

    @a
    public static void setHandleErrorFunc(Object obj, Method method) {
        mObject = obj;
        mHandleErrorFunc = method;
    }
}