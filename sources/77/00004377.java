package com.plaid.internal.core.ui_components;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.plaid.internal.core.ui_components.PlaidLoadingView;
import com.plaid.link.R;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import l3.h;
import m00.l;

/* loaded from: classes2.dex */
public final class PlaidLoadingView extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f18456e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ProgressBar f18457a;

    /* renamed from: b  reason: collision with root package name */
    public final ProgressBar f18458b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18459c;

    /* renamed from: d  reason: collision with root package name */
    public ObjectAnimator f18460d;

    /* loaded from: classes2.dex */
    public enum a {
        Blue(R.color.plaid_blue_800),
        Green(R.color.plaid_green_800),
        Yellow(R.color.plaid_yellow_800),
        Red(R.color.plaid_red_800),
        Purple(R.color.plaid_purple_800);
        
        public static final C0337a Companion = new C0337a();

        /* renamed from: a  reason: collision with root package name */
        public final int f18462a;

        /* renamed from: com.plaid.internal.core.ui_components.PlaidLoadingView$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0337a {
        }

        a(int i11) {
            this.f18462a = i11;
        }

        public final int getColorResId() {
            return this.f18462a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            PlaidLoadingView.this.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            PlaidLoadingView.this.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            PlaidLoadingView.this.setVisibility(0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidLoadingView(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ PlaidLoadingView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void a(int i11, int i12, long j11, long j12, final List<String> list, ProgressBar progressBar) {
        ObjectAnimator objectAnimator = this.f18460d;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", i11, i12);
        ofInt.setStartDelay(j11);
        ofInt.setDuration(j12);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addListener(new b());
        if (true ^ list.isEmpty()) {
            final long size = j12 / list.size();
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rq.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PlaidLoadingView.a(size, this, list, valueAnimator);
                }
            });
        }
        this.f18460d = ofInt;
        ofInt.start();
    }

    public final void setClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public final void setProgressColor(a aVar) {
        if (aVar == null) {
            return;
        }
        this.f18458b.setIndeterminateTintList(ColorStateList.valueOf(h.d(getResources(), aVar.getColorResId(), getContext().getTheme())));
    }

    public final void setText(CharSequence charSequence) {
        this.f18459c.setText(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidLoadingView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        FrameLayout.inflate(context, R.layout.plaid_loading, this);
        View findViewById = findViewById(R.id.background_progress);
        s.f(findViewById, "findViewById(R.id.background_progress)");
        this.f18457a = (ProgressBar) findViewById;
        View findViewById2 = findViewById(R.id.indeterminate_progress);
        s.f(findViewById2, "findViewById(R.id.indeterminate_progress)");
        this.f18458b = (ProgressBar) findViewById2;
        View findViewById3 = findViewById(R.id.text);
        s.f(findViewById3, "findViewById(R.id.text)");
        this.f18459c = (TextView) findViewById3;
    }

    public static final void a(long j11, PlaidLoadingView this$0, List messages, ValueAnimator valueAnimator) {
        int i11;
        s.g(this$0, "this$0");
        s.g(messages, "$messages");
        i11 = l.i((int) (valueAnimator.getCurrentPlayTime() / j11), messages.size() - 1);
        this$0.setText((CharSequence) messages.get(i11));
    }
}