package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.c1;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Common$PopupOptions extends GeneratedMessageLite<Common$PopupOptions, a> implements MessageLiteOrBuilder {
    private static final Common$PopupOptions DEFAULT_INSTANCE;
    private static volatile Parser<Common$PopupOptions> PARSER;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$PopupOptions, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$PopupOptions.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$PopupOptions common$PopupOptions = new Common$PopupOptions();
        DEFAULT_INSTANCE = common$PopupOptions;
        GeneratedMessageLite.registerDefaultInstance(Common$PopupOptions.class, common$PopupOptions);
    }

    private Common$PopupOptions() {
    }

    public static Common$PopupOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$PopupOptions parseDelimitedFrom(InputStream inputStream) {
        return (Common$PopupOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PopupOptions parseFrom(ByteBuffer byteBuffer) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$PopupOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$PopupOptions();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$PopupOptions> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$PopupOptions.class) {
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

    public static a newBuilder(Common$PopupOptions common$PopupOptions) {
        return DEFAULT_INSTANCE.createBuilder(common$PopupOptions);
    }

    public static Common$PopupOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PopupOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PopupOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$PopupOptions parseFrom(ByteString byteString) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$PopupOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$PopupOptions parseFrom(byte[] bArr) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$PopupOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$PopupOptions parseFrom(InputStream inputStream) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PopupOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PopupOptions parseFrom(CodedInputStream codedInputStream) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$PopupOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}