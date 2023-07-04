package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f1693a;

    /* renamed from: b  reason: collision with root package name */
    private int f1694b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<View> f1695c;

    /* renamed from: d  reason: collision with root package name */
    private LayoutInflater f1696d;

    /* renamed from: e  reason: collision with root package name */
    private a f1697e;

    /* loaded from: classes.dex */
    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f1693a != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f1696d;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f1693a, viewGroup, false);
                int i11 = this.f1694b;
                if (i11 != -1) {
                    inflate.setId(i11);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f1695c = new WeakReference<>(inflate);
                a aVar = this.f1697e;
                if (aVar != null) {
                    aVar.a(this, inflate);
                }
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1694b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1696d;
    }

    public int getLayoutResource() {
        return this.f1693a;
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i11) {
        this.f1694b = i11;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1696d = layoutInflater;
    }

    public void setLayoutResource(int i11) {
        this.f1693a = i11;
    }

    public void setOnInflateListener(a aVar) {
        this.f1697e = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        WeakReference<View> weakReference = this.f1695c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i11);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i11);
        if (i11 == 0 || i11 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1693a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.E3, i11, 0);
        this.f1694b = obtainStyledAttributes.getResourceId(g.j.H3, -1);
        this.f1693a = obtainStyledAttributes.getResourceId(g.j.G3, 0);
        setId(obtainStyledAttributes.getResourceId(g.j.F3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}