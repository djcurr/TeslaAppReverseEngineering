package a3;

import a3.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Arrays;

/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: m  reason: collision with root package name */
    private static float f216m = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    private int f217a = 16;

    /* renamed from: b  reason: collision with root package name */
    private int f218b = 16;

    /* renamed from: c  reason: collision with root package name */
    int[] f219c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    int[] f220d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    int[] f221e = new int[16];

    /* renamed from: f  reason: collision with root package name */
    float[] f222f = new float[16];

    /* renamed from: g  reason: collision with root package name */
    int[] f223g = new int[16];

    /* renamed from: h  reason: collision with root package name */
    int[] f224h = new int[16];

    /* renamed from: i  reason: collision with root package name */
    int f225i = 0;

    /* renamed from: j  reason: collision with root package name */
    int f226j = -1;

    /* renamed from: k  reason: collision with root package name */
    private final b f227k;

    /* renamed from: l  reason: collision with root package name */
    protected final c f228l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(b bVar, c cVar) {
        this.f227k = bVar;
        this.f228l = cVar;
        clear();
    }

    private void k(i iVar, int i11) {
        int[] iArr;
        int i12 = iVar.f202c % this.f218b;
        int[] iArr2 = this.f219c;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            iArr2[i12] = i11;
        } else {
            while (true) {
                iArr = this.f220d;
                if (iArr[i13] == -1) {
                    break;
                }
                i13 = iArr[i13];
            }
            iArr[i13] = i11;
        }
        this.f220d[i11] = -1;
    }

    private void l(int i11, i iVar, float f11) {
        this.f221e[i11] = iVar.f202c;
        this.f222f[i11] = f11;
        this.f223g[i11] = -1;
        this.f224h[i11] = -1;
        iVar.a(this.f227k);
        iVar.f212m++;
        this.f225i++;
    }

    private int m() {
        for (int i11 = 0; i11 < this.f217a; i11++) {
            if (this.f221e[i11] == -1) {
                return i11;
            }
        }
        return -1;
    }

    private void n() {
        int i11 = this.f217a * 2;
        this.f221e = Arrays.copyOf(this.f221e, i11);
        this.f222f = Arrays.copyOf(this.f222f, i11);
        this.f223g = Arrays.copyOf(this.f223g, i11);
        this.f224h = Arrays.copyOf(this.f224h, i11);
        this.f220d = Arrays.copyOf(this.f220d, i11);
        for (int i12 = this.f217a; i12 < i11; i12++) {
            this.f221e[i12] = -1;
            this.f220d[i12] = -1;
        }
        this.f217a = i11;
    }

    private void p(int i11, i iVar, float f11) {
        int m11 = m();
        l(m11, iVar, f11);
        if (i11 != -1) {
            this.f223g[m11] = i11;
            int[] iArr = this.f224h;
            iArr[m11] = iArr[i11];
            iArr[i11] = m11;
        } else {
            this.f223g[m11] = -1;
            if (this.f225i > 0) {
                this.f224h[m11] = this.f226j;
                this.f226j = m11;
            } else {
                this.f224h[m11] = -1;
            }
        }
        int[] iArr2 = this.f224h;
        if (iArr2[m11] != -1) {
            this.f223g[iArr2[m11]] = m11;
        }
        k(iVar, m11);
    }

    private void q(i iVar) {
        int[] iArr;
        int i11 = iVar.f202c;
        int i12 = i11 % this.f218b;
        int[] iArr2 = this.f219c;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f221e[i13] == i11) {
            int[] iArr3 = this.f220d;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f220d;
            if (iArr[i13] == -1 || this.f221e[iArr[i13]] == i11) {
                break;
            }
            i13 = iArr[i13];
        }
        int i14 = iArr[i13];
        if (i14 == -1 || this.f221e[i14] != i11) {
            return;
        }
        iArr[i13] = iArr[i14];
        iArr[i14] = -1;
    }

    @Override // a3.b.a
    public float a(i iVar) {
        int o11 = o(iVar);
        return o11 != -1 ? this.f222f[o11] : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // a3.b.a
    public i b(int i11) {
        int i12 = this.f225i;
        if (i12 == 0) {
            return null;
        }
        int i13 = this.f226j;
        for (int i14 = 0; i14 < i12; i14++) {
            if (i14 == i11 && i13 != -1) {
                return this.f228l.f163d[this.f221e[i13]];
            }
            i13 = this.f224h[i13];
            if (i13 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // a3.b.a
    public float c(b bVar, boolean z11) {
        float a11 = a(bVar.f154a);
        h(bVar.f154a, z11);
        j jVar = (j) bVar.f158e;
        int f11 = jVar.f();
        int i11 = 0;
        int i12 = 0;
        while (i11 < f11) {
            int[] iArr = jVar.f221e;
            if (iArr[i12] != -1) {
                j(this.f228l.f163d[iArr[i12]], jVar.f222f[i12] * a11, z11);
                i11++;
            }
            i12++;
        }
        return a11;
    }

    @Override // a3.b.a
    public void clear() {
        int i11 = this.f225i;
        for (int i12 = 0; i12 < i11; i12++) {
            i b11 = b(i12);
            if (b11 != null) {
                b11.d(this.f227k);
            }
        }
        for (int i13 = 0; i13 < this.f217a; i13++) {
            this.f221e[i13] = -1;
            this.f220d[i13] = -1;
        }
        for (int i14 = 0; i14 < this.f218b; i14++) {
            this.f219c[i14] = -1;
        }
        this.f225i = 0;
        this.f226j = -1;
    }

    @Override // a3.b.a
    public boolean d(i iVar) {
        return o(iVar) != -1;
    }

    @Override // a3.b.a
    public void e(i iVar, float f11) {
        float f12 = f216m;
        if (f11 > (-f12) && f11 < f12) {
            h(iVar, true);
            return;
        }
        if (this.f225i == 0) {
            l(0, iVar, f11);
            k(iVar, 0);
            this.f226j = 0;
            return;
        }
        int o11 = o(iVar);
        if (o11 != -1) {
            this.f222f[o11] = f11;
            return;
        }
        if (this.f225i + 1 >= this.f217a) {
            n();
        }
        int i11 = this.f225i;
        int i12 = this.f226j;
        int i13 = -1;
        for (int i14 = 0; i14 < i11; i14++) {
            int[] iArr = this.f221e;
            int i15 = iArr[i12];
            int i16 = iVar.f202c;
            if (i15 == i16) {
                this.f222f[i12] = f11;
                return;
            }
            if (iArr[i12] < i16) {
                i13 = i12;
            }
            i12 = this.f224h[i12];
            if (i12 == -1) {
                break;
            }
        }
        p(i13, iVar, f11);
    }

    @Override // a3.b.a
    public int f() {
        return this.f225i;
    }

    @Override // a3.b.a
    public float g(int i11) {
        int i12 = this.f225i;
        int i13 = this.f226j;
        for (int i14 = 0; i14 < i12; i14++) {
            if (i14 == i11) {
                return this.f222f[i13];
            }
            i13 = this.f224h[i13];
            if (i13 == -1) {
                return BitmapDescriptorFactory.HUE_RED;
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // a3.b.a
    public float h(i iVar, boolean z11) {
        int o11 = o(iVar);
        if (o11 == -1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        q(iVar);
        float f11 = this.f222f[o11];
        if (this.f226j == o11) {
            this.f226j = this.f224h[o11];
        }
        this.f221e[o11] = -1;
        int[] iArr = this.f223g;
        if (iArr[o11] != -1) {
            int[] iArr2 = this.f224h;
            iArr2[iArr[o11]] = iArr2[o11];
        }
        int[] iArr3 = this.f224h;
        if (iArr3[o11] != -1) {
            iArr[iArr3[o11]] = iArr[o11];
        }
        this.f225i--;
        iVar.f212m--;
        if (z11) {
            iVar.d(this.f227k);
        }
        return f11;
    }

    @Override // a3.b.a
    public void i(float f11) {
        int i11 = this.f225i;
        int i12 = this.f226j;
        for (int i13 = 0; i13 < i11; i13++) {
            float[] fArr = this.f222f;
            fArr[i12] = fArr[i12] / f11;
            i12 = this.f224h[i12];
            if (i12 == -1) {
                return;
            }
        }
    }

    @Override // a3.b.a
    public void invert() {
        int i11 = this.f225i;
        int i12 = this.f226j;
        for (int i13 = 0; i13 < i11; i13++) {
            float[] fArr = this.f222f;
            fArr[i12] = fArr[i12] * (-1.0f);
            i12 = this.f224h[i12];
            if (i12 == -1) {
                return;
            }
        }
    }

    @Override // a3.b.a
    public void j(i iVar, float f11, boolean z11) {
        float f12 = f216m;
        if (f11 <= (-f12) || f11 >= f12) {
            int o11 = o(iVar);
            if (o11 == -1) {
                e(iVar, f11);
                return;
            }
            float[] fArr = this.f222f;
            fArr[o11] = fArr[o11] + f11;
            float f13 = fArr[o11];
            float f14 = f216m;
            if (f13 <= (-f14) || fArr[o11] >= f14) {
                return;
            }
            fArr[o11] = 0.0f;
            h(iVar, z11);
        }
    }

    public int o(i iVar) {
        int[] iArr;
        if (this.f225i != 0 && iVar != null) {
            int i11 = iVar.f202c;
            int i12 = this.f219c[i11 % this.f218b];
            if (i12 == -1) {
                return -1;
            }
            if (this.f221e[i12] == i11) {
                return i12;
            }
            while (true) {
                iArr = this.f220d;
                if (iArr[i12] == -1 || this.f221e[iArr[i12]] == i11) {
                    break;
                }
                i12 = iArr[i12];
            }
            if (iArr[i12] != -1 && this.f221e[iArr[i12]] == i11) {
                return iArr[i12];
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i11 = this.f225i;
        for (int i12 = 0; i12 < i11; i12++) {
            i b11 = b(i12);
            if (b11 != null) {
                String str2 = str + b11 + " = " + g(i12) + " ";
                int o11 = o(b11);
                String str3 = str2 + "[p: ";
                String str4 = (this.f223g[o11] != -1 ? str3 + this.f228l.f163d[this.f221e[this.f223g[o11]]] : str3 + PermissionsResponse.SCOPE_NONE) + ", n: ";
                str = (this.f224h[o11] != -1 ? str4 + this.f228l.f163d[this.f221e[this.f224h[o11]]] : str4 + PermissionsResponse.SCOPE_NONE) + "]";
            }
        }
        return str + " }";
    }
}