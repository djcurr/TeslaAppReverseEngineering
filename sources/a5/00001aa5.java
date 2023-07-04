package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.a1;
import com.facebook.react.uimanager.g0;
import com.facebook.react.uimanager.i0;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.u;
import com.facebook.react.uimanager.y;
import com.facebook.react.uimanager.z;
import com.facebook.react.views.view.e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class g extends ViewGroup implements mg.d, t, z, mg.c, g0, y {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static final int DEFAULT_BACKGROUND_COLOR = 0;
    private static final ViewGroup.LayoutParams sDefaultLayoutParam = new ViewGroup.LayoutParams(0, 0);
    private static final Rect sHelperRect = new Rect();
    private View[] mAllChildren;
    private int mAllChildrenCount;
    private float mBackfaceOpacity;
    private String mBackfaceVisibility;
    private b mChildrenLayoutChangeListener;
    private Rect mClippingRect;
    private a1 mDrawingOrderHelper;
    private Rect mHitSlopRect;
    private int mLayoutDirection;
    private boolean mNeedsOffscreenAlphaCompositing;
    private mg.b mOnInterceptTouchEventListener;
    private String mOverflow;
    private final Rect mOverflowInset;
    private Path mPath;
    private q mPointerEvents;
    private e mReactBackgroundDrawable;
    private boolean mRemoveClippedSubviews;

    /* loaded from: classes3.dex */
    class a implements Runnable {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final g f12832a;

        /* synthetic */ b(g gVar, a aVar) {
            this(gVar);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            if (this.f12832a.getRemoveClippedSubviews()) {
                this.f12832a.updateSubviewClipStatus(view);
            }
        }

        private b(g gVar) {
            this.f12832a = gVar;
        }
    }

    public g(Context context) {
        super(context);
        this.mOverflowInset = new Rect();
        this.mRemoveClippedSubviews = false;
        this.mAllChildren = null;
        this.mPointerEvents = q.AUTO;
        this.mNeedsOffscreenAlphaCompositing = false;
        this.mDrawingOrderHelper = null;
        this.mBackfaceOpacity = 1.0f;
        this.mBackfaceVisibility = "visible";
        setClipChildren(false);
    }

    private void addInArray(View view, int i11) {
        View[] viewArr = (View[]) wf.a.c(this.mAllChildren);
        int i12 = this.mAllChildrenCount;
        int length = viewArr.length;
        if (i11 == i12) {
            if (length == i12) {
                View[] viewArr2 = new View[length + 12];
                this.mAllChildren = viewArr2;
                System.arraycopy(viewArr, 0, viewArr2, 0, length);
                viewArr = this.mAllChildren;
            }
            int i13 = this.mAllChildrenCount;
            this.mAllChildrenCount = i13 + 1;
            viewArr[i13] = view;
        } else if (i11 < i12) {
            if (length == i12) {
                View[] viewArr3 = new View[length + 12];
                this.mAllChildren = viewArr3;
                System.arraycopy(viewArr, 0, viewArr3, 0, i11);
                System.arraycopy(viewArr, i11, this.mAllChildren, i11 + 1, i12 - i11);
                viewArr = this.mAllChildren;
            } else {
                System.arraycopy(viewArr, i11, viewArr, i11 + 1, i12 - i11);
            }
            viewArr[i11] = view;
            this.mAllChildrenCount++;
        } else {
            throw new IndexOutOfBoundsException("index=" + i11 + " count=" + i12);
        }
    }

    private boolean customDrawOrderDisabled() {
        return getId() != -1 && og.a.a(getId()) == 2;
    }

    private void dispatchOverflowDraw(Canvas canvas) {
        float f11;
        boolean z11;
        float f12;
        float f13;
        float f14;
        float f15;
        String str = this.mOverflow;
        if (str != null) {
            str.hashCode();
            char c11 = 65535;
            switch (str.hashCode()) {
                case -1217487446:
                    if (str.equals("hidden")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -907680051:
                    if (str.equals("scroll")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 466743410:
                    if (str.equals("visible")) {
                        c11 = 2;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                case 1:
                    float width = getWidth();
                    float height = getHeight();
                    e eVar = this.mReactBackgroundDrawable;
                    float f16 = BitmapDescriptorFactory.HUE_RED;
                    if (eVar != null) {
                        RectF k11 = eVar.k();
                        float f17 = k11.top;
                        if (f17 > BitmapDescriptorFactory.HUE_RED || k11.left > BitmapDescriptorFactory.HUE_RED || k11.bottom > BitmapDescriptorFactory.HUE_RED || k11.right > BitmapDescriptorFactory.HUE_RED) {
                            f12 = k11.left + BitmapDescriptorFactory.HUE_RED;
                            f11 = f17 + BitmapDescriptorFactory.HUE_RED;
                            width -= k11.right;
                            height -= k11.bottom;
                        } else {
                            f11 = 0.0f;
                            f12 = 0.0f;
                        }
                        float m11 = this.mReactBackgroundDrawable.m();
                        float h11 = this.mReactBackgroundDrawable.h(m11, e.b.TOP_LEFT);
                        float h12 = this.mReactBackgroundDrawable.h(m11, e.b.TOP_RIGHT);
                        float h13 = this.mReactBackgroundDrawable.h(m11, e.b.BOTTOM_LEFT);
                        float h14 = this.mReactBackgroundDrawable.h(m11, e.b.BOTTOM_RIGHT);
                        boolean z12 = this.mLayoutDirection == 1;
                        float g11 = this.mReactBackgroundDrawable.g(e.b.TOP_START);
                        float g12 = this.mReactBackgroundDrawable.g(e.b.TOP_END);
                        float g13 = this.mReactBackgroundDrawable.g(e.b.BOTTOM_START);
                        float g14 = this.mReactBackgroundDrawable.g(e.b.BOTTOM_END);
                        if (jg.a.d().b(getContext())) {
                            f14 = com.facebook.yoga.g.a(g11) ? h11 : g11;
                            if (!com.facebook.yoga.g.a(g12)) {
                                h12 = g12;
                            }
                            if (!com.facebook.yoga.g.a(g13)) {
                                h13 = g13;
                            }
                            if (com.facebook.yoga.g.a(g14)) {
                                g14 = h14;
                            }
                            f13 = z12 ? h12 : f14;
                            if (!z12) {
                                f14 = h12;
                            }
                            f15 = z12 ? g14 : h13;
                            if (z12) {
                                g14 = h13;
                            }
                        } else {
                            float f18 = z12 ? g12 : g11;
                            if (!z12) {
                                g11 = g12;
                            }
                            float f19 = z12 ? g14 : g13;
                            if (!z12) {
                                g13 = g14;
                            }
                            if (com.facebook.yoga.g.a(f18)) {
                                f18 = h11;
                            }
                            if (!com.facebook.yoga.g.a(g11)) {
                                h12 = g11;
                            }
                            if (!com.facebook.yoga.g.a(f19)) {
                                h13 = f19;
                            }
                            if (com.facebook.yoga.g.a(g13)) {
                                f13 = f18;
                                f14 = h12;
                                f15 = h13;
                                g14 = h14;
                            } else {
                                g14 = g13;
                                f13 = f18;
                                f14 = h12;
                                f15 = h13;
                            }
                        }
                        if (f13 > BitmapDescriptorFactory.HUE_RED || f14 > BitmapDescriptorFactory.HUE_RED || g14 > BitmapDescriptorFactory.HUE_RED || f15 > BitmapDescriptorFactory.HUE_RED) {
                            if (this.mPath == null) {
                                this.mPath = new Path();
                            }
                            this.mPath.rewind();
                            this.mPath.addRoundRect(new RectF(f12, f11, width, height), new float[]{Math.max(f13 - k11.left, (float) BitmapDescriptorFactory.HUE_RED), Math.max(f13 - k11.top, (float) BitmapDescriptorFactory.HUE_RED), Math.max(f14 - k11.right, (float) BitmapDescriptorFactory.HUE_RED), Math.max(f14 - k11.top, (float) BitmapDescriptorFactory.HUE_RED), Math.max(g14 - k11.right, (float) BitmapDescriptorFactory.HUE_RED), Math.max(g14 - k11.bottom, (float) BitmapDescriptorFactory.HUE_RED), Math.max(f15 - k11.left, (float) BitmapDescriptorFactory.HUE_RED), Math.max(f15 - k11.bottom, (float) BitmapDescriptorFactory.HUE_RED)}, Path.Direction.CW);
                            canvas.clipPath(this.mPath);
                            f16 = f12;
                            z11 = true;
                        } else {
                            f16 = f12;
                            z11 = false;
                        }
                    } else {
                        f11 = 0.0f;
                        z11 = false;
                    }
                    if (z11) {
                        return;
                    }
                    canvas.clipRect(new RectF(f16, f11, width, height));
                    return;
                case 2:
                    Path path = this.mPath;
                    if (path != null) {
                        path.rewind();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private a1 getDrawingOrderHelper() {
        if (this.mDrawingOrderHelper == null) {
            this.mDrawingOrderHelper = new a1(this);
        }
        return this.mDrawingOrderHelper;
    }

    private e getOrCreateReactViewBackground() {
        if (this.mReactBackgroundDrawable == null) {
            this.mReactBackgroundDrawable = new e(getContext());
            Drawable background = getBackground();
            updateBackgroundDrawable(null);
            if (background == null) {
                updateBackgroundDrawable(this.mReactBackgroundDrawable);
            } else {
                updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mReactBackgroundDrawable, background}));
            }
            boolean g11 = jg.a.d().g(getContext());
            this.mLayoutDirection = g11 ? 1 : 0;
            this.mReactBackgroundDrawable.A(g11 ? 1 : 0);
        }
        return this.mReactBackgroundDrawable;
    }

    private int indexOfChildInAllChildren(View view) {
        int i11 = this.mAllChildrenCount;
        View[] viewArr = (View[]) wf.a.c(this.mAllChildren);
        for (int i12 = 0; i12 < i11; i12++) {
            if (viewArr[i12] == view) {
                return i12;
            }
        }
        return -1;
    }

    private void removeFromArray(int i11) {
        View[] viewArr = (View[]) wf.a.c(this.mAllChildren);
        int i12 = this.mAllChildrenCount;
        if (i11 == i12 - 1) {
            int i13 = i12 - 1;
            this.mAllChildrenCount = i13;
            viewArr[i13] = null;
        } else if (i11 >= 0 && i11 < i12) {
            System.arraycopy(viewArr, i11 + 1, viewArr, i11, (i12 - i11) - 1);
            int i14 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i14;
            viewArr[i14] = null;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private void updateBackgroundDrawable(Drawable drawable) {
        super.setBackground(drawable);
    }

    private void updateClippingToRect(Rect rect) {
        wf.a.c(this.mAllChildren);
        int i11 = 0;
        for (int i12 = 0; i12 < this.mAllChildrenCount; i12++) {
            updateSubviewClipStatus(rect, i12, i11);
            if (this.mAllChildren[i12].getParent() == null) {
                i11++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r7 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateSubviewClipStatus(android.graphics.Rect r7, int r8, int r9) {
        /*
            r6 = this;
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()
            android.view.View[] r0 = r6.mAllChildren
            java.lang.Object r0 = wf.a.c(r0)
            android.view.View[] r0 = (android.view.View[]) r0
            r0 = r0[r8]
            android.graphics.Rect r1 = com.facebook.react.views.view.g.sHelperRect
            int r2 = r0.getLeft()
            int r3 = r0.getTop()
            int r4 = r0.getRight()
            int r5 = r0.getBottom()
            r1.set(r2, r3, r4, r5)
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r1 = r1.bottom
            boolean r7 = r7.intersects(r2, r3, r4, r1)
            android.view.animation.Animation r1 = r0.getAnimation()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3e
            boolean r1 = r1.hasEnded()
            if (r1 != 0) goto L3e
            r1 = r3
            goto L3f
        L3e:
            r1 = r2
        L3f:
            if (r7 != 0) goto L4e
            android.view.ViewParent r4 = r0.getParent()
            if (r4 == 0) goto L4e
            if (r1 != 0) goto L4e
            int r8 = r8 - r9
            super.removeViewsInLayout(r8, r3)
            goto L62
        L4e:
            if (r7 == 0) goto L60
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L60
            int r8 = r8 - r9
            android.view.ViewGroup$LayoutParams r7 = com.facebook.react.views.view.g.sDefaultLayoutParam
            super.addViewInLayout(r0, r8, r7, r3)
            r6.invalidate()
            goto L62
        L60:
            if (r7 == 0) goto L63
        L62:
            r2 = r3
        L63:
            if (r2 == 0) goto L74
            boolean r7 = r0 instanceof com.facebook.react.uimanager.t
            if (r7 == 0) goto L74
            com.facebook.react.uimanager.t r0 = (com.facebook.react.uimanager.t) r0
            boolean r7 = r0.getRemoveClippedSubviews()
            if (r7 == 0) goto L74
            r0.updateClippingRect()
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.g.updateSubviewClipStatus(android.graphics.Rect, int, int):void");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!customDrawOrderDisabled()) {
            getDrawingOrderHelper().b(view);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
        } else {
            setChildrenDrawingOrderEnabled(false);
        }
        super.addView(view, i11, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addViewWithSubviewClippingEnabled(View view, int i11) {
        addViewWithSubviewClippingEnabled(view, i11, sDefaultLayoutParam);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            dispatchOverflowDraw(canvas);
            super.dispatchDraw(canvas);
        } catch (NullPointerException | StackOverflowError e11) {
            i0 a11 = j0.a(this);
            if (a11 != null) {
                a11.a(e11);
            } else if (getContext() instanceof ReactContext) {
                ((ReactContext) getContext()).handleException(new IllegalViewOperationException("StackOverflowException", this, e11));
            } else {
                throw e11;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        try {
            super.dispatchProvideStructure(viewStructure);
        } catch (NullPointerException e11) {
            nd.a.k("ReactNative", "NullPointerException when executing dispatchProvideStructure", e11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z11) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j11) {
        boolean z11 = view.getElevation() > BitmapDescriptorFactory.HUE_RED && ReactFeatureFlags.insertZReorderBarriersOnViewGroupChildren;
        if (z11) {
            com.facebook.react.views.view.a.a(canvas, true);
        }
        boolean drawChild = super.drawChild(canvas, view, j11);
        if (z11) {
            com.facebook.react.views.view.a.a(canvas, false);
        }
        return drawChild;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getAllChildrenCount() {
        return this.mAllChildrenCount;
    }

    public int getBackgroundColor() {
        if (getBackground() != null) {
            return ((e) getBackground()).j();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View getChildAtWithSubviewClippingEnabled(int i11) {
        return ((View[]) wf.a.c(this.mAllChildren))[i11];
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        UiThreadUtil.assertOnUiThread();
        return !customDrawOrderDisabled() ? getDrawingOrderHelper().a(i11, i12) : i12;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.t
    public void getClippingRect(Rect rect) {
        rect.set(this.mClippingRect);
    }

    @Override // mg.c
    public Rect getHitSlopRect() {
        return this.mHitSlopRect;
    }

    @Override // com.facebook.react.uimanager.x
    public String getOverflow() {
        return this.mOverflow;
    }

    @Override // com.facebook.react.uimanager.y
    public Rect getOverflowInset() {
        return this.mOverflowInset;
    }

    @Override // com.facebook.react.uimanager.z
    public q getPointerEvents() {
        return this.mPointerEvents;
    }

    @Override // com.facebook.react.uimanager.t
    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    @Override // com.facebook.react.uimanager.g0
    public int getZIndexMappedChildIndex(int i11) {
        UiThreadUtil.assertOnUiThread();
        return (customDrawOrderDisabled() || !getDrawingOrderHelper().d()) ? i11 : getDrawingOrderHelper().a(getChildCount(), i11);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        q qVar;
        mg.b bVar = this.mOnInterceptTouchEventListener;
        if ((bVar != null && bVar.a(this, motionEvent)) || (qVar = this.mPointerEvents) == q.NONE || qVar == q.BOX_ONLY) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        k.a(i11, i12);
        setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        e eVar = this.mReactBackgroundDrawable;
        if (eVar != null) {
            eVar.A(this.mLayoutDirection);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        q qVar = this.mPointerEvents;
        return (qVar == q.NONE || qVar == q.BOX_NONE) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeAllViewsWithSubviewClippingEnabled() {
        wf.a.a(this.mRemoveClippedSubviews);
        wf.a.c(this.mAllChildren);
        for (int i11 = 0; i11 < this.mAllChildrenCount; i11++) {
            this.mAllChildren[i11].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        removeAllViewsInLayout();
        this.mAllChildrenCount = 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (!customDrawOrderDisabled()) {
            getDrawingOrderHelper().c(view);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
        } else {
            setChildrenDrawingOrderEnabled(false);
        }
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i11) {
        UiThreadUtil.assertOnUiThread();
        if (!customDrawOrderDisabled()) {
            getDrawingOrderHelper().c(getChildAt(i11));
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
        } else {
            setChildrenDrawingOrderEnabled(false);
        }
        super.removeViewAt(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeViewWithSubviewClippingEnabled(View view) {
        UiThreadUtil.assertOnUiThread();
        wf.a.a(this.mRemoveClippedSubviews);
        wf.a.c(this.mClippingRect);
        wf.a.c(this.mAllChildren);
        view.removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        int indexOfChildInAllChildren = indexOfChildInAllChildren(view);
        if (this.mAllChildren[indexOfChildInAllChildren].getParent() != null) {
            int i11 = 0;
            for (int i12 = 0; i12 < indexOfChildInAllChildren; i12++) {
                if (this.mAllChildren[i12].getParent() == null) {
                    i11++;
                }
            }
            super.removeViewsInLayout(indexOfChildInAllChildren - i11, 1);
        }
        removeFromArray(indexOfChildInAllChildren);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public void setBackfaceVisibility(String str) {
        this.mBackfaceVisibility = str;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setBackfaceVisibilityDependantOpacity() {
        if (this.mBackfaceVisibility.equals("visible")) {
            setAlpha(this.mBackfaceOpacity);
            return;
        }
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        if (rotationX >= -90.0f && rotationX < 90.0f && rotationY >= -90.0f && rotationY < 90.0f) {
            setAlpha(this.mBackfaceOpacity);
        } else {
            setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        throw new UnsupportedOperationException("This method is not supported for ReactViewGroup instances");
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        if (i11 == 0 && this.mReactBackgroundDrawable == null) {
            return;
        }
        getOrCreateReactViewBackground().x(i11);
    }

    public void setBorderColor(int i11, float f11, float f12) {
        getOrCreateReactViewBackground().t(i11, f11, f12);
    }

    public void setBorderRadius(float f11) {
        getOrCreateReactViewBackground().y(f11);
    }

    public void setBorderStyle(String str) {
        getOrCreateReactViewBackground().v(str);
    }

    public void setBorderWidth(int i11, float f11) {
        getOrCreateReactViewBackground().w(i11, f11);
    }

    public void setHitSlopRect(Rect rect) {
        this.mHitSlopRect = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z11) {
        this.mNeedsOffscreenAlphaCompositing = z11;
    }

    @Override // mg.d
    public void setOnInterceptTouchEventListener(mg.b bVar) {
        this.mOnInterceptTouchEventListener = bVar;
    }

    public void setOpacityIfPossible(float f11) {
        this.mBackfaceOpacity = f11;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(String str) {
        this.mOverflow = str;
        invalidate();
    }

    @Override // com.facebook.react.uimanager.y
    public void setOverflowInset(int i11, int i12, int i13, int i14) {
        this.mOverflowInset.set(i11, i12, i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPointerEvents(q qVar) {
        this.mPointerEvents = qVar;
    }

    public void setRemoveClippedSubviews(boolean z11) {
        if (z11 == this.mRemoveClippedSubviews) {
            return;
        }
        this.mRemoveClippedSubviews = z11;
        if (z11) {
            Rect rect = new Rect();
            this.mClippingRect = rect;
            u.a(this, rect);
            int childCount = getChildCount();
            this.mAllChildrenCount = childCount;
            this.mAllChildren = new View[Math.max(12, childCount)];
            this.mChildrenLayoutChangeListener = new b(this, null);
            for (int i11 = 0; i11 < this.mAllChildrenCount; i11++) {
                View childAt = getChildAt(i11);
                this.mAllChildren[i11] = childAt;
                childAt.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
            updateClippingRect();
            return;
        }
        wf.a.c(this.mClippingRect);
        wf.a.c(this.mAllChildren);
        wf.a.c(this.mChildrenLayoutChangeListener);
        for (int i12 = 0; i12 < this.mAllChildrenCount; i12++) {
            this.mAllChildren[i12].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        getDrawingRect(this.mClippingRect);
        updateClippingToRect(this.mClippingRect);
        this.mAllChildren = null;
        this.mClippingRect = null;
        this.mAllChildrenCount = 0;
        this.mChildrenLayoutChangeListener = null;
    }

    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        updateBackgroundDrawable(null);
        if (this.mReactBackgroundDrawable != null && drawable != null) {
            updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mReactBackgroundDrawable, drawable}));
        } else if (drawable != null) {
            updateBackgroundDrawable(drawable);
        }
    }

    @Override // com.facebook.react.uimanager.t
    public void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            wf.a.c(this.mClippingRect);
            wf.a.c(this.mAllChildren);
            u.a(this, this.mClippingRect);
            updateClippingToRect(this.mClippingRect);
        }
    }

    @Override // com.facebook.react.uimanager.g0
    public void updateDrawingOrder() {
        if (customDrawOrderDisabled()) {
            return;
        }
        getDrawingOrderHelper().e();
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
        invalidate();
    }

    void addViewWithSubviewClippingEnabled(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        wf.a.a(this.mRemoveClippedSubviews);
        wf.a.c(this.mClippingRect);
        wf.a.c(this.mAllChildren);
        addInArray(view, i11);
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (this.mAllChildren[i13].getParent() == null) {
                i12++;
            }
        }
        updateSubviewClipStatus(this.mClippingRect, i11, i12);
        view.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
    }

    public void setBorderRadius(float f11, int i11) {
        getOrCreateReactViewBackground().z(f11, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSubviewClipStatus(View view) {
        if (!this.mRemoveClippedSubviews || getParent() == null) {
            return;
        }
        wf.a.c(this.mClippingRect);
        wf.a.c(this.mAllChildren);
        Rect rect = sHelperRect;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (this.mClippingRect.intersects(rect.left, rect.top, rect.right, rect.bottom) != (view.getParent() != null)) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.mAllChildrenCount; i12++) {
                View[] viewArr = this.mAllChildren;
                if (viewArr[i12] == view) {
                    updateSubviewClipStatus(this.mClippingRect, i12, i11);
                    return;
                }
                if (viewArr[i12].getParent() == null) {
                    i11++;
                }
            }
        }
    }
}