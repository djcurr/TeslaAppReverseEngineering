package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f3.d;
import f3.e;
import g3.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.3";
    private static j sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.b> mConstraintHelpers;
    protected androidx.constraintlayout.widget.c mConstraintLayoutSpec;
    private d mConstraintSet;
    private int mConstraintSetId;
    private f mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected f3.f mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    c mMeasurer;
    private a3.e mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<f3.e> mTempMapIdToWidget;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3720a;

        static {
            int[] iArr = new int[e.b.values().length];
            f3720a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3720a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3720a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3720a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements b.InterfaceC0524b {

        /* renamed from: a */
        ConstraintLayout f3766a;

        /* renamed from: b */
        int f3767b;

        /* renamed from: c */
        int f3768c;

        /* renamed from: d */
        int f3769d;

        /* renamed from: e */
        int f3770e;

        /* renamed from: f */
        int f3771f;

        /* renamed from: g */
        int f3772g;

        public c(ConstraintLayout constraintLayout) {
            ConstraintLayout.this = r1;
            this.f3766a = constraintLayout;
        }

        private boolean d(int i11, int i12, int i13) {
            if (i11 == i12) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i11);
            View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            int size = View.MeasureSpec.getSize(i12);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i13 == size;
            }
            return false;
        }

        @Override // g3.b.InterfaceC0524b
        public final void a() {
            int childCount = this.f3766a.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f3766a.getChildAt(i11);
                if (childAt instanceof g) {
                    ((g) childAt).a(this.f3766a);
                }
            }
            int size = this.f3766a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    ((androidx.constraintlayout.widget.b) this.f3766a.mConstraintHelpers.get(i12)).q(this.f3766a);
                }
            }
        }

        @Override // g3.b.InterfaceC0524b
        public final void b(f3.e eVar, b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int i11;
            int i12;
            int i13;
            if (eVar == null) {
                return;
            }
            if (eVar.V() == 8 && !eVar.j0()) {
                aVar.f27494e = 0;
                aVar.f27495f = 0;
                aVar.f27496g = 0;
            } else if (eVar.J() == null) {
            } else {
                e.b bVar = aVar.f27490a;
                e.b bVar2 = aVar.f27491b;
                int i14 = aVar.f27492c;
                int i15 = aVar.f27493d;
                int i16 = this.f3767b + this.f3768c;
                int i17 = this.f3769d;
                View view = (View) eVar.q();
                int[] iArr = a.f3720a;
                int i18 = iArr[bVar.ordinal()];
                if (i18 == 1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                } else if (i18 == 2) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3771f, i17, -2);
                } else if (i18 == 3) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3771f, i17 + eVar.z(), -1);
                } else if (i18 != 4) {
                    makeMeasureSpec = 0;
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3771f, i17, -2);
                    boolean z11 = eVar.f25742u == 1;
                    int i19 = aVar.f27499j;
                    if (i19 == b.a.f27488l || i19 == b.a.f27489m) {
                        if (aVar.f27499j == b.a.f27489m || !z11 || (z11 && (view.getMeasuredHeight() == eVar.v())) || (view instanceof g) || eVar.n0()) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.W(), 1073741824);
                        }
                    }
                }
                int i21 = iArr[bVar2.ordinal()];
                if (i21 == 1) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                } else if (i21 == 2) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3772g, i16, -2);
                } else if (i21 == 3) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3772g, i16 + eVar.U(), -1);
                } else if (i21 != 4) {
                    makeMeasureSpec2 = 0;
                } else {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3772g, i16, -2);
                    boolean z12 = eVar.f25744v == 1;
                    int i22 = aVar.f27499j;
                    if (i22 == b.a.f27488l || i22 == b.a.f27489m) {
                        if (aVar.f27499j == b.a.f27489m || !z12 || (z12 && (view.getMeasuredWidth() == eVar.W())) || (view instanceof g) || eVar.o0()) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                        }
                    }
                }
                f3.f fVar = (f3.f) eVar.J();
                if (fVar != null && f3.j.b(ConstraintLayout.this.mOptimizationLevel, 256) && view.getMeasuredWidth() == eVar.W() && view.getMeasuredWidth() < fVar.W() && view.getMeasuredHeight() == eVar.v() && view.getMeasuredHeight() < fVar.v() && view.getBaseline() == eVar.n() && !eVar.m0()) {
                    if (d(eVar.A(), makeMeasureSpec, eVar.W()) && d(eVar.B(), makeMeasureSpec2, eVar.v())) {
                        aVar.f27494e = eVar.W();
                        aVar.f27495f = eVar.v();
                        aVar.f27496g = eVar.n();
                        return;
                    }
                }
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                boolean z13 = bVar == bVar3;
                boolean z14 = bVar2 == bVar3;
                e.b bVar4 = e.b.MATCH_PARENT;
                boolean z15 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
                boolean z16 = bVar == bVar4 || bVar == e.b.FIXED;
                boolean z17 = z13 && eVar.f25705b0 > BitmapDescriptorFactory.HUE_RED;
                boolean z18 = z14 && eVar.f25705b0 > BitmapDescriptorFactory.HUE_RED;
                if (view == null) {
                    return;
                }
                b bVar5 = (b) view.getLayoutParams();
                int i23 = aVar.f27499j;
                if (i23 != b.a.f27488l && i23 != b.a.f27489m && z13 && eVar.f25742u == 0 && z14 && eVar.f25744v == 0) {
                    i13 = -1;
                    i12 = 0;
                    baseline = 0;
                    max = 0;
                } else {
                    if ((view instanceof l) && (eVar instanceof f3.k)) {
                        ((l) view).u((f3.k) eVar, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    eVar.U0(makeMeasureSpec, makeMeasureSpec2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i24 = eVar.f25747x;
                    max = i24 > 0 ? Math.max(i24, measuredWidth) : measuredWidth;
                    int i25 = eVar.f25748y;
                    if (i25 > 0) {
                        max = Math.min(i25, max);
                    }
                    int i26 = eVar.A;
                    if (i26 > 0) {
                        i12 = Math.max(i26, measuredHeight);
                        i11 = makeMeasureSpec;
                    } else {
                        i11 = makeMeasureSpec;
                        i12 = measuredHeight;
                    }
                    int i27 = eVar.B;
                    if (i27 > 0) {
                        i12 = Math.min(i27, i12);
                    }
                    if (!f3.j.b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                        if (z17 && z15) {
                            max = (int) ((i12 * eVar.f25705b0) + 0.5f);
                        } else if (z18 && z16) {
                            i12 = (int) ((max / eVar.f25705b0) + 0.5f);
                        }
                    }
                    if (measuredWidth != max || measuredHeight != i12) {
                        int makeMeasureSpec3 = measuredWidth != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i11;
                        if (measuredHeight != i12) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                        }
                        view.measure(makeMeasureSpec3, makeMeasureSpec2);
                        eVar.U0(makeMeasureSpec3, makeMeasureSpec2);
                        max = view.getMeasuredWidth();
                        i12 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i13 = -1;
                }
                boolean z19 = baseline != i13;
                aVar.f27498i = (max == aVar.f27492c && i12 == aVar.f27493d) ? false : true;
                if (bVar5.f3726c0) {
                    z19 = true;
                }
                if (z19 && baseline != -1 && eVar.n() != baseline) {
                    aVar.f27498i = true;
                }
                aVar.f27494e = max;
                aVar.f27495f = i12;
                aVar.f27497h = z19;
                aVar.f27496g = baseline;
            }
        }

        public void c(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f3767b = i13;
            this.f3768c = i14;
            this.f3769d = i15;
            this.f3770e = i16;
            this.f3771f = i11;
            this.f3772g = i12;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new f3.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Build.VERSION.SDK_INT >= 17 ? Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart()) : 0;
        return max2 > 0 ? max2 : max;
    }

    public static j getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new j();
        }
        return sSharedValues;
    }

    private final f3.e getTargetWidget(int i11) {
        if (i11 == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i11);
        if (view == null && (view = findViewById(i11)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f3756r0;
    }

    private void init(AttributeSet attributeSet, int i11, int i12) {
        this.mLayoutWidget.A0(this);
        this.mLayoutWidget.U1(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.U0, i11, i12);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == i.Z0) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == i.f3930a1) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == i.X0) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == i.Y0) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == i.f4075o2) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == i.f4024j1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == i.f3984f1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.mConstraintSet = dVar;
                        dVar.v(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.V1(this.mOptimizationLevel);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            f3.e viewWidget = getViewWidget(getChildAt(i11));
            if (viewWidget != null) {
                viewWidget.t0();
            }
        }
        if (isInEditMode) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).B0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof e)) {
                    this.mConstraintSet = ((e) childAt2).getConstraintSet();
                }
            }
        }
        d dVar = this.mConstraintSet;
        if (dVar != null) {
            dVar.j(this, true);
        }
        this.mLayoutWidget.t1();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                this.mConstraintHelpers.get(i14).s(this);
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt3 = getChildAt(i15);
            if (childAt3 instanceof g) {
                ((g) childAt3).b(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt4 = getChildAt(i16);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt5 = getChildAt(i17);
            f3.e viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.mLayoutWidget.a(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, bVar, this.mTempMapIdToWidget);
            }
        }
    }

    private void setWidgetBaseline(f3.e eVar, b bVar, SparseArray<f3.e> sparseArray, int i11, d.b bVar2) {
        View view = this.mChildrenByIds.get(i11);
        f3.e eVar2 = sparseArray.get(i11);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f3726c0 = true;
        d.b bVar3 = d.b.BASELINE;
        if (bVar2 == bVar3) {
            b bVar4 = (b) view.getLayoutParams();
            bVar4.f3726c0 = true;
            bVar4.f3756r0.J0(true);
        }
        eVar.m(bVar3).a(eVar2.m(bVar2), bVar.D, bVar.C, true);
        eVar.J0(true);
        eVar.m(d.b.TOP).p();
        eVar.m(d.b.BOTTOM).p();
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            } else if (getChildAt(i11).isLayoutRequested()) {
                z11 = true;
                break;
            } else {
                i11++;
            }
        }
        if (z11) {
            setChildrenConstraints();
        }
        return z11;
    }

    protected void applyConstraintsFromLayoutParams(boolean z11, View view, f3.e eVar, b bVar, SparseArray<f3.e> sparseArray) {
        int i11;
        float f11;
        int i12;
        int i13;
        f3.e eVar2;
        f3.e eVar3;
        f3.e eVar4;
        f3.e eVar5;
        int i14;
        bVar.b();
        eVar.i1(view.getVisibility());
        if (bVar.f3732f0) {
            eVar.S0(true);
            eVar.i1(8);
        }
        eVar.A0(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).o(eVar, this.mLayoutWidget.O1());
        }
        if (bVar.f3728d0) {
            f3.g gVar = (f3.g) eVar;
            int i15 = bVar.f3750o0;
            int i16 = bVar.f3752p0;
            float f12 = bVar.f3754q0;
            if (Build.VERSION.SDK_INT < 17) {
                i15 = bVar.f3721a;
                i16 = bVar.f3723b;
                f12 = bVar.f3725c;
            }
            if (f12 != -1.0f) {
                gVar.y1(f12);
                return;
            } else if (i15 != -1) {
                gVar.w1(i15);
                return;
            } else if (i16 != -1) {
                gVar.x1(i16);
                return;
            } else {
                return;
            }
        }
        int i17 = bVar.f3736h0;
        int i18 = bVar.f3738i0;
        int i19 = bVar.f3740j0;
        int i21 = bVar.f3742k0;
        int i22 = bVar.f3744l0;
        int i23 = bVar.f3746m0;
        float f13 = bVar.f3748n0;
        if (Build.VERSION.SDK_INT < 17) {
            i17 = bVar.f3729e;
            int i24 = bVar.f3731f;
            int i25 = bVar.f3733g;
            int i26 = bVar.f3735h;
            int i27 = bVar.f3761w;
            int i28 = bVar.f3763y;
            float f14 = bVar.E;
            if (i17 == -1 && i24 == -1) {
                int i29 = bVar.f3758t;
                if (i29 != -1) {
                    i17 = i29;
                } else {
                    int i31 = bVar.f3757s;
                    if (i31 != -1) {
                        i24 = i31;
                    }
                }
            }
            if (i25 == -1 && i26 == -1) {
                i12 = bVar.f3759u;
                if (i12 == -1) {
                    int i32 = bVar.f3760v;
                    if (i32 != -1) {
                        i11 = i28;
                        f11 = f14;
                        i22 = i27;
                        i13 = i32;
                        i18 = i24;
                        i12 = i25;
                    }
                }
                i11 = i28;
                f11 = f14;
                i22 = i27;
                i13 = i26;
                i18 = i24;
            }
            i12 = i25;
            i11 = i28;
            f11 = f14;
            i22 = i27;
            i13 = i26;
            i18 = i24;
        } else {
            i11 = i23;
            f11 = f13;
            i12 = i19;
            i13 = i21;
        }
        int i33 = bVar.f3751p;
        if (i33 != -1) {
            f3.e eVar6 = sparseArray.get(i33);
            if (eVar6 != null) {
                eVar.j(eVar6, bVar.f3755r, bVar.f3753q);
            }
        } else {
            if (i17 != -1) {
                f3.e eVar7 = sparseArray.get(i17);
                if (eVar7 != null) {
                    d.b bVar2 = d.b.LEFT;
                    eVar.e0(bVar2, eVar7, bVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i22);
                }
            } else if (i18 != -1 && (eVar2 = sparseArray.get(i18)) != null) {
                eVar.e0(d.b.LEFT, eVar2, d.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i22);
            }
            if (i12 != -1) {
                f3.e eVar8 = sparseArray.get(i12);
                if (eVar8 != null) {
                    eVar.e0(d.b.RIGHT, eVar8, d.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i11);
                }
            } else if (i13 != -1 && (eVar3 = sparseArray.get(i13)) != null) {
                d.b bVar3 = d.b.RIGHT;
                eVar.e0(bVar3, eVar3, bVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i11);
            }
            int i34 = bVar.f3737i;
            if (i34 != -1) {
                f3.e eVar9 = sparseArray.get(i34);
                if (eVar9 != null) {
                    d.b bVar4 = d.b.TOP;
                    eVar.e0(bVar4, eVar9, bVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f3762x);
                }
            } else {
                int i35 = bVar.f3739j;
                if (i35 != -1 && (eVar4 = sparseArray.get(i35)) != null) {
                    eVar.e0(d.b.TOP, eVar4, d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f3762x);
                }
            }
            int i36 = bVar.f3741k;
            if (i36 != -1) {
                f3.e eVar10 = sparseArray.get(i36);
                if (eVar10 != null) {
                    eVar.e0(d.b.BOTTOM, eVar10, d.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f3764z);
                }
            } else {
                int i37 = bVar.f3743l;
                if (i37 != -1 && (eVar5 = sparseArray.get(i37)) != null) {
                    d.b bVar5 = d.b.BOTTOM;
                    eVar.e0(bVar5, eVar5, bVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f3764z);
                }
            }
            int i38 = bVar.f3745m;
            if (i38 != -1) {
                setWidgetBaseline(eVar, bVar, sparseArray, i38, d.b.BASELINE);
            } else {
                int i39 = bVar.f3747n;
                if (i39 != -1) {
                    setWidgetBaseline(eVar, bVar, sparseArray, i39, d.b.TOP);
                } else {
                    int i41 = bVar.f3749o;
                    if (i41 != -1) {
                        setWidgetBaseline(eVar, bVar, sparseArray, i41, d.b.BOTTOM);
                    }
                }
            }
            if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                eVar.L0(f11);
            }
            float f15 = bVar.F;
            if (f15 >= BitmapDescriptorFactory.HUE_RED) {
                eVar.c1(f15);
            }
        }
        if (z11 && ((i14 = bVar.T) != -1 || bVar.U != -1)) {
            eVar.a1(i14, bVar.U);
        }
        if (!bVar.f3722a0) {
            if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
                if (bVar.W) {
                    eVar.O0(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar.O0(e.b.MATCH_PARENT);
                }
                eVar.m(d.b.LEFT).f25697g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                eVar.m(d.b.RIGHT).f25697g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            } else {
                eVar.O0(e.b.MATCH_CONSTRAINT);
                eVar.j1(0);
            }
        } else {
            eVar.O0(e.b.FIXED);
            eVar.j1(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.O0(e.b.WRAP_CONTENT);
            }
        }
        if (!bVar.f3724b0) {
            if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
                if (bVar.X) {
                    eVar.f1(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar.f1(e.b.MATCH_PARENT);
                }
                eVar.m(d.b.TOP).f25697g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                eVar.m(d.b.BOTTOM).f25697g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            } else {
                eVar.f1(e.b.MATCH_CONSTRAINT);
                eVar.K0(0);
            }
        } else {
            eVar.f1(e.b.FIXED);
            eVar.K0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.f1(e.b.WRAP_CONTENT);
            }
        }
        eVar.C0(bVar.G);
        eVar.Q0(bVar.H);
        eVar.h1(bVar.I);
        eVar.M0(bVar.J);
        eVar.d1(bVar.K);
        eVar.k1(bVar.Z);
        eVar.P0(bVar.L, bVar.N, bVar.P, bVar.R);
        eVar.g1(bVar.M, bVar.O, bVar.Q, bVar.S);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                this.mConstraintHelpers.get(i11).r(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i13 = (int) ((parseInt / 1080.0f) * width);
                        int i14 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f11 = i13;
                        float f12 = i14;
                        float f13 = i13 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f11, f12, f13, f12, paint);
                        float parseInt4 = i14 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f13, f12, f13, parseInt4, paint);
                        canvas.drawLine(f13, parseInt4, f11, parseInt4, paint);
                        canvas.drawLine(f11, parseInt4, f11, f12, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f11, f12, f13, parseInt4, paint);
                        canvas.drawLine(f11, parseInt4, f13, f12, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(a3.e eVar) {
        this.mLayoutWidget.H1(eVar);
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i11, Object obj) {
        if (i11 == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.mDesignIds;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.mDesignIds.get(str);
        }
        return null;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.J1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.mLayoutWidget.f25726m == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.mLayoutWidget.f25726m = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.mLayoutWidget.f25726m = "parent";
            }
        }
        if (this.mLayoutWidget.r() == null) {
            f3.f fVar = this.mLayoutWidget;
            fVar.B0(fVar.f25726m);
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.r());
        }
        Iterator<f3.e> it2 = this.mLayoutWidget.q1().iterator();
        while (it2.hasNext()) {
            f3.e next = it2.next();
            View view = (View) next.q();
            if (view != null) {
                if (next.f25726m == null && (id2 = view.getId()) != -1) {
                    next.f25726m = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.r() == null) {
                    next.B0(next.f25726m);
                    Log.v(TAG, " setDebugName " + next.r());
                }
            }
        }
        this.mLayoutWidget.N(sb2);
        return sb2.toString();
    }

    public View getViewById(int i11) {
        return this.mChildrenByIds.get(i11);
    }

    public final f3.e getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).f3756r0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).f3756r0;
            }
            return null;
        }
        return null;
    }

    public boolean isRtl() {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
        }
        return false;
    }

    public void loadLayoutDescription(int i11) {
        if (i11 != 0) {
            try {
                this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, i11);
                return;
            } catch (Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
                return;
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            b bVar = (b) childAt.getLayoutParams();
            f3.e eVar = bVar.f3756r0;
            if ((childAt.getVisibility() != 8 || bVar.f3728d0 || bVar.f3730e0 || bVar.f3734g0 || isInEditMode) && !bVar.f3732f0) {
                int X = eVar.X();
                int Y = eVar.Y();
                int W = eVar.W() + X;
                int v11 = eVar.v() + Y;
                childAt.layout(X, Y, W, v11);
                if ((childAt instanceof g) && (content = ((g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(X, Y, W, v11);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i16 = 0; i16 < size; i16++) {
                this.mConstraintHelpers.get(i16).p(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        if (this.mOnMeasureWidthMeasureSpec == i11) {
            int i13 = this.mOnMeasureHeightMeasureSpec;
        }
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount) {
                    break;
                } else if (getChildAt(i14).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                } else {
                    i14++;
                }
            }
        }
        boolean z11 = this.mDirtyHierarchy;
        this.mOnMeasureWidthMeasureSpec = i11;
        this.mOnMeasureHeightMeasureSpec = i12;
        this.mLayoutWidget.X1(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.Z1();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i11, i12);
        resolveMeasuredDimension(i11, i12, this.mLayoutWidget.W(), this.mLayoutWidget.v(), this.mLayoutWidget.P1(), this.mLayoutWidget.N1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        f3.e viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof f3.g)) {
            b bVar = (b) view.getLayoutParams();
            f3.g gVar = new f3.g();
            bVar.f3756r0 = gVar;
            bVar.f3728d0 = true;
            gVar.z1(bVar.V);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.t();
            ((b) view.getLayoutParams()).f3730e0 = true;
            if (!this.mConstraintHelpers.contains(bVar2)) {
                this.mConstraintHelpers.add(bVar2);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.s1(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    protected void parseLayoutDescription(int i11) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    protected void resolveMeasuredDimension(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        c cVar = this.mMeasurer;
        int i15 = cVar.f3770e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i13 + cVar.f3769d, i11, 0);
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, ViewGroup.resolveSizeAndState(i14 + i15, i12, 0) & 16777215);
        if (z11) {
            min |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z12) {
            min2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    protected void resolveSystem(f3.f fVar, int i11, int i12, int i13) {
        int max;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        int max2 = Math.max(0, getPaddingTop());
        int max3 = Math.max(0, getPaddingBottom());
        int i14 = max2 + max3;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.c(i12, i13, max2, max3, paddingWidth, i14);
        if (Build.VERSION.SDK_INT >= 17) {
            int max4 = Math.max(0, getPaddingStart());
            int max5 = Math.max(0, getPaddingEnd());
            if (max4 <= 0 && max5 <= 0) {
                max4 = Math.max(0, getPaddingLeft());
            } else if (isRtl()) {
                max4 = max5;
            }
            max = max4;
        } else {
            max = Math.max(0, getPaddingLeft());
        }
        int i15 = size - paddingWidth;
        int i16 = size2 - i14;
        setSelfDimensionBehaviour(fVar, mode, i15, mode2, i16);
        fVar.Q1(i11, mode, i15, mode2, i16, this.mLastMeasureWidth, this.mLastMeasureHeight, max, max2);
    }

    public void setConstraintSet(d dVar) {
        this.mConstraintSet = dVar;
    }

    public void setDesignInformation(int i11, Object obj, Object obj2) {
        if (i11 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int i11) {
        this.mChildrenByIds.remove(getId());
        super.setId(i11);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i11) {
        if (i11 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i11;
        requestLayout();
    }

    public void setMaxWidth(int i11) {
        if (i11 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i11;
        requestLayout();
    }

    public void setMinHeight(int i11) {
        if (i11 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i11;
        requestLayout();
    }

    public void setMinWidth(int i11) {
        if (i11 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i11;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i11) {
        this.mOptimizationLevel = i11;
        this.mLayoutWidget.V1(i11);
    }

    protected void setSelfDimensionBehaviour(f3.f fVar, int i11, int i12, int i13, int i14) {
        e.b bVar;
        c cVar = this.mMeasurer;
        int i15 = cVar.f3770e;
        int i16 = cVar.f3769d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i11 == Integer.MIN_VALUE) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i12 = Math.max(0, this.mMinWidth);
            }
        } else if (i11 == 0) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i12 = Math.max(0, this.mMinWidth);
            }
            i12 = 0;
        } else if (i11 != 1073741824) {
            bVar = bVar2;
            i12 = 0;
        } else {
            i12 = Math.min(this.mMaxWidth - i16, i12);
            bVar = bVar2;
        }
        if (i13 == Integer.MIN_VALUE) {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i14 = Math.max(0, this.mMinHeight);
            }
        } else if (i13 != 0) {
            if (i13 == 1073741824) {
                i14 = Math.min(this.mMaxHeight - i15, i14);
            }
            i14 = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i14 = Math.max(0, this.mMinHeight);
            }
            i14 = 0;
        }
        if (i12 != fVar.W() || i14 != fVar.v()) {
            fVar.M1();
        }
        fVar.l1(0);
        fVar.m1(0);
        fVar.W0(this.mMaxWidth - i16);
        fVar.V0(this.mMaxHeight - i15);
        fVar.Z0(0);
        fVar.Y0(0);
        fVar.O0(bVar);
        fVar.j1(i12);
        fVar.f1(bVar2);
        fVar.K0(i14);
        fVar.Z0(this.mMinWidth - i16);
        fVar.Y0(this.mMinHeight - i15);
    }

    public void setState(int i11, int i12, int i13) {
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.d(i11, i12, i13);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new f3.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new f3.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i11, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new f3.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i11, i12);
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;

        /* renamed from: a */
        public int f3721a;

        /* renamed from: a0 */
        boolean f3722a0;

        /* renamed from: b */
        public int f3723b;

        /* renamed from: b0 */
        boolean f3724b0;

        /* renamed from: c */
        public float f3725c;

        /* renamed from: c0 */
        boolean f3726c0;

        /* renamed from: d */
        public boolean f3727d;

        /* renamed from: d0 */
        boolean f3728d0;

        /* renamed from: e */
        public int f3729e;

        /* renamed from: e0 */
        boolean f3730e0;

        /* renamed from: f */
        public int f3731f;

        /* renamed from: f0 */
        boolean f3732f0;

        /* renamed from: g */
        public int f3733g;

        /* renamed from: g0 */
        boolean f3734g0;

        /* renamed from: h */
        public int f3735h;

        /* renamed from: h0 */
        int f3736h0;

        /* renamed from: i */
        public int f3737i;

        /* renamed from: i0 */
        int f3738i0;

        /* renamed from: j */
        public int f3739j;

        /* renamed from: j0 */
        int f3740j0;

        /* renamed from: k */
        public int f3741k;

        /* renamed from: k0 */
        int f3742k0;

        /* renamed from: l */
        public int f3743l;

        /* renamed from: l0 */
        int f3744l0;

        /* renamed from: m */
        public int f3745m;

        /* renamed from: m0 */
        int f3746m0;

        /* renamed from: n */
        public int f3747n;

        /* renamed from: n0 */
        float f3748n0;

        /* renamed from: o */
        public int f3749o;

        /* renamed from: o0 */
        int f3750o0;

        /* renamed from: p */
        public int f3751p;

        /* renamed from: p0 */
        int f3752p0;

        /* renamed from: q */
        public int f3753q;

        /* renamed from: q0 */
        float f3754q0;

        /* renamed from: r */
        public float f3755r;

        /* renamed from: r0 */
        f3.e f3756r0;

        /* renamed from: s */
        public int f3757s;

        /* renamed from: t */
        public int f3758t;

        /* renamed from: u */
        public int f3759u;

        /* renamed from: v */
        public int f3760v;

        /* renamed from: w */
        public int f3761w;

        /* renamed from: x */
        public int f3762x;

        /* renamed from: y */
        public int f3763y;

        /* renamed from: z */
        public int f3764z;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            public static final SparseIntArray f3765a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f3765a = sparseIntArray;
                sparseIntArray.append(i.Z1, 64);
                sparseIntArray.append(i.C1, 65);
                sparseIntArray.append(i.L1, 8);
                sparseIntArray.append(i.M1, 9);
                sparseIntArray.append(i.O1, 10);
                sparseIntArray.append(i.P1, 11);
                sparseIntArray.append(i.V1, 12);
                sparseIntArray.append(i.U1, 13);
                sparseIntArray.append(i.f4114s1, 14);
                sparseIntArray.append(i.f4104r1, 15);
                sparseIntArray.append(i.f4064n1, 16);
                sparseIntArray.append(i.f4084p1, 52);
                sparseIntArray.append(i.f4074o1, 53);
                sparseIntArray.append(i.f4124t1, 2);
                sparseIntArray.append(i.f4144v1, 3);
                sparseIntArray.append(i.f4134u1, 4);
                sparseIntArray.append(i.f3975e2, 49);
                sparseIntArray.append(i.f3985f2, 50);
                sparseIntArray.append(i.f4184z1, 5);
                sparseIntArray.append(i.A1, 6);
                sparseIntArray.append(i.B1, 7);
                sparseIntArray.append(i.f4014i1, 67);
                sparseIntArray.append(i.V0, 1);
                sparseIntArray.append(i.Q1, 17);
                sparseIntArray.append(i.R1, 18);
                sparseIntArray.append(i.f4174y1, 19);
                sparseIntArray.append(i.f4164x1, 20);
                sparseIntArray.append(i.f4025j2, 21);
                sparseIntArray.append(i.f4055m2, 22);
                sparseIntArray.append(i.f4035k2, 23);
                sparseIntArray.append(i.f4005h2, 24);
                sparseIntArray.append(i.f4045l2, 25);
                sparseIntArray.append(i.f4015i2, 26);
                sparseIntArray.append(i.f3995g2, 55);
                sparseIntArray.append(i.f4065n2, 54);
                sparseIntArray.append(i.H1, 29);
                sparseIntArray.append(i.W1, 30);
                sparseIntArray.append(i.f4154w1, 44);
                sparseIntArray.append(i.J1, 45);
                sparseIntArray.append(i.Y1, 46);
                sparseIntArray.append(i.I1, 47);
                sparseIntArray.append(i.X1, 48);
                sparseIntArray.append(i.f4044l1, 27);
                sparseIntArray.append(i.f4034k1, 28);
                sparseIntArray.append(i.f3931a2, 31);
                sparseIntArray.append(i.D1, 32);
                sparseIntArray.append(i.f3953c2, 33);
                sparseIntArray.append(i.f3942b2, 34);
                sparseIntArray.append(i.f3964d2, 35);
                sparseIntArray.append(i.F1, 36);
                sparseIntArray.append(i.E1, 37);
                sparseIntArray.append(i.G1, 38);
                sparseIntArray.append(i.K1, 39);
                sparseIntArray.append(i.T1, 40);
                sparseIntArray.append(i.N1, 41);
                sparseIntArray.append(i.f4094q1, 42);
                sparseIntArray.append(i.f4054m1, 43);
                sparseIntArray.append(i.S1, 51);
                sparseIntArray.append(i.f4085p2, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3721a = -1;
            this.f3723b = -1;
            this.f3725c = -1.0f;
            this.f3727d = true;
            this.f3729e = -1;
            this.f3731f = -1;
            this.f3733g = -1;
            this.f3735h = -1;
            this.f3737i = -1;
            this.f3739j = -1;
            this.f3741k = -1;
            this.f3743l = -1;
            this.f3745m = -1;
            this.f3747n = -1;
            this.f3749o = -1;
            this.f3751p = -1;
            this.f3753q = 0;
            this.f3755r = BitmapDescriptorFactory.HUE_RED;
            this.f3757s = -1;
            this.f3758t = -1;
            this.f3759u = -1;
            this.f3760v = -1;
            this.f3761w = Integer.MIN_VALUE;
            this.f3762x = Integer.MIN_VALUE;
            this.f3763y = Integer.MIN_VALUE;
            this.f3764z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f3722a0 = true;
            this.f3724b0 = true;
            this.f3726c0 = false;
            this.f3728d0 = false;
            this.f3730e0 = false;
            this.f3732f0 = false;
            this.f3734g0 = false;
            this.f3736h0 = -1;
            this.f3738i0 = -1;
            this.f3740j0 = -1;
            this.f3742k0 = -1;
            this.f3744l0 = Integer.MIN_VALUE;
            this.f3746m0 = Integer.MIN_VALUE;
            this.f3748n0 = 0.5f;
            this.f3756r0 = new f3.e();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.U0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                int i12 = a.f3765a.get(index);
                switch (i12) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f3751p);
                        this.f3751p = resourceId;
                        if (resourceId == -1) {
                            this.f3751p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f3753q = obtainStyledAttributes.getDimensionPixelSize(index, this.f3753q);
                        break;
                    case 4:
                        float f11 = obtainStyledAttributes.getFloat(index, this.f3755r) % 360.0f;
                        this.f3755r = f11;
                        if (f11 < BitmapDescriptorFactory.HUE_RED) {
                            this.f3755r = (360.0f - f11) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f3721a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3721a);
                        break;
                    case 6:
                        this.f3723b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3723b);
                        break;
                    case 7:
                        this.f3725c = obtainStyledAttributes.getFloat(index, this.f3725c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f3729e);
                        this.f3729e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f3729e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f3731f);
                        this.f3731f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f3731f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f3733g);
                        this.f3733g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f3733g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f3735h);
                        this.f3735h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f3735h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f3737i);
                        this.f3737i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f3737i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f3739j);
                        this.f3739j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f3739j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f3741k);
                        this.f3741k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f3741k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f3743l);
                        this.f3743l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f3743l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f3745m);
                        this.f3745m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f3745m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f3757s);
                        this.f3757s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f3757s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f3758t);
                        this.f3758t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f3758t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f3759u);
                        this.f3759u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f3759u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f3760v);
                        this.f3760v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f3760v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f3761w = obtainStyledAttributes.getDimensionPixelSize(index, this.f3761w);
                        break;
                    case 22:
                        this.f3762x = obtainStyledAttributes.getDimensionPixelSize(index, this.f3762x);
                        break;
                    case 23:
                        this.f3763y = obtainStyledAttributes.getDimensionPixelSize(index, this.f3763y);
                        break;
                    case 24:
                        this.f3764z = obtainStyledAttributes.getDimensionPixelSize(index, this.f3764z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i13;
                        if (i13 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i14 = obtainStyledAttributes.getInt(index, 0);
                        this.M = i14;
                        if (i14 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.R = Math.max((float) BitmapDescriptorFactory.HUE_RED, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.S = Math.max((float) BitmapDescriptorFactory.HUE_RED, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i12) {
                            case 44:
                                d.A(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                continue;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                continue;
                            case 47:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                continue;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                continue;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f3747n);
                                this.f3747n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f3747n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f3749o);
                                this.f3749o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f3749o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                continue;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            default:
                                switch (i12) {
                                    case 64:
                                        d.y(this, obtainStyledAttributes, index, 0);
                                        continue;
                                    case 65:
                                        d.y(this, obtainStyledAttributes, index, 1);
                                        continue;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 67:
                                        this.f3727d = obtainStyledAttributes.getBoolean(index, this.f3727d);
                                        continue;
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            b();
        }

        public String a() {
            return this.Y;
        }

        public void b() {
            this.f3728d0 = false;
            this.f3722a0 = true;
            this.f3724b0 = true;
            int i11 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i11 == -2 && this.W) {
                this.f3722a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i12 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i12 == -2 && this.X) {
                this.f3724b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f3722a0 = false;
                if (i11 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i12 == 0 || i12 == -1) {
                this.f3724b0 = false;
                if (i12 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.f3725c == -1.0f && this.f3721a == -1 && this.f3723b == -1) {
                return;
            }
            this.f3728d0 = true;
            this.f3722a0 = true;
            this.f3724b0 = true;
            if (!(this.f3756r0 instanceof f3.g)) {
                this.f3756r0 = new f3.g();
            }
            ((f3.g) this.f3756r0).z1(this.V);
        }

        /* JADX WARN: Removed duplicated region for block: B:116:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x009e  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 269
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i11, int i12) {
            super(i11, i12);
            this.f3721a = -1;
            this.f3723b = -1;
            this.f3725c = -1.0f;
            this.f3727d = true;
            this.f3729e = -1;
            this.f3731f = -1;
            this.f3733g = -1;
            this.f3735h = -1;
            this.f3737i = -1;
            this.f3739j = -1;
            this.f3741k = -1;
            this.f3743l = -1;
            this.f3745m = -1;
            this.f3747n = -1;
            this.f3749o = -1;
            this.f3751p = -1;
            this.f3753q = 0;
            this.f3755r = BitmapDescriptorFactory.HUE_RED;
            this.f3757s = -1;
            this.f3758t = -1;
            this.f3759u = -1;
            this.f3760v = -1;
            this.f3761w = Integer.MIN_VALUE;
            this.f3762x = Integer.MIN_VALUE;
            this.f3763y = Integer.MIN_VALUE;
            this.f3764z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f3722a0 = true;
            this.f3724b0 = true;
            this.f3726c0 = false;
            this.f3728d0 = false;
            this.f3730e0 = false;
            this.f3732f0 = false;
            this.f3734g0 = false;
            this.f3736h0 = -1;
            this.f3738i0 = -1;
            this.f3740j0 = -1;
            this.f3742k0 = -1;
            this.f3744l0 = Integer.MIN_VALUE;
            this.f3746m0 = Integer.MIN_VALUE;
            this.f3748n0 = 0.5f;
            this.f3756r0 = new f3.e();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3721a = -1;
            this.f3723b = -1;
            this.f3725c = -1.0f;
            this.f3727d = true;
            this.f3729e = -1;
            this.f3731f = -1;
            this.f3733g = -1;
            this.f3735h = -1;
            this.f3737i = -1;
            this.f3739j = -1;
            this.f3741k = -1;
            this.f3743l = -1;
            this.f3745m = -1;
            this.f3747n = -1;
            this.f3749o = -1;
            this.f3751p = -1;
            this.f3753q = 0;
            this.f3755r = BitmapDescriptorFactory.HUE_RED;
            this.f3757s = -1;
            this.f3758t = -1;
            this.f3759u = -1;
            this.f3760v = -1;
            this.f3761w = Integer.MIN_VALUE;
            this.f3762x = Integer.MIN_VALUE;
            this.f3763y = Integer.MIN_VALUE;
            this.f3764z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f3722a0 = true;
            this.f3724b0 = true;
            this.f3726c0 = false;
            this.f3728d0 = false;
            this.f3730e0 = false;
            this.f3732f0 = false;
            this.f3734g0 = false;
            this.f3736h0 = -1;
            this.f3738i0 = -1;
            this.f3740j0 = -1;
            this.f3742k0 = -1;
            this.f3744l0 = Integer.MIN_VALUE;
            this.f3746m0 = Integer.MIN_VALUE;
            this.f3748n0 = 0.5f;
            this.f3756r0 = new f3.e();
        }
    }
}