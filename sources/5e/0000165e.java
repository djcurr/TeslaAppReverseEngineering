package com.facebook.hermes.intl;

/* loaded from: classes3.dex */
class LocaleIdTokenizer {

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f11149a;

    /* renamed from: b  reason: collision with root package name */
    int f11150b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f11151c = -1;

    /* loaded from: classes3.dex */
    public class LocaleIdSubtagIterationFailed extends Exception {
        public LocaleIdSubtagIterationFailed(LocaleIdTokenizer localeIdTokenizer) {
        }
    }

    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        private CharSequence f11152a;

        /* renamed from: b  reason: collision with root package name */
        private int f11153b;

        /* renamed from: c  reason: collision with root package name */
        private int f11154c;

        a(LocaleIdTokenizer localeIdTokenizer, CharSequence charSequence, int i11, int i12) {
            this.f11152a = "";
            this.f11153b = 0;
            this.f11154c = 0;
            this.f11152a = charSequence;
            this.f11153b = i11;
            this.f11154c = i12;
        }

        public boolean a() {
            return ye.c.h(this.f11152a, this.f11153b, this.f11154c);
        }

        public boolean b() {
            return ye.c.i(this.f11152a, this.f11153b, this.f11154c);
        }

        public boolean c() {
            return ye.c.j(this.f11152a, this.f11153b, this.f11154c);
        }

        public boolean d() {
            return ye.c.k(this.f11152a, this.f11153b, this.f11154c);
        }

        public boolean e() {
            return ye.c.l(this.f11152a, this.f11153b, this.f11154c);
        }

        public boolean f() {
            return ye.c.m(this.f11152a, this.f11153b, this.f11154c);
        }

        public boolean g() {
            return ye.c.n(this.f11152a, this.f11153b, this.f11154c);
        }

        public boolean h() {
            return ye.c.o(this.f11152a, this.f11153b, this.f11154c);
        }

        public boolean i() {
            return ye.c.p(this.f11152a, this.f11153b, this.f11154c);
        }

        public boolean j() {
            return ye.c.q(this.f11152a, this.f11153b, this.f11154c);
        }

        public boolean k() {
            return ye.c.r(this.f11152a, this.f11153b, this.f11154c);
        }

        public boolean l() {
            return ye.c.s(this.f11152a, this.f11153b, this.f11154c);
        }

        public String m() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i11 = this.f11153b; i11 <= this.f11154c; i11++) {
                stringBuffer.append(Character.toLowerCase(this.f11152a.charAt(i11)));
            }
            return stringBuffer.toString();
        }

        public String n() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i11 = this.f11153b; i11 <= this.f11154c; i11++) {
                if (i11 == this.f11153b) {
                    stringBuffer.append(Character.toUpperCase(this.f11152a.charAt(i11)));
                } else {
                    stringBuffer.append(Character.toLowerCase(this.f11152a.charAt(i11)));
                }
            }
            return stringBuffer.toString();
        }

        public String o() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i11 = this.f11153b; i11 <= this.f11154c; i11++) {
                stringBuffer.append(Character.toUpperCase(this.f11152a.charAt(i11)));
            }
            return stringBuffer.toString();
        }

        public String toString() {
            return this.f11152a.subSequence(this.f11153b, this.f11154c + 1).toString();
        }
    }

    public LocaleIdTokenizer(CharSequence charSequence) {
        this.f11149a = charSequence;
    }

    private static boolean b(char c11) {
        return c11 == '-';
    }

    public boolean a() {
        return this.f11149a.length() > 0 && this.f11151c < this.f11149a.length() - 1;
    }

    public a c() {
        if (a()) {
            int i11 = this.f11151c;
            if (i11 >= this.f11150b) {
                if (b(this.f11149a.charAt(i11 + 1))) {
                    if (this.f11151c + 2 != this.f11149a.length()) {
                        this.f11150b = this.f11151c + 2;
                    } else {
                        throw new LocaleIdSubtagIterationFailed(this);
                    }
                } else {
                    throw new LocaleIdSubtagIterationFailed(this);
                }
            }
            this.f11151c = this.f11150b;
            while (this.f11151c < this.f11149a.length() && !b(this.f11149a.charAt(this.f11151c))) {
                this.f11151c++;
            }
            int i12 = this.f11151c;
            int i13 = this.f11150b;
            if (i12 > i13) {
                int i14 = i12 - 1;
                this.f11151c = i14;
                return new a(this, this.f11149a, i13, i14);
            }
            throw new LocaleIdSubtagIterationFailed(this);
        }
        throw new LocaleIdSubtagIterationFailed(this);
    }
}