package com.plaid.internal.core.protos.clients;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.BoolValue;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.StringValue;
import com.plaid.internal.q5;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class LinkCustomizations$LinkCustomization extends GeneratedMessageLite<LinkCustomizations$LinkCustomization, b> implements MessageLiteOrBuilder {
    public static final int ACCOUNT_NUMBER_PANE_MESSAGE_FIELD_NUMBER = 39;
    public static final int ACCOUNT_NUMBER_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 40;
    public static final int ACCOUNT_NUMBER_PANE_TITLE_FIELD_NUMBER = 38;
    public static final int ACCOUNT_SELECT_PANE_IS_ENABLED_FIELD_NUMBER = 46;
    public static final int ACCOUNT_SELECT_PANE_IS_MULTI_ACCOUNT_SELECT_ENABLED_FIELD_NUMBER = 47;
    public static final int ACCOUNT_SELECT_PANE_MODE_FIELD_NUMBER = 75;
    public static final int ACCOUNT_SELECT_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 45;
    public static final int ACCOUNT_SELECT_PANE_TITLE_FIELD_NUMBER = 44;
    public static final int CONNECTED_PANE_HEADING_FIELD_NUMBER = 55;
    public static final int CONNECTED_PANE_IS_ENABLED_FIELD_NUMBER = 6;
    public static final int CONNECTED_PANE_MESSAGE_FIELD_NUMBER = 4;
    public static final int CONNECTED_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 5;
    public static final int CONNECTED_PANE_TITLE_FIELD_NUMBER = 3;
    public static final int COUNTRY_CODES_FIELD_NUMBER = 56;
    public static final int CREDENTIAL_PANE_PLAID_LEGAL_ENABLED_FIELD_NUMBER = 14;
    public static final int CREDENTIAL_PANE_RESET_PASSWORD_BUTTON_FIELD_NUMBER = 13;
    public static final int CREDENTIAL_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 12;
    public static final int CREDENTIAL_PANE_TITLE_FIELD_NUMBER = 11;
    public static final int CREDENTIAL_PANE_TOS_CONTENT_FIELD_NUMBER = 15;
    public static final int CREDENTIAL_PANE_TOS_ENABLED_FIELD_NUMBER = 16;
    private static final LinkCustomizations$LinkCustomization DEFAULT_INSTANCE;
    public static final int ERROR_PANE_TITLE_FIELD_NUMBER = 20;
    public static final int EU_CONSENT_PANE_CANCEL_FIELD_NUMBER = 63;
    public static final int EU_CONSENT_PANE_CONTACT_DETAILS_TITLE_FIELD_NUMBER = 57;
    public static final int EU_CONSENT_PANE_CONTINUE_AGREE_FIELD_NUMBER = 61;
    public static final int EU_CONSENT_PANE_CONTINUE_FIELD_NUMBER = 62;
    public static final int EU_CONSENT_PANE_DETAILS_TITLE_FIELD_NUMBER = 60;
    public static final int EU_CONSENT_PANE_IS_ENABLED_FIELD_NUMBER = 17;
    public static final int EU_CONSENT_PANE_LINK_WITH_PLAID_FIELD_NUMBER = 58;
    public static final int EU_CONSENT_PANE_SUBMIT_AGREE_FIELD_NUMBER = 19;
    public static final int EU_CONSENT_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 18;
    public static final int EU_CONSENT_PANE_TRANSACTIONS_TITLE_FIELD_NUMBER = 59;
    public static final int EXIT_PANE_CANCEL_BUTTON_FIELD_NUMBER = 25;
    public static final int EXIT_PANE_HEADING_FIELD_NUMBER = 22;
    public static final int EXIT_PANE_MESSAGE_FIELD_NUMBER = 23;
    public static final int EXIT_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 24;
    public static final int EXIT_PANE_TITLE_FIELD_NUMBER = 21;
    public static final int GLOBAL_HIGHLIGHT_COLOR_FIELD_NUMBER = 1;
    public static final int GLOBAL_OVERLAY_BACKGROUND_COLOR_FIELD_NUMBER = 2;
    public static final int INSTITUTION_SEARCH_PANE_EXIT_BUTTON_FIELD_NUMBER = 29;
    public static final int INSTITUTION_SEARCH_PANE_INITIAL_MESSAGE_FIELD_NUMBER = 31;
    public static final int INSTITUTION_SEARCH_PANE_NO_RESULTS_MESSAGE_FIELD_NUMBER = 32;
    public static final int INSTITUTION_SEARCH_PANE_PLACEHOLDER_FIELD_NUMBER = 30;
    public static final int INSTITUTION_SEARCH_PANE_TIMEOUT_MESSAGE_FIELD_NUMBER = 33;
    public static final int INSTITUTION_SELECT_PANE_INSTITUTION_LIST_FIELD_NUMBER = 28;
    public static final int INSTITUTION_SELECT_PANE_SEARCH_BUTTON_FIELD_NUMBER = 27;
    public static final int INSTITUTION_SELECT_PANE_TITLE_FIELD_NUMBER = 26;
    public static final int INSTITUTION_SELECT_PANE_USE_DYNAMIC_INSTITUTION_SELECT_FIELD_NUMBER = 69;
    public static final int LANGUAGE_FIELD_NUMBER = 53;
    public static final int LOADING_PANE_TITLE_FIELD_NUMBER = 34;
    public static final int MFA_PANE_TITLE_FIELD_NUMBER = 41;
    public static final int OAUTH_LANDING_PANE_AFTER_CONTINUE_FIELD_NUMBER = 65;
    public static final int OAUTH_LANDING_PANE_AUTHENTICATE_BANK_FIELD_NUMBER = 64;
    public static final int OAUTH_LANDING_PANE_CONTINUE_TO_INSTITUTION_FIELD_NUMBER = 67;
    public static final int OAUTH_LANDING_PANE_REDIRECTED_BACK_FIELD_NUMBER = 66;
    private static volatile Parser<LinkCustomizations$LinkCustomization> PARSER = null;
    public static final int PRIVACY_INTERSTITIAL_PANE_CO_BRANDED_IS_ENABLED_FIELD_NUMBER = 73;
    public static final int PRIVACY_INTERSTITIAL_PANE_HEADING_ACCOUNT_NAME_FIELD_NUMBER = 74;
    public static final int PRIVACY_INTERSTITIAL_PANE_HEADING_FIELD_NUMBER = 48;
    public static final int PRIVACY_INTERSTITIAL_PANE_SUBMIT_AGREE_FIELD_NUMBER = 50;
    public static final int PRIVACY_INTERSTITIAL_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 49;
    public static final int RECAPTCHA_PANE_MESSAGE_FIELD_NUMBER = 43;
    public static final int RECAPTCHA_PANE_TITLE_FIELD_NUMBER = 42;
    public static final int RECONNECTED_PANE_IS_ENABLED_FIELD_NUMBER = 10;
    public static final int RECONNECTED_PANE_MESSAGE_FIELD_NUMBER = 8;
    public static final int RECONNECTED_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 9;
    public static final int RECONNECTED_PANE_TITLE_FIELD_NUMBER = 7;
    public static final int ROUTING_NUMBER_PANE_MESSAGE_FIELD_NUMBER = 36;
    public static final int ROUTING_NUMBER_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 37;
    public static final int ROUTING_NUMBER_PANE_TITLE_FIELD_NUMBER = 35;
    public static final int START_DATE_DAYS_AGO_FIELD_NUMBER = 52;
    private StringValue accountNumberPaneMessage_;
    private StringValue accountNumberPaneSubmitButton_;
    private StringValue accountNumberPaneTitle_;
    private BoolValue accountSelectPaneIsEnabled_;
    private BoolValue accountSelectPaneIsMultiAccountSelectEnabled_;
    private int accountSelectPaneMode_;
    private StringValue accountSelectPaneSubmitButton_;
    private StringValue accountSelectPaneTitle_;
    private StringValue connectedPaneHeading_;
    private BoolValue connectedPaneIsEnabled_;
    private StringValue connectedPaneMessage_;
    private StringValue connectedPaneSubmitButton_;
    private StringValue connectedPaneTitle_;
    private BoolValue credentialPanePlaidLegalEnabled_;
    private StringValue credentialPaneResetPasswordButton_;
    private StringValue credentialPaneSubmitButton_;
    private StringValue credentialPaneTitle_;
    private StringValue credentialPaneTosContent_;
    private BoolValue credentialPaneTosEnabled_;
    private StringValue errorPaneTitle_;
    private StringValue euConsentPaneCancel_;
    private StringValue euConsentPaneContactDetailsTitle_;
    private StringValue euConsentPaneContinueAgree_;
    private StringValue euConsentPaneContinue_;
    private StringValue euConsentPaneDetailsTitle_;
    private BoolValue euConsentPaneIsEnabled_;
    private StringValue euConsentPaneLinkWithPlaid_;
    private StringValue euConsentPaneSubmitAgree_;
    private StringValue euConsentPaneSubmitButton_;
    private StringValue euConsentPaneTransactionsTitle_;
    private StringValue exitPaneCancelButton_;
    private StringValue exitPaneHeading_;
    private StringValue exitPaneMessage_;
    private StringValue exitPaneSubmitButton_;
    private StringValue exitPaneTitle_;
    private StringValue globalHighlightColor_;
    private StringValue globalOverlayBackgroundColor_;
    private StringValue institutionSearchPaneExitButton_;
    private StringValue institutionSearchPaneInitialMessage_;
    private StringValue institutionSearchPaneNoResultsMessage_;
    private StringValue institutionSearchPanePlaceholder_;
    private StringValue institutionSearchPaneTimeoutMessage_;
    private StringValue institutionSelectPaneSearchButton_;
    private StringValue institutionSelectPaneTitle_;
    private BoolValue institutionSelectPaneUseDynamicInstitutionSelect_;
    private StringValue language_;
    private StringValue loadingPaneTitle_;
    private StringValue mfaPaneTitle_;
    private StringValue oauthLandingPaneAfterContinue_;
    private StringValue oauthLandingPaneAuthenticateBank_;
    private StringValue oauthLandingPaneContinueToInstitution_;
    private StringValue oauthLandingPaneRedirectedBack_;
    private BoolValue privacyInterstitialPaneCoBrandedIsEnabled_;
    private StringValue privacyInterstitialPaneHeadingAccountName_;
    private StringValue privacyInterstitialPaneHeading_;
    private StringValue privacyInterstitialPaneSubmitAgree_;
    private StringValue privacyInterstitialPaneSubmitButton_;
    private StringValue recaptchaPaneMessage_;
    private StringValue recaptchaPaneTitle_;
    private BoolValue reconnectedPaneIsEnabled_;
    private StringValue reconnectedPaneMessage_;
    private StringValue reconnectedPaneSubmitButton_;
    private StringValue reconnectedPaneTitle_;
    private StringValue routingNumberPaneMessage_;
    private StringValue routingNumberPaneSubmitButton_;
    private StringValue routingNumberPaneTitle_;
    private Int32Value startDateDaysAgo_;
    private Internal.ProtobufList<String> countryCodes_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> institutionSelectPaneInstitutionList_ = GeneratedMessageLite.emptyProtobufList();

    /* loaded from: classes2.dex */
    public enum a implements Internal.EnumLite {
        LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_NONE(0),
        LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_SINGLE_SELECT(1),
        LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_MULTI_SELECT(2),
        LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_REQUIRE_ALL_ACCOUNTS(3),
        UNRECOGNIZED(-1);
        
        public static final int LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_MULTI_SELECT_VALUE = 2;
        public static final int LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_NONE_VALUE = 0;
        public static final int LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_REQUIRE_ALL_ACCOUNTS_VALUE = 3;
        public static final int LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_SINGLE_SELECT_VALUE = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final Internal.EnumLiteMap<a> f18280b = new C0330a();

        /* renamed from: a  reason: collision with root package name */
        public final int f18282a;

        /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0330a implements Internal.EnumLiteMap<a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public a findValueByNumber(int i11) {
                return a.forNumber(i11);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a  reason: collision with root package name */
            public static final Internal.EnumVerifier f18283a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i11) {
                return a.forNumber(i11) != null;
            }
        }

        a(int i11) {
            this.f18282a = i11;
        }

        public static a forNumber(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return null;
                        }
                        return LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_REQUIRE_ALL_ACCOUNTS;
                    }
                    return LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_MULTI_SELECT;
                }
                return LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_SINGLE_SELECT;
            }
            return LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_NONE;
        }

        public static Internal.EnumLiteMap<a> internalGetValueMap() {
            return f18280b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f18283a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f18282a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static a valueOf(int i11) {
            return forNumber(i11);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends GeneratedMessageLite.Builder<LinkCustomizations$LinkCustomization, b> implements MessageLiteOrBuilder {
        public b() {
            super(LinkCustomizations$LinkCustomization.DEFAULT_INSTANCE);
        }
    }

    static {
        LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization = new LinkCustomizations$LinkCustomization();
        DEFAULT_INSTANCE = linkCustomizations$LinkCustomization;
        GeneratedMessageLite.registerDefaultInstance(LinkCustomizations$LinkCustomization.class, linkCustomizations$LinkCustomization);
    }

    private LinkCustomizations$LinkCustomization() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCountryCodes(Iterable<String> iterable) {
        ensureCountryCodesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.countryCodes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInstitutionSelectPaneInstitutionList(Iterable<String> iterable) {
        ensureInstitutionSelectPaneInstitutionListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.institutionSelectPaneInstitutionList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCountryCodes(String str) {
        str.getClass();
        ensureCountryCodesIsMutable();
        this.countryCodes_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCountryCodesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureCountryCodesIsMutable();
        this.countryCodes_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInstitutionSelectPaneInstitutionList(String str) {
        str.getClass();
        ensureInstitutionSelectPaneInstitutionListIsMutable();
        this.institutionSelectPaneInstitutionList_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInstitutionSelectPaneInstitutionListBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureInstitutionSelectPaneInstitutionListIsMutable();
        this.institutionSelectPaneInstitutionList_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountNumberPaneMessage() {
        this.accountNumberPaneMessage_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountNumberPaneSubmitButton() {
        this.accountNumberPaneSubmitButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountNumberPaneTitle() {
        this.accountNumberPaneTitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountSelectPaneIsEnabled() {
        this.accountSelectPaneIsEnabled_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountSelectPaneIsMultiAccountSelectEnabled() {
        this.accountSelectPaneIsMultiAccountSelectEnabled_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountSelectPaneMode() {
        this.accountSelectPaneMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountSelectPaneSubmitButton() {
        this.accountSelectPaneSubmitButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountSelectPaneTitle() {
        this.accountSelectPaneTitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectedPaneHeading() {
        this.connectedPaneHeading_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectedPaneIsEnabled() {
        this.connectedPaneIsEnabled_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectedPaneMessage() {
        this.connectedPaneMessage_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectedPaneSubmitButton() {
        this.connectedPaneSubmitButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectedPaneTitle() {
        this.connectedPaneTitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryCodes() {
        this.countryCodes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCredentialPanePlaidLegalEnabled() {
        this.credentialPanePlaidLegalEnabled_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCredentialPaneResetPasswordButton() {
        this.credentialPaneResetPasswordButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCredentialPaneSubmitButton() {
        this.credentialPaneSubmitButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCredentialPaneTitle() {
        this.credentialPaneTitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCredentialPaneTosContent() {
        this.credentialPaneTosContent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCredentialPaneTosEnabled() {
        this.credentialPaneTosEnabled_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorPaneTitle() {
        this.errorPaneTitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEuConsentPaneCancel() {
        this.euConsentPaneCancel_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEuConsentPaneContactDetailsTitle() {
        this.euConsentPaneContactDetailsTitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEuConsentPaneContinue() {
        this.euConsentPaneContinue_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEuConsentPaneContinueAgree() {
        this.euConsentPaneContinueAgree_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEuConsentPaneDetailsTitle() {
        this.euConsentPaneDetailsTitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEuConsentPaneIsEnabled() {
        this.euConsentPaneIsEnabled_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEuConsentPaneLinkWithPlaid() {
        this.euConsentPaneLinkWithPlaid_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEuConsentPaneSubmitAgree() {
        this.euConsentPaneSubmitAgree_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEuConsentPaneSubmitButton() {
        this.euConsentPaneSubmitButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEuConsentPaneTransactionsTitle() {
        this.euConsentPaneTransactionsTitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExitPaneCancelButton() {
        this.exitPaneCancelButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExitPaneHeading() {
        this.exitPaneHeading_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExitPaneMessage() {
        this.exitPaneMessage_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExitPaneSubmitButton() {
        this.exitPaneSubmitButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExitPaneTitle() {
        this.exitPaneTitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGlobalHighlightColor() {
        this.globalHighlightColor_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGlobalOverlayBackgroundColor() {
        this.globalOverlayBackgroundColor_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionSearchPaneExitButton() {
        this.institutionSearchPaneExitButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionSearchPaneInitialMessage() {
        this.institutionSearchPaneInitialMessage_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionSearchPaneNoResultsMessage() {
        this.institutionSearchPaneNoResultsMessage_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionSearchPanePlaceholder() {
        this.institutionSearchPanePlaceholder_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionSearchPaneTimeoutMessage() {
        this.institutionSearchPaneTimeoutMessage_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionSelectPaneInstitutionList() {
        this.institutionSelectPaneInstitutionList_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionSelectPaneSearchButton() {
        this.institutionSelectPaneSearchButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionSelectPaneTitle() {
        this.institutionSelectPaneTitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionSelectPaneUseDynamicInstitutionSelect() {
        this.institutionSelectPaneUseDynamicInstitutionSelect_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.language_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoadingPaneTitle() {
        this.loadingPaneTitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMfaPaneTitle() {
        this.mfaPaneTitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOauthLandingPaneAfterContinue() {
        this.oauthLandingPaneAfterContinue_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOauthLandingPaneAuthenticateBank() {
        this.oauthLandingPaneAuthenticateBank_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOauthLandingPaneContinueToInstitution() {
        this.oauthLandingPaneContinueToInstitution_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOauthLandingPaneRedirectedBack() {
        this.oauthLandingPaneRedirectedBack_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrivacyInterstitialPaneCoBrandedIsEnabled() {
        this.privacyInterstitialPaneCoBrandedIsEnabled_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrivacyInterstitialPaneHeading() {
        this.privacyInterstitialPaneHeading_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrivacyInterstitialPaneHeadingAccountName() {
        this.privacyInterstitialPaneHeadingAccountName_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrivacyInterstitialPaneSubmitAgree() {
        this.privacyInterstitialPaneSubmitAgree_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrivacyInterstitialPaneSubmitButton() {
        this.privacyInterstitialPaneSubmitButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecaptchaPaneMessage() {
        this.recaptchaPaneMessage_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecaptchaPaneTitle() {
        this.recaptchaPaneTitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReconnectedPaneIsEnabled() {
        this.reconnectedPaneIsEnabled_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReconnectedPaneMessage() {
        this.reconnectedPaneMessage_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReconnectedPaneSubmitButton() {
        this.reconnectedPaneSubmitButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReconnectedPaneTitle() {
        this.reconnectedPaneTitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingNumberPaneMessage() {
        this.routingNumberPaneMessage_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingNumberPaneSubmitButton() {
        this.routingNumberPaneSubmitButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingNumberPaneTitle() {
        this.routingNumberPaneTitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartDateDaysAgo() {
        this.startDateDaysAgo_ = null;
    }

    private void ensureCountryCodesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.countryCodes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.countryCodes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureInstitutionSelectPaneInstitutionListIsMutable() {
        Internal.ProtobufList<String> protobufList = this.institutionSelectPaneInstitutionList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.institutionSelectPaneInstitutionList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static LinkCustomizations$LinkCustomization getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeAccountNumberPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.accountNumberPaneMessage_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.accountNumberPaneMessage_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.accountNumberPaneMessage_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.accountNumberPaneMessage_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeAccountNumberPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.accountNumberPaneSubmitButton_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.accountNumberPaneSubmitButton_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.accountNumberPaneSubmitButton_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.accountNumberPaneSubmitButton_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeAccountNumberPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.accountNumberPaneTitle_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.accountNumberPaneTitle_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.accountNumberPaneTitle_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.accountNumberPaneTitle_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeAccountSelectPaneIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.accountSelectPaneIsEnabled_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.accountSelectPaneIsEnabled_ = (BoolValue) ((BoolValue.Builder) BoolValue.newBuilder(this.accountSelectPaneIsEnabled_).mergeFrom((GeneratedMessageLite) boolValue)).buildPartial();
        } else {
            this.accountSelectPaneIsEnabled_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeAccountSelectPaneIsMultiAccountSelectEnabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.accountSelectPaneIsMultiAccountSelectEnabled_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.accountSelectPaneIsMultiAccountSelectEnabled_ = (BoolValue) ((BoolValue.Builder) BoolValue.newBuilder(this.accountSelectPaneIsMultiAccountSelectEnabled_).mergeFrom((GeneratedMessageLite) boolValue)).buildPartial();
        } else {
            this.accountSelectPaneIsMultiAccountSelectEnabled_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeAccountSelectPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.accountSelectPaneSubmitButton_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.accountSelectPaneSubmitButton_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.accountSelectPaneSubmitButton_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.accountSelectPaneSubmitButton_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeAccountSelectPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.accountSelectPaneTitle_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.accountSelectPaneTitle_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.accountSelectPaneTitle_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.accountSelectPaneTitle_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeConnectedPaneHeading(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.connectedPaneHeading_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.connectedPaneHeading_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.connectedPaneHeading_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.connectedPaneHeading_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeConnectedPaneIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.connectedPaneIsEnabled_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.connectedPaneIsEnabled_ = (BoolValue) ((BoolValue.Builder) BoolValue.newBuilder(this.connectedPaneIsEnabled_).mergeFrom((GeneratedMessageLite) boolValue)).buildPartial();
        } else {
            this.connectedPaneIsEnabled_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeConnectedPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.connectedPaneMessage_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.connectedPaneMessage_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.connectedPaneMessage_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.connectedPaneMessage_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeConnectedPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.connectedPaneSubmitButton_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.connectedPaneSubmitButton_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.connectedPaneSubmitButton_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.connectedPaneSubmitButton_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeConnectedPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.connectedPaneTitle_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.connectedPaneTitle_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.connectedPaneTitle_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.connectedPaneTitle_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeCredentialPanePlaidLegalEnabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.credentialPanePlaidLegalEnabled_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.credentialPanePlaidLegalEnabled_ = (BoolValue) ((BoolValue.Builder) BoolValue.newBuilder(this.credentialPanePlaidLegalEnabled_).mergeFrom((GeneratedMessageLite) boolValue)).buildPartial();
        } else {
            this.credentialPanePlaidLegalEnabled_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeCredentialPaneResetPasswordButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.credentialPaneResetPasswordButton_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.credentialPaneResetPasswordButton_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.credentialPaneResetPasswordButton_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.credentialPaneResetPasswordButton_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeCredentialPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.credentialPaneSubmitButton_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.credentialPaneSubmitButton_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.credentialPaneSubmitButton_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.credentialPaneSubmitButton_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeCredentialPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.credentialPaneTitle_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.credentialPaneTitle_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.credentialPaneTitle_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.credentialPaneTitle_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeCredentialPaneTosContent(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.credentialPaneTosContent_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.credentialPaneTosContent_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.credentialPaneTosContent_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.credentialPaneTosContent_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeCredentialPaneTosEnabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.credentialPaneTosEnabled_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.credentialPaneTosEnabled_ = (BoolValue) ((BoolValue.Builder) BoolValue.newBuilder(this.credentialPaneTosEnabled_).mergeFrom((GeneratedMessageLite) boolValue)).buildPartial();
        } else {
            this.credentialPaneTosEnabled_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeErrorPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.errorPaneTitle_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.errorPaneTitle_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.errorPaneTitle_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.errorPaneTitle_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeEuConsentPaneCancel(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneCancel_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.euConsentPaneCancel_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.euConsentPaneCancel_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.euConsentPaneCancel_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeEuConsentPaneContactDetailsTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneContactDetailsTitle_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.euConsentPaneContactDetailsTitle_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.euConsentPaneContactDetailsTitle_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.euConsentPaneContactDetailsTitle_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeEuConsentPaneContinue(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneContinue_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.euConsentPaneContinue_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.euConsentPaneContinue_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.euConsentPaneContinue_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeEuConsentPaneContinueAgree(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneContinueAgree_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.euConsentPaneContinueAgree_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.euConsentPaneContinueAgree_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.euConsentPaneContinueAgree_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeEuConsentPaneDetailsTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneDetailsTitle_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.euConsentPaneDetailsTitle_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.euConsentPaneDetailsTitle_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.euConsentPaneDetailsTitle_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeEuConsentPaneIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.euConsentPaneIsEnabled_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.euConsentPaneIsEnabled_ = (BoolValue) ((BoolValue.Builder) BoolValue.newBuilder(this.euConsentPaneIsEnabled_).mergeFrom((GeneratedMessageLite) boolValue)).buildPartial();
        } else {
            this.euConsentPaneIsEnabled_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeEuConsentPaneLinkWithPlaid(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneLinkWithPlaid_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.euConsentPaneLinkWithPlaid_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.euConsentPaneLinkWithPlaid_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.euConsentPaneLinkWithPlaid_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeEuConsentPaneSubmitAgree(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneSubmitAgree_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.euConsentPaneSubmitAgree_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.euConsentPaneSubmitAgree_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.euConsentPaneSubmitAgree_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeEuConsentPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneSubmitButton_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.euConsentPaneSubmitButton_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.euConsentPaneSubmitButton_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.euConsentPaneSubmitButton_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeEuConsentPaneTransactionsTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.euConsentPaneTransactionsTitle_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.euConsentPaneTransactionsTitle_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.euConsentPaneTransactionsTitle_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.euConsentPaneTransactionsTitle_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeExitPaneCancelButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.exitPaneCancelButton_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.exitPaneCancelButton_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.exitPaneCancelButton_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.exitPaneCancelButton_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeExitPaneHeading(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.exitPaneHeading_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.exitPaneHeading_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.exitPaneHeading_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.exitPaneHeading_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeExitPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.exitPaneMessage_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.exitPaneMessage_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.exitPaneMessage_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.exitPaneMessage_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeExitPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.exitPaneSubmitButton_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.exitPaneSubmitButton_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.exitPaneSubmitButton_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.exitPaneSubmitButton_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeExitPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.exitPaneTitle_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.exitPaneTitle_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.exitPaneTitle_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.exitPaneTitle_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeGlobalHighlightColor(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.globalHighlightColor_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.globalHighlightColor_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.globalHighlightColor_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.globalHighlightColor_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeGlobalOverlayBackgroundColor(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.globalOverlayBackgroundColor_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.globalOverlayBackgroundColor_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.globalOverlayBackgroundColor_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.globalOverlayBackgroundColor_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeInstitutionSearchPaneExitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.institutionSearchPaneExitButton_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.institutionSearchPaneExitButton_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.institutionSearchPaneExitButton_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.institutionSearchPaneExitButton_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeInstitutionSearchPaneInitialMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.institutionSearchPaneInitialMessage_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.institutionSearchPaneInitialMessage_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.institutionSearchPaneInitialMessage_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.institutionSearchPaneInitialMessage_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeInstitutionSearchPaneNoResultsMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.institutionSearchPaneNoResultsMessage_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.institutionSearchPaneNoResultsMessage_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.institutionSearchPaneNoResultsMessage_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.institutionSearchPaneNoResultsMessage_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeInstitutionSearchPanePlaceholder(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.institutionSearchPanePlaceholder_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.institutionSearchPanePlaceholder_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.institutionSearchPanePlaceholder_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.institutionSearchPanePlaceholder_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeInstitutionSearchPaneTimeoutMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.institutionSearchPaneTimeoutMessage_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.institutionSearchPaneTimeoutMessage_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.institutionSearchPaneTimeoutMessage_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.institutionSearchPaneTimeoutMessage_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeInstitutionSelectPaneSearchButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.institutionSelectPaneSearchButton_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.institutionSelectPaneSearchButton_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.institutionSelectPaneSearchButton_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.institutionSelectPaneSearchButton_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeInstitutionSelectPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.institutionSelectPaneTitle_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.institutionSelectPaneTitle_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.institutionSelectPaneTitle_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.institutionSelectPaneTitle_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeInstitutionSelectPaneUseDynamicInstitutionSelect(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.institutionSelectPaneUseDynamicInstitutionSelect_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.institutionSelectPaneUseDynamicInstitutionSelect_ = (BoolValue) ((BoolValue.Builder) BoolValue.newBuilder(this.institutionSelectPaneUseDynamicInstitutionSelect_).mergeFrom((GeneratedMessageLite) boolValue)).buildPartial();
        } else {
            this.institutionSelectPaneUseDynamicInstitutionSelect_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeLanguage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.language_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.language_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.language_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.language_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeLoadingPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.loadingPaneTitle_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.loadingPaneTitle_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.loadingPaneTitle_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.loadingPaneTitle_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeMfaPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.mfaPaneTitle_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.mfaPaneTitle_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.mfaPaneTitle_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.mfaPaneTitle_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeOauthLandingPaneAfterContinue(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.oauthLandingPaneAfterContinue_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.oauthLandingPaneAfterContinue_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.oauthLandingPaneAfterContinue_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.oauthLandingPaneAfterContinue_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeOauthLandingPaneAuthenticateBank(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.oauthLandingPaneAuthenticateBank_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.oauthLandingPaneAuthenticateBank_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.oauthLandingPaneAuthenticateBank_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.oauthLandingPaneAuthenticateBank_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeOauthLandingPaneContinueToInstitution(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.oauthLandingPaneContinueToInstitution_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.oauthLandingPaneContinueToInstitution_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.oauthLandingPaneContinueToInstitution_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.oauthLandingPaneContinueToInstitution_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeOauthLandingPaneRedirectedBack(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.oauthLandingPaneRedirectedBack_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.oauthLandingPaneRedirectedBack_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.oauthLandingPaneRedirectedBack_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.oauthLandingPaneRedirectedBack_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergePrivacyInterstitialPaneCoBrandedIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.privacyInterstitialPaneCoBrandedIsEnabled_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.privacyInterstitialPaneCoBrandedIsEnabled_ = (BoolValue) ((BoolValue.Builder) BoolValue.newBuilder(this.privacyInterstitialPaneCoBrandedIsEnabled_).mergeFrom((GeneratedMessageLite) boolValue)).buildPartial();
        } else {
            this.privacyInterstitialPaneCoBrandedIsEnabled_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergePrivacyInterstitialPaneHeading(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.privacyInterstitialPaneHeading_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.privacyInterstitialPaneHeading_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.privacyInterstitialPaneHeading_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.privacyInterstitialPaneHeading_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergePrivacyInterstitialPaneHeadingAccountName(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.privacyInterstitialPaneHeadingAccountName_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.privacyInterstitialPaneHeadingAccountName_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.privacyInterstitialPaneHeadingAccountName_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.privacyInterstitialPaneHeadingAccountName_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergePrivacyInterstitialPaneSubmitAgree(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.privacyInterstitialPaneSubmitAgree_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.privacyInterstitialPaneSubmitAgree_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.privacyInterstitialPaneSubmitAgree_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.privacyInterstitialPaneSubmitAgree_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergePrivacyInterstitialPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.privacyInterstitialPaneSubmitButton_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.privacyInterstitialPaneSubmitButton_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.privacyInterstitialPaneSubmitButton_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.privacyInterstitialPaneSubmitButton_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeRecaptchaPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.recaptchaPaneMessage_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.recaptchaPaneMessage_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.recaptchaPaneMessage_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.recaptchaPaneMessage_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeRecaptchaPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.recaptchaPaneTitle_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.recaptchaPaneTitle_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.recaptchaPaneTitle_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.recaptchaPaneTitle_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeReconnectedPaneIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.reconnectedPaneIsEnabled_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.reconnectedPaneIsEnabled_ = (BoolValue) ((BoolValue.Builder) BoolValue.newBuilder(this.reconnectedPaneIsEnabled_).mergeFrom((GeneratedMessageLite) boolValue)).buildPartial();
        } else {
            this.reconnectedPaneIsEnabled_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeReconnectedPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.reconnectedPaneMessage_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.reconnectedPaneMessage_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.reconnectedPaneMessage_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.reconnectedPaneMessage_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeReconnectedPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.reconnectedPaneSubmitButton_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.reconnectedPaneSubmitButton_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.reconnectedPaneSubmitButton_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.reconnectedPaneSubmitButton_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeReconnectedPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.reconnectedPaneTitle_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.reconnectedPaneTitle_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.reconnectedPaneTitle_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.reconnectedPaneTitle_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeRoutingNumberPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.routingNumberPaneMessage_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.routingNumberPaneMessage_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.routingNumberPaneMessage_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.routingNumberPaneMessage_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeRoutingNumberPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.routingNumberPaneSubmitButton_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.routingNumberPaneSubmitButton_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.routingNumberPaneSubmitButton_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.routingNumberPaneSubmitButton_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeRoutingNumberPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.routingNumberPaneTitle_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.routingNumberPaneTitle_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.routingNumberPaneTitle_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
        } else {
            this.routingNumberPaneTitle_ = stringValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeStartDateDaysAgo(Int32Value int32Value) {
        int32Value.getClass();
        Int32Value int32Value2 = this.startDateDaysAgo_;
        if (int32Value2 != null && int32Value2 != Int32Value.getDefaultInstance()) {
            this.startDateDaysAgo_ = (Int32Value) ((Int32Value.Builder) Int32Value.newBuilder(this.startDateDaysAgo_).mergeFrom((GeneratedMessageLite) int32Value)).buildPartial();
        } else {
            this.startDateDaysAgo_ = int32Value;
        }
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LinkCustomizations$LinkCustomization parseDelimitedFrom(InputStream inputStream) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(ByteBuffer byteBuffer) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LinkCustomizations$LinkCustomization> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountNumberPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        this.accountNumberPaneMessage_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountNumberPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.accountNumberPaneSubmitButton_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountNumberPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.accountNumberPaneTitle_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountSelectPaneIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        this.accountSelectPaneIsEnabled_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountSelectPaneIsMultiAccountSelectEnabled(BoolValue boolValue) {
        boolValue.getClass();
        this.accountSelectPaneIsMultiAccountSelectEnabled_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountSelectPaneMode(a aVar) {
        this.accountSelectPaneMode_ = aVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountSelectPaneModeValue(int i11) {
        this.accountSelectPaneMode_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountSelectPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.accountSelectPaneSubmitButton_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountSelectPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.accountSelectPaneTitle_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectedPaneHeading(StringValue stringValue) {
        stringValue.getClass();
        this.connectedPaneHeading_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectedPaneIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        this.connectedPaneIsEnabled_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectedPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        this.connectedPaneMessage_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectedPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.connectedPaneSubmitButton_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectedPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.connectedPaneTitle_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCodes(int i11, String str) {
        str.getClass();
        ensureCountryCodesIsMutable();
        this.countryCodes_.set(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCredentialPanePlaidLegalEnabled(BoolValue boolValue) {
        boolValue.getClass();
        this.credentialPanePlaidLegalEnabled_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCredentialPaneResetPasswordButton(StringValue stringValue) {
        stringValue.getClass();
        this.credentialPaneResetPasswordButton_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCredentialPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.credentialPaneSubmitButton_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCredentialPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.credentialPaneTitle_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCredentialPaneTosContent(StringValue stringValue) {
        stringValue.getClass();
        this.credentialPaneTosContent_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCredentialPaneTosEnabled(BoolValue boolValue) {
        boolValue.getClass();
        this.credentialPaneTosEnabled_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.errorPaneTitle_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEuConsentPaneCancel(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneCancel_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEuConsentPaneContactDetailsTitle(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneContactDetailsTitle_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEuConsentPaneContinue(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneContinue_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEuConsentPaneContinueAgree(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneContinueAgree_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEuConsentPaneDetailsTitle(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneDetailsTitle_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEuConsentPaneIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        this.euConsentPaneIsEnabled_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEuConsentPaneLinkWithPlaid(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneLinkWithPlaid_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEuConsentPaneSubmitAgree(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneSubmitAgree_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEuConsentPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneSubmitButton_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEuConsentPaneTransactionsTitle(StringValue stringValue) {
        stringValue.getClass();
        this.euConsentPaneTransactionsTitle_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExitPaneCancelButton(StringValue stringValue) {
        stringValue.getClass();
        this.exitPaneCancelButton_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExitPaneHeading(StringValue stringValue) {
        stringValue.getClass();
        this.exitPaneHeading_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExitPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        this.exitPaneMessage_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExitPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.exitPaneSubmitButton_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExitPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.exitPaneTitle_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGlobalHighlightColor(StringValue stringValue) {
        stringValue.getClass();
        this.globalHighlightColor_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGlobalOverlayBackgroundColor(StringValue stringValue) {
        stringValue.getClass();
        this.globalOverlayBackgroundColor_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionSearchPaneExitButton(StringValue stringValue) {
        stringValue.getClass();
        this.institutionSearchPaneExitButton_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionSearchPaneInitialMessage(StringValue stringValue) {
        stringValue.getClass();
        this.institutionSearchPaneInitialMessage_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionSearchPaneNoResultsMessage(StringValue stringValue) {
        stringValue.getClass();
        this.institutionSearchPaneNoResultsMessage_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionSearchPanePlaceholder(StringValue stringValue) {
        stringValue.getClass();
        this.institutionSearchPanePlaceholder_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionSearchPaneTimeoutMessage(StringValue stringValue) {
        stringValue.getClass();
        this.institutionSearchPaneTimeoutMessage_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionSelectPaneInstitutionList(int i11, String str) {
        str.getClass();
        ensureInstitutionSelectPaneInstitutionListIsMutable();
        this.institutionSelectPaneInstitutionList_.set(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionSelectPaneSearchButton(StringValue stringValue) {
        stringValue.getClass();
        this.institutionSelectPaneSearchButton_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionSelectPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.institutionSelectPaneTitle_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionSelectPaneUseDynamicInstitutionSelect(BoolValue boolValue) {
        boolValue.getClass();
        this.institutionSelectPaneUseDynamicInstitutionSelect_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(StringValue stringValue) {
        stringValue.getClass();
        this.language_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadingPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.loadingPaneTitle_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMfaPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.mfaPaneTitle_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthLandingPaneAfterContinue(StringValue stringValue) {
        stringValue.getClass();
        this.oauthLandingPaneAfterContinue_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthLandingPaneAuthenticateBank(StringValue stringValue) {
        stringValue.getClass();
        this.oauthLandingPaneAuthenticateBank_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthLandingPaneContinueToInstitution(StringValue stringValue) {
        stringValue.getClass();
        this.oauthLandingPaneContinueToInstitution_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthLandingPaneRedirectedBack(StringValue stringValue) {
        stringValue.getClass();
        this.oauthLandingPaneRedirectedBack_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrivacyInterstitialPaneCoBrandedIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        this.privacyInterstitialPaneCoBrandedIsEnabled_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrivacyInterstitialPaneHeading(StringValue stringValue) {
        stringValue.getClass();
        this.privacyInterstitialPaneHeading_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrivacyInterstitialPaneHeadingAccountName(StringValue stringValue) {
        stringValue.getClass();
        this.privacyInterstitialPaneHeadingAccountName_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrivacyInterstitialPaneSubmitAgree(StringValue stringValue) {
        stringValue.getClass();
        this.privacyInterstitialPaneSubmitAgree_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrivacyInterstitialPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.privacyInterstitialPaneSubmitButton_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecaptchaPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        this.recaptchaPaneMessage_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecaptchaPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.recaptchaPaneTitle_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReconnectedPaneIsEnabled(BoolValue boolValue) {
        boolValue.getClass();
        this.reconnectedPaneIsEnabled_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReconnectedPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        this.reconnectedPaneMessage_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReconnectedPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.reconnectedPaneSubmitButton_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReconnectedPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.reconnectedPaneTitle_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingNumberPaneMessage(StringValue stringValue) {
        stringValue.getClass();
        this.routingNumberPaneMessage_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingNumberPaneSubmitButton(StringValue stringValue) {
        stringValue.getClass();
        this.routingNumberPaneSubmitButton_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingNumberPaneTitle(StringValue stringValue) {
        stringValue.getClass();
        this.routingNumberPaneTitle_ = stringValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartDateDaysAgo(Int32Value int32Value) {
        int32Value.getClass();
        this.startDateDaysAgo_ = int32Value;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (q5.f19311a[methodToInvoke.ordinal()]) {
            case 1:
                return new LinkCustomizations$LinkCustomization();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000E\u0000\u0000\u0001KE\u0000\u0002\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\t\u000f\t\u0010\t\u0011\t\u0012\t\u0013\t\u0014\t\u0015\t\u0016\t\u0017\t\u0018\t\u0019\t\u001a\t\u001b\t\u001cȚ\u001d\t\u001e\t\u001f\t \t!\t\"\t#\t$\t%\t&\t'\t(\t)\t*\t+\t,\t-\t.\t/\t0\t1\t2\t4\t5\t7\t8Ț9\t:\t;\t<\t=\t>\t?\t@\tA\tB\tC\tE\tI\tJ\tK\f", new Object[]{"globalHighlightColor_", "globalOverlayBackgroundColor_", "connectedPaneTitle_", "connectedPaneMessage_", "connectedPaneSubmitButton_", "connectedPaneIsEnabled_", "reconnectedPaneTitle_", "reconnectedPaneMessage_", "reconnectedPaneSubmitButton_", "reconnectedPaneIsEnabled_", "credentialPaneTitle_", "credentialPaneSubmitButton_", "credentialPaneResetPasswordButton_", "credentialPanePlaidLegalEnabled_", "credentialPaneTosContent_", "credentialPaneTosEnabled_", "euConsentPaneIsEnabled_", "euConsentPaneSubmitButton_", "euConsentPaneSubmitAgree_", "errorPaneTitle_", "exitPaneTitle_", "exitPaneHeading_", "exitPaneMessage_", "exitPaneSubmitButton_", "exitPaneCancelButton_", "institutionSelectPaneTitle_", "institutionSelectPaneSearchButton_", "institutionSelectPaneInstitutionList_", "institutionSearchPaneExitButton_", "institutionSearchPanePlaceholder_", "institutionSearchPaneInitialMessage_", "institutionSearchPaneNoResultsMessage_", "institutionSearchPaneTimeoutMessage_", "loadingPaneTitle_", "routingNumberPaneTitle_", "routingNumberPaneMessage_", "routingNumberPaneSubmitButton_", "accountNumberPaneTitle_", "accountNumberPaneMessage_", "accountNumberPaneSubmitButton_", "mfaPaneTitle_", "recaptchaPaneTitle_", "recaptchaPaneMessage_", "accountSelectPaneTitle_", "accountSelectPaneSubmitButton_", "accountSelectPaneIsEnabled_", "accountSelectPaneIsMultiAccountSelectEnabled_", "privacyInterstitialPaneHeading_", "privacyInterstitialPaneSubmitButton_", "privacyInterstitialPaneSubmitAgree_", "startDateDaysAgo_", "language_", "connectedPaneHeading_", "countryCodes_", "euConsentPaneContactDetailsTitle_", "euConsentPaneLinkWithPlaid_", "euConsentPaneTransactionsTitle_", "euConsentPaneDetailsTitle_", "euConsentPaneContinueAgree_", "euConsentPaneContinue_", "euConsentPaneCancel_", "oauthLandingPaneAuthenticateBank_", "oauthLandingPaneAfterContinue_", "oauthLandingPaneRedirectedBack_", "oauthLandingPaneContinueToInstitution_", "institutionSelectPaneUseDynamicInstitutionSelect_", "privacyInterstitialPaneCoBrandedIsEnabled_", "privacyInterstitialPaneHeadingAccountName_", "accountSelectPaneMode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LinkCustomizations$LinkCustomization> parser = PARSER;
                if (parser == null) {
                    synchronized (LinkCustomizations$LinkCustomization.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public StringValue getAccountNumberPaneMessage() {
        StringValue stringValue = this.accountNumberPaneMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getAccountNumberPaneSubmitButton() {
        StringValue stringValue = this.accountNumberPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getAccountNumberPaneTitle() {
        StringValue stringValue = this.accountNumberPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public BoolValue getAccountSelectPaneIsEnabled() {
        BoolValue boolValue = this.accountSelectPaneIsEnabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getAccountSelectPaneIsMultiAccountSelectEnabled() {
        BoolValue boolValue = this.accountSelectPaneIsMultiAccountSelectEnabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public a getAccountSelectPaneMode() {
        a forNumber = a.forNumber(this.accountSelectPaneMode_);
        return forNumber == null ? a.UNRECOGNIZED : forNumber;
    }

    public int getAccountSelectPaneModeValue() {
        return this.accountSelectPaneMode_;
    }

    public StringValue getAccountSelectPaneSubmitButton() {
        StringValue stringValue = this.accountSelectPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getAccountSelectPaneTitle() {
        StringValue stringValue = this.accountSelectPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getConnectedPaneHeading() {
        StringValue stringValue = this.connectedPaneHeading_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public BoolValue getConnectedPaneIsEnabled() {
        BoolValue boolValue = this.connectedPaneIsEnabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public StringValue getConnectedPaneMessage() {
        StringValue stringValue = this.connectedPaneMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getConnectedPaneSubmitButton() {
        StringValue stringValue = this.connectedPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getConnectedPaneTitle() {
        StringValue stringValue = this.connectedPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public String getCountryCodes(int i11) {
        return this.countryCodes_.get(i11);
    }

    public ByteString getCountryCodesBytes(int i11) {
        return ByteString.copyFromUtf8(this.countryCodes_.get(i11));
    }

    public int getCountryCodesCount() {
        return this.countryCodes_.size();
    }

    public List<String> getCountryCodesList() {
        return this.countryCodes_;
    }

    public BoolValue getCredentialPanePlaidLegalEnabled() {
        BoolValue boolValue = this.credentialPanePlaidLegalEnabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public StringValue getCredentialPaneResetPasswordButton() {
        StringValue stringValue = this.credentialPaneResetPasswordButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getCredentialPaneSubmitButton() {
        StringValue stringValue = this.credentialPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getCredentialPaneTitle() {
        StringValue stringValue = this.credentialPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getCredentialPaneTosContent() {
        StringValue stringValue = this.credentialPaneTosContent_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public BoolValue getCredentialPaneTosEnabled() {
        BoolValue boolValue = this.credentialPaneTosEnabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public StringValue getErrorPaneTitle() {
        StringValue stringValue = this.errorPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getEuConsentPaneCancel() {
        StringValue stringValue = this.euConsentPaneCancel_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getEuConsentPaneContactDetailsTitle() {
        StringValue stringValue = this.euConsentPaneContactDetailsTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getEuConsentPaneContinue() {
        StringValue stringValue = this.euConsentPaneContinue_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getEuConsentPaneContinueAgree() {
        StringValue stringValue = this.euConsentPaneContinueAgree_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getEuConsentPaneDetailsTitle() {
        StringValue stringValue = this.euConsentPaneDetailsTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public BoolValue getEuConsentPaneIsEnabled() {
        BoolValue boolValue = this.euConsentPaneIsEnabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public StringValue getEuConsentPaneLinkWithPlaid() {
        StringValue stringValue = this.euConsentPaneLinkWithPlaid_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getEuConsentPaneSubmitAgree() {
        StringValue stringValue = this.euConsentPaneSubmitAgree_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getEuConsentPaneSubmitButton() {
        StringValue stringValue = this.euConsentPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getEuConsentPaneTransactionsTitle() {
        StringValue stringValue = this.euConsentPaneTransactionsTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getExitPaneCancelButton() {
        StringValue stringValue = this.exitPaneCancelButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getExitPaneHeading() {
        StringValue stringValue = this.exitPaneHeading_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getExitPaneMessage() {
        StringValue stringValue = this.exitPaneMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getExitPaneSubmitButton() {
        StringValue stringValue = this.exitPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getExitPaneTitle() {
        StringValue stringValue = this.exitPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getGlobalHighlightColor() {
        StringValue stringValue = this.globalHighlightColor_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getGlobalOverlayBackgroundColor() {
        StringValue stringValue = this.globalOverlayBackgroundColor_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getInstitutionSearchPaneExitButton() {
        StringValue stringValue = this.institutionSearchPaneExitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getInstitutionSearchPaneInitialMessage() {
        StringValue stringValue = this.institutionSearchPaneInitialMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getInstitutionSearchPaneNoResultsMessage() {
        StringValue stringValue = this.institutionSearchPaneNoResultsMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getInstitutionSearchPanePlaceholder() {
        StringValue stringValue = this.institutionSearchPanePlaceholder_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getInstitutionSearchPaneTimeoutMessage() {
        StringValue stringValue = this.institutionSearchPaneTimeoutMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public String getInstitutionSelectPaneInstitutionList(int i11) {
        return this.institutionSelectPaneInstitutionList_.get(i11);
    }

    public ByteString getInstitutionSelectPaneInstitutionListBytes(int i11) {
        return ByteString.copyFromUtf8(this.institutionSelectPaneInstitutionList_.get(i11));
    }

    public int getInstitutionSelectPaneInstitutionListCount() {
        return this.institutionSelectPaneInstitutionList_.size();
    }

    public List<String> getInstitutionSelectPaneInstitutionListList() {
        return this.institutionSelectPaneInstitutionList_;
    }

    public StringValue getInstitutionSelectPaneSearchButton() {
        StringValue stringValue = this.institutionSelectPaneSearchButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getInstitutionSelectPaneTitle() {
        StringValue stringValue = this.institutionSelectPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public BoolValue getInstitutionSelectPaneUseDynamicInstitutionSelect() {
        BoolValue boolValue = this.institutionSelectPaneUseDynamicInstitutionSelect_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public StringValue getLanguage() {
        StringValue stringValue = this.language_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getLoadingPaneTitle() {
        StringValue stringValue = this.loadingPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getMfaPaneTitle() {
        StringValue stringValue = this.mfaPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getOauthLandingPaneAfterContinue() {
        StringValue stringValue = this.oauthLandingPaneAfterContinue_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getOauthLandingPaneAuthenticateBank() {
        StringValue stringValue = this.oauthLandingPaneAuthenticateBank_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getOauthLandingPaneContinueToInstitution() {
        StringValue stringValue = this.oauthLandingPaneContinueToInstitution_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getOauthLandingPaneRedirectedBack() {
        StringValue stringValue = this.oauthLandingPaneRedirectedBack_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public BoolValue getPrivacyInterstitialPaneCoBrandedIsEnabled() {
        BoolValue boolValue = this.privacyInterstitialPaneCoBrandedIsEnabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public StringValue getPrivacyInterstitialPaneHeading() {
        StringValue stringValue = this.privacyInterstitialPaneHeading_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getPrivacyInterstitialPaneHeadingAccountName() {
        StringValue stringValue = this.privacyInterstitialPaneHeadingAccountName_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getPrivacyInterstitialPaneSubmitAgree() {
        StringValue stringValue = this.privacyInterstitialPaneSubmitAgree_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getPrivacyInterstitialPaneSubmitButton() {
        StringValue stringValue = this.privacyInterstitialPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getRecaptchaPaneMessage() {
        StringValue stringValue = this.recaptchaPaneMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getRecaptchaPaneTitle() {
        StringValue stringValue = this.recaptchaPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public BoolValue getReconnectedPaneIsEnabled() {
        BoolValue boolValue = this.reconnectedPaneIsEnabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public StringValue getReconnectedPaneMessage() {
        StringValue stringValue = this.reconnectedPaneMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getReconnectedPaneSubmitButton() {
        StringValue stringValue = this.reconnectedPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getReconnectedPaneTitle() {
        StringValue stringValue = this.reconnectedPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getRoutingNumberPaneMessage() {
        StringValue stringValue = this.routingNumberPaneMessage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getRoutingNumberPaneSubmitButton() {
        StringValue stringValue = this.routingNumberPaneSubmitButton_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getRoutingNumberPaneTitle() {
        StringValue stringValue = this.routingNumberPaneTitle_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public Int32Value getStartDateDaysAgo() {
        Int32Value int32Value = this.startDateDaysAgo_;
        return int32Value == null ? Int32Value.getDefaultInstance() : int32Value;
    }

    public boolean hasAccountNumberPaneMessage() {
        return this.accountNumberPaneMessage_ != null;
    }

    public boolean hasAccountNumberPaneSubmitButton() {
        return this.accountNumberPaneSubmitButton_ != null;
    }

    public boolean hasAccountNumberPaneTitle() {
        return this.accountNumberPaneTitle_ != null;
    }

    public boolean hasAccountSelectPaneIsEnabled() {
        return this.accountSelectPaneIsEnabled_ != null;
    }

    public boolean hasAccountSelectPaneIsMultiAccountSelectEnabled() {
        return this.accountSelectPaneIsMultiAccountSelectEnabled_ != null;
    }

    public boolean hasAccountSelectPaneSubmitButton() {
        return this.accountSelectPaneSubmitButton_ != null;
    }

    public boolean hasAccountSelectPaneTitle() {
        return this.accountSelectPaneTitle_ != null;
    }

    public boolean hasConnectedPaneHeading() {
        return this.connectedPaneHeading_ != null;
    }

    public boolean hasConnectedPaneIsEnabled() {
        return this.connectedPaneIsEnabled_ != null;
    }

    public boolean hasConnectedPaneMessage() {
        return this.connectedPaneMessage_ != null;
    }

    public boolean hasConnectedPaneSubmitButton() {
        return this.connectedPaneSubmitButton_ != null;
    }

    public boolean hasConnectedPaneTitle() {
        return this.connectedPaneTitle_ != null;
    }

    public boolean hasCredentialPanePlaidLegalEnabled() {
        return this.credentialPanePlaidLegalEnabled_ != null;
    }

    public boolean hasCredentialPaneResetPasswordButton() {
        return this.credentialPaneResetPasswordButton_ != null;
    }

    public boolean hasCredentialPaneSubmitButton() {
        return this.credentialPaneSubmitButton_ != null;
    }

    public boolean hasCredentialPaneTitle() {
        return this.credentialPaneTitle_ != null;
    }

    public boolean hasCredentialPaneTosContent() {
        return this.credentialPaneTosContent_ != null;
    }

    public boolean hasCredentialPaneTosEnabled() {
        return this.credentialPaneTosEnabled_ != null;
    }

    public boolean hasErrorPaneTitle() {
        return this.errorPaneTitle_ != null;
    }

    public boolean hasEuConsentPaneCancel() {
        return this.euConsentPaneCancel_ != null;
    }

    public boolean hasEuConsentPaneContactDetailsTitle() {
        return this.euConsentPaneContactDetailsTitle_ != null;
    }

    public boolean hasEuConsentPaneContinue() {
        return this.euConsentPaneContinue_ != null;
    }

    public boolean hasEuConsentPaneContinueAgree() {
        return this.euConsentPaneContinueAgree_ != null;
    }

    public boolean hasEuConsentPaneDetailsTitle() {
        return this.euConsentPaneDetailsTitle_ != null;
    }

    public boolean hasEuConsentPaneIsEnabled() {
        return this.euConsentPaneIsEnabled_ != null;
    }

    public boolean hasEuConsentPaneLinkWithPlaid() {
        return this.euConsentPaneLinkWithPlaid_ != null;
    }

    public boolean hasEuConsentPaneSubmitAgree() {
        return this.euConsentPaneSubmitAgree_ != null;
    }

    public boolean hasEuConsentPaneSubmitButton() {
        return this.euConsentPaneSubmitButton_ != null;
    }

    public boolean hasEuConsentPaneTransactionsTitle() {
        return this.euConsentPaneTransactionsTitle_ != null;
    }

    public boolean hasExitPaneCancelButton() {
        return this.exitPaneCancelButton_ != null;
    }

    public boolean hasExitPaneHeading() {
        return this.exitPaneHeading_ != null;
    }

    public boolean hasExitPaneMessage() {
        return this.exitPaneMessage_ != null;
    }

    public boolean hasExitPaneSubmitButton() {
        return this.exitPaneSubmitButton_ != null;
    }

    public boolean hasExitPaneTitle() {
        return this.exitPaneTitle_ != null;
    }

    public boolean hasGlobalHighlightColor() {
        return this.globalHighlightColor_ != null;
    }

    public boolean hasGlobalOverlayBackgroundColor() {
        return this.globalOverlayBackgroundColor_ != null;
    }

    public boolean hasInstitutionSearchPaneExitButton() {
        return this.institutionSearchPaneExitButton_ != null;
    }

    public boolean hasInstitutionSearchPaneInitialMessage() {
        return this.institutionSearchPaneInitialMessage_ != null;
    }

    public boolean hasInstitutionSearchPaneNoResultsMessage() {
        return this.institutionSearchPaneNoResultsMessage_ != null;
    }

    public boolean hasInstitutionSearchPanePlaceholder() {
        return this.institutionSearchPanePlaceholder_ != null;
    }

    public boolean hasInstitutionSearchPaneTimeoutMessage() {
        return this.institutionSearchPaneTimeoutMessage_ != null;
    }

    public boolean hasInstitutionSelectPaneSearchButton() {
        return this.institutionSelectPaneSearchButton_ != null;
    }

    public boolean hasInstitutionSelectPaneTitle() {
        return this.institutionSelectPaneTitle_ != null;
    }

    public boolean hasInstitutionSelectPaneUseDynamicInstitutionSelect() {
        return this.institutionSelectPaneUseDynamicInstitutionSelect_ != null;
    }

    public boolean hasLanguage() {
        return this.language_ != null;
    }

    public boolean hasLoadingPaneTitle() {
        return this.loadingPaneTitle_ != null;
    }

    public boolean hasMfaPaneTitle() {
        return this.mfaPaneTitle_ != null;
    }

    public boolean hasOauthLandingPaneAfterContinue() {
        return this.oauthLandingPaneAfterContinue_ != null;
    }

    public boolean hasOauthLandingPaneAuthenticateBank() {
        return this.oauthLandingPaneAuthenticateBank_ != null;
    }

    public boolean hasOauthLandingPaneContinueToInstitution() {
        return this.oauthLandingPaneContinueToInstitution_ != null;
    }

    public boolean hasOauthLandingPaneRedirectedBack() {
        return this.oauthLandingPaneRedirectedBack_ != null;
    }

    public boolean hasPrivacyInterstitialPaneCoBrandedIsEnabled() {
        return this.privacyInterstitialPaneCoBrandedIsEnabled_ != null;
    }

    public boolean hasPrivacyInterstitialPaneHeading() {
        return this.privacyInterstitialPaneHeading_ != null;
    }

    public boolean hasPrivacyInterstitialPaneHeadingAccountName() {
        return this.privacyInterstitialPaneHeadingAccountName_ != null;
    }

    public boolean hasPrivacyInterstitialPaneSubmitAgree() {
        return this.privacyInterstitialPaneSubmitAgree_ != null;
    }

    public boolean hasPrivacyInterstitialPaneSubmitButton() {
        return this.privacyInterstitialPaneSubmitButton_ != null;
    }

    public boolean hasRecaptchaPaneMessage() {
        return this.recaptchaPaneMessage_ != null;
    }

    public boolean hasRecaptchaPaneTitle() {
        return this.recaptchaPaneTitle_ != null;
    }

    public boolean hasReconnectedPaneIsEnabled() {
        return this.reconnectedPaneIsEnabled_ != null;
    }

    public boolean hasReconnectedPaneMessage() {
        return this.reconnectedPaneMessage_ != null;
    }

    public boolean hasReconnectedPaneSubmitButton() {
        return this.reconnectedPaneSubmitButton_ != null;
    }

    public boolean hasReconnectedPaneTitle() {
        return this.reconnectedPaneTitle_ != null;
    }

    public boolean hasRoutingNumberPaneMessage() {
        return this.routingNumberPaneMessage_ != null;
    }

    public boolean hasRoutingNumberPaneSubmitButton() {
        return this.routingNumberPaneSubmitButton_ != null;
    }

    public boolean hasRoutingNumberPaneTitle() {
        return this.routingNumberPaneTitle_ != null;
    }

    public boolean hasStartDateDaysAgo() {
        return this.startDateDaysAgo_ != null;
    }

    public static b newBuilder(LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization) {
        return DEFAULT_INSTANCE.createBuilder(linkCustomizations$LinkCustomization);
    }

    public static LinkCustomizations$LinkCustomization parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(ByteString byteString) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(byte[] bArr) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(InputStream inputStream) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(CodedInputStream codedInputStream) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LinkCustomizations$LinkCustomization parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$LinkCustomization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}