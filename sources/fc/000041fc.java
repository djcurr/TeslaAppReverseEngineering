package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
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
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Common$PaneHeader extends GeneratedMessageLite<Common$PaneHeader, a> implements MessageLiteOrBuilder {
    private static final Common$PaneHeader DEFAULT_INSTANCE;
    public static final int ICON_MISSING_COLOR_FIELD_NUMBER = 4;
    public static final int ILLUSTRATION_FIELD_NUMBER = 7;
    public static final int LOGO_FIELD_NUMBER = 3;
    private static volatile Parser<Common$PaneHeader> PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TRAILING_ICON_ACTION_FIELD_NUMBER = 6;
    public static final int TRAILING_ICON_FIELD_NUMBER = 5;
    private int iconCase_ = 0;
    private String iconMissingColor_ = "";
    private Object icon_;
    private Common$LocalizedString subtitle_;
    private Common$LocalizedString title_;
    private Common$LocalAction trailingIconAction_;
    private int trailingIcon_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$PaneHeader, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$PaneHeader.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        LOGO(3),
        ILLUSTRATION(7),
        ICON_NOT_SET(0);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f18353a;

        b(int i11) {
            this.f18353a = i11;
        }

        public static b forNumber(int i11) {
            if (i11 != 0) {
                if (i11 != 3) {
                    if (i11 != 7) {
                        return null;
                    }
                    return ILLUSTRATION;
                }
                return LOGO;
            }
            return ICON_NOT_SET;
        }

        public int getNumber() {
            return this.f18353a;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        Common$PaneHeader common$PaneHeader = new Common$PaneHeader();
        DEFAULT_INSTANCE = common$PaneHeader;
        GeneratedMessageLite.registerDefaultInstance(Common$PaneHeader.class, common$PaneHeader);
    }

    private Common$PaneHeader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.iconCase_ = 0;
        this.icon_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconMissingColor() {
        this.iconMissingColor_ = getDefaultInstance().getIconMissingColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIllustration() {
        if (this.iconCase_ == 7) {
            this.iconCase_ = 0;
            this.icon_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogo() {
        if (this.iconCase_ == 3) {
            this.iconCase_ = 0;
            this.icon_ = null;
        }
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
    public void clearTrailingIcon() {
        this.trailingIcon_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrailingIconAction() {
        this.trailingIconAction_ = null;
    }

    public static Common$PaneHeader getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLogo(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        if (this.iconCase_ == 3 && this.icon_ != Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.icon_ = Common$RenderedAssetAppearance.newBuilder((Common$RenderedAssetAppearance) this.icon_).mergeFrom((Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        } else {
            this.icon_ = common$RenderedAssetAppearance;
        }
        this.iconCase_ = 3;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrailingIconAction(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        Common$LocalAction common$LocalAction2 = this.trailingIconAction_;
        if (common$LocalAction2 != null && common$LocalAction2 != Common$LocalAction.getDefaultInstance()) {
            this.trailingIconAction_ = Common$LocalAction.newBuilder(this.trailingIconAction_).mergeFrom((Common$LocalAction.b) common$LocalAction).buildPartial();
        } else {
            this.trailingIconAction_ = common$LocalAction;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$PaneHeader parseDelimitedFrom(InputStream inputStream) {
        return (Common$PaneHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PaneHeader parseFrom(ByteBuffer byteBuffer) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$PaneHeader> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconMissingColor(String str) {
        str.getClass();
        this.iconMissingColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconMissingColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconMissingColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIllustration(com.plaid.internal.d dVar) {
        this.icon_ = Integer.valueOf(dVar.getNumber());
        this.iconCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIllustrationValue(int i11) {
        this.iconCase_ = 7;
        this.icon_ = Integer.valueOf(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogo(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.icon_ = common$RenderedAssetAppearance;
        this.iconCase_ = 3;
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
    public void setTrailingIcon(com.plaid.internal.d dVar) {
        this.trailingIcon_ = dVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrailingIconAction(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        this.trailingIconAction_ = common$LocalAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrailingIconValue(int i11) {
        this.trailingIcon_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$PaneHeader();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003<\u0000\u0004Ȉ\u0005\f\u0006\t\u0007?\u0000", new Object[]{"icon_", "iconCase_", "title_", "subtitle_", Common$RenderedAssetAppearance.class, "iconMissingColor_", "trailingIcon_", "trailingIconAction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$PaneHeader> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$PaneHeader.class) {
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

    public b getIconCase() {
        return b.forNumber(this.iconCase_);
    }

    public String getIconMissingColor() {
        return this.iconMissingColor_;
    }

    public ByteString getIconMissingColorBytes() {
        return ByteString.copyFromUtf8(this.iconMissingColor_);
    }

    public com.plaid.internal.d getIllustration() {
        if (this.iconCase_ == 7) {
            com.plaid.internal.d forNumber = com.plaid.internal.d.forNumber(((Integer) this.icon_).intValue());
            return forNumber == null ? com.plaid.internal.d.UNRECOGNIZED : forNumber;
        }
        return com.plaid.internal.d.SDK_ASSET_UNKNOWN;
    }

    public int getIllustrationValue() {
        if (this.iconCase_ == 7) {
            return ((Integer) this.icon_).intValue();
        }
        return 0;
    }

    public Common$RenderedAssetAppearance getLogo() {
        if (this.iconCase_ == 3) {
            return (Common$RenderedAssetAppearance) this.icon_;
        }
        return Common$RenderedAssetAppearance.getDefaultInstance();
    }

    public Common$LocalizedString getSubtitle() {
        Common$LocalizedString common$LocalizedString = this.subtitle_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getTitle() {
        Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public com.plaid.internal.d getTrailingIcon() {
        com.plaid.internal.d forNumber = com.plaid.internal.d.forNumber(this.trailingIcon_);
        return forNumber == null ? com.plaid.internal.d.UNRECOGNIZED : forNumber;
    }

    public Common$LocalAction getTrailingIconAction() {
        Common$LocalAction common$LocalAction = this.trailingIconAction_;
        return common$LocalAction == null ? Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    public int getTrailingIconValue() {
        return this.trailingIcon_;
    }

    public boolean hasIllustration() {
        return this.iconCase_ == 7;
    }

    public boolean hasLogo() {
        return this.iconCase_ == 3;
    }

    public boolean hasSubtitle() {
        return this.subtitle_ != null;
    }

    public boolean hasTitle() {
        return this.title_ != null;
    }

    public boolean hasTrailingIconAction() {
        return this.trailingIconAction_ != null;
    }

    public static a newBuilder(Common$PaneHeader common$PaneHeader) {
        return DEFAULT_INSTANCE.createBuilder(common$PaneHeader);
    }

    public static Common$PaneHeader parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PaneHeader parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$PaneHeader parseFrom(ByteString byteString) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$PaneHeader parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$PaneHeader parseFrom(byte[] bArr) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$PaneHeader parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$PaneHeader parseFrom(InputStream inputStream) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PaneHeader parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PaneHeader parseFrom(CodedInputStream codedInputStream) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$PaneHeader parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}