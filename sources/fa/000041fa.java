package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.c1;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Common$Modal extends GeneratedMessageLite<Common$Modal, a> implements MessageLiteOrBuilder {
    public static final int BUTTON_FIELD_NUMBER = 3;
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final Common$Modal DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 5;
    private static volatile Parser<Common$Modal> PARSER = null;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Common$ButtonContent button_;
    private Common$LocalizedString content_;
    private Common$RenderedAssetAppearance image_;
    private Common$ButtonContent secondaryButton_;
    private Common$LocalizedString title_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$Modal, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$Modal.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$Modal common$Modal = new Common$Modal();
        DEFAULT_INSTANCE = common$Modal;
        GeneratedMessageLite.registerDefaultInstance(Common$Modal.class, common$Modal);
    }

    private Common$Modal() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        this.button_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImage() {
        this.image_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondaryButton() {
        this.secondaryButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = null;
    }

    public static Common$Modal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        Common$ButtonContent common$ButtonContent2 = this.button_;
        if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
            this.button_ = Common$ButtonContent.newBuilder(this.button_).mergeFrom((Common$ButtonContent.a) common$ButtonContent).buildPartial();
        } else {
            this.button_ = common$ButtonContent;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContent(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.content_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            this.content_ = Common$LocalizedString.newBuilder(this.content_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
        } else {
            this.content_ = common$LocalizedString;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeImage(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.image_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.image_ = Common$RenderedAssetAppearance.newBuilder(this.image_).mergeFrom((Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        } else {
            this.image_ = common$RenderedAssetAppearance;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSecondaryButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
        if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
            this.secondaryButton_ = Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((Common$ButtonContent.a) common$ButtonContent).buildPartial();
        } else {
            this.secondaryButton_ = common$ButtonContent;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.title_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            this.title_ = Common$LocalizedString.newBuilder(this.title_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
        } else {
            this.title_ = common$LocalizedString;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$Modal parseDelimitedFrom(InputStream inputStream) {
        return (Common$Modal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Modal parseFrom(ByteBuffer byteBuffer) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$Modal> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        this.button_ = common$ButtonContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.content_ = common$LocalizedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImage(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.image_ = common$RenderedAssetAppearance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        this.secondaryButton_ = common$ButtonContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.title_ = common$LocalizedString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$Modal();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t", new Object[]{"title_", "content_", "button_", "secondaryButton_", "image_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$Modal> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$Modal.class) {
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

    public Common$ButtonContent getButton() {
        Common$ButtonContent common$ButtonContent = this.button_;
        return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
    }

    public Common$LocalizedString getContent() {
        Common$LocalizedString common$LocalizedString = this.content_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$RenderedAssetAppearance getImage() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.image_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public Common$ButtonContent getSecondaryButton() {
        Common$ButtonContent common$ButtonContent = this.secondaryButton_;
        return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
    }

    public Common$LocalizedString getTitle() {
        Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean hasButton() {
        return this.button_ != null;
    }

    public boolean hasContent() {
        return this.content_ != null;
    }

    public boolean hasImage() {
        return this.image_ != null;
    }

    public boolean hasSecondaryButton() {
        return this.secondaryButton_ != null;
    }

    public boolean hasTitle() {
        return this.title_ != null;
    }

    public static a newBuilder(Common$Modal common$Modal) {
        return DEFAULT_INSTANCE.createBuilder(common$Modal);
    }

    public static Common$Modal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Modal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Modal parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$Modal parseFrom(ByteString byteString) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$Modal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$Modal parseFrom(byte[] bArr) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$Modal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$Modal parseFrom(InputStream inputStream) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Modal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Modal parseFrom(CodedInputStream codedInputStream) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$Modal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}