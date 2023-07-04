package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private TypedValue f1561a;

    /* renamed from: b  reason: collision with root package name */
    private TypedValue f1562b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f1563c;

    /* renamed from: d  reason: collision with root package name */
    private TypedValue f1564d;

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f1565e;

    /* renamed from: f  reason: collision with root package name */
    private TypedValue f1566f;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f1567g;

    /* renamed from: h  reason: collision with root package name */
    private a f1568h;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void b(int i11, int i12, int i13, int i14) {
        this.f1567g.set(i11, i12, i13, i14);
        if (androidx.core.view.a0.a0(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1565e == null) {
            this.f1565e = new TypedValue();
        }
        return this.f1565e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1566f == null) {
            this.f1566f = new TypedValue();
        }
        return this.f1566f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1563c == null) {
            this.f1563c = new TypedValue();
        }
        return this.f1563c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1564d == null) {
            this.f1564d = new TypedValue();
        }
        return this.f1564d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1561a == null) {
            this.f1561a = new TypedValue();
        }
        return this.f1561a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1562b == null) {
            this.f1562b = new TypedValue();
        }
        return this.f1562b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f1568h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f1568h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f1568h = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1567g = new Rect();
    }
}