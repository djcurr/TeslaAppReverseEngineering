package com.plaid.internal.core.ui_components;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b6.g;
import com.plaid.link.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;
import vz.k;
import vz.m;

/* loaded from: classes2.dex */
public final class PlaidListItemInstitution extends ConstraintLayout {

    /* renamed from: a  reason: collision with root package name */
    public final k f18445a;

    /* renamed from: b  reason: collision with root package name */
    public final k f18446b;

    /* renamed from: c  reason: collision with root package name */
    public final k f18447c;

    /* renamed from: d  reason: collision with root package name */
    public final k f18448d;

    /* renamed from: e  reason: collision with root package name */
    public final k f18449e;

    /* renamed from: f  reason: collision with root package name */
    public b6.d f18450f;

    /* loaded from: classes2.dex */
    public static final class a extends u implements h00.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f18451a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.f18451a = context;
        }

        @Override // h00.a
        public Integer invoke() {
            Resources.Theme theme = this.f18451a.getTheme();
            s.f(theme, "context.theme");
            int i11 = R.attr.plaidDisabledListItemBackgroundColor;
            s.g(theme, "<this>");
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(i11, typedValue, true);
            return Integer.valueOf(typedValue.data);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends u implements h00.a<ImageView> {
        public b() {
            super(0);
        }

        @Override // h00.a
        public ImageView invoke() {
            return (ImageView) PlaidListItemInstitution.this.findViewById(R.id.plaidListItemCta);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends u implements h00.a<ImageView> {
        public c() {
            super(0);
        }

        @Override // h00.a
        public ImageView invoke() {
            return (ImageView) PlaidListItemInstitution.this.findViewById(R.id.plaidListItemImage);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends u implements h00.a<TextView> {
        public d() {
            super(0);
        }

        @Override // h00.a
        public TextView invoke() {
            return (TextView) PlaidListItemInstitution.this.findViewById(R.id.plaidListItemSubtitle);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends u implements h00.a<TextView> {
        public e() {
            super(0);
        }

        @Override // h00.a
        public TextView invoke() {
            return (TextView) PlaidListItemInstitution.this.findViewById(R.id.plaidListItemTitle);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidListItemInstitution(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidListItemInstitution(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ PlaidListItemInstitution(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final int getDisabledColor() {
        return ((Number) this.f18445a.getValue()).intValue();
    }

    private final TextView getPlaidListItemSubtitle() {
        return (TextView) this.f18448d.getValue();
    }

    private final TextView getPlaidListItemTitle() {
        return (TextView) this.f18447c.getValue();
    }

    public final ImageView getPlaidListItemCta() {
        return (ImageView) this.f18449e.getValue();
    }

    public final ImageView getPlaidListItemImage() {
        return (ImageView) this.f18446b.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        b6.d dVar = this.f18450f;
        if (dVar != null) {
            dVar.dispose();
        }
        super.onDetachedFromWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.plaid_list_item_size), 1073741824));
    }

    public final void setCta(Drawable drawable) {
        getPlaidListItemCta().setImageDrawable(drawable);
        ImageView plaidListItemCta = getPlaidListItemCta();
        s.f(plaidListItemCta, "plaidListItemCta");
        plaidListItemCta.setVisibility(drawable != null ? 0 : 8);
    }

    public final void setCtaClickListener(View.OnClickListener onClickListener) {
        getPlaidListItemCta().setOnClickListener(onClickListener);
    }

    public final void setCtaResId(int i11) {
        getPlaidListItemCta().setImageResource(i11);
        getPlaidListItemCta().setVisibility(0);
    }

    public final void setImage(Drawable drawable) {
        getPlaidListItemImage().setImageDrawable(drawable);
    }

    public final void setImageColor(int i11) {
        getPlaidListItemImage().setBackgroundColor(i11);
    }

    public final void setImageResId(int i11) {
        getPlaidListItemImage().setImageResource(i11);
    }

    public final void setImageUrl(String imageUrl) {
        s.g(imageUrl, "imageUrl");
        ImageView plaidListItemImage = getPlaidListItemImage();
        s.f(plaidListItemImage, "plaidListItemImage");
        Context context = plaidListItemImage.getContext();
        s.f(context, "context");
        r5.d a11 = r5.a.a(context);
        Context context2 = plaidListItemImage.getContext();
        s.f(context2, "context");
        g.a i11 = new g.a(context2).b(imageUrl).i(plaidListItemImage);
        b0 b0Var = b0.f54756a;
        this.f18450f = a11.a(i11.a());
    }

    public final void setIsEnabled(Boolean bool) {
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        setClickable(bool.booleanValue());
        setFocusable(bool.booleanValue());
        getPlaidListItemTitle().setEnabled(bool.booleanValue());
        getPlaidListItemSubtitle().setEnabled(bool.booleanValue());
        if (!bool.booleanValue()) {
            getPlaidListItemImage().setColorFilter(getDisabledColor(), PorterDuff.Mode.SRC_IN);
        } else {
            getPlaidListItemImage().clearColorFilter();
        }
    }

    public final void setSubtitle(CharSequence charSequence) {
        getPlaidListItemSubtitle().setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        getPlaidListItemTitle().setText(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidListItemInstitution(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        k a11;
        k a12;
        k a13;
        k a14;
        k a15;
        s.g(context, "context");
        a11 = m.a(new a(context));
        this.f18445a = a11;
        a12 = m.a(new c());
        this.f18446b = a12;
        a13 = m.a(new e());
        this.f18447c = a13;
        a14 = m.a(new d());
        this.f18448d = a14;
        a15 = m.a(new b());
        this.f18449e = a15;
        ViewGroup.inflate(context, R.layout.plaid_list_item_institution, this);
        setClickable(true);
        setFocusable(true);
        setEnabled(true);
        setBackgroundResource(R.drawable.plaid_list_item_background);
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PlaidListItemInstitution, 0, 0);
        s.f(obtainStyledAttributes, "context.obtainStyledAttr…Institution, 0, 0\n      )");
        setImage(obtainStyledAttributes.getDrawable(R.styleable.PlaidListItemInstitution_plaid_image));
        setTitle(obtainStyledAttributes.getText(R.styleable.PlaidListItemInstitution_plaid_title));
        setSubtitle(obtainStyledAttributes.getText(R.styleable.PlaidListItemInstitution_plaid_subtitle));
        setCta(obtainStyledAttributes.getDrawable(R.styleable.PlaidListItemInstitution_plaid_list_item_cta));
        obtainStyledAttributes.recycle();
    }
}