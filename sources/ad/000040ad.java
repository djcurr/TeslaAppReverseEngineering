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
public final class Workflow$LinkWorkflowPollRequest extends GeneratedMessageLite<Workflow$LinkWorkflowPollRequest, a> implements MessageLiteOrBuilder {
    private static final Workflow$LinkWorkflowPollRequest DEFAULT_INSTANCE;
    public static final int OAUTH_REDIRECT_COMPLETE_FIELD_NUMBER = 2;
    private static volatile Parser<Workflow$LinkWorkflowPollRequest> PARSER = null;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private Object poll_;
    private int pollCase_ = 0;
    private String workflowSessionId_ = "";

    /* loaded from: classes2.dex */
    public static final class OAuthRedirectComplete extends GeneratedMessageLite<OAuthRedirectComplete, a> implements MessageLiteOrBuilder {
        private static final OAuthRedirectComplete DEFAULT_INSTANCE;
        public static final int OAUTH_STATE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<OAuthRedirectComplete> PARSER;
        private String oauthStateId_ = "";

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<OAuthRedirectComplete, a> implements MessageLiteOrBuilder {
            public a() {
                super(OAuthRedirectComplete.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((OAuthRedirectComplete) this.instance).setOauthStateId(str);
                return this;
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
        public void clearOauthStateId() {
            this.oauthStateId_ = getDefaultInstance().getOauthStateId();
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
                    return new OAuthRedirectComplete();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"oauthStateId_"});
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

        public String getOauthStateId() {
            return this.oauthStateId_;
        }

        public ByteString getOauthStateIdBytes() {
            return ByteString.copyFromUtf8(this.oauthStateId_);
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
    public enum b {
        OAUTH_REDIRECT_COMPLETE(2),
        POLL_NOT_SET(0);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f18303a;

        b(int i11) {
            this.f18303a = i11;
        }

        public static b forNumber(int i11) {
            if (i11 != 0) {
                if (i11 != 2) {
                    return null;
                }
                return OAUTH_REDIRECT_COMPLETE;
            }
            return POLL_NOT_SET;
        }

        public int getNumber() {
            return this.f18303a;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        Workflow$LinkWorkflowPollRequest workflow$LinkWorkflowPollRequest = new Workflow$LinkWorkflowPollRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowPollRequest;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowPollRequest.class, workflow$LinkWorkflowPollRequest);
    }

    private Workflow$LinkWorkflowPollRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOauthRedirectComplete() {
        if (this.pollCase_ == 2) {
            this.pollCase_ = 0;
            this.poll_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoll() {
        this.pollCase_ = 0;
        this.poll_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    public static Workflow$LinkWorkflowPollRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOauthRedirectComplete(OAuthRedirectComplete oAuthRedirectComplete) {
        oAuthRedirectComplete.getClass();
        if (this.pollCase_ == 2 && this.poll_ != OAuthRedirectComplete.getDefaultInstance()) {
            this.poll_ = OAuthRedirectComplete.newBuilder((OAuthRedirectComplete) this.poll_).mergeFrom((OAuthRedirectComplete.a) oAuthRedirectComplete).buildPartial();
        } else {
            this.poll_ = oAuthRedirectComplete;
        }
        this.pollCase_ = 2;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowPollRequest parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowPollRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthRedirectComplete(OAuthRedirectComplete oAuthRedirectComplete) {
        oAuthRedirectComplete.getClass();
        this.poll_ = oAuthRedirectComplete;
        this.pollCase_ = 2;
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
                return new Workflow$LinkWorkflowPollRequest();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"poll_", "pollCase_", "workflowSessionId_", OAuthRedirectComplete.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowPollRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (Workflow$LinkWorkflowPollRequest.class) {
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
        if (this.pollCase_ == 2) {
            return (OAuthRedirectComplete) this.poll_;
        }
        return OAuthRedirectComplete.getDefaultInstance();
    }

    public b getPollCase() {
        return b.forNumber(this.pollCase_);
    }

    public String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public ByteString getWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public boolean hasOauthRedirectComplete() {
        return this.pollCase_ == 2;
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowPollRequest, a> implements MessageLiteOrBuilder {
        public a() {
            super(Workflow$LinkWorkflowPollRequest.DEFAULT_INSTANCE);
        }

        public a a(String str) {
            copyOnWrite();
            ((Workflow$LinkWorkflowPollRequest) this.instance).setWorkflowSessionId(str);
            return this;
        }

        public a a(OAuthRedirectComplete oAuthRedirectComplete) {
            copyOnWrite();
            ((Workflow$LinkWorkflowPollRequest) this.instance).setOauthRedirectComplete(oAuthRedirectComplete);
            return this;
        }
    }

    public static a newBuilder(Workflow$LinkWorkflowPollRequest workflow$LinkWorkflowPollRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowPollRequest);
    }

    public static Workflow$LinkWorkflowPollRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}