package nf;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imageutils.HeifExifUtil;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import md.k;
import md.n;

/* loaded from: classes3.dex */
public class e implements Closeable {

    /* renamed from: m */
    private static boolean f41642m;

    /* renamed from: a */
    private final qd.a<PooledByteBuffer> f41643a;

    /* renamed from: b */
    private final n<FileInputStream> f41644b;

    /* renamed from: c */
    private af.c f41645c;

    /* renamed from: d */
    private int f41646d;

    /* renamed from: e */
    private int f41647e;

    /* renamed from: f */
    private int f41648f;

    /* renamed from: g */
    private int f41649g;

    /* renamed from: h */
    private int f41650h;

    /* renamed from: i */
    private int f41651i;

    /* renamed from: j */
    private p001if.a f41652j;

    /* renamed from: k */
    private ColorSpace f41653k;

    /* renamed from: l */
    private boolean f41654l;

    public e(qd.a<PooledByteBuffer> aVar) {
        this.f41645c = af.c.f407b;
        this.f41646d = -1;
        this.f41647e = 0;
        this.f41648f = -1;
        this.f41649g = -1;
        this.f41650h = 1;
        this.f41651i = -1;
        k.b(Boolean.valueOf(qd.a.n0(aVar)));
        this.f41643a = aVar.clone();
        this.f41644b = null;
    }

    public static boolean D0(e eVar) {
        return eVar.f41646d >= 0 && eVar.f41648f >= 0 && eVar.f41649g >= 0;
    }

    public static boolean G0(e eVar) {
        return eVar != null && eVar.F0();
    }

    private void J0() {
        if (this.f41648f < 0 || this.f41649g < 0) {
            I0();
        }
    }

