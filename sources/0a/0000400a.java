package com.plaid.internal.classic.networking.adapter;

import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.plaid.link.event.LinkEventViewName;
import java.lang.reflect.Type;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class LinkEventViewNameAdapter implements q<LinkEventViewName>, j<LinkEventViewName> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.j
    public LinkEventViewName deserialize(k kVar, Type type, i iVar) {
        if (kVar == null) {
            return new LinkEventViewName.UNKNOWN("");
        }
        String string = kVar.f();
        s.f(string, "json.asString");
        s.g(string, "string");
        LinkEventViewName fromString$link_sdk_release = LinkEventViewName.Companion.fromString$link_sdk_release(string);
        if (fromString$link_sdk_release == null) {
            String f11 = kVar.f();
            s.f(f11, "json.asString");
            return new LinkEventViewName.UNKNOWN(f11);
        }
        return fromString$link_sdk_release;
    }

    @Override // com.google.gson.q
    public k serialize(LinkEventViewName linkEventViewName, Type type, p pVar) {
        return new o((linkEventViewName == null || (r1 = linkEventViewName.getJsonValue()) == null) ? "" : "");
    }
}