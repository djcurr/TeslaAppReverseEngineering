package v20;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public abstract class a<T> extends h2 implements a2, zz.d<T> {

    /* renamed from: b  reason: collision with root package name */
    private final zz.g f53885b;

    public a(zz.g gVar, boolean z11, boolean z12) {
        super(z12);
        if (z11) {
            h0((a2) gVar.get(a2.f53887l1));
        }
        this.f53885b = gVar.plus(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v20.h2
    protected final void A0(Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            X0(c0Var.f53902a, c0Var.a());
            return;
        }
        Y0(obj);
    }

    public zz.g J() {
        return this.f53885b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v20.h2
    public String K() {
        return kotlin.jvm.internal.s.p(s0.a(this), " was cancelled");
    }

    protected void W0(Object obj) {
        z(obj);
    }

    protected void X0(Throwable th2, boolean z11) {
    }

    protected void Y0(T t11) {
    }

    public final <R> void Z0(kotlinx.coroutines.a aVar, R r11, h00.p<? super R, ? super zz.d<? super T>, ? extends Object> pVar) {
        aVar.invoke(pVar, r11, this);
    }

    @Override // v20.h2, v20.a2
    public boolean a() {
        return super.a();
    }

    @Override // v20.h2
    public final void g0(Throwable th2) {
        l0.a(this.f53885b, th2);
    }

    @Override // zz.d
    public final zz.g getContext() {
        return this.f53885b;
    }

    @Override // zz.d
    public final void resumeWith(Object obj) {
        Object r02 = r0(f0.d(obj, null, 1, null));
        if (r02 == i2.f53949b) {
            return;
        }
        W0(r02);
    }

    @Override // v20.h2
    public String v0() {
        String b11 = i0.b(this.f53885b);
        if (b11 == null) {
            return super.v0();
        }
        return CoreConstants.DOUBLE_QUOTE_CHAR + b11 + "\":" + super.v0();
    }
}