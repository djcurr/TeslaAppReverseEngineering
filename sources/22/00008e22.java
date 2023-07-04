package oi;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayDeque;
import ji.i;

/* loaded from: classes3.dex */
final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f42465a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<b> f42466b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private final g f42467c = new g();

    /* renamed from: d  reason: collision with root package name */
    private oi.b f42468d;

    /* renamed from: e  reason: collision with root package name */
    private int f42469e;

    /* renamed from: f  reason: collision with root package name */
    private int f42470f;

    /* renamed from: g  reason: collision with root package name */
    private long f42471g;

    /* loaded from: classes3.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f42472a;

        /* renamed from: b  reason: collision with root package name */
        private final long f42473b;

        private b(int i11, long j11) {
            this.f42472a = i11;
            this.f42473b = j11;
        }
    }

    private long c(i iVar) {
        iVar.d();
        while (true) {
            iVar.n(this.f42465a, 0, 4);
            int c11 = g.c(this.f42465a[0]);
            if (c11 != -1 && c11 <= 4) {
                int a11 = (int) g.a(this.f42465a, c11, false);
                if (this.f42468d.f(a11)) {
                    iVar.k(c11);
                    return a11;
                }
            }
            iVar.k(1);
        }
    }

    private double d(i iVar, int i11) {
        long e11 = e(iVar, i11);
        if (i11 == 4) {
            return Float.intBitsToFloat((int) e11);
        }
        return Double.longBitsToDouble(e11);
    }

    private long e(i iVar, int i11) {
        iVar.readFully(this.f42465a, 0, i11);
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 = (j11 << 8) | (this.f42465a[i12] & 255);
        }
        return j11;
    }

    private static String f(i iVar, int i11) {
        if (i11 == 0) {
            return "";
        }
        byte[] bArr = new byte[i11];
        iVar.readFully(bArr, 0, i11);
        while (i11 > 0 && bArr[i11 - 1] == 0) {
            i11--;
        }
        return new String(bArr, 0, i11);
    }

    @Override // oi.c
    public boolean a(i iVar) {
        ak.a.h(this.f42468d);
        while (true) {
            b peek = this.f42466b.peek();
            if (peek != null && iVar.getPosition() >= peek.f42473b) {
                this.f42468d.a(this.f42466b.pop().f42472a);
                return true;
            }
            if (this.f42469e == 0) {
                long d11 = this.f42467c.d(iVar, true, false, 4);
                if (d11 == -2) {
                    d11 = c(iVar);
                }
                if (d11 == -1) {
                    return false;
                }
                this.f42470f = (int) d11;
                this.f42469e = 1;
            }
            if (this.f42469e == 1) {
                this.f42471g = this.f42467c.d(iVar, false, true, 8);
                this.f42469e = 2;
            }
            int e11 = this.f42468d.e(this.f42470f);
            if (e11 != 0) {
                if (e11 == 1) {
                    long position = iVar.getPosition();
                    this.f42466b.push(new b(this.f42470f, this.f42471g + position));
                    this.f42468d.h(this.f42470f, position, this.f42471g);
                    this.f42469e = 0;
                    return true;
                } else if (e11 == 2) {
                    long j11 = this.f42471g;
                    if (j11 <= 8) {
                        this.f42468d.d(this.f42470f, e(iVar, (int) j11));
                        this.f42469e = 0;
                        return true;
                    }
                    long j12 = this.f42471g;
                    StringBuilder sb2 = new StringBuilder(42);
                    sb2.append("Invalid integer size: ");
                    sb2.append(j12);
                    throw new ParserException(sb2.toString());
                } else if (e11 == 3) {
                    long j13 = this.f42471g;
                    if (j13 <= 2147483647L) {
                        this.f42468d.g(this.f42470f, f(iVar, (int) j13));
                        this.f42469e = 0;
                        return true;
                    }
                    long j14 = this.f42471g;
                    StringBuilder sb3 = new StringBuilder(41);
                    sb3.append("String element size: ");
                    sb3.append(j14);
                    throw new ParserException(sb3.toString());
                } else if (e11 == 4) {
                    this.f42468d.c(this.f42470f, (int) this.f42471g, iVar);
                    this.f42469e = 0;
                    return true;
                } else if (e11 == 5) {
                    long j15 = this.f42471g;
                    if (j15 != 4 && j15 != 8) {
                        long j16 = this.f42471g;
                        StringBuilder sb4 = new StringBuilder(40);
                        sb4.append("Invalid float size: ");
                        sb4.append(j16);
                        throw new ParserException(sb4.toString());
                    }
                    this.f42468d.b(this.f42470f, d(iVar, (int) j15));
                    this.f42469e = 0;
                    return true;
                } else {
                    StringBuilder sb5 = new StringBuilder(32);
                    sb5.append("Invalid element type ");
                    sb5.append(e11);
                    throw new ParserException(sb5.toString());
                }
            }
            iVar.k((int) this.f42471g);
            this.f42469e = 0;
        }
    }

    @Override // oi.c
    public void b(oi.b bVar) {
        this.f42468d = bVar;
    }

    @Override // oi.c
    public void reset() {
        this.f42469e = 0;
        this.f42466b.clear();
        this.f42467c.e();
    }
}