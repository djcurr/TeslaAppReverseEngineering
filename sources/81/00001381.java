package com.adyen.threeds2.parameters;

import android.content.Context;

/* loaded from: classes.dex */
public final class ChallengeParameters {

    /* renamed from: a  reason: collision with root package name */
    private String f9716a;

    /* renamed from: b  reason: collision with root package name */
    private String f9717b;

    /* renamed from: c  reason: collision with root package name */
    private String f9718c;

    /* renamed from: d  reason: collision with root package name */
    private String f9719d;

    /* renamed from: e  reason: collision with root package name */
    private String f9720e;

    public static String getEmbeddedRequestorAppURL(Context context) {
        return "adyen3ds2://" + context.getPackageName();
    }

    public String get3DSServerTransactionID() {
        return this.f9716a;
    }

    public String getAcsRefNumber() {
        return this.f9718c;
    }

    public String getAcsSignedContent() {
        return this.f9719d;
    }

    public String getAcsTransactionID() {
        return this.f9717b;
    }

    public String getThreeDSRequestorAppURL() {
        return this.f9720e;
    }

    public void set3DSServerTransactionID(String str) {
        this.f9716a = str;
    }

    public void setAcsRefNumber(String str) {
        this.f9718c = str;
    }

    public void setAcsSignedContent(String str) {
        this.f9719d = str;
    }

    public void setAcsTransactionID(String str) {
        this.f9717b = str;
    }

    public void setThreeDSRequestorAppURL(String str) {
        this.f9720e = str;
    }
}