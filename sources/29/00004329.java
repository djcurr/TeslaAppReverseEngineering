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
public final class Configuration$DeviceMetadata extends GeneratedMessageLite<Configuration$DeviceMetadata, a> implements MessageLiteOrBuilder {
    public static final int BROWSER_METADATA_FIELD_NUMBER = 8;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 6;
    private static final Configuration$DeviceMetadata DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 7;
    public static final int LOCALE_FIELD_NUMBER = 5;
    public static final int MANUFACTURER_FIELD_NUMBER = 1;
    public static final int MODEL_FIELD_NUMBER = 2;
    public static final int OS_FIELD_NUMBER = 3;
    public static final int OS_VERSION_FIELD_NUMBER = 4;
    private static volatile Parser<Configuration$DeviceMetadata> PARSER;
    private BrowserMetadata browserMetadata_;
    private String manufacturer_ = "";
    private String model_ = "";
    private String os_ = "";
    private String osVersion_ = "";
    private String locale_ = "";
    private String countryCode_ = "";
    private String languageCode_ = "";

    /* loaded from: classes2.dex */
    public static final class BrowserMetadata extends GeneratedMessageLite<BrowserMetadata, a> implements MessageLiteOrBuilder {
        public static final int BROWSER_NAME_FIELD_NUMBER = 1;
        public static final int BROWSER_VERSION_FIELD_NUMBER = 2;
        private static final BrowserMetadata DEFAULT_INSTANCE;
        private static volatile Parser<BrowserMetadata> PARSER = null;
        public static final int RENDERING_ENGINE_NAME_FIELD_NUMBER = 3;
        public static final int RENDERING_ENGINE_VERSION_FIELD_NUMBER = 4;
        public static final int USER_AGENT_FIELD_NUMBER = 5;
        private String browserName_ = "";
        private String browserVersion_ = "";
        private String renderingEngineName_ = "";
        private String renderingEngineVersion_ = "";
        private String userAgent_ = "";

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<BrowserMetadata, a> implements MessageLiteOrBuilder {
            public a() {
                super(BrowserMetadata.DEFAULT_INSTANCE);
            }
        }

        static {
            BrowserMetadata browserMetadata = new BrowserMetadata();
            DEFAULT_INSTANCE = browserMetadata;
            GeneratedMessageLite.registerDefaultInstance(BrowserMetadata.class, browserMetadata);
        }

