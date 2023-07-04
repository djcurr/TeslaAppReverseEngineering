package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.p;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s {
    private static final float[][] G = {new float[]{0.5f, BitmapDescriptorFactory.HUE_RED}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] H = {new float[]{BitmapDescriptorFactory.HUE_RED, -1.0f}, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f}, new float[]{-1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{-1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED}};

    /* renamed from: r  reason: collision with root package name */
    private float f3663r;

    /* renamed from: s  reason: collision with root package name */
    private float f3664s;

    /* renamed from: t  reason: collision with root package name */
    private final p f3665t;

    /* renamed from: a  reason: collision with root package name */
    private int f3646a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f3647b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f3648c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f3649d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f3650e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f3651f = -1;

    /* renamed from: g  reason: collision with root package name */
    private float f3652g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    private float f3653h = 0.5f;

    /* renamed from: i  reason: collision with root package name */
    float f3654i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    float f3655j = 0.5f;

    /* renamed from: k  reason: collision with root package name */
    private int f3656k = -1;

    /* renamed from: l  reason: collision with root package name */
    boolean f3657l = false;

    /* renamed from: m  reason: collision with root package name */
    private float f3658m = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: n  reason: collision with root package name */
    private float f3659n = 1.0f;

    /* renamed from: o  reason: collision with root package name */
    private boolean f3660o = false;

    /* renamed from: p  reason: collision with root package name */
    private float[] f3661p = new float[2];

    /* renamed from: q  reason: collision with root package name */
    private int[] f3662q = new int[2];

    /* renamed from: u  reason: collision with root package name */
    private float f3666u = 4.0f;

    /* renamed from: v  reason: collision with root package name */
    private float f3667v = 1.2f;

    /* renamed from: w  reason: collision with root package name */
    private boolean f3668w = true;

    /* renamed from: x  reason: collision with root package name */
    private float f3669x = 1.0f;

    /* renamed from: y  reason: collision with root package name */
    private int f3670y = 0;

    /* renamed from: z  reason: collision with root package name */
    private float f3671z = 10.0f;
    private float A = 10.0f;
    private float B = 1.0f;
    private float C = Float.NaN;
    private float D = Float.NaN;
    private int E = 0;
    private int F = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnTouchListener {
        a(s sVar) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements NestedScrollView.b {
        b(s sVar) {
        }

        @Override // androidx.core.widget.NestedScrollView.b
        public void a(NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(Context context, p pVar, XmlPullParser xmlPullParser) {
        this.f3665t = pVar;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    private void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArray.getIndex(i11);
            if (index == androidx.constraintlayout.widget.i.U7) {
                this.f3649d = typedArray.getResourceId(index, this.f3649d);
            } else if (index == androidx.constraintlayout.widget.i.V7) {
                int i12 = typedArray.getInt(index, this.f3646a);
                this.f3646a = i12;
                float[][] fArr = G;
                this.f3653h = fArr[i12][0];
                this.f3652g = fArr[i12][1];
            } else if (index == androidx.constraintlayout.widget.i.F7) {
                int i13 = typedArray.getInt(index, this.f3647b);
                this.f3647b = i13;
                float[][] fArr2 = H;
                if (i13 < fArr2.length) {
                    this.f3658m = fArr2[i13][0];
                    this.f3659n = fArr2[i13][1];
                } else {
                    this.f3659n = Float.NaN;
                    this.f3658m = Float.NaN;
                    this.f3657l = true;
                }
            } else if (index == androidx.constraintlayout.widget.i.K7) {
                this.f3666u = typedArray.getFloat(index, this.f3666u);
            } else if (index == androidx.constraintlayout.widget.i.J7) {
                this.f3667v = typedArray.getFloat(index, this.f3667v);
            } else if (index == androidx.constraintlayout.widget.i.L7) {
                this.f3668w = typedArray.getBoolean(index, this.f3668w);
            } else if (index == androidx.constraintlayout.widget.i.G7) {
                this.f3669x = typedArray.getFloat(index, this.f3669x);
            } else if (index == androidx.constraintlayout.widget.i.H7) {
                this.f3671z = typedArray.getFloat(index, this.f3671z);
            } else if (index == androidx.constraintlayout.widget.i.W7) {
                this.f3650e = typedArray.getResourceId(index, this.f3650e);
            } else if (index == androidx.constraintlayout.widget.i.N7) {
                this.f3648c = typedArray.getInt(index, this.f3648c);
            } else if (index == androidx.constraintlayout.widget.i.M7) {
                this.f3670y = typedArray.getInteger(index, 0);
            } else if (index == androidx.constraintlayout.widget.i.I7) {
                this.f3651f = typedArray.getResourceId(index, 0);
            } else if (index == androidx.constraintlayout.widget.i.O7) {
                this.f3656k = typedArray.getResourceId(index, this.f3656k);
            } else if (index == androidx.constraintlayout.widget.i.Q7) {
                this.A = typedArray.getFloat(index, this.A);
            } else if (index == androidx.constraintlayout.widget.i.R7) {
                this.B = typedArray.getFloat(index, this.B);
            } else if (index == androidx.constraintlayout.widget.i.S7) {
                this.C = typedArray.getFloat(index, this.C);
            } else if (index == androidx.constraintlayout.widget.i.T7) {
                this.D = typedArray.getFloat(index, this.D);
            } else if (index == androidx.constraintlayout.widget.i.P7) {
                this.E = typedArray.getInt(index, this.E);
            } else if (index == androidx.constraintlayout.widget.i.E7) {
                this.F = typedArray.getInt(index, this.F);
            }
        }
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.D7);
        b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a(float f11, float f12) {
        return (f11 * this.f3658m) + (f12 * this.f3659n);
    }

    public int d() {
        return this.F;
    }

    public int e() {
        return this.f3670y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF f(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i11 = this.f3651f;
        if (i11 == -1 || (findViewById = viewGroup.findViewById(i11)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.f3667v;
    }

    public float h() {
        return this.f3666u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return this.f3668w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j(float f11, float f12) {
        this.f3665t.s(this.f3649d, this.f3665t.getProgress(), this.f3653h, this.f3652g, this.f3661p);
        float f13 = this.f3658m;
        if (f13 != BitmapDescriptorFactory.HUE_RED) {
            float[] fArr = this.f3661p;
            if (fArr[0] == BitmapDescriptorFactory.HUE_RED) {
                fArr[0] = 1.0E-7f;
            }
            return (f11 * f13) / fArr[0];
        }
        float[] fArr2 = this.f3661p;
        if (fArr2[1] == BitmapDescriptorFactory.HUE_RED) {
            fArr2[1] = 1.0E-7f;
        }
        return (f12 * this.f3659n) / fArr2[1];
    }

    public int k() {
        return this.E;
    }

    public float l() {
        return this.A;
    }

    public float m() {
        return this.B;
    }

    public float n() {
        return this.C;
    }

    public float o() {
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF p(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i11 = this.f3650e;
        if (i11 == -1 || (findViewById = viewGroup.findViewById(i11)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        return this.f3650e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r() {
        return this.f3660o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(MotionEvent motionEvent, p.f fVar, int i11, r rVar) {
        float f11;
        int i12;
        float f12;
        if (this.f3657l) {
            t(motionEvent, fVar, i11, rVar);
            return;
        }
        fVar.a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f3663r = motionEvent.getRawX();
            this.f3664s = motionEvent.getRawY();
            this.f3660o = false;
        } else if (action == 1) {
            this.f3660o = false;
            fVar.d(1000);
            float c11 = fVar.c();
            float b11 = fVar.b();
            float progress = this.f3665t.getProgress();
            int i13 = this.f3649d;
            if (i13 != -1) {
                this.f3665t.s(i13, progress, this.f3653h, this.f3652g, this.f3661p);
            } else {
                float min = Math.min(this.f3665t.getWidth(), this.f3665t.getHeight());
                float[] fArr = this.f3661p;
                fArr[1] = this.f3659n * min;
                fArr[0] = min * this.f3658m;
            }
            float f13 = this.f3658m;
            float[] fArr2 = this.f3661p;
            float f14 = fArr2[0];
            float f15 = fArr2[1];
            if (f13 != BitmapDescriptorFactory.HUE_RED) {
                f11 = c11 / fArr2[0];
            } else {
                f11 = b11 / fArr2[1];
            }
            float f16 = !Float.isNaN(f11) ? (f11 / 3.0f) + progress : progress;
            if (f16 == BitmapDescriptorFactory.HUE_RED || f16 == 1.0f || (i12 = this.f3648c) == 3) {
                if (BitmapDescriptorFactory.HUE_RED >= f16 || 1.0f <= f16) {
                    this.f3665t.setState(p.j.FINISHED);
                    return;
                }
                return;
            }
            float f17 = ((double) f16) < 0.5d ? 0.0f : 1.0f;
            if (i12 == 6) {
                if (progress + f11 < BitmapDescriptorFactory.HUE_RED) {
                    f11 = Math.abs(f11);
                }
                f17 = 1.0f;
            }
            if (this.f3648c == 7) {
                if (progress + f11 > 1.0f) {
                    f11 = -Math.abs(f11);
                }
                f17 = 0.0f;
            }
            this.f3665t.E(this.f3648c, f17, f11);
            if (BitmapDescriptorFactory.HUE_RED >= progress || 1.0f <= progress) {
                this.f3665t.setState(p.j.FINISHED);
            }
        } else if (action != 2) {
        } else {
            float rawY = motionEvent.getRawY() - this.f3664s;
            float rawX = motionEvent.getRawX() - this.f3663r;
            if (Math.abs((this.f3658m * rawX) + (this.f3659n * rawY)) > this.f3671z || this.f3660o) {
                float progress2 = this.f3665t.getProgress();
                if (!this.f3660o) {
                    this.f3660o = true;
                    this.f3665t.setProgress(progress2);
                }
                int i14 = this.f3649d;
                if (i14 != -1) {
                    this.f3665t.s(i14, progress2, this.f3653h, this.f3652g, this.f3661p);
                } else {
                    float min2 = Math.min(this.f3665t.getWidth(), this.f3665t.getHeight());
                    float[] fArr3 = this.f3661p;
                    fArr3[1] = this.f3659n * min2;
                    fArr3[0] = min2 * this.f3658m;
                }
                float f18 = this.f3658m;
                float[] fArr4 = this.f3661p;
                if (Math.abs(((f18 * fArr4[0]) + (this.f3659n * fArr4[1])) * this.f3669x) < 0.01d) {
                    float[] fArr5 = this.f3661p;
                    fArr5[0] = 0.01f;
                    fArr5[1] = 0.01f;
                }
                if (this.f3658m != BitmapDescriptorFactory.HUE_RED) {
                    f12 = rawX / this.f3661p[0];
                } else {
                    f12 = rawY / this.f3661p[1];
                }
                float max = Math.max(Math.min(progress2 + f12, 1.0f), (float) BitmapDescriptorFactory.HUE_RED);
                if (this.f3648c == 6) {
                    max = Math.max(max, 0.01f);
                }
                if (this.f3648c == 7) {
                    max = Math.min(max, 0.99f);
                }
                float progress3 = this.f3665t.getProgress();
                if (max != progress3) {
                    int i15 = (progress3 > BitmapDescriptorFactory.HUE_RED ? 1 : (progress3 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    if (i15 == 0 || progress3 == 1.0f) {
                        this.f3665t.h(i15 == 0);
                    }
                    this.f3665t.setProgress(max);
                    fVar.d(1000);
                    this.f3665t.f3516d = this.f3658m != BitmapDescriptorFactory.HUE_RED ? fVar.c() / this.f3661p[0] : fVar.b() / this.f3661p[1];
                } else {
                    this.f3665t.f3516d = BitmapDescriptorFactory.HUE_RED;
                }
                this.f3663r = motionEvent.getRawX();
                this.f3664s = motionEvent.getRawY();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void t(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.p.f r25, int r26, androidx.constraintlayout.motion.widget.r r27) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.s.t(android.view.MotionEvent, androidx.constraintlayout.motion.widget.p$f, int, androidx.constraintlayout.motion.widget.r):void");
    }

    public String toString() {
        if (Float.isNaN(this.f3658m)) {
            return "rotation";
        }
        return this.f3658m + " , " + this.f3659n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(float f11, float f12) {
        float f13;
        float progress = this.f3665t.getProgress();
        if (!this.f3660o) {
            this.f3660o = true;
            this.f3665t.setProgress(progress);
        }
        this.f3665t.s(this.f3649d, progress, this.f3653h, this.f3652g, this.f3661p);
        float f14 = this.f3658m;
        float[] fArr = this.f3661p;
        if (Math.abs((f14 * fArr[0]) + (this.f3659n * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f3661p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f15 = this.f3658m;
        if (f15 != BitmapDescriptorFactory.HUE_RED) {
            f13 = (f11 * f15) / this.f3661p[0];
        } else {
            f13 = (f12 * this.f3659n) / this.f3661p[1];
        }
        float max = Math.max(Math.min(progress + f13, 1.0f), (float) BitmapDescriptorFactory.HUE_RED);
        if (max != this.f3665t.getProgress()) {
            this.f3665t.setProgress(max);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(float f11, float f12) {
        float f13;
        this.f3660o = false;
        float progress = this.f3665t.getProgress();
        this.f3665t.s(this.f3649d, progress, this.f3653h, this.f3652g, this.f3661p);
        float f14 = this.f3658m;
        float[] fArr = this.f3661p;
        float f15 = fArr[0];
        float f16 = this.f3659n;
        float f17 = fArr[1];
        float f18 = BitmapDescriptorFactory.HUE_RED;
        if (f14 != BitmapDescriptorFactory.HUE_RED) {
            f13 = (f11 * f14) / fArr[0];
        } else {
            f13 = (f12 * f16) / fArr[1];
        }
        if (!Float.isNaN(f13)) {
            progress += f13 / 3.0f;
        }
        if (progress != BitmapDescriptorFactory.HUE_RED) {
            boolean z11 = progress != 1.0f;
            int i11 = this.f3648c;
            if ((i11 != 3) && z11) {
                p pVar = this.f3665t;
                if (progress >= 0.5d) {
                    f18 = 1.0f;
                }
                pVar.E(i11, f18, f13);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(float f11, float f12) {
        this.f3663r = f11;
        this.f3664s = f12;
    }

    public void x(boolean z11) {
        if (z11) {
            float[][] fArr = H;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = G;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = H;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = G;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = G;
        int i11 = this.f3646a;
        this.f3653h = fArr5[i11][0];
        this.f3652g = fArr5[i11][1];
        int i12 = this.f3647b;
        float[][] fArr6 = H;
        if (i12 >= fArr6.length) {
            return;
        }
        this.f3658m = fArr6[i12][0];
        this.f3659n = fArr6[i12][1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(float f11, float f12) {
        this.f3663r = f11;
        this.f3664s = f12;
        this.f3660o = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        View view;
        int i11 = this.f3649d;
        if (i11 != -1) {
            view = this.f3665t.findViewById(i11);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + androidx.constraintlayout.motion.widget.a.b(this.f3665t.getContext(), this.f3649d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new a(this));
            nestedScrollView.setOnScrollChangeListener(new b(this));
        }
    }
}