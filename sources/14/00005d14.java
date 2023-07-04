package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.databinding.ShippingMethodWidgetBinding;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class SelectShippingMethodWidget extends FrameLayout {
    private final ShippingMethodAdapter shippingMethodAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectShippingMethodWidget(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectShippingMethodWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ SelectShippingMethodWidget(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final ShippingMethod getSelectedShippingMethod() {
        return this.shippingMethodAdapter.getSelectedShippingMethod();
    }

    public final void setSelectedShippingMethod(ShippingMethod shippingMethod) {
        kotlin.jvm.internal.s.g(shippingMethod, "shippingMethod");
        this.shippingMethodAdapter.setSelected$payments_core_release(shippingMethod);
    }

    public final void setShippingMethodSelectedCallback(h00.l<? super ShippingMethod, vz.b0> callback) {
        kotlin.jvm.internal.s.g(callback, "callback");
        this.shippingMethodAdapter.setOnShippingMethodSelectedCallback$payments_core_release(callback);
    }

    public final void setShippingMethods(List<ShippingMethod> shippingMethods) {
        kotlin.jvm.internal.s.g(shippingMethods, "shippingMethods");
        this.shippingMethodAdapter.setShippingMethods$payments_core_release(shippingMethods);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectShippingMethodWidget(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        ShippingMethodAdapter shippingMethodAdapter = new ShippingMethodAdapter();
        this.shippingMethodAdapter = shippingMethodAdapter;
        ShippingMethodWidgetBinding inflate = ShippingMethodWidgetBinding.inflate(LayoutInflater.from(context), this);
        kotlin.jvm.internal.s.f(inflate, "inflate(\n            Lay…           this\n        )");
        RecyclerView recyclerView = inflate.shippingMethods;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(shippingMethodAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
    }
}