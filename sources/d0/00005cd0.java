package com.stripe.android.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import wz.x0;

/* loaded from: classes6.dex */
public final class PaymentFlowPagerAdapter extends androidx.viewpager.widget.a {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(PaymentFlowPagerAdapter.class, "shippingMethods", "getShippingMethods$payments_core_release()Ljava/util/List;", 0)), kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(PaymentFlowPagerAdapter.class, "selectedShippingMethod", "getSelectedShippingMethod$payments_core_release()Lcom/stripe/android/model/ShippingMethod;", 0))};
    private final Set<String> allowedShippingCountryCodes;
    private final Context context;
    private boolean isShippingInfoSubmitted;
    private final h00.l<ShippingMethod, vz.b0> onShippingMethodSelectedCallback;
    private final PaymentSessionConfig paymentSessionConfig;
    private final kotlin.properties.c selectedShippingMethod$delegate;
    private ShippingInformation shippingInformation;
    private final kotlin.properties.c shippingMethods$delegate;
    private boolean shouldRecreateShippingMethodsScreen;

    /* renamed from: com.stripe.android.view.PaymentFlowPagerAdapter$1 */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends kotlin.jvm.internal.u implements h00.l<ShippingMethod, vz.b0> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(ShippingMethod shippingMethod) {
            invoke2(shippingMethod);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(ShippingMethod it2) {
            kotlin.jvm.internal.s.g(it2, "it");
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class PaymentFlowViewHolder extends RecyclerView.e0 {
        private PaymentFlowViewHolder(View view) {
            super(view);
        }

        public /* synthetic */ PaymentFlowViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        /* loaded from: classes6.dex */
        public static final class ShippingInformationViewHolder extends PaymentFlowViewHolder {
            public static final int $stable = 8;
            private final ShippingInfoWidget shippingInfoWidget;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public ShippingInformationViewHolder(com.stripe.android.databinding.ShippingInfoPageBinding r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "viewBinding"
                    kotlin.jvm.internal.s.g(r3, r0)
                    android.widget.ScrollView r0 = r3.getRoot()
                    java.lang.String r1 = "viewBinding.root"
                    kotlin.jvm.internal.s.f(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    com.stripe.android.view.ShippingInfoWidget r3 = r3.shippingInfoWidget
                    java.lang.String r0 = "viewBinding.shippingInfoWidget"
                    kotlin.jvm.internal.s.f(r3, r0)
                    r2.shippingInfoWidget = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentFlowPagerAdapter.PaymentFlowViewHolder.ShippingInformationViewHolder.<init>(com.stripe.android.databinding.ShippingInfoPageBinding):void");
            }

            public final void bind(PaymentSessionConfig paymentSessionConfig, ShippingInformation shippingInformation, Set<String> allowedShippingCountryCodes) {
                kotlin.jvm.internal.s.g(paymentSessionConfig, "paymentSessionConfig");
                kotlin.jvm.internal.s.g(allowedShippingCountryCodes, "allowedShippingCountryCodes");
                this.shippingInfoWidget.setHiddenFields(paymentSessionConfig.getHiddenShippingInfoFields());
                this.shippingInfoWidget.setOptionalFields(paymentSessionConfig.getOptionalShippingInfoFields());
                this.shippingInfoWidget.setAllowedCountryCodes(allowedShippingCountryCodes);
                this.shippingInfoWidget.populateShippingInfo(shippingInformation);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public ShippingInformationViewHolder(android.view.ViewGroup r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "root"
                    kotlin.jvm.internal.s.g(r3, r0)
                    android.content.Context r0 = r3.getContext()
                    android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                    r1 = 0
                    com.stripe.android.databinding.ShippingInfoPageBinding r3 = com.stripe.android.databinding.ShippingInfoPageBinding.inflate(r0, r3, r1)
                    java.lang.String r0 = "inflate(\n               …  false\n                )"
                    kotlin.jvm.internal.s.f(r3, r0)
                    r2.<init>(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentFlowPagerAdapter.PaymentFlowViewHolder.ShippingInformationViewHolder.<init>(android.view.ViewGroup):void");
            }
        }

        /* loaded from: classes6.dex */
        public static final class ShippingMethodViewHolder extends PaymentFlowViewHolder {
            public static final int $stable = 8;
            private final SelectShippingMethodWidget shippingMethodWidget;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public ShippingMethodViewHolder(com.stripe.android.databinding.ShippingMethodPageBinding r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "viewBinding"
                    kotlin.jvm.internal.s.g(r3, r0)
                    android.widget.FrameLayout r0 = r3.getRoot()
                    java.lang.String r1 = "viewBinding.root"
                    kotlin.jvm.internal.s.f(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    com.stripe.android.view.SelectShippingMethodWidget r3 = r3.selectShippingMethodWidget
                    java.lang.String r0 = "viewBinding.selectShippingMethodWidget"
                    kotlin.jvm.internal.s.f(r3, r0)
                    r2.shippingMethodWidget = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentFlowPagerAdapter.PaymentFlowViewHolder.ShippingMethodViewHolder.<init>(com.stripe.android.databinding.ShippingMethodPageBinding):void");
            }

            public final void bind(List<ShippingMethod> shippingMethods, ShippingMethod shippingMethod, h00.l<? super ShippingMethod, vz.b0> onShippingMethodSelectedCallback) {
                kotlin.jvm.internal.s.g(shippingMethods, "shippingMethods");
                kotlin.jvm.internal.s.g(onShippingMethodSelectedCallback, "onShippingMethodSelectedCallback");
                this.shippingMethodWidget.setShippingMethods(shippingMethods);
                this.shippingMethodWidget.setShippingMethodSelectedCallback(onShippingMethodSelectedCallback);
                if (shippingMethod == null) {
                    return;
                }
                this.shippingMethodWidget.setSelectedShippingMethod(shippingMethod);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public ShippingMethodViewHolder(android.view.ViewGroup r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "root"
                    kotlin.jvm.internal.s.g(r3, r0)
                    android.content.Context r0 = r3.getContext()
                    android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                    r1 = 0
                    com.stripe.android.databinding.ShippingMethodPageBinding r3 = com.stripe.android.databinding.ShippingMethodPageBinding.inflate(r0, r3, r1)
                    java.lang.String r0 = "inflate(\n               …  false\n                )"
                    kotlin.jvm.internal.s.f(r3, r0)
                    r2.<init>(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentFlowPagerAdapter.PaymentFlowViewHolder.ShippingMethodViewHolder.<init>(android.view.ViewGroup):void");
            }
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentFlowPage.values().length];
            iArr[PaymentFlowPage.ShippingInfo.ordinal()] = 1;
            iArr[PaymentFlowPage.ShippingMethod.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ PaymentFlowPagerAdapter(Context context, PaymentSessionConfig paymentSessionConfig, Set set, h00.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, paymentSessionConfig, (i11 & 4) != 0 ? x0.d() : set, (i11 & 8) != 0 ? AnonymousClass1.INSTANCE : lVar);
    }

    public static final /* synthetic */ void access$setShouldRecreateShippingMethodsScreen$p(PaymentFlowPagerAdapter paymentFlowPagerAdapter, boolean z11) {
        paymentFlowPagerAdapter.shouldRecreateShippingMethodsScreen = z11;
    }

    private final List<PaymentFlowPage> getPages() {
        List<PaymentFlowPage> n11;
        PaymentFlowPage[] paymentFlowPageArr = new PaymentFlowPage[2];
        PaymentFlowPage paymentFlowPage = PaymentFlowPage.ShippingInfo;
        if (!this.paymentSessionConfig.isShippingInfoRequired()) {
            paymentFlowPage = null;
        }
        boolean z11 = false;
        paymentFlowPageArr[0] = paymentFlowPage;
        PaymentFlowPage paymentFlowPage2 = PaymentFlowPage.ShippingMethod;
        if (this.paymentSessionConfig.isShippingMethodRequired() && (!this.paymentSessionConfig.isShippingInfoRequired() || isShippingInfoSubmitted$payments_core_release())) {
            z11 = true;
        }
        paymentFlowPageArr[1] = z11 ? paymentFlowPage2 : null;
        n11 = wz.w.n(paymentFlowPageArr);
        return n11;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(ViewGroup collection, int i11, Object view) {
        kotlin.jvm.internal.s.g(collection, "collection");
        kotlin.jvm.internal.s.g(view, "view");
        collection.removeView((View) view);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return getPages().size();
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(Object obj) {
        kotlin.jvm.internal.s.g(obj, "obj");
        if ((obj instanceof View) && ((View) obj).getTag() == PaymentFlowPage.ShippingMethod && this.shouldRecreateShippingMethodsScreen) {
            this.shouldRecreateShippingMethodsScreen = false;
            return -2;
        }
        return super.getItemPosition(obj);
    }

    public final PaymentFlowPage getPageAt$payments_core_release(int i11) {
        return (PaymentFlowPage) wz.u.e0(getPages(), i11);
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence getPageTitle(int i11) {
        return this.context.getString(getPages().get(i11).getTitleResId());
    }

    public final ShippingMethod getSelectedShippingMethod$payments_core_release() {
        return (ShippingMethod) this.selectedShippingMethod$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final ShippingInformation getShippingInformation$payments_core_release() {
        return this.shippingInformation;
    }

    public final List<ShippingMethod> getShippingMethods$payments_core_release() {
        return (List) this.shippingMethods$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // androidx.viewpager.widget.a
    public Object instantiateItem(ViewGroup collection, int i11) {
        RecyclerView.e0 shippingInformationViewHolder;
        kotlin.jvm.internal.s.g(collection, "collection");
        PaymentFlowPage paymentFlowPage = getPages().get(i11);
        int i12 = WhenMappings.$EnumSwitchMapping$0[paymentFlowPage.ordinal()];
        if (i12 == 1) {
            shippingInformationViewHolder = new PaymentFlowViewHolder.ShippingInformationViewHolder(collection);
        } else if (i12 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            shippingInformationViewHolder = new PaymentFlowViewHolder.ShippingMethodViewHolder(collection);
        }
        if (shippingInformationViewHolder instanceof PaymentFlowViewHolder.ShippingInformationViewHolder) {
            ((PaymentFlowViewHolder.ShippingInformationViewHolder) shippingInformationViewHolder).bind(this.paymentSessionConfig, this.shippingInformation, this.allowedShippingCountryCodes);
        } else if (shippingInformationViewHolder instanceof PaymentFlowViewHolder.ShippingMethodViewHolder) {
            ((PaymentFlowViewHolder.ShippingMethodViewHolder) shippingInformationViewHolder).bind(getShippingMethods$payments_core_release(), getSelectedShippingMethod$payments_core_release(), this.onShippingMethodSelectedCallback);
        }
        collection.addView(shippingInformationViewHolder.itemView);
        shippingInformationViewHolder.itemView.setTag(paymentFlowPage);
        View view = shippingInformationViewHolder.itemView;
        kotlin.jvm.internal.s.f(view, "viewHolder.itemView");
        return view;
    }

    public final boolean isShippingInfoSubmitted$payments_core_release() {
        return this.isShippingInfoSubmitted;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(View view, Object o11) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(o11, "o");
        return view == o11;
    }

    public final void setSelectedShippingMethod$payments_core_release(ShippingMethod shippingMethod) {
        this.selectedShippingMethod$delegate.setValue(this, $$delegatedProperties[1], shippingMethod);
    }

    public final void setShippingInfoSubmitted$payments_core_release(boolean z11) {
        this.isShippingInfoSubmitted = z11;
        notifyDataSetChanged();
    }

    public final void setShippingInformation$payments_core_release(ShippingInformation shippingInformation) {
        this.shippingInformation = shippingInformation;
        notifyDataSetChanged();
    }

    public final void setShippingMethods$payments_core_release(List<ShippingMethod> list) {
        kotlin.jvm.internal.s.g(list, "<set-?>");
        this.shippingMethods$delegate.setValue(this, $$delegatedProperties[0], list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentFlowPagerAdapter(Context context, PaymentSessionConfig paymentSessionConfig, Set<String> allowedShippingCountryCodes, h00.l<? super ShippingMethod, vz.b0> onShippingMethodSelectedCallback) {
        List i11;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(paymentSessionConfig, "paymentSessionConfig");
        kotlin.jvm.internal.s.g(allowedShippingCountryCodes, "allowedShippingCountryCodes");
        kotlin.jvm.internal.s.g(onShippingMethodSelectedCallback, "onShippingMethodSelectedCallback");
        this.context = context;
        this.paymentSessionConfig = paymentSessionConfig;
        this.allowedShippingCountryCodes = allowedShippingCountryCodes;
        this.onShippingMethodSelectedCallback = onShippingMethodSelectedCallback;
        kotlin.properties.a aVar = kotlin.properties.a.f34932a;
        i11 = wz.w.i();
        this.shippingMethods$delegate = new kotlin.properties.b<List<? extends ShippingMethod>>(i11) { // from class: com.stripe.android.view.PaymentFlowPagerAdapter$special$$inlined$observable$1
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, List<? extends ShippingMethod> list, List<? extends ShippingMethod> list2) {
                kotlin.jvm.internal.s.g(property, "property");
                PaymentFlowPagerAdapter.access$setShouldRecreateShippingMethodsScreen$p(this, !kotlin.jvm.internal.s.c(list2, list));
            }
        };
        this.selectedShippingMethod$delegate = new kotlin.properties.b<ShippingMethod>(null) { // from class: com.stripe.android.view.PaymentFlowPagerAdapter$special$$inlined$observable$2
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, ShippingMethod shippingMethod, ShippingMethod shippingMethod2) {
                kotlin.jvm.internal.s.g(property, "property");
                PaymentFlowPagerAdapter.access$setShouldRecreateShippingMethodsScreen$p(this, !kotlin.jvm.internal.s.c(shippingMethod2, shippingMethod));
            }
        };
    }
}