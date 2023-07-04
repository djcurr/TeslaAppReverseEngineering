package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m0 implements o0 {

    /* renamed from: a  reason: collision with root package name */
    protected a f6187a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup {

        /* renamed from: a  reason: collision with root package name */
        ViewGroup f6188a;

        /* renamed from: b  reason: collision with root package name */
        View f6189b;

        /* renamed from: c  reason: collision with root package name */
        ArrayList<Drawable> f6190c;

        /* renamed from: d  reason: collision with root package name */
        m0 f6191d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f6192e;

        static {
            try {
                Class cls = Integer.TYPE;
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, m0 m0Var) {
            super(context);
            this.f6190c = null;
            this.f6188a = viewGroup;
            this.f6189b = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f6191d = m0Var;
        }

        private void c() {
            if (this.f6192e) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f6190c;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f6192e = true;
                    this.f6188a.removeView(this);
                }
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f6188a.getLocationOnScreen(iArr2);
            this.f6189b.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.f6190c == null) {
                this.f6190c = new ArrayList<>();
            }
            if (this.f6190c.contains(drawable)) {
                return;
            }
            this.f6190c.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f6188a && viewGroup.getParent() != null && androidx.core.view.a0.Y(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f6188a.getLocationOnScreen(iArr2);
                    androidx.core.view.a0.g0(view, iArr[0] - iArr2[0]);
                    androidx.core.view.a0.h0(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f6188a.getLocationOnScreen(iArr);
            this.f6189b.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.f6189b.getWidth(), this.f6189b.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f6190c;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f6190c.get(i11).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f6190c;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void g(View view) {
            super.removeView(view);
            d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f6188a != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f6188a != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    e(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
                return null;
            }
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f6190c) != null && arrayList.contains(drawable));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(Context context, ViewGroup viewGroup, View view) {
        this.f6187a = new a(context, viewGroup, view, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m0 e(View view) {
        ViewGroup f11 = f(view);
        if (f11 != null) {
            int childCount = f11.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = f11.getChildAt(i11);
                if (childAt instanceof a) {
                    return ((a) childAt).f6191d;
                }
            }
            return new h0(f11.getContext(), f11, view);
        }
        return null;
    }

    static ViewGroup f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // androidx.transition.o0
    public void a(Drawable drawable) {
        this.f6187a.a(drawable);
    }

    @Override // androidx.transition.o0
    public void b(Drawable drawable) {
        this.f6187a.f(drawable);
    }
}