package io.sentry;

import java.io.Writer;

/* loaded from: classes5.dex */
public final class v0 extends io.sentry.vendor.gson.stream.c {

    /* renamed from: l  reason: collision with root package name */
    private final u0 f32658l;

    public v0(Writer writer, int i11) {
        super(writer);
        this.f32658l = new u0(i11);
    }

    public v0 P0(String str) {
        super.D(str);
        return this;
    }

    public v0 Q0(d0 d0Var, Object obj) {
        this.f32658l.a(this, d0Var, obj);
        return this;
    }
}