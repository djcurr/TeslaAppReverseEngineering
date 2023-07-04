package net.time4j;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;

/* loaded from: classes5.dex */
public enum x0 implements net.time4j.engine.n<net.time4j.base.a>, net.time4j.engine.u<g0> {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    private static final x0[] ENUMS = values();

    public static x0 parse(CharSequence charSequence, Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) {
        ParsePosition parsePosition = new ParsePosition(0);
        x0 x0Var = (x0) net.time4j.format.b.d(locale).p(vVar, mVar).c(charSequence, parsePosition, x0.class);
        if (x0Var != null) {
            return x0Var;
        }
        throw new ParseException("Cannot parse: " + ((Object) charSequence), parsePosition.getErrorIndex());
    }

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.v.WIDE, net.time4j.format.m.FORMAT);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public x0 next() {
        return roll(1);
    }

    public x0 previous() {
        return roll(-1);
    }

    public x0 roll(int i11) {
        return valueOf(((ordinal() + ((i11 % 7) + 7)) % 7) + 1);
    }

    public static x0 valueOf(int i11) {
        if (i11 >= 1 && i11 <= 7) {
            return ENUMS[i11 - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i11);
    }

    public static x0[] values(z0 z0Var) {
        x0[] x0VarArr = new x0[7];
        x0 f11 = z0Var.f();
        for (int i11 = 0; i11 < 7; i11++) {
            x0VarArr[i11] = f11;
            f11 = f11.next();
        }
        return x0VarArr;
    }

    @Override // net.time4j.engine.u
    public g0 apply(g0 g0Var) {
        return (g0) g0Var.z(g0.f41300z, this);
    }

    public String getDisplayName(Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.d(locale).p(vVar, mVar).g(this);
    }

    public int getValue(z0 z0Var) {
        return (((ordinal() + 7) - z0Var.f().ordinal()) % 7) + 1;
    }

    @Override // net.time4j.engine.n
    public boolean test(net.time4j.base.a aVar) {
        return net.time4j.base.b.c(aVar.getYear(), aVar.getMonth(), aVar.n()) == getValue();
    }

    public static x0 valueOf(int i11, z0 z0Var) {
        if (i11 >= 1 && i11 <= 7) {
            return ENUMS[((i11 - 1) + z0Var.f().ordinal()) % 7];
        }
        throw new IllegalArgumentException("Weekday out of range: " + i11);
    }

    public static x0 valueOf(int i11, c0 c0Var, int i12) {
        return valueOf(net.time4j.base.b.c(i11, c0Var.getValue(), i12));
    }
}