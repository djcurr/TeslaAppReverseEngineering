package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;
import javax.net.SocketFactory;

/* loaded from: classes2.dex */
public final class la {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.gson.e f18981a;

    /* renamed from: b  reason: collision with root package name */
    public final SocketFactory f18982b;

    public la() {
        this(null, null, 3);
    }

    public la(com.google.gson.e eVar, SocketFactory socketFactory) {
        this.f18981a = eVar;
        this.f18982b = socketFactory;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof la) {
            la laVar = (la) obj;
            return kotlin.jvm.internal.s.c(this.f18981a, laVar.f18981a) && kotlin.jvm.internal.s.c(this.f18982b, laVar.f18982b);
        }
        return false;
    }

    public int hashCode() {
        com.google.gson.e eVar = this.f18981a;
        int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        SocketFactory socketFactory = this.f18982b;
        return hashCode + (socketFactory != null ? socketFactory.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a11 = g4.a("PlaidRetrofitOptions(gson=");
        a11.append(this.f18981a);
        a11.append(", socketFactory=");
        a11.append(this.f18982b);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    public /* synthetic */ la(com.google.gson.e eVar, SocketFactory socketFactory, int i11) {
        this((i11 & 1) != 0 ? null : eVar, null);
    }
}