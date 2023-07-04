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
public final class Common$PollingOptions extends GeneratedMessageLite<Common$PollingOptions, a> implements MessageLiteOrBuilder {
    public static final int AWAIT_CONFIRMATION_FIELD_NUMBER = 1;
    private static final Common$PollingOptions DEFAULT_INSTANCE;
    public static final int INTERVAL_MS_FIELD_NUMBER = 2;
    public static final int MAX_DURATION_MS_FIELD_NUMBER = 3;
    private static volatile Parser<Common$PollingOptions> PARSER;
    private boolean awaitConfirmation_;
    private int intervalMs_;
    private int maxDurationMs_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$PollingOptions, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$PollingOptions.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$PollingOptions common$PollingOptions = new Common$PollingOptions();
        DEFAULT_INSTANCE = common$PollingOptions;
        GeneratedMessageLite.registerDefaultInstance(Common$PollingOptions.class, common$PollingOptions);
    }

    private Common$PollingOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAwaitConfirmation() {
        this.awaitConfirmation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntervalMs() {
        this.intervalMs_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxDurationMs() {
        this.maxDurationMs_ = 0;
    }

    public static Common$PollingOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$PollingOptions parseDelimitedFrom(InputStream inputStream) {
        return (Common$PollingOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PollingOptions parseFrom(ByteBuffer byteBuffer) {
        return (Common$PollingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$PollingOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAwaitConfirmation(boolean z11) {
        this.awaitConfirmation_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntervalMs(int i11) {
        this.intervalMs_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxDurationMs(int i11) {
        this.maxDurationMs_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$PollingOptions();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0004\u0003\u0004", new Object[]{"awaitConfirmation_", "intervalMs_", "maxDurationMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$PollingOptions> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$PollingOptions.class) {
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

    public boolean getAwaitConfirmation() {
        return this.awaitConfirmation_;
    }

    public int getIntervalMs() {
        return this.intervalMs_;
    }

    public int getMaxDurationMs() {
        return this.maxDurationMs_;
    }

    public static a newBuilder(Common$PollingOptions common$PollingOptions) {
        return DEFAULT_INSTANCE.createBuilder(common$PollingOptions);
    }

    public static Common$PollingOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PollingOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PollingOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PollingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$PollingOptions parseFrom(ByteString byteString) {
        return (Common$PollingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$PollingOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PollingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$PollingOptions parseFrom(byte[] bArr) {
        return (Common$PollingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$PollingOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PollingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$PollingOptions parseFrom(InputStream inputStream) {
        return (Common$PollingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PollingOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PollingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PollingOptions parseFrom(CodedInputStream codedInputStream) {
        return (Common$PollingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$PollingOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PollingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}