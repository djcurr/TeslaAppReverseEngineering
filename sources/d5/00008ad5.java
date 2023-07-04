package net.time4j.calendar;

/* loaded from: classes5.dex */
final class l extends net.time4j.engine.e<Integer> {

    /* renamed from: a  reason: collision with root package name */
    static final l f40901a = new l();
    private static final long serialVersionUID = -1117064522468823402L;

    private l() {
        super("RELATED_GREGORIAN_YEAR");
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return 'r';
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
    /* renamed from: o */
    public Integer getDefaultMaximum() {
        return 999999999;
    }

    @Override // net.time4j.engine.p
    /* renamed from: p */
    public Integer getDefaultMinimum() {
        return -999999999;
    }

    protected Object readResolve() {
        return f40901a;
    }
}