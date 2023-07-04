package androidx.camera.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.e1;
import androidx.camera.core.n0;
import androidx.camera.core.r0;
import androidx.camera.view.PreviewView;
import androidx.camera.view.k;
import androidx.core.view.a0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import java.util.concurrent.atomic.AtomicReference;
import z.m0;
import z.z0;

/* loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    /* renamed from: l */
    private static final c f2581l = c.PERFORMANCE;

    /* renamed from: a */
    c f2582a;

    /* renamed from: b */
    k f2583b;

    /* renamed from: c */
    final androidx.camera.view.f f2584c;

    /* renamed from: d */
    final f0<f> f2585d;

    /* renamed from: e */
    final AtomicReference<androidx.camera.view.e> f2586e;

    /* renamed from: f */
    androidx.camera.view.a f2587f;

    /* renamed from: g */
    l f2588g;

    /* renamed from: h */
    private final ScaleGestureDetector f2589h;

    /* renamed from: i */
    private MotionEvent f2590i;

    /* renamed from: j */
    private final View.OnLayoutChangeListener f2591j;

    /* renamed from: k */
    final r0.d f2592k;

    /* loaded from: classes.dex */
    public class a implements r0.d {
        a() {
            PreviewView.this = r1;
        }

        public /* synthetic */ void e(e1 e1Var) {
            PreviewView.this.f2592k.a(e1Var);
        }

        public /* synthetic */ void f(androidx.camera.core.impl.s sVar, e1 e1Var, e1.g gVar) {
            n0.a("PreviewView", "Preview transformation info updated. " + gVar);
            PreviewView.this.f2584c.p(gVar, e1Var.l(), sVar.i().c().intValue() == 0);
            PreviewView.this.e();
        }

        public /* synthetic */ void g(androidx.camera.view.e eVar, androidx.camera.core.impl.s sVar) {
            if (PreviewView.this.f2586e.compareAndSet(eVar, null)) {
                eVar.l(f.IDLE);
            }
            eVar.f();
            sVar.j().b(eVar);
        }

        @Override // androidx.camera.core.r0.d
        public void a(final e1 e1Var) {
            k qVar;
            if (!a0.j.b()) {
                androidx.core.content.b.getMainExecutor(PreviewView.this.getContext()).execute(new Runnable() { // from class: androidx.camera.view.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreviewView.a.this.e(e1Var);
                    }
                });
                return;
            }
            n0.a("PreviewView", "Surface requested by Preview.");
            final androidx.camera.core.impl.s j11 = e1Var.j();
            e1Var.w(androidx.core.content.b.getMainExecutor(PreviewView.this.getContext()), new e1.h() { // from class: androidx.camera.view.h
                @Override // androidx.camera.core.e1.h
                public final void a(e1.g gVar) {
                    PreviewView.a.this.f(j11, e1Var, gVar);
                }
            });
            PreviewView previewView = PreviewView.this;
            if (PreviewView.f(e1Var, previewView.f2582a)) {
                PreviewView previewView2 = PreviewView.this;
                qVar = new x(previewView2, previewView2.f2584c);
            } else {
                PreviewView previewView3 = PreviewView.this;
                qVar = new q(previewView3, previewView3.f2584c);
            }
            previewView.f2583b = qVar;
            androidx.camera.core.impl.r i11 = j11.i();
            PreviewView previewView4 = PreviewView.this;
            final androidx.camera.view.e eVar = new androidx.camera.view.e(i11, previewView4.f2585d, previewView4.f2583b);
            PreviewView.this.f2586e.set(eVar);
            j11.j().a(androidx.core.content.b.getMainExecutor(PreviewView.this.getContext()), eVar);
            PreviewView.this.f2583b.g(e1Var, new k.a() { // from class: androidx.camera.view.i
                @Override // androidx.camera.view.k.a
                public final void a() {
                    PreviewView.a.this.g(eVar, j11);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f2594a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2595b;

        static {
            int[] iArr = new int[c.values().length];
            f2595b = iArr;
            try {
                iArr[c.COMPATIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2595b[c.PERFORMANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[e.values().length];
            f2594a = iArr2;
            try {
                iArr2[e.FILL_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2594a[e.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2594a[e.FILL_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2594a[e.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2594a[e.FIT_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2594a[e.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        PERFORMANCE(0),
        COMPATIBLE(1);
        
        private final int mId;

        c(int i11) {
            this.mId = i11;
        }

        static c fromId(int i11) {
            c[] values;
            for (c cVar : values()) {
                if (cVar.mId == i11) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i11);
        }

        int getId() {
            return this.mId;
        }
    }

    /* loaded from: classes.dex */
    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        d() {
            PreviewView.this = r1;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            androidx.camera.view.a aVar = PreviewView.this.f2587f;
            return true;
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);
        
        private final int mId;

        e(int i11) {
            this.mId = i11;
        }

        static e fromId(int i11) {
            e[] values;
            for (e eVar : values()) {
                if (eVar.mId == i11) {
                    return eVar;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i11);
        }

        int getId() {
            return this.mId;
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        IDLE,
        STREAMING
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b(boolean z11) {
        getDisplay();
        getViewPort();
    }

    public /* synthetic */ void d(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if ((i13 - i11 == i17 - i15 && i14 - i12 == i18 - i16) ? false : true) {
            e();
            b(true);
        }
    }

    static boolean f(e1 e1Var, c cVar) {
        int i11;
        boolean equals = e1Var.j().i().g().equals("androidx.camera.camera2.legacy");
        boolean z11 = h0.a.a(h0.d.class) != null;
        if (e1Var.m() || Build.VERSION.SDK_INT <= 24 || equals || z11 || (i11 = b.f2595b[cVar.ordinal()]) == 1) {
            return true;
        }
        if (i11 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
    }

    private int getViewPortScaleType() {
        switch (b.f2594a[getScaleType().ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
                return 3;
            default:
                throw new IllegalStateException("Unexpected scale type: " + getScaleType());
        }
    }

    public z0 c(int i11) {
        a0.j.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new z0.a(new Rational(getWidth(), getHeight()), i11).c(getViewPortScaleType()).b(getLayoutDirection()).a();
    }

    void e() {
        k kVar = this.f2583b;
        if (kVar != null) {
            kVar.h();
        }
        this.f2588g.e(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public Bitmap getBitmap() {
        a0.j.a();
        k kVar = this.f2583b;
        if (kVar == null) {
            return null;
        }
        return kVar.a();
    }

    public androidx.camera.view.a getController() {
        a0.j.a();
        return this.f2587f;
    }

    public c getImplementationMode() {
        a0.j.a();
        return this.f2582a;
    }

    public m0 getMeteringPointFactory() {
        a0.j.a();
        return this.f2588g;
    }

    public i0.a getOutputTransform() {
        Matrix matrix;
        a0.j.a();
        try {
            matrix = this.f2584c.i(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect h11 = this.f2584c.h();
        if (matrix != null && h11 != null) {
            matrix.preConcat(y.a(h11));
            if (this.f2583b instanceof x) {
                matrix.postConcat(getMatrix());
            } else {
                n0.m("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
            }
            return new i0.a(matrix, new Size(h11.width(), h11.height()));
        }
        n0.a("PreviewView", "Transform info is not ready");
        return null;
    }

    public LiveData<f> getPreviewStreamState() {
        return this.f2585d;
    }

    public e getScaleType() {
        a0.j.a();
        return this.f2584c.g();
    }

    public r0.d getSurfaceProvider() {
        a0.j.a();
        return this.f2592k;
    }

    public z0 getViewPort() {
        a0.j.a();
        if (getDisplay() == null) {
            return null;
        }
        return c(getDisplay().getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnLayoutChangeListener(this.f2591j);
        k kVar = this.f2583b;
        if (kVar != null) {
            kVar.d();
        }
        b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f2591j);
        k kVar = this.f2583b;
        if (kVar != null) {
            kVar.e();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        this.f2590i = null;
        return super.performClick();
    }

    public void setController(androidx.camera.view.a aVar) {
        a0.j.a();
        b(false);
    }

    public void setImplementationMode(c cVar) {
        a0.j.a();
        this.f2582a = cVar;
    }

    public void setScaleType(e eVar) {
        a0.j.a();
        this.f2584c.o(eVar);
        e();
        b(false);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        c cVar = f2581l;
        this.f2582a = cVar;
        androidx.camera.view.f fVar = new androidx.camera.view.f();
        this.f2584c = fVar;
        this.f2585d = new f0<>(f.IDLE);
        this.f2586e = new AtomicReference<>();
        this.f2588g = new l(fVar);
        this.f2591j = new View.OnLayoutChangeListener() { // from class: androidx.camera.view.g
            {
                PreviewView.this = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
                PreviewView.this.d(view, i13, i14, i15, i16, i17, i18, i19, i21);
            }
        };
        this.f2592k = new a();
        a0.j.a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = m.f2638a;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i11, i12);
        a0.u0(this, context, iArr, attributeSet, obtainStyledAttributes, i11, i12);
        try {
            setScaleType(e.fromId(obtainStyledAttributes.getInteger(m.f2640c, fVar.g().getId())));
            setImplementationMode(c.fromId(obtainStyledAttributes.getInteger(m.f2639b, cVar.getId())));
            obtainStyledAttributes.recycle();
            this.f2589h = new ScaleGestureDetector(context, new d());
            if (getBackground() == null) {
                setBackgroundColor(androidx.core.content.b.getColor(getContext(), 17170444));
            }
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }
}