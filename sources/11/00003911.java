package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final long f16700b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f16701c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    private static h f16702d;

    /* renamed from: a  reason: collision with root package name */
    private final xm.a f16703a;

    private h(xm.a aVar) {
        this.f16703a = aVar;
    }

    public static h c() {
        return d(xm.b.a());
    }

    public static h d(xm.a aVar) {
        if (f16702d == null) {
            f16702d = new h(aVar);
        }
        return f16702d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(String str) {
        return f16701c.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f16703a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(vm.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f16700b;
    }
}