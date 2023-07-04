package com.plaid.internal.classic.networking.adapter;

import com.adyen.checkout.components.model.payments.request.Address;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.plaid.link.result.LinkErrorType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class PlaidErrorTypeAdapter implements q<LinkErrorType>, j<LinkErrorType> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.j
    public LinkErrorType deserialize(k kVar, Type type, i iVar) {
        if (kVar == null) {
            return new LinkErrorType.UNKNOWN(Address.ADDRESS_NULL_PLACEHOLDER);
        }
        try {
            return LinkErrorType.Companion.convert(kVar.f());
        } catch (Exception unused) {
            return new LinkErrorType.UNKNOWN(Address.ADDRESS_NULL_PLACEHOLDER);
        }
    }

    @Override // com.google.gson.q
    public k serialize(LinkErrorType linkErrorType, Type type, p pVar) {
        return new o((linkErrorType == null || (r1 = linkErrorType.getJson()) == null) ? "" : "");
    }
}