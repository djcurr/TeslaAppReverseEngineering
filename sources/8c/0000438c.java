package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d4 extends f2 {

    /* renamed from: b  reason: collision with root package name */
    public final String f18486b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f18487c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18488d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(String message, Map<String, String> data, int i11) {
        super(null);
        kotlin.jvm.internal.s.g(message, "message");
        kotlin.jvm.internal.s.g(data, "data");
        this.f18486b = message;
        this.f18487c = data;
        this.f18488d = i11;
    }

    @Override // com.plaid.internal.f2
    public Map<String, String> a() {
        return this.f18487c;
    }

    @Override // com.plaid.internal.f2
    public int b() {
        return this.f18488d;
    }

    @Override // com.plaid.internal.f2
    public String c() {
        return this.f18486b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d4) {
            d4 d4Var = (d4) obj;
            return kotlin.jvm.internal.s.c(this.f18486b, d4Var.f18486b) && kotlin.jvm.internal.s.c(this.f18487c, d4Var.f18487c) && this.f18488d == d4Var.f18488d;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f18487c.hashCode();
        return Integer.hashCode(this.f18488d) + ((hashCode + (this.f18486b.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder a11 = g4.a("InformationBreadCrumb(message=");
        a11.append(this.f18486b);
        a11.append(", data=");
        a11.append(this.f18487c);
        a11.append(", logLevel=");
        a11.append(this.f18488d);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }
}