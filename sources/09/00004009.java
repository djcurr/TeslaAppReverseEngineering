package com.plaid.internal.classic.networking.adapter;

import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.plaid.link.event.LinkEventName;
import java.lang.reflect.Type;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class LinkEventNameAdapter implements q<LinkEventName>, j<LinkEventName> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.j
    public LinkEventName deserialize(k kVar, Type type, i iVar) {
        if (kVar == null) {
            return new LinkEventName.UNKNOWN("");
        }
        String string = kVar.f();
        s.f(string, "json.asString");
        s.g(string, "string");
        return LinkEventName.Companion.fromString$link_sdk_release(string);
    }

    @Override // com.google.gson.q
    public k serialize(LinkEventName linkEventName, Type type, p pVar) {
        return new o((linkEventName == null || (r1 = linkEventName.getJson()) == null) ? "" : "");
    }
}