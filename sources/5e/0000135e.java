package com.adyen.threeds2.internal;

import android.content.Context;
import java.util.UUID;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final atd.k0.a f9631a;

    /* renamed from: b  reason: collision with root package name */
    private String f9632b;

    static {
        atd.s0.a.a(-104112966134336L);
    }

    private e(Context context, atd.k0.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f9631a = aVar;
        b(applicationContext);
    }

    public static e a(Context context, atd.k0.a aVar) {
        return new e(context, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return a(atd.s0.a.a(-105328441879104L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Context context) {
        this.f9632b = a(context);
    }

    private void b(Context context) {
        String a11 = this.f9631a.a(context, atd.s0.a.a(-104937599855168L));
        if (a11 == null) {
            a11 = a(context);
        }
        this.f9632b = a11;
    }

    public String a() {
        return a(this.f9632b);
    }

    private String a(Context context) {
        String b11 = b(UUID.randomUUID().toString());
        this.f9631a.a(context, atd.s0.a.a(-104800160901696L), b11);
        return b11;
    }

    private String a(String str) {
        return atd.r0.g.a(str);
    }

    private String b(String str) {
        return atd.r0.g.b(str);
    }
}