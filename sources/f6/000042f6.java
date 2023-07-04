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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$HyperlinkContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput;
import com.plaid.internal.kc;
import com.plaid.internal.o1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class UserInput$UserInputPane extends GeneratedMessageLite<UserInput$UserInputPane, a> implements MessageLiteOrBuilder {
    private static final UserInput$UserInputPane DEFAULT_INSTANCE;
    private static volatile Parser<UserInput$UserInputPane> PARSER;

    /* loaded from: classes2.dex */
    public static final class Actions extends GeneratedMessageLite<Actions, b> implements MessageLiteOrBuilder {
        public static final int BUTTON_DISCLAIMER_TAP_FIELD_NUMBER = 3;
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        private static volatile Parser<Actions> PARSER = null;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 4;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        private int actionCase_ = 0;
        private Object action_;

        /* loaded from: classes2.dex */
        public static final class ButtonDisclaimerTapAction extends GeneratedMessageLite<ButtonDisclaimerTapAction, a> implements MessageLiteOrBuilder {
            private static final ButtonDisclaimerTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonDisclaimerTapAction> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<ButtonDisclaimerTapAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(ButtonDisclaimerTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ButtonDisclaimerTapAction buttonDisclaimerTapAction = new ButtonDisclaimerTapAction();
                DEFAULT_INSTANCE = buttonDisclaimerTapAction;
                GeneratedMessageLite.registerDefaultInstance(ButtonDisclaimerTapAction.class, buttonDisclaimerTapAction);
            }

            private ButtonDisclaimerTapAction() {
            }

            public static ButtonDisclaimerTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ButtonDisclaimerTapAction parseDelimitedFrom(InputStream inputStream) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonDisclaimerTapAction parseFrom(ByteBuffer byteBuffer) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ButtonDisclaimerTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (kc.f18938a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonDisclaimerTapAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ButtonDisclaimerTapAction> parser = PARSER;
                        if (parser == null) {
                            synchronized (ButtonDisclaimerTapAction.class) {
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

            public static a newBuilder(ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonDisclaimerTapAction);
            }

            public static ButtonDisclaimerTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonDisclaimerTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ButtonDisclaimerTapAction parseFrom(ByteString byteString) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ButtonDisclaimerTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ButtonDisclaimerTapAction parseFrom(byte[] bArr) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ButtonDisclaimerTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ButtonDisclaimerTapAction parseFrom(InputStream inputStream) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonDisclaimerTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonDisclaimerTapAction parseFrom(CodedInputStream codedInputStream) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ButtonDisclaimerTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonDisclaimerTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

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
                switch (kc.f18938a[methodToInvoke.ordinal()]) {
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
        public static final class SecondaryButtonTapAction extends GeneratedMessageLite<SecondaryButtonTapAction, a> implements MessageLiteOrBuilder {
            private static final SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile Parser<SecondaryButtonTapAction> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<SecondaryButtonTapAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(SecondaryButtonTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                SecondaryButtonTapAction secondaryButtonTapAction = new SecondaryButtonTapAction();
                DEFAULT_INSTANCE = secondaryButtonTapAction;
                GeneratedMessageLite.registerDefaultInstance(SecondaryButtonTapAction.class, secondaryButtonTapAction);
            }

            private SecondaryButtonTapAction() {
            }

            public static SecondaryButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SecondaryButtonTapAction parseDelimitedFrom(InputStream inputStream) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SecondaryButtonTapAction parseFrom(ByteBuffer byteBuffer) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SecondaryButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (kc.f18938a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SecondaryButtonTapAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SecondaryButtonTapAction> parser = PARSER;
                        if (parser == null) {
                            synchronized (SecondaryButtonTapAction.class) {
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

            public static a newBuilder(SecondaryButtonTapAction secondaryButtonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(secondaryButtonTapAction);
            }

            public static SecondaryButtonTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SecondaryButtonTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SecondaryButtonTapAction parseFrom(ByteString byteString) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SecondaryButtonTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SecondaryButtonTapAction parseFrom(byte[] bArr) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SecondaryButtonTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SecondaryButtonTapAction parseFrom(InputStream inputStream) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SecondaryButtonTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SecondaryButtonTapAction parseFrom(CodedInputStream codedInputStream) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SecondaryButtonTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SecondaryButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class SubmitAction extends GeneratedMessageLite<SubmitAction, a> implements MessageLiteOrBuilder {
            private static final SubmitAction DEFAULT_INSTANCE;
            private static volatile Parser<SubmitAction> PARSER = null;
            public static final int RESPONSES_FIELD_NUMBER = 1;
            private Internal.ProtobufList<Response> responses_ = GeneratedMessageLite.emptyProtobufList();

            /* loaded from: classes2.dex */
            public static final class Response extends GeneratedMessageLite<Response, a> implements b {
                private static final Response DEFAULT_INSTANCE;
                public static final int INPUT_ID_FIELD_NUMBER = 1;
                private static volatile Parser<Response> PARSER = null;
                public static final int VALUE_FIELD_NUMBER = 2;
                private String inputId_ = "";
                private String value_ = "";

                /* loaded from: classes2.dex */
                public static final class a extends GeneratedMessageLite.Builder<Response, a> implements b {
                    public a() {
                        super(Response.DEFAULT_INSTANCE);
                    }

                    public a a(String str) {
                        copyOnWrite();
                        ((Response) this.instance).setInputId(str);
                        return this;
                    }

                    public a b(String str) {
                        copyOnWrite();
                        ((Response) this.instance).setValue(str);
                        return this;
                    }
                }

                static {
                    Response response = new Response();
                    DEFAULT_INSTANCE = response;
                    GeneratedMessageLite.registerDefaultInstance(Response.class, response);
                }

                private Response() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearInputId() {
                    this.inputId_ = getDefaultInstance().getInputId();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearValue() {
                    this.value_ = getDefaultInstance().getValue();
                }

                public static Response getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static Response parseDelimitedFrom(InputStream inputStream) {
                    return (Response) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Response parseFrom(ByteBuffer byteBuffer) {
                    return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<Response> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setInputId(String str) {
                    str.getClass();
                    this.inputId_ = str;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setInputIdBytes(ByteString byteString) {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.inputId_ = byteString.toStringUtf8();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setValue(String str) {
                    str.getClass();
                    this.value_ = str;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setValueBytes(ByteString byteString) {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.value_ = byteString.toStringUtf8();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    switch (kc.f18938a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Response();
                        case 2:
                            return new a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"inputId_", "value_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<Response> parser = PARSER;
                            if (parser == null) {
                                synchronized (Response.class) {
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

                public String getInputId() {
                    return this.inputId_;
                }

                public ByteString getInputIdBytes() {
                    return ByteString.copyFromUtf8(this.inputId_);
                }

                public String getValue() {
                    return this.value_;
                }

                public ByteString getValueBytes() {
                    return ByteString.copyFromUtf8(this.value_);
                }

                public static a newBuilder(Response response) {
                    return DEFAULT_INSTANCE.createBuilder(response);
                }

                public static Response parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (Response) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Response parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                    return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static Response parseFrom(ByteString byteString) {
                    return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static Response parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static Response parseFrom(byte[] bArr) {
                    return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static Response parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                    return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static Response parseFrom(InputStream inputStream) {
                    return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Response parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Response parseFrom(CodedInputStream codedInputStream) {
                    return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static Response parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<SubmitAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(SubmitAction.DEFAULT_INSTANCE);
                }

                public a a(Iterable<? extends Response> iterable) {
                    copyOnWrite();
                    ((SubmitAction) this.instance).addAllResponses(iterable);
                    return this;
                }
            }

            /* loaded from: classes2.dex */
            public interface b extends MessageLiteOrBuilder {
            }

            static {
                SubmitAction submitAction = new SubmitAction();
                DEFAULT_INSTANCE = submitAction;
                GeneratedMessageLite.registerDefaultInstance(SubmitAction.class, submitAction);
            }

            private SubmitAction() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllResponses(Iterable<? extends Response> iterable) {
                ensureResponsesIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.responses_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addResponses(Response response) {
                response.getClass();
                ensureResponsesIsMutable();
                this.responses_.add(response);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResponses() {
                this.responses_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureResponsesIsMutable() {
                Internal.ProtobufList<Response> protobufList = this.responses_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.responses_ = GeneratedMessageLite.mutableCopy(protobufList);
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
            public void removeResponses(int i11) {
                ensureResponsesIsMutable();
                this.responses_.remove(i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponses(int i11, Response response) {
                response.getClass();
                ensureResponsesIsMutable();
                this.responses_.set(i11, response);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (kc.f18938a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubmitAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"responses_", Response.class});
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

            public Response getResponses(int i11) {
                return this.responses_.get(i11);
            }

            public int getResponsesCount() {
                return this.responses_.size();
            }

            public List<Response> getResponsesList() {
                return this.responses_;
            }

            public b getResponsesOrBuilder(int i11) {
                return this.responses_.get(i11);
            }

            public List<? extends b> getResponsesOrBuilderList() {
                return this.responses_;
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

            /* JADX INFO: Access modifiers changed from: private */
            public void addResponses(int i11, Response response) {
                response.getClass();
                ensureResponsesIsMutable();
                this.responses_.add(i11, response);
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
            BUTTON_DISCLAIMER_TAP(3),
            SUBMIT(1),
            SECONDARY_BUTTON_TAP(4),
            EXIT(2),
            ACTION_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            public final int f18404a;

            a(int i11) {
                this.f18404a = i11;
            }

            public static a forNumber(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    return null;
                                }
                                return SECONDARY_BUTTON_TAP;
                            }
                            return BUTTON_DISCLAIMER_TAP;
                        }
                        return EXIT;
                    }
                    return SUBMIT;
                }
                return ACTION_NOT_SET;
            }

            public int getNumber() {
                return this.f18404a;
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
        public void clearButtonDisclaimerTap() {
            if (this.actionCase_ == 3) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExit() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSecondaryButtonTap() {
            if (this.actionCase_ == 4) {
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
        public void mergeButtonDisclaimerTap(ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
            buttonDisclaimerTapAction.getClass();
            if (this.actionCase_ == 3 && this.action_ != ButtonDisclaimerTapAction.getDefaultInstance()) {
                this.action_ = ButtonDisclaimerTapAction.newBuilder((ButtonDisclaimerTapAction) this.action_).mergeFrom((ButtonDisclaimerTapAction.a) buttonDisclaimerTapAction).buildPartial();
            } else {
                this.action_ = buttonDisclaimerTapAction;
            }
            this.actionCase_ = 3;
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
        public void mergeSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            if (this.actionCase_ == 4 && this.action_ != SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = SecondaryButtonTapAction.newBuilder((SecondaryButtonTapAction) this.action_).mergeFrom((SecondaryButtonTapAction.a) secondaryButtonTapAction).buildPartial();
            } else {
                this.action_ = secondaryButtonTapAction;
            }
            this.actionCase_ = 4;
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
        public void setButtonDisclaimerTap(ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
            buttonDisclaimerTapAction.getClass();
            this.action_ = buttonDisclaimerTapAction;
            this.actionCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExit(ExitAction exitAction) {
            exitAction.getClass();
            this.action_ = exitAction;
            this.actionCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (kc.f18938a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"action_", "actionCase_", SubmitAction.class, ExitAction.class, ButtonDisclaimerTapAction.class, SecondaryButtonTapAction.class});
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

        public ButtonDisclaimerTapAction getButtonDisclaimerTap() {
            if (this.actionCase_ == 3) {
                return (ButtonDisclaimerTapAction) this.action_;
            }
            return ButtonDisclaimerTapAction.getDefaultInstance();
        }

        public ExitAction getExit() {
            if (this.actionCase_ == 2) {
                return (ExitAction) this.action_;
            }
            return ExitAction.getDefaultInstance();
        }

        public SecondaryButtonTapAction getSecondaryButtonTap() {
            if (this.actionCase_ == 4) {
                return (SecondaryButtonTapAction) this.action_;
            }
            return SecondaryButtonTapAction.getDefaultInstance();
        }

        public SubmitAction getSubmit() {
            if (this.actionCase_ == 1) {
                return (SubmitAction) this.action_;
            }
            return SubmitAction.getDefaultInstance();
        }

        public boolean hasButtonDisclaimerTap() {
            return this.actionCase_ == 3;
        }

        public boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public boolean hasSecondaryButtonTap() {
            return this.actionCase_ == 4;
        }

        public boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        /* loaded from: classes2.dex */
        public static final class b extends GeneratedMessageLite.Builder<Actions, b> implements MessageLiteOrBuilder {
            public b() {
                super(Actions.DEFAULT_INSTANCE);
            }

            public b a(ButtonDisclaimerTapAction buttonDisclaimerTapAction) {
                copyOnWrite();
                ((Actions) this.instance).setButtonDisclaimerTap(buttonDisclaimerTapAction);
                return this;
            }

            public b a(SubmitAction.a aVar) {
                copyOnWrite();
                ((Actions) this.instance).setSubmit(aVar.build());
                return this;
            }

            public b a(SecondaryButtonTapAction secondaryButtonTapAction) {
                copyOnWrite();
                ((Actions) this.instance).setSecondaryButtonTap(secondaryButtonTapAction);
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
        public static final int BUTTON_DISCLAIMER_FIELD_NUMBER = 7;
        public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 12;
        public static final int BUTTON_FIELD_NUMBER = 8;
        private static final Rendering DEFAULT_INSTANCE;
        public static final int DISPLAY_MODE_FIELD_NUMBER = 11;
        public static final int EVENTS_FIELD_NUMBER = 10;
        public static final int HEADER_ASSET_FIELD_NUMBER = 4;
        public static final int HEADER_FIELD_NUMBER = 5;
        public static final int INSTITUTION_FIELD_NUMBER = 2;
        public static final int PANE_HEADER_FIELD_NUMBER = 13;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int PROMPTS_FIELD_NUMBER = 6;
        public static final int SECONDARY_BUTTON_FIELD_NUMBER = 9;
        private Common$AttributedLocalizedString buttonDisclaimerText_;
        private Common$HyperlinkContent buttonDisclaimer_;
        private Common$ButtonContent button_;
        private int displayMode_;
        private Events events_;
        private Common$RenderedAssetAppearance headerAsset_;
        private Common$LocalizedString header_;
        private Common$RenderedInstitution institution_;
        private Common$PaneHeader paneHeader_;
        private Internal.ProtobufList<Prompt> prompts_ = GeneratedMessageLite.emptyProtobufList();
        private Common$ButtonContent secondaryButton_;

        /* loaded from: classes2.dex */
        public static final class Events extends GeneratedMessageLite<Events, a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
            public static final int ON_SUBMIT_TAP_FIELD_NUMBER = 2;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Common$SDKEvent onSecondaryButtonTap_;
            private Common$SDKEvent onSubmitTap_;

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
            public void clearOnSecondaryButtonTap() {
                this.onSecondaryButtonTap_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnSubmitTap() {
                this.onSubmitTap_ = null;
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
            public void mergeOnSecondaryButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onSecondaryButtonTap_;
                if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
                    this.onSecondaryButtonTap_ = Common$SDKEvent.newBuilder(this.onSecondaryButtonTap_).mergeFrom((Common$SDKEvent.a) common$SDKEvent).buildPartial();
                } else {
                    this.onSecondaryButtonTap_ = common$SDKEvent;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeOnSubmitTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onSubmitTap_;
                if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
                    this.onSubmitTap_ = Common$SDKEvent.newBuilder(this.onSubmitTap_).mergeFrom((Common$SDKEvent.a) common$SDKEvent).buildPartial();
                } else {
                    this.onSubmitTap_ = common$SDKEvent;
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
            public void setOnSecondaryButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSecondaryButtonTap_ = common$SDKEvent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnSubmitTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSubmitTap_ = common$SDKEvent;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (kc.f18938a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t", new Object[]{"onAppear_", Common$SDKEvent.class, "onSubmitTap_", "onSecondaryButtonTap_"});
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

            public Common$SDKEvent getOnSecondaryButtonTap() {
                Common$SDKEvent common$SDKEvent = this.onSecondaryButtonTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnSubmitTap() {
                Common$SDKEvent common$SDKEvent = this.onSubmitTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public boolean hasOnSecondaryButtonTap() {
                return this.onSecondaryButtonTap_ != null;
            }

            public boolean hasOnSubmitTap() {
                return this.onSubmitTap_ != null;
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
        public static final class Prompt extends GeneratedMessageLite<Prompt, a> implements b {
            public static final int ATTRIBUTED_TEXT_FIELD_NUMBER = 3;
            private static final Prompt DEFAULT_INSTANCE;
            public static final int INPUT_FIELD_NUMBER = 2;
            private static volatile Parser<Prompt> PARSER = null;
            public static final int TEXT_FIELD_NUMBER = 1;
            private Common$AttributedLocalizedString attributedText_;
            private Common$TextInput input_;
            private Common$LocalizedString text_;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<Prompt, a> implements b {
                public a() {
                    super(Prompt.DEFAULT_INSTANCE);
                }
            }

            static {
                Prompt prompt = new Prompt();
                DEFAULT_INSTANCE = prompt;
                GeneratedMessageLite.registerDefaultInstance(Prompt.class, prompt);
            }

            private Prompt() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAttributedText() {
                this.attributedText_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInput() {
                this.input_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearText() {
                this.text_ = null;
            }

            public static Prompt getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAttributedText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedText_;
                if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.attributedText_ = Common$AttributedLocalizedString.newBuilder(this.attributedText_).mergeFrom((Common$AttributedLocalizedString.b) common$AttributedLocalizedString).buildPartial();
                } else {
                    this.attributedText_ = common$AttributedLocalizedString;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeInput(Common$TextInput common$TextInput) {
                common$TextInput.getClass();
                Common$TextInput common$TextInput2 = this.input_;
                if (common$TextInput2 != null && common$TextInput2 != Common$TextInput.getDefaultInstance()) {
                    this.input_ = Common$TextInput.newBuilder(this.input_).mergeFrom((Common$TextInput.b) common$TextInput).buildPartial();
                } else {
                    this.input_ = common$TextInput;
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

            public static Prompt parseDelimitedFrom(InputStream inputStream) {
                return (Prompt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Prompt parseFrom(ByteBuffer byteBuffer) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Prompt> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAttributedText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.attributedText_ = common$AttributedLocalizedString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInput(Common$TextInput common$TextInput) {
                common$TextInput.getClass();
                this.input_ = common$TextInput;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setText(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.text_ = common$LocalizedString;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (kc.f18938a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Prompt();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"text_", "input_", "attributedText_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Prompt> parser = PARSER;
                        if (parser == null) {
                            synchronized (Prompt.class) {
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

            public Common$AttributedLocalizedString getAttributedText() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedText_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public Common$TextInput getInput() {
                Common$TextInput common$TextInput = this.input_;
                return common$TextInput == null ? Common$TextInput.getDefaultInstance() : common$TextInput;
            }

            public Common$LocalizedString getText() {
                Common$LocalizedString common$LocalizedString = this.text_;
                return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public boolean hasAttributedText() {
                return this.attributedText_ != null;
            }

            public boolean hasInput() {
                return this.input_ != null;
            }

            public boolean hasText() {
                return this.text_ != null;
            }

            public static a newBuilder(Prompt prompt) {
                return DEFAULT_INSTANCE.createBuilder(prompt);
            }

            public static Prompt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Prompt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Prompt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Prompt parseFrom(ByteString byteString) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Prompt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Prompt parseFrom(byte[] bArr) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Prompt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Prompt parseFrom(InputStream inputStream) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Prompt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Prompt parseFrom(CodedInputStream codedInputStream) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Prompt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
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

        static {
            Rendering rendering = new Rendering();
            DEFAULT_INSTANCE = rendering;
            GeneratedMessageLite.registerDefaultInstance(Rendering.class, rendering);
        }

        private Rendering() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPrompts(Iterable<? extends Prompt> iterable) {
            ensurePromptsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.prompts_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPrompts(Prompt prompt) {
            prompt.getClass();
            ensurePromptsIsMutable();
            this.prompts_.add(prompt);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButton() {
            this.button_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtonDisclaimer() {
            this.buttonDisclaimer_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtonDisclaimerText() {
            this.buttonDisclaimerText_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisplayMode() {
            this.displayMode_ = 0;
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
        public void clearHeaderAsset() {
            this.headerAsset_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInstitution() {
            this.institution_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaneHeader() {
            this.paneHeader_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrompts() {
            this.prompts_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSecondaryButton() {
            this.secondaryButton_ = null;
        }

        private void ensurePromptsIsMutable() {
            Internal.ProtobufList<Prompt> protobufList = this.prompts_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.prompts_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Rendering getDefaultInstance() {
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
        public void mergeButtonDisclaimer(Common$HyperlinkContent common$HyperlinkContent) {
            common$HyperlinkContent.getClass();
            Common$HyperlinkContent common$HyperlinkContent2 = this.buttonDisclaimer_;
            if (common$HyperlinkContent2 != null && common$HyperlinkContent2 != Common$HyperlinkContent.getDefaultInstance()) {
                this.buttonDisclaimer_ = Common$HyperlinkContent.newBuilder(this.buttonDisclaimer_).mergeFrom((Common$HyperlinkContent.a) common$HyperlinkContent).buildPartial();
            } else {
                this.buttonDisclaimer_ = common$HyperlinkContent;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeButtonDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.buttonDisclaimerText_;
            if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
                this.buttonDisclaimerText_ = Common$AttributedLocalizedString.newBuilder(this.buttonDisclaimerText_).mergeFrom((Common$AttributedLocalizedString.b) common$AttributedLocalizedString).buildPartial();
            } else {
                this.buttonDisclaimerText_ = common$AttributedLocalizedString;
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
        public void mergeSecondaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
            if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
                this.secondaryButton_ = Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((Common$ButtonContent.a) common$ButtonContent).buildPartial();
            } else {
                this.secondaryButton_ = common$ButtonContent;
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
        public void removePrompts(int i11) {
            ensurePromptsIsMutable();
            this.prompts_.remove(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.button_ = common$ButtonContent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonDisclaimer(Common$HyperlinkContent common$HyperlinkContent) {
            common$HyperlinkContent.getClass();
            this.buttonDisclaimer_ = common$HyperlinkContent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.buttonDisclaimerText_ = common$AttributedLocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisplayMode(o1 o1Var) {
            this.displayMode_ = o1Var.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisplayModeValue(int i11) {
            this.displayMode_ = i11;
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
        public void setHeaderAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            this.headerAsset_ = common$RenderedAssetAppearance;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInstitution(Common$RenderedInstitution common$RenderedInstitution) {
            common$RenderedInstitution.getClass();
            this.institution_ = common$RenderedInstitution;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaneHeader(Common$PaneHeader common$PaneHeader) {
            common$PaneHeader.getClass();
            this.paneHeader_ = common$PaneHeader;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrompts(int i11, Prompt prompt) {
            prompt.getClass();
            ensurePromptsIsMutable();
            this.prompts_.set(i11, prompt);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.secondaryButton_ = common$ButtonContent;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (kc.f18938a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0002\r\u000b\u0000\u0001\u0000\u0002\t\u0004\t\u0005\t\u0006\u001b\u0007\t\b\t\t\t\n\t\u000b\f\f\t\r\t", new Object[]{"institution_", "headerAsset_", "header_", "prompts_", Prompt.class, "buttonDisclaimer_", "button_", "secondaryButton_", "events_", "displayMode_", "buttonDisclaimerText_", "paneHeader_"});
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

        public Common$ButtonContent getButton() {
            Common$ButtonContent common$ButtonContent = this.button_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$HyperlinkContent getButtonDisclaimer() {
            Common$HyperlinkContent common$HyperlinkContent = this.buttonDisclaimer_;
            return common$HyperlinkContent == null ? Common$HyperlinkContent.getDefaultInstance() : common$HyperlinkContent;
        }

        public Common$AttributedLocalizedString getButtonDisclaimerText() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.buttonDisclaimerText_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public o1 getDisplayMode() {
            o1 forNumber = o1.forNumber(this.displayMode_);
            return forNumber == null ? o1.UNRECOGNIZED : forNumber;
        }

        public int getDisplayModeValue() {
            return this.displayMode_;
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public Common$LocalizedString getHeader() {
            Common$LocalizedString common$LocalizedString = this.header_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$RenderedAssetAppearance getHeaderAsset() {
            Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.headerAsset_;
            return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
        }

        public Common$RenderedInstitution getInstitution() {
            Common$RenderedInstitution common$RenderedInstitution = this.institution_;
            return common$RenderedInstitution == null ? Common$RenderedInstitution.getDefaultInstance() : common$RenderedInstitution;
        }

        public Common$PaneHeader getPaneHeader() {
            Common$PaneHeader common$PaneHeader = this.paneHeader_;
            return common$PaneHeader == null ? Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
        }

        public Prompt getPrompts(int i11) {
            return this.prompts_.get(i11);
        }

        public int getPromptsCount() {
            return this.prompts_.size();
        }

        public List<Prompt> getPromptsList() {
            return this.prompts_;
        }

        public b getPromptsOrBuilder(int i11) {
            return this.prompts_.get(i11);
        }

        public List<? extends b> getPromptsOrBuilderList() {
            return this.prompts_;
        }

        public Common$ButtonContent getSecondaryButton() {
            Common$ButtonContent common$ButtonContent = this.secondaryButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public boolean hasButton() {
            return this.button_ != null;
        }

        public boolean hasButtonDisclaimer() {
            return this.buttonDisclaimer_ != null;
        }

        public boolean hasButtonDisclaimerText() {
            return this.buttonDisclaimerText_ != null;
        }

        public boolean hasEvents() {
            return this.events_ != null;
        }

        public boolean hasHeader() {
            return this.header_ != null;
        }

        public boolean hasHeaderAsset() {
            return this.headerAsset_ != null;
        }

        public boolean hasInstitution() {
            return this.institution_ != null;
        }

        public boolean hasPaneHeader() {
            return this.paneHeader_ != null;
        }

        public boolean hasSecondaryButton() {
            return this.secondaryButton_ != null;
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
        public void addPrompts(int i11, Prompt prompt) {
            prompt.getClass();
            ensurePromptsIsMutable();
            this.prompts_.add(i11, prompt);
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
    public static final class a extends GeneratedMessageLite.Builder<UserInput$UserInputPane, a> implements MessageLiteOrBuilder {
        public a() {
            super(UserInput$UserInputPane.DEFAULT_INSTANCE);
        }
    }

    static {
        UserInput$UserInputPane userInput$UserInputPane = new UserInput$UserInputPane();
        DEFAULT_INSTANCE = userInput$UserInputPane;
        GeneratedMessageLite.registerDefaultInstance(UserInput$UserInputPane.class, userInput$UserInputPane);
    }

    private UserInput$UserInputPane() {
    }

    public static UserInput$UserInputPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserInput$UserInputPane parseDelimitedFrom(InputStream inputStream) {
        return (UserInput$UserInputPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserInput$UserInputPane parseFrom(ByteBuffer byteBuffer) {
        return (UserInput$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserInput$UserInputPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (kc.f18938a[methodToInvoke.ordinal()]) {
            case 1:
                return new UserInput$UserInputPane();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserInput$UserInputPane> parser = PARSER;
                if (parser == null) {
                    synchronized (UserInput$UserInputPane.class) {
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

    public static a newBuilder(UserInput$UserInputPane userInput$UserInputPane) {
        return DEFAULT_INSTANCE.createBuilder(userInput$UserInputPane);
    }

    public static UserInput$UserInputPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UserInput$UserInputPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserInput$UserInputPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (UserInput$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserInput$UserInputPane parseFrom(ByteString byteString) {
        return (UserInput$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserInput$UserInputPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (UserInput$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserInput$UserInputPane parseFrom(byte[] bArr) {
        return (UserInput$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserInput$UserInputPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (UserInput$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserInput$UserInputPane parseFrom(InputStream inputStream) {
        return (UserInput$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserInput$UserInputPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UserInput$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserInput$UserInputPane parseFrom(CodedInputStream codedInputStream) {
        return (UserInput$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserInput$UserInputPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UserInput$UserInputPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}