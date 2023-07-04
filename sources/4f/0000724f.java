package h3;

import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.p;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class d extends c3.j {

    /* loaded from: classes.dex */
    static class a extends d {
        a() {
        }

        @Override // h3.d
        public void g(View view, float f11) {
            view.setAlpha(a(f11));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends d {

        /* renamed from: f  reason: collision with root package name */
        SparseArray<androidx.constraintlayout.widget.a> f28779f;

        /* renamed from: g  reason: collision with root package name */
        float[] f28780g;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            String str2 = str.split(",")[1];
            this.f28779f = sparseArray;
        }

        @Override // c3.j
        public void b(int i11, float f11) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // c3.j
        public void d(int i11) {
            float[] fArr;
            int size = this.f28779f.size();
            int g11 = this.f28779f.valueAt(0).g();
            double[] dArr = new double[size];
            this.f28780g = new float[g11];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, g11);
            for (int i12 = 0; i12 < size; i12++) {
                dArr[i12] = this.f28779f.keyAt(i12) * 0.01d;
                this.f28779f.valueAt(i12).f(this.f28780g);
                int i13 = 0;
                while (true) {
                    if (i13 < this.f28780g.length) {
                        dArr2[i12][i13] = fArr[i13];
                        i13++;
                    }
                }
            }
            this.f8838a = c3.b.a(i11, dArr, dArr2);
        }

        @Override // h3.d
        public void g(View view, float f11) {
            this.f8838a.e(f11, this.f28780g);
            h3.a.b(this.f28779f.valueAt(0), view, this.f28780g);
        }

        public void h(int i11, androidx.constraintlayout.widget.a aVar) {
            this.f28779f.append(i11, aVar);
        }
    }

    /* loaded from: classes.dex */
    static class c extends d {
        c() {
        }

        @Override // h3.d
        public void g(View view, float f11) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(a(f11));
            }
        }
    }

    /* renamed from: h3.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0558d extends d {
        @Override // h3.d
        public void g(View view, float f11) {
        }

        public void h(View view, float f11, double d11, double d12) {
            view.setRotation(a(f11) + ((float) Math.toDegrees(Math.atan2(d12, d11))));
        }
    }

    /* loaded from: classes.dex */
    static class e extends d {
        e() {
        }

        @Override // h3.d
        public void g(View view, float f11) {
            view.setPivotX(a(f11));
        }
    }

    /* loaded from: classes.dex */
    static class f extends d {
        f() {
        }

        @Override // h3.d
        public void g(View view, float f11) {
            view.setPivotY(a(f11));
        }
    }

    /* loaded from: classes.dex */
    static class g extends d {

        /* renamed from: f  reason: collision with root package name */
        boolean f28781f = false;

        g() {
        }

        @Override // h3.d
        public void g(View view, float f11) {
            if (view instanceof p) {
                ((p) view).setProgress(a(f11));
            } else if (this.f28781f) {
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f28781f = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(a(f11)));
                    } catch (IllegalAccessException e11) {
                        Log.e("ViewSpline", "unable to setProgress", e11);
                    } catch (InvocationTargetException e12) {
                        Log.e("ViewSpline", "unable to setProgress", e12);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    static class h extends d {
        h() {
        }

        @Override // h3.d
        public void g(View view, float f11) {
            view.setRotation(a(f11));
        }
    }

    /* loaded from: classes.dex */
    static class i extends d {
        i() {
        }

        @Override // h3.d
        public void g(View view, float f11) {
            view.setRotationX(a(f11));
        }
    }

    /* loaded from: classes.dex */
    static class j extends d {
        j() {
        }

        @Override // h3.d
        public void g(View view, float f11) {
            view.setRotationY(a(f11));
        }
    }

    /* loaded from: classes.dex */
    static class k extends d {
        k() {
        }

        @Override // h3.d
        public void g(View view, float f11) {
            view.setScaleX(a(f11));
        }
    }

    /* loaded from: classes.dex */
    static class l extends d {
        l() {
        }

        @Override // h3.d
        public void g(View view, float f11) {
            view.setScaleY(a(f11));
        }
    }

    /* loaded from: classes.dex */
    static class m extends d {
        m() {
        }

        @Override // h3.d
        public void g(View view, float f11) {
            view.setTranslationX(a(f11));
        }
    }

    /* loaded from: classes.dex */
    static class n extends d {
        n() {
        }

        @Override // h3.d
        public void g(View view, float f11) {
            view.setTranslationY(a(f11));
        }
    }

    /* loaded from: classes.dex */
    static class o extends d {
        o() {
        }

        @Override // h3.d
        public void g(View view, float f11) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(a(f11));
            }
        }
    }

    public static d e(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    public static d f(String str) {
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
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c11 = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c11 = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c11 = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c11 = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c11 = '\r';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c11 = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c11 = 15;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return new i();
            case 1:
                return new j();
            case 2:
                return new m();
            case 3:
                return new n();
            case 4:
                return new o();
            case 5:
                return new g();
            case 6:
                return new k();
            case 7:
                return new l();
            case '\b':
                return new a();
            case '\t':
                return new e();
            case '\n':
                return new f();
            case 11:
                return new h();
            case '\f':
                return new c();
            case '\r':
                return new C0558d();
            case 14:
                return new a();
            case 15:
                return new a();
            default:
                return null;
        }
    }

    public abstract void g(View view, float f11);
}