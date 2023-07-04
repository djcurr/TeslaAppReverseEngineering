package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.p;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class d {

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f3808f = {0, 4, 8};

    /* renamed from: g  reason: collision with root package name */
    private static SparseIntArray f3809g = new SparseIntArray();

    /* renamed from: h  reason: collision with root package name */
    private static SparseIntArray f3810h = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    public String f3811a;

    /* renamed from: b  reason: collision with root package name */
    public String f3812b = "";

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.a> f3813c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private boolean f3814d = true;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<Integer, a> f3815e = new HashMap<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f3816a;

        /* renamed from: b  reason: collision with root package name */
        String f3817b;

        /* renamed from: c  reason: collision with root package name */
        public final C0067d f3818c = new C0067d();

        /* renamed from: d  reason: collision with root package name */
        public final c f3819d = new c();

        /* renamed from: e  reason: collision with root package name */
        public final b f3820e = new b();

        /* renamed from: f  reason: collision with root package name */
        public final e f3821f = new e();

        /* renamed from: g  reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f3822g = new HashMap<>();

        /* renamed from: h  reason: collision with root package name */
        C0066a f3823h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.constraintlayout.widget.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0066a {

            /* renamed from: a  reason: collision with root package name */
            int[] f3824a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            int[] f3825b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            int f3826c = 0;

            /* renamed from: d  reason: collision with root package name */
            int[] f3827d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            float[] f3828e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            int f3829f = 0;

            /* renamed from: g  reason: collision with root package name */
            int[] f3830g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            String[] f3831h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            int f3832i = 0;

            /* renamed from: j  reason: collision with root package name */
            int[] f3833j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            boolean[] f3834k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            int f3835l = 0;

            C0066a() {
            }

            void a(int i11, float f11) {
                int i12 = this.f3829f;
                int[] iArr = this.f3827d;
                if (i12 >= iArr.length) {
                    this.f3827d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f3828e;
                    this.f3828e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f3827d;
                int i13 = this.f3829f;
                iArr2[i13] = i11;
                float[] fArr2 = this.f3828e;
                this.f3829f = i13 + 1;
                fArr2[i13] = f11;
            }

            void b(int i11, int i12) {
                int i13 = this.f3826c;
                int[] iArr = this.f3824a;
                if (i13 >= iArr.length) {
                    this.f3824a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f3825b;
                    this.f3825b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f3824a;
                int i14 = this.f3826c;
                iArr3[i14] = i11;
                int[] iArr4 = this.f3825b;
                this.f3826c = i14 + 1;
                iArr4[i14] = i12;
            }

            void c(int i11, String str) {
                int i12 = this.f3832i;
                int[] iArr = this.f3830g;
                if (i12 >= iArr.length) {
                    this.f3830g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f3831h;
                    this.f3831h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f3830g;
                int i13 = this.f3832i;
                iArr2[i13] = i11;
                String[] strArr2 = this.f3831h;
                this.f3832i = i13 + 1;
                strArr2[i13] = str;
            }

            void d(int i11, boolean z11) {
                int i12 = this.f3835l;
                int[] iArr = this.f3833j;
                if (i12 >= iArr.length) {
                    this.f3833j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f3834k;
                    this.f3834k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f3833j;
                int i13 = this.f3835l;
                iArr2[i13] = i11;
                boolean[] zArr2 = this.f3834k;
                this.f3835l = i13 + 1;
                zArr2[i13] = z11;
            }

            void e(a aVar) {
                for (int i11 = 0; i11 < this.f3826c; i11++) {
                    d.G(aVar, this.f3824a[i11], this.f3825b[i11]);
                }
                for (int i12 = 0; i12 < this.f3829f; i12++) {
                    d.F(aVar, this.f3827d[i12], this.f3828e[i12]);
                }
                for (int i13 = 0; i13 < this.f3832i; i13++) {
                    d.H(aVar, this.f3830g[i13], this.f3831h[i13]);
                }
                for (int i14 = 0; i14 < this.f3835l; i14++) {
                    d.I(aVar, this.f3833j[i14], this.f3834k[i14]);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i11, ConstraintLayout.b bVar) {
            this.f3816a = i11;
            b bVar2 = this.f3820e;
            bVar2.f3853i = bVar.f3729e;
            bVar2.f3855j = bVar.f3731f;
            bVar2.f3857k = bVar.f3733g;
            bVar2.f3859l = bVar.f3735h;
            bVar2.f3861m = bVar.f3737i;
            bVar2.f3863n = bVar.f3739j;
            bVar2.f3865o = bVar.f3741k;
            bVar2.f3867p = bVar.f3743l;
            bVar2.f3869q = bVar.f3745m;
            bVar2.f3870r = bVar.f3747n;
            bVar2.f3871s = bVar.f3749o;
            bVar2.f3872t = bVar.f3757s;
            bVar2.f3873u = bVar.f3758t;
            bVar2.f3874v = bVar.f3759u;
            bVar2.f3875w = bVar.f3760v;
            bVar2.f3876x = bVar.E;
            bVar2.f3877y = bVar.F;
            bVar2.f3878z = bVar.G;
            bVar2.A = bVar.f3751p;
            bVar2.B = bVar.f3753q;
            bVar2.C = bVar.f3755r;
            bVar2.D = bVar.T;
            bVar2.E = bVar.U;
            bVar2.F = bVar.V;
            bVar2.f3849g = bVar.f3725c;
            bVar2.f3845e = bVar.f3721a;
            bVar2.f3847f = bVar.f3723b;
            bVar2.f3841c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f3843d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.G = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.M = bVar.D;
            bVar2.U = bVar.I;
            bVar2.V = bVar.H;
            bVar2.X = bVar.K;
            bVar2.W = bVar.J;
            bVar2.f3862m0 = bVar.W;
            bVar2.f3864n0 = bVar.X;
            bVar2.Y = bVar.L;
            bVar2.Z = bVar.M;
            bVar2.f3838a0 = bVar.P;
            bVar2.f3840b0 = bVar.Q;
            bVar2.f3842c0 = bVar.N;
            bVar2.f3844d0 = bVar.O;
            bVar2.f3846e0 = bVar.R;
            bVar2.f3848f0 = bVar.S;
            bVar2.f3860l0 = bVar.Y;
            bVar2.O = bVar.f3762x;
            bVar2.Q = bVar.f3764z;
            bVar2.N = bVar.f3761w;
            bVar2.P = bVar.f3763y;
            bVar2.S = bVar.A;
            bVar2.R = bVar.B;
            bVar2.T = bVar.C;
            bVar2.f3868p0 = bVar.Z;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar2.K = bVar.getMarginEnd();
                this.f3820e.L = bVar.getMarginStart();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(int i11, e.a aVar) {
            g(i11, aVar);
            this.f3818c.f3897d = aVar.f3915s0;
            e eVar = this.f3821f;
            eVar.f3901b = aVar.f3918v0;
            eVar.f3902c = aVar.f3919w0;
            eVar.f3903d = aVar.f3920x0;
            eVar.f3904e = aVar.f3921y0;
            eVar.f3905f = aVar.f3922z0;
            eVar.f3906g = aVar.A0;
            eVar.f3907h = aVar.B0;
            eVar.f3909j = aVar.C0;
            eVar.f3910k = aVar.D0;
            eVar.f3911l = aVar.E0;
            eVar.f3913n = aVar.f3917u0;
            eVar.f3912m = aVar.f3916t0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(androidx.constraintlayout.widget.b bVar, int i11, e.a aVar) {
            h(i11, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.f3820e;
                bVar2.f3854i0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f3850g0 = barrier.getType();
                this.f3820e.f3856j0 = barrier.getReferencedIds();
                this.f3820e.f3852h0 = barrier.getMargin();
            }
        }

        public void d(a aVar) {
            C0066a c0066a = this.f3823h;
            if (c0066a != null) {
                c0066a.e(aVar);
            }
        }

        public void e(ConstraintLayout.b bVar) {
            b bVar2 = this.f3820e;
            bVar.f3729e = bVar2.f3853i;
            bVar.f3731f = bVar2.f3855j;
            bVar.f3733g = bVar2.f3857k;
            bVar.f3735h = bVar2.f3859l;
            bVar.f3737i = bVar2.f3861m;
            bVar.f3739j = bVar2.f3863n;
            bVar.f3741k = bVar2.f3865o;
            bVar.f3743l = bVar2.f3867p;
            bVar.f3745m = bVar2.f3869q;
            bVar.f3747n = bVar2.f3870r;
            bVar.f3749o = bVar2.f3871s;
            bVar.f3757s = bVar2.f3872t;
            bVar.f3758t = bVar2.f3873u;
            bVar.f3759u = bVar2.f3874v;
            bVar.f3760v = bVar2.f3875w;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.G;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.J;
            bVar.A = bVar2.S;
            bVar.B = bVar2.R;
            bVar.f3762x = bVar2.O;
            bVar.f3764z = bVar2.Q;
            bVar.E = bVar2.f3876x;
            bVar.F = bVar2.f3877y;
            bVar.f3751p = bVar2.A;
            bVar.f3753q = bVar2.B;
            bVar.f3755r = bVar2.C;
            bVar.G = bVar2.f3878z;
            bVar.T = bVar2.D;
            bVar.U = bVar2.E;
            bVar.I = bVar2.U;
            bVar.H = bVar2.V;
            bVar.K = bVar2.X;
            bVar.J = bVar2.W;
            bVar.W = bVar2.f3862m0;
            bVar.X = bVar2.f3864n0;
            bVar.L = bVar2.Y;
            bVar.M = bVar2.Z;
            bVar.P = bVar2.f3838a0;
            bVar.Q = bVar2.f3840b0;
            bVar.N = bVar2.f3842c0;
            bVar.O = bVar2.f3844d0;
            bVar.R = bVar2.f3846e0;
            bVar.S = bVar2.f3848f0;
            bVar.V = bVar2.F;
            bVar.f3725c = bVar2.f3849g;
            bVar.f3721a = bVar2.f3845e;
            bVar.f3723b = bVar2.f3847f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f3841c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f3843d;
            String str = bVar2.f3860l0;
            if (str != null) {
                bVar.Y = str;
            }
            bVar.Z = bVar2.f3868p0;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(bVar2.L);
                bVar.setMarginEnd(this.f3820e.K);
            }
            bVar.b();
        }

        /* renamed from: f */
        public a clone() {
            a aVar = new a();
            aVar.f3820e.a(this.f3820e);
            aVar.f3819d.a(this.f3819d);
            aVar.f3818c.a(this.f3818c);
            aVar.f3821f.a(this.f3821f);
            aVar.f3816a = this.f3816a;
            aVar.f3823h = this.f3823h;
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: q0  reason: collision with root package name */
        private static SparseIntArray f3836q0;

        /* renamed from: c  reason: collision with root package name */
        public int f3841c;

        /* renamed from: d  reason: collision with root package name */
        public int f3843d;

        /* renamed from: j0  reason: collision with root package name */
        public int[] f3856j0;

        /* renamed from: k0  reason: collision with root package name */
        public String f3858k0;

        /* renamed from: l0  reason: collision with root package name */
        public String f3860l0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3837a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3839b = false;

        /* renamed from: e  reason: collision with root package name */
        public int f3845e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f3847f = -1;

        /* renamed from: g  reason: collision with root package name */
        public float f3849g = -1.0f;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3851h = true;

        /* renamed from: i  reason: collision with root package name */
        public int f3853i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f3855j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f3857k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f3859l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f3861m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f3863n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f3865o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f3867p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f3869q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f3870r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f3871s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f3872t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f3873u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f3874v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f3875w = -1;

        /* renamed from: x  reason: collision with root package name */
        public float f3876x = 0.5f;

        /* renamed from: y  reason: collision with root package name */
        public float f3877y = 0.5f;

        /* renamed from: z  reason: collision with root package name */
        public String f3878z = null;
        public int A = -1;
        public int B = 0;
        public float C = BitmapDescriptorFactory.HUE_RED;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0  reason: collision with root package name */
        public int f3838a0 = 0;

        /* renamed from: b0  reason: collision with root package name */
        public int f3840b0 = 0;

        /* renamed from: c0  reason: collision with root package name */
        public int f3842c0 = 0;

        /* renamed from: d0  reason: collision with root package name */
        public int f3844d0 = 0;

        /* renamed from: e0  reason: collision with root package name */
        public float f3846e0 = 1.0f;

        /* renamed from: f0  reason: collision with root package name */
        public float f3848f0 = 1.0f;

        /* renamed from: g0  reason: collision with root package name */
        public int f3850g0 = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f3852h0 = 0;

        /* renamed from: i0  reason: collision with root package name */
        public int f3854i0 = -1;

        /* renamed from: m0  reason: collision with root package name */
        public boolean f3862m0 = false;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f3864n0 = false;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f3866o0 = true;

        /* renamed from: p0  reason: collision with root package name */
        public int f3868p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3836q0 = sparseIntArray;
            sparseIntArray.append(i.L6, 24);
            f3836q0.append(i.M6, 25);
            f3836q0.append(i.O6, 28);
            f3836q0.append(i.P6, 29);
            f3836q0.append(i.U6, 35);
            f3836q0.append(i.T6, 34);
            f3836q0.append(i.f4149v6, 4);
            f3836q0.append(i.f4139u6, 3);
            f3836q0.append(i.f4119s6, 1);
            f3836q0.append(i.f3936a7, 6);
            f3836q0.append(i.f3947b7, 7);
            f3836q0.append(i.C6, 17);
            f3836q0.append(i.D6, 18);
            f3836q0.append(i.E6, 19);
            f3836q0.append(i.f4079o6, 90);
            f3836q0.append(i.f3935a6, 26);
            f3836q0.append(i.Q6, 31);
            f3836q0.append(i.R6, 32);
            f3836q0.append(i.B6, 10);
            f3836q0.append(i.A6, 9);
            f3836q0.append(i.f3980e7, 13);
            f3836q0.append(i.f4010h7, 16);
            f3836q0.append(i.f3990f7, 14);
            f3836q0.append(i.f3958c7, 11);
            f3836q0.append(i.f4000g7, 15);
            f3836q0.append(i.f3969d7, 12);
            f3836q0.append(i.X6, 38);
            f3836q0.append(i.J6, 37);
            f3836q0.append(i.I6, 39);
            f3836q0.append(i.W6, 40);
            f3836q0.append(i.H6, 20);
            f3836q0.append(i.V6, 36);
            f3836q0.append(i.f4189z6, 5);
            f3836q0.append(i.K6, 91);
            f3836q0.append(i.S6, 91);
            f3836q0.append(i.N6, 91);
            f3836q0.append(i.f4129t6, 91);
            f3836q0.append(i.f4109r6, 91);
            f3836q0.append(i.f3968d6, 23);
            f3836q0.append(i.f3989f6, 27);
            f3836q0.append(i.f4009h6, 30);
            f3836q0.append(i.f4019i6, 8);
            f3836q0.append(i.f3979e6, 33);
            f3836q0.append(i.f3999g6, 2);
            f3836q0.append(i.f3946b6, 22);
            f3836q0.append(i.f3957c6, 21);
            f3836q0.append(i.Y6, 41);
            f3836q0.append(i.F6, 42);
            f3836q0.append(i.f4099q6, 41);
            f3836q0.append(i.f4089p6, 42);
            f3836q0.append(i.f4020i7, 76);
            f3836q0.append(i.f4159w6, 61);
            f3836q0.append(i.f4179y6, 62);
            f3836q0.append(i.f4169x6, 63);
            f3836q0.append(i.Z6, 69);
            f3836q0.append(i.G6, 70);
            f3836q0.append(i.f4059m6, 71);
            f3836q0.append(i.f4039k6, 72);
            f3836q0.append(i.f4049l6, 73);
            f3836q0.append(i.f4069n6, 74);
            f3836q0.append(i.f4029j6, 75);
        }

        public void a(b bVar) {
            this.f3837a = bVar.f3837a;
            this.f3841c = bVar.f3841c;
            this.f3839b = bVar.f3839b;
            this.f3843d = bVar.f3843d;
            this.f3845e = bVar.f3845e;
            this.f3847f = bVar.f3847f;
            this.f3849g = bVar.f3849g;
            this.f3851h = bVar.f3851h;
            this.f3853i = bVar.f3853i;
            this.f3855j = bVar.f3855j;
            this.f3857k = bVar.f3857k;
            this.f3859l = bVar.f3859l;
            this.f3861m = bVar.f3861m;
            this.f3863n = bVar.f3863n;
            this.f3865o = bVar.f3865o;
            this.f3867p = bVar.f3867p;
            this.f3869q = bVar.f3869q;
            this.f3870r = bVar.f3870r;
            this.f3871s = bVar.f3871s;
            this.f3872t = bVar.f3872t;
            this.f3873u = bVar.f3873u;
            this.f3874v = bVar.f3874v;
            this.f3875w = bVar.f3875w;
            this.f3876x = bVar.f3876x;
            this.f3877y = bVar.f3877y;
            this.f3878z = bVar.f3878z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f3838a0 = bVar.f3838a0;
            this.f3840b0 = bVar.f3840b0;
            this.f3842c0 = bVar.f3842c0;
            this.f3844d0 = bVar.f3844d0;
            this.f3846e0 = bVar.f3846e0;
            this.f3848f0 = bVar.f3848f0;
            this.f3850g0 = bVar.f3850g0;
            this.f3852h0 = bVar.f3852h0;
            this.f3854i0 = bVar.f3854i0;
            this.f3860l0 = bVar.f3860l0;
            int[] iArr = bVar.f3856j0;
            if (iArr != null && bVar.f3858k0 == null) {
                this.f3856j0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f3856j0 = null;
            }
            this.f3858k0 = bVar.f3858k0;
            this.f3862m0 = bVar.f3862m0;
            this.f3864n0 = bVar.f3864n0;
            this.f3866o0 = bVar.f3866o0;
            this.f3868p0 = bVar.f3868p0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.Z5);
            this.f3839b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                int i12 = f3836q0.get(index);
                switch (i12) {
                    case 1:
                        this.f3869q = d.x(obtainStyledAttributes, index, this.f3869q);
                        break;
                    case 2:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        this.f3867p = d.x(obtainStyledAttributes, index, this.f3867p);
                        break;
                    case 4:
                        this.f3865o = d.x(obtainStyledAttributes, index, this.f3865o);
                        break;
                    case 5:
                        this.f3878z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        if (Build.VERSION.SDK_INT >= 17) {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        this.f3875w = d.x(obtainStyledAttributes, index, this.f3875w);
                        break;
                    case 10:
                        this.f3874v = d.x(obtainStyledAttributes, index, this.f3874v);
                        break;
                    case 11:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.f3845e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3845e);
                        break;
                    case 18:
                        this.f3847f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3847f);
                        break;
                    case 19:
                        this.f3849g = obtainStyledAttributes.getFloat(index, this.f3849g);
                        break;
                    case 20:
                        this.f3876x = obtainStyledAttributes.getFloat(index, this.f3876x);
                        break;
                    case 21:
                        this.f3843d = obtainStyledAttributes.getLayoutDimension(index, this.f3843d);
                        break;
                    case 22:
                        this.f3841c = obtainStyledAttributes.getLayoutDimension(index, this.f3841c);
                        break;
                    case 23:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        this.f3853i = d.x(obtainStyledAttributes, index, this.f3853i);
                        break;
                    case 25:
                        this.f3855j = d.x(obtainStyledAttributes, index, this.f3855j);
                        break;
                    case 26:
                        this.F = obtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        this.f3857k = d.x(obtainStyledAttributes, index, this.f3857k);
                        break;
                    case 29:
                        this.f3859l = d.x(obtainStyledAttributes, index, this.f3859l);
                        break;
                    case 30:
                        if (Build.VERSION.SDK_INT >= 17) {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        } else {
                            break;
                        }
                    case 31:
                        this.f3872t = d.x(obtainStyledAttributes, index, this.f3872t);
                        break;
                    case 32:
                        this.f3873u = d.x(obtainStyledAttributes, index, this.f3873u);
                        break;
                    case 33:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 34:
                        this.f3863n = d.x(obtainStyledAttributes, index, this.f3863n);
                        break;
                    case 35:
                        this.f3861m = d.x(obtainStyledAttributes, index, this.f3861m);
                        break;
                    case 36:
                        this.f3877y = obtainStyledAttributes.getFloat(index, this.f3877y);
                        break;
                    case 37:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 39:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 40:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 41:
                        d.y(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.y(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i12) {
                            case 61:
                                this.A = d.x(obtainStyledAttributes, index, this.A);
                                continue;
                            case 62:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                continue;
                            case 63:
                                this.C = obtainStyledAttributes.getFloat(index, this.C);
                                continue;
                            default:
                                switch (i12) {
                                    case 69:
                                        this.f3846e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.f3848f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.f3850g0 = obtainStyledAttributes.getInt(index, this.f3850g0);
                                        continue;
                                    case 73:
                                        this.f3852h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3852h0);
                                        continue;
                                    case 74:
                                        this.f3858k0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.f3866o0 = obtainStyledAttributes.getBoolean(index, this.f3866o0);
                                        continue;
                                    case 76:
                                        this.f3868p0 = obtainStyledAttributes.getInt(index, this.f3868p0);
                                        continue;
                                    case 77:
                                        this.f3870r = d.x(obtainStyledAttributes, index, this.f3870r);
                                        continue;
                                    case 78:
                                        this.f3871s = d.x(obtainStyledAttributes, index, this.f3871s);
                                        continue;
                                    case 79:
                                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        continue;
                                    case 80:
                                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        continue;
                                    case 81:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        continue;
                                    case 82:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 83:
                                        this.f3840b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3840b0);
                                        continue;
                                    case 84:
                                        this.f3838a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3838a0);
                                        continue;
                                    case 85:
                                        this.f3844d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3844d0);
                                        continue;
                                    case 86:
                                        this.f3842c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3842c0);
                                        continue;
                                    case 87:
                                        this.f3862m0 = obtainStyledAttributes.getBoolean(index, this.f3862m0);
                                        continue;
                                    case 88:
                                        this.f3864n0 = obtainStyledAttributes.getBoolean(index, this.f3864n0);
                                        continue;
                                    case 89:
                                        this.f3860l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f3851h = obtainStyledAttributes.getBoolean(index, this.f3851h);
                                        continue;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f3836q0.get(index));
                                        continue;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f3836q0.get(index));
                                        continue;
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f3879o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3880a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f3881b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f3882c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f3883d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f3884e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f3885f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f3886g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f3887h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f3888i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public float f3889j = Float.NaN;

        /* renamed from: k  reason: collision with root package name */
        public int f3890k = -1;

        /* renamed from: l  reason: collision with root package name */
        public String f3891l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f3892m = -3;

        /* renamed from: n  reason: collision with root package name */
        public int f3893n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3879o = sparseIntArray;
            sparseIntArray.append(i.f4070n7, 1);
            f3879o.append(i.f4090p7, 2);
            f3879o.append(i.f4130t7, 3);
            f3879o.append(i.f4060m7, 4);
            f3879o.append(i.f4050l7, 5);
            f3879o.append(i.f4040k7, 6);
            f3879o.append(i.f4080o7, 7);
            f3879o.append(i.f4120s7, 8);
            f3879o.append(i.f4110r7, 9);
            f3879o.append(i.f4100q7, 10);
        }

        public void a(c cVar) {
            this.f3880a = cVar.f3880a;
            this.f3881b = cVar.f3881b;
            this.f3883d = cVar.f3883d;
            this.f3884e = cVar.f3884e;
            this.f3885f = cVar.f3885f;
            this.f3888i = cVar.f3888i;
            this.f3886g = cVar.f3886g;
            this.f3887h = cVar.f3887h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f4030j7);
            this.f3880a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                switch (f3879o.get(index)) {
                    case 1:
                        this.f3888i = obtainStyledAttributes.getFloat(index, this.f3888i);
                        break;
                    case 2:
                        this.f3884e = obtainStyledAttributes.getInt(index, this.f3884e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f3883d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f3883d = c3.c.f8792c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f3885f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f3881b = d.x(obtainStyledAttributes, index, this.f3881b);
                        break;
                    case 6:
                        this.f3882c = obtainStyledAttributes.getInteger(index, this.f3882c);
                        break;
                    case 7:
                        this.f3886g = obtainStyledAttributes.getFloat(index, this.f3886g);
                        break;
                    case 8:
                        this.f3890k = obtainStyledAttributes.getInteger(index, this.f3890k);
                        break;
                    case 9:
                        this.f3889j = obtainStyledAttributes.getFloat(index, this.f3889j);
                        break;
                    case 10:
                        int i12 = obtainStyledAttributes.peekValue(index).type;
                        if (i12 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f3893n = resourceId;
                            if (resourceId != -1) {
                                this.f3892m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i12 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f3891l = string;
                            if (string.indexOf("/") > 0) {
                                this.f3893n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f3892m = -2;
                                break;
                            } else {
                                this.f3892m = -1;
                                break;
                            }
                        } else {
                            this.f3892m = obtainStyledAttributes.getInteger(index, this.f3893n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0067d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3894a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f3895b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f3896c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f3897d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f3898e = Float.NaN;

        public void a(C0067d c0067d) {
            this.f3894a = c0067d.f3894a;
            this.f3895b = c0067d.f3895b;
            this.f3897d = c0067d.f3897d;
            this.f3898e = c0067d.f3898e;
            this.f3896c = c0067d.f3896c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.X7);
            this.f3894a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == i.Z7) {
                    this.f3897d = obtainStyledAttributes.getFloat(index, this.f3897d);
                } else if (index == i.Y7) {
                    this.f3895b = obtainStyledAttributes.getInt(index, this.f3895b);
                    this.f3895b = d.f3808f[this.f3895b];
                } else if (index == i.f3948b8) {
                    this.f3896c = obtainStyledAttributes.getInt(index, this.f3896c);
                } else if (index == i.f3937a8) {
                    this.f3898e = obtainStyledAttributes.getFloat(index, this.f3898e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f3899o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3900a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f3901b = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: c  reason: collision with root package name */
        public float f3902c = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: d  reason: collision with root package name */
        public float f3903d = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: e  reason: collision with root package name */
        public float f3904e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f3905f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f3906g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f3907h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f3908i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f3909j = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: k  reason: collision with root package name */
        public float f3910k = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: l  reason: collision with root package name */
        public float f3911l = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: m  reason: collision with root package name */
        public boolean f3912m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f3913n = BitmapDescriptorFactory.HUE_RED;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3899o = sparseIntArray;
            sparseIntArray.append(i.f4081o8, 1);
            f3899o.append(i.f4091p8, 2);
            f3899o.append(i.f4101q8, 3);
            f3899o.append(i.f4061m8, 4);
            f3899o.append(i.f4071n8, 5);
            f3899o.append(i.f4021i8, 6);
            f3899o.append(i.f4031j8, 7);
            f3899o.append(i.f4041k8, 8);
            f3899o.append(i.f4051l8, 9);
            f3899o.append(i.f4111r8, 10);
            f3899o.append(i.f4121s8, 11);
            f3899o.append(i.f4131t8, 12);
        }

        public void a(e eVar) {
            this.f3900a = eVar.f3900a;
            this.f3901b = eVar.f3901b;
            this.f3902c = eVar.f3902c;
            this.f3903d = eVar.f3903d;
            this.f3904e = eVar.f3904e;
            this.f3905f = eVar.f3905f;
            this.f3906g = eVar.f3906g;
            this.f3907h = eVar.f3907h;
            this.f3908i = eVar.f3908i;
            this.f3909j = eVar.f3909j;
            this.f3910k = eVar.f3910k;
            this.f3911l = eVar.f3911l;
            this.f3912m = eVar.f3912m;
            this.f3913n = eVar.f3913n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f4011h8);
            this.f3900a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                switch (f3899o.get(index)) {
                    case 1:
                        this.f3901b = obtainStyledAttributes.getFloat(index, this.f3901b);
                        break;
                    case 2:
                        this.f3902c = obtainStyledAttributes.getFloat(index, this.f3902c);
                        break;
                    case 3:
                        this.f3903d = obtainStyledAttributes.getFloat(index, this.f3903d);
                        break;
                    case 4:
                        this.f3904e = obtainStyledAttributes.getFloat(index, this.f3904e);
                        break;
                    case 5:
                        this.f3905f = obtainStyledAttributes.getFloat(index, this.f3905f);
                        break;
                    case 6:
                        this.f3906g = obtainStyledAttributes.getDimension(index, this.f3906g);
                        break;
                    case 7:
                        this.f3907h = obtainStyledAttributes.getDimension(index, this.f3907h);
                        break;
                    case 8:
                        this.f3909j = obtainStyledAttributes.getDimension(index, this.f3909j);
                        break;
                    case 9:
                        this.f3910k = obtainStyledAttributes.getDimension(index, this.f3910k);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f3911l = obtainStyledAttributes.getDimension(index, this.f3911l);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f3912m = true;
                            this.f3913n = obtainStyledAttributes.getDimension(index, this.f3913n);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        this.f3908i = d.x(obtainStyledAttributes, index, this.f3908i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f3809g.append(i.f4003h0, 25);
        f3809g.append(i.f4013i0, 26);
        f3809g.append(i.f4033k0, 29);
        f3809g.append(i.f4043l0, 30);
        f3809g.append(i.f4103r0, 36);
        f3809g.append(i.f4093q0, 35);
        f3809g.append(i.O, 4);
        f3809g.append(i.N, 3);
        f3809g.append(i.J, 1);
        f3809g.append(i.L, 91);
        f3809g.append(i.K, 92);
        f3809g.append(i.A0, 6);
        f3809g.append(i.B0, 7);
        f3809g.append(i.V, 17);
        f3809g.append(i.W, 18);
        f3809g.append(i.X, 19);
        f3809g.append(i.F, 99);
        f3809g.append(i.f3939b, 27);
        f3809g.append(i.f4053m0, 32);
        f3809g.append(i.f4063n0, 33);
        f3809g.append(i.U, 10);
        f3809g.append(i.T, 9);
        f3809g.append(i.E0, 13);
        f3809g.append(i.H0, 16);
        f3809g.append(i.F0, 14);
        f3809g.append(i.C0, 11);
        f3809g.append(i.G0, 15);
        f3809g.append(i.D0, 12);
        f3809g.append(i.f4133u0, 40);
        f3809g.append(i.f3983f0, 39);
        f3809g.append(i.f3973e0, 41);
        f3809g.append(i.f4123t0, 42);
        f3809g.append(i.f3962d0, 20);
        f3809g.append(i.f4113s0, 37);
        f3809g.append(i.S, 5);
        f3809g.append(i.f3993g0, 87);
        f3809g.append(i.f4083p0, 87);
        f3809g.append(i.f4023j0, 87);
        f3809g.append(i.M, 87);
        f3809g.append(i.I, 87);
        f3809g.append(i.f3992g, 24);
        f3809g.append(i.f4012i, 28);
        f3809g.append(i.f4132u, 31);
        f3809g.append(i.f4142v, 8);
        f3809g.append(i.f4002h, 34);
        f3809g.append(i.f4022j, 2);
        f3809g.append(i.f3972e, 23);
        f3809g.append(i.f3982f, 21);
        f3809g.append(i.f4143v0, 95);
        f3809g.append(i.Y, 96);
        f3809g.append(i.f3961d, 22);
        f3809g.append(i.f4032k, 43);
        f3809g.append(i.f4162x, 44);
        f3809g.append(i.f4112s, 45);
        f3809g.append(i.f4122t, 46);
        f3809g.append(i.f4102r, 60);
        f3809g.append(i.f4082p, 47);
        f3809g.append(i.f4092q, 48);
        f3809g.append(i.f4042l, 49);
        f3809g.append(i.f4052m, 50);
        f3809g.append(i.f4062n, 51);
        f3809g.append(i.f4072o, 52);
        f3809g.append(i.f4152w, 53);
        f3809g.append(i.f4153w0, 54);
        f3809g.append(i.Z, 55);
        f3809g.append(i.f4163x0, 56);
        f3809g.append(i.f3929a0, 57);
        f3809g.append(i.f4173y0, 58);
        f3809g.append(i.f3940b0, 59);
        f3809g.append(i.P, 61);
        f3809g.append(i.R, 62);
        f3809g.append(i.Q, 63);
        f3809g.append(i.f4172y, 64);
        f3809g.append(i.R0, 65);
        f3809g.append(i.E, 66);
        f3809g.append(i.S0, 67);
        f3809g.append(i.K0, 79);
        f3809g.append(i.f3950c, 38);
        f3809g.append(i.J0, 68);
        f3809g.append(i.f4183z0, 69);
        f3809g.append(i.f3951c0, 70);
        f3809g.append(i.I0, 97);
        f3809g.append(i.C, 71);
        f3809g.append(i.A, 72);
        f3809g.append(i.B, 73);
        f3809g.append(i.D, 74);
        f3809g.append(i.f4182z, 75);
        f3809g.append(i.L0, 76);
        f3809g.append(i.f4073o0, 77);
        f3809g.append(i.T0, 78);
        f3809g.append(i.H, 80);
        f3809g.append(i.G, 81);
        f3809g.append(i.M0, 82);
        f3809g.append(i.Q0, 83);
        f3809g.append(i.P0, 84);
        f3809g.append(i.O0, 85);
        f3809g.append(i.N0, 86);
        SparseIntArray sparseIntArray = f3810h;
        int i11 = i.f4156w3;
        sparseIntArray.append(i11, 6);
        f3810h.append(i11, 7);
        f3810h.append(i.f4105r2, 27);
        f3810h.append(i.f4186z3, 13);
        f3810h.append(i.C3, 16);
        f3810h.append(i.A3, 14);
        f3810h.append(i.f4166x3, 11);
        f3810h.append(i.B3, 15);
        f3810h.append(i.f4176y3, 12);
        f3810h.append(i.f4096q3, 40);
        f3810h.append(i.f4026j3, 39);
        f3810h.append(i.f4016i3, 41);
        f3810h.append(i.f4086p3, 42);
        f3810h.append(i.f4006h3, 20);
        f3810h.append(i.f4076o3, 37);
        f3810h.append(i.f3943b3, 5);
        f3810h.append(i.f4036k3, 87);
        f3810h.append(i.f4066n3, 87);
        f3810h.append(i.f4046l3, 87);
        f3810h.append(i.Y2, 87);
        f3810h.append(i.X2, 87);
        f3810h.append(i.f4155w2, 24);
        f3810h.append(i.f4175y2, 28);
        f3810h.append(i.K2, 31);
        f3810h.append(i.L2, 8);
        f3810h.append(i.f4165x2, 34);
        f3810h.append(i.f4185z2, 2);
        f3810h.append(i.f4135u2, 23);
        f3810h.append(i.f4145v2, 21);
        f3810h.append(i.f4106r3, 95);
        f3810h.append(i.f3954c3, 96);
        f3810h.append(i.f4125t2, 22);
        f3810h.append(i.A2, 43);
        f3810h.append(i.N2, 44);
        f3810h.append(i.I2, 45);
        f3810h.append(i.J2, 46);
        f3810h.append(i.H2, 60);
        f3810h.append(i.F2, 47);
        f3810h.append(i.G2, 48);
        f3810h.append(i.B2, 49);
        f3810h.append(i.C2, 50);
        f3810h.append(i.D2, 51);
        f3810h.append(i.E2, 52);
        f3810h.append(i.M2, 53);
        f3810h.append(i.f4116s3, 54);
        f3810h.append(i.f3965d3, 55);
        f3810h.append(i.f4126t3, 56);
        f3810h.append(i.f3976e3, 57);
        f3810h.append(i.f4136u3, 58);
        f3810h.append(i.f3986f3, 59);
        f3810h.append(i.f3932a3, 62);
        f3810h.append(i.Z2, 63);
        f3810h.append(i.O2, 64);
        f3810h.append(i.N3, 65);
        f3810h.append(i.U2, 66);
        f3810h.append(i.O3, 67);
        f3810h.append(i.F3, 79);
        f3810h.append(i.f4115s2, 38);
        f3810h.append(i.G3, 98);
        f3810h.append(i.E3, 68);
        f3810h.append(i.f4146v3, 69);
        f3810h.append(i.f3996g3, 70);
        f3810h.append(i.S2, 71);
        f3810h.append(i.Q2, 72);
        f3810h.append(i.R2, 73);
        f3810h.append(i.T2, 74);
        f3810h.append(i.P2, 75);
        f3810h.append(i.H3, 76);
        f3810h.append(i.f4056m3, 77);
        f3810h.append(i.P3, 78);
        f3810h.append(i.W2, 80);
        f3810h.append(i.V2, 81);
        f3810h.append(i.I3, 82);
        f3810h.append(i.M3, 83);
        f3810h.append(i.L3, 84);
        f3810h.append(i.K3, 85);
        f3810h.append(i.J3, 86);
        f3810h.append(i.D3, 97);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void A(ConstraintLayout.b bVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i11 = 0;
            int i12 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i11 = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i12 = i11;
                i11 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i11, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > BitmapDescriptorFactory.HUE_RED && parseFloat2 > BitmapDescriptorFactory.HUE_RED) {
                            if (i12 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i11);
                    if (substring4.length() > 0) {
                        Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.G = str;
    }

    private void B(Context context, a aVar, TypedArray typedArray, boolean z11) {
        if (z11) {
            C(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArray.getIndex(i11);
            if (index != i.f3950c && i.f4132u != index && i.f4142v != index) {
                aVar.f3819d.f3880a = true;
                aVar.f3820e.f3839b = true;
                aVar.f3818c.f3894a = true;
                aVar.f3821f.f3900a = true;
            }
            switch (f3809g.get(index)) {
                case 1:
                    b bVar = aVar.f3820e;
                    bVar.f3869q = x(typedArray, index, bVar.f3869q);
                    break;
                case 2:
                    b bVar2 = aVar.f3820e;
                    bVar2.J = typedArray.getDimensionPixelSize(index, bVar2.J);
                    break;
                case 3:
                    b bVar3 = aVar.f3820e;
                    bVar3.f3867p = x(typedArray, index, bVar3.f3867p);
                    break;
                case 4:
                    b bVar4 = aVar.f3820e;
                    bVar4.f3865o = x(typedArray, index, bVar4.f3865o);
                    break;
                case 5:
                    aVar.f3820e.f3878z = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f3820e;
                    bVar5.D = typedArray.getDimensionPixelOffset(index, bVar5.D);
                    break;
                case 7:
                    b bVar6 = aVar.f3820e;
                    bVar6.E = typedArray.getDimensionPixelOffset(index, bVar6.E);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar7 = aVar.f3820e;
                        bVar7.K = typedArray.getDimensionPixelSize(index, bVar7.K);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    b bVar8 = aVar.f3820e;
                    bVar8.f3875w = x(typedArray, index, bVar8.f3875w);
                    break;
                case 10:
                    b bVar9 = aVar.f3820e;
                    bVar9.f3874v = x(typedArray, index, bVar9.f3874v);
                    break;
                case 11:
                    b bVar10 = aVar.f3820e;
                    bVar10.Q = typedArray.getDimensionPixelSize(index, bVar10.Q);
                    break;
                case 12:
                    b bVar11 = aVar.f3820e;
                    bVar11.R = typedArray.getDimensionPixelSize(index, bVar11.R);
                    break;
                case 13:
                    b bVar12 = aVar.f3820e;
                    bVar12.N = typedArray.getDimensionPixelSize(index, bVar12.N);
                    break;
                case 14:
                    b bVar13 = aVar.f3820e;
                    bVar13.P = typedArray.getDimensionPixelSize(index, bVar13.P);
                    break;
                case 15:
                    b bVar14 = aVar.f3820e;
                    bVar14.S = typedArray.getDimensionPixelSize(index, bVar14.S);
                    break;
                case 16:
                    b bVar15 = aVar.f3820e;
                    bVar15.O = typedArray.getDimensionPixelSize(index, bVar15.O);
                    break;
                case 17:
                    b bVar16 = aVar.f3820e;
                    bVar16.f3845e = typedArray.getDimensionPixelOffset(index, bVar16.f3845e);
                    break;
                case 18:
                    b bVar17 = aVar.f3820e;
                    bVar17.f3847f = typedArray.getDimensionPixelOffset(index, bVar17.f3847f);
                    break;
                case 19:
                    b bVar18 = aVar.f3820e;
                    bVar18.f3849g = typedArray.getFloat(index, bVar18.f3849g);
                    break;
                case 20:
                    b bVar19 = aVar.f3820e;
                    bVar19.f3876x = typedArray.getFloat(index, bVar19.f3876x);
                    break;
                case 21:
                    b bVar20 = aVar.f3820e;
                    bVar20.f3843d = typedArray.getLayoutDimension(index, bVar20.f3843d);
                    break;
                case 22:
                    C0067d c0067d = aVar.f3818c;
                    c0067d.f3895b = typedArray.getInt(index, c0067d.f3895b);
                    C0067d c0067d2 = aVar.f3818c;
                    c0067d2.f3895b = f3808f[c0067d2.f3895b];
                    break;
                case 23:
                    b bVar21 = aVar.f3820e;
                    bVar21.f3841c = typedArray.getLayoutDimension(index, bVar21.f3841c);
                    break;
                case 24:
                    b bVar22 = aVar.f3820e;
                    bVar22.G = typedArray.getDimensionPixelSize(index, bVar22.G);
                    break;
                case 25:
                    b bVar23 = aVar.f3820e;
                    bVar23.f3853i = x(typedArray, index, bVar23.f3853i);
                    break;
                case 26:
                    b bVar24 = aVar.f3820e;
                    bVar24.f3855j = x(typedArray, index, bVar24.f3855j);
                    break;
                case 27:
                    b bVar25 = aVar.f3820e;
                    bVar25.F = typedArray.getInt(index, bVar25.F);
                    break;
                case 28:
                    b bVar26 = aVar.f3820e;
                    bVar26.H = typedArray.getDimensionPixelSize(index, bVar26.H);
                    break;
                case 29:
                    b bVar27 = aVar.f3820e;
                    bVar27.f3857k = x(typedArray, index, bVar27.f3857k);
                    break;
                case 30:
                    b bVar28 = aVar.f3820e;
                    bVar28.f3859l = x(typedArray, index, bVar28.f3859l);
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar29 = aVar.f3820e;
                        bVar29.L = typedArray.getDimensionPixelSize(index, bVar29.L);
                        break;
                    } else {
                        break;
                    }
                case 32:
                    b bVar30 = aVar.f3820e;
                    bVar30.f3872t = x(typedArray, index, bVar30.f3872t);
                    break;
                case 33:
                    b bVar31 = aVar.f3820e;
                    bVar31.f3873u = x(typedArray, index, bVar31.f3873u);
                    break;
                case 34:
                    b bVar32 = aVar.f3820e;
                    bVar32.I = typedArray.getDimensionPixelSize(index, bVar32.I);
                    break;
                case 35:
                    b bVar33 = aVar.f3820e;
                    bVar33.f3863n = x(typedArray, index, bVar33.f3863n);
                    break;
                case 36:
                    b bVar34 = aVar.f3820e;
                    bVar34.f3861m = x(typedArray, index, bVar34.f3861m);
                    break;
                case 37:
                    b bVar35 = aVar.f3820e;
                    bVar35.f3877y = typedArray.getFloat(index, bVar35.f3877y);
                    break;
                case 38:
                    aVar.f3816a = typedArray.getResourceId(index, aVar.f3816a);
                    break;
                case 39:
                    b bVar36 = aVar.f3820e;
                    bVar36.V = typedArray.getFloat(index, bVar36.V);
                    break;
                case 40:
                    b bVar37 = aVar.f3820e;
                    bVar37.U = typedArray.getFloat(index, bVar37.U);
                    break;
                case 41:
                    b bVar38 = aVar.f3820e;
                    bVar38.W = typedArray.getInt(index, bVar38.W);
                    break;
                case 42:
                    b bVar39 = aVar.f3820e;
                    bVar39.X = typedArray.getInt(index, bVar39.X);
                    break;
                case 43:
                    C0067d c0067d3 = aVar.f3818c;
                    c0067d3.f3897d = typedArray.getFloat(index, c0067d3.f3897d);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar = aVar.f3821f;
                        eVar.f3912m = true;
                        eVar.f3913n = typedArray.getDimension(index, eVar.f3913n);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    e eVar2 = aVar.f3821f;
                    eVar2.f3902c = typedArray.getFloat(index, eVar2.f3902c);
                    break;
                case 46:
                    e eVar3 = aVar.f3821f;
                    eVar3.f3903d = typedArray.getFloat(index, eVar3.f3903d);
                    break;
                case 47:
                    e eVar4 = aVar.f3821f;
                    eVar4.f3904e = typedArray.getFloat(index, eVar4.f3904e);
                    break;
                case 48:
                    e eVar5 = aVar.f3821f;
                    eVar5.f3905f = typedArray.getFloat(index, eVar5.f3905f);
                    break;
                case 49:
                    e eVar6 = aVar.f3821f;
                    eVar6.f3906g = typedArray.getDimension(index, eVar6.f3906g);
                    break;
                case 50:
                    e eVar7 = aVar.f3821f;
                    eVar7.f3907h = typedArray.getDimension(index, eVar7.f3907h);
                    break;
                case 51:
                    e eVar8 = aVar.f3821f;
                    eVar8.f3909j = typedArray.getDimension(index, eVar8.f3909j);
                    break;
                case 52:
                    e eVar9 = aVar.f3821f;
                    eVar9.f3910k = typedArray.getDimension(index, eVar9.f3910k);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar10 = aVar.f3821f;
                        eVar10.f3911l = typedArray.getDimension(index, eVar10.f3911l);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    b bVar40 = aVar.f3820e;
                    bVar40.Y = typedArray.getInt(index, bVar40.Y);
                    break;
                case 55:
                    b bVar41 = aVar.f3820e;
                    bVar41.Z = typedArray.getInt(index, bVar41.Z);
                    break;
                case 56:
                    b bVar42 = aVar.f3820e;
                    bVar42.f3838a0 = typedArray.getDimensionPixelSize(index, bVar42.f3838a0);
                    break;
                case 57:
                    b bVar43 = aVar.f3820e;
                    bVar43.f3840b0 = typedArray.getDimensionPixelSize(index, bVar43.f3840b0);
                    break;
                case 58:
                    b bVar44 = aVar.f3820e;
                    bVar44.f3842c0 = typedArray.getDimensionPixelSize(index, bVar44.f3842c0);
                    break;
                case 59:
                    b bVar45 = aVar.f3820e;
                    bVar45.f3844d0 = typedArray.getDimensionPixelSize(index, bVar45.f3844d0);
                    break;
                case 60:
                    e eVar11 = aVar.f3821f;
                    eVar11.f3901b = typedArray.getFloat(index, eVar11.f3901b);
                    break;
                case 61:
                    b bVar46 = aVar.f3820e;
                    bVar46.A = x(typedArray, index, bVar46.A);
                    break;
                case 62:
                    b bVar47 = aVar.f3820e;
                    bVar47.B = typedArray.getDimensionPixelSize(index, bVar47.B);
                    break;
                case 63:
                    b bVar48 = aVar.f3820e;
                    bVar48.C = typedArray.getFloat(index, bVar48.C);
                    break;
                case 64:
                    c cVar = aVar.f3819d;
                    cVar.f3881b = x(typedArray, index, cVar.f3881b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f3819d.f3883d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f3819d.f3883d = c3.c.f8792c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f3819d.f3885f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f3819d;
                    cVar2.f3888i = typedArray.getFloat(index, cVar2.f3888i);
                    break;
                case 68:
                    C0067d c0067d4 = aVar.f3818c;
                    c0067d4.f3898e = typedArray.getFloat(index, c0067d4.f3898e);
                    break;
                case 69:
                    aVar.f3820e.f3846e0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f3820e.f3848f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f3820e;
                    bVar49.f3850g0 = typedArray.getInt(index, bVar49.f3850g0);
                    break;
                case 73:
                    b bVar50 = aVar.f3820e;
                    bVar50.f3852h0 = typedArray.getDimensionPixelSize(index, bVar50.f3852h0);
                    break;
                case 74:
                    aVar.f3820e.f3858k0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f3820e;
                    bVar51.f3866o0 = typedArray.getBoolean(index, bVar51.f3866o0);
                    break;
                case 76:
                    c cVar3 = aVar.f3819d;
                    cVar3.f3884e = typedArray.getInt(index, cVar3.f3884e);
                    break;
                case 77:
                    aVar.f3820e.f3860l0 = typedArray.getString(index);
                    break;
                case 78:
                    C0067d c0067d5 = aVar.f3818c;
                    c0067d5.f3896c = typedArray.getInt(index, c0067d5.f3896c);
                    break;
                case 79:
                    c cVar4 = aVar.f3819d;
                    cVar4.f3886g = typedArray.getFloat(index, cVar4.f3886g);
                    break;
                case 80:
                    b bVar52 = aVar.f3820e;
                    bVar52.f3862m0 = typedArray.getBoolean(index, bVar52.f3862m0);
                    break;
                case 81:
                    b bVar53 = aVar.f3820e;
                    bVar53.f3864n0 = typedArray.getBoolean(index, bVar53.f3864n0);
                    break;
                case 82:
                    c cVar5 = aVar.f3819d;
                    cVar5.f3882c = typedArray.getInteger(index, cVar5.f3882c);
                    break;
                case 83:
                    e eVar12 = aVar.f3821f;
                    eVar12.f3908i = x(typedArray, index, eVar12.f3908i);
                    break;
                case 84:
                    c cVar6 = aVar.f3819d;
                    cVar6.f3890k = typedArray.getInteger(index, cVar6.f3890k);
                    break;
                case 85:
                    c cVar7 = aVar.f3819d;
                    cVar7.f3889j = typedArray.getFloat(index, cVar7.f3889j);
                    break;
                case 86:
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 == 1) {
                        aVar.f3819d.f3893n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f3819d;
                        if (cVar8.f3893n != -1) {
                            cVar8.f3892m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i12 == 3) {
                        aVar.f3819d.f3891l = typedArray.getString(index);
                        if (aVar.f3819d.f3891l.indexOf("/") > 0) {
                            aVar.f3819d.f3893n = typedArray.getResourceId(index, -1);
                            aVar.f3819d.f3892m = -2;
                            break;
                        } else {
                            aVar.f3819d.f3892m = -1;
                            break;
                        }
                    } else {
                        c cVar9 = aVar.f3819d;
                        cVar9.f3892m = typedArray.getInteger(index, cVar9.f3893n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f3809g.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f3809g.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f3820e;
                    bVar54.f3870r = x(typedArray, index, bVar54.f3870r);
                    break;
                case 92:
                    b bVar55 = aVar.f3820e;
                    bVar55.f3871s = x(typedArray, index, bVar55.f3871s);
                    break;
                case 93:
                    b bVar56 = aVar.f3820e;
                    bVar56.M = typedArray.getDimensionPixelSize(index, bVar56.M);
                    break;
                case 94:
                    b bVar57 = aVar.f3820e;
                    bVar57.T = typedArray.getDimensionPixelSize(index, bVar57.T);
                    break;
                case 95:
                    y(aVar.f3820e, typedArray, index, 0);
                    break;
                case 96:
                    y(aVar.f3820e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f3820e;
                    bVar58.f3868p0 = typedArray.getInt(index, bVar58.f3868p0);
                    break;
            }
        }
        b bVar59 = aVar.f3820e;
        if (bVar59.f3858k0 != null) {
            bVar59.f3856j0 = null;
        }
    }

    private static void C(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0066a c0066a = new a.C0066a();
        aVar.f3823h = c0066a;
        aVar.f3819d.f3880a = false;
        aVar.f3820e.f3839b = false;
        aVar.f3818c.f3894a = false;
        aVar.f3821f.f3900a = false;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArray.getIndex(i11);
            switch (f3810h.get(index)) {
                case 2:
                    c0066a.b(2, typedArray.getDimensionPixelSize(index, aVar.f3820e.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f3809g.get(index));
                    break;
                case 5:
                    c0066a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0066a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f3820e.D));
                    break;
                case 7:
                    c0066a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f3820e.E));
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        c0066a.b(8, typedArray.getDimensionPixelSize(index, aVar.f3820e.K));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    c0066a.b(11, typedArray.getDimensionPixelSize(index, aVar.f3820e.Q));
                    break;
                case 12:
                    c0066a.b(12, typedArray.getDimensionPixelSize(index, aVar.f3820e.R));
                    break;
                case 13:
                    c0066a.b(13, typedArray.getDimensionPixelSize(index, aVar.f3820e.N));
                    break;
                case 14:
                    c0066a.b(14, typedArray.getDimensionPixelSize(index, aVar.f3820e.P));
                    break;
                case 15:
                    c0066a.b(15, typedArray.getDimensionPixelSize(index, aVar.f3820e.S));
                    break;
                case 16:
                    c0066a.b(16, typedArray.getDimensionPixelSize(index, aVar.f3820e.O));
                    break;
                case 17:
                    c0066a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f3820e.f3845e));
                    break;
                case 18:
                    c0066a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f3820e.f3847f));
                    break;
                case 19:
                    c0066a.a(19, typedArray.getFloat(index, aVar.f3820e.f3849g));
                    break;
                case 20:
                    c0066a.a(20, typedArray.getFloat(index, aVar.f3820e.f3876x));
                    break;
                case 21:
                    c0066a.b(21, typedArray.getLayoutDimension(index, aVar.f3820e.f3843d));
                    break;
                case 22:
                    c0066a.b(22, f3808f[typedArray.getInt(index, aVar.f3818c.f3895b)]);
                    break;
                case 23:
                    c0066a.b(23, typedArray.getLayoutDimension(index, aVar.f3820e.f3841c));
                    break;
                case 24:
                    c0066a.b(24, typedArray.getDimensionPixelSize(index, aVar.f3820e.G));
                    break;
                case 27:
                    c0066a.b(27, typedArray.getInt(index, aVar.f3820e.F));
                    break;
                case 28:
                    c0066a.b(28, typedArray.getDimensionPixelSize(index, aVar.f3820e.H));
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        c0066a.b(31, typedArray.getDimensionPixelSize(index, aVar.f3820e.L));
                        break;
                    } else {
                        break;
                    }
                case 34:
                    c0066a.b(34, typedArray.getDimensionPixelSize(index, aVar.f3820e.I));
                    break;
                case 37:
                    c0066a.a(37, typedArray.getFloat(index, aVar.f3820e.f3877y));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f3816a);
                    aVar.f3816a = resourceId;
                    c0066a.b(38, resourceId);
                    break;
                case 39:
                    c0066a.a(39, typedArray.getFloat(index, aVar.f3820e.V));
                    break;
                case 40:
                    c0066a.a(40, typedArray.getFloat(index, aVar.f3820e.U));
                    break;
                case 41:
                    c0066a.b(41, typedArray.getInt(index, aVar.f3820e.W));
                    break;
                case 42:
                    c0066a.b(42, typedArray.getInt(index, aVar.f3820e.X));
                    break;
                case 43:
                    c0066a.a(43, typedArray.getFloat(index, aVar.f3818c.f3897d));
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        c0066a.d(44, true);
                        c0066a.a(44, typedArray.getDimension(index, aVar.f3821f.f3913n));
                        break;
                    } else {
                        break;
                    }
                case 45:
                    c0066a.a(45, typedArray.getFloat(index, aVar.f3821f.f3902c));
                    break;
                case 46:
                    c0066a.a(46, typedArray.getFloat(index, aVar.f3821f.f3903d));
                    break;
                case 47:
                    c0066a.a(47, typedArray.getFloat(index, aVar.f3821f.f3904e));
                    break;
                case 48:
                    c0066a.a(48, typedArray.getFloat(index, aVar.f3821f.f3905f));
                    break;
                case 49:
                    c0066a.a(49, typedArray.getDimension(index, aVar.f3821f.f3906g));
                    break;
                case 50:
                    c0066a.a(50, typedArray.getDimension(index, aVar.f3821f.f3907h));
                    break;
                case 51:
                    c0066a.a(51, typedArray.getDimension(index, aVar.f3821f.f3909j));
                    break;
                case 52:
                    c0066a.a(52, typedArray.getDimension(index, aVar.f3821f.f3910k));
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        c0066a.a(53, typedArray.getDimension(index, aVar.f3821f.f3911l));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    c0066a.b(54, typedArray.getInt(index, aVar.f3820e.Y));
                    break;
                case 55:
                    c0066a.b(55, typedArray.getInt(index, aVar.f3820e.Z));
                    break;
                case 56:
                    c0066a.b(56, typedArray.getDimensionPixelSize(index, aVar.f3820e.f3838a0));
                    break;
                case 57:
                    c0066a.b(57, typedArray.getDimensionPixelSize(index, aVar.f3820e.f3840b0));
                    break;
                case 58:
                    c0066a.b(58, typedArray.getDimensionPixelSize(index, aVar.f3820e.f3842c0));
                    break;
                case 59:
                    c0066a.b(59, typedArray.getDimensionPixelSize(index, aVar.f3820e.f3844d0));
                    break;
                case 60:
                    c0066a.a(60, typedArray.getFloat(index, aVar.f3821f.f3901b));
                    break;
                case 62:
                    c0066a.b(62, typedArray.getDimensionPixelSize(index, aVar.f3820e.B));
                    break;
                case 63:
                    c0066a.a(63, typedArray.getFloat(index, aVar.f3820e.C));
                    break;
                case 64:
                    c0066a.b(64, x(typedArray, index, aVar.f3819d.f3881b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0066a.c(65, typedArray.getString(index));
                        break;
                    } else {
                        c0066a.c(65, c3.c.f8792c[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0066a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0066a.a(67, typedArray.getFloat(index, aVar.f3819d.f3888i));
                    break;
                case 68:
                    c0066a.a(68, typedArray.getFloat(index, aVar.f3818c.f3898e));
                    break;
                case 69:
                    c0066a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0066a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0066a.b(72, typedArray.getInt(index, aVar.f3820e.f3850g0));
                    break;
                case 73:
                    c0066a.b(73, typedArray.getDimensionPixelSize(index, aVar.f3820e.f3852h0));
                    break;
                case 74:
                    c0066a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0066a.d(75, typedArray.getBoolean(index, aVar.f3820e.f3866o0));
                    break;
                case 76:
                    c0066a.b(76, typedArray.getInt(index, aVar.f3819d.f3884e));
                    break;
                case 77:
                    c0066a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0066a.b(78, typedArray.getInt(index, aVar.f3818c.f3896c));
                    break;
                case 79:
                    c0066a.a(79, typedArray.getFloat(index, aVar.f3819d.f3886g));
                    break;
                case 80:
                    c0066a.d(80, typedArray.getBoolean(index, aVar.f3820e.f3862m0));
                    break;
                case 81:
                    c0066a.d(81, typedArray.getBoolean(index, aVar.f3820e.f3864n0));
                    break;
                case 82:
                    c0066a.b(82, typedArray.getInteger(index, aVar.f3819d.f3882c));
                    break;
                case 83:
                    c0066a.b(83, x(typedArray, index, aVar.f3821f.f3908i));
                    break;
                case 84:
                    c0066a.b(84, typedArray.getInteger(index, aVar.f3819d.f3890k));
                    break;
                case 85:
                    c0066a.a(85, typedArray.getFloat(index, aVar.f3819d.f3889j));
                    break;
                case 86:
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 == 1) {
                        aVar.f3819d.f3893n = typedArray.getResourceId(index, -1);
                        c0066a.b(89, aVar.f3819d.f3893n);
                        c cVar = aVar.f3819d;
                        if (cVar.f3893n != -1) {
                            cVar.f3892m = -2;
                            c0066a.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i12 == 3) {
                        aVar.f3819d.f3891l = typedArray.getString(index);
                        c0066a.c(90, aVar.f3819d.f3891l);
                        if (aVar.f3819d.f3891l.indexOf("/") > 0) {
                            aVar.f3819d.f3893n = typedArray.getResourceId(index, -1);
                            c0066a.b(89, aVar.f3819d.f3893n);
                            aVar.f3819d.f3892m = -2;
                            c0066a.b(88, -2);
                            break;
                        } else {
                            aVar.f3819d.f3892m = -1;
                            c0066a.b(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = aVar.f3819d;
                        cVar2.f3892m = typedArray.getInteger(index, cVar2.f3893n);
                        c0066a.b(88, aVar.f3819d.f3892m);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f3809g.get(index));
                    break;
                case 93:
                    c0066a.b(93, typedArray.getDimensionPixelSize(index, aVar.f3820e.M));
                    break;
                case 94:
                    c0066a.b(94, typedArray.getDimensionPixelSize(index, aVar.f3820e.T));
                    break;
                case 95:
                    y(c0066a, typedArray, index, 0);
                    break;
                case 96:
                    y(c0066a, typedArray, index, 1);
                    break;
                case 97:
                    c0066a.b(97, typedArray.getInt(index, aVar.f3820e.f3868p0));
                    break;
                case 98:
                    if (p.f3510y3) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f3816a);
                        aVar.f3816a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f3817b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f3817b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f3816a = typedArray.getResourceId(index, aVar.f3816a);
                        break;
                    }
                case 99:
                    c0066a.d(99, typedArray.getBoolean(index, aVar.f3820e.f3851h));
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(a aVar, int i11, float f11) {
        if (i11 == 19) {
            aVar.f3820e.f3849g = f11;
        } else if (i11 == 20) {
            aVar.f3820e.f3876x = f11;
        } else if (i11 == 37) {
            aVar.f3820e.f3877y = f11;
        } else if (i11 == 60) {
            aVar.f3821f.f3901b = f11;
        } else if (i11 == 63) {
            aVar.f3820e.C = f11;
        } else if (i11 == 79) {
            aVar.f3819d.f3886g = f11;
        } else if (i11 == 85) {
            aVar.f3819d.f3889j = f11;
        } else if (i11 != 87) {
            if (i11 == 39) {
                aVar.f3820e.V = f11;
            } else if (i11 != 40) {
                switch (i11) {
                    case 43:
                        aVar.f3818c.f3897d = f11;
                        return;
                    case 44:
                        e eVar = aVar.f3821f;
                        eVar.f3913n = f11;
                        eVar.f3912m = true;
                        return;
                    case 45:
                        aVar.f3821f.f3902c = f11;
                        return;
                    case 46:
                        aVar.f3821f.f3903d = f11;
                        return;
                    case 47:
                        aVar.f3821f.f3904e = f11;
                        return;
                    case 48:
                        aVar.f3821f.f3905f = f11;
                        return;
                    case 49:
                        aVar.f3821f.f3906g = f11;
                        return;
                    case 50:
                        aVar.f3821f.f3907h = f11;
                        return;
                    case 51:
                        aVar.f3821f.f3909j = f11;
                        return;
                    case 52:
                        aVar.f3821f.f3910k = f11;
                        return;
                    case 53:
                        aVar.f3821f.f3911l = f11;
                        return;
                    default:
                        switch (i11) {
                            case 67:
                                aVar.f3819d.f3888i = f11;
                                return;
                            case 68:
                                aVar.f3818c.f3898e = f11;
                                return;
                            case 69:
                                aVar.f3820e.f3846e0 = f11;
                                return;
                            case 70:
                                aVar.f3820e.f3848f0 = f11;
                                return;
                            default:
                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                return;
                        }
                }
            } else {
                aVar.f3820e.U = f11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(a aVar, int i11, int i12) {
        if (i11 == 6) {
            aVar.f3820e.D = i12;
        } else if (i11 == 7) {
            aVar.f3820e.E = i12;
        } else if (i11 == 8) {
            aVar.f3820e.K = i12;
        } else if (i11 == 27) {
            aVar.f3820e.F = i12;
        } else if (i11 == 28) {
            aVar.f3820e.H = i12;
        } else if (i11 == 41) {
            aVar.f3820e.W = i12;
        } else if (i11 == 42) {
            aVar.f3820e.X = i12;
        } else if (i11 == 61) {
            aVar.f3820e.A = i12;
        } else if (i11 == 62) {
            aVar.f3820e.B = i12;
        } else if (i11 == 72) {
            aVar.f3820e.f3850g0 = i12;
        } else if (i11 != 73) {
            switch (i11) {
                case 2:
                    aVar.f3820e.J = i12;
                    return;
                case 11:
                    aVar.f3820e.Q = i12;
                    return;
                case 12:
                    aVar.f3820e.R = i12;
                    return;
                case 13:
                    aVar.f3820e.N = i12;
                    return;
                case 14:
                    aVar.f3820e.P = i12;
                    return;
                case 15:
                    aVar.f3820e.S = i12;
                    return;
                case 16:
                    aVar.f3820e.O = i12;
                    return;
                case 17:
                    aVar.f3820e.f3845e = i12;
                    return;
                case 18:
                    aVar.f3820e.f3847f = i12;
                    return;
                case 31:
                    aVar.f3820e.L = i12;
                    return;
                case 34:
                    aVar.f3820e.I = i12;
                    return;
                case 38:
                    aVar.f3816a = i12;
                    return;
                case 64:
                    aVar.f3819d.f3881b = i12;
                    return;
                case 66:
                    aVar.f3819d.f3885f = i12;
                    return;
                case 76:
                    aVar.f3819d.f3884e = i12;
                    return;
                case 78:
                    aVar.f3818c.f3896c = i12;
                    return;
                case 93:
                    aVar.f3820e.M = i12;
                    return;
                case 94:
                    aVar.f3820e.T = i12;
                    return;
                case 97:
                    aVar.f3820e.f3868p0 = i12;
                    return;
                default:
                    switch (i11) {
                        case 21:
                            aVar.f3820e.f3843d = i12;
                            return;
                        case 22:
                            aVar.f3818c.f3895b = i12;
                            return;
                        case 23:
                            aVar.f3820e.f3841c = i12;
                            return;
                        case 24:
                            aVar.f3820e.G = i12;
                            return;
                        default:
                            switch (i11) {
                                case 54:
                                    aVar.f3820e.Y = i12;
                                    return;
                                case 55:
                                    aVar.f3820e.Z = i12;
                                    return;
                                case 56:
                                    aVar.f3820e.f3838a0 = i12;
                                    return;
                                case 57:
                                    aVar.f3820e.f3840b0 = i12;
                                    return;
                                case 58:
                                    aVar.f3820e.f3842c0 = i12;
                                    return;
                                case 59:
                                    aVar.f3820e.f3844d0 = i12;
                                    return;
                                default:
                                    switch (i11) {
                                        case 82:
                                            aVar.f3819d.f3882c = i12;
                                            return;
                                        case 83:
                                            aVar.f3821f.f3908i = i12;
                                            return;
                                        case 84:
                                            aVar.f3819d.f3890k = i12;
                                            return;
                                        default:
                                            switch (i11) {
                                                case 87:
                                                    return;
                                                case 88:
                                                    aVar.f3819d.f3892m = i12;
                                                    return;
                                                case 89:
                                                    aVar.f3819d.f3893n = i12;
                                                    return;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                                    return;
                                            }
                                    }
                            }
                    }
            }
        } else {
            aVar.f3820e.f3852h0 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void H(a aVar, int i11, String str) {
        if (i11 == 5) {
            aVar.f3820e.f3878z = str;
        } else if (i11 == 65) {
            aVar.f3819d.f3883d = str;
        } else if (i11 == 74) {
            b bVar = aVar.f3820e;
            bVar.f3858k0 = str;
            bVar.f3856j0 = null;
        } else if (i11 == 77) {
            aVar.f3820e.f3860l0 = str;
        } else if (i11 != 87) {
            if (i11 != 90) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f3819d.f3891l = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(a aVar, int i11, boolean z11) {
        if (i11 == 44) {
            aVar.f3821f.f3912m = z11;
        } else if (i11 == 75) {
            aVar.f3820e.f3866o0 = z11;
        } else if (i11 != 87) {
            if (i11 == 80) {
                aVar.f3820e.f3862m0 = z11;
            } else if (i11 != 81) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f3820e.f3864n0 = z11;
            }
        }
    }

    public static a k(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, i.f4095q2);
        C(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private int[] r(View view, String str) {
        int i11;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i12 = 0;
        int i13 = 0;
        while (i12 < split.length) {
            String trim = split[i12].trim();
            try {
                i11 = h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i11 = 0;
            }
            if (i11 == 0) {
                i11 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i11 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i11 = ((Integer) designInformation).intValue();
            }
            iArr[i13] = i11;
            i12++;
            i13++;
        }
        return i13 != split.length ? Arrays.copyOf(iArr, i13) : iArr;
    }

    private a s(Context context, AttributeSet attributeSet, boolean z11) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z11 ? i.f4095q2 : i.f3928a);
        B(context, aVar, obtainStyledAttributes, z11);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a t(int i11) {
        if (!this.f3815e.containsKey(Integer.valueOf(i11))) {
            this.f3815e.put(Integer.valueOf(i11), new a());
        }
        return this.f3815e.get(Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(TypedArray typedArray, int i11, int i12) {
        int resourceId = typedArray.getResourceId(i11, i12);
        return resourceId == -1 ? typedArray.getInt(i11, -1) : resourceId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void y(Object obj, TypedArray typedArray, int i11, int i12) {
        if (obj == null) {
            return;
        }
        int i13 = typedArray.peekValue(i11).type;
        if (i13 != 3) {
            int i14 = -2;
            boolean z11 = false;
            if (i13 != 5) {
                int i15 = typedArray.getInt(i11, 0);
                if (i15 != -4) {
                    i14 = (i15 == -3 || !(i15 == -2 || i15 == -1)) ? 0 : i15;
                } else {
                    z11 = true;
                }
            } else {
                i14 = typedArray.getDimensionPixelSize(i11, 0);
            }
            if (obj instanceof ConstraintLayout.b) {
                ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                if (i12 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar).width = i14;
                    bVar.W = z11;
                    return;
                }
                ((ViewGroup.MarginLayoutParams) bVar).height = i14;
                bVar.X = z11;
                return;
            } else if (obj instanceof b) {
                b bVar2 = (b) obj;
                if (i12 == 0) {
                    bVar2.f3841c = i14;
                    bVar2.f3862m0 = z11;
                    return;
                }
                bVar2.f3843d = i14;
                bVar2.f3864n0 = z11;
                return;
            } else if (obj instanceof a.C0066a) {
                a.C0066a c0066a = (a.C0066a) obj;
                if (i12 == 0) {
                    c0066a.b(23, i14);
                    c0066a.d(80, z11);
                    return;
                }
                c0066a.b(21, i14);
                c0066a.d(81, z11);
                return;
            } else {
                return;
            }
        }
        z(obj, typedArray.getString(i11), i12);
    }

    static void z(Object obj, String str, int i11) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if ("ratio".equalsIgnoreCase(trim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    A(bVar, trim2);
                    return;
                } else if (obj instanceof b) {
                    ((b) obj).f3878z = trim2;
                    return;
                } else if (obj instanceof a.C0066a) {
                    ((a.C0066a) obj).c(5, trim2);
                    return;
                } else {
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.H = parseFloat;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.I = parseFloat;
                        }
                    } else if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i11 == 0) {
                            bVar3.f3841c = 0;
                            bVar3.V = parseFloat;
                        } else {
                            bVar3.f3843d = 0;
                            bVar3.U = parseFloat;
                        }
                    } else if (obj instanceof a.C0066a) {
                        a.C0066a c0066a = (a.C0066a) obj;
                        if (i11 == 0) {
                            c0066a.b(23, 0);
                            c0066a.a(39, parseFloat);
                        } else {
                            c0066a.b(21, 0);
                            c0066a.a(40, parseFloat);
                        }
                    }
                } else if (!"parent".equalsIgnoreCase(trim)) {
                } else {
                    float max = Math.max((float) BitmapDescriptorFactory.HUE_RED, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.R = max;
                            bVar4.L = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.S = max;
                            bVar4.M = 2;
                        }
                    } else if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i11 == 0) {
                            bVar5.f3841c = 0;
                            bVar5.f3846e0 = max;
                            bVar5.Y = 2;
                        } else {
                            bVar5.f3843d = 0;
                            bVar5.f3848f0 = max;
                            bVar5.Z = 2;
                        }
                    } else if (obj instanceof a.C0066a) {
                        a.C0066a c0066a2 = (a.C0066a) obj;
                        if (i11 == 0) {
                            c0066a2.b(23, 0);
                            c0066a2.b(54, 2);
                        } else {
                            c0066a2.b(21, 0);
                            c0066a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public void D(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f3814d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f3815e.containsKey(Integer.valueOf(id2))) {
                this.f3815e.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f3815e.get(Integer.valueOf(id2));
            if (aVar != null) {
                if (!aVar.f3820e.f3839b) {
                    aVar.g(id2, bVar);
                    if (childAt instanceof androidx.constraintlayout.widget.b) {
                        aVar.f3820e.f3856j0 = ((androidx.constraintlayout.widget.b) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.f3820e.f3866o0 = barrier.getAllowsGoneWidget();
                            aVar.f3820e.f3850g0 = barrier.getType();
                            aVar.f3820e.f3852h0 = barrier.getMargin();
                        }
                    }
                    aVar.f3820e.f3839b = true;
                }
                C0067d c0067d = aVar.f3818c;
                if (!c0067d.f3894a) {
                    c0067d.f3895b = childAt.getVisibility();
                    aVar.f3818c.f3897d = childAt.getAlpha();
                    aVar.f3818c.f3894a = true;
                }
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 17) {
                    e eVar = aVar.f3821f;
                    if (!eVar.f3900a) {
                        eVar.f3900a = true;
                        eVar.f3901b = childAt.getRotation();
                        aVar.f3821f.f3902c = childAt.getRotationX();
                        aVar.f3821f.f3903d = childAt.getRotationY();
                        aVar.f3821f.f3904e = childAt.getScaleX();
                        aVar.f3821f.f3905f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            e eVar2 = aVar.f3821f;
                            eVar2.f3906g = pivotX;
                            eVar2.f3907h = pivotY;
                        }
                        aVar.f3821f.f3909j = childAt.getTranslationX();
                        aVar.f3821f.f3910k = childAt.getTranslationY();
                        if (i12 >= 21) {
                            aVar.f3821f.f3911l = childAt.getTranslationZ();
                            e eVar3 = aVar.f3821f;
                            if (eVar3.f3912m) {
                                eVar3.f3913n = childAt.getElevation();
                            }
                        }
                    }
                }
            }
        }
    }

    public void E(d dVar) {
        for (Integer num : dVar.f3815e.keySet()) {
            int intValue = num.intValue();
            a aVar = dVar.f3815e.get(num);
            if (!this.f3815e.containsKey(Integer.valueOf(intValue))) {
                this.f3815e.put(Integer.valueOf(intValue), new a());
            }
            a aVar2 = this.f3815e.get(Integer.valueOf(intValue));
            if (aVar2 != null) {
                b bVar = aVar2.f3820e;
                if (!bVar.f3839b) {
                    bVar.a(aVar.f3820e);
                }
                C0067d c0067d = aVar2.f3818c;
                if (!c0067d.f3894a) {
                    c0067d.a(aVar.f3818c);
                }
                e eVar = aVar2.f3821f;
                if (!eVar.f3900a) {
                    eVar.a(aVar.f3821f);
                }
                c cVar = aVar2.f3819d;
                if (!cVar.f3880a) {
                    cVar.a(aVar.f3819d);
                }
                for (String str : aVar.f3822g.keySet()) {
                    if (!aVar2.f3822g.containsKey(str)) {
                        aVar2.f3822g.put(str, aVar.f3822g.get(str));
                    }
                }
            }
        }
    }

    public void J(boolean z11) {
        this.f3814d = z11;
    }

    public void K(boolean z11) {
    }

    public void g(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            int id2 = childAt.getId();
            if (!this.f3815e.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.c(childAt));
            } else if (this.f3814d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (this.f3815e.containsKey(Integer.valueOf(id2)) && (aVar = this.f3815e.get(Integer.valueOf(id2))) != null) {
                    androidx.constraintlayout.widget.a.i(childAt, aVar.f3822g);
                }
            }
        }
    }

    public void h(d dVar) {
        for (a aVar : dVar.f3815e.values()) {
            if (aVar.f3823h != null) {
                if (aVar.f3817b != null) {
                    for (Integer num : this.f3815e.keySet()) {
                        a u11 = u(num.intValue());
                        String str = u11.f3820e.f3860l0;
                        if (str != null && aVar.f3817b.matches(str)) {
                            aVar.f3823h.e(u11);
                            u11.f3822g.putAll((HashMap) aVar.f3822g.clone());
                        }
                    }
                } else {
                    aVar.f3823h.e(u(aVar.f3816a));
                }
            }
        }
    }

    public void i(ConstraintLayout constraintLayout) {
        j(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(ConstraintLayout constraintLayout, boolean z11) {
        View findViewById;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f3815e.keySet());
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            int id2 = childAt.getId();
            if (!this.f3815e.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.c(childAt));
            } else if (this.f3814d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id2 != -1) {
                    if (this.f3815e.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f3815e.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f3820e.f3854i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(aVar.f3820e.f3850g0);
                                barrier.setMargin(aVar.f3820e.f3852h0);
                                barrier.setAllowsGoneWidget(aVar.f3820e.f3866o0);
                                b bVar = aVar.f3820e;
                                int[] iArr = bVar.f3856j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f3858k0;
                                    if (str != null) {
                                        bVar.f3856j0 = r(barrier, str);
                                        barrier.setReferencedIds(aVar.f3820e.f3856j0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.b();
                            aVar.e(bVar2);
                            if (z11) {
                                androidx.constraintlayout.widget.a.i(childAt, aVar.f3822g);
                            }
                            childAt.setLayoutParams(bVar2);
                            C0067d c0067d = aVar.f3818c;
                            if (c0067d.f3896c == 0) {
                                childAt.setVisibility(c0067d.f3895b);
                            }
                            int i12 = Build.VERSION.SDK_INT;
                            if (i12 >= 17) {
                                childAt.setAlpha(aVar.f3818c.f3897d);
                                childAt.setRotation(aVar.f3821f.f3901b);
                                childAt.setRotationX(aVar.f3821f.f3902c);
                                childAt.setRotationY(aVar.f3821f.f3903d);
                                childAt.setScaleX(aVar.f3821f.f3904e);
                                childAt.setScaleY(aVar.f3821f.f3905f);
                                e eVar = aVar.f3821f;
                                if (eVar.f3908i != -1) {
                                    if (((View) childAt.getParent()).findViewById(aVar.f3821f.f3908i) != null) {
                                        float top = (findViewById.getTop() + findViewById.getBottom()) / 2.0f;
                                        float left = (findViewById.getLeft() + findViewById.getRight()) / 2.0f;
                                        if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                            childAt.setPivotX(left - childAt.getLeft());
                                            childAt.setPivotY(top - childAt.getTop());
                                        }
                                    }
                                } else {
                                    if (!Float.isNaN(eVar.f3906g)) {
                                        childAt.setPivotX(aVar.f3821f.f3906g);
                                    }
                                    if (!Float.isNaN(aVar.f3821f.f3907h)) {
                                        childAt.setPivotY(aVar.f3821f.f3907h);
                                    }
                                }
                                childAt.setTranslationX(aVar.f3821f.f3909j);
                                childAt.setTranslationY(aVar.f3821f.f3910k);
                                if (i12 >= 21) {
                                    childAt.setTranslationZ(aVar.f3821f.f3911l);
                                    e eVar2 = aVar.f3821f;
                                    if (eVar2.f3912m) {
                                        childAt.setElevation(eVar2.f3913n);
                                    }
                                }
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) it2.next();
            a aVar2 = this.f3815e.get(num);
            if (aVar2 != null) {
                if (aVar2.f3820e.f3854i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f3820e;
                    int[] iArr2 = bVar3.f3856j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f3858k0;
                        if (str2 != null) {
                            bVar3.f3856j0 = r(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f3820e.f3856j0);
                        }
                    }
                    barrier2.setType(aVar2.f3820e.f3850g0);
                    barrier2.setMargin(aVar2.f3820e.f3852h0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.t();
                    aVar2.e(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.f3820e.f3837a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.e(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = constraintLayout.getChildAt(i13);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).j(constraintLayout);
            }
        }
    }

    public void l(int i11, int i12) {
        a aVar;
        if (!this.f3815e.containsKey(Integer.valueOf(i11)) || (aVar = this.f3815e.get(Integer.valueOf(i11))) == null) {
            return;
        }
        switch (i12) {
            case 1:
                b bVar = aVar.f3820e;
                bVar.f3855j = -1;
                bVar.f3853i = -1;
                bVar.G = -1;
                bVar.N = Integer.MIN_VALUE;
                return;
            case 2:
                b bVar2 = aVar.f3820e;
                bVar2.f3859l = -1;
                bVar2.f3857k = -1;
                bVar2.H = -1;
                bVar2.P = Integer.MIN_VALUE;
                return;
            case 3:
                b bVar3 = aVar.f3820e;
                bVar3.f3863n = -1;
                bVar3.f3861m = -1;
                bVar3.I = 0;
                bVar3.O = Integer.MIN_VALUE;
                return;
            case 4:
                b bVar4 = aVar.f3820e;
                bVar4.f3865o = -1;
                bVar4.f3867p = -1;
                bVar4.J = 0;
                bVar4.Q = Integer.MIN_VALUE;
                return;
            case 5:
                b bVar5 = aVar.f3820e;
                bVar5.f3869q = -1;
                bVar5.f3870r = -1;
                bVar5.f3871s = -1;
                bVar5.M = 0;
                bVar5.T = Integer.MIN_VALUE;
                return;
            case 6:
                b bVar6 = aVar.f3820e;
                bVar6.f3872t = -1;
                bVar6.f3873u = -1;
                bVar6.L = 0;
                bVar6.S = Integer.MIN_VALUE;
                return;
            case 7:
                b bVar7 = aVar.f3820e;
                bVar7.f3874v = -1;
                bVar7.f3875w = -1;
                bVar7.K = 0;
                bVar7.R = Integer.MIN_VALUE;
                return;
            case 8:
                b bVar8 = aVar.f3820e;
                bVar8.C = -1.0f;
                bVar8.B = -1;
                bVar8.A = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void m(Context context, int i11) {
        n((ConstraintLayout) LayoutInflater.from(context).inflate(i11, (ViewGroup) null));
    }

    public void n(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f3815e.clear();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f3814d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f3815e.containsKey(Integer.valueOf(id2))) {
                this.f3815e.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f3815e.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f3822g = androidx.constraintlayout.widget.a.b(this.f3813c, childAt);
                aVar.g(id2, bVar);
                aVar.f3818c.f3895b = childAt.getVisibility();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 17) {
                    aVar.f3818c.f3897d = childAt.getAlpha();
                    aVar.f3821f.f3901b = childAt.getRotation();
                    aVar.f3821f.f3902c = childAt.getRotationX();
                    aVar.f3821f.f3903d = childAt.getRotationY();
                    aVar.f3821f.f3904e = childAt.getScaleX();
                    aVar.f3821f.f3905f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        e eVar = aVar.f3821f;
                        eVar.f3906g = pivotX;
                        eVar.f3907h = pivotY;
                    }
                    aVar.f3821f.f3909j = childAt.getTranslationX();
                    aVar.f3821f.f3910k = childAt.getTranslationY();
                    if (i12 >= 21) {
                        aVar.f3821f.f3911l = childAt.getTranslationZ();
                        e eVar2 = aVar.f3821f;
                        if (eVar2.f3912m) {
                            eVar2.f3913n = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f3820e.f3866o0 = barrier.getAllowsGoneWidget();
                    aVar.f3820e.f3856j0 = barrier.getReferencedIds();
                    aVar.f3820e.f3850g0 = barrier.getType();
                    aVar.f3820e.f3852h0 = barrier.getMargin();
                }
            }
        }
    }

    public void o(d dVar) {
        this.f3815e.clear();
        for (Integer num : dVar.f3815e.keySet()) {
            a aVar = dVar.f3815e.get(num);
            if (aVar != null) {
                this.f3815e.put(num, aVar.clone());
            }
        }
    }

    public void p(androidx.constraintlayout.widget.e eVar) {
        int childCount = eVar.getChildCount();
        this.f3815e.clear();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = eVar.getChildAt(i11);
            e.a aVar = (e.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f3814d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f3815e.containsKey(Integer.valueOf(id2))) {
                this.f3815e.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f3815e.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.b) {
                    aVar2.i((androidx.constraintlayout.widget.b) childAt, id2, aVar);
                }
                aVar2.h(id2, aVar);
            }
        }
    }

    public void q(int i11, int i12, int i13, float f11) {
        b bVar = t(i11).f3820e;
        bVar.A = i12;
        bVar.B = i13;
        bVar.C = f11;
    }

    public a u(int i11) {
        if (this.f3815e.containsKey(Integer.valueOf(i11))) {
            return this.f3815e.get(Integer.valueOf(i11));
        }
        return null;
    }

    public void v(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    a s11 = s(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        s11.f3820e.f3837a = true;
                    }
                    this.f3815e.put(Integer.valueOf(s11.f3816a), s11);
                    continue;
                }
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cb, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.w(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}