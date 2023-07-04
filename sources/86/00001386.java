package com.adyen.threeds2.util;

import com.adyen.threeds2.exception.InvalidInputException;

/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void requireNonEmpty(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            throw new InvalidInputException(str + " must not be empty.", null);
        }
    }

    public static void requireNonLessThan(String str, int i11, int i12) {
        if (i11 >= i12) {
            return;
        }
        throw new InvalidInputException(str + " must not be less than " + i12 + ".", null);
    }

    public static void requireNonNegative(String str, int i11) {
        if (i11 >= 0) {
            return;
        }
        throw new InvalidInputException(str + " must not be negative.", null);
    }

    public static void requireNonNull(String str, Object obj) {
        if (obj != null) {
            return;
        }
        throw new InvalidInputException(str + " must not be null.", null);
    }
}