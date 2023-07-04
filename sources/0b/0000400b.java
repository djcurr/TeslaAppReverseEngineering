package com.plaid.internal.classic.networking.adapter;

import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.plaid.link.result.LinkExitMetadataStatus;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class LinkExitMetadataStatusAdapter implements q<LinkExitMetadataStatus>, j<LinkExitMetadataStatus> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.j
    public LinkExitMetadataStatus deserialize(k kVar, Type type, i iVar) {
        if (kVar == null) {
            return new LinkExitMetadataStatus.UNKNOWN("");
        }
        try {
            LinkExitMetadataStatus fromString = LinkExitMetadataStatus.Companion.fromString(kVar.f());
            return fromString == null ? new LinkExitMetadataStatus.UNKNOWN("") : fromString;
        } catch (Exception unused) {
            return new LinkExitMetadataStatus.UNKNOWN("");
        }
    }

    @Override // com.google.gson.q
    public k serialize(LinkExitMetadataStatus linkExitMetadataStatus, Type type, p pVar) {
        return new o((linkExitMetadataStatus == null || (r1 = linkExitMetadataStatus.getJsonValue()) == null) ? "" : "");
    }
}