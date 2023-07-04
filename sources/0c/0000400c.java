package com.plaid.internal.classic.networking.adapter;

import com.adyen.checkout.components.model.payments.request.Address;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkErrorType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class PlaidErrorCodeAdapter implements q<LinkErrorCode>, j<LinkErrorCode> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.j
    public LinkErrorCode deserialize(k kVar, Type type, i iVar) {
        if (kVar == null) {
            return new LinkErrorCode.UNKNOWN(Address.ADDRESS_NULL_PLACEHOLDER, new LinkErrorType.UNKNOWN(Address.ADDRESS_NULL_PLACEHOLDER));
        }
        try {
            return LinkErrorCode.Companion.convert(kVar.f());
        } catch (Exception unused) {
            return new LinkErrorCode.UNKNOWN(Address.ADDRESS_NULL_PLACEHOLDER, new LinkErrorType.UNKNOWN(Address.ADDRESS_NULL_PLACEHOLDER));
        }
    }

    @Override // com.google.gson.q
    public k serialize(LinkErrorCode linkErrorCode, Type type, p pVar) {
        return new o((linkErrorCode == null || (r1 = linkErrorCode.getJson()) == null) ? "" : "");
    }
}