package com.adyen.threeds2.internal.ui.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.adyen.threeds2.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class ExpandableInfoTextView extends LinearLayout implements View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener, ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f9704a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f9705b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f9706c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f9707d;

    /* renamed from: e  reason: collision with root package name */
    private final DividerView f9708e;

    /* renamed from: f  reason: collision with root package name */
    private float f9709f;

    /* renamed from: g  reason: collision with root package name */
    private int f9710g;

    /* renamed from: h  reason: collision with root package name */
    private b f9711h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9712a;

        static {
            int[] iArr = new int[b.values().length];
            f9712a = iArr;
            try {
                iArr[b.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9712a[b.COLLAPSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        EXPANDED,
        COLLAPSED
    }

    public ExpandableInfoTextView(Context context) {
        this(context, null);
    }

    private void setState(b bVar) {
        this.f9711h = bVar;
    }

    public void a(boolean z11) {
        b bVar = this.f9711h;
        b bVar2 = b.COLLAPSED;
        if (bVar == bVar2) {
            return;
        }
        if (z11) {
            this.f9705b.animate().rotation(BitmapDescriptorFactory.HUE_RED).start();
            ValueAnimator ofInt = ValueAnimator.ofInt(this.f9707d.getHeight(), 0);
            ofInt.addUpdateListener(this);
            ofInt.addListener(this);
            ofInt.start();
            this.f9707d.animate().alpha(BitmapDescriptorFactory.HUE_RED).start();
            return;
        }
        this.f9705b.setRotation(BitmapDescriptorFactory.HUE_RED);
        this.f9707d.setHeight(0);
        this.f9707d.setAlpha(BitmapDescriptorFactory.HUE_RED);
        setState(bVar2);
    }

    public void b(boolean z11) {
        b bVar = this.f9711h;
        b bVar2 = b.EXPANDED;
        if (bVar == bVar2) {
            return;
        }
        if (z11) {
            this.f9705b.animate().rotation(180.0f).start();
            ValueAnimator ofInt = ValueAnimator.ofInt(0, this.f9710g);
            ofInt.addUpdateListener(this);
            ofInt.addListener(this);
            ofInt.start();
            this.f9707d.animate().alpha(this.f9709f).start();
            return;
        }
        this.f9705b.setRotation(180.0f);
        this.f9707d.setHeight(this.f9710g);
        this.f9707d.setAlpha(this.f9709f);
        setState(bVar2);
    }

    public void c(boolean z11) {
        int i11 = a.f9712a[getState().ordinal()];
        if (i11 == 1) {
            a(z11);
        } else if (i11 != 2) {
        } else {
            b(z11);
        }
    }

    public b getState() {
        return this.f9711h;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        b bVar = this.f9711h;
        b bVar2 = b.COLLAPSED;
        setState(bVar == bVar2 ? b.EXPANDED : bVar2);
        this.f9704a.setClickable(true);
        if (this.f9711h == bVar2) {
            this.f9704a.sendAccessibilityEvent(8);
        } else {
            this.f9707d.sendAccessibilityEvent(8);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f9704a.setClickable(false);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9707d.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        c(true);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f9707d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f9709f = this.f9707d.getAlpha();
        this.f9710g = this.f9707d.getMeasuredHeight();
        c(false);
    }

    public void setHeaderBackgroundColor(int i11) {
        Drawable background = this.f9704a.getBackground();
        if (Build.VERSION.SDK_INT >= 21 && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(ColorStateList.valueOf(i11));
        } else {
            background.setColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setHorizontalDividerColor(int i11) {
        this.f9708e.setColor(i11);
    }

    public void setHorizontalDividerThickness(int i11) {
        this.f9708e.setThickness(i11);
    }

    public void setInfo(String str) {
        this.f9707d.setText(str);
    }

    public void setInfoFontSize(Integer num) {
        this.f9707d.setTextSize(num.intValue());
    }

    public void setInfoTextColor(int i11) {
        this.f9707d.setTextColor(i11);
    }

    public void setInfoTypeface(Typeface typeface) {
        this.f9707d.setTypeface(typeface);
    }

    public void setStateIndicatorColor(int i11) {
        this.f9705b.setColorFilter(i11);
    }

    public void setTitle(String str) {
        this.f9706c.setText(str);
    }

    public void setTitleFontSize(Integer num) {
        this.f9706c.setTextSize(num.intValue());
    }

    public void setTitleTextColor(int i11) {
        this.f9706c.setTextColor(i11);
    }

    public void setTitleTypeface(Typeface typeface) {
        this.f9706c.setTypeface(typeface);
    }

    public ExpandableInfoTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpandableInfoTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f9711h = b.EXPANDED;
        LinearLayout.inflate(context, R.layout.a3ds2_widget_expandable_info_text, this);
        View findViewById = findViewById(R.id.viewGroup_header);
        this.f9704a = findViewById;
        findViewById.setOnClickListener(this);
        this.f9705b = (ImageView) findViewById(R.id.imageView_stateIndicator);
        this.f9706c = (TextView) findViewById(R.id.textView_title);
        TextView textView = (TextView) findViewById(R.id.textView_info);
        this.f9707d = textView;
        textView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f9708e = (DividerView) findViewById(R.id.dividerView_info);
    }
}