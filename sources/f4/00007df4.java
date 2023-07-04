package ki;

import ak.k0;
import ci.i;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.util.Arrays;
import ji.d;
import ji.h;
import ji.j;
import ji.l;
import ji.u;
import ji.v;
import ji.x;

/* loaded from: classes3.dex */
public final class b implements h {

    /* renamed from: p */
    private static final int[] f34654p;

    /* renamed from: q */
    private static final int[] f34655q;

    /* renamed from: r */
    private static final byte[] f34656r;

    /* renamed from: s */
    private static final byte[] f34657s;

    /* renamed from: t */
    private static final int f34658t;

    /* renamed from: a */
    private final byte[] f34659a;

    /* renamed from: b */
    private final int f34660b;

    /* renamed from: c */
    private boolean f34661c;

    /* renamed from: d */
    private long f34662d;

    /* renamed from: e */
    private int f34663e;

    /* renamed from: f */
    private int f34664f;

    /* renamed from: g */
    private boolean f34665g;

    /* renamed from: h */
    private long f34666h;

    /* renamed from: i */
    private int f34667i;

    /* renamed from: j */
    private int f34668j;

    /* renamed from: k */
    private long f34669k;

    /* renamed from: l */
    private j f34670l;

    /* renamed from: m */
    private x f34671m;

    /* renamed from: n */
    private v f34672n;

    /* renamed from: o */
    private boolean f34673o;

    static {
        a aVar = new l() { // from class: ki.a
            @Override // ji.l
            public final h[] b() {
                return b.c();
            }
        };
        f34654p = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f34655q = iArr;
        f34656r = k0.l0("#!AMR\n");
        f34657s = k0.l0("#!AMR-WB\n");
        f34658t = iArr[8];
    }

    public b() {
        this(0);
    }

    public static /* synthetic */ h[] c() {
        return m();
    }

    private void f() {
        ak.a.h(this.f34671m);
        k0.j(this.f34670l);
    }

    private static int g(int i11, long j11) {
        return (int) (((i11 * 8) * 1000000) / j11);
    }

    private v h(long j11) {
        return new d(j11, this.f34666h, g(this.f34667i, 20000L), this.f34667i);
    }

    private int i(int i11) {
        if (k(i11)) {
            return this.f34661c ? f34655q[i11] : f34654p[i11];
        }
        String str = this.f34661c ? "WB" : "NB";
        StringBuilder sb2 = new StringBuilder(str.length() + 35);
        sb2.append("Illegal AMR ");
        sb2.append(str);
        sb2.append(" frame type ");
        sb2.append(i11);
        throw new ParserException(sb2.toString());
    }

    private boolean j(int i11) {
        return !this.f34661c && (i11 < 12 || i11 > 14);
    }

    private boolean k(int i11) {
        return i11 >= 0 && i11 <= 15 && (l(i11) || j(i11));
    }

    private boolean l(int i11) {
        return this.f34661c && (i11 < 10 || i11 > 13);
    }

    public static /* synthetic */ h[] m() {
        return new h[]{new b()};
    }

    private void n() {
        if (this.f34673o) {
            return;
        }
        this.f34673o = true;
        boolean z11 = this.f34661c;
        this.f34671m.d(new i.b().e0(z11 ? "audio/amr-wb" : "audio/3gpp").W(f34658t).H(1).f0(z11 ? 16000 : 8000).E());
    }

    private void o(long j11, int i11) {
        int i12;
        if (this.f34665g) {
            return;
        }
        if ((this.f34660b & 1) != 0 && j11 != -1 && ((i12 = this.f34667i) == -1 || i12 == this.f34663e)) {
            if (this.f34668j >= 20 || i11 == -1) {
                v h11 = h(j11);
                this.f34672n = h11;
                this.f34670l.p(h11);
                this.f34665g = true;
                return;
            }
            return;
        }
        v.b bVar = new v.b(-9223372036854775807L);
        this.f34672n = bVar;
        this.f34670l.p(bVar);
        this.f34665g = true;
    }

    private static boolean p(ji.i iVar, byte[] bArr) {
        iVar.d();
        byte[] bArr2 = new byte[bArr.length];
        iVar.n(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int q(ji.i iVar) {
        iVar.d();
        iVar.n(this.f34659a, 0, 1);
        byte b11 = this.f34659a[0];
        if ((b11 & 131) <= 0) {
            return i((b11 >> 3) & 15);
        }
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("Invalid padding bits for frame header ");
        sb2.append((int) b11);
        throw new ParserException(sb2.toString());
    }

    private boolean r(ji.i iVar) {
        byte[] bArr = f34656r;
        if (p(iVar, bArr)) {
            this.f34661c = false;
            iVar.k(bArr.length);
            return true;
        }
        byte[] bArr2 = f34657s;
        if (p(iVar, bArr2)) {
            this.f34661c = true;
            iVar.k(bArr2.length);
            return true;
        }
        return false;
    }

    private int s(ji.i iVar) {
        if (this.f34664f == 0) {
            try {
                int q11 = q(iVar);
                this.f34663e = q11;
                this.f34664f = q11;
                if (this.f34667i == -1) {
                    this.f34666h = iVar.getPosition();
                    this.f34667i = this.f34663e;
                }
                if (this.f34667i == this.f34663e) {
                    this.f34668j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int a11 = this.f34671m.a(iVar, this.f34664f, true);
        if (a11 == -1) {
            return -1;
        }
        int i11 = this.f34664f - a11;
        this.f34664f = i11;
        if (i11 > 0) {
            return 0;
        }
        this.f34671m.f(this.f34669k + this.f34662d, 1, this.f34663e, 0, null);
        this.f34662d += 20000;
        return 0;
    }

    @Override // ji.h
    public void a(long j11, long j12) {
        this.f34662d = 0L;
        this.f34663e = 0;
        this.f34664f = 0;
        if (j11 != 0) {
            v vVar = this.f34672n;
            if (vVar instanceof d) {
                this.f34669k = ((d) vVar).b(j11);
                return;
            }
        }
        this.f34669k = 0L;
    }

    @Override // ji.h
    public void b(j jVar) {
        this.f34670l = jVar;
        this.f34671m = jVar.f(0, 1);
        jVar.s();
    }

    @Override // ji.h
    public boolean d(ji.i iVar) {
        return r(iVar);
    }

    @Override // ji.h
    public int e(ji.i iVar, u uVar) {
        f();
        if (iVar.getPosition() == 0 && !r(iVar)) {
            throw new ParserException("Could not find AMR header.");
        }
        n();
        int s11 = s(iVar);
        o(iVar.getLength(), s11);
        return s11;
    }

    @Override // ji.h
    public void release() {
    }

    public b(int i11) {
        this.f34660b = i11;
        this.f34659a = new byte[1];
        this.f34667i = -1;
    }
}