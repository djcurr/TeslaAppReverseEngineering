package com.adyen.checkout.card.ui;

import android.content.Context;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import b7.h;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.ui.view.AdyenTextInputEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/card/ui/SocialSecurityNumberInput;", "Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "card_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class SocialSecurityNumberInput extends AdyenTextInputEditText {

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialSecurityNumberInput(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        b(h.f7528a.b().size() + 14);
        setInputType(2);
        setKeyListener(DigitsKeyListener.getInstance("0123456789./-"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.adyen.checkout.components.ui.view.AdyenTextInputEditText
    public void a(Editable editable) {
        s.g(editable, "editable");
        String obj = editable.toString();
        String a11 = h.f7528a.a(obj);
        if (!s.c(a11, obj)) {
            editable.replace(0, obj.length(), a11);
        }
        super.a(editable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialSecurityNumberInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        s.g(context, "context");
    }
}