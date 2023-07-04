package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.c1;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Common$CobrandedHeaderAsset extends GeneratedMessageLite<Common$CobrandedHeaderAsset, a> implements MessageLiteOrBuilder {
    public static final int CLIENT_BRAND_COLOR_FIELD_NUMBER = 1;
    public static final int CLIENT_LOGO_ASSET_FIELD_NUMBER = 2;
    private static final Common$CobrandedHeaderAsset DEFAULT_INSTANCE;
    private static volatile Parser<Common$CobrandedHeaderAsset> PARSER = null;
    public static final int PLAID_LOGO_ASSET_FIELD_NUMBER = 3;
    private String clientBrandColor_ = "";
    private Common$RenderedAssetAppearance clientLogoAsset_;
    private Common$RenderedAssetAppearance plaidLogoAsset_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$CobrandedHeaderAsset, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$CobrandedHeaderAsset.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$CobrandedHeaderAsset common$CobrandedHeaderAsset = new Common$CobrandedHeaderAsset();
        DEFAULT_INSTANCE = common$CobrandedHeaderAsset;
        GeneratedMessageLite.registerDefaultInstance(Common$CobrandedHeaderAsset.class, common$CobrandedHeaderAsset);
    }

    private Common$CobrandedHeaderAsset() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientBrandColor() {
        this.clientBrandColor_ = getDefaultInstance().getClientBrandColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientLogoAsset() {
        this.clientLogoAsset_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaidLogoAsset() {
        this.plaidLogoAsset_ = null;
    }

    public static Common$CobrandedHeaderAsset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientLogoAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.clientLogoAsset_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.clientLogoAsset_ = Common$RenderedAssetAppearance.newBuilder(this.clientLogoAsset_).mergeFrom((Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        } else {
            this.clientLogoAsset_ = common$RenderedAssetAppearance;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaidLogoAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.plaidLogoAsset_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.plaidLogoAsset_ = Common$RenderedAssetAppearance.newBuilder(this.plaidLogoAsset_).mergeFrom((Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        } else {
            this.plaidLogoAsset_ = common$RenderedAssetAppearance;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$CobrandedHeaderAsset parseDelimitedFrom(InputStream inputStream) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$CobrandedHeaderAsset parseFrom(ByteBuffer byteBuffer) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$CobrandedHeaderAsset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientBrandColor(String str) {
        str.getClass();
        this.clientBrandColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientBrandColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.clientBrandColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientLogoAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.clientLogoAsset_ = common$RenderedAssetAppearance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaidLogoAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.plaidLogoAsset_ = common$RenderedAssetAppearance;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$CobrandedHeaderAsset();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t", new Object[]{"clientBrandColor_", "clientLogoAsset_", "plaidLogoAsset_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$CobrandedHeaderAsset> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$CobrandedHeaderAsset.class) {
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

    public String getClientBrandColor() {
        return this.clientBrandColor_;
    }

    public ByteString getClientBrandColorBytes() {
        return ByteString.copyFromUtf8(this.clientBrandColor_);
    }

    public Common$RenderedAssetAppearance getClientLogoAsset() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.clientLogoAsset_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public Common$RenderedAssetAppearance getPlaidLogoAsset() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.plaidLogoAsset_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public boolean hasClientLogoAsset() {
        return this.clientLogoAsset_ != null;
    }

    public boolean hasPlaidLogoAsset() {
        return this.plaidLogoAsset_ != null;
    }

    public static a newBuilder(Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
        return DEFAULT_INSTANCE.createBuilder(common$CobrandedHeaderAsset);
    }

    public static Common$CobrandedHeaderAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$CobrandedHeaderAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$CobrandedHeaderAsset parseFrom(ByteString byteString) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$CobrandedHeaderAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$CobrandedHeaderAsset parseFrom(byte[] bArr) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$CobrandedHeaderAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$CobrandedHeaderAsset parseFrom(InputStream inputStream) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$CobrandedHeaderAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$CobrandedHeaderAsset parseFrom(CodedInputStream codedInputStream) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$CobrandedHeaderAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}