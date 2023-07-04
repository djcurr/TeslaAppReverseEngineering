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
public final class Analytical$ClientFields extends GeneratedMessageLite<Analytical$ClientFields, a> implements MessageLiteOrBuilder {
    public static final int CLIENT_ID_FIELD_NUMBER = 1;
    public static final int CLIENT_NAME_FIELD_NUMBER = 2;
    private static final Analytical$ClientFields DEFAULT_INSTANCE;
    private static volatile Parser<Analytical$ClientFields> PARSER;
    private String clientId_ = "";
    private String clientName_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Analytical$ClientFields, a> implements MessageLiteOrBuilder {
        public a() {
            super(Analytical$ClientFields.DEFAULT_INSTANCE);
        }
    }

    static {
        Analytical$ClientFields analytical$ClientFields = new Analytical$ClientFields();
        DEFAULT_INSTANCE = analytical$ClientFields;
        GeneratedMessageLite.registerDefaultInstance(Analytical$ClientFields.class, analytical$ClientFields);
    }

    private Analytical$ClientFields() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientId() {
        this.clientId_ = getDefaultInstance().getClientId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientName() {
        this.clientName_ = getDefaultInstance().getClientName();
    }

    public static Analytical$ClientFields getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Analytical$ClientFields parseDelimitedFrom(InputStream inputStream) {
        return (Analytical$ClientFields) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$ClientFields parseFrom(ByteBuffer byteBuffer) {
        return (Analytical$ClientFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Analytical$ClientFields> parser() {
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
    public void setClientName(String str) {
        str.getClass();
        this.clientName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.clientName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.plaid.internal.a.f18151a[methodToInvoke.ordinal()]) {
            case 1:
                return new Analytical$ClientFields();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"clientId_", "clientName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Analytical$ClientFields> parser = PARSER;
                if (parser == null) {
                    synchronized (Analytical$ClientFields.class) {
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

    public String getClientName() {
        return this.clientName_;
    }

    public ByteString getClientNameBytes() {
        return ByteString.copyFromUtf8(this.clientName_);
    }

    public static a newBuilder(Analytical$ClientFields analytical$ClientFields) {
        return DEFAULT_INSTANCE.createBuilder(analytical$ClientFields);
    }

    public static Analytical$ClientFields parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ClientFields) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$ClientFields parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ClientFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Analytical$ClientFields parseFrom(ByteString byteString) {
        return (Analytical$ClientFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Analytical$ClientFields parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ClientFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Analytical$ClientFields parseFrom(byte[] bArr) {
        return (Analytical$ClientFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Analytical$ClientFields parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ClientFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Analytical$ClientFields parseFrom(InputStream inputStream) {
        return (Analytical$ClientFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$ClientFields parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ClientFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$ClientFields parseFrom(CodedInputStream codedInputStream) {
        return (Analytical$ClientFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Analytical$ClientFields parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ClientFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}