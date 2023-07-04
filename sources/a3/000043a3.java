package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e7 extends f2 {

    /* renamed from: b  reason: collision with root package name */
    public final String f18524b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f18525c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(String message, Map<String, String> data) {
        super(null);
        kotlin.jvm.internal.s.g(message, "message");
        kotlin.jvm.internal.s.g(data, "data");
        this.f18524b = message;
        this.f18525c = data;
        this.f18526d = 4;
    }

    @Override // com.plaid.internal.f2
    public Map<String, String> a() {
        return this.f18525c;
    }

    @Override // com.plaid.internal.f2
    public int b() {
        return this.f18526d;
    }

    @Override // com.plaid.internal.f2
    public String c() {
        return this.f18524b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e7) {
            e7 e7Var = (e7) obj;
            return kotlin.jvm.internal.s.c(this.f18524b, e7Var.f18524b) && kotlin.jvm.internal.s.c(this.f18525c, e7Var.f18525c);
        }
        return false;
    }

    public int hashCode() {
        return this.f18525c.hashCode() + (this.f18524b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a11 = g4.a("NavigationBreadCrumb(message=");
        a11.append(this.f18524b);
        a11.append(", data=");
        a11.append(this.f18525c);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }
}