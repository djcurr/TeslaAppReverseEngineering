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
public final class Analytical$LinkMeta extends GeneratedMessageLite<Analytical$LinkMeta, a> implements MessageLiteOrBuilder {
    private static final Analytical$LinkMeta DEFAULT_INSTANCE;
    public static final int LINK_SDK_FIELD_NUMBER = 2;
    public static final int LINK_VERSION_FIELD_NUMBER = 1;
    private static volatile Parser<Analytical$LinkMeta> PARSER;
    private String linkVersion_ = "";
    private String linkSdk_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Analytical$LinkMeta, a> implements MessageLiteOrBuilder {
        public a() {
            super(Analytical$LinkMeta.DEFAULT_INSTANCE);
        }
    }

    static {
        Analytical$LinkMeta analytical$LinkMeta = new Analytical$LinkMeta();
        DEFAULT_INSTANCE = analytical$LinkMeta;
        GeneratedMessageLite.registerDefaultInstance(Analytical$LinkMeta.class, analytical$LinkMeta);
    }

    private Analytical$LinkMeta() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkSdk() {
        this.linkSdk_ = getDefaultInstance().getLinkSdk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkVersion() {
        this.linkVersion_ = getDefaultInstance().getLinkVersion();
    }

    public static Analytical$LinkMeta getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Analytical$LinkMeta parseDelimitedFrom(InputStream inputStream) {
        return (Analytical$LinkMeta) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$LinkMeta parseFrom(ByteBuffer byteBuffer) {
        return (Analytical$LinkMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Analytical$LinkMeta> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkSdk(String str) {
        str.getClass();
        this.linkSdk_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkSdkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkSdk_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkVersion(String str) {
        str.getClass();
        this.linkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkVersion_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.plaid.internal.a.f18151a[methodToInvoke.ordinal()]) {
            case 1:
                return new Analytical$LinkMeta();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"linkVersion_", "linkSdk_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Analytical$LinkMeta> parser = PARSER;
                if (parser == null) {
                    synchronized (Analytical$LinkMeta.class) {
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

    public String getLinkSdk() {
        return this.linkSdk_;
    }

    public ByteString getLinkSdkBytes() {
        return ByteString.copyFromUtf8(this.linkSdk_);
    }

    public String getLinkVersion() {
        return this.linkVersion_;
    }

    public ByteString getLinkVersionBytes() {
        return ByteString.copyFromUtf8(this.linkVersion_);
    }

    public static a newBuilder(Analytical$LinkMeta analytical$LinkMeta) {
        return DEFAULT_INSTANCE.createBuilder(analytical$LinkMeta);
    }

    public static Analytical$LinkMeta parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$LinkMeta) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$LinkMeta parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$LinkMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Analytical$LinkMeta parseFrom(ByteString byteString) {
        return (Analytical$LinkMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Analytical$LinkMeta parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$LinkMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Analytical$LinkMeta parseFrom(byte[] bArr) {
        return (Analytical$LinkMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Analytical$LinkMeta parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$LinkMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Analytical$LinkMeta parseFrom(InputStream inputStream) {
        return (Analytical$LinkMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$LinkMeta parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$LinkMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$LinkMeta parseFrom(CodedInputStream codedInputStream) {
        return (Analytical$LinkMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Analytical$LinkMeta parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$LinkMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}