package com.plaid.internal.core.protos.analytical;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.analyticalcore.Analytical$Meta;
import com.plaid.internal.n5;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails extends GeneratedMessageLite<LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails, a> implements MessageLiteOrBuilder {
    public static final int API_REQUEST_ID_FIELD_NUMBER = 7;
    public static final int BROWSER_FIELD_NUMBER = 8;
    public static final int BROWSER_LANGUAGE_FIELD_NUMBER = 9;
    public static final int BROWSER_VERSION_FIELD_NUMBER = 10;
    public static final int CLIENT_ID_FIELD_NUMBER = 51;
    public static final int CLIENT_NAME_FIELD_NUMBER = 11;
    public static final int CLIENT_TYPE_FIELD_NUMBER = 31;
    public static final int CONFIG_COUNTRY_CODES_FIELD_NUMBER = 12;
    public static final int CONFIG_LANGUAGE_FIELD_NUMBER = 13;
    public static final int CONTEXT_IP_FIELD_NUMBER = 14;
    public static final int CONTEXT_PAGE_PATH_FIELD_NUMBER = 15;
    public static final int CONTEXT_PAGE_URL_FIELD_NUMBER = 16;
    public static final int CONTEXT_USER_AGENT_FIELD_NUMBER = 17;
    public static final int COOKIE_ID_FIELD_NUMBER = 45;
    public static final int CREATED_AT_FIELD_NUMBER = 42;
    public static final int CUSTOMIZATION_NAME_FIELD_NUMBER = 58;
    private static final LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 18;
    public static final int DEVICE_ID_FIELD_NUMBER = 44;
    public static final int ENV_FIELD_NUMBER = 19;
    public static final int FULL_BROWSER_VERSION_FIELD_NUMBER = 50;
    public static final int HAS_USER_EMAIL_ADDRESS_FIELD_NUMBER = 20;
    public static final int HAS_USER_LEGAL_NAME_FIELD_NUMBER = 21;
    public static final int HAS_USER_PHONE_NUMBER_FIELD_NUMBER = 22;
    public static final int INTEGRATION_MODE_FIELD_NUMBER = 49;
    public static final int IS_ACCOUNT_PERMISSIONS_ENABLED_FIELD_NUMBER = 55;
    public static final int IS_ACCOUNT_SELECTION_ENABLED_FIELD_NUMBER = 53;
    public static final int IS_CO_BRANDED_CONSENT_ENABLED_FIELD_NUMBER = 57;
    public static final int IS_CUSTOM_INITIALIZER_ENABLED_FIELD_NUMBER = 24;
    public static final int IS_CUSTOM_INITIALIZER_FIELD_NUMBER = 23;
    public static final int IS_EMBEDDED_FIELD_NUMBER = 25;
    public static final int IS_MATCHED_USER_FIELD_NUMBER = 48;
    public static final int IS_MOBILE_FIELD_NUMBER = 26;
    public static final int IS_MULTI_ACCOUNT_SELECTION_ENABLED_FIELD_NUMBER = 54;
    public static final int IS_PATCH_FIELD_NUMBER = 27;
    public static final int IS_THREADS_FIELD_NUMBER = 52;
    public static final int IS_USING_ON_EVENT_CALLBACK_FIELD_NUMBER = 28;
    public static final int IS_USING_ON_EXIT_CALLBACK_FIELD_NUMBER = 29;
    public static final int IS_USING_ON_LOAD_CALLBACK_FIELD_NUMBER = 30;
    public static final int IS_V2_CONSENT_ENABLED_FIELD_NUMBER = 56;
    public static final int LINK_OPEN_ID_FIELD_NUMBER = 2;
    public static final int LINK_PERSISTENT_ID_CREATED_AT_FIELD_NUMBER = 6;
    public static final int LINK_PERSISTENT_ID_FIELD_NUMBER = 5;
    public static final int LINK_SDK_VERSION_FIELD_NUMBER = 32;
    public static final int LINK_SESSION_ID_CREATED_AT_FIELD_NUMBER = 4;
    public static final int LINK_SESSION_ID_FIELD_NUMBER = 3;
    public static final int LINK_TOKEN_FIELD_NUMBER = 47;
    public static final int LINK_WORKFLOW_SESSION_ID_FIELD_NUMBER = 46;
    public static final int META_FIELD_NUMBER = 1;
    public static final int OS_FIELD_NUMBER = 33;
    private static volatile Parser<LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails> PARSER = null;
    public static final int PLAID_CLIENT_NAME_FIELD_NUMBER = 34;
    public static final int PRODUCTS_FIELD_NUMBER = 35;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 36;
    public static final int PUBLIC_TOKEN_FIELD_NUMBER = 37;
    public static final int REFERRER_FIELD_NUMBER = 38;
    public static final int SCREEN_HEIGHT_FIELD_NUMBER = 39;
    public static final int SCREEN_WIDTH_FIELD_NUMBER = 40;
    public static final int SELECT_ACCOUNT_ENABLED_FIELD_NUMBER = 41;
    public static final int WEBHOOK_FIELD_NUMBER = 43;
    private long browserVersion_;
    private float fullBrowserVersion_;
    private boolean hasUserEmailAddress_;
    private boolean hasUserLegalName_;
    private boolean hasUserPhoneNumber_;
    private boolean isAccountPermissionsEnabled_;
    private boolean isAccountSelectionEnabled_;
    private boolean isCoBrandedConsentEnabled_;
    private boolean isCustomInitializerEnabled_;
    private boolean isCustomInitializer_;
    private boolean isEmbedded_;
    private boolean isMatchedUser_;
    private boolean isMobile_;
    private boolean isMultiAccountSelectionEnabled_;
    private boolean isPatch_;
    private boolean isThreads_;
    private boolean isUsingOnEventCallback_;
    private boolean isUsingOnExitCallback_;
    private boolean isUsingOnLoadCallback_;
    private boolean isV2ConsentEnabled_;
    private Analytical$Meta meta_;
    private long screenHeight_;
    private long screenWidth_;
    private boolean selectAccountEnabled_;
    private String linkOpenId_ = "";
    private String linkSessionId_ = "";
    private String linkSessionIdCreatedAt_ = "";
    private String linkPersistentId_ = "";
    private String linkPersistentIdCreatedAt_ = "";
    private String apiRequestId_ = "";
    private String browser_ = "";
    private String browserLanguage_ = "";
    private String clientName_ = "";
    private String configCountryCodes_ = "";
    private String configLanguage_ = "";
    private String contextIp_ = "";
    private String contextPagePath_ = "";
    private String contextPageUrl_ = "";
    private String contextUserAgent_ = "";
    private String device_ = "";
    private String env_ = "";
    private String clientType_ = "";
    private String linkSdkVersion_ = "";
    private String os_ = "";
    private String plaidClientName_ = "";
    private String products_ = "";
    private String publicKey_ = "";
    private String publicToken_ = "";
    private String referrer_ = "";
    private String createdAt_ = "";
    private String webhook_ = "";
    private String deviceId_ = "";
    private String cookieId_ = "";
    private String linkWorkflowSessionId_ = "";
    private String linkToken_ = "";
    private String integrationMode_ = "";
    private String clientId_ = "";
    private String customizationName_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails, a> implements MessageLiteOrBuilder {
        public a() {
            super(LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails.DEFAULT_INSTANCE);
        }
    }

    static {
        LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails linkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails = new LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails();
        DEFAULT_INSTANCE = linkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails;
        GeneratedMessageLite.registerDefaultInstance(LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails.class, linkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails);
    }

    private LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApiRequestId() {
        this.apiRequestId_ = getDefaultInstance().getApiRequestId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrowser() {
        this.browser_ = getDefaultInstance().getBrowser();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrowserLanguage() {
        this.browserLanguage_ = getDefaultInstance().getBrowserLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrowserVersion() {
        this.browserVersion_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientId() {
        this.clientId_ = getDefaultInstance().getClientId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientName() {
        this.clientName_ = getDefaultInstance().getClientName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientType() {
        this.clientType_ = getDefaultInstance().getClientType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigCountryCodes() {
        this.configCountryCodes_ = getDefaultInstance().getConfigCountryCodes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigLanguage() {
        this.configLanguage_ = getDefaultInstance().getConfigLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContextIp() {
        this.contextIp_ = getDefaultInstance().getContextIp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContextPagePath() {
        this.contextPagePath_ = getDefaultInstance().getContextPagePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContextPageUrl() {
        this.contextPageUrl_ = getDefaultInstance().getContextPageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContextUserAgent() {
        this.contextUserAgent_ = getDefaultInstance().getContextUserAgent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCookieId() {
        this.cookieId_ = getDefaultInstance().getCookieId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedAt() {
        this.createdAt_ = getDefaultInstance().getCreatedAt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustomizationName() {
        this.customizationName_ = getDefaultInstance().getCustomizationName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDevice() {
        this.device_ = getDefaultInstance().getDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceId() {
        this.deviceId_ = getDefaultInstance().getDeviceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnv() {
        this.env_ = getDefaultInstance().getEnv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFullBrowserVersion() {
        this.fullBrowserVersion_ = BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasUserEmailAddress() {
        this.hasUserEmailAddress_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasUserLegalName() {
        this.hasUserLegalName_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasUserPhoneNumber() {
        this.hasUserPhoneNumber_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntegrationMode() {
        this.integrationMode_ = getDefaultInstance().getIntegrationMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAccountPermissionsEnabled() {
        this.isAccountPermissionsEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAccountSelectionEnabled() {
        this.isAccountSelectionEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCoBrandedConsentEnabled() {
        this.isCoBrandedConsentEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCustomInitializer() {
        this.isCustomInitializer_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCustomInitializerEnabled() {
        this.isCustomInitializerEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsEmbedded() {
        this.isEmbedded_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMatchedUser() {
        this.isMatchedUser_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMobile() {
        this.isMobile_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMultiAccountSelectionEnabled() {
        this.isMultiAccountSelectionEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPatch() {
        this.isPatch_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsThreads() {
        this.isThreads_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsUsingOnEventCallback() {
        this.isUsingOnEventCallback_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsUsingOnExitCallback() {
        this.isUsingOnExitCallback_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsUsingOnLoadCallback() {
        this.isUsingOnLoadCallback_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsV2ConsentEnabled() {
        this.isV2ConsentEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkOpenId() {
        this.linkOpenId_ = getDefaultInstance().getLinkOpenId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkPersistentId() {
        this.linkPersistentId_ = getDefaultInstance().getLinkPersistentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkPersistentIdCreatedAt() {
        this.linkPersistentIdCreatedAt_ = getDefaultInstance().getLinkPersistentIdCreatedAt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkSdkVersion() {
        this.linkSdkVersion_ = getDefaultInstance().getLinkSdkVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkSessionId() {
        this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkSessionIdCreatedAt() {
        this.linkSessionIdCreatedAt_ = getDefaultInstance().getLinkSessionIdCreatedAt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkToken() {
        this.linkToken_ = getDefaultInstance().getLinkToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkWorkflowSessionId() {
        this.linkWorkflowSessionId_ = getDefaultInstance().getLinkWorkflowSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeta() {
        this.meta_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOs() {
        this.os_ = getDefaultInstance().getOs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaidClientName() {
        this.plaidClientName_ = getDefaultInstance().getPlaidClientName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducts() {
        this.products_ = getDefaultInstance().getProducts();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicKey() {
        this.publicKey_ = getDefaultInstance().getPublicKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicToken() {
        this.publicToken_ = getDefaultInstance().getPublicToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReferrer() {
        this.referrer_ = getDefaultInstance().getReferrer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenHeight() {
        this.screenHeight_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenWidth() {
        this.screenWidth_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectAccountEnabled() {
        this.selectAccountEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebhook() {
        this.webhook_ = getDefaultInstance().getWebhook();
    }

    public static LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMeta(Analytical$Meta analytical$Meta) {
        analytical$Meta.getClass();
        Analytical$Meta analytical$Meta2 = this.meta_;
        if (analytical$Meta2 != null && analytical$Meta2 != Analytical$Meta.getDefaultInstance()) {
            this.meta_ = Analytical$Meta.newBuilder(this.meta_).mergeFrom((Analytical$Meta.a) analytical$Meta).buildPartial();
        } else {
            this.meta_ = analytical$Meta;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails parseDelimitedFrom(InputStream inputStream) {
        return (LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails parseFrom(ByteBuffer byteBuffer) {
        return (LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApiRequestId(String str) {
        str.getClass();
        this.apiRequestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApiRequestIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.apiRequestId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrowser(String str) {
        str.getClass();
        this.browser_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrowserBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.browser_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrowserLanguage(String str) {
        str.getClass();
        this.browserLanguage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrowserLanguageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.browserLanguage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrowserVersion(long j11) {
        this.browserVersion_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientId(String str) {
        str.getClass();
        this.clientId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.clientId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientName(String str) {
        str.getClass();
        this.clientName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.clientName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientType(String str) {
        str.getClass();
        this.clientType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.clientType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigCountryCodes(String str) {
        str.getClass();
        this.configCountryCodes_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigCountryCodesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.configCountryCodes_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigLanguage(String str) {
        str.getClass();
        this.configLanguage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigLanguageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.configLanguage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextIp(String str) {
        str.getClass();
        this.contextIp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextIpBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.contextIp_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextPagePath(String str) {
        str.getClass();
        this.contextPagePath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextPagePathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.contextPagePath_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextPageUrl(String str) {
        str.getClass();
        this.contextPageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextPageUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.contextPageUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextUserAgent(String str) {
        str.getClass();
        this.contextUserAgent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextUserAgentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.contextUserAgent_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCookieId(String str) {
        str.getClass();
        this.cookieId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCookieIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cookieId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedAt(String str) {
        str.getClass();
        this.createdAt_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedAtBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.createdAt_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomizationName(String str) {
        str.getClass();
        this.customizationName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomizationNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.customizationName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDevice(String str) {
        str.getClass();
        this.device_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.device_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceId(String str) {
        str.getClass();
        this.deviceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnv(String str) {
        str.getClass();
        this.env_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnvBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.env_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullBrowserVersion(float f11) {
        this.fullBrowserVersion_ = f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasUserEmailAddress(boolean z11) {
        this.hasUserEmailAddress_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasUserLegalName(boolean z11) {
        this.hasUserLegalName_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasUserPhoneNumber(boolean z11) {
        this.hasUserPhoneNumber_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntegrationMode(String str) {
        str.getClass();
        this.integrationMode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntegrationModeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.integrationMode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAccountPermissionsEnabled(boolean z11) {
        this.isAccountPermissionsEnabled_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAccountSelectionEnabled(boolean z11) {
        this.isAccountSelectionEnabled_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCoBrandedConsentEnabled(boolean z11) {
        this.isCoBrandedConsentEnabled_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCustomInitializer(boolean z11) {
        this.isCustomInitializer_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCustomInitializerEnabled(boolean z11) {
        this.isCustomInitializerEnabled_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsEmbedded(boolean z11) {
        this.isEmbedded_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMatchedUser(boolean z11) {
        this.isMatchedUser_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMobile(boolean z11) {
        this.isMobile_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMultiAccountSelectionEnabled(boolean z11) {
        this.isMultiAccountSelectionEnabled_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPatch(boolean z11) {
        this.isPatch_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsThreads(boolean z11) {
        this.isThreads_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsUsingOnEventCallback(boolean z11) {
        this.isUsingOnEventCallback_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsUsingOnExitCallback(boolean z11) {
        this.isUsingOnExitCallback_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsUsingOnLoadCallback(boolean z11) {
        this.isUsingOnLoadCallback_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsV2ConsentEnabled(boolean z11) {
        this.isV2ConsentEnabled_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkOpenId(String str) {
        str.getClass();
        this.linkOpenId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkOpenIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkOpenId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkPersistentId(String str) {
        str.getClass();
        this.linkPersistentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkPersistentIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkPersistentId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkPersistentIdCreatedAt(String str) {
        str.getClass();
        this.linkPersistentIdCreatedAt_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkPersistentIdCreatedAtBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkPersistentIdCreatedAt_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkSdkVersion(String str) {
        str.getClass();
        this.linkSdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkSdkVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkSdkVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkSessionId(String str) {
        str.getClass();
        this.linkSessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkSessionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkSessionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkSessionIdCreatedAt(String str) {
        str.getClass();
        this.linkSessionIdCreatedAt_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkSessionIdCreatedAtBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkSessionIdCreatedAt_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkToken(String str) {
        str.getClass();
        this.linkToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkToken_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkWorkflowSessionId(String str) {
        str.getClass();
        this.linkWorkflowSessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkWorkflowSessionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkWorkflowSessionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeta(Analytical$Meta analytical$Meta) {
        analytical$Meta.getClass();
        this.meta_ = analytical$Meta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(String str) {
        str.getClass();
        this.os_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.os_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaidClientName(String str) {
        str.getClass();
        this.plaidClientName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaidClientNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.plaidClientName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducts(String str) {
        str.getClass();
        this.products_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.products_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicKey(String str) {
        str.getClass();
        this.publicKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.publicKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicToken(String str) {
        str.getClass();
        this.publicToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.publicToken_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReferrer(String str) {
        str.getClass();
        this.referrer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReferrerBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.referrer_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenHeight(long j11) {
        this.screenHeight_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenWidth(long j11) {
        this.screenWidth_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectAccountEnabled(boolean z11) {
        this.selectAccountEnabled_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebhook(String str) {
        str.getClass();
        this.webhook_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebhookBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.webhook_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (n5.f19060a[methodToInvoke.ordinal()]) {
            case 1:
                return new LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000:\u0000\u0000\u0001::\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\n\u0002\u000bȈ\fȈ\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014\u0007\u0015\u0007\u0016\u0007\u0017\u0007\u0018\u0007\u0019\u0007\u001a\u0007\u001b\u0007\u001c\u0007\u001d\u0007\u001e\u0007\u001fȈ Ȉ!Ȉ\"Ȉ#Ȉ$Ȉ%Ȉ&Ȉ'\u0002(\u0002)\u0007*Ȉ+Ȉ,Ȉ-Ȉ.Ȉ/Ȉ0\u00071Ȉ2\u00013Ȉ4\u00075\u00076\u00077\u00078\u00079\u0007:Ȉ", new Object[]{"meta_", "linkOpenId_", "linkSessionId_", "linkSessionIdCreatedAt_", "linkPersistentId_", "linkPersistentIdCreatedAt_", "apiRequestId_", "browser_", "browserLanguage_", "browserVersion_", "clientName_", "configCountryCodes_", "configLanguage_", "contextIp_", "contextPagePath_", "contextPageUrl_", "contextUserAgent_", "device_", "env_", "hasUserEmailAddress_", "hasUserLegalName_", "hasUserPhoneNumber_", "isCustomInitializer_", "isCustomInitializerEnabled_", "isEmbedded_", "isMobile_", "isPatch_", "isUsingOnEventCallback_", "isUsingOnExitCallback_", "isUsingOnLoadCallback_", "clientType_", "linkSdkVersion_", "os_", "plaidClientName_", "products_", "publicKey_", "publicToken_", "referrer_", "screenHeight_", "screenWidth_", "selectAccountEnabled_", "createdAt_", "webhook_", "deviceId_", "cookieId_", "linkWorkflowSessionId_", "linkToken_", "isMatchedUser_", "integrationMode_", "fullBrowserVersion_", "clientId_", "isThreads_", "isAccountSelectionEnabled_", "isMultiAccountSelectionEnabled_", "isAccountPermissionsEnabled_", "isV2ConsentEnabled_", "isCoBrandedConsentEnabled_", "customizationName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails> parser = PARSER;
                if (parser == null) {
                    synchronized (LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails.class) {
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

    public String getApiRequestId() {
        return this.apiRequestId_;
    }

    public ByteString getApiRequestIdBytes() {
        return ByteString.copyFromUtf8(this.apiRequestId_);
    }

    public String getBrowser() {
        return this.browser_;
    }

    public ByteString getBrowserBytes() {
        return ByteString.copyFromUtf8(this.browser_);
    }

    public String getBrowserLanguage() {
        return this.browserLanguage_;
    }

    public ByteString getBrowserLanguageBytes() {
        return ByteString.copyFromUtf8(this.browserLanguage_);
    }

    public long getBrowserVersion() {
        return this.browserVersion_;
    }

    public String getClientId() {
        return this.clientId_;
    }

    public ByteString getClientIdBytes() {
        return ByteString.copyFromUtf8(this.clientId_);
    }

    public String getClientName() {
        return this.clientName_;
    }

    public ByteString getClientNameBytes() {
        return ByteString.copyFromUtf8(this.clientName_);
    }

    public String getClientType() {
        return this.clientType_;
    }

    public ByteString getClientTypeBytes() {
        return ByteString.copyFromUtf8(this.clientType_);
    }

    public String getConfigCountryCodes() {
        return this.configCountryCodes_;
    }

    public ByteString getConfigCountryCodesBytes() {
        return ByteString.copyFromUtf8(this.configCountryCodes_);
    }

    public String getConfigLanguage() {
        return this.configLanguage_;
    }

    public ByteString getConfigLanguageBytes() {
        return ByteString.copyFromUtf8(this.configLanguage_);
    }

    public String getContextIp() {
        return this.contextIp_;
    }

    public ByteString getContextIpBytes() {
        return ByteString.copyFromUtf8(this.contextIp_);
    }

    public String getContextPagePath() {
        return this.contextPagePath_;
    }

    public ByteString getContextPagePathBytes() {
        return ByteString.copyFromUtf8(this.contextPagePath_);
    }

    public String getContextPageUrl() {
        return this.contextPageUrl_;
    }

    public ByteString getContextPageUrlBytes() {
        return ByteString.copyFromUtf8(this.contextPageUrl_);
    }

    public String getContextUserAgent() {
        return this.contextUserAgent_;
    }

    public ByteString getContextUserAgentBytes() {
        return ByteString.copyFromUtf8(this.contextUserAgent_);
    }

    public String getCookieId() {
        return this.cookieId_;
    }

    public ByteString getCookieIdBytes() {
        return ByteString.copyFromUtf8(this.cookieId_);
    }

    public String getCreatedAt() {
        return this.createdAt_;
    }

    public ByteString getCreatedAtBytes() {
        return ByteString.copyFromUtf8(this.createdAt_);
    }

    public String getCustomizationName() {
        return this.customizationName_;
    }

    public ByteString getCustomizationNameBytes() {
        return ByteString.copyFromUtf8(this.customizationName_);
    }

    public String getDevice() {
        return this.device_;
    }

    public ByteString getDeviceBytes() {
        return ByteString.copyFromUtf8(this.device_);
    }

    public String getDeviceId() {
        return this.deviceId_;
    }

    public ByteString getDeviceIdBytes() {
        return ByteString.copyFromUtf8(this.deviceId_);
    }

    public String getEnv() {
        return this.env_;
    }

    public ByteString getEnvBytes() {
        return ByteString.copyFromUtf8(this.env_);
    }

    public float getFullBrowserVersion() {
        return this.fullBrowserVersion_;
    }

    public boolean getHasUserEmailAddress() {
        return this.hasUserEmailAddress_;
    }

    public boolean getHasUserLegalName() {
        return this.hasUserLegalName_;
    }

    public boolean getHasUserPhoneNumber() {
        return this.hasUserPhoneNumber_;
    }

    public String getIntegrationMode() {
        return this.integrationMode_;
    }

    public ByteString getIntegrationModeBytes() {
        return ByteString.copyFromUtf8(this.integrationMode_);
    }

    public boolean getIsAccountPermissionsEnabled() {
        return this.isAccountPermissionsEnabled_;
    }

    public boolean getIsAccountSelectionEnabled() {
        return this.isAccountSelectionEnabled_;
    }

    public boolean getIsCoBrandedConsentEnabled() {
        return this.isCoBrandedConsentEnabled_;
    }

    public boolean getIsCustomInitializer() {
        return this.isCustomInitializer_;
    }

    public boolean getIsCustomInitializerEnabled() {
        return this.isCustomInitializerEnabled_;
    }

    public boolean getIsEmbedded() {
        return this.isEmbedded_;
    }

    public boolean getIsMatchedUser() {
        return this.isMatchedUser_;
    }

    public boolean getIsMobile() {
        return this.isMobile_;
    }

    public boolean getIsMultiAccountSelectionEnabled() {
        return this.isMultiAccountSelectionEnabled_;
    }

    public boolean getIsPatch() {
        return this.isPatch_;
    }

    public boolean getIsThreads() {
        return this.isThreads_;
    }

    public boolean getIsUsingOnEventCallback() {
        return this.isUsingOnEventCallback_;
    }

    public boolean getIsUsingOnExitCallback() {
        return this.isUsingOnExitCallback_;
    }

    public boolean getIsUsingOnLoadCallback() {
        return this.isUsingOnLoadCallback_;
    }

    public boolean getIsV2ConsentEnabled() {
        return this.isV2ConsentEnabled_;
    }

    public String getLinkOpenId() {
        return this.linkOpenId_;
    }

    public ByteString getLinkOpenIdBytes() {
        return ByteString.copyFromUtf8(this.linkOpenId_);
    }

    public String getLinkPersistentId() {
        return this.linkPersistentId_;
    }

    public ByteString getLinkPersistentIdBytes() {
        return ByteString.copyFromUtf8(this.linkPersistentId_);
    }

    public String getLinkPersistentIdCreatedAt() {
        return this.linkPersistentIdCreatedAt_;
    }

    public ByteString getLinkPersistentIdCreatedAtBytes() {
        return ByteString.copyFromUtf8(this.linkPersistentIdCreatedAt_);
    }

    public String getLinkSdkVersion() {
        return this.linkSdkVersion_;
    }

    public ByteString getLinkSdkVersionBytes() {
        return ByteString.copyFromUtf8(this.linkSdkVersion_);
    }

    public String getLinkSessionId() {
        return this.linkSessionId_;
    }

    public ByteString getLinkSessionIdBytes() {
        return ByteString.copyFromUtf8(this.linkSessionId_);
    }

    public String getLinkSessionIdCreatedAt() {
        return this.linkSessionIdCreatedAt_;
    }

    public ByteString getLinkSessionIdCreatedAtBytes() {
        return ByteString.copyFromUtf8(this.linkSessionIdCreatedAt_);
    }

    public String getLinkToken() {
        return this.linkToken_;
    }

    public ByteString getLinkTokenBytes() {
        return ByteString.copyFromUtf8(this.linkToken_);
    }

    public String getLinkWorkflowSessionId() {
        return this.linkWorkflowSessionId_;
    }

    public ByteString getLinkWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.linkWorkflowSessionId_);
    }

    public Analytical$Meta getMeta() {
        Analytical$Meta analytical$Meta = this.meta_;
        return analytical$Meta == null ? Analytical$Meta.getDefaultInstance() : analytical$Meta;
    }

    public String getOs() {
        return this.os_;
    }

    public ByteString getOsBytes() {
        return ByteString.copyFromUtf8(this.os_);
    }

    public String getPlaidClientName() {
        return this.plaidClientName_;
    }

    public ByteString getPlaidClientNameBytes() {
        return ByteString.copyFromUtf8(this.plaidClientName_);
    }

    public String getProducts() {
        return this.products_;
    }

    public ByteString getProductsBytes() {
        return ByteString.copyFromUtf8(this.products_);
    }

    public String getPublicKey() {
        return this.publicKey_;
    }

    public ByteString getPublicKeyBytes() {
        return ByteString.copyFromUtf8(this.publicKey_);
    }

    public String getPublicToken() {
        return this.publicToken_;
    }

    public ByteString getPublicTokenBytes() {
        return ByteString.copyFromUtf8(this.publicToken_);
    }

    public String getReferrer() {
        return this.referrer_;
    }

    public ByteString getReferrerBytes() {
        return ByteString.copyFromUtf8(this.referrer_);
    }

    public long getScreenHeight() {
        return this.screenHeight_;
    }

    public long getScreenWidth() {
        return this.screenWidth_;
    }

    public boolean getSelectAccountEnabled() {
        return this.selectAccountEnabled_;
    }

    public String getWebhook() {
        return this.webhook_;
    }

    public ByteString getWebhookBytes() {
        return ByteString.copyFromUtf8(this.webhook_);
    }

    public boolean hasMeta() {
        return this.meta_ != null;
    }

    public static a newBuilder(LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails linkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails) {
        return DEFAULT_INSTANCE.createBuilder(linkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails);
    }

    public static LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails parseFrom(ByteString byteString) {
        return (LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails parseFrom(byte[] bArr) {
        return (LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails parseFrom(InputStream inputStream) {
        return (LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails parseFrom(CodedInputStream codedInputStream) {
        return (LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}