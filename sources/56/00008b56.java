package net.time4j.format.expert;

import java.math.BigDecimal;
import java.util.Locale;

/* loaded from: classes5.dex */
enum k implements net.time4j.engine.p<BigDecimal> {
    FRACTION;

    public String getDisplayName(Locale locale) {
        return name();
    }

    @Override // net.time4j.engine.p
    public char getSymbol() {
        return (char) 0;
    }

    @Override // net.time4j.engine.p
    public Class<BigDecimal> getType() {
        return BigDecimal.class;
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
        return ((BigDecimal) oVar.l(this)).compareTo((BigDecimal) oVar2.l(this));
    }

    @Override // net.time4j.engine.p
    public BigDecimal getDefaultMaximum() {
        return BigDecimal.ONE;
    }

    @Override // net.time4j.engine.p
    public BigDecimal getDefaultMinimum() {
        return BigDecimal.ZERO;
    }
}