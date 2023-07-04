package kotlinx.coroutines.internal;

import v20.a2;

/* loaded from: classes5.dex */
public class d0<T> extends v20.a<T> implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: c  reason: collision with root package name */
    public final zz.d<T> f35453c;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(zz.g gVar, zz.d<? super T> dVar) {
        super(gVar, true, true);
        this.f35453c = dVar;
    }

    @Override // v20.a
    protected void W0(Object obj) {
        zz.d<T> dVar = this.f35453c;
        dVar.resumeWith(v20.f0.a(obj, dVar));
    }

    public final a2 a1() {
        v20.u c02 = c0();
        if (c02 == null) {
            return null;
        }
        return c02.getParent();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        zz.d<T> dVar = this.f35453c;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // v20.h2
    protected final boolean k0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v20.h2
    public void z(Object obj) {
        zz.d c11;
        c11 = a00.c.c(this.f35453c);
        j.c(c11, v20.f0.a(obj, this.f35453c), null, 2, null);
    }
}