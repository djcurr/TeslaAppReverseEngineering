package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.p f5697a;

    /* renamed from: b  reason: collision with root package name */
    private int f5698b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f5699c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends t {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.t
        public int d(View view) {
            return this.f5697a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f5697a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f5697a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int g(View view) {
            return this.f5697a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int h() {
            return this.f5697a.getWidth();
        }

        @Override // androidx.recyclerview.widget.t
        public int i() {
            return this.f5697a.getWidth() - this.f5697a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.t
        public int j() {
            return this.f5697a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.t
        public int k() {
            return this.f5697a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.t
        public int l() {
            return this.f5697a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.t
        public int m() {
            return this.f5697a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.t
        public int n() {
            return (this.f5697a.getWidth() - this.f5697a.getPaddingLeft()) - this.f5697a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.t
        public int p(View view) {
            this.f5697a.getTransformedBoundingBox(view, true, this.f5699c);
            return this.f5699c.right;
        }

        @Override // androidx.recyclerview.widget.t
        public int q(View view) {
            this.f5697a.getTransformedBoundingBox(view, true, this.f5699c);
            return this.f5699c.left;
        }

        @Override // androidx.recyclerview.widget.t
        public void r(int i11) {
            this.f5697a.offsetChildrenHorizontal(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends t {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.t
        public int d(View view) {
            return this.f5697a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f5697a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f5697a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int g(View view) {
            return this.f5697a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int h() {
            return this.f5697a.getHeight();
        }

        @Override // androidx.recyclerview.widget.t
        public int i() {
            return this.f5697a.getHeight() - this.f5697a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.t
        public int j() {
            return this.f5697a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.t
        public int k() {
            return this.f5697a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.t
        public int l() {
            return this.f5697a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.t
        public int m() {
            return this.f5697a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.t
        public int n() {
            return (this.f5697a.getHeight() - this.f5697a.getPaddingTop()) - this.f5697a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.t
        public int p(View view) {
            this.f5697a.getTransformedBoundingBox(view, true, this.f5699c);
            return this.f5699c.bottom;
        }

        @Override // androidx.recyclerview.widget.t
        public int q(View view) {
            this.f5697a.getTransformedBoundingBox(view, true, this.f5699c);
            return this.f5699c.top;
        }

        @Override // androidx.recyclerview.widget.t
        public void r(int i11) {
            this.f5697a.offsetChildrenVertical(i11);
        }
    }

    /* synthetic */ t(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static t a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static t b(RecyclerView.p pVar, int i11) {
        if (i11 != 0) {
            if (i11 == 1) {
                return c(pVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return a(pVar);
    }

    public static t c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f5698b) {
            return 0;
        }
        return n() - this.f5698b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i11);

    public void s() {
        this.f5698b = n();
    }

    private t(RecyclerView.p pVar) {
        this.f5698b = Integer.MIN_VALUE;
        this.f5699c = new Rect();
        this.f5697a = pVar;
    }
}