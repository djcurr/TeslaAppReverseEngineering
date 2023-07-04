package com.plaid.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.q9;
import com.plaid.link.R;

/* loaded from: classes2.dex */
public abstract class q9 extends ConstraintLayout {

    /* renamed from: a  reason: collision with root package name */
    public final vz.k f19316a;

    /* renamed from: b  reason: collision with root package name */
    public final vz.k f19317b;

    /* renamed from: c  reason: collision with root package name */
    public final vz.k f19318c;

    /* renamed from: d  reason: collision with root package name */
    public final vz.k f19319d;

    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<TextView> {
        public a() {
            super(0);
        }

        @Override // h00.a
        public TextView invoke() {
            return (TextView) q9.this.findViewById(R.id.plaidDescriptorText);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<TextView> {
        public b() {
            super(0);
        }

        @Override // h00.a
        public TextView invoke() {
            return (TextView) q9.this.findViewById(R.id.plaidMetaText);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.a<ImageView> {
        public c() {
            super(0);
        }

        @Override // h00.a
        public ImageView invoke() {
            return (ImageView) q9.this.findViewById(R.id.plaidTrailingIcon);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.a<TextView> {
        public d() {
            super(0);
        }

        @Override // h00.a
        public TextView invoke() {
            return (TextView) q9.this.findViewById(R.id.plaidValueText);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        vz.k a11;
        vz.k a12;
        vz.k a13;
        vz.k a14;
        kotlin.jvm.internal.s.g(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.plaid_space_1x);
        a11 = vz.m.a(new d());
        this.f19316a = a11;
        a12 = vz.m.a(new a());
        this.f19317b = a12;
        a13 = vz.m.a(new b());
        this.f19318c = a13;
        a14 = vz.m.a(new c());
        this.f19319d = a14;
        setBackgroundResource(R.drawable.plaid_list_item_background);
        setClickable(true);
        setFocusable(true);
        setEnabled(true);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        setOnClickListener(new View.OnClickListener() { // from class: qq.a0
            {
                q9.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q9.a(q9.this, view);
            }
        });
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PlaidListItemSelection, 0, 0);
            kotlin.jvm.internal.s.f(obtainStyledAttributes, "context.obtainStyledAttr…emSelection, 0, 0\n      )");
            CharSequence text = obtainStyledAttributes.getText(R.styleable.PlaidListItemSelection_plaid_list_item_value);
            kotlin.jvm.internal.s.f(text, "typedArray.getText(R.sty…on_plaid_list_item_value)");
            setValue(text);
            setDescriptor(obtainStyledAttributes.getText(R.styleable.PlaidListItemSelection_plaid_list_item_descriptor));
            setMeta(obtainStyledAttributes.getText(R.styleable.PlaidListItemSelection_plaid_list_item_meta));
            setTrailingIcon(obtainStyledAttributes.getDrawable(R.styleable.PlaidListItemSelection_plaid_list_item_trailing_icon));
            obtainStyledAttributes.recycle();
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: qq.b0
            {
                q9.this = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return q9.a(q9.this, view, motionEvent);
            }
        });
    }

    public static final void a(q9 this$0, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.getPlaidCompoundButton().setChecked(!this$0.getPlaidCompoundButton().isChecked());
    }

    private final TextView getPlaidDescriptorText() {
        return (TextView) this.f19317b.getValue();
    }

    private final TextView getPlaidMetaText() {
        return (TextView) this.f19318c.getValue();
    }

    private final ImageView getPlaidTrailingIcon() {
        return (ImageView) this.f19319d.getValue();
    }

    private final TextView getPlaidValueText() {
        return (TextView) this.f19316a.getValue();
    }

    public abstract CompoundButton getPlaidCompoundButton();

    public final void setChecked(boolean z11) {
        getPlaidCompoundButton().setChecked(z11);
    }

    public final void setDescriptor(CharSequence charSequence) {
        TextView plaidDescriptorText = getPlaidDescriptorText();
        kotlin.jvm.internal.s.f(plaidDescriptorText, "plaidDescriptorText");
        plaidDescriptorText.setVisibility(true ^ (charSequence == null || charSequence.length() == 0) ? 0 : 8);
        getPlaidDescriptorText().setText(charSequence);
    }

    public final void setIsEnabled(Boolean bool) {
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        getPlaidCompoundButton().setEnabled(bool.booleanValue());
        getPlaidValueText().setEnabled(bool.booleanValue());
        getPlaidDescriptorText().setEnabled(bool.booleanValue());
        getPlaidMetaText().setEnabled(bool.booleanValue());
        super.setEnabled(bool.booleanValue());
    }

    public final void setMeta(CharSequence charSequence) {
        TextView plaidMetaText = getPlaidMetaText();
        kotlin.jvm.internal.s.f(plaidMetaText, "plaidMetaText");
        plaidMetaText.setVisibility(true ^ (charSequence == null || charSequence.length() == 0) ? 0 : 8);
        getPlaidMetaText().setText(charSequence);
    }

    public final void setOnCheckedChangeListener(final CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        getPlaidCompoundButton().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qq.c0
            {
                q9.this = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                q9.a(q9.this, onCheckedChangeListener, compoundButton, z11);
            }
        });
    }

    public final void setTrailingIcon(Drawable drawable) {
        if (drawable == null) {
            getPlaidTrailingIcon().setVisibility(8);
            return;
        }
        getPlaidTrailingIcon().setVisibility(0);
        getPlaidTrailingIcon().setImageDrawable(drawable);
    }

    public final void setValue(CharSequence value) {
        kotlin.jvm.internal.s.g(value, "value");
        getPlaidValueText().setText(value);
    }

    public static final boolean a(q9 this$0, View view, MotionEvent motionEvent) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        int action = motionEvent.getAction();
        if (action == 0) {
            this$0.a(!this$0.getPlaidCompoundButton().isChecked());
        } else if (action != 1) {
            this$0.a(this$0.getPlaidCompoundButton().isChecked());
        } else {
            this$0.performClick();
        }
        return true;
    }

    public static final void a(q9 this$0, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, CompoundButton compoundButton, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.a(z11);
        if (onCheckedChangeListener == null) {
            return;
        }
        onCheckedChangeListener.onCheckedChanged(compoundButton, z11);
    }

    public final void a(boolean z11) {
        float translationZ = getTranslationZ();
        final float dimension = z11 ? getResources().getDimension(R.dimen.plaid_shadow3_elevation) : BitmapDescriptorFactory.HUE_RED;
        if (translationZ == dimension) {
            return;
        }
        animate().translationZ(dimension).withEndAction(new Runnable() { // from class: qq.d0
            {
                q9.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                q9.a(q9.this, dimension);
            }
        });
    }

    public static final void a(q9 this$0, float f11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.setTranslationZ(f11);
    }
}