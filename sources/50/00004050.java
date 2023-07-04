package com.plaid.internal.core.protos.analyticalcore;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Analytical$ResponseMeta extends GeneratedMessageLite<Analytical$ResponseMeta, a> implements MessageLiteOrBuilder {
    private static final Analytical$ResponseMeta DEFAULT_INSTANCE;
    private static volatile Parser<Analytical$ResponseMeta> PARSER = null;
    public static final int TIME_MS_FIELD_NUMBER = 1;
    private long timeMs_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Analytical$ResponseMeta, a> implements MessageLiteOrBuilder {
        public a() {
            super(Analytical$ResponseMeta.DEFAULT_INSTANCE);
        }
    }

    static {
        Analytical$ResponseMeta analytical$ResponseMeta = new Analytical$ResponseMeta();
        DEFAULT_INSTANCE = analytical$ResponseMeta;
        GeneratedMessageLite.registerDefaultInstance(Analytical$ResponseMeta.class, analytical$ResponseMeta);
    }

    private Analytical$ResponseMeta() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeMs() {
        this.timeMs_ = 0L;
    }

    public static Analytical$ResponseMeta getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Analytical$ResponseMeta parseDelimitedFrom(InputStream inputStream) {
        return (Analytical$ResponseMeta) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$ResponseMeta parseFrom(ByteBuffer byteBuffer) {
        return (Analytical$ResponseMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Analytical$ResponseMeta> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeMs(long j11) {
        this.timeMs_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.plaid.internal.a.f18151a[methodToInvoke.ordinal()]) {
            case 1:
                return new Analytical$ResponseMeta();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"timeMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Analytical$ResponseMeta> parser = PARSER;
                if (parser == null) {
                    synchronized (Analytical$ResponseMeta.class) {
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

    public long getTimeMs() {
        return this.timeMs_;
    }

    public static a newBuilder(Analytical$ResponseMeta analytical$ResponseMeta) {
        return DEFAULT_INSTANCE.createBuilder(analytical$ResponseMeta);
    }

    public static Analytical$ResponseMeta parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ResponseMeta) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$ResponseMeta parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ResponseMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Analytical$ResponseMeta parseFrom(ByteString byteString) {
        return (Analytical$ResponseMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Analytical$ResponseMeta parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ResponseMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Analytical$ResponseMeta parseFrom(byte[] bArr) {
        return (Analytical$ResponseMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Analytical$ResponseMeta parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ResponseMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Analytical$ResponseMeta parseFrom(InputStream inputStream) {
        return (Analytical$ResponseMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$ResponseMeta parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ResponseMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$ResponseMeta parseFrom(CodedInputStream codedInputStream) {
        return (Analytical$ResponseMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Analytical$ResponseMeta parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ResponseMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}