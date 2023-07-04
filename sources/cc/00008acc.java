package net.time4j.calendar;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.calendar.f;
import net.time4j.engine.y;
import net.time4j.format.t;

/* loaded from: classes5.dex */
class i<D extends f<?, D>> implements t<o>, y<D, o>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final i f40899a = new i();
    private static final long serialVersionUID = 4572549754637955194L;

    i() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <D extends f<?, D>> i<D> l() {
        return f40899a;
    }

    @Override // java.util.Comparator
    /* renamed from: c */
    public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
        return ((o) oVar.l(this)).compareTo((o) oVar2.l(this));
    }

    @Override // net.time4j.engine.y
    /* renamed from: f */
    public net.time4j.engine.p<?> getChildAtCeiling(D d11) {
        throw new AbstractMethodError();
    }

    @Override // net.time4j.engine.y
    /* renamed from: g */
    public net.time4j.engine.p<?> getChildAtFloor(D d11) {
        throw new AbstractMethodError();
    }

    @Override // net.time4j.engine.p
    public char getSymbol() {
        return (char) 0;
    }

    @Override // net.time4j.engine.p
    public Class<o> getType() {
        return o.class;
    }

    @Override // net.time4j.engine.p
    /* renamed from: i */
    public o getDefaultMaximum() {
        return o.MAJOR_12_DAHAN_300;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isLenient() {
        return false;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.engine.p
    /* renamed from: j */
    public o getDefaultMinimum() {
        return o.MINOR_01_LICHUN_315;
    }

    @Override // net.time4j.engine.y
    /* renamed from: m */
    public o getMaximum(D d11) {
        d T = d11.T();
        return o.of(T.m(T.p(d11.U(), d11.e0().getNumber()) + d11.i0()));
    }

    @Override // net.time4j.engine.p
    public String name() {
        return "SOLAR_TERM";
    }

    @Override // net.time4j.engine.y
    /* renamed from: o */
    public o getMinimum(D d11) {
        d T = d11.T();
        return o.of(T.m(T.p(d11.U(), d11.e0().getNumber()) + 1));
    }

    @Override // net.time4j.engine.y
    /* renamed from: p */
    public o getValue(D d11) {
        return o.of(d11.T().m(d11.b() + 1));
    }

    @Override // net.time4j.format.t
    public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) {
        appendable.append(((o) oVar.l(this)).getDisplayName((Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT)));
    }

    @Override // net.time4j.engine.y
    /* renamed from: q */
    public boolean isValid(D d11, o oVar) {
        return oVar != null;
    }

    @Override // net.time4j.format.t
    /* renamed from: r */
    public o parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        Locale locale = (Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT);
        int length = charSequence.length();
        if (parsePosition.getIndex() >= length) {
            parsePosition.setErrorIndex(length);
            return null;
        }
        return o.parse(charSequence, locale, parsePosition);
    }

    protected Object readResolve() {
        return f40899a;
    }

    @Override // net.time4j.engine.y
    /* renamed from: s */
    public D withValue(D d11, o oVar, boolean z11) {
        if (oVar != null) {
            return (D) d11.A(oVar.sinceNewYear());
        }
        throw new IllegalArgumentException("Missing solar term.");
    }
}