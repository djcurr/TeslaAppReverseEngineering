package net.time4j;

/* loaded from: classes5.dex */
final class y0 extends a<Integer> implements e0 {

    /* renamed from: b  reason: collision with root package name */
    static final y0 f41609b = new y0();
    private static final long serialVersionUID = -2378018589067147278L;

    private y0() {
        super("WEEKDAY_IN_MONTH");
    }

    private Object readResolve() {
        return f41609b;
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return 'F';
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

    @Override // net.time4j.engine.e
    protected boolean m() {
        return true;
    }

    @Override // net.time4j.engine.p
    /* renamed from: p */
    public Integer getDefaultMaximum() {
        return 5;
    }

    @Override // net.time4j.engine.p
    /* renamed from: q */
    public Integer getDefaultMinimum() {
        return 1;
    }
}