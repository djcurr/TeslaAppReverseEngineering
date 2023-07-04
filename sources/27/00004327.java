package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.p1;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Configuration$ClientCapabilities extends GeneratedMessageLite<Configuration$ClientCapabilities, a> implements MessageLiteOrBuilder {
    private static final Configuration$ClientCapabilities DEFAULT_INSTANCE;
    private static volatile Parser<Configuration$ClientCapabilities> PARSER = null;
    public static final int SUPPORTS_INCREMENTAL_RESULTS_FIELD_NUMBER = 1;
    private boolean supportsIncrementalResults_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Configuration$ClientCapabilities, a> implements MessageLiteOrBuilder {
        public a() {
            super(Configuration$ClientCapabilities.DEFAULT_INSTANCE);
        }
    }

    static {
        Configuration$ClientCapabilities configuration$ClientCapabilities = new Configuration$ClientCapabilities();
        DEFAULT_INSTANCE = configuration$ClientCapabilities;
        GeneratedMessageLite.registerDefaultInstance(Configuration$ClientCapabilities.class, configuration$ClientCapabilities);
    }

    private Configuration$ClientCapabilities() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupportsIncrementalResults() {
        this.supportsIncrementalResults_ = false;
    }

    public static Configuration$ClientCapabilities getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$ClientCapabilities parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$ClientCapabilities parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$ClientCapabilities> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupportsIncrementalResults(boolean z11) {
        this.supportsIncrementalResults_ = z11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (p1.f19204a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$ClientCapabilities();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"supportsIncrementalResults_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$ClientCapabilities> parser = PARSER;
                if (parser == null) {
                    synchronized (Configuration$ClientCapabilities.class) {
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

    public boolean getSupportsIncrementalResults() {
        return this.supportsIncrementalResults_;
    }

    public static a newBuilder(Configuration$ClientCapabilities configuration$ClientCapabilities) {
        return DEFAULT_INSTANCE.createBuilder(configuration$ClientCapabilities);
    }

    public static Configuration$ClientCapabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$ClientCapabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$ClientCapabilities parseFrom(ByteString byteString) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$ClientCapabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$ClientCapabilities parseFrom(byte[] bArr) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$ClientCapabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$ClientCapabilities parseFrom(InputStream inputStream) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$ClientCapabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$ClientCapabilities parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$ClientCapabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}