package com.plaid.internal.classic.networking.adapter;

import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.plaid.link.result.LinkAccountVerificationStatus;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class LinkAccountVerificationStatusAdapter implements q<LinkAccountVerificationStatus>, j<LinkAccountVerificationStatus> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.j
    public LinkAccountVerificationStatus deserialize(k kVar, Type type, i iVar) {
        if (kVar == null) {
            return null;
        }
        return LinkAccountVerificationStatus.Companion.convert(kVar.f());
    }

    @Override // com.google.gson.q
    public k serialize(LinkAccountVerificationStatus linkAccountVerificationStatus, Type type, p pVar) {
        return new o((linkAccountVerificationStatus == null || (r1 = linkAccountVerificationStatus.getJson()) == null) ? "" : "");
    }
}