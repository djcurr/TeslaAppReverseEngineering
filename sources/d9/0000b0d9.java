package ri;

import ak.v;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;

/* loaded from: classes3.dex */
final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f49593a;

    /* renamed from: b  reason: collision with root package name */
    public int f49594b;

    /* renamed from: c  reason: collision with root package name */
    public long f49595c;

    /* renamed from: d  reason: collision with root package name */
    public int f49596d;

    /* renamed from: e  reason: collision with root package name */
    public int f49597e;

    /* renamed from: f  reason: collision with root package name */
    public int f49598f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f49599g = new int[255];

    /* renamed from: h  reason: collision with root package name */
    private final v f49600h = new v(255);

    private static boolean a(ji.i iVar, byte[] bArr, int i11, int i12, boolean z11) {
        try {
            return iVar.a(bArr, i11, i12, z11);
        } catch (EOFException e11) {
            if (z11) {
                return false;
            }
            throw e11;
        }
    }

    public boolean b(ji.i iVar, boolean z11) {
        c();
        this.f49600h.K(27);
        if (a(iVar, this.f49600h.d(), 0, 27, z11) && this.f49600h.E() == 1332176723) {
            int C = this.f49600h.C();
            this.f49593a = C;
            if (C != 0) {
                if (z11) {
                    return false;
                }
                throw new ParserException("unsupported bit stream revision");
            }
            this.f49594b = this.f49600h.C();
            this.f49595c = this.f49600h.q();
            this.f49600h.s();
            this.f49600h.s();
            this.f49600h.s();
            int C2 = this.f49600h.C();
            this.f49596d = C2;
            this.f49597e = C2 + 27;
            this.f49600h.K(C2);
            iVar.n(this.f49600h.d(), 0, this.f49596d);
            for (int i11 = 0; i11 < this.f49596d; i11++) {
                this.f49599g[i11] = this.f49600h.C();
                this.f49598f += this.f49599g[i11];
            }
            return true;
        }
        return false;
    }

    public void c() {
        this.f49593a = 0;
        this.f49594b = 0;
        this.f49595c = 0L;
        this.f49596d = 0;
        this.f49597e = 0;
        this.f49598f = 0;
    }

    public boolean d(ji.i iVar) {
        return e(iVar, -1L);
    }

    public boolean e(ji.i iVar, long j11) {
        int i11;
        ak.a.a(iVar.getPosition() == iVar.f());
        this.f49600h.K(4);
        while (true) {
            i11 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
            if ((i11 == 0 || iVar.getPosition() + 4 < j11) && a(iVar, this.f49600h.d(), 0, 4, true)) {
                this.f49600h.O(0);
                if (this.f49600h.E() == 1332176723) {
                    iVar.d();
                    return true;
                }
                iVar.k(1);
            }
        }
        do {
            if (i11 != 0 && iVar.getPosition() >= j11) {
                break;
            }
        } while (iVar.h(1) != -1);
        return false;
    }
}