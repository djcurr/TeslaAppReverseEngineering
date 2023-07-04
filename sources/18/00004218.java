package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.c1;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation;
import com.plaid.internal.m1;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Common$TextInput extends GeneratedMessageLite<Common$TextInput, b> implements MessageLiteOrBuilder {
    public static final int AUTOCOMPLETE_TYPE_FIELD_NUMBER = 11;
    private static final Common$TextInput DEFAULT_INSTANCE;
    public static final int ENCRYPTION_FIELD_NUMBER = 8;
    public static final int ICON_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LABEL_FIELD_NUMBER = 3;
    private static volatile Parser<Common$TextInput> PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 4;
    public static final int PREFILLED_TEXT_FIELD_NUMBER = 7;
    public static final int SECURE_FIELD_NUMBER = 5;
    public static final int SECURE_OPTIONS_FIELD_NUMBER = 10;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int VALIDATION_FIELD_NUMBER = 6;
    private int autocompleteType_;
    private Common$SDKEncryptionMetadata encryption_;
    private Common$RenderedAssetAppearance icon_;
    private String id_ = "";
    private Common$LocalizedString label_;
    private Common$LocalizedString placeholder_;
    private Common$LocalizedString prefilledText_;
    private SecureOptions secureOptions_;
    private boolean secure_;
    private int type_;
    private Common$TextInputValidation validation_;

    /* loaded from: classes2.dex */
    public static final class SecureOptions extends GeneratedMessageLite<SecureOptions, a> implements MessageLiteOrBuilder {
        private static final SecureOptions DEFAULT_INSTANCE;
        public static final int ENABLE_MASKING_FIELD_NUMBER = 2;
        private static volatile Parser<SecureOptions> PARSER = null;
        public static final int TOGGLE_MASKING_FIELD_NUMBER = 1;
        private boolean enableMasking_;
        private boolean toggleMasking_;

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<SecureOptions, a> implements MessageLiteOrBuilder {
            public a() {
                super(SecureOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            SecureOptions secureOptions = new SecureOptions();
            DEFAULT_INSTANCE = secureOptions;
            GeneratedMessageLite.registerDefaultInstance(SecureOptions.class, secureOptions);
        }

        private SecureOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnableMasking() {
            this.enableMasking_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToggleMasking() {
            this.toggleMasking_ = false;
        }

        public static SecureOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SecureOptions parseDelimitedFrom(InputStream inputStream) {
            return (SecureOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SecureOptions parseFrom(ByteBuffer byteBuffer) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SecureOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnableMasking(boolean z11) {
            this.enableMasking_ = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToggleMasking(boolean z11) {
            this.toggleMasking_ = z11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (c1.f18233a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SecureOptions();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"toggleMasking_", "enableMasking_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SecureOptions> parser = PARSER;
                    if (parser == null) {
                        synchronized (SecureOptions.class) {
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

        public boolean getEnableMasking() {
            return this.enableMasking_;
        }

        public boolean getToggleMasking() {
            return this.toggleMasking_;
        }

        public static a newBuilder(SecureOptions secureOptions) {
            return DEFAULT_INSTANCE.createBuilder(secureOptions);
        }

        public static SecureOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SecureOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SecureOptions parseFrom(ByteString byteString) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SecureOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SecureOptions parseFrom(byte[] bArr) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SecureOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SecureOptions parseFrom(InputStream inputStream) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SecureOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SecureOptions parseFrom(CodedInputStream codedInputStream) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SecureOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public enum a implements Internal.EnumLite {
        AUTOCOMPLETE_UNKNOWN(0),
        AUTOCOMPLETE_ONE_TIME_CODE(1),
        UNRECOGNIZED(-1);
        
        public static final int AUTOCOMPLETE_ONE_TIME_CODE_VALUE = 1;
        public static final int AUTOCOMPLETE_UNKNOWN_VALUE = 0;

        /* renamed from: b  reason: collision with root package name */
        public static final Internal.EnumLiteMap<a> f18356b = new C0333a();

        /* renamed from: a  reason: collision with root package name */
        public final int f18358a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0333a implements Internal.EnumLiteMap<a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public a findValueByNumber(int i11) {
                return a.forNumber(i11);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a  reason: collision with root package name */
            public static final Internal.EnumVerifier f18359a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i11) {
                return a.forNumber(i11) != null;
            }
        }

        a(int i11) {
            this.f18358a = i11;
        }

        public static a forNumber(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    return null;
                }
                return AUTOCOMPLETE_ONE_TIME_CODE;
            }
            return AUTOCOMPLETE_UNKNOWN;
        }

        public static Internal.EnumLiteMap<a> internalGetValueMap() {
            return f18356b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f18359a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f18358a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static a valueOf(int i11) {
            return forNumber(i11);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends GeneratedMessageLite.Builder<Common$TextInput, b> implements MessageLiteOrBuilder {
        public b() {
            super(Common$TextInput.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$TextInput common$TextInput = new Common$TextInput();
        DEFAULT_INSTANCE = common$TextInput;
        GeneratedMessageLite.registerDefaultInstance(Common$TextInput.class, common$TextInput);
    }

    private Common$TextInput() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutocompleteType() {
        this.autocompleteType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncryption() {
        this.encryption_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaceholder() {
        this.placeholder_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrefilledText() {
        this.prefilledText_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecure() {
        this.secure_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecureOptions() {
        this.secureOptions_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidation() {
        this.validation_ = null;
    }

    public static Common$TextInput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEncryption(Common$SDKEncryptionMetadata common$SDKEncryptionMetadata) {
        common$SDKEncryptionMetadata.getClass();
        Common$SDKEncryptionMetadata common$SDKEncryptionMetadata2 = this.encryption_;
        if (common$SDKEncryptionMetadata2 != null && common$SDKEncryptionMetadata2 != Common$SDKEncryptionMetadata.getDefaultInstance()) {
            this.encryption_ = Common$SDKEncryptionMetadata.newBuilder(this.encryption_).mergeFrom((Common$SDKEncryptionMetadata.a) common$SDKEncryptionMetadata).buildPartial();
        } else {
            this.encryption_ = common$SDKEncryptionMetadata;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.icon_ = Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        } else {
            this.icon_ = common$RenderedAssetAppearance;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLabel(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.label_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            this.label_ = Common$LocalizedString.newBuilder(this.label_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
        } else {
            this.label_ = common$LocalizedString;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaceholder(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.placeholder_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            this.placeholder_ = Common$LocalizedString.newBuilder(this.placeholder_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
        } else {
            this.placeholder_ = common$LocalizedString;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrefilledText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.prefilledText_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            this.prefilledText_ = Common$LocalizedString.newBuilder(this.prefilledText_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
        } else {
            this.prefilledText_ = common$LocalizedString;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSecureOptions(SecureOptions secureOptions) {
        secureOptions.getClass();
        SecureOptions secureOptions2 = this.secureOptions_;
        if (secureOptions2 != null && secureOptions2 != SecureOptions.getDefaultInstance()) {
            this.secureOptions_ = SecureOptions.newBuilder(this.secureOptions_).mergeFrom((SecureOptions.a) secureOptions).buildPartial();
        } else {
            this.secureOptions_ = secureOptions;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValidation(Common$TextInputValidation common$TextInputValidation) {
        common$TextInputValidation.getClass();
        Common$TextInputValidation common$TextInputValidation2 = this.validation_;
        if (common$TextInputValidation2 != null && common$TextInputValidation2 != Common$TextInputValidation.getDefaultInstance()) {
            this.validation_ = Common$TextInputValidation.newBuilder(this.validation_).mergeFrom((Common$TextInputValidation.a) common$TextInputValidation).buildPartial();
        } else {
            this.validation_ = common$TextInputValidation;
        }
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$TextInput parseDelimitedFrom(InputStream inputStream) {
        return (Common$TextInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TextInput parseFrom(ByteBuffer byteBuffer) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$TextInput> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutocompleteType(a aVar) {
        this.autocompleteType_ = aVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutocompleteTypeValue(int i11) {
        this.autocompleteType_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryption(Common$SDKEncryptionMetadata common$SDKEncryptionMetadata) {
        common$SDKEncryptionMetadata.getClass();
        this.encryption_ = common$SDKEncryptionMetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.icon_ = common$RenderedAssetAppearance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.label_ = common$LocalizedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaceholder(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.placeholder_ = common$LocalizedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrefilledText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.prefilledText_ = common$LocalizedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecure(boolean z11) {
        this.secure_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecureOptions(SecureOptions secureOptions) {
        secureOptions.getClass();
        this.secureOptions_ = secureOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(m1 m1Var) {
        this.type_ = m1Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i11) {
        this.type_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidation(Common$TextInputValidation common$TextInputValidation) {
        common$TextInputValidation.getClass();
        this.validation_ = common$TextInputValidation;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$TextInput();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\t\u0004\t\u0005\u0007\u0006\t\u0007\t\b\t\t\t\n\t\u000b\f", new Object[]{"id_", "type_", "label_", "placeholder_", "secure_", "validation_", "prefilledText_", "encryption_", "icon_", "secureOptions_", "autocompleteType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$TextInput> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$TextInput.class) {
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

    public a getAutocompleteType() {
        a forNumber = a.forNumber(this.autocompleteType_);
        return forNumber == null ? a.UNRECOGNIZED : forNumber;
    }

    public int getAutocompleteTypeValue() {
        return this.autocompleteType_;
    }

    public Common$SDKEncryptionMetadata getEncryption() {
        Common$SDKEncryptionMetadata common$SDKEncryptionMetadata = this.encryption_;
        return common$SDKEncryptionMetadata == null ? Common$SDKEncryptionMetadata.getDefaultInstance() : common$SDKEncryptionMetadata;
    }

    public Common$RenderedAssetAppearance getIcon() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public Common$LocalizedString getLabel() {
        Common$LocalizedString common$LocalizedString = this.label_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getPlaceholder() {
        Common$LocalizedString common$LocalizedString = this.placeholder_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getPrefilledText() {
        Common$LocalizedString common$LocalizedString = this.prefilledText_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean getSecure() {
        return this.secure_;
    }

    public SecureOptions getSecureOptions() {
        SecureOptions secureOptions = this.secureOptions_;
        return secureOptions == null ? SecureOptions.getDefaultInstance() : secureOptions;
    }

    public m1 getType() {
        m1 forNumber = m1.forNumber(this.type_);
        return forNumber == null ? m1.UNRECOGNIZED : forNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public Common$TextInputValidation getValidation() {
        Common$TextInputValidation common$TextInputValidation = this.validation_;
        return common$TextInputValidation == null ? Common$TextInputValidation.getDefaultInstance() : common$TextInputValidation;
    }

    public boolean hasEncryption() {
        return this.encryption_ != null;
    }

    public boolean hasIcon() {
        return this.icon_ != null;
    }

    public boolean hasLabel() {
        return this.label_ != null;
    }

    public boolean hasPlaceholder() {
        return this.placeholder_ != null;
    }

    public boolean hasPrefilledText() {
        return this.prefilledText_ != null;
    }

    public boolean hasSecureOptions() {
        return this.secureOptions_ != null;
    }

    public boolean hasValidation() {
        return this.validation_ != null;
    }

    public static b newBuilder(Common$TextInput common$TextInput) {
        return DEFAULT_INSTANCE.createBuilder(common$TextInput);
    }

    public static Common$TextInput parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TextInput parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$TextInput parseFrom(ByteString byteString) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$TextInput parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$TextInput parseFrom(byte[] bArr) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$TextInput parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$TextInput parseFrom(InputStream inputStream) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TextInput parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TextInput parseFrom(CodedInputStream codedInputStream) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$TextInput parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}