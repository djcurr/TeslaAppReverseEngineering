package com.google.common.base;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class q extends k {
    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}