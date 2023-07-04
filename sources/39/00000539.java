package androidx.compose.ui.window;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.ui.platform.c2;
import androidx.lifecycle.v0;
import c1.e1;
import c1.o0;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.b0;
import x2.q;

/* loaded from: classes.dex */
public final class i extends androidx.compose.ui.platform.a implements c2 {

    /* renamed from: a  reason: collision with root package name */
    private h00.a<b0> f3293a;

    /* renamed from: b  reason: collision with root package name */
    private n f3294b;

    /* renamed from: c  reason: collision with root package name */
    private String f3295c;

    /* renamed from: d  reason: collision with root package name */
    private final View f3296d;

    /* renamed from: e  reason: collision with root package name */
    private final j f3297e;

    /* renamed from: f  reason: collision with root package name */
    private final WindowManager f3298f;

    /* renamed from: g  reason: collision with root package name */
    private final WindowManager.LayoutParams f3299g;

    /* renamed from: h  reason: collision with root package name */
    private m f3300h;

    /* renamed from: i  reason: collision with root package name */
    private q f3301i;

    /* renamed from: j  reason: collision with root package name */
    private final o0 f3302j;

    /* renamed from: k  reason: collision with root package name */
    private final o0 f3303k;

    /* renamed from: l  reason: collision with root package name */
    private x2.m f3304l;

    /* renamed from: m  reason: collision with root package name */
    private final v1 f3305m;

    /* renamed from: n  reason: collision with root package name */
    private final float f3306n;

    /* renamed from: o  reason: collision with root package name */
    private final Rect f3307o;

    /* renamed from: p  reason: collision with root package name */
    private final o0 f3308p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f3309q;

    /* renamed from: t  reason: collision with root package name */
    private final int[] f3310t;

