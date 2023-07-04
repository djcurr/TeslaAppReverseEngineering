package com.plaid.internal;

/* loaded from: classes2.dex */
public final class e2 {

    /* renamed from: a  reason: collision with root package name */
    public final ja f18518a;

    public e2(ja plaidRetrofitFactory) {
        kotlin.jvm.internal.s.g(plaidRetrofitFactory, "plaidRetrofitFactory");
        this.f18518a = plaidRetrofitFactory;
    }

    public final c2 a(d2<?> crashApiClass) {
        kotlin.jvm.internal.s.g(crashApiClass, "crashApiClass");
        return a(crashApiClass.f18483a);
    }

    public final c2 a(String str) {
        if (kotlin.jvm.internal.s.c(str, wb.class.getSimpleName())) {
            return new wb(this.f18518a);
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Unknown crash api class: ", str));
    }
}