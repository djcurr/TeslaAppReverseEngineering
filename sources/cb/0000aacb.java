package pj;

import ak.k0;
import ak.o;
import ak.u;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import nj.b;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
final class b {

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f46579h = {0, 7, 8, 15};

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f46580i = {0, 119, -120, -1};

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f46581j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f46582a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f46583b;

    /* renamed from: c  reason: collision with root package name */
    private final Canvas f46584c;

    /* renamed from: d  reason: collision with root package name */
    private final C0994b f46585d;

    /* renamed from: e  reason: collision with root package name */
    private final a f46586e;

    /* renamed from: f  reason: collision with root package name */
    private final h f46587f;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap f46588g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f46589a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f46590b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f46591c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f46592d;

        public a(int i11, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f46589a = i11;
            this.f46590b = iArr;
            this.f46591c = iArr2;
            this.f46592d = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pj.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0994b {

        /* renamed from: a  reason: collision with root package name */
        public final int f46593a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46594b;

        /* renamed from: c  reason: collision with root package name */
        public final int f46595c;

        /* renamed from: d  reason: collision with root package name */
        public final int f46596d;

        /* renamed from: e  reason: collision with root package name */
        public final int f46597e;

        /* renamed from: f  reason: collision with root package name */
        public final int f46598f;

        public C0994b(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f46593a = i11;
            this.f46594b = i12;
            this.f46595c = i13;
            this.f46596d = i14;
            this.f46597e = i15;
            this.f46598f = i16;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f46599a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f46600b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f46601c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f46602d;

        public c(int i11, boolean z11, byte[] bArr, byte[] bArr2) {
            this.f46599a = i11;
            this.f46600b = z11;
            this.f46601c = bArr;
            this.f46602d = bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f46603a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46604b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray<e> f46605c;

        public d(int i11, int i12, int i13, SparseArray<e> sparseArray) {
            this.f46603a = i12;
            this.f46604b = i13;
            this.f46605c = sparseArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f46606a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46607b;

        public e(int i11, int i12) {
            this.f46606a = i11;
            this.f46607b = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46608a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f46609b;

        /* renamed from: c  reason: collision with root package name */
        public final int f46610c;

        /* renamed from: d  reason: collision with root package name */
        public final int f46611d;

        /* renamed from: e  reason: collision with root package name */
        public final int f46612e;

        /* renamed from: f  reason: collision with root package name */
        public final int f46613f;

        /* renamed from: g  reason: collision with root package name */
        public final int f46614g;

        /* renamed from: h  reason: collision with root package name */
        public final int f46615h;

        /* renamed from: i  reason: collision with root package name */
        public final int f46616i;

        /* renamed from: j  reason: collision with root package name */
        public final SparseArray<g> f46617j;

        public f(int i11, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, SparseArray<g> sparseArray) {
            this.f46608a = i11;
            this.f46609b = z11;
            this.f46610c = i12;
            this.f46611d = i13;
            this.f46612e = i15;
            this.f46613f = i16;
            this.f46614g = i17;
            this.f46615h = i18;
            this.f46616i = i19;
            this.f46617j = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f46617j;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                this.f46617j.put(sparseArray.keyAt(i11), sparseArray.valueAt(i11));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f46618a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46619b;

        public g(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f46618a = i13;
            this.f46619b = i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final int f46620a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46621b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray<f> f46622c = new SparseArray<>();

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<a> f46623d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray<c> f46624e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        public final SparseArray<a> f46625f = new SparseArray<>();

        /* renamed from: g  reason: collision with root package name */
        public final SparseArray<c> f46626g = new SparseArray<>();

        /* renamed from: h  reason: collision with root package name */
        public C0994b f46627h;

        /* renamed from: i  reason: collision with root package name */
        public d f46628i;

        public h(int i11, int i12) {
            this.f46620a = i11;
            this.f46621b = i12;
        }

        public void a() {
            this.f46622c.clear();
            this.f46623d.clear();
            this.f46624e.clear();
            this.f46625f.clear();
            this.f46626g.clear();
            this.f46627h = null;
            this.f46628i = null;
        }
    }

    public b(int i11, int i12) {
        Paint paint = new Paint();
        this.f46582a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f46583b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f46584c = new Canvas();
        this.f46585d = new C0994b(719, 575, 0, 719, 0, 575);
        this.f46586e = new a(0, c(), d(), e());
        this.f46587f = new h(i11, i12);
    }

    private static byte[] a(int i11, int i12, u uVar) {
        byte[] bArr = new byte[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            bArr[i13] = (byte) uVar.h(i12);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i11 = 1; i11 < 16; i11++) {
            if (i11 < 8) {
                iArr[i11] = f(255, (i11 & 1) != 0 ? 255 : 0, (i11 & 2) != 0 ? 255 : 0, (i11 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i11] = f(255, (i11 & 1) != 0 ? 127 : 0, (i11 & 2) != 0 ? 127 : 0, (i11 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int i11;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            if (i12 < 8) {
                iArr[i12] = f(63, (i12 & 1) != 0 ? 255 : 0, (i12 & 2) != 0 ? 255 : 0, (i12 & 4) == 0 ? 0 : 255);
            } else {
                int i13 = i12 & 136;
                int i14 = CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256;
                if (i13 == 0) {
                    int i15 = ((i12 & 1) != 0 ? 85 : 0) + ((i12 & 16) != 0 ? 170 : 0);
                    int i16 = ((i12 & 2) != 0 ? 85 : 0) + ((i12 & 32) != 0 ? 170 : 0);
                    i11 = (i12 & 4) == 0 ? 0 : 85;
                    if ((i12 & 64) == 0) {
                        i14 = 0;
                    }
                    iArr[i12] = f(255, i15, i16, i11 + i14);
                } else if (i13 == 8) {
                    int i17 = ((i12 & 1) != 0 ? 85 : 0) + ((i12 & 16) != 0 ? 170 : 0);
                    int i18 = ((i12 & 2) != 0 ? 85 : 0) + ((i12 & 32) != 0 ? 170 : 0);
                    i11 = (i12 & 4) == 0 ? 0 : 85;
                    if ((i12 & 64) == 0) {
                        i14 = 0;
                    }
                    iArr[i12] = f(127, i17, i18, i11 + i14);
                } else if (i13 == 128) {
                    iArr[i12] = f(255, ((i12 & 1) != 0 ? 43 : 0) + 127 + ((i12 & 16) != 0 ? 85 : 0), ((i12 & 2) != 0 ? 43 : 0) + 127 + ((i12 & 32) != 0 ? 85 : 0), ((i12 & 4) == 0 ? 0 : 43) + 127 + ((i12 & 64) == 0 ? 0 : 85));
                } else if (i13 == 136) {
                    iArr[i12] = f(255, ((i12 & 1) != 0 ? 43 : 0) + ((i12 & 16) != 0 ? 85 : 0), ((i12 & 2) != 0 ? 43 : 0) + ((i12 & 32) != 0 ? 85 : 0), ((i12 & 4) == 0 ? 0 : 43) + ((i12 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int f(int i11, int i12, int i13, int i14) {
        return (i11 << 24) | (i12 << 16) | (i13 << 8) | i14;
    }

    private static int g(u uVar, int[] iArr, byte[] bArr, int i11, int i12, Paint paint, Canvas canvas) {
        boolean z11;
        int i13;
        int h11;
        int h12;
        int i14 = i11;
        boolean z12 = false;
        while (true) {
            byte h13 = uVar.h(2);
            if (h13 != 0) {
                z11 = z12;
                i13 = 1;
            } else {
                if (uVar.g()) {
                    h11 = uVar.h(3) + 3;
                    h12 = uVar.h(2);
                } else {
                    if (uVar.g()) {
                        z11 = z12;
                        i13 = 1;
                    } else {
                        int h14 = uVar.h(2);
                        if (h14 == 0) {
                            z11 = true;
                        } else if (h14 == 1) {
                            z11 = z12;
                            i13 = 2;
                        } else if (h14 == 2) {
                            h11 = uVar.h(4) + 12;
                            h12 = uVar.h(2);
                        } else if (h14 != 3) {
                            z11 = z12;
                        } else {
                            h11 = uVar.h(8) + 29;
                            h12 = uVar.h(2);
                        }
                        h13 = 0;
                        i13 = 0;
                    }
                    h13 = 0;
                }
                z11 = z12;
                i13 = h11;
                h13 = h12;
            }
            if (i13 != 0 && paint != null) {
                if (bArr != null) {
                    h13 = bArr[h13];
                }
                paint.setColor(iArr[h13]);
                canvas.drawRect(i14, i12, i14 + i13, i12 + 1, paint);
            }
            i14 += i13;
            if (z11) {
                return i14;
            }
            z12 = z11;
        }
    }

    private static int h(u uVar, int[] iArr, byte[] bArr, int i11, int i12, Paint paint, Canvas canvas) {
        boolean z11;
        int i13;
        int h11;
        int i14 = i11;
        boolean z12 = false;
        while (true) {
            byte h12 = uVar.h(4);
            int i15 = 2;
            if (h12 != 0) {
                z11 = z12;
                i13 = 1;
            } else if (!uVar.g()) {
                int h13 = uVar.h(3);
                if (h13 != 0) {
                    i15 = h13 + 2;
                    z11 = z12;
                    i13 = i15;
                    h12 = 0;
                } else {
                    z11 = true;
                    h12 = 0;
                    i13 = 0;
                }
            } else {
                if (!uVar.g()) {
                    h11 = uVar.h(2) + 4;
                    h12 = uVar.h(4);
                } else {
                    int h14 = uVar.h(2);
                    if (h14 != 0) {
                        if (h14 != 1) {
                            if (h14 == 2) {
                                h11 = uVar.h(4) + 9;
                                h12 = uVar.h(4);
                            } else if (h14 != 3) {
                                z11 = z12;
                                h12 = 0;
                                i13 = 0;
                            } else {
                                h11 = uVar.h(8) + 25;
                                h12 = uVar.h(4);
                            }
                        }
                        z11 = z12;
                        i13 = i15;
                        h12 = 0;
                    } else {
                        z11 = z12;
                        i13 = 1;
                        h12 = 0;
                    }
                }
                z11 = z12;
                i13 = h11;
            }
            if (i13 != 0 && paint != null) {
                if (bArr != null) {
                    h12 = bArr[h12];
                }
                paint.setColor(iArr[h12]);
                canvas.drawRect(i14, i12, i14 + i13, i12 + 1, paint);
            }
            i14 += i13;
            if (z11) {
                return i14;
            }
            z12 = z11;
        }
    }

    private static int i(u uVar, int[] iArr, byte[] bArr, int i11, int i12, Paint paint, Canvas canvas) {
        boolean z11;
        int h11;
        int i13 = i11;
        boolean z12 = false;
        while (true) {
            byte h12 = uVar.h(8);
            if (h12 != 0) {
                z11 = z12;
                h11 = 1;
            } else if (!uVar.g()) {
                int h13 = uVar.h(7);
                if (h13 != 0) {
                    z11 = z12;
                    h11 = h13;
                    h12 = 0;
                } else {
                    z11 = true;
                    h12 = 0;
                    h11 = 0;
                }
            } else {
                z11 = z12;
                h11 = uVar.h(7);
                h12 = uVar.h(8);
            }
            if (h11 != 0 && paint != null) {
                if (bArr != null) {
                    h12 = bArr[h12];
                }
                paint.setColor(iArr[h12]);
                canvas.drawRect(i13, i12, i13 + h11, i12 + 1, paint);
            }
            i13 += h11;
            if (z11) {
                return i13;
            }
            z12 = z11;
        }
    }

    private static void j(byte[] bArr, int[] iArr, int i11, int i12, int i13, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        u uVar = new u(bArr);
        int i14 = i12;
        int i15 = i13;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (uVar.b() != 0) {
            int h11 = uVar.h(8);
            if (h11 != 240) {
                switch (h11) {
                    case 16:
                        if (i11 == 3) {
                            bArr3 = bArr5 == null ? f46580i : bArr5;
                        } else if (i11 == 2) {
                            bArr3 = bArr7 == null ? f46579h : bArr7;
                        } else {
                            bArr2 = null;
                            i14 = g(uVar, iArr, bArr2, i14, i15, paint, canvas);
                            uVar.c();
                            continue;
                        }
                        bArr2 = bArr3;
                        i14 = g(uVar, iArr, bArr2, i14, i15, paint, canvas);
                        uVar.c();
                        continue;
                    case 17:
                        if (i11 == 3) {
                            bArr4 = bArr6 == null ? f46581j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i14 = h(uVar, iArr, bArr4, i14, i15, paint, canvas);
                        uVar.c();
                        continue;
                    case 18:
                        i14 = i(uVar, iArr, null, i14, i15, paint, canvas);
                        continue;
                    default:
                        switch (h11) {
                            case 32:
                                bArr7 = a(4, 4, uVar);
                                continue;
                            case 33:
                                bArr5 = a(4, 8, uVar);
                                continue;
                            case 34:
                                bArr6 = a(16, 8, uVar);
                                continue;
                            default:
                                continue;
                        }
                }
            } else {
                i15 += 2;
                i14 = i12;
            }
        }
    }

    private static void k(c cVar, a aVar, int i11, int i12, int i13, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i11 == 3) {
            iArr = aVar.f46592d;
        } else if (i11 == 2) {
            iArr = aVar.f46591c;
        } else {
            iArr = aVar.f46590b;
        }
        int[] iArr2 = iArr;
        j(cVar.f46601c, iArr2, i11, i12, i13, paint, canvas);
        j(cVar.f46602d, iArr2, i11, i12, i13 + 1, paint, canvas);
    }

    private static a l(u uVar, int i11) {
        int h11;
        int i12;
        int h12;
        int h13;
        int i13;
        int i14 = 8;
        int h14 = uVar.h(8);
        uVar.r(8);
        int i15 = 2;
        int i16 = i11 - 2;
        int[] c11 = c();
        int[] d11 = d();
        int[] e11 = e();
        while (i16 > 0) {
            int h15 = uVar.h(i14);
            int h16 = uVar.h(i14);
            int i17 = i16 - 2;
            int[] iArr = (h16 & 128) != 0 ? c11 : (h16 & 64) != 0 ? d11 : e11;
            if ((h16 & 1) != 0) {
                h13 = uVar.h(i14);
                i13 = uVar.h(i14);
                h11 = uVar.h(i14);
                h12 = uVar.h(i14);
                i12 = i17 - 4;
            } else {
                int h17 = uVar.h(4) << 4;
                h11 = uVar.h(4) << 4;
                i12 = i17 - 2;
                h12 = uVar.h(i15) << 6;
                h13 = uVar.h(6) << i15;
                i13 = h17;
            }
            if (h13 == 0) {
                h12 = 255;
                i13 = 0;
                h11 = 0;
            }
            double d12 = h13;
            double d13 = i13 - 128;
            double d14 = h11 - 128;
            iArr[h15] = f((byte) (255 - (h12 & 255)), k0.r((int) (d12 + (1.402d * d13)), 0, 255), k0.r((int) ((d12 - (0.34414d * d14)) - (d13 * 0.71414d)), 0, 255), k0.r((int) (d12 + (d14 * 1.772d)), 0, 255));
            i16 = i12;
            h14 = h14;
            i14 = 8;
            i15 = 2;
        }
        return new a(h14, c11, d11, e11);
    }

    private static C0994b m(u uVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        uVar.r(4);
        boolean g11 = uVar.g();
        uVar.r(3);
        int h11 = uVar.h(16);
        int h12 = uVar.h(16);
        if (g11) {
            int h13 = uVar.h(16);
            int h14 = uVar.h(16);
            int h15 = uVar.h(16);
            i14 = uVar.h(16);
            i13 = h14;
            i12 = h15;
            i11 = h13;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = h11;
            i14 = h12;
        }
        return new C0994b(h11, h12, i11, i13, i12, i14);
    }

    private static c n(u uVar) {
        byte[] bArr;
        int h11 = uVar.h(16);
        uVar.r(4);
        int h12 = uVar.h(2);
        boolean g11 = uVar.g();
        uVar.r(1);
        byte[] bArr2 = k0.f482f;
        if (h12 == 1) {
            uVar.r(uVar.h(8) * 16);
        } else if (h12 == 0) {
            int h13 = uVar.h(16);
            int h14 = uVar.h(16);
            if (h13 > 0) {
                bArr2 = new byte[h13];
                uVar.k(bArr2, 0, h13);
            }
            if (h14 > 0) {
                bArr = new byte[h14];
                uVar.k(bArr, 0, h14);
                return new c(h11, g11, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h11, g11, bArr2, bArr);
    }

    private static d o(u uVar, int i11) {
        int h11 = uVar.h(8);
        int h12 = uVar.h(4);
        int h13 = uVar.h(2);
        uVar.r(2);
        int i12 = i11 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i12 > 0) {
            int h14 = uVar.h(8);
            uVar.r(8);
            i12 -= 6;
            sparseArray.put(h14, new e(uVar.h(16), uVar.h(16)));
        }
        return new d(h11, h12, h13, sparseArray);
    }

    private static f p(u uVar, int i11) {
        int h11;
        int h12;
        int h13 = uVar.h(8);
        uVar.r(4);
        boolean g11 = uVar.g();
        uVar.r(3);
        int i12 = 16;
        int h14 = uVar.h(16);
        int h15 = uVar.h(16);
        int h16 = uVar.h(3);
        int h17 = uVar.h(3);
        int i13 = 2;
        uVar.r(2);
        int h18 = uVar.h(8);
        int h19 = uVar.h(8);
        int h21 = uVar.h(4);
        int h22 = uVar.h(2);
        uVar.r(2);
        int i14 = i11 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i14 > 0) {
            int h23 = uVar.h(i12);
            int h24 = uVar.h(i13);
            int h25 = uVar.h(i13);
            int h26 = uVar.h(12);
            int i15 = h22;
            uVar.r(4);
            int h27 = uVar.h(12);
            i14 -= 6;
            if (h24 == 1 || h24 == 2) {
                i14 -= 2;
                h11 = uVar.h(8);
                h12 = uVar.h(8);
            } else {
                h11 = 0;
                h12 = 0;
            }
            sparseArray.put(h23, new g(h24, h25, h26, h27, h11, h12));
            h22 = i15;
            i13 = 2;
            i12 = 16;
        }
        return new f(h13, g11, h14, h15, h16, h17, h18, h19, h21, h22, sparseArray);
    }

    private static void q(u uVar, h hVar) {
        f fVar;
        int h11 = uVar.h(8);
        int h12 = uVar.h(16);
        int h13 = uVar.h(16);
        int d11 = uVar.d() + h13;
        if (h13 * 8 > uVar.b()) {
            o.h("DvbParser", "Data field length exceeds limit");
            uVar.r(uVar.b());
            return;
        }
        switch (h11) {
            case 16:
                if (h12 == hVar.f46620a) {
                    d dVar = hVar.f46628i;
                    d o11 = o(uVar, h13);
                    if (o11.f46604b != 0) {
                        hVar.f46628i = o11;
                        hVar.f46622c.clear();
                        hVar.f46623d.clear();
                        hVar.f46624e.clear();
                        break;
                    } else if (dVar != null && dVar.f46603a != o11.f46603a) {
                        hVar.f46628i = o11;
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f46628i;
                if (h12 == hVar.f46620a && dVar2 != null) {
                    f p11 = p(uVar, h13);
                    if (dVar2.f46604b == 0 && (fVar = hVar.f46622c.get(p11.f46608a)) != null) {
                        p11.a(fVar);
                    }
                    hVar.f46622c.put(p11.f46608a, p11);
                    break;
                }
                break;
            case 18:
                if (h12 == hVar.f46620a) {
                    a l11 = l(uVar, h13);
                    hVar.f46623d.put(l11.f46589a, l11);
                    break;
                } else if (h12 == hVar.f46621b) {
                    a l12 = l(uVar, h13);
                    hVar.f46625f.put(l12.f46589a, l12);
                    break;
                }
                break;
            case 19:
                if (h12 == hVar.f46620a) {
                    c n11 = n(uVar);
                    hVar.f46624e.put(n11.f46599a, n11);
                    break;
                } else if (h12 == hVar.f46621b) {
                    c n12 = n(uVar);
                    hVar.f46626g.put(n12.f46599a, n12);
                    break;
                }
                break;
            case 20:
                if (h12 == hVar.f46620a) {
                    hVar.f46627h = m(uVar);
                    break;
                }
                break;
        }
        uVar.s(d11 - uVar.d());
    }

    public List<nj.b> b(byte[] bArr, int i11) {
        int i12;
        int i13;
        SparseArray<g> sparseArray;
        u uVar = new u(bArr, i11);
        while (uVar.b() >= 48 && uVar.h(8) == 15) {
            q(uVar, this.f46587f);
        }
        h hVar = this.f46587f;
        d dVar = hVar.f46628i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0994b c0994b = hVar.f46627h;
        if (c0994b == null) {
            c0994b = this.f46585d;
        }
        Bitmap bitmap = this.f46588g;
        if (bitmap == null || c0994b.f46593a + 1 != bitmap.getWidth() || c0994b.f46594b + 1 != this.f46588g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(c0994b.f46593a + 1, c0994b.f46594b + 1, Bitmap.Config.ARGB_8888);
            this.f46588g = createBitmap;
            this.f46584c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f46605c;
        for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
            this.f46584c.save();
            e valueAt = sparseArray2.valueAt(i14);
            f fVar = this.f46587f.f46622c.get(sparseArray2.keyAt(i14));
            int i15 = valueAt.f46606a + c0994b.f46595c;
            int i16 = valueAt.f46607b + c0994b.f46597e;
            this.f46584c.clipRect(i15, i16, Math.min(fVar.f46610c + i15, c0994b.f46596d), Math.min(fVar.f46611d + i16, c0994b.f46598f));
            a aVar = this.f46587f.f46623d.get(fVar.f46613f);
            if (aVar == null && (aVar = this.f46587f.f46625f.get(fVar.f46613f)) == null) {
                aVar = this.f46586e;
            }
            SparseArray<g> sparseArray3 = fVar.f46617j;
            int i17 = 0;
            while (i17 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i17);
                g valueAt2 = sparseArray3.valueAt(i17);
                c cVar = this.f46587f.f46624e.get(keyAt);
                c cVar2 = cVar == null ? this.f46587f.f46626g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i13 = i17;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.f46612e, valueAt2.f46618a + i15, i16 + valueAt2.f46619b, cVar2.f46600b ? null : this.f46582a, this.f46584c);
                } else {
                    i13 = i17;
                    sparseArray = sparseArray3;
                }
                i17 = i13 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f46609b) {
                int i18 = fVar.f46612e;
                if (i18 == 3) {
                    i12 = aVar.f46592d[fVar.f46614g];
                } else if (i18 == 2) {
                    i12 = aVar.f46591c[fVar.f46615h];
                } else {
                    i12 = aVar.f46590b[fVar.f46616i];
                }
                this.f46583b.setColor(i12);
                this.f46584c.drawRect(i15, i16, fVar.f46610c + i15, fVar.f46611d + i16, this.f46583b);
            }
            arrayList.add(new b.C0811b().f(Bitmap.createBitmap(this.f46588g, i15, i16, fVar.f46610c, fVar.f46611d)).j(i15 / c0994b.f46593a).k(0).h(i16 / c0994b.f46594b, 0).i(0).l(fVar.f46610c / c0994b.f46593a).g(fVar.f46611d / c0994b.f46594b).a());
            this.f46584c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f46584c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f46587f.a();
    }
}