package n2;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final w2.d f40315a;

    /* renamed from: b  reason: collision with root package name */
    private final w2.f f40316b;

    /* renamed from: c  reason: collision with root package name */
    private final long f40317c;

    /* renamed from: d  reason: collision with root package name */
    private final w2.i f40318d;

    private n(w2.d dVar, w2.f fVar, long j11, w2.i iVar) {
        this.f40315a = dVar;
        this.f40316b = fVar;
        this.f40317c = j11;
        this.f40318d = iVar;
        if (x2.r.e(c(), x2.r.f56957b.a())) {
            return;
        }
        if (x2.r.h(c()) >= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + x2.r.h(c()) + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public /* synthetic */ n(w2.d dVar, w2.f fVar, long j11, w2.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, fVar, j11, iVar);
    }

    public static /* synthetic */ n b(n nVar, w2.d dVar, w2.f fVar, long j11, w2.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = nVar.d();
        }
        if ((i11 & 2) != 0) {
            fVar = nVar.e();
        }
        w2.f fVar2 = fVar;
        if ((i11 & 4) != 0) {
            j11 = nVar.c();
        }
        long j12 = j11;
        if ((i11 & 8) != 0) {
            iVar = nVar.f40318d;
        }
        return nVar.a(dVar, fVar2, j12, iVar);
    }

    public final n a(w2.d dVar, w2.f fVar, long j11, w2.i iVar) {
        return new n(dVar, fVar, j11, iVar, null);
    }

    public final long c() {
        return this.f40317c;
    }

    public final w2.d d() {
        return this.f40315a;
    }

    public final w2.f e() {
        return this.f40316b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return kotlin.jvm.internal.s.c(d(), nVar.d()) && kotlin.jvm.internal.s.c(e(), nVar.e()) && x2.r.e(c(), nVar.c()) && kotlin.jvm.internal.s.c(this.f40318d, nVar.f40318d);
        }
        return false;
    }

    public final w2.i f() {
        return this.f40318d;
    }

    public final n g(n nVar) {
        long c11;
        if (nVar == null) {
            return this;
        }
        if (x2.s.g(nVar.c())) {
            c11 = c();
        } else {
            c11 = nVar.c();
        }
        long j11 = c11;
        w2.i iVar = nVar.f40318d;
        if (iVar == null) {
            iVar = this.f40318d;
        }
        w2.i iVar2 = iVar;
        w2.d d11 = nVar.d();
        if (d11 == null) {
            d11 = d();
        }
        w2.d dVar = d11;
        w2.f e11 = nVar.e();
        if (e11 == null) {
            e11 = e();
        }
        return new n(dVar, e11, j11, iVar2, null);
    }

    public int hashCode() {
        w2.d d11 = d();
        int k11 = (d11 == null ? 0 : w2.d.k(d11.m())) * 31;
        w2.f e11 = e();
        int j11 = (((k11 + (e11 == null ? 0 : w2.f.j(e11.l()))) * 31) + x2.r.i(c())) * 31;
        w2.i iVar = this.f40318d;
        return j11 + (iVar != null ? iVar.hashCode() : 0);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + d() + ", textDirection=" + e() + ", lineHeight=" + ((Object) x2.r.j(c())) + ", textIndent=" + this.f40318d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}