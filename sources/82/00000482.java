package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import t1.u;

/* loaded from: classes.dex */
public final class h1 implements o0 {

    /* renamed from: a  reason: collision with root package name */
    private final RenderNode f2960a;

    public h1(AndroidComposeView ownerView) {
        kotlin.jvm.internal.s.g(ownerView, "ownerView");
        this.f2960a = new RenderNode("Compose");
    }

    @Override // androidx.compose.ui.platform.o0
    public void A(Matrix matrix) {
        kotlin.jvm.internal.s.g(matrix, "matrix");
        this.f2960a.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.o0
    public void B(int i11) {
        this.f2960a.offsetLeftAndRight(i11);
    }

    @Override // androidx.compose.ui.platform.o0
    public int C() {
        return this.f2960a.getBottom();
    }

    @Override // androidx.compose.ui.platform.o0
    public void D(float f11) {
        this.f2960a.setPivotX(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void E(float f11) {
        this.f2960a.setPivotY(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void F(Outline outline) {
        this.f2960a.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.o0
    public int G() {
        return this.f2960a.getRight();
    }

    @Override // androidx.compose.ui.platform.o0
    public void H(boolean z11) {
        this.f2960a.setClipToOutline(z11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void I(t1.v canvasHolder, t1.q0 q0Var, h00.l<? super t1.u, vz.b0> drawBlock) {
        kotlin.jvm.internal.s.g(canvasHolder, "canvasHolder");
        kotlin.jvm.internal.s.g(drawBlock, "drawBlock");
        RecordingCanvas beginRecording = this.f2960a.beginRecording();
        kotlin.jvm.internal.s.f(beginRecording, "renderNode.beginRecording()");
        Canvas w11 = canvasHolder.a().w();
        canvasHolder.a().y(beginRecording);
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
        this.f2960a.endRecording();
    }

    @Override // androidx.compose.ui.platform.o0
    public float J() {
        return this.f2960a.getElevation();
    }

    @Override // androidx.compose.ui.platform.o0
    public void b(float f11) {
        this.f2960a.setAlpha(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void d(float f11) {
        this.f2960a.setTranslationY(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void f(float f11) {
        this.f2960a.setScaleX(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void g(t1.x0 x0Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            i1.f2967a.a(this.f2960a, x0Var);
        }
    }

    @Override // androidx.compose.ui.platform.o0
    public int getHeight() {
        return this.f2960a.getHeight();
    }

    @Override // androidx.compose.ui.platform.o0
    public int getWidth() {
        return this.f2960a.getWidth();
    }

    @Override // androidx.compose.ui.platform.o0
    public float h() {
        return this.f2960a.getAlpha();
    }

    @Override // androidx.compose.ui.platform.o0
    public void i(float f11) {
        this.f2960a.setCameraDistance(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void j(float f11) {
        this.f2960a.setRotationX(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void k(float f11) {
        this.f2960a.setRotationY(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void l(float f11) {
        this.f2960a.setRotationZ(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void m(float f11) {
        this.f2960a.setScaleY(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void n(float f11) {
        this.f2960a.setTranslationX(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void o(Canvas canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        canvas.drawRenderNode(this.f2960a);
    }

    @Override // androidx.compose.ui.platform.o0
    public int p() {
        return this.f2960a.getLeft();
    }

    @Override // androidx.compose.ui.platform.o0
    public void q(boolean z11) {
        this.f2960a.setClipToBounds(z11);
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean r(int i11, int i12, int i13, int i14) {
        return this.f2960a.setPosition(i11, i12, i13, i14);
    }

    @Override // androidx.compose.ui.platform.o0
    public void s() {
        this.f2960a.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.o0
    public void t(float f11) {
        this.f2960a.setElevation(f11);
    }

    @Override // androidx.compose.ui.platform.o0
    public void u(int i11) {
        this.f2960a.offsetTopAndBottom(i11);
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean v() {
        return this.f2960a.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean w() {
        return this.f2960a.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.o0
    public int x() {
        return this.f2960a.getTop();
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean y() {
        return this.f2960a.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean z(boolean z11) {
        return this.f2960a.setHasOverlappingRendering(z11);
    }
}