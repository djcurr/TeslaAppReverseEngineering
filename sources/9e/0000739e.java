package hp;

import java.util.Formatter;

/* loaded from: classes2.dex */
final class f {

    /* renamed from: a  reason: collision with root package name */
    private final a f29377a;

    /* renamed from: b  reason: collision with root package name */
    private final g[] f29378b;

    /* renamed from: c  reason: collision with root package name */
    private c f29379c;

    /* renamed from: d  reason: collision with root package name */
    private final int f29380d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(a aVar, c cVar) {
        this.f29377a = aVar;
        int a11 = aVar.a();
        this.f29380d = a11;
        this.f29379c = cVar;
        this.f29378b = new g[a11 + 2];
    }

    private void a(g gVar) {
        if (gVar != null) {
            ((h) gVar).g(this.f29377a);
        }
    }

    private static boolean b(d dVar, d dVar2) {
        if (dVar2 != null && dVar2.g() && dVar2.a() == dVar.a()) {
            dVar.i(dVar2.c());
            return true;
        }
        return false;
    }

    private static int c(int i11, int i12, d dVar) {
        if (dVar == null || dVar.g()) {
            return i12;
        }
        if (dVar.h(i11)) {
            dVar.i(i11);
            return 0;
        }
        return i12 + 1;
    }

    private int d() {
        int f11 = f();
        if (f11 == 0) {
            return 0;
        }
        for (int i11 = 1; i11 < this.f29380d + 1; i11++) {
            d[] d11 = this.f29378b[i11].d();
            for (int i12 = 0; i12 < d11.length; i12++) {
                if (d11[i12] != null && !d11[i12].g()) {
                    e(i11, i12, d11);
                }
            }
        }
        return f11;
    }

    private void e(int i11, int i12, d[] dVarArr) {
        d dVar = dVarArr[i12];
        d[] d11 = this.f29378b[i11 - 1].d();
        g[] gVarArr = this.f29378b;
        int i13 = i11 + 1;
        d[] d12 = gVarArr[i13] != null ? gVarArr[i13].d() : d11;
        d[] dVarArr2 = new d[14];
        dVarArr2[2] = d11[i12];
        dVarArr2[3] = d12[i12];
        if (i12 > 0) {
            int i14 = i12 - 1;
            dVarArr2[0] = dVarArr[i14];
            dVarArr2[4] = d11[i14];
            dVarArr2[5] = d12[i14];
        }
        if (i12 > 1) {
            int i15 = i12 - 2;
            dVarArr2[8] = dVarArr[i15];
            dVarArr2[10] = d11[i15];
            dVarArr2[11] = d12[i15];
        }
        if (i12 < dVarArr.length - 1) {
            int i16 = i12 + 1;
            dVarArr2[1] = dVarArr[i16];
            dVarArr2[6] = d11[i16];
            dVarArr2[7] = d12[i16];
        }
        if (i12 < dVarArr.length - 2) {
            int i17 = i12 + 2;
            dVarArr2[9] = dVarArr[i17];
            dVarArr2[12] = d11[i17];
            dVarArr2[13] = d12[i17];
        }
        for (int i18 = 0; i18 < 14 && !b(dVar, dVarArr2[i18]); i18++) {
        }
    }

    private int f() {
        g();
        return h() + i();
    }

    private void g() {
        g[] gVarArr = this.f29378b;
        if (gVarArr[0] == null || gVarArr[this.f29380d + 1] == null) {
            return;
        }
        d[] d11 = gVarArr[0].d();
        d[] d12 = this.f29378b[this.f29380d + 1].d();
        for (int i11 = 0; i11 < d11.length; i11++) {
            if (d11[i11] != null && d12[i11] != null && d11[i11].c() == d12[i11].c()) {
                for (int i12 = 1; i12 <= this.f29380d; i12++) {
                    d dVar = this.f29378b[i12].d()[i11];
                    if (dVar != null) {
                        dVar.i(d11[i11].c());
                        if (!dVar.g()) {
                            this.f29378b[i12].d()[i11] = null;
                        }
                    }
                }
            }
        }
    }

    private int h() {
        g[] gVarArr = this.f29378b;
        if (gVarArr[0] == null) {
            return 0;
        }
        d[] d11 = gVarArr[0].d();
        int i11 = 0;
        for (int i12 = 0; i12 < d11.length; i12++) {
            if (d11[i12] != null) {
                int c11 = d11[i12].c();
                int i13 = 0;
                for (int i14 = 1; i14 < this.f29380d + 1 && i13 < 2; i14++) {
                    d dVar = this.f29378b[i14].d()[i12];
                    if (dVar != null) {
                        i13 = c(c11, i13, dVar);
                        if (!dVar.g()) {
                            i11++;
                        }
                    }
                }
            }
        }
        return i11;
    }

    private int i() {
        g[] gVarArr = this.f29378b;
        int i11 = this.f29380d;
        if (gVarArr[i11 + 1] == null) {
            return 0;
        }
        d[] d11 = gVarArr[i11 + 1].d();
        int i12 = 0;
        for (int i13 = 0; i13 < d11.length; i13++) {
            if (d11[i13] != null) {
                int c11 = d11[i13].c();
                int i14 = 0;
                for (int i15 = this.f29380d + 1; i15 > 0 && i14 < 2; i15--) {
                    d dVar = this.f29378b[i15].d()[i13];
                    if (dVar != null) {
                        i14 = c(c11, i14, dVar);
                        if (!dVar.g()) {
                            i12++;
                        }
                    }
                }
            }
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f29380d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f29377a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return this.f29377a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c m() {
        return this.f29379c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g n(int i11) {
        return this.f29378b[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g[] o() {
        a(this.f29378b[0]);
        a(this.f29378b[this.f29380d + 1]);
        int i11 = 928;
        while (true) {
            int d11 = d();
            if (d11 <= 0 || d11 >= i11) {
                break;
            }
            i11 = d11;
        }
        return this.f29378b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(c cVar) {
        this.f29379c = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(int i11, g gVar) {
        this.f29378b[i11] = gVar;
    }

    public String toString() {
        g[] gVarArr = this.f29378b;
        g gVar = gVarArr[0];
        if (gVar == null) {
            gVar = gVarArr[this.f29380d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i11 = 0; i11 < gVar.d().length; i11++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i11));
                for (int i12 = 0; i12 < this.f29380d + 2; i12++) {
                    g[] gVarArr2 = this.f29378b;
                    if (gVarArr2[i12] == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        d dVar = gVarArr2[i12].d()[i11];
                        if (dVar == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(dVar.c()), Integer.valueOf(dVar.e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        formatter.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}