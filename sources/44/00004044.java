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
public final class Analytical$LinkFields extends GeneratedMessageLite<Analytical$LinkFields, a> implements MessageLiteOrBuilder {
    private static final Analytical$LinkFields DEFAULT_INSTANCE;
    public static final int LINK_PERSISTENT_ID_FIELD_NUMBER = 1;
    public static final int LINK_SESSION_ID_FIELD_NUMBER = 2;
    private static volatile Parser<Analytical$LinkFields> PARSER;
    private String linkPersistentId_ = "";
    private String linkSessionId_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Analytical$LinkFields, a> implements MessageLiteOrBuilder {
        public a() {
            super(Analytical$LinkFields.DEFAULT_INSTANCE);
        }
    }

    static {
        Analytical$LinkFields analytical$LinkFields = new Analytical$LinkFields();
        DEFAULT_INSTANCE = analytical$LinkFields;
        GeneratedMessageLite.registerDefaultInstance(Analytical$LinkFields.class, analytical$LinkFields);
    }

    private Analytical$LinkFields() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkPersistentId() {
        this.linkPersistentId_ = getDefaultInstance().getLinkPersistentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkSessionId() {
        this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
    }

    public static Analytical$LinkFields getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Analytical$LinkFields parseDelimitedFrom(InputStream inputStream) {
        return (Analytical$LinkFields) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$LinkFields parseFrom(ByteBuffer byteBuffer) {
        return (Analytical$LinkFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Analytical$LinkFields> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.plaid.internal.a.f18151a[methodToInvoke.ordinal()]) {
            case 1:
                return new Analytical$LinkFields();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"linkPersistentId_", "linkSessionId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Analytical$LinkFields> parser = PARSER;
                if (parser == null) {
                    synchronized (Analytical$LinkFields.class) {
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

    public static a newBuilder(Analytical$LinkFields analytical$LinkFields) {
        return DEFAULT_INSTANCE.createBuilder(analytical$LinkFields);
    }

    public static Analytical$LinkFields parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$LinkFields) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$LinkFields parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$LinkFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Analytical$LinkFields parseFrom(ByteString byteString) {
        return (Analytical$LinkFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Analytical$LinkFields parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$LinkFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Analytical$LinkFields parseFrom(byte[] bArr) {
        return (Analytical$LinkFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Analytical$LinkFields parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$LinkFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Analytical$LinkFields parseFrom(InputStream inputStream) {
        return (Analytical$LinkFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$LinkFields parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$LinkFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$LinkFields parseFrom(CodedInputStream codedInputStream) {
        return (Analytical$LinkFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Analytical$LinkFields parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$LinkFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}