package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale;
import com.plaid.internal.p1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Configuration$LinkConfiguration extends GeneratedMessageLite<Configuration$LinkConfiguration, b> implements MessageLiteOrBuilder {
    public static final int ACCOUNT_FILTER_FIELD_NUMBER = 7;
    public static final int CLIENT_NAME_FIELD_NUMBER = 22;
    private static final Configuration$LinkConfiguration DEFAULT_INSTANCE;
    public static final int ENABLE_ACCOUNT_SELECT_FIELD_NUMBER = 18;
    public static final int INITIAL_PRODUCTS_FIELD_NUMBER = 6;
    public static final int INSTITUTION_ID_FIELD_NUMBER = 23;
    public static final int LINK_CUSTOMIZATION_NAME_FIELD_NUMBER = 5;
    public static final int LINK_OPEN_ID_FIELD_NUMBER = 1;
    public static final int LINK_PERSISTENT_ID_FIELD_NUMBER = 2;
    public static final int LOCALE_FIELD_NUMBER = 25;
    public static final int OAUTH_NONCE_FIELD_NUMBER = 16;
    public static final int OAUTH_REDIRECT_URI_FIELD_NUMBER = 11;
    public static final int OAUTH_STATE_ID_FIELD_NUMBER = 15;
    private static volatile Parser<Configuration$LinkConfiguration> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 4;
    public static final int TOKEN_FIELD_NUMBER = 24;
    public static final int USER_FIELD_NUMBER = 8;
    public static final int WEBHOOK_FIELD_NUMBER = 17;
    public static final int WEBVIEW_REDIRECT_URI_FIELD_NUMBER = 12;
    private boolean enableAccountSelect_;
    private LocaleOuterClass$Locale locale_;
    private User user_;
    private MapFieldLite<String, RepeatedAccountSubtype> accountFilter_ = MapFieldLite.emptyMapField();
    private String linkOpenId_ = "";
    private String linkPersistentId_ = "";
    private String publicKey_ = "";
    private String linkCustomizationName_ = "";
    private Internal.ProtobufList<String> initialProducts_ = GeneratedMessageLite.emptyProtobufList();
    private String oauthRedirectUri_ = "";
    private String webviewRedirectUri_ = "";
    private String oauthStateId_ = "";
    private String oauthNonce_ = "";
    private String webhook_ = "";
    private String clientName_ = "";
    private String institutionId_ = "";
    private String token_ = "";

    /* loaded from: classes2.dex */
    public static final class RepeatedAccountSubtype extends GeneratedMessageLite<RepeatedAccountSubtype, a> implements MessageLiteOrBuilder {
        private static final RepeatedAccountSubtype DEFAULT_INSTANCE;
        private static volatile Parser<RepeatedAccountSubtype> PARSER = null;
        public static final int SUBTYPES_FIELD_NUMBER = 1;
        private Internal.ProtobufList<String> subtypes_ = GeneratedMessageLite.emptyProtobufList();

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<RepeatedAccountSubtype, a> implements MessageLiteOrBuilder {
            public a() {
                super(RepeatedAccountSubtype.DEFAULT_INSTANCE);
            }

            public a a(Iterable<String> iterable) {
                copyOnWrite();
                ((RepeatedAccountSubtype) this.instance).addAllSubtypes(iterable);
                return this;
            }
        }

        static {
            RepeatedAccountSubtype repeatedAccountSubtype = new RepeatedAccountSubtype();
            DEFAULT_INSTANCE = repeatedAccountSubtype;
            GeneratedMessageLite.registerDefaultInstance(RepeatedAccountSubtype.class, repeatedAccountSubtype);
        }

        private RepeatedAccountSubtype() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSubtypes(Iterable<String> iterable) {
            ensureSubtypesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.subtypes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSubtypes(String str) {
            str.getClass();
            ensureSubtypesIsMutable();
            this.subtypes_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSubtypesBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureSubtypesIsMutable();
            this.subtypes_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubtypes() {
            this.subtypes_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureSubtypesIsMutable() {
            Internal.ProtobufList<String> protobufList = this.subtypes_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.subtypes_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static RepeatedAccountSubtype getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RepeatedAccountSubtype parseDelimitedFrom(InputStream inputStream) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RepeatedAccountSubtype parseFrom(ByteBuffer byteBuffer) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RepeatedAccountSubtype> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubtypes(int i11, String str) {
            str.getClass();
            ensureSubtypesIsMutable();
            this.subtypes_.set(i11, str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (p1.f19204a[methodToInvoke.ordinal()]) {
                case 1:
                    return new RepeatedAccountSubtype();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"subtypes_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RepeatedAccountSubtype> parser = PARSER;
                    if (parser == null) {
                        synchronized (RepeatedAccountSubtype.class) {
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

        public String getSubtypes(int i11) {
            return this.subtypes_.get(i11);
        }

        public ByteString getSubtypesBytes(int i11) {
            return ByteString.copyFromUtf8(this.subtypes_.get(i11));
        }

        public int getSubtypesCount() {
            return this.subtypes_.size();
        }

        public List<String> getSubtypesList() {
            return this.subtypes_;
        }

        public static a newBuilder(RepeatedAccountSubtype repeatedAccountSubtype) {
            return DEFAULT_INSTANCE.createBuilder(repeatedAccountSubtype);
        }

        public static RepeatedAccountSubtype parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RepeatedAccountSubtype parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RepeatedAccountSubtype parseFrom(ByteString byteString) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RepeatedAccountSubtype parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RepeatedAccountSubtype parseFrom(byte[] bArr) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RepeatedAccountSubtype parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RepeatedAccountSubtype parseFrom(InputStream inputStream) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RepeatedAccountSubtype parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RepeatedAccountSubtype parseFrom(CodedInputStream codedInputStream) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RepeatedAccountSubtype parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class User extends GeneratedMessageLite<User, a> implements MessageLiteOrBuilder {
        private static final User DEFAULT_INSTANCE;
        public static final int EMAIL_ADDRESS_FIELD_NUMBER = 2;
        public static final int LEGAL_NAME_FIELD_NUMBER = 1;
        private static volatile Parser<User> PARSER = null;
        public static final int PHONE_NUMBER_FIELD_NUMBER = 3;
        private String legalName_ = "";
        private String emailAddress_ = "";
        private String phoneNumber_ = "";

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<User, a> implements MessageLiteOrBuilder {
            public a() {
                super(User.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((User) this.instance).setEmailAddress(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((User) this.instance).setLegalName(str);
                return this;
            }

            public a c(String str) {
                copyOnWrite();
                ((User) this.instance).setPhoneNumber(str);
                return this;
            }
        }

        static {
            User user = new User();
            DEFAULT_INSTANCE = user;
            GeneratedMessageLite.registerDefaultInstance(User.class, user);
        }

        private User() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEmailAddress() {
            this.emailAddress_ = getDefaultInstance().getEmailAddress();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLegalName() {
            this.legalName_ = getDefaultInstance().getLegalName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhoneNumber() {
            this.phoneNumber_ = getDefaultInstance().getPhoneNumber();
        }

        public static User getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static User parseDelimitedFrom(InputStream inputStream) {
            return (User) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static User parseFrom(ByteBuffer byteBuffer) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<User> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEmailAddress(String str) {
            str.getClass();
            this.emailAddress_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEmailAddressBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.emailAddress_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLegalName(String str) {
            str.getClass();
            this.legalName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLegalNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.legalName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneNumber(String str) {
            str.getClass();
            this.phoneNumber_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneNumberBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.phoneNumber_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (p1.f19204a[methodToInvoke.ordinal()]) {
                case 1:
                    return new User();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"legalName_", "emailAddress_", "phoneNumber_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<User> parser = PARSER;
                    if (parser == null) {
                        synchronized (User.class) {
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

        public String getEmailAddress() {
            return this.emailAddress_;
        }

        public ByteString getEmailAddressBytes() {
            return ByteString.copyFromUtf8(this.emailAddress_);
        }

        public String getLegalName() {
            return this.legalName_;
        }

        public ByteString getLegalNameBytes() {
            return ByteString.copyFromUtf8(this.legalName_);
        }

        public String getPhoneNumber() {
            return this.phoneNumber_;
        }

        public ByteString getPhoneNumberBytes() {
            return ByteString.copyFromUtf8(this.phoneNumber_);
        }

        public static a newBuilder(User user) {
            return DEFAULT_INSTANCE.createBuilder(user);
        }

        public static User parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (User) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static User parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static User parseFrom(ByteString byteString) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static User parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static User parseFrom(byte[] bArr) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static User parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static User parseFrom(InputStream inputStream) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static User parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static User parseFrom(CodedInputStream codedInputStream) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static User parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final MapEntryLite<String, RepeatedAccountSubtype> f18407a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, RepeatedAccountSubtype.getDefaultInstance());
    }

    static {
        Configuration$LinkConfiguration configuration$LinkConfiguration = new Configuration$LinkConfiguration();
        DEFAULT_INSTANCE = configuration$LinkConfiguration;
        GeneratedMessageLite.registerDefaultInstance(Configuration$LinkConfiguration.class, configuration$LinkConfiguration);
    }

    private Configuration$LinkConfiguration() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInitialProducts(Iterable<String> iterable) {
        ensureInitialProductsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.initialProducts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInitialProducts(String str) {
        str.getClass();
        ensureInitialProductsIsMutable();
        this.initialProducts_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInitialProductsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureInitialProductsIsMutable();
        this.initialProducts_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientName() {
        this.clientName_ = getDefaultInstance().getClientName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableAccountSelect() {
        this.enableAccountSelect_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInitialProducts() {
        this.initialProducts_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionId() {
        this.institutionId_ = getDefaultInstance().getInstitutionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkCustomizationName() {
        this.linkCustomizationName_ = getDefaultInstance().getLinkCustomizationName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkOpenId() {
        this.linkOpenId_ = getDefaultInstance().getLinkOpenId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkPersistentId() {
        this.linkPersistentId_ = getDefaultInstance().getLinkPersistentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.locale_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOauthNonce() {
        this.oauthNonce_ = getDefaultInstance().getOauthNonce();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOauthRedirectUri() {
        this.oauthRedirectUri_ = getDefaultInstance().getOauthRedirectUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOauthStateId() {
        this.oauthStateId_ = getDefaultInstance().getOauthStateId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicKey() {
        this.publicKey_ = getDefaultInstance().getPublicKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.token_ = getDefaultInstance().getToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUser() {
        this.user_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebhook() {
        this.webhook_ = getDefaultInstance().getWebhook();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebviewRedirectUri() {
        this.webviewRedirectUri_ = getDefaultInstance().getWebviewRedirectUri();
    }

    private void ensureInitialProductsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.initialProducts_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.initialProducts_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Configuration$LinkConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, RepeatedAccountSubtype> getMutableAccountFilterMap() {
        return internalGetMutableAccountFilter();
    }

    private MapFieldLite<String, RepeatedAccountSubtype> internalGetAccountFilter() {
        return this.accountFilter_;
    }

    private MapFieldLite<String, RepeatedAccountSubtype> internalGetMutableAccountFilter() {
        if (!this.accountFilter_.isMutable()) {
            this.accountFilter_ = this.accountFilter_.mutableCopy();
        }
        return this.accountFilter_;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUser(User user) {
        user.getClass();
        User user2 = this.user_;
        if (user2 != null && user2 != User.getDefaultInstance()) {
            this.user_ = User.newBuilder(this.user_).mergeFrom((User.a) user).buildPartial();
        } else {
            this.user_ = user;
        }
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$LinkConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$LinkConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$LinkConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientName(String str) {
        str.getClass();
        this.clientName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.clientName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableAccountSelect(boolean z11) {
        this.enableAccountSelect_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitialProducts(int i11, String str) {
        str.getClass();
        ensureInitialProductsIsMutable();
        this.initialProducts_.set(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionId(String str) {
        str.getClass();
        this.institutionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.institutionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkCustomizationName(String str) {
        str.getClass();
        this.linkCustomizationName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkCustomizationNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkCustomizationName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkOpenId(String str) {
        str.getClass();
        this.linkOpenId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkOpenIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkOpenId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkPersistentId(String str) {
        str.getClass();
        this.linkPersistentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkPersistentIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkPersistentId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(LocaleOuterClass$Locale localeOuterClass$Locale) {
        localeOuterClass$Locale.getClass();
        this.locale_ = localeOuterClass$Locale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthNonce(String str) {
        str.getClass();
        this.oauthNonce_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthNonceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.oauthNonce_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthRedirectUri(String str) {
        str.getClass();
        this.oauthRedirectUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthRedirectUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.oauthRedirectUri_ = byteString.toStringUtf8();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicKey(String str) {
        str.getClass();
        this.publicKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.publicKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToken(String str) {
        str.getClass();
        this.token_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.token_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUser(User user) {
        user.getClass();
        this.user_ = user;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebhook(String str) {
        str.getClass();
        this.webhook_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebhookBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.webhook_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewRedirectUri(String str) {
        str.getClass();
        this.webviewRedirectUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewRedirectUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewRedirectUri_ = byteString.toStringUtf8();
    }

    public boolean containsAccountFilter(String str) {
        str.getClass();
        return internalGetAccountFilter().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (p1.f19204a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$LinkConfiguration();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0000\u0001\u0019\u0011\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005Ȉ\u0006Ț\u00072\b\t\u000bȈ\fȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012\u0007\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019\t", new Object[]{"linkOpenId_", "linkPersistentId_", "publicKey_", "linkCustomizationName_", "initialProducts_", "accountFilter_", a.f18407a, "user_", "oauthRedirectUri_", "webviewRedirectUri_", "oauthStateId_", "oauthNonce_", "webhook_", "enableAccountSelect_", "clientName_", "institutionId_", "token_", "locale_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$LinkConfiguration> parser = PARSER;
                if (parser == null) {
                    synchronized (Configuration$LinkConfiguration.class) {
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

    @Deprecated
    public Map<String, RepeatedAccountSubtype> getAccountFilter() {
        return getAccountFilterMap();
    }

    public int getAccountFilterCount() {
        return internalGetAccountFilter().size();
    }

    public Map<String, RepeatedAccountSubtype> getAccountFilterMap() {
        return Collections.unmodifiableMap(internalGetAccountFilter());
    }

    public RepeatedAccountSubtype getAccountFilterOrDefault(String str, RepeatedAccountSubtype repeatedAccountSubtype) {
        str.getClass();
        MapFieldLite<String, RepeatedAccountSubtype> internalGetAccountFilter = internalGetAccountFilter();
        return internalGetAccountFilter.containsKey(str) ? internalGetAccountFilter.get(str) : repeatedAccountSubtype;
    }

    public RepeatedAccountSubtype getAccountFilterOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, RepeatedAccountSubtype> internalGetAccountFilter = internalGetAccountFilter();
        if (internalGetAccountFilter.containsKey(str)) {
            return internalGetAccountFilter.get(str);
        }
        throw new IllegalArgumentException();
    }

    public String getClientName() {
        return this.clientName_;
    }

    public ByteString getClientNameBytes() {
        return ByteString.copyFromUtf8(this.clientName_);
    }

    public boolean getEnableAccountSelect() {
        return this.enableAccountSelect_;
    }

    public String getInitialProducts(int i11) {
        return this.initialProducts_.get(i11);
    }

    public ByteString getInitialProductsBytes(int i11) {
        return ByteString.copyFromUtf8(this.initialProducts_.get(i11));
    }

    public int getInitialProductsCount() {
        return this.initialProducts_.size();
    }

    public List<String> getInitialProductsList() {
        return this.initialProducts_;
    }

    public String getInstitutionId() {
        return this.institutionId_;
    }

    public ByteString getInstitutionIdBytes() {
        return ByteString.copyFromUtf8(this.institutionId_);
    }

    public String getLinkCustomizationName() {
        return this.linkCustomizationName_;
    }

    public ByteString getLinkCustomizationNameBytes() {
        return ByteString.copyFromUtf8(this.linkCustomizationName_);
    }

    public String getLinkOpenId() {
        return this.linkOpenId_;
    }

    public ByteString getLinkOpenIdBytes() {
        return ByteString.copyFromUtf8(this.linkOpenId_);
    }

    public String getLinkPersistentId() {
        return this.linkPersistentId_;
    }

    public ByteString getLinkPersistentIdBytes() {
        return ByteString.copyFromUtf8(this.linkPersistentId_);
    }

    public LocaleOuterClass$Locale getLocale() {
        LocaleOuterClass$Locale localeOuterClass$Locale = this.locale_;
        return localeOuterClass$Locale == null ? LocaleOuterClass$Locale.getDefaultInstance() : localeOuterClass$Locale;
    }

    public String getOauthNonce() {
        return this.oauthNonce_;
    }

    public ByteString getOauthNonceBytes() {
        return ByteString.copyFromUtf8(this.oauthNonce_);
    }

    public String getOauthRedirectUri() {
        return this.oauthRedirectUri_;
    }

    public ByteString getOauthRedirectUriBytes() {
        return ByteString.copyFromUtf8(this.oauthRedirectUri_);
    }

    public String getOauthStateId() {
        return this.oauthStateId_;
    }

    public ByteString getOauthStateIdBytes() {
        return ByteString.copyFromUtf8(this.oauthStateId_);
    }

    public String getPublicKey() {
        return this.publicKey_;
    }

    public ByteString getPublicKeyBytes() {
        return ByteString.copyFromUtf8(this.publicKey_);
    }

    public String getToken() {
        return this.token_;
    }

    public ByteString getTokenBytes() {
        return ByteString.copyFromUtf8(this.token_);
    }

    public User getUser() {
        User user = this.user_;
        return user == null ? User.getDefaultInstance() : user;
    }

    public String getWebhook() {
        return this.webhook_;
    }

    public ByteString getWebhookBytes() {
        return ByteString.copyFromUtf8(this.webhook_);
    }

    public String getWebviewRedirectUri() {
        return this.webviewRedirectUri_;
    }

    public ByteString getWebviewRedirectUriBytes() {
        return ByteString.copyFromUtf8(this.webviewRedirectUri_);
    }

    public boolean hasLocale() {
        return this.locale_ != null;
    }

    public boolean hasUser() {
        return this.user_ != null;
    }

    /* loaded from: classes2.dex */
    public static final class b extends GeneratedMessageLite.Builder<Configuration$LinkConfiguration, b> implements MessageLiteOrBuilder {
        public b() {
            super(Configuration$LinkConfiguration.DEFAULT_INSTANCE);
        }

        public b a(LocaleOuterClass$Locale.a aVar) {
            copyOnWrite();
            ((Configuration$LinkConfiguration) this.instance).setLocale(aVar.build());
            return this;
        }

        public b b(String str) {
            copyOnWrite();
            ((Configuration$LinkConfiguration) this.instance).setInstitutionId(str);
            return this;
        }

        public b c(String str) {
            copyOnWrite();
            ((Configuration$LinkConfiguration) this.instance).setLinkCustomizationName(str);
            return this;
        }

        public b d(String str) {
            copyOnWrite();
            ((Configuration$LinkConfiguration) this.instance).setLinkOpenId(str);
            return this;
        }

        public b e(String str) {
            copyOnWrite();
            ((Configuration$LinkConfiguration) this.instance).setLinkPersistentId(str);
            return this;
        }

        public b f(String str) {
            copyOnWrite();
            ((Configuration$LinkConfiguration) this.instance).setOauthNonce(str);
            return this;
        }

        public b g(String str) {
            copyOnWrite();
            ((Configuration$LinkConfiguration) this.instance).setOauthRedirectUri(str);
            return this;
        }

        public b h(String str) {
            copyOnWrite();
            ((Configuration$LinkConfiguration) this.instance).setPublicKey(str);
            return this;
        }

        public b i(String str) {
            copyOnWrite();
            ((Configuration$LinkConfiguration) this.instance).setToken(str);
            return this;
        }

        public b j(String str) {
            copyOnWrite();
            ((Configuration$LinkConfiguration) this.instance).setWebhook(str);
            return this;
        }

        public b a(Iterable<String> iterable) {
            copyOnWrite();
            ((Configuration$LinkConfiguration) this.instance).addAllInitialProducts(iterable);
            return this;
        }

        public b a(Map<String, RepeatedAccountSubtype> map) {
            copyOnWrite();
            ((Configuration$LinkConfiguration) this.instance).getMutableAccountFilterMap().putAll(map);
            return this;
        }

        public b a(User user) {
            copyOnWrite();
            ((Configuration$LinkConfiguration) this.instance).setUser(user);
            return this;
        }

        public b a(boolean z11) {
            copyOnWrite();
            ((Configuration$LinkConfiguration) this.instance).setEnableAccountSelect(z11);
            return this;
        }

        public b a(String str) {
            copyOnWrite();
            ((Configuration$LinkConfiguration) this.instance).setClientName(str);
            return this;
        }
    }

    public static b newBuilder(Configuration$LinkConfiguration configuration$LinkConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$LinkConfiguration);
    }

    public static Configuration$LinkConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$LinkConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$LinkConfiguration parseFrom(ByteString byteString) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$LinkConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$LinkConfiguration parseFrom(byte[] bArr) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$LinkConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$LinkConfiguration parseFrom(InputStream inputStream) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$LinkConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$LinkConfiguration parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$LinkConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}