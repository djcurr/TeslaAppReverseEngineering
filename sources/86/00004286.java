package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RedirectOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution;
import com.plaid.internal.o7;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Oauth$OAuthPane extends GeneratedMessageLite<Oauth$OAuthPane, a> implements MessageLiteOrBuilder {
    private static final Oauth$OAuthPane DEFAULT_INSTANCE;
    private static volatile Parser<Oauth$OAuthPane> PARSER;

    /* loaded from: classes2.dex */
    public static final class Actions extends GeneratedMessageLite<Actions, b> implements MessageLiteOrBuilder {
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        private static volatile Parser<Actions> PARSER = null;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        private int actionCase_ = 0;
        private Object action_;

        /* loaded from: classes2.dex */
        public static final class ExitAction extends GeneratedMessageLite<ExitAction, a> implements MessageLiteOrBuilder {
            private static final ExitAction DEFAULT_INSTANCE;
            private static volatile Parser<ExitAction> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<ExitAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ExitAction exitAction = new ExitAction();
                DEFAULT_INSTANCE = exitAction;
                GeneratedMessageLite.registerDefaultInstance(ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ExitAction parseDelimitedFrom(InputStream inputStream) {
                return (ExitAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ExitAction parseFrom(ByteBuffer byteBuffer) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (o7.f19167a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExitAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ExitAction> parser = PARSER;
                        if (parser == null) {
                            synchronized (ExitAction.class) {
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

            public static a newBuilder(ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static ExitAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ExitAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ExitAction parseFrom(ByteString byteString) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ExitAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ExitAction parseFrom(byte[] bArr) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ExitAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ExitAction parseFrom(InputStream inputStream) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ExitAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ExitAction parseFrom(CodedInputStream codedInputStream) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ExitAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class SubmitAction extends GeneratedMessageLite<SubmitAction, a> implements MessageLiteOrBuilder {
            private static final SubmitAction DEFAULT_INSTANCE;
            public static final int OAUTH_STATE_ID_FIELD_NUMBER = 2;
            private static volatile Parser<SubmitAction> PARSER = null;
            public static final int RESPONSE_REDIRECT_URI_FIELD_NUMBER = 1;
            private String responseRedirectUri_ = "";
            private String oauthStateId_ = "";

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<SubmitAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(SubmitAction.DEFAULT_INSTANCE);
                }

                public a a(String str) {
                    copyOnWrite();
                    ((SubmitAction) this.instance).setOauthStateId(str);
                    return this;
                }

                public a b(String str) {
                    copyOnWrite();
                    ((SubmitAction) this.instance).setResponseRedirectUri(str);
                    return this;
                }
            }

            static {
                SubmitAction submitAction = new SubmitAction();
                DEFAULT_INSTANCE = submitAction;
                GeneratedMessageLite.registerDefaultInstance(SubmitAction.class, submitAction);
            }

            private SubmitAction() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOauthStateId() {
                this.oauthStateId_ = getDefaultInstance().getOauthStateId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResponseRedirectUri() {
                this.responseRedirectUri_ = getDefaultInstance().getResponseRedirectUri();
            }

            public static SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SubmitAction parseDelimitedFrom(InputStream inputStream) {
                return (SubmitAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SubmitAction parseFrom(ByteBuffer byteBuffer) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SubmitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOauthStateId(String str) {
                str.getClass();
                this.oauthStateId_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOauthStateIdBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.oauthStateId_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponseRedirectUri(String str) {
                str.getClass();
                this.responseRedirectUri_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponseRedirectUriBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.responseRedirectUri_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (o7.f19167a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubmitAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"responseRedirectUri_", "oauthStateId_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SubmitAction> parser = PARSER;
                        if (parser == null) {
                            synchronized (SubmitAction.class) {
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

            public String getOauthStateId() {
                return this.oauthStateId_;
            }

            public ByteString getOauthStateIdBytes() {
                return ByteString.copyFromUtf8(this.oauthStateId_);
            }

            public String getResponseRedirectUri() {
                return this.responseRedirectUri_;
            }

            public ByteString getResponseRedirectUriBytes() {
                return ByteString.copyFromUtf8(this.responseRedirectUri_);
            }

            public static a newBuilder(SubmitAction submitAction) {
                return DEFAULT_INSTANCE.createBuilder(submitAction);
            }

            public static SubmitAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(ByteString byteString) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SubmitAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(byte[] bArr) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SubmitAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(InputStream inputStream) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SubmitAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(CodedInputStream codedInputStream) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SubmitAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public enum a {
            SUBMIT(1),
            EXIT(2),
            ACTION_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            public final int f18378a;

            a(int i11) {
                this.f18378a = i11;
            }

            public static a forNumber(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            return null;
                        }
                        return EXIT;
                    }
                    return SUBMIT;
                }
                return ACTION_NOT_SET;
            }

            public int getNumber() {
                return this.f18378a;
            }

            @Deprecated
            public static a valueOf(int i11) {
                return forNumber(i11);
            }
        }

        static {
            Actions actions = new Actions();
            DEFAULT_INSTANCE = actions;
            GeneratedMessageLite.registerDefaultInstance(Actions.class, actions);
        }

        private Actions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExit() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubmit() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExit(ExitAction exitAction) {
            exitAction.getClass();
            if (this.actionCase_ == 2 && this.action_ != ExitAction.getDefaultInstance()) {
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.a) exitAction).buildPartial();
            } else {
                this.action_ = exitAction;
            }
            this.actionCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            if (this.actionCase_ == 1 && this.action_ != SubmitAction.getDefaultInstance()) {
                this.action_ = SubmitAction.newBuilder((SubmitAction) this.action_).mergeFrom((SubmitAction.a) submitAction).buildPartial();
            } else {
                this.action_ = submitAction;
            }
            this.actionCase_ = 1;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Actions parseDelimitedFrom(InputStream inputStream) {
            return (Actions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Actions parseFrom(ByteBuffer byteBuffer) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExit(ExitAction exitAction) {
            exitAction.getClass();
            this.action_ = exitAction;
            this.actionCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (o7.f19167a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"action_", "actionCase_", SubmitAction.class, ExitAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Actions> parser = PARSER;
                    if (parser == null) {
                        synchronized (Actions.class) {
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

        public a getActionCase() {
            return a.forNumber(this.actionCase_);
        }

        public ExitAction getExit() {
            if (this.actionCase_ == 2) {
                return (ExitAction) this.action_;
            }
            return ExitAction.getDefaultInstance();
        }

        public SubmitAction getSubmit() {
            if (this.actionCase_ == 1) {
                return (SubmitAction) this.action_;
            }
            return SubmitAction.getDefaultInstance();
        }

        public boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        /* loaded from: classes2.dex */
        public static final class b extends GeneratedMessageLite.Builder<Actions, b> implements MessageLiteOrBuilder {
            public b() {
                super(Actions.DEFAULT_INSTANCE);
            }

            public b a(SubmitAction.a aVar) {
                copyOnWrite();
                ((Actions) this.instance).setSubmit(aVar.build());
                return this;
            }

            public b a(ExitAction exitAction) {
                copyOnWrite();
                ((Actions) this.instance).setExit(exitAction);
                return this;
            }
        }

        public static b newBuilder(Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static Actions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Actions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Actions parseFrom(ByteString byteString) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Actions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Actions parseFrom(byte[] bArr) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Actions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Actions parseFrom(InputStream inputStream) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Actions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Actions parseFrom(CodedInputStream codedInputStream) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Actions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Rendering extends GeneratedMessageLite<Rendering, a> implements MessageLiteOrBuilder {
        public static final int AFTER_FIELD_NUMBER = 5;
        public static final int BEFORE_FIELD_NUMBER = 3;
        public static final int CONFIGURED_WITH_REDIRECT_URI_FIELD_NUMBER = 8;
        private static final Rendering DEFAULT_INSTANCE;
        public static final int DURING_FIELD_NUMBER = 4;
        public static final int EVENTS_FIELD_NUMBER = 6;
        public static final int INSTITUTION_FIELD_NUMBER = 7;
        public static final int LOGIN_URI_FIELD_NUMBER = 1;
        public static final int OAUTH_STATE_ID_FIELD_NUMBER = 2;
        public static final int PANE_HEADER_FIELD_NUMBER = 9;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int POLLING_FIELD_NUMBER = 12;
        public static final int POPUP_FIELD_NUMBER = 10;
        public static final int REDIRECT_FIELD_NUMBER = 11;
        private Content after_;
        private Content before_;
        private boolean configuredWithRedirectUri_;
        private Content during_;
        private Events events_;
        private Common$RenderedInstitution institution_;
        private Object openMethod_;
        private Common$PaneHeader paneHeader_;
        private Common$PollingOptions polling_;
        private int openMethodCase_ = 0;
        private String loginUri_ = "";
        private String oauthStateId_ = "";

        /* loaded from: classes2.dex */
        public static final class Content extends GeneratedMessageLite<Content, a> implements MessageLiteOrBuilder {
            public static final int BUTTON_FIELD_NUMBER = 4;
            private static final Content DEFAULT_INSTANCE;
            public static final int DETAIL_ORDERED_LIST_FIELD_NUMBER = 6;
            public static final int DETAIL_TEXT_FIELD_NUMBER = 5;
            public static final int HEADER_FIELD_NUMBER = 2;
            private static volatile Parser<Content> PARSER;
            private Common$ButtonContent button_;
            private int detailCase_ = 0;
            private Object detail_;
            private Common$LocalizedString header_;

            /* loaded from: classes2.dex */
            public static final class OrderedList extends GeneratedMessageLite<OrderedList, a> implements MessageLiteOrBuilder {
                private static final OrderedList DEFAULT_INSTANCE;
                public static final int ITEMS_FIELD_NUMBER = 1;
                private static volatile Parser<OrderedList> PARSER;
                private Internal.ProtobufList<Common$LocalizedString> items_ = GeneratedMessageLite.emptyProtobufList();

                /* loaded from: classes2.dex */
                public static final class a extends GeneratedMessageLite.Builder<OrderedList, a> implements MessageLiteOrBuilder {
                    public a() {
                        super(OrderedList.DEFAULT_INSTANCE);
                    }
                }

                static {
                    OrderedList orderedList = new OrderedList();
                    DEFAULT_INSTANCE = orderedList;
                    GeneratedMessageLite.registerDefaultInstance(OrderedList.class, orderedList);
                }

                private OrderedList() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addAllItems(Iterable<? extends Common$LocalizedString> iterable) {
                    ensureItemsIsMutable();
                    AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addItems(Common$LocalizedString common$LocalizedString) {
                    common$LocalizedString.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(common$LocalizedString);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearItems() {
                    this.items_ = GeneratedMessageLite.emptyProtobufList();
                }

                private void ensureItemsIsMutable() {
                    Internal.ProtobufList<Common$LocalizedString> protobufList = this.items_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
                }

                public static OrderedList getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static OrderedList parseDelimitedFrom(InputStream inputStream) {
                    return (OrderedList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static OrderedList parseFrom(ByteBuffer byteBuffer) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<OrderedList> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void removeItems(int i11) {
                    ensureItemsIsMutable();
                    this.items_.remove(i11);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setItems(int i11, Common$LocalizedString common$LocalizedString) {
                    common$LocalizedString.getClass();
                    ensureItemsIsMutable();
                    this.items_.set(i11, common$LocalizedString);
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    switch (o7.f19167a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new OrderedList();
                        case 2:
                            return new a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", Common$LocalizedString.class});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<OrderedList> parser = PARSER;
                            if (parser == null) {
                                synchronized (OrderedList.class) {
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

                public Common$LocalizedString getItems(int i11) {
                    return this.items_.get(i11);
                }

                public int getItemsCount() {
                    return this.items_.size();
                }

                public List<Common$LocalizedString> getItemsList() {
                    return this.items_;
                }

                public com.plaid.internal.core.protos.link.workflow.nodes.panes.a getItemsOrBuilder(int i11) {
                    return this.items_.get(i11);
                }

                public List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.a> getItemsOrBuilderList() {
                    return this.items_;
                }

                public static a newBuilder(OrderedList orderedList) {
                    return DEFAULT_INSTANCE.createBuilder(orderedList);
                }

                public static OrderedList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (OrderedList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static OrderedList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static OrderedList parseFrom(ByteString byteString) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addItems(int i11, Common$LocalizedString common$LocalizedString) {
                    common$LocalizedString.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(i11, common$LocalizedString);
                }

                public static OrderedList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static OrderedList parseFrom(byte[] bArr) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static OrderedList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static OrderedList parseFrom(InputStream inputStream) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static OrderedList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static OrderedList parseFrom(CodedInputStream codedInputStream) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static OrderedList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<Content, a> implements MessageLiteOrBuilder {
                public a() {
                    super(Content.DEFAULT_INSTANCE);
                }
            }

            /* loaded from: classes2.dex */
            public enum b {
                DETAIL_TEXT(5),
                DETAIL_ORDERED_LIST(6),
                DETAIL_NOT_SET(0);
                

                /* renamed from: a  reason: collision with root package name */
                public final int f18380a;

                b(int i11) {
                    this.f18380a = i11;
                }

                public static b forNumber(int i11) {
                    if (i11 != 0) {
                        if (i11 != 5) {
                            if (i11 != 6) {
                                return null;
                            }
                            return DETAIL_ORDERED_LIST;
                        }
                        return DETAIL_TEXT;
                    }
                    return DETAIL_NOT_SET;
                }

                public int getNumber() {
                    return this.f18380a;
                }

                @Deprecated
                public static b valueOf(int i11) {
                    return forNumber(i11);
                }
            }

            static {
                Content content = new Content();
                DEFAULT_INSTANCE = content;
                GeneratedMessageLite.registerDefaultInstance(Content.class, content);
            }

            private Content() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearButton() {
                this.button_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDetail() {
                this.detailCase_ = 0;
                this.detail_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDetailOrderedList() {
                if (this.detailCase_ == 6) {
                    this.detailCase_ = 0;
                    this.detail_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDetailText() {
                if (this.detailCase_ == 5) {
                    this.detailCase_ = 0;
                    this.detail_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearHeader() {
                this.header_ = null;
            }

            public static Content getDefaultInstance() {
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
            public void mergeDetailOrderedList(OrderedList orderedList) {
                orderedList.getClass();
                if (this.detailCase_ == 6 && this.detail_ != OrderedList.getDefaultInstance()) {
                    this.detail_ = OrderedList.newBuilder((OrderedList) this.detail_).mergeFrom((OrderedList.a) orderedList).buildPartial();
                } else {
                    this.detail_ = orderedList;
                }
                this.detailCase_ = 6;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeDetailText(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                if (this.detailCase_ == 5 && this.detail_ != Common$LocalizedString.getDefaultInstance()) {
                    this.detail_ = Common$LocalizedString.newBuilder((Common$LocalizedString) this.detail_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
                } else {
                    this.detail_ = common$LocalizedString;
                }
                this.detailCase_ = 5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeHeader(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                Common$LocalizedString common$LocalizedString2 = this.header_;
                if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                    this.header_ = Common$LocalizedString.newBuilder(this.header_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
                } else {
                    this.header_ = common$LocalizedString;
                }
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Content parseDelimitedFrom(InputStream inputStream) {
                return (Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Content parseFrom(ByteBuffer byteBuffer) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Content> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.button_ = common$ButtonContent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDetailOrderedList(OrderedList orderedList) {
                orderedList.getClass();
                this.detail_ = orderedList;
                this.detailCase_ = 6;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDetailText(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.detail_ = common$LocalizedString;
                this.detailCase_ = 5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setHeader(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.header_ = common$LocalizedString;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (o7.f19167a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Content();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0002\u0006\u0004\u0000\u0000\u0000\u0002\t\u0004\t\u0005<\u0000\u0006<\u0000", new Object[]{"detail_", "detailCase_", "header_", "button_", Common$LocalizedString.class, OrderedList.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Content> parser = PARSER;
                        if (parser == null) {
                            synchronized (Content.class) {
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

            public b getDetailCase() {
                return b.forNumber(this.detailCase_);
            }

            public OrderedList getDetailOrderedList() {
                if (this.detailCase_ == 6) {
                    return (OrderedList) this.detail_;
                }
                return OrderedList.getDefaultInstance();
            }

            public Common$LocalizedString getDetailText() {
                if (this.detailCase_ == 5) {
                    return (Common$LocalizedString) this.detail_;
                }
                return Common$LocalizedString.getDefaultInstance();
            }

            public Common$LocalizedString getHeader() {
                Common$LocalizedString common$LocalizedString = this.header_;
                return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public boolean hasButton() {
                return this.button_ != null;
            }

            public boolean hasDetailOrderedList() {
                return this.detailCase_ == 6;
            }

            public boolean hasDetailText() {
                return this.detailCase_ == 5;
            }

            public boolean hasHeader() {
                return this.header_ != null;
            }

            public static a newBuilder(Content content) {
                return DEFAULT_INSTANCE.createBuilder(content);
            }

            public static Content parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Content parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Content parseFrom(ByteString byteString) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Content parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Content parseFrom(byte[] bArr) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Content parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Content parseFrom(InputStream inputStream) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Content parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Content parseFrom(CodedInputStream codedInputStream) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Content parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class Events extends GeneratedMessageLite<Events, a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_CLOSE_REDIRECT_FIELD_NUMBER = 3;
            public static final int ON_FAIL_REDIRECT_FIELD_NUMBER = 4;
            public static final int ON_REDIRECT_FIELD_NUMBER = 2;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onRedirect_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onCloseRedirect_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onFailRedirect_ = GeneratedMessageLite.emptyProtobufList();

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<Events, a> implements MessageLiteOrBuilder {
                public a() {
                    super(Events.DEFAULT_INSTANCE);
                }
            }

            static {
                Events events = new Events();
                DEFAULT_INSTANCE = events;
                GeneratedMessageLite.registerDefaultInstance(Events.class, events);
            }

            private Events() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllOnAppear(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnAppearIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onAppear_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllOnCloseRedirect(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnCloseRedirectIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onCloseRedirect_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllOnFailRedirect(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnFailRedirectIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onFailRedirect_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllOnRedirect(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnRedirectIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onRedirect_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addOnAppear(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addOnCloseRedirect(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnCloseRedirectIsMutable();
                this.onCloseRedirect_.add(common$SDKEvent);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addOnFailRedirect(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.add(common$SDKEvent);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addOnRedirect(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnRedirectIsMutable();
                this.onRedirect_.add(common$SDKEvent);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnAppear() {
                this.onAppear_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnCloseRedirect() {
                this.onCloseRedirect_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnFailRedirect() {
                this.onFailRedirect_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnRedirect() {
                this.onRedirect_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureOnAppearIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnCloseRedirectIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onCloseRedirect_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onCloseRedirect_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnFailRedirectIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onFailRedirect_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onFailRedirect_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnRedirectIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onRedirect_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onRedirect_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Events parseDelimitedFrom(InputStream inputStream) {
                return (Events) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Events parseFrom(ByteBuffer byteBuffer) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeOnAppear(int i11) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeOnCloseRedirect(int i11) {
                ensureOnCloseRedirectIsMutable();
                this.onCloseRedirect_.remove(i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeOnFailRedirect(int i11) {
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.remove(i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeOnRedirect(int i11) {
                ensureOnRedirectIsMutable();
                this.onRedirect_.remove(i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnAppear(int i11, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.set(i11, common$SDKEvent);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnCloseRedirect(int i11, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnCloseRedirectIsMutable();
                this.onCloseRedirect_.set(i11, common$SDKEvent);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnFailRedirect(int i11, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.set(i11, common$SDKEvent);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnRedirect(int i11, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnRedirectIsMutable();
                this.onRedirect_.set(i11, common$SDKEvent);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (o7.f19167a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"onAppear_", Common$SDKEvent.class, "onRedirect_", Common$SDKEvent.class, "onCloseRedirect_", Common$SDKEvent.class, "onFailRedirect_", Common$SDKEvent.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Events> parser = PARSER;
                        if (parser == null) {
                            synchronized (Events.class) {
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

            public Common$SDKEvent getOnAppear(int i11) {
                return this.onAppear_.get(i11);
            }

            public int getOnAppearCount() {
                return this.onAppear_.size();
            }

            public List<Common$SDKEvent> getOnAppearList() {
                return this.onAppear_;
            }

            public com.plaid.internal.core.protos.link.workflow.nodes.panes.b getOnAppearOrBuilder(int i11) {
                return this.onAppear_.get(i11);
            }

            public List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.b> getOnAppearOrBuilderList() {
                return this.onAppear_;
            }

            public Common$SDKEvent getOnCloseRedirect(int i11) {
                return this.onCloseRedirect_.get(i11);
            }

            public int getOnCloseRedirectCount() {
                return this.onCloseRedirect_.size();
            }

            public List<Common$SDKEvent> getOnCloseRedirectList() {
                return this.onCloseRedirect_;
            }

            public com.plaid.internal.core.protos.link.workflow.nodes.panes.b getOnCloseRedirectOrBuilder(int i11) {
                return this.onCloseRedirect_.get(i11);
            }

            public List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.b> getOnCloseRedirectOrBuilderList() {
                return this.onCloseRedirect_;
            }

            public Common$SDKEvent getOnFailRedirect(int i11) {
                return this.onFailRedirect_.get(i11);
            }

            public int getOnFailRedirectCount() {
                return this.onFailRedirect_.size();
            }

            public List<Common$SDKEvent> getOnFailRedirectList() {
                return this.onFailRedirect_;
            }

            public com.plaid.internal.core.protos.link.workflow.nodes.panes.b getOnFailRedirectOrBuilder(int i11) {
                return this.onFailRedirect_.get(i11);
            }

            public List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.b> getOnFailRedirectOrBuilderList() {
                return this.onFailRedirect_;
            }

            public Common$SDKEvent getOnRedirect(int i11) {
                return this.onRedirect_.get(i11);
            }

            public int getOnRedirectCount() {
                return this.onRedirect_.size();
            }

            public List<Common$SDKEvent> getOnRedirectList() {
                return this.onRedirect_;
            }

            public com.plaid.internal.core.protos.link.workflow.nodes.panes.b getOnRedirectOrBuilder(int i11) {
                return this.onRedirect_.get(i11);
            }

            public List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.b> getOnRedirectOrBuilderList() {
                return this.onRedirect_;
            }

            public static a newBuilder(Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static Events parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Events parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Events parseFrom(ByteString byteString) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addOnAppear(int i11, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.add(i11, common$SDKEvent);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addOnCloseRedirect(int i11, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnCloseRedirectIsMutable();
                this.onCloseRedirect_.add(i11, common$SDKEvent);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addOnFailRedirect(int i11, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.add(i11, common$SDKEvent);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addOnRedirect(int i11, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnRedirectIsMutable();
                this.onRedirect_.add(i11, common$SDKEvent);
            }

            public static Events parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Events parseFrom(byte[] bArr) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Events parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Events parseFrom(InputStream inputStream) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Events parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Events parseFrom(CodedInputStream codedInputStream) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Events parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<Rendering, a> implements MessageLiteOrBuilder {
            public a() {
                super(Rendering.DEFAULT_INSTANCE);
            }
        }

        /* loaded from: classes2.dex */
        public enum b {
            POPUP(10),
            REDIRECT(11),
            OPENMETHOD_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            public final int f18382a;

            b(int i11) {
                this.f18382a = i11;
            }

            public static b forNumber(int i11) {
                if (i11 != 0) {
                    if (i11 != 10) {
                        if (i11 != 11) {
                            return null;
                        }
                        return REDIRECT;
                    }
                    return POPUP;
                }
                return OPENMETHOD_NOT_SET;
            }

            public int getNumber() {
                return this.f18382a;
            }

            @Deprecated
            public static b valueOf(int i11) {
                return forNumber(i11);
            }
        }

        static {
            Rendering rendering = new Rendering();
            DEFAULT_INSTANCE = rendering;
            GeneratedMessageLite.registerDefaultInstance(Rendering.class, rendering);
        }

        private Rendering() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAfter() {
            this.after_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBefore() {
            this.before_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfiguredWithRedirectUri() {
            this.configuredWithRedirectUri_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuring() {
            this.during_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEvents() {
            this.events_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInstitution() {
            this.institution_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoginUri() {
            this.loginUri_ = getDefaultInstance().getLoginUri();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOauthStateId() {
            this.oauthStateId_ = getDefaultInstance().getOauthStateId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpenMethod() {
            this.openMethodCase_ = 0;
            this.openMethod_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaneHeader() {
            this.paneHeader_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPolling() {
            this.polling_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPopup() {
            if (this.openMethodCase_ == 10) {
                this.openMethodCase_ = 0;
                this.openMethod_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRedirect() {
            if (this.openMethodCase_ == 11) {
                this.openMethodCase_ = 0;
                this.openMethod_ = null;
            }
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAfter(Content content) {
            content.getClass();
            Content content2 = this.after_;
            if (content2 != null && content2 != Content.getDefaultInstance()) {
                this.after_ = Content.newBuilder(this.after_).mergeFrom((Content.a) content).buildPartial();
            } else {
                this.after_ = content;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBefore(Content content) {
            content.getClass();
            Content content2 = this.before_;
            if (content2 != null && content2 != Content.getDefaultInstance()) {
                this.before_ = Content.newBuilder(this.before_).mergeFrom((Content.a) content).buildPartial();
            } else {
                this.before_ = content;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDuring(Content content) {
            content.getClass();
            Content content2 = this.during_;
            if (content2 != null && content2 != Content.getDefaultInstance()) {
                this.during_ = Content.newBuilder(this.during_).mergeFrom((Content.a) content).buildPartial();
            } else {
                this.during_ = content;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEvents(Events events) {
            events.getClass();
            Events events2 = this.events_;
            if (events2 != null && events2 != Events.getDefaultInstance()) {
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.a) events).buildPartial();
            } else {
                this.events_ = events;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInstitution(Common$RenderedInstitution common$RenderedInstitution) {
            common$RenderedInstitution.getClass();
            Common$RenderedInstitution common$RenderedInstitution2 = this.institution_;
            if (common$RenderedInstitution2 != null && common$RenderedInstitution2 != Common$RenderedInstitution.getDefaultInstance()) {
                this.institution_ = Common$RenderedInstitution.newBuilder(this.institution_).mergeFrom((Common$RenderedInstitution.a) common$RenderedInstitution).buildPartial();
            } else {
                this.institution_ = common$RenderedInstitution;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePaneHeader(Common$PaneHeader common$PaneHeader) {
            common$PaneHeader.getClass();
            Common$PaneHeader common$PaneHeader2 = this.paneHeader_;
            if (common$PaneHeader2 != null && common$PaneHeader2 != Common$PaneHeader.getDefaultInstance()) {
                this.paneHeader_ = Common$PaneHeader.newBuilder(this.paneHeader_).mergeFrom((Common$PaneHeader.a) common$PaneHeader).buildPartial();
            } else {
                this.paneHeader_ = common$PaneHeader;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePolling(Common$PollingOptions common$PollingOptions) {
            common$PollingOptions.getClass();
            Common$PollingOptions common$PollingOptions2 = this.polling_;
            if (common$PollingOptions2 != null && common$PollingOptions2 != Common$PollingOptions.getDefaultInstance()) {
                this.polling_ = Common$PollingOptions.newBuilder(this.polling_).mergeFrom((Common$PollingOptions.a) common$PollingOptions).buildPartial();
            } else {
                this.polling_ = common$PollingOptions;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePopup(Common$PopupOptions common$PopupOptions) {
            common$PopupOptions.getClass();
            if (this.openMethodCase_ == 10 && this.openMethod_ != Common$PopupOptions.getDefaultInstance()) {
                this.openMethod_ = Common$PopupOptions.newBuilder((Common$PopupOptions) this.openMethod_).mergeFrom((Common$PopupOptions.a) common$PopupOptions).buildPartial();
            } else {
                this.openMethod_ = common$PopupOptions;
            }
            this.openMethodCase_ = 10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRedirect(Common$RedirectOptions common$RedirectOptions) {
            common$RedirectOptions.getClass();
            if (this.openMethodCase_ == 11 && this.openMethod_ != Common$RedirectOptions.getDefaultInstance()) {
                this.openMethod_ = Common$RedirectOptions.newBuilder((Common$RedirectOptions) this.openMethod_).mergeFrom((Common$RedirectOptions.a) common$RedirectOptions).buildPartial();
            } else {
                this.openMethod_ = common$RedirectOptions;
            }
            this.openMethodCase_ = 11;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Rendering parseDelimitedFrom(InputStream inputStream) {
            return (Rendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Rendering parseFrom(ByteBuffer byteBuffer) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAfter(Content content) {
            content.getClass();
            this.after_ = content;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBefore(Content content) {
            content.getClass();
            this.before_ = content;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguredWithRedirectUri(boolean z11) {
            this.configuredWithRedirectUri_ = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDuring(Content content) {
            content.getClass();
            this.during_ = content;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInstitution(Common$RenderedInstitution common$RenderedInstitution) {
            common$RenderedInstitution.getClass();
            this.institution_ = common$RenderedInstitution;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoginUri(String str) {
            str.getClass();
            this.loginUri_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoginUriBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.loginUri_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOauthStateId(String str) {
            str.getClass();
            this.oauthStateId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOauthStateIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.oauthStateId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaneHeader(Common$PaneHeader common$PaneHeader) {
            common$PaneHeader.getClass();
            this.paneHeader_ = common$PaneHeader;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPolling(Common$PollingOptions common$PollingOptions) {
            common$PollingOptions.getClass();
            this.polling_ = common$PollingOptions;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPopup(Common$PopupOptions common$PopupOptions) {
            common$PopupOptions.getClass();
            this.openMethod_ = common$PopupOptions;
            this.openMethodCase_ = 10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRedirect(Common$RedirectOptions common$RedirectOptions) {
            common$RedirectOptions.getClass();
            this.openMethod_ = common$RedirectOptions;
            this.openMethodCase_ = 11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (o7.f19167a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0001\u0000\u0001\f\f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\u0007\t\t\n<\u0000\u000b<\u0000\f\t", new Object[]{"openMethod_", "openMethodCase_", "loginUri_", "oauthStateId_", "before_", "during_", "after_", "events_", "institution_", "configuredWithRedirectUri_", "paneHeader_", Common$PopupOptions.class, Common$RedirectOptions.class, "polling_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Rendering> parser = PARSER;
                    if (parser == null) {
                        synchronized (Rendering.class) {
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

        public Content getAfter() {
            Content content = this.after_;
            return content == null ? Content.getDefaultInstance() : content;
        }

        public Content getBefore() {
            Content content = this.before_;
            return content == null ? Content.getDefaultInstance() : content;
        }

        public boolean getConfiguredWithRedirectUri() {
            return this.configuredWithRedirectUri_;
        }

        public Content getDuring() {
            Content content = this.during_;
            return content == null ? Content.getDefaultInstance() : content;
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public Common$RenderedInstitution getInstitution() {
            Common$RenderedInstitution common$RenderedInstitution = this.institution_;
            return common$RenderedInstitution == null ? Common$RenderedInstitution.getDefaultInstance() : common$RenderedInstitution;
        }

        public String getLoginUri() {
            return this.loginUri_;
        }

        public ByteString getLoginUriBytes() {
            return ByteString.copyFromUtf8(this.loginUri_);
        }

        public String getOauthStateId() {
            return this.oauthStateId_;
        }

        public ByteString getOauthStateIdBytes() {
            return ByteString.copyFromUtf8(this.oauthStateId_);
        }

        public b getOpenMethodCase() {
            return b.forNumber(this.openMethodCase_);
        }

        public Common$PaneHeader getPaneHeader() {
            Common$PaneHeader common$PaneHeader = this.paneHeader_;
            return common$PaneHeader == null ? Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
        }

        public Common$PollingOptions getPolling() {
            Common$PollingOptions common$PollingOptions = this.polling_;
            return common$PollingOptions == null ? Common$PollingOptions.getDefaultInstance() : common$PollingOptions;
        }

        public Common$PopupOptions getPopup() {
            if (this.openMethodCase_ == 10) {
                return (Common$PopupOptions) this.openMethod_;
            }
            return Common$PopupOptions.getDefaultInstance();
        }

        public Common$RedirectOptions getRedirect() {
            if (this.openMethodCase_ == 11) {
                return (Common$RedirectOptions) this.openMethod_;
            }
            return Common$RedirectOptions.getDefaultInstance();
        }

        public boolean hasAfter() {
            return this.after_ != null;
        }

        public boolean hasBefore() {
            return this.before_ != null;
        }

        public boolean hasDuring() {
            return this.during_ != null;
        }

        public boolean hasEvents() {
            return this.events_ != null;
        }

        public boolean hasInstitution() {
            return this.institution_ != null;
        }

        public boolean hasPaneHeader() {
            return this.paneHeader_ != null;
        }

        public boolean hasPolling() {
            return this.polling_ != null;
        }

        public boolean hasPopup() {
            return this.openMethodCase_ == 10;
        }

        public boolean hasRedirect() {
            return this.openMethodCase_ == 11;
        }

        public static a newBuilder(Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static Rendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Rendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Rendering parseFrom(ByteString byteString) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Rendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Rendering parseFrom(byte[] bArr) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Rendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Rendering parseFrom(InputStream inputStream) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Rendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Rendering parseFrom(CodedInputStream codedInputStream) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Rendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Oauth$OAuthPane, a> implements MessageLiteOrBuilder {
        public a() {
            super(Oauth$OAuthPane.DEFAULT_INSTANCE);
        }
    }

    static {
        Oauth$OAuthPane oauth$OAuthPane = new Oauth$OAuthPane();
        DEFAULT_INSTANCE = oauth$OAuthPane;
        GeneratedMessageLite.registerDefaultInstance(Oauth$OAuthPane.class, oauth$OAuthPane);
    }

    private Oauth$OAuthPane() {
    }

    public static Oauth$OAuthPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Oauth$OAuthPane parseDelimitedFrom(InputStream inputStream) {
        return (Oauth$OAuthPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Oauth$OAuthPane parseFrom(ByteBuffer byteBuffer) {
        return (Oauth$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Oauth$OAuthPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (o7.f19167a[methodToInvoke.ordinal()]) {
            case 1:
                return new Oauth$OAuthPane();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Oauth$OAuthPane> parser = PARSER;
                if (parser == null) {
                    synchronized (Oauth$OAuthPane.class) {
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

    public static a newBuilder(Oauth$OAuthPane oauth$OAuthPane) {
        return DEFAULT_INSTANCE.createBuilder(oauth$OAuthPane);
    }

    public static Oauth$OAuthPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Oauth$OAuthPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Oauth$OAuthPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Oauth$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Oauth$OAuthPane parseFrom(ByteString byteString) {
        return (Oauth$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Oauth$OAuthPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Oauth$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Oauth$OAuthPane parseFrom(byte[] bArr) {
        return (Oauth$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Oauth$OAuthPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Oauth$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Oauth$OAuthPane parseFrom(InputStream inputStream) {
        return (Oauth$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Oauth$OAuthPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Oauth$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Oauth$OAuthPane parseFrom(CodedInputStream codedInputStream) {
        return (Oauth$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Oauth$OAuthPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Oauth$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}