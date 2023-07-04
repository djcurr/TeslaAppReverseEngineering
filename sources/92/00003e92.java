package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class j {
    private double[] A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private final float M;
    private final float N;
    private final float O;

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<h> f17615a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<SVGLength[]> f17616b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<SVGLength[]> f17617c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<SVGLength[]> f17618d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList<SVGLength[]> f17619e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<double[]> f17620f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<Integer> f17621g;

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<Integer> f17622h;

    /* renamed from: i  reason: collision with root package name */
    private final ArrayList<Integer> f17623i;

    /* renamed from: j  reason: collision with root package name */
    private final ArrayList<Integer> f17624j;

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList<Integer> f17625k;

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList<Integer> f17626l;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayList<Integer> f17627m;

    /* renamed from: n  reason: collision with root package name */
    private final ArrayList<Integer> f17628n;

    /* renamed from: o  reason: collision with root package name */
    private final ArrayList<Integer> f17629o;

    /* renamed from: p  reason: collision with root package name */
    private final ArrayList<Integer> f17630p;

    /* renamed from: q  reason: collision with root package name */
    private double f17631q;

    /* renamed from: r  reason: collision with root package name */
    private h f17632r;

    /* renamed from: s  reason: collision with root package name */
    private double f17633s;

    /* renamed from: t  reason: collision with root package name */
    private double f17634t;

    /* renamed from: u  reason: collision with root package name */
    private double f17635u;

    /* renamed from: v  reason: collision with root package name */
    private double f17636v;

    /* renamed from: w  reason: collision with root package name */
    private SVGLength[] f17637w;

    /* renamed from: x  reason: collision with root package name */
    private SVGLength[] f17638x;

    /* renamed from: y  reason: collision with root package name */
    private SVGLength[] f17639y;

    /* renamed from: z  reason: collision with root package name */
    private SVGLength[] f17640z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(float f11, float f12, float f13) {
        ArrayList<h> arrayList = new ArrayList<>();
        this.f17615a = arrayList;
        ArrayList<SVGLength[]> arrayList2 = new ArrayList<>();
        this.f17616b = arrayList2;
        ArrayList<SVGLength[]> arrayList3 = new ArrayList<>();
        this.f17617c = arrayList3;
        ArrayList<SVGLength[]> arrayList4 = new ArrayList<>();
        this.f17618d = arrayList4;
        ArrayList<SVGLength[]> arrayList5 = new ArrayList<>();
        this.f17619e = arrayList5;
        ArrayList<double[]> arrayList6 = new ArrayList<>();
        this.f17620f = arrayList6;
        ArrayList<Integer> arrayList7 = new ArrayList<>();
        this.f17621g = arrayList7;
        ArrayList<Integer> arrayList8 = new ArrayList<>();
        this.f17622h = arrayList8;
        ArrayList<Integer> arrayList9 = new ArrayList<>();
        this.f17623i = arrayList9;
        ArrayList<Integer> arrayList10 = new ArrayList<>();
        this.f17624j = arrayList10;
        ArrayList<Integer> arrayList11 = new ArrayList<>();
        this.f17625k = arrayList11;
        this.f17626l = new ArrayList<>();
        this.f17627m = new ArrayList<>();
        this.f17628n = new ArrayList<>();
        this.f17629o = new ArrayList<>();
        this.f17630p = new ArrayList<>();
        this.f17631q = 12.0d;
        this.f17632r = h.f17591p;
        SVGLength[] sVGLengthArr = new SVGLength[0];
        this.f17637w = sVGLengthArr;
        this.f17638x = new SVGLength[0];
        this.f17639y = new SVGLength[0];
        this.f17640z = new SVGLength[0];
        this.A = new double[]{0.0d};
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.M = f11;
        this.N = f12;
        this.O = f13;
        arrayList2.add(sVGLengthArr);
        arrayList3.add(this.f17638x);
        arrayList4.add(this.f17639y);
        arrayList5.add(this.f17640z);
        arrayList6.add(this.A);
        arrayList7.add(Integer.valueOf(this.G));
        arrayList8.add(Integer.valueOf(this.H));
        arrayList9.add(Integer.valueOf(this.I));
        arrayList10.add(Integer.valueOf(this.J));
        arrayList11.add(Integer.valueOf(this.K));
        arrayList.add(this.f17632r);
        q();
    }

    private double[] a(ArrayList<SVGLength> arrayList) {
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i11 = 0; i11 < size; i11++) {
            dArr[i11] = arrayList.get(i11).f17527a;
        }
        return dArr;
    }

    private SVGLength[] e(ArrayList<SVGLength> arrayList) {
        int size = arrayList.size();
        SVGLength[] sVGLengthArr = new SVGLength[size];
        for (int i11 = 0; i11 < size; i11++) {
            sVGLengthArr[i11] = arrayList.get(i11);
        }
        return sVGLengthArr;
    }

    private h f(l lVar) {
        if (this.L > 0) {
            return this.f17632r;
        }
        for (l parentTextRoot = lVar.getParentTextRoot(); parentTextRoot != null; parentTextRoot = parentTextRoot.getParentTextRoot()) {
            h b11 = parentTextRoot.f().b();
            if (b11 != h.f17591p) {
                return b11;
            }
        }
        return h.f17591p;
    }

    private static void h(ArrayList<Integer> arrayList, int i11) {
        while (i11 >= 0) {
            arrayList.set(i11, Integer.valueOf(arrayList.get(i11).intValue() + 1));
            i11--;
        }
    }

    private void q() {
        this.f17626l.add(Integer.valueOf(this.B));
        this.f17627m.add(Integer.valueOf(this.C));
        this.f17628n.add(Integer.valueOf(this.D));
        this.f17629o.add(Integer.valueOf(this.E));
        this.f17630p.add(Integer.valueOf(this.F));
    }

    private void r(l lVar, ReadableMap readableMap) {
        h f11 = f(lVar);
        this.L++;
        if (readableMap == null) {
            this.f17615a.add(f11);
            return;
        }
        h hVar = new h(readableMap, f11, this.M);
        this.f17631q = hVar.f17592a;
        this.f17615a.add(hVar);
        this.f17632r = hVar;
    }

    private void s() {
        this.F = 0;
        this.E = 0;
        this.D = 0;
        this.C = 0;
        this.B = 0;
        this.K = -1;
        this.J = -1;
        this.I = -1;
        this.H = -1;
        this.G = -1;
        this.f17636v = 0.0d;
        this.f17635u = 0.0d;
        this.f17634t = 0.0d;
        this.f17633s = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h b() {
        return this.f17632r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double c() {
        return this.f17631q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double i() {
        h(this.f17623i, this.D);
        int i11 = this.I + 1;
        SVGLength[] sVGLengthArr = this.f17639y;
        if (i11 < sVGLengthArr.length) {
            this.I = i11;
            this.f17635u += x.a(sVGLengthArr[i11], this.N, 0.0d, this.M, this.f17631q);
        }
        return this.f17635u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double j() {
        h(this.f17624j, this.E);
        int i11 = this.J + 1;
        SVGLength[] sVGLengthArr = this.f17640z;
        if (i11 < sVGLengthArr.length) {
            this.J = i11;
            this.f17636v += x.a(sVGLengthArr[i11], this.O, 0.0d, this.M, this.f17631q);
        }
        return this.f17636v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double k() {
        h(this.f17625k, this.F);
        int min = Math.min(this.K + 1, this.A.length - 1);
        this.K = min;
        return this.A[min];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double l(double d11) {
        h(this.f17621g, this.B);
        int i11 = this.G + 1;
        SVGLength[] sVGLengthArr = this.f17637w;
        if (i11 < sVGLengthArr.length) {
            this.f17635u = 0.0d;
            this.G = i11;
            this.f17633s = x.a(sVGLengthArr[i11], this.N, 0.0d, this.M, this.f17631q);
        }
        double d12 = this.f17633s + d11;
        this.f17633s = d12;
        return d12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double m() {
        h(this.f17622h, this.C);
        int i11 = this.H + 1;
        SVGLength[] sVGLengthArr = this.f17638x;
        if (i11 < sVGLengthArr.length) {
            this.f17636v = 0.0d;
            this.H = i11;
            this.f17634t = x.a(sVGLengthArr[i11], this.O, 0.0d, this.M, this.f17631q);
        }
        return this.f17634t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        this.f17615a.remove(this.L);
        this.f17626l.remove(this.L);
        this.f17627m.remove(this.L);
        this.f17628n.remove(this.L);
        this.f17629o.remove(this.L);
        this.f17630p.remove(this.L);
        int i11 = this.L - 1;
        this.L = i11;
        int i12 = this.B;
        int i13 = this.C;
        int i14 = this.D;
        int i15 = this.E;
        int i16 = this.F;
        this.f17632r = this.f17615a.get(i11);
        this.B = this.f17626l.get(this.L).intValue();
        this.C = this.f17627m.get(this.L).intValue();
        this.D = this.f17628n.get(this.L).intValue();
        this.E = this.f17629o.get(this.L).intValue();
        this.F = this.f17630p.get(this.L).intValue();
        if (i12 != this.B) {
            this.f17616b.remove(i12);
            this.f17637w = this.f17616b.get(this.B);
            this.G = this.f17621g.get(this.B).intValue();
        }
        if (i13 != this.C) {
            this.f17617c.remove(i13);
            this.f17638x = this.f17617c.get(this.C);
            this.H = this.f17622h.get(this.C).intValue();
        }
        if (i14 != this.D) {
            this.f17618d.remove(i14);
            this.f17639y = this.f17618d.get(this.D);
            this.I = this.f17623i.get(this.D).intValue();
        }
        if (i15 != this.E) {
            this.f17619e.remove(i15);
            this.f17640z = this.f17619e.get(this.E);
            this.J = this.f17624j.get(this.E).intValue();
        }
        if (i16 != this.F) {
            this.f17620f.remove(i16);
            this.A = this.f17620f.get(this.F);
            this.K = this.f17625k.get(this.F).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(l lVar, ReadableMap readableMap) {
        r(lVar, readableMap);
        q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(boolean z11, r0 r0Var, ReadableMap readableMap, ArrayList<SVGLength> arrayList, ArrayList<SVGLength> arrayList2, ArrayList<SVGLength> arrayList3, ArrayList<SVGLength> arrayList4, ArrayList<SVGLength> arrayList5) {
        if (z11) {
            s();
        }
        r(r0Var, readableMap);
        if (arrayList != null && arrayList.size() != 0) {
            this.B++;
            this.G = -1;
            this.f17621g.add(-1);
            SVGLength[] e11 = e(arrayList);
            this.f17637w = e11;
            this.f17616b.add(e11);
        }
        if (arrayList2 != null && arrayList2.size() != 0) {
            this.C++;
            this.H = -1;
            this.f17622h.add(-1);
            SVGLength[] e12 = e(arrayList2);
            this.f17638x = e12;
            this.f17617c.add(e12);
        }
        if (arrayList3 != null && arrayList3.size() != 0) {
            this.D++;
            this.I = -1;
            this.f17623i.add(-1);
            SVGLength[] e13 = e(arrayList3);
            this.f17639y = e13;
            this.f17618d.add(e13);
        }
        if (arrayList4 != null && arrayList4.size() != 0) {
            this.E++;
            this.J = -1;
            this.f17624j.add(-1);
            SVGLength[] e14 = e(arrayList4);
            this.f17640z = e14;
            this.f17619e.add(e14);
        }
        if (arrayList5 != null && arrayList5.size() != 0) {
            this.F++;
            this.K = -1;
            this.f17625k.add(-1);
            double[] a11 = a(arrayList5);
            this.A = a11;
            this.f17620f.add(a11);
        }
        q();
    }
}