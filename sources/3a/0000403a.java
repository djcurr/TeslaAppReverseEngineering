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
public final class Analytical$EscalateMeta extends GeneratedMessageLite<Analytical$EscalateMeta, a> implements MessageLiteOrBuilder {
    private static final Analytical$EscalateMeta DEFAULT_INSTANCE;
    public static final int ESCALATE_REASON_FIELD_NUMBER = 3;
    public static final int ESCALATE_VERDICT_FIELD_NUMBER = 2;
    public static final int IS_FAKE_RESPONSE_FROM_ESCALATE_FIELD_NUMBER = 1;
    private static volatile Parser<Analytical$EscalateMeta> PARSER = null;
    public static final int SKYFALL_SUPERKEY_FIELD_NUMBER = 4;
    private boolean isFakeResponseFromEscalate_;
    private String escalateVerdict_ = "";
    private String escalateReason_ = "";
    private String skyfallSuperkey_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Analytical$EscalateMeta, a> implements MessageLiteOrBuilder {
        public a() {
            super(Analytical$EscalateMeta.DEFAULT_INSTANCE);
        }
    }

    static {
        Analytical$EscalateMeta analytical$EscalateMeta = new Analytical$EscalateMeta();
        DEFAULT_INSTANCE = analytical$EscalateMeta;
        GeneratedMessageLite.registerDefaultInstance(Analytical$EscalateMeta.class, analytical$EscalateMeta);
    }

    private Analytical$EscalateMeta() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEscalateReason() {
        this.escalateReason_ = getDefaultInstance().getEscalateReason();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEscalateVerdict() {
        this.escalateVerdict_ = getDefaultInstance().getEscalateVerdict();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFakeResponseFromEscalate() {
        this.isFakeResponseFromEscalate_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkyfallSuperkey() {
        this.skyfallSuperkey_ = getDefaultInstance().getSkyfallSuperkey();
    }

    public static Analytical$EscalateMeta getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Analytical$EscalateMeta parseDelimitedFrom(InputStream inputStream) {
        return (Analytical$EscalateMeta) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$EscalateMeta parseFrom(ByteBuffer byteBuffer) {
        return (Analytical$EscalateMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Analytical$EscalateMeta> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEscalateReason(String str) {
        str.getClass();
        this.escalateReason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEscalateReasonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.escalateReason_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEscalateVerdict(String str) {
        str.getClass();
        this.escalateVerdict_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEscalateVerdictBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.escalateVerdict_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFakeResponseFromEscalate(boolean z11) {
        this.isFakeResponseFromEscalate_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkyfallSuperkey(String str) {
        str.getClass();
        this.skyfallSuperkey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkyfallSuperkeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.skyfallSuperkey_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.plaid.internal.a.f18151a[methodToInvoke.ordinal()]) {
            case 1:
                return new Analytical$EscalateMeta();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"isFakeResponseFromEscalate_", "escalateVerdict_", "escalateReason_", "skyfallSuperkey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Analytical$EscalateMeta> parser = PARSER;
                if (parser == null) {
                    synchronized (Analytical$EscalateMeta.class) {
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

    public String getEscalateReason() {
        return this.escalateReason_;
    }

    public ByteString getEscalateReasonBytes() {
        return ByteString.copyFromUtf8(this.escalateReason_);
    }

    public String getEscalateVerdict() {
        return this.escalateVerdict_;
    }

    public ByteString getEscalateVerdictBytes() {
        return ByteString.copyFromUtf8(this.escalateVerdict_);
    }

    public boolean getIsFakeResponseFromEscalate() {
        return this.isFakeResponseFromEscalate_;
    }

    public String getSkyfallSuperkey() {
        return this.skyfallSuperkey_;
    }

    public ByteString getSkyfallSuperkeyBytes() {
        return ByteString.copyFromUtf8(this.skyfallSuperkey_);
    }

    public static a newBuilder(Analytical$EscalateMeta analytical$EscalateMeta) {
        return DEFAULT_INSTANCE.createBuilder(analytical$EscalateMeta);
    }

    public static Analytical$EscalateMeta parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$EscalateMeta) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$EscalateMeta parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$EscalateMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Analytical$EscalateMeta parseFrom(ByteString byteString) {
        return (Analytical$EscalateMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Analytical$EscalateMeta parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$EscalateMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Analytical$EscalateMeta parseFrom(byte[] bArr) {
        return (Analytical$EscalateMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Analytical$EscalateMeta parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$EscalateMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Analytical$EscalateMeta parseFrom(InputStream inputStream) {
        return (Analytical$EscalateMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$EscalateMeta parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$EscalateMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$EscalateMeta parseFrom(CodedInputStream codedInputStream) {
        return (Analytical$EscalateMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Analytical$EscalateMeta parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$EscalateMeta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}