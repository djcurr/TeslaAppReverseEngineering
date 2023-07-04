package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.plaid.internal.c1;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ChildItemsHeader;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.h1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Common$ListItem extends GeneratedMessageLite<Common$ListItem, a> implements h1 {
    public static final int ACTION_OVERRIDE_FIELD_NUMBER = 10;
    public static final int CHILD_ITEMS_FIELD_NUMBER = 8;
    public static final int CHILD_ITEMS_HEADER_FIELD_NUMBER = 9;
    private static final Common$ListItem DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 7;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGE_FIELD_NUMBER = 2;
    public static final int IMAGE_MISSING_COLOR_FIELD_NUMBER = 3;
    private static volatile Parser<Common$ListItem> PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 4;
    private Common$LocalAction actionOverride_;
    private Common$ChildItemsHeader childItemsHeader_;
    private Common$RenderedAssetAppearance icon_;
    private Common$RenderedAssetAppearance image_;
    private Common$LocalizedString subtitle_;
    private Common$LocalizedString title_;
    private String id_ = "";
    private String imageMissingColor_ = "";
    private Internal.ProtobufList<Common$ListItem> childItems_ = GeneratedMessageLite.emptyProtobufList();

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$ListItem, a> implements h1 {
        public a() {
            super(Common$ListItem.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$ListItem common$ListItem = new Common$ListItem();
        DEFAULT_INSTANCE = common$ListItem;
        GeneratedMessageLite.registerDefaultInstance(Common$ListItem.class, common$ListItem);
    }

    private Common$ListItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChildItems(Iterable<? extends Common$ListItem> iterable) {
        ensureChildItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.childItems_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChildItems(Common$ListItem common$ListItem) {
        common$ListItem.getClass();
        ensureChildItemsIsMutable();
        this.childItems_.add(common$ListItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionOverride() {
        this.actionOverride_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildItems() {
        this.childItems_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildItemsHeader() {
        this.childItemsHeader_ = null;
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
    public void clearImage() {
        this.image_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageMissingColor() {
        this.imageMissingColor_ = getDefaultInstance().getImageMissingColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = null;
    }

    private void ensureChildItemsIsMutable() {
        Internal.ProtobufList<Common$ListItem> protobufList = this.childItems_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.childItems_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$ListItem getDefaultInstance() {
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
    public void mergeChildItemsHeader(Common$ChildItemsHeader common$ChildItemsHeader) {
        common$ChildItemsHeader.getClass();
        Common$ChildItemsHeader common$ChildItemsHeader2 = this.childItemsHeader_;
        if (common$ChildItemsHeader2 != null && common$ChildItemsHeader2 != Common$ChildItemsHeader.getDefaultInstance()) {
            this.childItemsHeader_ = Common$ChildItemsHeader.newBuilder(this.childItemsHeader_).mergeFrom((Common$ChildItemsHeader.a) common$ChildItemsHeader).buildPartial();
        } else {
            this.childItemsHeader_ = common$ChildItemsHeader;
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

    public static Common$ListItem parseDelimitedFrom(InputStream inputStream) {
        return (Common$ListItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ListItem parseFrom(ByteBuffer byteBuffer) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$ListItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChildItems(int i11) {
        ensureChildItemsIsMutable();
        this.childItems_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionOverride(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        this.actionOverride_ = common$LocalAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildItems(int i11, Common$ListItem common$ListItem) {
        common$ListItem.getClass();
        ensureChildItemsIsMutable();
        this.childItems_.set(i11, common$ListItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildItemsHeader(Common$ChildItemsHeader common$ChildItemsHeader) {
        common$ChildItemsHeader.getClass();
        this.childItemsHeader_ = common$ChildItemsHeader;
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
    public void setImage(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.image_ = common$RenderedAssetAppearance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageMissingColor(String str) {
        str.getClass();
        this.imageMissingColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageMissingColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.imageMissingColor_ = byteString.toStringUtf8();
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$ListItem();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\n\t\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0003Ȉ\u0004\t\u0005\t\u0007\t\b\u001b\t\t\n\t", new Object[]{"id_", "image_", "imageMissingColor_", "title_", "subtitle_", "icon_", "childItems_", Common$ListItem.class, "childItemsHeader_", "actionOverride_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$ListItem> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$ListItem.class) {
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

    public Common$ListItem getChildItems(int i11) {
        return this.childItems_.get(i11);
    }

    public int getChildItemsCount() {
        return this.childItems_.size();
    }

    public Common$ChildItemsHeader getChildItemsHeader() {
        Common$ChildItemsHeader common$ChildItemsHeader = this.childItemsHeader_;
        return common$ChildItemsHeader == null ? Common$ChildItemsHeader.getDefaultInstance() : common$ChildItemsHeader;
    }

    public List<Common$ListItem> getChildItemsList() {
        return this.childItems_;
    }

    public h1 getChildItemsOrBuilder(int i11) {
        return this.childItems_.get(i11);
    }

    public List<? extends h1> getChildItemsOrBuilderList() {
        return this.childItems_;
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

    public Common$RenderedAssetAppearance getImage() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.image_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public String getImageMissingColor() {
        return this.imageMissingColor_;
    }

    public ByteString getImageMissingColorBytes() {
        return ByteString.copyFromUtf8(this.imageMissingColor_);
    }

    public Common$LocalizedString getSubtitle() {
        Common$LocalizedString common$LocalizedString = this.subtitle_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getTitle() {
        Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean hasActionOverride() {
        return this.actionOverride_ != null;
    }

    public boolean hasChildItemsHeader() {
        return this.childItemsHeader_ != null;
    }

    public boolean hasIcon() {
        return this.icon_ != null;
    }

    public boolean hasImage() {
        return this.image_ != null;
    }

    public boolean hasSubtitle() {
        return this.subtitle_ != null;
    }

    public boolean hasTitle() {
        return this.title_ != null;
    }

    public static a newBuilder(Common$ListItem common$ListItem) {
        return DEFAULT_INSTANCE.createBuilder(common$ListItem);
    }

    public static Common$ListItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ListItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$ListItem parseFrom(ByteString byteString) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChildItems(int i11, Common$ListItem common$ListItem) {
        common$ListItem.getClass();
        ensureChildItemsIsMutable();
        this.childItems_.add(i11, common$ListItem);
    }

    public static Common$ListItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$ListItem parseFrom(byte[] bArr) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$ListItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$ListItem parseFrom(InputStream inputStream) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ListItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ListItem parseFrom(CodedInputStream codedInputStream) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$ListItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}