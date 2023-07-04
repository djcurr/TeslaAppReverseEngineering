package com.nimbusds.jose.crypto.impl;

import java.util.Collection;

/* loaded from: classes2.dex */
public class e {
    private static String a(Collection collection) {
        StringBuilder sb2 = new StringBuilder();
        Object[] array = collection.toArray();
        for (int i11 = 0; i11 < array.length; i11++) {
            if (i11 != 0) {
                if (i11 < array.length - 1) {
                    sb2.append(", ");
                } else if (i11 == array.length - 1) {
                    sb2.append(" or ");
                }
            }
            sb2.append(array[i11].toString());
        }
        return sb2.toString();
    }

    public static String b(zp.d dVar, Collection<zp.d> collection) {
        return "Unsupported JWE encryption method " + dVar + ", must be " + a(collection);
    }

    public static String c(zp.h hVar, Collection<zp.h> collection) {
        return "Unsupported JWE algorithm " + hVar + ", must be " + a(collection);
    }

    public static String d(zp.n nVar, Collection<zp.n> collection) {
        return "Unsupported JWS algorithm " + nVar + ", must be " + a(collection);
    }
}