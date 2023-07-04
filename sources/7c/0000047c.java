package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t1.u;

/* loaded from: classes.dex */
public final class g1 implements o0 {

    /* renamed from: i  reason: collision with root package name */
    private static boolean f2946i;

    /* renamed from: a  reason: collision with root package name */
    private final AndroidComposeView f2948a;

    /* renamed from: b  reason: collision with root package name */
    private final RenderNode f2949b;

    /* renamed from: c  reason: collision with root package name */
    private int f2950c;

    /* renamed from: d  reason: collision with root package name */
    private int f2951d;

    /* renamed from: e  reason: collision with root package name */
    private int f2952e;

    /* renamed from: f  reason: collision with root package name */
    private int f2953f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2954g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f2945h = new a(null);

    /* renamed from: j  reason: collision with root package name */
    private static boolean f2947j = true;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public g1(AndroidComposeView ownerView) {
        kotlin.jvm.internal.s.g(ownerView, "ownerView");
        this.f2948a = ownerView;
        RenderNode create = RenderNode.create("Compose", ownerView);
        kotlin.jvm.internal.s.f(create, "create(\"Compose\", ownerView)");
        this.f2949b = create;
        if (f2947j) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            create.discardDisplayList();
            f2947j = false;
        }
        if (f2946i) {
            throw new NoClassDefFoundError();
        }
    }

    @Override // androidx.compose.ui.platform.o0
    public void A(Matrix matrix) {
        kotlin.jvm.internal.s.g(matrix, "matrix");
        this.f2949b.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.o0
    public void B(int i11) {
        c(p() + i11);
        e(G() + i11);
        this.f2949b.offsetLeftAndRight(i11);
    }

    @Override // androidx.compose.ui.platform.o0
    public int C() {
        return this.f2953f;
    }

    @Override // androidx.compose.ui.platform.o0
    public void D(float f11) {
        this.f2949b.setPivotX(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void E(float f11) {
        this.f2949b.setPivotY(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void F(Outline outline) {
        this.f2949b.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.o0
    public int G() {
        return this.f2952e;
    }

    @Override // androidx.compose.ui.platform.o0
    public void H(boolean z11) {
        this.f2949b.setClipToOutline(z11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void I(t1.v canvasHolder, t1.q0 q0Var, h00.l<? super t1.u, vz.b0> drawBlock) {
        kotlin.jvm.internal.s.g(canvasHolder, "canvasHolder");
        kotlin.jvm.internal.s.g(drawBlock, "drawBlock");
        DisplayListCanvas start = this.f2949b.start(getWidth(), getHeight());
        kotlin.jvm.internal.s.f(start, "renderNode.start(width, height)");
        Canvas w11 = canvasHolder.a().w();
        canvasHolder.a().y((Canvas) start);
        t1.b a11 = canvasHolder.a();
        if (q0Var != null) {
            a11.m();
            u.a.a(a11, q0Var, 0, 2, null);
        }
        drawBlock.invoke(a11);
        if (q0Var != null) {
            a11.h();
        }
        canvasHolder.a().y(w11);
        this.f2949b.end(start);
    }

    @Override // androidx.compose.ui.platform.o0
    public float J() {
        return this.f2949b.getElevation();
    }

    public void K(int i11) {
        this.f2951d = i11;
    }

    public void a(int i11) {
        this.f2953f = i11;
    }

    @Override // androidx.compose.ui.platform.o0
    public void b(float f11) {
        this.f2949b.setAlpha(f11);
    }

    public void c(int i11) {
        this.f2950c = i11;
    }

    @Override // androidx.compose.ui.platform.o0
    public void d(float f11) {
        this.f2949b.setTranslationY(f11);
    }

    public void e(int i11) {
        this.f2952e = i11;
    }

    @Override // androidx.compose.ui.platform.o0
    public void f(float f11) {
        this.f2949b.setScaleX(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void g(t1.x0 x0Var) {
    }

    @Override // androidx.compose.ui.platform.o0
    public int getHeight() {
        return C() - x();
    }

    @Override // androidx.compose.ui.platform.o0
    public int getWidth() {
        return G() - p();
    }

    @Override // androidx.compose.ui.platform.o0
    public float h() {
        return this.f2949b.getAlpha();
    }

    @Override // androidx.compose.ui.platform.o0
    public void i(float f11) {
        this.f2949b.setCameraDistance(-f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void j(float f11) {
        this.f2949b.setRotationX(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void k(float f11) {
        this.f2949b.setRotationY(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void l(float f11) {
        this.f2949b.setRotation(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void m(float f11) {
        this.f2949b.setScaleY(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void n(float f11) {
        this.f2949b.setTranslationX(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void o(Canvas canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f2949b);
    }

    @Override // androidx.compose.ui.platform.o0
    public int p() {
        return this.f2950c;
    }

    @Override // androidx.compose.ui.platform.o0
    public void q(boolean z11) {
        this.f2954g = z11;
        this.f2949b.setClipToBounds(z11);
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean r(int i11, int i12, int i13, int i14) {
        c(i11);
        K(i12);
        e(i13);
        a(i14);
        return this.f2949b.setLeftTopRightBottom(i11, i12, i13, i14);
    }

    @Override // androidx.compose.ui.platform.o0
    public void s() {
        this.f2949b.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.o0
    public void t(float f11) {
        this.f2949b.setElevation(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void u(int i11) {
        K(x() + i11);
        a(C() + i11);
        this.f2949b.offsetTopAndBottom(i11);
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean v() {
        return this.f2949b.isValid();
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean w() {
        return this.f2954g;
    }

    @Override // androidx.compose.ui.platform.o0
    public int x() {
        return this.f2951d;
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean y() {
        return this.f2949b.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean z(boolean z11) {
        return this.f2949b.setHasOverlappingRendering(z11);
    }
}