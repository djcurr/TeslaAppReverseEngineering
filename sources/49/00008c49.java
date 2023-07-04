package net.time4j;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class w0 extends net.time4j.engine.f implements v, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final w0 f41605a = new w0();
    private static final long serialVersionUID = -4981215347844372171L;

    private w0() {
    }

    private Object readResolve() {
        return f41605a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.f
    public <T extends net.time4j.engine.q<T>> net.time4j.engine.k0<T> a(net.time4j.engine.w<T> wVar) {
        if (wVar.v(g0.f41292n)) {
            return a1.A();
        }
        return null;
    }

    @Override // net.time4j.engine.v
    public double getLength() {
        return f.YEARS.getLength();
    }

    @Override // net.time4j.x
    public char getSymbol() {
        return 'Y';
    }

    @Override // net.time4j.engine.v
    public boolean isCalendrical() {
        return true;
    }

    public String toString() {
        return "WEEK_BASED_YEARS";
    }
}