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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.p;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class ButtonList$ButtonListPane extends GeneratedMessageLite<ButtonList$ButtonListPane, a> implements MessageLiteOrBuilder {
    private static final ButtonList$ButtonListPane DEFAULT_INSTANCE;
    private static volatile Parser<ButtonList$ButtonListPane> PARSER;

    /* loaded from: classes2.dex */
    public static final class Actions extends GeneratedMessageLite<Actions, b> implements MessageLiteOrBuilder {
        public static final int BUTTON_FIVE_TAP_FIELD_NUMBER = 5;
        public static final int BUTTON_FOUR_TAP_FIELD_NUMBER = 4;
        public static final int BUTTON_ONE_TAP_FIELD_NUMBER = 1;
        public static final int BUTTON_THREE_TAP_FIELD_NUMBER = 3;
        public static final int BUTTON_TWO_TAP_FIELD_NUMBER = 2;
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 6;
        private static volatile Parser<Actions> PARSER;
        private int actionCase_ = 0;
        private Object action_;

        /* loaded from: classes2.dex */
        public static final class ButtonFiveTapAction extends GeneratedMessageLite<ButtonFiveTapAction, a> implements MessageLiteOrBuilder {
            private static final ButtonFiveTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonFiveTapAction> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<ButtonFiveTapAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(ButtonFiveTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ButtonFiveTapAction buttonFiveTapAction = new ButtonFiveTapAction();
                DEFAULT_INSTANCE = buttonFiveTapAction;
                GeneratedMessageLite.registerDefaultInstance(ButtonFiveTapAction.class, buttonFiveTapAction);
            }

            private ButtonFiveTapAction() {
            }

            public static ButtonFiveTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ButtonFiveTapAction parseDelimitedFrom(InputStream inputStream) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonFiveTapAction parseFrom(ByteBuffer byteBuffer) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ButtonFiveTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (p.f19196a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonFiveTapAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ButtonFiveTapAction> parser = PARSER;
                        if (parser == null) {
                            synchronized (ButtonFiveTapAction.class) {
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

            public static a newBuilder(ButtonFiveTapAction buttonFiveTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonFiveTapAction);
            }

            public static ButtonFiveTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonFiveTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ButtonFiveTapAction parseFrom(ByteString byteString) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ButtonFiveTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ButtonFiveTapAction parseFrom(byte[] bArr) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ButtonFiveTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ButtonFiveTapAction parseFrom(InputStream inputStream) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonFiveTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonFiveTapAction parseFrom(CodedInputStream codedInputStream) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ButtonFiveTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFiveTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class ButtonFourTapAction extends GeneratedMessageLite<ButtonFourTapAction, a> implements MessageLiteOrBuilder {
            private static final ButtonFourTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonFourTapAction> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<ButtonFourTapAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(ButtonFourTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ButtonFourTapAction buttonFourTapAction = new ButtonFourTapAction();
                DEFAULT_INSTANCE = buttonFourTapAction;
                GeneratedMessageLite.registerDefaultInstance(ButtonFourTapAction.class, buttonFourTapAction);
            }

            private ButtonFourTapAction() {
            }

            public static ButtonFourTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ButtonFourTapAction parseDelimitedFrom(InputStream inputStream) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonFourTapAction parseFrom(ByteBuffer byteBuffer) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ButtonFourTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (p.f19196a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonFourTapAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ButtonFourTapAction> parser = PARSER;
                        if (parser == null) {
                            synchronized (ButtonFourTapAction.class) {
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

            public static a newBuilder(ButtonFourTapAction buttonFourTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonFourTapAction);
            }

            public static ButtonFourTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonFourTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ButtonFourTapAction parseFrom(ByteString byteString) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ButtonFourTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ButtonFourTapAction parseFrom(byte[] bArr) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ButtonFourTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ButtonFourTapAction parseFrom(InputStream inputStream) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonFourTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonFourTapAction parseFrom(CodedInputStream codedInputStream) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ButtonFourTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonFourTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class ButtonOneTapAction extends GeneratedMessageLite<ButtonOneTapAction, a> implements MessageLiteOrBuilder {
            private static final ButtonOneTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonOneTapAction> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<ButtonOneTapAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(ButtonOneTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ButtonOneTapAction buttonOneTapAction = new ButtonOneTapAction();
                DEFAULT_INSTANCE = buttonOneTapAction;
                GeneratedMessageLite.registerDefaultInstance(ButtonOneTapAction.class, buttonOneTapAction);
            }

            private ButtonOneTapAction() {
            }

            public static ButtonOneTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ButtonOneTapAction parseDelimitedFrom(InputStream inputStream) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonOneTapAction parseFrom(ByteBuffer byteBuffer) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ButtonOneTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (p.f19196a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonOneTapAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ButtonOneTapAction> parser = PARSER;
                        if (parser == null) {
                            synchronized (ButtonOneTapAction.class) {
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

            public static a newBuilder(ButtonOneTapAction buttonOneTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonOneTapAction);
            }

            public static ButtonOneTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonOneTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ButtonOneTapAction parseFrom(ByteString byteString) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ButtonOneTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ButtonOneTapAction parseFrom(byte[] bArr) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ButtonOneTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ButtonOneTapAction parseFrom(InputStream inputStream) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonOneTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonOneTapAction parseFrom(CodedInputStream codedInputStream) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ButtonOneTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOneTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class ButtonThreeTapAction extends GeneratedMessageLite<ButtonThreeTapAction, a> implements MessageLiteOrBuilder {
            private static final ButtonThreeTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonThreeTapAction> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<ButtonThreeTapAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(ButtonThreeTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ButtonThreeTapAction buttonThreeTapAction = new ButtonThreeTapAction();
                DEFAULT_INSTANCE = buttonThreeTapAction;
                GeneratedMessageLite.registerDefaultInstance(ButtonThreeTapAction.class, buttonThreeTapAction);
            }

            private ButtonThreeTapAction() {
            }

            public static ButtonThreeTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ButtonThreeTapAction parseDelimitedFrom(InputStream inputStream) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonThreeTapAction parseFrom(ByteBuffer byteBuffer) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ButtonThreeTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (p.f19196a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonThreeTapAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ButtonThreeTapAction> parser = PARSER;
                        if (parser == null) {
                            synchronized (ButtonThreeTapAction.class) {
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

            public static a newBuilder(ButtonThreeTapAction buttonThreeTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonThreeTapAction);
            }

            public static ButtonThreeTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonThreeTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ButtonThreeTapAction parseFrom(ByteString byteString) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ButtonThreeTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ButtonThreeTapAction parseFrom(byte[] bArr) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ButtonThreeTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ButtonThreeTapAction parseFrom(InputStream inputStream) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonThreeTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonThreeTapAction parseFrom(CodedInputStream codedInputStream) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ButtonThreeTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonThreeTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class ButtonTwoTapAction extends GeneratedMessageLite<ButtonTwoTapAction, a> implements MessageLiteOrBuilder {
            private static final ButtonTwoTapAction DEFAULT_INSTANCE;
            private static volatile Parser<ButtonTwoTapAction> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<ButtonTwoTapAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(ButtonTwoTapAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ButtonTwoTapAction buttonTwoTapAction = new ButtonTwoTapAction();
                DEFAULT_INSTANCE = buttonTwoTapAction;
                GeneratedMessageLite.registerDefaultInstance(ButtonTwoTapAction.class, buttonTwoTapAction);
            }

            private ButtonTwoTapAction() {
            }

            public static ButtonTwoTapAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ButtonTwoTapAction parseDelimitedFrom(InputStream inputStream) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonTwoTapAction parseFrom(ByteBuffer byteBuffer) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ButtonTwoTapAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (p.f19196a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonTwoTapAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ButtonTwoTapAction> parser = PARSER;
                        if (parser == null) {
                            synchronized (ButtonTwoTapAction.class) {
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

            public static a newBuilder(ButtonTwoTapAction buttonTwoTapAction) {
                return DEFAULT_INSTANCE.createBuilder(buttonTwoTapAction);
            }

            public static ButtonTwoTapAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonTwoTapAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ButtonTwoTapAction parseFrom(ByteString byteString) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ButtonTwoTapAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ButtonTwoTapAction parseFrom(byte[] bArr) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ButtonTwoTapAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ButtonTwoTapAction parseFrom(InputStream inputStream) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonTwoTapAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonTwoTapAction parseFrom(CodedInputStream codedInputStream) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ButtonTwoTapAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonTwoTapAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
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
                switch (p.f19196a[methodToInvoke.ordinal()]) {
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
        public enum a {
            BUTTON_ONE_TAP(1),
            BUTTON_TWO_TAP(2),
            BUTTON_THREE_TAP(3),
            BUTTON_FOUR_TAP(4),
            BUTTON_FIVE_TAP(5),
            EXIT(6),
            ACTION_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            public final int f18329a;

            a(int i11) {
                this.f18329a = i11;
            }

            public static a forNumber(int i11) {
                switch (i11) {
                    case 0:
                        return ACTION_NOT_SET;
                    case 1:
                        return BUTTON_ONE_TAP;
                    case 2:
                        return BUTTON_TWO_TAP;
                    case 3:
                        return BUTTON_THREE_TAP;
                    case 4:
                        return BUTTON_FOUR_TAP;
                    case 5:
                        return BUTTON_FIVE_TAP;
                    case 6:
                        return EXIT;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.f18329a;
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
        public void clearButtonFiveTap() {
            if (this.actionCase_ == 5) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtonFourTap() {
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtonOneTap() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtonThreeTap() {
            if (this.actionCase_ == 3) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtonTwoTap() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExit() {
            if (this.actionCase_ == 6) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeButtonFiveTap(ButtonFiveTapAction buttonFiveTapAction) {
            buttonFiveTapAction.getClass();
            if (this.actionCase_ == 5 && this.action_ != ButtonFiveTapAction.getDefaultInstance()) {
                this.action_ = ButtonFiveTapAction.newBuilder((ButtonFiveTapAction) this.action_).mergeFrom((ButtonFiveTapAction.a) buttonFiveTapAction).buildPartial();
            } else {
                this.action_ = buttonFiveTapAction;
            }
            this.actionCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeButtonFourTap(ButtonFourTapAction buttonFourTapAction) {
            buttonFourTapAction.getClass();
            if (this.actionCase_ == 4 && this.action_ != ButtonFourTapAction.getDefaultInstance()) {
                this.action_ = ButtonFourTapAction.newBuilder((ButtonFourTapAction) this.action_).mergeFrom((ButtonFourTapAction.a) buttonFourTapAction).buildPartial();
            } else {
                this.action_ = buttonFourTapAction;
            }
            this.actionCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeButtonOneTap(ButtonOneTapAction buttonOneTapAction) {
            buttonOneTapAction.getClass();
            if (this.actionCase_ == 1 && this.action_ != ButtonOneTapAction.getDefaultInstance()) {
                this.action_ = ButtonOneTapAction.newBuilder((ButtonOneTapAction) this.action_).mergeFrom((ButtonOneTapAction.a) buttonOneTapAction).buildPartial();
            } else {
                this.action_ = buttonOneTapAction;
            }
            this.actionCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeButtonThreeTap(ButtonThreeTapAction buttonThreeTapAction) {
            buttonThreeTapAction.getClass();
            if (this.actionCase_ == 3 && this.action_ != ButtonThreeTapAction.getDefaultInstance()) {
                this.action_ = ButtonThreeTapAction.newBuilder((ButtonThreeTapAction) this.action_).mergeFrom((ButtonThreeTapAction.a) buttonThreeTapAction).buildPartial();
            } else {
                this.action_ = buttonThreeTapAction;
            }
            this.actionCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeButtonTwoTap(ButtonTwoTapAction buttonTwoTapAction) {
            buttonTwoTapAction.getClass();
            if (this.actionCase_ == 2 && this.action_ != ButtonTwoTapAction.getDefaultInstance()) {
                this.action_ = ButtonTwoTapAction.newBuilder((ButtonTwoTapAction) this.action_).mergeFrom((ButtonTwoTapAction.a) buttonTwoTapAction).buildPartial();
            } else {
                this.action_ = buttonTwoTapAction;
            }
            this.actionCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExit(ExitAction exitAction) {
            exitAction.getClass();
            if (this.actionCase_ == 6 && this.action_ != ExitAction.getDefaultInstance()) {
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.a) exitAction).buildPartial();
            } else {
                this.action_ = exitAction;
            }
            this.actionCase_ = 6;
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
        public void setButtonFiveTap(ButtonFiveTapAction buttonFiveTapAction) {
            buttonFiveTapAction.getClass();
            this.action_ = buttonFiveTapAction;
            this.actionCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonFourTap(ButtonFourTapAction buttonFourTapAction) {
            buttonFourTapAction.getClass();
            this.action_ = buttonFourTapAction;
            this.actionCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonOneTap(ButtonOneTapAction buttonOneTapAction) {
            buttonOneTapAction.getClass();
            this.action_ = buttonOneTapAction;
            this.actionCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonThreeTap(ButtonThreeTapAction buttonThreeTapAction) {
            buttonThreeTapAction.getClass();
            this.action_ = buttonThreeTapAction;
            this.actionCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonTwoTap(ButtonTwoTapAction buttonTwoTapAction) {
            buttonTwoTapAction.getClass();
            this.action_ = buttonTwoTapAction;
            this.actionCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExit(ExitAction exitAction) {
            exitAction.getClass();
            this.action_ = exitAction;
            this.actionCase_ = 6;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (p.f19196a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"action_", "actionCase_", ButtonOneTapAction.class, ButtonTwoTapAction.class, ButtonThreeTapAction.class, ButtonFourTapAction.class, ButtonFiveTapAction.class, ExitAction.class});
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

        public ButtonFiveTapAction getButtonFiveTap() {
            if (this.actionCase_ == 5) {
                return (ButtonFiveTapAction) this.action_;
            }
            return ButtonFiveTapAction.getDefaultInstance();
        }

        public ButtonFourTapAction getButtonFourTap() {
            if (this.actionCase_ == 4) {
                return (ButtonFourTapAction) this.action_;
            }
            return ButtonFourTapAction.getDefaultInstance();
        }

        public ButtonOneTapAction getButtonOneTap() {
            if (this.actionCase_ == 1) {
                return (ButtonOneTapAction) this.action_;
            }
            return ButtonOneTapAction.getDefaultInstance();
        }

        public ButtonThreeTapAction getButtonThreeTap() {
            if (this.actionCase_ == 3) {
                return (ButtonThreeTapAction) this.action_;
            }
            return ButtonThreeTapAction.getDefaultInstance();
        }

        public ButtonTwoTapAction getButtonTwoTap() {
            if (this.actionCase_ == 2) {
                return (ButtonTwoTapAction) this.action_;
            }
            return ButtonTwoTapAction.getDefaultInstance();
        }

        public ExitAction getExit() {
            if (this.actionCase_ == 6) {
                return (ExitAction) this.action_;
            }
            return ExitAction.getDefaultInstance();
        }

        public boolean hasButtonFiveTap() {
            return this.actionCase_ == 5;
        }

        public boolean hasButtonFourTap() {
            return this.actionCase_ == 4;
        }

        public boolean hasButtonOneTap() {
            return this.actionCase_ == 1;
        }

        public boolean hasButtonThreeTap() {
            return this.actionCase_ == 3;
        }

        public boolean hasButtonTwoTap() {
            return this.actionCase_ == 2;
        }

        public boolean hasExit() {
            return this.actionCase_ == 6;
        }

        /* loaded from: classes2.dex */
        public static final class b extends GeneratedMessageLite.Builder<Actions, b> implements MessageLiteOrBuilder {
            public b() {
                super(Actions.DEFAULT_INSTANCE);
            }

            public b a(ButtonOneTapAction buttonOneTapAction) {
                copyOnWrite();
                ((Actions) this.instance).setButtonOneTap(buttonOneTapAction);
                return this;
            }

            public b a(ButtonTwoTapAction buttonTwoTapAction) {
                copyOnWrite();
                ((Actions) this.instance).setButtonTwoTap(buttonTwoTapAction);
                return this;
            }

            public b a(ButtonThreeTapAction buttonThreeTapAction) {
                copyOnWrite();
                ((Actions) this.instance).setButtonThreeTap(buttonThreeTapAction);
                return this;
            }

            public b a(ButtonFourTapAction buttonFourTapAction) {
                copyOnWrite();
                ((Actions) this.instance).setButtonFourTap(buttonFourTapAction);
                return this;
            }

            public b a(ButtonFiveTapAction buttonFiveTapAction) {
                copyOnWrite();
                ((Actions) this.instance).setButtonFiveTap(buttonFiveTapAction);
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
        public static final int BUTTON_FIVE_FIELD_NUMBER = 12;
        public static final int BUTTON_FOUR_FIELD_NUMBER = 11;
        public static final int BUTTON_ONE_FIELD_NUMBER = 8;
        public static final int BUTTON_THREE_FIELD_NUMBER = 10;
        public static final int BUTTON_TWO_FIELD_NUMBER = 9;
        private static final Rendering DEFAULT_INSTANCE;
        public static final int DISCLAIMER_FIELD_NUMBER = 13;
        public static final int EVENTS_FIELD_NUMBER = 14;
        public static final int INSTITUTION_FIELD_NUMBER = 2;
        public static final int MESSAGE_DETAIL_FIELD_NUMBER = 7;
        public static final int MESSAGE_FIELD_NUMBER = 6;
        public static final int PANE_HEADER_FIELD_NUMBER = 15;
        private static volatile Parser<Rendering> PARSER;
        private Common$ButtonContent buttonFive_;
        private Common$ButtonContent buttonFour_;
        private Common$ButtonContent buttonOne_;
        private Common$ButtonContent buttonThree_;
        private Common$ButtonContent buttonTwo_;
        private Common$LocalizedString disclaimer_;
        private Events events_;
        private Common$RenderedInstitution institution_;
        private Common$LocalizedString messageDetail_;
        private Common$LocalizedString message_;
        private Common$PaneHeader paneHeader_;

        /* loaded from: classes2.dex */
        public static final class Events extends GeneratedMessageLite<Events, a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_BUTTON_FIVE_TAP_FIELD_NUMBER = 7;
            public static final int ON_BUTTON_FOUR_TAP_FIELD_NUMBER = 6;
            public static final int ON_BUTTON_ONE_TAP_FIELD_NUMBER = 2;
            public static final int ON_BUTTON_THREE_TAP_FIELD_NUMBER = 5;
            public static final int ON_BUTTON_TWO_TAP_FIELD_NUMBER = 3;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Common$SDKEvent onButtonFiveTap_;
            private Common$SDKEvent onButtonFourTap_;
            private Common$SDKEvent onButtonOneTap_;
            private Common$SDKEvent onButtonThreeTap_;
            private Common$SDKEvent onButtonTwoTap_;

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
            public void clearOnButtonFiveTap() {
                this.onButtonFiveTap_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnButtonFourTap() {
                this.onButtonFourTap_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnButtonOneTap() {
                this.onButtonOneTap_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnButtonThreeTap() {
                this.onButtonThreeTap_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnButtonTwoTap() {
                this.onButtonTwoTap_ = null;
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
            public void mergeOnButtonFiveTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onButtonFiveTap_;
                if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonFiveTap_ = Common$SDKEvent.newBuilder(this.onButtonFiveTap_).mergeFrom((Common$SDKEvent.a) common$SDKEvent).buildPartial();
                } else {
                    this.onButtonFiveTap_ = common$SDKEvent;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeOnButtonFourTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onButtonFourTap_;
                if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonFourTap_ = Common$SDKEvent.newBuilder(this.onButtonFourTap_).mergeFrom((Common$SDKEvent.a) common$SDKEvent).buildPartial();
                } else {
                    this.onButtonFourTap_ = common$SDKEvent;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeOnButtonOneTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onButtonOneTap_;
                if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonOneTap_ = Common$SDKEvent.newBuilder(this.onButtonOneTap_).mergeFrom((Common$SDKEvent.a) common$SDKEvent).buildPartial();
                } else {
                    this.onButtonOneTap_ = common$SDKEvent;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeOnButtonThreeTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onButtonThreeTap_;
                if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonThreeTap_ = Common$SDKEvent.newBuilder(this.onButtonThreeTap_).mergeFrom((Common$SDKEvent.a) common$SDKEvent).buildPartial();
                } else {
                    this.onButtonThreeTap_ = common$SDKEvent;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeOnButtonTwoTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onButtonTwoTap_;
                if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
                    this.onButtonTwoTap_ = Common$SDKEvent.newBuilder(this.onButtonTwoTap_).mergeFrom((Common$SDKEvent.a) common$SDKEvent).buildPartial();
                } else {
                    this.onButtonTwoTap_ = common$SDKEvent;
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
            public void setOnButtonFiveTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onButtonFiveTap_ = common$SDKEvent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnButtonFourTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onButtonFourTap_ = common$SDKEvent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnButtonOneTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onButtonOneTap_ = common$SDKEvent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnButtonThreeTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onButtonThreeTap_ = common$SDKEvent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnButtonTwoTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onButtonTwoTap_ = common$SDKEvent;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (p.f19196a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t\u0005\t\u0006\t\u0007\t", new Object[]{"onAppear_", Common$SDKEvent.class, "onButtonOneTap_", "onButtonTwoTap_", "onButtonThreeTap_", "onButtonFourTap_", "onButtonFiveTap_"});
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

            public Common$SDKEvent getOnButtonFiveTap() {
                Common$SDKEvent common$SDKEvent = this.onButtonFiveTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnButtonFourTap() {
                Common$SDKEvent common$SDKEvent = this.onButtonFourTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnButtonOneTap() {
                Common$SDKEvent common$SDKEvent = this.onButtonOneTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnButtonThreeTap() {
                Common$SDKEvent common$SDKEvent = this.onButtonThreeTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnButtonTwoTap() {
                Common$SDKEvent common$SDKEvent = this.onButtonTwoTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public boolean hasOnButtonFiveTap() {
                return this.onButtonFiveTap_ != null;
            }

            public boolean hasOnButtonFourTap() {
                return this.onButtonFourTap_ != null;
            }

            public boolean hasOnButtonOneTap() {
                return this.onButtonOneTap_ != null;
            }

            public boolean hasOnButtonThreeTap() {
                return this.onButtonThreeTap_ != null;
            }

            public boolean hasOnButtonTwoTap() {
                return this.onButtonTwoTap_ != null;
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
        public void clearButtonFive() {
            this.buttonFive_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtonFour() {
            this.buttonFour_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtonOne() {
            this.buttonOne_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtonThree() {
            this.buttonThree_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtonTwo() {
            this.buttonTwo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisclaimer() {
            this.disclaimer_ = null;
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
        public void clearMessage() {
            this.message_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessageDetail() {
            this.messageDetail_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaneHeader() {
            this.paneHeader_ = null;
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeButtonFive(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.buttonFive_;
            if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
                this.buttonFive_ = Common$ButtonContent.newBuilder(this.buttonFive_).mergeFrom((Common$ButtonContent.a) common$ButtonContent).buildPartial();
            } else {
                this.buttonFive_ = common$ButtonContent;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeButtonFour(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.buttonFour_;
            if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
                this.buttonFour_ = Common$ButtonContent.newBuilder(this.buttonFour_).mergeFrom((Common$ButtonContent.a) common$ButtonContent).buildPartial();
            } else {
                this.buttonFour_ = common$ButtonContent;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeButtonOne(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.buttonOne_;
            if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
                this.buttonOne_ = Common$ButtonContent.newBuilder(this.buttonOne_).mergeFrom((Common$ButtonContent.a) common$ButtonContent).buildPartial();
            } else {
                this.buttonOne_ = common$ButtonContent;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeButtonThree(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.buttonThree_;
            if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
                this.buttonThree_ = Common$ButtonContent.newBuilder(this.buttonThree_).mergeFrom((Common$ButtonContent.a) common$ButtonContent).buildPartial();
            } else {
                this.buttonThree_ = common$ButtonContent;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeButtonTwo(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.buttonTwo_;
            if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
                this.buttonTwo_ = Common$ButtonContent.newBuilder(this.buttonTwo_).mergeFrom((Common$ButtonContent.a) common$ButtonContent).buildPartial();
            } else {
                this.buttonTwo_ = common$ButtonContent;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDisclaimer(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.disclaimer_;
            if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                this.disclaimer_ = Common$LocalizedString.newBuilder(this.disclaimer_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
            } else {
                this.disclaimer_ = common$LocalizedString;
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
        public void mergeMessage(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.message_;
            if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                this.message_ = Common$LocalizedString.newBuilder(this.message_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
            } else {
                this.message_ = common$LocalizedString;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMessageDetail(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.messageDetail_;
            if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                this.messageDetail_ = Common$LocalizedString.newBuilder(this.messageDetail_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
            } else {
                this.messageDetail_ = common$LocalizedString;
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
        public void setButtonFive(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.buttonFive_ = common$ButtonContent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonFour(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.buttonFour_ = common$ButtonContent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonOne(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.buttonOne_ = common$ButtonContent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonThree(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.buttonThree_ = common$ButtonContent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonTwo(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.buttonTwo_ = common$ButtonContent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisclaimer(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.disclaimer_ = common$LocalizedString;
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
        public void setMessage(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.message_ = common$LocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageDetail(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.messageDetail_ = common$LocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaneHeader(Common$PaneHeader common$PaneHeader) {
            common$PaneHeader.getClass();
            this.paneHeader_ = common$PaneHeader;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (p.f19196a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0002\u000f\u000b\u0000\u0000\u0000\u0002\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\t\u000f\t", new Object[]{"institution_", "message_", "messageDetail_", "buttonOne_", "buttonTwo_", "buttonThree_", "buttonFour_", "buttonFive_", "disclaimer_", "events_", "paneHeader_"});
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

        public Common$ButtonContent getButtonFive() {
            Common$ButtonContent common$ButtonContent = this.buttonFive_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$ButtonContent getButtonFour() {
            Common$ButtonContent common$ButtonContent = this.buttonFour_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$ButtonContent getButtonOne() {
            Common$ButtonContent common$ButtonContent = this.buttonOne_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$ButtonContent getButtonThree() {
            Common$ButtonContent common$ButtonContent = this.buttonThree_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$ButtonContent getButtonTwo() {
            Common$ButtonContent common$ButtonContent = this.buttonTwo_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$LocalizedString getDisclaimer() {
            Common$LocalizedString common$LocalizedString = this.disclaimer_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public Common$RenderedInstitution getInstitution() {
            Common$RenderedInstitution common$RenderedInstitution = this.institution_;
            return common$RenderedInstitution == null ? Common$RenderedInstitution.getDefaultInstance() : common$RenderedInstitution;
        }

        public Common$LocalizedString getMessage() {
            Common$LocalizedString common$LocalizedString = this.message_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$LocalizedString getMessageDetail() {
            Common$LocalizedString common$LocalizedString = this.messageDetail_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Common$PaneHeader getPaneHeader() {
            Common$PaneHeader common$PaneHeader = this.paneHeader_;
            return common$PaneHeader == null ? Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
        }

        public boolean hasButtonFive() {
            return this.buttonFive_ != null;
        }

        public boolean hasButtonFour() {
            return this.buttonFour_ != null;
        }

        public boolean hasButtonOne() {
            return this.buttonOne_ != null;
        }

        public boolean hasButtonThree() {
            return this.buttonThree_ != null;
        }

        public boolean hasButtonTwo() {
            return this.buttonTwo_ != null;
        }

        public boolean hasDisclaimer() {
            return this.disclaimer_ != null;
        }

        public boolean hasEvents() {
            return this.events_ != null;
        }

        public boolean hasInstitution() {
            return this.institution_ != null;
        }

        public boolean hasMessage() {
            return this.message_ != null;
        }

        public boolean hasMessageDetail() {
            return this.messageDetail_ != null;
        }

        public boolean hasPaneHeader() {
            return this.paneHeader_ != null;
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
    public static final class a extends GeneratedMessageLite.Builder<ButtonList$ButtonListPane, a> implements MessageLiteOrBuilder {
        public a() {
            super(ButtonList$ButtonListPane.DEFAULT_INSTANCE);
        }
    }

    static {
        ButtonList$ButtonListPane buttonList$ButtonListPane = new ButtonList$ButtonListPane();
        DEFAULT_INSTANCE = buttonList$ButtonListPane;
        GeneratedMessageLite.registerDefaultInstance(ButtonList$ButtonListPane.class, buttonList$ButtonListPane);
    }

    private ButtonList$ButtonListPane() {
    }

    public static ButtonList$ButtonListPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ButtonList$ButtonListPane parseDelimitedFrom(InputStream inputStream) {
        return (ButtonList$ButtonListPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ButtonList$ButtonListPane parseFrom(ByteBuffer byteBuffer) {
        return (ButtonList$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ButtonList$ButtonListPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (p.f19196a[methodToInvoke.ordinal()]) {
            case 1:
                return new ButtonList$ButtonListPane();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ButtonList$ButtonListPane> parser = PARSER;
                if (parser == null) {
                    synchronized (ButtonList$ButtonListPane.class) {
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

    public static a newBuilder(ButtonList$ButtonListPane buttonList$ButtonListPane) {
        return DEFAULT_INSTANCE.createBuilder(buttonList$ButtonListPane);
    }

    public static ButtonList$ButtonListPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonList$ButtonListPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ButtonList$ButtonListPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonList$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ButtonList$ButtonListPane parseFrom(ByteString byteString) {
        return (ButtonList$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ButtonList$ButtonListPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonList$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ButtonList$ButtonListPane parseFrom(byte[] bArr) {
        return (ButtonList$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ButtonList$ButtonListPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonList$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ButtonList$ButtonListPane parseFrom(InputStream inputStream) {
        return (ButtonList$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ButtonList$ButtonListPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonList$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ButtonList$ButtonListPane parseFrom(CodedInputStream codedInputStream) {
        return (ButtonList$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ButtonList$ButtonListPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ButtonList$ButtonListPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}