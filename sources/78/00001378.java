package com.adyen.threeds2.internal.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.adyen.threeds2.R;

/* loaded from: classes.dex */
public final class DividerView extends View {

    /* renamed from: d  reason: collision with root package name */
    private static final b f9699d = b.HORIZONTAL;

    /* renamed from: a  reason: collision with root package name */
    private b f9700a;

    /* renamed from: b  reason: collision with root package name */
    private int f9701b;

    /* renamed from: c  reason: collision with root package name */
    private int f9702c;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9703a;

        static {
            int[] iArr = new int[b.values().length];
            f9703a = iArr;
            try {
                iArr[b.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9703a[b.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        HORIZONTAL,
        VERTICAL
    }

    public DividerView(Context context) {
        this(context, null);
    }

    private void a(TypedArray typedArray) {
        setColor(typedArray.getColor(R.styleable.DividerView_dividerColor, getDefaultColor()));
        setThickness((int) typedArray.getDimension(R.styleable.DividerView_dividerThickness, getDefaultThickness()));
        setOrientation(b.values()[typedArray.getInteger(R.styleable.DividerView_dividerOrientation, f9699d.ordinal())]);
    }

    private int getDefaultColor() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842808, typedValue, true);
        return typedValue.data;
    }

    private int getDefaultThickness() {
        return (int) getContext().getResources().getDimension(R.dimen.a3ds2_divider_thickness);
    }

    public int getColor() {
        return this.f9702c;
    }

    public b getOrientation() {
        return this.f9700a;
    }

    public int getThickness() {
        return this.f9701b;
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i11);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumHeight(), i12);
        if (this.f9701b > 0) {
            int i13 = a.f9703a[this.f9700a.ordinal()];
            if (i13 == 1) {
                defaultSize2 = this.f9701b;
            } else if (i13 == 2) {
                defaultSize = this.f9701b;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    public void setColor(int i11) {
        this.f9702c = i11;
        setBackgroundColor(i11);
    }

    public void setOrientation(b bVar) {
        this.f9700a = bVar;
    }

    public void setThickness(int i11) {
        this.f9701b = i11;
    }

    public DividerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DividerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.DividerView, i11, 0);
        try {
            a(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public DividerView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.DividerView, i11, i12);
        try {
            a(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}