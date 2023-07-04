package com.google.common.base;

import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final s f15937a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b implements s {
        private b() {
        }

        @Override // com.google.common.base.s
        public h a(String str) {
            return new m(Pattern.compile(str));
        }
    }

    static {
        Logger.getLogger(t.class.getName());
        f15937a = d();
    }

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h a(String str) {
        u.o(str);
        return f15937a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str) {
        if (e(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(double d11) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d11));
    }

    private static s d() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long f() {
        return System.nanoTime();
    }
}