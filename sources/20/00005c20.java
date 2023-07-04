package com.stripe.android.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.stripe.android.R;
import com.stripe.android.databinding.CardBrandSpinnerDropdownBinding;
import com.stripe.android.databinding.CardBrandSpinnerMainBinding;
import com.stripe.android.model.CardBrand;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class CardBrandSpinner extends androidx.appcompat.widget.v {
    private final Adapter cardBrandsAdapter;
    private Drawable defaultBackground;

    /* loaded from: classes6.dex */
    public static final class Adapter extends ArrayAdapter<CardBrand> {
        private final LayoutInflater layoutInflater;
        private int tintColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Adapter(Context context) {
            super(context, 0);
            kotlin.jvm.internal.s.g(context, "context");
            this.layoutInflater = LayoutInflater.from(context);
        }

        private final Drawable createCardBrandDrawable(CardBrand cardBrand) {
            Drawable drawable = androidx.core.content.b.getDrawable(getContext(), cardBrand.getIcon());
            if (drawable != null) {
                kotlin.jvm.internal.s.f(drawable, "requireNotNull(\n        …Brand.icon)\n            )");
                if (cardBrand == CardBrand.Unknown) {
                    Drawable r11 = n3.a.r(drawable);
                    n3.a.n(r11.mutate(), this.tintColor);
                    Drawable q11 = n3.a.q(r11);
                    kotlin.jvm.internal.s.f(q11, "{\n                val co…compatIcon)\n            }");
                    return q11;
                }
                return drawable;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i11, View view, ViewGroup parent) {
            kotlin.jvm.internal.s.g(parent, "parent");
            CardBrandSpinnerDropdownBinding bind = view == null ? null : CardBrandSpinnerDropdownBinding.bind(view);
            if (bind == null) {
                bind = CardBrandSpinnerDropdownBinding.inflate(this.layoutInflater, parent, false);
            }
            kotlin.jvm.internal.s.f(bind, "convertView?.let {\n     …tInflater, parent, false)");
            CardBrand item = getItem(i11);
            if (item != null) {
                kotlin.jvm.internal.s.f(item, "requireNotNull(getItem(position))");
                CardBrand cardBrand = item;
                AppCompatTextView appCompatTextView = bind.textView;
                appCompatTextView.setText(cardBrand.getDisplayName());
                appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(createCardBrandDrawable(cardBrand), (Drawable) null, (Drawable) null, (Drawable) null);
                AppCompatTextView root = bind.getRoot();
                kotlin.jvm.internal.s.f(root, "viewBinding.root");
                return root;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public final int getTintColor$payments_core_release() {
            return this.tintColor;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i11, View view, ViewGroup parent) {
            kotlin.jvm.internal.s.g(parent, "parent");
            CardBrandSpinnerMainBinding bind = view == null ? null : CardBrandSpinnerMainBinding.bind(view);
            if (bind == null) {
                bind = CardBrandSpinnerMainBinding.inflate(this.layoutInflater, parent, false);
            }
            kotlin.jvm.internal.s.f(bind, "convertView?.let {\n     …tInflater, parent, false)");
            CardBrand item = getItem(i11);
            if (item != null) {
                kotlin.jvm.internal.s.f(item, "requireNotNull(getItem(position))");
                CardBrand cardBrand = item;
                AppCompatImageView appCompatImageView = bind.image;
                appCompatImageView.setImageDrawable(createCardBrandDrawable(cardBrand));
                appCompatImageView.setContentDescription(cardBrand.getDisplayName());
                AppCompatImageView root = bind.getRoot();
                kotlin.jvm.internal.s.f(root, "viewBinding.root");
                return root;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public final void setTintColor$payments_core_release(int i11) {
            this.tintColor = i11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardBrandSpinner(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardBrandSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ CardBrandSpinner(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? g.a.J : i11);
    }

    public final CardBrand getCardBrand() {
        return (CardBrand) getSelectedItem();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        List d11;
        super.onFinishInflate();
        this.defaultBackground = getBackground();
        d11 = wz.v.d(CardBrand.Unknown);
        setCardBrands(d11);
    }

    public final /* synthetic */ void setCardBrands(List cardBrands) {
        kotlin.jvm.internal.s.g(cardBrands, "cardBrands");
        this.cardBrandsAdapter.clear();
        this.cardBrandsAdapter.addAll(cardBrands);
        this.cardBrandsAdapter.notifyDataSetChanged();
        setSelection(0);
        if (cardBrands.size() > 1) {
            setClickable(true);
            setEnabled(true);
            setBackground(this.defaultBackground);
            return;
        }
        setClickable(false);
        setEnabled(false);
        setBackgroundColor(androidx.core.content.b.getColor(getContext(), 17170445));
    }

    public final void setTintColor(int i11) {
        this.cardBrandsAdapter.setTintColor$payments_core_release(i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBrandSpinner(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, 1);
        kotlin.jvm.internal.s.g(context, "context");
        Adapter adapter = new Adapter(context);
        this.cardBrandsAdapter = adapter;
        setAdapter((SpinnerAdapter) adapter);
        setDropDownWidth(getResources().getDimensionPixelSize(R.dimen.card_brand_spinner_dropdown_width));
    }
}