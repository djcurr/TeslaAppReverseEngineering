package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes2.dex */
public final class wd extends kotlin.jvm.internal.u implements h00.a<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ vd f19701a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(vd vdVar) {
        super(0);
        this.f19701a = vdVar;
    }

    @Override // h00.a
    public String invoke() {
        return this.f19701a.f19648a + CoreConstants.COLON_CHAR + this.f19701a.f19649b;
    }
}