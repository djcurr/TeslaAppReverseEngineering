package com.google.firebase.crashlytics.internal.common;

import am.a0;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, Integer> f16573e;

    /* renamed from: f  reason: collision with root package name */
    static final String f16574f;

    /* renamed from: a  reason: collision with root package name */
    private final Context f16575a;

    /* renamed from: b  reason: collision with root package name */
    private final v f16576b;

    /* renamed from: c  reason: collision with root package name */
    private final a f16577c;

    /* renamed from: d  reason: collision with root package name */
    private final im.d f16578d;

    static {
        HashMap hashMap = new HashMap();
        f16573e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f16574f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.2.9");
    }

    public n(Context context, v vVar, a aVar, im.d dVar) {
        this.f16575a = context;
        this.f16576b = vVar;
        this.f16577c = aVar;
        this.f16578d = dVar;
    }

    private a0.b a() {
        return am.a0.b().h("18.2.9").d(this.f16577c.f16466a).e(this.f16576b.a()).b(this.f16577c.f16470e).c(this.f16577c.f16471f).g(4);
    }

    private static int e() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f16573e.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private a0.e.d.a.b.AbstractC0017a f() {
        return a0.e.d.a.b.AbstractC0017a.a().b(0L).d(0L).c(this.f16577c.f16469d).e(this.f16577c.f16467b).a();
    }

    private am.b0<a0.e.d.a.b.AbstractC0017a> g() {
        return am.b0.c(f());
    }

    private a0.e.d.a h(int i11, a0.a aVar) {
        return a0.e.d.a.a().b(Boolean.valueOf(aVar.b() != 100)).f(i11).d(m(aVar)).a();
    }

    private a0.e.d.a i(int i11, im.e eVar, Thread thread, int i12, int i13, boolean z11) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo j11 = g.j(this.f16577c.f16469d, this.f16575a);
        if (j11 != null) {
            bool = Boolean.valueOf(j11.importance != 100);
        } else {
            bool = null;
        }
        return a0.e.d.a.a().b(bool).f(i11).d(n(eVar, thread, i12, i13, z11)).a();
    }

    private a0.e.d.c j(int i11) {
        d a11 = d.a(this.f16575a);
        Float b11 = a11.b();
        Double valueOf = b11 != null ? Double.valueOf(b11.doubleValue()) : null;
        int c11 = a11.c();
        boolean o11 = g.o(this.f16575a);
        return a0.e.d.c.a().b(valueOf).c(c11).f(o11).e(i11).g(g.s() - g.a(this.f16575a)).d(g.b(Environment.getDataDirectory().getPath())).a();
    }

    private a0.e.d.a.b.c k(im.e eVar, int i11, int i12) {
        return l(eVar, i11, i12, 0);
    }

    private a0.e.d.a.b.c l(im.e eVar, int i11, int i12, int i13) {
        String str = eVar.f30476b;
        String str2 = eVar.f30475a;
        StackTraceElement[] stackTraceElementArr = eVar.f30477c;
        int i14 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        im.e eVar2 = eVar.f30478d;
        if (i13 >= i12) {
            im.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f30478d;
                i14++;
            }
        }
        a0.e.d.a.b.c.AbstractC0020a d11 = a0.e.d.a.b.c.a().f(str).e(str2).c(am.b0.b(p(stackTraceElementArr, i11))).d(i14);
        if (eVar2 != null && i14 == 0) {
            d11.b(l(eVar2, i11, i12, i13 + 1));
        }
        return d11.a();
    }

    private a0.e.d.a.b m(a0.a aVar) {
        return a0.e.d.a.b.a().b(aVar).e(u()).c(g()).a();
    }

    private a0.e.d.a.b n(im.e eVar, Thread thread, int i11, int i12, boolean z11) {
        return a0.e.d.a.b.a().f(x(eVar, thread, i11, z11)).d(k(eVar, i11, i12)).e(u()).c(g()).a();
    }

    private a0.e.d.a.b.AbstractC0023e.AbstractC0025b o(StackTraceElement stackTraceElement, a0.e.d.a.b.AbstractC0023e.AbstractC0025b.AbstractC0026a abstractC0026a) {
        long j11 = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j11 = stackTraceElement.getLineNumber();
        }
        return abstractC0026a.e(max).f(str).b(fileName).d(j11).a();
    }

    private am.b0<a0.e.d.a.b.AbstractC0023e.AbstractC0025b> p(StackTraceElement[] stackTraceElementArr, int i11) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(o(stackTraceElement, a0.e.d.a.b.AbstractC0023e.AbstractC0025b.a().c(i11)));
        }
        return am.b0.b(arrayList);
    }

    private a0.e.a q() {
        return a0.e.a.a().e(this.f16576b.f()).g(this.f16577c.f16470e).d(this.f16577c.f16471f).f(this.f16576b.a()).b(this.f16577c.f16472g.d()).c(this.f16577c.f16472g.e()).a();
    }

    private a0.e r(String str, long j11) {
        return a0.e.a().l(j11).i(str).g(f16574f).b(q()).k(t()).d(s()).h(3).a();
    }

    private a0.e.c s() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int e11 = e();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long s11 = g.s();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean y11 = g.y(this.f16575a);
        int m11 = g.m(this.f16575a);
        String str = Build.MANUFACTURER;
        return a0.e.c.a().b(e11).f(Build.MODEL).c(availableProcessors).h(s11).d(blockCount).i(y11).j(m11).e(str).g(Build.PRODUCT).a();
    }

    private a0.e.AbstractC0028e t() {
        return a0.e.AbstractC0028e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(g.z(this.f16575a)).a();
    }

    private a0.e.d.a.b.AbstractC0021d u() {
        return a0.e.d.a.b.AbstractC0021d.a().d("0").c("0").b(0L).a();
    }

    private a0.e.d.a.b.AbstractC0023e v(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return w(thread, stackTraceElementArr, 0);
    }

    private a0.e.d.a.b.AbstractC0023e w(Thread thread, StackTraceElement[] stackTraceElementArr, int i11) {
        return a0.e.d.a.b.AbstractC0023e.a().d(thread.getName()).c(i11).b(am.b0.b(p(stackTraceElementArr, i11))).a();
    }

    private am.b0<a0.e.d.a.b.AbstractC0023e> x(im.e eVar, Thread thread, int i11, boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(w(thread, eVar.f30477c, i11));
        if (z11) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(v(key, this.f16578d.a(entry.getValue())));
                }
            }
        }
        return am.b0.b(arrayList);
    }

    public a0.e.d b(a0.a aVar) {
        int i11 = this.f16575a.getResources().getConfiguration().orientation;
        return a0.e.d.a().f("anr").e(aVar.h()).b(h(i11, aVar)).c(j(i11)).a();
    }

    public a0.e.d c(Throwable th2, Thread thread, String str, long j11, int i11, int i12, boolean z11) {
        int i13 = this.f16575a.getResources().getConfiguration().orientation;
        return a0.e.d.a().f(str).e(j11).b(i(i13, new im.e(th2, this.f16578d), thread, i11, i12, z11)).c(j(i13)).a();
    }

    public am.a0 d(String str, long j11) {
        return a().i(r(str, j11)).a();
    }
}