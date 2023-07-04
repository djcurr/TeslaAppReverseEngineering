package com.plaid.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.widget.ImageView;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;

/* loaded from: classes2.dex */
public final class k9 {
    public static final void a(PlaidInstitutionHeaderItem plaidInstitutionHeaderItem, Common$RenderedInstitution common$RenderedInstitution) {
        kotlin.jvm.internal.s.g(plaidInstitutionHeaderItem, "<this>");
        if (common$RenderedInstitution == null) {
            plaidInstitutionHeaderItem.setVisibility(8);
            return;
        }
        plaidInstitutionHeaderItem.setVisibility(0);
        Common$LocalizedString name = common$RenderedInstitution.getName();
        if (name != null) {
            Resources resources = plaidInstitutionHeaderItem.getResources();
            kotlin.jvm.internal.s.f(resources, "resources");
            Context context = plaidInstitutionHeaderItem.getContext();
            r3 = z6.a(name, resources, context != null ? context.getPackageName() : null, 0, 4);
        }
        plaidInstitutionHeaderItem.setTitle(r3);
        plaidInstitutionHeaderItem.setSubtitle(common$RenderedInstitution.getBrandUrl());
        if (common$RenderedInstitution.getPrimaryColor().length() > 1) {
            plaidInstitutionHeaderItem.setIconColor(Color.parseColor(common$RenderedInstitution.getPrimaryColor()));
        }
        Common$RenderedAssetAppearance logo = common$RenderedInstitution.getLogo();
        kotlin.jvm.internal.s.g(plaidInstitutionHeaderItem, "<this>");
        ImageView plaidListItemImage = plaidInstitutionHeaderItem.getPlaidListItemImage();
        kotlin.jvm.internal.s.f(plaidListItemImage, "plaidListItemImage");
        a4.a(plaidListItemImage, logo);
    }
}