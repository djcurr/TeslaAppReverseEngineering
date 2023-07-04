package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.c1;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Common$SDKEvent extends GeneratedMessageLite<Common$SDKEvent, a> implements b {
    private static final Common$SDKEvent DEFAULT_INSTANCE;
    public static final int EVENT_NAME_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 2;
    private static volatile Parser<Common$SDKEvent> PARSER = null;
    public static final int WEBVIEW_REDIRECT_URI_FIELD_NUMBER = 3;
    private Metadata metadata_;
    private String eventName_ = "";
    private String webviewRedirectUri_ = "";

    /* loaded from: classes2.dex */
    public static final class Metadata extends GeneratedMessageLite<Metadata, a> implements MessageLiteOrBuilder {
        public static final int BRAND_NAME_FIELD_NUMBER = 14;
        private static final Metadata DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 1;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
        public static final int ERROR_TYPE_FIELD_NUMBER = 3;
        public static final int EXIT_STATUS_FIELD_NUMBER = 4;
        public static final int INSTITUTION_ID_FIELD_NUMBER = 5;
        public static final int INSTITUTION_NAME_FIELD_NUMBER = 6;
        public static final int INSTITUTION_SEARCH_QUERY_FIELD_NUMBER = 7;
        public static final int LINK_SESSION_ID_FIELD_NUMBER = 9;
        public static final int MFA_TYPE_FIELD_NUMBER = 10;
        private static volatile Parser<Metadata> PARSER = null;
        public static final int REQUEST_ID_FIELD_NUMBER = 8;
        public static final int SELECTION_FIELD_NUMBER = 13;
        public static final int TIMESTAMP_FIELD_NUMBER = 12;
        public static final int VIEW_NAME_FIELD_NUMBER = 11;
        private String errorCode_ = "";
        private String errorMessage_ = "";
        private String errorType_ = "";
        private String exitStatus_ = "";
        private String institutionId_ = "";
        private String institutionName_ = "";
        private String institutionSearchQuery_ = "";
        private String requestId_ = "";
        private String linkSessionId_ = "";
        private String mfaType_ = "";
        private String viewName_ = "";
        private String timestamp_ = "";
        private String selection_ = "";
        private String brandName_ = "";

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<Metadata, a> implements MessageLiteOrBuilder {
            public a() {
                super(Metadata.DEFAULT_INSTANCE);
            }
        }

        static {
            Metadata metadata = new Metadata();
            DEFAULT_INSTANCE = metadata;
            GeneratedMessageLite.registerDefaultInstance(Metadata.class, metadata);
        }

        private Metadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBrandName() {
            this.brandName_ = getDefaultInstance().getBrandName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = getDefaultInstance().getErrorCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorMessage() {
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorType() {
            this.errorType_ = getDefaultInstance().getErrorType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExitStatus() {
            this.exitStatus_ = getDefaultInstance().getExitStatus();
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
        public void clearLinkSessionId() {
            this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMfaType() {
            this.mfaType_ = getDefaultInstance().getMfaType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequestId() {
            this.requestId_ = getDefaultInstance().getRequestId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSelection() {
            this.selection_ = getDefaultInstance().getSelection();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = getDefaultInstance().getTimestamp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearViewName() {
            this.viewName_ = getDefaultInstance().getViewName();
        }

        public static Metadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Metadata parseDelimitedFrom(InputStream inputStream) {
            return (Metadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Metadata parseFrom(ByteBuffer byteBuffer) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Metadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrandName(String str) {
            str.getClass();
            this.brandName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrandNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.brandName_ = byteString.toStringUtf8();
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
        public void setErrorMessage(String str) {
            str.getClass();
            this.errorMessage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorMessageBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.errorMessage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorType(String str) {
            str.getClass();
            this.errorType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorTypeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.errorType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExitStatus(String str) {
            str.getClass();
            this.exitStatus_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExitStatusBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.exitStatus_ = byteString.toStringUtf8();
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
        public void setMfaType(String str) {
            str.getClass();
            this.mfaType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMfaTypeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.mfaType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestId(String str) {
            str.getClass();
            this.requestId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.requestId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSelection(String str) {
            str.getClass();
            this.selection_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSelectionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.selection_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(String str) {
            str.getClass();
            this.timestamp_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestampBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.timestamp_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setViewName(String str) {
            str.getClass();
            this.viewName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setViewNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.viewName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (c1.f18233a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Metadata();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000eȈ", new Object[]{"errorCode_", "errorMessage_", "errorType_", "exitStatus_", "institutionId_", "institutionName_", "institutionSearchQuery_", "requestId_", "linkSessionId_", "mfaType_", "viewName_", "timestamp_", "selection_", "brandName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Metadata> parser = PARSER;
                    if (parser == null) {
                        synchronized (Metadata.class) {
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

        public String getBrandName() {
            return this.brandName_;
        }

        public ByteString getBrandNameBytes() {
            return ByteString.copyFromUtf8(this.brandName_);
        }

        public String getErrorCode() {
            return this.errorCode_;
        }

        public ByteString getErrorCodeBytes() {
            return ByteString.copyFromUtf8(this.errorCode_);
        }

        public String getErrorMessage() {
            return this.errorMessage_;
        }

        public ByteString getErrorMessageBytes() {
            return ByteString.copyFromUtf8(this.errorMessage_);
        }

        public String getErrorType() {
            return this.errorType_;
        }

        public ByteString getErrorTypeBytes() {
            return ByteString.copyFromUtf8(this.errorType_);
        }

        public String getExitStatus() {
            return this.exitStatus_;
        }

        public ByteString getExitStatusBytes() {
            return ByteString.copyFromUtf8(this.exitStatus_);
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

        public String getLinkSessionId() {
            return this.linkSessionId_;
        }

        public ByteString getLinkSessionIdBytes() {
            return ByteString.copyFromUtf8(this.linkSessionId_);
        }

        public String getMfaType() {
            return this.mfaType_;
        }

        public ByteString getMfaTypeBytes() {
            return ByteString.copyFromUtf8(this.mfaType_);
        }

        public String getRequestId() {
            return this.requestId_;
        }

        public ByteString getRequestIdBytes() {
            return ByteString.copyFromUtf8(this.requestId_);
        }

        public String getSelection() {
            return this.selection_;
        }

        public ByteString getSelectionBytes() {
            return ByteString.copyFromUtf8(this.selection_);
        }

        public String getTimestamp() {
            return this.timestamp_;
        }

        public ByteString getTimestampBytes() {
            return ByteString.copyFromUtf8(this.timestamp_);
        }

        public String getViewName() {
            return this.viewName_;
        }

        public ByteString getViewNameBytes() {
            return ByteString.copyFromUtf8(this.viewName_);
        }

        public static a newBuilder(Metadata metadata) {
            return DEFAULT_INSTANCE.createBuilder(metadata);
        }

        public static Metadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Metadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Metadata parseFrom(ByteString byteString) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Metadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Metadata parseFrom(byte[] bArr) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Metadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Metadata parseFrom(InputStream inputStream) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Metadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Metadata parseFrom(CodedInputStream codedInputStream) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Metadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$SDKEvent, a> implements b {
        public a() {
            super(Common$SDKEvent.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$SDKEvent common$SDKEvent = new Common$SDKEvent();
        DEFAULT_INSTANCE = common$SDKEvent;
        GeneratedMessageLite.registerDefaultInstance(Common$SDKEvent.class, common$SDKEvent);
    }

    private Common$SDKEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventName() {
        this.eventName_ = getDefaultInstance().getEventName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebviewRedirectUri() {
        this.webviewRedirectUri_ = getDefaultInstance().getWebviewRedirectUri();
    }

    public static Common$SDKEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(Metadata metadata) {
        metadata.getClass();
        Metadata metadata2 = this.metadata_;
        if (metadata2 != null && metadata2 != Metadata.getDefaultInstance()) {
            this.metadata_ = Metadata.newBuilder(this.metadata_).mergeFrom((Metadata.a) metadata).buildPartial();
        } else {
            this.metadata_ = metadata;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$SDKEvent parseDelimitedFrom(InputStream inputStream) {
        return (Common$SDKEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SDKEvent parseFrom(ByteBuffer byteBuffer) {
        return (Common$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$SDKEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setMetadata(Metadata metadata) {
        metadata.getClass();
        this.metadata_ = metadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewRedirectUri(String str) {
        str.getClass();
        this.webviewRedirectUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewRedirectUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewRedirectUri_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$SDKEvent();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003Ȉ", new Object[]{"eventName_", "metadata_", "webviewRedirectUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$SDKEvent> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$SDKEvent.class) {
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

    public String getEventName() {
        return this.eventName_;
    }

    public ByteString getEventNameBytes() {
        return ByteString.copyFromUtf8(this.eventName_);
    }

    public Metadata getMetadata() {
        Metadata metadata = this.metadata_;
        return metadata == null ? Metadata.getDefaultInstance() : metadata;
    }

    public String getWebviewRedirectUri() {
        return this.webviewRedirectUri_;
    }

    public ByteString getWebviewRedirectUriBytes() {
        return ByteString.copyFromUtf8(this.webviewRedirectUri_);
    }

    public boolean hasMetadata() {
        return this.metadata_ != null;
    }

    public static a newBuilder(Common$SDKEvent common$SDKEvent) {
        return DEFAULT_INSTANCE.createBuilder(common$SDKEvent);
    }

    public static Common$SDKEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SDKEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$SDKEvent parseFrom(ByteString byteString) {
        return (Common$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$SDKEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$SDKEvent parseFrom(byte[] bArr) {
        return (Common$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$SDKEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$SDKEvent parseFrom(InputStream inputStream) {
        return (Common$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SDKEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SDKEvent parseFrom(CodedInputStream codedInputStream) {
        return (Common$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$SDKEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}