package q70;

/* loaded from: classes5.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private b f48028a;

    /* renamed from: b  reason: collision with root package name */
    private i f48029b;

    /* renamed from: c  reason: collision with root package name */
    protected i[] f48030c;

    /* renamed from: d  reason: collision with root package name */
    protected i[] f48031d;

    public k(b bVar, i iVar) {
        this.f48028a = bVar;
        this.f48029b = iVar;
        b();
        a();
    }

    private void a() {
        int f11;
        int g11 = this.f48029b.g();
        i[] iVarArr = new i[g11];
        int i11 = g11 - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            iVarArr[i12] = new i(this.f48030c[i12]);
        }
        this.f48031d = new i[g11];
        while (i11 >= 0) {
            this.f48031d[i11] = new i(this.f48028a, i11);
            i11--;
        }
        for (int i13 = 0; i13 < g11; i13++) {
            if (iVarArr[i13].f(i13) == 0) {
                int i14 = i13 + 1;
                boolean z11 = false;
                while (i14 < g11) {
                    if (iVarArr[i14].f(i13) != 0) {
                        d(iVarArr, i13, i14);
                        d(this.f48031d, i13, i14);
                        i14 = g11;
                        z11 = true;
                    }
                    i14++;
                }
                if (!z11) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int f12 = this.f48028a.f(iVarArr[i13].f(i13));
            iVarArr[i13].m(f12);
            this.f48031d[i13].m(f12);
            for (int i15 = 0; i15 < g11; i15++) {
                if (i15 != i13 && (f11 = iVarArr[i15].f(i13)) != 0) {
                    i n11 = iVarArr[i13].n(f11);
                    i n12 = this.f48031d[i13].n(f11);
                    iVarArr[i15].b(n11);
                    this.f48031d[i15].b(n12);
                }
            }
        }
    }

    private void b() {
        int i11;
        int g11 = this.f48029b.g();
        this.f48030c = new i[g11];
        int i12 = 0;
        while (true) {
            i11 = g11 >> 1;
            if (i12 >= i11) {
                break;
            }
            int i13 = i12 << 1;
            int[] iArr = new int[i13 + 1];
            iArr[i13] = 1;
            this.f48030c[i12] = new i(this.f48028a, iArr);
            i12++;
        }
        while (i11 < g11) {
            int i14 = i11 << 1;
            int[] iArr2 = new int[i14 + 1];
            iArr2[i14] = 1;
            this.f48030c[i11] = new i(this.f48028a, iArr2).k(this.f48029b);
            i11++;
        }
    }

    private static void d(i[] iVarArr, int i11, int i12) {
        i iVar = iVarArr[i11];
        iVarArr[i11] = iVarArr[i12];
        iVarArr[i12] = iVar;
    }

    public i[] c() {
        return this.f48031d;
    }
}