package com.plaid.internal;

import com.plaid.internal.classic.networking.adapter.AccountSubtypeAdapter;
import com.plaid.internal.classic.networking.adapter.AccountTypeAdapter;
import com.plaid.internal.classic.networking.adapter.LinkAccountVerificationStatusAdapter;
import com.plaid.internal.classic.networking.adapter.LinkEventNameAdapter;
import com.plaid.internal.classic.networking.adapter.LinkEventViewNameAdapter;
import com.plaid.internal.classic.networking.adapter.LinkExitMetadataStatusAdapter;
import com.plaid.internal.classic.networking.adapter.PlaidErrorCodeAdapter;
import com.plaid.internal.classic.networking.adapter.PlaidErrorTypeAdapter;
import com.plaid.link.event.LinkEventName;
import com.plaid.link.event.LinkEventViewName;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountType;
import com.plaid.link.result.LinkAccountVerificationStatus;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkErrorType;
import com.plaid.link.result.LinkExitMetadataStatus;

/* loaded from: classes2.dex */
public final class z9 implements tw.e<com.google.gson.e> {

    /* renamed from: a  reason: collision with root package name */
    public final v9 f19964a;

    public z9(v9 v9Var) {
        this.f19964a = v9Var;
    }

    @Override // javax.inject.Provider
    public Object get() {
        this.f19964a.getClass();
        com.google.gson.f fVar = new com.google.gson.f();
        fVar.c(LinkEventViewName.class, new LinkEventViewNameAdapter());
        fVar.c(LinkEventName.class, new LinkEventNameAdapter());
        fVar.c(LinkAccountType.class, new AccountTypeAdapter());
        fVar.c(LinkAccountSubtype.class, new AccountSubtypeAdapter());
        fVar.c(LinkErrorCode.class, new PlaidErrorCodeAdapter());
        fVar.c(LinkErrorType.class, new PlaidErrorTypeAdapter());
        fVar.c(LinkAccountVerificationStatus.class, new LinkAccountVerificationStatusAdapter());
        fVar.c(LinkExitMetadataStatus.class, new LinkExitMetadataStatusAdapter());
        com.google.gson.e b11 = fVar.b();
        kotlin.jvm.internal.s.f(b11, "GsonBuilder().apply {\n  …pter()\n    )\n  }.create()");
        return (com.google.gson.e) tw.h.e(b11);
    }
}