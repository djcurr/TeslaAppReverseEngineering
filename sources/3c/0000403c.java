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
public final class Analytical$InstitutionFields extends GeneratedMessageLite<Analytical$InstitutionFields, a> implements MessageLiteOrBuilder {
    private static final Analytical$InstitutionFields DEFAULT_INSTANCE;
    public static final int INSTITUTION_ID_FIELD_NUMBER = 1;
    private static volatile Parser<Analytical$InstitutionFields> PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 2;
    private String institutionId_ = "";
    private String provider_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Analytical$InstitutionFields, a> implements MessageLiteOrBuilder {
        public a() {
            super(Analytical$InstitutionFields.DEFAULT_INSTANCE);
        }
    }

    static {
        Analytical$InstitutionFields analytical$InstitutionFields = new Analytical$InstitutionFields();
        DEFAULT_INSTANCE = analytical$InstitutionFields;
        GeneratedMessageLite.registerDefaultInstance(Analytical$InstitutionFields.class, analytical$InstitutionFields);
    }

    private Analytical$InstitutionFields() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionId() {
        this.institutionId_ = getDefaultInstance().getInstitutionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.provider_ = getDefaultInstance().getProvider();
    }

    public static Analytical$InstitutionFields getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Analytical$InstitutionFields parseDelimitedFrom(InputStream inputStream) {
        return (Analytical$InstitutionFields) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$InstitutionFields parseFrom(ByteBuffer byteBuffer) {
        return (Analytical$InstitutionFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Analytical$InstitutionFields> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionId(String str) {
        str.getClass();
        this.institutionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.institutionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(String str) {
        str.getClass();
        this.provider_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.provider_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.plaid.internal.a.f18151a[methodToInvoke.ordinal()]) {
            case 1:
                return new Analytical$InstitutionFields();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"institutionId_", "provider_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Analytical$InstitutionFields> parser = PARSER;
                if (parser == null) {
                    synchronized (Analytical$InstitutionFields.class) {
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

    public String getInstitutionId() {
        return this.institutionId_;
    }

    public ByteString getInstitutionIdBytes() {
        return ByteString.copyFromUtf8(this.institutionId_);
    }

    public String getProvider() {
        return this.provider_;
    }

    public ByteString getProviderBytes() {
        return ByteString.copyFromUtf8(this.provider_);
    }

    public static a newBuilder(Analytical$InstitutionFields analytical$InstitutionFields) {
        return DEFAULT_INSTANCE.createBuilder(analytical$InstitutionFields);
    }

    public static Analytical$InstitutionFields parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$InstitutionFields) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$InstitutionFields parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$InstitutionFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Analytical$InstitutionFields parseFrom(ByteString byteString) {
        return (Analytical$InstitutionFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Analytical$InstitutionFields parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$InstitutionFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Analytical$InstitutionFields parseFrom(byte[] bArr) {
        return (Analytical$InstitutionFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Analytical$InstitutionFields parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$InstitutionFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Analytical$InstitutionFields parseFrom(InputStream inputStream) {
        return (Analytical$InstitutionFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$InstitutionFields parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$InstitutionFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$InstitutionFields parseFrom(CodedInputStream codedInputStream) {
        return (Analytical$InstitutionFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Analytical$InstitutionFields parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$InstitutionFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}