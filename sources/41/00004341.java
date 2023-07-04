package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.x6;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class LocaleOuterClass$Locale extends GeneratedMessageLite<LocaleOuterClass$Locale, a> implements MessageLiteOrBuilder {
    public static final int COUNTRY_CODES_FIELD_NUMBER = 2;
    private static final LocaleOuterClass$Locale DEFAULT_INSTANCE;
    public static final int DISPLAY_LANGUAGE_FIELD_NUMBER = 1;
    private static volatile Parser<LocaleOuterClass$Locale> PARSER;
    private String displayLanguage_ = "";
    private Internal.ProtobufList<String> countryCodes_ = GeneratedMessageLite.emptyProtobufList();

    static {
        LocaleOuterClass$Locale localeOuterClass$Locale = new LocaleOuterClass$Locale();
        DEFAULT_INSTANCE = localeOuterClass$Locale;
        GeneratedMessageLite.registerDefaultInstance(LocaleOuterClass$Locale.class, localeOuterClass$Locale);
    }

    private LocaleOuterClass$Locale() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCountryCodes(Iterable<String> iterable) {
        ensureCountryCodesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.countryCodes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCountryCodes(String str) {
        str.getClass();
        ensureCountryCodesIsMutable();
        this.countryCodes_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCountryCodesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureCountryCodesIsMutable();
        this.countryCodes_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryCodes() {
        this.countryCodes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayLanguage() {
        this.displayLanguage_ = getDefaultInstance().getDisplayLanguage();
    }

    private void ensureCountryCodesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.countryCodes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.countryCodes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static LocaleOuterClass$Locale getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LocaleOuterClass$Locale parseDelimitedFrom(InputStream inputStream) {
        return (LocaleOuterClass$Locale) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocaleOuterClass$Locale parseFrom(ByteBuffer byteBuffer) {
        return (LocaleOuterClass$Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LocaleOuterClass$Locale> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCodes(int i11, String str) {
        str.getClass();
        ensureCountryCodesIsMutable();
        this.countryCodes_.set(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayLanguage(String str) {
        str.getClass();
        this.displayLanguage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayLanguageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.displayLanguage_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (x6.f19822a[methodToInvoke.ordinal()]) {
            case 1:
                return new LocaleOuterClass$Locale();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"displayLanguage_", "countryCodes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LocaleOuterClass$Locale> parser = PARSER;
                if (parser == null) {
                    synchronized (LocaleOuterClass$Locale.class) {
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

    public String getCountryCodes(int i11) {
        return this.countryCodes_.get(i11);
    }

    public ByteString getCountryCodesBytes(int i11) {
        return ByteString.copyFromUtf8(this.countryCodes_.get(i11));
    }

    public int getCountryCodesCount() {
        return this.countryCodes_.size();
    }

    public List<String> getCountryCodesList() {
        return this.countryCodes_;
    }

    public String getDisplayLanguage() {
        return this.displayLanguage_;
    }

    public ByteString getDisplayLanguageBytes() {
        return ByteString.copyFromUtf8(this.displayLanguage_);
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<LocaleOuterClass$Locale, a> implements MessageLiteOrBuilder {
        public a() {
            super(LocaleOuterClass$Locale.DEFAULT_INSTANCE);
        }

        public a a(String str) {
            copyOnWrite();
            ((LocaleOuterClass$Locale) this.instance).setDisplayLanguage(str);
            return this;
        }

        public a a(Iterable<String> iterable) {
            copyOnWrite();
            ((LocaleOuterClass$Locale) this.instance).addAllCountryCodes(iterable);
            return this;
        }
    }

    public static a newBuilder(LocaleOuterClass$Locale localeOuterClass$Locale) {
        return DEFAULT_INSTANCE.createBuilder(localeOuterClass$Locale);
    }

    public static LocaleOuterClass$Locale parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LocaleOuterClass$Locale) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LocaleOuterClass$Locale parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (LocaleOuterClass$Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LocaleOuterClass$Locale parseFrom(ByteString byteString) {
        return (LocaleOuterClass$Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LocaleOuterClass$Locale parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (LocaleOuterClass$Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LocaleOuterClass$Locale parseFrom(byte[] bArr) {
        return (LocaleOuterClass$Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LocaleOuterClass$Locale parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (LocaleOuterClass$Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LocaleOuterClass$Locale parseFrom(InputStream inputStream) {
        return (LocaleOuterClass$Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocaleOuterClass$Locale parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LocaleOuterClass$Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LocaleOuterClass$Locale parseFrom(CodedInputStream codedInputStream) {
        return (LocaleOuterClass$Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LocaleOuterClass$Locale parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LocaleOuterClass$Locale) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}