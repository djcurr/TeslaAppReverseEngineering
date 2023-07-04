package com.plaid.internal.classic.networking.adapter;

import com.adyen.checkout.components.model.payments.request.Address;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.plaid.link.result.LinkAccountType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class AccountTypeAdapter implements q<LinkAccountType>, j<LinkAccountType> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.j
    public LinkAccountType deserialize(k kVar, Type type, i iVar) {
        if (kVar == null) {
            return new LinkAccountType.UNKNOWN(Address.ADDRESS_NULL_PLACEHOLDER);
        }
        return LinkAccountType.Companion.convert(kVar.f());
    }

    @Override // com.google.gson.q
    public k serialize(LinkAccountType linkAccountType, Type type, p pVar) {
        return new o((linkAccountType == null || (r1 = linkAccountType.getJson()) == null) ? "" : "");
    }
}