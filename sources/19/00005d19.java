package com.stripe.android.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.model.ShippingMethod;
import java.util.List;

/* loaded from: classes6.dex */
public final class ShippingMethodAdapter extends RecyclerView.h<ShippingMethodViewHolder> {
    private h00.l<? super ShippingMethod, vz.b0> onShippingMethodSelectedCallback = ShippingMethodAdapter$onShippingMethodSelectedCallback$1.INSTANCE;
    private /* synthetic */ int selectedIndex;
    private List<ShippingMethod> shippingMethods;

    /* loaded from: classes6.dex */
    public static final class ShippingMethodViewHolder extends RecyclerView.e0 {
        private final ShippingMethodView shippingMethodView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShippingMethodViewHolder(ShippingMethodView shippingMethodView) {
            super(shippingMethodView);
            kotlin.jvm.internal.s.g(shippingMethodView, "shippingMethodView");
            this.shippingMethodView = shippingMethodView;
        }

        public final ShippingMethodView getShippingMethodView$payments_core_release() {
            return this.shippingMethodView;
        }

        public final void setSelected(boolean z11) {
            this.shippingMethodView.setSelected(z11);
        }

        public final void setShippingMethod(ShippingMethod shippingMethod) {
            kotlin.jvm.internal.s.g(shippingMethod, "shippingMethod");
            this.shippingMethodView.setShippingMethod(shippingMethod);
        }
    }

    public ShippingMethodAdapter() {
        List<ShippingMethod> i11;
        i11 = wz.w.i();
        this.shippingMethods = i11;
        setHasStableIds(true);
    }

    public static /* synthetic */ void a(ShippingMethodAdapter shippingMethodAdapter, ShippingMethodViewHolder shippingMethodViewHolder, View view) {
        m545onBindViewHolder$lambda0(shippingMethodAdapter, shippingMethodViewHolder, view);
    }

    /* renamed from: onBindViewHolder$lambda-0 */
    public static final void m545onBindViewHolder$lambda0(ShippingMethodAdapter this$0, ShippingMethodViewHolder holder, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(holder, "$holder");
        this$0.setSelectedIndex$payments_core_release(holder.getBindingAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.shippingMethods.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i11) {
        return this.shippingMethods.get(i11).hashCode();
    }

    public final h00.l<ShippingMethod, vz.b0> getOnShippingMethodSelectedCallback$payments_core_release() {
        return this.onShippingMethodSelectedCallback;
    }

    public final int getSelectedIndex$payments_core_release() {
        return this.selectedIndex;
    }

    public final ShippingMethod getSelectedShippingMethod() {
        return (ShippingMethod) wz.u.e0(this.shippingMethods, this.selectedIndex);
    }

    public final List<ShippingMethod> getShippingMethods$payments_core_release() {
        return this.shippingMethods;
    }

    public final void setOnShippingMethodSelectedCallback$payments_core_release(h00.l<? super ShippingMethod, vz.b0> lVar) {
        kotlin.jvm.internal.s.g(lVar, "<set-?>");
        this.onShippingMethodSelectedCallback = lVar;
    }

    public final void setSelected$payments_core_release(ShippingMethod shippingMethod) {
        kotlin.jvm.internal.s.g(shippingMethod, "shippingMethod");
        setSelectedIndex$payments_core_release(this.shippingMethods.indexOf(shippingMethod));
    }

    public final void setSelectedIndex$payments_core_release(int i11) {
        int i12 = this.selectedIndex;
        if (i12 != i11) {
            notifyItemChanged(i12);
            notifyItemChanged(i11);
            this.selectedIndex = i11;
            this.onShippingMethodSelectedCallback.invoke(this.shippingMethods.get(i11));
        }
    }

    public final void setShippingMethods$payments_core_release(List<ShippingMethod> value) {
        kotlin.jvm.internal.s.g(value, "value");
        setSelectedIndex$payments_core_release(0);
        this.shippingMethods = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(final ShippingMethodViewHolder holder, int i11) {
        kotlin.jvm.internal.s.g(holder, "holder");
        holder.setShippingMethod(this.shippingMethods.get(i11));
        holder.setSelected(i11 == this.selectedIndex);
        holder.getShippingMethodView$payments_core_release().setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.m0
            {
                ShippingMethodAdapter.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShippingMethodAdapter.a(ShippingMethodAdapter.this, holder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public ShippingMethodViewHolder onCreateViewHolder(ViewGroup viewGroup, int i11) {
        kotlin.jvm.internal.s.g(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        kotlin.jvm.internal.s.f(context, "viewGroup.context");
        return new ShippingMethodViewHolder(new ShippingMethodView(context, null, 0, 6, null));
    }
}