package com.plaid.internal;

import android.content.Context;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import java.io.File;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes2.dex */
public final class k2 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f18917e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ra f18918a;

    /* renamed from: b  reason: collision with root package name */
    public final j2 f18919b;

    /* renamed from: c  reason: collision with root package name */
    public final com.google.gson.e f18920c;

    /* renamed from: d  reason: collision with root package name */
    public final Type f18921d;

    /* loaded from: classes2.dex */
    public static final class a {
        public final k2 a(Context application, j2 crashReportFactory) {
            kotlin.jvm.internal.s.g(application, "application");
            kotlin.jvm.internal.s.g(crashReportFactory, "crashReportFactory");
            File filesDir = application.getFilesDir();
            kotlin.jvm.internal.s.f(filesDir, "application.filesDir");
            return new k2(new e9(filesDir, "plaid-sdk/crashes"), crashReportFactory);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends com.google.gson.reflect.a<List<? extends Crash>> {
    }

    public k2(ra storage, j2 crashReportFactory) {
        kotlin.jvm.internal.s.g(storage, "storage");
        kotlin.jvm.internal.s.g(crashReportFactory, "crashReportFactory");
        this.f18918a = storage;
        this.f18919b = crashReportFactory;
        this.f18920c = new com.google.gson.e();
        this.f18921d = new b().getType();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.plaid.internal.k2 r4, java.lang.String r5, java.lang.reflect.Type r6, zz.d r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof com.plaid.internal.n2
            if (r0 == 0) goto L16
            r0 = r7
            com.plaid.internal.n2 r0 = (com.plaid.internal.n2) r0
            int r1 = r0.f19058e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f19058e = r1
            goto L1b
        L16:
            com.plaid.internal.n2 r0 = new com.plaid.internal.n2
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.f19056c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19058e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r4 = r0.f19055b
            r6 = r4
            java.lang.reflect.Type r6 = (java.lang.reflect.Type) r6
            java.lang.Object r4 = r0.f19054a
            com.plaid.internal.k2 r4 = (com.plaid.internal.k2) r4
            vz.r.b(r7)
            goto L4f
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3d:
            vz.r.b(r7)
            com.plaid.internal.ra r7 = r4.f18918a
            r0.f19054a = r4
            r0.f19055b = r6
            r0.f19058e = r3
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r1) goto L4f
            goto L5c
        L4f:
            java.lang.String r7 = (java.lang.String) r7
            com.google.gson.e r4 = r4.f18920c
            java.lang.Object r1 = r4.i(r7, r6)
            java.lang.String r4 = "gson.fromJson(dataString, eventType)"
            kotlin.jvm.internal.s.f(r1, r4)
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.k2.a(com.plaid.internal.k2, java.lang.String, java.lang.reflect.Type, zz.d):java.lang.Object");
    }
}