package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.b;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.c;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.e;
import com.plaid.internal.hd;
import com.plaid.internal.id;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Workflow$LinkWorkflowStartResponse extends GeneratedMessageLite<Workflow$LinkWorkflowStartResponse, a> implements MessageLiteOrBuilder {
    public static final int ADDITIONAL_PANES_FIELD_NUMBER = 3;
    public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 6;
    private static final Workflow$LinkWorkflowStartResponse DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 5;
    public static final int HEARTBEAT_CONFIGURATION_FIELD_NUMBER = 9;
    public static final int NEXT_PANE_FIELD_NUMBER = 2;
    private static volatile Parser<Workflow$LinkWorkflowStartResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 4;
    public static final int SESSION_RENDERING_DATA_FIELD_NUMBER = 8;
    public static final int WEBVIEW_FALLBACK_FIELD_NUMBER = 7;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private Events events_;
    private HeartbeatConfiguration heartbeatConfiguration_;
    private Pane$PaneRendering nextPane_;
    private SessionRenderingData sessionRenderingData_;
    private WebviewFallback webviewFallback_;
    private String workflowSessionId_ = "";
    private String continuationToken_ = "";
    private Internal.ProtobufList<Pane$PaneRendering> additionalPanes_ = GeneratedMessageLite.emptyProtobufList();
    private String requestId_ = "";

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
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
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
    public static final class HeartbeatConfiguration extends GeneratedMessageLite<HeartbeatConfiguration, a> implements MessageLiteOrBuilder {
        private static final HeartbeatConfiguration DEFAULT_INSTANCE;
        public static final int LINK_SESSION_ID_FIELD_NUMBER = 1;
        private static volatile Parser<HeartbeatConfiguration> PARSER;
        private String linkSessionId_ = "";

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<HeartbeatConfiguration, a> implements MessageLiteOrBuilder {
            public a() {
                super(HeartbeatConfiguration.DEFAULT_INSTANCE);
            }
        }

        static {
            HeartbeatConfiguration heartbeatConfiguration = new HeartbeatConfiguration();
            DEFAULT_INSTANCE = heartbeatConfiguration;
            GeneratedMessageLite.registerDefaultInstance(HeartbeatConfiguration.class, heartbeatConfiguration);
        }

        private HeartbeatConfiguration() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLinkSessionId() {
            this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
        }

        public static HeartbeatConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HeartbeatConfiguration parseDelimitedFrom(InputStream inputStream) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartbeatConfiguration parseFrom(ByteBuffer byteBuffer) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<HeartbeatConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkSessionId(String str) {
            str.getClass();
            this.linkSessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkSessionIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.linkSessionId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new HeartbeatConfiguration();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"linkSessionId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HeartbeatConfiguration> parser = PARSER;
                    if (parser == null) {
                        synchronized (HeartbeatConfiguration.class) {
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

        public String getLinkSessionId() {
            return this.linkSessionId_;
        }

        public ByteString getLinkSessionIdBytes() {
            return ByteString.copyFromUtf8(this.linkSessionId_);
        }

        public static a newBuilder(HeartbeatConfiguration heartbeatConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(heartbeatConfiguration);
        }

        public static HeartbeatConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeartbeatConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HeartbeatConfiguration parseFrom(ByteString byteString) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HeartbeatConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HeartbeatConfiguration parseFrom(byte[] bArr) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeartbeatConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HeartbeatConfiguration parseFrom(InputStream inputStream) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartbeatConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeartbeatConfiguration parseFrom(CodedInputStream codedInputStream) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HeartbeatConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SessionRenderingData extends GeneratedMessageLite<SessionRenderingData, a> implements MessageLiteOrBuilder {
        private static final SessionRenderingData DEFAULT_INSTANCE;
        public static final int EXTERNAL_EVENT_QUEUE_ENABLED_FIELD_NUMBER = 4;
        public static final int OVERLAY_BACKGROUND_COLOR_FIELD_NUMBER = 2;
        public static final int OVERLAY_BACKGROUND_FOOTER_FIELD_NUMBER = 1;
        private static volatile Parser<SessionRenderingData> PARSER = null;
        public static final int RECAPTCHA_ENTERPRISE_ENABLED_FIELD_NUMBER = 3;
        private boolean externalEventQueueEnabled_;
        private String overlayBackgroundColor_ = "";
        private Common$AttributedLocalizedString overlayBackgroundFooter_;
        private boolean recaptchaEnterpriseEnabled_;

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<SessionRenderingData, a> implements MessageLiteOrBuilder {
            public a() {
                super(SessionRenderingData.DEFAULT_INSTANCE);
            }
        }

        static {
            SessionRenderingData sessionRenderingData = new SessionRenderingData();
            DEFAULT_INSTANCE = sessionRenderingData;
            GeneratedMessageLite.registerDefaultInstance(SessionRenderingData.class, sessionRenderingData);
        }

        private SessionRenderingData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExternalEventQueueEnabled() {
            this.externalEventQueueEnabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOverlayBackgroundColor() {
            this.overlayBackgroundColor_ = getDefaultInstance().getOverlayBackgroundColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOverlayBackgroundFooter() {
            this.overlayBackgroundFooter_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecaptchaEnterpriseEnabled() {
            this.recaptchaEnterpriseEnabled_ = false;
        }

        public static SessionRenderingData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOverlayBackgroundFooter(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.overlayBackgroundFooter_;
            if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
                this.overlayBackgroundFooter_ = Common$AttributedLocalizedString.newBuilder(this.overlayBackgroundFooter_).mergeFrom((Common$AttributedLocalizedString.b) common$AttributedLocalizedString).buildPartial();
            } else {
                this.overlayBackgroundFooter_ = common$AttributedLocalizedString;
            }
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SessionRenderingData parseDelimitedFrom(InputStream inputStream) {
            return (SessionRenderingData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionRenderingData parseFrom(ByteBuffer byteBuffer) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SessionRenderingData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExternalEventQueueEnabled(boolean z11) {
            this.externalEventQueueEnabled_ = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOverlayBackgroundColor(String str) {
            str.getClass();
            this.overlayBackgroundColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOverlayBackgroundColorBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.overlayBackgroundColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOverlayBackgroundFooter(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.overlayBackgroundFooter_ = common$AttributedLocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecaptchaEnterpriseEnabled(boolean z11) {
            this.recaptchaEnterpriseEnabled_ = z11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SessionRenderingData();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\u0007\u0004\u0007", new Object[]{"overlayBackgroundFooter_", "overlayBackgroundColor_", "recaptchaEnterpriseEnabled_", "externalEventQueueEnabled_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SessionRenderingData> parser = PARSER;
                    if (parser == null) {
                        synchronized (SessionRenderingData.class) {
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

        public boolean getExternalEventQueueEnabled() {
            return this.externalEventQueueEnabled_;
        }

        public String getOverlayBackgroundColor() {
            return this.overlayBackgroundColor_;
        }

        public ByteString getOverlayBackgroundColorBytes() {
            return ByteString.copyFromUtf8(this.overlayBackgroundColor_);
        }

        public Common$AttributedLocalizedString getOverlayBackgroundFooter() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.overlayBackgroundFooter_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public boolean getRecaptchaEnterpriseEnabled() {
            return this.recaptchaEnterpriseEnabled_;
        }

        public boolean hasOverlayBackgroundFooter() {
            return this.overlayBackgroundFooter_ != null;
        }

        public static a newBuilder(SessionRenderingData sessionRenderingData) {
            return DEFAULT_INSTANCE.createBuilder(sessionRenderingData);
        }

        public static SessionRenderingData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionRenderingData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionRenderingData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SessionRenderingData parseFrom(ByteString byteString) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SessionRenderingData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SessionRenderingData parseFrom(byte[] bArr) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SessionRenderingData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SessionRenderingData parseFrom(InputStream inputStream) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionRenderingData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionRenderingData parseFrom(CodedInputStream codedInputStream) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SessionRenderingData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class WebviewFallback extends GeneratedMessageLite<WebviewFallback, a> implements MessageLiteOrBuilder {
        private static final WebviewFallback DEFAULT_INSTANCE;
        public static final int MODE_FIELD_NUMBER = 1;
        private static volatile Parser<WebviewFallback> PARSER = null;
        public static final int URL_BEHAVIOR_CONFIGURATIONS_FIELD_NUMBER = 3;
        public static final int URL_FIELD_NUMBER = 2;
        private int mode_;
        private String url_ = "";
        private Internal.ProtobufList<Common$URLBehaviorConfiguration> urlBehaviorConfigurations_ = GeneratedMessageLite.emptyProtobufList();

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<WebviewFallback, a> implements MessageLiteOrBuilder {
            public a() {
                super(WebviewFallback.DEFAULT_INSTANCE);
            }
        }

        static {
            WebviewFallback webviewFallback = new WebviewFallback();
            DEFAULT_INSTANCE = webviewFallback;
            GeneratedMessageLite.registerDefaultInstance(WebviewFallback.class, webviewFallback);
        }

        private WebviewFallback() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUrlBehaviorConfigurations(Iterable<? extends Common$URLBehaviorConfiguration> iterable) {
            ensureUrlBehaviorConfigurationsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.urlBehaviorConfigurations_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUrlBehaviorConfigurations(Common$URLBehaviorConfiguration common$URLBehaviorConfiguration) {
            common$URLBehaviorConfiguration.getClass();
            ensureUrlBehaviorConfigurationsIsMutable();
            this.urlBehaviorConfigurations_.add(common$URLBehaviorConfiguration);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMode() {
            this.mode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrlBehaviorConfigurations() {
            this.urlBehaviorConfigurations_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUrlBehaviorConfigurationsIsMutable() {
            Internal.ProtobufList<Common$URLBehaviorConfiguration> protobufList = this.urlBehaviorConfigurations_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.urlBehaviorConfigurations_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static WebviewFallback getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WebviewFallback parseDelimitedFrom(InputStream inputStream) {
            return (WebviewFallback) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebviewFallback parseFrom(ByteBuffer byteBuffer) {
            return (WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WebviewFallback> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUrlBehaviorConfigurations(int i11) {
            ensureUrlBehaviorConfigurationsIsMutable();
            this.urlBehaviorConfigurations_.remove(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMode(id idVar) {
            this.mode_ = idVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModeValue(int i11) {
            this.mode_ = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBehaviorConfigurations(int i11, Common$URLBehaviorConfiguration common$URLBehaviorConfiguration) {
            common$URLBehaviorConfiguration.getClass();
            ensureUrlBehaviorConfigurationsIsMutable();
            this.urlBehaviorConfigurations_.set(i11, common$URLBehaviorConfiguration);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new WebviewFallback();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u001b", new Object[]{"mode_", "url_", "urlBehaviorConfigurations_", Common$URLBehaviorConfiguration.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<WebviewFallback> parser = PARSER;
                    if (parser == null) {
                        synchronized (WebviewFallback.class) {
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

        public id getMode() {
            id forNumber = id.forNumber(this.mode_);
            return forNumber == null ? id.UNRECOGNIZED : forNumber;
        }

        public int getModeValue() {
            return this.mode_;
        }

        public String getUrl() {
            return this.url_;
        }

        public Common$URLBehaviorConfiguration getUrlBehaviorConfigurations(int i11) {
            return this.urlBehaviorConfigurations_.get(i11);
        }

        public int getUrlBehaviorConfigurationsCount() {
            return this.urlBehaviorConfigurations_.size();
        }

        public List<Common$URLBehaviorConfiguration> getUrlBehaviorConfigurationsList() {
            return this.urlBehaviorConfigurations_;
        }

        public c getUrlBehaviorConfigurationsOrBuilder(int i11) {
            return this.urlBehaviorConfigurations_.get(i11);
        }

        public List<? extends c> getUrlBehaviorConfigurationsOrBuilderList() {
            return this.urlBehaviorConfigurations_;
        }

        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        public static a newBuilder(WebviewFallback webviewFallback) {
            return DEFAULT_INSTANCE.createBuilder(webviewFallback);
        }

        public static WebviewFallback parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallback) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebviewFallback parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WebviewFallback parseFrom(ByteString byteString) {
            return (WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUrlBehaviorConfigurations(int i11, Common$URLBehaviorConfiguration common$URLBehaviorConfiguration) {
            common$URLBehaviorConfiguration.getClass();
            ensureUrlBehaviorConfigurationsIsMutable();
            this.urlBehaviorConfigurations_.add(i11, common$URLBehaviorConfiguration);
        }

        public static WebviewFallback parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WebviewFallback parseFrom(byte[] bArr) {
            return (WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WebviewFallback parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WebviewFallback parseFrom(InputStream inputStream) {
            return (WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebviewFallback parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebviewFallback parseFrom(CodedInputStream codedInputStream) {
            return (WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WebviewFallback parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowStartResponse, a> implements MessageLiteOrBuilder {
        public a() {
            super(Workflow$LinkWorkflowStartResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        Workflow$LinkWorkflowStartResponse workflow$LinkWorkflowStartResponse = new Workflow$LinkWorkflowStartResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowStartResponse;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowStartResponse.class, workflow$LinkWorkflowStartResponse);
    }

    private Workflow$LinkWorkflowStartResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdditionalPanes(Pane$PaneRendering pane$PaneRendering) {
        pane$PaneRendering.getClass();
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.add(pane$PaneRendering);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAdditionalPanes(Iterable<? extends Pane$PaneRendering> iterable) {
        ensureAdditionalPanesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.additionalPanes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdditionalPanes() {
        this.additionalPanes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContinuationToken() {
        this.continuationToken_ = getDefaultInstance().getContinuationToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvents() {
        this.events_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartbeatConfiguration() {
        this.heartbeatConfiguration_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextPane() {
        this.nextPane_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionRenderingData() {
        this.sessionRenderingData_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebviewFallback() {
        this.webviewFallback_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    private void ensureAdditionalPanesIsMutable() {
        Internal.ProtobufList<Pane$PaneRendering> protobufList = this.additionalPanes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.additionalPanes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Workflow$LinkWorkflowStartResponse getDefaultInstance() {
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
    public void mergeHeartbeatConfiguration(HeartbeatConfiguration heartbeatConfiguration) {
        heartbeatConfiguration.getClass();
        HeartbeatConfiguration heartbeatConfiguration2 = this.heartbeatConfiguration_;
        if (heartbeatConfiguration2 != null && heartbeatConfiguration2 != HeartbeatConfiguration.getDefaultInstance()) {
            this.heartbeatConfiguration_ = HeartbeatConfiguration.newBuilder(this.heartbeatConfiguration_).mergeFrom((HeartbeatConfiguration.a) heartbeatConfiguration).buildPartial();
        } else {
            this.heartbeatConfiguration_ = heartbeatConfiguration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNextPane(Pane$PaneRendering pane$PaneRendering) {
        pane$PaneRendering.getClass();
        Pane$PaneRendering pane$PaneRendering2 = this.nextPane_;
        if (pane$PaneRendering2 != null && pane$PaneRendering2 != Pane$PaneRendering.getDefaultInstance()) {
            this.nextPane_ = Pane$PaneRendering.newBuilder(this.nextPane_).mergeFrom((Pane$PaneRendering.a) pane$PaneRendering).buildPartial();
        } else {
            this.nextPane_ = pane$PaneRendering;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSessionRenderingData(SessionRenderingData sessionRenderingData) {
        sessionRenderingData.getClass();
        SessionRenderingData sessionRenderingData2 = this.sessionRenderingData_;
        if (sessionRenderingData2 != null && sessionRenderingData2 != SessionRenderingData.getDefaultInstance()) {
            this.sessionRenderingData_ = SessionRenderingData.newBuilder(this.sessionRenderingData_).mergeFrom((SessionRenderingData.a) sessionRenderingData).buildPartial();
        } else {
            this.sessionRenderingData_ = sessionRenderingData;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWebviewFallback(WebviewFallback webviewFallback) {
        webviewFallback.getClass();
        WebviewFallback webviewFallback2 = this.webviewFallback_;
        if (webviewFallback2 != null && webviewFallback2 != WebviewFallback.getDefaultInstance()) {
            this.webviewFallback_ = WebviewFallback.newBuilder(this.webviewFallback_).mergeFrom((WebviewFallback.a) webviewFallback).buildPartial();
        } else {
            this.webviewFallback_ = webviewFallback;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowStartResponse parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowStartResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAdditionalPanes(int i11) {
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdditionalPanes(int i11, Pane$PaneRendering pane$PaneRendering) {
        pane$PaneRendering.getClass();
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.set(i11, pane$PaneRendering);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContinuationToken(String str) {
        str.getClass();
        this.continuationToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContinuationTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.continuationToken_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvents(Events events) {
        events.getClass();
        this.events_ = events;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartbeatConfiguration(HeartbeatConfiguration heartbeatConfiguration) {
        heartbeatConfiguration.getClass();
        this.heartbeatConfiguration_ = heartbeatConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextPane(Pane$PaneRendering pane$PaneRendering) {
        pane$PaneRendering.getClass();
        this.nextPane_ = pane$PaneRendering;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionRenderingData(SessionRenderingData sessionRenderingData) {
        sessionRenderingData.getClass();
        this.sessionRenderingData_ = sessionRenderingData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewFallback(WebviewFallback webviewFallback) {
        webviewFallback.getClass();
        this.webviewFallback_ = webviewFallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkflowSessionId(String str) {
        str.getClass();
        this.workflowSessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkflowSessionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.workflowSessionId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (hd.f18720a[methodToInvoke.ordinal()]) {
            case 1:
                return new Workflow$LinkWorkflowStartResponse();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0003\u001b\u0004Ȉ\u0005\t\u0006Ȉ\u0007\t\b\t\t\t", new Object[]{"workflowSessionId_", "nextPane_", "additionalPanes_", Pane$PaneRendering.class, "requestId_", "events_", "continuationToken_", "webviewFallback_", "sessionRenderingData_", "heartbeatConfiguration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowStartResponse> parser = PARSER;
                if (parser == null) {
                    synchronized (Workflow$LinkWorkflowStartResponse.class) {
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

    public Pane$PaneRendering getAdditionalPanes(int i11) {
        return this.additionalPanes_.get(i11);
    }

    public int getAdditionalPanesCount() {
        return this.additionalPanes_.size();
    }

    public List<Pane$PaneRendering> getAdditionalPanesList() {
        return this.additionalPanes_;
    }

    public e getAdditionalPanesOrBuilder(int i11) {
        return this.additionalPanes_.get(i11);
    }

    public List<? extends e> getAdditionalPanesOrBuilderList() {
        return this.additionalPanes_;
    }

    public String getContinuationToken() {
        return this.continuationToken_;
    }

    public ByteString getContinuationTokenBytes() {
        return ByteString.copyFromUtf8(this.continuationToken_);
    }

    public Events getEvents() {
        Events events = this.events_;
        return events == null ? Events.getDefaultInstance() : events;
    }

    public HeartbeatConfiguration getHeartbeatConfiguration() {
        HeartbeatConfiguration heartbeatConfiguration = this.heartbeatConfiguration_;
        return heartbeatConfiguration == null ? HeartbeatConfiguration.getDefaultInstance() : heartbeatConfiguration;
    }

    public Pane$PaneRendering getNextPane() {
        Pane$PaneRendering pane$PaneRendering = this.nextPane_;
        return pane$PaneRendering == null ? Pane$PaneRendering.getDefaultInstance() : pane$PaneRendering;
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public SessionRenderingData getSessionRenderingData() {
        SessionRenderingData sessionRenderingData = this.sessionRenderingData_;
        return sessionRenderingData == null ? SessionRenderingData.getDefaultInstance() : sessionRenderingData;
    }

    public WebviewFallback getWebviewFallback() {
        WebviewFallback webviewFallback = this.webviewFallback_;
        return webviewFallback == null ? WebviewFallback.getDefaultInstance() : webviewFallback;
    }

    public String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public ByteString getWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public boolean hasEvents() {
        return this.events_ != null;
    }

    public boolean hasHeartbeatConfiguration() {
        return this.heartbeatConfiguration_ != null;
    }

    public boolean hasNextPane() {
        return this.nextPane_ != null;
    }

    public boolean hasSessionRenderingData() {
        return this.sessionRenderingData_ != null;
    }

    public boolean hasWebviewFallback() {
        return this.webviewFallback_ != null;
    }

    public static a newBuilder(Workflow$LinkWorkflowStartResponse workflow$LinkWorkflowStartResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowStartResponse);
    }

    public static Workflow$LinkWorkflowStartResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdditionalPanes(int i11, Pane$PaneRendering pane$PaneRendering) {
        pane$PaneRendering.getClass();
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.add(i11, pane$PaneRendering);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}