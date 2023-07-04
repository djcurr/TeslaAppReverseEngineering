package com.google.common.base;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes3.dex */
public abstract class e implements v<Character> {

    /* loaded from: classes3.dex */
    static abstract class a extends e {
        a() {
        }

        @Override // com.google.common.base.v
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.b(ch2);
        }
    }

    /* loaded from: classes3.dex */
    private static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final char f15911a;

        /* renamed from: b  reason: collision with root package name */
        private final char f15912b;

        b(char c11, char c12) {
            u.d(c12 >= c11);
            this.f15911a = c11;
            this.f15912b = c12;
        }

        @Override // com.google.common.base.e
        public boolean f(char c11) {
            return this.f15911a <= c11 && c11 <= this.f15912b;
        }

        public String toString() {
            String h11 = e.h(this.f15911a);
            String h12 = e.h(this.f15912b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(h11).length() + 27 + String.valueOf(h12).length());
            sb2.append("CharMatcher.inRange('");
            sb2.append(h11);
            sb2.append("', '");
            sb2.append(h12);
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* loaded from: classes3.dex */
    private static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        private final char f15913a;

        c(char c11) {
            this.f15913a = c11;
        }

        @Override // com.google.common.base.e
        public boolean f(char c11) {
            return c11 == this.f15913a;
        }

        public String toString() {
            String h11 = e.h(this.f15913a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(h11).length() + 18);
            sb2.append("CharMatcher.is('");
            sb2.append(h11);
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* loaded from: classes3.dex */
    static abstract class d extends a {

        /* renamed from: a  reason: collision with root package name */
        private final String f15914a;

        d(String str) {
            this.f15914a = (String) u.o(str);
        }

        public final String toString() {
            return this.f15914a;
        }
    }

    /* renamed from: com.google.common.base.e$e  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0288e extends d {

        /* renamed from: b  reason: collision with root package name */
        static final C0288e f15915b = new C0288e();

        private C0288e() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.e
        public int d(CharSequence charSequence, int i11) {
            u.r(i11, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.e
        public boolean f(char c11) {
            return false;
        }
    }

    /* loaded from: classes3.dex */
    static final class f extends d {

        /* renamed from: b  reason: collision with root package name */
        static final int f15916b = Integer.numberOfLeadingZeros(31);

        /* renamed from: c  reason: collision with root package name */
        static final f f15917c = new f();

        f() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.e
        public boolean f(char c11) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c11) >>> f15916b) == c11;
        }
    }

    protected e() {
    }

    public static e c(char c11, char c12) {
        return new b(c11, c12);
    }

    public static e e(char c11) {
        return new c(c11);
    }

    public static e g() {
        return C0288e.f15915b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String h(char c11) {
        char[] cArr = {CoreConstants.ESCAPE_CHAR, 'u', 0, 0, 0, 0};
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(c11 & 15);
            c11 = (char) (c11 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static e i() {
        return f.f15917c;
    }

    @Deprecated
    public boolean b(Character ch2) {
        return f(ch2.charValue());
    }

    public int d(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        u.r(i11, length);
        while (i11 < length) {
            if (f(charSequence.charAt(i11))) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public abstract boolean f(char c11);
}