package net.time4j;

/* loaded from: classes5.dex */
final class i extends net.time4j.engine.e<g0> implements e {

    /* renamed from: a  reason: collision with root package name */
    static final i f41415a = new i();
    private static final long serialVersionUID = -6519899440006935829L;

    private i() {
        super("CALENDAR_DATE");
    }

    private Object readResolve() {
        return f41415a;
    }

    @Override // net.time4j.engine.p
    public Class<g0> getType() {
        return g0.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.engine.e
    protected boolean m() {
        return true;
    }

    @Override // net.time4j.engine.p
    /* renamed from: o */
    public g0 getDefaultMaximum() {
        return g0.f41283e;
    }

    @Override // net.time4j.engine.p
    /* renamed from: p */
    public g0 getDefaultMinimum() {
        return g0.f41282d;
    }
}