package com.plaid.internal.core.protos.analytical;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.analyticalcore.Analytical$Meta;
import com.plaid.internal.l5;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents extends GeneratedMessageLite<LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents, a> implements MessageLiteOrBuilder {
    public static final int CLIENT_ID_FIELD_NUMBER = 18;
    public static final int CREATED_AT_FIELD_NUMBER = 5;
    private static final LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 9;
    public static final int ERROR_STRING_FIELD_NUMBER = 10;
    public static final int EVENT_DETAILS_FIELD_NUMBER = 8;
    public static final int EVENT_NAME_FIELD_NUMBER = 7;
    public static final int INSTITUTION_ID_FIELD_NUMBER = 13;
    public static final int INSTITUTION_NAME_FIELD_NUMBER = 15;
    public static final int INSTITUTION_SEARCH_QUERY_FIELD_NUMBER = 17;
    public static final int INSTITUTION_SEARCH_QUERY_LOG_FIELD_NUMBER = 16;
    public static final int INSTITUTION_TYPE_FIELD_NUMBER = 14;
    public static final int IS_MATCHED_ITEM_SELECTED_FIELD_NUMBER = 12;
    public static final int LINK_OPEN_ID_FIELD_NUMBER = 2;
    public static final int LINK_PERSISTENT_ID_FIELD_NUMBER = 4;
    public static final int LINK_SESSION_ID_FIELD_NUMBER = 3;
    public static final int LINK_WORKFLOW_SESSION_ID_FIELD_NUMBER = 11;
    public static final int META_FIELD_NUMBER = 1;
    public static final int NUM_SELECTABLE_ACCOUNTS_FIELD_NUMBER = 24;
    public static final int NUM_SELECTED_ACCOUNTS_FIELD_NUMBER = 25;
    public static final int PANE_NAME_FIELD_NUMBER = 6;
    private static volatile Parser<LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents> PARSER = null;
    public static final int PLAID_CLIENT_NAME_FIELD_NUMBER = 19;
    public static final int PUB_KEY_FIELD_NUMBER = 22;
    public static final int TOKEN_FIELD_NUMBER = 23;
    private boolean isMatchedItemSelected_;
    private Analytical$Meta meta_;
    private long numSelectableAccounts_;
    private long numSelectedAccounts_;
    private String linkOpenId_ = "";
    private String linkSessionId_ = "";
    private String linkPersistentId_ = "";
    private String createdAt_ = "";
    private String paneName_ = "";
    private String eventName_ = "";
    private String eventDetails_ = "";
    private String errorCode_ = "";
    private String errorString_ = "";
    private String linkWorkflowSessionId_ = "";
    private String institutionId_ = "";
    private String institutionType_ = "";
    private String institutionName_ = "";
    private String institutionSearchQueryLog_ = "";
    private String institutionSearchQuery_ = "";
    private String clientId_ = "";
    private String plaidClientName_ = "";
    private String pubKey_ = "";
    private String token_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents, a> implements MessageLiteOrBuilder {
        public a() {
            super(LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents.DEFAULT_INSTANCE);
        }
    }

    static {
        LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents linkAnalyticsEventsOuterClass$LinkAnalyticsEvents = new LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents();
        DEFAULT_INSTANCE = linkAnalyticsEventsOuterClass$LinkAnalyticsEvents;
        GeneratedMessageLite.registerDefaultInstance(LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents.class, linkAnalyticsEventsOuterClass$LinkAnalyticsEvents);
    }

    private LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientId() {
        this.clientId_ = getDefaultInstance().getClientId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedAt() {
        this.createdAt_ = getDefaultInstance().getCreatedAt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.errorCode_ = getDefaultInstance().getErrorCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorString() {
        this.errorString_ = getDefaultInstance().getErrorString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventDetails() {
        this.eventDetails_ = getDefaultInstance().getEventDetails();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventName() {
        this.eventName_ = getDefaultInstance().getEventName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionId() {
        this.institutionId_ = getDefaultInstance().getInstitutionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionName() {
        this.institutionName_ = getDefaultInstance().getInstitutionName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionSearchQuery() {
        this.institutionSearchQuery_ = getDefaultInstance().getInstitutionSearchQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionSearchQueryLog() {
        this.institutionSearchQueryLog_ = getDefaultInstance().getInstitutionSearchQueryLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionType() {
        this.institutionType_ = getDefaultInstance().getInstitutionType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMatchedItemSelected() {
        this.isMatchedItemSelected_ = false;
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
    public void clearLinkSessionId() {
        this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
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
    public void clearNumSelectableAccounts() {
        this.numSelectableAccounts_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumSelectedAccounts() {
        this.numSelectedAccounts_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaneName() {
        this.paneName_ = getDefaultInstance().getPaneName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaidClientName() {
        this.plaidClientName_ = getDefaultInstance().getPlaidClientName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPubKey() {
        this.pubKey_ = getDefaultInstance().getPubKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.token_ = getDefaultInstance().getToken();
    }

    public static LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents getDefaultInstance() {
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

    public static LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents parseDelimitedFrom(InputStream inputStream) {
        return (LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents parseFrom(ByteBuffer byteBuffer) {
        return (LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setErrorCode(String str) {
        str.getClass();
        this.errorCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.errorCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorString(String str) {
        str.getClass();
        this.errorString_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorStringBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.errorString_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventDetails(String str) {
        str.getClass();
        this.eventDetails_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventDetailsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.eventDetails_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventName(String str) {
        str.getClass();
        this.eventName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.eventName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionId(String str) {
        str.getClass();
        this.institutionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.institutionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionName(String str) {
        str.getClass();
        this.institutionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.institutionName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionSearchQuery(String str) {
        str.getClass();
        this.institutionSearchQuery_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionSearchQueryBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.institutionSearchQuery_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionSearchQueryLog(String str) {
        str.getClass();
        this.institutionSearchQueryLog_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionSearchQueryLogBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.institutionSearchQueryLog_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionType(String str) {
        str.getClass();
        this.institutionType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.institutionType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMatchedItemSelected(boolean z11) {
        this.isMatchedItemSelected_ = z11;
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
    public void setNumSelectableAccounts(long j11) {
        this.numSelectableAccounts_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumSelectedAccounts(long j11) {
        this.numSelectedAccounts_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaneName(String str) {
        str.getClass();
        this.paneName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaneNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.paneName_ = byteString.toStringUtf8();
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
    public void setPubKey(String str) {
        str.getClass();
        this.pubKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPubKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pubKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToken(String str) {
        str.getClass();
        this.token_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.token_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (l5.f18958a[methodToInvoke.ordinal()]) {
            case 1:
                return new LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0000\u0001\u0019\u0017\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\f\u0007\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0016Ȉ\u0017Ȉ\u0018\u0002\u0019\u0002", new Object[]{"meta_", "linkOpenId_", "linkSessionId_", "linkPersistentId_", "createdAt_", "paneName_", "eventName_", "eventDetails_", "errorCode_", "errorString_", "linkWorkflowSessionId_", "isMatchedItemSelected_", "institutionId_", "institutionType_", "institutionName_", "institutionSearchQueryLog_", "institutionSearchQuery_", "clientId_", "plaidClientName_", "pubKey_", "token_", "numSelectableAccounts_", "numSelectedAccounts_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents> parser = PARSER;
                if (parser == null) {
                    synchronized (LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents.class) {
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

    public String getClientId() {
        return this.clientId_;
    }

    public ByteString getClientIdBytes() {
        return ByteString.copyFromUtf8(this.clientId_);
    }

    public String getCreatedAt() {
        return this.createdAt_;
    }

    public ByteString getCreatedAtBytes() {
        return ByteString.copyFromUtf8(this.createdAt_);
    }

    public String getErrorCode() {
        return this.errorCode_;
    }

    public ByteString getErrorCodeBytes() {
        return ByteString.copyFromUtf8(this.errorCode_);
    }

    public String getErrorString() {
        return this.errorString_;
    }

    public ByteString getErrorStringBytes() {
        return ByteString.copyFromUtf8(this.errorString_);
    }

    public String getEventDetails() {
        return this.eventDetails_;
    }

    public ByteString getEventDetailsBytes() {
        return ByteString.copyFromUtf8(this.eventDetails_);
    }

    public String getEventName() {
        return this.eventName_;
    }

    public ByteString getEventNameBytes() {
        return ByteString.copyFromUtf8(this.eventName_);
    }

    public String getInstitutionId() {
        return this.institutionId_;
    }

    public ByteString getInstitutionIdBytes() {
        return ByteString.copyFromUtf8(this.institutionId_);
    }

    public String getInstitutionName() {
        return this.institutionName_;
    }

    public ByteString getInstitutionNameBytes() {
        return ByteString.copyFromUtf8(this.institutionName_);
    }

    public String getInstitutionSearchQuery() {
        return this.institutionSearchQuery_;
    }

    public ByteString getInstitutionSearchQueryBytes() {
        return ByteString.copyFromUtf8(this.institutionSearchQuery_);
    }

    public String getInstitutionSearchQueryLog() {
        return this.institutionSearchQueryLog_;
    }

    public ByteString getInstitutionSearchQueryLogBytes() {
        return ByteString.copyFromUtf8(this.institutionSearchQueryLog_);
    }

    public String getInstitutionType() {
        return this.institutionType_;
    }

    public ByteString getInstitutionTypeBytes() {
        return ByteString.copyFromUtf8(this.institutionType_);
    }

    public boolean getIsMatchedItemSelected() {
        return this.isMatchedItemSelected_;
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

    public String getLinkSessionId() {
        return this.linkSessionId_;
    }

    public ByteString getLinkSessionIdBytes() {
        return ByteString.copyFromUtf8(this.linkSessionId_);
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

    public long getNumSelectableAccounts() {
        return this.numSelectableAccounts_;
    }

    public long getNumSelectedAccounts() {
        return this.numSelectedAccounts_;
    }

    public String getPaneName() {
        return this.paneName_;
    }

    public ByteString getPaneNameBytes() {
        return ByteString.copyFromUtf8(this.paneName_);
    }

    public String getPlaidClientName() {
        return this.plaidClientName_;
    }

    public ByteString getPlaidClientNameBytes() {
        return ByteString.copyFromUtf8(this.plaidClientName_);
    }

    public String getPubKey() {
        return this.pubKey_;
    }

    public ByteString getPubKeyBytes() {
        return ByteString.copyFromUtf8(this.pubKey_);
    }

    public String getToken() {
        return this.token_;
    }

    public ByteString getTokenBytes() {
        return ByteString.copyFromUtf8(this.token_);
    }

    public boolean hasMeta() {
        return this.meta_ != null;
    }

    public static a newBuilder(LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents linkAnalyticsEventsOuterClass$LinkAnalyticsEvents) {
        return DEFAULT_INSTANCE.createBuilder(linkAnalyticsEventsOuterClass$LinkAnalyticsEvents);
    }

    public static LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents parseFrom(ByteString byteString) {
        return (LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents parseFrom(byte[] bArr) {
        return (LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents parseFrom(InputStream inputStream) {
        return (LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents parseFrom(CodedInputStream codedInputStream) {
        return (LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}