    /* loaded from: classes.dex */
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline result) {
            s.g(view, "view");
            s.g(result, "result");
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f3312b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11) {
            super(2);
            this.f3312b = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            i.this.Content(iVar, this.f3312b | 1);
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3313a;

        static {
            int[] iArr = new int[q.values().length];
            iArr[q.Ltr.ordinal()] = 1;
            iArr[q.Rtl.ordinal()] = 2;
            f3313a = iArr;
        }
    }

    /* loaded from: classes.dex */
    static final class d extends u implements h00.a<Boolean> {
        d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Boolean invoke() {
            return Boolean.valueOf((i.this.getParentLayoutCoordinates() == null || i.this.m2getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ i(h00.a r11, androidx.compose.ui.window.n r12, java.lang.String r13, android.view.View r14, x2.d r15, androidx.compose.ui.window.m r16, java.util.UUID r17, androidx.compose.ui.window.j r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L19
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L12
            androidx.compose.ui.window.k r0 = new androidx.compose.ui.window.k
            r0.<init>()
            goto L17
        L12:
            androidx.compose.ui.window.l r0 = new androidx.compose.ui.window.l
            r0.<init>()
        L17:
            r9 = r0
            goto L1b
        L19:
            r9 = r18
        L1b:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.i.<init>(h00.a, androidx.compose.ui.window.n, java.lang.String, android.view.View, x2.d, androidx.compose.ui.window.m, java.util.UUID, androidx.compose.ui.window.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final void b(int i11) {
        WindowManager.LayoutParams layoutParams = this.f3299g;
        layoutParams.flags = i11;
        this.f3297e.b(this.f3298f, this, layoutParams);
    }

    private final WindowManager.LayoutParams c() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        int i11 = layoutParams.flags & (-8552473);
        layoutParams.flags = i11;
        layoutParams.flags = i11 | 262144;
        layoutParams.type = 1002;
        layoutParams.token = this.f3296d.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.f3296d.getContext().getResources().getString(o1.h.f42093d));
        return layoutParams;
    }

    private final h00.p<c1.i, Integer, b0> getContent() {
        return (h00.p) this.f3308p.getValue();
    }

    private final int getDisplayHeight() {
        int c11;
        c11 = j00.c.c(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
        return c11;
    }

    private final int getDisplayWidth() {
        int c11;
        c11 = j00.c.c(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
        return c11;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f2.o getParentLayoutCoordinates() {
        return (f2.o) this.f3303k.getValue();
    }

    private final void h(q qVar) {
        int i11 = c.f3313a[qVar.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i12);
    }

    private final void setClippingEnabled(boolean z11) {
        int i11;
        if (z11) {
            i11 = this.f3299g.flags & (-513);
        } else {
            i11 = this.f3299g.flags | 512;
        }
        b(i11);
    }

    private final void setContent(h00.p<? super c1.i, ? super Integer, b0> pVar) {
        this.f3308p.setValue(pVar);
    }

    private final void setIsFocusable(boolean z11) {
        int i11;
        if (!z11) {
            i11 = this.f3299g.flags | 8;
        } else {
            i11 = this.f3299g.flags & (-9);
        }
        b(i11);
    }

    private final void setParentLayoutCoordinates(f2.o oVar) {
        this.f3303k.setValue(oVar);
    }

    private final void setSecurePolicy(o oVar) {
        int i11;
        if (p.a(oVar, androidx.compose.ui.window.b.e(this.f3296d))) {
            i11 = this.f3299g.flags | PKIFailureInfo.certRevoked;
        } else {
            i11 = this.f3299g.flags & (-8193);
        }
        b(i11);
    }

    @Override // androidx.compose.ui.platform.a
    public void Content(c1.i iVar, int i11) {
        c1.i h11 = iVar.h(-1107814387);
        getContent().invoke(h11, 0);
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new b(i11));
    }

    public final void d() {
        v0.b(this, null);
        this.f3298f.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        s.g(event, "event");
        if (event.getKeyCode() == 4 && this.f3294b.b()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            } else if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                h00.a<b0> aVar = this.f3293a;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    public final void e() {
        int[] iArr = this.f3310t;
        int i11 = iArr[0];
        int i12 = iArr[1];
        this.f3296d.getLocationOnScreen(iArr);
        int[] iArr2 = this.f3310t;
        if (i11 == iArr2[0] && i12 == iArr2[1]) {
            return;
        }
        j();
    }

    public final void f(c1.m parent, h00.p<? super c1.i, ? super Integer, b0> content) {
        s.g(parent, "parent");
        s.g(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.f3309q = true;
    }

    public final void g() {
        this.f3298f.addView(this, this.f3299g);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f3305m.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f3299g;
    }

    public final q getParentLayoutDirection() {
        return this.f3301i;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final x2.o m2getPopupContentSizebOM6tXw() {
        return (x2.o) this.f3302j.getValue();
    }

    public final m getPositionProvider() {
        return this.f3300h;
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f3309q;
    }

    public androidx.compose.ui.platform.a getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f3295c;
    }

    public View getViewRoot() {
        return c2.a.a(this);
    }

    public final void i(h00.a<b0> aVar, n properties, String testTag, q layoutDirection) {
        s.g(properties, "properties");
        s.g(testTag, "testTag");
        s.g(layoutDirection, "layoutDirection");
        this.f3293a = aVar;
        this.f3294b = properties;
        this.f3295c = testTag;
        setIsFocusable(properties.e());
        setSecurePolicy(properties.f());
        setClippingEnabled(properties.a());
        h(layoutDirection);
    }

    @Override // androidx.compose.ui.platform.a
    public void internalOnLayout$ui_release(boolean z11, int i11, int i12, int i13, int i14) {
        super.internalOnLayout$ui_release(z11, i11, i12, i13, i14);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.f3299g.width = childAt.getMeasuredWidth();
        this.f3299g.height = childAt.getMeasuredHeight();
        this.f3297e.b(this.f3298f, this, this.f3299g);
    }

    @Override // androidx.compose.ui.platform.a
    public void internalOnMeasure$ui_release(int i11, int i12) {
        if (this.f3294b.g()) {
            super.internalOnMeasure$ui_release(i11, i12);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final void j() {
        int c11;
        int c12;
        f2.o parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long e11 = parentLayoutCoordinates.e();
        long f11 = f2.p.f(parentLayoutCoordinates);
        c11 = j00.c.c(s1.f.l(f11));
        c12 = j00.c.c(s1.f.m(f11));
        x2.m a11 = x2.n.a(x2.l.a(c11, c12), e11);
        if (s.c(a11, this.f3304l)) {
            return;
        }
        this.f3304l = a11;
        l();
    }

    public final void k(f2.o parentLayoutCoordinates) {
        s.g(parentLayoutCoordinates, "parentLayoutCoordinates");
        setParentLayoutCoordinates(parentLayoutCoordinates);
        j();
    }

    public final void l() {
        x2.o m2getPopupContentSizebOM6tXw;
        x2.m f11;
        x2.m mVar = this.f3304l;
        if (mVar == null || (m2getPopupContentSizebOM6tXw = m2getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j11 = m2getPopupContentSizebOM6tXw.j();
        Rect rect = this.f3307o;
        this.f3297e.a(this.f3296d, rect);
        f11 = androidx.compose.ui.window.b.f(rect);
        long a11 = x2.p.a(f11.f(), f11.b());
        long mo4calculatePositionllwVHH4 = this.f3300h.mo4calculatePositionllwVHH4(mVar, a11, this.f3301i, j11);
        this.f3299g.x = x2.k.h(mo4calculatePositionllwVHH4);
        this.f3299g.y = x2.k.i(mo4calculatePositionllwVHH4);
        if (this.f3294b.d()) {
            this.f3297e.c(this, x2.o.g(a11), x2.o.f(a11));
        }
        this.f3297e.b(this.f3298f, this, this.f3299g);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f3294b.c()) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z11 = false;
        if ((motionEvent != null && motionEvent.getAction() == 0) && (motionEvent.getX() < BitmapDescriptorFactory.HUE_RED || motionEvent.getX() >= getWidth() || motionEvent.getY() < BitmapDescriptorFactory.HUE_RED || motionEvent.getY() >= getHeight())) {
            h00.a<b0> aVar = this.f3293a;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (motionEvent != null && motionEvent.getAction() == 4) {
            z11 = true;
        }
        if (z11) {
            h00.a<b0> aVar2 = this.f3293a;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i11) {
    }

    public final void setParentLayoutDirection(q qVar) {
        s.g(qVar, "<set-?>");
        this.f3301i = qVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m3setPopupContentSizefhxjrPA(x2.o oVar) {
        this.f3302j.setValue(oVar);
    }

    public final void setPositionProvider(m mVar) {
        s.g(mVar, "<set-?>");
        this.f3300h = mVar;
    }

    public final void setTestTag(String str) {
        s.g(str, "<set-?>");
        this.f3295c = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(h00.a<vz.b0> r8, androidx.compose.ui.window.n r9, java.lang.String r10, android.view.View r11, x2.d r12, androidx.compose.ui.window.m r13, java.util.UUID r14, androidx.compose.ui.window.j r15) {
        /*
            r7 = this;
            java.lang.String r0 = "properties"
            kotlin.jvm.internal.s.g(r9, r0)
            java.lang.String r0 = "testTag"
            kotlin.jvm.internal.s.g(r10, r0)
            java.lang.String r0 = "composeView"
            kotlin.jvm.internal.s.g(r11, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.s.g(r12, r0)
            java.lang.String r0 = "initialPositionProvider"
            kotlin.jvm.internal.s.g(r13, r0)
            java.lang.String r0 = "popupId"
            kotlin.jvm.internal.s.g(r14, r0)
            java.lang.String r0 = "popupLayoutHelper"
            kotlin.jvm.internal.s.g(r15, r0)
            android.content.Context r2 = r11.getContext()
            java.lang.String r0 = "composeView.context"
            kotlin.jvm.internal.s.f(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f3293a = r8
            r7.f3294b = r9
            r7.f3295c = r10
            r7.f3296d = r11
            r7.f3297e = r15
            android.content.Context r8 = r11.getContext()
            java.lang.String r9 = "window"
            java.lang.Object r8 = r8.getSystemService(r9)
            java.lang.String r9 = "null cannot be cast to non-null type android.view.WindowManager"
            java.util.Objects.requireNonNull(r8, r9)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            r7.f3298f = r8
            android.view.WindowManager$LayoutParams r8 = r7.c()
            r7.f3299g = r8
            r7.f3300h = r13
            x2.q r8 = x2.q.Ltr
            r7.f3301i = r8
            r8 = 0
            r9 = 2
            c1.o0 r10 = c1.n1.g(r8, r8, r9, r8)
            r7.f3302j = r10
            c1.o0 r10 = c1.n1.g(r8, r8, r9, r8)
            r7.f3303k = r10
            androidx.compose.ui.window.i$d r10 = new androidx.compose.ui.window.i$d
            r10.<init>()
            c1.v1 r10 = c1.n1.c(r10)
            r7.f3305m = r10
            r10 = 30
            float r10 = (float) r10
            float r10 = x2.g.f(r10)
            r7.f3306n = r10
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            r7.f3307o = r13
            r13 = 16908290(0x1020002, float:2.3877235E-38)
            r7.setId(r13)
            androidx.lifecycle.v r13 = androidx.lifecycle.v0.a(r11)
            androidx.lifecycle.v0.b(r7, r13)
            androidx.lifecycle.u0 r13 = androidx.lifecycle.w0.a(r11)
            androidx.lifecycle.w0.b(r7, r13)
            androidx.savedstate.c r11 = androidx.savedstate.d.a(r11)
            androidx.savedstate.d.b(r7, r11)
            int r11 = o1.g.H
            java.lang.String r13 = "Popup:"
            java.lang.String r13 = kotlin.jvm.internal.s.p(r13, r14)
            r7.setTag(r11, r13)
            r11 = 0
            r7.setClipChildren(r11)
            float r10 = r12.i0(r10)
            r7.setElevation(r10)
            androidx.compose.ui.window.i$a r10 = new androidx.compose.ui.window.i$a
            r10.<init>()
            r7.setOutlineProvider(r10)
            androidx.compose.ui.window.e r10 = androidx.compose.ui.window.e.f3274a
            h00.p r10 = r10.a()
            c1.o0 r8 = c1.n1.g(r10, r8, r9, r8)
            r7.f3308p = r8
            int[] r8 = new int[r9]
            r7.f3310t = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.i.<init>(h00.a, androidx.compose.ui.window.n, java.lang.String, android.view.View, x2.d, androidx.compose.ui.window.m, java.util.UUID, androidx.compose.ui.window.j):void");
    }
}