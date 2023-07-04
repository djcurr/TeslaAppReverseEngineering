package com.plaid.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.plaid.internal.p9;
import com.plaid.link.R;

/* loaded from: classes2.dex */
public final class p9 extends q9 {

    /* renamed from: e  reason: collision with root package name */
    public final vz.k f19221e;

    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<CompoundButton> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f19223b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.f19223b = context;
        }

        @Override // h00.a
        public CompoundButton invoke() {
            View findViewById = p9.this.findViewById(R.id.plaidRadioButton);
            Context context = this.f19223b;
            CompoundButton compoundButton = (CompoundButton) findViewById;
            compoundButton.setClickable(false);
            compoundButton.setButtonTintList(l3.h.e(compoundButton.getResources(), R.color.plaid_compound_button_background, context.getTheme()));
            return compoundButton;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        vz.k a11;
        kotlin.jvm.internal.s.g(context, "context");
        a11 = vz.m.a(new a(context));
        this.f19221e = a11;
        ViewGroup.inflate(context, R.layout.plaid_list_item_multi_line_radio_button_selection, this);
        getPlaidCompoundButton().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qq.z
            {
                p9.this = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                p9.a(p9.this, compoundButton, z11);
            }
        });
    }

    public static final void a(p9 this$0, CompoundButton compoundButton, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.a(z11);
    }

    @Override // com.plaid.internal.q9
    public CompoundButton getPlaidCompoundButton() {
        Object value = this.f19221e.getValue();
        kotlin.jvm.internal.s.f(value, "<get-plaidCompoundButton>(...)");
        return (CompoundButton) value;
    }
}