package vl;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import sl.a;
import sm.a;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a */
    private final sm.a<sl.a> f54520a;

    /* renamed from: b */
    private volatile xl.a f54521b;

    /* renamed from: c */
    private volatile yl.b f54522c;

    /* renamed from: d */
    private final List<yl.a> f54523d;

    public d(sm.a<sl.a> aVar) {
        this(aVar, new yl.c(), new xl.f());
    }

    public static /* synthetic */ void a(d dVar, sm.b bVar) {
        dVar.i(bVar);
    }

    public static /* synthetic */ void b(d dVar, String str, Bundle bundle) {
        dVar.g(str, bundle);
    }

    public static /* synthetic */ void c(d dVar, yl.a aVar) {
        dVar.h(aVar);
    }

    private void f() {
        this.f54520a.a(new a.InterfaceC1119a() { // from class: vl.a
            {
                d.this = this;
            }

            @Override // sm.a.InterfaceC1119a
            public final void a(sm.b bVar) {
                d.a(d.this, bVar);
            }
        });
    }

    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f54521b.a(str, bundle);
    }

    public /* synthetic */ void h(yl.a aVar) {
        synchronized (this) {
            if (this.f54522c instanceof yl.c) {
                this.f54523d.add(aVar);
            }
            this.f54522c.a(aVar);
        }
    }

    public /* synthetic */ void i(sm.b bVar) {
        wl.f.f().b("AnalyticsConnector now available.");
        sl.a aVar = (sl.a) bVar.get();
        xl.e eVar = new xl.e(aVar);
        e eVar2 = new e();
        if (j(aVar, eVar2) != null) {
            wl.f.f().b("Registered Firebase Analytics listener.");
            xl.d dVar = new xl.d();
            xl.c cVar = new xl.c(eVar, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (yl.a aVar2 : this.f54523d) {
                    dVar.a(aVar2);
                }
                eVar2.d(dVar);
                eVar2.e(cVar);
                this.f54522c = dVar;
                this.f54521b = cVar;
            }
            return;
        }
        wl.f.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    private static a.InterfaceC1118a j(sl.a aVar, e eVar) {
        a.InterfaceC1118a d11 = aVar.d("clx", eVar);
        if (d11 == null) {
            wl.f.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            d11 = aVar.d(AppMeasurement.CRASH_ORIGIN, eVar);
            if (d11 != null) {
                wl.f.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return d11;
    }

    public xl.a d() {
        return new xl.a() { // from class: vl.b
            {
                d.this = this;
            }

            @Override // xl.a
            public final void a(String str, Bundle bundle) {
                d.b(d.this, str, bundle);
            }
        };
    }

    public yl.b e() {
        return new yl.b() { // from class: vl.c
            {
                d.this = this;
            }

            @Override // yl.b
            public final void a(yl.a aVar) {
                d.c(d.this, aVar);
            }
        };
    }

    public d(sm.a<sl.a> aVar, yl.b bVar, xl.a aVar2) {
        this.f54520a = aVar;
        this.f54522c = bVar;
        this.f54523d = new ArrayList();
        this.f54521b = aVar2;
        f();
    }
}