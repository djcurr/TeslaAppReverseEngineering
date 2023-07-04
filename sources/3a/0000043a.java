package androidx.compose.ui.platform;

import a2.a;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.z1;
import androidx.lifecycle.DefaultLifecycleObserver;
import b2.a;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h2.f0;
import h2.k;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r2.d;
import s1.f;

/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements h2.f0, d2, d2.f0, DefaultLifecycleObserver {

    /* renamed from: v3 */
    public static final a f2759v3 = new a(null);

    /* renamed from: w3 */
    private static Class<?> f2760w3;

    /* renamed from: x3 */
    private static Method f2761x3;
    private final l A;
    private final k B;
    private final h2.h0 C;
    private boolean E;
    private i0 F;
    private s0 G;
    private x2.b H;
    private boolean K;
    private final h2.q L;
    private final y1 O;
    private long P;
    private final int[] Q;
    private final c1.o0 Q1;
    private final d.a Q2;
    private final float[] R;
    private final float[] T;
    private h00.l<? super b, vz.b0> V1;

    /* renamed from: a */
    private long f2762a;

    /* renamed from: b */
    private boolean f2763b;

    /* renamed from: b1 */
    private final float[] f2764b1;

    /* renamed from: b2 */
    private final ViewTreeObserver.OnGlobalLayoutListener f2765b2;

    /* renamed from: c */
    private final h2.m f2766c;

    /* renamed from: d */
    private x2.d f2767d;

    /* renamed from: e */
    private final l2.n f2768e;

    /* renamed from: f */
    private final r1.h f2769f;

    /* renamed from: g */
    private final g2 f2770g;

    /* renamed from: g1 */
    private long f2771g1;

    /* renamed from: g2 */
    private final ViewTreeObserver.OnScrollChangedListener f2772g2;

    /* renamed from: h */
    private final b2.e f2773h;

    /* renamed from: i */
    private final t1.v f2774i;

    /* renamed from: i3 */
    private final c1.o0 f2775i3;

    /* renamed from: j */
    private final h2.k f2776j;

    /* renamed from: j3 */
    private final z1.a f2777j3;

    /* renamed from: k */
    private final h2.l0 f2778k;

    /* renamed from: k3 */
    private final a2.c f2779k3;

    /* renamed from: l */
    private final l2.r f2780l;

    /* renamed from: l3 */
    private final p1 f2781l3;

    /* renamed from: m */
    private final t f2782m;

    /* renamed from: m3 */
    private MotionEvent f2783m3;

    /* renamed from: n */
    private final p1.i f2784n;

    /* renamed from: n3 */
    private long f2785n3;

    /* renamed from: o */
    private final List<h2.e0> f2786o;

    /* renamed from: o3 */
    private final e2<h2.e0> f2787o3;

    /* renamed from: p */
    private List<h2.e0> f2788p;

    /* renamed from: p1 */
    private boolean f2789p1;

    /* renamed from: p2 */
    private final ViewTreeObserver.OnTouchModeChangeListener f2790p2;

    /* renamed from: p3 */
    private final h f2791p3;

    /* renamed from: q */
    private boolean f2792q;

    /* renamed from: q3 */
    private final Runnable f2793q3;

    /* renamed from: r3 */
    private boolean f2794r3;

    /* renamed from: s3 */
    private final h00.a<vz.b0> f2795s3;

    /* renamed from: t */
    private final d2.h f2796t;

    /* renamed from: t3 */
    private d2.p f2797t3;

    /* renamed from: u3 */
    private final d2.r f2798u3;

    /* renamed from: w */
    private final d2.y f2799w;

    /* renamed from: x */
    private h00.l<? super Configuration, vz.b0> f2800x;

    /* renamed from: x1 */
    private long f2801x1;

    /* renamed from: x2 */
    private final s2.f0 f2802x2;

    /* renamed from: y */
    private final p1.a f2803y;

    /* renamed from: y1 */
    private boolean f2804y1;

    /* renamed from: y2 */
    private final s2.c0 f2805y2;

    /* renamed from: z */
    private boolean f2806z;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean b() {
            try {
                if (AndroidComposeView.f2760w3 == null) {
                    AndroidComposeView.f2760w3 = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.f2760w3;
                    AndroidComposeView.f2761x3 = cls == null ? null : cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                Method method = AndroidComposeView.f2761x3;
                Object invoke = method == null ? null : method.invoke(null, "debug.layout", Boolean.FALSE);
                Boolean bool = invoke instanceof Boolean ? invoke : null;
                if (bool == null) {
                    return false;
                }
                return bool.booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final androidx.lifecycle.v f2807a;

        /* renamed from: b */
        private final androidx.savedstate.c f2808b;

        public b(androidx.lifecycle.v lifecycleOwner, androidx.savedstate.c savedStateRegistryOwner) {
            kotlin.jvm.internal.s.g(lifecycleOwner, "lifecycleOwner");
            kotlin.jvm.internal.s.g(savedStateRegistryOwner, "savedStateRegistryOwner");
            this.f2807a = lifecycleOwner;
            this.f2808b = savedStateRegistryOwner;
        }

        public final androidx.lifecycle.v a() {
            return this.f2807a;
        }

        public final androidx.savedstate.c b() {
            return this.f2808b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<a2.a, Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(1);
            AndroidComposeView.this = r1;
        }

        public final Boolean a(int i11) {
            boolean requestFocusFromTouch;
            a.C0006a c0006a = a2.a.f130b;
            if (a2.a.f(i11, c0006a.b())) {
                requestFocusFromTouch = AndroidComposeView.this.isInTouchMode();
            } else {
                requestFocusFromTouch = a2.a.f(i11, c0006a.a()) ? AndroidComposeView.this.isInTouchMode() ? AndroidComposeView.this.requestFocusFromTouch() : true : false;
            }
            return Boolean.valueOf(requestFocusFromTouch);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Boolean invoke(a2.a aVar) {
            return a(aVar.i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<Configuration, vz.b0> {

        /* renamed from: a */
        public static final d f2810a = new d();

        d() {
            super(1);
        }

        public final void a(Configuration it2) {
            kotlin.jvm.internal.s.g(it2, "it");
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Configuration configuration) {
            a(configuration);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.l<b2.b, Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(1);
            AndroidComposeView.this = r1;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Boolean invoke(b2.b bVar) {
            return m0invokeZmokQxo(bVar.f());
        }

        /* renamed from: invoke-ZmokQxo */
        public final Boolean m0invokeZmokQxo(KeyEvent it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            r1.c J = AndroidComposeView.this.J(it2);
            if (J != null && b2.c.e(b2.d.b(it2), b2.c.f7345a.a())) {
                return Boolean.valueOf(AndroidComposeView.this.getFocusManager().a(J.o()));
            }
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements d2.r {
        f() {
            AndroidComposeView.this = r1;
        }

        @Override // d2.r
        public void a(d2.p value) {
            kotlin.jvm.internal.s.g(value, "value");
            AndroidComposeView.this.f2797t3 = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g() {
            super(0);
            AndroidComposeView.this = r1;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            MotionEvent motionEvent = AndroidComposeView.this.f2783m3;
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    AndroidComposeView.this.f2785n3 = SystemClock.uptimeMillis();
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.post(androidComposeView.f2791p3);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements Runnable {
        h() {
            AndroidComposeView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent motionEvent = AndroidComposeView.this.f2783m3;
            if (motionEvent != null) {
                boolean z11 = false;
                boolean z12 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (!z12 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                    z11 = true;
                }
                if (z11) {
                    int i11 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i11 = 2;
                    }
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.i0(motionEvent, i11, androidComposeView.f2785n3, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.u implements h00.l<l2.v, vz.b0> {

        /* renamed from: a */
        public static final i f2815a = new i();

        i() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(l2.v vVar) {
            invoke2(vVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(l2.v $receiver) {
            kotlin.jvm.internal.s.g($receiver, "$this$$receiver");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.u implements h00.l<h00.a<? extends vz.b0>, vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j() {
            super(1);
            AndroidComposeView.this = r1;
        }

        public static /* synthetic */ void a(h00.a aVar) {
            c(aVar);
        }

        public static final void c(h00.a tmp0) {
            kotlin.jvm.internal.s.g(tmp0, "$tmp0");
            tmp0.invoke();
        }

        public final void b(final h00.a<vz.b0> command) {
            kotlin.jvm.internal.s.g(command, "command");
            Handler handler = AndroidComposeView.this.getHandler();
            if ((handler == null ? null : handler.getLooper()) == Looper.myLooper()) {
                command.invoke();
                return;
            }
            Handler handler2 = AndroidComposeView.this.getHandler();
            if (handler2 == null) {
                return;
            }
            handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.r
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidComposeView.j.a(command);
                }
            });
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(h00.a<? extends vz.b0> aVar) {
            b(aVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView(Context context) {
        super(context);
        c1.o0 d11;
        c1.o0 d12;
        kotlin.jvm.internal.s.g(context, "context");
        f.a aVar = s1.f.f49950b;
        this.f2762a = aVar.b();
        this.f2763b = true;
        this.f2766c = new h2.m(null, 1, null);
        this.f2767d = x2.a.a(context);
        l2.n nVar = new l2.n(l2.n.f36439c.a(), false, false, i.f2815a);
        this.f2768e = nVar;
        r1.h hVar = new r1.h(null, 1, null);
        this.f2769f = hVar;
        this.f2770g = new g2();
        b2.e eVar = new b2.e(new e(), null);
        this.f2773h = eVar;
        this.f2774i = new t1.v();
        h2.k kVar = new h2.k(false, 1, null);
        kVar.b(f2.q0.f25595b);
        kVar.i(o1.f.f42062f1.g0(nVar).g0(hVar.e()).g0(eVar));
        kVar.f(getDensity());
        this.f2776j = kVar;
        this.f2778k = this;
        this.f2780l = new l2.r(getRoot());
        t tVar = new t(this);
        this.f2782m = tVar;
        this.f2784n = new p1.i();
        this.f2786o = new ArrayList();
        this.f2796t = new d2.h();
        this.f2799w = new d2.y(getRoot());
        this.f2800x = d.f2810a;
        this.f2803y = D() ? new p1.a(this, getAutofillTree()) : null;
        this.A = new l(context);
        this.B = new k(context);
        this.C = new h2.h0(new j());
        this.L = new h2.q(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        kotlin.jvm.internal.s.f(viewConfiguration, "get(context)");
        this.O = new h0(viewConfiguration);
        this.P = x2.k.f56947b.a();
        this.Q = new int[]{0, 0};
        this.R = t1.k0.b(null, 1, null);
        this.T = t1.k0.b(null, 1, null);
        this.f2764b1 = t1.k0.b(null, 1, null);
        this.f2771g1 = -1L;
        this.f2801x1 = aVar.a();
        this.f2804y1 = true;
        d11 = c1.s1.d(null, null, 2, null);
        this.Q1 = d11;
        this.f2765b2 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.n
            {
                AndroidComposeView.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.r(AndroidComposeView.this);
            }
        };
        this.f2772g2 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.o
            {
                AndroidComposeView.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.s(AndroidComposeView.this);
            }
        };
        this.f2790p2 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.p
            {
                AndroidComposeView.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z11) {
                AndroidComposeView.p(AndroidComposeView.this, z11);
            }
        };
        s2.f0 f0Var = new s2.f0(this);
        this.f2802x2 = f0Var;
        this.f2805y2 = y.e().invoke(f0Var);
        this.Q2 = new a0(context);
        Configuration configuration = context.getResources().getConfiguration();
        kotlin.jvm.internal.s.f(configuration, "context.resources.configuration");
        d12 = c1.s1.d(y.d(configuration), null, 2, null);
        this.f2775i3 = d12;
        this.f2777j3 = new z1.c(this);
        this.f2779k3 = new a2.c(isInTouchMode() ? a2.a.f130b.b() : a2.a.f130b.a(), new c(), null);
        this.f2781l3 = new c0(this);
        this.f2787o3 = new e2<>();
        this.f2791p3 = new h();
        this.f2793q3 = new Runnable() { // from class: androidx.compose.ui.platform.q
            {
                AndroidComposeView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.q(AndroidComposeView.this);
            }
        };
        this.f2795s3 = new g();
        setWillNotDraw(false);
        setFocusable(true);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            x.f3136a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        androidx.core.view.a0.w0(this, tVar);
        h00.l<d2, vz.b0> a11 = d2.f2891s.a();
        if (a11 != null) {
            a11.invoke(this);
        }
        getRoot().z(this);
        if (i11 >= 29) {
            v.f3120a.a(this);
        }
        this.f2798u3 = new f();
    }

    private final boolean D() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final void F(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            int i12 = i11 + 1;
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).G();
            } else if (childAt instanceof ViewGroup) {
                F((ViewGroup) childAt);
            }
            i11 = i12;
        }
    }

    private final vz.p<Integer, Integer> H(int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return vz.v.a(Integer.valueOf(size), Integer.valueOf(size));
                }
                throw new IllegalStateException();
            }
            return vz.v.a(0, Integer.MAX_VALUE);
        }
        return vz.v.a(0, Integer.valueOf(size));
    }

    private final View I(int i11, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            int i12 = 0;
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (kotlin.jvm.internal.s.c(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i11))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                while (i12 < childCount) {
                    int i13 = i12 + 1;
                    View childAt = viewGroup.getChildAt(i12);
                    kotlin.jvm.internal.s.f(childAt, "currentView.getChildAt(i)");
                    View I = I(i11, childAt);
                    if (I != null) {
                        return I;
                    }
                    i12 = i13;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static final void K(AndroidComposeView this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.m0();
    }

    private final int L(MotionEvent motionEvent) {
        removeCallbacks(this.f2791p3);
        try {
            Y(motionEvent);
            boolean z11 = true;
            this.f2789p1 = true;
            a(false);
            this.f2797t3 = null;
            Trace.beginSection("AndroidOwner:onTouch");
            int actionMasked = motionEvent.getActionMasked();
            MotionEvent motionEvent2 = this.f2783m3;
            boolean z12 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
            if (motionEvent2 != null && M(motionEvent, motionEvent2)) {
                if (Q(motionEvent2)) {
                    this.f2799w.c();
                } else if (motionEvent2.getActionMasked() != 10 && z12) {
                    j0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                }
            }
            if (motionEvent.getToolType(0) != 3) {
                z11 = false;
            }
            if (!z12 && z11 && actionMasked != 3 && actionMasked != 9 && R(motionEvent)) {
                j0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.f2783m3 = MotionEvent.obtainNoHistory(motionEvent);
            int h02 = h0(motionEvent);
            Trace.endSection();
            if (Build.VERSION.SDK_INT >= 24) {
                w.f3133a.a(this, this.f2797t3);
            }
            return h02;
        } finally {
            this.f2789p1 = false;
        }
    }

    private final boolean M(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final void N(h2.k kVar) {
        kVar.s0();
        d1.e<h2.k> j02 = kVar.j0();
        int l11 = j02.l();
        if (l11 > 0) {
            int i11 = 0;
            h2.k[] k11 = j02.k();
            do {
                N(k11[i11]);
                i11++;
            } while (i11 < l11);
        }
    }

    private final void O(h2.k kVar) {
        this.L.n(kVar);
        d1.e<h2.k> j02 = kVar.j0();
        int l11 = j02.l();
        if (l11 > 0) {
            int i11 = 0;
            h2.k[] k11 = j02.k();
            do {
                O(k11[i11]);
                i11++;
            } while (i11 < l11);
        }
    }

    private final boolean P(MotionEvent motionEvent) {
        return Float.isNaN(motionEvent.getX()) || Float.isNaN(motionEvent.getY()) || Float.isNaN(motionEvent.getRawX()) || Float.isNaN(motionEvent.getRawY());
    }

    private final boolean Q(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean R(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (BitmapDescriptorFactory.HUE_RED <= x11 && x11 <= ((float) getWidth())) {
            if (BitmapDescriptorFactory.HUE_RED <= y11 && y11 <= ((float) getHeight())) {
                return true;
            }
        }
        return false;
    }

    private final boolean S(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f2783m3) != null) {
            if (motionEvent.getRawX() == motionEvent2.getRawX()) {
                return !((motionEvent.getRawY() > motionEvent2.getRawY() ? 1 : (motionEvent.getRawY() == motionEvent2.getRawY() ? 0 : -1)) == 0);
            }
            return true;
        }
        return true;
    }

    private final void V(float[] fArr, Matrix matrix) {
        t1.g.b(this.f2764b1, matrix);
        y.g(fArr, this.f2764b1);
    }

    private final void W(float[] fArr, float f11, float f12) {
        t1.k0.e(this.f2764b1);
        t1.k0.i(this.f2764b1, f11, f12, BitmapDescriptorFactory.HUE_RED, 4, null);
        y.g(fArr, this.f2764b1);
    }

    private final void X() {
        if (this.f2789p1) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f2771g1) {
            this.f2771g1 = currentAnimationTimeMillis;
            Z();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.Q);
            int[] iArr = this.Q;
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.Q;
            this.f2801x1 = s1.g.a(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
    }

    private final void Y(MotionEvent motionEvent) {
        this.f2771g1 = AnimationUtils.currentAnimationTimeMillis();
        Z();
        long c11 = t1.k0.c(this.R, s1.g.a(motionEvent.getX(), motionEvent.getY()));
        this.f2801x1 = s1.g.a(motionEvent.getRawX() - s1.f.l(c11), motionEvent.getRawY() - s1.f.m(c11));
    }

    private final void Z() {
        t1.k0.e(this.R);
        l0(this, this.R);
        a1.a(this.R, this.T);
    }

    private final void c0(h2.k kVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (this.K && kVar != null) {
            while (kVar != null && kVar.Y() == k.g.InMeasureBlock) {
                kVar = kVar.e0();
            }
            if (kVar == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() != 0 && getHeight() != 0) {
            invalidate();
        } else {
            requestLayout();
        }
    }

    static /* synthetic */ void d0(AndroidComposeView androidComposeView, h2.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = null;
        }
        androidComposeView.c0(kVar);
    }

    public static final void e0(AndroidComposeView this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.m0();
    }

    public static final void f0(AndroidComposeView this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f2794r3 = false;
        MotionEvent motionEvent = this$0.f2783m3;
        kotlin.jvm.internal.s.e(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            this$0.h0(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    private final int h0(MotionEvent motionEvent) {
        d2.x xVar;
        d2.w c11 = this.f2796t.c(motionEvent, this);
        if (c11 != null) {
            List<d2.x> b11 = c11.b();
            ListIterator<d2.x> listIterator = b11.listIterator(b11.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    xVar = null;
                    break;
                }
                xVar = listIterator.previous();
                if (xVar.a()) {
                    break;
                }
            }
            d2.x xVar2 = xVar;
            if (xVar2 != null) {
                this.f2762a = xVar2.e();
            }
            int b12 = this.f2799w.b(c11, this, R(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && !d2.g0.c(b12)) {
                this.f2796t.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
                return b12;
            }
            return b12;
        }
        this.f2799w.c();
        return d2.z.a(false, false);
    }

    public final void i0(MotionEvent motionEvent, int i11, long j11, boolean z11) {
        int actionMasked = motionEvent.getActionMasked();
        int i12 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i12 = motionEvent.getActionIndex();
            }
        } else if (i11 != 9 && i11 != 10) {
            i12 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i12 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i13 = 0; i13 < pointerCount; i13++) {
            pointerPropertiesArr[i13] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i14 = 0; i14 < pointerCount; i14++) {
            pointerCoordsArr[i14] = new MotionEvent.PointerCoords();
        }
        int i15 = 0;
        while (i15 < pointerCount) {
            int i16 = i15 + 1;
            int i17 = ((i12 < 0 || i15 < i12) ? 0 : 1) + i15;
            motionEvent.getPointerProperties(i17, pointerPropertiesArr[i15]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i15];
            motionEvent.getPointerCoords(i17, pointerCoords);
            long m11 = m(s1.g.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = s1.f.l(m11);
            pointerCoords.y = s1.f.m(m11);
            i15 = i16;
        }
        MotionEvent event = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j11 : motionEvent.getDownTime(), j11, i11, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z11 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        d2.h hVar = this.f2796t;
        kotlin.jvm.internal.s.f(event, "event");
        d2.w c11 = hVar.c(event, this);
        kotlin.jvm.internal.s.e(c11);
        this.f2799w.b(c11, this, true);
        event.recycle();
    }

    static /* synthetic */ void j0(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i11, long j11, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z11 = true;
        }
        androidComposeView.i0(motionEvent, i11, j11, z11);
    }

    public static final void k0(AndroidComposeView this$0, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f2779k3.b(z11 ? a2.a.f130b.b() : a2.a.f130b.a());
        this$0.f2769f.c();
    }

    private final void l0(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            l0((View) parent, fArr);
            W(fArr, -view.getScrollX(), -view.getScrollY());
            W(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.Q);
            W(fArr, -view.getScrollX(), -view.getScrollY());
            int[] iArr = this.Q;
            W(fArr, iArr[0], iArr[1]);
        }
        Matrix viewMatrix = view.getMatrix();
        if (viewMatrix.isIdentity()) {
            return;
        }
        kotlin.jvm.internal.s.f(viewMatrix, "viewMatrix");
        V(fArr, viewMatrix);
    }

    private final void m0() {
        getLocationOnScreen(this.Q);
        boolean z11 = false;
        if (x2.k.h(this.P) != this.Q[0] || x2.k.i(this.P) != this.Q[1]) {
            int[] iArr = this.Q;
            this.P = x2.l.a(iArr[0], iArr[1]);
            z11 = true;
        }
        this.L.c(z11);
    }

    public static /* synthetic */ void p(AndroidComposeView androidComposeView, boolean z11) {
        k0(androidComposeView, z11);
    }

    public static /* synthetic */ void q(AndroidComposeView androidComposeView) {
        f0(androidComposeView);
    }

    public static /* synthetic */ void r(AndroidComposeView androidComposeView) {
        K(androidComposeView);
    }

    public static /* synthetic */ void s(AndroidComposeView androidComposeView) {
        e0(androidComposeView);
    }

    private void setLayoutDirection(x2.q qVar) {
        this.f2775i3.setValue(qVar);
    }

    private final void setViewTreeOwners(b bVar) {
        this.Q1.setValue(bVar);
    }

    public final Object E(zz.d<? super vz.b0> dVar) {
        Object d11;
        Object k11 = this.f2782m.k(dVar);
        d11 = a00.d.d();
        return k11 == d11 ? k11 : vz.b0.f54756a;
    }

    public final void G() {
        if (this.f2806z) {
            getSnapshotObserver().a();
            this.f2806z = false;
        }
        i0 i0Var = this.F;
        if (i0Var != null) {
            F(i0Var);
        }
    }

    public r1.c J(KeyEvent keyEvent) {
        kotlin.jvm.internal.s.g(keyEvent, "keyEvent");
        long a11 = b2.d.a(keyEvent);
        a.C0143a c0143a = b2.a.f7333a;
        if (b2.a.l(a11, c0143a.j())) {
            return r1.c.i(b2.d.e(keyEvent) ? r1.c.f48976b.f() : r1.c.f48976b.d());
        } else if (b2.a.l(a11, c0143a.e())) {
            return r1.c.i(r1.c.f48976b.g());
        } else {
            if (b2.a.l(a11, c0143a.d())) {
                return r1.c.i(r1.c.f48976b.c());
            }
            if (b2.a.l(a11, c0143a.f())) {
                return r1.c.i(r1.c.f48976b.h());
            }
            if (b2.a.l(a11, c0143a.c())) {
                return r1.c.i(r1.c.f48976b.a());
            }
            if (b2.a.l(a11, c0143a.b()) ? true : b2.a.l(a11, c0143a.g()) ? true : b2.a.l(a11, c0143a.i())) {
                return r1.c.i(r1.c.f48976b.b());
            }
            if (b2.a.l(a11, c0143a.a()) ? true : b2.a.l(a11, c0143a.h())) {
                return r1.c.i(r1.c.f48976b.e());
            }
            return null;
        }
    }

    public final Object T(zz.d<? super vz.b0> dVar) {
        Object d11;
        Object q11 = this.f2802x2.q(dVar);
        d11 = a00.d.d();
        return q11 == d11 ? q11 : vz.b0.f54756a;
    }

    public final void U(h2.e0 layer, boolean z11) {
        kotlin.jvm.internal.s.g(layer, "layer");
        if (!z11) {
            if (!this.f2792q && !this.f2786o.remove(layer)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (!this.f2792q) {
            this.f2786o.add(layer);
        } else {
            List list = this.f2788p;
            if (list == null) {
                list = new ArrayList();
                this.f2788p = list;
            }
            list.add(layer);
        }
    }

    @Override // h2.f0
    public void a(boolean z11) {
        if (this.L.j(z11 ? this.f2795s3 : null)) {
            requestLayout();
        }
        h2.q.d(this.L, false, 1, null);
    }

    public final boolean a0(h2.e0 layer) {
        kotlin.jvm.internal.s.g(layer, "layer");
        boolean z11 = this.G == null || z1.f3176m.b() || Build.VERSION.SDK_INT >= 23 || this.f2787o3.b() < 10;
        if (z11) {
            this.f2787o3.d(layer);
        }
        return z11;
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> values) {
        p1.a aVar;
        kotlin.jvm.internal.s.g(values, "values");
        if (!D() || (aVar = this.f2803y) == null) {
            return;
        }
        p1.c.a(aVar, values);
    }

    @Override // h2.f0
    public h2.e0 b(h00.l<? super t1.u, vz.b0> drawBlock, h00.a<vz.b0> invalidateParentLayer) {
        s0 a2Var;
        kotlin.jvm.internal.s.g(drawBlock, "drawBlock");
        kotlin.jvm.internal.s.g(invalidateParentLayer, "invalidateParentLayer");
        h2.e0 c11 = this.f2787o3.c();
        if (c11 != null) {
            c11.f(drawBlock, invalidateParentLayer);
            return c11;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT >= 23 && this.f2804y1) {
            try {
                return new j1(this, drawBlock, invalidateParentLayer);
            } catch (Throwable unused) {
                this.f2804y1 = false;
            }
        }
        if (this.G == null) {
            z1.c cVar = z1.f3176m;
            if (!cVar.a()) {
                cVar.d(new View(getContext()));
            }
            if (cVar.b()) {
                Context context = getContext();
                kotlin.jvm.internal.s.f(context, "context");
                a2Var = new s0(context);
            } else {
                Context context2 = getContext();
                kotlin.jvm.internal.s.f(context2, "context");
                a2Var = new a2(context2);
            }
            this.G = a2Var;
            addView(a2Var);
        }
        s0 s0Var = this.G;
        kotlin.jvm.internal.s.e(s0Var);
        return new z1(this, s0Var, drawBlock, invalidateParentLayer);
    }

    public final void b0() {
        this.f2806z = true;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i11) {
        return this.f2782m.l(false, i11, this.f2762a);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i11) {
        return this.f2782m.l(true, i11, this.f2762a);
    }

    @Override // h2.f0
    public void d(h2.k node) {
        kotlin.jvm.internal.s.g(node, "node");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        if (!isAttachedToWindow()) {
            N(getRoot());
        }
        f0.b.a(this, false, 1, null);
        this.f2792q = true;
        t1.v vVar = this.f2774i;
        Canvas w11 = vVar.a().w();
        vVar.a().y(canvas);
        getRoot().G(vVar.a());
        vVar.a().y(w11);
        if (!this.f2786o.isEmpty()) {
            int size = this.f2786o.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f2786o.get(i11).i();
            }
        }
        if (z1.f3176m.b()) {
            int save = canvas.save();
            canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f2786o.clear();
        this.f2792q = false;
        List<h2.e0> list = this.f2788p;
        if (list != null) {
            kotlin.jvm.internal.s.e(list);
            this.f2786o.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        kotlin.jvm.internal.s.g(event, "event");
        if (event.getActionMasked() == 8) {
            return d2.g0.c(L(event));
        }
        return super.dispatchGenericMotionEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent event) {
        kotlin.jvm.internal.s.g(event, "event");
        if (this.f2794r3) {
            removeCallbacks(this.f2793q3);
            this.f2793q3.run();
        }
        if (P(event)) {
            return false;
        }
        if (event.isFromSource(4098) && event.getToolType(0) == 1) {
            return this.f2782m.s(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && R(event)) {
                if (event.getToolType(0) != 3) {
                    MotionEvent motionEvent = this.f2783m3;
                    if (motionEvent != null) {
                        motionEvent.recycle();
                    }
                    this.f2783m3 = MotionEvent.obtainNoHistory(event);
                    this.f2794r3 = true;
                    post(this.f2793q3);
                    return false;
                } else if (event.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!S(event)) {
            return false;
        }
        return d2.g0.c(L(event));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.s.g(event, "event");
        if (isFocused()) {
            return g0(b2.b.b(event));
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kotlin.jvm.internal.s.g(motionEvent, "motionEvent");
        if (this.f2794r3) {
            removeCallbacks(this.f2793q3);
            MotionEvent motionEvent2 = this.f2783m3;
            kotlin.jvm.internal.s.e(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && !M(motionEvent, motionEvent2)) {
                this.f2794r3 = false;
            } else {
                this.f2793q3.run();
            }
        }
        if (P(motionEvent)) {
            return false;
        }
        if (motionEvent.getActionMasked() != 2 || S(motionEvent)) {
            int L = L(motionEvent);
            if (d2.g0.b(L)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return d2.g0.c(L);
        }
        return false;
    }

    @Override // h2.f0
    public long e(long j11) {
        X();
        return t1.k0.c(this.R, j11);
    }

    @Override // h2.f0
    public void f(h2.k layoutNode) {
        kotlin.jvm.internal.s.g(layoutNode, "layoutNode");
        this.f2782m.G(layoutNode);
    }

    public final View findViewByAccessibilityIdTraversal(int i11) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i11));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = I(i11, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    public boolean g0(KeyEvent keyEvent) {
        kotlin.jvm.internal.s.g(keyEvent, "keyEvent");
        return this.f2773h.d(keyEvent);
    }

    public final i0 getAndroidViewsHandler$ui_release() {
        if (this.F == null) {
            Context context = getContext();
            kotlin.jvm.internal.s.f(context, "context");
            i0 i0Var = new i0(context);
            this.F = i0Var;
            addView(i0Var);
        }
        i0 i0Var2 = this.F;
        kotlin.jvm.internal.s.e(i0Var2);
        return i0Var2;
    }

    @Override // h2.f0
    public p1.d getAutofill() {
        return this.f2803y;
    }

    @Override // h2.f0
    public p1.i getAutofillTree() {
        return this.f2784n;
    }

    public final h00.l<Configuration, vz.b0> getConfigurationChangeObserver() {
        return this.f2800x;
    }

    @Override // h2.f0
    public x2.d getDensity() {
        return this.f2767d;
    }

    @Override // h2.f0
    public r1.g getFocusManager() {
        return this.f2769f;
    }

    @Override // h2.f0
    public d.a getFontLoader() {
        return this.Q2;
    }

    @Override // h2.f0
    public z1.a getHapticFeedBack() {
        return this.f2777j3;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.L.h();
    }

    @Override // h2.f0
    public a2.b getInputModeManager() {
        return this.f2779k3;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f2771g1;
    }

    @Override // android.view.View, android.view.ViewParent, h2.f0
    public x2.q getLayoutDirection() {
        return (x2.q) this.f2775i3.getValue();
    }

    public long getMeasureIteration() {
        return this.L.i();
    }

    @Override // h2.f0
    public d2.r getPointerIconService() {
        return this.f2798u3;
    }

    public h2.k getRoot() {
        return this.f2776j;
    }

    public h2.l0 getRootForTest() {
        return this.f2778k;
    }

    public l2.r getSemanticsOwner() {
        return this.f2780l;
    }

    @Override // h2.f0
    public h2.m getSharedDrawScope() {
        return this.f2766c;
    }

    @Override // h2.f0
    public boolean getShowLayoutBounds() {
        return this.E;
    }

    @Override // h2.f0
    public h2.h0 getSnapshotObserver() {
        return this.C;
    }

    @Override // h2.f0
    public s2.c0 getTextInputService() {
        return this.f2805y2;
    }

    @Override // h2.f0
    public p1 getTextToolbar() {
        return this.f2781l3;
    }

    public View getView() {
        return this;
    }

    @Override // h2.f0
    public y1 getViewConfiguration() {
        return this.O;
    }

    public final b getViewTreeOwners() {
        return (b) this.Q1.getValue();
    }

    @Override // h2.f0
    public f2 getWindowInfo() {
        return this.f2770g;
    }

    @Override // d2.f0
    public long h(long j11) {
        X();
        return t1.k0.c(this.T, s1.g.a(s1.f.l(j11) - s1.f.l(this.f2801x1), s1.f.m(j11) - s1.f.m(this.f2801x1)));
    }

    @Override // h2.f0
    public void i(h2.k layoutNode) {
        kotlin.jvm.internal.s.g(layoutNode, "layoutNode");
        if (this.L.m(layoutNode)) {
            d0(this, null, 1, null);
        }
    }

    @Override // h2.f0
    public void j(h2.k node) {
        kotlin.jvm.internal.s.g(node, "node");
        this.L.k(node);
        b0();
    }

    @Override // h2.f0
    public void k(h2.k layoutNode) {
        kotlin.jvm.internal.s.g(layoutNode, "layoutNode");
        this.L.f(layoutNode);
    }

    @Override // h2.f0
    public long l(long j11) {
        X();
        return t1.k0.c(this.T, j11);
    }

    @Override // d2.f0
    public long m(long j11) {
        X();
        long c11 = t1.k0.c(this.R, j11);
        return s1.g.a(s1.f.l(c11) + s1.f.l(this.f2801x1), s1.f.m(c11) + s1.f.m(this.f2801x1));
    }

    @Override // h2.f0
    public void n(h2.k layoutNode) {
        kotlin.jvm.internal.s.g(layoutNode, "layoutNode");
        if (this.L.n(layoutNode)) {
            c0(layoutNode);
        }
    }

    @Override // h2.f0
    public void o() {
        this.f2782m.H();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        androidx.lifecycle.v a11;
        androidx.lifecycle.p lifecycle;
        p1.a aVar;
        super.onAttachedToWindow();
        O(getRoot());
        N(getRoot());
        getSnapshotObserver().f();
        if (D() && (aVar = this.f2803y) != null) {
            p1.g.f45457a.a(aVar);
        }
        androidx.lifecycle.v a12 = androidx.lifecycle.v0.a(this);
        androidx.savedstate.c a13 = androidx.savedstate.d.a(this);
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || !(a12 == null || a13 == null || (a12 == viewTreeOwners.a() && a13 == viewTreeOwners.a()))) {
            if (a12 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (a13 != null) {
                if (viewTreeOwners != null && (a11 = viewTreeOwners.a()) != null && (lifecycle = a11.getLifecycle()) != null) {
                    lifecycle.c(this);
                }
                a12.getLifecycle().a(this);
                b bVar = new b(a12, a13);
                setViewTreeOwners(bVar);
                h00.l<? super b, vz.b0> lVar = this.V1;
                if (lVar != null) {
                    lVar.invoke(bVar);
                }
                this.V1 = null;
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
        }
        b viewTreeOwners2 = getViewTreeOwners();
        kotlin.jvm.internal.s.e(viewTreeOwners2);
        viewTreeOwners2.a().getLifecycle().a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f2765b2);
        getViewTreeObserver().addOnScrollChangedListener(this.f2772g2);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f2790p2);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return this.f2802x2.p();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.s.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Context context = getContext();
        kotlin.jvm.internal.s.f(context, "context");
        this.f2767d = x2.a.a(context);
        this.f2800x.invoke(newConfig);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        kotlin.jvm.internal.s.g(outAttrs, "outAttrs");
        return this.f2802x2.m(outAttrs);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        p1.a aVar;
        androidx.lifecycle.v a11;
        androidx.lifecycle.p lifecycle;
        super.onDetachedFromWindow();
        getSnapshotObserver().g();
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (a11 = viewTreeOwners.a()) != null && (lifecycle = a11.getLifecycle()) != null) {
            lifecycle.c(this);
        }
        if (D() && (aVar = this.f2803y) != null) {
            p1.g.f45457a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f2765b2);
        getViewTreeObserver().removeOnScrollChangedListener(this.f2772g2);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f2790p2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z11 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        r1.h hVar = this.f2769f;
        if (z11) {
            hVar.h();
        } else {
            hVar.f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.H = null;
        m0();
        if (this.F != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i13 - i11, i14 - i12);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                O(getRoot());
            }
            vz.p<Integer, Integer> H = H(i11);
            int intValue = H.a().intValue();
            int intValue2 = H.b().intValue();
            vz.p<Integer, Integer> H2 = H(i12);
            long a11 = x2.c.a(intValue, intValue2, H2.a().intValue(), H2.b().intValue());
            x2.b bVar = this.H;
            boolean z11 = false;
            if (bVar == null) {
                this.H = x2.b.b(a11);
                this.K = false;
            } else {
                if (bVar != null) {
                    z11 = x2.b.g(bVar.s(), a11);
                }
                if (!z11) {
                    this.K = true;
                }
            }
            this.L.o(a11);
            this.L.j(this.f2795s3);
            setMeasuredDimension(getRoot().h0(), getRoot().N());
            if (this.F != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().h0(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().N(), 1073741824));
            }
            vz.b0 b0Var = vz.b0.f54756a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i11) {
        p1.a aVar;
        if (!D() || viewStructure == null || (aVar = this.f2803y) == null) {
            return;
        }
        p1.c.b(aVar, viewStructure);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.m
    public void onResume(androidx.lifecycle.v owner) {
        kotlin.jvm.internal.s.g(owner, "owner");
        setShowLayoutBounds(f2759v3.b());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        x2.q f11;
        if (this.f2763b) {
            f11 = y.f(i11);
            setLayoutDirection(f11);
            this.f2769f.g(f11);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z11) {
        this.f2770g.a(z11);
        super.onWindowFocusChanged(z11);
    }

    public final void setConfigurationChangeObserver(h00.l<? super Configuration, vz.b0> lVar) {
        kotlin.jvm.internal.s.g(lVar, "<set-?>");
        this.f2800x = lVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j11) {
        this.f2771g1 = j11;
    }

    public final void setOnViewTreeOwnersAvailable(h00.l<? super b, vz.b0> callback) {
        kotlin.jvm.internal.s.g(callback, "callback");
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.V1 = callback;
    }

    @Override // h2.f0
    public void setShowLayoutBounds(boolean z11) {
        this.E = z11;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // h2.f0
    public k getAccessibilityManager() {
        return this.B;
    }

    @Override // h2.f0
    public l getClipboardManager() {
        return this.A;
    }
}