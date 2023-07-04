package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import v20.r0;

/* loaded from: classes5.dex */
public final class b0 extends y20.c<z<?>> {

    /* renamed from: a  reason: collision with root package name */
    public long f35240a = -1;

    /* renamed from: b  reason: collision with root package name */
    public zz.d<? super vz.b0> f35241b;

    @Override // y20.c
    /* renamed from: c */
    public boolean a(z<?> zVar) {
        if (this.f35240a >= 0) {
            return false;
        }
        this.f35240a = zVar.W();
        return true;
    }

    @Override // y20.c
    /* renamed from: d */
    public Continuation<Unit>[] b(z<?> zVar) {
        if (r0.a()) {
            if (!(this.f35240a >= 0)) {
                throw new AssertionError();
            }
        }
        long j11 = this.f35240a;
        this.f35240a = -1L;
        this.f35241b = null;
        return zVar.V(j11);
    }
}