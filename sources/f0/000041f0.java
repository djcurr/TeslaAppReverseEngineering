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
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Common$HyperlinkContent extends GeneratedMessageLite<Common$HyperlinkContent, a> implements MessageLiteOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final Common$HyperlinkContent DEFAULT_INSTANCE;
    private static volatile Parser<Common$HyperlinkContent> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private Common$LocalAction action_;
    private Common$LocalizedString text_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$HyperlinkContent, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$HyperlinkContent.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$HyperlinkContent common$HyperlinkContent = new Common$HyperlinkContent();
        DEFAULT_INSTANCE = common$HyperlinkContent;
        GeneratedMessageLite.registerDefaultInstance(Common$HyperlinkContent.class, common$HyperlinkContent);
    }

    private Common$HyperlinkContent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = null;
    }

    public static Common$HyperlinkContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAction(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        Common$LocalAction common$LocalAction2 = this.action_;
        if (common$LocalAction2 != null && common$LocalAction2 != Common$LocalAction.getDefaultInstance()) {
            this.action_ = Common$LocalAction.newBuilder(this.action_).mergeFrom((Common$LocalAction.b) common$LocalAction).buildPartial();
        } else {
            this.action_ = common$LocalAction;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.text_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            this.text_ = Common$LocalizedString.newBuilder(this.text_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
        } else {
            this.text_ = common$LocalizedString;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$HyperlinkContent parseDelimitedFrom(InputStream inputStream) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$HyperlinkContent parseFrom(ByteBuffer byteBuffer) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$HyperlinkContent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        this.action_ = common$LocalAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.text_ = common$LocalizedString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$HyperlinkContent();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"text_", "action_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$HyperlinkContent> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$HyperlinkContent.class) {
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

    public Common$LocalAction getAction() {
        Common$LocalAction common$LocalAction = this.action_;
        return common$LocalAction == null ? Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    public Common$LocalizedString getText() {
        Common$LocalizedString common$LocalizedString = this.text_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean hasAction() {
        return this.action_ != null;
    }

    public boolean hasText() {
        return this.text_ != null;
    }

    public static a newBuilder(Common$HyperlinkContent common$HyperlinkContent) {
        return DEFAULT_INSTANCE.createBuilder(common$HyperlinkContent);
    }

    public static Common$HyperlinkContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$HyperlinkContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$HyperlinkContent parseFrom(ByteString byteString) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$HyperlinkContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$HyperlinkContent parseFrom(byte[] bArr) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$HyperlinkContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$HyperlinkContent parseFrom(InputStream inputStream) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$HyperlinkContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$HyperlinkContent parseFrom(CodedInputStream codedInputStream) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$HyperlinkContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}