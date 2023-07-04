package com.plaid.gson;

import com.google.gson.e;
import com.google.gson.f;
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
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountType;
import com.plaid.link.result.LinkAccountVerificationStatus;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkErrorType;
import com.plaid.link.result.LinkExitMetadataStatus;
import com.plaid.link.result.LinkInstitution;
import h00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/google/gson/e;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class PlaidJsonConverter$gson$2 extends u implements a<e> {
    public static final PlaidJsonConverter$gson$2 INSTANCE = new PlaidJsonConverter$gson$2();

    PlaidJsonConverter$gson$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    /* renamed from: invoke */
    public final e mo11invoke() {
        f fVar = new f();
        fVar.c(LinkAccount.class, new RNAccountAdapter());
        fVar.c(LinkInstitution.class, new RNLinkInstitutionAdapter());
        fVar.c(LinkAccountType.class, new AccountTypeAdapter());
        fVar.c(LinkAccountSubtype.class, new AccountSubtypeAdapter());
        fVar.c(LinkAccountVerificationStatus.class, new LinkAccountVerificationStatusAdapter());
        fVar.c(LinkEventViewName.class, new LinkEventViewNameAdapter());
        fVar.c(LinkEventName.class, new LinkEventNameAdapter());
        fVar.c(LinkErrorCode.class, new PlaidErrorCodeAdapter());
        fVar.c(LinkErrorType.class, new PlaidErrorTypeAdapter());
        fVar.c(LinkExitMetadataStatus.class, new LinkExitMetadataStatusAdapter());
        return fVar.b();
    }
}