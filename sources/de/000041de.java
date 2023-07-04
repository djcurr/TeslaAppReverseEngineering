package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.c1;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.e1;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Common$ButtonContent extends GeneratedMessageLite<Common$ButtonContent, a> implements MessageLiteOrBuilder {
    public static final int ACTION_OVERRIDE_FIELD_NUMBER = 6;
    private static final Common$ButtonContent DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 5;
    private static volatile Parser<Common$ButtonContent> PARSER = null;
    public static final int SECONDARY_TEXT_FIELD_NUMBER = 4;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_ALIGNMENT_IS_LEADING_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int WEIGHT_FIELD_NUMBER = 8;
    private Common$LocalAction actionOverride_;
    private Common$RenderedAssetAppearance icon_;
    private Common$LocalizedString secondaryText_;
    private Common$LocalizedString subtitle_;
    private boolean titleAlignmentIsLeading_;
    private Common$LocalizedString title_;
    private int weight_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$ButtonContent, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$ButtonContent.DEFAULT_INSTANCE);
        }

        public a a(Common$LocalizedString common$LocalizedString) {
            copyOnWrite();
            ((Common$ButtonContent) this.instance).setTitle(common$LocalizedString);
            return this;
        }
    }

    static {
        Common$ButtonContent common$ButtonContent = new Common$ButtonContent();
        DEFAULT_INSTANCE = common$ButtonContent;
        GeneratedMessageLite.registerDefaultInstance(Common$ButtonContent.class, common$ButtonContent);
    }

    private Common$ButtonContent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionOverride() {
        this.actionOverride_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondaryText() {
        this.secondaryText_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitleAlignmentIsLeading() {
        this.titleAlignmentIsLeading_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeight() {
        this.weight_ = 0;
    }

    public static Common$ButtonContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActionOverride(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        Common$LocalAction common$LocalAction2 = this.actionOverride_;
        if (common$LocalAction2 != null && common$LocalAction2 != Common$LocalAction.getDefaultInstance()) {
            this.actionOverride_ = Common$LocalAction.newBuilder(this.actionOverride_).mergeFrom((Common$LocalAction.b) common$LocalAction).buildPartial();
        } else {
            this.actionOverride_ = common$LocalAction;
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
    public void mergeSecondaryText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.secondaryText_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            this.secondaryText_ = Common$LocalizedString.newBuilder(this.secondaryText_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
        } else {
            this.secondaryText_ = common$LocalizedString;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubtitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.subtitle_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            this.subtitle_ = Common$LocalizedString.newBuilder(this.subtitle_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
        } else {
            this.subtitle_ = common$LocalizedString;
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

    public static Common$ButtonContent parseDelimitedFrom(InputStream inputStream) {
        return (Common$ButtonContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ButtonContent parseFrom(ByteBuffer byteBuffer) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$ButtonContent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionOverride(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        this.actionOverride_ = common$LocalAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.icon_ = common$RenderedAssetAppearance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.secondaryText_ = common$LocalizedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.subtitle_ = common$LocalizedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.title_ = common$LocalizedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleAlignmentIsLeading(boolean z11) {
        this.titleAlignmentIsLeading_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeight(e1 e1Var) {
        this.weight_ = e1Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeightValue(int i11) {
        this.weight_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$ButtonContent();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0007\u0004\t\u0005\t\u0006\t\b\f", new Object[]{"title_", "subtitle_", "titleAlignmentIsLeading_", "secondaryText_", "icon_", "actionOverride_", "weight_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$ButtonContent> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$ButtonContent.class) {
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

    public Common$LocalAction getActionOverride() {
        Common$LocalAction common$LocalAction = this.actionOverride_;
        return common$LocalAction == null ? Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    public Common$RenderedAssetAppearance getIcon() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public Common$LocalizedString getSecondaryText() {
        Common$LocalizedString common$LocalizedString = this.secondaryText_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getSubtitle() {
        Common$LocalizedString common$LocalizedString = this.subtitle_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getTitle() {
        Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean getTitleAlignmentIsLeading() {
        return this.titleAlignmentIsLeading_;
    }

    public e1 getWeight() {
        e1 forNumber = e1.forNumber(this.weight_);
        return forNumber == null ? e1.UNRECOGNIZED : forNumber;
    }

    public int getWeightValue() {
        return this.weight_;
    }

    public boolean hasActionOverride() {
        return this.actionOverride_ != null;
    }

    public boolean hasIcon() {
        return this.icon_ != null;
    }

    public boolean hasSecondaryText() {
        return this.secondaryText_ != null;
    }

    public boolean hasSubtitle() {
        return this.subtitle_ != null;
    }

    public boolean hasTitle() {
        return this.title_ != null;
    }

    public static a newBuilder(Common$ButtonContent common$ButtonContent) {
        return DEFAULT_INSTANCE.createBuilder(common$ButtonContent);
    }

    public static Common$ButtonContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ButtonContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ButtonContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$ButtonContent parseFrom(ByteString byteString) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$ButtonContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$ButtonContent parseFrom(byte[] bArr) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$ButtonContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$ButtonContent parseFrom(InputStream inputStream) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ButtonContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ButtonContent parseFrom(CodedInputStream codedInputStream) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$ButtonContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}