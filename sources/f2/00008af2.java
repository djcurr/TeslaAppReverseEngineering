package net.time4j.engine;

import java.util.Locale;

/* loaded from: classes5.dex */
public enum a0 implements p<Boolean> {
    LEAP_SECOND,
    DAYLIGHT_SAVING;

    public String getDisplayName(Locale locale) {
        return name();
    }

    @Override // net.time4j.engine.p
    public char getSymbol() {
        return (char) 0;
    }

    @Override // net.time4j.engine.p
    public Class<Boolean> getType() {
        return Boolean.class;
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
    public int compare(o oVar, o oVar2) {
        boolean q11 = oVar.q(this);
        if (q11 == oVar2.q(this)) {
            return 0;
        }
        return q11 ? 1 : -1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.time4j.engine.p
    public Boolean getDefaultMaximum() {
        return Boolean.TRUE;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.time4j.engine.p
    public Boolean getDefaultMinimum() {
        return Boolean.FALSE;
    }
}