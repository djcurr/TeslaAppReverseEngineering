package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
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
public final class Configuration$LinkHostedTrustedAuthConfiguration extends GeneratedMessageLite<Configuration$LinkHostedTrustedAuthConfiguration, a> implements MessageLiteOrBuilder {
    private static final Configuration$LinkHostedTrustedAuthConfiguration DEFAULT_INSTANCE;
    public static final int OAUTH_STATE_ID_FIELD_NUMBER = 1;
    private static volatile Parser<Configuration$LinkHostedTrustedAuthConfiguration> PARSER;
    private String oauthStateId_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Configuration$LinkHostedTrustedAuthConfiguration, a> implements MessageLiteOrBuilder {
        public a() {
            super(Configuration$LinkHostedTrustedAuthConfiguration.DEFAULT_INSTANCE);
        }
    }

    static {
        Configuration$LinkHostedTrustedAuthConfiguration configuration$LinkHostedTrustedAuthConfiguration = new Configuration$LinkHostedTrustedAuthConfiguration();
        DEFAULT_INSTANCE = configuration$LinkHostedTrustedAuthConfiguration;
        GeneratedMessageLite.registerDefaultInstance(Configuration$LinkHostedTrustedAuthConfiguration.class, configuration$LinkHostedTrustedAuthConfiguration);
    }

    private Configuration$LinkHostedTrustedAuthConfiguration() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOauthStateId() {
        this.oauthStateId_ = getDefaultInstance().getOauthStateId();
    }

    public static Configuration$LinkHostedTrustedAuthConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$LinkHostedTrustedAuthConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$LinkHostedTrustedAuthConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$LinkHostedTrustedAuthConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$LinkHostedTrustedAuthConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$LinkHostedTrustedAuthConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthStateId(String str) {
        str.getClass();
        this.oauthStateId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthStateIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.oauthStateId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (p1.f19204a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$LinkHostedTrustedAuthConfiguration();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"oauthStateId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$LinkHostedTrustedAuthConfiguration> parser = PARSER;
                if (parser == null) {
                    synchronized (Configuration$LinkHostedTrustedAuthConfiguration.class) {
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

    public String getOauthStateId() {
        return this.oauthStateId_;
    }

    public ByteString getOauthStateIdBytes() {
        return ByteString.copyFromUtf8(this.oauthStateId_);
    }

    public static a newBuilder(Configuration$LinkHostedTrustedAuthConfiguration configuration$LinkHostedTrustedAuthConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$LinkHostedTrustedAuthConfiguration);
    }

    public static Configuration$LinkHostedTrustedAuthConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkHostedTrustedAuthConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$LinkHostedTrustedAuthConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkHostedTrustedAuthConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$LinkHostedTrustedAuthConfiguration parseFrom(ByteString byteString) {
        return (Configuration$LinkHostedTrustedAuthConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$LinkHostedTrustedAuthConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkHostedTrustedAuthConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$LinkHostedTrustedAuthConfiguration parseFrom(byte[] bArr) {
        return (Configuration$LinkHostedTrustedAuthConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$LinkHostedTrustedAuthConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkHostedTrustedAuthConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$LinkHostedTrustedAuthConfiguration parseFrom(InputStream inputStream) {
        return (Configuration$LinkHostedTrustedAuthConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$LinkHostedTrustedAuthConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkHostedTrustedAuthConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$LinkHostedTrustedAuthConfiguration parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$LinkHostedTrustedAuthConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$LinkHostedTrustedAuthConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkHostedTrustedAuthConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}