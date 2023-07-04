package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkHostedTrustedAuthConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata;
import com.plaid.internal.hd;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Workflow$LinkWorkflowStartRequest extends GeneratedMessageLite<Workflow$LinkWorkflowStartRequest, a> implements MessageLiteOrBuilder {
    public static final int CLIENT_CAPABILITIES_FIELD_NUMBER = 10;
    private static final Workflow$LinkWorkflowStartRequest DEFAULT_INSTANCE;
    public static final int DEVICE_METADATA_FIELD_NUMBER = 2;
    public static final int FORCED_VARIANTS_FIELD_NUMBER = 8;
    public static final int LINK_CONFIGURATION_FIELD_NUMBER = 4;
    public static final int LINK_HOSTED_TRUSTED_AUTH_CONFIGURATION_FIELD_NUMBER = 9;
    public static final int LINK_TOKEN_CONFIGURATION_FIELD_NUMBER = 6;
    public static final int OAUTH_CONTINUATION_FIELD_NUMBER = 7;
    private static volatile Parser<Workflow$LinkWorkflowStartRequest> PARSER = null;
    public static final int SDK_METADATA_FIELD_NUMBER = 1;
    public static final int WORKFLOW_VERSION_OVERRIDE_FIELD_NUMBER = 5;
    private Configuration$ClientCapabilities clientCapabilities_;
    private Object configuration_;
    private Configuration$DeviceMetadata deviceMetadata_;
    private Configuration$SDKMetadata sdkMetadata_;
    private int configurationCase_ = 0;
    private MapFieldLite<String, String> forcedVariants_ = MapFieldLite.emptyMapField();
    private String workflowVersionOverride_ = "";

    /* loaded from: classes2.dex */
    public static final class OAuthContinuation extends GeneratedMessageLite<OAuthContinuation, a> implements MessageLiteOrBuilder {
        private static final OAuthContinuation DEFAULT_INSTANCE;
        public static final int LEGACY_FIELD_NUMBER = 3;
        public static final int LINK_TOKEN_FIELD_NUMBER = 2;
        private static volatile Parser<OAuthContinuation> PARSER = null;
        public static final int RESPONSE_REDIRECT_URI_FIELD_NUMBER = 1;
        private LegacyContinuation legacy_;
        private String responseRedirectUri_ = "";
        private String linkToken_ = "";

        /* loaded from: classes2.dex */
        public static final class LegacyContinuation extends GeneratedMessageLite<LegacyContinuation, a> implements MessageLiteOrBuilder {
            private static final LegacyContinuation DEFAULT_INSTANCE;
            public static final int OAUTH_NONCE_FIELD_NUMBER = 2;
            public static final int OAUTH_STATE_ID_FIELD_NUMBER = 1;
            private static volatile Parser<LegacyContinuation> PARSER;
            private String oauthStateId_ = "";
            private String oauthNonce_ = "";

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<LegacyContinuation, a> implements MessageLiteOrBuilder {
                public a() {
                    super(LegacyContinuation.DEFAULT_INSTANCE);
                }

                public a a(String str) {
                    copyOnWrite();
                    ((LegacyContinuation) this.instance).setOauthNonce(str);
                    return this;
                }

                public a b(String str) {
                    copyOnWrite();
                    ((LegacyContinuation) this.instance).setOauthStateId(str);
                    return this;
                }
            }

            static {
                LegacyContinuation legacyContinuation = new LegacyContinuation();
                DEFAULT_INSTANCE = legacyContinuation;
                GeneratedMessageLite.registerDefaultInstance(LegacyContinuation.class, legacyContinuation);
            }

            private LegacyContinuation() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOauthNonce() {
                this.oauthNonce_ = getDefaultInstance().getOauthNonce();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOauthStateId() {
                this.oauthStateId_ = getDefaultInstance().getOauthStateId();
            }

            public static LegacyContinuation getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static LegacyContinuation parseDelimitedFrom(InputStream inputStream) {
                return (LegacyContinuation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LegacyContinuation parseFrom(ByteBuffer byteBuffer) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<LegacyContinuation> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOauthNonce(String str) {
                str.getClass();
                this.oauthNonce_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOauthNonceBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.oauthNonce_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOauthStateId(String str) {
                str.getClass();
                this.oauthStateId_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOauthStateIdBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.oauthStateId_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (hd.f18720a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new LegacyContinuation();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"oauthStateId_", "oauthNonce_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<LegacyContinuation> parser = PARSER;
                        if (parser == null) {
                            synchronized (LegacyContinuation.class) {
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

            public String getOauthNonce() {
                return this.oauthNonce_;
            }

            public ByteString getOauthNonceBytes() {
                return ByteString.copyFromUtf8(this.oauthNonce_);
            }

            public String getOauthStateId() {
                return this.oauthStateId_;
            }

            public ByteString getOauthStateIdBytes() {
                return ByteString.copyFromUtf8(this.oauthStateId_);
            }

            public static a newBuilder(LegacyContinuation legacyContinuation) {
                return DEFAULT_INSTANCE.createBuilder(legacyContinuation);
            }

            public static LegacyContinuation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyContinuation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LegacyContinuation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static LegacyContinuation parseFrom(ByteString byteString) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static LegacyContinuation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static LegacyContinuation parseFrom(byte[] bArr) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LegacyContinuation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static LegacyContinuation parseFrom(InputStream inputStream) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LegacyContinuation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LegacyContinuation parseFrom(CodedInputStream codedInputStream) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static LegacyContinuation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        static {
            OAuthContinuation oAuthContinuation = new OAuthContinuation();
            DEFAULT_INSTANCE = oAuthContinuation;
            GeneratedMessageLite.registerDefaultInstance(OAuthContinuation.class, oAuthContinuation);
        }

        private OAuthContinuation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLegacy() {
            this.legacy_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLinkToken() {
            this.linkToken_ = getDefaultInstance().getLinkToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResponseRedirectUri() {
            this.responseRedirectUri_ = getDefaultInstance().getResponseRedirectUri();
        }

        public static OAuthContinuation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLegacy(LegacyContinuation legacyContinuation) {
            legacyContinuation.getClass();
            LegacyContinuation legacyContinuation2 = this.legacy_;
            if (legacyContinuation2 != null && legacyContinuation2 != LegacyContinuation.getDefaultInstance()) {
                this.legacy_ = LegacyContinuation.newBuilder(this.legacy_).mergeFrom((LegacyContinuation.a) legacyContinuation).buildPartial();
            } else {
                this.legacy_ = legacyContinuation;
            }
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OAuthContinuation parseDelimitedFrom(InputStream inputStream) {
            return (OAuthContinuation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OAuthContinuation parseFrom(ByteBuffer byteBuffer) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OAuthContinuation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLegacy(LegacyContinuation legacyContinuation) {
            legacyContinuation.getClass();
            this.legacy_ = legacyContinuation;
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
        public void setResponseRedirectUri(String str) {
            str.getClass();
            this.responseRedirectUri_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponseRedirectUriBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.responseRedirectUri_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OAuthContinuation();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t", new Object[]{"responseRedirectUri_", "linkToken_", "legacy_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OAuthContinuation> parser = PARSER;
                    if (parser == null) {
                        synchronized (OAuthContinuation.class) {
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

        public LegacyContinuation getLegacy() {
            LegacyContinuation legacyContinuation = this.legacy_;
            return legacyContinuation == null ? LegacyContinuation.getDefaultInstance() : legacyContinuation;
        }

        public String getLinkToken() {
            return this.linkToken_;
        }

        public ByteString getLinkTokenBytes() {
            return ByteString.copyFromUtf8(this.linkToken_);
        }

        public String getResponseRedirectUri() {
            return this.responseRedirectUri_;
        }

        public ByteString getResponseRedirectUriBytes() {
            return ByteString.copyFromUtf8(this.responseRedirectUri_);
        }

        public boolean hasLegacy() {
            return this.legacy_ != null;
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<OAuthContinuation, a> implements MessageLiteOrBuilder {
            public a() {
                super(OAuthContinuation.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((OAuthContinuation) this.instance).setLinkToken(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((OAuthContinuation) this.instance).setResponseRedirectUri(str);
                return this;
            }

            public a a(LegacyContinuation.a aVar) {
                copyOnWrite();
                ((OAuthContinuation) this.instance).setLegacy(aVar.build());
                return this;
            }
        }

        public static a newBuilder(OAuthContinuation oAuthContinuation) {
            return DEFAULT_INSTANCE.createBuilder(oAuthContinuation);
        }

        public static OAuthContinuation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthContinuation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OAuthContinuation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OAuthContinuation parseFrom(ByteString byteString) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OAuthContinuation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OAuthContinuation parseFrom(byte[] bArr) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OAuthContinuation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OAuthContinuation parseFrom(InputStream inputStream) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OAuthContinuation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OAuthContinuation parseFrom(CodedInputStream codedInputStream) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OAuthContinuation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        LINK_CONFIGURATION(4),
        LINK_TOKEN_CONFIGURATION(6),
        OAUTH_CONTINUATION(7),
        LINK_HOSTED_TRUSTED_AUTH_CONFIGURATION(9),
        CONFIGURATION_NOT_SET(0);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f18307a;

        b(int i11) {
            this.f18307a = i11;
        }

        public static b forNumber(int i11) {
            if (i11 != 0) {
                if (i11 != 4) {
                    if (i11 != 9) {
                        if (i11 != 6) {
                            if (i11 != 7) {
                                return null;
                            }
                            return OAUTH_CONTINUATION;
                        }
                        return LINK_TOKEN_CONFIGURATION;
                    }
                    return LINK_HOSTED_TRUSTED_AUTH_CONFIGURATION;
                }
                return LINK_CONFIGURATION;
            }
            return CONFIGURATION_NOT_SET;
        }

        public int getNumber() {
            return this.f18307a;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final MapEntryLite<String, String> f18308a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f18308a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    static {
        Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest = new Workflow$LinkWorkflowStartRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowStartRequest;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowStartRequest.class, workflow$LinkWorkflowStartRequest);
    }

    private Workflow$LinkWorkflowStartRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientCapabilities() {
        this.clientCapabilities_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfiguration() {
        this.configurationCase_ = 0;
        this.configuration_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceMetadata() {
        this.deviceMetadata_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkConfiguration() {
        if (this.configurationCase_ == 4) {
            this.configurationCase_ = 0;
            this.configuration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkHostedTrustedAuthConfiguration() {
        if (this.configurationCase_ == 9) {
            this.configurationCase_ = 0;
            this.configuration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkTokenConfiguration() {
        if (this.configurationCase_ == 6) {
            this.configurationCase_ = 0;
            this.configuration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOauthContinuation() {
        if (this.configurationCase_ == 7) {
            this.configurationCase_ = 0;
            this.configuration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkMetadata() {
        this.sdkMetadata_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorkflowVersionOverride() {
        this.workflowVersionOverride_ = getDefaultInstance().getWorkflowVersionOverride();
    }

    public static Workflow$LinkWorkflowStartRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableForcedVariantsMap() {
        return internalGetMutableForcedVariants();
    }

    private MapFieldLite<String, String> internalGetForcedVariants() {
        return this.forcedVariants_;
    }

    private MapFieldLite<String, String> internalGetMutableForcedVariants() {
        if (!this.forcedVariants_.isMutable()) {
            this.forcedVariants_ = this.forcedVariants_.mutableCopy();
        }
        return this.forcedVariants_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientCapabilities(Configuration$ClientCapabilities configuration$ClientCapabilities) {
        configuration$ClientCapabilities.getClass();
        Configuration$ClientCapabilities configuration$ClientCapabilities2 = this.clientCapabilities_;
        if (configuration$ClientCapabilities2 != null && configuration$ClientCapabilities2 != Configuration$ClientCapabilities.getDefaultInstance()) {
            this.clientCapabilities_ = Configuration$ClientCapabilities.newBuilder(this.clientCapabilities_).mergeFrom((Configuration$ClientCapabilities.a) configuration$ClientCapabilities).buildPartial();
        } else {
            this.clientCapabilities_ = configuration$ClientCapabilities;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceMetadata(Configuration$DeviceMetadata configuration$DeviceMetadata) {
        configuration$DeviceMetadata.getClass();
        Configuration$DeviceMetadata configuration$DeviceMetadata2 = this.deviceMetadata_;
        if (configuration$DeviceMetadata2 != null && configuration$DeviceMetadata2 != Configuration$DeviceMetadata.getDefaultInstance()) {
            this.deviceMetadata_ = Configuration$DeviceMetadata.newBuilder(this.deviceMetadata_).mergeFrom((Configuration$DeviceMetadata.a) configuration$DeviceMetadata).buildPartial();
        } else {
            this.deviceMetadata_ = configuration$DeviceMetadata;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLinkConfiguration(Configuration$LinkConfiguration configuration$LinkConfiguration) {
        configuration$LinkConfiguration.getClass();
        if (this.configurationCase_ == 4 && this.configuration_ != Configuration$LinkConfiguration.getDefaultInstance()) {
            this.configuration_ = Configuration$LinkConfiguration.newBuilder((Configuration$LinkConfiguration) this.configuration_).mergeFrom((Configuration$LinkConfiguration.b) configuration$LinkConfiguration).buildPartial();
        } else {
            this.configuration_ = configuration$LinkConfiguration;
        }
        this.configurationCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLinkHostedTrustedAuthConfiguration(Configuration$LinkHostedTrustedAuthConfiguration configuration$LinkHostedTrustedAuthConfiguration) {
        configuration$LinkHostedTrustedAuthConfiguration.getClass();
        if (this.configurationCase_ == 9 && this.configuration_ != Configuration$LinkHostedTrustedAuthConfiguration.getDefaultInstance()) {
            this.configuration_ = Configuration$LinkHostedTrustedAuthConfiguration.newBuilder((Configuration$LinkHostedTrustedAuthConfiguration) this.configuration_).mergeFrom((Configuration$LinkHostedTrustedAuthConfiguration.a) configuration$LinkHostedTrustedAuthConfiguration).buildPartial();
        } else {
            this.configuration_ = configuration$LinkHostedTrustedAuthConfiguration;
        }
        this.configurationCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLinkTokenConfiguration(Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration) {
        configuration$LinkTokenConfiguration.getClass();
        if (this.configurationCase_ == 6 && this.configuration_ != Configuration$LinkTokenConfiguration.getDefaultInstance()) {
            this.configuration_ = Configuration$LinkTokenConfiguration.newBuilder((Configuration$LinkTokenConfiguration) this.configuration_).mergeFrom((Configuration$LinkTokenConfiguration.a) configuration$LinkTokenConfiguration).buildPartial();
        } else {
            this.configuration_ = configuration$LinkTokenConfiguration;
        }
        this.configurationCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOauthContinuation(OAuthContinuation oAuthContinuation) {
        oAuthContinuation.getClass();
        if (this.configurationCase_ == 7 && this.configuration_ != OAuthContinuation.getDefaultInstance()) {
            this.configuration_ = OAuthContinuation.newBuilder((OAuthContinuation) this.configuration_).mergeFrom((OAuthContinuation.a) oAuthContinuation).buildPartial();
        } else {
            this.configuration_ = oAuthContinuation;
        }
        this.configurationCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSdkMetadata(Configuration$SDKMetadata configuration$SDKMetadata) {
        configuration$SDKMetadata.getClass();
        Configuration$SDKMetadata configuration$SDKMetadata2 = this.sdkMetadata_;
        if (configuration$SDKMetadata2 != null && configuration$SDKMetadata2 != Configuration$SDKMetadata.getDefaultInstance()) {
            this.sdkMetadata_ = Configuration$SDKMetadata.newBuilder(this.sdkMetadata_).mergeFrom((Configuration$SDKMetadata.a) configuration$SDKMetadata).buildPartial();
        } else {
            this.sdkMetadata_ = configuration$SDKMetadata;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowStartRequest parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowStartRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientCapabilities(Configuration$ClientCapabilities configuration$ClientCapabilities) {
        configuration$ClientCapabilities.getClass();
        this.clientCapabilities_ = configuration$ClientCapabilities;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceMetadata(Configuration$DeviceMetadata configuration$DeviceMetadata) {
        configuration$DeviceMetadata.getClass();
        this.deviceMetadata_ = configuration$DeviceMetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkConfiguration(Configuration$LinkConfiguration configuration$LinkConfiguration) {
        configuration$LinkConfiguration.getClass();
        this.configuration_ = configuration$LinkConfiguration;
        this.configurationCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkHostedTrustedAuthConfiguration(Configuration$LinkHostedTrustedAuthConfiguration configuration$LinkHostedTrustedAuthConfiguration) {
        configuration$LinkHostedTrustedAuthConfiguration.getClass();
        this.configuration_ = configuration$LinkHostedTrustedAuthConfiguration;
        this.configurationCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkTokenConfiguration(Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration) {
        configuration$LinkTokenConfiguration.getClass();
        this.configuration_ = configuration$LinkTokenConfiguration;
        this.configurationCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthContinuation(OAuthContinuation oAuthContinuation) {
        oAuthContinuation.getClass();
        this.configuration_ = oAuthContinuation;
        this.configurationCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkMetadata(Configuration$SDKMetadata configuration$SDKMetadata) {
        configuration$SDKMetadata.getClass();
        this.sdkMetadata_ = configuration$SDKMetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkflowVersionOverride(String str) {
        str.getClass();
        this.workflowVersionOverride_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkflowVersionOverrideBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.workflowVersionOverride_ = byteString.toStringUtf8();
    }

    public boolean containsForcedVariants(String str) {
        str.getClass();
        return internalGetForcedVariants().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (hd.f18720a[methodToInvoke.ordinal()]) {
            case 1:
                return new Workflow$LinkWorkflowStartRequest();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\n\t\u0001\u0000\u0000\u0001\t\u0002\t\u0004<\u0000\u0005Ȉ\u0006<\u0000\u0007<\u0000\b2\t<\u0000\n\t", new Object[]{"configuration_", "configurationCase_", "sdkMetadata_", "deviceMetadata_", Configuration$LinkConfiguration.class, "workflowVersionOverride_", Configuration$LinkTokenConfiguration.class, OAuthContinuation.class, "forcedVariants_", c.f18308a, Configuration$LinkHostedTrustedAuthConfiguration.class, "clientCapabilities_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowStartRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (Workflow$LinkWorkflowStartRequest.class) {
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

    public Configuration$ClientCapabilities getClientCapabilities() {
        Configuration$ClientCapabilities configuration$ClientCapabilities = this.clientCapabilities_;
        return configuration$ClientCapabilities == null ? Configuration$ClientCapabilities.getDefaultInstance() : configuration$ClientCapabilities;
    }

    public b getConfigurationCase() {
        return b.forNumber(this.configurationCase_);
    }

    public Configuration$DeviceMetadata getDeviceMetadata() {
        Configuration$DeviceMetadata configuration$DeviceMetadata = this.deviceMetadata_;
        return configuration$DeviceMetadata == null ? Configuration$DeviceMetadata.getDefaultInstance() : configuration$DeviceMetadata;
    }

    @Deprecated
    public Map<String, String> getForcedVariants() {
        return getForcedVariantsMap();
    }

    public int getForcedVariantsCount() {
        return internalGetForcedVariants().size();
    }

    public Map<String, String> getForcedVariantsMap() {
        return Collections.unmodifiableMap(internalGetForcedVariants());
    }

    public String getForcedVariantsOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetForcedVariants = internalGetForcedVariants();
        return internalGetForcedVariants.containsKey(str) ? internalGetForcedVariants.get(str) : str2;
    }

    public String getForcedVariantsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetForcedVariants = internalGetForcedVariants();
        if (internalGetForcedVariants.containsKey(str)) {
            return internalGetForcedVariants.get(str);
        }
        throw new IllegalArgumentException();
    }

    public Configuration$LinkConfiguration getLinkConfiguration() {
        if (this.configurationCase_ == 4) {
            return (Configuration$LinkConfiguration) this.configuration_;
        }
        return Configuration$LinkConfiguration.getDefaultInstance();
    }

    public Configuration$LinkHostedTrustedAuthConfiguration getLinkHostedTrustedAuthConfiguration() {
        if (this.configurationCase_ == 9) {
            return (Configuration$LinkHostedTrustedAuthConfiguration) this.configuration_;
        }
        return Configuration$LinkHostedTrustedAuthConfiguration.getDefaultInstance();
    }

    public Configuration$LinkTokenConfiguration getLinkTokenConfiguration() {
        if (this.configurationCase_ == 6) {
            return (Configuration$LinkTokenConfiguration) this.configuration_;
        }
        return Configuration$LinkTokenConfiguration.getDefaultInstance();
    }

    public OAuthContinuation getOauthContinuation() {
        if (this.configurationCase_ == 7) {
            return (OAuthContinuation) this.configuration_;
        }
        return OAuthContinuation.getDefaultInstance();
    }

    public Configuration$SDKMetadata getSdkMetadata() {
        Configuration$SDKMetadata configuration$SDKMetadata = this.sdkMetadata_;
        return configuration$SDKMetadata == null ? Configuration$SDKMetadata.getDefaultInstance() : configuration$SDKMetadata;
    }

    public String getWorkflowVersionOverride() {
        return this.workflowVersionOverride_;
    }

    public ByteString getWorkflowVersionOverrideBytes() {
        return ByteString.copyFromUtf8(this.workflowVersionOverride_);
    }

    public boolean hasClientCapabilities() {
        return this.clientCapabilities_ != null;
    }

    public boolean hasDeviceMetadata() {
        return this.deviceMetadata_ != null;
    }

    public boolean hasLinkConfiguration() {
        return this.configurationCase_ == 4;
    }

    public boolean hasLinkHostedTrustedAuthConfiguration() {
        return this.configurationCase_ == 9;
    }

    public boolean hasLinkTokenConfiguration() {
        return this.configurationCase_ == 6;
    }

    public boolean hasOauthContinuation() {
        return this.configurationCase_ == 7;
    }

    public boolean hasSdkMetadata() {
        return this.sdkMetadata_ != null;
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowStartRequest, a> implements MessageLiteOrBuilder {
        public a() {
            super(Workflow$LinkWorkflowStartRequest.DEFAULT_INSTANCE);
        }

        public a a(Configuration$SDKMetadata configuration$SDKMetadata) {
            copyOnWrite();
            ((Workflow$LinkWorkflowStartRequest) this.instance).setSdkMetadata(configuration$SDKMetadata);
            return this;
        }

        public a a(Configuration$DeviceMetadata configuration$DeviceMetadata) {
            copyOnWrite();
            ((Workflow$LinkWorkflowStartRequest) this.instance).setDeviceMetadata(configuration$DeviceMetadata);
            return this;
        }

        public a a(Configuration$LinkConfiguration.b bVar) {
            copyOnWrite();
            ((Workflow$LinkWorkflowStartRequest) this.instance).setLinkConfiguration(bVar.build());
            return this;
        }

        public a a(Configuration$LinkTokenConfiguration.a aVar) {
            copyOnWrite();
            ((Workflow$LinkWorkflowStartRequest) this.instance).setLinkTokenConfiguration(aVar.build());
            return this;
        }

        public a a(OAuthContinuation.a aVar) {
            copyOnWrite();
            ((Workflow$LinkWorkflowStartRequest) this.instance).setOauthContinuation(aVar.build());
            return this;
        }

        public a a(String str) {
            copyOnWrite();
            ((Workflow$LinkWorkflowStartRequest) this.instance).setWorkflowVersionOverride(str);
            return this;
        }
    }

    public static a newBuilder(Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowStartRequest);
    }

    public static Workflow$LinkWorkflowStartRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}