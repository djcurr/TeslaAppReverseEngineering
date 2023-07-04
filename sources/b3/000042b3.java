package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.t7;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Pane$Transition extends GeneratedMessageLite<Pane$Transition, a> implements MessageLiteOrBuilder {
    public static final int DEFAULT_FIELD_NUMBER = 1;
    private static final Pane$Transition DEFAULT_INSTANCE;
    private static volatile Parser<Pane$Transition> PARSER = null;
    public static final int RISING_TIDE_FIELD_NUMBER = 2;
    private int styleCase_ = 0;
    private Object style_;

    /* loaded from: classes2.dex */
    public static final class Default extends GeneratedMessageLite<Default, a> implements MessageLiteOrBuilder {
        private static final Default DEFAULT_INSTANCE;
        private static volatile Parser<Default> PARSER;

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<Default, a> implements MessageLiteOrBuilder {
            public a() {
                super(Default.DEFAULT_INSTANCE);
            }
        }

        static {
            Default r02 = new Default();
            DEFAULT_INSTANCE = r02;
            GeneratedMessageLite.registerDefaultInstance(Default.class, r02);
        }

        private Default() {
        }

        public static Default getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Default parseDelimitedFrom(InputStream inputStream) {
            return (Default) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Default parseFrom(ByteBuffer byteBuffer) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Default> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (t7.f19513a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Default();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Default> parser = PARSER;
                    if (parser == null) {
                        synchronized (Default.class) {
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

        public static a newBuilder(Default r12) {
            return DEFAULT_INSTANCE.createBuilder(r12);
        }

        public static Default parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Default parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Default parseFrom(ByteString byteString) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Default parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Default parseFrom(byte[] bArr) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Default parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Default parseFrom(InputStream inputStream) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Default parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Default parseFrom(CodedInputStream codedInputStream) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Default parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class RisingTide extends GeneratedMessageLite<RisingTide, a> implements MessageLiteOrBuilder {
        private static final RisingTide DEFAULT_INSTANCE;
        public static final int HIDE_FAIRY_BITS_FIELD_NUMBER = 2;
        public static final int MESSAGES_FIELD_NUMBER = 1;
        private static volatile Parser<RisingTide> PARSER;
        private boolean hideFairyBits_;
        private Internal.ProtobufList<Common$LocalizedString> messages_ = GeneratedMessageLite.emptyProtobufList();

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<RisingTide, a> implements MessageLiteOrBuilder {
            public a() {
                super(RisingTide.DEFAULT_INSTANCE);
            }
        }

        static {
            RisingTide risingTide = new RisingTide();
            DEFAULT_INSTANCE = risingTide;
            GeneratedMessageLite.registerDefaultInstance(RisingTide.class, risingTide);
        }

        private RisingTide() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMessages(Iterable<? extends Common$LocalizedString> iterable) {
            ensureMessagesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.messages_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMessages(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            ensureMessagesIsMutable();
            this.messages_.add(common$LocalizedString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHideFairyBits() {
            this.hideFairyBits_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessages() {
            this.messages_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureMessagesIsMutable() {
            Internal.ProtobufList<Common$LocalizedString> protobufList = this.messages_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.messages_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static RisingTide getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RisingTide parseDelimitedFrom(InputStream inputStream) {
            return (RisingTide) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RisingTide parseFrom(ByteBuffer byteBuffer) {
            return (RisingTide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RisingTide> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMessages(int i11) {
            ensureMessagesIsMutable();
            this.messages_.remove(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHideFairyBits(boolean z11) {
            this.hideFairyBits_ = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessages(int i11, Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            ensureMessagesIsMutable();
            this.messages_.set(i11, common$LocalizedString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (t7.f19513a[methodToInvoke.ordinal()]) {
                case 1:
                    return new RisingTide();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"messages_", Common$LocalizedString.class, "hideFairyBits_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RisingTide> parser = PARSER;
                    if (parser == null) {
                        synchronized (RisingTide.class) {
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

        public boolean getHideFairyBits() {
            return this.hideFairyBits_;
        }

        public Common$LocalizedString getMessages(int i11) {
            return this.messages_.get(i11);
        }

        public int getMessagesCount() {
            return this.messages_.size();
        }

        public List<Common$LocalizedString> getMessagesList() {
            return this.messages_;
        }

        public com.plaid.internal.core.protos.link.workflow.nodes.panes.a getMessagesOrBuilder(int i11) {
            return this.messages_.get(i11);
        }

        public List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.a> getMessagesOrBuilderList() {
            return this.messages_;
        }

        public static a newBuilder(RisingTide risingTide) {
            return DEFAULT_INSTANCE.createBuilder(risingTide);
        }

        public static RisingTide parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RisingTide) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RisingTide parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RisingTide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RisingTide parseFrom(ByteString byteString) {
            return (RisingTide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMessages(int i11, Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            ensureMessagesIsMutable();
            this.messages_.add(i11, common$LocalizedString);
        }

        public static RisingTide parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RisingTide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RisingTide parseFrom(byte[] bArr) {
            return (RisingTide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RisingTide parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RisingTide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RisingTide parseFrom(InputStream inputStream) {
            return (RisingTide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RisingTide parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RisingTide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RisingTide parseFrom(CodedInputStream codedInputStream) {
            return (RisingTide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RisingTide parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RisingTide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Pane$Transition, a> implements MessageLiteOrBuilder {
        public a() {
            super(Pane$Transition.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        DEFAULT(1),
        RISING_TIDE(2),
        STYLE_NOT_SET(0);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f18390a;

        b(int i11) {
            this.f18390a = i11;
        }

        public static b forNumber(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return RISING_TIDE;
                }
                return DEFAULT;
            }
            return STYLE_NOT_SET;
        }

        public int getNumber() {
            return this.f18390a;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        Pane$Transition pane$Transition = new Pane$Transition();
        DEFAULT_INSTANCE = pane$Transition;
        GeneratedMessageLite.registerDefaultInstance(Pane$Transition.class, pane$Transition);
    }

    private Pane$Transition() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefault() {
        if (this.styleCase_ == 1) {
            this.styleCase_ = 0;
            this.style_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRisingTide() {
        if (this.styleCase_ == 2) {
            this.styleCase_ = 0;
            this.style_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyle() {
        this.styleCase_ = 0;
        this.style_ = null;
    }

    public static Pane$Transition getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDefault(Default r42) {
        r42.getClass();
        if (this.styleCase_ == 1 && this.style_ != Default.getDefaultInstance()) {
            this.style_ = Default.newBuilder((Default) this.style_).mergeFrom((Default.a) r42).buildPartial();
        } else {
            this.style_ = r42;
        }
        this.styleCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRisingTide(RisingTide risingTide) {
        risingTide.getClass();
        if (this.styleCase_ == 2 && this.style_ != RisingTide.getDefaultInstance()) {
            this.style_ = RisingTide.newBuilder((RisingTide) this.style_).mergeFrom((RisingTide.a) risingTide).buildPartial();
        } else {
            this.style_ = risingTide;
        }
        this.styleCase_ = 2;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Pane$Transition parseDelimitedFrom(InputStream inputStream) {
        return (Pane$Transition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$Transition parseFrom(ByteBuffer byteBuffer) {
        return (Pane$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Pane$Transition> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefault(Default r12) {
        r12.getClass();
        this.style_ = r12;
        this.styleCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRisingTide(RisingTide risingTide) {
        risingTide.getClass();
        this.style_ = risingTide;
        this.styleCase_ = 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (t7.f19513a[methodToInvoke.ordinal()]) {
            case 1:
                return new Pane$Transition();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"style_", "styleCase_", Default.class, RisingTide.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Pane$Transition> parser = PARSER;
                if (parser == null) {
                    synchronized (Pane$Transition.class) {
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

    public Default getDefault() {
        if (this.styleCase_ == 1) {
            return (Default) this.style_;
        }
        return Default.getDefaultInstance();
    }

    public RisingTide getRisingTide() {
        if (this.styleCase_ == 2) {
            return (RisingTide) this.style_;
        }
        return RisingTide.getDefaultInstance();
    }

    public b getStyleCase() {
        return b.forNumber(this.styleCase_);
    }

    public boolean hasDefault() {
        return this.styleCase_ == 1;
    }

    public boolean hasRisingTide() {
        return this.styleCase_ == 2;
    }

    public static a newBuilder(Pane$Transition pane$Transition) {
        return DEFAULT_INSTANCE.createBuilder(pane$Transition);
    }

    public static Pane$Transition parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Transition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$Transition parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Pane$Transition parseFrom(ByteString byteString) {
        return (Pane$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Pane$Transition parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Pane$Transition parseFrom(byte[] bArr) {
        return (Pane$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Pane$Transition parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Pane$Transition parseFrom(InputStream inputStream) {
        return (Pane$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$Transition parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$Transition parseFrom(CodedInputStream codedInputStream) {
        return (Pane$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Pane$Transition parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}