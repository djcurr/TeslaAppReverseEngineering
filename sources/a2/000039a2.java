package com.google.firebase.perf.util;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    private static final fn.a f17028b = fn.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f17029a;

    public d() {
        this(new Bundle());
    }

    private e<Integer> d(String str) {
        if (!a(str)) {
            return e.a();
        }
        try {
            return e.b((Integer) this.f17029a.get(str));
        } catch (ClassCastException e11) {
            f17028b.b("Metadata key %s contains type other than int: %s", str, e11.getMessage());
            return e.a();
        }
    }

    public boolean a(String str) {
        return str != null && this.f17029a.containsKey(str);
    }

    public e<Boolean> b(String str) {
        if (!a(str)) {
            return e.a();
        }
        try {
            return e.b((Boolean) this.f17029a.get(str));
        } catch (ClassCastException e11) {
            f17028b.b("Metadata key %s contains type other than boolean: %s", str, e11.getMessage());
            return e.a();
        }
    }

    public e<Float> c(String str) {
        if (!a(str)) {
            return e.a();
        }
        try {
            return e.b((Float) this.f17029a.get(str));
        } catch (ClassCastException e11) {
            f17028b.b("Metadata key %s contains type other than float: %s", str, e11.getMessage());
            return e.a();
        }
    }

    public e<Long> e(String str) {
        e<Integer> d11 = d(str);
        if (d11.d()) {
            return e.e(Long.valueOf(d11.c().intValue()));
        }
        return e.a();
    }

    public d(Bundle bundle) {
        this.f17029a = (Bundle) bundle.clone();
    }
}