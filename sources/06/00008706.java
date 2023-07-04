package mq;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f38719a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f38720b;

    /* renamed from: c  reason: collision with root package name */
    c f38721c;

    /* loaded from: classes2.dex */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private int f38722a;

        /* renamed from: b  reason: collision with root package name */
        private c[] f38723b = new c[6];

        private void a(c cVar) {
            int i11 = this.f38722a;
            c[] cVarArr = this.f38723b;
            if (i11 >= cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length + 6];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, i11);
                this.f38723b = cVarArr2;
            }
            c[] cVarArr3 = this.f38723b;
            int i12 = this.f38722a;
            this.f38722a = i12 + 1;
            cVarArr3[i12] = cVar;
        }

        private boolean c(c cVar) {
            for (int i11 = 0; i11 < this.f38722a; i11++) {
                if (this.f38723b[i11].f38719a.equals(cVar.f38719a)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(c cVar) {
            while (cVar != null) {
                if (!c(cVar)) {
                    a(cVar);
                }
                cVar = cVar.f38721c;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c[] d() {
            int i11 = this.f38722a;
            c[] cVarArr = new c[i11];
            System.arraycopy(this.f38723b, 0, cVarArr, 0, i11);
            return cVarArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(String str) {
        this.f38719a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(a0 a0Var, int i11, int i12) {
        int i13;
        if ((i11 & 4096) == 0 || a0Var.R() >= 49) {
            i13 = 0;
        } else {
            a0Var.D("Synthetic");
            i13 = 6;
        }
        if (i12 != 0) {
            a0Var.D("Signature");
            i13 += 8;
        }
        if ((i11 & 131072) != 0) {
            a0Var.D("Deprecated");
            return i13 + 6;
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(a0 a0Var, int i11, int i12, d dVar) {
        if ((i11 & 4096) != 0 && a0Var.R() < 49) {
            dVar.k(a0Var.D("Synthetic")).i(0);
        }
        if (i12 != 0) {
            dVar.k(a0Var.D("Signature")).i(2).k(i12);
        }
        if ((i11 & 131072) != 0) {
            dVar.k(a0Var.D("Deprecated")).i(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(a0 a0Var) {
        return c(a0Var, null, 0, -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(a0 a0Var, byte[] bArr, int i11, int i12, int i13) {
        g gVar = a0Var.f38685a;
        int i14 = 0;
        for (c cVar = this; cVar != null; cVar = cVar.f38721c) {
            a0Var.D(cVar.f38719a);
            i14 += cVar.j(gVar, bArr, i11, i12, i13).f38727b + 6;
        }
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d() {
        int i11 = 0;
        for (c cVar = this; cVar != null; cVar = cVar.f38721c) {
            i11++;
        }
        return i11;
    }

    public boolean e() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(a0 a0Var, d dVar) {
        h(a0Var, null, 0, -1, -1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(a0 a0Var, byte[] bArr, int i11, int i12, int i13, d dVar) {
        g gVar = a0Var.f38685a;
        for (c cVar = this; cVar != null; cVar = cVar.f38721c) {
            d j11 = cVar.j(gVar, bArr, i11, i12, i13);
            dVar.k(a0Var.D(cVar.f38719a)).i(j11.f38727b);
            dVar.h(j11.f38726a, 0, j11.f38727b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c i(e eVar, int i11, int i12, char[] cArr, int i13, r[] rVarArr) {
        c cVar = new c(this.f38719a);
        byte[] bArr = new byte[i12];
        cVar.f38720b = bArr;
        System.arraycopy(eVar.f38729b, i11, bArr, 0, i12);
        return cVar;
    }

    protected d j(g gVar, byte[] bArr, int i11, int i12, int i13) {
        return new d(this.f38720b);
    }
}