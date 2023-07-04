package x20;

import ch.qos.logback.core.CoreConstants;
import kotlinx.coroutines.internal.f0;
import kotlinx.coroutines.internal.s;
import v20.r0;
import v20.s0;
import vz.b0;
import vz.q;

/* loaded from: classes5.dex */
public class y<E> extends w {

    /* renamed from: d  reason: collision with root package name */
    private final E f57020d;

    /* renamed from: e  reason: collision with root package name */
    public final v20.o<b0> f57021e;

    /* JADX WARN: Multi-variable type inference failed */
    public y(E e11, v20.o<? super b0> oVar) {
        this.f57020d = e11;
        this.f57021e = oVar;
    }

    @Override // x20.w
    public void V() {
        this.f57021e.U(v20.q.f53988a);
    }

    @Override // x20.w
    public E W() {
        return this.f57020d;
    }

    @Override // x20.w
    public void X(m<?> mVar) {
        v20.o<b0> oVar = this.f57021e;
        q.a aVar = vz.q.f54772b;
        oVar.resumeWith(vz.q.b(vz.r.a(mVar.f0())));
    }

    @Override // x20.w
    public f0 Y(s.c cVar) {
        Object h11 = this.f57021e.h(b0.f54756a, cVar == null ? null : cVar.f35507c);
        if (h11 == null) {
            return null;
        }
        if (r0.a()) {
            if (!(h11 == v20.q.f53988a)) {
                throw new AssertionError();
            }
        }
        if (cVar != null) {
            cVar.d();
        }
        return v20.q.f53988a;
    }

    @Override // kotlinx.coroutines.internal.s
    public String toString() {
        return s0.a(this) + '@' + s0.b(this) + CoreConstants.LEFT_PARENTHESIS_CHAR + W() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}