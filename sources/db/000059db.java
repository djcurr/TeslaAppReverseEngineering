package com.stripe.android.ui.core.elements;

import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.ui.core.Amount;
import com.stripe.android.ui.core.CurrencyFormatter;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j0;
import vz.p;
import wz.w;

/* loaded from: classes6.dex */
public final class AfterpayClearpayHeaderElement extends FormElement {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String url = "https://static-us.afterpay.com/javascript/modal/%s_rebrand_modal.html";
    private final Amount amount;
    private final Controller controller;
    private final IdentifierSpec identifier;
    private final String infoUrl;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AfterpayClearpayHeaderElement(IdentifierSpec identifierSpec, Amount amount, Controller controller, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, amount, (i11 & 4) != 0 ? null : controller);
    }

    private final Amount component2() {
        return this.amount;
    }

    public static /* synthetic */ AfterpayClearpayHeaderElement copy$default(AfterpayClearpayHeaderElement afterpayClearpayHeaderElement, IdentifierSpec identifierSpec, Amount amount, Controller controller, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = afterpayClearpayHeaderElement.getIdentifier();
        }
        if ((i11 & 2) != 0) {
            amount = afterpayClearpayHeaderElement.amount;
        }
        if ((i11 & 4) != 0) {
            controller = afterpayClearpayHeaderElement.getController();
        }
        return afterpayClearpayHeaderElement.copy(identifierSpec, amount, controller);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final Controller component3() {
        return getController();
    }

    public final AfterpayClearpayHeaderElement copy(IdentifierSpec identifier, Amount amount, Controller controller) {
        s.g(identifier, "identifier");
        s.g(amount, "amount");
        return new AfterpayClearpayHeaderElement(identifier, amount, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AfterpayClearpayHeaderElement) {
            AfterpayClearpayHeaderElement afterpayClearpayHeaderElement = (AfterpayClearpayHeaderElement) obj;
            return s.c(getIdentifier(), afterpayClearpayHeaderElement.getIdentifier()) && s.c(this.amount, afterpayClearpayHeaderElement.amount) && s.c(getController(), afterpayClearpayHeaderElement.getController());
        }
        return false;
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public Controller getController() {
        return this.controller;
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public e<List<p<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        List i11;
        i11 = w.i();
        return j0.a(i11);
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    public final String getInfoUrl() {
        return this.infoUrl;
    }

    public final String getLabel(Resources resources) {
        s.g(resources, "resources");
        String string = resources.getString(R.string.afterpay_clearpay_message, CurrencyFormatter.Companion.format$default(CurrencyFormatter.Companion, this.amount.getValue() / 4, this.amount.getCurrencyCode(), (Locale) null, 4, (Object) null));
        s.f(string, "resources.getString(\n   …e\n            )\n        )");
        return string;
    }

    public int hashCode() {
        return (((getIdentifier().hashCode() * 31) + this.amount.hashCode()) * 31) + (getController() == null ? 0 : getController().hashCode());
    }

    public String toString() {
        return "AfterpayClearpayHeaderElement(identifier=" + getIdentifier() + ", amount=" + this.amount + ", controller=" + getController() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayClearpayHeaderElement(IdentifierSpec identifier, Amount amount, Controller controller) {
        super(null);
        s.g(identifier, "identifier");
        s.g(amount, "amount");
        this.identifier = identifier;
        this.amount = amount;
        this.controller = controller;
        String lowerCase = t2.e.f51561b.a().b().toLowerCase(Locale.ROOT);
        s.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String format = String.format(url, Arrays.copyOf(new Object[]{lowerCase}, 1));
        s.f(format, "format(this, *args)");
        this.infoUrl = format;
    }
}