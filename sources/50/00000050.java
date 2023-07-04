package a3;

import a3.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class h extends a3.b {

    /* renamed from: g  reason: collision with root package name */
    private int f192g;

    /* renamed from: h  reason: collision with root package name */
    private i[] f193h;

    /* renamed from: i  reason: collision with root package name */
    private i[] f194i;

    /* renamed from: j  reason: collision with root package name */
    private int f195j;

    /* renamed from: k  reason: collision with root package name */
    b f196k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Comparator<i> {
        a(h hVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            return iVar.f202c - iVar2.f202c;
        }
    }

    /* loaded from: classes.dex */
    class b {

        /* renamed from: a  reason: collision with root package name */
        i f197a;

        public b(h hVar) {
        }

        public boolean a(i iVar, float f11) {
            boolean z11 = true;
            if (!this.f197a.f200a) {
                for (int i11 = 0; i11 < 9; i11++) {
                    float f12 = iVar.f208i[i11];
                    if (f12 != BitmapDescriptorFactory.HUE_RED) {
                        float f13 = f12 * f11;
                        if (Math.abs(f13) < 1.0E-4f) {
                            f13 = 0.0f;
                        }
                        this.f197a.f208i[i11] = f13;
                    } else {
                        this.f197a.f208i[i11] = 0.0f;
                    }
                }
                return true;
            }
            for (int i12 = 0; i12 < 9; i12++) {
                float[] fArr = this.f197a.f208i;
                fArr[i12] = fArr[i12] + (iVar.f208i[i12] * f11);
                if (Math.abs(fArr[i12]) < 1.0E-4f) {
                    this.f197a.f208i[i12] = 0.0f;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                h.this.G(this.f197a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f197a = iVar;
        }

        public final boolean c() {
            for (int i11 = 8; i11 >= 0; i11--) {
                float f11 = this.f197a.f208i[i11];
                if (f11 > BitmapDescriptorFactory.HUE_RED) {
                    return false;
                }
                if (f11 < BitmapDescriptorFactory.HUE_RED) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i11 = 8;
            while (true) {
                if (i11 < 0) {
                    break;
                }
                float f11 = iVar.f208i[i11];
                float f12 = this.f197a.f208i[i11];
                if (f12 == f11) {
                    i11--;
                } else if (f12 < f11) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f197a.f208i, (float) BitmapDescriptorFactory.HUE_RED);
        }

        public String toString() {
            String str = "[ ";
            if (this.f197a != null) {
                for (int i11 = 0; i11 < 9; i11++) {
                    str = str + this.f197a.f208i[i11] + " ";
                }
            }
            return str + "] " + this.f197a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f192g = 128;
        this.f193h = new i[128];
        this.f194i = new i[128];
        this.f195j = 0;
        this.f196k = new b(this);
    }

    private final void F(i iVar) {
        int i11;
        int i12 = this.f195j + 1;
        i[] iVarArr = this.f193h;
        if (i12 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f193h = iVarArr2;
            this.f194i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f193h;
        int i13 = this.f195j;
        iVarArr3[i13] = iVar;
        int i14 = i13 + 1;
        this.f195j = i14;
        if (i14 > 1 && iVarArr3[i14 - 1].f202c > iVar.f202c) {
            int i15 = 0;
            while (true) {
                i11 = this.f195j;
                if (i15 >= i11) {
                    break;
                }
                this.f194i[i15] = this.f193h[i15];
                i15++;
            }
            Arrays.sort(this.f194i, 0, i11, new a(this));
            for (int i16 = 0; i16 < this.f195j; i16++) {
                this.f193h[i16] = this.f194i[i16];
            }
        }
        iVar.f200a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i11 = 0;
        while (i11 < this.f195j) {
            if (this.f193h[i11] == iVar) {
                while (true) {
                    int i12 = this.f195j;
                    if (i11 < i12 - 1) {
                        i[] iVarArr = this.f193h;
                        int i13 = i11 + 1;
                        iVarArr[i11] = iVarArr[i13];
                        i11 = i13;
                    } else {
                        this.f195j = i12 - 1;
                        iVar.f200a = false;
                        return;
                    }
                }
            } else {
                i11++;
            }
        }
    }

    @Override // a3.b
    public void B(d dVar, a3.b bVar, boolean z11) {
        i iVar = bVar.f154a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f158e;
        int f11 = aVar.f();
        for (int i11 = 0; i11 < f11; i11++) {
            i b11 = aVar.b(i11);
            float g11 = aVar.g(i11);
            this.f196k.b(b11);
            if (this.f196k.a(iVar, g11)) {
                F(b11);
            }
            this.f155b += bVar.f155b * g11;
        }
        G(iVar);
    }

    @Override // a3.b, a3.d.a
    public void a(i iVar) {
        this.f196k.b(iVar);
        this.f196k.e();
        iVar.f208i[iVar.f204e] = 1.0f;
        F(iVar);
    }

    @Override // a3.b, a3.d.a
    public i c(d dVar, boolean[] zArr) {
        int i11 = -1;
        for (int i12 = 0; i12 < this.f195j; i12++) {
            i iVar = this.f193h[i12];
            if (!zArr[iVar.f202c]) {
                this.f196k.b(iVar);
                if (i11 == -1) {
                    if (!this.f196k.c()) {
                    }
                    i11 = i12;
                } else {
                    if (!this.f196k.d(this.f193h[i11])) {
                    }
                    i11 = i12;
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        return this.f193h[i11];
    }

    @Override // a3.b, a3.d.a
    public void clear() {
        this.f195j = 0;
        this.f155b = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // a3.b, a3.d.a
    public boolean isEmpty() {
        return this.f195j == 0;
    }

    @Override // a3.b
    public String toString() {
        String str = " goal -> (" + this.f155b + ") : ";
        for (int i11 = 0; i11 < this.f195j; i11++) {
            this.f196k.b(this.f193h[i11]);
            str = str + this.f196k + " ";
        }
        return str;
    }
}