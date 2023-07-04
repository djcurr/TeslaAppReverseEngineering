package c3;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private b f8801a;

    /* renamed from: b  reason: collision with root package name */
    private String f8802b;

    /* renamed from: c  reason: collision with root package name */
    private int f8803c = 0;

    /* renamed from: d  reason: collision with root package name */
    private String f8804d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f8805e = 0;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<c> f8806f = new ArrayList<>();

    /* loaded from: classes.dex */
    class a implements Comparator<c> {
        a(e eVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            return Integer.compare(cVar.f8815a, cVar2.f8815a);
        }
    }

    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        h f8807a;

        /* renamed from: b  reason: collision with root package name */
        float[] f8808b;

        /* renamed from: c  reason: collision with root package name */
        double[] f8809c;

        /* renamed from: d  reason: collision with root package name */
        float[] f8810d;

        /* renamed from: e  reason: collision with root package name */
        float[] f8811e;

        /* renamed from: f  reason: collision with root package name */
        float[] f8812f;

        /* renamed from: g  reason: collision with root package name */
        c3.b f8813g;

        /* renamed from: h  reason: collision with root package name */
        double[] f8814h;

        b(int i11, String str, int i12, int i13) {
            h hVar = new h();
            this.f8807a = hVar;
            hVar.e(i11, str);
            this.f8808b = new float[i13];
            this.f8809c = new double[i13];
            this.f8810d = new float[i13];
            this.f8811e = new float[i13];
            this.f8812f = new float[i13];
            float[] fArr = new float[i13];
        }

        public double a(float f11) {
            c3.b bVar = this.f8813g;
            if (bVar != null) {
                bVar.d(f11, this.f8814h);
            } else {
                double[] dArr = this.f8814h;
                dArr[0] = this.f8811e[0];
                dArr[1] = this.f8812f[0];
                dArr[2] = this.f8808b[0];
            }
            double[] dArr2 = this.f8814h;
            return dArr2[0] + (this.f8807a.c(f11, dArr2[1]) * this.f8814h[2]);
        }

        public void b(int i11, int i12, float f11, float f12, float f13, float f14) {
            this.f8809c[i11] = i12 / 100.0d;
            this.f8810d[i11] = f11;
            this.f8811e[i11] = f12;
            this.f8812f[i11] = f13;
            this.f8808b[i11] = f14;
        }

        public void c(float f11) {
            double[][] dArr = (double[][]) Array.newInstance(double.class, this.f8809c.length, 3);
            float[] fArr = this.f8808b;
            this.f8814h = new double[fArr.length + 2];
            double[] dArr2 = new double[fArr.length + 2];
            if (this.f8809c[0] > 0.0d) {
                this.f8807a.a(0.0d, this.f8810d[0]);
            }
            double[] dArr3 = this.f8809c;
            int length = dArr3.length - 1;
            if (dArr3[length] < 1.0d) {
                this.f8807a.a(1.0d, this.f8810d[length]);
            }
            for (int i11 = 0; i11 < dArr.length; i11++) {
                dArr[i11][0] = this.f8811e[i11];
                dArr[i11][1] = this.f8812f[i11];
                dArr[i11][2] = this.f8808b[i11];
                this.f8807a.a(this.f8809c[i11], this.f8810d[i11]);
            }
            this.f8807a.d();
            double[] dArr4 = this.f8809c;
            if (dArr4.length > 1) {
                this.f8813g = c3.b.a(0, dArr4, dArr);
            } else {
                this.f8813g = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        int f8815a;

        /* renamed from: b  reason: collision with root package name */
        float f8816b;

        /* renamed from: c  reason: collision with root package name */
        float f8817c;

        /* renamed from: d  reason: collision with root package name */
        float f8818d;

        /* renamed from: e  reason: collision with root package name */
        float f8819e;

        public c(int i11, float f11, float f12, float f13, float f14) {
            this.f8815a = i11;
            this.f8816b = f14;
            this.f8817c = f12;
            this.f8818d = f11;
            this.f8819e = f13;
        }
    }

    public float a(float f11) {
        return (float) this.f8801a.a(f11);
    }

    protected void b(Object obj) {
    }

    public void c(int i11, int i12, String str, int i13, float f11, float f12, float f13, float f14) {
        this.f8806f.add(new c(i11, f11, f12, f13, f14));
        if (i13 != -1) {
            this.f8805e = i13;
        }
        this.f8803c = i12;
        this.f8804d = str;
    }

    public void d(int i11, int i12, String str, int i13, float f11, float f12, float f13, float f14, Object obj) {
        this.f8806f.add(new c(i11, f11, f12, f13, f14));
        if (i13 != -1) {
            this.f8805e = i13;
        }
        this.f8803c = i12;
        b(obj);
        this.f8804d = str;
    }

    public void e(String str) {
        this.f8802b = str;
    }

    public void f(float f11) {
        int size = this.f8806f.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f8806f, new a(this));
        double[] dArr = new double[size];
        char c11 = 0;
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, 3);
        this.f8801a = new b(this.f8803c, this.f8804d, this.f8805e, size);
        Iterator<c> it2 = this.f8806f.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            c next = it2.next();
            float f12 = next.f8818d;
            dArr[i11] = f12 * 0.01d;
            double[] dArr3 = dArr2[i11];
            float f13 = next.f8816b;
            dArr3[c11] = f13;
            double[] dArr4 = dArr2[i11];
            float f14 = next.f8817c;
            dArr4[1] = f14;
            double[] dArr5 = dArr2[i11];
            float f15 = next.f8819e;
            dArr5[2] = f15;
            this.f8801a.b(i11, next.f8815a, f12, f14, f15, f13);
            i11++;
            c11 = 0;
        }
        this.f8801a.c(f11);
        c3.b.a(0, dArr, dArr2);
    }

    public boolean g() {
        return this.f8805e == 1;
    }

    public String toString() {
        String str = this.f8802b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<c> it2 = this.f8806f.iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            str = str + "[" + next.f8815a + " , " + decimalFormat.format(next.f8816b) + "] ";
        }
        return str;
    }
}