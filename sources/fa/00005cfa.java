package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.R;
import com.stripe.android.databinding.AddPaymentMethodRowBinding;
import com.stripe.android.databinding.GooglePayRowBinding;
import com.stripe.android.databinding.MaskedCardRowBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w3.f;

/* loaded from: classes6.dex */
public final class PaymentMethodsAdapter extends RecyclerView.h<RecyclerView.e0> {
    public static final Companion Companion = new Companion(null);
    private static final long GOOGLE_PAY_ITEM_ID = -2057760476;
    private final androidx.lifecycle.f0<AddPaymentMethodActivityStarter.Args> _addPaymentMethodArgs;
    private final AddPaymentMethodActivityStarter.Args addCardArgs;
    private final AddPaymentMethodActivityStarter.Args addFpxArgs;
    private final LiveData<AddPaymentMethodActivityStarter.Args> addPaymentMethodArgs;
    private final List<PaymentMethod.Type> addableTypes;
    private final boolean canDeletePaymentMethods;
    private final int googlePayCount;
    private Listener listener;
    private final List<PaymentMethod> paymentMethods;
    private String selectedPaymentMethodId;
    private final boolean shouldShowGooglePay;
    private final boolean useGooglePay;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getGOOGLE_PAY_ITEM_ID$payments_core_release() {
            return PaymentMethodsAdapter.GOOGLE_PAY_ITEM_ID;
        }
    }

    /* loaded from: classes6.dex */
    public interface Listener {
        void onDeletePaymentMethodAction(PaymentMethod paymentMethod);

        void onGooglePayClick();

        void onPaymentMethodClick(PaymentMethod paymentMethod);
    }

    /* loaded from: classes6.dex */
    public static abstract class ViewHolder extends RecyclerView.e0 {
        private ViewHolder(View view) {
            super(view);
        }

        public /* synthetic */ ViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        /* loaded from: classes6.dex */
        public static final class PaymentMethodViewHolder extends ViewHolder {
            private final MaskedCardRowBinding viewBinding;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public PaymentMethodViewHolder(com.stripe.android.databinding.MaskedCardRowBinding r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "viewBinding"
                    kotlin.jvm.internal.s.g(r3, r0)
                    android.widget.FrameLayout r0 = r3.getRoot()
                    java.lang.String r1 = "viewBinding.root"
                    kotlin.jvm.internal.s.f(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    r2.viewBinding = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentMethodsAdapter.ViewHolder.PaymentMethodViewHolder.<init>(com.stripe.android.databinding.MaskedCardRowBinding):void");
            }

            public final void setPaymentMethod(PaymentMethod paymentMethod) {
                kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
                this.viewBinding.maskedCardItem.setPaymentMethod(paymentMethod);
            }

            public final void setSelected(boolean z11) {
                this.viewBinding.maskedCardItem.setSelected(z11);
                this.itemView.setSelected(z11);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public PaymentMethodViewHolder(android.view.ViewGroup r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "parent"
                    kotlin.jvm.internal.s.g(r3, r0)
                    android.content.Context r0 = r3.getContext()
                    android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                    r1 = 0
                    com.stripe.android.databinding.MaskedCardRowBinding r3 = com.stripe.android.databinding.MaskedCardRowBinding.inflate(r0, r3, r1)
                    java.lang.String r0 = "inflate(\n               …  false\n                )"
                    kotlin.jvm.internal.s.f(r3, r0)
                    r2.<init>(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentMethodsAdapter.ViewHolder.PaymentMethodViewHolder.<init>(android.view.ViewGroup):void");
            }
        }

        /* loaded from: classes6.dex */
        public static final class GooglePayViewHolder extends RecyclerView.e0 {
            private final ThemeConfig themeConfig;
            private final GooglePayRowBinding viewBinding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GooglePayViewHolder(GooglePayRowBinding viewBinding) {
                super(viewBinding.getRoot());
                kotlin.jvm.internal.s.g(viewBinding, "viewBinding");
                this.viewBinding = viewBinding;
                Context context = this.itemView.getContext();
                kotlin.jvm.internal.s.f(context, "itemView.context");
                ThemeConfig themeConfig = new ThemeConfig(context);
                this.themeConfig = themeConfig;
                androidx.core.widget.i.c(viewBinding.checkIcon, ColorStateList.valueOf(themeConfig.getTintColor$payments_core_release(true)));
            }

            public final void bind(boolean z11) {
                this.viewBinding.label.setTextColor(ColorStateList.valueOf(this.themeConfig.getTextColor$payments_core_release(z11)));
                this.viewBinding.checkIcon.setVisibility(z11 ? 0 : 4);
                this.itemView.setSelected(z11);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public GooglePayViewHolder(android.content.Context r2, android.view.ViewGroup r3) {
                /*
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.s.g(r2, r0)
                    java.lang.String r0 = "parent"
                    kotlin.jvm.internal.s.g(r3, r0)
                    android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                    r0 = 0
                    com.stripe.android.databinding.GooglePayRowBinding r2 = com.stripe.android.databinding.GooglePayRowBinding.inflate(r2, r3, r0)
                    java.lang.String r3 = "inflate(\n               …  false\n                )"
                    kotlin.jvm.internal.s.f(r2, r3)
                    r1.<init>(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentMethodsAdapter.ViewHolder.GooglePayViewHolder.<init>(android.content.Context, android.view.ViewGroup):void");
            }
        }

        /* loaded from: classes6.dex */
        public static final class AddCardPaymentMethodViewHolder extends RecyclerView.e0 {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddCardPaymentMethodViewHolder(AddPaymentMethodRowBinding viewBinding) {
                super(viewBinding.getRoot());
                kotlin.jvm.internal.s.g(viewBinding, "viewBinding");
                this.itemView.setId(R.id.stripe_payment_methods_add_card);
                View view = this.itemView;
                Resources resources = view.getResources();
                int i11 = R.string.payment_method_add_new_card;
                view.setContentDescription(resources.getString(i11));
                viewBinding.label.setText(this.itemView.getResources().getString(i11));
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public AddCardPaymentMethodViewHolder(android.content.Context r2, android.view.ViewGroup r3) {
                /*
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.s.g(r2, r0)
                    java.lang.String r0 = "parent"
                    kotlin.jvm.internal.s.g(r3, r0)
                    android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                    r0 = 0
                    com.stripe.android.databinding.AddPaymentMethodRowBinding r2 = com.stripe.android.databinding.AddPaymentMethodRowBinding.inflate(r2, r3, r0)
                    java.lang.String r3 = "inflate(\n               …  false\n                )"
                    kotlin.jvm.internal.s.f(r2, r3)
                    r1.<init>(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentMethodsAdapter.ViewHolder.AddCardPaymentMethodViewHolder.<init>(android.content.Context, android.view.ViewGroup):void");
            }
        }

        /* loaded from: classes6.dex */
        public static final class AddFpxPaymentMethodViewHolder extends RecyclerView.e0 {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddFpxPaymentMethodViewHolder(AddPaymentMethodRowBinding viewBinding) {
                super(viewBinding.getRoot());
                kotlin.jvm.internal.s.g(viewBinding, "viewBinding");
                this.itemView.setId(R.id.stripe_payment_methods_add_fpx);
                View view = this.itemView;
                Resources resources = view.getResources();
                int i11 = R.string.payment_method_add_new_fpx;
                view.setContentDescription(resources.getString(i11));
                viewBinding.label.setText(this.itemView.getResources().getString(i11));
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public AddFpxPaymentMethodViewHolder(android.content.Context r2, android.view.ViewGroup r3) {
                /*
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.s.g(r2, r0)
                    java.lang.String r0 = "parent"
                    kotlin.jvm.internal.s.g(r3, r0)
                    android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                    r0 = 0
                    com.stripe.android.databinding.AddPaymentMethodRowBinding r2 = com.stripe.android.databinding.AddPaymentMethodRowBinding.inflate(r2, r3, r0)
                    java.lang.String r3 = "inflate(\n               …  false\n                )"
                    kotlin.jvm.internal.s.f(r2, r3)
                    r1.<init>(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentMethodsAdapter.ViewHolder.AddFpxPaymentMethodViewHolder.<init>(android.content.Context, android.view.ViewGroup):void");
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum ViewType {
        Card,
        AddCard,
        AddFpx,
        GooglePay
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            iArr[PaymentMethod.Type.Fpx.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ViewType.values().length];
            iArr2[ViewType.Card.ordinal()] = 1;
            iArr2[ViewType.AddCard.ordinal()] = 2;
            iArr2[ViewType.AddFpx.ordinal()] = 3;
            iArr2[ViewType.GooglePay.ordinal()] = 4;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ PaymentMethodsAdapter(PaymentMethodsActivityStarter.Args args, List list, String str, boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(args, (i11 & 2) != 0 ? wz.v.d(PaymentMethod.Type.Card) : list, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? true : z13);
    }

    public static /* synthetic */ void a(PaymentMethodsAdapter paymentMethodsAdapter, View view) {
        m544onBindViewHolder$lambda6(paymentMethodsAdapter, view);
    }

    public static /* synthetic */ void b(PaymentMethodsAdapter paymentMethodsAdapter, View view) {
        m542onBindViewHolder$lambda4(paymentMethodsAdapter, view);
    }

    public static /* synthetic */ boolean c(PaymentMethodsAdapter paymentMethodsAdapter, ViewHolder.PaymentMethodViewHolder paymentMethodViewHolder, View view, f.a aVar) {
        return m540createPaymentMethodViewHolder$lambda8(paymentMethodsAdapter, paymentMethodViewHolder, view, aVar);
    }

    private final ViewHolder.AddCardPaymentMethodViewHolder createAddCardPaymentMethodViewHolder(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        kotlin.jvm.internal.s.f(context, "parent.context");
        return new ViewHolder.AddCardPaymentMethodViewHolder(context, viewGroup);
    }

    private final ViewHolder.AddFpxPaymentMethodViewHolder createAddFpxPaymentMethodViewHolder(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        kotlin.jvm.internal.s.f(context, "parent.context");
        return new ViewHolder.AddFpxPaymentMethodViewHolder(context, viewGroup);
    }

    private final ViewHolder.GooglePayViewHolder createGooglePayViewHolder(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        kotlin.jvm.internal.s.f(context, "parent.context");
        return new ViewHolder.GooglePayViewHolder(context, viewGroup);
    }

    private final ViewHolder.PaymentMethodViewHolder createPaymentMethodViewHolder(ViewGroup viewGroup) {
        final ViewHolder.PaymentMethodViewHolder paymentMethodViewHolder = new ViewHolder.PaymentMethodViewHolder(viewGroup);
        if (this.canDeletePaymentMethods) {
            androidx.core.view.a0.c(paymentMethodViewHolder.itemView, viewGroup.getContext().getString(R.string.delete_payment_method), new w3.f() { // from class: com.stripe.android.view.l0
                {
                    PaymentMethodsAdapter.this = this;
                }

                @Override // w3.f
                public final boolean a(View view, f.a aVar) {
                    return PaymentMethodsAdapter.c(PaymentMethodsAdapter.this, paymentMethodViewHolder, view, aVar);
                }
            });
        }
        return paymentMethodViewHolder;
    }

    /* renamed from: createPaymentMethodViewHolder$lambda-8 */
    public static final boolean m540createPaymentMethodViewHolder$lambda8(PaymentMethodsAdapter this$0, ViewHolder.PaymentMethodViewHolder viewHolder, View noName_0, f.a aVar) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(viewHolder, "$viewHolder");
        kotlin.jvm.internal.s.g(noName_0, "$noName_0");
        Listener listener = this$0.listener;
        if (listener == null) {
            return true;
        }
        listener.onDeletePaymentMethodAction(this$0.getPaymentMethodAtPosition$payments_core_release(viewHolder.getBindingAdapterPosition()));
        return true;
    }

    public static /* synthetic */ void d(PaymentMethodsAdapter paymentMethodsAdapter, View view) {
        m543onBindViewHolder$lambda5(paymentMethodsAdapter, view);
    }

    public static /* synthetic */ void e(PaymentMethodsAdapter paymentMethodsAdapter, RecyclerView.e0 e0Var, View view) {
        m541onBindViewHolder$lambda3(paymentMethodsAdapter, e0Var, view);
    }

    private final int getAddableTypesPosition(int i11) {
        return (i11 - this.paymentMethods.size()) - this.googlePayCount;
    }

    private final int getPaymentMethodIndex(int i11) {
        return i11 - this.googlePayCount;
    }

    private final boolean isGooglePayPosition(int i11) {
        return this.shouldShowGooglePay && i11 == 0;
    }

    private final boolean isPaymentMethodsPosition(int i11) {
        m00.i r11;
        if (this.shouldShowGooglePay) {
            r11 = new m00.i(1, this.paymentMethods.size());
        } else {
            r11 = m00.l.r(0, this.paymentMethods.size());
        }
        return i11 <= r11.e() && r11.c() <= i11;
    }

    /* renamed from: onBindViewHolder$lambda-3 */
    public static final void m541onBindViewHolder$lambda3(PaymentMethodsAdapter this$0, RecyclerView.e0 holder, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(holder, "$holder");
        this$0.onPositionClicked$payments_core_release(((ViewHolder.PaymentMethodViewHolder) holder).getBindingAdapterPosition());
    }

    /* renamed from: onBindViewHolder$lambda-4 */
    public static final void m542onBindViewHolder$lambda4(PaymentMethodsAdapter this$0, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.selectedPaymentMethodId = null;
        Listener listener = this$0.listener;
        if (listener == null) {
            return;
        }
        listener.onGooglePayClick();
    }

    /* renamed from: onBindViewHolder$lambda-5 */
    public static final void m543onBindViewHolder$lambda5(PaymentMethodsAdapter this$0, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0._addPaymentMethodArgs.setValue(this$0.addCardArgs);
    }

    /* renamed from: onBindViewHolder$lambda-6 */
    public static final void m544onBindViewHolder$lambda6(PaymentMethodsAdapter this$0, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0._addPaymentMethodArgs.setValue(this$0.addFpxArgs);
    }

    private final void updateSelectedPaymentMethod(int i11) {
        Iterator<PaymentMethod> it2 = this.paymentMethods.iterator();
        int i12 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i12 = -1;
                break;
            } else if (kotlin.jvm.internal.s.c(it2.next().f20932id, getSelectedPaymentMethodId$payments_core_release())) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 != i11) {
            notifyItemChanged(i12);
            PaymentMethod paymentMethod = (PaymentMethod) wz.u.e0(this.paymentMethods, i11);
            this.selectedPaymentMethodId = paymentMethod == null ? null : paymentMethod.f20932id;
        }
        notifyItemChanged(i11);
    }

    public final /* synthetic */ void deletePaymentMethod$payments_core_release(PaymentMethod paymentMethod) {
        kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
        Integer position$payments_core_release = getPosition$payments_core_release(paymentMethod);
        if (position$payments_core_release == null) {
            return;
        }
        int intValue = position$payments_core_release.intValue();
        getPaymentMethods$payments_core_release().remove(paymentMethod);
        notifyItemRemoved(intValue);
    }

    public final AddPaymentMethodActivityStarter.Args getAddCardArgs$payments_core_release() {
        return this.addCardArgs;
    }

    public final AddPaymentMethodActivityStarter.Args getAddFpxArgs$payments_core_release() {
        return this.addFpxArgs;
    }

    public final LiveData<AddPaymentMethodActivityStarter.Args> getAddPaymentMethodArgs() {
        return this.addPaymentMethodArgs;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.paymentMethods.size() + this.addableTypes.size() + this.googlePayCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i11) {
        int hashCode;
        if (isGooglePayPosition(i11)) {
            return GOOGLE_PAY_ITEM_ID;
        }
        if (isPaymentMethodsPosition(i11)) {
            hashCode = getPaymentMethodAtPosition$payments_core_release(i11).hashCode();
        } else {
            hashCode = this.addableTypes.get(getAddableTypesPosition(i11)).code.hashCode();
        }
        return hashCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i11) {
        if (isGooglePayPosition(i11)) {
            return ViewType.GooglePay.ordinal();
        }
        if (isPaymentMethodsPosition(i11)) {
            if (PaymentMethod.Type.Card == getPaymentMethodAtPosition$payments_core_release(i11).type) {
                return ViewType.Card.ordinal();
            }
            return super.getItemViewType(i11);
        }
        PaymentMethod.Type type = this.addableTypes.get(getAddableTypesPosition(i11));
        int i12 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                return ViewType.AddFpx.ordinal();
            }
            throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Unsupported PaymentMethod type: ", type.code));
        }
        return ViewType.AddCard.ordinal();
    }

    public final Listener getListener$payments_core_release() {
        return this.listener;
    }

    public final /* synthetic */ PaymentMethod getPaymentMethodAtPosition$payments_core_release(int i11) {
        return this.paymentMethods.get(getPaymentMethodIndex(i11));
    }

    public final List<PaymentMethod> getPaymentMethods$payments_core_release() {
        return this.paymentMethods;
    }

    public final Integer getPosition$payments_core_release(PaymentMethod paymentMethod) {
        kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
        Integer valueOf = Integer.valueOf(this.paymentMethods.indexOf(paymentMethod));
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue() + this.googlePayCount);
    }

    public final PaymentMethod getSelectedPaymentMethod$payments_core_release() {
        String str = this.selectedPaymentMethodId;
        Object obj = null;
        if (str == null) {
            return null;
        }
        Iterator<T> it2 = getPaymentMethods$payments_core_release().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (kotlin.jvm.internal.s.c(((PaymentMethod) next).f20932id, str)) {
                obj = next;
                break;
            }
        }
        return (PaymentMethod) obj;
    }

    public final String getSelectedPaymentMethodId$payments_core_release() {
        return this.selectedPaymentMethodId;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(final RecyclerView.e0 holder, int i11) {
        kotlin.jvm.internal.s.g(holder, "holder");
        if (holder instanceof ViewHolder.PaymentMethodViewHolder) {
            PaymentMethod paymentMethodAtPosition$payments_core_release = getPaymentMethodAtPosition$payments_core_release(i11);
            ViewHolder.PaymentMethodViewHolder paymentMethodViewHolder = (ViewHolder.PaymentMethodViewHolder) holder;
            paymentMethodViewHolder.setPaymentMethod(paymentMethodAtPosition$payments_core_release);
            paymentMethodViewHolder.setSelected(kotlin.jvm.internal.s.c(paymentMethodAtPosition$payments_core_release.f20932id, this.selectedPaymentMethodId));
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaymentMethodsAdapter.e(PaymentMethodsAdapter.this, holder, view);
                }
            });
        } else if (holder instanceof ViewHolder.GooglePayViewHolder) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.i0
                {
                    PaymentMethodsAdapter.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaymentMethodsAdapter.b(PaymentMethodsAdapter.this, view);
                }
            });
            ((ViewHolder.GooglePayViewHolder) holder).bind(this.useGooglePay);
        } else if (holder instanceof ViewHolder.AddCardPaymentMethodViewHolder) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.j0
                {
                    PaymentMethodsAdapter.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaymentMethodsAdapter.d(PaymentMethodsAdapter.this, view);
                }
            });
        } else if (holder instanceof ViewHolder.AddFpxPaymentMethodViewHolder) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.h0
                {
                    PaymentMethodsAdapter.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaymentMethodsAdapter.a(PaymentMethodsAdapter.this, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        int i12 = WhenMappings.$EnumSwitchMapping$1[ViewType.values()[i11].ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 == 4) {
                        return createGooglePayViewHolder(parent);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return createAddFpxPaymentMethodViewHolder(parent);
            }
            return createAddCardPaymentMethodViewHolder(parent);
        }
        return createPaymentMethodViewHolder(parent);
    }

    public final /* synthetic */ void onPositionClicked$payments_core_release(int i11) {
        updateSelectedPaymentMethod(i11);
        Listener listener = this.listener;
        if (listener == null) {
            return;
        }
        listener.onPaymentMethodClick(getPaymentMethodAtPosition$payments_core_release(i11));
    }

    public final /* synthetic */ void resetPaymentMethod$payments_core_release(PaymentMethod paymentMethod) {
        kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
        Integer position$payments_core_release = getPosition$payments_core_release(paymentMethod);
        if (position$payments_core_release == null) {
            return;
        }
        notifyItemChanged(position$payments_core_release.intValue());
    }

    public final void setListener$payments_core_release(Listener listener) {
        this.listener = listener;
    }

    public final /* synthetic */ void setPaymentMethods$payments_core_release(List paymentMethods) {
        kotlin.jvm.internal.s.g(paymentMethods, "paymentMethods");
        this.paymentMethods.clear();
        this.paymentMethods.addAll(paymentMethods);
        notifyDataSetChanged();
    }

    public final void setSelectedPaymentMethodId$payments_core_release(String str) {
        this.selectedPaymentMethodId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsAdapter(PaymentMethodsActivityStarter.Args intentArgs, List<? extends PaymentMethod.Type> addableTypes, String str, boolean z11, boolean z12, boolean z13) {
        kotlin.jvm.internal.s.g(intentArgs, "intentArgs");
        kotlin.jvm.internal.s.g(addableTypes, "addableTypes");
        this.addableTypes = addableTypes;
        this.shouldShowGooglePay = z11;
        this.useGooglePay = z12;
        this.canDeletePaymentMethods = z13;
        this.paymentMethods = new ArrayList();
        this.selectedPaymentMethodId = str;
        r4.intValue();
        r4 = z11 ? 1 : null;
        this.googlePayCount = r4 == null ? 0 : r4.intValue();
        androidx.lifecycle.f0<AddPaymentMethodActivityStarter.Args> f0Var = new androidx.lifecycle.f0<>();
        this._addPaymentMethodArgs = f0Var;
        this.addPaymentMethodArgs = f0Var;
        this.addCardArgs = new AddPaymentMethodActivityStarter.Args.Builder().setBillingAddressFields(intentArgs.getBillingAddressFields$payments_core_release()).setShouldAttachToCustomer(true).setIsPaymentSessionActive$payments_core_release(intentArgs.isPaymentSessionActive$payments_core_release()).setPaymentMethodType(PaymentMethod.Type.Card).setAddPaymentMethodFooter(intentArgs.getAddPaymentMethodFooterLayoutId()).setPaymentConfiguration(intentArgs.getPaymentConfiguration$payments_core_release()).setWindowFlags(intentArgs.getWindowFlags$payments_core_release()).build();
        this.addFpxArgs = new AddPaymentMethodActivityStarter.Args.Builder().setIsPaymentSessionActive$payments_core_release(intentArgs.isPaymentSessionActive$payments_core_release()).setPaymentMethodType(PaymentMethod.Type.Fpx).setPaymentConfiguration(intentArgs.getPaymentConfiguration$payments_core_release()).build();
        setHasStableIds(true);
    }
}