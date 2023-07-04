package net.time4j;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;

/* loaded from: classes5.dex */
public enum m0 implements net.time4j.engine.n<net.time4j.base.a>, net.time4j.engine.u<g0> {
    Q1,
    Q2,
    Q3,
    Q4;
    
    private static final m0[] ENUMS = values();

    public static m0 parse(CharSequence charSequence, Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) {
        ParsePosition parsePosition = new ParsePosition(0);
        m0 m0Var = (m0) net.time4j.format.b.d(locale).k(vVar, mVar).c(charSequence, parsePosition, m0.class);
        if (m0Var != null) {
            return m0Var;
        }
        throw new ParseException("Cannot parse: " + ((Object) charSequence), parsePosition.getErrorIndex());
    }

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.v.WIDE, net.time4j.format.m.FORMAT);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public m0 next() {
        return roll(1);
    }

    public m0 previous() {
        return roll(-1);
    }

    public m0 roll(int i11) {
        return valueOf(((ordinal() + ((i11 % 4) + 4)) % 4) + 1);
    }

    public static m0 valueOf(int i11) {
        if (i11 >= 1 && i11 <= 4) {
            return ENUMS[i11 - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i11);
    }

    @Override // net.time4j.engine.u
    public g0 apply(g0 g0Var) {
        return (g0) g0Var.z(g0.f41296t, this);
    }

    public String getDisplayName(Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.d(locale).k(vVar, mVar).g(this);
    }

    @Override // net.time4j.engine.n
    public boolean test(net.time4j.base.a aVar) {
        return getValue() == ((aVar.getMonth() - 1) / 3) + 1;
    }
}