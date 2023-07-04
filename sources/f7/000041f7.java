package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.plaid.internal.c1;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Common$LocalizedString extends GeneratedMessageLite<Common$LocalizedString, a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.a {
    private static final Common$LocalizedString DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser<Common$LocalizedString> PARSER = null;
    public static final int TRANSLATION_FIELD_NUMBER = 2;
    private int keyOrTranslationCase_ = 0;
    private Object keyOrTranslation_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$LocalizedString, a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.a {
        public a() {
            super(Common$LocalizedString.DEFAULT_INSTANCE);
        }

        public a a(String str) {
            copyOnWrite();
            ((Common$LocalizedString) this.instance).setKey(str);
            return this;
        }

        public a b(String str) {
            copyOnWrite();
            ((Common$LocalizedString) this.instance).setTranslation(str);
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        KEY(1),
        TRANSLATION(2),
        KEYORTRANSLATION_NOT_SET(0);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f18351a;

        b(int i11) {
            this.f18351a = i11;
        }

        public static b forNumber(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return TRANSLATION;
                }
                return KEY;
            }
            return KEYORTRANSLATION_NOT_SET;
        }

        public int getNumber() {
            return this.f18351a;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        Common$LocalizedString common$LocalizedString = new Common$LocalizedString();
        DEFAULT_INSTANCE = common$LocalizedString;
        GeneratedMessageLite.registerDefaultInstance(Common$LocalizedString.class, common$LocalizedString);
    }

    private Common$LocalizedString() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        if (this.keyOrTranslationCase_ == 1) {
            this.keyOrTranslationCase_ = 0;
            this.keyOrTranslation_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyOrTranslation() {
        this.keyOrTranslationCase_ = 0;
        this.keyOrTranslation_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTranslation() {
        if (this.keyOrTranslationCase_ == 2) {
            this.keyOrTranslationCase_ = 0;
            this.keyOrTranslation_ = null;
        }
    }

    public static Common$LocalizedString getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$LocalizedString parseDelimitedFrom(InputStream inputStream) {
        return (Common$LocalizedString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$LocalizedString parseFrom(ByteBuffer byteBuffer) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$LocalizedString> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(String str) {
        str.getClass();
        this.keyOrTranslationCase_ = 1;
        this.keyOrTranslation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.keyOrTranslation_ = byteString.toStringUtf8();
        this.keyOrTranslationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTranslation(String str) {
        str.getClass();
        this.keyOrTranslationCase_ = 2;
        this.keyOrTranslation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTranslationBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.keyOrTranslation_ = byteString.toStringUtf8();
        this.keyOrTranslationCase_ = 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$LocalizedString();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000", new Object[]{"keyOrTranslation_", "keyOrTranslationCase_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$LocalizedString> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$LocalizedString.class) {
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

    public String getKey() {
        return this.keyOrTranslationCase_ == 1 ? (String) this.keyOrTranslation_ : "";
    }

    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8(this.keyOrTranslationCase_ == 1 ? (String) this.keyOrTranslation_ : "");
    }

    public b getKeyOrTranslationCase() {
        return b.forNumber(this.keyOrTranslationCase_);
    }

    public String getTranslation() {
        return this.keyOrTranslationCase_ == 2 ? (String) this.keyOrTranslation_ : "";
    }

    public ByteString getTranslationBytes() {
        return ByteString.copyFromUtf8(this.keyOrTranslationCase_ == 2 ? (String) this.keyOrTranslation_ : "");
    }

    public boolean hasKey() {
        return this.keyOrTranslationCase_ == 1;
    }

    public boolean hasTranslation() {
        return this.keyOrTranslationCase_ == 2;
    }

    public static a newBuilder(Common$LocalizedString common$LocalizedString) {
        return DEFAULT_INSTANCE.createBuilder(common$LocalizedString);
    }

    public static Common$LocalizedString parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalizedString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$LocalizedString parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$LocalizedString parseFrom(ByteString byteString) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$LocalizedString parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$LocalizedString parseFrom(byte[] bArr) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$LocalizedString parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$LocalizedString parseFrom(InputStream inputStream) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$LocalizedString parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$LocalizedString parseFrom(CodedInputStream codedInputStream) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$LocalizedString parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}