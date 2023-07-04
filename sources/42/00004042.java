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
public final class Analytical$ItemMeta extends GeneratedMessageLite<Analytical$ItemMeta, a> implements MessageLiteOrBuilder {
    private static final Analytical$ItemMeta DEFAULT_INSTANCE;
    public static final int ITEM_EXTERNAL_ID_FIELD_NUMBER = 1;
    private static volatile Parser<Analytical$ItemMeta> PARSER;
    private String itemExternalId_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Analytical$ItemMeta, a> implements MessageLiteOrBuilder {
        public a() {
            super(Analytical$ItemMeta.DEFAULT_INSTANCE);
        }
    }

    static {
        Analytical$ItemMeta analytical$ItemMeta = new Analytical$ItemMeta();
        DEFAULT_INSTANCE = analytical$ItemMeta;
        GeneratedMessageLite.registerDefaultInstance(Analytical$ItemMeta.class, analytical$ItemMeta);
    }

    private Analytical$ItemMeta() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemExternalId() {
        this.itemExternalId_ = getDefaultInstance().getItemExternalId();
    }

    public static Analytical$ItemMeta getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Analytical$ItemMeta parseDelimitedFrom(InputStream inputStream) {
        return (Analytical$ItemMeta) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$ItemMeta parseFrom(ByteBuffer byteBuffer) {
        return (Analytical$ItemMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Analytical$ItemMeta> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemExternalId(String str) {
        str.getClass();
        this.itemExternalId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemExternalIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.itemExternalId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.plaid.internal.a.f18151a[methodToInvoke.ordinal()]) {
            case 1:
                return new Analytical$ItemMeta();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"itemExternalId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Analytical$ItemMeta> parser = PARSER;
                if (parser == null) {
                    synchronized (Analytical$ItemMeta.class) {
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

    public String getItemExternalId() {
        return this.itemExternalId_;
    }

    public ByteString getItemExternalIdBytes() {
        return ByteString.copyFromUtf8(this.itemExternalId_);
    }

    public static a newBuilder(Analytical$ItemMeta analytical$ItemMeta) {
        return DEFAULT_INSTANCE.createBuilder(analytical$ItemMeta);
    }

    public static Analytical$ItemMeta parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ItemMeta) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$ItemMeta parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ItemMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Analytical$ItemMeta parseFrom(ByteString byteString) {
        return (Analytical$ItemMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Analytical$ItemMeta parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ItemMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Analytical$ItemMeta parseFrom(byte[] bArr) {
        return (Analytical$ItemMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Analytical$ItemMeta parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ItemMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Analytical$ItemMeta parseFrom(InputStream inputStream) {
        return (Analytical$ItemMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$ItemMeta parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ItemMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$ItemMeta parseFrom(CodedInputStream codedInputStream) {
        return (Analytical$ItemMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Analytical$ItemMeta parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ItemMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}