package com.stripe.android.stripe3ds2.init;

/* loaded from: classes6.dex */
public interface ConfigParameters {
    void addParam(String str, String str2, String str3);

    String getParamValue(String str, String str2);

    String removeParam(String str, String str2);
}