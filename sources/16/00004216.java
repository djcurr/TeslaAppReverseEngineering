package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.plaid.internal.c1;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.l1;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Common$SelectionListItem extends GeneratedMessageLite<Common$SelectionListItem, a> implements l1 {
    private static final Common$SelectionListItem DEFAULT_INSTANCE;
    public static final int DETAIL_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<Common$SelectionListItem> PARSER = null;
    public static final int PRESELECTED_FIELD_NUMBER = 5;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private Common$LocalizedString detail_;
    private String id_ = "";
    private boolean preselected_;
    private Common$LocalizedString subtitle_;
    private Common$LocalizedString title_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$SelectionListItem, a> implements l1 {
        public a() {
            super(Common$SelectionListItem.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$SelectionListItem common$SelectionListItem = new Common$SelectionListItem();
        DEFAULT_INSTANCE = common$SelectionListItem;
        GeneratedMessageLite.registerDefaultInstance(Common$SelectionListItem.class, common$SelectionListItem);
    }

    private Common$SelectionListItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetail() {
        this.detail_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreselected() {
        this.preselected_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = null;
    }

    public static Common$SelectionListItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDetail(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.detail_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            this.detail_ = Common$LocalizedString.newBuilder(this.detail_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
        } else {
            this.detail_ = common$LocalizedString;
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

    public static Common$SelectionListItem parseDelimitedFrom(InputStream inputStream) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SelectionListItem parseFrom(ByteBuffer byteBuffer) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$SelectionListItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetail(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.detail_ = common$LocalizedString;
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
    public void setPreselected(boolean z11) {
        this.preselected_ = z11;
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
                return new Common$SelectionListItem();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t\u0004\t\u0005\u0007", new Object[]{"id_", "title_", "subtitle_", "detail_", "preselected_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$SelectionListItem> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$SelectionListItem.class) {
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

    public Common$LocalizedString getDetail() {
        Common$LocalizedString common$LocalizedString = this.detail_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public boolean getPreselected() {
        return this.preselected_;
    }

    public Common$LocalizedString getSubtitle() {
        Common$LocalizedString common$LocalizedString = this.subtitle_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getTitle() {
        Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean hasDetail() {
        return this.detail_ != null;
    }

    public boolean hasSubtitle() {
        return this.subtitle_ != null;
    }

    public boolean hasTitle() {
        return this.title_ != null;
    }

    public static a newBuilder(Common$SelectionListItem common$SelectionListItem) {
        return DEFAULT_INSTANCE.createBuilder(common$SelectionListItem);
    }

    public static Common$SelectionListItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SelectionListItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$SelectionListItem parseFrom(ByteString byteString) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$SelectionListItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$SelectionListItem parseFrom(byte[] bArr) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$SelectionListItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$SelectionListItem parseFrom(InputStream inputStream) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SelectionListItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SelectionListItem parseFrom(CodedInputStream codedInputStream) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$SelectionListItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}