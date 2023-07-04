package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h3.c;
import h3.d;
import h3.e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class m {
    private HashMap<String, h3.c> A;
    private k[] B;
    private int C;
    private int D;
    private View E;
    private int F;
    private float G;
    private Interpolator H;
    private boolean I;

    /* renamed from: a  reason: collision with root package name */
    View f3480a;

    /* renamed from: b  reason: collision with root package name */
    int f3481b;

    /* renamed from: c  reason: collision with root package name */
    boolean f3482c;

    /* renamed from: d  reason: collision with root package name */
    private int f3483d;

    /* renamed from: e  reason: collision with root package name */
    private q f3484e;

    /* renamed from: f  reason: collision with root package name */
    private q f3485f;

    /* renamed from: g  reason: collision with root package name */
    private l f3486g;

    /* renamed from: h  reason: collision with root package name */
    private l f3487h;

    /* renamed from: i  reason: collision with root package name */
    private c3.b[] f3488i;

    /* renamed from: j  reason: collision with root package name */
    private c3.b f3489j;

    /* renamed from: k  reason: collision with root package name */
    float f3490k;

    /* renamed from: l  reason: collision with root package name */
    float f3491l;

    /* renamed from: m  reason: collision with root package name */
    float f3492m;

    /* renamed from: n  reason: collision with root package name */
    float f3493n;

    /* renamed from: o  reason: collision with root package name */
    private int[] f3494o;

    /* renamed from: p  reason: collision with root package name */
    private double[] f3495p;

    /* renamed from: q  reason: collision with root package name */
    private double[] f3496q;

    /* renamed from: r  reason: collision with root package name */
    private String[] f3497r;

    /* renamed from: s  reason: collision with root package name */
    private int[] f3498s;

    /* renamed from: t  reason: collision with root package name */
    private int f3499t;

    /* renamed from: u  reason: collision with root package name */
    private float[] f3500u;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<q> f3501v;

    /* renamed from: w  reason: collision with root package name */
    private float[] f3502w;

    /* renamed from: x  reason: collision with root package name */
    private ArrayList<d> f3503x;

    /* renamed from: y  reason: collision with root package name */
    private HashMap<String, h3.e> f3504y;

    /* renamed from: z  reason: collision with root package name */
    private HashMap<String, h3.d> f3505z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(View view) {
        new Rect();
        this.f3482c = false;
        this.f3483d = -1;
        this.f3484e = new q();
        this.f3485f = new q();
        this.f3486g = new l();
        this.f3487h = new l();
        this.f3490k = BitmapDescriptorFactory.HUE_RED;
        this.f3491l = 1.0f;
        this.f3499t = 4;
        this.f3500u = new float[4];
        this.f3501v = new ArrayList<>();
        this.f3502w = new float[1];
        this.f3503x = new ArrayList<>();
        int i11 = d.f3361f;
        this.C = i11;
        this.D = i11;
        this.E = null;
        this.F = i11;
        this.G = Float.NaN;
        this.H = null;
        this.I = false;
        t(view);
    }

    private float f(float f11, float[] fArr) {
        float f12 = BitmapDescriptorFactory.HUE_RED;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f13 = this.f3491l;
            if (f13 != 1.0d) {
                float f14 = this.f3490k;
                if (f11 < f14) {
                    f11 = 0.0f;
                }
                if (f11 > f14 && f11 < 1.0d) {
                    f11 = Math.min((f11 - f14) * f13, 1.0f);
                }
            }
        }
        c3.c cVar = this.f3484e.f3587a;
        float f15 = Float.NaN;
        Iterator<q> it2 = this.f3501v.iterator();
        while (it2.hasNext()) {
            q next = it2.next();
            c3.c cVar2 = next.f3587a;
            if (cVar2 != null) {
                float f16 = next.f3589c;
                if (f16 < f11) {
                    cVar = cVar2;
                    f12 = f16;
                } else if (Float.isNaN(f15)) {
                    f15 = next.f3589c;
                }
            }
        }
        if (cVar != null) {
            float f17 = (Float.isNaN(f15) ? 1.0f : f15) - f12;
            double d11 = (f11 - f12) / f17;
            f11 = (((float) cVar.a(d11)) * f17) + f12;
            if (fArr != null) {
                fArr[0] = (float) cVar.b(d11);
            }
        }
        return f11;
    }

    private float n() {
        char c11;
        float f11;
        float f12;
        float[] fArr = new float[2];
        float f13 = 1.0f / 99;
        double d11 = 0.0d;
        double d12 = 0.0d;
        float f14 = BitmapDescriptorFactory.HUE_RED;
        int i11 = 0;
        while (i11 < 100) {
            float f15 = i11 * f13;
            double d13 = f15;
            c3.c cVar = this.f3484e.f3587a;
            Iterator<q> it2 = this.f3501v.iterator();
            float f16 = Float.NaN;
            float f17 = BitmapDescriptorFactory.HUE_RED;
            while (it2.hasNext()) {
                q next = it2.next();
                c3.c cVar2 = next.f3587a;
                if (cVar2 != null) {
                    float f18 = next.f3589c;
                    if (f18 < f15) {
                        cVar = cVar2;
                        f17 = f18;
                    } else if (Float.isNaN(f16)) {
                        f16 = next.f3589c;
                    }
                }
            }
            if (cVar != null) {
                if (Float.isNaN(f16)) {
                    f16 = 1.0f;
                }
                d13 = (((float) cVar.a((f15 - f17) / f12)) * (f16 - f17)) + f17;
            }
            this.f3488i[0].d(d13, this.f3495p);
            float f19 = f14;
            int i12 = i11;
            this.f3484e.e(d13, this.f3494o, this.f3495p, fArr, 0);
            if (i12 > 0) {
                c11 = 0;
                f11 = (float) (f19 + Math.hypot(d12 - fArr[1], d11 - fArr[0]));
            } else {
                c11 = 0;
                f11 = f19;
            }
            d11 = fArr[c11];
            i11 = i12 + 1;
            f14 = f11;
            d12 = fArr[1];
        }
        return f14;
    }

    private void p(q qVar) {
        int binarySearch = Collections.binarySearch(this.f3501v, qVar);
        if (binarySearch == 0) {
            Log.e("MotionController", " KeyPath position \"" + qVar.f3590d + "\" outside of range");
        }
        this.f3501v.add((-binarySearch) - 1, qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ArrayList<d> arrayList) {
        this.f3503x.addAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(float[] fArr, int[] iArr) {
        if (fArr != null) {
            double[] g11 = this.f3488i[0].g();
            if (iArr != null) {
                Iterator<q> it2 = this.f3501v.iterator();
                int i11 = 0;
                while (it2.hasNext()) {
                    iArr[i11] = it2.next().f3600n;
                    i11++;
                }
            }
            int i12 = 0;
            for (int i13 = 0; i13 < g11.length; i13++) {
                this.f3488i[0].d(g11[i13], this.f3495p);
                this.f3484e.e(g11[i13], this.f3494o, this.f3495p, fArr, i12);
                i12 += 2;
            }
            return i12 / 2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(float[] fArr, int i11) {
        double d11;
        float f11;
        float f12 = 1.0f;
        float f13 = 1.0f / (i11 - 1);
        HashMap<String, h3.d> hashMap = this.f3505z;
        h3.d dVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, h3.d> hashMap2 = this.f3505z;
        h3.d dVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, h3.c> hashMap3 = this.A;
        h3.c cVar = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, h3.c> hashMap4 = this.A;
        h3.c cVar2 = hashMap4 != null ? hashMap4.get("translationY") : null;
        int i12 = 0;
        while (i12 < i11) {
            float f14 = i12 * f13;
            float f15 = this.f3491l;
            if (f15 != f12) {
                float f16 = this.f3490k;
                if (f14 < f16) {
                    f14 = BitmapDescriptorFactory.HUE_RED;
                }
                if (f14 > f16 && f14 < 1.0d) {
                    f14 = Math.min((f14 - f16) * f15, f12);
                }
            }
            float f17 = f14;
            double d12 = f17;
            c3.c cVar3 = this.f3484e.f3587a;
            float f18 = Float.NaN;
            Iterator<q> it2 = this.f3501v.iterator();
            float f19 = BitmapDescriptorFactory.HUE_RED;
            while (it2.hasNext()) {
                q next = it2.next();
                c3.c cVar4 = next.f3587a;
                double d13 = d12;
                if (cVar4 != null) {
                    float f21 = next.f3589c;
                    if (f21 < f17) {
                        f19 = f21;
                        cVar3 = cVar4;
                    } else if (Float.isNaN(f18)) {
                        f18 = next.f3589c;
                    }
                }
                d12 = d13;
            }
            double d14 = d12;
            if (cVar3 != null) {
                if (Float.isNaN(f18)) {
                    f18 = 1.0f;
                }
                d11 = (((float) cVar3.a((f17 - f19) / f11)) * (f18 - f19)) + f19;
            } else {
                d11 = d14;
            }
            this.f3488i[0].d(d11, this.f3495p);
            c3.b bVar = this.f3489j;
            if (bVar != null) {
                double[] dArr = this.f3495p;
                if (dArr.length > 0) {
                    bVar.d(d11, dArr);
                }
            }
            int i13 = i12 * 2;
            int i14 = i12;
            this.f3484e.e(d11, this.f3494o, this.f3495p, fArr, i13);
            if (cVar != null) {
                fArr[i13] = fArr[i13] + cVar.a(f17);
            } else if (dVar != null) {
                fArr[i13] = fArr[i13] + dVar.a(f17);
            }
            if (cVar2 != null) {
                int i15 = i13 + 1;
                fArr[i15] = fArr[i15] + cVar2.a(f17);
            } else if (dVar2 != null) {
                int i16 = i13 + 1;
                fArr[i16] = fArr[i16] + dVar2.a(f17);
            }
            i12 = i14 + 1;
            f12 = 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(float f11, float[] fArr, int i11) {
        this.f3488i[0].d(f(f11, null), this.f3495p);
        this.f3484e.i(this.f3494o, this.f3495p, fArr, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(boolean z11) {
        if (!"button".equals(a.c(this.f3480a)) || this.B == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            k[] kVarArr = this.B;
            if (i11 >= kVarArr.length) {
                return;
            }
            kVarArr[i11].t(z11 ? -100.0f : 100.0f, this.f3480a);
            i11++;
        }
    }

    public int g() {
        return this.f3484e.f3597k;
    }

    public void h(double d11, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f3488i[0].d(d11, dArr);
        this.f3488i[0].f(d11, dArr2);
        Arrays.fill(fArr2, (float) BitmapDescriptorFactory.HUE_RED);
        this.f3484e.f(d11, this.f3494o, dArr, fArr, dArr2, fArr2);
    }

    public float i() {
        return this.f3492m;
    }

    public float j() {
        return this.f3493n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(float f11, float f12, float f13, float[] fArr) {
        double[] dArr;
        float f14 = f(f11, this.f3502w);
        c3.b[] bVarArr = this.f3488i;
        int i11 = 0;
        if (bVarArr != null) {
            double d11 = f14;
            bVarArr[0].f(d11, this.f3496q);
            this.f3488i[0].d(d11, this.f3495p);
            float f15 = this.f3502w[0];
            while (true) {
                dArr = this.f3496q;
                if (i11 >= dArr.length) {
                    break;
                }
                dArr[i11] = dArr[i11] * f15;
                i11++;
            }
            c3.b bVar = this.f3489j;
            if (bVar != null) {
                double[] dArr2 = this.f3495p;
                if (dArr2.length > 0) {
                    bVar.d(d11, dArr2);
                    this.f3489j.f(d11, this.f3496q);
                    this.f3484e.s(f12, f13, fArr, this.f3494o, this.f3496q, this.f3495p);
                    return;
                }
                return;
            }
            this.f3484e.s(f12, f13, fArr, this.f3494o, dArr, this.f3495p);
            return;
        }
        q qVar = this.f3485f;
        float f16 = qVar.f3591e;
        q qVar2 = this.f3484e;
        float f17 = f16 - qVar2.f3591e;
        float f18 = qVar.f3592f - qVar2.f3592f;
        float f19 = (qVar.f3593g - qVar2.f3593g) + f17;
        float f21 = (qVar.f3594h - qVar2.f3594h) + f18;
        fArr[0] = (f17 * (1.0f - f12)) + (f19 * f12);
        fArr[1] = (f18 * (1.0f - f13)) + (f21 * f13);
    }

    public int l() {
        int i11 = this.f3484e.f3588b;
        Iterator<q> it2 = this.f3501v.iterator();
        while (it2.hasNext()) {
            i11 = Math.max(i11, it2.next().f3588b);
        }
        return Math.max(i11, this.f3485f.f3588b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q m(int i11) {
        return this.f3501v.get(i11);
    }

    public View o() {
        return this.f3480a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q(View view, float f11, long j11, c3.d dVar) {
        e.d dVar2;
        boolean z11;
        int i11;
        double d11;
        View view2;
        float f12;
        float f13 = f(f11, null);
        int i12 = this.F;
        if (i12 != d.f3361f) {
            float f14 = 1.0f / i12;
            float floor = ((float) Math.floor(f13 / f14)) * f14;
            float f15 = (f13 % f14) / f14;
            if (!Float.isNaN(this.G)) {
                f15 = (f15 + this.G) % 1.0f;
            }
            Interpolator interpolator = this.H;
            if (interpolator != null) {
                f12 = interpolator.getInterpolation(f15);
            } else {
                f12 = ((double) f15) > 0.5d ? 1.0f : BitmapDescriptorFactory.HUE_RED;
            }
            f13 = (f12 * f14) + floor;
        }
        float f16 = f13;
        HashMap<String, h3.d> hashMap = this.f3505z;
        if (hashMap != null) {
            for (h3.d dVar3 : hashMap.values()) {
                dVar3.g(view, f16);
            }
        }
        HashMap<String, h3.e> hashMap2 = this.f3504y;
        if (hashMap2 != null) {
            e.d dVar4 = null;
            boolean z12 = false;
            for (h3.e eVar : hashMap2.values()) {
                if (eVar instanceof e.d) {
                    dVar4 = (e.d) eVar;
                } else {
                    z12 |= eVar.i(view, f16, j11, dVar);
                }
            }
            z11 = z12;
            dVar2 = dVar4;
        } else {
            dVar2 = null;
            z11 = false;
        }
        c3.b[] bVarArr = this.f3488i;
        if (bVarArr != null) {
            double d12 = f16;
            bVarArr[0].d(d12, this.f3495p);
            this.f3488i[0].f(d12, this.f3496q);
            c3.b bVar = this.f3489j;
            if (bVar != null) {
                double[] dArr = this.f3495p;
                if (dArr.length > 0) {
                    bVar.d(d12, dArr);
                    this.f3489j.f(d12, this.f3496q);
                }
            }
            if (this.I) {
                d11 = d12;
            } else {
                d11 = d12;
                this.f3484e.t(f16, view, this.f3494o, this.f3495p, this.f3496q, null, this.f3482c);
                this.f3482c = false;
            }
            if (this.D != d.f3361f) {
                if (this.E == null) {
                    this.E = ((View) view.getParent()).findViewById(this.D);
                }
                if (this.E != null) {
                    float top = (view2.getTop() + this.E.getBottom()) / 2.0f;
                    float left = (this.E.getLeft() + this.E.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap<String, h3.d> hashMap3 = this.f3505z;
            if (hashMap3 != null) {
                for (h3.d dVar5 : hashMap3.values()) {
                    if (dVar5 instanceof d.C0558d) {
                        double[] dArr2 = this.f3496q;
                        if (dArr2.length > 1) {
                            ((d.C0558d) dVar5).h(view, f16, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (dVar2 != null) {
                double[] dArr3 = this.f3496q;
                i11 = 1;
                z11 |= dVar2.j(view, dVar, f16, j11, dArr3[0], dArr3[1]);
            } else {
                i11 = 1;
            }
            int i13 = i11;
            while (true) {
                c3.b[] bVarArr2 = this.f3488i;
                if (i13 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i13].e(d11, this.f3500u);
                h3.a.b(this.f3484e.f3599m.get(this.f3497r[i13 - 1]), view, this.f3500u);
                i13++;
            }
            l lVar = this.f3486g;
            if (lVar.f3463b == 0) {
                if (f16 <= BitmapDescriptorFactory.HUE_RED) {
                    view.setVisibility(lVar.f3464c);
                } else if (f16 >= 1.0f) {
                    view.setVisibility(this.f3487h.f3464c);
                } else if (this.f3487h.f3464c != lVar.f3464c) {
                    view.setVisibility(0);
                }
            }
            if (this.B != null) {
                int i14 = 0;
                while (true) {
                    k[] kVarArr = this.B;
                    if (i14 >= kVarArr.length) {
                        break;
                    }
                    kVarArr[i14].t(f16, view);
                    i14++;
                }
            }
        } else {
            i11 = 1;
            q qVar = this.f3484e;
            float f17 = qVar.f3591e;
            q qVar2 = this.f3485f;
            float f18 = f17 + ((qVar2.f3591e - f17) * f16);
            float f19 = qVar.f3592f;
            float f21 = f19 + ((qVar2.f3592f - f19) * f16);
            float f22 = qVar.f3593g;
            float f23 = qVar2.f3593g;
            float f24 = qVar.f3594h;
            float f25 = qVar2.f3594h;
            float f26 = f18 + 0.5f;
            int i15 = (int) f26;
            float f27 = f21 + 0.5f;
            int i16 = (int) f27;
            int i17 = (int) (f26 + ((f23 - f22) * f16) + f22);
            int i18 = (int) (f27 + ((f25 - f24) * f16) + f24);
            int i19 = i17 - i15;
            int i21 = i18 - i16;
            if (f23 != f22 || f25 != f24 || this.f3482c) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i21, 1073741824));
                this.f3482c = false;
            }
            view.layout(i15, i16, i17, i18);
        }
        HashMap<String, h3.c> hashMap4 = this.A;
        if (hashMap4 != null) {
            for (h3.c cVar : hashMap4.values()) {
                if (cVar instanceof c.d) {
                    double[] dArr4 = this.f3496q;
                    ((c.d) cVar).j(view, f16, dArr4[0], dArr4[i11]);
                } else {
                    cVar.i(view, f16);
                }
            }
        }
        return z11;
    }

    public void r() {
        this.f3482c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(View view) {
        q qVar = this.f3484e;
        qVar.f3589c = BitmapDescriptorFactory.HUE_RED;
        qVar.f3590d = BitmapDescriptorFactory.HUE_RED;
        this.I = true;
        qVar.r(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f3485f.r(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f3486g.g(view);
        this.f3487h.g(view);
    }

    public void t(View view) {
        this.f3480a = view;
        this.f3481b = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).a();
        }
    }

    public String toString() {
        return " start: x: " + this.f3484e.f3591e + " y: " + this.f3484e.f3592f + " end: x: " + this.f3485f.f3591e + " y: " + this.f3485f.f3592f;
    }

    public void u(int i11, int i12, float f11, long j11) {
        ArrayList arrayList;
        String[] strArr;
        androidx.constraintlayout.widget.a aVar;
        h3.e h11;
        androidx.constraintlayout.widget.a aVar2;
        Integer num;
        h3.d f12;
        androidx.constraintlayout.widget.a aVar3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i13 = this.C;
        if (i13 != d.f3361f) {
            this.f3484e.f3596j = i13;
        }
        this.f3486g.e(this.f3487h, hashSet2);
        ArrayList<d> arrayList2 = this.f3503x;
        if (arrayList2 != null) {
            Iterator<d> it2 = arrayList2.iterator();
            arrayList = null;
            while (it2.hasNext()) {
                d next = it2.next();
                if (next instanceof h) {
                    h hVar = (h) next;
                    p(new q(i11, i12, hVar, this.f3484e, this.f3485f));
                    int i14 = hVar.f3421g;
                    if (i14 != d.f3361f) {
                        this.f3483d = i14;
                    }
                } else if (next instanceof f) {
                    next.d(hashSet3);
                } else if (next instanceof j) {
                    next.d(hashSet);
                } else if (next instanceof k) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((k) next);
                } else {
                    next.f(hashMap);
                    next.d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i15 = 0;
        if (arrayList != null) {
            this.B = (k[]) arrayList.toArray(new k[0]);
        }
        char c11 = 1;
        if (!hashSet2.isEmpty()) {
            this.f3505z = new HashMap<>();
            Iterator<String> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[c11];
                    Iterator<d> it4 = this.f3503x.iterator();
                    while (it4.hasNext()) {
                        d next3 = it4.next();
                        HashMap<String, androidx.constraintlayout.widget.a> hashMap2 = next3.f3366e;
                        if (hashMap2 != null && (aVar3 = hashMap2.get(str)) != null) {
                            sparseArray.append(next3.f3362a, aVar3);
                        }
                    }
                    f12 = h3.d.e(next2, sparseArray);
                } else {
                    f12 = h3.d.f(next2);
                }
                if (f12 != null) {
                    f12.c(next2);
                    this.f3505z.put(next2, f12);
                }
                c11 = 1;
            }
            ArrayList<d> arrayList3 = this.f3503x;
            if (arrayList3 != null) {
                Iterator<d> it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    d next4 = it5.next();
                    if (next4 instanceof e) {
                        next4.a(this.f3505z);
                    }
                }
            }
            this.f3486g.a(this.f3505z, 0);
            this.f3487h.a(this.f3505z, 100);
            for (String str2 : this.f3505z.keySet()) {
                int intValue = (!hashMap.containsKey(str2) || (num = hashMap.get(str2)) == null) ? 0 : num.intValue();
                h3.d dVar = this.f3505z.get(str2);
                if (dVar != null) {
                    dVar.d(intValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f3504y == null) {
                this.f3504y = new HashMap<>();
            }
            Iterator<String> it6 = hashSet.iterator();
            while (it6.hasNext()) {
                String next5 = it6.next();
                if (!this.f3504y.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<d> it7 = this.f3503x.iterator();
                        while (it7.hasNext()) {
                            d next6 = it7.next();
                            HashMap<String, androidx.constraintlayout.widget.a> hashMap3 = next6.f3366e;
                            if (hashMap3 != null && (aVar2 = hashMap3.get(str3)) != null) {
                                sparseArray2.append(next6.f3362a, aVar2);
                            }
                        }
                        h11 = h3.e.g(next5, sparseArray2);
                    } else {
                        h11 = h3.e.h(next5, j11);
                    }
                    if (h11 != null) {
                        h11.d(next5);
                        this.f3504y.put(next5, h11);
                    }
                }
            }
            ArrayList<d> arrayList4 = this.f3503x;
            if (arrayList4 != null) {
                Iterator<d> it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    d next7 = it8.next();
                    if (next7 instanceof j) {
                        ((j) next7).P(this.f3504y);
                    }
                }
            }
            for (String str4 : this.f3504y.keySet()) {
                this.f3504y.get(str4).e(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        int i16 = 2;
        int size = this.f3501v.size() + 2;
        q[] qVarArr = new q[size];
        qVarArr[0] = this.f3484e;
        qVarArr[size - 1] = this.f3485f;
        if (this.f3501v.size() > 0 && this.f3483d == -1) {
            this.f3483d = 0;
        }
        Iterator<q> it9 = this.f3501v.iterator();
        int i17 = 1;
        while (it9.hasNext()) {
            qVarArr[i17] = it9.next();
            i17++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.f3485f.f3599m.keySet()) {
            if (this.f3484e.f3599m.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f3497r = strArr2;
        this.f3498s = new int[strArr2.length];
        int i18 = 0;
        while (true) {
            strArr = this.f3497r;
            if (i18 >= strArr.length) {
                break;
            }
            String str6 = strArr[i18];
            this.f3498s[i18] = 0;
            int i19 = 0;
            while (true) {
                if (i19 >= size) {
                    break;
                }
                if (qVarArr[i19].f3599m.containsKey(str6) && (aVar = qVarArr[i19].f3599m.get(str6)) != null) {
                    int[] iArr = this.f3498s;
                    iArr[i18] = iArr[i18] + aVar.g();
                    break;
                }
                i19++;
            }
            i18++;
        }
        boolean z11 = qVarArr[0].f3596j != d.f3361f;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i21 = 1; i21 < size; i21++) {
            qVarArr[i21].c(qVarArr[i21 - 1], zArr, this.f3497r, z11);
        }
        int i22 = 0;
        for (int i23 = 1; i23 < length; i23++) {
            if (zArr[i23]) {
                i22++;
            }
        }
        this.f3494o = new int[i22];
        int max = Math.max(2, i22);
        this.f3495p = new double[max];
        this.f3496q = new double[max];
        int i24 = 0;
        for (int i25 = 1; i25 < length; i25++) {
            if (zArr[i25]) {
                this.f3494o[i24] = i25;
                i24++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance(double.class, size, this.f3494o.length);
        double[] dArr2 = new double[size];
        for (int i26 = 0; i26 < size; i26++) {
            qVarArr[i26].d(dArr[i26], this.f3494o);
            dArr2[i26] = qVarArr[i26].f3589c;
        }
        int i27 = 0;
        while (true) {
            int[] iArr2 = this.f3494o;
            if (i27 >= iArr2.length) {
                break;
            }
            if (iArr2[i27] < q.f3586q.length) {
                String str7 = q.f3586q[this.f3494o[i27]] + " [";
                for (int i28 = 0; i28 < size; i28++) {
                    str7 = str7 + dArr[i28][i27];
                }
            }
            i27++;
        }
        this.f3488i = new c3.b[this.f3497r.length + 1];
        int i29 = 0;
        while (true) {
            String[] strArr3 = this.f3497r;
            if (i29 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i29];
            int i31 = i15;
            int i32 = i31;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i31 < size) {
                if (qVarArr[i31].k(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr3 = new int[i16];
                        iArr3[1] = qVarArr[i31].h(str8);
                        iArr3[i15] = size;
                        dArr4 = (double[][]) Array.newInstance(double.class, iArr3);
                    }
                    dArr3[i32] = qVarArr[i31].f3589c;
                    qVarArr[i31].g(str8, dArr4[i32], 0);
                    i32++;
                }
                i31++;
                i16 = 2;
                i15 = 0;
            }
            i29++;
            this.f3488i[i29] = c3.b.a(this.f3483d, Arrays.copyOf(dArr3, i32), (double[][]) Arrays.copyOf(dArr4, i32));
            i16 = 2;
            i15 = 0;
        }
        this.f3488i[0] = c3.b.a(this.f3483d, dArr2, dArr);
        if (qVarArr[0].f3596j != d.f3361f) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance(double.class, size, 2);
            for (int i33 = 0; i33 < size; i33++) {
                iArr4[i33] = qVarArr[i33].f3596j;
                dArr5[i33] = qVarArr[i33].f3589c;
                dArr6[i33][0] = qVarArr[i33].f3591e;
                dArr6[i33][1] = qVarArr[i33].f3592f;
            }
            this.f3489j = c3.b.b(iArr4, dArr5, dArr6);
        }
        float f13 = Float.NaN;
        this.A = new HashMap<>();
        if (this.f3503x != null) {
            Iterator<String> it10 = hashSet3.iterator();
            while (it10.hasNext()) {
                String next8 = it10.next();
                h3.c h12 = h3.c.h(next8);
                if (h12 != null) {
                    if (h12.g() && Float.isNaN(f13)) {
                        f13 = n();
                    }
                    h12.e(next8);
                    this.A.put(next8, h12);
                }
            }
            Iterator<d> it11 = this.f3503x.iterator();
            while (it11.hasNext()) {
                d next9 = it11.next();
                if (next9 instanceof f) {
                    ((f) next9).T(this.A);
                }
            }
            for (h3.c cVar : this.A.values()) {
                cVar.f(f13);
            }
        }
    }
}