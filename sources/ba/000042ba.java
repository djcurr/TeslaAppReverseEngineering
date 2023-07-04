package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.za;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class QrCode$QRCodePane extends GeneratedMessageLite<QrCode$QRCodePane, a> implements MessageLiteOrBuilder {
    private static final QrCode$QRCodePane DEFAULT_INSTANCE;
    private static volatile Parser<QrCode$QRCodePane> PARSER;

    /* loaded from: classes2.dex */
    public static final class Actions extends GeneratedMessageLite<Actions, b> implements MessageLiteOrBuilder {
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 4;
        public static final int FOOTER_CONTENT_TAP_FIELD_NUMBER = 3;
        private static volatile Parser<Actions> PARSER = null;
        public static final int SUBHEADER_CONTENT_TAP_FIELD_NUMBER = 2;
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
                switch (za.f19965a[methodToInvoke.ordinal()]) {
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
        public static final class FooterContentTapAction extends GeneratedMessageLite<FooterContentTapAction, a> implements MessageLiteOrBuilder {
            private static final FooterContentTapAction DEFAULT_INSTANCE;
            private static volatile Parser<FooterContentTapAction> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<FooterContentTapAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(FooterContentTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                FooterContentTapAction footerContentTapAction = new FooterContentTapAction();
                DEFAULT_INSTANCE = footerContentTapAction;
                GeneratedMessageLite.registerDefaultInstance(FooterContentTapAction.class, footerContentTapAction);
            }

            private FooterContentTapAction() {
            }

            public static FooterContentTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static FooterContentTapAction parseDelimitedFrom(InputStream inputStream) {
                return (FooterContentTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static FooterContentTapAction parseFrom(ByteBuffer byteBuffer) {
                return (FooterContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<FooterContentTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (za.f19965a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new FooterContentTapAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<FooterContentTapAction> parser = PARSER;
                        if (parser == null) {
                            synchronized (FooterContentTapAction.class) {
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

            public static a newBuilder(FooterContentTapAction footerContentTapAction) {
                return DEFAULT_INSTANCE.createBuilder(footerContentTapAction);
            }

            public static FooterContentTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FooterContentTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static FooterContentTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (FooterContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static FooterContentTapAction parseFrom(ByteString byteString) {
                return (FooterContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static FooterContentTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (FooterContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static FooterContentTapAction parseFrom(byte[] bArr) {
                return (FooterContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static FooterContentTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (FooterContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static FooterContentTapAction parseFrom(InputStream inputStream) {
                return (FooterContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static FooterContentTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FooterContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static FooterContentTapAction parseFrom(CodedInputStream codedInputStream) {
                return (FooterContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static FooterContentTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FooterContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class SubheaderContentTapAction extends GeneratedMessageLite<SubheaderContentTapAction, a> implements MessageLiteOrBuilder {
            private static final SubheaderContentTapAction DEFAULT_INSTANCE;
            private static volatile Parser<SubheaderContentTapAction> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<SubheaderContentTapAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(SubheaderContentTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                SubheaderContentTapAction subheaderContentTapAction = new SubheaderContentTapAction();
                DEFAULT_INSTANCE = subheaderContentTapAction;
                GeneratedMessageLite.registerDefaultInstance(SubheaderContentTapAction.class, subheaderContentTapAction);
            }

            private SubheaderContentTapAction() {
            }

            public static SubheaderContentTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SubheaderContentTapAction parseDelimitedFrom(InputStream inputStream) {
                return (SubheaderContentTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SubheaderContentTapAction parseFrom(ByteBuffer byteBuffer) {
                return (SubheaderContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SubheaderContentTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (za.f19965a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubheaderContentTapAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SubheaderContentTapAction> parser = PARSER;
                        if (parser == null) {
                            synchronized (SubheaderContentTapAction.class) {
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

            public static a newBuilder(SubheaderContentTapAction subheaderContentTapAction) {
                return DEFAULT_INSTANCE.createBuilder(subheaderContentTapAction);
            }

            public static SubheaderContentTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubheaderContentTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SubheaderContentTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SubheaderContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SubheaderContentTapAction parseFrom(ByteString byteString) {
                return (SubheaderContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SubheaderContentTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SubheaderContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SubheaderContentTapAction parseFrom(byte[] bArr) {
                return (SubheaderContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SubheaderContentTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SubheaderContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SubheaderContentTapAction parseFrom(InputStream inputStream) {
                return (SubheaderContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SubheaderContentTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubheaderContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SubheaderContentTapAction parseFrom(CodedInputStream codedInputStream) {
                return (SubheaderContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SubheaderContentTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubheaderContentTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class SubmitAction extends GeneratedMessageLite<SubmitAction, a> implements MessageLiteOrBuilder {
            private static final SubmitAction DEFAULT_INSTANCE;
            public static final int OAUTH_STATE_ID_FIELD_NUMBER = 1;
            private static volatile Parser<SubmitAction> PARSER;
            private String oauthStateId_ = "";

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<SubmitAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(SubmitAction.DEFAULT_INSTANCE);
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

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (za.f19965a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubmitAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"oauthStateId_"});
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
            SUBHEADER_CONTENT_TAP(2),
            FOOTER_CONTENT_TAP(3),
            EXIT(4),
            ACTION_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            public final int f18392a;

            a(int i11) {
                this.f18392a = i11;
            }

            public static a forNumber(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    return null;
                                }
                                return EXIT;
                            }
                            return FOOTER_CONTENT_TAP;
                        }
                        return SUBHEADER_CONTENT_TAP;
                    }
                    return SUBMIT;
                }
                return ACTION_NOT_SET;
            }

            public int getNumber() {
                return this.f18392a;
            }

            @Deprecated
            public static a valueOf(int i11) {
                return forNumber(i11);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends GeneratedMessageLite.Builder<Actions, b> implements MessageLiteOrBuilder {
            public b() {
                super(Actions.DEFAULT_INSTANCE);
            }

            public b a(ExitAction exitAction) {
                copyOnWrite();
                ((Actions) this.instance).setExit(exitAction);
                return this;
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
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFooterContentTap() {
            if (this.actionCase_ == 3) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubheaderContentTap() {
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
            if (this.actionCase_ == 4 && this.action_ != ExitAction.getDefaultInstance()) {
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.a) exitAction).buildPartial();
            } else {
                this.action_ = exitAction;
            }
            this.actionCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFooterContentTap(FooterContentTapAction footerContentTapAction) {
            footerContentTapAction.getClass();
            if (this.actionCase_ == 3 && this.action_ != FooterContentTapAction.getDefaultInstance()) {
                this.action_ = FooterContentTapAction.newBuilder((FooterContentTapAction) this.action_).mergeFrom((FooterContentTapAction.a) footerContentTapAction).buildPartial();
            } else {
                this.action_ = footerContentTapAction;
            }
            this.actionCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSubheaderContentTap(SubheaderContentTapAction subheaderContentTapAction) {
            subheaderContentTapAction.getClass();
            if (this.actionCase_ == 2 && this.action_ != SubheaderContentTapAction.getDefaultInstance()) {
                this.action_ = SubheaderContentTapAction.newBuilder((SubheaderContentTapAction) this.action_).mergeFrom((SubheaderContentTapAction.a) subheaderContentTapAction).buildPartial();
            } else {
                this.action_ = subheaderContentTapAction;
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
            this.actionCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFooterContentTap(FooterContentTapAction footerContentTapAction) {
            footerContentTapAction.getClass();
            this.action_ = footerContentTapAction;
            this.actionCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubheaderContentTap(SubheaderContentTapAction subheaderContentTapAction) {
            subheaderContentTapAction.getClass();
            this.action_ = subheaderContentTapAction;
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
            switch (za.f19965a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"action_", "actionCase_", SubmitAction.class, SubheaderContentTapAction.class, FooterContentTapAction.class, ExitAction.class});
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
            if (this.actionCase_ == 4) {
                return (ExitAction) this.action_;
            }
            return ExitAction.getDefaultInstance();
        }

        public FooterContentTapAction getFooterContentTap() {
            if (this.actionCase_ == 3) {
                return (FooterContentTapAction) this.action_;
            }
            return FooterContentTapAction.getDefaultInstance();
        }

        public SubheaderContentTapAction getSubheaderContentTap() {
            if (this.actionCase_ == 2) {
                return (SubheaderContentTapAction) this.action_;
            }
            return SubheaderContentTapAction.getDefaultInstance();
        }

        public SubmitAction getSubmit() {
            if (this.actionCase_ == 1) {
                return (SubmitAction) this.action_;
            }
            return SubmitAction.getDefaultInstance();
        }

        public boolean hasExit() {
            return this.actionCase_ == 4;
        }

        public boolean hasFooterContentTap() {
            return this.actionCase_ == 3;
        }

        public boolean hasSubheaderContentTap() {
            return this.actionCase_ == 2;
        }

        public boolean hasSubmit() {
            return this.actionCase_ == 1;
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
        private static final Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 5;
        public static final int FOOTER_CONTENT_FIELD_NUMBER = 4;
        public static final int OAUTH_STATE_ID_FIELD_NUMBER = 6;
        public static final int PANE_HEADER_FIELD_NUMBER = 1;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int QR_CODE_FIELD_NUMBER = 3;
        public static final int SUBHEADER_CONTENT_FIELD_NUMBER = 2;
        private Events events_;
        private Common$AttributedLocalizedString footerContent_;
        private String oauthStateId_ = "";
        private Common$PaneHeader paneHeader_;
        private Common$RenderedAsset qrCode_;
        private Common$AttributedLocalizedString subheaderContent_;

        /* loaded from: classes2.dex */
        public static final class Events extends GeneratedMessageLite<Events, a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_FOOTER_CONTENT_TAP_FIELD_NUMBER = 3;
            public static final int ON_SUBHEADER_CONTENT_TAP_FIELD_NUMBER = 2;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Common$SDKEvent onFooterContentTap_;
            private Common$SDKEvent onSubheaderContentTap_;

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
            public void addOnAppear(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnAppear() {
                this.onAppear_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnFooterContentTap() {
                this.onFooterContentTap_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnSubheaderContentTap() {
                this.onSubheaderContentTap_ = null;
            }

            private void ensureOnAppearIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeOnFooterContentTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onFooterContentTap_;
                if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
                    this.onFooterContentTap_ = Common$SDKEvent.newBuilder(this.onFooterContentTap_).mergeFrom((Common$SDKEvent.a) common$SDKEvent).buildPartial();
                } else {
                    this.onFooterContentTap_ = common$SDKEvent;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeOnSubheaderContentTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onSubheaderContentTap_;
                if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
                    this.onSubheaderContentTap_ = Common$SDKEvent.newBuilder(this.onSubheaderContentTap_).mergeFrom((Common$SDKEvent.a) common$SDKEvent).buildPartial();
                } else {
                    this.onSubheaderContentTap_ = common$SDKEvent;
                }
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
            public void setOnAppear(int i11, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.set(i11, common$SDKEvent);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnFooterContentTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onFooterContentTap_ = common$SDKEvent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnSubheaderContentTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSubheaderContentTap_ = common$SDKEvent;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (za.f19965a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t", new Object[]{"onAppear_", Common$SDKEvent.class, "onSubheaderContentTap_", "onFooterContentTap_"});
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

            public b getOnAppearOrBuilder(int i11) {
                return this.onAppear_.get(i11);
            }

            public List<? extends b> getOnAppearOrBuilderList() {
                return this.onAppear_;
            }

            public Common$SDKEvent getOnFooterContentTap() {
                Common$SDKEvent common$SDKEvent = this.onFooterContentTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnSubheaderContentTap() {
                Common$SDKEvent common$SDKEvent = this.onSubheaderContentTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public boolean hasOnFooterContentTap() {
                return this.onFooterContentTap_ != null;
            }

            public boolean hasOnSubheaderContentTap() {
                return this.onSubheaderContentTap_ != null;
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

        static {
            Rendering rendering = new Rendering();
            DEFAULT_INSTANCE = rendering;
            GeneratedMessageLite.registerDefaultInstance(Rendering.class, rendering);
        }

        private Rendering() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEvents() {
            this.events_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFooterContent() {
            this.footerContent_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOauthStateId() {
            this.oauthStateId_ = getDefaultInstance().getOauthStateId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaneHeader() {
            this.paneHeader_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQrCode() {
            this.qrCode_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubheaderContent() {
            this.subheaderContent_ = null;
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
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
        public void mergeFooterContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.footerContent_;
            if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
                this.footerContent_ = Common$AttributedLocalizedString.newBuilder(this.footerContent_).mergeFrom((Common$AttributedLocalizedString.b) common$AttributedLocalizedString).buildPartial();
            } else {
                this.footerContent_ = common$AttributedLocalizedString;
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
        public void mergeQrCode(Common$RenderedAsset common$RenderedAsset) {
            common$RenderedAsset.getClass();
            Common$RenderedAsset common$RenderedAsset2 = this.qrCode_;
            if (common$RenderedAsset2 != null && common$RenderedAsset2 != Common$RenderedAsset.getDefaultInstance()) {
                this.qrCode_ = Common$RenderedAsset.newBuilder(this.qrCode_).mergeFrom((Common$RenderedAsset.a) common$RenderedAsset).buildPartial();
            } else {
                this.qrCode_ = common$RenderedAsset;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSubheaderContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.subheaderContent_;
            if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
                this.subheaderContent_ = Common$AttributedLocalizedString.newBuilder(this.subheaderContent_).mergeFrom((Common$AttributedLocalizedString.b) common$AttributedLocalizedString).buildPartial();
            } else {
                this.subheaderContent_ = common$AttributedLocalizedString;
            }
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
        public void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFooterContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.footerContent_ = common$AttributedLocalizedString;
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
        public void setQrCode(Common$RenderedAsset common$RenderedAsset) {
            common$RenderedAsset.getClass();
            this.qrCode_ = common$RenderedAsset;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubheaderContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.subheaderContent_ = common$AttributedLocalizedString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (za.f19965a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006Ȉ", new Object[]{"paneHeader_", "subheaderContent_", "qrCode_", "footerContent_", "events_", "oauthStateId_"});
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

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public Common$AttributedLocalizedString getFooterContent() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.footerContent_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public String getOauthStateId() {
            return this.oauthStateId_;
        }

        public ByteString getOauthStateIdBytes() {
            return ByteString.copyFromUtf8(this.oauthStateId_);
        }

        public Common$PaneHeader getPaneHeader() {
            Common$PaneHeader common$PaneHeader = this.paneHeader_;
            return common$PaneHeader == null ? Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
        }

        public Common$RenderedAsset getQrCode() {
            Common$RenderedAsset common$RenderedAsset = this.qrCode_;
            return common$RenderedAsset == null ? Common$RenderedAsset.getDefaultInstance() : common$RenderedAsset;
        }

        public Common$AttributedLocalizedString getSubheaderContent() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.subheaderContent_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public boolean hasEvents() {
            return this.events_ != null;
        }

        public boolean hasFooterContent() {
            return this.footerContent_ != null;
        }

        public boolean hasPaneHeader() {
            return this.paneHeader_ != null;
        }

        public boolean hasQrCode() {
            return this.qrCode_ != null;
        }

        public boolean hasSubheaderContent() {
            return this.subheaderContent_ != null;
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
    public static final class a extends GeneratedMessageLite.Builder<QrCode$QRCodePane, a> implements MessageLiteOrBuilder {
        public a() {
            super(QrCode$QRCodePane.DEFAULT_INSTANCE);
        }
    }

    static {
        QrCode$QRCodePane qrCode$QRCodePane = new QrCode$QRCodePane();
        DEFAULT_INSTANCE = qrCode$QRCodePane;
        GeneratedMessageLite.registerDefaultInstance(QrCode$QRCodePane.class, qrCode$QRCodePane);
    }

    private QrCode$QRCodePane() {
    }

    public static QrCode$QRCodePane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static QrCode$QRCodePane parseDelimitedFrom(InputStream inputStream) {
        return (QrCode$QRCodePane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QrCode$QRCodePane parseFrom(ByteBuffer byteBuffer) {
        return (QrCode$QRCodePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<QrCode$QRCodePane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (za.f19965a[methodToInvoke.ordinal()]) {
            case 1:
                return new QrCode$QRCodePane();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<QrCode$QRCodePane> parser = PARSER;
                if (parser == null) {
                    synchronized (QrCode$QRCodePane.class) {
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

    public static a newBuilder(QrCode$QRCodePane qrCode$QRCodePane) {
        return DEFAULT_INSTANCE.createBuilder(qrCode$QRCodePane);
    }

    public static QrCode$QRCodePane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (QrCode$QRCodePane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QrCode$QRCodePane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (QrCode$QRCodePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static QrCode$QRCodePane parseFrom(ByteString byteString) {
        return (QrCode$QRCodePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static QrCode$QRCodePane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (QrCode$QRCodePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static QrCode$QRCodePane parseFrom(byte[] bArr) {
        return (QrCode$QRCodePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static QrCode$QRCodePane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (QrCode$QRCodePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static QrCode$QRCodePane parseFrom(InputStream inputStream) {
        return (QrCode$QRCodePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QrCode$QRCodePane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (QrCode$QRCodePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QrCode$QRCodePane parseFrom(CodedInputStream codedInputStream) {
        return (QrCode$QRCodePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static QrCode$QRCodePane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (QrCode$QRCodePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}