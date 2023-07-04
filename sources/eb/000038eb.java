package com.google.firebase.crashlytics.ndk;

import am.c0;
import android.content.Context;

/* loaded from: classes3.dex */
public class d implements wl.a {

    /* renamed from: e */
    private static d f16625e;

    /* renamed from: a */
    private final b f16626a;

    /* renamed from: b */
    private boolean f16627b;

    /* renamed from: c */
    private String f16628c;

    /* renamed from: d */
    private a f16629d;

    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    d(b bVar, boolean z11) {
        this.f16626a = bVar;
        this.f16627b = z11;
    }

    public static /* synthetic */ void e(d dVar, String str, String str2, long j11, c0 c0Var) {
        dVar.g(str, str2, j11, c0Var);
    }

    public static d f(Context context, boolean z11) {
        d dVar = new d(new b(context, new JniNativeApi(context), new dm.f(context)), z11);
        f16625e = dVar;
        return dVar;
    }

    public /* synthetic */ void g(String str, String str2, long j11, c0 c0Var) {
        wl.f f11 = wl.f.f();
        f11.b("Initializing native session: " + str);
        if (this.f16626a.d(str, str2, j11, c0Var)) {
            return;
        }
        wl.f f12 = wl.f.f();
        f12.k("Failed to initialize Crashlytics NDK for session " + str);
    }

    @Override // wl.a
    public wl.g a(String str) {
        return new h(this.f16626a.a(str));
    }

    @Override // wl.a
    public boolean b() {
        String str = this.f16628c;
        return str != null && d(str);
    }

    @Override // wl.a
    public synchronized void c(final String str, final String str2, final long j11, final c0 c0Var) {
        this.f16628c = str;
        a aVar = new a() { // from class: com.google.firebase.crashlytics.ndk.c
            {
                d.this = this;
            }

            @Override // com.google.firebase.crashlytics.ndk.d.a
            public final void a() {
                d.e(d.this, str, str2, j11, c0Var);
            }
        };
        this.f16629d = aVar;
        if (this.f16627b) {
            aVar.a();
        }
    }

    @Override // wl.a
    public boolean d(String str) {
        return this.f16626a.c(str);
    }
}