package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.h1;
import com.plaid.internal.j1;
import com.plaid.internal.k;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane extends GeneratedMessageLite<BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane, a> implements MessageLiteOrBuilder {
    private static final BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane DEFAULT_INSTANCE;
    private static volatile Parser<BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane> PARSER;

    /* loaded from: classes2.dex */
    public static final class Actions extends GeneratedMessageLite<Actions, b> implements MessageLiteOrBuilder {
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 3;
        private static volatile Parser<Actions> PARSER = null;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        public static final int TAP_END_OF_RESULTS_FIELD_NUMBER = 4;
        public static final int TAP_NO_RESULTS_FIELD_NUMBER = 2;
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
                switch (k.f18899a[methodToInvoke.ordinal()]) {
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
            private static volatile Parser<SubmitAction> PARSER = null;
            public static final int SELECTED_ID_FIELD_NUMBER = 1;
            private String selectedId_ = "";

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
            public void clearSelectedId() {
                this.selectedId_ = getDefaultInstance().getSelectedId();
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
            public void setSelectedId(String str) {
                str.getClass();
                this.selectedId_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSelectedIdBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.selectedId_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (k.f18899a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubmitAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"selectedId_"});
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

            public String getSelectedId() {
                return this.selectedId_;
            }

            public ByteString getSelectedIdBytes() {
                return ByteString.copyFromUtf8(this.selectedId_);
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
        public static final class TapEndOfResultsAction extends GeneratedMessageLite<TapEndOfResultsAction, a> implements MessageLiteOrBuilder {
            private static final TapEndOfResultsAction DEFAULT_INSTANCE;
            private static volatile Parser<TapEndOfResultsAction> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<TapEndOfResultsAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(TapEndOfResultsAction.DEFAULT_INSTANCE);
                }
            }

            static {
                TapEndOfResultsAction tapEndOfResultsAction = new TapEndOfResultsAction();
                DEFAULT_INSTANCE = tapEndOfResultsAction;
                GeneratedMessageLite.registerDefaultInstance(TapEndOfResultsAction.class, tapEndOfResultsAction);
            }

            private TapEndOfResultsAction() {
            }

            public static TapEndOfResultsAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static TapEndOfResultsAction parseDelimitedFrom(InputStream inputStream) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TapEndOfResultsAction parseFrom(ByteBuffer byteBuffer) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<TapEndOfResultsAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (k.f18899a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new TapEndOfResultsAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<TapEndOfResultsAction> parser = PARSER;
                        if (parser == null) {
                            synchronized (TapEndOfResultsAction.class) {
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

            public static a newBuilder(TapEndOfResultsAction tapEndOfResultsAction) {
                return DEFAULT_INSTANCE.createBuilder(tapEndOfResultsAction);
            }

            public static TapEndOfResultsAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TapEndOfResultsAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static TapEndOfResultsAction parseFrom(ByteString byteString) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static TapEndOfResultsAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static TapEndOfResultsAction parseFrom(byte[] bArr) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static TapEndOfResultsAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static TapEndOfResultsAction parseFrom(InputStream inputStream) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TapEndOfResultsAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TapEndOfResultsAction parseFrom(CodedInputStream codedInputStream) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static TapEndOfResultsAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class TapNoResultsAction extends GeneratedMessageLite<TapNoResultsAction, a> implements MessageLiteOrBuilder {
            private static final TapNoResultsAction DEFAULT_INSTANCE;
            private static volatile Parser<TapNoResultsAction> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<TapNoResultsAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(TapNoResultsAction.DEFAULT_INSTANCE);
                }
            }

            static {
                TapNoResultsAction tapNoResultsAction = new TapNoResultsAction();
                DEFAULT_INSTANCE = tapNoResultsAction;
                GeneratedMessageLite.registerDefaultInstance(TapNoResultsAction.class, tapNoResultsAction);
            }

            private TapNoResultsAction() {
            }

            public static TapNoResultsAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static TapNoResultsAction parseDelimitedFrom(InputStream inputStream) {
                return (TapNoResultsAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TapNoResultsAction parseFrom(ByteBuffer byteBuffer) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<TapNoResultsAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (k.f18899a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new TapNoResultsAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<TapNoResultsAction> parser = PARSER;
                        if (parser == null) {
                            synchronized (TapNoResultsAction.class) {
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

            public static a newBuilder(TapNoResultsAction tapNoResultsAction) {
                return DEFAULT_INSTANCE.createBuilder(tapNoResultsAction);
            }

            public static TapNoResultsAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapNoResultsAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TapNoResultsAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static TapNoResultsAction parseFrom(ByteString byteString) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static TapNoResultsAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static TapNoResultsAction parseFrom(byte[] bArr) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static TapNoResultsAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static TapNoResultsAction parseFrom(InputStream inputStream) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TapNoResultsAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TapNoResultsAction parseFrom(CodedInputStream codedInputStream) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static TapNoResultsAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapNoResultsAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public enum a {
            SUBMIT(1),
            TAP_NO_RESULTS(2),
            EXIT(3),
            TAP_END_OF_RESULTS(4),
            ACTION_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            public final int f18318a;

            a(int i11) {
                this.f18318a = i11;
            }

            public static a forNumber(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    return null;
                                }
                                return TAP_END_OF_RESULTS;
                            }
                            return EXIT;
                        }
                        return TAP_NO_RESULTS;
                    }
                    return SUBMIT;
                }
                return ACTION_NOT_SET;
            }

            public int getNumber() {
                return this.f18318a;
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
            if (this.actionCase_ == 3) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTapEndOfResults() {
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTapNoResults() {
            if (this.actionCase_ == 2) {
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
            if (this.actionCase_ == 3 && this.action_ != ExitAction.getDefaultInstance()) {
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.a) exitAction).buildPartial();
            } else {
                this.action_ = exitAction;
            }
            this.actionCase_ = 3;
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

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTapEndOfResults(TapEndOfResultsAction tapEndOfResultsAction) {
            tapEndOfResultsAction.getClass();
            if (this.actionCase_ == 4 && this.action_ != TapEndOfResultsAction.getDefaultInstance()) {
                this.action_ = TapEndOfResultsAction.newBuilder((TapEndOfResultsAction) this.action_).mergeFrom((TapEndOfResultsAction.a) tapEndOfResultsAction).buildPartial();
            } else {
                this.action_ = tapEndOfResultsAction;
            }
            this.actionCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTapNoResults(TapNoResultsAction tapNoResultsAction) {
            tapNoResultsAction.getClass();
            if (this.actionCase_ == 2 && this.action_ != TapNoResultsAction.getDefaultInstance()) {
                this.action_ = TapNoResultsAction.newBuilder((TapNoResultsAction) this.action_).mergeFrom((TapNoResultsAction.a) tapNoResultsAction).buildPartial();
            } else {
                this.action_ = tapNoResultsAction;
            }
            this.actionCase_ = 2;
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
            this.actionCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTapEndOfResults(TapEndOfResultsAction tapEndOfResultsAction) {
            tapEndOfResultsAction.getClass();
            this.action_ = tapEndOfResultsAction;
            this.actionCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTapNoResults(TapNoResultsAction tapNoResultsAction) {
            tapNoResultsAction.getClass();
            this.action_ = tapNoResultsAction;
            this.actionCase_ = 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (k.f18899a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"action_", "actionCase_", SubmitAction.class, TapNoResultsAction.class, ExitAction.class, TapEndOfResultsAction.class});
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
            if (this.actionCase_ == 3) {
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

        public TapEndOfResultsAction getTapEndOfResults() {
            if (this.actionCase_ == 4) {
                return (TapEndOfResultsAction) this.action_;
            }
            return TapEndOfResultsAction.getDefaultInstance();
        }

        public TapNoResultsAction getTapNoResults() {
            if (this.actionCase_ == 2) {
                return (TapNoResultsAction) this.action_;
            }
            return TapNoResultsAction.getDefaultInstance();
        }

        public boolean hasExit() {
            return this.actionCase_ == 3;
        }

        public boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        public boolean hasTapEndOfResults() {
            return this.actionCase_ == 4;
        }

        public boolean hasTapNoResults() {
            return this.actionCase_ == 2;
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
        public static final int END_OF_RESULTS_BUTTON_FIELD_NUMBER = 14;
        public static final int END_OF_RESULTS_BUTTON_TEXT_FIELD_NUMBER = 15;
        public static final int EVENTS_FIELD_NUMBER = 12;
        public static final int HORIZONTAL_INITIAL_ITEMS_FIELD_NUMBER = 17;
        public static final int HORIZONTAL_ITEM_HEADER_FIELD_NUMBER = 19;
        public static final int INITIAL_ITEMS_FIELD_NUMBER = 1;
        public static final int INITIAL_ITEM_HEADER_FIELD_NUMBER = 18;
        public static final int ON_SUBMIT_OVERRIDE_ITEMS_FIELD_NUMBER = 13;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int PLACEHOLDER_FIELD_NUMBER = 16;
        public static final int SEARCH_API_FIELD_NUMBER = 2;
        public static final int SEARCH_BEHAVIOR_FIELD_NUMBER = 21;
        public static final int SEARCH_NO_RESULTS_BUTTON_FIELD_NUMBER = 5;
        public static final int SEARCH_NO_RESULTS_FIELD_NUMBER = 4;
        public static final int SHOW_NO_RESULTS_HEADER_FIELD_NUMBER = 20;
        public static final int TITLE_FIELD_NUMBER = 3;
        private Common$AttributedLocalizedString endOfResultsButtonText_;
        private Common$ButtonContent endOfResultsButton_;
        private Events events_;
        private Common$LocalizedString horizontalItemHeader_;
        private Common$LocalizedString initialItemHeader_;
        private Common$LocalizedString placeholder_;
        private SearchAPI searchApi_;
        private int searchBehavior_;
        private Common$ButtonContent searchNoResultsButton_;
        private Common$LocalizedString searchNoResults_;
        private boolean showNoResultsHeader_;
        private Common$LocalizedString title_;
        private Internal.ProtobufList<Common$ListItem> initialItems_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> onSubmitOverrideItems_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<Common$ListItem> horizontalInitialItems_ = GeneratedMessageLite.emptyProtobufList();

        /* loaded from: classes2.dex */
        public static final class Events extends GeneratedMessageLite<Events, a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_SEARCH_FIELD_NUMBER = 2;
            public static final int ON_SUBMIT_FIELD_NUMBER = 3;
            public static final int ON_SUBMIT_OVERRIDE_FIELD_NUMBER = 5;
            public static final int ON_TAP_END_OF_RESULTS_FIELD_NUMBER = 6;
            public static final int ON_TAP_NO_RESULTS_FIELD_NUMBER = 4;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Common$SDKEvent onSearch_;
            private Common$SDKEvent onSubmitOverride_;
            private Common$SDKEvent onSubmit_;
            private Common$SDKEvent onTapEndOfResults_;
            private Common$SDKEvent onTapNoResults_;

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
            public void clearOnSearch() {
                this.onSearch_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnSubmit() {
                this.onSubmit_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnSubmitOverride() {
                this.onSubmitOverride_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnTapEndOfResults() {
                this.onTapEndOfResults_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnTapNoResults() {
                this.onTapNoResults_ = null;
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
            public void mergeOnSearch(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onSearch_;
                if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
                    this.onSearch_ = Common$SDKEvent.newBuilder(this.onSearch_).mergeFrom((Common$SDKEvent.a) common$SDKEvent).buildPartial();
                } else {
                    this.onSearch_ = common$SDKEvent;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeOnSubmit(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onSubmit_;
                if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
                    this.onSubmit_ = Common$SDKEvent.newBuilder(this.onSubmit_).mergeFrom((Common$SDKEvent.a) common$SDKEvent).buildPartial();
                } else {
                    this.onSubmit_ = common$SDKEvent;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeOnSubmitOverride(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onSubmitOverride_;
                if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
                    this.onSubmitOverride_ = Common$SDKEvent.newBuilder(this.onSubmitOverride_).mergeFrom((Common$SDKEvent.a) common$SDKEvent).buildPartial();
                } else {
                    this.onSubmitOverride_ = common$SDKEvent;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeOnTapEndOfResults(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onTapEndOfResults_;
                if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
                    this.onTapEndOfResults_ = Common$SDKEvent.newBuilder(this.onTapEndOfResults_).mergeFrom((Common$SDKEvent.a) common$SDKEvent).buildPartial();
                } else {
                    this.onTapEndOfResults_ = common$SDKEvent;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeOnTapNoResults(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onTapNoResults_;
                if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
                    this.onTapNoResults_ = Common$SDKEvent.newBuilder(this.onTapNoResults_).mergeFrom((Common$SDKEvent.a) common$SDKEvent).buildPartial();
                } else {
                    this.onTapNoResults_ = common$SDKEvent;
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
            public void setOnSearch(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSearch_ = common$SDKEvent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnSubmit(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSubmit_ = common$SDKEvent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnSubmitOverride(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSubmitOverride_ = common$SDKEvent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnTapEndOfResults(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onTapEndOfResults_ = common$SDKEvent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnTapNoResults(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onTapNoResults_ = common$SDKEvent;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (k.f18899a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t", new Object[]{"onAppear_", Common$SDKEvent.class, "onSearch_", "onSubmit_", "onTapNoResults_", "onSubmitOverride_", "onTapEndOfResults_"});
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

            public Common$SDKEvent getOnSearch() {
                Common$SDKEvent common$SDKEvent = this.onSearch_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnSubmit() {
                Common$SDKEvent common$SDKEvent = this.onSubmit_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnSubmitOverride() {
                Common$SDKEvent common$SDKEvent = this.onSubmitOverride_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnTapEndOfResults() {
                Common$SDKEvent common$SDKEvent = this.onTapEndOfResults_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnTapNoResults() {
                Common$SDKEvent common$SDKEvent = this.onTapNoResults_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public boolean hasOnSearch() {
                return this.onSearch_ != null;
            }

            public boolean hasOnSubmit() {
                return this.onSubmit_ != null;
            }

            public boolean hasOnSubmitOverride() {
                return this.onSubmitOverride_ != null;
            }

            public boolean hasOnTapEndOfResults() {
                return this.onTapEndOfResults_ != null;
            }

            public boolean hasOnTapNoResults() {
                return this.onTapNoResults_ != null;
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
        public static final class SearchAPI extends GeneratedMessageLite<SearchAPI, a> implements MessageLiteOrBuilder {
            private static final SearchAPI DEFAULT_INSTANCE;
            public static final int EXTRA_HEADERS_FIELD_NUMBER = 4;
            private static volatile Parser<SearchAPI> PARSER = null;
            public static final int POST_BODY_FIELD_NUMBER = 2;
            public static final int POST_BODY_QUERY_REPLACEMENT_TOKEN_FIELD_NUMBER = 3;
            public static final int RESPONSE_RESULTS_JSON_KEY_FIELD_NUMBER = 5;
            public static final int RESPONSE_RESULT_ITEM_KEY_PATH_MAPPING_FIELD_NUMBER = 6;
            public static final int URL_PATH_FIELD_NUMBER = 1;
            private MapFieldLite<String, String> extraHeaders_ = MapFieldLite.emptyMapField();
            private MapFieldLite<String, String> responseResultItemKeyPathMapping_ = MapFieldLite.emptyMapField();
            private String urlPath_ = "";
            private String postBody_ = "";
            private String postBodyQueryReplacementToken_ = "";
            private String responseResultsJsonKey_ = "";

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<SearchAPI, a> implements MessageLiteOrBuilder {
                public a() {
                    super(SearchAPI.DEFAULT_INSTANCE);
                }
            }

            /* loaded from: classes2.dex */
            public static final class b {

                /* renamed from: a  reason: collision with root package name */
                public static final MapEntryLite<String, String> f18319a;

                static {
                    WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                    f18319a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
                }
            }

            /* loaded from: classes2.dex */
            public static final class c {

                /* renamed from: a  reason: collision with root package name */
                public static final MapEntryLite<String, String> f18320a;

                static {
                    WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                    f18320a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
                }
            }

            static {
                SearchAPI searchAPI = new SearchAPI();
                DEFAULT_INSTANCE = searchAPI;
                GeneratedMessageLite.registerDefaultInstance(SearchAPI.class, searchAPI);
            }

            private SearchAPI() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPostBody() {
                this.postBody_ = getDefaultInstance().getPostBody();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPostBodyQueryReplacementToken() {
                this.postBodyQueryReplacementToken_ = getDefaultInstance().getPostBodyQueryReplacementToken();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResponseResultsJsonKey() {
                this.responseResultsJsonKey_ = getDefaultInstance().getResponseResultsJsonKey();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUrlPath() {
                this.urlPath_ = getDefaultInstance().getUrlPath();
            }

            public static SearchAPI getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public Map<String, String> getMutableExtraHeadersMap() {
                return internalGetMutableExtraHeaders();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public Map<String, String> getMutableResponseResultItemKeyPathMappingMap() {
                return internalGetMutableResponseResultItemKeyPathMapping();
            }

            private MapFieldLite<String, String> internalGetExtraHeaders() {
                return this.extraHeaders_;
            }

            private MapFieldLite<String, String> internalGetMutableExtraHeaders() {
                if (!this.extraHeaders_.isMutable()) {
                    this.extraHeaders_ = this.extraHeaders_.mutableCopy();
                }
                return this.extraHeaders_;
            }

            private MapFieldLite<String, String> internalGetMutableResponseResultItemKeyPathMapping() {
                if (!this.responseResultItemKeyPathMapping_.isMutable()) {
                    this.responseResultItemKeyPathMapping_ = this.responseResultItemKeyPathMapping_.mutableCopy();
                }
                return this.responseResultItemKeyPathMapping_;
            }

            private MapFieldLite<String, String> internalGetResponseResultItemKeyPathMapping() {
                return this.responseResultItemKeyPathMapping_;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SearchAPI parseDelimitedFrom(InputStream inputStream) {
                return (SearchAPI) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SearchAPI parseFrom(ByteBuffer byteBuffer) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SearchAPI> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPostBody(String str) {
                str.getClass();
                this.postBody_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPostBodyBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.postBody_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPostBodyQueryReplacementToken(String str) {
                str.getClass();
                this.postBodyQueryReplacementToken_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPostBodyQueryReplacementTokenBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.postBodyQueryReplacementToken_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponseResultsJsonKey(String str) {
                str.getClass();
                this.responseResultsJsonKey_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponseResultsJsonKeyBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.responseResultsJsonKey_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUrlPath(String str) {
                str.getClass();
                this.urlPath_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUrlPathBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.urlPath_ = byteString.toStringUtf8();
            }

            public boolean containsExtraHeaders(String str) {
                str.getClass();
                return internalGetExtraHeaders().containsKey(str);
            }

            public boolean containsResponseResultItemKeyPathMapping(String str) {
                str.getClass();
                return internalGetResponseResultItemKeyPathMapping().containsKey(str);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (k.f18899a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SearchAPI();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0002\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u00042\u0005Ȉ\u00062", new Object[]{"urlPath_", "postBody_", "postBodyQueryReplacementToken_", "extraHeaders_", b.f18319a, "responseResultsJsonKey_", "responseResultItemKeyPathMapping_", c.f18320a});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SearchAPI> parser = PARSER;
                        if (parser == null) {
                            synchronized (SearchAPI.class) {
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

            @Deprecated
            public Map<String, String> getExtraHeaders() {
                return getExtraHeadersMap();
            }

            public int getExtraHeadersCount() {
                return internalGetExtraHeaders().size();
            }

            public Map<String, String> getExtraHeadersMap() {
                return Collections.unmodifiableMap(internalGetExtraHeaders());
            }

            public String getExtraHeadersOrDefault(String str, String str2) {
                str.getClass();
                MapFieldLite<String, String> internalGetExtraHeaders = internalGetExtraHeaders();
                return internalGetExtraHeaders.containsKey(str) ? internalGetExtraHeaders.get(str) : str2;
            }

            public String getExtraHeadersOrThrow(String str) {
                str.getClass();
                MapFieldLite<String, String> internalGetExtraHeaders = internalGetExtraHeaders();
                if (internalGetExtraHeaders.containsKey(str)) {
                    return internalGetExtraHeaders.get(str);
                }
                throw new IllegalArgumentException();
            }

            public String getPostBody() {
                return this.postBody_;
            }

            public ByteString getPostBodyBytes() {
                return ByteString.copyFromUtf8(this.postBody_);
            }

            public String getPostBodyQueryReplacementToken() {
                return this.postBodyQueryReplacementToken_;
            }

            public ByteString getPostBodyQueryReplacementTokenBytes() {
                return ByteString.copyFromUtf8(this.postBodyQueryReplacementToken_);
            }

            @Deprecated
            public Map<String, String> getResponseResultItemKeyPathMapping() {
                return getResponseResultItemKeyPathMappingMap();
            }

            public int getResponseResultItemKeyPathMappingCount() {
                return internalGetResponseResultItemKeyPathMapping().size();
            }

            public Map<String, String> getResponseResultItemKeyPathMappingMap() {
                return Collections.unmodifiableMap(internalGetResponseResultItemKeyPathMapping());
            }

            public String getResponseResultItemKeyPathMappingOrDefault(String str, String str2) {
                str.getClass();
                MapFieldLite<String, String> internalGetResponseResultItemKeyPathMapping = internalGetResponseResultItemKeyPathMapping();
                return internalGetResponseResultItemKeyPathMapping.containsKey(str) ? internalGetResponseResultItemKeyPathMapping.get(str) : str2;
            }

            public String getResponseResultItemKeyPathMappingOrThrow(String str) {
                str.getClass();
                MapFieldLite<String, String> internalGetResponseResultItemKeyPathMapping = internalGetResponseResultItemKeyPathMapping();
                if (internalGetResponseResultItemKeyPathMapping.containsKey(str)) {
                    return internalGetResponseResultItemKeyPathMapping.get(str);
                }
                throw new IllegalArgumentException();
            }

            public String getResponseResultsJsonKey() {
                return this.responseResultsJsonKey_;
            }

            public ByteString getResponseResultsJsonKeyBytes() {
                return ByteString.copyFromUtf8(this.responseResultsJsonKey_);
            }

            public String getUrlPath() {
                return this.urlPath_;
            }

            public ByteString getUrlPathBytes() {
                return ByteString.copyFromUtf8(this.urlPath_);
            }

            public static a newBuilder(SearchAPI searchAPI) {
                return DEFAULT_INSTANCE.createBuilder(searchAPI);
            }

            public static SearchAPI parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SearchAPI) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SearchAPI parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SearchAPI parseFrom(ByteString byteString) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SearchAPI parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SearchAPI parseFrom(byte[] bArr) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SearchAPI parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SearchAPI parseFrom(InputStream inputStream) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SearchAPI parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SearchAPI parseFrom(CodedInputStream codedInputStream) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SearchAPI parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SearchAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
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
        public void addAllHorizontalInitialItems(Iterable<? extends Common$ListItem> iterable) {
            ensureHorizontalInitialItemsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.horizontalInitialItems_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllInitialItems(Iterable<? extends Common$ListItem> iterable) {
            ensureInitialItemsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.initialItems_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOnSubmitOverrideItems(Iterable<String> iterable) {
            ensureOnSubmitOverrideItemsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.onSubmitOverrideItems_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addHorizontalInitialItems(Common$ListItem common$ListItem) {
            common$ListItem.getClass();
            ensureHorizontalInitialItemsIsMutable();
            this.horizontalInitialItems_.add(common$ListItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addInitialItems(Common$ListItem common$ListItem) {
            common$ListItem.getClass();
            ensureInitialItemsIsMutable();
            this.initialItems_.add(common$ListItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOnSubmitOverrideItems(String str) {
            str.getClass();
            ensureOnSubmitOverrideItemsIsMutable();
            this.onSubmitOverrideItems_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOnSubmitOverrideItemsBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureOnSubmitOverrideItemsIsMutable();
            this.onSubmitOverrideItems_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndOfResultsButton() {
            this.endOfResultsButton_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndOfResultsButtonText() {
            this.endOfResultsButtonText_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEvents() {
            this.events_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHorizontalInitialItems() {
            this.horizontalInitialItems_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHorizontalItemHeader() {
            this.horizontalItemHeader_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitialItemHeader() {
            this.initialItemHeader_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitialItems() {
            this.initialItems_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOnSubmitOverrideItems() {
            this.onSubmitOverrideItems_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlaceholder() {
            this.placeholder_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSearchApi() {
            this.searchApi_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSearchBehavior() {
            this.searchBehavior_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSearchNoResults() {
            this.searchNoResults_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSearchNoResultsButton() {
            this.searchNoResultsButton_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowNoResultsHeader() {
            this.showNoResultsHeader_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = null;
        }

        private void ensureHorizontalInitialItemsIsMutable() {
            Internal.ProtobufList<Common$ListItem> protobufList = this.horizontalInitialItems_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.horizontalInitialItems_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureInitialItemsIsMutable() {
            Internal.ProtobufList<Common$ListItem> protobufList = this.initialItems_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.initialItems_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureOnSubmitOverrideItemsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.onSubmitOverrideItems_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.onSubmitOverrideItems_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEndOfResultsButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.endOfResultsButton_;
            if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
                this.endOfResultsButton_ = Common$ButtonContent.newBuilder(this.endOfResultsButton_).mergeFrom((Common$ButtonContent.a) common$ButtonContent).buildPartial();
            } else {
                this.endOfResultsButton_ = common$ButtonContent;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEndOfResultsButtonText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.endOfResultsButtonText_;
            if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
                this.endOfResultsButtonText_ = Common$AttributedLocalizedString.newBuilder(this.endOfResultsButtonText_).mergeFrom((Common$AttributedLocalizedString.b) common$AttributedLocalizedString).buildPartial();
            } else {
                this.endOfResultsButtonText_ = common$AttributedLocalizedString;
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
        public void mergeHorizontalItemHeader(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.horizontalItemHeader_;
            if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                this.horizontalItemHeader_ = Common$LocalizedString.newBuilder(this.horizontalItemHeader_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
            } else {
                this.horizontalItemHeader_ = common$LocalizedString;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitialItemHeader(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.initialItemHeader_;
            if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                this.initialItemHeader_ = Common$LocalizedString.newBuilder(this.initialItemHeader_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
            } else {
                this.initialItemHeader_ = common$LocalizedString;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePlaceholder(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.placeholder_;
            if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                this.placeholder_ = Common$LocalizedString.newBuilder(this.placeholder_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
            } else {
                this.placeholder_ = common$LocalizedString;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSearchApi(SearchAPI searchAPI) {
            searchAPI.getClass();
            SearchAPI searchAPI2 = this.searchApi_;
            if (searchAPI2 != null && searchAPI2 != SearchAPI.getDefaultInstance()) {
                this.searchApi_ = SearchAPI.newBuilder(this.searchApi_).mergeFrom((SearchAPI.a) searchAPI).buildPartial();
            } else {
                this.searchApi_ = searchAPI;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSearchNoResults(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.searchNoResults_;
            if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                this.searchNoResults_ = Common$LocalizedString.newBuilder(this.searchNoResults_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
            } else {
                this.searchNoResults_ = common$LocalizedString;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSearchNoResultsButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.searchNoResultsButton_;
            if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
                this.searchNoResultsButton_ = Common$ButtonContent.newBuilder(this.searchNoResultsButton_).mergeFrom((Common$ButtonContent.a) common$ButtonContent).buildPartial();
            } else {
                this.searchNoResultsButton_ = common$ButtonContent;
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
        public void removeHorizontalInitialItems(int i11) {
            ensureHorizontalInitialItemsIsMutable();
            this.horizontalInitialItems_.remove(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeInitialItems(int i11) {
            ensureInitialItemsIsMutable();
            this.initialItems_.remove(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndOfResultsButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.endOfResultsButton_ = common$ButtonContent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndOfResultsButtonText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.endOfResultsButtonText_ = common$AttributedLocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHorizontalInitialItems(int i11, Common$ListItem common$ListItem) {
            common$ListItem.getClass();
            ensureHorizontalInitialItemsIsMutable();
            this.horizontalInitialItems_.set(i11, common$ListItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHorizontalItemHeader(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.horizontalItemHeader_ = common$LocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitialItemHeader(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.initialItemHeader_ = common$LocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitialItems(int i11, Common$ListItem common$ListItem) {
            common$ListItem.getClass();
            ensureInitialItemsIsMutable();
            this.initialItems_.set(i11, common$ListItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOnSubmitOverrideItems(int i11, String str) {
            str.getClass();
            ensureOnSubmitOverrideItemsIsMutable();
            this.onSubmitOverrideItems_.set(i11, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlaceholder(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.placeholder_ = common$LocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSearchApi(SearchAPI searchAPI) {
            searchAPI.getClass();
            this.searchApi_ = searchAPI;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSearchBehavior(j1 j1Var) {
            this.searchBehavior_ = j1Var.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSearchBehaviorValue(int i11) {
            this.searchBehavior_ = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSearchNoResults(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.searchNoResults_ = common$LocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSearchNoResultsButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.searchNoResultsButton_ = common$ButtonContent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowNoResultsHeader(boolean z11) {
            this.showNoResultsHeader_ = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.title_ = common$LocalizedString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (k.f18899a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u0015\u000f\u0000\u0003\u0000\u0001\u001b\u0002\t\u0003\t\u0004\t\u0005\t\f\t\rȚ\u000e\t\u000f\t\u0010\t\u0011\u001b\u0012\t\u0013\t\u0014\u0007\u0015\f", new Object[]{"initialItems_", Common$ListItem.class, "searchApi_", "title_", "searchNoResults_", "searchNoResultsButton_", "events_", "onSubmitOverrideItems_", "endOfResultsButton_", "endOfResultsButtonText_", "placeholder_", "horizontalInitialItems_", Common$ListItem.class, "initialItemHeader_", "horizontalItemHeader_", "showNoResultsHeader_", "searchBehavior_"});
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

        public Common$ButtonContent getEndOfResultsButton() {
            Common$ButtonContent common$ButtonContent = this.endOfResultsButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$AttributedLocalizedString getEndOfResultsButtonText() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.endOfResultsButtonText_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public Common$ListItem getHorizontalInitialItems(int i11) {
            return this.horizontalInitialItems_.get(i11);
        }

        public int getHorizontalInitialItemsCount() {
            return this.horizontalInitialItems_.size();
        }

        public List<Common$ListItem> getHorizontalInitialItemsList() {
            return this.horizontalInitialItems_;
        }

        public h1 getHorizontalInitialItemsOrBuilder(int i11) {
            return this.horizontalInitialItems_.get(i11);
        }

        public List<? extends h1> getHorizontalInitialItemsOrBuilderList() {
            return this.horizontalInitialItems_;
        }

        public Common$LocalizedString getHorizontalItemHeader() {
            Common$LocalizedString common$LocalizedString = this.horizontalItemHeader_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$LocalizedString getInitialItemHeader() {
            Common$LocalizedString common$LocalizedString = this.initialItemHeader_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$ListItem getInitialItems(int i11) {
            return this.initialItems_.get(i11);
        }

        public int getInitialItemsCount() {
            return this.initialItems_.size();
        }

        public List<Common$ListItem> getInitialItemsList() {
            return this.initialItems_;
        }

        public h1 getInitialItemsOrBuilder(int i11) {
            return this.initialItems_.get(i11);
        }

        public List<? extends h1> getInitialItemsOrBuilderList() {
            return this.initialItems_;
        }

        public String getOnSubmitOverrideItems(int i11) {
            return this.onSubmitOverrideItems_.get(i11);
        }

        public ByteString getOnSubmitOverrideItemsBytes(int i11) {
            return ByteString.copyFromUtf8(this.onSubmitOverrideItems_.get(i11));
        }

        public int getOnSubmitOverrideItemsCount() {
            return this.onSubmitOverrideItems_.size();
        }

        public List<String> getOnSubmitOverrideItemsList() {
            return this.onSubmitOverrideItems_;
        }

        public Common$LocalizedString getPlaceholder() {
            Common$LocalizedString common$LocalizedString = this.placeholder_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public SearchAPI getSearchApi() {
            SearchAPI searchAPI = this.searchApi_;
            return searchAPI == null ? SearchAPI.getDefaultInstance() : searchAPI;
        }

        public j1 getSearchBehavior() {
            j1 forNumber = j1.forNumber(this.searchBehavior_);
            return forNumber == null ? j1.UNRECOGNIZED : forNumber;
        }

        public int getSearchBehaviorValue() {
            return this.searchBehavior_;
        }

        public Common$LocalizedString getSearchNoResults() {
            Common$LocalizedString common$LocalizedString = this.searchNoResults_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$ButtonContent getSearchNoResultsButton() {
            Common$ButtonContent common$ButtonContent = this.searchNoResultsButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public boolean getShowNoResultsHeader() {
            return this.showNoResultsHeader_;
        }

        public Common$LocalizedString getTitle() {
            Common$LocalizedString common$LocalizedString = this.title_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public boolean hasEndOfResultsButton() {
            return this.endOfResultsButton_ != null;
        }

        public boolean hasEndOfResultsButtonText() {
            return this.endOfResultsButtonText_ != null;
        }

        public boolean hasEvents() {
            return this.events_ != null;
        }

        public boolean hasHorizontalItemHeader() {
            return this.horizontalItemHeader_ != null;
        }

        public boolean hasInitialItemHeader() {
            return this.initialItemHeader_ != null;
        }

        public boolean hasPlaceholder() {
            return this.placeholder_ != null;
        }

        public boolean hasSearchApi() {
            return this.searchApi_ != null;
        }

        public boolean hasSearchNoResults() {
            return this.searchNoResults_ != null;
        }

        public boolean hasSearchNoResultsButton() {
            return this.searchNoResultsButton_ != null;
        }

        public boolean hasTitle() {
            return this.title_ != null;
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

        /* JADX INFO: Access modifiers changed from: private */
        public void addHorizontalInitialItems(int i11, Common$ListItem common$ListItem) {
            common$ListItem.getClass();
            ensureHorizontalInitialItemsIsMutable();
            this.horizontalInitialItems_.add(i11, common$ListItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addInitialItems(int i11, Common$ListItem common$ListItem) {
            common$ListItem.getClass();
            ensureInitialItemsIsMutable();
            this.initialItems_.add(i11, common$ListItem);
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
    public static final class a extends GeneratedMessageLite.Builder<BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane, a> implements MessageLiteOrBuilder {
        public a() {
            super(BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.DEFAULT_INSTANCE);
        }
    }

    static {
        BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane betaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane = new BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane();
        DEFAULT_INSTANCE = betaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane;
        GeneratedMessageLite.registerDefaultInstance(BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.class, betaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane);
    }

    private BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane() {
    }

    public static BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane parseDelimitedFrom(InputStream inputStream) {
        return (BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane parseFrom(ByteBuffer byteBuffer) {
        return (BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (k.f18899a[methodToInvoke.ordinal()]) {
            case 1:
                return new BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane> parser = PARSER;
                if (parser == null) {
                    synchronized (BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.class) {
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

    public static a newBuilder(BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane betaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane) {
        return DEFAULT_INSTANCE.createBuilder(betaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane);
    }

    public static BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane parseFrom(ByteString byteString) {
        return (BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane parseFrom(byte[] bArr) {
        return (BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane parseFrom(InputStream inputStream) {
        return (BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane parseFrom(CodedInputStream codedInputStream) {
        return (BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}