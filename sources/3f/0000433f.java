package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata;
import com.plaid.internal.p1;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Configuration$SDKMetadataWrapper extends GeneratedMessageLite<Configuration$SDKMetadataWrapper, a> implements MessageLiteOrBuilder {
    private static final Configuration$SDKMetadataWrapper DEFAULT_INSTANCE;
    private static volatile Parser<Configuration$SDKMetadataWrapper> PARSER = null;
    public static final int SDK_METADATA_FIELD_NUMBER = 1;
    private Configuration$SDKMetadata sdkMetadata_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Configuration$SDKMetadataWrapper, a> implements MessageLiteOrBuilder {
        public a() {
            super(Configuration$SDKMetadataWrapper.DEFAULT_INSTANCE);
        }
    }

    static {
        Configuration$SDKMetadataWrapper configuration$SDKMetadataWrapper = new Configuration$SDKMetadataWrapper();
        DEFAULT_INSTANCE = configuration$SDKMetadataWrapper;
        GeneratedMessageLite.registerDefaultInstance(Configuration$SDKMetadataWrapper.class, configuration$SDKMetadataWrapper);
    }

    private Configuration$SDKMetadataWrapper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkMetadata() {
        this.sdkMetadata_ = null;
    }

    public static Configuration$SDKMetadataWrapper getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSdkMetadata(Configuration$SDKMetadata configuration$SDKMetadata) {
        configuration$SDKMetadata.getClass();
        Configuration$SDKMetadata configuration$SDKMetadata2 = this.sdkMetadata_;
        if (configuration$SDKMetadata2 != null && configuration$SDKMetadata2 != Configuration$SDKMetadata.getDefaultInstance()) {
            this.sdkMetadata_ = Configuration$SDKMetadata.newBuilder(this.sdkMetadata_).mergeFrom((Configuration$SDKMetadata.a) configuration$SDKMetadata).buildPartial();
        } else {
            this.sdkMetadata_ = configuration$SDKMetadata;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$SDKMetadataWrapper parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$SDKMetadataWrapper> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkMetadata(Configuration$SDKMetadata configuration$SDKMetadata) {
        configuration$SDKMetadata.getClass();
        this.sdkMetadata_ = configuration$SDKMetadata;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (p1.f19204a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$SDKMetadataWrapper();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"sdkMetadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$SDKMetadataWrapper> parser = PARSER;
                if (parser == null) {
                    synchronized (Configuration$SDKMetadataWrapper.class) {
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

    public Configuration$SDKMetadata getSdkMetadata() {
        Configuration$SDKMetadata configuration$SDKMetadata = this.sdkMetadata_;
        return configuration$SDKMetadata == null ? Configuration$SDKMetadata.getDefaultInstance() : configuration$SDKMetadata;
    }

    public boolean hasSdkMetadata() {
        return this.sdkMetadata_ != null;
    }

    public static a newBuilder(Configuration$SDKMetadataWrapper configuration$SDKMetadataWrapper) {
        return DEFAULT_INSTANCE.createBuilder(configuration$SDKMetadataWrapper);
    }

    public static Configuration$SDKMetadataWrapper parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(ByteString byteString) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(byte[] bArr) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(InputStream inputStream) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}