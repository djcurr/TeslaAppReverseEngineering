package com.stripe.android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.R;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.PaymentMethodsAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PaymentMethodSwipeCallback extends l.i {
    public static final Companion Companion = new Companion(null);
    private static final float END_TRANSITION_THRESHOLD = 0.5f;
    private static final float START_TRANSITION_THRESHOLD = 0.25f;
    private final PaymentMethodsAdapter adapter;
    private final ColorDrawable background;
    private final int iconStartOffset;
    private final int itemViewStartPadding;
    private final Listener listener;
    private final int swipeStartColor;
    private final int swipeThresholdColor;
    private final Drawable trashIcon;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int calculateTransitionColor$payments_core_release(float f11, int i11, int i12) {
            int alpha = Color.alpha(i11);
            int red = Color.red(i11);
            int green = Color.green(i11);
            int blue = Color.blue(i11);
            return Color.argb((int) (alpha + ((Color.alpha(i12) - alpha) * f11)), (int) (red + ((Color.red(i12) - red) * f11)), (int) (green + ((Color.green(i12) - green) * f11)), (int) (blue + ((Color.blue(i12) - blue) * f11)));
        }
    }

    /* loaded from: classes6.dex */
    public interface Listener {
        void onSwiped(PaymentMethod paymentMethod);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodSwipeCallback(Context context, PaymentMethodsAdapter adapter, Listener listener) {
        super(0, 8);
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(adapter, "adapter");
        kotlin.jvm.internal.s.g(listener, "listener");
        this.adapter = adapter;
        this.listener = listener;
        Drawable drawable = androidx.core.content.b.getDrawable(context, R.drawable.stripe_ic_trash);
        kotlin.jvm.internal.s.e(drawable);
        kotlin.jvm.internal.s.f(drawable, "getDrawable(context, R.drawable.stripe_ic_trash)!!");
        this.trashIcon = drawable;
        int color = androidx.core.content.b.getColor(context, R.color.stripe_swipe_start_payment_method);
        this.swipeStartColor = color;
        this.swipeThresholdColor = androidx.core.content.b.getColor(context, R.color.stripe_swipe_threshold_payment_method);
        this.background = new ColorDrawable(color);
        this.itemViewStartPadding = drawable.getIntrinsicWidth() / 2;
        this.iconStartOffset = context.getResources().getDimensionPixelSize(R.dimen.stripe_list_row_start_padding);
    }

    private final void updateSwipedPaymentMethod(View view, int i11, float f11, Canvas canvas) {
        int calculateTransitionColor$payments_core_release;
        int top = view.getTop() + ((view.getHeight() - this.trashIcon.getIntrinsicHeight()) / 2);
        int intrinsicHeight = this.trashIcon.getIntrinsicHeight() + top;
        if (i11 > 0) {
            int left = view.getLeft() + this.iconStartOffset;
            int intrinsicWidth = this.trashIcon.getIntrinsicWidth() + left;
            if (i11 > intrinsicWidth) {
                this.trashIcon.setBounds(left, top, intrinsicWidth, intrinsicHeight);
            } else {
                this.trashIcon.setBounds(0, 0, 0, 0);
            }
            this.background.setBounds(view.getLeft(), view.getTop(), view.getLeft() + i11 + this.itemViewStartPadding, view.getBottom());
            ColorDrawable colorDrawable = this.background;
            if (f11 <= BitmapDescriptorFactory.HUE_RED) {
                calculateTransitionColor$payments_core_release = this.swipeStartColor;
            } else if (f11 >= 1.0f) {
                calculateTransitionColor$payments_core_release = this.swipeThresholdColor;
            } else {
                calculateTransitionColor$payments_core_release = Companion.calculateTransitionColor$payments_core_release(f11, this.swipeStartColor, this.swipeThresholdColor);
            }
            colorDrawable.setColor(calculateTransitionColor$payments_core_release);
        } else {
            this.trashIcon.setBounds(0, 0, 0, 0);
            this.background.setBounds(0, 0, 0, 0);
        }
        this.background.draw(canvas);
        this.trashIcon.draw(canvas);
    }

    @Override // androidx.recyclerview.widget.l.i
    public int getSwipeDirs(RecyclerView recyclerView, RecyclerView.e0 viewHolder) {
        kotlin.jvm.internal.s.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.s.g(viewHolder, "viewHolder");
        if (viewHolder instanceof PaymentMethodsAdapter.ViewHolder.PaymentMethodViewHolder) {
            return super.getSwipeDirs(recyclerView, viewHolder);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.l.f
    public float getSwipeThreshold(RecyclerView.e0 viewHolder) {
        kotlin.jvm.internal.s.g(viewHolder, "viewHolder");
        return END_TRANSITION_THRESHOLD;
    }

    @Override // androidx.recyclerview.widget.l.f
    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 viewHolder, float f11, float f12, int i11, boolean z11) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        kotlin.jvm.internal.s.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.s.g(viewHolder, "viewHolder");
        super.onChildDraw(canvas, recyclerView, viewHolder, f11, f12, i11, z11);
        if (viewHolder instanceof PaymentMethodsAdapter.ViewHolder.PaymentMethodViewHolder) {
            View view = viewHolder.itemView;
            kotlin.jvm.internal.s.f(view, "viewHolder.itemView");
            float width = view.getWidth() * START_TRANSITION_THRESHOLD;
            float width2 = view.getWidth() * END_TRANSITION_THRESHOLD;
            updateSwipedPaymentMethod(view, (int) f11, f11 < width ? BitmapDescriptorFactory.HUE_RED : f11 >= width2 ? 1.0f : (f11 - width) / (width2 - width), canvas);
        }
    }

    @Override // androidx.recyclerview.widget.l.f
    public boolean onMove(RecyclerView recyclerView, RecyclerView.e0 viewHolder, RecyclerView.e0 target) {
        kotlin.jvm.internal.s.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.s.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.s.g(target, "target");
        return true;
    }

    @Override // androidx.recyclerview.widget.l.f
    public void onSwiped(RecyclerView.e0 viewHolder, int i11) {
        kotlin.jvm.internal.s.g(viewHolder, "viewHolder");
        this.listener.onSwiped(this.adapter.getPaymentMethodAtPosition$payments_core_release(viewHolder.getBindingAdapterPosition()));
    }
}