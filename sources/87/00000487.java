package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class i0 extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<androidx.compose.ui.viewinterop.a, h2.k> f2965a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<h2.k, androidx.compose.ui.viewinterop.a> f2966b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
        setClipChildren(false);
        this.f2965a = new HashMap<>();
        this.f2966b = new HashMap<>();
    }

    public Void a(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<androidx.compose.ui.viewinterop.a, h2.k> getHolderToLayoutNode() {
        return this.f2965a;
    }

    public final HashMap<h2.k, androidx.compose.ui.viewinterop.a> getLayoutNodeToHolder() {
        return this.f2966b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) a(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View child, View target) {
        kotlin.jvm.internal.s.g(child, "child");
        kotlin.jvm.internal.s.g(target, "target");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        Set<androidx.compose.ui.viewinterop.a> keySet = this.f2965a.keySet();
        kotlin.jvm.internal.s.f(keySet, "holderToLayoutNode.keys");
        for (androidx.compose.ui.viewinterop.a aVar : keySet) {
            aVar.layout(aVar.getLeft(), aVar.getTop(), aVar.getRight(), aVar.getBottom());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            if (View.MeasureSpec.getMode(i12) == 1073741824) {
                setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
                Set<androidx.compose.ui.viewinterop.a> keySet = this.f2965a.keySet();
                kotlin.jvm.internal.s.f(keySet, "holderToLayoutNode.keys");
                for (androidx.compose.ui.viewinterop.a aVar : keySet) {
                    aVar.a();
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            int i12 = i11 + 1;
            View childAt = getChildAt(i11);
            h2.k kVar = this.f2965a.get(childAt);
            if (childAt.isLayoutRequested() && kVar != null) {
                kVar.N0();
            }
            i11 = i12;
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}