package m0;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t1.h0;
import t1.q0;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private h0 f37835a;

    /* renamed from: b  reason: collision with root package name */
    private t1.u f37836b;

    /* renamed from: c  reason: collision with root package name */
    private v1.a f37837c;

    /* renamed from: d  reason: collision with root package name */
    private q0 f37838d;

    public c() {
        this(null, null, null, null, 15, null);
    }

    public c(h0 h0Var, t1.u uVar, v1.a aVar, q0 q0Var) {
        this.f37835a = h0Var;
        this.f37836b = uVar;
        this.f37837c = aVar;
        this.f37838d = q0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return kotlin.jvm.internal.s.c(this.f37835a, cVar.f37835a) && kotlin.jvm.internal.s.c(this.f37836b, cVar.f37836b) && kotlin.jvm.internal.s.c(this.f37837c, cVar.f37837c) && kotlin.jvm.internal.s.c(this.f37838d, cVar.f37838d);
        }
        return false;
    }

    public final q0 g() {
        q0 q0Var = this.f37838d;
        if (q0Var == null) {
            q0 a11 = t1.n.a();
            this.f37838d = a11;
            return a11;
        }
        return q0Var;
    }

    public int hashCode() {
        h0 h0Var = this.f37835a;
        int hashCode = (h0Var == null ? 0 : h0Var.hashCode()) * 31;
        t1.u uVar = this.f37836b;
        int hashCode2 = (hashCode + (uVar == null ? 0 : uVar.hashCode())) * 31;
        v1.a aVar = this.f37837c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        q0 q0Var = this.f37838d;
        return hashCode3 + (q0Var != null ? q0Var.hashCode() : 0);
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.f37835a + ", canvas=" + this.f37836b + ", canvasDrawScope=" + this.f37837c + ", borderPath=" + this.f37838d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ c(h0 h0Var, t1.u uVar, v1.a aVar, q0 q0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : uVar, (i11 & 4) != 0 ? null : aVar, (i11 & 8) != 0 ? null : q0Var);
    }
}