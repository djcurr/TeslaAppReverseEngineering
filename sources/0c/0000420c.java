package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.c1;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Common$RenderedInstitution extends GeneratedMessageLite<Common$RenderedInstitution, a> implements MessageLiteOrBuilder {
    public static final int BRAND_URL_FIELD_NUMBER = 2;
    private static final Common$RenderedInstitution DEFAULT_INSTANCE;
    public static final int LOGO_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Common$RenderedInstitution> PARSER = null;
    public static final int PRIMARY_COLOR_FIELD_NUMBER = 4;
    private Common$RenderedAssetAppearance logo_;
    private Common$LocalizedString name_;
    private String brandUrl_ = "";
    private String primaryColor_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$RenderedInstitution, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$RenderedInstitution.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$RenderedInstitution common$RenderedInstitution = new Common$RenderedInstitution();
        DEFAULT_INSTANCE = common$RenderedInstitution;
        GeneratedMessageLite.registerDefaultInstance(Common$RenderedInstitution.class, common$RenderedInstitution);
    }

    private Common$RenderedInstitution() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrandUrl() {
        this.brandUrl_ = getDefaultInstance().getBrandUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogo() {
        this.logo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryColor() {
        this.primaryColor_ = getDefaultInstance().getPrimaryColor();
    }

    public static Common$RenderedInstitution getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLogo(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.logo_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.logo_ = Common$RenderedAssetAppearance.newBuilder(this.logo_).mergeFrom((Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        } else {
            this.logo_ = common$RenderedAssetAppearance;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeName(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.name_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            this.name_ = Common$LocalizedString.newBuilder(this.name_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
        } else {
            this.name_ = common$LocalizedString;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$RenderedInstitution parseDelimitedFrom(InputStream inputStream) {
        return (Common$RenderedInstitution) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$RenderedInstitution parseFrom(ByteBuffer byteBuffer) {
        return (Common$RenderedInstitution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$RenderedInstitution> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandUrl(String str) {
        str.getClass();
        this.brandUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.brandUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogo(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.logo_ = common$RenderedAssetAppearance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.name_ = common$LocalizedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryColor(String str) {
        str.getClass();
        this.primaryColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.primaryColor_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$RenderedInstitution();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\t\u0004Ȉ", new Object[]{"name_", "brandUrl_", "logo_", "primaryColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$RenderedInstitution> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$RenderedInstitution.class) {
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

    public String getBrandUrl() {
        return this.brandUrl_;
    }

    public ByteString getBrandUrlBytes() {
        return ByteString.copyFromUtf8(this.brandUrl_);
    }

    public Common$RenderedAssetAppearance getLogo() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.logo_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public Common$LocalizedString getName() {
        Common$LocalizedString common$LocalizedString = this.name_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public String getPrimaryColor() {
        return this.primaryColor_;
    }

    public ByteString getPrimaryColorBytes() {
        return ByteString.copyFromUtf8(this.primaryColor_);
    }

    public boolean hasLogo() {
        return this.logo_ != null;
    }

    public boolean hasName() {
        return this.name_ != null;
    }

    public static a newBuilder(Common$RenderedInstitution common$RenderedInstitution) {
        return DEFAULT_INSTANCE.createBuilder(common$RenderedInstitution);
    }

    public static Common$RenderedInstitution parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedInstitution) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$RenderedInstitution parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedInstitution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$RenderedInstitution parseFrom(ByteString byteString) {
        return (Common$RenderedInstitution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$RenderedInstitution parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedInstitution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$RenderedInstitution parseFrom(byte[] bArr) {
        return (Common$RenderedInstitution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$RenderedInstitution parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedInstitution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$RenderedInstitution parseFrom(InputStream inputStream) {
        return (Common$RenderedInstitution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$RenderedInstitution parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedInstitution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$RenderedInstitution parseFrom(CodedInputStream codedInputStream) {
        return (Common$RenderedInstitution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$RenderedInstitution parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedInstitution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}