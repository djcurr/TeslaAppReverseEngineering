package com.stripe.android.ui.core.forms;

import com.stripe.android.ui.core.elements.DropdownItemSpec;
import com.stripe.android.ui.core.elements.DropdownSpec;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.LayoutSpec;
import com.stripe.android.ui.core.elements.NameSpec;
import com.stripe.android.ui.core.elements.TranslationId;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.w;

/* loaded from: classes6.dex */
public final class EpsSpecKt {
    private static final LayoutSpec EpsForm;

    static {
        List l11;
        LayoutSpec.Companion companion = LayoutSpec.Companion;
        IdentifierSpec Generic = IdentifierSpec.Companion.Generic("eps[bank]");
        TranslationId translationId = TranslationId.EpsBank;
        l11 = w.l(new DropdownItemSpec("arzte_und_apotheker_bank", "Ärzte- und Apothekerbank"), new DropdownItemSpec("austrian_anadi_bank_ag", "Austrian Anadi Bank AG"), new DropdownItemSpec("bank_austria", "Bank Austria"), new DropdownItemSpec("bankhaus_carl_spangler", "Bankhaus Carl Spängler & Co.AG"), new DropdownItemSpec("bankhaus_schelhammer_und_schattera_ag", "Bankhaus Schelhammer & Schattera AG"), new DropdownItemSpec("bawag_psk_ag", "BAWAG P.S.K. AG"), new DropdownItemSpec("bks_bank_ag", "BKS Bank AG"), new DropdownItemSpec("brull_kallmus_bank_ag", "Brüll Kallmus Bank AG"), new DropdownItemSpec("btv_vier_lander_bank", "BTV VIER LÄNDER BANK"), new DropdownItemSpec("capital_bank_grawe_gruppe_ag", "Capital Bank Grawe Gruppe AG"), new DropdownItemSpec("dolomitenbank", "Dolomitenbank"), new DropdownItemSpec("easybank_ag", "Easybank AG"), new DropdownItemSpec("erste_bank_und_sparkassen", "Erste Bank und Sparkassen"), new DropdownItemSpec("hypo_alpeadriabank_international_ag", "Hypo Alpe-Adria-Bank International AG"), new DropdownItemSpec("hypo_noe_lb_fur_niederosterreich_u_wien", "HYPO NOE LB für Niederösterreich u. Wien"), new DropdownItemSpec("hypo_oberosterreich_salzburg_steiermark", "HYPO Oberösterreich,Salzburg,Steiermark"), new DropdownItemSpec("hypo_tirol_bank_ag", "Hypo Tirol Bank AG"), new DropdownItemSpec("hypo_vorarlberg_bank_ag", "Hypo Vorarlberg Bank AG"), new DropdownItemSpec("hypo_bank_burgenland_aktiengesellschaft", "HYPO-BANK BURGENLAND Aktiengesellschaft"), new DropdownItemSpec("marchfelder_bank", "Marchfelder Bank"), new DropdownItemSpec("oberbank_ag", "Oberbank AG"), new DropdownItemSpec("raiffeisen_bankengruppe_osterreich", "Raiffeisen Bankengruppe Österreich"), new DropdownItemSpec("schoellerbank_ag", "Schoellerbank AG"), new DropdownItemSpec("sparda_bank_wien", "Sparda-Bank Wien"), new DropdownItemSpec("volksbank_gruppe", "Volksbank Gruppe"), new DropdownItemSpec("volkskreditbank_ag", "Volkskreditbank AG"), new DropdownItemSpec("vr_bank_braunau", "VR-Bank Braunau"), new DropdownItemSpec(null, "Other"));
        EpsForm = companion.create(new NameSpec((IdentifierSpec) null, (TranslationId) null, 3, (DefaultConstructorMarker) null), new DropdownSpec(Generic, translationId, l11));
    }

    public static final LayoutSpec getEpsForm() {
        return EpsForm;
    }
}