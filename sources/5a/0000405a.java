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
public final class Workflow$LinkWorkflowEnabledResponse extends GeneratedMessageLite<Workflow$LinkWorkflowEnabledResponse, a> implements MessageLiteOrBuilder {
    private static final Workflow$LinkWorkflowEnabledResponse DEFAULT_INSTANCE;
    public static final int IS_ENABLED_FIELD_NUMBER = 1;
    private static volatile Parser<Workflow$LinkWorkflowEnabledResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    public static final int VARIATION_FIELD_NUMBER = 4;
    private boolean isEnabled_;
    private String requestId_ = "";
    private String variation_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowEnabledResponse, a> implements MessageLiteOrBuilder {
        public a() {
            super(Workflow$LinkWorkflowEnabledResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        Workflow$LinkWorkflowEnabledResponse workflow$LinkWorkflowEnabledResponse = new Workflow$LinkWorkflowEnabledResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowEnabledResponse;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowEnabledResponse.class, workflow$LinkWorkflowEnabledResponse);
    }

    private Workflow$LinkWorkflowEnabledResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsEnabled() {
        this.isEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVariation() {
        this.variation_ = getDefaultInstance().getVariation();
    }

    public static Workflow$LinkWorkflowEnabledResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowEnabledResponse parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowEnabledResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsEnabled(boolean z11) {
        this.isEnabled_ = z11;
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
    public void setVariation(String str) {
        str.getClass();
        this.variation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVariationBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.variation_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (hd.f18720a[methodToInvoke.ordinal()]) {
            case 1:
                return new Workflow$LinkWorkflowEnabledResponse();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0004Ȉ", new Object[]{"isEnabled_", "requestId_", "variation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowEnabledResponse> parser = PARSER;
                if (parser == null) {
                    synchronized (Workflow$LinkWorkflowEnabledResponse.class) {
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

    public boolean getIsEnabled() {
        return this.isEnabled_;
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public String getVariation() {
        return this.variation_;
    }

    public ByteString getVariationBytes() {
        return ByteString.copyFromUtf8(this.variation_);
    }

    public static a newBuilder(Workflow$LinkWorkflowEnabledResponse workflow$LinkWorkflowEnabledResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowEnabledResponse);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}