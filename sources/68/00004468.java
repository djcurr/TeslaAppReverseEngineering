package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes2.dex */
public final class k7 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f18927a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18928b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18929c;

    public k7(boolean z11, long j11, long j12) {
        this.f18927a = z11;
        this.f18928b = j11;
        this.f18929c = j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k7) {
            k7 k7Var = (k7) obj;
            return this.f18927a == k7Var.f18927a && this.f18928b == k7Var.f18928b && this.f18929c == k7Var.f18929c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public int hashCode() {
        boolean z11 = this.f18927a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int hashCode = Long.hashCode(this.f18928b);
        return Long.hashCode(this.f18929c) + ((hashCode + (r02 * 31)) * 31);
    }

    public String toString() {
        StringBuilder a11 = g4.a("OAuthPollingOptions(shouldPoll=");
        a11.append(this.f18927a);
        a11.append(", interval=");
        a11.append(this.f18928b);
        a11.append(", maxDuration=");
        a11.append(this.f18929c);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }
}