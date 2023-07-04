package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.r;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class p extends ConstraintLayout implements androidx.core.view.r {

    /* renamed from: y3 */
    public static boolean f3510y3;
    int A;
    e B;
    private boolean C;
    private h3.b E;
    private androidx.constraintlayout.motion.widget.b F;
    int G;
    int H;
    boolean K;
    float L;
    float O;
    long P;
    float Q;
    private float Q1;
    int Q2;
    private boolean R;
    private ArrayList<n> T;
    private int V1;

    /* renamed from: a */
    r f3511a;

    /* renamed from: b */
    Interpolator f3512b;

    /* renamed from: b1 */
    private ArrayList<n> f3513b1;

    /* renamed from: b2 */
    private float f3514b2;

    /* renamed from: c */
    Interpolator f3515c;

    /* renamed from: d */
    float f3516d;

    /* renamed from: e */
    private int f3517e;

    /* renamed from: f */
    int f3518f;

    /* renamed from: g */
    private int f3519g;

    /* renamed from: g1 */
    private ArrayList<n> f3520g1;

    /* renamed from: g2 */
    protected boolean f3521g2;

    /* renamed from: h */
    private int f3522h;

    /* renamed from: i */
    private int f3523i;

    /* renamed from: i3 */
    int f3524i3;

    /* renamed from: j */
    private boolean f3525j;

    /* renamed from: j3 */
    int f3526j3;

    /* renamed from: k */
    HashMap<View, m> f3527k;

    /* renamed from: k3 */
    float f3528k3;

    /* renamed from: l */
    private long f3529l;

    /* renamed from: l3 */
    private c3.d f3530l3;

    /* renamed from: m */
    private float f3531m;

    /* renamed from: m3 */
    private boolean f3532m3;

    /* renamed from: n */
    float f3533n;

    /* renamed from: n3 */
    private h f3534n3;

    /* renamed from: o */
    float f3535o;

    /* renamed from: o3 */
    private Runnable f3536o3;

    /* renamed from: p */
    private long f3537p;

    /* renamed from: p1 */
    private CopyOnWriteArrayList<i> f3538p1;

    /* renamed from: p2 */
    int f3539p2;

    /* renamed from: p3 */
    private int[] f3540p3;

    /* renamed from: q */
    float f3541q;

    /* renamed from: q3 */
    int f3542q3;

    /* renamed from: r3 */
    private boolean f3543r3;

    /* renamed from: s3 */
    j f3544s3;

    /* renamed from: t */
    private boolean f3545t;

    /* renamed from: t3 */
    private boolean f3546t3;

    /* renamed from: u3 */
    private RectF f3547u3;

    /* renamed from: v3 */
    private View f3548v3;

    /* renamed from: w */
    boolean f3549w;

    /* renamed from: w3 */
    private Matrix f3550w3;

    /* renamed from: x */
    private i f3551x;

    /* renamed from: x1 */
    private int f3552x1;

    /* renamed from: x2 */
    int f3553x2;

    /* renamed from: x3 */
    ArrayList<Integer> f3554x3;

    /* renamed from: y */
    private float f3555y;

    /* renamed from: y1 */
    private long f3556y1;

    /* renamed from: y2 */
    int f3557y2;

    /* renamed from: z */
    private float f3558z;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
            p.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f3534n3.a();
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f3560a;

        b(p pVar, View view) {
            this.f3560a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3560a.setNestedScrollingEnabled(true);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
            p.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f3534n3.a();
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class d {

        /* renamed from: a */
        static final /* synthetic */ int[] f3562a;

        static {
            int[] iArr = new int[j.values().length];
            f3562a = iArr;
            try {
                iArr[j.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3562a[j.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3562a[j.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3562a[j.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    private class e {

        /* renamed from: a */
        float[] f3563a;

        /* renamed from: b */
        int[] f3564b;

        /* renamed from: c */
        float[] f3565c;

        /* renamed from: d */
        Path f3566d;

        /* renamed from: e */
        Paint f3567e;

        /* renamed from: f */
        Paint f3568f;

        /* renamed from: g */
        Paint f3569g;

        /* renamed from: h */
        Paint f3570h;

        /* renamed from: i */
        Paint f3571i;

        /* renamed from: j */
        private float[] f3572j;

        /* renamed from: k */
        DashPathEffect f3573k;

        /* renamed from: l */
        int f3574l;

        /* renamed from: m */
        Rect f3575m = new Rect();

        /* renamed from: n */
        boolean f3576n = false;

        /* renamed from: o */
        int f3577o;

        public e() {
            p.this = r5;
            this.f3577o = 1;
            Paint paint = new Paint();
            this.f3567e = paint;
            paint.setAntiAlias(true);
            this.f3567e.setColor(-21965);
            this.f3567e.setStrokeWidth(2.0f);
            this.f3567e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f3568f = paint2;
            paint2.setAntiAlias(true);
            this.f3568f.setColor(-2067046);
            this.f3568f.setStrokeWidth(2.0f);
            this.f3568f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f3569g = paint3;
            paint3.setAntiAlias(true);
            this.f3569g.setColor(-13391360);
            this.f3569g.setStrokeWidth(2.0f);
            this.f3569g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f3570h = paint4;
            paint4.setAntiAlias(true);
            this.f3570h.setColor(-13391360);
            this.f3570h.setTextSize(r5.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f3572j = new float[8];
            Paint paint5 = new Paint();
            this.f3571i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, BitmapDescriptorFactory.HUE_RED);
            this.f3573k = dashPathEffect;
            this.f3569g.setPathEffect(dashPathEffect);
            this.f3565c = new float[100];
            this.f3564b = new int[50];
            if (this.f3576n) {
                this.f3567e.setStrokeWidth(8.0f);
                this.f3571i.setStrokeWidth(8.0f);
                this.f3568f.setStrokeWidth(8.0f);
                this.f3577o = 4;
            }
        }

        private void c(Canvas canvas) {
            canvas.drawLines(this.f3563a, this.f3567e);
        }

        private void d(Canvas canvas) {
            boolean z11 = false;
            boolean z12 = false;
            for (int i11 = 0; i11 < this.f3574l; i11++) {
                int[] iArr = this.f3564b;
                if (iArr[i11] == 1) {
                    z11 = true;
                }
                if (iArr[i11] == 0) {
                    z12 = true;
                }
            }
            if (z11) {
                g(canvas);
            }
            if (z12) {
                e(canvas);
            }
        }

        private void e(Canvas canvas) {
            float[] fArr = this.f3563a;
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[fArr.length - 2];
            float f14 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f11, f13), Math.max(f12, f14), Math.max(f11, f13), Math.max(f12, f14), this.f3569g);
            canvas.drawLine(Math.min(f11, f13), Math.min(f12, f14), Math.min(f11, f13), Math.max(f12, f14), this.f3569g);
        }

        private void f(Canvas canvas, float f11, float f12) {
            float[] fArr = this.f3563a;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[fArr.length - 2];
            float f16 = fArr[fArr.length - 1];
            float min = Math.min(f13, f15);
            float max = Math.max(f14, f16);
            float min2 = f11 - Math.min(f13, f15);
            float max2 = Math.max(f14, f16) - f12;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f15 - f13)) + 0.5d)) / 100.0f);
            l(str, this.f3570h);
            canvas.drawText(str, ((min2 / 2.0f) - (this.f3575m.width() / 2)) + min, f12 - 20.0f, this.f3570h);
            canvas.drawLine(f11, f12, Math.min(f13, f15), f12, this.f3569g);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f16 - f14)) + 0.5d)) / 100.0f);
            l(str2, this.f3570h);
            canvas.drawText(str2, f11 + 5.0f, max - ((max2 / 2.0f) - (this.f3575m.height() / 2)), this.f3570h);
            canvas.drawLine(f11, f12, f11, Math.max(f14, f16), this.f3569g);
        }

        private void g(Canvas canvas) {
            float[] fArr = this.f3563a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f3569g);
        }

        private void h(Canvas canvas, float f11, float f12) {
            float[] fArr = this.f3563a;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[fArr.length - 2];
            float f16 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f13 - f15, f14 - f16);
            float f17 = f15 - f13;
            float f18 = f16 - f14;
            float f19 = (((f11 - f13) * f17) + ((f12 - f14) * f18)) / (hypot * hypot);
            float f21 = f13 + (f17 * f19);
            float f22 = f14 + (f19 * f18);
            Path path = new Path();
            path.moveTo(f11, f12);
            path.lineTo(f21, f22);
            float hypot2 = (float) Math.hypot(f21 - f11, f22 - f12);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            l(str, this.f3570h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.f3575m.width() / 2), -20.0f, this.f3570h);
            canvas.drawLine(f11, f12, f21, f22, this.f3569g);
        }

        private void i(Canvas canvas, float f11, float f12, int i11, int i12) {
            String str = "" + (((int) ((((f11 - (i11 / 2)) * 100.0f) / (p.this.getWidth() - i11)) + 0.5d)) / 100.0f);
            l(str, this.f3570h);
            canvas.drawText(str, ((f11 / 2.0f) - (this.f3575m.width() / 2)) + BitmapDescriptorFactory.HUE_RED, f12 - 20.0f, this.f3570h);
            canvas.drawLine(f11, f12, Math.min((float) BitmapDescriptorFactory.HUE_RED, 1.0f), f12, this.f3569g);
            String str2 = "" + (((int) ((((f12 - (i12 / 2)) * 100.0f) / (p.this.getHeight() - i12)) + 0.5d)) / 100.0f);
            l(str2, this.f3570h);
            canvas.drawText(str2, f11 + 5.0f, BitmapDescriptorFactory.HUE_RED - ((f12 / 2.0f) - (this.f3575m.height() / 2)), this.f3570h);
            canvas.drawLine(f11, f12, f11, Math.max((float) BitmapDescriptorFactory.HUE_RED, 1.0f), this.f3569g);
        }

        private void j(Canvas canvas, m mVar) {
            this.f3566d.reset();
            for (int i11 = 0; i11 <= 50; i11++) {
                mVar.d(i11 / 50, this.f3572j, 0);
                Path path = this.f3566d;
                float[] fArr = this.f3572j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f3566d;
                float[] fArr2 = this.f3572j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f3566d;
                float[] fArr3 = this.f3572j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f3566d;
                float[] fArr4 = this.f3572j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f3566d.close();
            }
            this.f3567e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f3566d, this.f3567e);
            canvas.translate(-2.0f, -2.0f);
            this.f3567e.setColor(-65536);
            canvas.drawPath(this.f3566d, this.f3567e);
        }

        private void k(Canvas canvas, int i11, int i12, m mVar) {
            int i13;
            int i14;
            float f11;
            float f12;
            View view = mVar.f3480a;
            if (view != null) {
                i13 = view.getWidth();
                i14 = mVar.f3480a.getHeight();
            } else {
                i13 = 0;
                i14 = 0;
            }
            for (int i15 = 1; i15 < i12 - 1; i15++) {
                if (i11 != 4 || this.f3564b[i15 - 1] != 0) {
                    float[] fArr = this.f3565c;
                    int i16 = i15 * 2;
                    float f13 = fArr[i16];
                    float f14 = fArr[i16 + 1];
                    this.f3566d.reset();
                    this.f3566d.moveTo(f13, f14 + 10.0f);
                    this.f3566d.lineTo(f13 + 10.0f, f14);
                    this.f3566d.lineTo(f13, f14 - 10.0f);
                    this.f3566d.lineTo(f13 - 10.0f, f14);
                    this.f3566d.close();
                    int i17 = i15 - 1;
                    mVar.m(i17);
                    if (i11 == 4) {
                        int[] iArr = this.f3564b;
                        if (iArr[i17] == 1) {
                            h(canvas, f13 - BitmapDescriptorFactory.HUE_RED, f14 - BitmapDescriptorFactory.HUE_RED);
                        } else if (iArr[i17] == 0) {
                            f(canvas, f13 - BitmapDescriptorFactory.HUE_RED, f14 - BitmapDescriptorFactory.HUE_RED);
                        } else if (iArr[i17] == 2) {
                            f11 = f14;
                            f12 = f13;
                            i(canvas, f13 - BitmapDescriptorFactory.HUE_RED, f14 - BitmapDescriptorFactory.HUE_RED, i13, i14);
                            canvas.drawPath(this.f3566d, this.f3571i);
                        }
                        f11 = f14;
                        f12 = f13;
                        canvas.drawPath(this.f3566d, this.f3571i);
                    } else {
                        f11 = f14;
                        f12 = f13;
                    }
                    if (i11 == 2) {
                        h(canvas, f12 - BitmapDescriptorFactory.HUE_RED, f11 - BitmapDescriptorFactory.HUE_RED);
                    }
                    if (i11 == 3) {
                        f(canvas, f12 - BitmapDescriptorFactory.HUE_RED, f11 - BitmapDescriptorFactory.HUE_RED);
                    }
                    if (i11 == 6) {
                        i(canvas, f12 - BitmapDescriptorFactory.HUE_RED, f11 - BitmapDescriptorFactory.HUE_RED, i13, i14);
                    }
                    canvas.drawPath(this.f3566d, this.f3571i);
                }
            }
            float[] fArr2 = this.f3563a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f3568f);
                float[] fArr3 = this.f3563a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f3568f);
            }
        }

        public void a(Canvas canvas, HashMap<View, m> hashMap, int i11, int i12) {
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            canvas.save();
            if (!p.this.isInEditMode() && (i12 & 1) == 2) {
                String str = p.this.getContext().getResources().getResourceName(p.this.f3519g) + ":" + p.this.getProgress();
                canvas.drawText(str, 10.0f, p.this.getHeight() - 30, this.f3570h);
                canvas.drawText(str, 11.0f, p.this.getHeight() - 29, this.f3567e);
            }
            for (m mVar : hashMap.values()) {
                int l11 = mVar.l();
                if (i12 > 0 && l11 == 0) {
                    l11 = 1;
                }
                if (l11 != 0) {
                    this.f3574l = mVar.b(this.f3565c, this.f3564b);
                    if (l11 >= 1) {
                        int i13 = i11 / 16;
                        float[] fArr = this.f3563a;
                        if (fArr == null || fArr.length != i13 * 2) {
                            this.f3563a = new float[i13 * 2];
                            this.f3566d = new Path();
                        }
                        int i14 = this.f3577o;
                        canvas.translate(i14, i14);
                        this.f3567e.setColor(1996488704);
                        this.f3571i.setColor(1996488704);
                        this.f3568f.setColor(1996488704);
                        this.f3569g.setColor(1996488704);
                        mVar.c(this.f3563a, i13);
                        b(canvas, l11, this.f3574l, mVar);
                        this.f3567e.setColor(-21965);
                        this.f3568f.setColor(-2067046);
                        this.f3571i.setColor(-2067046);
                        this.f3569g.setColor(-13391360);
                        int i15 = this.f3577o;
                        canvas.translate(-i15, -i15);
                        b(canvas, l11, this.f3574l, mVar);
                        if (l11 == 5) {
                            j(canvas, mVar);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void b(Canvas canvas, int i11, int i12, m mVar) {
            if (i11 == 4) {
                d(canvas);
            }
            if (i11 == 2) {
                g(canvas);
            }
            if (i11 == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, i11, i12, mVar);
        }

        void l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f3575m);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(MotionEvent motionEvent);

        float b();

        float c();

        void d(int i11);

        void recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g implements f {

        /* renamed from: b */
        private static g f3579b = new g();

        /* renamed from: a */
        VelocityTracker f3580a;

        private g() {
        }

        public static g e() {
            f3579b.f3580a = VelocityTracker.obtain();
            return f3579b;
        }

        @Override // androidx.constraintlayout.motion.widget.p.f
        public void a(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f3580a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.p.f
        public float b() {
            VelocityTracker velocityTracker = this.f3580a;
            return velocityTracker != null ? velocityTracker.getYVelocity() : BitmapDescriptorFactory.HUE_RED;
        }

        @Override // androidx.constraintlayout.motion.widget.p.f
        public float c() {
            VelocityTracker velocityTracker = this.f3580a;
            return velocityTracker != null ? velocityTracker.getXVelocity() : BitmapDescriptorFactory.HUE_RED;
        }

        @Override // androidx.constraintlayout.motion.widget.p.f
        public void d(int i11) {
            VelocityTracker velocityTracker = this.f3580a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i11);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.p.f
        public void recycle() {
            VelocityTracker velocityTracker = this.f3580a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3580a = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public class h {

        /* renamed from: a */
        float f3581a = Float.NaN;

        /* renamed from: b */
        float f3582b = Float.NaN;

        /* renamed from: c */
        int f3583c = -1;

        /* renamed from: d */
        int f3584d = -1;

        h() {
            p.this = r1;
        }

        void a() {
            int i11 = this.f3583c;
            if (i11 != -1 || this.f3584d != -1) {
                if (i11 == -1) {
                    p.this.I(this.f3584d);
                } else {
                    int i12 = this.f3584d;
                    if (i12 == -1) {
                        p.this.setState(i11, -1, -1);
                    } else {
                        p.this.D(i11, i12);
                    }
                }
                p.this.setState(j.SETUP);
            }
            if (Float.isNaN(this.f3582b)) {
                if (Float.isNaN(this.f3581a)) {
                    return;
                }
                p.this.setProgress(this.f3581a);
                return;
            }
            p.this.C(this.f3581a, this.f3582b);
            this.f3581a = Float.NaN;
            this.f3582b = Float.NaN;
            this.f3583c = -1;
            this.f3584d = -1;
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f3581a);
            bundle.putFloat("motion.velocity", this.f3582b);
            bundle.putInt("motion.StartState", this.f3583c);
            bundle.putInt("motion.EndState", this.f3584d);
            return bundle;
        }

        public void c() {
            this.f3584d = p.this.f3519g;
            this.f3583c = p.this.f3517e;
            this.f3582b = p.this.getVelocity();
            this.f3581a = p.this.getProgress();
        }

        public void d(int i11) {
            this.f3584d = i11;
        }

        public void e(float f11) {
            this.f3581a = f11;
        }

        public void f(int i11) {
            this.f3583c = i11;
        }

        public void g(Bundle bundle) {
            this.f3581a = bundle.getFloat("motion.progress");
            this.f3582b = bundle.getFloat("motion.velocity");
            this.f3583c = bundle.getInt("motion.StartState");
            this.f3584d = bundle.getInt("motion.EndState");
        }

        public void h(float f11) {
            this.f3582b = f11;
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(p pVar, int i11, int i12, float f11);

        void b(p pVar, int i11);

        void c(p pVar, int i11, int i12);

        void d(p pVar, int i11, boolean z11, float f11);
    }

    /* loaded from: classes.dex */
    public enum j {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private void A() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if (this.f3551x == null && ((copyOnWriteArrayList = this.f3538p1) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        Iterator<Integer> it2 = this.f3554x3.iterator();
        while (it2.hasNext()) {
            Integer next = it2.next();
            i iVar = this.f3551x;
            if (iVar != null) {
                iVar.b(this, next.intValue());
            }
            CopyOnWriteArrayList<i> copyOnWriteArrayList2 = this.f3538p1;
            if (copyOnWriteArrayList2 != null) {
                Iterator<i> it3 = copyOnWriteArrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().b(this, next.intValue());
                }
            }
        }
        this.f3554x3.clear();
    }

    private static boolean O(float f11, float f12, float f13) {
        if (f11 > BitmapDescriptorFactory.HUE_RED) {
            float f14 = f11 / f13;
            return f12 + ((f11 * f14) - (((f13 * f14) * f14) / 2.0f)) > 1.0f;
        }
        float f15 = (-f11) / f13;
        return f12 + ((f11 * f15) + (((f13 * f15) * f15) / 2.0f)) < BitmapDescriptorFactory.HUE_RED;
    }

    private boolean g(View view, MotionEvent motionEvent, float f11, float f12) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f11, f12);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f11, -f12);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f11, f12);
        if (this.f3550w3 == null) {
            this.f3550w3 = new Matrix();
        }
        matrix.invert(this.f3550w3);
        obtain.transform(this.f3550w3);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    private void l() {
        boolean z11;
        float signum = Math.signum(this.f3541q - this.f3535o);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f3512b;
        float f11 = this.f3535o + (((((float) (nanoTime - this.f3537p)) * signum) * 1.0E-9f) / this.f3531m);
        if (this.f3545t) {
            f11 = this.f3541q;
        }
        int i11 = (signum > BitmapDescriptorFactory.HUE_RED ? 1 : (signum == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if ((i11 <= 0 || f11 < this.f3541q) && (signum > BitmapDescriptorFactory.HUE_RED || f11 > this.f3541q)) {
            z11 = false;
        } else {
            f11 = this.f3541q;
            z11 = true;
        }
        if (interpolator != null && !z11) {
            if (this.C) {
                f11 = interpolator.getInterpolation(((float) (nanoTime - this.f3529l)) * 1.0E-9f);
            } else {
                f11 = interpolator.getInterpolation(f11);
            }
        }
        if ((i11 > 0 && f11 >= this.f3541q) || (signum <= BitmapDescriptorFactory.HUE_RED && f11 <= this.f3541q)) {
            f11 = this.f3541q;
        }
        this.f3528k3 = f11;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.f3515c;
        if (interpolator2 != null) {
            f11 = interpolator2.getInterpolation(f11);
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            m mVar = this.f3527k.get(childAt);
            if (mVar != null) {
                mVar.q(childAt, f11, nanoTime2, this.f3530l3);
            }
        }
        if (this.f3521g2) {
            requestLayout();
        }
    }

    private void p() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if ((this.f3551x == null && ((copyOnWriteArrayList = this.f3538p1) == null || copyOnWriteArrayList.isEmpty())) || this.f3514b2 == this.f3533n) {
            return;
        }
        if (this.V1 != -1) {
            i iVar = this.f3551x;
            if (iVar != null) {
                iVar.c(this, this.f3517e, this.f3519g);
            }
            CopyOnWriteArrayList<i> copyOnWriteArrayList2 = this.f3538p1;
            if (copyOnWriteArrayList2 != null) {
                Iterator<i> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().c(this, this.f3517e, this.f3519g);
                }
            }
        }
        this.V1 = -1;
        float f11 = this.f3533n;
        this.f3514b2 = f11;
        i iVar2 = this.f3551x;
        if (iVar2 != null) {
            iVar2.a(this, this.f3517e, this.f3519g, f11);
        }
        CopyOnWriteArrayList<i> copyOnWriteArrayList3 = this.f3538p1;
        if (copyOnWriteArrayList3 != null) {
            Iterator<i> it3 = copyOnWriteArrayList3.iterator();
            while (it3.hasNext()) {
                it3.next().a(this, this.f3517e, this.f3519g, this.f3533n);
            }
        }
    }

    private boolean w(float f11, float f12, View view, MotionEvent motionEvent) {
        boolean z11;
        View childAt;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (w((childAt.getLeft() + f11) - view.getScrollX(), (childAt.getTop() + f12) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (!z11) {
            this.f3547u3.set(f11, f12, (view.getRight() + f11) - view.getLeft(), (view.getBottom() + f12) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.f3547u3.contains(motionEvent.getX(), motionEvent.getY())) && g(view, motionEvent, -f11, -f12)) {
                return true;
            }
        }
        return z11;
    }

    public void B() {
        throw null;
    }

    public void C(float f11, float f12) {
        if (!isAttachedToWindow()) {
            if (this.f3534n3 == null) {
                this.f3534n3 = new h();
            }
            this.f3534n3.e(f11);
            this.f3534n3.h(f12);
            return;
        }
        setProgress(f11);
        setState(j.MOVING);
        this.f3516d = f12;
        float f13 = BitmapDescriptorFactory.HUE_RED;
        int i11 = (f12 > BitmapDescriptorFactory.HUE_RED ? 1 : (f12 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i11 != 0) {
            if (i11 > 0) {
                f13 = 1.0f;
            }
            f(f13);
        } else if (f11 == BitmapDescriptorFactory.HUE_RED || f11 == 1.0f) {
        } else {
            if (f11 > 0.5f) {
                f13 = 1.0f;
            }
            f(f13);
        }
    }

    public void D(int i11, int i12) {
        if (!isAttachedToWindow()) {
            if (this.f3534n3 == null) {
                this.f3534n3 = new h();
            }
            this.f3534n3.f(i11);
            this.f3534n3.d(i12);
            return;
        }
        r rVar = this.f3511a;
        if (rVar == null) {
            return;
        }
        this.f3517e = i11;
        this.f3519g = i12;
        rVar.T(i11, i12);
        this.f3511a.j(i11);
        this.f3511a.j(i12);
        throw null;
    }

    public void E(int i11, float f11, float f12) {
        if (this.f3511a == null || this.f3535o == f11) {
            return;
        }
        this.C = true;
        this.f3529l = getNanoTime();
        this.f3531m = this.f3511a.n() / 1000.0f;
        this.f3541q = f11;
        this.f3549w = true;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            if (i11 == 4) {
                this.f3511a.r();
                throw null;
            } else if (i11 == 5) {
                if (O(f12, this.f3535o, this.f3511a.r())) {
                    this.f3511a.r();
                    throw null;
                }
                this.f3511a.r();
                this.f3511a.s();
                throw null;
            } else if (i11 != 6 && i11 != 7) {
                this.f3545t = false;
                this.f3529l = getNanoTime();
                invalidate();
                return;
            }
        }
        if (this.f3511a.i() == 0) {
            this.f3511a.r();
            this.f3511a.s();
            throw null;
        }
        this.f3511a.y();
        this.f3511a.z();
        this.f3511a.x();
        this.f3511a.A();
        this.f3511a.w();
        throw null;
    }

    public void F() {
        f(1.0f);
        this.f3536o3 = null;
    }

    public void G(Runnable runnable) {
        f(1.0f);
        this.f3536o3 = runnable;
    }

    public void H() {
        f(BitmapDescriptorFactory.HUE_RED);
    }

    public void I(int i11) {
        if (!isAttachedToWindow()) {
            if (this.f3534n3 == null) {
                this.f3534n3 = new h();
            }
            this.f3534n3.d(i11);
            return;
        }
        J(i11, -1, -1);
    }

    public void J(int i11, int i12, int i13) {
        K(i11, i12, i13, -1);
    }

    public void K(int i11, int i12, int i13, int i14) {
        androidx.constraintlayout.widget.k kVar;
        int a11;
        r rVar = this.f3511a;
        if (rVar != null && (kVar = rVar.f3604b) != null && (a11 = kVar.a(this.f3518f, i11, i12, i13)) != -1) {
            i11 = a11;
        }
        int i15 = this.f3518f;
        if (i15 == i11) {
            return;
        }
        if (this.f3517e == i11) {
            f(BitmapDescriptorFactory.HUE_RED);
            if (i14 > 0) {
                this.f3531m = i14 / 1000.0f;
            }
        } else if (this.f3519g == i11) {
            f(1.0f);
            if (i14 > 0) {
                this.f3531m = i14 / 1000.0f;
            }
        } else {
            this.f3519g = i11;
            if (i15 != -1) {
                D(i15, i11);
                f(1.0f);
                this.f3535o = BitmapDescriptorFactory.HUE_RED;
                F();
                if (i14 > 0) {
                    this.f3531m = i14 / 1000.0f;
                    return;
                }
                return;
            }
            this.C = false;
            this.f3541q = 1.0f;
            this.f3533n = BitmapDescriptorFactory.HUE_RED;
            this.f3535o = BitmapDescriptorFactory.HUE_RED;
            this.f3537p = getNanoTime();
            this.f3529l = getNanoTime();
            this.f3545t = false;
            this.f3512b = null;
            if (i14 == -1) {
                this.f3531m = this.f3511a.n() / 1000.0f;
            }
            this.f3517e = -1;
            this.f3511a.T(-1, this.f3519g);
            SparseArray sparseArray = new SparseArray();
            if (i14 == 0) {
                this.f3531m = this.f3511a.n() / 1000.0f;
            } else if (i14 > 0) {
                this.f3531m = i14 / 1000.0f;
            }
            int childCount = getChildCount();
            this.f3527k.clear();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                this.f3527k.put(childAt, new m(childAt));
                sparseArray.put(childAt.getId(), this.f3527k.get(childAt));
            }
            this.f3549w = true;
            this.f3511a.j(i11);
            throw null;
        }
    }

    public void L() {
        this.f3511a.j(this.f3517e);
        this.f3511a.j(this.f3519g);
        throw null;
    }

    public void M(int i11, androidx.constraintlayout.widget.d dVar) {
        r rVar = this.f3511a;
        if (rVar != null) {
            rVar.Q(i11, dVar);
        }
        L();
        if (this.f3518f == i11) {
            dVar.i(this);
        }
    }

    public void N(int i11, View... viewArr) {
        r rVar = this.f3511a;
        if (rVar != null) {
            rVar.Y(i11, viewArr);
        } else {
            Log.e("MotionLayout", " no motionScene");
        }
    }

    @Override // androidx.core.view.q
    public void a(View view, View view2, int i11, int i12) {
        this.P = getNanoTime();
        this.Q = BitmapDescriptorFactory.HUE_RED;
        this.L = BitmapDescriptorFactory.HUE_RED;
        this.O = BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        long j11;
        v vVar;
        ArrayList<n> arrayList = this.f3520g1;
        if (arrayList != null) {
            Iterator<n> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().z(canvas);
            }
        }
        i(false);
        r rVar = this.f3511a;
        if (rVar != null && (vVar = rVar.f3621s) != null) {
            vVar.c();
        }
        super.dispatchDraw(canvas);
        if (this.f3511a == null) {
            return;
        }
        if ((this.A & 1) == 1 && !isInEditMode()) {
            this.f3552x1++;
            long nanoTime = getNanoTime();
            long j12 = this.f3556y1;
            if (j12 != -1) {
                if (nanoTime - j12 > 200000000) {
                    this.Q1 = ((int) ((this.f3552x1 / (((float) j11) * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f3552x1 = 0;
                    this.f3556y1 = nanoTime;
                }
            } else {
                this.f3556y1 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.Q1 + " fps " + androidx.constraintlayout.motion.widget.a.d(this, this.f3517e) + " -> ");
            sb2.append(androidx.constraintlayout.motion.widget.a.d(this, this.f3519g));
            sb2.append(" (progress: ");
            sb2.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sb2.append(" ) state=");
            int i11 = this.f3518f;
            sb2.append(i11 == -1 ? "undefined" : androidx.constraintlayout.motion.widget.a.d(this, i11));
            String sb3 = sb2.toString();
            paint.setColor(-16777216);
            canvas.drawText(sb3, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(sb3, 10.0f, getHeight() - 30, paint);
        }
        if (this.A > 1) {
            if (this.B == null) {
                this.B = new e();
            }
            this.B.a(canvas, this.f3527k, this.f3511a.n(), this.A);
        }
        ArrayList<n> arrayList2 = this.f3520g1;
        if (arrayList2 != null) {
            Iterator<n> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                it3.next().y(canvas);
            }
        }
    }

    void f(float f11) {
        r rVar = this.f3511a;
        if (rVar == null) {
            return;
        }
        float f12 = this.f3535o;
        float f13 = this.f3533n;
        if (f12 != f13 && this.f3545t) {
            this.f3535o = f13;
        }
        float f14 = this.f3535o;
        if (f14 == f11) {
            return;
        }
        this.C = false;
        this.f3541q = f11;
        this.f3531m = rVar.n() / 1000.0f;
        setProgress(this.f3541q);
        this.f3512b = null;
        this.f3515c = this.f3511a.q();
        this.f3545t = false;
        this.f3529l = getNanoTime();
        this.f3549w = true;
        this.f3533n = f14;
        this.f3535o = f14;
        invalidate();
    }

    public int[] getConstraintSetIds() {
        r rVar = this.f3511a;
        if (rVar == null) {
            return null;
        }
        return rVar.l();
    }

    public int getCurrentState() {
        return this.f3518f;
    }

    public ArrayList<r.b> getDefinedTransitions() {
        r rVar = this.f3511a;
        if (rVar == null) {
            return null;
        }
        return rVar.m();
    }

    public androidx.constraintlayout.motion.widget.b getDesignTool() {
        if (this.F == null) {
            this.F = new androidx.constraintlayout.motion.widget.b(this);
        }
        return this.F;
    }

    public int getEndState() {
        return this.f3519g;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f3535o;
    }

    public r getScene() {
        return this.f3511a;
    }

    public int getStartState() {
        return this.f3517e;
    }

    public float getTargetPosition() {
        return this.f3541q;
    }

    public Bundle getTransitionState() {
        if (this.f3534n3 == null) {
            this.f3534n3 = new h();
        }
        this.f3534n3.c();
        return this.f3534n3.b();
    }

    public long getTransitionTimeMs() {
        r rVar = this.f3511a;
        if (rVar != null) {
            this.f3531m = rVar.n() / 1000.0f;
        }
        return this.f3531m * 1000.0f;
    }

    public float getVelocity() {
        return this.f3516d;
    }

    public void h(boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            m mVar = this.f3527k.get(getChildAt(i11));
            if (mVar != null) {
                mVar.e(z11);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i(boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        float interpolation;
        boolean z15;
        if (this.f3537p == -1) {
            this.f3537p = getNanoTime();
        }
        float f11 = this.f3535o;
        if (f11 > BitmapDescriptorFactory.HUE_RED && f11 < 1.0f) {
            this.f3518f = -1;
        }
        boolean z16 = false;
        if (this.R || (this.f3549w && (z11 || this.f3541q != f11))) {
            float signum = Math.signum(this.f3541q - f11);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.f3512b;
            float f12 = !(interpolator instanceof o) ? ((((float) (nanoTime - this.f3537p)) * signum) * 1.0E-9f) / this.f3531m : 0.0f;
            float f13 = this.f3535o + f12;
            if (this.f3545t) {
                f13 = this.f3541q;
            }
            int i12 = (signum > BitmapDescriptorFactory.HUE_RED ? 1 : (signum == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            if ((i12 <= 0 || f13 < this.f3541q) && (signum > BitmapDescriptorFactory.HUE_RED || f13 > this.f3541q)) {
                z12 = false;
            } else {
                f13 = this.f3541q;
                this.f3549w = false;
                z12 = true;
            }
            this.f3535o = f13;
            this.f3533n = f13;
            this.f3537p = nanoTime;
            if (interpolator != null && !z12) {
                if (this.C) {
                    interpolation = interpolator.getInterpolation(((float) (nanoTime - this.f3529l)) * 1.0E-9f);
                    Interpolator interpolator2 = this.f3512b;
                    if (interpolator2 != this.E) {
                        this.f3535o = interpolation;
                        this.f3537p = nanoTime;
                        if (interpolator2 instanceof o) {
                            float a11 = ((o) interpolator2).a();
                            this.f3516d = a11;
                            int i13 = ((Math.abs(a11) * this.f3531m) > 1.0E-5f ? 1 : ((Math.abs(a11) * this.f3531m) == 1.0E-5f ? 0 : -1));
                            if (a11 <= BitmapDescriptorFactory.HUE_RED || interpolation < 1.0f) {
                                z15 = false;
                            } else {
                                this.f3535o = 1.0f;
                                z15 = false;
                                this.f3549w = false;
                                interpolation = 1.0f;
                            }
                            if (a11 < BitmapDescriptorFactory.HUE_RED && interpolation <= BitmapDescriptorFactory.HUE_RED) {
                                this.f3535o = BitmapDescriptorFactory.HUE_RED;
                                this.f3549w = z15;
                                f13 = 0.0f;
                            }
                        }
                    } else {
                        throw null;
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f13);
                    Interpolator interpolator3 = this.f3512b;
                    if (interpolator3 instanceof o) {
                        this.f3516d = ((o) interpolator3).a();
                    } else {
                        this.f3516d = ((interpolator3.getInterpolation(f13 + f12) - interpolation) * signum) / f12;
                    }
                }
                f13 = interpolation;
            } else {
                this.f3516d = f12;
            }
            if (Math.abs(this.f3516d) > 1.0E-5f) {
                setState(j.MOVING);
            }
            if ((i12 > 0 && f13 >= this.f3541q) || (signum <= BitmapDescriptorFactory.HUE_RED && f13 <= this.f3541q)) {
                f13 = this.f3541q;
                this.f3549w = false;
            }
            if (f13 >= 1.0f || f13 <= BitmapDescriptorFactory.HUE_RED) {
                z13 = 0;
                this.f3549w = false;
                setState(j.FINISHED);
            } else {
                z13 = 0;
            }
            int childCount = getChildCount();
            this.R = z13;
            long nanoTime2 = getNanoTime();
            this.f3528k3 = f13;
            Interpolator interpolator4 = this.f3515c;
            float interpolation2 = interpolator4 == null ? f13 : interpolator4.getInterpolation(f13);
            Interpolator interpolator5 = this.f3515c;
            if (interpolator5 != null) {
                float interpolation3 = interpolator5.getInterpolation((signum / this.f3531m) + f13);
                this.f3516d = interpolation3;
                this.f3516d = interpolation3 - this.f3515c.getInterpolation(f13);
            }
            for (int i14 = z13; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                m mVar = this.f3527k.get(childAt);
                if (mVar != null) {
                    this.R |= mVar.q(childAt, interpolation2, nanoTime2, this.f3530l3);
                }
            }
            boolean z17 = (i12 > 0 && f13 >= this.f3541q) || (signum <= BitmapDescriptorFactory.HUE_RED && f13 <= this.f3541q);
            if (!this.R && !this.f3549w && z17) {
                setState(j.FINISHED);
            }
            if (this.f3521g2) {
                requestLayout();
            }
            z14 = true;
            this.R |= !z17;
            if (f13 > BitmapDescriptorFactory.HUE_RED || (i11 = this.f3517e) == -1 || this.f3518f == i11) {
                z16 = false;
            } else {
                this.f3518f = i11;
                this.f3511a.j(i11).g(this);
                setState(j.FINISHED);
                z16 = true;
            }
            if (f13 >= 1.0d) {
                int i15 = this.f3518f;
                int i16 = this.f3519g;
                if (i15 != i16) {
                    this.f3518f = i16;
                    this.f3511a.j(i16).g(this);
                    setState(j.FINISHED);
                    z16 = true;
                }
            }
            if (this.R || this.f3549w) {
                invalidate();
            } else if ((i12 > 0 && f13 == 1.0f) || (signum < BitmapDescriptorFactory.HUE_RED && f13 == BitmapDescriptorFactory.HUE_RED)) {
                setState(j.FINISHED);
            }
            if (!this.R && !this.f3549w && ((i12 > 0 && f13 == 1.0f) || (signum < BitmapDescriptorFactory.HUE_RED && f13 == BitmapDescriptorFactory.HUE_RED))) {
                z();
            }
        } else {
            z14 = true;
        }
        float f14 = this.f3535o;
        if (f14 >= 1.0f) {
            int i17 = this.f3518f;
            int i18 = this.f3519g;
            if (i17 == i18) {
                z14 = z16;
            }
            this.f3518f = i18;
        } else {
            if (f14 <= BitmapDescriptorFactory.HUE_RED) {
                int i19 = this.f3518f;
                int i21 = this.f3517e;
                if (i19 == i21) {
                    z14 = z16;
                }
                this.f3518f = i21;
            }
            this.f3546t3 |= z16;
            if (z16 && !this.f3532m3) {
                requestLayout();
            }
            this.f3533n = this.f3535o;
        }
        z16 = z14;
        this.f3546t3 |= z16;
        if (z16) {
            requestLayout();
        }
        this.f3533n = this.f3535o;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 19) {
            return super.isAttachedToWindow();
        }
        return getWindowToken() != null;
    }

    @Override // androidx.core.view.q
    public void j(View view, int i11) {
        r rVar = this.f3511a;
        if (rVar != null) {
            float f11 = this.Q;
            if (f11 == BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            rVar.M(this.L / f11, this.O / f11);
        }
    }

    @Override // androidx.core.view.q
    public void k(View view, int i11, int i12, int[] iArr, int i13) {
        r.b bVar;
        s z11;
        int q11;
        r rVar = this.f3511a;
        if (rVar == null || (bVar = rVar.f3605c) == null || !bVar.A()) {
            return;
        }
        int i14 = -1;
        if (!bVar.A() || (z11 = bVar.z()) == null || (q11 = z11.q()) == -1 || view.getId() == q11) {
            if (rVar.t()) {
                s z12 = bVar.z();
                if (z12 != null && (z12.e() & 4) != 0) {
                    i14 = i12;
                }
                float f11 = this.f3533n;
                if ((f11 == 1.0f || f11 == BitmapDescriptorFactory.HUE_RED) && view.canScrollVertically(i14)) {
                    return;
                }
            }
            if (bVar.z() != null && (bVar.z().e() & 1) != 0) {
                float u11 = rVar.u(i11, i12);
                float f12 = this.f3535o;
                if ((f12 <= BitmapDescriptorFactory.HUE_RED && u11 < BitmapDescriptorFactory.HUE_RED) || (f12 >= 1.0f && u11 > BitmapDescriptorFactory.HUE_RED)) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        view.setNestedScrollingEnabled(false);
                        view.post(new b(this, view));
                        return;
                    }
                    return;
                }
            }
            float f13 = this.f3533n;
            long nanoTime = getNanoTime();
            float f14 = i11;
            this.L = f14;
            float f15 = i12;
            this.O = f15;
            this.Q = (float) ((nanoTime - this.P) * 1.0E-9d);
            this.P = nanoTime;
            rVar.L(f14, f15);
            if (f13 != this.f3533n) {
                iArr[0] = i11;
                iArr[1] = i12;
            }
            i(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.K = true;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i11) {
        r.b bVar;
        if (i11 != 0) {
            try {
                r rVar = new r(getContext(), this, i11);
                this.f3511a = rVar;
                if (this.f3518f == -1) {
                    this.f3518f = rVar.B();
                    this.f3517e = this.f3511a.B();
                    this.f3519g = this.f3511a.o();
                }
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 19 && !isAttachedToWindow()) {
                    this.f3511a = null;
                    return;
                }
                if (i12 >= 17) {
                    try {
                        Display display = getDisplay();
                        if (display != null) {
                            display.getRotation();
                        }
                    } catch (Exception e11) {
                        throw new IllegalArgumentException("unable to parse MotionScene file", e11);
                    }
                }
                r rVar2 = this.f3511a;
                if (rVar2 != null) {
                    androidx.constraintlayout.widget.d j11 = rVar2.j(this.f3518f);
                    this.f3511a.P(this);
                    ArrayList<n> arrayList = this.f3520g1;
                    if (arrayList != null) {
                        Iterator<n> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            it2.next().x(this);
                        }
                    }
                    if (j11 != null) {
                        j11.i(this);
                    }
                    this.f3517e = this.f3518f;
                }
                z();
                h hVar = this.f3534n3;
                if (hVar != null) {
                    if (this.f3543r3) {
                        post(new a());
                        return;
                    } else {
                        hVar.a();
                        return;
                    }
                }
                r rVar3 = this.f3511a;
                if (rVar3 == null || (bVar = rVar3.f3605c) == null || bVar.v() != 4) {
                    return;
                }
                F();
                setState(j.SETUP);
                setState(j.MOVING);
                return;
            } catch (Exception e12) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e12);
            }
        }
        this.f3511a = null;
    }

    @Override // androidx.core.view.r
    public void m(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        if (this.K || i11 != 0 || i12 != 0) {
            iArr[0] = iArr[0] + i13;
            iArr[1] = iArr[1] + i14;
        }
        this.K = false;
    }

    @Override // androidx.core.view.q
    public void n(View view, int i11, int i12, int i13, int i14, int i15) {
    }

    @Override // androidx.core.view.q
    public boolean o(View view, View view2, int i11, int i12) {
        r.b bVar;
        r rVar = this.f3511a;
        return (rVar == null || (bVar = rVar.f3605c) == null || bVar.z() == null || (this.f3511a.f3605c.z().e() & 2) != 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        r.b bVar;
        int i11;
        Display display;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 17 && (display = getDisplay()) != null) {
            display.getRotation();
        }
        r rVar = this.f3511a;
        if (rVar != null && (i11 = this.f3518f) != -1) {
            androidx.constraintlayout.widget.d j11 = rVar.j(i11);
            this.f3511a.P(this);
            ArrayList<n> arrayList = this.f3520g1;
            if (arrayList != null) {
                Iterator<n> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().x(this);
                }
            }
            if (j11 != null) {
                j11.i(this);
            }
            this.f3517e = this.f3518f;
        }
        z();
        h hVar = this.f3534n3;
        if (hVar != null) {
            if (this.f3543r3) {
                post(new c());
                return;
            } else {
                hVar.a();
                return;
            }
        }
        r rVar2 = this.f3511a;
        if (rVar2 == null || (bVar = rVar2.f3605c) == null || bVar.v() != 4) {
            return;
        }
        F();
        setState(j.SETUP);
        setState(j.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        s z11;
        int q11;
        RectF p11;
        r rVar = this.f3511a;
        if (rVar != null && this.f3525j) {
            v vVar = rVar.f3621s;
            if (vVar != null) {
                vVar.g(motionEvent);
            }
            r.b bVar = this.f3511a.f3605c;
            if (bVar != null && bVar.A() && (z11 = bVar.z()) != null && ((motionEvent.getAction() != 0 || (p11 = z11.p(this, new RectF())) == null || p11.contains(motionEvent.getX(), motionEvent.getY())) && (q11 = z11.q()) != -1)) {
                View view = this.f3548v3;
                if (view == null || view.getId() != q11) {
                    this.f3548v3 = findViewById(q11);
                }
                View view2 = this.f3548v3;
                if (view2 != null) {
                    this.f3547u3.set(view2.getLeft(), this.f3548v3.getTop(), this.f3548v3.getRight(), this.f3548v3.getBottom());
                    if (this.f3547u3.contains(motionEvent.getX(), motionEvent.getY()) && !w(this.f3548v3.getLeft(), this.f3548v3.getTop(), this.f3548v3, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.f3532m3 = true;
        try {
            if (this.f3511a == null) {
                super.onLayout(z11, i11, i12, i13, i14);
                return;
            }
            int i15 = i13 - i11;
            int i16 = i14 - i12;
            if (this.G != i15 || this.H != i16) {
                B();
                i(true);
            }
            this.G = i15;
            this.H = i16;
        } finally {
            this.f3532m3 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        if (this.f3511a == null) {
            super.onMeasure(i11, i12);
            return;
        }
        boolean z11 = (this.f3522h == i11 && this.f3523i == i12) ? false : true;
        if (this.f3546t3) {
            this.f3546t3 = false;
            z();
            A();
            z11 = true;
        }
        boolean z12 = this.mDirtyHierarchy ? true : z11;
        this.f3522h = i11;
        this.f3523i = i12;
        int B = this.f3511a.B();
        int o11 = this.f3511a.o();
        if (z12) {
            if (this.f3517e == -1) {
                if (z12) {
                    super.onMeasure(i11, i12);
                }
                boolean z13 = this.f3521g2;
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int W = this.mLayoutWidget.W() + getPaddingLeft() + getPaddingRight();
                int v11 = this.mLayoutWidget.v() + paddingTop;
                int i15 = this.f3524i3;
                if (i15 == Integer.MIN_VALUE || i15 == 0) {
                    W = (int) (this.f3539p2 + (this.f3528k3 * (this.f3557y2 - i13)));
                    requestLayout();
                }
                int i16 = this.f3526j3;
                if (i16 == Integer.MIN_VALUE || i16 == 0) {
                    v11 = (int) (this.f3553x2 + (this.f3528k3 * (this.Q2 - i14)));
                    requestLayout();
                }
                setMeasuredDimension(W, v11);
                l();
                return;
            }
            super.onMeasure(i11, i12);
            this.f3511a.j(B);
            this.f3511a.j(o11);
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedPreFling(View view, float f11, float f12) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        r rVar = this.f3511a;
        if (rVar != null) {
            rVar.S(isRtl());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        r rVar = this.f3511a;
        if (rVar != null && this.f3525j && rVar.X()) {
            r.b bVar = this.f3511a.f3605c;
            if (bVar != null && !bVar.A()) {
                return super.onTouchEvent(motionEvent);
            }
            this.f3511a.N(motionEvent, getCurrentState(), this);
            if (this.f3511a.f3605c.B(4)) {
                return this.f3511a.f3605c.z().r();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof n) {
            n nVar = (n) view;
            if (this.f3538p1 == null) {
                this.f3538p1 = new CopyOnWriteArrayList<>();
            }
            this.f3538p1.add(nVar);
            if (nVar.w()) {
                if (this.T == null) {
                    this.T = new ArrayList<>();
                }
                this.T.add(nVar);
            }
            if (nVar.v()) {
                if (this.f3513b1 == null) {
                    this.f3513b1 = new ArrayList<>();
                }
                this.f3513b1.add(nVar);
            }
            if (nVar.u()) {
                if (this.f3520g1 == null) {
                    this.f3520g1 = new ArrayList<>();
                }
                this.f3520g1.add(nVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<n> arrayList = this.T;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<n> arrayList2 = this.f3513b1;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void parseLayoutDescription(int i11) {
        this.mConstraintLayoutSpec = null;
    }

    protected void q() {
        int i11;
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if ((this.f3551x != null || ((copyOnWriteArrayList = this.f3538p1) != null && !copyOnWriteArrayList.isEmpty())) && this.V1 == -1) {
            this.V1 = this.f3518f;
            if (this.f3554x3.isEmpty()) {
                i11 = -1;
            } else {
                ArrayList<Integer> arrayList = this.f3554x3;
                i11 = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i12 = this.f3518f;
            if (i11 != i12 && i12 != -1) {
                this.f3554x3.add(Integer.valueOf(i12));
            }
        }
        A();
        Runnable runnable = this.f3536o3;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f3540p3;
        if (iArr == null || this.f3542q3 <= 0) {
            return;
        }
        I(iArr[0]);
        int[] iArr2 = this.f3540p3;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.f3542q3--;
    }

    public void r(int i11, boolean z11, float f11) {
        i iVar = this.f3551x;
        if (iVar != null) {
            iVar.d(this, i11, z11, f11);
        }
        CopyOnWriteArrayList<i> copyOnWriteArrayList = this.f3538p1;
        if (copyOnWriteArrayList != null) {
            Iterator<i> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().d(this, i11, z11, f11);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        r rVar;
        r.b bVar;
        if (!this.f3521g2 && this.f3518f == -1 && (rVar = this.f3511a) != null && (bVar = rVar.f3605c) != null) {
            int x11 = bVar.x();
            if (x11 == 0) {
                return;
            }
            if (x11 == 2) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.f3527k.get(getChildAt(i11)).r();
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void s(int i11, float f11, float f12, float f13, float[] fArr) {
        String resourceName;
        HashMap<View, m> hashMap = this.f3527k;
        View viewById = getViewById(i11);
        m mVar = hashMap.get(viewById);
        if (mVar != null) {
            mVar.k(f11, f12, f13, fArr);
            float y11 = viewById.getY();
            this.f3555y = f11;
            this.f3558z = y11;
            return;
        }
        if (viewById == null) {
            resourceName = "" + i11;
        } else {
            resourceName = viewById.getContext().getResources().getResourceName(i11);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + resourceName);
    }

    public void setDebugMode(int i11) {
        this.A = i11;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z11) {
        this.f3543r3 = z11;
    }

    public void setInteractionEnabled(boolean z11) {
        this.f3525j = z11;
    }

    public void setInterpolatedProgress(float f11) {
        if (this.f3511a != null) {
            setState(j.MOVING);
            Interpolator q11 = this.f3511a.q();
            if (q11 != null) {
                setProgress(q11.getInterpolation(f11));
                return;
            }
        }
        setProgress(f11);
    }

    public void setOnHide(float f11) {
        ArrayList<n> arrayList = this.f3513b1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f3513b1.get(i11).setProgress(f11);
            }
        }
    }

    public void setOnShow(float f11) {
        ArrayList<n> arrayList = this.T;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.T.get(i11).setProgress(f11);
            }
        }
    }

    public void setProgress(float f11) {
        int i11 = (f11 > BitmapDescriptorFactory.HUE_RED ? 1 : (f11 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i11 < 0 || f11 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f3534n3 == null) {
                this.f3534n3 = new h();
            }
            this.f3534n3.e(f11);
            return;
        }
        if (i11 <= 0) {
            if (this.f3535o == 1.0f && this.f3518f == this.f3519g) {
                setState(j.MOVING);
            }
            this.f3518f = this.f3517e;
            if (this.f3535o == BitmapDescriptorFactory.HUE_RED) {
                setState(j.FINISHED);
            }
        } else if (f11 >= 1.0f) {
            if (this.f3535o == BitmapDescriptorFactory.HUE_RED && this.f3518f == this.f3517e) {
                setState(j.MOVING);
            }
            this.f3518f = this.f3519g;
            if (this.f3535o == 1.0f) {
                setState(j.FINISHED);
            }
        } else {
            this.f3518f = -1;
            setState(j.MOVING);
        }
        if (this.f3511a == null) {
            return;
        }
        this.f3545t = true;
        this.f3541q = f11;
        this.f3533n = f11;
        this.f3537p = -1L;
        this.f3529l = -1L;
        this.f3512b = null;
        this.f3549w = true;
        invalidate();
    }

    public void setScene(r rVar) {
        this.f3511a = rVar;
        rVar.S(isRtl());
        B();
    }

    void setStartState(int i11) {
        if (!isAttachedToWindow()) {
            if (this.f3534n3 == null) {
                this.f3534n3 = new h();
            }
            this.f3534n3.f(i11);
            this.f3534n3.d(i11);
            return;
        }
        this.f3518f = i11;
    }

    public void setState(j jVar) {
        j jVar2 = j.FINISHED;
        if (jVar == jVar2 && this.f3518f == -1) {
            return;
        }
        j jVar3 = this.f3544s3;
        this.f3544s3 = jVar;
        j jVar4 = j.MOVING;
        if (jVar3 == jVar4 && jVar == jVar4) {
            p();
        }
        int i11 = d.f3562a[jVar3.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3 && jVar == jVar2) {
                q();
                return;
            }
            return;
        }
        if (jVar == jVar4) {
            p();
        }
        if (jVar == jVar2) {
            q();
        }
    }

    public void setTransition(int i11) {
        if (this.f3511a != null) {
            r.b v11 = v(i11);
            this.f3517e = v11.y();
            this.f3519g = v11.w();
            if (!isAttachedToWindow()) {
                if (this.f3534n3 == null) {
                    this.f3534n3 = new h();
                }
                this.f3534n3.f(this.f3517e);
                this.f3534n3.d(this.f3519g);
                return;
            }
            int i12 = this.f3518f;
            int i13 = this.f3517e;
            this.f3511a.U(v11);
            this.f3511a.j(this.f3517e);
            this.f3511a.j(this.f3519g);
            throw null;
        }
    }

    public void setTransitionDuration(int i11) {
        r rVar = this.f3511a;
        if (rVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            rVar.R(i11);
        }
    }

    public void setTransitionListener(i iVar) {
        this.f3551x = iVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f3534n3 == null) {
            this.f3534n3 = new h();
        }
        this.f3534n3.g(bundle);
        if (isAttachedToWindow()) {
            this.f3534n3.a();
        }
    }

    public androidx.constraintlayout.widget.d t(int i11) {
        r rVar = this.f3511a;
        if (rVar == null) {
            return null;
        }
        return rVar.j(i11);
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.a.b(context, this.f3517e) + "->" + androidx.constraintlayout.motion.widget.a.b(context, this.f3519g) + " (pos:" + this.f3535o + " Dpos/Dt:" + this.f3516d;
    }

    public m u(int i11) {
        return this.f3527k.get(findViewById(i11));
    }

    public r.b v(int i11) {
        return this.f3511a.C(i11);
    }

    public boolean x() {
        return this.f3525j;
    }

    public f y() {
        return g.e();
    }

    public void z() {
        r rVar = this.f3511a;
        if (rVar == null) {
            return;
        }
        if (rVar.g(this, this.f3518f)) {
            requestLayout();
            return;
        }
        int i11 = this.f3518f;
        if (i11 != -1) {
            this.f3511a.f(this, i11);
        }
        if (this.f3511a.X()) {
            this.f3511a.V();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i11, int i12, int i13) {
        setState(j.SETUP);
        this.f3518f = i11;
        this.f3517e = -1;
        this.f3519g = -1;
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.d(i11, i12, i13);
            return;
        }
        r rVar = this.f3511a;
        if (rVar != null) {
            rVar.j(i11).i(this);
        }
    }

    public void setTransition(r.b bVar) {
        this.f3511a.U(bVar);
        setState(j.SETUP);
        if (this.f3518f == this.f3511a.o()) {
            this.f3535o = 1.0f;
            this.f3533n = 1.0f;
            this.f3541q = 1.0f;
        } else {
            this.f3535o = BitmapDescriptorFactory.HUE_RED;
            this.f3533n = BitmapDescriptorFactory.HUE_RED;
            this.f3541q = BitmapDescriptorFactory.HUE_RED;
        }
        this.f3537p = bVar.B(1) ? -1L : getNanoTime();
        int B = this.f3511a.B();
        int o11 = this.f3511a.o();
        if (B == this.f3517e && o11 == this.f3519g) {
            return;
        }
        this.f3517e = B;
        this.f3519g = o11;
        this.f3511a.T(B, o11);
        this.f3511a.j(this.f3517e);
        this.f3511a.j(this.f3519g);
        throw null;
    }
}