package net.time4j;

import java.text.ParsePosition;
import java.util.Locale;

/* loaded from: classes5.dex */
enum d implements c1<a0>, k30.e<a0> {
    AM_PM_OF_DAY;

    private net.time4j.format.s accessor(net.time4j.engine.d dVar) {
        return net.time4j.format.b.d((Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT)).h((net.time4j.format.v) dVar.b(net.time4j.format.a.f40999g, net.time4j.format.v.WIDE), (net.time4j.format.m) dVar.b(net.time4j.format.a.f41000h, net.time4j.format.m.FORMAT));
    }

    static a0 parseAmPm(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int i11 = index + 2;
        if (charSequence.length() >= i11) {
            char charAt = charSequence.charAt(index + 1);
            if (charAt == 'M' || charAt == 'm') {
                char charAt2 = charSequence.charAt(index);
                if (charAt2 == 'A' || charAt2 == 'a') {
                    parsePosition.setIndex(i11);
                    return a0.AM;
                } else if (charAt2 == 'P' || charAt2 == 'p') {
                    parsePosition.setIndex(i11);
                    return a0.PM;
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public net.time4j.engine.s<b0, a0> at(net.time4j.tz.p pVar) {
        return new d1(this, pVar);
    }

    public net.time4j.engine.s<b0, a0> atUTC() {
        return at(net.time4j.tz.p.f41597k);
    }

    public String getDisplayName(Locale locale) {
        String str = net.time4j.format.b.d(locale).m().get("L_dayperiod");
        return str == null ? name() : str;
    }

    @Override // net.time4j.engine.p
    public char getSymbol() {
        return 'a';
    }

    @Override // net.time4j.engine.p
    public Class<a0> getType() {
        return a0.class;
    }

    public net.time4j.engine.s<b0, a0> in(net.time4j.tz.l lVar) {
        return new d1(this, lVar);
    }

    public net.time4j.engine.s<b0, a0> inStdTimezone() {
        return in(net.time4j.tz.l.O());
    }

    public net.time4j.engine.s<b0, a0> inTimezone(net.time4j.tz.k kVar) {
        return in(net.time4j.tz.l.N(kVar));
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return false;
    }

    @Override // net.time4j.engine.p
    public boolean isLenient() {
        return false;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return true;
    }

    @Override // net.time4j.format.t
    public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) {
        appendable.append(accessor(dVar).g((Enum) oVar.l(this)));
    }

    @Override // java.util.Comparator
    public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
        return ((a0) oVar.l(this)).compareTo((a0) oVar2.l(this));
    }

    @Override // net.time4j.engine.p
    public a0 getDefaultMaximum() {
        return a0.PM;
    }

    @Override // net.time4j.engine.p
    public a0 getDefaultMinimum() {
        return a0.AM;
    }

    @Override // k30.e
    public void print(net.time4j.engine.o oVar, Appendable appendable, Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) {
        appendable.append(accessor(locale, vVar, mVar).g((Enum) oVar.l(this)));
    }

    @Override // net.time4j.format.t
    public a0 parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        a0 parseAmPm = parseAmPm(charSequence, parsePosition);
        return parseAmPm == null ? (a0) accessor(dVar).d(charSequence, parsePosition, getType(), dVar) : parseAmPm;
    }

    private net.time4j.format.s accessor(Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.d(locale).h(vVar, mVar);
    }

    @Override // k30.e
    public a0 parse(CharSequence charSequence, ParsePosition parsePosition, Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar, net.time4j.format.g gVar) {
        a0 parseAmPm = parseAmPm(charSequence, parsePosition);
        return parseAmPm == null ? (a0) accessor(locale, vVar, mVar).e(charSequence, parsePosition, getType(), gVar) : parseAmPm;
    }
}