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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution;
import com.plaid.internal.v0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Challenge$ChallengePane extends GeneratedMessageLite<Challenge$ChallengePane, a> implements MessageLiteOrBuilder {
    private static final Challenge$ChallengePane DEFAULT_INSTANCE;
    private static volatile Parser<Challenge$ChallengePane> PARSER;

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
                switch (v0.f19597a[methodToInvoke.ordinal()]) {
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
            public static final int CHALLENGE_RESPONSE_FIELD_NUMBER = 1;
            private static final SubmitAction DEFAULT_INSTANCE;
            private static volatile Parser<SubmitAction> PARSER;
            private String challengeResponse_ = "";

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<SubmitAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(SubmitAction.DEFAULT_INSTANCE);
                }

                public a a(String str) {
                    copyOnWrite();
                    ((SubmitAction) this.instance).setChallengeResponse(str);
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
            public void clearChallengeResponse() {
                this.challengeResponse_ = getDefaultInstance().getChallengeResponse();
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
            public void setChallengeResponse(String str) {
                str.getClass();
                this.challengeResponse_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setChallengeResponseBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.challengeResponse_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (v0.f19597a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubmitAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"challengeResponse_"});
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

            public String getChallengeResponse() {
                return this.challengeResponse_;
            }

            public ByteString getChallengeResponseBytes() {
                return ByteString.copyFromUtf8(this.challengeResponse_);
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
            public final int f18341a;

            a(int i11) {
                this.f18341a = i11;
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
                return this.f18341a;
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
            switch (v0.f19597a[methodToInvoke.ordinal()]) {
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
        private static final Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 5;
        public static final int HEADER_FIELD_NUMBER = 2;
        public static final int INSTITUTION_FIELD_NUMBER = 1;
        public static final int JAVA_SCRIPT_FIELD_NUMBER = 4;
        public static final int PANE_HEADER_FIELD_NUMBER = 6;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int PREVIEW_FIELD_NUMBER = 7;
        public static final int RECAPTCHA_FIELD_NUMBER = 3;
        private int challengeCase_ = 0;
        private Object challenge_;
        private Events events_;
        private Common$LocalizedString header_;
        private Common$RenderedInstitution institution_;
        private Common$PaneHeader paneHeader_;

        /* loaded from: classes2.dex */
        public static final class Events extends GeneratedMessageLite<Events, a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();

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

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (v0.f19597a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"onAppear_", Common$SDKEvent.class});
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
        public static final class JavaScriptChallenge extends GeneratedMessageLite<JavaScriptChallenge, a> implements MessageLiteOrBuilder {
            public static final int CHALLENGE_HASH_FIELD_NUMBER = 1;
            public static final int CHALLENGE_SRI_FIELD_NUMBER = 2;
            public static final int CHALLENGE_TYPE_FIELD_NUMBER = 5;
            private static final JavaScriptChallenge DEFAULT_INSTANCE;
            public static final int INITIALIZATION_OPTIONS_JSON_FIELD_NUMBER = 3;
            public static final int LOCALIZED_STRINGS_FIELD_NUMBER = 4;
            private static volatile Parser<JavaScriptChallenge> PARSER;
            private MapFieldLite<String, Common$LocalizedString> localizedStrings_ = MapFieldLite.emptyMapField();
            private String challengeHash_ = "";
            private String challengeSri_ = "";
            private String initializationOptionsJson_ = "";
            private String challengeType_ = "";

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<JavaScriptChallenge, a> implements MessageLiteOrBuilder {
                public a() {
                    super(JavaScriptChallenge.DEFAULT_INSTANCE);
                }
            }

            /* loaded from: classes2.dex */
            public static final class b {

                /* renamed from: a  reason: collision with root package name */
                public static final MapEntryLite<String, Common$LocalizedString> f18342a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Common$LocalizedString.getDefaultInstance());
            }

            static {
                JavaScriptChallenge javaScriptChallenge = new JavaScriptChallenge();
                DEFAULT_INSTANCE = javaScriptChallenge;
                GeneratedMessageLite.registerDefaultInstance(JavaScriptChallenge.class, javaScriptChallenge);
            }

            private JavaScriptChallenge() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearChallengeHash() {
                this.challengeHash_ = getDefaultInstance().getChallengeHash();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearChallengeSri() {
                this.challengeSri_ = getDefaultInstance().getChallengeSri();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearChallengeType() {
                this.challengeType_ = getDefaultInstance().getChallengeType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInitializationOptionsJson() {
                this.initializationOptionsJson_ = getDefaultInstance().getInitializationOptionsJson();
            }

            public static JavaScriptChallenge getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public Map<String, Common$LocalizedString> getMutableLocalizedStringsMap() {
                return internalGetMutableLocalizedStrings();
            }

            private MapFieldLite<String, Common$LocalizedString> internalGetLocalizedStrings() {
                return this.localizedStrings_;
            }

            private MapFieldLite<String, Common$LocalizedString> internalGetMutableLocalizedStrings() {
                if (!this.localizedStrings_.isMutable()) {
                    this.localizedStrings_ = this.localizedStrings_.mutableCopy();
                }
                return this.localizedStrings_;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static JavaScriptChallenge parseDelimitedFrom(InputStream inputStream) {
                return (JavaScriptChallenge) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static JavaScriptChallenge parseFrom(ByteBuffer byteBuffer) {
                return (JavaScriptChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<JavaScriptChallenge> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setChallengeHash(String str) {
                str.getClass();
                this.challengeHash_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setChallengeHashBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.challengeHash_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setChallengeSri(String str) {
                str.getClass();
                this.challengeSri_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setChallengeSriBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.challengeSri_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setChallengeType(String str) {
                str.getClass();
                this.challengeType_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setChallengeTypeBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.challengeType_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInitializationOptionsJson(String str) {
                str.getClass();
                this.initializationOptionsJson_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInitializationOptionsJsonBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.initializationOptionsJson_ = byteString.toStringUtf8();
            }

            public boolean containsLocalizedStrings(String str) {
                str.getClass();
                return internalGetLocalizedStrings().containsKey(str);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (v0.f19597a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new JavaScriptChallenge();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u00042\u0005Ȉ", new Object[]{"challengeHash_", "challengeSri_", "initializationOptionsJson_", "localizedStrings_", b.f18342a, "challengeType_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<JavaScriptChallenge> parser = PARSER;
                        if (parser == null) {
                            synchronized (JavaScriptChallenge.class) {
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

            public String getChallengeHash() {
                return this.challengeHash_;
            }

            public ByteString getChallengeHashBytes() {
                return ByteString.copyFromUtf8(this.challengeHash_);
            }

            public String getChallengeSri() {
                return this.challengeSri_;
            }

            public ByteString getChallengeSriBytes() {
                return ByteString.copyFromUtf8(this.challengeSri_);
            }

            public String getChallengeType() {
                return this.challengeType_;
            }

            public ByteString getChallengeTypeBytes() {
                return ByteString.copyFromUtf8(this.challengeType_);
            }

            public String getInitializationOptionsJson() {
                return this.initializationOptionsJson_;
            }

            public ByteString getInitializationOptionsJsonBytes() {
                return ByteString.copyFromUtf8(this.initializationOptionsJson_);
            }

            @Deprecated
            public Map<String, Common$LocalizedString> getLocalizedStrings() {
                return getLocalizedStringsMap();
            }

            public int getLocalizedStringsCount() {
                return internalGetLocalizedStrings().size();
            }

            public Map<String, Common$LocalizedString> getLocalizedStringsMap() {
                return Collections.unmodifiableMap(internalGetLocalizedStrings());
            }

            public Common$LocalizedString getLocalizedStringsOrDefault(String str, Common$LocalizedString common$LocalizedString) {
                str.getClass();
                MapFieldLite<String, Common$LocalizedString> internalGetLocalizedStrings = internalGetLocalizedStrings();
                return internalGetLocalizedStrings.containsKey(str) ? internalGetLocalizedStrings.get(str) : common$LocalizedString;
            }

            public Common$LocalizedString getLocalizedStringsOrThrow(String str) {
                str.getClass();
                MapFieldLite<String, Common$LocalizedString> internalGetLocalizedStrings = internalGetLocalizedStrings();
                if (internalGetLocalizedStrings.containsKey(str)) {
                    return internalGetLocalizedStrings.get(str);
                }
                throw new IllegalArgumentException();
            }

            public static a newBuilder(JavaScriptChallenge javaScriptChallenge) {
                return DEFAULT_INSTANCE.createBuilder(javaScriptChallenge);
            }

            public static JavaScriptChallenge parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (JavaScriptChallenge) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static JavaScriptChallenge parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (JavaScriptChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static JavaScriptChallenge parseFrom(ByteString byteString) {
                return (JavaScriptChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static JavaScriptChallenge parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (JavaScriptChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static JavaScriptChallenge parseFrom(byte[] bArr) {
                return (JavaScriptChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static JavaScriptChallenge parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (JavaScriptChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static JavaScriptChallenge parseFrom(InputStream inputStream) {
                return (JavaScriptChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static JavaScriptChallenge parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (JavaScriptChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static JavaScriptChallenge parseFrom(CodedInputStream codedInputStream) {
                return (JavaScriptChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static JavaScriptChallenge parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (JavaScriptChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class PreviewChallenge extends GeneratedMessageLite<PreviewChallenge, a> implements MessageLiteOrBuilder {
            private static final PreviewChallenge DEFAULT_INSTANCE;
            private static volatile Parser<PreviewChallenge> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<PreviewChallenge, a> implements MessageLiteOrBuilder {
                public a() {
                    super(PreviewChallenge.DEFAULT_INSTANCE);
                }
            }

            static {
                PreviewChallenge previewChallenge = new PreviewChallenge();
                DEFAULT_INSTANCE = previewChallenge;
                GeneratedMessageLite.registerDefaultInstance(PreviewChallenge.class, previewChallenge);
            }

            private PreviewChallenge() {
            }

            public static PreviewChallenge getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PreviewChallenge parseDelimitedFrom(InputStream inputStream) {
                return (PreviewChallenge) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PreviewChallenge parseFrom(ByteBuffer byteBuffer) {
                return (PreviewChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PreviewChallenge> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (v0.f19597a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PreviewChallenge();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PreviewChallenge> parser = PARSER;
                        if (parser == null) {
                            synchronized (PreviewChallenge.class) {
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

            public static a newBuilder(PreviewChallenge previewChallenge) {
                return DEFAULT_INSTANCE.createBuilder(previewChallenge);
            }

            public static PreviewChallenge parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PreviewChallenge) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PreviewChallenge parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PreviewChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PreviewChallenge parseFrom(ByteString byteString) {
                return (PreviewChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static PreviewChallenge parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PreviewChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PreviewChallenge parseFrom(byte[] bArr) {
                return (PreviewChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PreviewChallenge parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PreviewChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PreviewChallenge parseFrom(InputStream inputStream) {
                return (PreviewChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PreviewChallenge parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PreviewChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PreviewChallenge parseFrom(CodedInputStream codedInputStream) {
                return (PreviewChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PreviewChallenge parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PreviewChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class RecaptchaChallenge extends GeneratedMessageLite<RecaptchaChallenge, a> implements MessageLiteOrBuilder {
            private static final RecaptchaChallenge DEFAULT_INSTANCE;
            public static final int LANGUAGE_FIELD_NUMBER = 2;
            private static volatile Parser<RecaptchaChallenge> PARSER = null;
            public static final int SITEKEY_FIELD_NUMBER = 1;
            private String sitekey_ = "";
            private String language_ = "";

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<RecaptchaChallenge, a> implements MessageLiteOrBuilder {
                public a() {
                    super(RecaptchaChallenge.DEFAULT_INSTANCE);
                }
            }

            static {
                RecaptchaChallenge recaptchaChallenge = new RecaptchaChallenge();
                DEFAULT_INSTANCE = recaptchaChallenge;
                GeneratedMessageLite.registerDefaultInstance(RecaptchaChallenge.class, recaptchaChallenge);
            }

            private RecaptchaChallenge() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLanguage() {
                this.language_ = getDefaultInstance().getLanguage();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSitekey() {
                this.sitekey_ = getDefaultInstance().getSitekey();
            }

            public static RecaptchaChallenge getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static RecaptchaChallenge parseDelimitedFrom(InputStream inputStream) {
                return (RecaptchaChallenge) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RecaptchaChallenge parseFrom(ByteBuffer byteBuffer) {
                return (RecaptchaChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<RecaptchaChallenge> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLanguage(String str) {
                str.getClass();
                this.language_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLanguageBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.language_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSitekey(String str) {
                str.getClass();
                this.sitekey_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSitekeyBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.sitekey_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (v0.f19597a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new RecaptchaChallenge();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"sitekey_", "language_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<RecaptchaChallenge> parser = PARSER;
                        if (parser == null) {
                            synchronized (RecaptchaChallenge.class) {
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

            public String getLanguage() {
                return this.language_;
            }

            public ByteString getLanguageBytes() {
                return ByteString.copyFromUtf8(this.language_);
            }

            public String getSitekey() {
                return this.sitekey_;
            }

            public ByteString getSitekeyBytes() {
                return ByteString.copyFromUtf8(this.sitekey_);
            }

            public static a newBuilder(RecaptchaChallenge recaptchaChallenge) {
                return DEFAULT_INSTANCE.createBuilder(recaptchaChallenge);
            }

            public static RecaptchaChallenge parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (RecaptchaChallenge) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static RecaptchaChallenge parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (RecaptchaChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static RecaptchaChallenge parseFrom(ByteString byteString) {
                return (RecaptchaChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static RecaptchaChallenge parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (RecaptchaChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static RecaptchaChallenge parseFrom(byte[] bArr) {
                return (RecaptchaChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static RecaptchaChallenge parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (RecaptchaChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static RecaptchaChallenge parseFrom(InputStream inputStream) {
                return (RecaptchaChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RecaptchaChallenge parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (RecaptchaChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static RecaptchaChallenge parseFrom(CodedInputStream codedInputStream) {
                return (RecaptchaChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static RecaptchaChallenge parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (RecaptchaChallenge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
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
            RECAPTCHA(3),
            JAVA_SCRIPT(4),
            PREVIEW(7),
            CHALLENGE_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            public final int f18344a;

            b(int i11) {
                this.f18344a = i11;
            }

            public static b forNumber(int i11) {
                if (i11 != 0) {
                    if (i11 != 7) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                return null;
                            }
                            return JAVA_SCRIPT;
                        }
                        return RECAPTCHA;
                    }
                    return PREVIEW;
                }
                return CHALLENGE_NOT_SET;
            }

            public int getNumber() {
                return this.f18344a;
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
        public void clearChallenge() {
            this.challengeCase_ = 0;
            this.challenge_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEvents() {
            this.events_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeader() {
            this.header_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInstitution() {
            this.institution_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaScript() {
            if (this.challengeCase_ == 4) {
                this.challengeCase_ = 0;
                this.challenge_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaneHeader() {
            this.paneHeader_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPreview() {
            if (this.challengeCase_ == 7) {
                this.challengeCase_ = 0;
                this.challenge_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecaptcha() {
            if (this.challengeCase_ == 3) {
                this.challengeCase_ = 0;
                this.challenge_ = null;
            }
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
        public void mergeJavaScript(JavaScriptChallenge javaScriptChallenge) {
            javaScriptChallenge.getClass();
            if (this.challengeCase_ == 4 && this.challenge_ != JavaScriptChallenge.getDefaultInstance()) {
                this.challenge_ = JavaScriptChallenge.newBuilder((JavaScriptChallenge) this.challenge_).mergeFrom((JavaScriptChallenge.a) javaScriptChallenge).buildPartial();
            } else {
                this.challenge_ = javaScriptChallenge;
            }
            this.challengeCase_ = 4;
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
        public void mergePreview(PreviewChallenge previewChallenge) {
            previewChallenge.getClass();
            if (this.challengeCase_ == 7 && this.challenge_ != PreviewChallenge.getDefaultInstance()) {
                this.challenge_ = PreviewChallenge.newBuilder((PreviewChallenge) this.challenge_).mergeFrom((PreviewChallenge.a) previewChallenge).buildPartial();
            } else {
                this.challenge_ = previewChallenge;
            }
            this.challengeCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRecaptcha(RecaptchaChallenge recaptchaChallenge) {
            recaptchaChallenge.getClass();
            if (this.challengeCase_ == 3 && this.challenge_ != RecaptchaChallenge.getDefaultInstance()) {
                this.challenge_ = RecaptchaChallenge.newBuilder((RecaptchaChallenge) this.challenge_).mergeFrom((RecaptchaChallenge.a) recaptchaChallenge).buildPartial();
            } else {
                this.challenge_ = recaptchaChallenge;
            }
            this.challengeCase_ = 3;
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
        public void setHeader(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.header_ = common$LocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInstitution(Common$RenderedInstitution common$RenderedInstitution) {
            common$RenderedInstitution.getClass();
            this.institution_ = common$RenderedInstitution;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaScript(JavaScriptChallenge javaScriptChallenge) {
            javaScriptChallenge.getClass();
            this.challenge_ = javaScriptChallenge;
            this.challengeCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaneHeader(Common$PaneHeader common$PaneHeader) {
            common$PaneHeader.getClass();
            this.paneHeader_ = common$PaneHeader;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPreview(PreviewChallenge previewChallenge) {
            previewChallenge.getClass();
            this.challenge_ = previewChallenge;
            this.challengeCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecaptcha(RecaptchaChallenge recaptchaChallenge) {
            recaptchaChallenge.getClass();
            this.challenge_ = recaptchaChallenge;
            this.challengeCase_ = 3;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (v0.f19597a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003<\u0000\u0004<\u0000\u0005\t\u0006\t\u0007<\u0000", new Object[]{"challenge_", "challengeCase_", "institution_", "header_", RecaptchaChallenge.class, JavaScriptChallenge.class, "events_", "paneHeader_", PreviewChallenge.class});
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

        public b getChallengeCase() {
            return b.forNumber(this.challengeCase_);
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public Common$LocalizedString getHeader() {
            Common$LocalizedString common$LocalizedString = this.header_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$RenderedInstitution getInstitution() {
            Common$RenderedInstitution common$RenderedInstitution = this.institution_;
            return common$RenderedInstitution == null ? Common$RenderedInstitution.getDefaultInstance() : common$RenderedInstitution;
        }

        public JavaScriptChallenge getJavaScript() {
            if (this.challengeCase_ == 4) {
                return (JavaScriptChallenge) this.challenge_;
            }
            return JavaScriptChallenge.getDefaultInstance();
        }

        public Common$PaneHeader getPaneHeader() {
            Common$PaneHeader common$PaneHeader = this.paneHeader_;
            return common$PaneHeader == null ? Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
        }

        public PreviewChallenge getPreview() {
            if (this.challengeCase_ == 7) {
                return (PreviewChallenge) this.challenge_;
            }
            return PreviewChallenge.getDefaultInstance();
        }

        public RecaptchaChallenge getRecaptcha() {
            if (this.challengeCase_ == 3) {
                return (RecaptchaChallenge) this.challenge_;
            }
            return RecaptchaChallenge.getDefaultInstance();
        }

        public boolean hasEvents() {
            return this.events_ != null;
        }

        public boolean hasHeader() {
            return this.header_ != null;
        }

        public boolean hasInstitution() {
            return this.institution_ != null;
        }

        public boolean hasJavaScript() {
            return this.challengeCase_ == 4;
        }

        public boolean hasPaneHeader() {
            return this.paneHeader_ != null;
        }

        public boolean hasPreview() {
            return this.challengeCase_ == 7;
        }

        public boolean hasRecaptcha() {
            return this.challengeCase_ == 3;
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
    public static final class a extends GeneratedMessageLite.Builder<Challenge$ChallengePane, a> implements MessageLiteOrBuilder {
        public a() {
            super(Challenge$ChallengePane.DEFAULT_INSTANCE);
        }
    }

    static {
        Challenge$ChallengePane challenge$ChallengePane = new Challenge$ChallengePane();
        DEFAULT_INSTANCE = challenge$ChallengePane;
        GeneratedMessageLite.registerDefaultInstance(Challenge$ChallengePane.class, challenge$ChallengePane);
    }

    private Challenge$ChallengePane() {
    }

    public static Challenge$ChallengePane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Challenge$ChallengePane parseDelimitedFrom(InputStream inputStream) {
        return (Challenge$ChallengePane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Challenge$ChallengePane parseFrom(ByteBuffer byteBuffer) {
        return (Challenge$ChallengePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Challenge$ChallengePane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (v0.f19597a[methodToInvoke.ordinal()]) {
            case 1:
                return new Challenge$ChallengePane();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Challenge$ChallengePane> parser = PARSER;
                if (parser == null) {
                    synchronized (Challenge$ChallengePane.class) {
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

    public static a newBuilder(Challenge$ChallengePane challenge$ChallengePane) {
        return DEFAULT_INSTANCE.createBuilder(challenge$ChallengePane);
    }

    public static Challenge$ChallengePane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Challenge$ChallengePane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Challenge$ChallengePane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Challenge$ChallengePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Challenge$ChallengePane parseFrom(ByteString byteString) {
        return (Challenge$ChallengePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Challenge$ChallengePane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Challenge$ChallengePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Challenge$ChallengePane parseFrom(byte[] bArr) {
        return (Challenge$ChallengePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Challenge$ChallengePane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Challenge$ChallengePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Challenge$ChallengePane parseFrom(InputStream inputStream) {
        return (Challenge$ChallengePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Challenge$ChallengePane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Challenge$ChallengePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Challenge$ChallengePane parseFrom(CodedInputStream codedInputStream) {
        return (Challenge$ChallengePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Challenge$ChallengePane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Challenge$ChallengePane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}