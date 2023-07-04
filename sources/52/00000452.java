package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.v1;
import c1.a1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<c1.m> cachedViewTreeCompositionContext;
    private c1.l composition;
    private boolean creatingComposition;
    private h00.a<vz.b0> disposeViewCompositionStrategy;
    private c1.m parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.platform.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0050a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
        C0050a() {
            super(2);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            } else {
                a.this.Content(iVar, 8);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final c1.m cacheIfAlive(c1.m mVar) {
        c1.m mVar2 = isAlive(mVar) ? mVar : null;
        if (mVar2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(mVar2);
        }
        return mVar;
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + ((Object) getClass().getSimpleName()) + "; only Compose content is supported");
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = l2.e(this, resolveParentCompositionContext(), j1.c.c(-985539750, true, new C0050a()));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean isAlive(c1.m mVar) {
        return !(mVar instanceof c1.a1) || ((c1.a1) mVar).P().getValue().compareTo(a1.c.ShuttingDown) > 0;
    }

    private final c1.m resolveParentCompositionContext() {
        c1.m mVar;
        c1.m mVar2 = this.parentContext;
        if (mVar2 == null) {
            c1.m c11 = WindowRecomposer_androidKt.c(this);
            c1.m cacheIfAlive = c11 == null ? null : cacheIfAlive(c11);
            if (cacheIfAlive == null) {
                WeakReference<c1.m> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference == null || (mVar = weakReference.get()) == null || !isAlive(mVar)) {
                    mVar = null;
                }
                return mVar == null ? cacheIfAlive(WindowRecomposer_androidKt.f(this)) : mVar;
            }
            return cacheIfAlive;
        }
        return mVar2;
    }

    private final void setParentContext(c1.m mVar) {
        if (this.parentContext != mVar) {
            this.parentContext = mVar;
            if (mVar != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            c1.l lVar = this.composition;
            if (lVar != null) {
                lVar.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    public abstract void Content(c1.i iVar, int i11);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        checkAddView();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        return super.addViewInLayout(view, i11, layoutParams);
    }

    public final void createComposition() {
        if (this.parentContext != null || isAttachedToWindow()) {
            ensureCompositionCreated();
            return;
        }
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
    }

    public final void disposeComposition() {
        c1.l lVar = this.composition;
        if (lVar != null) {
            lVar.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui_release(boolean z11, int i11, int i12, int i13, int i14) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.layout(getPaddingLeft(), getPaddingTop(), (i13 - i11) - getPaddingRight(), (i14 - i12) - getPaddingBottom());
    }

    public void internalOnMeasure$ui_release(int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i11, i12);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i11)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i12) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i12)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            ensureCompositionCreated();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        internalOnLayout$ui_release(z11, i11, i12, i13, i14);
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        ensureCompositionCreated();
        internalOnMeasure$ui_release(i11, i12);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i11);
    }

    public final void setParentCompositionContext(c1.m mVar) {
        setParentContext(mVar);
    }

    public final void setShowLayoutBounds(boolean z11) {
        this.showLayoutBounds = z11;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        ((h2.f0) childAt).setShowLayoutBounds(z11);
    }

    public final void setViewCompositionStrategy(v1 strategy) {
        kotlin.jvm.internal.s.g(strategy, "strategy");
        h00.a<vz.b0> aVar = this.disposeViewCompositionStrategy;
        if (aVar != null) {
            aVar.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        this.disposeViewCompositionStrategy = v1.a.f3123a.a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11) {
        checkAddView();
        super.addView(view, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i11, ViewGroup.LayoutParams layoutParams, boolean z11) {
        checkAddView();
        return super.addViewInLayout(view, i11, layoutParams, z11);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, int i12) {
        checkAddView();
        super.addView(view, i11, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, i11, layoutParams);
    }
}