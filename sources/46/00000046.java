package a3;

import a3.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l  reason: collision with root package name */
    private static float f142l = 0.001f;

    /* renamed from: b  reason: collision with root package name */
    private final b f144b;

    /* renamed from: c  reason: collision with root package name */
    protected final c f145c;

    /* renamed from: a  reason: collision with root package name */
    int f143a = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f146d = 8;

    /* renamed from: e  reason: collision with root package name */
    private i f147e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f148f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    private int[] f149g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    private float[] f150h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    private int f151i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f152j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f153k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar, c cVar) {
        this.f144b = bVar;
        this.f145c = cVar;
    }

    @Override // a3.b.a
    public final float a(i iVar) {
        int i11 = this.f151i;
        for (int i12 = 0; i11 != -1 && i12 < this.f143a; i12++) {
            if (this.f148f[i11] == iVar.f202c) {
                return this.f150h[i11];
            }
            i11 = this.f149g[i11];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // a3.b.a
    public i b(int i11) {
        int i12 = this.f151i;
        for (int i13 = 0; i12 != -1 && i13 < this.f143a; i13++) {
            if (i13 == i11) {
                return this.f145c.f163d[this.f148f[i12]];
            }
            i12 = this.f149g[i12];
        }
        return null;
    }

    @Override // a3.b.a
    public float c(b bVar, boolean z11) {
        float a11 = a(bVar.f154a);
        h(bVar.f154a, z11);
        b.a aVar = bVar.f158e;
        int f11 = aVar.f();
        for (int i11 = 0; i11 < f11; i11++) {
            i b11 = aVar.b(i11);
            j(b11, aVar.a(b11) * a11, z11);
        }
        return a11;
    }

    @Override // a3.b.a
    public final void clear() {
        int i11 = this.f151i;
        for (int i12 = 0; i11 != -1 && i12 < this.f143a; i12++) {
            i iVar = this.f145c.f163d[this.f148f[i11]];
            if (iVar != null) {
                iVar.d(this.f144b);
            }
            i11 = this.f149g[i11];
        }
        this.f151i = -1;
        this.f152j = -1;
        this.f153k = false;
        this.f143a = 0;
    }

    @Override // a3.b.a
    public boolean d(i iVar) {
        int i11 = this.f151i;
        if (i11 == -1) {
            return false;
        }
        for (int i12 = 0; i11 != -1 && i12 < this.f143a; i12++) {
            if (this.f148f[i11] == iVar.f202c) {
                return true;
            }
            i11 = this.f149g[i11];
        }
        return false;
    }

    @Override // a3.b.a
    public final void e(i iVar, float f11) {
        if (f11 == BitmapDescriptorFactory.HUE_RED) {
            h(iVar, true);
            return;
        }
        int i11 = this.f151i;
        if (i11 == -1) {
            this.f151i = 0;
            this.f150h[0] = f11;
            this.f148f[0] = iVar.f202c;
            this.f149g[0] = -1;
            iVar.f212m++;
            iVar.a(this.f144b);
            this.f143a++;
            if (this.f153k) {
                return;
            }
            int i12 = this.f152j + 1;
            this.f152j = i12;
            int[] iArr = this.f148f;
            if (i12 >= iArr.length) {
                this.f153k = true;
                this.f152j = iArr.length - 1;
                return;
            }
            return;
        }
        int i13 = -1;
        for (int i14 = 0; i11 != -1 && i14 < this.f143a; i14++) {
            int[] iArr2 = this.f148f;
            int i15 = iArr2[i11];
            int i16 = iVar.f202c;
            if (i15 == i16) {
                this.f150h[i11] = f11;
                return;
            }
            if (iArr2[i11] < i16) {
                i13 = i11;
            }
            i11 = this.f149g[i11];
        }
        int i17 = this.f152j;
        int i18 = i17 + 1;
        if (this.f153k) {
            int[] iArr3 = this.f148f;
            if (iArr3[i17] != -1) {
                i17 = iArr3.length;
            }
        } else {
            i17 = i18;
        }
        int[] iArr4 = this.f148f;
        if (i17 >= iArr4.length && this.f143a < iArr4.length) {
            int i19 = 0;
            while (true) {
                int[] iArr5 = this.f148f;
                if (i19 >= iArr5.length) {
                    break;
                } else if (iArr5[i19] == -1) {
                    i17 = i19;
                    break;
                } else {
                    i19++;
                }
            }
        }
        int[] iArr6 = this.f148f;
        if (i17 >= iArr6.length) {
            i17 = iArr6.length;
            int i21 = this.f146d * 2;
            this.f146d = i21;
            this.f153k = false;
            this.f152j = i17 - 1;
            this.f150h = Arrays.copyOf(this.f150h, i21);
            this.f148f = Arrays.copyOf(this.f148f, this.f146d);
            this.f149g = Arrays.copyOf(this.f149g, this.f146d);
        }
        this.f148f[i17] = iVar.f202c;
        this.f150h[i17] = f11;
        if (i13 != -1) {
            int[] iArr7 = this.f149g;
            iArr7[i17] = iArr7[i13];
            iArr7[i13] = i17;
        } else {
            this.f149g[i17] = this.f151i;
            this.f151i = i17;
        }
        iVar.f212m++;
        iVar.a(this.f144b);
        int i22 = this.f143a + 1;
        this.f143a = i22;
        if (!this.f153k) {
            this.f152j++;
        }
        int[] iArr8 = this.f148f;
        if (i22 >= iArr8.length) {
            this.f153k = true;
        }
        if (this.f152j >= iArr8.length) {
            this.f153k = true;
            this.f152j = iArr8.length - 1;
        }
    }

    @Override // a3.b.a
    public int f() {
        return this.f143a;
    }

    @Override // a3.b.a
    public float g(int i11) {
        int i12 = this.f151i;
        for (int i13 = 0; i12 != -1 && i13 < this.f143a; i13++) {
            if (i13 == i11) {
                return this.f150h[i12];
            }
            i12 = this.f149g[i12];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // a3.b.a
    public final float h(i iVar, boolean z11) {
        if (this.f147e == iVar) {
            this.f147e = null;
        }
        int i11 = this.f151i;
        if (i11 == -1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i12 = 0;
        int i13 = -1;
        while (i11 != -1 && i12 < this.f143a) {
            if (this.f148f[i11] == iVar.f202c) {
                if (i11 == this.f151i) {
                    this.f151i = this.f149g[i11];
                } else {
                    int[] iArr = this.f149g;
                    iArr[i13] = iArr[i11];
                }
                if (z11) {
                    iVar.d(this.f144b);
                }
                iVar.f212m--;
                this.f143a--;
                this.f148f[i11] = -1;
                if (this.f153k) {
                    this.f152j = i11;
                }
                return this.f150h[i11];
            }
            i12++;
            i13 = i11;
            i11 = this.f149g[i11];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // a3.b.a
    public void i(float f11) {
        int i11 = this.f151i;
        for (int i12 = 0; i11 != -1 && i12 < this.f143a; i12++) {
            float[] fArr = this.f150h;
            fArr[i11] = fArr[i11] / f11;
            i11 = this.f149g[i11];
        }
    }

    @Override // a3.b.a
    public void invert() {
        int i11 = this.f151i;
        for (int i12 = 0; i11 != -1 && i12 < this.f143a; i12++) {
            float[] fArr = this.f150h;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f149g[i11];
        }
    }

    @Override // a3.b.a
    public void j(i iVar, float f11, boolean z11) {
        float f12 = f142l;
        if (f11 <= (-f12) || f11 >= f12) {
            int i11 = this.f151i;
            if (i11 == -1) {
                this.f151i = 0;
                this.f150h[0] = f11;
                this.f148f[0] = iVar.f202c;
                this.f149g[0] = -1;
                iVar.f212m++;
                iVar.a(this.f144b);
                this.f143a++;
                if (this.f153k) {
                    return;
                }
                int i12 = this.f152j + 1;
                this.f152j = i12;
                int[] iArr = this.f148f;
                if (i12 >= iArr.length) {
                    this.f153k = true;
                    this.f152j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i13 = -1;
            for (int i14 = 0; i11 != -1 && i14 < this.f143a; i14++) {
                int[] iArr2 = this.f148f;
                int i15 = iArr2[i11];
                int i16 = iVar.f202c;
                if (i15 == i16) {
                    float[] fArr = this.f150h;
                    float f13 = fArr[i11] + f11;
                    float f14 = f142l;
                    if (f13 > (-f14) && f13 < f14) {
                        f13 = 0.0f;
                    }
                    fArr[i11] = f13;
                    if (f13 == BitmapDescriptorFactory.HUE_RED) {
                        if (i11 == this.f151i) {
                            this.f151i = this.f149g[i11];
                        } else {
                            int[] iArr3 = this.f149g;
                            iArr3[i13] = iArr3[i11];
                        }
                        if (z11) {
                            iVar.d(this.f144b);
                        }
                        if (this.f153k) {
                            this.f152j = i11;
                        }
                        iVar.f212m--;
                        this.f143a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i11] < i16) {
                    i13 = i11;
                }
                i11 = this.f149g[i11];
            }
            int i17 = this.f152j;
            int i18 = i17 + 1;
            if (this.f153k) {
                int[] iArr4 = this.f148f;
                if (iArr4[i17] != -1) {
                    i17 = iArr4.length;
                }
            } else {
                i17 = i18;
            }
            int[] iArr5 = this.f148f;
            if (i17 >= iArr5.length && this.f143a < iArr5.length) {
                int i19 = 0;
                while (true) {
                    int[] iArr6 = this.f148f;
                    if (i19 >= iArr6.length) {
                        break;
                    } else if (iArr6[i19] == -1) {
                        i17 = i19;
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            int[] iArr7 = this.f148f;
            if (i17 >= iArr7.length) {
                i17 = iArr7.length;
                int i21 = this.f146d * 2;
                this.f146d = i21;
                this.f153k = false;
                this.f152j = i17 - 1;
                this.f150h = Arrays.copyOf(this.f150h, i21);
                this.f148f = Arrays.copyOf(this.f148f, this.f146d);
                this.f149g = Arrays.copyOf(this.f149g, this.f146d);
            }
            this.f148f[i17] = iVar.f202c;
            this.f150h[i17] = f11;
            if (i13 != -1) {
                int[] iArr8 = this.f149g;
                iArr8[i17] = iArr8[i13];
                iArr8[i13] = i17;
            } else {
                this.f149g[i17] = this.f151i;
                this.f151i = i17;
            }
            iVar.f212m++;
            iVar.a(this.f144b);
            this.f143a++;
            if (!this.f153k) {
                this.f152j++;
            }
            int i22 = this.f152j;
            int[] iArr9 = this.f148f;
            if (i22 >= iArr9.length) {
                this.f153k = true;
                this.f152j = iArr9.length - 1;
            }
        }
    }

    public String toString() {
        int i11 = this.f151i;
        String str = "";
        for (int i12 = 0; i11 != -1 && i12 < this.f143a; i12++) {
            str = ((str + " -> ") + this.f150h[i11] + " : ") + this.f145c.f163d[this.f148f[i11]];
            i11 = this.f149g[i11];
        }
        return str;
    }
}