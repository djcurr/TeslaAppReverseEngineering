package com.google.gson;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class o extends k {

    /* renamed from: a */
    private final Object f17208a;

    public o(Boolean bool) {
        this.f17208a = on.a.b(bool);
    }

    private static boolean r(o oVar) {
        Object obj = oVar.f17208a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    @Override // com.google.gson.k
    public long e() {
        return s() ? p().longValue() : Long.parseLong(f());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f17208a == null) {
            return oVar.f17208a == null;
        } else if (r(this) && r(oVar)) {
            return p().longValue() == oVar.p().longValue();
        } else {
            Object obj2 = this.f17208a;
            if ((obj2 instanceof Number) && (oVar.f17208a instanceof Number)) {
                double doubleValue = p().doubleValue();
                double doubleValue2 = oVar.p().doubleValue();
                if (doubleValue != doubleValue2) {
                    return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
                }
                return true;
            }
            return obj2.equals(oVar.f17208a);
        }
    }

    @Override // com.google.gson.k
    public String f() {
        if (s()) {
            return p().toString();
        }
        if (q()) {
            return ((Boolean) this.f17208a).toString();
        }
        return (String) this.f17208a;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f17208a == null) {
            return 31;
        }
        if (r(this)) {
            doubleToLongBits = p().longValue();
        } else {
            Object obj = this.f17208a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(p().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean m() {
        if (q()) {
            return ((Boolean) this.f17208a).booleanValue();
        }
        return Boolean.parseBoolean(f());
    }

    public double n() {
        return s() ? p().doubleValue() : Double.parseDouble(f());
    }

    public int o() {
        return s() ? p().intValue() : Integer.parseInt(f());
    }

    public Number p() {
        Object obj = this.f17208a;
        return obj instanceof String ? new on.g((String) obj) : (Number) obj;
    }

    public boolean q() {
        return this.f17208a instanceof Boolean;
    }

    public boolean s() {
        return this.f17208a instanceof Number;
    }

    public boolean t() {
        return this.f17208a instanceof String;
    }

    public o(Number number) {
        this.f17208a = on.a.b(number);
    }

    public o(String str) {
        this.f17208a = on.a.b(str);
    }
}