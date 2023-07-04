package net.time4j;

import java.io.InvalidObjectException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class u extends b<Integer> implements k0<Integer, h0> {
    private static final long serialVersionUID = -1337148214680014674L;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f41601b;

    /* renamed from: c  reason: collision with root package name */
    private final transient Integer f41602c;

    /* renamed from: d  reason: collision with root package name */
    private final transient Integer f41603d;

    /* renamed from: e  reason: collision with root package name */
    private final transient char f41604e;

    private u(String str, int i11, Integer num, Integer num2, char c11) {
        super(str);
        this.f41601b = i11;
        this.f41602c = num;
        this.f41603d = num2;
        this.f41604e = c11;
        new l0(this, i11 == 5 || i11 == 7 || i11 == 9 || i11 == 13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u p(String str, boolean z11) {
        return new u(str, z11 ? 2 : 1, 1, Integer.valueOf(z11 ? 24 : 12), z11 ? 'k' : 'h');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u q(String str, int i11, int i12, int i13, char c11) {
        return new u(str, i11, Integer.valueOf(i12), Integer.valueOf(i13), c11);
    }

    private Object readResolve() {
        Object E0 = h0.E0(name());
        if (E0 != null) {
            return E0;
        }
        throw new InvalidObjectException(name());
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return this.f41604e;
    }

    @Override // net.time4j.engine.p
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return false;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return true;
    }

    @Override // net.time4j.k0
    public /* bridge */ /* synthetic */ p<h0> k(Integer num) {
        return super.o(num);
    }

    @Override // net.time4j.engine.e
    protected boolean m() {
        return true;
    }

    @Override // net.time4j.engine.p
    /* renamed from: r */
    public Integer getDefaultMaximum() {
        return this.f41603d;
    }

    @Override // net.time4j.engine.p
    /* renamed from: s */
    public Integer getDefaultMinimum() {
        return this.f41602c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int t() {
        return this.f41601b;
    }
}