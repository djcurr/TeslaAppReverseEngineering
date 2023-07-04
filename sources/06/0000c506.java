package zn;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.collection.d;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileProvider;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class b implements TileProvider {

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f60541j;

    /* renamed from: k  reason: collision with root package name */
    private static final float[] f60542k;

    /* renamed from: l  reason: collision with root package name */
    public static final zn.a f60543l;

    /* renamed from: a  reason: collision with root package name */
    private bo.a<c> f60544a;

    /* renamed from: b  reason: collision with root package name */
    private Collection<c> f60545b;

    /* renamed from: c  reason: collision with root package name */
    private yn.a f60546c;

    /* renamed from: d  reason: collision with root package name */
    private int f60547d;

    /* renamed from: e  reason: collision with root package name */
    private zn.a f60548e;

    /* renamed from: f  reason: collision with root package name */
    private int[] f60549f;

    /* renamed from: g  reason: collision with root package name */
    private double[] f60550g;

    /* renamed from: h  reason: collision with root package name */
    private double f60551h;

    /* renamed from: i  reason: collision with root package name */
    private double[] f60552i;

    /* renamed from: zn.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C1387b {

        /* renamed from: a  reason: collision with root package name */
        private Collection<c> f60553a;

        /* renamed from: b  reason: collision with root package name */
        private int f60554b = 20;

        /* renamed from: c  reason: collision with root package name */
        private zn.a f60555c = b.f60543l;

        /* renamed from: d  reason: collision with root package name */
        private double f60556d = 0.7d;

        public b e() {
            if (this.f60553a != null) {
                return new b(this);
            }
            throw new IllegalStateException("No input data: you must use either .data or .weightedData before building");
        }

        public C1387b f(zn.a aVar) {
            this.f60555c = aVar;
            return this;
        }

        public C1387b g(double d11) {
            this.f60556d = d11;
            if (d11 < 0.0d || d11 > 1.0d) {
                throw new IllegalArgumentException("Opacity must be in range [0, 1]");
            }
            return this;
        }

        public C1387b h(int i11) {
            this.f60554b = i11;
            if (i11 < 10 || i11 > 50) {
                throw new IllegalArgumentException("Radius not within bounds.");
            }
            return this;
        }

        public C1387b i(Collection<c> collection) {
            this.f60553a = collection;
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("No input points.");
            }
            return this;
        }
    }

    static {
        int[] iArr = {Color.rgb(102, 225, 0), Color.rgb(255, 0, 0)};
        f60541j = iArr;
        float[] fArr = {0.2f, 1.0f};
        f60542k = fArr;
        f60543l = new zn.a(iArr, fArr);
    }

    static Bitmap a(double[][] dArr, int[] iArr, double d11) {
        int i11 = iArr[iArr.length - 1];
        double length = (iArr.length - 1) / d11;
        int length2 = dArr.length;
        int[] iArr2 = new int[length2 * length2];
        for (int i12 = 0; i12 < length2; i12++) {
            for (int i13 = 0; i13 < length2; i13++) {
                double d12 = dArr[i13][i12];
                int i14 = (i12 * length2) + i13;
                int i15 = (int) (d12 * length);
                if (d12 != 0.0d) {
                    if (i15 < iArr.length) {
                        iArr2[i14] = iArr[i15];
                    } else {
                        iArr2[i14] = i11;
                    }
                } else {
                    iArr2[i14] = 0;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr2, 0, length2, 0, 0, length2, length2);
        return createBitmap;
    }

    private static Tile b(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new Tile(512, 512, byteArrayOutputStream.toByteArray());
    }

    static double[][] c(double[][] dArr, double[] dArr2) {
        int floor = (int) Math.floor(dArr2.length / 2.0d);
        int length = dArr.length;
        int i11 = length - (floor * 2);
        int i12 = 1;
        int i13 = (floor + i11) - 1;
        double[][] dArr3 = (double[][]) Array.newInstance(double.class, length, length);
        int i14 = 0;
        while (true) {
            double d11 = 0.0d;
            if (i14 >= length) {
                break;
            }
            int i15 = 0;
            while (i15 < length) {
                double d12 = dArr[i14][i15];
                if (d12 != d11) {
                    int i16 = i14 + floor;
                    if (i13 < i16) {
                        i16 = i13;
                    }
                    int i17 = i16 + 1;
                    int i18 = i14 - floor;
                    for (int i19 = floor > i18 ? floor : i18; i19 < i17; i19++) {
                        double[] dArr4 = dArr3[i19];
                        dArr4[i15] = dArr4[i15] + (dArr2[i19 - i18] * d12);
                    }
                }
                i15++;
                d11 = 0.0d;
            }
            i14++;
        }
        double[][] dArr5 = (double[][]) Array.newInstance(double.class, i11, i11);
        int i21 = floor;
        while (i21 < i13 + 1) {
            int i22 = 0;
            while (i22 < length) {
                double d13 = dArr3[i21][i22];
                if (d13 != 0.0d) {
                    int i23 = i22 + floor;
                    if (i13 < i23) {
                        i23 = i13;
                    }
                    int i24 = i23 + i12;
                    int i25 = i22 - floor;
                    for (int i26 = floor > i25 ? floor : i25; i26 < i24; i26++) {
                        double[] dArr6 = dArr5[i21 - floor];
                        int i27 = i26 - floor;
                        dArr6[i27] = dArr6[i27] + (dArr2[i26 - i25] * d13);
                    }
                }
                i22++;
                i12 = 1;
            }
            i21++;
            i12 = 1;
        }
        return dArr5;
    }

    static double[] d(int i11, double d11) {
        double[] dArr = new double[(i11 * 2) + 1];
        for (int i12 = -i11; i12 <= i11; i12++) {
            dArr[i12 + i11] = Math.exp(((-i12) * i12) / ((2.0d * d11) * d11));
        }
        return dArr;
    }

    static yn.a e(Collection<c> collection) {
        Iterator<c> it2 = collection.iterator();
        c next = it2.next();
        double d11 = next.a().f59645a;
        double d12 = next.a().f59645a;
        double d13 = d11;
        double d14 = d12;
        double d15 = next.a().f59646b;
        double d16 = next.a().f59646b;
        while (it2.hasNext()) {
            c next2 = it2.next();
            double d17 = next2.a().f59645a;
            double d18 = next2.a().f59646b;
            if (d17 < d13) {
                d13 = d17;
            }
            if (d17 > d14) {
                d14 = d17;
            }
            if (d18 < d15) {
                d15 = d18;
            }
            if (d18 > d16) {
                d16 = d18;
            }
        }
        return new yn.a(d13, d14, d15, d16);
    }

    private double[] f(int i11) {
        int i12;
        double[] dArr = new double[22];
        int i13 = 5;
        while (true) {
            if (i13 >= 11) {
                break;
            }
            dArr[i13] = g(this.f60545b, this.f60546c, i11, (int) (Math.pow(2.0d, i13 - 3) * 1280.0d));
            if (i13 == 5) {
                for (int i14 = 0; i14 < i13; i14++) {
                    dArr[i14] = dArr[i13];
                }
            }
            i13++;
        }
        for (i12 = 11; i12 < 22; i12++) {
            dArr[i12] = dArr[10];
        }
        return dArr;
    }

    static double g(Collection<c> collection, yn.a aVar, int i11, int i12) {
        double d11 = aVar.f59639a;
        double d12 = aVar.f59641c;
        double d13 = aVar.f59640b;
        double d14 = d12 - d11;
        double d15 = aVar.f59642d - d13;
        if (d14 <= d15) {
            d14 = d15;
        }
        double d16 = ((int) ((i12 / (i11 * 2)) + 0.5d)) / d14;
        d dVar = new d();
        double d17 = 0.0d;
        for (c cVar : collection) {
            double d18 = cVar.a().f59645a;
            int i13 = (int) ((cVar.a().f59646b - d13) * d16);
            long j11 = (int) ((d18 - d11) * d16);
            d dVar2 = (d) dVar.f(j11);
            if (dVar2 == null) {
                dVar2 = new d();
                dVar.j(j11, dVar2);
            }
            long j12 = i13;
            Double d19 = (Double) dVar2.f(j12);
            if (d19 == null) {
                d19 = Double.valueOf(0.0d);
            }
            Double valueOf = Double.valueOf(d19.doubleValue() + cVar.b());
            dVar2.j(j12, valueOf);
            if (valueOf.doubleValue() > d17) {
                d17 = valueOf.doubleValue();
            }
        }
        return d17;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    @Override // com.google.android.gms.maps.model.TileProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.maps.model.Tile getTile(int r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zn.b.getTile(int, int, int):com.google.android.gms.maps.model.Tile");
    }

    public void h(zn.a aVar) {
        this.f60548e = aVar;
        this.f60549f = aVar.b(this.f60551h);
    }

    public void i(double d11) {
        this.f60551h = d11;
        h(this.f60548e);
    }

    public void j(int i11) {
        this.f60547d = i11;
        this.f60550g = d(i11, i11 / 3.0d);
        this.f60552i = f(this.f60547d);
    }

    public void k(Collection<c> collection) {
        this.f60545b = collection;
        if (!collection.isEmpty()) {
            yn.a e11 = e(this.f60545b);
            this.f60546c = e11;
            this.f60544a = new bo.a<>(e11);
            for (c cVar : this.f60545b) {
                this.f60544a.a(cVar);
            }
            this.f60552i = f(this.f60547d);
            return;
        }
        throw new IllegalArgumentException("No input points.");
    }

    private b(C1387b c1387b) {
        this.f60545b = c1387b.f60553a;
        this.f60547d = c1387b.f60554b;
        this.f60548e = c1387b.f60555c;
        this.f60551h = c1387b.f60556d;
        int i11 = this.f60547d;
        this.f60550g = d(i11, i11 / 3.0d);
        h(this.f60548e);
        k(this.f60545b);
    }
}