package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.plaid.internal.c1;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset;
import com.plaid.internal.g1;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Common$GridSelectionImageItem extends GeneratedMessageLite<Common$GridSelectionImageItem, a> implements g1 {
    private static final Common$GridSelectionImageItem DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGE_FIELD_NUMBER = 2;
    private static volatile Parser<Common$GridSelectionImageItem> PARSER;
    private String id_ = "";
    private Common$RenderedAsset image_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$GridSelectionImageItem, a> implements g1 {
        public a() {
            super(Common$GridSelectionImageItem.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$GridSelectionImageItem common$GridSelectionImageItem = new Common$GridSelectionImageItem();
        DEFAULT_INSTANCE = common$GridSelectionImageItem;
        GeneratedMessageLite.registerDefaultInstance(Common$GridSelectionImageItem.class, common$GridSelectionImageItem);
    }

    private Common$GridSelectionImageItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImage() {
        this.image_ = null;
    }

    public static Common$GridSelectionImageItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeImage(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        Common$RenderedAsset common$RenderedAsset2 = this.image_;
        if (common$RenderedAsset2 != null && common$RenderedAsset2 != Common$RenderedAsset.getDefaultInstance()) {
            this.image_ = Common$RenderedAsset.newBuilder(this.image_).mergeFrom((Common$RenderedAsset.a) common$RenderedAsset).buildPartial();
        } else {
            this.image_ = common$RenderedAsset;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$GridSelectionImageItem parseDelimitedFrom(InputStream inputStream) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$GridSelectionImageItem parseFrom(ByteBuffer byteBuffer) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$GridSelectionImageItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setImage(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        this.image_ = common$RenderedAsset;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$GridSelectionImageItem();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"id_", "image_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$GridSelectionImageItem> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$GridSelectionImageItem.class) {
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

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public Common$RenderedAsset getImage() {
        Common$RenderedAsset common$RenderedAsset = this.image_;
        return common$RenderedAsset == null ? Common$RenderedAsset.getDefaultInstance() : common$RenderedAsset;
    }

    public boolean hasImage() {
        return this.image_ != null;
    }

    public static a newBuilder(Common$GridSelectionImageItem common$GridSelectionImageItem) {
        return DEFAULT_INSTANCE.createBuilder(common$GridSelectionImageItem);
    }

    public static Common$GridSelectionImageItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$GridSelectionImageItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$GridSelectionImageItem parseFrom(ByteString byteString) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$GridSelectionImageItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$GridSelectionImageItem parseFrom(byte[] bArr) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$GridSelectionImageItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$GridSelectionImageItem parseFrom(InputStream inputStream) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$GridSelectionImageItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$GridSelectionImageItem parseFrom(CodedInputStream codedInputStream) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$GridSelectionImageItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}