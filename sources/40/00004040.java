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
public final class Analytical$ItemFields extends GeneratedMessageLite<Analytical$ItemFields, a> implements MessageLiteOrBuilder {
    private static final Analytical$ItemFields DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 1;
    public static final int OCCURRENCE_ID_FIELD_NUMBER = 2;
    private static volatile Parser<Analytical$ItemFields> PARSER;
    private String itemId_ = "";
    private String occurrenceId_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Analytical$ItemFields, a> implements MessageLiteOrBuilder {
        public a() {
            super(Analytical$ItemFields.DEFAULT_INSTANCE);
        }
    }

    static {
        Analytical$ItemFields analytical$ItemFields = new Analytical$ItemFields();
        DEFAULT_INSTANCE = analytical$ItemFields;
        GeneratedMessageLite.registerDefaultInstance(Analytical$ItemFields.class, analytical$ItemFields);
    }

    private Analytical$ItemFields() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemId() {
        this.itemId_ = getDefaultInstance().getItemId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOccurrenceId() {
        this.occurrenceId_ = getDefaultInstance().getOccurrenceId();
    }

    public static Analytical$ItemFields getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Analytical$ItemFields parseDelimitedFrom(InputStream inputStream) {
        return (Analytical$ItemFields) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$ItemFields parseFrom(ByteBuffer byteBuffer) {
        return (Analytical$ItemFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Analytical$ItemFields> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemId(String str) {
        str.getClass();
        this.itemId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.itemId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOccurrenceId(String str) {
        str.getClass();
        this.occurrenceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOccurrenceIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.occurrenceId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.plaid.internal.a.f18151a[methodToInvoke.ordinal()]) {
            case 1:
                return new Analytical$ItemFields();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"itemId_", "occurrenceId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Analytical$ItemFields> parser = PARSER;
                if (parser == null) {
                    synchronized (Analytical$ItemFields.class) {
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

    public String getItemId() {
        return this.itemId_;
    }

    public ByteString getItemIdBytes() {
        return ByteString.copyFromUtf8(this.itemId_);
    }

    public String getOccurrenceId() {
        return this.occurrenceId_;
    }

    public ByteString getOccurrenceIdBytes() {
        return ByteString.copyFromUtf8(this.occurrenceId_);
    }

    public static a newBuilder(Analytical$ItemFields analytical$ItemFields) {
        return DEFAULT_INSTANCE.createBuilder(analytical$ItemFields);
    }

    public static Analytical$ItemFields parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ItemFields) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$ItemFields parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ItemFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Analytical$ItemFields parseFrom(ByteString byteString) {
        return (Analytical$ItemFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Analytical$ItemFields parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ItemFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Analytical$ItemFields parseFrom(byte[] bArr) {
        return (Analytical$ItemFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Analytical$ItemFields parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ItemFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Analytical$ItemFields parseFrom(InputStream inputStream) {
        return (Analytical$ItemFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$ItemFields parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ItemFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$ItemFields parseFrom(CodedInputStream codedInputStream) {
        return (Analytical$ItemFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Analytical$ItemFields parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ItemFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}