package androidx.transition;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l extends ViewGroup implements i {

    /* renamed from: a  reason: collision with root package name */
    ViewGroup f6175a;

    /* renamed from: b  reason: collision with root package name */
    View f6176b;

    /* renamed from: c  reason: collision with root package name */
    final View f6177c;

    /* renamed from: d  reason: collision with root package name */
    int f6178d;

    /* renamed from: e  reason: collision with root package name */
    private Matrix f6179e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f6180f;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            androidx.core.view.a0.n0(l.this);
            l lVar = l.this;
            ViewGroup viewGroup = lVar.f6175a;
            if (viewGroup == null || (view = lVar.f6176b) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            androidx.core.view.a0.n0(l.this.f6175a);
            l lVar2 = l.this;
            lVar2.f6175a = null;
            lVar2.f6176b = null;
            return true;
        }
    }

    l(View view) {
        super(view.getContext());
        this.f6180f = new a();
        this.f6177c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l b(View view, ViewGroup viewGroup, Matrix matrix) {
        j jVar;
        if (view.getParent() instanceof ViewGroup) {
            j b11 = j.b(viewGroup);
            l e11 = e(view);
            int i11 = 0;
            if (e11 != null && (jVar = (j) e11.getParent()) != b11) {
                i11 = e11.f6178d;
                jVar.removeView(e11);
                e11 = null;
            }
            if (e11 == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    c(view, viewGroup, matrix);
                }
                e11 = new l(view);
                e11.h(matrix);
                if (b11 == null) {
                    b11 = new j(viewGroup);
                } else {
                    b11.g();
                }
                d(viewGroup, b11);
                d(viewGroup, e11);
                b11.a(e11);
                e11.f6178d = i11;
            } else if (matrix != null) {
                e11.h(matrix);
            }
            e11.f6178d++;
            return e11;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        p0.j(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        p0.k(viewGroup, matrix);
    }

    static void d(View view, View view2) {
        p0.g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    static l e(View view) {
        return (l) view.getTag(s.f6207a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view) {
        l e11 = e(view);
        if (e11 != null) {
            int i11 = e11.f6178d - 1;
            e11.f6178d = i11;
            if (i11 <= 0) {
                ((j) e11.getParent()).removeView(e11);
            }
        }
    }

    static void g(View view, l lVar) {
        view.setTag(s.f6207a, lVar);
    }

    @Override // androidx.transition.i
    public void a(ViewGroup viewGroup, View view) {
        this.f6175a = viewGroup;
        this.f6176b = view;
    }

    void h(Matrix matrix) {
        this.f6179e = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.f6177c, this);
        this.f6177c.getViewTreeObserver().addOnPreDrawListener(this.f6180f);
        p0.i(this.f6177c, 4);
        if (this.f6177c.getParent() != null) {
            ((View) this.f6177c.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f6177c.getViewTreeObserver().removeOnPreDrawListener(this.f6180f);
        p0.i(this.f6177c, 0);
        g(this.f6177c, null);
        if (this.f6177c.getParent() != null) {
            ((View) this.f6177c.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        c.a(canvas, true);
        canvas.setMatrix(this.f6179e);
        p0.i(this.f6177c, 0);
        this.f6177c.invalidate();
        p0.i(this.f6177c, 4);
        drawChild(canvas, this.f6177c, getDrawingTime());
        c.a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.View, androidx.transition.i
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        if (e(this.f6177c) == this) {
            p0.i(this.f6177c, i11 == 0 ? 4 : 0);
        }
    }
}