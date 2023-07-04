package com.stripe.android.financialconnections.repository;

import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.c;
import vz.b0;

/* loaded from: classes2.dex */
final class FinancialConnectionsApiRepository$json$1 extends u implements l<c, b0> {
    public static final FinancialConnectionsApiRepository$json$1 INSTANCE = new FinancialConnectionsApiRepository$json$1();

    FinancialConnectionsApiRepository$json$1() {
        super(1);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(c cVar) {
        invoke2(cVar);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(c Json) {
        s.g(Json, "$this$Json");
        Json.c(true);
        Json.e(true);
        Json.f(true);
        Json.d(true);
    }
}