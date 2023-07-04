package h3;

import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class e extends c3.l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends e {
        a() {
        }

        @Override // h3.e
        public boolean i(View view, float f11, long j11, c3.d dVar) {
            view.setAlpha(f(f11, j11, view, dVar));
            return this.f8852h;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: l  reason: collision with root package name */
        String f28782l;

        /* renamed from: m  reason: collision with root package name */
        SparseArray<androidx.constraintlayout.widget.a> f28783m;

        /* renamed from: n  reason: collision with root package name */
        SparseArray<float[]> f28784n = new SparseArray<>();

        /* renamed from: o  reason: collision with root package name */
        float[] f28785o;

        /* renamed from: p  reason: collision with root package name */
        float[] f28786p;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.f28782l = str.split(",")[1];
            this.f28783m = sparseArray;
        }

        @Override // c3.l
        public void b(int i11, float f11, float f12, int i12, float f13) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // c3.l
        public void e(int i11) {
            float[] fArr;
            int size = this.f28783m.size();
            int g11 = this.f28783m.valueAt(0).g();
            double[] dArr = new double[size];
            int i12 = g11 + 2;
            this.f28785o = new float[i12];
            this.f28786p = new float[g11];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, i12);
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = this.f28783m.keyAt(i13);
                float[] valueAt = this.f28784n.valueAt(i13);
                dArr[i13] = keyAt * 0.01d;
                this.f28783m.valueAt(i13).f(this.f28785o);
                int i14 = 0;
                while (true) {
                    if (i14 < this.f28785o.length) {
                        dArr2[i13][i14] = fArr[i14];
                        i14++;
                    }
                }
                dArr2[i13][g11] = valueAt[0];
                dArr2[i13][g11 + 1] = valueAt[1];
            }
            this.f8845a = c3.b.a(i11, dArr, dArr2);
        }

        @Override // h3.e
        public boolean i(View view, float f11, long j11, c3.d dVar) {
            this.f8845a.e(f11, this.f28785o);
            float[] fArr = this.f28785o;
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            long j12 = j11 - this.f8853i;
            if (Float.isNaN(this.f8854j)) {
                float a11 = dVar.a(view, this.f28782l, 0);
                this.f8854j = a11;
                if (Float.isNaN(a11)) {
                    this.f8854j = BitmapDescriptorFactory.HUE_RED;
                }
            }
            float f14 = (float) ((this.f8854j + ((j12 * 1.0E-9d) * f12)) % 1.0d);
            this.f8854j = f14;
            this.f8853i = j11;
            float a12 = a(f14);
            this.f8852h = false;
            int i11 = 0;
            while (true) {
                float[] fArr2 = this.f28786p;
                if (i11 >= fArr2.length) {
                    break;
                }
                boolean z11 = this.f8852h;
                float[] fArr3 = this.f28785o;
                this.f8852h = z11 | (((double) fArr3[i11]) != 0.0d);
                fArr2[i11] = (fArr3[i11] * a12) + f13;
                i11++;
            }
            h3.a.b(this.f28783m.valueAt(0), view, this.f28786p);
            if (f12 != BitmapDescriptorFactory.HUE_RED) {
                this.f8852h = true;
            }
            return this.f8852h;
        }

        public void j(int i11, androidx.constraintlayout.widget.a aVar, float f11, int i12, float f12) {
            this.f28783m.append(i11, aVar);
            this.f28784n.append(i11, new float[]{f11, f12});
            this.f8846b = Math.max(this.f8846b, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends e {
        c() {
        }

        @Override // h3.e
        public boolean i(View view, float f11, long j11, c3.d dVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(f(f11, j11, view, dVar));
            }
            return this.f8852h;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {
        @Override // h3.e
        public boolean i(View view, float f11, long j11, c3.d dVar) {
            return this.f8852h;
        }

        public boolean j(View view, c3.d dVar, float f11, long j11, double d11, double d12) {
            view.setRotation(f(f11, j11, view, dVar) + ((float) Math.toDegrees(Math.atan2(d12, d11))));
            return this.f8852h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h3.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0559e extends e {

        /* renamed from: l  reason: collision with root package name */
        boolean f28787l = false;

        C0559e() {
        }

        @Override // h3.e
        public boolean i(View view, float f11, long j11, c3.d dVar) {
            if (view instanceof p) {
                ((p) view).setProgress(f(f11, j11, view, dVar));
            } else if (this.f28787l) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f28787l = true;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(f(f11, j11, view, dVar)));
                    } catch (IllegalAccessException e11) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e11);
                    } catch (InvocationTargetException e12) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e12);
                    }
                }
            }
            return this.f8852h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f extends e {
        f() {
        }

        @Override // h3.e
        public boolean i(View view, float f11, long j11, c3.d dVar) {
            view.setRotation(f(f11, j11, view, dVar));
            return this.f8852h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g extends e {
        g() {
        }

        @Override // h3.e
        public boolean i(View view, float f11, long j11, c3.d dVar) {
            view.setRotationX(f(f11, j11, view, dVar));
            return this.f8852h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h extends e {
        h() {
        }

        @Override // h3.e
        public boolean i(View view, float f11, long j11, c3.d dVar) {
            view.setRotationY(f(f11, j11, view, dVar));
            return this.f8852h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i extends e {
        i() {
        }

        @Override // h3.e
        public boolean i(View view, float f11, long j11, c3.d dVar) {
            view.setScaleX(f(f11, j11, view, dVar));
            return this.f8852h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j extends e {
        j() {
        }

        @Override // h3.e
        public boolean i(View view, float f11, long j11, c3.d dVar) {
            view.setScaleY(f(f11, j11, view, dVar));
            return this.f8852h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k extends e {
        k() {
        }

        @Override // h3.e
        public boolean i(View view, float f11, long j11, c3.d dVar) {
            view.setTranslationX(f(f11, j11, view, dVar));
            return this.f8852h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class l extends e {
        l() {
        }

        @Override // h3.e
        public boolean i(View view, float f11, long j11, c3.d dVar) {
            view.setTranslationY(f(f11, j11, view, dVar));
            return this.f8852h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class m extends e {
        m() {
        }

        @Override // h3.e
        public boolean i(View view, float f11, long j11, c3.d dVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(f(f11, j11, view, dVar));
            }
            return this.f8852h;
        }
    }

    public static e g(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    public static e h(String str, long j11) {
        e gVar;
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c11 = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c11 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c11 = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c11 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c11 = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c11 = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c11 = 11;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                gVar = new g();
                break;
            case 1:
                gVar = new h();
                break;
            case 2:
                gVar = new k();
                break;
            case 3:
                gVar = new l();
                break;
            case 4:
                gVar = new m();
                break;
            case 5:
                gVar = new C0559e();
                break;
            case 6:
                gVar = new i();
                break;
            case 7:
                gVar = new j();
                break;
            case '\b':
                gVar = new f();
                break;
            case '\t':
                gVar = new c();
                break;
            case '\n':
                gVar = new d();
                break;
            case 11:
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.c(j11);
        return gVar;
    }

    public float f(float f11, long j11, View view, c3.d dVar) {
        this.f8845a.e(f11, this.f8851g);
        float[] fArr = this.f8851g;
        float f12 = fArr[1];
        int i11 = (f12 > BitmapDescriptorFactory.HUE_RED ? 1 : (f12 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i11 == 0) {
            this.f8852h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f8854j)) {
            float a11 = dVar.a(view, this.f8850f, 0);
            this.f8854j = a11;
            if (Float.isNaN(a11)) {
                this.f8854j = BitmapDescriptorFactory.HUE_RED;
            }
        }
        float f13 = (float) ((this.f8854j + (((j11 - this.f8853i) * 1.0E-9d) * f12)) % 1.0d);
        this.f8854j = f13;
        dVar.b(view, this.f8850f, 0, f13);
        this.f8853i = j11;
        float f14 = this.f8851g[0];
        float a12 = (a(this.f8854j) * f14) + this.f8851g[2];
        this.f8852h = (f14 == BitmapDescriptorFactory.HUE_RED && i11 == 0) ? false : true;
        return a12;
    }

    public abstract boolean i(View view, float f11, long j11, c3.d dVar);
}