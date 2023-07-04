package mq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f38699a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f38700b;

    /* renamed from: c  reason: collision with root package name */
    private final d f38701c;

    /* renamed from: d  reason: collision with root package name */
    private final int f38702d;

    /* renamed from: e  reason: collision with root package name */
    private int f38703e;

    /* renamed from: f  reason: collision with root package name */
    private final b f38704f;

    /* renamed from: g  reason: collision with root package name */
    private b f38705g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a0 a0Var, boolean z11, d dVar, b bVar) {
        super(589824);
        this.f38699a = a0Var;
        this.f38700b = z11;
        this.f38701c = dVar;
        int i11 = dVar.f38727b;
        this.f38702d = i11 == 0 ? -1 : i11 - 2;
        this.f38704f = bVar;
        if (bVar != null) {
            bVar.f38705g = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(b bVar, b bVar2, b bVar3, b bVar4) {
        int f11 = bVar != null ? 0 + bVar.f("RuntimeVisibleAnnotations") : 0;
        if (bVar2 != null) {
            f11 += bVar2.f("RuntimeInvisibleAnnotations");
        }
        if (bVar3 != null) {
            f11 += bVar3.f("RuntimeVisibleTypeAnnotations");
        }
        return bVar4 != null ? f11 + bVar4.f("RuntimeInvisibleTypeAnnotations") : f11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(String str, b[] bVarArr, int i11) {
        b bVar;
        int i12 = (i11 * 2) + 7;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += bVarArr[i13] == null ? 0 : bVar.f(str) - 8;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b i(a0 a0Var, int i11, c0 c0Var, String str, b bVar) {
        d dVar = new d();
        d0.a(i11, dVar);
        c0.d(c0Var, dVar);
        dVar.k(a0Var.D(str)).k(0);
        return new b(a0Var, true, dVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b j(a0 a0Var, String str, b bVar) {
        d dVar = new d();
        dVar.k(a0Var.D(str)).k(0);
        return new b(a0Var, true, dVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(a0 a0Var, b bVar, b bVar2, b bVar3, b bVar4, d dVar) {
        if (bVar != null) {
            bVar.k(a0Var.D("RuntimeVisibleAnnotations"), dVar);
        }
        if (bVar2 != null) {
            bVar2.k(a0Var.D("RuntimeInvisibleAnnotations"), dVar);
        }
        if (bVar3 != null) {
            bVar3.k(a0Var.D("RuntimeVisibleTypeAnnotations"), dVar);
        }
        if (bVar4 != null) {
            bVar4.k(a0Var.D("RuntimeInvisibleTypeAnnotations"), dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(int i11, b[] bVarArr, int i12, d dVar) {
        b bVar;
        int i13 = (i12 * 2) + 1;
        for (int i14 = 0; i14 < i12; i14++) {
            i13 += bVarArr[i14] == null ? 0 : bVar.f(null) - 8;
        }
        dVar.k(i11);
        dVar.i(i13);
        dVar.g(i12);
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = 0;
            b bVar2 = null;
            for (b bVar3 = bVarArr[i15]; bVar3 != null; bVar3 = bVar3.f38704f) {
                bVar3.d();
                i16++;
                bVar2 = bVar3;
            }
            dVar.k(i16);
            while (bVar2 != null) {
                d dVar2 = bVar2.f38701c;
                dVar.h(dVar2.f38726a, 0, dVar2.f38727b);
                bVar2 = bVar2.f38705g;
            }
        }
    }

    @Override // mq.a
    public void a(String str, Object obj) {
        this.f38703e++;
        if (this.f38700b) {
            this.f38701c.k(this.f38699a.D(str));
        }
        if (obj instanceof String) {
            this.f38701c.e(115, this.f38699a.D((String) obj));
        } else if (obj instanceof Byte) {
            this.f38701c.e(66, this.f38699a.l(((Byte) obj).byteValue()).f38895a);
        } else if (obj instanceof Boolean) {
            this.f38701c.e(90, this.f38699a.l(((Boolean) obj).booleanValue() ? 1 : 0).f38895a);
        } else if (obj instanceof Character) {
            this.f38701c.e(67, this.f38699a.l(((Character) obj).charValue()).f38895a);
        } else if (obj instanceof Short) {
            this.f38701c.e(83, this.f38699a.l(((Short) obj).shortValue()).f38895a);
        } else if (obj instanceof b0) {
            this.f38701c.e(99, this.f38699a.D(((b0) obj).d()));
        } else {
            int i11 = 0;
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.f38701c.e(91, bArr.length);
                int length = bArr.length;
                while (i11 < length) {
                    this.f38701c.e(66, this.f38699a.l(bArr[i11]).f38895a);
                    i11++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                this.f38701c.e(91, zArr.length);
                int length2 = zArr.length;
                while (i11 < length2) {
                    this.f38701c.e(90, this.f38699a.l(zArr[i11] ? 1 : 0).f38895a);
                    i11++;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                this.f38701c.e(91, sArr.length);
                int length3 = sArr.length;
                while (i11 < length3) {
                    this.f38701c.e(83, this.f38699a.l(sArr[i11]).f38895a);
                    i11++;
                }
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                this.f38701c.e(91, cArr.length);
                int length4 = cArr.length;
                while (i11 < length4) {
                    this.f38701c.e(67, this.f38699a.l(cArr[i11]).f38895a);
                    i11++;
                }
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                this.f38701c.e(91, iArr.length);
                int length5 = iArr.length;
                while (i11 < length5) {
                    this.f38701c.e(73, this.f38699a.l(iArr[i11]).f38895a);
                    i11++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                this.f38701c.e(91, jArr.length);
                int length6 = jArr.length;
                while (i11 < length6) {
                    this.f38701c.e(74, this.f38699a.p(jArr[i11]).f38895a);
                    i11++;
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                this.f38701c.e(91, fArr.length);
                int length7 = fArr.length;
                while (i11 < length7) {
                    this.f38701c.e(70, this.f38699a.k(fArr[i11]).f38895a);
                    i11++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                this.f38701c.e(91, dArr.length);
                int length8 = dArr.length;
                while (i11 < length8) {
                    this.f38701c.e(68, this.f38699a.f(dArr[i11]).f38895a);
                    i11++;
                }
            } else {
                z d11 = this.f38699a.d(obj);
                this.f38701c.e(".s.IFJDCS".charAt(d11.f38896b), d11.f38895a);
            }
        }
    }

    @Override // mq.a
    public a b(String str, String str2) {
        this.f38703e++;
        if (this.f38700b) {
            this.f38701c.k(this.f38699a.D(str));
        }
        this.f38701c.e(64, this.f38699a.D(str2)).k(0);
        return new b(this.f38699a, true, this.f38701c, null);
    }

    @Override // mq.a
    public a c(String str) {
        this.f38703e++;
        if (this.f38700b) {
            this.f38701c.k(this.f38699a.D(str));
        }
        this.f38701c.e(91, 0);
        return new b(this.f38699a, false, this.f38701c, null);
    }

    @Override // mq.a
    public void d() {
        int i11 = this.f38702d;
        if (i11 != -1) {
            byte[] bArr = this.f38701c.f38726a;
            int i12 = this.f38703e;
            bArr[i11] = (byte) (i12 >>> 8);
            bArr[i11 + 1] = (byte) i12;
        }
    }

    @Override // mq.a
    public void e(String str, String str2, String str3) {
        this.f38703e++;
        if (this.f38700b) {
            this.f38701c.k(this.f38699a.D(str));
        }
        this.f38701c.e(101, this.f38699a.D(str2)).k(this.f38699a.D(str3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f(String str) {
        if (str != null) {
            this.f38699a.D(str);
        }
        int i11 = 8;
        for (b bVar = this; bVar != null; bVar = bVar.f38704f) {
            i11 += bVar.f38701c.f38727b;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(int i11, d dVar) {
        int i12 = 2;
        int i13 = 0;
        b bVar = null;
        for (b bVar2 = this; bVar2 != null; bVar2 = bVar2.f38704f) {
            bVar2.d();
            i12 += bVar2.f38701c.f38727b;
            i13++;
            bVar = bVar2;
        }
        dVar.k(i11);
        dVar.i(i12);
        dVar.k(i13);
        while (bVar != null) {
            d dVar2 = bVar.f38701c;
            dVar.h(dVar2.f38726a, 0, dVar2.f38727b);
            bVar = bVar.f38705g;
        }
    }
}