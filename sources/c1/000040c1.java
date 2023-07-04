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
public final class Workflow$LinkWorkflowSearchRequest extends GeneratedMessageLite<Workflow$LinkWorkflowSearchRequest, a> implements MessageLiteOrBuilder {
    public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 4;
    private static final Workflow$LinkWorkflowSearchRequest DEFAULT_INSTANCE;
    public static final int PANE_NODE_ID_FIELD_NUMBER = 3;
    public static final int PANE_RENDERING_ID_FIELD_NUMBER = 2;
    private static volatile Parser<Workflow$LinkWorkflowSearchRequest> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private String workflowSessionId_ = "";
    private String paneRenderingId_ = "";
    private String paneNodeId_ = "";
    private String continuationToken_ = "";
    private String query_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowSearchRequest, a> implements MessageLiteOrBuilder {
        public a() {
            super(Workflow$LinkWorkflowSearchRequest.DEFAULT_INSTANCE);
        }

        public a a(String str) {
            copyOnWrite();
            ((Workflow$LinkWorkflowSearchRequest) this.instance).setContinuationToken(str);
            return this;
        }

        public a b(String str) {
            copyOnWrite();
            ((Workflow$LinkWorkflowSearchRequest) this.instance).setPaneNodeId(str);
            return this;
        }

        public a c(String str) {
            copyOnWrite();
            ((Workflow$LinkWorkflowSearchRequest) this.instance).setPaneRenderingId(str);
            return this;
        }

        public a d(String str) {
            copyOnWrite();
            ((Workflow$LinkWorkflowSearchRequest) this.instance).setQuery(str);
            return this;
        }

        public a e(String str) {
            copyOnWrite();
            ((Workflow$LinkWorkflowSearchRequest) this.instance).setWorkflowSessionId(str);
            return this;
        }
    }

    static {
        Workflow$LinkWorkflowSearchRequest workflow$LinkWorkflowSearchRequest = new Workflow$LinkWorkflowSearchRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowSearchRequest;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowSearchRequest.class, workflow$LinkWorkflowSearchRequest);
    }

    private Workflow$LinkWorkflowSearchRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContinuationToken() {
        this.continuationToken_ = getDefaultInstance().getContinuationToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaneNodeId() {
        this.paneNodeId_ = getDefaultInstance().getPaneNodeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaneRenderingId() {
        this.paneRenderingId_ = getDefaultInstance().getPaneRenderingId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        this.query_ = getDefaultInstance().getQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    public static Workflow$LinkWorkflowSearchRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowSearchRequest parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowSearchRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContinuationToken(String str) {
        str.getClass();
        this.continuationToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContinuationTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.continuationToken_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaneNodeId(String str) {
        str.getClass();
        this.paneNodeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaneNodeIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.paneNodeId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaneRenderingId(String str) {
        str.getClass();
        this.paneRenderingId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaneRenderingIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.paneRenderingId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(String str) {
        str.getClass();
        this.query_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.query_ = byteString.toStringUtf8();
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
                return new Workflow$LinkWorkflowSearchRequest();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"workflowSessionId_", "paneRenderingId_", "paneNodeId_", "continuationToken_", "query_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowSearchRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (Workflow$LinkWorkflowSearchRequest.class) {
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

    public String getContinuationToken() {
        return this.continuationToken_;
    }

    public ByteString getContinuationTokenBytes() {
        return ByteString.copyFromUtf8(this.continuationToken_);
    }

    public String getPaneNodeId() {
        return this.paneNodeId_;
    }

    public ByteString getPaneNodeIdBytes() {
        return ByteString.copyFromUtf8(this.paneNodeId_);
    }

    public String getPaneRenderingId() {
        return this.paneRenderingId_;
    }

    public ByteString getPaneRenderingIdBytes() {
        return ByteString.copyFromUtf8(this.paneRenderingId_);
    }

    public String getQuery() {
        return this.query_;
    }

    public ByteString getQueryBytes() {
        return ByteString.copyFromUtf8(this.query_);
    }

    public String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public ByteString getWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public static a newBuilder(Workflow$LinkWorkflowSearchRequest workflow$LinkWorkflowSearchRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowSearchRequest);
    }

    public static Workflow$LinkWorkflowSearchRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}