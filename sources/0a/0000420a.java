package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.c1;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Common$RenderedAssetAppearance extends GeneratedMessageLite<Common$RenderedAssetAppearance, a> implements MessageLiteOrBuilder {
    public static final int DARK_APPEARANCE_FIELD_NUMBER = 1;
    private static final Common$RenderedAssetAppearance DEFAULT_INSTANCE;
    public static final int LIGHT_APPEARANCE_FIELD_NUMBER = 2;
    private static volatile Parser<Common$RenderedAssetAppearance> PARSER;
    private Common$RenderedAsset darkAppearance_;
    private Common$RenderedAsset lightAppearance_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$RenderedAssetAppearance, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$RenderedAssetAppearance.DEFAULT_INSTANCE);
        }

        public a a(Common$RenderedAsset common$RenderedAsset) {
            copyOnWrite();
            ((Common$RenderedAssetAppearance) this.instance).setDarkAppearance(common$RenderedAsset);
            return this;
        }

        public a b(Common$RenderedAsset common$RenderedAsset) {
            copyOnWrite();
            ((Common$RenderedAssetAppearance) this.instance).setLightAppearance(common$RenderedAsset);
            return this;
        }
    }

    static {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = new Common$RenderedAssetAppearance();
        DEFAULT_INSTANCE = common$RenderedAssetAppearance;
        GeneratedMessageLite.registerDefaultInstance(Common$RenderedAssetAppearance.class, common$RenderedAssetAppearance);
    }

    private Common$RenderedAssetAppearance() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDarkAppearance() {
        this.darkAppearance_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLightAppearance() {
        this.lightAppearance_ = null;
    }

    public static Common$RenderedAssetAppearance getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDarkAppearance(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        Common$RenderedAsset common$RenderedAsset2 = this.darkAppearance_;
        if (common$RenderedAsset2 != null && common$RenderedAsset2 != Common$RenderedAsset.getDefaultInstance()) {
            this.darkAppearance_ = Common$RenderedAsset.newBuilder(this.darkAppearance_).mergeFrom((Common$RenderedAsset.a) common$RenderedAsset).buildPartial();
        } else {
            this.darkAppearance_ = common$RenderedAsset;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLightAppearance(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        Common$RenderedAsset common$RenderedAsset2 = this.lightAppearance_;
        if (common$RenderedAsset2 != null && common$RenderedAsset2 != Common$RenderedAsset.getDefaultInstance()) {
            this.lightAppearance_ = Common$RenderedAsset.newBuilder(this.lightAppearance_).mergeFrom((Common$RenderedAsset.a) common$RenderedAsset).buildPartial();
        } else {
            this.lightAppearance_ = common$RenderedAsset;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$RenderedAssetAppearance parseDelimitedFrom(InputStream inputStream) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$RenderedAssetAppearance parseFrom(ByteBuffer byteBuffer) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$RenderedAssetAppearance> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDarkAppearance(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        this.darkAppearance_ = common$RenderedAsset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLightAppearance(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        this.lightAppearance_ = common$RenderedAsset;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$RenderedAssetAppearance();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"darkAppearance_", "lightAppearance_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$RenderedAssetAppearance> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$RenderedAssetAppearance.class) {
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

    public Common$RenderedAsset getDarkAppearance() {
        Common$RenderedAsset common$RenderedAsset = this.darkAppearance_;
        return common$RenderedAsset == null ? Common$RenderedAsset.getDefaultInstance() : common$RenderedAsset;
    }

    public Common$RenderedAsset getLightAppearance() {
        Common$RenderedAsset common$RenderedAsset = this.lightAppearance_;
        return common$RenderedAsset == null ? Common$RenderedAsset.getDefaultInstance() : common$RenderedAsset;
    }

    public boolean hasDarkAppearance() {
        return this.darkAppearance_ != null;
    }

    public boolean hasLightAppearance() {
        return this.lightAppearance_ != null;
    }

    public static a newBuilder(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        return DEFAULT_INSTANCE.createBuilder(common$RenderedAssetAppearance);
    }

    public static Common$RenderedAssetAppearance parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$RenderedAssetAppearance parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$RenderedAssetAppearance parseFrom(ByteString byteString) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$RenderedAssetAppearance parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$RenderedAssetAppearance parseFrom(byte[] bArr) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$RenderedAssetAppearance parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$RenderedAssetAppearance parseFrom(InputStream inputStream) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$RenderedAssetAppearance parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$RenderedAssetAppearance parseFrom(CodedInputStream codedInputStream) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$RenderedAssetAppearance parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}