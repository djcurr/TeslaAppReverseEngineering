package si;

import ak.v;
import ci.i;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import ji.h;
import ji.j;
import ji.u;
import ji.v;
import ji.x;

/* loaded from: classes3.dex */
public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    private final i f50406a;

    /* renamed from: c  reason: collision with root package name */
    private x f50408c;

    /* renamed from: e  reason: collision with root package name */
    private int f50410e;

    /* renamed from: f  reason: collision with root package name */
    private long f50411f;

    /* renamed from: g  reason: collision with root package name */
    private int f50412g;

    /* renamed from: h  reason: collision with root package name */
    private int f50413h;

    /* renamed from: b  reason: collision with root package name */
    private final v f50407b = new v(9);

    /* renamed from: d  reason: collision with root package name */
    private int f50409d = 0;

    public a(i iVar) {
        this.f50406a = iVar;
    }

    private boolean c(ji.i iVar) {
        this.f50407b.K(8);
        if (iVar.e(this.f50407b.d(), 0, 8, true)) {
            if (this.f50407b.m() == 1380139777) {
                this.f50410e = this.f50407b.C();
                return true;
            }
            throw new IOException("Input not RawCC");
        }
        return false;
    }

    private void f(ji.i iVar) {
        while (this.f50412g > 0) {
            this.f50407b.K(3);
            iVar.readFully(this.f50407b.d(), 0, 3);
            this.f50408c.e(this.f50407b, 3);
            this.f50413h += 3;
            this.f50412g--;
        }
        int i11 = this.f50413h;
        if (i11 > 0) {
            this.f50408c.f(this.f50411f, 1, i11, 0, null);
        }
    }

    private boolean g(ji.i iVar) {
        int i11 = this.f50410e;
        if (i11 == 0) {
            this.f50407b.K(5);
            if (!iVar.e(this.f50407b.d(), 0, 5, true)) {
                return false;
            }
            this.f50411f = (this.f50407b.E() * 1000) / 45;
        } else if (i11 == 1) {
            this.f50407b.K(9);
            if (!iVar.e(this.f50407b.d(), 0, 9, true)) {
                return false;
            }
            this.f50411f = this.f50407b.v();
        } else {
            int i12 = this.f50410e;
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("Unsupported version number: ");
            sb2.append(i12);
            throw new ParserException(sb2.toString());
        }
        this.f50412g = this.f50407b.C();
        this.f50413h = 0;
        return true;
    }

    @Override // ji.h
    public void a(long j11, long j12) {
        this.f50409d = 0;
    }

    @Override // ji.h
    public void b(j jVar) {
        jVar.p(new v.b(-9223372036854775807L));
        x f11 = jVar.f(0, 3);
        this.f50408c = f11;
        f11.d(this.f50406a);
        jVar.s();
    }

    @Override // ji.h
    public boolean d(ji.i iVar) {
        this.f50407b.K(8);
        iVar.n(this.f50407b.d(), 0, 8);
        return this.f50407b.m() == 1380139777;
    }

    @Override // ji.h
    public int e(ji.i iVar, u uVar) {
        ak.a.h(this.f50408c);
        while (true) {
            int i11 = this.f50409d;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        f(iVar);
                        this.f50409d = 1;
                        return 0;
                    }
                    throw new IllegalStateException();
                } else if (g(iVar)) {
                    this.f50409d = 2;
                } else {
                    this.f50409d = 0;
                    return -1;
                }
            } else if (!c(iVar)) {
                return -1;
            } else {
                this.f50409d = 1;
            }
        }
    }

    @Override // ji.h
    public void release() {
    }
}