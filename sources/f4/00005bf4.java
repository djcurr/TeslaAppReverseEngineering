package com.stripe.android.view;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.R;
import com.stripe.android.databinding.BankItemBinding;
import com.stripe.android.model.BankStatuses;
import java.util.List;

/* loaded from: classes6.dex */
public final class AddPaymentMethodListAdapter extends RecyclerView.h<RecyclerView.e0> {
    private BankStatuses bankStatuses;
    private final h00.l<Integer, vz.b0> itemSelectedCallback;
    private final List<Bank> items;
    private int selectedPosition;
    private final ThemeConfig themeConfig;

    /* loaded from: classes6.dex */
    public static final class BankViewHolder extends RecyclerView.e0 {
        private final Resources resources;
        private final ThemeConfig themeConfig;
        private final BankItemBinding viewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankViewHolder(BankItemBinding viewBinding, ThemeConfig themeConfig) {
            super(viewBinding.getRoot());
            kotlin.jvm.internal.s.g(viewBinding, "viewBinding");
            kotlin.jvm.internal.s.g(themeConfig, "themeConfig");
            this.viewBinding = viewBinding;
            this.themeConfig = themeConfig;
            Resources resources = this.itemView.getResources();
            kotlin.jvm.internal.s.f(resources, "itemView.resources");
            this.resources = resources;
        }

        public final void setSelected$payments_core_release(boolean z11) {
            this.viewBinding.name.setTextColor(this.themeConfig.getTextColor$payments_core_release(z11));
            androidx.core.widget.i.c(this.viewBinding.checkIcon, ColorStateList.valueOf(this.themeConfig.getTintColor$payments_core_release(z11)));
            AppCompatImageView appCompatImageView = this.viewBinding.checkIcon;
            kotlin.jvm.internal.s.f(appCompatImageView, "viewBinding.checkIcon");
            appCompatImageView.setVisibility(z11 ? 0 : 8);
        }

        public final void update(Bank bank, boolean z11) {
            String string;
            kotlin.jvm.internal.s.g(bank, "bank");
            AppCompatTextView appCompatTextView = this.viewBinding.name;
            if (z11) {
                string = bank.getDisplayName();
            } else {
                string = this.resources.getString(R.string.fpx_bank_offline, bank.getDisplayName());
            }
            appCompatTextView.setText(string);
            Integer brandIconResId = bank.getBrandIconResId();
            if (brandIconResId == null) {
                return;
            }
            this.viewBinding.icon.setImageResource(brandIconResId.intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddPaymentMethodListAdapter(ThemeConfig themeConfig, List<? extends Bank> items, h00.l<? super Integer, vz.b0> itemSelectedCallback) {
        kotlin.jvm.internal.s.g(themeConfig, "themeConfig");
        kotlin.jvm.internal.s.g(items, "items");
        kotlin.jvm.internal.s.g(itemSelectedCallback, "itemSelectedCallback");
        this.themeConfig = themeConfig;
        this.items = items;
        this.itemSelectedCallback = itemSelectedCallback;
        this.selectedPosition = -1;
        setHasStableIds(true);
    }

    public static /* synthetic */ void a(AddPaymentMethodListAdapter addPaymentMethodListAdapter, RecyclerView.e0 e0Var, View view) {
        m508onBindViewHolder$lambda0(addPaymentMethodListAdapter, e0Var, view);
    }

    /* renamed from: onBindViewHolder$lambda-0 */
    public static final void m508onBindViewHolder$lambda0(AddPaymentMethodListAdapter this$0, RecyclerView.e0 holder, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(holder, "$holder");
        this$0.setSelectedPosition(holder.getBindingAdapterPosition());
    }

    public final BankStatuses getBankStatuses$payments_core_release() {
        return this.bankStatuses;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i11) {
        return i11;
    }

    public final h00.l<Integer, vz.b0> getItemSelectedCallback() {
        return this.itemSelectedCallback;
    }

    public final List<Bank> getItems() {
        return this.items;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public final ThemeConfig getThemeConfig() {
        return this.themeConfig;
    }

    public final void notifyAdapterItemChanged(int i11) {
        notifyItemChanged(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(final RecyclerView.e0 holder, int i11) {
        kotlin.jvm.internal.s.g(holder, "holder");
        Bank bank = this.items.get(i11);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddPaymentMethodListAdapter.a(AddPaymentMethodListAdapter.this, holder, view);
            }
        });
        BankViewHolder bankViewHolder = (BankViewHolder) holder;
        bankViewHolder.setSelected$payments_core_release(i11 == this.selectedPosition);
        BankStatuses bankStatuses = this.bankStatuses;
        bankViewHolder.update(bank, bankStatuses != null ? bankStatuses.isOnline$payments_core_release(bank) : true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        BankItemBinding inflate = BankItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.s.f(inflate, "inflate(\n               …      false\n            )");
        return new BankViewHolder(inflate, this.themeConfig);
    }

    public final void setBankStatuses$payments_core_release(BankStatuses bankStatuses) {
        this.bankStatuses = bankStatuses;
    }

    public final void setSelectedPosition(int i11) {
        int i12 = this.selectedPosition;
        if (i11 != i12) {
            if (i12 != -1) {
                notifyItemChanged(i12);
            }
            notifyItemChanged(i11);
            this.itemSelectedCallback.invoke(Integer.valueOf(i11));
        }
        this.selectedPosition = i11;
    }

    public final void updateSelected$payments_core_release(int i11) {
        setSelectedPosition(i11);
        notifyItemChanged(i11);
    }
}