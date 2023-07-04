package vo;

import com.google.zxing.NotFoundException;
import com.google.zxing.l;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final uo.b f54574a;

    /* renamed from: b  reason: collision with root package name */
    private final int f54575b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54576c;

    /* renamed from: d  reason: collision with root package name */
    private final int f54577d;

    /* renamed from: e  reason: collision with root package name */
    private final int f54578e;

    /* renamed from: f  reason: collision with root package name */
    private final int f54579f;

    /* renamed from: g  reason: collision with root package name */
    private final int f54580g;

    public b(uo.b bVar) {
        this(bVar, 10, bVar.j() / 2, bVar.g() / 2);
    }

    private l[] a(l lVar, l lVar2, l lVar3, l lVar4) {
        float c11 = lVar.c();
        float d11 = lVar.d();
        float c12 = lVar2.c();
        float d12 = lVar2.d();
        float c13 = lVar3.c();
        float d13 = lVar3.d();
        float c14 = lVar4.c();
        float d14 = lVar4.d();
        return c11 < ((float) this.f54576c) / 2.0f ? new l[]{new l(c14 - 1.0f, d14 + 1.0f), new l(c12 + 1.0f, d12 + 1.0f), new l(c13 - 1.0f, d13 - 1.0f), new l(c11 + 1.0f, d11 - 1.0f)} : new l[]{new l(c14 + 1.0f, d14 + 1.0f), new l(c12 + 1.0f, d12 - 1.0f), new l(c13 - 1.0f, d13 + 1.0f), new l(c11 - 1.0f, d11 - 1.0f)};
    }

    private boolean b(int i11, int i12, int i13, boolean z11) {
        if (z11) {
            while (i11 <= i12) {
                if (this.f54574a.d(i11, i13)) {
                    return true;
                }
                i11++;
            }
            return false;
        }
        while (i11 <= i12) {
            if (this.f54574a.d(i13, i11)) {
                return true;
            }
            i11++;
        }
        return false;
    }

    private l d(float f11, float f12, float f13, float f14) {
        int c11 = a.c(a.a(f11, f12, f13, f14));
        float f15 = c11;
        float f16 = (f13 - f11) / f15;
        float f17 = (f14 - f12) / f15;
        for (int i11 = 0; i11 < c11; i11++) {
            float f18 = i11;
            int c12 = a.c((f18 * f16) + f11);
            int c13 = a.c((f18 * f17) + f12);
            if (this.f54574a.d(c12, c13)) {
                return new l(c12, c13);
            }
        }
        return null;
    }

    public l[] c() {
        int i11 = this.f54577d;
        int i12 = this.f54578e;
        int i13 = this.f54580g;
        int i14 = this.f54579f;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = true;
        while (z17) {
            boolean z18 = false;
            boolean z19 = true;
            while (true) {
                if ((z19 || !z12) && i12 < this.f54576c) {
                    z19 = b(i13, i14, i12, false);
                    if (z19) {
                        i12++;
                        z12 = true;
                        z18 = true;
                    } else if (!z12) {
                        i12++;
                    }
                }
            }
            if (i12 < this.f54576c) {
                boolean z21 = true;
                while (true) {
                    if ((z21 || !z13) && i14 < this.f54575b) {
                        z21 = b(i11, i12, i14, true);
                        if (z21) {
                            i14++;
                            z13 = true;
                            z18 = true;
                        } else if (!z13) {
                            i14++;
                        }
                    }
                }
                if (i14 < this.f54575b) {
                    boolean z22 = true;
                    while (true) {
                        if ((z22 || !z14) && i11 >= 0) {
                            z22 = b(i13, i14, i11, false);
                            if (z22) {
                                i11--;
                                z14 = true;
                                z18 = true;
                            } else if (!z14) {
                                i11--;
                            }
                        }
                    }
                    if (i11 >= 0) {
                        z17 = z18;
                        boolean z23 = true;
                        while (true) {
                            if ((z23 || !z16) && i13 >= 0) {
                                z23 = b(i11, i12, i13, true);
                                if (z23) {
                                    i13--;
                                    z17 = true;
                                    z16 = true;
                                } else if (!z16) {
                                    i13--;
                                }
                            }
                        }
                        if (i13 >= 0) {
                            if (z17) {
                                z15 = true;
                            }
                        }
                    }
                }
            }
            z11 = true;
            break;
        }
        if (z11 || !z15) {
            throw NotFoundException.a();
        }
        int i15 = i12 - i11;
        l lVar = null;
        l lVar2 = null;
        for (int i16 = 1; lVar2 == null && i16 < i15; i16++) {
            lVar2 = d(i11, i14 - i16, i11 + i16, i14);
        }
        if (lVar2 != null) {
            l lVar3 = null;
            for (int i17 = 1; lVar3 == null && i17 < i15; i17++) {
                lVar3 = d(i11, i13 + i17, i11 + i17, i13);
            }
            if (lVar3 != null) {
                l lVar4 = null;
                for (int i18 = 1; lVar4 == null && i18 < i15; i18++) {
                    lVar4 = d(i12, i13 + i18, i12 - i18, i13);
                }
                if (lVar4 != null) {
                    for (int i19 = 1; lVar == null && i19 < i15; i19++) {
                        lVar = d(i12, i14 - i19, i12 - i19, i14);
                    }
                    if (lVar != null) {
                        return a(lVar, lVar2, lVar4, lVar3);
                    }
                    throw NotFoundException.a();
                }
                throw NotFoundException.a();
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }

    public b(uo.b bVar, int i11, int i12, int i13) {
        this.f54574a = bVar;
        int g11 = bVar.g();
        this.f54575b = g11;
        int j11 = bVar.j();
        this.f54576c = j11;
        int i14 = i11 / 2;
        int i15 = i12 - i14;
        this.f54577d = i15;
        int i16 = i12 + i14;
        this.f54578e = i16;
        int i17 = i13 - i14;
        this.f54580g = i17;
        int i18 = i13 + i14;
        this.f54579f = i18;
        if (i17 < 0 || i15 < 0 || i18 >= g11 || i16 >= j11) {
            throw NotFoundException.a();
        }
    }
}