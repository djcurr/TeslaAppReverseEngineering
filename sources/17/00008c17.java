package net.time4j;

import java.io.InvalidObjectException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class t extends a<Integer> implements k0<Integer, g0> {
    private static final long serialVersionUID = -1337148214680014674L;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f41519b;

    /* renamed from: c  reason: collision with root package name */
    private final transient Integer f41520c;

    /* renamed from: d  reason: collision with root package name */
    private final transient Integer f41521d;

    /* renamed from: e  reason: collision with root package name */
    private final transient char f41522e;

    private t(String str, int i11, Integer num, Integer num2, char c11) {
        super(str);
        this.f41519b = i11;
        this.f41520c = num;
        this.f41521d = num2;
        this.f41522e = c11;
        new l0(this, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t p(String str, int i11, int i12, int i13, char c11) {
        return new t(str, i11, Integer.valueOf(i12), Integer.valueOf(i13), c11);
    }

    private Object readResolve() {
        Object L0 = g0.L0(name());
        if (L0 != null) {
            return L0;
        }
        throw new InvalidObjectException(name());
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return this.f41522e;
    }

    @Override // net.time4j.engine.p
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.k0
    public /* bridge */ /* synthetic */ p<g0> k(Integer num) {
        return super.o(num);
    }

    @Override // net.time4j.engine.e
    protected boolean m() {
        return true;
    }

    @Override // net.time4j.engine.p
    /* renamed from: q */
    public Integer getDefaultMaximum() {
        return this.f41521d;
    }

    @Override // net.time4j.engine.p
    /* renamed from: r */
    public Integer getDefaultMinimum() {
        return this.f41520c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int s() {
        return this.f41519b;
    }
}