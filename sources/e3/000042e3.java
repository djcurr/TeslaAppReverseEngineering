package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.StringValue;
import com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult;
import com.plaid.internal.dc;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Sink$SinkPane extends GeneratedMessageLite<Sink$SinkPane, a> implements MessageLiteOrBuilder {
    private static final Sink$SinkPane DEFAULT_INSTANCE;
    private static volatile Parser<Sink$SinkPane> PARSER;

    /* loaded from: classes2.dex */
    public static final class Actions extends GeneratedMessageLite<Actions, a> implements MessageLiteOrBuilder {
        private static final Actions DEFAULT_INSTANCE;
        private static volatile Parser<Actions> PARSER;

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<Actions, a> implements MessageLiteOrBuilder {
            public a() {
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

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (dc.f18506a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
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

        public static a newBuilder(Actions actions) {
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
        public static final int ERROR_JSON_FIELD_NUMBER = 3;
        public static final int EVENTS_FIELD_NUMBER = 5;
        public static final int HOSTED_TRUSTED_AUTH_CALLBACK_RESULT_FIELD_NUMBER = 7;
        public static final int METADATA_JSON_FIELD_NUMBER = 4;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int PUBLIC_TOKEN_FIELD_NUMBER = 2;
        public static final int REDIRECT_URI_FIELD_NUMBER = 13;
        public static final int RESULT_FIELD_NUMBER = 1;
        public static final int WEBVIEW_REDIRECT_URI_FIELD_NUMBER = 6;
        private Events events_;
        private HostedTrustedAuthCallBackResult hostedTrustedAuthCallbackResult_;
        private StringValue redirectUri_;
        private SdkResult$SDKResult result_;
        private String publicToken_ = "";
        private String errorJson_ = "";
        private String metadataJson_ = "";
        private String webviewRedirectUri_ = "";

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
                switch (dc.f18506a[methodToInvoke.ordinal()]) {
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

            public b getOnAppearOrBuilder(int i11) {
                return this.onAppear_.get(i11);
            }

            public List<? extends b> getOnAppearOrBuilderList() {
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
        public static final class HostedTrustedAuthCallBackResult extends GeneratedMessageLite<HostedTrustedAuthCallBackResult, a> implements MessageLiteOrBuilder {
            public static final int AUTHORIZATION_REDIRECT_URI_FIELD_NUMBER = 1;
            private static final HostedTrustedAuthCallBackResult DEFAULT_INSTANCE;
            private static volatile Parser<HostedTrustedAuthCallBackResult> PARSER;
            private StringValue authorizationRedirectUri_;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<HostedTrustedAuthCallBackResult, a> implements MessageLiteOrBuilder {
                public a() {
                    super(HostedTrustedAuthCallBackResult.DEFAULT_INSTANCE);
                }
            }

            static {
                HostedTrustedAuthCallBackResult hostedTrustedAuthCallBackResult = new HostedTrustedAuthCallBackResult();
                DEFAULT_INSTANCE = hostedTrustedAuthCallBackResult;
                GeneratedMessageLite.registerDefaultInstance(HostedTrustedAuthCallBackResult.class, hostedTrustedAuthCallBackResult);
            }

            private HostedTrustedAuthCallBackResult() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAuthorizationRedirectUri() {
                this.authorizationRedirectUri_ = null;
            }

            public static HostedTrustedAuthCallBackResult getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public void mergeAuthorizationRedirectUri(StringValue stringValue) {
                stringValue.getClass();
                StringValue stringValue2 = this.authorizationRedirectUri_;
                if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
                    this.authorizationRedirectUri_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.authorizationRedirectUri_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
                } else {
                    this.authorizationRedirectUri_ = stringValue;
                }
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static HostedTrustedAuthCallBackResult parseDelimitedFrom(InputStream inputStream) {
                return (HostedTrustedAuthCallBackResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static HostedTrustedAuthCallBackResult parseFrom(ByteBuffer byteBuffer) {
                return (HostedTrustedAuthCallBackResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<HostedTrustedAuthCallBackResult> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAuthorizationRedirectUri(StringValue stringValue) {
                stringValue.getClass();
                this.authorizationRedirectUri_ = stringValue;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (dc.f18506a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new HostedTrustedAuthCallBackResult();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"authorizationRedirectUri_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<HostedTrustedAuthCallBackResult> parser = PARSER;
                        if (parser == null) {
                            synchronized (HostedTrustedAuthCallBackResult.class) {
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

            public StringValue getAuthorizationRedirectUri() {
                StringValue stringValue = this.authorizationRedirectUri_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public boolean hasAuthorizationRedirectUri() {
                return this.authorizationRedirectUri_ != null;
            }

            public static a newBuilder(HostedTrustedAuthCallBackResult hostedTrustedAuthCallBackResult) {
                return DEFAULT_INSTANCE.createBuilder(hostedTrustedAuthCallBackResult);
            }

            public static HostedTrustedAuthCallBackResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HostedTrustedAuthCallBackResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static HostedTrustedAuthCallBackResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (HostedTrustedAuthCallBackResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static HostedTrustedAuthCallBackResult parseFrom(ByteString byteString) {
                return (HostedTrustedAuthCallBackResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static HostedTrustedAuthCallBackResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (HostedTrustedAuthCallBackResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static HostedTrustedAuthCallBackResult parseFrom(byte[] bArr) {
                return (HostedTrustedAuthCallBackResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static HostedTrustedAuthCallBackResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (HostedTrustedAuthCallBackResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static HostedTrustedAuthCallBackResult parseFrom(InputStream inputStream) {
                return (HostedTrustedAuthCallBackResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static HostedTrustedAuthCallBackResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HostedTrustedAuthCallBackResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static HostedTrustedAuthCallBackResult parseFrom(CodedInputStream codedInputStream) {
                return (HostedTrustedAuthCallBackResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static HostedTrustedAuthCallBackResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HostedTrustedAuthCallBackResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
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
        public void clearErrorJson() {
            this.errorJson_ = getDefaultInstance().getErrorJson();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEvents() {
            this.events_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHostedTrustedAuthCallbackResult() {
            this.hostedTrustedAuthCallbackResult_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetadataJson() {
            this.metadataJson_ = getDefaultInstance().getMetadataJson();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPublicToken() {
            this.publicToken_ = getDefaultInstance().getPublicToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRedirectUri() {
            this.redirectUri_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResult() {
            this.result_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWebviewRedirectUri() {
            this.webviewRedirectUri_ = getDefaultInstance().getWebviewRedirectUri();
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
        public void mergeHostedTrustedAuthCallbackResult(HostedTrustedAuthCallBackResult hostedTrustedAuthCallBackResult) {
            hostedTrustedAuthCallBackResult.getClass();
            HostedTrustedAuthCallBackResult hostedTrustedAuthCallBackResult2 = this.hostedTrustedAuthCallbackResult_;
            if (hostedTrustedAuthCallBackResult2 != null && hostedTrustedAuthCallBackResult2 != HostedTrustedAuthCallBackResult.getDefaultInstance()) {
                this.hostedTrustedAuthCallbackResult_ = HostedTrustedAuthCallBackResult.newBuilder(this.hostedTrustedAuthCallbackResult_).mergeFrom((HostedTrustedAuthCallBackResult.a) hostedTrustedAuthCallBackResult).buildPartial();
            } else {
                this.hostedTrustedAuthCallbackResult_ = hostedTrustedAuthCallBackResult;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeRedirectUri(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.redirectUri_;
            if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
                this.redirectUri_ = (StringValue) ((StringValue.Builder) StringValue.newBuilder(this.redirectUri_).mergeFrom((GeneratedMessageLite) stringValue)).buildPartial();
            } else {
                this.redirectUri_ = stringValue;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResult(SdkResult$SDKResult sdkResult$SDKResult) {
            sdkResult$SDKResult.getClass();
            SdkResult$SDKResult sdkResult$SDKResult2 = this.result_;
            if (sdkResult$SDKResult2 != null && sdkResult$SDKResult2 != SdkResult$SDKResult.getDefaultInstance()) {
                this.result_ = SdkResult$SDKResult.newBuilder(this.result_).mergeFrom((SdkResult$SDKResult.a) sdkResult$SDKResult).buildPartial();
            } else {
                this.result_ = sdkResult$SDKResult;
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
        public void setErrorJson(String str) {
            str.getClass();
            this.errorJson_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorJsonBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.errorJson_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHostedTrustedAuthCallbackResult(HostedTrustedAuthCallBackResult hostedTrustedAuthCallBackResult) {
            hostedTrustedAuthCallBackResult.getClass();
            this.hostedTrustedAuthCallbackResult_ = hostedTrustedAuthCallBackResult;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetadataJson(String str) {
            str.getClass();
            this.metadataJson_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetadataJsonBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.metadataJson_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublicToken(String str) {
            str.getClass();
            this.publicToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublicTokenBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.publicToken_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRedirectUri(StringValue stringValue) {
            stringValue.getClass();
            this.redirectUri_ = stringValue;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResult(SdkResult$SDKResult sdkResult$SDKResult) {
            sdkResult$SDKResult.getClass();
            this.result_ = sdkResult$SDKResult;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWebviewRedirectUri(String str) {
            str.getClass();
            this.webviewRedirectUri_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWebviewRedirectUriBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.webviewRedirectUri_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (dc.f18506a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\r\b\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\t\u0006Ȉ\u0007\t\r\t", new Object[]{"result_", "publicToken_", "errorJson_", "metadataJson_", "events_", "webviewRedirectUri_", "hostedTrustedAuthCallbackResult_", "redirectUri_"});
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

        public String getErrorJson() {
            return this.errorJson_;
        }

        public ByteString getErrorJsonBytes() {
            return ByteString.copyFromUtf8(this.errorJson_);
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public HostedTrustedAuthCallBackResult getHostedTrustedAuthCallbackResult() {
            HostedTrustedAuthCallBackResult hostedTrustedAuthCallBackResult = this.hostedTrustedAuthCallbackResult_;
            return hostedTrustedAuthCallBackResult == null ? HostedTrustedAuthCallBackResult.getDefaultInstance() : hostedTrustedAuthCallBackResult;
        }

        public String getMetadataJson() {
            return this.metadataJson_;
        }

        public ByteString getMetadataJsonBytes() {
            return ByteString.copyFromUtf8(this.metadataJson_);
        }

        public String getPublicToken() {
            return this.publicToken_;
        }

        public ByteString getPublicTokenBytes() {
            return ByteString.copyFromUtf8(this.publicToken_);
        }

        public StringValue getRedirectUri() {
            StringValue stringValue = this.redirectUri_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public SdkResult$SDKResult getResult() {
            SdkResult$SDKResult sdkResult$SDKResult = this.result_;
            return sdkResult$SDKResult == null ? SdkResult$SDKResult.getDefaultInstance() : sdkResult$SDKResult;
        }

        public String getWebviewRedirectUri() {
            return this.webviewRedirectUri_;
        }

        public ByteString getWebviewRedirectUriBytes() {
            return ByteString.copyFromUtf8(this.webviewRedirectUri_);
        }

        public boolean hasEvents() {
            return this.events_ != null;
        }

        public boolean hasHostedTrustedAuthCallbackResult() {
            return this.hostedTrustedAuthCallbackResult_ != null;
        }

        public boolean hasRedirectUri() {
            return this.redirectUri_ != null;
        }

        public boolean hasResult() {
            return this.result_ != null;
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
    public static final class a extends GeneratedMessageLite.Builder<Sink$SinkPane, a> implements MessageLiteOrBuilder {
        public a() {
            super(Sink$SinkPane.DEFAULT_INSTANCE);
        }
    }

    static {
        Sink$SinkPane sink$SinkPane = new Sink$SinkPane();
        DEFAULT_INSTANCE = sink$SinkPane;
        GeneratedMessageLite.registerDefaultInstance(Sink$SinkPane.class, sink$SinkPane);
    }

    private Sink$SinkPane() {
    }

    public static Sink$SinkPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Sink$SinkPane parseDelimitedFrom(InputStream inputStream) {
        return (Sink$SinkPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sink$SinkPane parseFrom(ByteBuffer byteBuffer) {
        return (Sink$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Sink$SinkPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (dc.f18506a[methodToInvoke.ordinal()]) {
            case 1:
                return new Sink$SinkPane();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Sink$SinkPane> parser = PARSER;
                if (parser == null) {
                    synchronized (Sink$SinkPane.class) {
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

    public static a newBuilder(Sink$SinkPane sink$SinkPane) {
        return DEFAULT_INSTANCE.createBuilder(sink$SinkPane);
    }

    public static Sink$SinkPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Sink$SinkPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sink$SinkPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Sink$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Sink$SinkPane parseFrom(ByteString byteString) {
        return (Sink$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Sink$SinkPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Sink$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Sink$SinkPane parseFrom(byte[] bArr) {
        return (Sink$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sink$SinkPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Sink$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Sink$SinkPane parseFrom(InputStream inputStream) {
        return (Sink$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sink$SinkPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Sink$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sink$SinkPane parseFrom(CodedInputStream codedInputStream) {
        return (Sink$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Sink$SinkPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Sink$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}