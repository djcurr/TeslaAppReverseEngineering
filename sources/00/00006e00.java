package fa;

import android.graphics.Bitmap;
import android.util.Log;
import fa.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: u  reason: collision with root package name */
    private static final String f26174u = "e";

    /* renamed from: a  reason: collision with root package name */
    private int[] f26175a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f26176b;

    /* renamed from: c  reason: collision with root package name */
    private final a.InterfaceC0513a f26177c;

    /* renamed from: d  reason: collision with root package name */
    private ByteBuffer f26178d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f26179e;

    /* renamed from: f  reason: collision with root package name */
    private short[] f26180f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f26181g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f26182h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f26183i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f26184j;

    /* renamed from: k  reason: collision with root package name */
    private int f26185k;

    /* renamed from: l  reason: collision with root package name */
    private c f26186l;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap f26187m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f26188n;

    /* renamed from: o  reason: collision with root package name */
    private int f26189o;

    /* renamed from: p  reason: collision with root package name */
    private int f26190p;

    /* renamed from: q  reason: collision with root package name */
    private int f26191q;

    /* renamed from: r  reason: collision with root package name */
    private int f26192r;

    /* renamed from: s  reason: collision with root package name */
    private Boolean f26193s;

    /* renamed from: t  reason: collision with root package name */
    private Bitmap.Config f26194t;

    public e(a.InterfaceC0513a interfaceC0513a, c cVar, ByteBuffer byteBuffer, int i11) {
        this(interfaceC0513a);
        q(cVar, byteBuffer, i11);
    }

    private int i(int i11, int i12, int i13) {
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = i11; i19 < this.f26190p + i11; i19++) {
            byte[] bArr = this.f26183i;
            if (i19 >= bArr.length || i19 >= i12) {
                break;
            }
            int i21 = this.f26175a[bArr[i19] & 255];
            if (i21 != 0) {
                i14 += (i21 >> 24) & 255;
                i15 += (i21 >> 16) & 255;
                i16 += (i21 >> 8) & 255;
                i17 += i21 & 255;
                i18++;
            }
        }
        int i22 = i11 + i13;
        for (int i23 = i22; i23 < this.f26190p + i22; i23++) {
            byte[] bArr2 = this.f26183i;
            if (i23 >= bArr2.length || i23 >= i12) {
                break;
            }
            int i24 = this.f26175a[bArr2[i23] & 255];
            if (i24 != 0) {
                i14 += (i24 >> 24) & 255;
                i15 += (i24 >> 16) & 255;
                i16 += (i24 >> 8) & 255;
                i17 += i24 & 255;
                i18++;
            }
        }
        if (i18 == 0) {
            return 0;
        }
        return ((i14 / i18) << 24) | ((i15 / i18) << 16) | ((i16 / i18) << 8) | (i17 / i18);
    }

    private void j(b bVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr = this.f26184j;
        int i16 = bVar.f26149d;
        int i17 = this.f26190p;
        int i18 = i16 / i17;
        int i19 = bVar.f26147b / i17;
        int i21 = bVar.f26148c / i17;
        int i22 = bVar.f26146a / i17;
        boolean z11 = this.f26185k == 0;
        int i23 = this.f26192r;
        int i24 = this.f26191q;
        byte[] bArr = this.f26183i;
        int[] iArr2 = this.f26175a;
        Boolean bool = this.f26193s;
        int i25 = 8;
        int i26 = 0;
        int i27 = 0;
        int i28 = 1;
        while (i26 < i18) {
            Boolean bool2 = bool;
            if (bVar.f26150e) {
                if (i27 >= i18) {
                    i11 = i18;
                    int i29 = i28 + 1;
                    if (i29 == 2) {
                        i28 = i29;
                        i27 = 4;
                    } else if (i29 == 3) {
                        i28 = i29;
                        i25 = 4;
                        i27 = 2;
                    } else if (i29 != 4) {
                        i28 = i29;
                    } else {
                        i28 = i29;
                        i27 = 1;
                        i25 = 2;
                    }
                } else {
                    i11 = i18;
                }
                i12 = i27 + i25;
            } else {
                i11 = i18;
                i12 = i27;
                i27 = i26;
            }
            int i31 = i27 + i19;
            boolean z12 = i17 == 1;
            if (i31 < i24) {
                int i32 = i31 * i23;
                int i33 = i32 + i22;
                int i34 = i33 + i21;
                int i35 = i32 + i23;
                if (i35 < i34) {
                    i34 = i35;
                }
                i13 = i12;
                int i36 = i26 * i17 * bVar.f26148c;
                if (z12) {
                    int i37 = i33;
                    while (i37 < i34) {
                        int i38 = i19;
                        int i39 = iArr2[bArr[i36] & 255];
                        if (i39 != 0) {
                            iArr[i37] = i39;
                        } else if (z11 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i36 += i17;
                        i37++;
                        i19 = i38;
                    }
                } else {
                    i15 = i19;
                    int i41 = ((i34 - i33) * i17) + i36;
                    int i42 = i33;
                    while (true) {
                        i14 = i21;
                        if (i42 < i34) {
                            int i43 = i(i36, i41, bVar.f26148c);
                            if (i43 != 0) {
                                iArr[i42] = i43;
                            } else if (z11 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i36 += i17;
                            i42++;
                            i21 = i14;
                        }
                    }
                    bool = bool2;
                    i26++;
                    i19 = i15;
                    i21 = i14;
                    i18 = i11;
                    i27 = i13;
                }
            } else {
                i13 = i12;
            }
            i15 = i19;
            i14 = i21;
            bool = bool2;
            i26++;
            i19 = i15;
            i21 = i14;
            i18 = i11;
            i27 = i13;
        }
        Boolean bool3 = bool;
        if (this.f26193s == null) {
            this.f26193s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private void k(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f26184j;
        int i11 = bVar2.f26149d;
        int i12 = bVar2.f26147b;
        int i13 = bVar2.f26148c;
        int i14 = bVar2.f26146a;
        boolean z11 = this.f26185k == 0;
        int i15 = this.f26192r;
        byte[] bArr = this.f26183i;
        int[] iArr2 = this.f26175a;
        int i16 = 0;
        byte b11 = -1;
        while (i16 < i11) {
            int i17 = (i16 + i12) * i15;
            int i18 = i17 + i14;
            int i19 = i18 + i13;
            int i21 = i17 + i15;
            if (i21 < i19) {
                i19 = i21;
            }
            int i22 = bVar2.f26148c * i16;
            int i23 = i18;
            while (i23 < i19) {
                byte b12 = bArr[i22];
                int i24 = i11;
                int i25 = b12 & 255;
                if (i25 != b11) {
                    int i26 = iArr2[i25];
                    if (i26 != 0) {
                        iArr[i23] = i26;
                    } else {
                        b11 = b12;
                    }
                }
                i22++;
                i23++;
                i11 = i24;
            }
            i16++;
            bVar2 = bVar;
        }
        Boolean bool = this.f26193s;
        this.f26193s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f26193s == null && z11 && b11 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void l(b bVar) {
        int i11;
        int i12;
        short s11;
        e eVar = this;
        if (bVar != null) {
            eVar.f26178d.position(bVar.f26155j);
        }
        if (bVar == null) {
            c cVar = eVar.f26186l;
            i11 = cVar.f26162f;
            i12 = cVar.f26163g;
        } else {
            i11 = bVar.f26148c;
            i12 = bVar.f26149d;
        }
        int i13 = i11 * i12;
        byte[] bArr = eVar.f26183i;
        if (bArr == null || bArr.length < i13) {
            eVar.f26183i = eVar.f26177c.b(i13);
        }
        byte[] bArr2 = eVar.f26183i;
        if (eVar.f26180f == null) {
            eVar.f26180f = new short[4096];
        }
        short[] sArr = eVar.f26180f;
        if (eVar.f26181g == null) {
            eVar.f26181g = new byte[4096];
        }
        byte[] bArr3 = eVar.f26181g;
        if (eVar.f26182h == null) {
            eVar.f26182h = new byte[4097];
        }
        byte[] bArr4 = eVar.f26182h;
        int p11 = p();
        int i14 = 1 << p11;
        int i15 = i14 + 1;
        int i16 = i14 + 2;
        int i17 = p11 + 1;
        int i18 = (1 << i17) - 1;
        int i19 = 0;
        for (int i21 = 0; i21 < i14; i21++) {
            sArr[i21] = 0;
            bArr3[i21] = (byte) i21;
        }
        byte[] bArr5 = eVar.f26179e;
        int i22 = i17;
        int i23 = i16;
        int i24 = i18;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = -1;
        while (true) {
            if (i19 >= i13) {
                break;
            }
            if (i25 == 0) {
                i25 = o();
                if (i25 <= 0) {
                    eVar.f26189o = 3;
                    break;
                }
                i26 = 0;
            }
            i28 += (bArr5[i26] & 255) << i27;
            i26++;
            i25--;
            int i34 = i27 + 8;
            int i35 = i23;
            int i36 = i33;
            int i37 = i22;
            int i38 = i17;
            int i39 = i32;
            while (true) {
                if (i34 < i37) {
                    i22 = i37;
                    i23 = i35;
                    i27 = i34;
                    eVar = this;
                    i32 = i39;
                    i17 = i38;
                    i33 = i36;
                    break;
                }
                int i41 = i16;
                int i42 = i28 & i24;
                i28 >>= i37;
                i34 -= i37;
                if (i42 == i14) {
                    i24 = i18;
                    i37 = i38;
                    i35 = i41;
                    i16 = i35;
                    i36 = -1;
                } else if (i42 == i15) {
                    i27 = i34;
                    i32 = i39;
                    i23 = i35;
                    i17 = i38;
                    i16 = i41;
                    i22 = i37;
                    i33 = i36;
                    eVar = this;
                    break;
                } else if (i36 == -1) {
                    bArr2[i29] = bArr3[i42];
                    i29++;
                    i19++;
                    i39 = i42;
                    i36 = i39;
                    i16 = i41;
                    i34 = i34;
                } else {
                    if (i42 >= i35) {
                        bArr4[i31] = (byte) i39;
                        i31++;
                        s11 = i36;
                    } else {
                        s11 = i42;
                    }
                    while (s11 >= i14) {
                        bArr4[i31] = bArr3[s11];
                        i31++;
                        s11 = sArr[s11];
                    }
                    i39 = bArr3[s11] & 255;
                    byte b11 = (byte) i39;
                    bArr2[i29] = b11;
                    while (true) {
                        i29++;
                        i19++;
                        if (i31 <= 0) {
                            break;
                        }
                        i31--;
                        bArr2[i29] = bArr4[i31];
                    }
                    byte[] bArr6 = bArr4;
                    if (i35 < 4096) {
                        sArr[i35] = (short) i36;
                        bArr3[i35] = b11;
                        i35++;
                        if ((i35 & i24) == 0 && i35 < 4096) {
                            i37++;
                            i24 += i35;
                        }
                    }
                    i36 = i42;
                    i16 = i41;
                    i34 = i34;
                    bArr4 = bArr6;
                }
            }
        }
        Arrays.fill(bArr2, i29, i13, (byte) 0);
    }

    private Bitmap n() {
        Boolean bool = this.f26193s;
        Bitmap c11 = this.f26177c.c(this.f26192r, this.f26191q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f26194t);
        c11.setHasAlpha(true);
        return c11;
    }

    private int o() {
        int p11 = p();
        if (p11 <= 0) {
            return p11;
        }
        ByteBuffer byteBuffer = this.f26178d;
        byteBuffer.get(this.f26179e, 0, Math.min(p11, byteBuffer.remaining()));
        return p11;
    }

    private int p() {
        return this.f26178d.get() & 255;
    }

    private Bitmap r(b bVar, b bVar2) {
        int i11;
        int i12;
        Bitmap bitmap;
        int[] iArr = this.f26184j;
        int i13 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f26187m;
            if (bitmap2 != null) {
                this.f26177c.a(bitmap2);
            }
            this.f26187m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f26152g == 3 && this.f26187m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i12 = bVar2.f26152g) > 0) {
            if (i12 == 2) {
                if (!bVar.f26151f) {
                    c cVar = this.f26186l;
                    int i14 = cVar.f26168l;
                    if (bVar.f26156k == null || cVar.f26166j != bVar.f26153h) {
                        i13 = i14;
                    }
                }
                int i15 = bVar2.f26149d;
                int i16 = this.f26190p;
                int i17 = i15 / i16;
                int i18 = bVar2.f26147b / i16;
                int i19 = bVar2.f26148c / i16;
                int i21 = bVar2.f26146a / i16;
                int i22 = this.f26192r;
                int i23 = (i18 * i22) + i21;
                int i24 = (i17 * i22) + i23;
                while (i23 < i24) {
                    int i25 = i23 + i19;
                    for (int i26 = i23; i26 < i25; i26++) {
                        iArr[i26] = i13;
                    }
                    i23 += this.f26192r;
                }
            } else if (i12 == 3 && (bitmap = this.f26187m) != null) {
                int i27 = this.f26192r;
                bitmap.getPixels(iArr, 0, i27, 0, 0, i27, this.f26191q);
            }
        }
        l(bVar);
        if (!bVar.f26150e && this.f26190p == 1) {
            k(bVar);
        } else {
            j(bVar);
        }
        if (this.f26188n && ((i11 = bVar.f26152g) == 0 || i11 == 1)) {
            if (this.f26187m == null) {
                this.f26187m = n();
            }
            Bitmap bitmap3 = this.f26187m;
            int i28 = this.f26192r;
            bitmap3.setPixels(iArr, 0, i28, 0, 0, i28, this.f26191q);
        }
        Bitmap n11 = n();
        int i29 = this.f26192r;
        n11.setPixels(iArr, 0, i29, 0, 0, i29, this.f26191q);
        return n11;
    }

    @Override // fa.a
    public int a() {
        return this.f26186l.f26159c;
    }

    @Override // fa.a
    public void b() {
        this.f26185k = (this.f26185k + 1) % this.f26186l.f26159c;
    }

    @Override // fa.a
    public void c(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.f26194t = config;
    }

    @Override // fa.a
    public void clear() {
        this.f26186l = null;
        byte[] bArr = this.f26183i;
        if (bArr != null) {
            this.f26177c.e(bArr);
        }
        int[] iArr = this.f26184j;
        if (iArr != null) {
            this.f26177c.f(iArr);
        }
        Bitmap bitmap = this.f26187m;
        if (bitmap != null) {
            this.f26177c.a(bitmap);
        }
        this.f26187m = null;
        this.f26178d = null;
        this.f26193s = null;
        byte[] bArr2 = this.f26179e;
        if (bArr2 != null) {
            this.f26177c.e(bArr2);
        }
    }

    @Override // fa.a
    public ByteBuffer d() {
        return this.f26178d;
    }

    @Override // fa.a
    public int e() {
        int i11;
        if (this.f26186l.f26159c <= 0 || (i11 = this.f26185k) < 0) {
            return 0;
        }
        return m(i11);
    }

    @Override // fa.a
    public void f() {
        this.f26185k = -1;
    }

    @Override // fa.a
    public int g() {
        return this.f26185k;
    }

    @Override // fa.a
    public synchronized Bitmap getNextFrame() {
        if (this.f26186l.f26159c <= 0 || this.f26185k < 0) {
            String str = f26174u;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f26186l.f26159c + ", framePointer=" + this.f26185k);
            }
            this.f26189o = 1;
        }
        int i11 = this.f26189o;
        if (i11 != 1 && i11 != 2) {
            this.f26189o = 0;
            if (this.f26179e == null) {
                this.f26179e = this.f26177c.b(255);
            }
            b bVar = this.f26186l.f26161e.get(this.f26185k);
            int i12 = this.f26185k - 1;
            b bVar2 = i12 >= 0 ? this.f26186l.f26161e.get(i12) : null;
            int[] iArr = bVar.f26156k;
            if (iArr == null) {
                iArr = this.f26186l.f26157a;
            }
            this.f26175a = iArr;
            if (iArr == null) {
                String str2 = f26174u;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.f26185k);
                }
                this.f26189o = 1;
                return null;
            }
            if (bVar.f26151f) {
                System.arraycopy(iArr, 0, this.f26176b, 0, iArr.length);
                int[] iArr2 = this.f26176b;
                this.f26175a = iArr2;
                iArr2[bVar.f26153h] = 0;
                if (bVar.f26152g == 2 && this.f26185k == 0) {
                    this.f26193s = Boolean.TRUE;
                }
            }
            return r(bVar, bVar2);
        }
        String str3 = f26174u;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.f26189o);
        }
        return null;
    }

    @Override // fa.a
    public int h() {
        return this.f26178d.limit() + this.f26183i.length + (this.f26184j.length * 4);
    }

    public int m(int i11) {
        if (i11 >= 0) {
            c cVar = this.f26186l;
            if (i11 < cVar.f26159c) {
                return cVar.f26161e.get(i11).f26154i;
            }
        }
        return -1;
    }

    public synchronized void q(c cVar, ByteBuffer byteBuffer, int i11) {
        if (i11 > 0) {
            int highestOneBit = Integer.highestOneBit(i11);
            this.f26189o = 0;
            this.f26186l = cVar;
            this.f26185k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f26178d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f26178d.order(ByteOrder.LITTLE_ENDIAN);
            this.f26188n = false;
            Iterator<b> it2 = cVar.f26161e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (it2.next().f26152g == 3) {
                    this.f26188n = true;
                    break;
                }
            }
            this.f26190p = highestOneBit;
            int i12 = cVar.f26162f;
            this.f26192r = i12 / highestOneBit;
            int i13 = cVar.f26163g;
            this.f26191q = i13 / highestOneBit;
            this.f26183i = this.f26177c.b(i12 * i13);
            this.f26184j = this.f26177c.d(this.f26192r * this.f26191q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i11);
        }
    }

    public e(a.InterfaceC0513a interfaceC0513a) {
        this.f26176b = new int[256];
        this.f26194t = Bitmap.Config.ARGB_8888;
        this.f26177c = interfaceC0513a;
        this.f26186l = new c();
    }
}