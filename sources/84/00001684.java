package com.facebook.hermes.intl;

import java.util.Arrays;

/* loaded from: classes3.dex */
public class i {

    /* loaded from: classes3.dex */
    public enum a {
        BOOLEAN,
        STRING
    }

    public static Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        if (ye.d.n(obj)) {
            return obj4;
        }
        if (ye.d.k(obj)) {
            double f11 = ye.d.f(obj);
            if (Double.isNaN(f11) || f11 > ye.d.f(obj3) || f11 < ye.d.f(obj2)) {
                throw new JSRangeErrorException("Invalid number value !");
            }
            return obj;
        }
        throw new JSRangeErrorException("Invalid number value !");
    }

    public static Object b(Object obj, String str, Object obj2, Object obj3, Object obj4) {
        return a(ye.d.a(obj, str), obj2, obj3, obj4);
    }

    public static Object c(Object obj, String str, a aVar, Object obj2, Object obj3) {
        Object a11 = ye.d.a(obj, str);
        if (ye.d.n(a11)) {
            return obj3;
        }
        if (ye.d.j(a11)) {
            a11 = "";
        }
        if (aVar == a.BOOLEAN && !ye.d.i(a11)) {
            throw new JSRangeErrorException("Boolean option expected but not found");
        }
        if (aVar == a.STRING && !ye.d.m(a11)) {
            throw new JSRangeErrorException("String option expected but not found");
        }
        if (ye.d.n(obj2) || Arrays.asList((Object[]) obj2).contains(a11)) {
            return a11;
        }
        throw new JSRangeErrorException("String option expected but not found");
    }

    public static <T extends Enum<T>> T d(Class<T> cls, Object obj) {
        T[] enumConstants;
        if (ye.d.n(obj)) {
            return (T) Enum.valueOf(cls, "UNDEFINED");
        }
        if (ye.d.j(obj)) {
            return null;
        }
        String h11 = ye.d.h(obj);
        if (h11.equals("2-digit")) {
            return (T) Enum.valueOf(cls, "DIGIT2");
        }
        for (T t11 : cls.getEnumConstants()) {
            if (t11.name().compareToIgnoreCase(h11) == 0) {
                return t11;
            }
        }
        return null;
    }
}