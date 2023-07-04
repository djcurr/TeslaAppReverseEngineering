package com.stripe.android.stripe3ds2.observability;

import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.p;

/* loaded from: classes6.dex */
final class DefaultErrorReporter$createSentryAuthHeader$1 extends u implements l<p<? extends String, ? extends String>, CharSequence> {
    public static final DefaultErrorReporter$createSentryAuthHeader$1 INSTANCE = new DefaultErrorReporter$createSentryAuthHeader$1();

    DefaultErrorReporter$createSentryAuthHeader$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(p<String, String> dstr$key$value) {
        s.g(dstr$key$value, "$dstr$key$value");
        return dstr$key$value.a() + '=' + dstr$key$value.b();
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ CharSequence invoke(p<? extends String, ? extends String> pVar) {
        return invoke2((p<String, String>) pVar);
    }
}