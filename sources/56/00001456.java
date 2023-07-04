package com.alipay.sdk.app;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static EnumC0192a f10231a = EnumC0192a.ONLINE;

    /* renamed from: com.alipay.sdk.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0192a {
        ONLINE,
        PRE_SANDBOX,
        SANDBOX
    }

    public static boolean a() {
        return f10231a == EnumC0192a.SANDBOX;
    }

    public static boolean b() {
        return f10231a == EnumC0192a.PRE_SANDBOX;
    }

    public static boolean c() {
        return b() || a();
    }
}