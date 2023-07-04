package com.plaid.internal.classic.networking.adapter;

import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.q;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class AccountSubtypeAdapter implements q<LinkAccountSubtype>, j<LinkAccountSubtype> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.j
    public LinkAccountSubtype deserialize(k kVar, Type type, i iVar) {
        if (kVar == null) {
            return new LinkAccountSubtype.UNKNOWN("", new LinkAccountType.UNKNOWN(""));
        }
        try {
            m c11 = kVar.c();
            return LinkAccountSubtype.Companion.convert(c11.p("subtype").f(), c11.p("type").f());
        } catch (Exception unused) {
            return new LinkAccountSubtype.UNKNOWN("", new LinkAccountType.UNKNOWN(""));
        }
    }

    @Override // com.google.gson.q
    public k serialize(LinkAccountSubtype linkAccountSubtype, Type type, p pVar) {
        k a11;
        if (pVar != null && (a11 = pVar.a(linkAccountSubtype)) != null) {
            a11.c();
        }
        if (linkAccountSubtype == null) {
            return new m();
        }
        m mVar = new m();
        mVar.n("type", linkAccountSubtype.getAccountType().getJson());
        mVar.n("subtype", linkAccountSubtype.getJson());
        return mVar;
    }
}