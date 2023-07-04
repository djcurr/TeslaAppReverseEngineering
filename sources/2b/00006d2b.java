package f3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f3.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected e f25671a;

    /* renamed from: b  reason: collision with root package name */
    protected e f25672b;

    /* renamed from: c  reason: collision with root package name */
    protected e f25673c;

    /* renamed from: d  reason: collision with root package name */
    protected e f25674d;

    /* renamed from: e  reason: collision with root package name */
    protected e f25675e;

    /* renamed from: f  reason: collision with root package name */
    protected e f25676f;

    /* renamed from: g  reason: collision with root package name */
    protected e f25677g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList<e> f25678h;

    /* renamed from: i  reason: collision with root package name */
    protected int f25679i;

    /* renamed from: j  reason: collision with root package name */
    protected int f25680j;

    /* renamed from: k  reason: collision with root package name */
    protected float f25681k = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: l  reason: collision with root package name */
    int f25682l;

    /* renamed from: m  reason: collision with root package name */
    int f25683m;

    /* renamed from: n  reason: collision with root package name */
    int f25684n;

    /* renamed from: o  reason: collision with root package name */
    private int f25685o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f25686p;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f25687q;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f25688r;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f25689s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f25690t;

    public c(e eVar, int i11, boolean z11) {
        this.f25686p = false;
        this.f25671a = eVar;
        this.f25685o = i11;
        this.f25686p = z11;
    }

    private void b() {
        int i11 = this.f25685o * 2;
        e eVar = this.f25671a;
        boolean z11 = false;
        e eVar2 = eVar;
        boolean z12 = false;
        while (!z12) {
            this.f25679i++;
            e[] eVarArr = eVar.f25741t0;
            int i12 = this.f25685o;
            e eVar3 = null;
            eVarArr[i12] = null;
            eVar.f25739s0[i12] = null;
            if (eVar.V() != 8) {
                this.f25682l++;
                e.b s11 = eVar.s(this.f25685o);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s11 != bVar) {
                    this.f25683m += eVar.D(this.f25685o);
                }
                int e11 = this.f25683m + eVar.U[i11].e();
                this.f25683m = e11;
                int i13 = i11 + 1;
                this.f25683m = e11 + eVar.U[i13].e();
                int e12 = this.f25684n + eVar.U[i11].e();
                this.f25684n = e12;
                this.f25684n = e12 + eVar.U[i13].e();
                if (this.f25672b == null) {
                    this.f25672b = eVar;
                }
                this.f25674d = eVar;
                e.b[] bVarArr = eVar.X;
                int i14 = this.f25685o;
                if (bVarArr[i14] == bVar) {
                    int[] iArr = eVar.f25746w;
                    if (iArr[i14] == 0 || iArr[i14] == 3 || iArr[i14] == 2) {
                        this.f25680j++;
                        float[] fArr = eVar.f25737r0;
                        float f11 = fArr[i14];
                        if (f11 > BitmapDescriptorFactory.HUE_RED) {
                            this.f25681k += fArr[i14];
                        }
                        if (c(eVar, i14)) {
                            if (f11 < BitmapDescriptorFactory.HUE_RED) {
                                this.f25687q = true;
                            } else {
                                this.f25688r = true;
                            }
                            if (this.f25678h == null) {
                                this.f25678h = new ArrayList<>();
                            }
                            this.f25678h.add(eVar);
                        }
                        if (this.f25676f == null) {
                            this.f25676f = eVar;
                        }
                        e eVar4 = this.f25677g;
                        if (eVar4 != null) {
                            eVar4.f25739s0[this.f25685o] = eVar;
                        }
                        this.f25677g = eVar;
                    }
                    if (this.f25685o == 0) {
                        if (eVar.f25742u == 0 && eVar.f25747x == 0) {
                            int i15 = eVar.f25748y;
                        }
                    } else if (eVar.f25744v == 0 && eVar.A == 0) {
                        int i16 = eVar.B;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f25741t0[this.f25685o] = eVar;
            }
            d dVar = eVar.U[i11 + 1].f25696f;
            if (dVar != null) {
                e eVar5 = dVar.f25694d;
                d[] dVarArr = eVar5.U;
                if (dVarArr[i11].f25696f != null && dVarArr[i11].f25696f.f25694d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z12 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f25672b;
        if (eVar6 != null) {
            this.f25683m -= eVar6.U[i11].e();
        }
        e eVar7 = this.f25674d;
        if (eVar7 != null) {
            this.f25683m -= eVar7.U[i11 + 1].e();
        }
        this.f25673c = eVar;
        if (this.f25685o == 0 && this.f25686p) {
            this.f25675e = eVar;
        } else {
            this.f25675e = this.f25671a;
        }
        if (this.f25688r && this.f25687q) {
            z11 = true;
        }
        this.f25689s = z11;
    }

    private static boolean c(e eVar, int i11) {
        if (eVar.V() != 8 && eVar.X[i11] == e.b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f25746w;
            if (iArr[i11] == 0 || iArr[i11] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.f25690t) {
            b();
        }
        this.f25690t = true;
    }
}