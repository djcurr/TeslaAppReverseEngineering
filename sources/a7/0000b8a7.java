package v20;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f53905a;

    /* renamed from: b  reason: collision with root package name */
    public final h00.l<Throwable, vz.b0> f53906b;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(Object obj, h00.l<? super Throwable, vz.b0> lVar) {
        this.f53905a = obj;
        this.f53906b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return kotlin.jvm.internal.s.c(this.f53905a, d0Var.f53905a) && kotlin.jvm.internal.s.c(this.f53906b, d0Var.f53906b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f53905a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f53906b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f53905a + ", onCancellation=" + this.f53906b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}