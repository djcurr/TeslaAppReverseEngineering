package com.plaid.internal.core.protos.analytical;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.analyticalcore.Analytical$Meta;
import com.plaid.internal.m5;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit extends GeneratedMessageLite<LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit, a> implements MessageLiteOrBuilder {
    public static final int CLIENT_ID_FIELD_NUMBER = 9;
    public static final int CREATED_AT_FIELD_NUMBER = 5;
    private static final LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit DEFAULT_INSTANCE;
    public static final int EXPERIMENT_NAME_FIELD_NUMBER = 6;
    public static final int EXPERIMENT_VARIANT_FIELD_NUMBER = 7;
    public static final int LINK_OPEN_ID_FIELD_NUMBER = 2;
    public static final int LINK_PERSISTENT_ID_FIELD_NUMBER = 4;
    public static final int LINK_SESSION_ID_FIELD_NUMBER = 3;
    public static final int LINK_WORKFLOW_SESSION_ID_FIELD_NUMBER = 8;
    public static final int META_FIELD_NUMBER = 1;
    private static volatile Parser<LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit> PARSER = null;
    public static final int PLAID_CLIENT_NAME_FIELD_NUMBER = 10;
    public static final int PUB_KEY_FIELD_NUMBER = 13;
    public static final int TOKEN_FIELD_NUMBER = 14;
    private Analytical$Meta meta_;
    private String linkOpenId_ = "";
    private String linkSessionId_ = "";
    private String linkPersistentId_ = "";
    private String createdAt_ = "";
    private String experimentName_ = "";
    private String experimentVariant_ = "";
    private String linkWorkflowSessionId_ = "";
    private String clientId_ = "";
    private String plaidClientName_ = "";
    private String pubKey_ = "";
    private String token_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit, a> implements MessageLiteOrBuilder {
        public a() {
            super(LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit.DEFAULT_INSTANCE);
        }
    }

    static {
        LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit linkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit = new LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit();
        DEFAULT_INSTANCE = linkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit;
        GeneratedMessageLite.registerDefaultInstance(LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit.class, linkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit);
    }

    private LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit() {
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
    public void clearExperimentName() {
        this.experimentName_ = getDefaultInstance().getExperimentName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentVariant() {
        this.experimentVariant_ = getDefaultInstance().getExperimentVariant();
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

    public static LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit getDefaultInstance() {
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

    public static LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit parseDelimitedFrom(InputStream inputStream) {
        return (LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit parseFrom(ByteBuffer byteBuffer) {
        return (LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit> parser() {
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
    public void setExperimentName(String str) {
        str.getClass();
        this.experimentName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.experimentName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentVariant(String str) {
        str.getClass();
        this.experimentVariant_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentVariantBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.experimentVariant_ = byteString.toStringUtf8();
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
        switch (m5.f19010a[methodToInvoke.ordinal()]) {
            case 1:
                return new LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\u000e\f\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\rȈ\u000eȈ", new Object[]{"meta_", "linkOpenId_", "linkSessionId_", "linkPersistentId_", "createdAt_", "experimentName_", "experimentVariant_", "linkWorkflowSessionId_", "clientId_", "plaidClientName_", "pubKey_", "token_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit> parser = PARSER;
                if (parser == null) {
                    synchronized (LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit.class) {
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

    public String getExperimentName() {
        return this.experimentName_;
    }

    public ByteString getExperimentNameBytes() {
        return ByteString.copyFromUtf8(this.experimentName_);
    }

    public String getExperimentVariant() {
        return this.experimentVariant_;
    }

    public ByteString getExperimentVariantBytes() {
        return ByteString.copyFromUtf8(this.experimentVariant_);
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

    public static a newBuilder(LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit linkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit) {
        return DEFAULT_INSTANCE.createBuilder(linkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit);
    }

    public static LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit parseFrom(ByteString byteString) {
        return (LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit parseFrom(byte[] bArr) {
        return (LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit parseFrom(InputStream inputStream) {
        return (LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit parseFrom(CodedInputStream codedInputStream) {
        return (LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}