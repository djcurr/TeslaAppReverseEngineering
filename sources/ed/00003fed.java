package com.plaid.internal;

import android.content.Context;
import android.content.res.Resources;
import com.plaid.internal.core.crashreporting.internal.models.Breadcrumb;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptionsKt;
import com.plaid.internal.core.crashreporting.internal.models.SentryProject;
import com.plaid.internal.k2;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class b9 {

    /* renamed from: a  reason: collision with root package name */
    public final c2 f18228a;

    /* renamed from: b  reason: collision with root package name */
    public final j2 f18229b;

    /* renamed from: c  reason: collision with root package name */
    public final q2 f18230c;

    public b9(Context context, SentryProject sentryProject, String sdkVersion, i2 crashProvider, ja retrofitFactory, g2 environmentProvider, h2 crashInterceptor) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(sentryProject, "sentryProject");
        kotlin.jvm.internal.s.g(sdkVersion, "sdkVersion");
        kotlin.jvm.internal.s.g(crashProvider, "crashProvider");
        kotlin.jvm.internal.s.g(retrofitFactory, "retrofitFactory");
        kotlin.jvm.internal.s.g(environmentProvider, "environmentProvider");
        kotlin.jvm.internal.s.g(crashInterceptor, "crashInterceptor");
        Resources resources = context.getResources();
        kotlin.jvm.internal.s.f(resources, "context.resources");
        CrashApiOptions crashOptions = CrashApiOptionsKt.toCrashOptions(sentryProject, resources, sdkVersion);
        c2 a11 = new e2(retrofitFactory).a(crashProvider.a());
        this.f18228a = a11;
        ((wb) a11).a(crashOptions);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "context.applicationContext");
        j2 j2Var = new j2(applicationContext, crashOptions, environmentProvider, null, 8);
        this.f18229b = j2Var;
        k2.a aVar = k2.f18917e;
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext2, "context.applicationContext");
        k2 a12 = aVar.a(applicationContext2, j2Var);
        Context applicationContext3 = context.getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext3, "context.applicationContext");
        q2 q2Var = new q2(applicationContext3, a12, crashProvider.a(), crashOptions);
        this.f18230c = q2Var;
        new z8(j2Var, q2Var, crashInterceptor).a();
    }

    public final void a(f2 crumb) {
        Map y11;
        Breadcrumb crumb2;
        kotlin.jvm.internal.s.g(crumb, "crumb");
        j2 j2Var = this.f18229b;
        if (crumb instanceof e7) {
            crumb2 = new Breadcrumb(Breadcrumb.Type.NAVIGATION, crumb.f18572a, crumb.a(crumb.b()), crumb.c(), null, crumb.a(), 16, null);
        } else if (crumb instanceof d4) {
            Breadcrumb.Type type = Breadcrumb.Type.DEFAULT;
            String c11 = crumb.c();
            Map<String, String> a11 = crumb.a();
            int b11 = crumb.b();
            y11 = wz.s0.y(a11);
            y11.put("level", crumb.a(b11).name());
            crumb2 = new Breadcrumb(type, crumb.f18572a, crumb.a(crumb.b()), c11, null, y11, 16, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        j2Var.getClass();
        kotlin.jvm.internal.s.g(crumb2, "crumb");
        hb<Breadcrumb> hbVar = j2Var.f18866e;
        if (hbVar.f18714a.get(hbVar.f18716c) != null) {
            hbVar.f18715b = (hbVar.f18715b + 1) % 50;
        }
        hbVar.f18714a.set(hbVar.f18716c, crumb2);
        hbVar.f18716c = (hbVar.f18716c + 1) % 50;
        int i11 = hbVar.f18717d;
        if (i11 != 50) {
            hbVar.f18717d = i11 + 1;
        }
    }
}