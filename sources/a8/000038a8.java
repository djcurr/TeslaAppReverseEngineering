package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f16466a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16467b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16468c;

    /* renamed from: d  reason: collision with root package name */
    public final String f16469d;

    /* renamed from: e  reason: collision with root package name */
    public final String f16470e;

    /* renamed from: f  reason: collision with root package name */
    public final String f16471f;

    /* renamed from: g  reason: collision with root package name */
    public final wl.e f16472g;

    public a(String str, String str2, String str3, String str4, String str5, String str6, wl.e eVar) {
        this.f16466a = str;
        this.f16467b = str2;
        this.f16468c = str3;
        this.f16469d = str4;
        this.f16470e = str5;
        this.f16471f = str6;
        this.f16472g = eVar;
    }

    public static a a(Context context, v vVar, String str, String str2, wl.e eVar) {
        String packageName = context.getPackageName();
        String g11 = vVar.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, g11, packageName, num, str3, eVar);
    }
}