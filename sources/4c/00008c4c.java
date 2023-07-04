package net.time4j;

import java.io.InvalidObjectException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class y extends b<Long> implements k0<Long, h0> {

    /* renamed from: d  reason: collision with root package name */
    static final net.time4j.engine.p<Long> f41606d = new y();
    private static final long serialVersionUID = 5930990958663061693L;

    /* renamed from: b  reason: collision with root package name */
    private final transient Long f41607b;

    /* renamed from: c  reason: collision with root package name */
    private final transient Long f41608c;

    private y() {
        this("DAY_OVERFLOW", Long.MIN_VALUE, Long.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y p(String str, long j11, long j12) {
        return new y(str, j11, j12);
    }

    private Object readResolve() {
        Object E0 = h0.E0(name());
        if (E0 == null) {
            if (name().equals("DAY_OVERFLOW")) {
                return f41606d;
            }
            throw new InvalidObjectException(name());
        }
        return E0;
    }

    @Override // net.time4j.engine.p
    public Class<Long> getType() {
        return Long.class;
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
    public /* bridge */ /* synthetic */ p<h0> k(Long l11) {
        return super.o(l11);
    }

    @Override // net.time4j.engine.p
    /* renamed from: q */
    public Long getDefaultMaximum() {
        return this.f41608c;
    }

    @Override // net.time4j.engine.p
    /* renamed from: r */
    public Long getDefaultMinimum() {
        return this.f41607b;
    }

    private y(String str, long j11, long j12) {
        super(str);
        this.f41607b = Long.valueOf(j11);
        this.f41608c = Long.valueOf(j12);
        new l0(this, true);
    }
}