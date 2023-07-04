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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput;
import com.plaid.internal.r2;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Credentials$CredentialsPane extends GeneratedMessageLite<Credentials$CredentialsPane, a> implements MessageLiteOrBuilder {
    private static final Credentials$CredentialsPane DEFAULT_INSTANCE;
    private static volatile Parser<Credentials$CredentialsPane> PARSER;

    /* loaded from: classes2.dex */
    public static final class Actions extends GeneratedMessageLite<Actions, b> implements MessageLiteOrBuilder {
        public static final int BUTTON_TAP_FIELD_NUMBER = 1;
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 3;
        private static volatile Parser<Actions> PARSER = null;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 2;
        private int actionCase_ = 0;
        private Object action_;

        /* loaded from: classes2.dex */
        public static final class ButtonTapAction extends GeneratedMessageLite<ButtonTapAction, a> implements MessageLiteOrBuilder {
            private static final ButtonTapAction DEFAULT_INSTANCE;
            public static final int ENCRYPTED_RESPONSE_FIELD_NUMBER = 2;
            private static volatile Parser<ButtonTapAction> PARSER = null;
            public static final int RESPONSES_FIELD_NUMBER = 1;
            private Internal.ProtobufList<Response> responses_ = GeneratedMessageLite.emptyProtobufList();
            private String encryptedResponse_ = "";

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
                    switch (r2.f19342a[methodToInvoke.ordinal()]) {
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
            public interface b extends MessageLiteOrBuilder {
            }

            static {
                ButtonTapAction buttonTapAction = new ButtonTapAction();
                DEFAULT_INSTANCE = buttonTapAction;
                GeneratedMessageLite.registerDefaultInstance(ButtonTapAction.class, buttonTapAction);
            }

            private ButtonTapAction() {
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
            public void clearEncryptedResponse() {
                this.encryptedResponse_ = getDefaultInstance().getEncryptedResponse();
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

            public static ButtonTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ButtonTapAction parseDelimitedFrom(InputStream inputStream) {
                return (ButtonTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonTapAction parseFrom(ByteBuffer byteBuffer) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ButtonTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeResponses(int i11) {
                ensureResponsesIsMutable();
                this.responses_.remove(i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEncryptedResponse(String str) {
                str.getClass();
                this.encryptedResponse_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEncryptedResponseBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.encryptedResponse_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponses(int i11, Response response) {
                response.getClass();
                ensureResponsesIsMutable();
                this.responses_.set(i11, response);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (r2.f19342a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonTapAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"responses_", Response.class, "encryptedResponse_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ButtonTapAction> parser = PARSER;
                        if (parser == null) {
                            synchronized (ButtonTapAction.class) {
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

            public String getEncryptedResponse() {
                return this.encryptedResponse_;
            }

            public ByteString getEncryptedResponseBytes() {
                return ByteString.copyFromUtf8(this.encryptedResponse_);
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

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<ButtonTapAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(ButtonTapAction.DEFAULT_INSTANCE);
                }

                public a a(Iterable<? extends Response> iterable) {
                    copyOnWrite();
                    ((ButtonTapAction) this.instance).addAllResponses(iterable);
                    return this;
                }

                public a a(String str) {
                    copyOnWrite();
                    ((ButtonTapAction) this.instance).setEncryptedResponse(str);
                    return this;
                }
            }

            public static a newBuilder(ButtonTapAction buttonTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonTapAction);
            }

            public static ButtonTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ButtonTapAction parseFrom(ByteString byteString) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addResponses(int i11, Response response) {
                response.getClass();
                ensureResponsesIsMutable();
                this.responses_.add(i11, response);
            }

            public static ButtonTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ButtonTapAction parseFrom(byte[] bArr) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ButtonTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ButtonTapAction parseFrom(InputStream inputStream) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonTapAction parseFrom(CodedInputStream codedInputStream) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ButtonTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
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
                switch (r2.f19342a[methodToInvoke.ordinal()]) {
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
                switch (r2.f19342a[methodToInvoke.ordinal()]) {
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
        public enum a {
            BUTTON_TAP(1),
            SECONDARY_BUTTON_TAP(2),
            EXIT(3),
            ACTION_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            public final int f18372a;

            a(int i11) {
                this.f18372a = i11;
            }

            public static a forNumber(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                return null;
                            }
                            return EXIT;
                        }
                        return SECONDARY_BUTTON_TAP;
                    }
                    return BUTTON_TAP;
                }
                return ACTION_NOT_SET;
            }

            public int getNumber() {
                return this.f18372a;
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
        public void clearButtonTap() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExit() {
            if (this.actionCase_ == 3) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSecondaryButtonTap() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeButtonTap(ButtonTapAction buttonTapAction) {
            buttonTapAction.getClass();
            if (this.actionCase_ == 1 && this.action_ != ButtonTapAction.getDefaultInstance()) {
                this.action_ = ButtonTapAction.newBuilder((ButtonTapAction) this.action_).mergeFrom((ButtonTapAction.a) buttonTapAction).buildPartial();
            } else {
                this.action_ = buttonTapAction;
            }
            this.actionCase_ = 1;
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
        public void mergeSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            if (this.actionCase_ == 2 && this.action_ != SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = SecondaryButtonTapAction.newBuilder((SecondaryButtonTapAction) this.action_).mergeFrom((SecondaryButtonTapAction.a) secondaryButtonTapAction).buildPartial();
            } else {
                this.action_ = secondaryButtonTapAction;
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
        public void setButtonTap(ButtonTapAction buttonTapAction) {
            buttonTapAction.getClass();
            this.action_ = buttonTapAction;
            this.actionCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExit(ExitAction exitAction) {
            exitAction.getClass();
            this.action_ = exitAction;
            this.actionCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (r2.f19342a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"action_", "actionCase_", ButtonTapAction.class, SecondaryButtonTapAction.class, ExitAction.class});
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

        public ButtonTapAction getButtonTap() {
            if (this.actionCase_ == 1) {
                return (ButtonTapAction) this.action_;
            }
            return ButtonTapAction.getDefaultInstance();
        }

        public ExitAction getExit() {
            if (this.actionCase_ == 3) {
                return (ExitAction) this.action_;
            }
            return ExitAction.getDefaultInstance();
        }

        public SecondaryButtonTapAction getSecondaryButtonTap() {
            if (this.actionCase_ == 2) {
                return (SecondaryButtonTapAction) this.action_;
            }
            return SecondaryButtonTapAction.getDefaultInstance();
        }

        public boolean hasButtonTap() {
            return this.actionCase_ == 1;
        }

        public boolean hasExit() {
            return this.actionCase_ == 3;
        }

        public boolean hasSecondaryButtonTap() {
            return this.actionCase_ == 2;
        }

        /* loaded from: classes2.dex */
        public static final class b extends GeneratedMessageLite.Builder<Actions, b> implements MessageLiteOrBuilder {
            public b() {
                super(Actions.DEFAULT_INSTANCE);
            }

            public b a(ButtonTapAction.a aVar) {
                copyOnWrite();
                ((Actions) this.instance).setButtonTap(aVar.build());
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
        public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 17;
        public static final int BUTTON_FIELD_NUMBER = 10;
        public static final int CONTENT_FIELD_NUMBER = 15;
        private static final Rendering DEFAULT_INSTANCE;
        public static final int ENCRYPTION_FIELD_NUMBER = 14;
        public static final int EVENTS_FIELD_NUMBER = 13;
        public static final int FOOTER_FIELD_NUMBER = 12;
        public static final int FOOTER_TEXT_FIELD_NUMBER = 16;
        public static final int HEADER_FIELD_NUMBER = 6;
        public static final int INPUT_ONE_FIELD_NUMBER = 7;
        public static final int INPUT_THREE_FIELD_NUMBER = 9;
        public static final int INPUT_TWO_FIELD_NUMBER = 8;
        public static final int INSTITUTION_FIELD_NUMBER = 2;
        public static final int PANE_HEADER_FIELD_NUMBER = 18;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int SECONDARY_BUTTON_FIELD_NUMBER = 11;
        private Common$AttributedLocalizedString buttonDisclaimerText_;
        private Common$ButtonContent button_;
        private Common$AttributedLocalizedString content_;
        private Encryption encryption_;
        private Events events_;
        private Common$AttributedLocalizedString footerText_;
        private Common$LocalizedString footer_;
        private Common$LocalizedString header_;
        private Common$TextInput inputOne_;
        private Common$TextInput inputThree_;
        private Common$TextInput inputTwo_;
        private Common$RenderedInstitution institution_;
        private Common$PaneHeader paneHeader_;
        private Common$ButtonContent secondaryButton_;

        /* loaded from: classes2.dex */
        public static final class Encryption extends GeneratedMessageLite<Encryption, a> implements MessageLiteOrBuilder {
            private static final Encryption DEFAULT_INSTANCE;
            public static final int METADATA_FIELD_NUMBER = 1;
            private static volatile Parser<Encryption> PARSER = null;
            public static final int RESPONSE_TEMPLATE_FIELD_NUMBER = 2;
            private Common$SDKEncryptionMetadata metadata_;
            private String responseTemplate_ = "";

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<Encryption, a> implements MessageLiteOrBuilder {
                public a() {
                    super(Encryption.DEFAULT_INSTANCE);
                }
            }

            static {
                Encryption encryption = new Encryption();
                DEFAULT_INSTANCE = encryption;
                GeneratedMessageLite.registerDefaultInstance(Encryption.class, encryption);
            }

            private Encryption() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMetadata() {
                this.metadata_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResponseTemplate() {
                this.responseTemplate_ = getDefaultInstance().getResponseTemplate();
            }

            public static Encryption getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeMetadata(Common$SDKEncryptionMetadata common$SDKEncryptionMetadata) {
                common$SDKEncryptionMetadata.getClass();
                Common$SDKEncryptionMetadata common$SDKEncryptionMetadata2 = this.metadata_;
                if (common$SDKEncryptionMetadata2 != null && common$SDKEncryptionMetadata2 != Common$SDKEncryptionMetadata.getDefaultInstance()) {
                    this.metadata_ = Common$SDKEncryptionMetadata.newBuilder(this.metadata_).mergeFrom((Common$SDKEncryptionMetadata.a) common$SDKEncryptionMetadata).buildPartial();
                } else {
                    this.metadata_ = common$SDKEncryptionMetadata;
                }
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Encryption parseDelimitedFrom(InputStream inputStream) {
                return (Encryption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Encryption parseFrom(ByteBuffer byteBuffer) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Encryption> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMetadata(Common$SDKEncryptionMetadata common$SDKEncryptionMetadata) {
                common$SDKEncryptionMetadata.getClass();
                this.metadata_ = common$SDKEncryptionMetadata;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponseTemplate(String str) {
                str.getClass();
                this.responseTemplate_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponseTemplateBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.responseTemplate_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (r2.f19342a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Encryption();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"metadata_", "responseTemplate_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Encryption> parser = PARSER;
                        if (parser == null) {
                            synchronized (Encryption.class) {
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

            public Common$SDKEncryptionMetadata getMetadata() {
                Common$SDKEncryptionMetadata common$SDKEncryptionMetadata = this.metadata_;
                return common$SDKEncryptionMetadata == null ? Common$SDKEncryptionMetadata.getDefaultInstance() : common$SDKEncryptionMetadata;
            }

            public String getResponseTemplate() {
                return this.responseTemplate_;
            }

            public ByteString getResponseTemplateBytes() {
                return ByteString.copyFromUtf8(this.responseTemplate_);
            }

            public boolean hasMetadata() {
                return this.metadata_ != null;
            }

            public static a newBuilder(Encryption encryption) {
                return DEFAULT_INSTANCE.createBuilder(encryption);
            }

            public static Encryption parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Encryption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Encryption parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Encryption parseFrom(ByteString byteString) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Encryption parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Encryption parseFrom(byte[] bArr) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Encryption parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Encryption parseFrom(InputStream inputStream) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Encryption parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Encryption parseFrom(CodedInputStream codedInputStream) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Encryption parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Encryption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class Events extends GeneratedMessageLite<Events, a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_BUTTON_TAP_FIELD_NUMBER = 2;
            public static final int ON_SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Common$SDKEvent onButtonTap_;
            private Common$SDKEvent onSecondaryButtonTap_;

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
            public void clearOnButtonTap() {
                this.onButtonTap_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnSecondaryButtonTap() {
                this.onSecondaryButtonTap_ = null;
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
            public void mergeOnButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onButtonTap_;
                if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonTap_ = Common$SDKEvent.newBuilder(this.onButtonTap_).mergeFrom((Common$SDKEvent.a) common$SDKEvent).buildPartial();
                } else {
                    this.onButtonTap_ = common$SDKEvent;
                }
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
            public void setOnButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onButtonTap_ = common$SDKEvent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnSecondaryButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSecondaryButtonTap_ = common$SDKEvent;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (r2.f19342a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t", new Object[]{"onAppear_", Common$SDKEvent.class, "onButtonTap_", "onSecondaryButtonTap_"});
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

            public Common$SDKEvent getOnButtonTap() {
                Common$SDKEvent common$SDKEvent = this.onButtonTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnSecondaryButtonTap() {
                Common$SDKEvent common$SDKEvent = this.onSecondaryButtonTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public boolean hasOnButtonTap() {
                return this.onButtonTap_ != null;
            }

            public boolean hasOnSecondaryButtonTap() {
                return this.onSecondaryButtonTap_ != null;
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
        public void clearButton() {
            this.button_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtonDisclaimerText() {
            this.buttonDisclaimerText_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEncryption() {
            this.encryption_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEvents() {
            this.events_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFooter() {
            this.footer_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFooterText() {
            this.footerText_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeader() {
            this.header_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInputOne() {
            this.inputOne_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInputThree() {
            this.inputThree_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInputTwo() {
            this.inputTwo_ = null;
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
        public void clearSecondaryButton() {
            this.secondaryButton_ = null;
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
        public void mergeContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.content_;
            if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
                this.content_ = Common$AttributedLocalizedString.newBuilder(this.content_).mergeFrom((Common$AttributedLocalizedString.b) common$AttributedLocalizedString).buildPartial();
            } else {
                this.content_ = common$AttributedLocalizedString;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEncryption(Encryption encryption) {
            encryption.getClass();
            Encryption encryption2 = this.encryption_;
            if (encryption2 != null && encryption2 != Encryption.getDefaultInstance()) {
                this.encryption_ = Encryption.newBuilder(this.encryption_).mergeFrom((Encryption.a) encryption).buildPartial();
            } else {
                this.encryption_ = encryption;
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
        public void mergeFooter(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.footer_;
            if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                this.footer_ = Common$LocalizedString.newBuilder(this.footer_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
            } else {
                this.footer_ = common$LocalizedString;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFooterText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.footerText_;
            if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
                this.footerText_ = Common$AttributedLocalizedString.newBuilder(this.footerText_).mergeFrom((Common$AttributedLocalizedString.b) common$AttributedLocalizedString).buildPartial();
            } else {
                this.footerText_ = common$AttributedLocalizedString;
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
        public void mergeInputOne(Common$TextInput common$TextInput) {
            common$TextInput.getClass();
            Common$TextInput common$TextInput2 = this.inputOne_;
            if (common$TextInput2 != null && common$TextInput2 != Common$TextInput.getDefaultInstance()) {
                this.inputOne_ = Common$TextInput.newBuilder(this.inputOne_).mergeFrom((Common$TextInput.b) common$TextInput).buildPartial();
            } else {
                this.inputOne_ = common$TextInput;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInputThree(Common$TextInput common$TextInput) {
            common$TextInput.getClass();
            Common$TextInput common$TextInput2 = this.inputThree_;
            if (common$TextInput2 != null && common$TextInput2 != Common$TextInput.getDefaultInstance()) {
                this.inputThree_ = Common$TextInput.newBuilder(this.inputThree_).mergeFrom((Common$TextInput.b) common$TextInput).buildPartial();
            } else {
                this.inputThree_ = common$TextInput;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInputTwo(Common$TextInput common$TextInput) {
            common$TextInput.getClass();
            Common$TextInput common$TextInput2 = this.inputTwo_;
            if (common$TextInput2 != null && common$TextInput2 != Common$TextInput.getDefaultInstance()) {
                this.inputTwo_ = Common$TextInput.newBuilder(this.inputTwo_).mergeFrom((Common$TextInput.b) common$TextInput).buildPartial();
            } else {
                this.inputTwo_ = common$TextInput;
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
        public void setButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.button_ = common$ButtonContent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.buttonDisclaimerText_ = common$AttributedLocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.content_ = common$AttributedLocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEncryption(Encryption encryption) {
            encryption.getClass();
            this.encryption_ = encryption;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFooter(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.footer_ = common$LocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFooterText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.footerText_ = common$AttributedLocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeader(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.header_ = common$LocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInputOne(Common$TextInput common$TextInput) {
            common$TextInput.getClass();
            this.inputOne_ = common$TextInput;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInputThree(Common$TextInput common$TextInput) {
            common$TextInput.getClass();
            this.inputThree_ = common$TextInput;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInputTwo(Common$TextInput common$TextInput) {
            common$TextInput.getClass();
            this.inputTwo_ = common$TextInput;
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
        public void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.secondaryButton_ = common$ButtonContent;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (r2.f19342a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0002\u0012\u000e\u0000\u0000\u0000\u0002\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\t\u000f\t\u0010\t\u0011\t\u0012\t", new Object[]{"institution_", "header_", "inputOne_", "inputTwo_", "inputThree_", "button_", "secondaryButton_", "footer_", "events_", "encryption_", "content_", "footerText_", "buttonDisclaimerText_", "paneHeader_"});
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

        public Common$AttributedLocalizedString getButtonDisclaimerText() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.buttonDisclaimerText_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public Common$AttributedLocalizedString getContent() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.content_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public Encryption getEncryption() {
            Encryption encryption = this.encryption_;
            return encryption == null ? Encryption.getDefaultInstance() : encryption;
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public Common$LocalizedString getFooter() {
            Common$LocalizedString common$LocalizedString = this.footer_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$AttributedLocalizedString getFooterText() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.footerText_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public Common$LocalizedString getHeader() {
            Common$LocalizedString common$LocalizedString = this.header_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$TextInput getInputOne() {
            Common$TextInput common$TextInput = this.inputOne_;
            return common$TextInput == null ? Common$TextInput.getDefaultInstance() : common$TextInput;
        }

        public Common$TextInput getInputThree() {
            Common$TextInput common$TextInput = this.inputThree_;
            return common$TextInput == null ? Common$TextInput.getDefaultInstance() : common$TextInput;
        }

        public Common$TextInput getInputTwo() {
            Common$TextInput common$TextInput = this.inputTwo_;
            return common$TextInput == null ? Common$TextInput.getDefaultInstance() : common$TextInput;
        }

        public Common$RenderedInstitution getInstitution() {
            Common$RenderedInstitution common$RenderedInstitution = this.institution_;
            return common$RenderedInstitution == null ? Common$RenderedInstitution.getDefaultInstance() : common$RenderedInstitution;
        }

        public Common$PaneHeader getPaneHeader() {
            Common$PaneHeader common$PaneHeader = this.paneHeader_;
            return common$PaneHeader == null ? Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
        }

        public Common$ButtonContent getSecondaryButton() {
            Common$ButtonContent common$ButtonContent = this.secondaryButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public boolean hasButton() {
            return this.button_ != null;
        }

        public boolean hasButtonDisclaimerText() {
            return this.buttonDisclaimerText_ != null;
        }

        public boolean hasContent() {
            return this.content_ != null;
        }

        public boolean hasEncryption() {
            return this.encryption_ != null;
        }

        public boolean hasEvents() {
            return this.events_ != null;
        }

        public boolean hasFooter() {
            return this.footer_ != null;
        }

        public boolean hasFooterText() {
            return this.footerText_ != null;
        }

        public boolean hasHeader() {
            return this.header_ != null;
        }

        public boolean hasInputOne() {
            return this.inputOne_ != null;
        }

        public boolean hasInputThree() {
            return this.inputThree_ != null;
        }

        public boolean hasInputTwo() {
            return this.inputTwo_ != null;
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
    public static final class a extends GeneratedMessageLite.Builder<Credentials$CredentialsPane, a> implements MessageLiteOrBuilder {
        public a() {
            super(Credentials$CredentialsPane.DEFAULT_INSTANCE);
        }
    }

    static {
        Credentials$CredentialsPane credentials$CredentialsPane = new Credentials$CredentialsPane();
        DEFAULT_INSTANCE = credentials$CredentialsPane;
        GeneratedMessageLite.registerDefaultInstance(Credentials$CredentialsPane.class, credentials$CredentialsPane);
    }

    private Credentials$CredentialsPane() {
    }

    public static Credentials$CredentialsPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Credentials$CredentialsPane parseDelimitedFrom(InputStream inputStream) {
        return (Credentials$CredentialsPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Credentials$CredentialsPane parseFrom(ByteBuffer byteBuffer) {
        return (Credentials$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Credentials$CredentialsPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (r2.f19342a[methodToInvoke.ordinal()]) {
            case 1:
                return new Credentials$CredentialsPane();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Credentials$CredentialsPane> parser = PARSER;
                if (parser == null) {
                    synchronized (Credentials$CredentialsPane.class) {
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

    public static a newBuilder(Credentials$CredentialsPane credentials$CredentialsPane) {
        return DEFAULT_INSTANCE.createBuilder(credentials$CredentialsPane);
    }

    public static Credentials$CredentialsPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Credentials$CredentialsPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Credentials$CredentialsPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Credentials$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Credentials$CredentialsPane parseFrom(ByteString byteString) {
        return (Credentials$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Credentials$CredentialsPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Credentials$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Credentials$CredentialsPane parseFrom(byte[] bArr) {
        return (Credentials$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Credentials$CredentialsPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Credentials$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Credentials$CredentialsPane parseFrom(InputStream inputStream) {
        return (Credentials$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Credentials$CredentialsPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Credentials$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Credentials$CredentialsPane parseFrom(CodedInputStream codedInputStream) {
        return (Credentials$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Credentials$CredentialsPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Credentials$CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}