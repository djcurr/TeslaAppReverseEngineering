package t3;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    static final e f51585d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f51586e;

    /* renamed from: f  reason: collision with root package name */
    private static final String f51587f;

    /* renamed from: g  reason: collision with root package name */
    static final a f51588g;

    /* renamed from: h  reason: collision with root package name */
    static final a f51589h;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f51590a;

    /* renamed from: b  reason: collision with root package name */
    private final int f51591b;

    /* renamed from: c  reason: collision with root package name */
    private final e f51592c;

    /* renamed from: t3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1142a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f51593a;

        /* renamed from: b  reason: collision with root package name */
        private int f51594b;

        /* renamed from: c  reason: collision with root package name */
        private e f51595c;

        public C1142a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z11) {
            return z11 ? a.f51589h : a.f51588g;
        }

        private void c(boolean z11) {
            this.f51593a = z11;
            this.f51595c = a.f51585d;
            this.f51594b = 2;
        }

        public a a() {
            if (this.f51594b == 2 && this.f51595c == a.f51585d) {
                return b(this.f51593a);
            }
            return new a(this.f51593a, this.f51594b, this.f51595c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f51596f = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        private final CharSequence f51597a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f51598b;

        /* renamed from: c  reason: collision with root package name */
        private final int f51599c;

        /* renamed from: d  reason: collision with root package name */
        private int f51600d;

        /* renamed from: e  reason: collision with root package name */
        private char f51601e;

        static {
            for (int i11 = 0; i11 < 1792; i11++) {
                f51596f[i11] = Character.getDirectionality(i11);
            }
        }

        b(CharSequence charSequence, boolean z11) {
            this.f51597a = charSequence;
            this.f51598b = z11;
            this.f51599c = charSequence.length();
        }

        private static byte c(char c11) {
            return c11 < 1792 ? f51596f[c11] : Character.getDirectionality(c11);
        }

        private byte f() {
            char charAt;
            int i11 = this.f51600d;
            do {
                int i12 = this.f51600d;
                if (i12 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f51597a;
                int i13 = i12 - 1;
                this.f51600d = i13;
                charAt = charSequence.charAt(i13);
                this.f51601e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f51600d = i11;
            this.f51601e = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i11 = this.f51600d;
                if (i11 >= this.f51599c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f51597a;
                this.f51600d = i11 + 1;
                charAt = charSequence.charAt(i11);
                this.f51601e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char charAt;
            int i11 = this.f51600d;
            while (true) {
                int i12 = this.f51600d;
                if (i12 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f51597a;
                int i13 = i12 - 1;
                this.f51600d = i13;
                char charAt2 = charSequence.charAt(i13);
                this.f51601e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i14 = this.f51600d;
                        if (i14 > 0) {
                            CharSequence charSequence2 = this.f51597a;
                            int i15 = i14 - 1;
                            this.f51600d = i15;
                            charAt = charSequence2.charAt(i15);
                            this.f51601e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f51600d = i11;
            this.f51601e = '>';
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i11 = this.f51600d;
            while (true) {
                int i12 = this.f51600d;
                if (i12 < this.f51599c) {
                    CharSequence charSequence = this.f51597a;
                    this.f51600d = i12 + 1;
                    char charAt2 = charSequence.charAt(i12);
                    this.f51601e = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i13 = this.f51600d;
                            if (i13 < this.f51599c) {
                                CharSequence charSequence2 = this.f51597a;
                                this.f51600d = i13 + 1;
                                charAt = charSequence2.charAt(i13);
                                this.f51601e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f51600d = i11;
                    this.f51601e = '<';
                    return (byte) 13;
                }
            }
        }

        byte a() {
            char charAt = this.f51597a.charAt(this.f51600d - 1);
            this.f51601e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f51597a, this.f51600d);
                this.f51600d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f51600d--;
            byte c11 = c(this.f51601e);
            if (this.f51598b) {
                char c12 = this.f51601e;
                if (c12 == '>') {
                    return h();
                }
                return c12 == ';' ? f() : c11;
            }
            return c11;
        }

        byte b() {
            char charAt = this.f51597a.charAt(this.f51600d);
            this.f51601e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f51597a, this.f51600d);
                this.f51600d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f51600d++;
            byte c11 = c(this.f51601e);
            if (this.f51598b) {
                char c12 = this.f51601e;
                if (c12 == '<') {
                    return i();
                }
                return c12 == '&' ? g() : c11;
            }
            return c11;
        }

        int d() {
            this.f51600d = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (this.f51600d < this.f51599c && i11 == 0) {
                byte b11 = b();
                if (b11 != 0) {
                    if (b11 == 1 || b11 == 2) {
                        if (i13 == 0) {
                            return 1;
                        }
                    } else if (b11 != 9) {
                        switch (b11) {
                            case 14:
                            case 15:
                                i13++;
                                i12 = -1;
                                break;
                            case 16:
                            case 17:
                                i13++;
                                i12 = 1;
                                break;
                            case 18:
                                i13--;
                                i12 = 0;
                                break;
                        }
                    }
                } else if (i13 == 0) {
                    return -1;
                }
                i11 = i13;
            }
            if (i11 == 0) {
                return 0;
            }
            if (i12 != 0) {
                return i12;
            }
            while (this.f51600d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i11 == i13) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i11 == i13) {
                            return 1;
                        }
                        break;
                    case 18:
                        i13++;
                        continue;
                }
                i13--;
            }
            return 0;
        }

        int e() {
            this.f51600d = this.f51599c;
            int i11 = 0;
            while (true) {
                int i12 = i11;
                while (this.f51600d > 0) {
                    byte a11 = a();
                    if (a11 != 0) {
                        if (a11 == 1 || a11 == 2) {
                            if (i11 == 0) {
                                return 1;
                            }
                            if (i12 == 0) {
                                break;
                            }
                        } else if (a11 != 9) {
                            switch (a11) {
                                case 14:
                                case 15:
                                    if (i12 == i11) {
                                        return -1;
                                    }
                                    i11--;
                                    break;
                                case 16:
                                case 17:
                                    if (i12 == i11) {
                                        return 1;
                                    }
                                    i11--;
                                    break;
                                case 18:
                                    i11++;
                                    break;
                                default:
                                    if (i12 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else if (i11 == 0) {
                        return -1;
                    } else {
                        if (i12 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        e eVar = f.f51617c;
        f51585d = eVar;
        f51586e = Character.toString((char) 8206);
        f51587f = Character.toString((char) 8207);
        f51588g = new a(false, 2, eVar);
        f51589h = new a(true, 2, eVar);
    }

    a(boolean z11, int i11, e eVar) {
        this.f51590a = z11;
        this.f51591b = i11;
        this.f51592c = eVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C1142a().a();
    }

    static boolean e(Locale locale) {
        return g.b(locale) == 1;
    }

    private String f(CharSequence charSequence, e eVar) {
        boolean a11 = eVar.a(charSequence, 0, charSequence.length());
        if (this.f51590a || !(a11 || b(charSequence) == 1)) {
            return this.f51590a ? (!a11 || b(charSequence) == -1) ? f51587f : "" : "";
        }
        return f51586e;
    }

    private String g(CharSequence charSequence, e eVar) {
        boolean a11 = eVar.a(charSequence, 0, charSequence.length());
        if (this.f51590a || !(a11 || a(charSequence) == 1)) {
            return this.f51590a ? (!a11 || a(charSequence) == -1) ? f51587f : "" : "";
        }
        return f51586e;
    }

    public boolean d() {
        return (this.f51591b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f51592c, true);
    }

    public CharSequence i(CharSequence charSequence, e eVar, boolean z11) {
        if (charSequence == null) {
            return null;
        }
        boolean a11 = eVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z11) {
            spannableStringBuilder.append((CharSequence) g(charSequence, a11 ? f.f51616b : f.f51615a));
        }
        if (a11 != this.f51590a) {
            spannableStringBuilder.append(a11 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z11) {
            spannableStringBuilder.append((CharSequence) f(charSequence, a11 ? f.f51616b : f.f51615a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f51592c, true);
    }

    public String k(String str, e eVar, boolean z11) {
        if (str == null) {
            return null;
        }
        return i(str, eVar, z11).toString();
    }
}