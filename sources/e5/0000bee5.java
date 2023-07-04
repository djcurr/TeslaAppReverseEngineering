package x20;

import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.f0;
import kotlinx.coroutines.internal.s;
import v20.r0;
import v20.s0;

/* loaded from: classes5.dex */
public final class m<E> extends w implements u<E> {

    /* renamed from: d  reason: collision with root package name */
    public final Throwable f57017d;

    public m(Throwable th2) {
        this.f57017d = th2;
    }

    @Override // x20.w
    public void V() {
    }

    @Override // x20.w
    public void X(m<?> mVar) {
        if (r0.a()) {
            throw new AssertionError();
        }
    }

    @Override // x20.w
    public f0 Y(s.c cVar) {
        f0 f0Var = v20.q.f53988a;
        if (cVar != null) {
            cVar.d();
        }
        return f0Var;
    }

    @Override // x20.u
    /* renamed from: b0 */
    public m<E> b() {
        return this;
    }

    @Override // x20.w
    /* renamed from: c0 */
    public m<E> W() {
        return this;
    }

    public final Throwable d0() {
        Throwable th2 = this.f57017d;
        return th2 == null ? new ClosedReceiveChannelException("Channel was closed") : th2;
    }

    public final Throwable f0() {
        Throwable th2 = this.f57017d;
        return th2 == null ? new ClosedSendChannelException("Channel was closed") : th2;
    }

    @Override // x20.u
    public void i(E e11) {
    }

    @Override // x20.u
    public f0 q(E e11, s.c cVar) {
        f0 f0Var = v20.q.f53988a;
        if (cVar != null) {
            cVar.d();
        }
        return f0Var;
    }

    @Override // kotlinx.coroutines.internal.s
    public String toString() {
        return "Closed@" + s0.b(this) + '[' + this.f57017d + ']';
    }
}