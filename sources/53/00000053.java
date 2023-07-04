package a3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes.dex */
public class i implements Comparable<i> {

    /* renamed from: q  reason: collision with root package name */
    private static int f199q = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f200a;

    /* renamed from: b  reason: collision with root package name */
    private String f201b;

    /* renamed from: f  reason: collision with root package name */
    public float f205f;

    /* renamed from: j  reason: collision with root package name */
    a f209j;

    /* renamed from: c  reason: collision with root package name */
    public int f202c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f203d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f204e = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f206g = false;

    /* renamed from: h  reason: collision with root package name */
    float[] f207h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    float[] f208i = new float[9];

    /* renamed from: k  reason: collision with root package name */
    b[] f210k = new b[16];

    /* renamed from: l  reason: collision with root package name */
    int f211l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f212m = 0;

    /* renamed from: n  reason: collision with root package name */
    boolean f213n = false;

    /* renamed from: o  reason: collision with root package name */
    int f214o = -1;

    /* renamed from: p  reason: collision with root package name */
    float f215p = BitmapDescriptorFactory.HUE_RED;

    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f209j = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        f199q++;
    }

    public final void a(b bVar) {
        int i11 = 0;
        while (true) {
            int i12 = this.f211l;
            if (i11 < i12) {
                if (this.f210k[i11] == bVar) {
                    return;
                }
                i11++;
            } else {
                b[] bVarArr = this.f210k;
                if (i12 >= bVarArr.length) {
                    this.f210k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f210k;
                int i13 = this.f211l;
                bVarArr2[i13] = bVar;
                this.f211l = i13 + 1;
                return;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(i iVar) {
        return this.f202c - iVar.f202c;
    }

    public final void d(b bVar) {
        int i11 = this.f211l;
        int i12 = 0;
        while (i12 < i11) {
            if (this.f210k[i12] == bVar) {
                while (i12 < i11 - 1) {
                    b[] bVarArr = this.f210k;
                    int i13 = i12 + 1;
                    bVarArr[i12] = bVarArr[i13];
                    i12 = i13;
                }
                this.f211l--;
                return;
            }
            i12++;
        }
    }

    public void e() {
        this.f201b = null;
        this.f209j = a.UNKNOWN;
        this.f204e = 0;
        this.f202c = -1;
        this.f203d = -1;
        this.f205f = BitmapDescriptorFactory.HUE_RED;
        this.f206g = false;
        this.f213n = false;
        this.f214o = -1;
        this.f215p = BitmapDescriptorFactory.HUE_RED;
        int i11 = this.f211l;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f210k[i12] = null;
        }
        this.f211l = 0;
        this.f212m = 0;
        this.f200a = false;
        Arrays.fill(this.f208i, (float) BitmapDescriptorFactory.HUE_RED);
    }

    public void f(d dVar, float f11) {
        this.f205f = f11;
        this.f206g = true;
        this.f213n = false;
        this.f214o = -1;
        this.f215p = BitmapDescriptorFactory.HUE_RED;
        int i11 = this.f211l;
        this.f203d = -1;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f210k[i12].A(dVar, this, false);
        }
        this.f211l = 0;
    }

    public void g(a aVar, String str) {
        this.f209j = aVar;
    }

    public final void h(d dVar, b bVar) {
        int i11 = this.f211l;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f210k[i12].B(dVar, bVar, false);
        }
        this.f211l = 0;
    }

    public String toString() {
        if (this.f201b != null) {
            return "" + this.f201b;
        }
        return "" + this.f202c;
    }
}