package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization;
import com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale;
import com.plaid.internal.xa;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class PreviewOuterClass$Preview extends GeneratedMessageLite<PreviewOuterClass$Preview, a> implements MessageLiteOrBuilder {
    public static final int COBRANDING_CONFIG_FIELD_NUMBER = 6;
    private static final PreviewOuterClass$Preview DEFAULT_INSTANCE;
    public static final int LINK_CUSTOMIZATION_FIELD_NUMBER = 5;
    public static final int LOCALE_FIELD_NUMBER = 4;
    private static volatile Parser<PreviewOuterClass$Preview> PARSER = null;
    public static final int PRESET_FIELD_NUMBER = 1;
    public static final int PRODUCTS_FIELD_NUMBER = 3;
    public static final int SCENARIO_FIELD_NUMBER = 2;
    private CobrandingConfig cobrandingConfig_;
    private LinkCustomizations$LinkCustomization linkCustomization_;
    private LocaleOuterClass$Locale locale_;
    private int preset_;
    private Internal.ProtobufList<String> products_ = GeneratedMessageLite.emptyProtobufList();
    private int scenario_;

    /* loaded from: classes2.dex */
    public static final class CobrandingConfig extends GeneratedMessageLite<CobrandingConfig, a> implements MessageLiteOrBuilder {
        public static final int BRAND_COLOR_FIELD_NUMBER = 2;
        private static final CobrandingConfig DEFAULT_INSTANCE;
        public static final int LOGO_URL_1024_FIELD_NUMBER = 1;
        private static volatile Parser<CobrandingConfig> PARSER;
        private String logoUrl1024_ = "";
        private String brandColor_ = "";

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<CobrandingConfig, a> implements MessageLiteOrBuilder {
            public a() {
                super(CobrandingConfig.DEFAULT_INSTANCE);
            }
        }

        static {
            CobrandingConfig cobrandingConfig = new CobrandingConfig();
            DEFAULT_INSTANCE = cobrandingConfig;
            GeneratedMessageLite.registerDefaultInstance(CobrandingConfig.class, cobrandingConfig);
        }

        private CobrandingConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBrandColor() {
            this.brandColor_ = getDefaultInstance().getBrandColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLogoUrl1024() {
            this.logoUrl1024_ = getDefaultInstance().getLogoUrl1024();
        }

        public static CobrandingConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CobrandingConfig parseDelimitedFrom(InputStream inputStream) {
            return (CobrandingConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CobrandingConfig parseFrom(ByteBuffer byteBuffer) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CobrandingConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrandColor(String str) {
            str.getClass();
            this.brandColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrandColorBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.brandColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogoUrl1024(String str) {
            str.getClass();
            this.logoUrl1024_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogoUrl1024Bytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.logoUrl1024_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (xa.f19836a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CobrandingConfig();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"logoUrl1024_", "brandColor_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CobrandingConfig> parser = PARSER;
                    if (parser == null) {
                        synchronized (CobrandingConfig.class) {
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

        public String getBrandColor() {
            return this.brandColor_;
        }

        public ByteString getBrandColorBytes() {
            return ByteString.copyFromUtf8(this.brandColor_);
        }

        public String getLogoUrl1024() {
            return this.logoUrl1024_;
        }

        public ByteString getLogoUrl1024Bytes() {
            return ByteString.copyFromUtf8(this.logoUrl1024_);
        }

        public static a newBuilder(CobrandingConfig cobrandingConfig) {
            return DEFAULT_INSTANCE.createBuilder(cobrandingConfig);
        }

        public static CobrandingConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CobrandingConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CobrandingConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CobrandingConfig parseFrom(ByteString byteString) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CobrandingConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CobrandingConfig parseFrom(byte[] bArr) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CobrandingConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CobrandingConfig parseFrom(InputStream inputStream) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CobrandingConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CobrandingConfig parseFrom(CodedInputStream codedInputStream) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CobrandingConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class RenderingOptions extends GeneratedMessageLite<RenderingOptions, a> implements MessageLiteOrBuilder {
        private static final RenderingOptions DEFAULT_INSTANCE;
        public static final int PANE_DISABLED_FIELD_NUMBER = 1;
        private static volatile Parser<RenderingOptions> PARSER = null;
        public static final int SHOW_TRANSITION_FIELD_NUMBER = 2;
        private boolean paneDisabled_;
        private boolean showTransition_;

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<RenderingOptions, a> implements MessageLiteOrBuilder {
            public a() {
                super(RenderingOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            RenderingOptions renderingOptions = new RenderingOptions();
            DEFAULT_INSTANCE = renderingOptions;
            GeneratedMessageLite.registerDefaultInstance(RenderingOptions.class, renderingOptions);
        }

        private RenderingOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaneDisabled() {
            this.paneDisabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowTransition() {
            this.showTransition_ = false;
        }

        public static RenderingOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RenderingOptions parseDelimitedFrom(InputStream inputStream) {
            return (RenderingOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RenderingOptions parseFrom(ByteBuffer byteBuffer) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RenderingOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaneDisabled(boolean z11) {
            this.paneDisabled_ = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowTransition(boolean z11) {
            this.showTransition_ = z11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (xa.f19836a[methodToInvoke.ordinal()]) {
                case 1:
                    return new RenderingOptions();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"paneDisabled_", "showTransition_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RenderingOptions> parser = PARSER;
                    if (parser == null) {
                        synchronized (RenderingOptions.class) {
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

        public boolean getPaneDisabled() {
            return this.paneDisabled_;
        }

        public boolean getShowTransition() {
            return this.showTransition_;
        }

        public static a newBuilder(RenderingOptions renderingOptions) {
            return DEFAULT_INSTANCE.createBuilder(renderingOptions);
        }

        public static RenderingOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderingOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RenderingOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RenderingOptions parseFrom(ByteString byteString) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RenderingOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RenderingOptions parseFrom(byte[] bArr) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RenderingOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RenderingOptions parseFrom(InputStream inputStream) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RenderingOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RenderingOptions parseFrom(CodedInputStream codedInputStream) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RenderingOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<PreviewOuterClass$Preview, a> implements MessageLiteOrBuilder {
        public a() {
            super(PreviewOuterClass$Preview.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes2.dex */
    public enum b implements Internal.EnumLite {
        PREVIEW_PRESET_UNKNOWN(0),
        PREVIEW_PRESET_ACCOUNT_NUMBER_PANE(1),
        PREVIEW_PRESET_ACCOUNT_SELECT_PANE(2),
        PREVIEW_PRESET_CONNECTED_PANE(3),
        PREVIEW_PRESET_CREDENTIAL_PANE(4),
        PREVIEW_PRESET_ERROR_PANE(5),
        PREVIEW_PRESET_EUCONSENT_PANE(6),
        PREVIEW_PRESET_EXIT_PANE(7),
        PREVIEW_PRESET_INSTITUTION_SEARCH_PANE(8),
        PREVIEW_PRESET_INSTITUTION_SELECT_PANE(9),
        PREVIEW_PRESET_LOADING_PANE(10),
        PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_START_PANE(11),
        PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_COMPLETE_PANE(12),
        PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_PANE(13),
        PREVIEW_PRESET_MFA_DEVICE_PANE(14),
        PREVIEW_PRESET_MFA_QUESTION_PANE(15),
        PREVIEW_PRESET_MFA_SELECTION_PANE(16),
        PREVIEW_PRESET_OAUTH_LOADING_PANE(17),
        PREVIEW_PRESET_PRIVACY_INTERSTITIAL_PANE(18),
        PREVIEW_PRESET_RECAPTCHA_PANE(19),
        PREVIEW_PRESET_RECONNECTED_PANE(20),
        PREVIEW_PRESET_ROUTING_NUMBER_PANE(21),
        UNRECOGNIZED(-1);
        
        public static final int PREVIEW_PRESET_ACCOUNT_NUMBER_PANE_VALUE = 1;
        public static final int PREVIEW_PRESET_ACCOUNT_SELECT_PANE_VALUE = 2;
        public static final int PREVIEW_PRESET_CONNECTED_PANE_VALUE = 3;
        public static final int PREVIEW_PRESET_CREDENTIAL_PANE_VALUE = 4;
        public static final int PREVIEW_PRESET_ERROR_PANE_VALUE = 5;
        public static final int PREVIEW_PRESET_EUCONSENT_PANE_VALUE = 6;
        public static final int PREVIEW_PRESET_EXIT_PANE_VALUE = 7;
        public static final int PREVIEW_PRESET_INSTITUTION_SEARCH_PANE_VALUE = 8;
        public static final int PREVIEW_PRESET_INSTITUTION_SELECT_PANE_VALUE = 9;
        public static final int PREVIEW_PRESET_LOADING_PANE_VALUE = 10;
        public static final int PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_START_PANE_VALUE = 11;
        public static final int PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_COMPLETE_PANE_VALUE = 12;
        public static final int PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_PANE_VALUE = 13;
        public static final int PREVIEW_PRESET_MFA_DEVICE_PANE_VALUE = 14;
        public static final int PREVIEW_PRESET_MFA_QUESTION_PANE_VALUE = 15;
        public static final int PREVIEW_PRESET_MFA_SELECTION_PANE_VALUE = 16;
        public static final int PREVIEW_PRESET_OAUTH_LOADING_PANE_VALUE = 17;
        public static final int PREVIEW_PRESET_PRIVACY_INTERSTITIAL_PANE_VALUE = 18;
        public static final int PREVIEW_PRESET_RECAPTCHA_PANE_VALUE = 19;
        public static final int PREVIEW_PRESET_RECONNECTED_PANE_VALUE = 20;
        public static final int PREVIEW_PRESET_ROUTING_NUMBER_PANE_VALUE = 21;
        public static final int PREVIEW_PRESET_UNKNOWN_VALUE = 0;

        /* renamed from: b  reason: collision with root package name */
        public static final Internal.EnumLiteMap<b> f18408b = new a();

        /* renamed from: a  reason: collision with root package name */
        public final int f18410a;

        /* loaded from: classes2.dex */
        public class a implements Internal.EnumLiteMap<b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public b findValueByNumber(int i11) {
                return b.forNumber(i11);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0335b implements Internal.EnumVerifier {

            /* renamed from: a  reason: collision with root package name */
            public static final Internal.EnumVerifier f18411a = new C0335b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i11) {
                return b.forNumber(i11) != null;
            }
        }

        b(int i11) {
            this.f18410a = i11;
        }

        public static b forNumber(int i11) {
            switch (i11) {
                case 0:
                    return PREVIEW_PRESET_UNKNOWN;
                case 1:
                    return PREVIEW_PRESET_ACCOUNT_NUMBER_PANE;
                case 2:
                    return PREVIEW_PRESET_ACCOUNT_SELECT_PANE;
                case 3:
                    return PREVIEW_PRESET_CONNECTED_PANE;
                case 4:
                    return PREVIEW_PRESET_CREDENTIAL_PANE;
                case 5:
                    return PREVIEW_PRESET_ERROR_PANE;
                case 6:
                    return PREVIEW_PRESET_EUCONSENT_PANE;
                case 7:
                    return PREVIEW_PRESET_EXIT_PANE;
                case 8:
                    return PREVIEW_PRESET_INSTITUTION_SEARCH_PANE;
                case 9:
                    return PREVIEW_PRESET_INSTITUTION_SELECT_PANE;
                case 10:
                    return PREVIEW_PRESET_LOADING_PANE;
                case 11:
                    return PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_START_PANE;
                case 12:
                    return PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_COMPLETE_PANE;
                case 13:
                    return PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_PANE;
                case 14:
                    return PREVIEW_PRESET_MFA_DEVICE_PANE;
                case 15:
                    return PREVIEW_PRESET_MFA_QUESTION_PANE;
                case 16:
                    return PREVIEW_PRESET_MFA_SELECTION_PANE;
                case 17:
                    return PREVIEW_PRESET_OAUTH_LOADING_PANE;
                case 18:
                    return PREVIEW_PRESET_PRIVACY_INTERSTITIAL_PANE;
                case 19:
                    return PREVIEW_PRESET_RECAPTCHA_PANE;
                case 20:
                    return PREVIEW_PRESET_RECONNECTED_PANE;
                case 21:
                    return PREVIEW_PRESET_ROUTING_NUMBER_PANE;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<b> internalGetValueMap() {
            return f18408b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C0335b.f18411a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f18410a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    /* loaded from: classes2.dex */
    public enum c implements Internal.EnumLite {
        PREVIEW_SCENARIO_UNKNOWN(0),
        PREVIEW_SCENARIO_ACCOUNT_SELECT_V2(1),
        PREVIEW_SCENARIO_SCROLLED_TO_BOTTOM(2),
        PREVIEW_SCENARIO_ENTERING_CODE(3),
        PREVIEW_SCENARIO_NO_RESULTS(4),
        UNRECOGNIZED(-1);
        
        public static final int PREVIEW_SCENARIO_ACCOUNT_SELECT_V2_VALUE = 1;
        public static final int PREVIEW_SCENARIO_ENTERING_CODE_VALUE = 3;
        public static final int PREVIEW_SCENARIO_NO_RESULTS_VALUE = 4;
        public static final int PREVIEW_SCENARIO_SCROLLED_TO_BOTTOM_VALUE = 2;
        public static final int PREVIEW_SCENARIO_UNKNOWN_VALUE = 0;

        /* renamed from: b  reason: collision with root package name */
        public static final Internal.EnumLiteMap<c> f18412b = new a();

        /* renamed from: a  reason: collision with root package name */
        public final int f18414a;

        /* loaded from: classes2.dex */
        public class a implements Internal.EnumLiteMap<c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public c findValueByNumber(int i11) {
                return c.forNumber(i11);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a  reason: collision with root package name */
            public static final Internal.EnumVerifier f18415a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i11) {
                return c.forNumber(i11) != null;
            }
        }

        c(int i11) {
            this.f18414a = i11;
        }

        public static c forNumber(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                return null;
                            }
                            return PREVIEW_SCENARIO_NO_RESULTS;
                        }
                        return PREVIEW_SCENARIO_ENTERING_CODE;
                    }
                    return PREVIEW_SCENARIO_SCROLLED_TO_BOTTOM;
                }
                return PREVIEW_SCENARIO_ACCOUNT_SELECT_V2;
            }
            return PREVIEW_SCENARIO_UNKNOWN;
        }

        public static Internal.EnumLiteMap<c> internalGetValueMap() {
            return f18412b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f18415a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f18414a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static c valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        PreviewOuterClass$Preview previewOuterClass$Preview = new PreviewOuterClass$Preview();
        DEFAULT_INSTANCE = previewOuterClass$Preview;
        GeneratedMessageLite.registerDefaultInstance(PreviewOuterClass$Preview.class, previewOuterClass$Preview);
    }

    private PreviewOuterClass$Preview() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProducts(Iterable<String> iterable) {
        ensureProductsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.products_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducts(String str) {
        str.getClass();
        ensureProductsIsMutable();
        this.products_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProductsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureProductsIsMutable();
        this.products_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCobrandingConfig() {
        this.cobrandingConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkCustomization() {
        this.linkCustomization_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.locale_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreset() {
        this.preset_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducts() {
        this.products_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScenario() {
        this.scenario_ = 0;
    }

    private void ensureProductsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.products_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.products_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PreviewOuterClass$Preview getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCobrandingConfig(CobrandingConfig cobrandingConfig) {
        cobrandingConfig.getClass();
        CobrandingConfig cobrandingConfig2 = this.cobrandingConfig_;
        if (cobrandingConfig2 != null && cobrandingConfig2 != CobrandingConfig.getDefaultInstance()) {
            this.cobrandingConfig_ = CobrandingConfig.newBuilder(this.cobrandingConfig_).mergeFrom((CobrandingConfig.a) cobrandingConfig).buildPartial();
        } else {
            this.cobrandingConfig_ = cobrandingConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLinkCustomization(LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization) {
        linkCustomizations$LinkCustomization.getClass();
        LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization2 = this.linkCustomization_;
        if (linkCustomizations$LinkCustomization2 != null && linkCustomizations$LinkCustomization2 != LinkCustomizations$LinkCustomization.getDefaultInstance()) {
            this.linkCustomization_ = LinkCustomizations$LinkCustomization.newBuilder(this.linkCustomization_).mergeFrom((LinkCustomizations$LinkCustomization.b) linkCustomizations$LinkCustomization).buildPartial();
        } else {
            this.linkCustomization_ = linkCustomizations$LinkCustomization;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocale(LocaleOuterClass$Locale localeOuterClass$Locale) {
        localeOuterClass$Locale.getClass();
        LocaleOuterClass$Locale localeOuterClass$Locale2 = this.locale_;
        if (localeOuterClass$Locale2 != null && localeOuterClass$Locale2 != LocaleOuterClass$Locale.getDefaultInstance()) {
            this.locale_ = LocaleOuterClass$Locale.newBuilder(this.locale_).mergeFrom((LocaleOuterClass$Locale.a) localeOuterClass$Locale).buildPartial();
        } else {
            this.locale_ = localeOuterClass$Locale;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PreviewOuterClass$Preview parseDelimitedFrom(InputStream inputStream) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreviewOuterClass$Preview parseFrom(ByteBuffer byteBuffer) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PreviewOuterClass$Preview> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCobrandingConfig(CobrandingConfig cobrandingConfig) {
        cobrandingConfig.getClass();
        this.cobrandingConfig_ = cobrandingConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkCustomization(LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization) {
        linkCustomizations$LinkCustomization.getClass();
        this.linkCustomization_ = linkCustomizations$LinkCustomization;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(LocaleOuterClass$Locale localeOuterClass$Locale) {
        localeOuterClass$Locale.getClass();
        this.locale_ = localeOuterClass$Locale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreset(b bVar) {
        this.preset_ = bVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresetValue(int i11) {
        this.preset_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducts(int i11, String str) {
        str.getClass();
        ensureProductsIsMutable();
        this.products_.set(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScenario(c cVar) {
        this.scenario_ = cVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScenarioValue(int i11) {
        this.scenario_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (xa.f19836a[methodToInvoke.ordinal()]) {
            case 1:
                return new PreviewOuterClass$Preview();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002\f\u0003Ț\u0004\t\u0005\t\u0006\t", new Object[]{"preset_", "scenario_", "products_", "locale_", "linkCustomization_", "cobrandingConfig_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PreviewOuterClass$Preview> parser = PARSER;
                if (parser == null) {
                    synchronized (PreviewOuterClass$Preview.class) {
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

    public CobrandingConfig getCobrandingConfig() {
        CobrandingConfig cobrandingConfig = this.cobrandingConfig_;
        return cobrandingConfig == null ? CobrandingConfig.getDefaultInstance() : cobrandingConfig;
    }

    public LinkCustomizations$LinkCustomization getLinkCustomization() {
        LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization = this.linkCustomization_;
        return linkCustomizations$LinkCustomization == null ? LinkCustomizations$LinkCustomization.getDefaultInstance() : linkCustomizations$LinkCustomization;
    }

    public LocaleOuterClass$Locale getLocale() {
        LocaleOuterClass$Locale localeOuterClass$Locale = this.locale_;
        return localeOuterClass$Locale == null ? LocaleOuterClass$Locale.getDefaultInstance() : localeOuterClass$Locale;
    }

    public b getPreset() {
        b forNumber = b.forNumber(this.preset_);
        return forNumber == null ? b.UNRECOGNIZED : forNumber;
    }

    public int getPresetValue() {
        return this.preset_;
    }

    public String getProducts(int i11) {
        return this.products_.get(i11);
    }

    public ByteString getProductsBytes(int i11) {
        return ByteString.copyFromUtf8(this.products_.get(i11));
    }

    public int getProductsCount() {
        return this.products_.size();
    }

    public List<String> getProductsList() {
        return this.products_;
    }

    public c getScenario() {
        c forNumber = c.forNumber(this.scenario_);
        return forNumber == null ? c.UNRECOGNIZED : forNumber;
    }

    public int getScenarioValue() {
        return this.scenario_;
    }

    public boolean hasCobrandingConfig() {
        return this.cobrandingConfig_ != null;
    }

    public boolean hasLinkCustomization() {
        return this.linkCustomization_ != null;
    }

    public boolean hasLocale() {
        return this.locale_ != null;
    }

    public static a newBuilder(PreviewOuterClass$Preview previewOuterClass$Preview) {
        return DEFAULT_INSTANCE.createBuilder(previewOuterClass$Preview);
    }

    public static PreviewOuterClass$Preview parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PreviewOuterClass$Preview parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PreviewOuterClass$Preview parseFrom(ByteString byteString) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PreviewOuterClass$Preview parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PreviewOuterClass$Preview parseFrom(byte[] bArr) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PreviewOuterClass$Preview parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PreviewOuterClass$Preview parseFrom(InputStream inputStream) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreviewOuterClass$Preview parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PreviewOuterClass$Preview parseFrom(CodedInputStream codedInputStream) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PreviewOuterClass$Preview parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}