    private com.facebook.imageutils.b P0() {
        InputStream inputStream;
        try {
            inputStream = R();
            try {
                com.facebook.imageutils.b b11 = com.facebook.imageutils.a.b(inputStream);
                this.f41653k = b11.a();
                Pair<Integer, Integer> b12 = b11.b();
                if (b12 != null) {
                    this.f41648f = ((Integer) b12.first).intValue();
                    this.f41649g = ((Integer) b12.second).intValue();
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return b11;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    private Pair<Integer, Integer> Q0() {
        Pair<Integer, Integer> g11 = com.facebook.imageutils.f.g(R());
        if (g11 != null) {
            this.f41648f = ((Integer) g11.first).intValue();
            this.f41649g = ((Integer) g11.second).intValue();
        }
        return g11;
    }

    public static e g(e eVar) {
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    public static void j(e eVar) {
        if (eVar != null) {
            eVar.close();
        }
    }

    private void u0() {
        Pair<Integer, Integer> b11;
        af.c c11 = af.d.c(R());
        this.f41645c = c11;
        if (af.b.b(c11)) {
            b11 = Q0();
        } else {
            b11 = P0().b();
        }
        if (c11 == af.b.f395a && this.f41646d == -1) {
            if (b11 != null) {
                int b12 = com.facebook.imageutils.c.b(R());
                this.f41647e = b12;
                this.f41646d = com.facebook.imageutils.c.a(b12);
            }
        } else if (c11 == af.b.f405k && this.f41646d == -1) {
            int a11 = HeifExifUtil.a(R());
            this.f41647e = a11;
            this.f41646d = com.facebook.imageutils.c.a(a11);
        } else if (this.f41646d == -1) {
            this.f41646d = 0;
        }
    }

    public ColorSpace C() {
        J0();
        return this.f41653k;
    }

    public boolean C0(int i11) {
        af.c cVar = this.f41645c;
        if ((cVar == af.b.f395a || cVar == af.b.f406l) && this.f41644b == null) {
            k.g(this.f41643a);
            PooledByteBuffer J = this.f41643a.J();
            return J.n(i11 + (-2)) == -1 && J.n(i11 - 1) == -39;
        }
        return true;
    }

    public int D() {
        J0();
        return this.f41647e;
    }

    public synchronized boolean F0() {
        boolean z11;
        if (!qd.a.n0(this.f41643a)) {
            z11 = this.f41644b != null;
        }
        return z11;
    }

    public void I0() {
        if (!f41642m) {
            u0();
        } else if (this.f41654l) {
        } else {
            u0();
            this.f41654l = true;
        }
    }

    public String J(int i11) {
        qd.a<PooledByteBuffer> m11 = m();
        if (m11 == null) {
            return "";
        }
        int min = Math.min(p0(), i11);
        byte[] bArr = new byte[min];
        try {
            PooledByteBuffer J = m11.J();
            if (J == null) {
                return "";
            }
            J.h(0, bArr, 0, min);
            m11.close();
            StringBuilder sb2 = new StringBuilder(min * 2);
            for (int i12 = 0; i12 < min; i12++) {
                sb2.append(String.format("%02X", Byte.valueOf(bArr[i12])));
            }
            return sb2.toString();
        } finally {
            m11.close();
        }
    }

    public af.c L() {
        J0();
        return this.f41645c;
    }

    public InputStream R() {
        n<FileInputStream> nVar = this.f41644b;
        if (nVar != null) {
            return nVar.get();
        }
        qd.a m11 = qd.a.m(this.f41643a);
        if (m11 != null) {
            try {
                return new pd.h((PooledByteBuffer) m11.J());
            } finally {
                qd.a.C(m11);
            }
        }
        return null;
    }

    public void R0(p001if.a aVar) {
        this.f41652j = aVar;
    }

    public void S0(int i11) {
        this.f41647e = i11;
    }

    public void X0(int i11) {
        this.f41649g = i11;
    }

    public void Z0(af.c cVar) {
        this.f41645c = cVar;
    }

    public e a() {
        e eVar;
        n<FileInputStream> nVar = this.f41644b;
        if (nVar != null) {
            eVar = new e(nVar, this.f41651i);
        } else {
            qd.a m11 = qd.a.m(this.f41643a);
            if (m11 == null) {
                eVar = null;
            } else {
                try {
                    eVar = new e(m11);
                } finally {
                    qd.a.C(m11);
                }
            }
        }
        if (eVar != null) {
            eVar.l(this);
        }
        return eVar;
    }

    public InputStream a0() {
        return (InputStream) k.g(R());
    }

    public void b1(int i11) {
        this.f41646d = i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        qd.a.C(this.f41643a);
    }

    public int e0() {
        J0();
        return this.f41646d;
    }

    public int getHeight() {
        J0();
        return this.f41649g;
    }

    public int getWidth() {
        J0();
        return this.f41648f;
    }

    public void h1(int i11) {
        this.f41650h = i11;
    }

    public void l(e eVar) {
        this.f41645c = eVar.L();
        this.f41648f = eVar.getWidth();
        this.f41649g = eVar.getHeight();
        this.f41646d = eVar.e0();
        this.f41647e = eVar.D();
        this.f41650h = eVar.n0();
        this.f41651i = eVar.p0();
        this.f41652j = eVar.p();
        this.f41653k = eVar.C();
        this.f41654l = eVar.t0();
    }

    public qd.a<PooledByteBuffer> m() {
        return qd.a.m(this.f41643a);
    }

    public int n0() {
        return this.f41650h;
    }

    public p001if.a p() {
        return this.f41652j;
    }

    public int p0() {
        qd.a<PooledByteBuffer> aVar = this.f41643a;
        if (aVar != null && aVar.J() != null) {
            return this.f41643a.J().size();
        }
        return this.f41651i;
    }

    public void p1(int i11) {
        this.f41648f = i11;
    }

    protected boolean t0() {
        return this.f41654l;
    }

    public e(n<FileInputStream> nVar) {
        this.f41645c = af.c.f407b;
        this.f41646d = -1;
        this.f41647e = 0;
        this.f41648f = -1;
        this.f41649g = -1;
        this.f41650h = 1;
        this.f41651i = -1;
        k.g(nVar);
        this.f41643a = null;
        this.f41644b = nVar;
    }

    public e(n<FileInputStream> nVar, int i11) {
        this(nVar);
        this.f41651i = i11;
    }
}