        private BrowserMetadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBrowserName() {
            this.browserName_ = getDefaultInstance().getBrowserName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBrowserVersion() {
            this.browserVersion_ = getDefaultInstance().getBrowserVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRenderingEngineName() {
            this.renderingEngineName_ = getDefaultInstance().getRenderingEngineName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRenderingEngineVersion() {
            this.renderingEngineVersion_ = getDefaultInstance().getRenderingEngineVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserAgent() {
            this.userAgent_ = getDefaultInstance().getUserAgent();
        }

        public static BrowserMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BrowserMetadata parseDelimitedFrom(InputStream inputStream) {
            return (BrowserMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BrowserMetadata parseFrom(ByteBuffer byteBuffer) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BrowserMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrowserName(String str) {
            str.getClass();
            this.browserName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrowserNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.browserName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrowserVersion(String str) {
            str.getClass();
            this.browserVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrowserVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.browserVersion_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRenderingEngineName(String str) {
            str.getClass();
            this.renderingEngineName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRenderingEngineNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.renderingEngineName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRenderingEngineVersion(String str) {
            str.getClass();
            this.renderingEngineVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRenderingEngineVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.renderingEngineVersion_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserAgent(String str) {
            str.getClass();
            this.userAgent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserAgentBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.userAgent_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (p1.f19204a[methodToInvoke.ordinal()]) {
                case 1:
                    return new BrowserMetadata();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"browserName_", "browserVersion_", "renderingEngineName_", "renderingEngineVersion_", "userAgent_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BrowserMetadata> parser = PARSER;
                    if (parser == null) {
                        synchronized (BrowserMetadata.class) {
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

        public String getBrowserName() {
            return this.browserName_;
        }

        public ByteString getBrowserNameBytes() {
            return ByteString.copyFromUtf8(this.browserName_);
        }

        public String getBrowserVersion() {
            return this.browserVersion_;
        }

        public ByteString getBrowserVersionBytes() {
            return ByteString.copyFromUtf8(this.browserVersion_);
        }

        public String getRenderingEngineName() {
            return this.renderingEngineName_;
        }

        public ByteString getRenderingEngineNameBytes() {
            return ByteString.copyFromUtf8(this.renderingEngineName_);
        }

        public String getRenderingEngineVersion() {
            return this.renderingEngineVersion_;
        }

        public ByteString getRenderingEngineVersionBytes() {
            return ByteString.copyFromUtf8(this.renderingEngineVersion_);
        }

        public String getUserAgent() {
            return this.userAgent_;
        }

        public ByteString getUserAgentBytes() {
            return ByteString.copyFromUtf8(this.userAgent_);
        }

        public static a newBuilder(BrowserMetadata browserMetadata) {
            return DEFAULT_INSTANCE.createBuilder(browserMetadata);
        }

        public static BrowserMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BrowserMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BrowserMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BrowserMetadata parseFrom(ByteString byteString) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BrowserMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BrowserMetadata parseFrom(byte[] bArr) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BrowserMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BrowserMetadata parseFrom(InputStream inputStream) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BrowserMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BrowserMetadata parseFrom(CodedInputStream codedInputStream) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BrowserMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Configuration$DeviceMetadata, a> implements MessageLiteOrBuilder {
        public a() {
            super(Configuration$DeviceMetadata.DEFAULT_INSTANCE);
        }

        public a a(String str) {
            copyOnWrite();
            ((Configuration$DeviceMetadata) this.instance).setCountryCode(str);
            return this;
        }

        public a b(String str) {
            copyOnWrite();
            ((Configuration$DeviceMetadata) this.instance).setLanguageCode(str);
            return this;
        }

        public a c(String str) {
            copyOnWrite();
            ((Configuration$DeviceMetadata) this.instance).setLocale(str);
            return this;
        }

        public a d(String str) {
            copyOnWrite();
            ((Configuration$DeviceMetadata) this.instance).setManufacturer(str);
            return this;
        }

        public a e(String str) {
            copyOnWrite();
            ((Configuration$DeviceMetadata) this.instance).setModel(str);
            return this;
        }

        public a f(String str) {
            copyOnWrite();
            ((Configuration$DeviceMetadata) this.instance).setOs(str);
            return this;
        }

        public a g(String str) {
            copyOnWrite();
            ((Configuration$DeviceMetadata) this.instance).setOsVersion(str);
            return this;
        }
    }

    static {
        Configuration$DeviceMetadata configuration$DeviceMetadata = new Configuration$DeviceMetadata();
        DEFAULT_INSTANCE = configuration$DeviceMetadata;
        GeneratedMessageLite.registerDefaultInstance(Configuration$DeviceMetadata.class, configuration$DeviceMetadata);
    }

    private Configuration$DeviceMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrowserMetadata() {
        this.browserMetadata_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryCode() {
        this.countryCode_ = getDefaultInstance().getCountryCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguageCode() {
        this.languageCode_ = getDefaultInstance().getLanguageCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.locale_ = getDefaultInstance().getLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearManufacturer() {
        this.manufacturer_ = getDefaultInstance().getManufacturer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModel() {
        this.model_ = getDefaultInstance().getModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOs() {
        this.os_ = getDefaultInstance().getOs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    public static Configuration$DeviceMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBrowserMetadata(BrowserMetadata browserMetadata) {
        browserMetadata.getClass();
        BrowserMetadata browserMetadata2 = this.browserMetadata_;
        if (browserMetadata2 != null && browserMetadata2 != BrowserMetadata.getDefaultInstance()) {
            this.browserMetadata_ = BrowserMetadata.newBuilder(this.browserMetadata_).mergeFrom((BrowserMetadata.a) browserMetadata).buildPartial();
        } else {
            this.browserMetadata_ = browserMetadata;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$DeviceMetadata parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$DeviceMetadata parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$DeviceMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrowserMetadata(BrowserMetadata browserMetadata) {
        browserMetadata.getClass();
        this.browserMetadata_ = browserMetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCode(String str) {
        str.getClass();
        this.countryCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.countryCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCode(String str) {
        str.getClass();
        this.languageCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.languageCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        str.getClass();
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocaleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.locale_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufacturer(String str) {
        str.getClass();
        this.manufacturer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufacturerBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.manufacturer_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(String str) {
        str.getClass();
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.model_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(String str) {
        str.getClass();
        this.os_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.os_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        str.getClass();
        this.osVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.osVersion_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (p1.f19204a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$DeviceMetadata();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\t", new Object[]{"manufacturer_", "model_", "os_", "osVersion_", "locale_", "countryCode_", "languageCode_", "browserMetadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$DeviceMetadata> parser = PARSER;
                if (parser == null) {
                    synchronized (Configuration$DeviceMetadata.class) {
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

    public BrowserMetadata getBrowserMetadata() {
        BrowserMetadata browserMetadata = this.browserMetadata_;
        return browserMetadata == null ? BrowserMetadata.getDefaultInstance() : browserMetadata;
    }

    public String getCountryCode() {
        return this.countryCode_;
    }

    public ByteString getCountryCodeBytes() {
        return ByteString.copyFromUtf8(this.countryCode_);
    }

    public String getLanguageCode() {
        return this.languageCode_;
    }

    public ByteString getLanguageCodeBytes() {
        return ByteString.copyFromUtf8(this.languageCode_);
    }

    public String getLocale() {
        return this.locale_;
    }

    public ByteString getLocaleBytes() {
        return ByteString.copyFromUtf8(this.locale_);
    }

    public String getManufacturer() {
        return this.manufacturer_;
    }

    public ByteString getManufacturerBytes() {
        return ByteString.copyFromUtf8(this.manufacturer_);
    }

    public String getModel() {
        return this.model_;
    }

    public ByteString getModelBytes() {
        return ByteString.copyFromUtf8(this.model_);
    }

    public String getOs() {
        return this.os_;
    }

    public ByteString getOsBytes() {
        return ByteString.copyFromUtf8(this.os_);
    }

    public String getOsVersion() {
        return this.osVersion_;
    }

    public ByteString getOsVersionBytes() {
        return ByteString.copyFromUtf8(this.osVersion_);
    }

    public boolean hasBrowserMetadata() {
        return this.browserMetadata_ != null;
    }

    public static a newBuilder(Configuration$DeviceMetadata configuration$DeviceMetadata) {
        return DEFAULT_INSTANCE.createBuilder(configuration$DeviceMetadata);
    }

    public static Configuration$DeviceMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$DeviceMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$DeviceMetadata parseFrom(ByteString byteString) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$DeviceMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$DeviceMetadata parseFrom(byte[] bArr) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$DeviceMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$DeviceMetadata parseFrom(InputStream inputStream) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$DeviceMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$DeviceMetadata parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$DeviceMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}