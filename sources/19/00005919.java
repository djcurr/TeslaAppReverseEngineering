package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ChallengeEntryViewFactory {
    private final Context context;

    public ChallengeEntryViewFactory(Context context) {
        s.g(context, "context");
        this.context = context;
    }

    public final ChallengeZoneSelectView createChallengeEntrySelectView(ChallengeResponseData challengeResponseData, UiCustomization uiCustomization) {
        s.g(challengeResponseData, "challengeResponseData");
        s.g(uiCustomization, "uiCustomization");
        ChallengeZoneSelectView challengeZoneSelectView = new ChallengeZoneSelectView(this.context, null, 0, challengeResponseData.getUiType() == UiType.SingleSelect, 6, null);
        challengeZoneSelectView.setTextEntryLabel(challengeResponseData.getChallengeInfoLabel(), uiCustomization.getLabelCustomization());
        challengeZoneSelectView.setChallengeSelectOptions(challengeResponseData.getChallengeSelectOptions(), uiCustomization.getButtonCustomization(UiCustomization.ButtonType.SELECT));
        return challengeZoneSelectView;
    }

    public final ChallengeZoneTextView createChallengeEntryTextView(ChallengeResponseData challengeResponseData, UiCustomization uiCustomization) {
        s.g(challengeResponseData, "challengeResponseData");
        s.g(uiCustomization, "uiCustomization");
        ChallengeZoneTextView challengeZoneTextView = new ChallengeZoneTextView(this.context, null, 0, 6, null);
        challengeZoneTextView.setTextEntryLabel(challengeResponseData.getChallengeInfoLabel());
        challengeZoneTextView.setTextBoxCustomization(uiCustomization.getTextBoxCustomization());
        return challengeZoneTextView;
    }

    public final ChallengeZoneWebView createChallengeEntryWebView(ChallengeResponseData challengeResponseData) {
        s.g(challengeResponseData, "challengeResponseData");
        ChallengeZoneWebView challengeZoneWebView = new ChallengeZoneWebView(this.context, null, 0, 6, null);
        challengeZoneWebView.loadHtml(challengeResponseData.getAcsHtml());
        return challengeZoneWebView;
    }
}