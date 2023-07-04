package com.plaid.internal;

import android.os.Build;

/* loaded from: classes2.dex */
public final class d8 implements e3 {

    /* renamed from: a  reason: collision with root package name */
    public static final d8 f18493a = new d8();

    /* renamed from: b  reason: collision with root package name */
    public static final String f18494b = Build.ID;

    /* renamed from: c  reason: collision with root package name */
    public static final String f18495c = Build.MANUFACTURER;

    /* renamed from: d  reason: collision with root package name */
    public static final String f18496d = Build.MODEL;

    /* renamed from: e  reason: collision with root package name */
    public static final String f18497e = Build.DEVICE;

    /* renamed from: f  reason: collision with root package name */
    public static final String f18498f = Build.TYPE;

    /* renamed from: g  reason: collision with root package name */
    public static final String f18499g = Build.VERSION.RELEASE;

    /* renamed from: h  reason: collision with root package name */
    public static final String f18500h = Build.VERSION.CODENAME;

    /* renamed from: i  reason: collision with root package name */
    public static final int f18501i = Build.VERSION.SDK_INT;

    @Override // com.plaid.internal.e3
    public String a() {
        return f18500h;
    }

    @Override // com.plaid.internal.e3
    public String b() {
        return f18498f;
    }

    @Override // com.plaid.internal.e3
    public String c() {
        return f18494b;
    }

    @Override // com.plaid.internal.e3
    public int d() {
        return f18501i;
    }

    @Override // com.plaid.internal.e3
    public String e() {
        return f18497e;
    }

    @Override // com.plaid.internal.e3
    public String f() {
        return f18495c;
    }

    @Override // com.plaid.internal.e3
    public String g() {
        return f18499g;
    }

    @Override // com.plaid.internal.e3
    public String h() {
        return f18496d;
    }
}