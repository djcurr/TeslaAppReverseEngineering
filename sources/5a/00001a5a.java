package com.facebook.react.views.text;

import java.text.BreakIterator;

/* loaded from: classes3.dex */
public enum e0 {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12630a;

        static {
            int[] iArr = new int[e0.values().length];
            f12630a = iArr;
            try {
                iArr[e0.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12630a[e0.LOWERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12630a[e0.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String apply(String str, e0 e0Var) {
        if (str == null) {
            return null;
        }
        int i11 = a.f12630a[e0Var.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return i11 != 3 ? str : capitalize(str);
            }
            return str.toLowerCase();
        }
        return str.toUpperCase();
    }

    private static String capitalize(String str) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb2 = new StringBuilder(str.length());
        int first = wordInstance.first();
        while (true) {
            int i11 = first;
            first = wordInstance.next();
            if (first != -1) {
                String substring = str.substring(i11, first);
                if (Character.isLetterOrDigit(substring.charAt(0))) {
                    sb2.append(Character.toUpperCase(substring.charAt(0)));
                    sb2.append(substring.substring(1).toLowerCase());
                } else {
                    sb2.append(substring);
                }
            } else {
                return sb2.toString();
            }
        }
    }
}