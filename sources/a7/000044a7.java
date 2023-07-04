package com.plaid.internal;

import android.view.View;

/* loaded from: classes2.dex */
public final class mc extends kotlin.jvm.internal.u implements h00.l<String, vz.b0> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ oc f19049a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(oc ocVar) {
        super(1);
        this.f19049a = ocVar;
    }

    @Override // h00.l
    public vz.b0 invoke(String str) {
        String tag = str;
        kotlin.jvm.internal.s.g(tag, "tag");
        sa saVar = this.f19049a.f19183e;
        if (saVar == null) {
            kotlin.jvm.internal.s.x("binding");
            saVar = null;
        }
        View findViewWithTag = saVar.f19439d.findViewWithTag(tag);
        findViewWithTag.requestFocus();
        findViewWithTag.requestFocusFromTouch();
        return vz.b0.f54756a;
    }
}