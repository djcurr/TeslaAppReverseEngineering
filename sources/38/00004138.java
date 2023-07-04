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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FileUploadValidation;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.l;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class BetaUpload$BetaUploadPane extends GeneratedMessageLite<BetaUpload$BetaUploadPane, a> implements MessageLiteOrBuilder {
    private static final BetaUpload$BetaUploadPane DEFAULT_INSTANCE;
    private static volatile Parser<BetaUpload$BetaUploadPane> PARSER;

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
                switch (l.f18950a[methodToInvoke.ordinal()]) {
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
            public static final int SUCCESS_FIELD_NUMBER = 1;
            private boolean success_;

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
            public void clearSuccess() {
                this.success_ = false;
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
            public void setSuccess(boolean z11) {
                this.success_ = z11;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (l.f18950a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubmitAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"success_"});
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

            public boolean getSuccess() {
                return this.success_;
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
            public final int f18322a;

            a(int i11) {
                this.f18322a = i11;
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
                return this.f18322a;
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
            switch (l.f18950a[methodToInvoke.ordinal()]) {
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
        public static final int EVENTS_FIELD_NUMBER = 8;
        public static final int FILE_TYPES_FIELD_NUMBER = 1;
        public static final int FILE_TYPE_SELECTION_CONTENT_FIELD_NUMBER = 4;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int PICKER_CONTENT_FIELD_NUMBER = 2;
        public static final int UPLOADING_STATUS_TEXT_FIELD_NUMBER = 6;
        public static final int UPLOAD_FORM_API_FIELD_NUMBER = 7;
        public static final int VALIDATION_ERROR_CONTENT_FIELD_NUMBER = 3;
        public static final int VERIFY_CONTENT_FIELD_NUMBER = 5;
        private Events events_;
        private FileTypeSelectionContent fileTypeSelectionContent_;
        private FilePickerContent pickerContent_;
        private Object uploadApi_;
        private Common$LocalizedString uploadingStatusText_;
        private ValidationErrorContent validationErrorContent_;
        private VerifyContent verifyContent_;
        private int uploadApiCase_ = 0;
        private Internal.ProtobufList<FileType> fileTypes_ = GeneratedMessageLite.emptyProtobufList();

        /* loaded from: classes2.dex */
        public static final class Events extends GeneratedMessageLite<Events, a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_SUBMIT_ERROR_FIELD_NUMBER = 4;
            public static final int ON_SUBMIT_FIELD_NUMBER = 2;
            public static final int ON_SUBMIT_SUCCESS_FIELD_NUMBER = 3;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Common$SDKEvent onSubmitError_;
            private Common$SDKEvent onSubmitSuccess_;
            private Common$SDKEvent onSubmit_;

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
            public void clearOnSubmit() {
                this.onSubmit_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnSubmitError() {
                this.onSubmitError_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnSubmitSuccess() {
                this.onSubmitSuccess_ = null;
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
            public void mergeOnSubmitError(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onSubmitError_;
                if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
                    this.onSubmitError_ = Common$SDKEvent.newBuilder(this.onSubmitError_).mergeFrom((Common$SDKEvent.a) common$SDKEvent).buildPartial();
                } else {
                    this.onSubmitError_ = common$SDKEvent;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeOnSubmitSuccess(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onSubmitSuccess_;
                if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
                    this.onSubmitSuccess_ = Common$SDKEvent.newBuilder(this.onSubmitSuccess_).mergeFrom((Common$SDKEvent.a) common$SDKEvent).buildPartial();
                } else {
                    this.onSubmitSuccess_ = common$SDKEvent;
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
            public void setOnSubmit(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSubmit_ = common$SDKEvent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnSubmitError(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSubmitError_ = common$SDKEvent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnSubmitSuccess(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSubmitSuccess_ = common$SDKEvent;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (l.f18950a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t\u0004\t", new Object[]{"onAppear_", Common$SDKEvent.class, "onSubmit_", "onSubmitSuccess_", "onSubmitError_"});
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

            public Common$SDKEvent getOnSubmit() {
                Common$SDKEvent common$SDKEvent = this.onSubmit_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnSubmitError() {
                Common$SDKEvent common$SDKEvent = this.onSubmitError_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnSubmitSuccess() {
                Common$SDKEvent common$SDKEvent = this.onSubmitSuccess_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public boolean hasOnSubmit() {
                return this.onSubmit_ != null;
            }

            public boolean hasOnSubmitError() {
                return this.onSubmitError_ != null;
            }

            public boolean hasOnSubmitSuccess() {
                return this.onSubmitSuccess_ != null;
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
        public static final class FilePickerContent extends GeneratedMessageLite<FilePickerContent, a> implements MessageLiteOrBuilder {
            public static final int ADD_FILE_BUTTON_FIELD_NUMBER = 4;
            public static final int CONTENT_FIELD_NUMBER = 3;
            public static final int CONTINUE_BUTTON_FIELD_NUMBER = 5;
            private static final FilePickerContent DEFAULT_INSTANCE;
            public static final int HEADER_ASSET_FIELD_NUMBER = 1;
            public static final int HEADER_FIELD_NUMBER = 2;
            private static volatile Parser<FilePickerContent> PARSER;
            private Common$ButtonContent addFileButton_;
            private Common$LocalizedString content_;
            private Common$ButtonContent continueButton_;
            private Common$RenderedAssetAppearance headerAsset_;
            private Common$LocalizedString header_;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<FilePickerContent, a> implements MessageLiteOrBuilder {
                public a() {
                    super(FilePickerContent.DEFAULT_INSTANCE);
                }
            }

            static {
                FilePickerContent filePickerContent = new FilePickerContent();
                DEFAULT_INSTANCE = filePickerContent;
                GeneratedMessageLite.registerDefaultInstance(FilePickerContent.class, filePickerContent);
            }

            private FilePickerContent() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAddFileButton() {
                this.addFileButton_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearContent() {
                this.content_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearContinueButton() {
                this.continueButton_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearHeader() {
                this.header_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearHeaderAsset() {
                this.headerAsset_ = null;
            }

            public static FilePickerContent getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAddFileButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.addFileButton_;
                if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
                    this.addFileButton_ = Common$ButtonContent.newBuilder(this.addFileButton_).mergeFrom((Common$ButtonContent.a) common$ButtonContent).buildPartial();
                } else {
                    this.addFileButton_ = common$ButtonContent;
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
            public void mergeContinueButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.continueButton_;
                if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
                    this.continueButton_ = Common$ButtonContent.newBuilder(this.continueButton_).mergeFrom((Common$ButtonContent.a) common$ButtonContent).buildPartial();
                } else {
                    this.continueButton_ = common$ButtonContent;
                }
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

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeHeaderAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.headerAsset_;
                if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
                    this.headerAsset_ = Common$RenderedAssetAppearance.newBuilder(this.headerAsset_).mergeFrom((Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
                } else {
                    this.headerAsset_ = common$RenderedAssetAppearance;
                }
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static FilePickerContent parseDelimitedFrom(InputStream inputStream) {
                return (FilePickerContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static FilePickerContent parseFrom(ByteBuffer byteBuffer) {
                return (FilePickerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<FilePickerContent> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAddFileButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.addFileButton_ = common$ButtonContent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setContent(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.content_ = common$LocalizedString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setContinueButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.continueButton_ = common$ButtonContent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setHeader(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.header_ = common$LocalizedString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setHeaderAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                this.headerAsset_ = common$RenderedAssetAppearance;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (l.f18950a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new FilePickerContent();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t", new Object[]{"headerAsset_", "header_", "content_", "addFileButton_", "continueButton_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<FilePickerContent> parser = PARSER;
                        if (parser == null) {
                            synchronized (FilePickerContent.class) {
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

            public Common$ButtonContent getAddFileButton() {
                Common$ButtonContent common$ButtonContent = this.addFileButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public Common$LocalizedString getContent() {
                Common$LocalizedString common$LocalizedString = this.content_;
                return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public Common$ButtonContent getContinueButton() {
                Common$ButtonContent common$ButtonContent = this.continueButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public Common$LocalizedString getHeader() {
                Common$LocalizedString common$LocalizedString = this.header_;
                return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public Common$RenderedAssetAppearance getHeaderAsset() {
                Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.headerAsset_;
                return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
            }

            public boolean hasAddFileButton() {
                return this.addFileButton_ != null;
            }

            public boolean hasContent() {
                return this.content_ != null;
            }

            public boolean hasContinueButton() {
                return this.continueButton_ != null;
            }

            public boolean hasHeader() {
                return this.header_ != null;
            }

            public boolean hasHeaderAsset() {
                return this.headerAsset_ != null;
            }

            public static a newBuilder(FilePickerContent filePickerContent) {
                return DEFAULT_INSTANCE.createBuilder(filePickerContent);
            }

            public static FilePickerContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FilePickerContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static FilePickerContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (FilePickerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static FilePickerContent parseFrom(ByteString byteString) {
                return (FilePickerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static FilePickerContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (FilePickerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static FilePickerContent parseFrom(byte[] bArr) {
                return (FilePickerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static FilePickerContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (FilePickerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static FilePickerContent parseFrom(InputStream inputStream) {
                return (FilePickerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static FilePickerContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FilePickerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static FilePickerContent parseFrom(CodedInputStream codedInputStream) {
                return (FilePickerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static FilePickerContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FilePickerContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class FileType extends GeneratedMessageLite<FileType, a> implements b {
            private static final FileType DEFAULT_INSTANCE;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int NAME_FIELD_NUMBER = 2;
            private static volatile Parser<FileType> PARSER = null;
            public static final int VALIDATION_FIELD_NUMBER = 4;
            private String id_ = "";
            private Common$LocalizedString name_;
            private Common$FileUploadValidation validation_;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<FileType, a> implements b {
                public a() {
                    super(FileType.DEFAULT_INSTANCE);
                }
            }

            static {
                FileType fileType = new FileType();
                DEFAULT_INSTANCE = fileType;
                GeneratedMessageLite.registerDefaultInstance(FileType.class, fileType);
            }

            private FileType() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearId() {
                this.id_ = getDefaultInstance().getId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearName() {
                this.name_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearValidation() {
                this.validation_ = null;
            }

            public static FileType getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeName(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                Common$LocalizedString common$LocalizedString2 = this.name_;
                if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                    this.name_ = Common$LocalizedString.newBuilder(this.name_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
                } else {
                    this.name_ = common$LocalizedString;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeValidation(Common$FileUploadValidation common$FileUploadValidation) {
                common$FileUploadValidation.getClass();
                Common$FileUploadValidation common$FileUploadValidation2 = this.validation_;
                if (common$FileUploadValidation2 != null && common$FileUploadValidation2 != Common$FileUploadValidation.getDefaultInstance()) {
                    this.validation_ = Common$FileUploadValidation.newBuilder(this.validation_).mergeFrom((Common$FileUploadValidation.a) common$FileUploadValidation).buildPartial();
                } else {
                    this.validation_ = common$FileUploadValidation;
                }
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static FileType parseDelimitedFrom(InputStream inputStream) {
                return (FileType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static FileType parseFrom(ByteBuffer byteBuffer) {
                return (FileType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<FileType> parser() {
                return DEFAULT_INSTANCE.getParserForType();
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
            public void setName(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.name_ = common$LocalizedString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setValidation(Common$FileUploadValidation common$FileUploadValidation) {
                common$FileUploadValidation.getClass();
                this.validation_ = common$FileUploadValidation;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (l.f18950a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new FileType();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0004\t", new Object[]{"id_", "name_", "validation_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<FileType> parser = PARSER;
                        if (parser == null) {
                            synchronized (FileType.class) {
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

            public String getId() {
                return this.id_;
            }

            public ByteString getIdBytes() {
                return ByteString.copyFromUtf8(this.id_);
            }

            public Common$LocalizedString getName() {
                Common$LocalizedString common$LocalizedString = this.name_;
                return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public Common$FileUploadValidation getValidation() {
                Common$FileUploadValidation common$FileUploadValidation = this.validation_;
                return common$FileUploadValidation == null ? Common$FileUploadValidation.getDefaultInstance() : common$FileUploadValidation;
            }

            public boolean hasName() {
                return this.name_ != null;
            }

            public boolean hasValidation() {
                return this.validation_ != null;
            }

            public static a newBuilder(FileType fileType) {
                return DEFAULT_INSTANCE.createBuilder(fileType);
            }

            public static FileType parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FileType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static FileType parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (FileType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static FileType parseFrom(ByteString byteString) {
                return (FileType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static FileType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (FileType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static FileType parseFrom(byte[] bArr) {
                return (FileType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static FileType parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (FileType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static FileType parseFrom(InputStream inputStream) {
                return (FileType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static FileType parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FileType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static FileType parseFrom(CodedInputStream codedInputStream) {
                return (FileType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static FileType parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FileType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class FileTypeSelectionContent extends GeneratedMessageLite<FileTypeSelectionContent, a> implements MessageLiteOrBuilder {
            public static final int CONTENT_FIELD_NUMBER = 3;
            private static final FileTypeSelectionContent DEFAULT_INSTANCE;
            public static final int HEADER_ASSET_FIELD_NUMBER = 1;
            public static final int HEADER_FIELD_NUMBER = 2;
            public static final int NEXT_BUTTON_FIELD_NUMBER = 4;
            private static volatile Parser<FileTypeSelectionContent> PARSER;
            private Common$LocalizedString content_;
            private Common$RenderedAssetAppearance headerAsset_;
            private Common$LocalizedString header_;
            private Common$ButtonContent nextButton_;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<FileTypeSelectionContent, a> implements MessageLiteOrBuilder {
                public a() {
                    super(FileTypeSelectionContent.DEFAULT_INSTANCE);
                }
            }

            static {
                FileTypeSelectionContent fileTypeSelectionContent = new FileTypeSelectionContent();
                DEFAULT_INSTANCE = fileTypeSelectionContent;
                GeneratedMessageLite.registerDefaultInstance(FileTypeSelectionContent.class, fileTypeSelectionContent);
            }

            private FileTypeSelectionContent() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearContent() {
                this.content_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearHeader() {
                this.header_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearHeaderAsset() {
                this.headerAsset_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNextButton() {
                this.nextButton_ = null;
            }

            public static FileTypeSelectionContent getDefaultInstance() {
                return DEFAULT_INSTANCE;
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
            public void mergeHeader(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                Common$LocalizedString common$LocalizedString2 = this.header_;
                if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                    this.header_ = Common$LocalizedString.newBuilder(this.header_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
                } else {
                    this.header_ = common$LocalizedString;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeHeaderAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.headerAsset_;
                if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
                    this.headerAsset_ = Common$RenderedAssetAppearance.newBuilder(this.headerAsset_).mergeFrom((Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
                } else {
                    this.headerAsset_ = common$RenderedAssetAppearance;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeNextButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.nextButton_;
                if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
                    this.nextButton_ = Common$ButtonContent.newBuilder(this.nextButton_).mergeFrom((Common$ButtonContent.a) common$ButtonContent).buildPartial();
                } else {
                    this.nextButton_ = common$ButtonContent;
                }
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static FileTypeSelectionContent parseDelimitedFrom(InputStream inputStream) {
                return (FileTypeSelectionContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static FileTypeSelectionContent parseFrom(ByteBuffer byteBuffer) {
                return (FileTypeSelectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<FileTypeSelectionContent> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setContent(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.content_ = common$LocalizedString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setHeader(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.header_ = common$LocalizedString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setHeaderAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                this.headerAsset_ = common$RenderedAssetAppearance;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNextButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.nextButton_ = common$ButtonContent;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (l.f18950a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new FileTypeSelectionContent();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[]{"headerAsset_", "header_", "content_", "nextButton_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<FileTypeSelectionContent> parser = PARSER;
                        if (parser == null) {
                            synchronized (FileTypeSelectionContent.class) {
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

            public Common$LocalizedString getContent() {
                Common$LocalizedString common$LocalizedString = this.content_;
                return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public Common$LocalizedString getHeader() {
                Common$LocalizedString common$LocalizedString = this.header_;
                return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public Common$RenderedAssetAppearance getHeaderAsset() {
                Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.headerAsset_;
                return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
            }

            public Common$ButtonContent getNextButton() {
                Common$ButtonContent common$ButtonContent = this.nextButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public boolean hasContent() {
                return this.content_ != null;
            }

            public boolean hasHeader() {
                return this.header_ != null;
            }

            public boolean hasHeaderAsset() {
                return this.headerAsset_ != null;
            }

            public boolean hasNextButton() {
                return this.nextButton_ != null;
            }

            public static a newBuilder(FileTypeSelectionContent fileTypeSelectionContent) {
                return DEFAULT_INSTANCE.createBuilder(fileTypeSelectionContent);
            }

            public static FileTypeSelectionContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FileTypeSelectionContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static FileTypeSelectionContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (FileTypeSelectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static FileTypeSelectionContent parseFrom(ByteString byteString) {
                return (FileTypeSelectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static FileTypeSelectionContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (FileTypeSelectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static FileTypeSelectionContent parseFrom(byte[] bArr) {
                return (FileTypeSelectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static FileTypeSelectionContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (FileTypeSelectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static FileTypeSelectionContent parseFrom(InputStream inputStream) {
                return (FileTypeSelectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static FileTypeSelectionContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FileTypeSelectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static FileTypeSelectionContent parseFrom(CodedInputStream codedInputStream) {
                return (FileTypeSelectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static FileTypeSelectionContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FileTypeSelectionContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class UploadFormAPI extends GeneratedMessageLite<UploadFormAPI, a> implements MessageLiteOrBuilder {
            private static final UploadFormAPI DEFAULT_INSTANCE;
            public static final int FORM_DATA_FIELD_NUMBER = 2;
            public static final int FORM_DATA_FILE_KEY_FIELD_NUMBER = 3;
            public static final int FORM_DATA_FILE_TYPE_ID_KEY_FIELD_NUMBER = 4;
            private static volatile Parser<UploadFormAPI> PARSER = null;
            public static final int URL_PATH_FIELD_NUMBER = 1;
            private MapFieldLite<String, String> formData_ = MapFieldLite.emptyMapField();
            private String urlPath_ = "";
            private String formDataFileKey_ = "";
            private String formDataFileTypeIdKey_ = "";

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<UploadFormAPI, a> implements MessageLiteOrBuilder {
                public a() {
                    super(UploadFormAPI.DEFAULT_INSTANCE);
                }
            }

            /* loaded from: classes2.dex */
            public static final class b {

                /* renamed from: a  reason: collision with root package name */
                public static final MapEntryLite<String, String> f18323a;

                static {
                    WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                    f18323a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
                }
            }

            static {
                UploadFormAPI uploadFormAPI = new UploadFormAPI();
                DEFAULT_INSTANCE = uploadFormAPI;
                GeneratedMessageLite.registerDefaultInstance(UploadFormAPI.class, uploadFormAPI);
            }

            private UploadFormAPI() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearFormDataFileKey() {
                this.formDataFileKey_ = getDefaultInstance().getFormDataFileKey();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearFormDataFileTypeIdKey() {
                this.formDataFileTypeIdKey_ = getDefaultInstance().getFormDataFileTypeIdKey();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUrlPath() {
                this.urlPath_ = getDefaultInstance().getUrlPath();
            }

            public static UploadFormAPI getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public Map<String, String> getMutableFormDataMap() {
                return internalGetMutableFormData();
            }

            private MapFieldLite<String, String> internalGetFormData() {
                return this.formData_;
            }

            private MapFieldLite<String, String> internalGetMutableFormData() {
                if (!this.formData_.isMutable()) {
                    this.formData_ = this.formData_.mutableCopy();
                }
                return this.formData_;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static UploadFormAPI parseDelimitedFrom(InputStream inputStream) {
                return (UploadFormAPI) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static UploadFormAPI parseFrom(ByteBuffer byteBuffer) {
                return (UploadFormAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<UploadFormAPI> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setFormDataFileKey(String str) {
                str.getClass();
                this.formDataFileKey_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setFormDataFileKeyBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.formDataFileKey_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setFormDataFileTypeIdKey(String str) {
                str.getClass();
                this.formDataFileTypeIdKey_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setFormDataFileTypeIdKeyBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.formDataFileTypeIdKey_ = byteString.toStringUtf8();
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

            public boolean containsFormData(String str) {
                str.getClass();
                return internalGetFormData().containsKey(str);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (l.f18950a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new UploadFormAPI();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003Ȉ\u0004Ȉ", new Object[]{"urlPath_", "formData_", b.f18323a, "formDataFileKey_", "formDataFileTypeIdKey_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<UploadFormAPI> parser = PARSER;
                        if (parser == null) {
                            synchronized (UploadFormAPI.class) {
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
            public Map<String, String> getFormData() {
                return getFormDataMap();
            }

            public int getFormDataCount() {
                return internalGetFormData().size();
            }

            public String getFormDataFileKey() {
                return this.formDataFileKey_;
            }

            public ByteString getFormDataFileKeyBytes() {
                return ByteString.copyFromUtf8(this.formDataFileKey_);
            }

            public String getFormDataFileTypeIdKey() {
                return this.formDataFileTypeIdKey_;
            }

            public ByteString getFormDataFileTypeIdKeyBytes() {
                return ByteString.copyFromUtf8(this.formDataFileTypeIdKey_);
            }

            public Map<String, String> getFormDataMap() {
                return Collections.unmodifiableMap(internalGetFormData());
            }

            public String getFormDataOrDefault(String str, String str2) {
                str.getClass();
                MapFieldLite<String, String> internalGetFormData = internalGetFormData();
                return internalGetFormData.containsKey(str) ? internalGetFormData.get(str) : str2;
            }

            public String getFormDataOrThrow(String str) {
                str.getClass();
                MapFieldLite<String, String> internalGetFormData = internalGetFormData();
                if (internalGetFormData.containsKey(str)) {
                    return internalGetFormData.get(str);
                }
                throw new IllegalArgumentException();
            }

            public String getUrlPath() {
                return this.urlPath_;
            }

            public ByteString getUrlPathBytes() {
                return ByteString.copyFromUtf8(this.urlPath_);
            }

            public static a newBuilder(UploadFormAPI uploadFormAPI) {
                return DEFAULT_INSTANCE.createBuilder(uploadFormAPI);
            }

            public static UploadFormAPI parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (UploadFormAPI) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static UploadFormAPI parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (UploadFormAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static UploadFormAPI parseFrom(ByteString byteString) {
                return (UploadFormAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static UploadFormAPI parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (UploadFormAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static UploadFormAPI parseFrom(byte[] bArr) {
                return (UploadFormAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static UploadFormAPI parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (UploadFormAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static UploadFormAPI parseFrom(InputStream inputStream) {
                return (UploadFormAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static UploadFormAPI parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (UploadFormAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static UploadFormAPI parseFrom(CodedInputStream codedInputStream) {
                return (UploadFormAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static UploadFormAPI parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (UploadFormAPI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class ValidationErrorContent extends GeneratedMessageLite<ValidationErrorContent, a> implements MessageLiteOrBuilder {
            public static final int ADD_FILE_BUTTON_FIELD_NUMBER = 3;
            public static final int CANCEL_BUTTON_FIELD_NUMBER = 4;
            private static final ValidationErrorContent DEFAULT_INSTANCE;
            public static final int ERROR_ASSET_FIELD_NUMBER = 1;
            public static final int ERROR_HEADER_FIELD_NUMBER = 2;
            private static volatile Parser<ValidationErrorContent> PARSER;
            private Common$ButtonContent addFileButton_;
            private Common$ButtonContent cancelButton_;
            private Common$RenderedAssetAppearance errorAsset_;
            private Common$LocalizedString errorHeader_;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<ValidationErrorContent, a> implements MessageLiteOrBuilder {
                public a() {
                    super(ValidationErrorContent.DEFAULT_INSTANCE);
                }
            }

            static {
                ValidationErrorContent validationErrorContent = new ValidationErrorContent();
                DEFAULT_INSTANCE = validationErrorContent;
                GeneratedMessageLite.registerDefaultInstance(ValidationErrorContent.class, validationErrorContent);
            }

            private ValidationErrorContent() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAddFileButton() {
                this.addFileButton_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCancelButton() {
                this.cancelButton_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearErrorAsset() {
                this.errorAsset_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearErrorHeader() {
                this.errorHeader_ = null;
            }

            public static ValidationErrorContent getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAddFileButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.addFileButton_;
                if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
                    this.addFileButton_ = Common$ButtonContent.newBuilder(this.addFileButton_).mergeFrom((Common$ButtonContent.a) common$ButtonContent).buildPartial();
                } else {
                    this.addFileButton_ = common$ButtonContent;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeCancelButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.cancelButton_;
                if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
                    this.cancelButton_ = Common$ButtonContent.newBuilder(this.cancelButton_).mergeFrom((Common$ButtonContent.a) common$ButtonContent).buildPartial();
                } else {
                    this.cancelButton_ = common$ButtonContent;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeErrorAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.errorAsset_;
                if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
                    this.errorAsset_ = Common$RenderedAssetAppearance.newBuilder(this.errorAsset_).mergeFrom((Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
                } else {
                    this.errorAsset_ = common$RenderedAssetAppearance;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeErrorHeader(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                Common$LocalizedString common$LocalizedString2 = this.errorHeader_;
                if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                    this.errorHeader_ = Common$LocalizedString.newBuilder(this.errorHeader_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
                } else {
                    this.errorHeader_ = common$LocalizedString;
                }
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ValidationErrorContent parseDelimitedFrom(InputStream inputStream) {
                return (ValidationErrorContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ValidationErrorContent parseFrom(ByteBuffer byteBuffer) {
                return (ValidationErrorContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ValidationErrorContent> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAddFileButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.addFileButton_ = common$ButtonContent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCancelButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.cancelButton_ = common$ButtonContent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setErrorAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                this.errorAsset_ = common$RenderedAssetAppearance;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setErrorHeader(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.errorHeader_ = common$LocalizedString;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (l.f18950a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ValidationErrorContent();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[]{"errorAsset_", "errorHeader_", "addFileButton_", "cancelButton_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ValidationErrorContent> parser = PARSER;
                        if (parser == null) {
                            synchronized (ValidationErrorContent.class) {
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

            public Common$ButtonContent getAddFileButton() {
                Common$ButtonContent common$ButtonContent = this.addFileButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public Common$ButtonContent getCancelButton() {
                Common$ButtonContent common$ButtonContent = this.cancelButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public Common$RenderedAssetAppearance getErrorAsset() {
                Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.errorAsset_;
                return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
            }

            public Common$LocalizedString getErrorHeader() {
                Common$LocalizedString common$LocalizedString = this.errorHeader_;
                return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public boolean hasAddFileButton() {
                return this.addFileButton_ != null;
            }

            public boolean hasCancelButton() {
                return this.cancelButton_ != null;
            }

            public boolean hasErrorAsset() {
                return this.errorAsset_ != null;
            }

            public boolean hasErrorHeader() {
                return this.errorHeader_ != null;
            }

            public static a newBuilder(ValidationErrorContent validationErrorContent) {
                return DEFAULT_INSTANCE.createBuilder(validationErrorContent);
            }

            public static ValidationErrorContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ValidationErrorContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ValidationErrorContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ValidationErrorContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ValidationErrorContent parseFrom(ByteString byteString) {
                return (ValidationErrorContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ValidationErrorContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ValidationErrorContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ValidationErrorContent parseFrom(byte[] bArr) {
                return (ValidationErrorContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ValidationErrorContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ValidationErrorContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ValidationErrorContent parseFrom(InputStream inputStream) {
                return (ValidationErrorContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ValidationErrorContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ValidationErrorContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ValidationErrorContent parseFrom(CodedInputStream codedInputStream) {
                return (ValidationErrorContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ValidationErrorContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ValidationErrorContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class VerifyContent extends GeneratedMessageLite<VerifyContent, a> implements MessageLiteOrBuilder {
            public static final int CONTENT_FIELD_NUMBER = 2;
            private static final VerifyContent DEFAULT_INSTANCE;
            public static final int HEADER_ASSET_FIELD_NUMBER = 4;
            public static final int HEADER_FIELD_NUMBER = 1;
            private static volatile Parser<VerifyContent> PARSER = null;
            public static final int SUBMIT_BUTTON_FIELD_NUMBER = 3;
            private Common$LocalizedString content_;
            private Common$RenderedAssetAppearance headerAsset_;
            private Common$LocalizedString header_;
            private Common$ButtonContent submitButton_;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<VerifyContent, a> implements MessageLiteOrBuilder {
                public a() {
                    super(VerifyContent.DEFAULT_INSTANCE);
                }
            }

            static {
                VerifyContent verifyContent = new VerifyContent();
                DEFAULT_INSTANCE = verifyContent;
                GeneratedMessageLite.registerDefaultInstance(VerifyContent.class, verifyContent);
            }

            private VerifyContent() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearContent() {
                this.content_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearHeader() {
                this.header_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearHeaderAsset() {
                this.headerAsset_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSubmitButton() {
                this.submitButton_ = null;
            }

            public static VerifyContent getDefaultInstance() {
                return DEFAULT_INSTANCE;
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
            public void mergeHeader(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                Common$LocalizedString common$LocalizedString2 = this.header_;
                if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                    this.header_ = Common$LocalizedString.newBuilder(this.header_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
                } else {
                    this.header_ = common$LocalizedString;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeHeaderAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.headerAsset_;
                if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
                    this.headerAsset_ = Common$RenderedAssetAppearance.newBuilder(this.headerAsset_).mergeFrom((Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
                } else {
                    this.headerAsset_ = common$RenderedAssetAppearance;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeSubmitButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.submitButton_;
                if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
                    this.submitButton_ = Common$ButtonContent.newBuilder(this.submitButton_).mergeFrom((Common$ButtonContent.a) common$ButtonContent).buildPartial();
                } else {
                    this.submitButton_ = common$ButtonContent;
                }
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static VerifyContent parseDelimitedFrom(InputStream inputStream) {
                return (VerifyContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static VerifyContent parseFrom(ByteBuffer byteBuffer) {
                return (VerifyContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<VerifyContent> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setContent(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.content_ = common$LocalizedString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setHeader(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.header_ = common$LocalizedString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setHeaderAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                this.headerAsset_ = common$RenderedAssetAppearance;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSubmitButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.submitButton_ = common$ButtonContent;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (l.f18950a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new VerifyContent();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[]{"header_", "content_", "submitButton_", "headerAsset_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<VerifyContent> parser = PARSER;
                        if (parser == null) {
                            synchronized (VerifyContent.class) {
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

            public Common$LocalizedString getContent() {
                Common$LocalizedString common$LocalizedString = this.content_;
                return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public Common$LocalizedString getHeader() {
                Common$LocalizedString common$LocalizedString = this.header_;
                return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public Common$RenderedAssetAppearance getHeaderAsset() {
                Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.headerAsset_;
                return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
            }

            public Common$ButtonContent getSubmitButton() {
                Common$ButtonContent common$ButtonContent = this.submitButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public boolean hasContent() {
                return this.content_ != null;
            }

            public boolean hasHeader() {
                return this.header_ != null;
            }

            public boolean hasHeaderAsset() {
                return this.headerAsset_ != null;
            }

            public boolean hasSubmitButton() {
                return this.submitButton_ != null;
            }

            public static a newBuilder(VerifyContent verifyContent) {
                return DEFAULT_INSTANCE.createBuilder(verifyContent);
            }

            public static VerifyContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (VerifyContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static VerifyContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (VerifyContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static VerifyContent parseFrom(ByteString byteString) {
                return (VerifyContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static VerifyContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (VerifyContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static VerifyContent parseFrom(byte[] bArr) {
                return (VerifyContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static VerifyContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (VerifyContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static VerifyContent parseFrom(InputStream inputStream) {
                return (VerifyContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static VerifyContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (VerifyContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static VerifyContent parseFrom(CodedInputStream codedInputStream) {
                return (VerifyContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static VerifyContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (VerifyContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<Rendering, a> implements MessageLiteOrBuilder {
            public a() {
                super(Rendering.DEFAULT_INSTANCE);
            }
        }

        /* loaded from: classes2.dex */
        public interface b extends MessageLiteOrBuilder {
        }

        /* loaded from: classes2.dex */
        public enum c {
            UPLOAD_FORM_API(7),
            UPLOADAPI_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            public final int f18325a;

            c(int i11) {
                this.f18325a = i11;
            }

            public static c forNumber(int i11) {
                if (i11 != 0) {
                    if (i11 != 7) {
                        return null;
                    }
                    return UPLOAD_FORM_API;
                }
                return UPLOADAPI_NOT_SET;
            }

            public int getNumber() {
                return this.f18325a;
            }

            @Deprecated
            public static c valueOf(int i11) {
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
        public void addAllFileTypes(Iterable<? extends FileType> iterable) {
            ensureFileTypesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.fileTypes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFileTypes(FileType fileType) {
            fileType.getClass();
            ensureFileTypesIsMutable();
            this.fileTypes_.add(fileType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEvents() {
            this.events_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileTypeSelectionContent() {
            this.fileTypeSelectionContent_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileTypes() {
            this.fileTypes_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPickerContent() {
            this.pickerContent_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUploadApi() {
            this.uploadApiCase_ = 0;
            this.uploadApi_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUploadFormApi() {
            if (this.uploadApiCase_ == 7) {
                this.uploadApiCase_ = 0;
                this.uploadApi_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUploadingStatusText() {
            this.uploadingStatusText_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValidationErrorContent() {
            this.validationErrorContent_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVerifyContent() {
            this.verifyContent_ = null;
        }

        private void ensureFileTypesIsMutable() {
            Internal.ProtobufList<FileType> protobufList = this.fileTypes_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.fileTypes_ = GeneratedMessageLite.mutableCopy(protobufList);
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
        public void mergeFileTypeSelectionContent(FileTypeSelectionContent fileTypeSelectionContent) {
            fileTypeSelectionContent.getClass();
            FileTypeSelectionContent fileTypeSelectionContent2 = this.fileTypeSelectionContent_;
            if (fileTypeSelectionContent2 != null && fileTypeSelectionContent2 != FileTypeSelectionContent.getDefaultInstance()) {
                this.fileTypeSelectionContent_ = FileTypeSelectionContent.newBuilder(this.fileTypeSelectionContent_).mergeFrom((FileTypeSelectionContent.a) fileTypeSelectionContent).buildPartial();
            } else {
                this.fileTypeSelectionContent_ = fileTypeSelectionContent;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePickerContent(FilePickerContent filePickerContent) {
            filePickerContent.getClass();
            FilePickerContent filePickerContent2 = this.pickerContent_;
            if (filePickerContent2 != null && filePickerContent2 != FilePickerContent.getDefaultInstance()) {
                this.pickerContent_ = FilePickerContent.newBuilder(this.pickerContent_).mergeFrom((FilePickerContent.a) filePickerContent).buildPartial();
            } else {
                this.pickerContent_ = filePickerContent;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUploadFormApi(UploadFormAPI uploadFormAPI) {
            uploadFormAPI.getClass();
            if (this.uploadApiCase_ == 7 && this.uploadApi_ != UploadFormAPI.getDefaultInstance()) {
                this.uploadApi_ = UploadFormAPI.newBuilder((UploadFormAPI) this.uploadApi_).mergeFrom((UploadFormAPI.a) uploadFormAPI).buildPartial();
            } else {
                this.uploadApi_ = uploadFormAPI;
            }
            this.uploadApiCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUploadingStatusText(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.uploadingStatusText_;
            if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                this.uploadingStatusText_ = Common$LocalizedString.newBuilder(this.uploadingStatusText_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
            } else {
                this.uploadingStatusText_ = common$LocalizedString;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeValidationErrorContent(ValidationErrorContent validationErrorContent) {
            validationErrorContent.getClass();
            ValidationErrorContent validationErrorContent2 = this.validationErrorContent_;
            if (validationErrorContent2 != null && validationErrorContent2 != ValidationErrorContent.getDefaultInstance()) {
                this.validationErrorContent_ = ValidationErrorContent.newBuilder(this.validationErrorContent_).mergeFrom((ValidationErrorContent.a) validationErrorContent).buildPartial();
            } else {
                this.validationErrorContent_ = validationErrorContent;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVerifyContent(VerifyContent verifyContent) {
            verifyContent.getClass();
            VerifyContent verifyContent2 = this.verifyContent_;
            if (verifyContent2 != null && verifyContent2 != VerifyContent.getDefaultInstance()) {
                this.verifyContent_ = VerifyContent.newBuilder(this.verifyContent_).mergeFrom((VerifyContent.a) verifyContent).buildPartial();
            } else {
                this.verifyContent_ = verifyContent;
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
        public void removeFileTypes(int i11) {
            ensureFileTypesIsMutable();
            this.fileTypes_.remove(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileTypeSelectionContent(FileTypeSelectionContent fileTypeSelectionContent) {
            fileTypeSelectionContent.getClass();
            this.fileTypeSelectionContent_ = fileTypeSelectionContent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileTypes(int i11, FileType fileType) {
            fileType.getClass();
            ensureFileTypesIsMutable();
            this.fileTypes_.set(i11, fileType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPickerContent(FilePickerContent filePickerContent) {
            filePickerContent.getClass();
            this.pickerContent_ = filePickerContent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUploadFormApi(UploadFormAPI uploadFormAPI) {
            uploadFormAPI.getClass();
            this.uploadApi_ = uploadFormAPI;
            this.uploadApiCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUploadingStatusText(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.uploadingStatusText_ = common$LocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValidationErrorContent(ValidationErrorContent validationErrorContent) {
            validationErrorContent.getClass();
            this.validationErrorContent_ = validationErrorContent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerifyContent(VerifyContent verifyContent) {
            verifyContent.getClass();
            this.verifyContent_ = verifyContent;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (l.f18950a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007<\u0000\b\t", new Object[]{"uploadApi_", "uploadApiCase_", "fileTypes_", FileType.class, "pickerContent_", "validationErrorContent_", "fileTypeSelectionContent_", "verifyContent_", "uploadingStatusText_", UploadFormAPI.class, "events_"});
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

        public FileTypeSelectionContent getFileTypeSelectionContent() {
            FileTypeSelectionContent fileTypeSelectionContent = this.fileTypeSelectionContent_;
            return fileTypeSelectionContent == null ? FileTypeSelectionContent.getDefaultInstance() : fileTypeSelectionContent;
        }

        public FileType getFileTypes(int i11) {
            return this.fileTypes_.get(i11);
        }

        public int getFileTypesCount() {
            return this.fileTypes_.size();
        }

        public List<FileType> getFileTypesList() {
            return this.fileTypes_;
        }

        public b getFileTypesOrBuilder(int i11) {
            return this.fileTypes_.get(i11);
        }

        public List<? extends b> getFileTypesOrBuilderList() {
            return this.fileTypes_;
        }

        public FilePickerContent getPickerContent() {
            FilePickerContent filePickerContent = this.pickerContent_;
            return filePickerContent == null ? FilePickerContent.getDefaultInstance() : filePickerContent;
        }

        public c getUploadApiCase() {
            return c.forNumber(this.uploadApiCase_);
        }

        public UploadFormAPI getUploadFormApi() {
            if (this.uploadApiCase_ == 7) {
                return (UploadFormAPI) this.uploadApi_;
            }
            return UploadFormAPI.getDefaultInstance();
        }

        public Common$LocalizedString getUploadingStatusText() {
            Common$LocalizedString common$LocalizedString = this.uploadingStatusText_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public ValidationErrorContent getValidationErrorContent() {
            ValidationErrorContent validationErrorContent = this.validationErrorContent_;
            return validationErrorContent == null ? ValidationErrorContent.getDefaultInstance() : validationErrorContent;
        }

        public VerifyContent getVerifyContent() {
            VerifyContent verifyContent = this.verifyContent_;
            return verifyContent == null ? VerifyContent.getDefaultInstance() : verifyContent;
        }

        public boolean hasEvents() {
            return this.events_ != null;
        }

        public boolean hasFileTypeSelectionContent() {
            return this.fileTypeSelectionContent_ != null;
        }

        public boolean hasPickerContent() {
            return this.pickerContent_ != null;
        }

        public boolean hasUploadFormApi() {
            return this.uploadApiCase_ == 7;
        }

        public boolean hasUploadingStatusText() {
            return this.uploadingStatusText_ != null;
        }

        public boolean hasValidationErrorContent() {
            return this.validationErrorContent_ != null;
        }

        public boolean hasVerifyContent() {
            return this.verifyContent_ != null;
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
        public void addFileTypes(int i11, FileType fileType) {
            fileType.getClass();
            ensureFileTypesIsMutable();
            this.fileTypes_.add(i11, fileType);
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
    public static final class a extends GeneratedMessageLite.Builder<BetaUpload$BetaUploadPane, a> implements MessageLiteOrBuilder {
        public a() {
            super(BetaUpload$BetaUploadPane.DEFAULT_INSTANCE);
        }
    }

    static {
        BetaUpload$BetaUploadPane betaUpload$BetaUploadPane = new BetaUpload$BetaUploadPane();
        DEFAULT_INSTANCE = betaUpload$BetaUploadPane;
        GeneratedMessageLite.registerDefaultInstance(BetaUpload$BetaUploadPane.class, betaUpload$BetaUploadPane);
    }

    private BetaUpload$BetaUploadPane() {
    }

    public static BetaUpload$BetaUploadPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BetaUpload$BetaUploadPane parseDelimitedFrom(InputStream inputStream) {
        return (BetaUpload$BetaUploadPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BetaUpload$BetaUploadPane parseFrom(ByteBuffer byteBuffer) {
        return (BetaUpload$BetaUploadPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BetaUpload$BetaUploadPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (l.f18950a[methodToInvoke.ordinal()]) {
            case 1:
                return new BetaUpload$BetaUploadPane();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BetaUpload$BetaUploadPane> parser = PARSER;
                if (parser == null) {
                    synchronized (BetaUpload$BetaUploadPane.class) {
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

    public static a newBuilder(BetaUpload$BetaUploadPane betaUpload$BetaUploadPane) {
        return DEFAULT_INSTANCE.createBuilder(betaUpload$BetaUploadPane);
    }

    public static BetaUpload$BetaUploadPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BetaUpload$BetaUploadPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BetaUpload$BetaUploadPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (BetaUpload$BetaUploadPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BetaUpload$BetaUploadPane parseFrom(ByteString byteString) {
        return (BetaUpload$BetaUploadPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BetaUpload$BetaUploadPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (BetaUpload$BetaUploadPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BetaUpload$BetaUploadPane parseFrom(byte[] bArr) {
        return (BetaUpload$BetaUploadPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BetaUpload$BetaUploadPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (BetaUpload$BetaUploadPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BetaUpload$BetaUploadPane parseFrom(InputStream inputStream) {
        return (BetaUpload$BetaUploadPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BetaUpload$BetaUploadPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BetaUpload$BetaUploadPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BetaUpload$BetaUploadPane parseFrom(CodedInputStream codedInputStream) {
        return (BetaUpload$BetaUploadPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BetaUpload$BetaUploadPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BetaUpload$BetaUploadPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}