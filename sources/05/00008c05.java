package net.time4j;

/* loaded from: classes5.dex */
public enum n0 implements net.time4j.engine.v {
    SECONDS(1.0d),
    NANOSECONDS(1.0E-9d);
    
    private final double length;

    /* loaded from: classes5.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41480a;

        static {
            int[] iArr = new int[n0.values().length];
            f41480a = iArr;
            try {
                iArr[n0.SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41480a[n0.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    n0(double d11) {
        this.length = d11;
    }

    public long between(b0 b0Var, b0 b0Var2) {
        b0.S(b0Var);
        b0.S(b0Var2);
        int i11 = a.f41480a[ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                m30.f fVar = m30.f.UTC;
                return net.time4j.base.c.f(net.time4j.base.c.i(net.time4j.base.c.m(b0Var2.d(fVar), b0Var.d(fVar)), 1000000000L), b0Var2.a() - b0Var.a());
            }
            throw new UnsupportedOperationException();
        }
        m30.f fVar2 = m30.f.UTC;
        long d11 = b0Var2.d(fVar2) - b0Var.d(fVar2);
        int i12 = (d11 > 0L ? 1 : (d11 == 0L ? 0 : -1));
        return i12 < 0 ? b0Var2.a() > b0Var.a() ? d11 + 1 : d11 : (i12 <= 0 || b0Var2.a() >= b0Var.a()) ? d11 : d11 - 1;
    }

    @Override // net.time4j.engine.v
    public double getLength() {
        return this.length;
    }

    @Override // net.time4j.engine.v
    public boolean isCalendrical() {
        return false;
    }
}