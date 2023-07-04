package com.alipay.apmobilesecuritysdk.b;

import r8.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static a f10150b = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f10151a = 0;

    public static a a() {
        return f10150b;
    }

    public static String a(String str, String str2) {
        return str + str2;
    }

    public final void a(int i11) {
        this.f10151a = i11;
    }

    public final int b() {
        return this.f10151a;
    }

    public final String c() {
        String str;
        String a11 = d.a();
        if (x9.a.f(a11)) {
            return a11;
        }
        int i11 = this.f10151a;
        if (i11 == 1) {
            str = "://mobilegw.stable.alipay.net/mgw.htm";
        } else if (i11 == 2) {
            return "https://mobilegwpre.alipay.com/mgw.htm";
        } else {
            if (i11 == 3) {
                str = "://mobilegw-1-64.test.alipay.net/mgw.htm";
            } else if (i11 != 4) {
                return "https://mobilegw.alipay.com/mgw.htm";
            } else {
                str = "://mobilegw.aaa.alipay.net/mgw.htm";
            }
        }
        return a("http", str);
    }
}