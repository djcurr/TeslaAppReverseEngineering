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
public final class Analytical$InstitutionMeta extends GeneratedMessageLite<Analytical$InstitutionMeta, a> implements MessageLiteOrBuilder {
    private static final Analytical$InstitutionMeta DEFAULT_INSTANCE;
    public static final int INSTITUTION_COUNTRY_CODE_FIELD_NUMBER = 2;
    public static final int INSTITUTION_NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Analytical$InstitutionMeta> PARSER;
    private String institutionName_ = "";
    private String institutionCountryCode_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Analytical$InstitutionMeta, a> implements MessageLiteOrBuilder {
        public a() {
            super(Analytical$InstitutionMeta.DEFAULT_INSTANCE);
        }
    }

    static {
        Analytical$InstitutionMeta analytical$InstitutionMeta = new Analytical$InstitutionMeta();
        DEFAULT_INSTANCE = analytical$InstitutionMeta;
        GeneratedMessageLite.registerDefaultInstance(Analytical$InstitutionMeta.class, analytical$InstitutionMeta);
    }

    private Analytical$InstitutionMeta() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionCountryCode() {
        this.institutionCountryCode_ = getDefaultInstance().getInstitutionCountryCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionName() {
        this.institutionName_ = getDefaultInstance().getInstitutionName();
    }

    public static Analytical$InstitutionMeta getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Analytical$InstitutionMeta parseDelimitedFrom(InputStream inputStream) {
        return (Analytical$InstitutionMeta) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$InstitutionMeta parseFrom(ByteBuffer byteBuffer) {
        return (Analytical$InstitutionMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Analytical$InstitutionMeta> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionCountryCode(String str) {
        str.getClass();
        this.institutionCountryCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionCountryCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.institutionCountryCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionName(String str) {
        str.getClass();
        this.institutionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.institutionName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.plaid.internal.a.f18151a[methodToInvoke.ordinal()]) {
            case 1:
                return new Analytical$InstitutionMeta();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"institutionName_", "institutionCountryCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Analytical$InstitutionMeta> parser = PARSER;
                if (parser == null) {
                    synchronized (Analytical$InstitutionMeta.class) {
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

    public String getInstitutionCountryCode() {
        return this.institutionCountryCode_;
    }

    public ByteString getInstitutionCountryCodeBytes() {
        return ByteString.copyFromUtf8(this.institutionCountryCode_);
    }

    public String getInstitutionName() {
        return this.institutionName_;
    }

    public ByteString getInstitutionNameBytes() {
        return ByteString.copyFromUtf8(this.institutionName_);
    }

    public static a newBuilder(Analytical$InstitutionMeta analytical$InstitutionMeta) {
        return DEFAULT_INSTANCE.createBuilder(analytical$InstitutionMeta);
    }

    public static Analytical$InstitutionMeta parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$InstitutionMeta) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$InstitutionMeta parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$InstitutionMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Analytical$InstitutionMeta parseFrom(ByteString byteString) {
        return (Analytical$InstitutionMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Analytical$InstitutionMeta parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$InstitutionMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Analytical$InstitutionMeta parseFrom(byte[] bArr) {
        return (Analytical$InstitutionMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Analytical$InstitutionMeta parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$InstitutionMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Analytical$InstitutionMeta parseFrom(InputStream inputStream) {
        return (Analytical$InstitutionMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$InstitutionMeta parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$InstitutionMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$InstitutionMeta parseFrom(CodedInputStream codedInputStream) {
        return (Analytical$InstitutionMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Analytical$InstitutionMeta parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$InstitutionMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}