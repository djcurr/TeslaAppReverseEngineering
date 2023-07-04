package com.stripe.android.ui.core.forms;

import com.adyen.checkout.components.model.payments.request.BlikPaymentMethod;
import com.stripe.android.ui.core.elements.DropdownItemSpec;
import com.stripe.android.ui.core.elements.DropdownSpec;
import com.stripe.android.ui.core.elements.EmailSpec;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.LayoutSpec;
import com.stripe.android.ui.core.elements.NameSpec;
import com.stripe.android.ui.core.elements.TranslationId;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.w;

/* loaded from: classes6.dex */
public final class P24SpecKt {
    private static final LayoutSpec P24Form;

    static {
        List l11;
        LayoutSpec.Companion companion = LayoutSpec.Companion;
        IdentifierSpec Generic = IdentifierSpec.Companion.Generic("p24[bank]");
        TranslationId translationId = TranslationId.P24Bank;
        l11 = w.l(new DropdownItemSpec("alior_bank", "Alior Bank"), new DropdownItemSpec("bank_millennium", "Bank Millenium"), new DropdownItemSpec("bank_nowy_bfg_sa", "Bank Nowy BFG S.A."), new DropdownItemSpec("bank_pekao_sa", "Bank PEKAO S.A"), new DropdownItemSpec("banki_spbdzielcze", "Bank spółdzielczy"), new DropdownItemSpec(BlikPaymentMethod.PAYMENT_METHOD_TYPE, "BLIK"), new DropdownItemSpec("bnp_paribas", "BNP Paribas"), new DropdownItemSpec("boz", "BOZ"), new DropdownItemSpec("citi_handlowy", "CitiHandlowy"), new DropdownItemSpec("credit_agricole", "Credit Agricole"), new DropdownItemSpec("etransfer_pocztowy24", "e-Transfer Pocztowy24"), new DropdownItemSpec("getin_bank", "Getin Bank"), new DropdownItemSpec("ideabank", "IdeaBank"), new DropdownItemSpec("ing", "ING"), new DropdownItemSpec("inteligo", "inteligo"), new DropdownItemSpec("mbank_mtransfer", "mBank"), new DropdownItemSpec("nest_przelew", "Nest Przelew"), new DropdownItemSpec("noble_pay", "Noble Pay"), new DropdownItemSpec("pbac_z_ipko", "PBac z iPKO (PKO+BP"), new DropdownItemSpec("plus_bank", "Plus Bank"), new DropdownItemSpec("santander_przelew24", "Santander"), new DropdownItemSpec("toyota_bank", "Toyota Bank"), new DropdownItemSpec("volkswagen_bank", "Volkswagen Bank"), new DropdownItemSpec(null, "Other"));
        P24Form = companion.create(new NameSpec((IdentifierSpec) null, (TranslationId) null, 3, (DefaultConstructorMarker) null), new EmailSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null), new DropdownSpec(Generic, translationId, l11));
    }

    public static final LayoutSpec getP24Form() {
        return P24Form;
    }
}