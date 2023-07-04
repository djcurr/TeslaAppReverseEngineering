package oj;

import ak.k0;
import ak.o;
import ak.v;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import nj.b;
import nj.j;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes3.dex */
public final class a extends e {

    /* renamed from: h  reason: collision with root package name */
    private final int f42550h;

    /* renamed from: i  reason: collision with root package name */
    private final int f42551i;

    /* renamed from: j  reason: collision with root package name */
    private final int f42552j;

    /* renamed from: k  reason: collision with root package name */
    private final long f42553k;

    /* renamed from: n  reason: collision with root package name */
    private List<nj.b> f42556n;

    /* renamed from: o  reason: collision with root package name */
    private List<nj.b> f42557o;

    /* renamed from: p  reason: collision with root package name */
    private int f42558p;

    /* renamed from: q  reason: collision with root package name */
    private int f42559q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f42560r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f42561s;

    /* renamed from: t  reason: collision with root package name */
    private byte f42562t;

    /* renamed from: u  reason: collision with root package name */
    private byte f42563u;

    /* renamed from: w  reason: collision with root package name */
    private boolean f42565w;

    /* renamed from: x  reason: collision with root package name */
    private long f42566x;

    /* renamed from: y  reason: collision with root package name */
    private static final int[] f42547y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f42548z = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, l.f.DEFAULT_SWIPE_ANIMATION_DURATION, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] C = {CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 176, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 8482, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] D = {193, 201, Primes.SMALL_FACTOR_LIMIT, 218, 220, 252, 8216, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, 42, 39, 8212, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256};
    private static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g  reason: collision with root package name */
    private final v f42549g = new v();

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList<C0846a> f42554l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    private C0846a f42555m = new C0846a(0, 4);

    /* renamed from: v  reason: collision with root package name */
    private int f42564v = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oj.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0846a {

        /* renamed from: a  reason: collision with root package name */
        private final List<C0847a> f42567a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<SpannableString> f42568b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final StringBuilder f42569c = new StringBuilder();

        /* renamed from: d  reason: collision with root package name */
        private int f42570d;

        /* renamed from: e  reason: collision with root package name */
        private int f42571e;

        /* renamed from: f  reason: collision with root package name */
        private int f42572f;

        /* renamed from: g  reason: collision with root package name */
        private int f42573g;

        /* renamed from: h  reason: collision with root package name */
        private int f42574h;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: oj.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0847a {

            /* renamed from: a  reason: collision with root package name */
            public final int f42575a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f42576b;

            /* renamed from: c  reason: collision with root package name */
            public int f42577c;

            public C0847a(int i11, boolean z11, int i12) {
                this.f42575a = i11;
                this.f42576b = z11;
                this.f42577c = i12;
            }
        }

        public C0846a(int i11, int i12) {
            j(i11);
            this.f42574h = i12;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f42569c);
            int length = spannableStringBuilder.length();
            int i11 = 0;
            int i12 = 0;
            boolean z11 = false;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            while (i11 < this.f42567a.size()) {
                C0847a c0847a = this.f42567a.get(i11);
                boolean z12 = c0847a.f42576b;
                int i17 = c0847a.f42575a;
                if (i17 != 8) {
                    boolean z13 = i17 == 7;
                    if (i17 != 7) {
                        i16 = a.A[i17];
                    }
                    z11 = z13;
                }
                int i18 = c0847a.f42577c;
                i11++;
                if (i18 != (i11 < this.f42567a.size() ? this.f42567a.get(i11).f42577c : length)) {
                    if (i13 != -1 && !z12) {
                        q(spannableStringBuilder, i13, i18);
                        i13 = -1;
                    } else if (i13 == -1 && z12) {
                        i13 = i18;
                    }
                    if (i14 != -1 && !z11) {
                        o(spannableStringBuilder, i14, i18);
                        i14 = -1;
                    } else if (i14 == -1 && z11) {
                        i14 = i18;
                    }
                    if (i16 != i15) {
                        n(spannableStringBuilder, i12, i18, i15);
                        i15 = i16;
                        i12 = i18;
                    }
                }
            }
            if (i13 != -1 && i13 != length) {
                q(spannableStringBuilder, i13, length);
            }
            if (i14 != -1 && i14 != length) {
                o(spannableStringBuilder, i14, length);
            }
            if (i12 != length) {
                n(spannableStringBuilder, i12, length, i15);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13) {
            if (i13 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), i11, i12, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i11, int i12) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i11, int i12) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, 33);
        }

        public void e(char c11) {
            if (this.f42569c.length() < 32) {
                this.f42569c.append(c11);
            }
        }

        public void f() {
            int length = this.f42569c.length();
            if (length > 0) {
                this.f42569c.delete(length - 1, length);
                for (int size = this.f42567a.size() - 1; size >= 0; size--) {
                    C0847a c0847a = this.f42567a.get(size);
                    int i11 = c0847a.f42577c;
                    if (i11 != length) {
                        return;
                    }
                    c0847a.f42577c = i11 - 1;
                }
            }
        }

        public nj.b g(int i11) {
            float f11;
            int i12 = this.f42571e + this.f42572f;
            int i13 = 32 - i12;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i14 = 0; i14 < this.f42568b.size(); i14++) {
                spannableStringBuilder.append(k0.U0(this.f42568b.get(i14), i13));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(k0.U0(h(), i13));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i13 - spannableStringBuilder.length();
            int i15 = i12 - length;
            if (i11 == Integer.MIN_VALUE) {
                if (this.f42573g != 2 || (Math.abs(i15) >= 3 && length >= 0)) {
                    i11 = (this.f42573g != 2 || i15 <= 0) ? 0 : 2;
                } else {
                    i11 = 1;
                }
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    i12 = 32 - length;
                }
                f11 = ((i12 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f11 = 0.5f;
            }
            int i16 = this.f42570d;
            if (i16 > 7) {
                i16 = (i16 - 15) - 2;
            } else if (this.f42573g == 1) {
                i16 -= this.f42574h - 1;
            }
            return new b.C0811b().m(spannableStringBuilder).n(Layout.Alignment.ALIGN_NORMAL).h(i16, 1).j(f11).k(i11).a();
        }

        public boolean i() {
            return this.f42567a.isEmpty() && this.f42568b.isEmpty() && this.f42569c.length() == 0;
        }

        public void j(int i11) {
            this.f42573g = i11;
            this.f42567a.clear();
            this.f42568b.clear();
            this.f42569c.setLength(0);
            this.f42570d = 15;
            this.f42571e = 0;
            this.f42572f = 0;
        }

        public void k() {
            this.f42568b.add(h());
            this.f42569c.setLength(0);
            this.f42567a.clear();
            int min = Math.min(this.f42574h, this.f42570d);
            while (this.f42568b.size() >= min) {
                this.f42568b.remove(0);
            }
        }

        public void l(int i11) {
            this.f42573g = i11;
        }

        public void m(int i11) {
            this.f42574h = i11;
        }

        public void p(int i11, boolean z11) {
            this.f42567a.add(new C0847a(i11, z11, this.f42569c.length()));
        }
    }

    public a(String str, int i11, long j11) {
        this.f42553k = j11 > 0 ? j11 * 1000 : -9223372036854775807L;
        this.f42550h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i11 == 1) {
            this.f42552j = 0;
            this.f42551i = 0;
        } else if (i11 == 2) {
            this.f42552j = 1;
            this.f42551i = 0;
        } else if (i11 == 3) {
            this.f42552j = 0;
            this.f42551i = 1;
        } else if (i11 != 4) {
            o.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f42552j = 0;
            this.f42551i = 0;
        } else {
            this.f42552j = 1;
            this.f42551i = 1;
        }
        M(0);
        L();
        this.f42565w = true;
        this.f42566x = -9223372036854775807L;
    }

    private static boolean A(byte b11, byte b12) {
        return (b11 & 246) == 18 && (b12 & 224) == 32;
    }

    private static boolean B(byte b11, byte b12) {
        return (b11 & 247) == 17 && (b12 & 240) == 32;
    }

    private static boolean C(byte b11, byte b12) {
        return (b11 & 246) == 20 && (b12 & 240) == 32;
    }

    private static boolean D(byte b11, byte b12) {
        return (b11 & 240) == 16 && (b12 & 192) == 64;
    }

    private static boolean E(byte b11) {
        return (b11 & 240) == 16;
    }

    private boolean F(boolean z11, byte b11, byte b12) {
        if (z11 && E(b11)) {
            if (this.f42561s && this.f42562t == b11 && this.f42563u == b12) {
                this.f42561s = false;
                return true;
            }
            this.f42561s = true;
            this.f42562t = b11;
            this.f42563u = b12;
        } else {
            this.f42561s = false;
        }
        return false;
    }

    private static boolean G(byte b11) {
        return (b11 & 247) == 20;
    }

    private static boolean H(byte b11, byte b12) {
        return (b11 & 247) == 17 && (b12 & 240) == 48;
    }

    private static boolean I(byte b11, byte b12) {
        return (b11 & 247) == 23 && b12 >= 33 && b12 <= 35;
    }

    private static boolean J(byte b11) {
        return 1 <= b11 && b11 <= 15;
    }

    private void K(byte b11, byte b12) {
        if (J(b11)) {
            this.f42565w = false;
        } else if (G(b11)) {
            if (b12 != 32 && b12 != 47) {
                switch (b12) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b12) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.f42565w = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f42565w = true;
        }
    }

    private void L() {
        this.f42555m.j(this.f42558p);
        this.f42554l.clear();
        this.f42554l.add(this.f42555m);
    }

    private void M(int i11) {
        int i12 = this.f42558p;
        if (i12 == i11) {
            return;
        }
        this.f42558p = i11;
        if (i11 == 3) {
            for (int i13 = 0; i13 < this.f42554l.size(); i13++) {
                this.f42554l.get(i13).l(i11);
            }
            return;
        }
        L();
        if (i12 == 3 || i11 == 1 || i11 == 0) {
            this.f42556n = Collections.emptyList();
        }
    }

    private void N(int i11) {
        this.f42559q = i11;
        this.f42555m.m(i11);
    }

    private boolean O() {
        return (this.f42553k == -9223372036854775807L || this.f42566x == -9223372036854775807L || j() - this.f42566x < this.f42553k) ? false : true;
    }

    private boolean P(byte b11) {
        if (z(b11)) {
            this.f42564v = q(b11);
        }
        return this.f42564v == this.f42552j;
    }

    private static char p(byte b11) {
        return (char) B[(b11 & Byte.MAX_VALUE) - 32];
    }

    private static int q(byte b11) {
        return (b11 >> 3) & 1;
    }

    private List<nj.b> r() {
        int size = this.f42554l.size();
        ArrayList arrayList = new ArrayList(size);
        int i11 = 2;
        for (int i12 = 0; i12 < size; i12++) {
            nj.b g11 = this.f42554l.get(i12).g(Integer.MIN_VALUE);
            arrayList.add(g11);
            if (g11 != null) {
                i11 = Math.min(i11, g11.f41701h);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            nj.b bVar = (nj.b) arrayList.get(i13);
            if (bVar != null) {
                if (bVar.f41701h != i11) {
                    bVar = (nj.b) ak.a.e(this.f42554l.get(i13).g(i11));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    private static char s(byte b11) {
        return (char) D[b11 & 31];
    }

    private static char t(byte b11) {
        return (char) E[b11 & 31];
    }

    private static char u(byte b11, byte b12) {
        if ((b11 & 1) == 0) {
            return s(b12);
        }
        return t(b12);
    }

    private static char v(byte b11) {
        return (char) C[b11 & 15];
    }

    private void w(byte b11) {
        this.f42555m.e(' ');
        this.f42555m.p((b11 >> 1) & 7, (b11 & 1) == 1);
    }

    private void x(byte b11) {
        if (b11 == 32) {
            M(2);
        } else if (b11 != 41) {
            switch (b11) {
                case 37:
                    M(1);
                    N(2);
                    return;
                case 38:
                    M(1);
                    N(3);
                    return;
                case 39:
                    M(1);
                    N(4);
                    return;
                default:
                    int i11 = this.f42558p;
                    if (i11 == 0) {
                        return;
                    }
                    if (b11 != 33) {
                        switch (b11) {
                            case 44:
                                this.f42556n = Collections.emptyList();
                                int i12 = this.f42558p;
                                if (i12 == 1 || i12 == 3) {
                                    L();
                                    return;
                                }
                                return;
                            case 45:
                                if (i11 != 1 || this.f42555m.i()) {
                                    return;
                                }
                                this.f42555m.k();
                                return;
                            case 46:
                                L();
                                return;
                            case 47:
                                this.f42556n = r();
                                L();
                                return;
                            default:
                                return;
                        }
                    }
                    this.f42555m.f();
                    return;
            }
        } else {
            M(3);
        }
    }

    private void y(byte b11, byte b12) {
        int i11 = f42547y[b11 & 7];
        if ((b12 & 32) != 0) {
            i11++;
        }
        if (i11 != this.f42555m.f42570d) {
            if (this.f42558p != 1 && !this.f42555m.i()) {
                C0846a c0846a = new C0846a(this.f42558p, this.f42559q);
                this.f42555m = c0846a;
                this.f42554l.add(c0846a);
            }
            this.f42555m.f42570d = i11;
        }
        boolean z11 = (b12 & Tnaf.POW_2_WIDTH) == 16;
        boolean z12 = (b12 & 1) == 1;
        int i12 = (b12 >> 1) & 7;
        this.f42555m.p(z11 ? 8 : i12, z12);
        if (z11) {
            this.f42555m.f42571e = f42548z[i12];
        }
    }

    private static boolean z(byte b11) {
        return (b11 & 224) == 0;
    }

    @Override // oj.e
    protected nj.f e() {
        List<nj.b> list = this.f42556n;
        this.f42557o = list;
        return new f((List) ak.a.e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0018 A[SYNTHETIC] */
    @Override // oj.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void f(nj.i r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oj.a.f(nj.i):void");
    }

    @Override // oj.e, fi.c
    public void flush() {
        super.flush();
        this.f42556n = null;
        this.f42557o = null;
        M(0);
        N(4);
        L();
        this.f42560r = false;
        this.f42561s = false;
        this.f42562t = (byte) 0;
        this.f42563u = (byte) 0;
        this.f42564v = 0;
        this.f42565w = true;
        this.f42566x = -9223372036854775807L;
    }

    @Override // oj.e, fi.c
    /* renamed from: h */
    public j b() {
        j i11;
        j b11 = super.b();
        if (b11 != null) {
            return b11;
        }
        if (!O() || (i11 = i()) == null) {
            return null;
        }
        this.f42556n = Collections.emptyList();
        this.f42566x = -9223372036854775807L;
        i11.r(j(), e(), Long.MAX_VALUE);
        return i11;
    }

    @Override // oj.e
    protected boolean k() {
        return this.f42556n != this.f42557o;
    }

    @Override // oj.e, fi.c
    public void release() {
    }
}