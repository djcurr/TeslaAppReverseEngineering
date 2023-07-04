package net.time4j.format.expert;

import java.util.Locale;

/* loaded from: classes5.dex */
enum b0 implements net.time4j.engine.p<net.time4j.tz.k> {
    TIMEZONE_ID,
    TIMEZONE_OFFSET;

    public String getDisplayName(Locale locale) {
        String str = net.time4j.format.b.d(locale).m().get("L_zone");
        return str == null ? name() : str;
    }

    @Override // net.time4j.engine.p
    public char getSymbol() {
        return (char) 0;
    }

    @Override // net.time4j.engine.p
    public Class<net.time4j.tz.k> getType() {
        return net.time4j.tz.k.class;
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
        return false;
    }

    @Override // java.util.Comparator
    public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
        return oVar.o().a().compareTo(oVar2.o().a());
    }

    @Override // net.time4j.engine.p
    public net.time4j.tz.k getDefaultMaximum() {
        return net.time4j.tz.p.q(net.time4j.tz.f.AHEAD_OF_UTC, 14);
    }

    @Override // net.time4j.engine.p
    public net.time4j.tz.k getDefaultMinimum() {
        return net.time4j.tz.p.q(net.time4j.tz.f.BEHIND_UTC, 14);
    }
}