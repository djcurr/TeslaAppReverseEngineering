package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.c1;
import com.plaid.internal.i1;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Common$SDKEncryptionMetadata extends GeneratedMessageLite<Common$SDKEncryptionMetadata, a> implements MessageLiteOrBuilder {
    private static final Common$SDKEncryptionMetadata DEFAULT_INSTANCE;
    private static volatile Parser<Common$SDKEncryptionMetadata> PARSER = null;
    public static final int PUBLIC_ENCRYPTION_PEM_KEY_FIELD_NUMBER = 1;
    public static final int SCHEME_FIELD_NUMBER = 2;
    private String publicEncryptionPemKey_ = "";
    private int scheme_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$SDKEncryptionMetadata, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$SDKEncryptionMetadata.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$SDKEncryptionMetadata common$SDKEncryptionMetadata = new Common$SDKEncryptionMetadata();
        DEFAULT_INSTANCE = common$SDKEncryptionMetadata;
        GeneratedMessageLite.registerDefaultInstance(Common$SDKEncryptionMetadata.class, common$SDKEncryptionMetadata);
    }

    private Common$SDKEncryptionMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicEncryptionPemKey() {
        this.publicEncryptionPemKey_ = getDefaultInstance().getPublicEncryptionPemKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScheme() {
        this.scheme_ = 0;
    }

    public static Common$SDKEncryptionMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$SDKEncryptionMetadata parseDelimitedFrom(InputStream inputStream) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SDKEncryptionMetadata parseFrom(ByteBuffer byteBuffer) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$SDKEncryptionMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicEncryptionPemKey(String str) {
        str.getClass();
        this.publicEncryptionPemKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicEncryptionPemKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.publicEncryptionPemKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScheme(i1 i1Var) {
        this.scheme_ = i1Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemeValue(int i11) {
        this.scheme_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$SDKEncryptionMetadata();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"publicEncryptionPemKey_", "scheme_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$SDKEncryptionMetadata> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$SDKEncryptionMetadata.class) {
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

    public String getPublicEncryptionPemKey() {
        return this.publicEncryptionPemKey_;
    }

    public ByteString getPublicEncryptionPemKeyBytes() {
        return ByteString.copyFromUtf8(this.publicEncryptionPemKey_);
    }

    public i1 getScheme() {
        i1 forNumber = i1.forNumber(this.scheme_);
        return forNumber == null ? i1.UNRECOGNIZED : forNumber;
    }

    public int getSchemeValue() {
        return this.scheme_;
    }

    public static a newBuilder(Common$SDKEncryptionMetadata common$SDKEncryptionMetadata) {
        return DEFAULT_INSTANCE.createBuilder(common$SDKEncryptionMetadata);
    }

    public static Common$SDKEncryptionMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SDKEncryptionMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$SDKEncryptionMetadata parseFrom(ByteString byteString) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$SDKEncryptionMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$SDKEncryptionMetadata parseFrom(byte[] bArr) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$SDKEncryptionMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$SDKEncryptionMetadata parseFrom(InputStream inputStream) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SDKEncryptionMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SDKEncryptionMetadata parseFrom(CodedInputStream codedInputStream) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$SDKEncryptionMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}