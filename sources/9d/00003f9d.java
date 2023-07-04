package com.plaid.gson;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.q;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkAccountVerificationStatus;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/plaid/gson/RNAccountAdapter;", "Lcom/google/gson/q;", "Lcom/plaid/link/result/LinkAccount;", "src", "Ljava/lang/reflect/Type;", "typeOfSrc", "Lcom/google/gson/p;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/google/gson/k;", "serialize", "<init>", "()V", "react-native-plaid-link-sdk_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class RNAccountAdapter implements q<LinkAccount> {
    @Override // com.google.gson.q
    public k serialize(LinkAccount linkAccount, Type type, p pVar) {
        k a11;
        k a12;
        m c11;
        if (linkAccount == null) {
            return new m();
        }
        m mVar = new m();
        mVar.n("id", linkAccount.getId());
        mVar.n("name", linkAccount.getName());
        String mask = linkAccount.getMask();
        if (mask != null) {
            mVar.n("mask", mask);
        }
        LinkAccountVerificationStatus verificationStatus = linkAccount.getVerificationStatus();
        if (verificationStatus != null && pVar != null && (a12 = pVar.a(verificationStatus)) != null && (c11 = a12.c()) != null) {
            mVar.n("verification_status", c11.p("json").f());
        }
        m c12 = (pVar == null || (a11 = pVar.a(linkAccount.getSubtype())) == null) ? null : a11.c();
        if (c12 != null) {
            k p11 = c12.p("accountType");
            mVar.n("type", p11 == null ? null : p11.f());
            k p12 = c12.p("json");
            mVar.n("subtype", p12 != null ? p12.f() : null);
        }
        return mVar;
    }
}