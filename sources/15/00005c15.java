package com.stripe.android.view;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class BecsDebitMandateAcceptanceTextView extends AppCompatTextView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(BecsDebitMandateAcceptanceTextView.class, "companyName", "getCompanyName()Ljava/lang/String;", 0))};
    public static final int $stable = 8;
    private final kotlin.properties.c companyName$delegate;
    private final BecsDebitMandateAcceptanceTextFactory factory;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitMandateAcceptanceTextView(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 16842884 : i11);
    }

    public static final /* synthetic */ BecsDebitMandateAcceptanceTextFactory access$getFactory$p(BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView) {
        return becsDebitMandateAcceptanceTextView.factory;
    }

    public final String getCompanyName() {
        return (String) this.companyName$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final boolean isValid$payments_core_release() {
        boolean z11;
        boolean w11;
        CharSequence text = getText();
        if (text != null) {
            w11 = kotlin.text.v.w(text);
            if (!w11) {
                z11 = false;
                return !z11;
            }
        }
        z11 = true;
        return !z11;
    }

    public final void setCompanyName(String str) {
        kotlin.jvm.internal.s.g(str, "<set-?>");
        this.companyName$delegate.setValue(this, $$delegatedProperties[0], str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        this.factory = new BecsDebitMandateAcceptanceTextFactory(context);
        setMovementMethod(LinkMovementMethod.getInstance());
        kotlin.properties.a aVar = kotlin.properties.a.f34932a;
        this.companyName$delegate = new kotlin.properties.b<String>("") { // from class: com.stripe.android.view.BecsDebitMandateAcceptanceTextView$special$$inlined$observable$1
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, String str, String str2) {
                boolean w11;
                CharSequence create;
                kotlin.jvm.internal.s.g(property, "property");
                String str3 = str2;
                BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView = this;
                w11 = kotlin.text.v.w(str3);
                if (!(!w11)) {
                    str3 = null;
                }
                CharSequence charSequence = "";
                if (str3 != null && (create = BecsDebitMandateAcceptanceTextView.access$getFactory$p(this).create(str3)) != null) {
                    charSequence = create;
                }
                becsDebitMandateAcceptanceTextView.setText(charSequence);
            }
        };
    }
}