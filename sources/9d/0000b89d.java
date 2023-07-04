package v20;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f53891a;

    /* renamed from: b  reason: collision with root package name */
    public final m f53892b;

    /* renamed from: c  reason: collision with root package name */
    public final h00.l<Throwable, vz.b0> f53893c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f53894d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f53895e;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(Object obj, m mVar, h00.l<? super Throwable, vz.b0> lVar, Object obj2, Throwable th2) {
        this.f53891a = obj;
        this.f53892b = mVar;
        this.f53893c = lVar;
        this.f53894d = obj2;
        this.f53895e = th2;
    }

    public static /* synthetic */ b0 b(b0 b0Var, Object obj, m mVar, h00.l lVar, Object obj2, Throwable th2, int i11, Object obj3) {
        if ((i11 & 1) != 0) {
            obj = b0Var.f53891a;
        }
        if ((i11 & 2) != 0) {
            mVar = b0Var.f53892b;
        }
        m mVar2 = mVar;
        h00.l<Throwable, vz.b0> lVar2 = lVar;
        if ((i11 & 4) != 0) {
            lVar2 = b0Var.f53893c;
        }
        h00.l lVar3 = lVar2;
        if ((i11 & 8) != 0) {
            obj2 = b0Var.f53894d;
        }
        Object obj4 = obj2;
        if ((i11 & 16) != 0) {
            th2 = b0Var.f53895e;
        }
        return b0Var.a(obj, mVar2, lVar3, obj4, th2);
    }

    public final b0 a(Object obj, m mVar, h00.l<? super Throwable, vz.b0> lVar, Object obj2, Throwable th2) {
        return new b0(obj, mVar, lVar, obj2, th2);
    }

    public final boolean c() {
        return this.f53895e != null;
    }

    public final void d(p<?> pVar, Throwable th2) {
        m mVar = this.f53892b;
        if (mVar != null) {
            pVar.k(mVar, th2);
        }
        h00.l<Throwable, vz.b0> lVar = this.f53893c;
        if (lVar == null) {
            return;
        }
        pVar.l(lVar, th2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            return kotlin.jvm.internal.s.c(this.f53891a, b0Var.f53891a) && kotlin.jvm.internal.s.c(this.f53892b, b0Var.f53892b) && kotlin.jvm.internal.s.c(this.f53893c, b0Var.f53893c) && kotlin.jvm.internal.s.c(this.f53894d, b0Var.f53894d) && kotlin.jvm.internal.s.c(this.f53895e, b0Var.f53895e);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f53891a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        m mVar = this.f53892b;
        int hashCode2 = (hashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        h00.l<Throwable, vz.b0> lVar = this.f53893c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f53894d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f53895e;
        return hashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f53891a + ", cancelHandler=" + this.f53892b + ", onCancellation=" + this.f53893c + ", idempotentResume=" + this.f53894d + ", cancelCause=" + this.f53895e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ b0(Object obj, m mVar, h00.l lVar, Object obj2, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? null : mVar, (i11 & 4) != 0 ? null : lVar, (i11 & 8) != 0 ? null : obj2, (i11 & 16) != 0 ? null : th2);
    }
}