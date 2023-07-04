package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.hd;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Workflow$LinkWorkflowPollResponse extends GeneratedMessageLite<Workflow$LinkWorkflowPollResponse, a> implements MessageLiteOrBuilder {
    private static final Workflow$LinkWorkflowPollResponse DEFAULT_INSTANCE;
    public static final int OAUTH_REDIRECT_COMPLETE_FIELD_NUMBER = 3;
    private static volatile Parser<Workflow$LinkWorkflowPollResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private Object response_;
    private int responseCase_ = 0;
    private String workflowSessionId_ = "";
    private String requestId_ = "";

    /* loaded from: classes2.dex */
    public static final class OAuthRedirectComplete extends GeneratedMessageLite<OAuthRedirectComplete, a> implements MessageLiteOrBuilder {
        private static final OAuthRedirectComplete DEFAULT_INSTANCE;
        public static final int IS_COMPLETE_FIELD_NUMBER = 1;
        private static volatile Parser<OAuthRedirectComplete> PARSER;
        private boolean isComplete_;

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<OAuthRedirectComplete, a> implements MessageLiteOrBuilder {
            public a() {
                super(OAuthRedirectComplete.DEFAULT_INSTANCE);
            }
        }

        static {
            OAuthRedirectComplete oAuthRedirectComplete = new OAuthRedirectComplete();
            DEFAULT_INSTANCE = oAuthRedirectComplete;
            GeneratedMessageLite.registerDefaultInstance(OAuthRedirectComplete.class, oAuthRedirectComplete);
        }

        private OAuthRedirectComplete() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsComplete() {
            this.isComplete_ = false;
        }

        public static OAuthRedirectComplete getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OAuthRedirectComplete parseDelimitedFrom(InputStream inputStream) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OAuthRedirectComplete parseFrom(ByteBuffer byteBuffer) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OAuthRedirectComplete> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsComplete(boolean z11) {
            this.isComplete_ = z11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OAuthRedirectComplete();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isComplete_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OAuthRedirectComplete> parser = PARSER;
                    if (parser == null) {
                        synchronized (OAuthRedirectComplete.class) {
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

        public boolean getIsComplete() {
            return this.isComplete_;
        }

        public static a newBuilder(OAuthRedirectComplete oAuthRedirectComplete) {
            return DEFAULT_INSTANCE.createBuilder(oAuthRedirectComplete);
        }

        public static OAuthRedirectComplete parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OAuthRedirectComplete parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OAuthRedirectComplete parseFrom(ByteString byteString) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OAuthRedirectComplete parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OAuthRedirectComplete parseFrom(byte[] bArr) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OAuthRedirectComplete parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OAuthRedirectComplete parseFrom(InputStream inputStream) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OAuthRedirectComplete parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OAuthRedirectComplete parseFrom(CodedInputStream codedInputStream) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OAuthRedirectComplete parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowPollResponse, a> implements MessageLiteOrBuilder {
        public a() {
            super(Workflow$LinkWorkflowPollResponse.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        OAUTH_REDIRECT_COMPLETE(3),
        RESPONSE_NOT_SET(0);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f18305a;

        b(int i11) {
            this.f18305a = i11;
        }

        public static b forNumber(int i11) {
            if (i11 != 0) {
                if (i11 != 3) {
                    return null;
                }
                return OAUTH_REDIRECT_COMPLETE;
            }
            return RESPONSE_NOT_SET;
        }

        public int getNumber() {
            return this.f18305a;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        Workflow$LinkWorkflowPollResponse workflow$LinkWorkflowPollResponse = new Workflow$LinkWorkflowPollResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowPollResponse;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowPollResponse.class, workflow$LinkWorkflowPollResponse);
    }

    private Workflow$LinkWorkflowPollResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOauthRedirectComplete() {
        if (this.responseCase_ == 3) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponse() {
        this.responseCase_ = 0;
        this.response_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    public static Workflow$LinkWorkflowPollResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOauthRedirectComplete(OAuthRedirectComplete oAuthRedirectComplete) {
        oAuthRedirectComplete.getClass();
        if (this.responseCase_ == 3 && this.response_ != OAuthRedirectComplete.getDefaultInstance()) {
            this.response_ = OAuthRedirectComplete.newBuilder((OAuthRedirectComplete) this.response_).mergeFrom((OAuthRedirectComplete.a) oAuthRedirectComplete).buildPartial();
        } else {
            this.response_ = oAuthRedirectComplete;
        }
        this.responseCase_ = 3;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowPollResponse parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowPollResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthRedirectComplete(OAuthRedirectComplete oAuthRedirectComplete) {
        oAuthRedirectComplete.getClass();
        this.response_ = oAuthRedirectComplete;
        this.responseCase_ = 3;
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
    public void setWorkflowSessionId(String str) {
        str.getClass();
        this.workflowSessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkflowSessionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.workflowSessionId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (hd.f18720a[methodToInvoke.ordinal()]) {
            case 1:
                return new Workflow$LinkWorkflowPollResponse();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000", new Object[]{"response_", "responseCase_", "workflowSessionId_", "requestId_", OAuthRedirectComplete.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowPollResponse> parser = PARSER;
                if (parser == null) {
                    synchronized (Workflow$LinkWorkflowPollResponse.class) {
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

    public OAuthRedirectComplete getOauthRedirectComplete() {
        if (this.responseCase_ == 3) {
            return (OAuthRedirectComplete) this.response_;
        }
        return OAuthRedirectComplete.getDefaultInstance();
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public b getResponseCase() {
        return b.forNumber(this.responseCase_);
    }

    public String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public ByteString getWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public boolean hasOauthRedirectComplete() {
        return this.responseCase_ == 3;
    }

    public static a newBuilder(Workflow$LinkWorkflowPollResponse workflow$LinkWorkflowPollResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowPollResponse);
    }

    public static Workflow$LinkWorkflowPollResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}