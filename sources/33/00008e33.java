package oj;

import ak.o;
import ak.u;
import ak.v;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import nj.b;
import nj.i;
import oj.c;

/* loaded from: classes3.dex */
public final class c extends e {

    /* renamed from: g */
    private final v f42579g = new v();

    /* renamed from: h */
    private final u f42580h = new u();

    /* renamed from: i */
    private int f42581i = -1;

    /* renamed from: j */
    private final int f42582j;

    /* renamed from: k */
    private final b[] f42583k;

    /* renamed from: l */
    private b f42584l;

    /* renamed from: m */
    private List<nj.b> f42585m;

    /* renamed from: n */
    private List<nj.b> f42586n;

    /* renamed from: o */
    private C0848c f42587o;

    /* renamed from: p */
    private int f42588p;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        public final nj.b f42589a;

        /* renamed from: b */
        public final int f42590b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f11, int i11, int i12, float f12, int i13, float f13, boolean z11, int i14, int i15) {
            b.C0811b l11 = new b.C0811b().m(charSequence).n(alignment).h(f11, i11).i(i12).j(f12).k(i13).l(f13);
            if (z11) {
                l11.q(i14);
            }
            this.f42589a = l11.a();
            this.f42590b = i15;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private static final int[] A;
        private static final int[] B;
        private static final boolean[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;
        private static final int[] G;

        /* renamed from: w */
        public static final int f42591w = h(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f42592x;

        /* renamed from: y */
        public static final int f42593y;

        /* renamed from: z */
        private static final int[] f42594z;

        /* renamed from: a */
        private final List<SpannableString> f42595a = new ArrayList();

        /* renamed from: b */
        private final SpannableStringBuilder f42596b = new SpannableStringBuilder();

        /* renamed from: c */
        private boolean f42597c;

        /* renamed from: d */
        private boolean f42598d;

        /* renamed from: e */
        private int f42599e;

        /* renamed from: f */
        private boolean f42600f;

        /* renamed from: g */
        private int f42601g;

        /* renamed from: h */
        private int f42602h;

        /* renamed from: i */
        private int f42603i;

        /* renamed from: j */
        private int f42604j;

        /* renamed from: k */
        private boolean f42605k;

        /* renamed from: l */
        private int f42606l;

        /* renamed from: m */
        private int f42607m;

        /* renamed from: n */
        private int f42608n;

        /* renamed from: o */
        private int f42609o;

        /* renamed from: p */
        private int f42610p;

        /* renamed from: q */
        private int f42611q;

        /* renamed from: r */
        private int f42612r;

        /* renamed from: s */
        private int f42613s;

        /* renamed from: t */
        private int f42614t;

        /* renamed from: u */
        private int f42615u;

        /* renamed from: v */
        private int f42616v;

        static {
            int h11 = h(0, 0, 0, 0);
            f42592x = h11;
            int h12 = h(0, 0, 0, 3);
            f42593y = h12;
            f42594z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{h11, h12, h11, h11, h12, h11, h11};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{h11, h11, h11, h11, h11, h12, h12};
        }

        public b() {
            l();
        }

        public static int g(int i11, int i12, int i13) {
            return h(i11, i12, i13, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                ak.a.c(r4, r0, r1)
                ak.a.c(r5, r0, r1)
                ak.a.c(r6, r0, r1)
                ak.a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = r0
                goto L22
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L22
            L21:
                r7 = r2
            L22:
                if (r4 <= r1) goto L26
                r4 = r2
                goto L27
            L26:
                r4 = r0
            L27:
                if (r5 <= r1) goto L2b
                r5 = r2
                goto L2c
            L2b:
                r5 = r0
            L2c:
                if (r6 <= r1) goto L2f
                r0 = r2
            L2f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: oj.c.b.h(int, int, int, int):int");
        }

        public void a(char c11) {
            if (c11 == '\n') {
                this.f42595a.add(d());
                this.f42596b.clear();
                if (this.f42610p != -1) {
                    this.f42610p = 0;
                }
                if (this.f42611q != -1) {
                    this.f42611q = 0;
                }
                if (this.f42612r != -1) {
                    this.f42612r = 0;
                }
                if (this.f42614t != -1) {
                    this.f42614t = 0;
                }
                while (true) {
                    if ((!this.f42605k || this.f42595a.size() < this.f42604j) && this.f42595a.size() < 15) {
                        return;
                    }
                    this.f42595a.remove(0);
                }
            } else {
                this.f42596b.append(c11);
            }
        }

        public void b() {
            int length = this.f42596b.length();
            if (length > 0) {
                this.f42596b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:68:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00ac  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public oj.c.a c() {
            /*
                Method dump skipped, instructions count: 194
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: oj.c.b.c():oj.c$a");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f42596b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f42610p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f42610p, length, 33);
                }
                if (this.f42611q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f42611q, length, 33);
                }
                if (this.f42612r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f42613s), this.f42612r, length, 33);
                }
                if (this.f42614t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f42615u), this.f42614t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f42595a.clear();
            this.f42596b.clear();
            this.f42610p = -1;
            this.f42611q = -1;
            this.f42612r = -1;
            this.f42614t = -1;
            this.f42616v = 0;
        }

        public void f(boolean z11, boolean z12, boolean z13, int i11, boolean z14, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f42597c = true;
            this.f42598d = z11;
            this.f42605k = z12;
            this.f42599e = i11;
            this.f42600f = z14;
            this.f42601g = i12;
            this.f42602h = i13;
            this.f42603i = i16;
            int i19 = i14 + 1;
            if (this.f42604j != i19) {
                this.f42604j = i19;
                while (true) {
                    if ((!z12 || this.f42595a.size() < this.f42604j) && this.f42595a.size() < 15) {
                        break;
                    }
                    this.f42595a.remove(0);
                }
            }
            if (i17 != 0 && this.f42607m != i17) {
                this.f42607m = i17;
                int i21 = i17 - 1;
                q(D[i21], f42593y, C[i21], 0, A[i21], B[i21], f42594z[i21]);
            }
            if (i18 == 0 || this.f42608n == i18) {
                return;
            }
            this.f42608n = i18;
            int i22 = i18 - 1;
            m(0, 1, 1, false, false, F[i22], E[i22]);
            n(f42591w, G[i22], f42592x);
        }

        public boolean i() {
            return this.f42597c;
        }

        public boolean j() {
            return !i() || (this.f42595a.isEmpty() && this.f42596b.length() == 0);
        }

        public boolean k() {
            return this.f42598d;
        }

        public void l() {
            e();
            this.f42597c = false;
            this.f42598d = false;
            this.f42599e = 4;
            this.f42600f = false;
            this.f42601g = 0;
            this.f42602h = 0;
            this.f42603i = 0;
            this.f42604j = 15;
            this.f42605k = true;
            this.f42606l = 0;
            this.f42607m = 0;
            this.f42608n = 0;
            int i11 = f42592x;
            this.f42609o = i11;
            this.f42613s = f42591w;
            this.f42615u = i11;
        }

        public void m(int i11, int i12, int i13, boolean z11, boolean z12, int i14, int i15) {
            if (this.f42610p != -1) {
                if (!z11) {
                    this.f42596b.setSpan(new StyleSpan(2), this.f42610p, this.f42596b.length(), 33);
                    this.f42610p = -1;
                }
            } else if (z11) {
                this.f42610p = this.f42596b.length();
            }
            if (this.f42611q == -1) {
                if (z12) {
                    this.f42611q = this.f42596b.length();
                }
            } else if (z12) {
            } else {
                this.f42596b.setSpan(new UnderlineSpan(), this.f42611q, this.f42596b.length(), 33);
                this.f42611q = -1;
            }
        }

        public void n(int i11, int i12, int i13) {
            if (this.f42612r != -1 && this.f42613s != i11) {
                this.f42596b.setSpan(new ForegroundColorSpan(this.f42613s), this.f42612r, this.f42596b.length(), 33);
            }
            if (i11 != f42591w) {
                this.f42612r = this.f42596b.length();
                this.f42613s = i11;
            }
            if (this.f42614t != -1 && this.f42615u != i12) {
                this.f42596b.setSpan(new BackgroundColorSpan(this.f42615u), this.f42614t, this.f42596b.length(), 33);
            }
            if (i12 != f42592x) {
                this.f42614t = this.f42596b.length();
                this.f42615u = i12;
            }
        }

        public void o(int i11, int i12) {
            if (this.f42616v != i11) {
                a('\n');
            }
            this.f42616v = i11;
        }

        public void p(boolean z11) {
            this.f42598d = z11;
        }

        public void q(int i11, int i12, boolean z11, int i13, int i14, int i15, int i16) {
            this.f42609o = i11;
            this.f42606l = i16;
        }
    }

    /* renamed from: oj.c$c */
    /* loaded from: classes3.dex */
    public static final class C0848c {

        /* renamed from: a */
        public final int f42617a;

        /* renamed from: b */
        public final int f42618b;

        /* renamed from: c */
        public final byte[] f42619c;

        /* renamed from: d */
        int f42620d = 0;

        public C0848c(int i11, int i12) {
            this.f42617a = i11;
            this.f42618b = i12;
            this.f42619c = new byte[(i12 * 2) - 1];
        }
    }

    public c(int i11, List<byte[]> list) {
        this.f42582j = i11 == -1 ? 1 : i11;
        if (list != null) {
            ak.c.h(list);
        }
        this.f42583k = new b[8];
        for (int i12 = 0; i12 < 8; i12++) {
            this.f42583k[i12] = new b();
        }
        this.f42584l = this.f42583k[0];
    }

    private void A() {
        this.f42584l.m(this.f42580h.h(4), this.f42580h.h(2), this.f42580h.h(2), this.f42580h.g(), this.f42580h.g(), this.f42580h.h(3), this.f42580h.h(3));
    }

    private void B() {
        int h11 = b.h(this.f42580h.h(2), this.f42580h.h(2), this.f42580h.h(2), this.f42580h.h(2));
        int h12 = b.h(this.f42580h.h(2), this.f42580h.h(2), this.f42580h.h(2), this.f42580h.h(2));
        this.f42580h.r(2);
        this.f42584l.n(h11, h12, b.g(this.f42580h.h(2), this.f42580h.h(2), this.f42580h.h(2)));
    }

    private void C() {
        this.f42580h.r(4);
        int h11 = this.f42580h.h(4);
        this.f42580h.r(2);
        this.f42584l.o(h11, this.f42580h.h(6));
    }

    private void D() {
        int h11 = b.h(this.f42580h.h(2), this.f42580h.h(2), this.f42580h.h(2), this.f42580h.h(2));
        int h12 = this.f42580h.h(2);
        int g11 = b.g(this.f42580h.h(2), this.f42580h.h(2), this.f42580h.h(2));
        if (this.f42580h.g()) {
            h12 |= 4;
        }
        boolean g12 = this.f42580h.g();
        int h13 = this.f42580h.h(2);
        int h14 = this.f42580h.h(2);
        int h15 = this.f42580h.h(2);
        this.f42580h.r(8);
        this.f42584l.q(h11, g11, g12, h12, h13, h14, h15);
    }

    public static /* synthetic */ int E(a aVar, a aVar2) {
        return Integer.compare(aVar.f42590b, aVar2.f42590b);
    }

    private void F() {
        C0848c c0848c = this.f42587o;
        int i11 = c0848c.f42620d;
        int i12 = c0848c.f42618b;
        if (i11 != (i12 * 2) - 1) {
            int i13 = c0848c.f42617a;
            StringBuilder sb2 = new StringBuilder(115);
            sb2.append("DtvCcPacket ended prematurely; size is ");
            sb2.append((i12 * 2) - 1);
            sb2.append(", but current index is ");
            sb2.append(i11);
            sb2.append(" (sequence number ");
            sb2.append(i13);
            sb2.append(");");
            o.b("Cea708Decoder", sb2.toString());
        }
        u uVar = this.f42580h;
        C0848c c0848c2 = this.f42587o;
        uVar.o(c0848c2.f42619c, c0848c2.f42620d);
        int h11 = this.f42580h.h(3);
        int h12 = this.f42580h.h(5);
        if (h11 == 7) {
            this.f42580h.r(2);
            h11 = this.f42580h.h(6);
            if (h11 < 7) {
                StringBuilder sb3 = new StringBuilder(44);
                sb3.append("Invalid extended service number: ");
                sb3.append(h11);
                o.h("Cea708Decoder", sb3.toString());
            }
        }
        if (h12 == 0) {
            if (h11 != 0) {
                StringBuilder sb4 = new StringBuilder(59);
                sb4.append("serviceNumber is non-zero (");
                sb4.append(h11);
                sb4.append(") when blockSize is 0");
                o.h("Cea708Decoder", sb4.toString());
            }
        } else if (h11 != this.f42582j) {
        } else {
            boolean z11 = false;
            while (this.f42580h.b() > 0) {
                int h13 = this.f42580h.h(8);
                if (h13 == 16) {
                    int h14 = this.f42580h.h(8);
                    if (h14 <= 31) {
                        t(h14);
                    } else {
                        if (h14 <= 127) {
                            y(h14);
                        } else if (h14 <= 159) {
                            u(h14);
                        } else if (h14 <= 255) {
                            z(h14);
                        } else {
                            StringBuilder sb5 = new StringBuilder(37);
                            sb5.append("Invalid extended command: ");
                            sb5.append(h14);
                            o.h("Cea708Decoder", sb5.toString());
                        }
                        z11 = true;
                    }
                } else if (h13 <= 31) {
                    r(h13);
                } else {
                    if (h13 <= 127) {
                        w(h13);
                    } else if (h13 <= 159) {
                        s(h13);
                    } else if (h13 <= 255) {
                        x(h13);
                    } else {
                        StringBuilder sb6 = new StringBuilder(33);
                        sb6.append("Invalid base command: ");
                        sb6.append(h13);
                        o.h("Cea708Decoder", sb6.toString());
                    }
                    z11 = true;
                }
            }
            if (z11) {
                this.f42585m = q();
            }
        }
    }

    private void G() {
        for (int i11 = 0; i11 < 8; i11++) {
            this.f42583k[i11].l();
        }
    }

    public static /* synthetic */ int o(a aVar, a aVar2) {
        return E(aVar, aVar2);
    }

    private void p() {
        if (this.f42587o == null) {
            return;
        }
        F();
        this.f42587o = null;
    }

    private List<nj.b> q() {
        a c11;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 8; i11++) {
            if (!this.f42583k[i11].j() && this.f42583k[i11].k() && (c11 = this.f42583k[i11].c()) != null) {
                arrayList.add(c11);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: oj.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.o((c.a) obj, (c.a) obj2);
            }
        });
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(((a) arrayList.get(i12)).f42589a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void r(int i11) {
        if (i11 != 0) {
            if (i11 == 3) {
                this.f42585m = q();
            } else if (i11 != 8) {
                switch (i11) {
                    case 12:
                        G();
                        return;
                    case 13:
                        this.f42584l.a('\n');
                        return;
                    case 14:
                        return;
                    default:
                        if (i11 >= 17 && i11 <= 23) {
                            StringBuilder sb2 = new StringBuilder(55);
                            sb2.append("Currently unsupported COMMAND_EXT1 Command: ");
                            sb2.append(i11);
                            o.h("Cea708Decoder", sb2.toString());
                            this.f42580h.r(8);
                            return;
                        } else if (i11 >= 24 && i11 <= 31) {
                            StringBuilder sb3 = new StringBuilder(54);
                            sb3.append("Currently unsupported COMMAND_P16 Command: ");
                            sb3.append(i11);
                            o.h("Cea708Decoder", sb3.toString());
                            this.f42580h.r(16);
                            return;
                        } else {
                            StringBuilder sb4 = new StringBuilder(31);
                            sb4.append("Invalid C0 command: ");
                            sb4.append(i11);
                            o.h("Cea708Decoder", sb4.toString());
                            return;
                        }
                }
            } else {
                this.f42584l.b();
            }
        }
    }

    private void s(int i11) {
        b bVar;
        int i12 = 1;
        switch (i11) {
            case 128:
            case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
            case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
            case SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE:
            case 132:
            case 133:
            case 134:
            case 135:
                int i13 = i11 - 128;
                if (this.f42588p != i13) {
                    this.f42588p = i13;
                    this.f42584l = this.f42583k[i13];
                    return;
                }
                return;
            case 136:
                while (i12 <= 8) {
                    if (this.f42580h.g()) {
                        this.f42583k[8 - i12].e();
                    }
                    i12++;
                }
                return;
            case 137:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f42580h.g()) {
                        this.f42583k[8 - i14].p(true);
                    }
                }
                return;
            case 138:
                while (i12 <= 8) {
                    if (this.f42580h.g()) {
                        this.f42583k[8 - i12].p(false);
                    }
                    i12++;
                }
                return;
            case 139:
                for (int i15 = 1; i15 <= 8; i15++) {
                    if (this.f42580h.g()) {
                        this.f42583k[8 - i15].p(!bVar.k());
                    }
                }
                return;
            case 140:
                while (i12 <= 8) {
                    if (this.f42580h.g()) {
                        this.f42583k[8 - i12].l();
                    }
                    i12++;
                }
                return;
            case 141:
                this.f42580h.r(8);
                return;
            case 142:
                return;
            case 143:
                G();
                return;
            case 144:
                if (!this.f42584l.i()) {
                    this.f42580h.r(16);
                    return;
                } else {
                    A();
                    return;
                }
            case 145:
                if (!this.f42584l.i()) {
                    this.f42580h.r(24);
                    return;
                } else {
                    B();
                    return;
                }
            case 146:
                if (!this.f42584l.i()) {
                    this.f42580h.r(16);
                    return;
                } else {
                    C();
                    return;
                }
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Invalid C1 command: ");
                sb2.append(i11);
                o.h("Cea708Decoder", sb2.toString());
                return;
            case 151:
                if (!this.f42584l.i()) {
                    this.f42580h.r(32);
                    return;
                } else {
                    D();
                    return;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i16 = i11 - 152;
                v(i16);
                if (this.f42588p != i16) {
                    this.f42588p = i16;
                    this.f42584l = this.f42583k[i16];
                    return;
                }
                return;
        }
    }

    private void t(int i11) {
        if (i11 <= 7) {
            return;
        }
        if (i11 <= 15) {
            this.f42580h.r(8);
        } else if (i11 <= 23) {
            this.f42580h.r(16);
        } else if (i11 <= 31) {
            this.f42580h.r(24);
        }
    }

    private void u(int i11) {
        if (i11 <= 135) {
            this.f42580h.r(32);
        } else if (i11 <= 143) {
            this.f42580h.r(40);
        } else if (i11 <= 159) {
            this.f42580h.r(2);
            this.f42580h.r(this.f42580h.h(6) * 8);
        }
    }

    private void v(int i11) {
        b bVar = this.f42583k[i11];
        this.f42580h.r(2);
        boolean g11 = this.f42580h.g();
        boolean g12 = this.f42580h.g();
        boolean g13 = this.f42580h.g();
        int h11 = this.f42580h.h(3);
        boolean g14 = this.f42580h.g();
        int h12 = this.f42580h.h(7);
        int h13 = this.f42580h.h(8);
        int h14 = this.f42580h.h(4);
        int h15 = this.f42580h.h(4);
        this.f42580h.r(2);
        int h16 = this.f42580h.h(6);
        this.f42580h.r(2);
        bVar.f(g11, g12, g13, h11, g14, h12, h13, h15, h16, h14, this.f42580h.h(3), this.f42580h.h(3));
    }

    private void w(int i11) {
        if (i11 == 127) {
            this.f42584l.a((char) 9835);
        } else {
            this.f42584l.a((char) (i11 & 255));
        }
    }

    private void x(int i11) {
        this.f42584l.a((char) (i11 & 255));
    }

    private void y(int i11) {
        if (i11 == 32) {
            this.f42584l.a(' ');
        } else if (i11 == 33) {
            this.f42584l.a((char) 160);
        } else if (i11 == 37) {
            this.f42584l.a((char) 8230);
        } else if (i11 == 42) {
            this.f42584l.a((char) 352);
        } else if (i11 == 44) {
            this.f42584l.a((char) 338);
        } else if (i11 == 63) {
            this.f42584l.a((char) 376);
        } else if (i11 == 57) {
            this.f42584l.a((char) 8482);
        } else if (i11 == 58) {
            this.f42584l.a((char) 353);
        } else if (i11 == 60) {
            this.f42584l.a((char) 339);
        } else if (i11 != 61) {
            switch (i11) {
                case 48:
                    this.f42584l.a((char) 9608);
                    return;
                case 49:
                    this.f42584l.a((char) 8216);
                    return;
                case 50:
                    this.f42584l.a((char) 8217);
                    return;
                case 51:
                    this.f42584l.a((char) 8220);
                    return;
                case 52:
                    this.f42584l.a((char) 8221);
                    return;
                case 53:
                    this.f42584l.a((char) 8226);
                    return;
                default:
                    switch (i11) {
                        case 118:
                            this.f42584l.a((char) 8539);
                            return;
                        case 119:
                            this.f42584l.a((char) 8540);
                            return;
                        case 120:
                            this.f42584l.a((char) 8541);
                            return;
                        case 121:
                            this.f42584l.a((char) 8542);
                            return;
                        case 122:
                            this.f42584l.a((char) 9474);
                            return;
                        case 123:
                            this.f42584l.a((char) 9488);
                            return;
                        case 124:
                            this.f42584l.a((char) 9492);
                            return;
                        case 125:
                            this.f42584l.a((char) 9472);
                            return;
                        case 126:
                            this.f42584l.a((char) 9496);
                            return;
                        case 127:
                            this.f42584l.a((char) 9484);
                            return;
                        default:
                            StringBuilder sb2 = new StringBuilder(33);
                            sb2.append("Invalid G2 character: ");
                            sb2.append(i11);
                            o.h("Cea708Decoder", sb2.toString());
                            return;
                    }
            }
        } else {
            this.f42584l.a((char) 8480);
        }
    }

    private void z(int i11) {
        if (i11 == 160) {
            this.f42584l.a((char) 13252);
            return;
        }
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("Invalid G3 character: ");
        sb2.append(i11);
        o.h("Cea708Decoder", sb2.toString());
        this.f42584l.a('_');
    }

    @Override // oj.e
    protected nj.f e() {
        List<nj.b> list = this.f42585m;
        this.f42586n = list;
        return new f((List) ak.a.e(list));
    }

    @Override // oj.e
    protected void f(i iVar) {
        ByteBuffer byteBuffer = (ByteBuffer) ak.a.e(iVar.f13264c);
        this.f42579g.M(byteBuffer.array(), byteBuffer.limit());
        while (this.f42579g.a() >= 3) {
            int C = this.f42579g.C() & 7;
            int i11 = C & 3;
            boolean z11 = (C & 4) == 4;
            byte C2 = (byte) this.f42579g.C();
            byte C3 = (byte) this.f42579g.C();
            if (i11 == 2 || i11 == 3) {
                if (z11) {
                    if (i11 == 3) {
                        p();
                        int i12 = (C2 & 192) >> 6;
                        int i13 = this.f42581i;
                        if (i13 != -1 && i12 != (i13 + 1) % 4) {
                            G();
                            int i14 = this.f42581i;
                            StringBuilder sb2 = new StringBuilder(71);
                            sb2.append("Sequence number discontinuity. previous=");
                            sb2.append(i14);
                            sb2.append(" current=");
                            sb2.append(i12);
                            o.h("Cea708Decoder", sb2.toString());
                        }
                        this.f42581i = i12;
                        int i15 = C2 & 63;
                        if (i15 == 0) {
                            i15 = 64;
                        }
                        C0848c c0848c = new C0848c(i12, i15);
                        this.f42587o = c0848c;
                        byte[] bArr = c0848c.f42619c;
                        int i16 = c0848c.f42620d;
                        c0848c.f42620d = i16 + 1;
                        bArr[i16] = C3;
                    } else {
                        ak.a.a(i11 == 2);
                        C0848c c0848c2 = this.f42587o;
                        if (c0848c2 == null) {
                            o.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0848c2.f42619c;
                            int i17 = c0848c2.f42620d;
                            int i18 = i17 + 1;
                            c0848c2.f42620d = i18;
                            bArr2[i17] = C2;
                            c0848c2.f42620d = i18 + 1;
                            bArr2[i18] = C3;
                        }
                    }
                    C0848c c0848c3 = this.f42587o;
                    if (c0848c3.f42620d == (c0848c3.f42618b * 2) - 1) {
                        p();
                    }
                }
            }
        }
    }

    @Override // oj.e, fi.c
    public void flush() {
        super.flush();
        this.f42585m = null;
        this.f42586n = null;
        this.f42588p = 0;
        this.f42584l = this.f42583k[0];
        G();
        this.f42587o = null;
    }

    @Override // oj.e
    protected boolean k() {
        return this.f42585m != this.f42586n;
    }
}