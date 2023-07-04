package com.plaid.internal.core.protos.analyticalcore;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Analytical$RequestorFields extends GeneratedMessageLite<Analytical$RequestorFields, a> implements MessageLiteOrBuilder {
    private static final Analytical$RequestorFields DEFAULT_INSTANCE;
    public static final int IP_ADDRESS_FIELD_NUMBER = 1;
    private static volatile Parser<Analytical$RequestorFields> PARSER = null;
    public static final int USER_AGENT_FIELD_NUMBER = 2;
    private String ipAddress_ = "";
    private String userAgent_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Analytical$RequestorFields, a> implements MessageLiteOrBuilder {
        public a() {
            super(Analytical$RequestorFields.DEFAULT_INSTANCE);
        }
    }

    static {
        Analytical$RequestorFields analytical$RequestorFields = new Analytical$RequestorFields();
        DEFAULT_INSTANCE = analytical$RequestorFields;
        GeneratedMessageLite.registerDefaultInstance(Analytical$RequestorFields.class, analytical$RequestorFields);
    }

    private Analytical$RequestorFields() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIpAddress() {
        this.ipAddress_ = getDefaultInstance().getIpAddress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgent() {
        this.userAgent_ = getDefaultInstance().getUserAgent();
    }

    public static Analytical$RequestorFields getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Analytical$RequestorFields parseDelimitedFrom(InputStream inputStream) {
        return (Analytical$RequestorFields) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$RequestorFields parseFrom(ByteBuffer byteBuffer) {
        return (Analytical$RequestorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Analytical$RequestorFields> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIpAddress(String str) {
        str.getClass();
        this.ipAddress_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIpAddressBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ipAddress_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgent(String str) {
        str.getClass();
        this.userAgent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.userAgent_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.plaid.internal.a.f18151a[methodToInvoke.ordinal()]) {
            case 1:
                return new Analytical$RequestorFields();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"ipAddress_", "userAgent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Analytical$RequestorFields> parser = PARSER;
                if (parser == null) {
                    synchronized (Analytical$RequestorFields.class) {
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

    public String getIpAddress() {
        return this.ipAddress_;
    }

    public ByteString getIpAddressBytes() {
        return ByteString.copyFromUtf8(this.ipAddress_);
    }

    public String getUserAgent() {
        return this.userAgent_;
    }

    public ByteString getUserAgentBytes() {
        return ByteString.copyFromUtf8(this.userAgent_);
    }

    public static a newBuilder(Analytical$RequestorFields analytical$RequestorFields) {
        return DEFAULT_INSTANCE.createBuilder(analytical$RequestorFields);
    }

    public static Analytical$RequestorFields parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$RequestorFields) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$RequestorFields parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$RequestorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Analytical$RequestorFields parseFrom(ByteString byteString) {
        return (Analytical$RequestorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Analytical$RequestorFields parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$RequestorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Analytical$RequestorFields parseFrom(byte[] bArr) {
        return (Analytical$RequestorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Analytical$RequestorFields parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$RequestorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Analytical$RequestorFields parseFrom(InputStream inputStream) {
        return (Analytical$RequestorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$RequestorFields parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$RequestorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$RequestorFields parseFrom(CodedInputStream codedInputStream) {
        return (Analytical$RequestorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Analytical$RequestorFields parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$RequestorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}