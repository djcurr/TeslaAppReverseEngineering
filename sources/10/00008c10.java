package net.time4j;

/* loaded from: classes5.dex */
final class q0 extends net.time4j.engine.e<h0> implements u0 {

    /* renamed from: a  reason: collision with root package name */
    static final q0 f41498a = new q0();
    private static final long serialVersionUID = -3712256393866098916L;

    private q0() {
        super("WALL_TIME");
    }

    private Object readResolve() {
        return f41498a;
    }

    @Override // net.time4j.engine.p
    public Class<h0> getType() {
        return h0.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return false;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return true;
    }

    @Override // net.time4j.engine.e
    protected boolean m() {
        return true;
    }

    @Override // net.time4j.engine.p
    /* renamed from: o */
    public h0 getDefaultMaximum() {
        return h0.N0(23, 59, 59, 999999999);
    }

    @Override // net.time4j.engine.p
    /* renamed from: p */
    public h0 getDefaultMinimum() {
        return h0.f41325m;
    }
}