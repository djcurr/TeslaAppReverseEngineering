package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.plaid.internal.core.protos.analytical.LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents;
import com.plaid.internal.core.protos.analytical.LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit;
import com.plaid.internal.core.protos.analytical.LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails;
import com.plaid.internal.hd;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Workflow$LinkWorkflowEventRequest extends GeneratedMessageLite<Workflow$LinkWorkflowEventRequest, a> implements MessageLiteOrBuilder {
    private static final Workflow$LinkWorkflowEventRequest DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 3;
    public static final int LEGACY_ANALYTICS_FIELD_NUMBER = 1;
    private static volatile Parser<Workflow$LinkWorkflowEventRequest> PARSER = null;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 2;
    private Internal.ProtobufList<LegacyAnalytics> legacyAnalytics_ = GeneratedMessageLite.emptyProtobufList();
    private String workflowSessionId_ = "";
    private Internal.ProtobufList<Event> events_ = GeneratedMessageLite.emptyProtobufList();

    /* loaded from: classes2.dex */
    public static final class ActionOverride extends GeneratedMessageLite<ActionOverride, a> implements MessageLiteOrBuilder {
        public static final int CURRENT_PANE_ID_FIELD_NUMBER = 1;
        private static final ActionOverride DEFAULT_INSTANCE;
        public static final int LOCAL_ACTION_ID_FIELD_NUMBER = 2;
        private static volatile Parser<ActionOverride> PARSER;
        private String currentPaneId_ = "";
        private String localActionId_ = "";

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ActionOverride, a> implements MessageLiteOrBuilder {
            public a() {
                super(ActionOverride.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((ActionOverride) this.instance).setCurrentPaneId(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((ActionOverride) this.instance).setLocalActionId(str);
                return this;
            }
        }

        static {
            ActionOverride actionOverride = new ActionOverride();
            DEFAULT_INSTANCE = actionOverride;
            GeneratedMessageLite.registerDefaultInstance(ActionOverride.class, actionOverride);
        }

        private ActionOverride() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentPaneId() {
            this.currentPaneId_ = getDefaultInstance().getCurrentPaneId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocalActionId() {
            this.localActionId_ = getDefaultInstance().getLocalActionId();
        }

        public static ActionOverride getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ActionOverride parseDelimitedFrom(InputStream inputStream) {
            return (ActionOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ActionOverride parseFrom(ByteBuffer byteBuffer) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ActionOverride> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentPaneId(String str) {
            str.getClass();
            this.currentPaneId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentPaneIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.currentPaneId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocalActionId(String str) {
            str.getClass();
            this.localActionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocalActionIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.localActionId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ActionOverride();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"currentPaneId_", "localActionId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ActionOverride> parser = PARSER;
                    if (parser == null) {
                        synchronized (ActionOverride.class) {
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

        public String getCurrentPaneId() {
            return this.currentPaneId_;
        }

        public ByteString getCurrentPaneIdBytes() {
            return ByteString.copyFromUtf8(this.currentPaneId_);
        }

        public String getLocalActionId() {
            return this.localActionId_;
        }

        public ByteString getLocalActionIdBytes() {
            return ByteString.copyFromUtf8(this.localActionId_);
        }

        public static a newBuilder(ActionOverride actionOverride) {
            return DEFAULT_INSTANCE.createBuilder(actionOverride);
        }

        public static ActionOverride parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ActionOverride parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ActionOverride parseFrom(ByteString byteString) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ActionOverride parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ActionOverride parseFrom(byte[] bArr) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ActionOverride parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ActionOverride parseFrom(InputStream inputStream) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ActionOverride parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ActionOverride parseFrom(CodedInputStream codedInputStream) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ActionOverride parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ActivateExperiment extends GeneratedMessageLite<ActivateExperiment, a> implements MessageLiteOrBuilder {
        private static final ActivateExperiment DEFAULT_INSTANCE;
        public static final int EXPERIMENT_KEY_FIELD_NUMBER = 1;
        private static volatile Parser<ActivateExperiment> PARSER;
        private String experimentKey_ = "";

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ActivateExperiment, a> implements MessageLiteOrBuilder {
            public a() {
                super(ActivateExperiment.DEFAULT_INSTANCE);
            }
        }

        static {
            ActivateExperiment activateExperiment = new ActivateExperiment();
            DEFAULT_INSTANCE = activateExperiment;
            GeneratedMessageLite.registerDefaultInstance(ActivateExperiment.class, activateExperiment);
        }

        private ActivateExperiment() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExperimentKey() {
            this.experimentKey_ = getDefaultInstance().getExperimentKey();
        }

        public static ActivateExperiment getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ActivateExperiment parseDelimitedFrom(InputStream inputStream) {
            return (ActivateExperiment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ActivateExperiment parseFrom(ByteBuffer byteBuffer) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ActivateExperiment> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperimentKey(String str) {
            str.getClass();
            this.experimentKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperimentKeyBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.experimentKey_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ActivateExperiment();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"experimentKey_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ActivateExperiment> parser = PARSER;
                    if (parser == null) {
                        synchronized (ActivateExperiment.class) {
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

        public String getExperimentKey() {
            return this.experimentKey_;
        }

        public ByteString getExperimentKeyBytes() {
            return ByteString.copyFromUtf8(this.experimentKey_);
        }

        public static a newBuilder(ActivateExperiment activateExperiment) {
            return DEFAULT_INSTANCE.createBuilder(activateExperiment);
        }

        public static ActivateExperiment parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivateExperiment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ActivateExperiment parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ActivateExperiment parseFrom(ByteString byteString) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ActivateExperiment parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ActivateExperiment parseFrom(byte[] bArr) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ActivateExperiment parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ActivateExperiment parseFrom(InputStream inputStream) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ActivateExperiment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ActivateExperiment parseFrom(CodedInputStream codedInputStream) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ActivateExperiment parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Back extends GeneratedMessageLite<Back, a> implements MessageLiteOrBuilder {
        public static final int CURRENT_PANE_ID_FIELD_NUMBER = 1;
        private static final Back DEFAULT_INSTANCE;
        private static volatile Parser<Back> PARSER = null;
        public static final int PREVIOUS_PANE_ID_FIELD_NUMBER = 2;
        private String currentPaneId_ = "";
        private String previousPaneId_ = "";

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<Back, a> implements MessageLiteOrBuilder {
            public a() {
                super(Back.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((Back) this.instance).setCurrentPaneId(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((Back) this.instance).setPreviousPaneId(str);
                return this;
            }
        }

        static {
            Back back = new Back();
            DEFAULT_INSTANCE = back;
            GeneratedMessageLite.registerDefaultInstance(Back.class, back);
        }

        private Back() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentPaneId() {
            this.currentPaneId_ = getDefaultInstance().getCurrentPaneId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPreviousPaneId() {
            this.previousPaneId_ = getDefaultInstance().getPreviousPaneId();
        }

        public static Back getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Back parseDelimitedFrom(InputStream inputStream) {
            return (Back) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Back parseFrom(ByteBuffer byteBuffer) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Back> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentPaneId(String str) {
            str.getClass();
            this.currentPaneId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentPaneIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.currentPaneId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPreviousPaneId(String str) {
            str.getClass();
            this.previousPaneId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPreviousPaneIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.previousPaneId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Back();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"currentPaneId_", "previousPaneId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Back> parser = PARSER;
                    if (parser == null) {
                        synchronized (Back.class) {
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

        public String getCurrentPaneId() {
            return this.currentPaneId_;
        }

        public ByteString getCurrentPaneIdBytes() {
            return ByteString.copyFromUtf8(this.currentPaneId_);
        }

        public String getPreviousPaneId() {
            return this.previousPaneId_;
        }

        public ByteString getPreviousPaneIdBytes() {
            return ByteString.copyFromUtf8(this.previousPaneId_);
        }

        public static a newBuilder(Back back) {
            return DEFAULT_INSTANCE.createBuilder(back);
        }

        public static Back parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Back) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Back parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Back parseFrom(ByteString byteString) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Back parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Back parseFrom(byte[] bArr) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Back parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Back parseFrom(InputStream inputStream) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Back parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Back parseFrom(CodedInputStream codedInputStream) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Back parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ClearSearch extends GeneratedMessageLite<ClearSearch, a> implements MessageLiteOrBuilder {
        private static final ClearSearch DEFAULT_INSTANCE;
        private static volatile Parser<ClearSearch> PARSER;

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ClearSearch, a> implements MessageLiteOrBuilder {
            public a() {
                super(ClearSearch.DEFAULT_INSTANCE);
            }
        }

        static {
            ClearSearch clearSearch = new ClearSearch();
            DEFAULT_INSTANCE = clearSearch;
            GeneratedMessageLite.registerDefaultInstance(ClearSearch.class, clearSearch);
        }

        private ClearSearch() {
        }

        public static ClearSearch getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ClearSearch parseDelimitedFrom(InputStream inputStream) {
            return (ClearSearch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClearSearch parseFrom(ByteBuffer byteBuffer) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ClearSearch> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClearSearch();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClearSearch> parser = PARSER;
                    if (parser == null) {
                        synchronized (ClearSearch.class) {
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

        public static a newBuilder(ClearSearch clearSearch) {
            return DEFAULT_INSTANCE.createBuilder(clearSearch);
        }

        public static ClearSearch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClearSearch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClearSearch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClearSearch parseFrom(ByteString byteString) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClearSearch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClearSearch parseFrom(byte[] bArr) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClearSearch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClearSearch parseFrom(InputStream inputStream) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClearSearch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClearSearch parseFrom(CodedInputStream codedInputStream) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClearSearch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ClientOpenDelay extends GeneratedMessageLite<ClientOpenDelay, a> implements MessageLiteOrBuilder {
        private static final ClientOpenDelay DEFAULT_INSTANCE;
        public static final int DELAY_MS_FIELD_NUMBER = 1;
        private static volatile Parser<ClientOpenDelay> PARSER;
        private String delayMs_ = "";

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ClientOpenDelay, a> implements MessageLiteOrBuilder {
            public a() {
                super(ClientOpenDelay.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((ClientOpenDelay) this.instance).setDelayMs(str);
                return this;
            }
        }

        static {
            ClientOpenDelay clientOpenDelay = new ClientOpenDelay();
            DEFAULT_INSTANCE = clientOpenDelay;
            GeneratedMessageLite.registerDefaultInstance(ClientOpenDelay.class, clientOpenDelay);
        }

        private ClientOpenDelay() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDelayMs() {
            this.delayMs_ = getDefaultInstance().getDelayMs();
        }

        public static ClientOpenDelay getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ClientOpenDelay parseDelimitedFrom(InputStream inputStream) {
            return (ClientOpenDelay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientOpenDelay parseFrom(ByteBuffer byteBuffer) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ClientOpenDelay> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDelayMs(String str) {
            str.getClass();
            this.delayMs_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDelayMsBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.delayMs_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClientOpenDelay();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"delayMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClientOpenDelay> parser = PARSER;
                    if (parser == null) {
                        synchronized (ClientOpenDelay.class) {
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

        public String getDelayMs() {
            return this.delayMs_;
        }

        public ByteString getDelayMsBytes() {
            return ByteString.copyFromUtf8(this.delayMs_);
        }

        public static a newBuilder(ClientOpenDelay clientOpenDelay) {
            return DEFAULT_INSTANCE.createBuilder(clientOpenDelay);
        }

        public static ClientOpenDelay parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientOpenDelay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientOpenDelay parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClientOpenDelay parseFrom(ByteString byteString) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClientOpenDelay parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClientOpenDelay parseFrom(byte[] bArr) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClientOpenDelay parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClientOpenDelay parseFrom(InputStream inputStream) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientOpenDelay parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientOpenDelay parseFrom(CodedInputStream codedInputStream) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClientOpenDelay parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Event extends GeneratedMessageLite<Event, a> implements b {
        public static final int ACTION_OVERRIDE_FIELD_NUMBER = 1;
        public static final int ACTIVATE_EXPERIMENT_FIELD_NUMBER = 5;
        public static final int BACK_FIELD_NUMBER = 2;
        public static final int CLEAR_SEARCH_FIELD_NUMBER = 14;
        public static final int CLIENT_OPEN_DELAY_FIELD_NUMBER = 3;
        public static final int CLIENT_PUBLISHED_AT_FIELD_NUMBER = 8;
        private static final Event DEFAULT_INSTANCE;
        public static final int FOCUS_SEARCH_FIELD_NUMBER = 15;
        public static final int NO_NETWORK_CONNECTION_FIELD_NUMBER = 9;
        public static final int OAUTH_INTERSTITIAL_FIELD_NUMBER = 7;
        public static final int OAUTH_LINK_FIELD_NUMBER = 12;
        public static final int PANE_APPEARED_FIELD_NUMBER = 11;
        private static volatile Parser<Event> PARSER = null;
        public static final int SEARCH_SUCCESS_FIELD_NUMBER = 13;
        public static final int SECURE_INPUT_TOGGLE_FIELD_NUMBER = 6;
        public static final int SESSION_EXPIRED_FIELD_NUMBER = 10;
        public static final int TRACK_EVENT_WITH_OPTIMIZELY_FIELD_NUMBER = 16;
        public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 4;
        private Timestamp clientPublishedAt_;
        private Object data_;
        private int dataCase_ = 0;
        private String workflowSessionId_ = "";

        /* loaded from: classes2.dex */
        public enum b {
            ACTION_OVERRIDE(1),
            BACK(2),
            CLIENT_OPEN_DELAY(3),
            ACTIVATE_EXPERIMENT(5),
            TRACK_EVENT_WITH_OPTIMIZELY(16),
            SECURE_INPUT_TOGGLE(6),
            OAUTH_INTERSTITIAL(7),
            OAUTH_LINK(12),
            NO_NETWORK_CONNECTION(9),
            SESSION_EXPIRED(10),
            PANE_APPEARED(11),
            SEARCH_SUCCESS(13),
            CLEAR_SEARCH(14),
            FOCUS_SEARCH(15),
            DATA_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            public final int f18287a;

            b(int i11) {
                this.f18287a = i11;
            }

            public static b forNumber(int i11) {
                switch (i11) {
                    case 0:
                        return DATA_NOT_SET;
                    case 1:
                        return ACTION_OVERRIDE;
                    case 2:
                        return BACK;
                    case 3:
                        return CLIENT_OPEN_DELAY;
                    case 4:
                    case 8:
                    default:
                        return null;
                    case 5:
                        return ACTIVATE_EXPERIMENT;
                    case 6:
                        return SECURE_INPUT_TOGGLE;
                    case 7:
                        return OAUTH_INTERSTITIAL;
                    case 9:
                        return NO_NETWORK_CONNECTION;
                    case 10:
                        return SESSION_EXPIRED;
                    case 11:
                        return PANE_APPEARED;
                    case 12:
                        return OAUTH_LINK;
                    case 13:
                        return SEARCH_SUCCESS;
                    case 14:
                        return CLEAR_SEARCH;
                    case 15:
                        return FOCUS_SEARCH;
                    case 16:
                        return TRACK_EVENT_WITH_OPTIMIZELY;
                }
            }

            public int getNumber() {
                return this.f18287a;
            }

            @Deprecated
            public static b valueOf(int i11) {
                return forNumber(i11);
            }
        }

        static {
            Event event = new Event();
            DEFAULT_INSTANCE = event;
            GeneratedMessageLite.registerDefaultInstance(Event.class, event);
        }

        private Event() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActionOverride() {
            if (this.dataCase_ == 1) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActivateExperiment() {
            if (this.dataCase_ == 5) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBack() {
            if (this.dataCase_ == 2) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClearSearch() {
            if (this.dataCase_ == 14) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientOpenDelay() {
            if (this.dataCase_ == 3) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientPublishedAt() {
            this.clientPublishedAt_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.dataCase_ = 0;
            this.data_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFocusSearch() {
            if (this.dataCase_ == 15) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNoNetworkConnection() {
            if (this.dataCase_ == 9) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOauthInterstitial() {
            if (this.dataCase_ == 7) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOauthLink() {
            if (this.dataCase_ == 12) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaneAppeared() {
            if (this.dataCase_ == 11) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSearchSuccess() {
            if (this.dataCase_ == 13) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSecureInputToggle() {
            if (this.dataCase_ == 6) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionExpired() {
            if (this.dataCase_ == 10) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackEventWithOptimizely() {
            if (this.dataCase_ == 16) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWorkflowSessionId() {
            this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
        }

        public static Event getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeActionOverride(ActionOverride actionOverride) {
            actionOverride.getClass();
            if (this.dataCase_ == 1 && this.data_ != ActionOverride.getDefaultInstance()) {
                this.data_ = ActionOverride.newBuilder((ActionOverride) this.data_).mergeFrom((ActionOverride.a) actionOverride).buildPartial();
            } else {
                this.data_ = actionOverride;
            }
            this.dataCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeActivateExperiment(ActivateExperiment activateExperiment) {
            activateExperiment.getClass();
            if (this.dataCase_ == 5 && this.data_ != ActivateExperiment.getDefaultInstance()) {
                this.data_ = ActivateExperiment.newBuilder((ActivateExperiment) this.data_).mergeFrom((ActivateExperiment.a) activateExperiment).buildPartial();
            } else {
                this.data_ = activateExperiment;
            }
            this.dataCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBack(Back back) {
            back.getClass();
            if (this.dataCase_ == 2 && this.data_ != Back.getDefaultInstance()) {
                this.data_ = Back.newBuilder((Back) this.data_).mergeFrom((Back.a) back).buildPartial();
            } else {
                this.data_ = back;
            }
            this.dataCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeClearSearch(ClearSearch clearSearch) {
            clearSearch.getClass();
            if (this.dataCase_ == 14 && this.data_ != ClearSearch.getDefaultInstance()) {
                this.data_ = ClearSearch.newBuilder((ClearSearch) this.data_).mergeFrom((ClearSearch.a) clearSearch).buildPartial();
            } else {
                this.data_ = clearSearch;
            }
            this.dataCase_ = 14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeClientOpenDelay(ClientOpenDelay clientOpenDelay) {
            clientOpenDelay.getClass();
            if (this.dataCase_ == 3 && this.data_ != ClientOpenDelay.getDefaultInstance()) {
                this.data_ = ClientOpenDelay.newBuilder((ClientOpenDelay) this.data_).mergeFrom((ClientOpenDelay.a) clientOpenDelay).buildPartial();
            } else {
                this.data_ = clientOpenDelay;
            }
            this.dataCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeClientPublishedAt(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.clientPublishedAt_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.clientPublishedAt_ = (Timestamp) ((Timestamp.Builder) Timestamp.newBuilder(this.clientPublishedAt_).mergeFrom((GeneratedMessageLite) timestamp)).buildPartial();
            } else {
                this.clientPublishedAt_ = timestamp;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFocusSearch(FocusSearch focusSearch) {
            focusSearch.getClass();
            if (this.dataCase_ == 15 && this.data_ != FocusSearch.getDefaultInstance()) {
                this.data_ = FocusSearch.newBuilder((FocusSearch) this.data_).mergeFrom((FocusSearch.a) focusSearch).buildPartial();
            } else {
                this.data_ = focusSearch;
            }
            this.dataCase_ = 15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNoNetworkConnection(NoNetworkConnection noNetworkConnection) {
            noNetworkConnection.getClass();
            if (this.dataCase_ == 9 && this.data_ != NoNetworkConnection.getDefaultInstance()) {
                this.data_ = NoNetworkConnection.newBuilder((NoNetworkConnection) this.data_).mergeFrom((NoNetworkConnection.a) noNetworkConnection).buildPartial();
            } else {
                this.data_ = noNetworkConnection;
            }
            this.dataCase_ = 9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOauthInterstitial(OAuthInterstitial oAuthInterstitial) {
            oAuthInterstitial.getClass();
            if (this.dataCase_ == 7 && this.data_ != OAuthInterstitial.getDefaultInstance()) {
                this.data_ = OAuthInterstitial.newBuilder((OAuthInterstitial) this.data_).mergeFrom((OAuthInterstitial.a) oAuthInterstitial).buildPartial();
            } else {
                this.data_ = oAuthInterstitial;
            }
            this.dataCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOauthLink(OAuthLink oAuthLink) {
            oAuthLink.getClass();
            if (this.dataCase_ == 12 && this.data_ != OAuthLink.getDefaultInstance()) {
                this.data_ = OAuthLink.newBuilder((OAuthLink) this.data_).mergeFrom((OAuthLink.a) oAuthLink).buildPartial();
            } else {
                this.data_ = oAuthLink;
            }
            this.dataCase_ = 12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePaneAppeared(PaneAppeared paneAppeared) {
            paneAppeared.getClass();
            if (this.dataCase_ == 11 && this.data_ != PaneAppeared.getDefaultInstance()) {
                this.data_ = PaneAppeared.newBuilder((PaneAppeared) this.data_).mergeFrom((PaneAppeared.a) paneAppeared).buildPartial();
            } else {
                this.data_ = paneAppeared;
            }
            this.dataCase_ = 11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSearchSuccess(SearchSuccess searchSuccess) {
            searchSuccess.getClass();
            if (this.dataCase_ == 13 && this.data_ != SearchSuccess.getDefaultInstance()) {
                this.data_ = SearchSuccess.newBuilder((SearchSuccess) this.data_).mergeFrom((SearchSuccess.a) searchSuccess).buildPartial();
            } else {
                this.data_ = searchSuccess;
            }
            this.dataCase_ = 13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSecureInputToggle(SecureInputToggle secureInputToggle) {
            secureInputToggle.getClass();
            if (this.dataCase_ == 6 && this.data_ != SecureInputToggle.getDefaultInstance()) {
                this.data_ = SecureInputToggle.newBuilder((SecureInputToggle) this.data_).mergeFrom((SecureInputToggle.a) secureInputToggle).buildPartial();
            } else {
                this.data_ = secureInputToggle;
            }
            this.dataCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSessionExpired(SessionExpired sessionExpired) {
            sessionExpired.getClass();
            if (this.dataCase_ == 10 && this.data_ != SessionExpired.getDefaultInstance()) {
                this.data_ = SessionExpired.newBuilder((SessionExpired) this.data_).mergeFrom((SessionExpired.a) sessionExpired).buildPartial();
            } else {
                this.data_ = sessionExpired;
            }
            this.dataCase_ = 10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTrackEventWithOptimizely(TrackEventWithOptimizely trackEventWithOptimizely) {
            trackEventWithOptimizely.getClass();
            if (this.dataCase_ == 16 && this.data_ != TrackEventWithOptimizely.getDefaultInstance()) {
                this.data_ = TrackEventWithOptimizely.newBuilder((TrackEventWithOptimizely) this.data_).mergeFrom((TrackEventWithOptimizely.a) trackEventWithOptimizely).buildPartial();
            } else {
                this.data_ = trackEventWithOptimizely;
            }
            this.dataCase_ = 16;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Event parseDelimitedFrom(InputStream inputStream) {
            return (Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Event parseFrom(ByteBuffer byteBuffer) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Event> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionOverride(ActionOverride actionOverride) {
            actionOverride.getClass();
            this.data_ = actionOverride;
            this.dataCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActivateExperiment(ActivateExperiment activateExperiment) {
            activateExperiment.getClass();
            this.data_ = activateExperiment;
            this.dataCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBack(Back back) {
            back.getClass();
            this.data_ = back;
            this.dataCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClearSearch(ClearSearch clearSearch) {
            clearSearch.getClass();
            this.data_ = clearSearch;
            this.dataCase_ = 14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientOpenDelay(ClientOpenDelay clientOpenDelay) {
            clientOpenDelay.getClass();
            this.data_ = clientOpenDelay;
            this.dataCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientPublishedAt(Timestamp timestamp) {
            timestamp.getClass();
            this.clientPublishedAt_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFocusSearch(FocusSearch focusSearch) {
            focusSearch.getClass();
            this.data_ = focusSearch;
            this.dataCase_ = 15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNoNetworkConnection(NoNetworkConnection noNetworkConnection) {
            noNetworkConnection.getClass();
            this.data_ = noNetworkConnection;
            this.dataCase_ = 9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOauthInterstitial(OAuthInterstitial oAuthInterstitial) {
            oAuthInterstitial.getClass();
            this.data_ = oAuthInterstitial;
            this.dataCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOauthLink(OAuthLink oAuthLink) {
            oAuthLink.getClass();
            this.data_ = oAuthLink;
            this.dataCase_ = 12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaneAppeared(PaneAppeared paneAppeared) {
            paneAppeared.getClass();
            this.data_ = paneAppeared;
            this.dataCase_ = 11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSearchSuccess(SearchSuccess searchSuccess) {
            searchSuccess.getClass();
            this.data_ = searchSuccess;
            this.dataCase_ = 13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecureInputToggle(SecureInputToggle secureInputToggle) {
            secureInputToggle.getClass();
            this.data_ = secureInputToggle;
            this.dataCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionExpired(SessionExpired sessionExpired) {
            sessionExpired.getClass();
            this.data_ = sessionExpired;
            this.dataCase_ = 10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackEventWithOptimizely(TrackEventWithOptimizely trackEventWithOptimizely) {
            trackEventWithOptimizely.getClass();
            this.data_ = trackEventWithOptimizely;
            this.dataCase_ = 16;
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
                    return new Event();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0001\u0000\u0001\u0010\u0010\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004Ȉ\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\t\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000", new Object[]{"data_", "dataCase_", ActionOverride.class, Back.class, ClientOpenDelay.class, "workflowSessionId_", ActivateExperiment.class, SecureInputToggle.class, OAuthInterstitial.class, "clientPublishedAt_", NoNetworkConnection.class, SessionExpired.class, PaneAppeared.class, OAuthLink.class, SearchSuccess.class, ClearSearch.class, FocusSearch.class, TrackEventWithOptimizely.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Event> parser = PARSER;
                    if (parser == null) {
                        synchronized (Event.class) {
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

        public ActionOverride getActionOverride() {
            if (this.dataCase_ == 1) {
                return (ActionOverride) this.data_;
            }
            return ActionOverride.getDefaultInstance();
        }

        public ActivateExperiment getActivateExperiment() {
            if (this.dataCase_ == 5) {
                return (ActivateExperiment) this.data_;
            }
            return ActivateExperiment.getDefaultInstance();
        }

        public Back getBack() {
            if (this.dataCase_ == 2) {
                return (Back) this.data_;
            }
            return Back.getDefaultInstance();
        }

        public ClearSearch getClearSearch() {
            if (this.dataCase_ == 14) {
                return (ClearSearch) this.data_;
            }
            return ClearSearch.getDefaultInstance();
        }

        public ClientOpenDelay getClientOpenDelay() {
            if (this.dataCase_ == 3) {
                return (ClientOpenDelay) this.data_;
            }
            return ClientOpenDelay.getDefaultInstance();
        }

        public Timestamp getClientPublishedAt() {
            Timestamp timestamp = this.clientPublishedAt_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public b getDataCase() {
            return b.forNumber(this.dataCase_);
        }

        public FocusSearch getFocusSearch() {
            if (this.dataCase_ == 15) {
                return (FocusSearch) this.data_;
            }
            return FocusSearch.getDefaultInstance();
        }

        public NoNetworkConnection getNoNetworkConnection() {
            if (this.dataCase_ == 9) {
                return (NoNetworkConnection) this.data_;
            }
            return NoNetworkConnection.getDefaultInstance();
        }

        public OAuthInterstitial getOauthInterstitial() {
            if (this.dataCase_ == 7) {
                return (OAuthInterstitial) this.data_;
            }
            return OAuthInterstitial.getDefaultInstance();
        }

        public OAuthLink getOauthLink() {
            if (this.dataCase_ == 12) {
                return (OAuthLink) this.data_;
            }
            return OAuthLink.getDefaultInstance();
        }

        public PaneAppeared getPaneAppeared() {
            if (this.dataCase_ == 11) {
                return (PaneAppeared) this.data_;
            }
            return PaneAppeared.getDefaultInstance();
        }

        public SearchSuccess getSearchSuccess() {
            if (this.dataCase_ == 13) {
                return (SearchSuccess) this.data_;
            }
            return SearchSuccess.getDefaultInstance();
        }

        public SecureInputToggle getSecureInputToggle() {
            if (this.dataCase_ == 6) {
                return (SecureInputToggle) this.data_;
            }
            return SecureInputToggle.getDefaultInstance();
        }

        public SessionExpired getSessionExpired() {
            if (this.dataCase_ == 10) {
                return (SessionExpired) this.data_;
            }
            return SessionExpired.getDefaultInstance();
        }

        public TrackEventWithOptimizely getTrackEventWithOptimizely() {
            if (this.dataCase_ == 16) {
                return (TrackEventWithOptimizely) this.data_;
            }
            return TrackEventWithOptimizely.getDefaultInstance();
        }

        public String getWorkflowSessionId() {
            return this.workflowSessionId_;
        }

        public ByteString getWorkflowSessionIdBytes() {
            return ByteString.copyFromUtf8(this.workflowSessionId_);
        }

        public boolean hasActionOverride() {
            return this.dataCase_ == 1;
        }

        public boolean hasActivateExperiment() {
            return this.dataCase_ == 5;
        }

        public boolean hasBack() {
            return this.dataCase_ == 2;
        }

        public boolean hasClearSearch() {
            return this.dataCase_ == 14;
        }

        public boolean hasClientOpenDelay() {
            return this.dataCase_ == 3;
        }

        public boolean hasClientPublishedAt() {
            return this.clientPublishedAt_ != null;
        }

        public boolean hasFocusSearch() {
            return this.dataCase_ == 15;
        }

        public boolean hasNoNetworkConnection() {
            return this.dataCase_ == 9;
        }

        public boolean hasOauthInterstitial() {
            return this.dataCase_ == 7;
        }

        public boolean hasOauthLink() {
            return this.dataCase_ == 12;
        }

        public boolean hasPaneAppeared() {
            return this.dataCase_ == 11;
        }

        public boolean hasSearchSuccess() {
            return this.dataCase_ == 13;
        }

        public boolean hasSecureInputToggle() {
            return this.dataCase_ == 6;
        }

        public boolean hasSessionExpired() {
            return this.dataCase_ == 10;
        }

        public boolean hasTrackEventWithOptimizely() {
            return this.dataCase_ == 16;
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<Event, a> implements b {
            public a() {
                super(Event.DEFAULT_INSTANCE);
            }

            public a a(ActionOverride.a aVar) {
                copyOnWrite();
                ((Event) this.instance).setActionOverride(aVar.build());
                return this;
            }

            public a a(Back.a aVar) {
                copyOnWrite();
                ((Event) this.instance).setBack(aVar.build());
                return this;
            }

            public a a(ClientOpenDelay.a aVar) {
                copyOnWrite();
                ((Event) this.instance).setClientOpenDelay(aVar.build());
                return this;
            }

            public a a(OAuthLink.a aVar) {
                copyOnWrite();
                ((Event) this.instance).setOauthLink(aVar.build());
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((Event) this.instance).setWorkflowSessionId(str);
                return this;
            }

            public a a(Timestamp.Builder builder) {
                copyOnWrite();
                ((Event) this.instance).setClientPublishedAt((Timestamp) builder.build());
                return this;
            }
        }

        public static a newBuilder(Event event) {
            return DEFAULT_INSTANCE.createBuilder(event);
        }

        public static Event parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Event parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Event parseFrom(ByteString byteString) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Event parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Event parseFrom(byte[] bArr) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Event parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Event parseFrom(InputStream inputStream) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Event parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Event parseFrom(CodedInputStream codedInputStream) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Event parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class FocusSearch extends GeneratedMessageLite<FocusSearch, a> implements MessageLiteOrBuilder {
        private static final FocusSearch DEFAULT_INSTANCE;
        private static volatile Parser<FocusSearch> PARSER;

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<FocusSearch, a> implements MessageLiteOrBuilder {
            public a() {
                super(FocusSearch.DEFAULT_INSTANCE);
            }
        }

        static {
            FocusSearch focusSearch = new FocusSearch();
            DEFAULT_INSTANCE = focusSearch;
            GeneratedMessageLite.registerDefaultInstance(FocusSearch.class, focusSearch);
        }

        private FocusSearch() {
        }

        public static FocusSearch getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FocusSearch parseDelimitedFrom(InputStream inputStream) {
            return (FocusSearch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FocusSearch parseFrom(ByteBuffer byteBuffer) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FocusSearch> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new FocusSearch();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FocusSearch> parser = PARSER;
                    if (parser == null) {
                        synchronized (FocusSearch.class) {
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

        public static a newBuilder(FocusSearch focusSearch) {
            return DEFAULT_INSTANCE.createBuilder(focusSearch);
        }

        public static FocusSearch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FocusSearch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FocusSearch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FocusSearch parseFrom(ByteString byteString) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FocusSearch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FocusSearch parseFrom(byte[] bArr) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FocusSearch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FocusSearch parseFrom(InputStream inputStream) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FocusSearch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FocusSearch parseFrom(CodedInputStream codedInputStream) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FocusSearch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class LegacyAnalytics extends GeneratedMessageLite<LegacyAnalytics, a> implements c {
        private static final LegacyAnalytics DEFAULT_INSTANCE;
        public static final int LINK_EVENTS_FIELD_NUMBER = 2;
        public static final int LINK_OPEN_DETAILS_FIELD_NUMBER = 3;
        public static final int LOG_EXPERIMENT_HIT_FIELD_NUMBER = 1;
        private static volatile Parser<LegacyAnalytics> PARSER;
        private int dataCase_ = 0;
        private Object data_;

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<LegacyAnalytics, a> implements c {
            public a() {
                super(LegacyAnalytics.DEFAULT_INSTANCE);
            }
        }

        /* loaded from: classes2.dex */
        public enum b {
            LOG_EXPERIMENT_HIT(1),
            LINK_EVENTS(2),
            LINK_OPEN_DETAILS(3),
            DATA_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            public final int f18289a;

            b(int i11) {
                this.f18289a = i11;
            }

            public static b forNumber(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                return null;
                            }
                            return LINK_OPEN_DETAILS;
                        }
                        return LINK_EVENTS;
                    }
                    return LOG_EXPERIMENT_HIT;
                }
                return DATA_NOT_SET;
            }

            public int getNumber() {
                return this.f18289a;
            }

            @Deprecated
            public static b valueOf(int i11) {
                return forNumber(i11);
            }
        }

        static {
            LegacyAnalytics legacyAnalytics = new LegacyAnalytics();
            DEFAULT_INSTANCE = legacyAnalytics;
            GeneratedMessageLite.registerDefaultInstance(LegacyAnalytics.class, legacyAnalytics);
        }

        private LegacyAnalytics() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.dataCase_ = 0;
            this.data_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLinkEvents() {
            if (this.dataCase_ == 2) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLinkOpenDetails() {
            if (this.dataCase_ == 3) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLogExperimentHit() {
            if (this.dataCase_ == 1) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        public static LegacyAnalytics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLinkEvents(LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents linkAnalyticsEventsOuterClass$LinkAnalyticsEvents) {
            linkAnalyticsEventsOuterClass$LinkAnalyticsEvents.getClass();
            if (this.dataCase_ == 2 && this.data_ != LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents.getDefaultInstance()) {
                this.data_ = LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents.newBuilder((LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents) this.data_).mergeFrom((LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents.a) linkAnalyticsEventsOuterClass$LinkAnalyticsEvents).buildPartial();
            } else {
                this.data_ = linkAnalyticsEventsOuterClass$LinkAnalyticsEvents;
            }
            this.dataCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLinkOpenDetails(LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails linkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails) {
            linkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails.getClass();
            if (this.dataCase_ == 3 && this.data_ != LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails.getDefaultInstance()) {
                this.data_ = LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails.newBuilder((LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails) this.data_).mergeFrom((LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails.a) linkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails).buildPartial();
            } else {
                this.data_ = linkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails;
            }
            this.dataCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLogExperimentHit(LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit linkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit) {
            linkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit.getClass();
            if (this.dataCase_ == 1 && this.data_ != LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit.getDefaultInstance()) {
                this.data_ = LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit.newBuilder((LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit) this.data_).mergeFrom((LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit.a) linkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit).buildPartial();
            } else {
                this.data_ = linkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit;
            }
            this.dataCase_ = 1;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static LegacyAnalytics parseDelimitedFrom(InputStream inputStream) {
            return (LegacyAnalytics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LegacyAnalytics parseFrom(ByteBuffer byteBuffer) {
            return (LegacyAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<LegacyAnalytics> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkEvents(LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents linkAnalyticsEventsOuterClass$LinkAnalyticsEvents) {
            linkAnalyticsEventsOuterClass$LinkAnalyticsEvents.getClass();
            this.data_ = linkAnalyticsEventsOuterClass$LinkAnalyticsEvents;
            this.dataCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkOpenDetails(LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails linkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails) {
            linkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails.getClass();
            this.data_ = linkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails;
            this.dataCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogExperimentHit(LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit linkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit) {
            linkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit.getClass();
            this.data_ = linkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit;
            this.dataCase_ = 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new LegacyAnalytics();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"data_", "dataCase_", LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit.class, LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents.class, LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<LegacyAnalytics> parser = PARSER;
                    if (parser == null) {
                        synchronized (LegacyAnalytics.class) {
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

        public b getDataCase() {
            return b.forNumber(this.dataCase_);
        }

        public LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents getLinkEvents() {
            if (this.dataCase_ == 2) {
                return (LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents) this.data_;
            }
            return LinkAnalyticsEventsOuterClass$LinkAnalyticsEvents.getDefaultInstance();
        }

        public LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails getLinkOpenDetails() {
            if (this.dataCase_ == 3) {
                return (LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails) this.data_;
            }
            return LinkAnalyticsOpenDetailsOuterClass$LinkAnalyticsOpenDetails.getDefaultInstance();
        }

        public LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit getLogExperimentHit() {
            if (this.dataCase_ == 1) {
                return (LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit) this.data_;
            }
            return LinkAnalyticsLogExperimentHitOuterClass$LinkAnalyticsLogExperimentHit.getDefaultInstance();
        }

        public boolean hasLinkEvents() {
            return this.dataCase_ == 2;
        }

        public boolean hasLinkOpenDetails() {
            return this.dataCase_ == 3;
        }

        public boolean hasLogExperimentHit() {
            return this.dataCase_ == 1;
        }

        public static a newBuilder(LegacyAnalytics legacyAnalytics) {
            return DEFAULT_INSTANCE.createBuilder(legacyAnalytics);
        }

        public static LegacyAnalytics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LegacyAnalytics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LegacyAnalytics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (LegacyAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static LegacyAnalytics parseFrom(ByteString byteString) {
            return (LegacyAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LegacyAnalytics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (LegacyAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static LegacyAnalytics parseFrom(byte[] bArr) {
            return (LegacyAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LegacyAnalytics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (LegacyAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static LegacyAnalytics parseFrom(InputStream inputStream) {
            return (LegacyAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LegacyAnalytics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LegacyAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LegacyAnalytics parseFrom(CodedInputStream codedInputStream) {
            return (LegacyAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static LegacyAnalytics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LegacyAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class NoNetworkConnection extends GeneratedMessageLite<NoNetworkConnection, a> implements MessageLiteOrBuilder {
        private static final NoNetworkConnection DEFAULT_INSTANCE;
        private static volatile Parser<NoNetworkConnection> PARSER;

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<NoNetworkConnection, a> implements MessageLiteOrBuilder {
            public a() {
                super(NoNetworkConnection.DEFAULT_INSTANCE);
            }
        }

        static {
            NoNetworkConnection noNetworkConnection = new NoNetworkConnection();
            DEFAULT_INSTANCE = noNetworkConnection;
            GeneratedMessageLite.registerDefaultInstance(NoNetworkConnection.class, noNetworkConnection);
        }

        private NoNetworkConnection() {
        }

        public static NoNetworkConnection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NoNetworkConnection parseDelimitedFrom(InputStream inputStream) {
            return (NoNetworkConnection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NoNetworkConnection parseFrom(ByteBuffer byteBuffer) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NoNetworkConnection> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new NoNetworkConnection();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NoNetworkConnection> parser = PARSER;
                    if (parser == null) {
                        synchronized (NoNetworkConnection.class) {
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

        public static a newBuilder(NoNetworkConnection noNetworkConnection) {
            return DEFAULT_INSTANCE.createBuilder(noNetworkConnection);
        }

        public static NoNetworkConnection parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NoNetworkConnection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NoNetworkConnection parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NoNetworkConnection parseFrom(ByteString byteString) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NoNetworkConnection parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NoNetworkConnection parseFrom(byte[] bArr) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NoNetworkConnection parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NoNetworkConnection parseFrom(InputStream inputStream) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NoNetworkConnection parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NoNetworkConnection parseFrom(CodedInputStream codedInputStream) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NoNetworkConnection parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class OAuthInterstitial extends GeneratedMessageLite<OAuthInterstitial, a> implements MessageLiteOrBuilder {
        public static final int CALLBACK_REQUEST_ID_FIELD_NUMBER = 2;
        private static final OAuthInterstitial DEFAULT_INSTANCE;
        public static final int DESKTOP_TO_MOBILE_HANDOFF_FIELD_NUMBER = 7;
        public static final int INSTITUTION_ID_FIELD_NUMBER = 4;
        public static final int LINK_SESSION_ID_FIELD_NUMBER = 8;
        public static final int NO_REDIRECT_URL_FIELD_NUMBER = 6;
        public static final int OAUTH_STATE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<OAuthInterstitial> PARSER = null;
        public static final int REDIRECT_URL_FIELD_NUMBER = 3;
        public static final int SHOW_CONTINUE_FIELD_NUMBER = 5;
        private Object data_;
        private int dataCase_ = 0;
        private String oauthStateId_ = "";
        private String linkSessionId_ = "";
        private String callbackRequestId_ = "";
        private String redirectUrl_ = "";
        private String institutionId_ = "";

        /* loaded from: classes2.dex */
        public static final class DesktopToMobileHandoff extends GeneratedMessageLite<DesktopToMobileHandoff, a> implements MessageLiteOrBuilder {
            private static final DesktopToMobileHandoff DEFAULT_INSTANCE;
            private static volatile Parser<DesktopToMobileHandoff> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<DesktopToMobileHandoff, a> implements MessageLiteOrBuilder {
                public a() {
                    super(DesktopToMobileHandoff.DEFAULT_INSTANCE);
                }
            }

            static {
                DesktopToMobileHandoff desktopToMobileHandoff = new DesktopToMobileHandoff();
                DEFAULT_INSTANCE = desktopToMobileHandoff;
                GeneratedMessageLite.registerDefaultInstance(DesktopToMobileHandoff.class, desktopToMobileHandoff);
            }

            private DesktopToMobileHandoff() {
            }

            public static DesktopToMobileHandoff getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static DesktopToMobileHandoff parseDelimitedFrom(InputStream inputStream) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DesktopToMobileHandoff parseFrom(ByteBuffer byteBuffer) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<DesktopToMobileHandoff> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (hd.f18720a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new DesktopToMobileHandoff();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<DesktopToMobileHandoff> parser = PARSER;
                        if (parser == null) {
                            synchronized (DesktopToMobileHandoff.class) {
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

            public static a newBuilder(DesktopToMobileHandoff desktopToMobileHandoff) {
                return DEFAULT_INSTANCE.createBuilder(desktopToMobileHandoff);
            }

            public static DesktopToMobileHandoff parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DesktopToMobileHandoff parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static DesktopToMobileHandoff parseFrom(ByteString byteString) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static DesktopToMobileHandoff parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static DesktopToMobileHandoff parseFrom(byte[] bArr) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static DesktopToMobileHandoff parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static DesktopToMobileHandoff parseFrom(InputStream inputStream) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DesktopToMobileHandoff parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DesktopToMobileHandoff parseFrom(CodedInputStream codedInputStream) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static DesktopToMobileHandoff parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class NoRedirectUrl extends GeneratedMessageLite<NoRedirectUrl, a> implements MessageLiteOrBuilder {
            private static final NoRedirectUrl DEFAULT_INSTANCE;
            private static volatile Parser<NoRedirectUrl> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<NoRedirectUrl, a> implements MessageLiteOrBuilder {
                public a() {
                    super(NoRedirectUrl.DEFAULT_INSTANCE);
                }
            }

            static {
                NoRedirectUrl noRedirectUrl = new NoRedirectUrl();
                DEFAULT_INSTANCE = noRedirectUrl;
                GeneratedMessageLite.registerDefaultInstance(NoRedirectUrl.class, noRedirectUrl);
            }

            private NoRedirectUrl() {
            }

            public static NoRedirectUrl getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static NoRedirectUrl parseDelimitedFrom(InputStream inputStream) {
                return (NoRedirectUrl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NoRedirectUrl parseFrom(ByteBuffer byteBuffer) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<NoRedirectUrl> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (hd.f18720a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new NoRedirectUrl();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<NoRedirectUrl> parser = PARSER;
                        if (parser == null) {
                            synchronized (NoRedirectUrl.class) {
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

            public static a newBuilder(NoRedirectUrl noRedirectUrl) {
                return DEFAULT_INSTANCE.createBuilder(noRedirectUrl);
            }

            public static NoRedirectUrl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NoRedirectUrl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static NoRedirectUrl parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static NoRedirectUrl parseFrom(ByteString byteString) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static NoRedirectUrl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static NoRedirectUrl parseFrom(byte[] bArr) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static NoRedirectUrl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static NoRedirectUrl parseFrom(InputStream inputStream) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NoRedirectUrl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static NoRedirectUrl parseFrom(CodedInputStream codedInputStream) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static NoRedirectUrl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class ShowContinue extends GeneratedMessageLite<ShowContinue, a> implements MessageLiteOrBuilder {
            private static final ShowContinue DEFAULT_INSTANCE;
            private static volatile Parser<ShowContinue> PARSER = null;
            public static final int REASON_FIELD_NUMBER = 1;
            private int reason_;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<ShowContinue, a> implements MessageLiteOrBuilder {
                public a() {
                    super(ShowContinue.DEFAULT_INSTANCE);
                }
            }

            /* loaded from: classes2.dex */
            public enum b implements Internal.EnumLite {
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNSPECIFIED(0),
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_TIMEOUT(1),
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNHANDLED_EXCEPTION(2),
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_FORCE_USER_ACTION(3),
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNIVERSAL_LINK_WORKAROUND(4),
                UNRECOGNIZED(-1);
                
                public static final int LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_FORCE_USER_ACTION_VALUE = 3;
                public static final int LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_TIMEOUT_VALUE = 1;
                public static final int LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNHANDLED_EXCEPTION_VALUE = 2;
                public static final int LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNIVERSAL_LINK_WORKAROUND_VALUE = 4;
                public static final int LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNSPECIFIED_VALUE = 0;

                /* renamed from: b  reason: collision with root package name */
                public static final Internal.EnumLiteMap<b> f18290b = new a();

                /* renamed from: a  reason: collision with root package name */
                public final int f18292a;

                /* loaded from: classes2.dex */
                public class a implements Internal.EnumLiteMap<b> {
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public b findValueByNumber(int i11) {
                        return b.forNumber(i11);
                    }
                }

                /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest$OAuthInterstitial$ShowContinue$b$b  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0331b implements Internal.EnumVerifier {

                    /* renamed from: a  reason: collision with root package name */
                    public static final Internal.EnumVerifier f18293a = new C0331b();

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i11) {
                        return b.forNumber(i11) != null;
                    }
                }

                b(int i11) {
                    this.f18292a = i11;
                }

                public static b forNumber(int i11) {
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    if (i11 != 4) {
                                        return null;
                                    }
                                    return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNIVERSAL_LINK_WORKAROUND;
                                }
                                return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_FORCE_USER_ACTION;
                            }
                            return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNHANDLED_EXCEPTION;
                        }
                        return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_TIMEOUT;
                    }
                    return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNSPECIFIED;
                }

                public static Internal.EnumLiteMap<b> internalGetValueMap() {
                    return f18290b;
                }

                public static Internal.EnumVerifier internalGetVerifier() {
                    return C0331b.f18293a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this != UNRECOGNIZED) {
                        return this.f18292a;
                    }
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }

                @Deprecated
                public static b valueOf(int i11) {
                    return forNumber(i11);
                }
            }

            static {
                ShowContinue showContinue = new ShowContinue();
                DEFAULT_INSTANCE = showContinue;
                GeneratedMessageLite.registerDefaultInstance(ShowContinue.class, showContinue);
            }

            private ShowContinue() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearReason() {
                this.reason_ = 0;
            }

            public static ShowContinue getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ShowContinue parseDelimitedFrom(InputStream inputStream) {
                return (ShowContinue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ShowContinue parseFrom(ByteBuffer byteBuffer) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ShowContinue> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setReason(b bVar) {
                this.reason_ = bVar.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setReasonValue(int i11) {
                this.reason_ = i11;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (hd.f18720a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ShowContinue();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"reason_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ShowContinue> parser = PARSER;
                        if (parser == null) {
                            synchronized (ShowContinue.class) {
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

            public b getReason() {
                b forNumber = b.forNumber(this.reason_);
                return forNumber == null ? b.UNRECOGNIZED : forNumber;
            }

            public int getReasonValue() {
                return this.reason_;
            }

            public static a newBuilder(ShowContinue showContinue) {
                return DEFAULT_INSTANCE.createBuilder(showContinue);
            }

            public static ShowContinue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ShowContinue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ShowContinue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ShowContinue parseFrom(ByteString byteString) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ShowContinue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ShowContinue parseFrom(byte[] bArr) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ShowContinue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ShowContinue parseFrom(InputStream inputStream) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ShowContinue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ShowContinue parseFrom(CodedInputStream codedInputStream) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ShowContinue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<OAuthInterstitial, a> implements MessageLiteOrBuilder {
            public a() {
                super(OAuthInterstitial.DEFAULT_INSTANCE);
            }
        }

        /* loaded from: classes2.dex */
        public enum b {
            SHOW_CONTINUE(5),
            NO_REDIRECT_URL(6),
            DESKTOP_TO_MOBILE_HANDOFF(7),
            DATA_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            public final int f18295a;

            b(int i11) {
                this.f18295a = i11;
            }

            public static b forNumber(int i11) {
                if (i11 != 0) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            if (i11 != 7) {
                                return null;
                            }
                            return DESKTOP_TO_MOBILE_HANDOFF;
                        }
                        return NO_REDIRECT_URL;
                    }
                    return SHOW_CONTINUE;
                }
                return DATA_NOT_SET;
            }

            public int getNumber() {
                return this.f18295a;
            }

            @Deprecated
            public static b valueOf(int i11) {
                return forNumber(i11);
            }
        }

        static {
            OAuthInterstitial oAuthInterstitial = new OAuthInterstitial();
            DEFAULT_INSTANCE = oAuthInterstitial;
            GeneratedMessageLite.registerDefaultInstance(OAuthInterstitial.class, oAuthInterstitial);
        }

        private OAuthInterstitial() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallbackRequestId() {
            this.callbackRequestId_ = getDefaultInstance().getCallbackRequestId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.dataCase_ = 0;
            this.data_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDesktopToMobileHandoff() {
            if (this.dataCase_ == 7) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInstitutionId() {
            this.institutionId_ = getDefaultInstance().getInstitutionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLinkSessionId() {
            this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNoRedirectUrl() {
            if (this.dataCase_ == 6) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOauthStateId() {
            this.oauthStateId_ = getDefaultInstance().getOauthStateId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRedirectUrl() {
            this.redirectUrl_ = getDefaultInstance().getRedirectUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowContinue() {
            if (this.dataCase_ == 5) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        public static OAuthInterstitial getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDesktopToMobileHandoff(DesktopToMobileHandoff desktopToMobileHandoff) {
            desktopToMobileHandoff.getClass();
            if (this.dataCase_ == 7 && this.data_ != DesktopToMobileHandoff.getDefaultInstance()) {
                this.data_ = DesktopToMobileHandoff.newBuilder((DesktopToMobileHandoff) this.data_).mergeFrom((DesktopToMobileHandoff.a) desktopToMobileHandoff).buildPartial();
            } else {
                this.data_ = desktopToMobileHandoff;
            }
            this.dataCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNoRedirectUrl(NoRedirectUrl noRedirectUrl) {
            noRedirectUrl.getClass();
            if (this.dataCase_ == 6 && this.data_ != NoRedirectUrl.getDefaultInstance()) {
                this.data_ = NoRedirectUrl.newBuilder((NoRedirectUrl) this.data_).mergeFrom((NoRedirectUrl.a) noRedirectUrl).buildPartial();
            } else {
                this.data_ = noRedirectUrl;
            }
            this.dataCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShowContinue(ShowContinue showContinue) {
            showContinue.getClass();
            if (this.dataCase_ == 5 && this.data_ != ShowContinue.getDefaultInstance()) {
                this.data_ = ShowContinue.newBuilder((ShowContinue) this.data_).mergeFrom((ShowContinue.a) showContinue).buildPartial();
            } else {
                this.data_ = showContinue;
            }
            this.dataCase_ = 5;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OAuthInterstitial parseDelimitedFrom(InputStream inputStream) {
            return (OAuthInterstitial) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OAuthInterstitial parseFrom(ByteBuffer byteBuffer) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OAuthInterstitial> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallbackRequestId(String str) {
            str.getClass();
            this.callbackRequestId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallbackRequestIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.callbackRequestId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDesktopToMobileHandoff(DesktopToMobileHandoff desktopToMobileHandoff) {
            desktopToMobileHandoff.getClass();
            this.data_ = desktopToMobileHandoff;
            this.dataCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInstitutionId(String str) {
            str.getClass();
            this.institutionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInstitutionIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.institutionId_ = byteString.toStringUtf8();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setNoRedirectUrl(NoRedirectUrl noRedirectUrl) {
            noRedirectUrl.getClass();
            this.data_ = noRedirectUrl;
            this.dataCase_ = 6;
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
        public void setRedirectUrl(String str) {
            str.getClass();
            this.redirectUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRedirectUrlBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.redirectUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowContinue(ShowContinue showContinue) {
            showContinue.getClass();
            this.data_ = showContinue;
            this.dataCase_ = 5;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OAuthInterstitial();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005<\u0000\u0006<\u0000\u0007<\u0000\bȈ", new Object[]{"data_", "dataCase_", "oauthStateId_", "callbackRequestId_", "redirectUrl_", "institutionId_", ShowContinue.class, NoRedirectUrl.class, DesktopToMobileHandoff.class, "linkSessionId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OAuthInterstitial> parser = PARSER;
                    if (parser == null) {
                        synchronized (OAuthInterstitial.class) {
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

        public String getCallbackRequestId() {
            return this.callbackRequestId_;
        }

        public ByteString getCallbackRequestIdBytes() {
            return ByteString.copyFromUtf8(this.callbackRequestId_);
        }

        public b getDataCase() {
            return b.forNumber(this.dataCase_);
        }

        public DesktopToMobileHandoff getDesktopToMobileHandoff() {
            if (this.dataCase_ == 7) {
                return (DesktopToMobileHandoff) this.data_;
            }
            return DesktopToMobileHandoff.getDefaultInstance();
        }

        public String getInstitutionId() {
            return this.institutionId_;
        }

        public ByteString getInstitutionIdBytes() {
            return ByteString.copyFromUtf8(this.institutionId_);
        }

        public String getLinkSessionId() {
            return this.linkSessionId_;
        }

        public ByteString getLinkSessionIdBytes() {
            return ByteString.copyFromUtf8(this.linkSessionId_);
        }

        public NoRedirectUrl getNoRedirectUrl() {
            if (this.dataCase_ == 6) {
                return (NoRedirectUrl) this.data_;
            }
            return NoRedirectUrl.getDefaultInstance();
        }

        public String getOauthStateId() {
            return this.oauthStateId_;
        }

        public ByteString getOauthStateIdBytes() {
            return ByteString.copyFromUtf8(this.oauthStateId_);
        }

        public String getRedirectUrl() {
            return this.redirectUrl_;
        }

        public ByteString getRedirectUrlBytes() {
            return ByteString.copyFromUtf8(this.redirectUrl_);
        }

        public ShowContinue getShowContinue() {
            if (this.dataCase_ == 5) {
                return (ShowContinue) this.data_;
            }
            return ShowContinue.getDefaultInstance();
        }

        public boolean hasDesktopToMobileHandoff() {
            return this.dataCase_ == 7;
        }

        public boolean hasNoRedirectUrl() {
            return this.dataCase_ == 6;
        }

        public boolean hasShowContinue() {
            return this.dataCase_ == 5;
        }

        public static a newBuilder(OAuthInterstitial oAuthInterstitial) {
            return DEFAULT_INSTANCE.createBuilder(oAuthInterstitial);
        }

        public static OAuthInterstitial parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthInterstitial) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OAuthInterstitial parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OAuthInterstitial parseFrom(ByteString byteString) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OAuthInterstitial parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OAuthInterstitial parseFrom(byte[] bArr) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OAuthInterstitial parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OAuthInterstitial parseFrom(InputStream inputStream) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OAuthInterstitial parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OAuthInterstitial parseFrom(CodedInputStream codedInputStream) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OAuthInterstitial parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class OAuthLink extends GeneratedMessageLite<OAuthLink, a> implements MessageLiteOrBuilder {
        public static final int CLICK_CONTINUE_FIELD_NUMBER = 4;
        private static final OAuthLink DEFAULT_INSTANCE;
        public static final int INSTITUTION_ID_FIELD_NUMBER = 2;
        public static final int LOGIN_CANCELED_FIELD_NUMBER = 8;
        public static final int LOGIN_COMPLETE_FIELD_NUMBER = 10;
        public static final int LOGIN_FAILURE_FIELD_NUMBER = 9;
        public static final int LOGIN_OPEN_FIELD_NUMBER = 7;
        public static final int LOGIN_RESET_STATE_FIELD_NUMBER = 11;
        public static final int OAUTH_STATE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<OAuthLink> PARSER = null;
        public static final int POLLING_COMPLETE_FIELD_NUMBER = 12;
        public static final int POLLING_CONFIRMATION_CLICKED_FIELD_NUMBER = 13;
        public static final int POLLING_STARTED_FIELD_NUMBER = 5;
        public static final int REDIRECT_URI_FIELD_NUMBER = 3;
        public static final int VISIBILITY_STATE_CHANGE_FIELD_NUMBER = 6;
        private Object data_;
        private int dataCase_ = 0;
        private String oauthStateId_ = "";
        private String institutionId_ = "";
        private String redirectUri_ = "";

        /* loaded from: classes2.dex */
        public static final class ClickContinue extends GeneratedMessageLite<ClickContinue, a> implements MessageLiteOrBuilder {
            private static final ClickContinue DEFAULT_INSTANCE;
            private static volatile Parser<ClickContinue> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<ClickContinue, a> implements MessageLiteOrBuilder {
                public a() {
                    super(ClickContinue.DEFAULT_INSTANCE);
                }
            }

            static {
                ClickContinue clickContinue = new ClickContinue();
                DEFAULT_INSTANCE = clickContinue;
                GeneratedMessageLite.registerDefaultInstance(ClickContinue.class, clickContinue);
            }

            private ClickContinue() {
            }

            public static ClickContinue getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ClickContinue parseDelimitedFrom(InputStream inputStream) {
                return (ClickContinue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ClickContinue parseFrom(ByteBuffer byteBuffer) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ClickContinue> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (hd.f18720a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ClickContinue();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ClickContinue> parser = PARSER;
                        if (parser == null) {
                            synchronized (ClickContinue.class) {
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

            public static a newBuilder(ClickContinue clickContinue) {
                return DEFAULT_INSTANCE.createBuilder(clickContinue);
            }

            public static ClickContinue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ClickContinue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ClickContinue parseFrom(ByteString byteString) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ClickContinue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ClickContinue parseFrom(byte[] bArr) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ClickContinue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ClickContinue parseFrom(InputStream inputStream) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ClickContinue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ClickContinue parseFrom(CodedInputStream codedInputStream) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ClickContinue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class LoginCanceled extends GeneratedMessageLite<LoginCanceled, a> implements MessageLiteOrBuilder {
            private static final LoginCanceled DEFAULT_INSTANCE;
            private static volatile Parser<LoginCanceled> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<LoginCanceled, a> implements MessageLiteOrBuilder {
                public a() {
                    super(LoginCanceled.DEFAULT_INSTANCE);
                }
            }

            static {
                LoginCanceled loginCanceled = new LoginCanceled();
                DEFAULT_INSTANCE = loginCanceled;
                GeneratedMessageLite.registerDefaultInstance(LoginCanceled.class, loginCanceled);
            }

            private LoginCanceled() {
            }

            public static LoginCanceled getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static LoginCanceled parseDelimitedFrom(InputStream inputStream) {
                return (LoginCanceled) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginCanceled parseFrom(ByteBuffer byteBuffer) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<LoginCanceled> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (hd.f18720a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new LoginCanceled();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<LoginCanceled> parser = PARSER;
                        if (parser == null) {
                            synchronized (LoginCanceled.class) {
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

            public static a newBuilder(LoginCanceled loginCanceled) {
                return DEFAULT_INSTANCE.createBuilder(loginCanceled);
            }

            public static LoginCanceled parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginCanceled) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginCanceled parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static LoginCanceled parseFrom(ByteString byteString) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static LoginCanceled parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static LoginCanceled parseFrom(byte[] bArr) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LoginCanceled parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static LoginCanceled parseFrom(InputStream inputStream) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginCanceled parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginCanceled parseFrom(CodedInputStream codedInputStream) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static LoginCanceled parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class LoginComplete extends GeneratedMessageLite<LoginComplete, a> implements MessageLiteOrBuilder {
            private static final LoginComplete DEFAULT_INSTANCE;
            private static volatile Parser<LoginComplete> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<LoginComplete, a> implements MessageLiteOrBuilder {
                public a() {
                    super(LoginComplete.DEFAULT_INSTANCE);
                }
            }

            static {
                LoginComplete loginComplete = new LoginComplete();
                DEFAULT_INSTANCE = loginComplete;
                GeneratedMessageLite.registerDefaultInstance(LoginComplete.class, loginComplete);
            }

            private LoginComplete() {
            }

            public static LoginComplete getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static LoginComplete parseDelimitedFrom(InputStream inputStream) {
                return (LoginComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginComplete parseFrom(ByteBuffer byteBuffer) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<LoginComplete> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (hd.f18720a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new LoginComplete();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<LoginComplete> parser = PARSER;
                        if (parser == null) {
                            synchronized (LoginComplete.class) {
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

            public static a newBuilder(LoginComplete loginComplete) {
                return DEFAULT_INSTANCE.createBuilder(loginComplete);
            }

            public static LoginComplete parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginComplete parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static LoginComplete parseFrom(ByteString byteString) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static LoginComplete parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static LoginComplete parseFrom(byte[] bArr) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LoginComplete parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static LoginComplete parseFrom(InputStream inputStream) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginComplete parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginComplete parseFrom(CodedInputStream codedInputStream) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static LoginComplete parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class LoginFailure extends GeneratedMessageLite<LoginFailure, a> implements MessageLiteOrBuilder {
            private static final LoginFailure DEFAULT_INSTANCE;
            private static volatile Parser<LoginFailure> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<LoginFailure, a> implements MessageLiteOrBuilder {
                public a() {
                    super(LoginFailure.DEFAULT_INSTANCE);
                }
            }

            static {
                LoginFailure loginFailure = new LoginFailure();
                DEFAULT_INSTANCE = loginFailure;
                GeneratedMessageLite.registerDefaultInstance(LoginFailure.class, loginFailure);
            }

            private LoginFailure() {
            }

            public static LoginFailure getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static LoginFailure parseDelimitedFrom(InputStream inputStream) {
                return (LoginFailure) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginFailure parseFrom(ByteBuffer byteBuffer) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<LoginFailure> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (hd.f18720a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new LoginFailure();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<LoginFailure> parser = PARSER;
                        if (parser == null) {
                            synchronized (LoginFailure.class) {
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

            public static a newBuilder(LoginFailure loginFailure) {
                return DEFAULT_INSTANCE.createBuilder(loginFailure);
            }

            public static LoginFailure parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginFailure) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginFailure parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static LoginFailure parseFrom(ByteString byteString) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static LoginFailure parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static LoginFailure parseFrom(byte[] bArr) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LoginFailure parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static LoginFailure parseFrom(InputStream inputStream) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginFailure parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginFailure parseFrom(CodedInputStream codedInputStream) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static LoginFailure parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class LoginOpen extends GeneratedMessageLite<LoginOpen, a> implements MessageLiteOrBuilder {
            private static final LoginOpen DEFAULT_INSTANCE;
            public static final int LOGIN_URI_FIELD_NUMBER = 2;
            public static final int METHOD_FIELD_NUMBER = 1;
            private static volatile Parser<LoginOpen> PARSER;
            private String loginUri_ = "";
            private int method_;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<LoginOpen, a> implements MessageLiteOrBuilder {
                public a() {
                    super(LoginOpen.DEFAULT_INSTANCE);
                }
            }

            /* loaded from: classes2.dex */
            public enum b implements Internal.EnumLite {
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_UNSPECIFIED(0),
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_POPUP(1),
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_REDIRECT(2),
                UNRECOGNIZED(-1);
                
                public static final int LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_POPUP_VALUE = 1;
                public static final int LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_REDIRECT_VALUE = 2;
                public static final int LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_UNSPECIFIED_VALUE = 0;

                /* renamed from: b  reason: collision with root package name */
                public static final Internal.EnumLiteMap<b> f18296b = new a();

                /* renamed from: a  reason: collision with root package name */
                public final int f18298a;

                /* loaded from: classes2.dex */
                public class a implements Internal.EnumLiteMap<b> {
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public b findValueByNumber(int i11) {
                        return b.forNumber(i11);
                    }
                }

                /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest$OAuthLink$LoginOpen$b$b  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0332b implements Internal.EnumVerifier {

                    /* renamed from: a  reason: collision with root package name */
                    public static final Internal.EnumVerifier f18299a = new C0332b();

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i11) {
                        return b.forNumber(i11) != null;
                    }
                }

                b(int i11) {
                    this.f18298a = i11;
                }

                public static b forNumber(int i11) {
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                return null;
                            }
                            return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_REDIRECT;
                        }
                        return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_POPUP;
                    }
                    return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_UNSPECIFIED;
                }

                public static Internal.EnumLiteMap<b> internalGetValueMap() {
                    return f18296b;
                }

                public static Internal.EnumVerifier internalGetVerifier() {
                    return C0332b.f18299a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this != UNRECOGNIZED) {
                        return this.f18298a;
                    }
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }

                @Deprecated
                public static b valueOf(int i11) {
                    return forNumber(i11);
                }
            }

            static {
                LoginOpen loginOpen = new LoginOpen();
                DEFAULT_INSTANCE = loginOpen;
                GeneratedMessageLite.registerDefaultInstance(LoginOpen.class, loginOpen);
            }

            private LoginOpen() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLoginUri() {
                this.loginUri_ = getDefaultInstance().getLoginUri();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMethod() {
                this.method_ = 0;
            }

            public static LoginOpen getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static LoginOpen parseDelimitedFrom(InputStream inputStream) {
                return (LoginOpen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginOpen parseFrom(ByteBuffer byteBuffer) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<LoginOpen> parser() {
                return DEFAULT_INSTANCE.getParserForType();
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
            public void setMethod(b bVar) {
                this.method_ = bVar.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMethodValue(int i11) {
                this.method_ = i11;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (hd.f18720a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new LoginOpen();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"method_", "loginUri_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<LoginOpen> parser = PARSER;
                        if (parser == null) {
                            synchronized (LoginOpen.class) {
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

            public String getLoginUri() {
                return this.loginUri_;
            }

            public ByteString getLoginUriBytes() {
                return ByteString.copyFromUtf8(this.loginUri_);
            }

            public b getMethod() {
                b forNumber = b.forNumber(this.method_);
                return forNumber == null ? b.UNRECOGNIZED : forNumber;
            }

            public int getMethodValue() {
                return this.method_;
            }

            public static a newBuilder(LoginOpen loginOpen) {
                return DEFAULT_INSTANCE.createBuilder(loginOpen);
            }

            public static LoginOpen parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginOpen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginOpen parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static LoginOpen parseFrom(ByteString byteString) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static LoginOpen parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static LoginOpen parseFrom(byte[] bArr) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LoginOpen parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static LoginOpen parseFrom(InputStream inputStream) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginOpen parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginOpen parseFrom(CodedInputStream codedInputStream) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static LoginOpen parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class LoginResetState extends GeneratedMessageLite<LoginResetState, a> implements MessageLiteOrBuilder {
            private static final LoginResetState DEFAULT_INSTANCE;
            private static volatile Parser<LoginResetState> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<LoginResetState, a> implements MessageLiteOrBuilder {
                public a() {
                    super(LoginResetState.DEFAULT_INSTANCE);
                }
            }

            static {
                LoginResetState loginResetState = new LoginResetState();
                DEFAULT_INSTANCE = loginResetState;
                GeneratedMessageLite.registerDefaultInstance(LoginResetState.class, loginResetState);
            }

            private LoginResetState() {
            }

            public static LoginResetState getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static LoginResetState parseDelimitedFrom(InputStream inputStream) {
                return (LoginResetState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginResetState parseFrom(ByteBuffer byteBuffer) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<LoginResetState> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (hd.f18720a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new LoginResetState();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<LoginResetState> parser = PARSER;
                        if (parser == null) {
                            synchronized (LoginResetState.class) {
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

            public static a newBuilder(LoginResetState loginResetState) {
                return DEFAULT_INSTANCE.createBuilder(loginResetState);
            }

            public static LoginResetState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginResetState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginResetState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static LoginResetState parseFrom(ByteString byteString) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static LoginResetState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static LoginResetState parseFrom(byte[] bArr) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LoginResetState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static LoginResetState parseFrom(InputStream inputStream) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginResetState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginResetState parseFrom(CodedInputStream codedInputStream) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static LoginResetState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class PollingComplete extends GeneratedMessageLite<PollingComplete, a> implements MessageLiteOrBuilder {
            private static final PollingComplete DEFAULT_INSTANCE;
            private static volatile Parser<PollingComplete> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<PollingComplete, a> implements MessageLiteOrBuilder {
                public a() {
                    super(PollingComplete.DEFAULT_INSTANCE);
                }
            }

            static {
                PollingComplete pollingComplete = new PollingComplete();
                DEFAULT_INSTANCE = pollingComplete;
                GeneratedMessageLite.registerDefaultInstance(PollingComplete.class, pollingComplete);
            }

            private PollingComplete() {
            }

            public static PollingComplete getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PollingComplete parseDelimitedFrom(InputStream inputStream) {
                return (PollingComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PollingComplete parseFrom(ByteBuffer byteBuffer) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PollingComplete> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (hd.f18720a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PollingComplete();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PollingComplete> parser = PARSER;
                        if (parser == null) {
                            synchronized (PollingComplete.class) {
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

            public static a newBuilder(PollingComplete pollingComplete) {
                return DEFAULT_INSTANCE.createBuilder(pollingComplete);
            }

            public static PollingComplete parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PollingComplete parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PollingComplete parseFrom(ByteString byteString) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static PollingComplete parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PollingComplete parseFrom(byte[] bArr) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PollingComplete parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PollingComplete parseFrom(InputStream inputStream) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PollingComplete parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PollingComplete parseFrom(CodedInputStream codedInputStream) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PollingComplete parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class PollingConfirmationClicked extends GeneratedMessageLite<PollingConfirmationClicked, a> implements MessageLiteOrBuilder {
            private static final PollingConfirmationClicked DEFAULT_INSTANCE;
            private static volatile Parser<PollingConfirmationClicked> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<PollingConfirmationClicked, a> implements MessageLiteOrBuilder {
                public a() {
                    super(PollingConfirmationClicked.DEFAULT_INSTANCE);
                }
            }

            static {
                PollingConfirmationClicked pollingConfirmationClicked = new PollingConfirmationClicked();
                DEFAULT_INSTANCE = pollingConfirmationClicked;
                GeneratedMessageLite.registerDefaultInstance(PollingConfirmationClicked.class, pollingConfirmationClicked);
            }

            private PollingConfirmationClicked() {
            }

            public static PollingConfirmationClicked getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PollingConfirmationClicked parseDelimitedFrom(InputStream inputStream) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PollingConfirmationClicked parseFrom(ByteBuffer byteBuffer) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PollingConfirmationClicked> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (hd.f18720a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PollingConfirmationClicked();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PollingConfirmationClicked> parser = PARSER;
                        if (parser == null) {
                            synchronized (PollingConfirmationClicked.class) {
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

            public static a newBuilder(PollingConfirmationClicked pollingConfirmationClicked) {
                return DEFAULT_INSTANCE.createBuilder(pollingConfirmationClicked);
            }

            public static PollingConfirmationClicked parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PollingConfirmationClicked parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PollingConfirmationClicked parseFrom(ByteString byteString) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static PollingConfirmationClicked parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PollingConfirmationClicked parseFrom(byte[] bArr) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PollingConfirmationClicked parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PollingConfirmationClicked parseFrom(InputStream inputStream) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PollingConfirmationClicked parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PollingConfirmationClicked parseFrom(CodedInputStream codedInputStream) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PollingConfirmationClicked parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class PollingStarted extends GeneratedMessageLite<PollingStarted, a> implements MessageLiteOrBuilder {
            private static final PollingStarted DEFAULT_INSTANCE;
            private static volatile Parser<PollingStarted> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<PollingStarted, a> implements MessageLiteOrBuilder {
                public a() {
                    super(PollingStarted.DEFAULT_INSTANCE);
                }
            }

            static {
                PollingStarted pollingStarted = new PollingStarted();
                DEFAULT_INSTANCE = pollingStarted;
                GeneratedMessageLite.registerDefaultInstance(PollingStarted.class, pollingStarted);
            }

            private PollingStarted() {
            }

            public static PollingStarted getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PollingStarted parseDelimitedFrom(InputStream inputStream) {
                return (PollingStarted) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PollingStarted parseFrom(ByteBuffer byteBuffer) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PollingStarted> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (hd.f18720a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PollingStarted();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PollingStarted> parser = PARSER;
                        if (parser == null) {
                            synchronized (PollingStarted.class) {
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

            public static a newBuilder(PollingStarted pollingStarted) {
                return DEFAULT_INSTANCE.createBuilder(pollingStarted);
            }

            public static PollingStarted parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingStarted) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PollingStarted parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PollingStarted parseFrom(ByteString byteString) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static PollingStarted parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PollingStarted parseFrom(byte[] bArr) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PollingStarted parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PollingStarted parseFrom(InputStream inputStream) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PollingStarted parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PollingStarted parseFrom(CodedInputStream codedInputStream) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PollingStarted parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class VisibilityStateChange extends GeneratedMessageLite<VisibilityStateChange, a> implements MessageLiteOrBuilder {
            private static final VisibilityStateChange DEFAULT_INSTANCE;
            private static volatile Parser<VisibilityStateChange> PARSER = null;
            public static final int VISIBILITY_STATE_FIELD_NUMBER = 1;
            private String visibilityState_ = "";

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<VisibilityStateChange, a> implements MessageLiteOrBuilder {
                public a() {
                    super(VisibilityStateChange.DEFAULT_INSTANCE);
                }
            }

            static {
                VisibilityStateChange visibilityStateChange = new VisibilityStateChange();
                DEFAULT_INSTANCE = visibilityStateChange;
                GeneratedMessageLite.registerDefaultInstance(VisibilityStateChange.class, visibilityStateChange);
            }

            private VisibilityStateChange() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVisibilityState() {
                this.visibilityState_ = getDefaultInstance().getVisibilityState();
            }

            public static VisibilityStateChange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static VisibilityStateChange parseDelimitedFrom(InputStream inputStream) {
                return (VisibilityStateChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static VisibilityStateChange parseFrom(ByteBuffer byteBuffer) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<VisibilityStateChange> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVisibilityState(String str) {
                str.getClass();
                this.visibilityState_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVisibilityStateBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.visibilityState_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (hd.f18720a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new VisibilityStateChange();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"visibilityState_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<VisibilityStateChange> parser = PARSER;
                        if (parser == null) {
                            synchronized (VisibilityStateChange.class) {
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

            public String getVisibilityState() {
                return this.visibilityState_;
            }

            public ByteString getVisibilityStateBytes() {
                return ByteString.copyFromUtf8(this.visibilityState_);
            }

            public static a newBuilder(VisibilityStateChange visibilityStateChange) {
                return DEFAULT_INSTANCE.createBuilder(visibilityStateChange);
            }

            public static VisibilityStateChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityStateChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static VisibilityStateChange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static VisibilityStateChange parseFrom(ByteString byteString) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static VisibilityStateChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static VisibilityStateChange parseFrom(byte[] bArr) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static VisibilityStateChange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static VisibilityStateChange parseFrom(InputStream inputStream) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static VisibilityStateChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static VisibilityStateChange parseFrom(CodedInputStream codedInputStream) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static VisibilityStateChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public enum b {
            CLICK_CONTINUE(4),
            POLLING_STARTED(5),
            VISIBILITY_STATE_CHANGE(6),
            POLLING_COMPLETE(12),
            POLLING_CONFIRMATION_CLICKED(13),
            LOGIN_OPEN(7),
            LOGIN_CANCELED(8),
            LOGIN_FAILURE(9),
            LOGIN_COMPLETE(10),
            LOGIN_RESET_STATE(11),
            DATA_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            public final int f18301a;

            b(int i11) {
                this.f18301a = i11;
            }

            public static b forNumber(int i11) {
                if (i11 != 0) {
                    switch (i11) {
                        case 4:
                            return CLICK_CONTINUE;
                        case 5:
                            return POLLING_STARTED;
                        case 6:
                            return VISIBILITY_STATE_CHANGE;
                        case 7:
                            return LOGIN_OPEN;
                        case 8:
                            return LOGIN_CANCELED;
                        case 9:
                            return LOGIN_FAILURE;
                        case 10:
                            return LOGIN_COMPLETE;
                        case 11:
                            return LOGIN_RESET_STATE;
                        case 12:
                            return POLLING_COMPLETE;
                        case 13:
                            return POLLING_CONFIRMATION_CLICKED;
                        default:
                            return null;
                    }
                }
                return DATA_NOT_SET;
            }

            public int getNumber() {
                return this.f18301a;
            }

            @Deprecated
            public static b valueOf(int i11) {
                return forNumber(i11);
            }
        }

        static {
            OAuthLink oAuthLink = new OAuthLink();
            DEFAULT_INSTANCE = oAuthLink;
            GeneratedMessageLite.registerDefaultInstance(OAuthLink.class, oAuthLink);
        }

        private OAuthLink() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClickContinue() {
            if (this.dataCase_ == 4) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.dataCase_ = 0;
            this.data_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInstitutionId() {
            this.institutionId_ = getDefaultInstance().getInstitutionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoginCanceled() {
            if (this.dataCase_ == 8) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoginComplete() {
            if (this.dataCase_ == 10) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoginFailure() {
            if (this.dataCase_ == 9) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoginOpen() {
            if (this.dataCase_ == 7) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoginResetState() {
            if (this.dataCase_ == 11) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOauthStateId() {
            this.oauthStateId_ = getDefaultInstance().getOauthStateId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPollingComplete() {
            if (this.dataCase_ == 12) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPollingConfirmationClicked() {
            if (this.dataCase_ == 13) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPollingStarted() {
            if (this.dataCase_ == 5) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRedirectUri() {
            this.redirectUri_ = getDefaultInstance().getRedirectUri();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVisibilityStateChange() {
            if (this.dataCase_ == 6) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        public static OAuthLink getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeClickContinue(ClickContinue clickContinue) {
            clickContinue.getClass();
            if (this.dataCase_ == 4 && this.data_ != ClickContinue.getDefaultInstance()) {
                this.data_ = ClickContinue.newBuilder((ClickContinue) this.data_).mergeFrom((ClickContinue.a) clickContinue).buildPartial();
            } else {
                this.data_ = clickContinue;
            }
            this.dataCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLoginCanceled(LoginCanceled loginCanceled) {
            loginCanceled.getClass();
            if (this.dataCase_ == 8 && this.data_ != LoginCanceled.getDefaultInstance()) {
                this.data_ = LoginCanceled.newBuilder((LoginCanceled) this.data_).mergeFrom((LoginCanceled.a) loginCanceled).buildPartial();
            } else {
                this.data_ = loginCanceled;
            }
            this.dataCase_ = 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLoginComplete(LoginComplete loginComplete) {
            loginComplete.getClass();
            if (this.dataCase_ == 10 && this.data_ != LoginComplete.getDefaultInstance()) {
                this.data_ = LoginComplete.newBuilder((LoginComplete) this.data_).mergeFrom((LoginComplete.a) loginComplete).buildPartial();
            } else {
                this.data_ = loginComplete;
            }
            this.dataCase_ = 10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLoginFailure(LoginFailure loginFailure) {
            loginFailure.getClass();
            if (this.dataCase_ == 9 && this.data_ != LoginFailure.getDefaultInstance()) {
                this.data_ = LoginFailure.newBuilder((LoginFailure) this.data_).mergeFrom((LoginFailure.a) loginFailure).buildPartial();
            } else {
                this.data_ = loginFailure;
            }
            this.dataCase_ = 9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLoginOpen(LoginOpen loginOpen) {
            loginOpen.getClass();
            if (this.dataCase_ == 7 && this.data_ != LoginOpen.getDefaultInstance()) {
                this.data_ = LoginOpen.newBuilder((LoginOpen) this.data_).mergeFrom((LoginOpen.a) loginOpen).buildPartial();
            } else {
                this.data_ = loginOpen;
            }
            this.dataCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLoginResetState(LoginResetState loginResetState) {
            loginResetState.getClass();
            if (this.dataCase_ == 11 && this.data_ != LoginResetState.getDefaultInstance()) {
                this.data_ = LoginResetState.newBuilder((LoginResetState) this.data_).mergeFrom((LoginResetState.a) loginResetState).buildPartial();
            } else {
                this.data_ = loginResetState;
            }
            this.dataCase_ = 11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePollingComplete(PollingComplete pollingComplete) {
            pollingComplete.getClass();
            if (this.dataCase_ == 12 && this.data_ != PollingComplete.getDefaultInstance()) {
                this.data_ = PollingComplete.newBuilder((PollingComplete) this.data_).mergeFrom((PollingComplete.a) pollingComplete).buildPartial();
            } else {
                this.data_ = pollingComplete;
            }
            this.dataCase_ = 12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePollingConfirmationClicked(PollingConfirmationClicked pollingConfirmationClicked) {
            pollingConfirmationClicked.getClass();
            if (this.dataCase_ == 13 && this.data_ != PollingConfirmationClicked.getDefaultInstance()) {
                this.data_ = PollingConfirmationClicked.newBuilder((PollingConfirmationClicked) this.data_).mergeFrom((PollingConfirmationClicked.a) pollingConfirmationClicked).buildPartial();
            } else {
                this.data_ = pollingConfirmationClicked;
            }
            this.dataCase_ = 13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePollingStarted(PollingStarted pollingStarted) {
            pollingStarted.getClass();
            if (this.dataCase_ == 5 && this.data_ != PollingStarted.getDefaultInstance()) {
                this.data_ = PollingStarted.newBuilder((PollingStarted) this.data_).mergeFrom((PollingStarted.a) pollingStarted).buildPartial();
            } else {
                this.data_ = pollingStarted;
            }
            this.dataCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVisibilityStateChange(VisibilityStateChange visibilityStateChange) {
            visibilityStateChange.getClass();
            if (this.dataCase_ == 6 && this.data_ != VisibilityStateChange.getDefaultInstance()) {
                this.data_ = VisibilityStateChange.newBuilder((VisibilityStateChange) this.data_).mergeFrom((VisibilityStateChange.a) visibilityStateChange).buildPartial();
            } else {
                this.data_ = visibilityStateChange;
            }
            this.dataCase_ = 6;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OAuthLink parseDelimitedFrom(InputStream inputStream) {
            return (OAuthLink) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OAuthLink parseFrom(ByteBuffer byteBuffer) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OAuthLink> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClickContinue(ClickContinue clickContinue) {
            clickContinue.getClass();
            this.data_ = clickContinue;
            this.dataCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInstitutionId(String str) {
            str.getClass();
            this.institutionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInstitutionIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.institutionId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoginCanceled(LoginCanceled loginCanceled) {
            loginCanceled.getClass();
            this.data_ = loginCanceled;
            this.dataCase_ = 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoginComplete(LoginComplete loginComplete) {
            loginComplete.getClass();
            this.data_ = loginComplete;
            this.dataCase_ = 10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoginFailure(LoginFailure loginFailure) {
            loginFailure.getClass();
            this.data_ = loginFailure;
            this.dataCase_ = 9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoginOpen(LoginOpen loginOpen) {
            loginOpen.getClass();
            this.data_ = loginOpen;
            this.dataCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoginResetState(LoginResetState loginResetState) {
            loginResetState.getClass();
            this.data_ = loginResetState;
            this.dataCase_ = 11;
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
        public void setPollingComplete(PollingComplete pollingComplete) {
            pollingComplete.getClass();
            this.data_ = pollingComplete;
            this.dataCase_ = 12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPollingConfirmationClicked(PollingConfirmationClicked pollingConfirmationClicked) {
            pollingConfirmationClicked.getClass();
            this.data_ = pollingConfirmationClicked;
            this.dataCase_ = 13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPollingStarted(PollingStarted pollingStarted) {
            pollingStarted.getClass();
            this.data_ = pollingStarted;
            this.dataCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRedirectUri(String str) {
            str.getClass();
            this.redirectUri_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRedirectUriBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.redirectUri_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVisibilityStateChange(VisibilityStateChange visibilityStateChange) {
            visibilityStateChange.getClass();
            this.data_ = visibilityStateChange;
            this.dataCase_ = 6;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OAuthLink();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0001\u0000\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"data_", "dataCase_", "oauthStateId_", "institutionId_", "redirectUri_", ClickContinue.class, PollingStarted.class, VisibilityStateChange.class, LoginOpen.class, LoginCanceled.class, LoginFailure.class, LoginComplete.class, LoginResetState.class, PollingComplete.class, PollingConfirmationClicked.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OAuthLink> parser = PARSER;
                    if (parser == null) {
                        synchronized (OAuthLink.class) {
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

        public ClickContinue getClickContinue() {
            if (this.dataCase_ == 4) {
                return (ClickContinue) this.data_;
            }
            return ClickContinue.getDefaultInstance();
        }

        public b getDataCase() {
            return b.forNumber(this.dataCase_);
        }

        public String getInstitutionId() {
            return this.institutionId_;
        }

        public ByteString getInstitutionIdBytes() {
            return ByteString.copyFromUtf8(this.institutionId_);
        }

        public LoginCanceled getLoginCanceled() {
            if (this.dataCase_ == 8) {
                return (LoginCanceled) this.data_;
            }
            return LoginCanceled.getDefaultInstance();
        }

        public LoginComplete getLoginComplete() {
            if (this.dataCase_ == 10) {
                return (LoginComplete) this.data_;
            }
            return LoginComplete.getDefaultInstance();
        }

        public LoginFailure getLoginFailure() {
            if (this.dataCase_ == 9) {
                return (LoginFailure) this.data_;
            }
            return LoginFailure.getDefaultInstance();
        }

        public LoginOpen getLoginOpen() {
            if (this.dataCase_ == 7) {
                return (LoginOpen) this.data_;
            }
            return LoginOpen.getDefaultInstance();
        }

        public LoginResetState getLoginResetState() {
            if (this.dataCase_ == 11) {
                return (LoginResetState) this.data_;
            }
            return LoginResetState.getDefaultInstance();
        }

        public String getOauthStateId() {
            return this.oauthStateId_;
        }

        public ByteString getOauthStateIdBytes() {
            return ByteString.copyFromUtf8(this.oauthStateId_);
        }

        public PollingComplete getPollingComplete() {
            if (this.dataCase_ == 12) {
                return (PollingComplete) this.data_;
            }
            return PollingComplete.getDefaultInstance();
        }

        public PollingConfirmationClicked getPollingConfirmationClicked() {
            if (this.dataCase_ == 13) {
                return (PollingConfirmationClicked) this.data_;
            }
            return PollingConfirmationClicked.getDefaultInstance();
        }

        public PollingStarted getPollingStarted() {
            if (this.dataCase_ == 5) {
                return (PollingStarted) this.data_;
            }
            return PollingStarted.getDefaultInstance();
        }

        public String getRedirectUri() {
            return this.redirectUri_;
        }

        public ByteString getRedirectUriBytes() {
            return ByteString.copyFromUtf8(this.redirectUri_);
        }

        public VisibilityStateChange getVisibilityStateChange() {
            if (this.dataCase_ == 6) {
                return (VisibilityStateChange) this.data_;
            }
            return VisibilityStateChange.getDefaultInstance();
        }

        public boolean hasClickContinue() {
            return this.dataCase_ == 4;
        }

        public boolean hasLoginCanceled() {
            return this.dataCase_ == 8;
        }

        public boolean hasLoginComplete() {
            return this.dataCase_ == 10;
        }

        public boolean hasLoginFailure() {
            return this.dataCase_ == 9;
        }

        public boolean hasLoginOpen() {
            return this.dataCase_ == 7;
        }

        public boolean hasLoginResetState() {
            return this.dataCase_ == 11;
        }

        public boolean hasPollingComplete() {
            return this.dataCase_ == 12;
        }

        public boolean hasPollingConfirmationClicked() {
            return this.dataCase_ == 13;
        }

        public boolean hasPollingStarted() {
            return this.dataCase_ == 5;
        }

        public boolean hasVisibilityStateChange() {
            return this.dataCase_ == 6;
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<OAuthLink, a> implements MessageLiteOrBuilder {
            public a() {
                super(OAuthLink.DEFAULT_INSTANCE);
            }

            public a a(PollingStarted pollingStarted) {
                copyOnWrite();
                ((OAuthLink) this.instance).setPollingStarted(pollingStarted);
                return this;
            }

            public a a(PollingComplete pollingComplete) {
                copyOnWrite();
                ((OAuthLink) this.instance).setPollingComplete(pollingComplete);
                return this;
            }
        }

        public static a newBuilder(OAuthLink oAuthLink) {
            return DEFAULT_INSTANCE.createBuilder(oAuthLink);
        }

        public static OAuthLink parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthLink) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OAuthLink parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OAuthLink parseFrom(ByteString byteString) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OAuthLink parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OAuthLink parseFrom(byte[] bArr) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OAuthLink parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OAuthLink parseFrom(InputStream inputStream) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OAuthLink parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OAuthLink parseFrom(CodedInputStream codedInputStream) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OAuthLink parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class PaneAppeared extends GeneratedMessageLite<PaneAppeared, a> implements MessageLiteOrBuilder {
        private static final PaneAppeared DEFAULT_INSTANCE;
        public static final int PANE_NODE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<PaneAppeared> PARSER;
        private String paneNodeId_ = "";

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<PaneAppeared, a> implements MessageLiteOrBuilder {
            public a() {
                super(PaneAppeared.DEFAULT_INSTANCE);
            }
        }

        static {
            PaneAppeared paneAppeared = new PaneAppeared();
            DEFAULT_INSTANCE = paneAppeared;
            GeneratedMessageLite.registerDefaultInstance(PaneAppeared.class, paneAppeared);
        }

        private PaneAppeared() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaneNodeId() {
            this.paneNodeId_ = getDefaultInstance().getPaneNodeId();
        }

        public static PaneAppeared getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PaneAppeared parseDelimitedFrom(InputStream inputStream) {
            return (PaneAppeared) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PaneAppeared parseFrom(ByteBuffer byteBuffer) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PaneAppeared> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaneNodeId(String str) {
            str.getClass();
            this.paneNodeId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaneNodeIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.paneNodeId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PaneAppeared();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"paneNodeId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PaneAppeared> parser = PARSER;
                    if (parser == null) {
                        synchronized (PaneAppeared.class) {
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

        public String getPaneNodeId() {
            return this.paneNodeId_;
        }

        public ByteString getPaneNodeIdBytes() {
            return ByteString.copyFromUtf8(this.paneNodeId_);
        }

        public static a newBuilder(PaneAppeared paneAppeared) {
            return DEFAULT_INSTANCE.createBuilder(paneAppeared);
        }

        public static PaneAppeared parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAppeared) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PaneAppeared parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PaneAppeared parseFrom(ByteString byteString) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PaneAppeared parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PaneAppeared parseFrom(byte[] bArr) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PaneAppeared parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PaneAppeared parseFrom(InputStream inputStream) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PaneAppeared parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PaneAppeared parseFrom(CodedInputStream codedInputStream) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PaneAppeared parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SearchSuccess extends GeneratedMessageLite<SearchSuccess, a> implements MessageLiteOrBuilder {
        private static final SearchSuccess DEFAULT_INSTANCE;
        private static volatile Parser<SearchSuccess> PARSER = null;
        public static final int QUERY_FIELD_NUMBER = 1;
        public static final int RESULTS_FIELD_NUMBER = 3;
        public static final int RESULT_COUNT_FIELD_NUMBER = 2;
        private long resultCount_;
        private String query_ = "";
        private Internal.ProtobufList<Result> results_ = GeneratedMessageLite.emptyProtobufList();

        /* loaded from: classes2.dex */
        public static final class Result extends GeneratedMessageLite<Result, a> implements b {
            private static final Result DEFAULT_INSTANCE;
            public static final int INSTITUTION_ID_FIELD_NUMBER = 1;
            private static volatile Parser<Result> PARSER;
            private String institutionId_ = "";

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<Result, a> implements b {
                public a() {
                    super(Result.DEFAULT_INSTANCE);
                }
            }

            static {
                Result result = new Result();
                DEFAULT_INSTANCE = result;
                GeneratedMessageLite.registerDefaultInstance(Result.class, result);
            }

            private Result() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInstitutionId() {
                this.institutionId_ = getDefaultInstance().getInstitutionId();
            }

            public static Result getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Result parseDelimitedFrom(InputStream inputStream) {
                return (Result) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Result parseFrom(ByteBuffer byteBuffer) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Result> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInstitutionId(String str) {
                str.getClass();
                this.institutionId_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInstitutionIdBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.institutionId_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (hd.f18720a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Result();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"institutionId_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Result> parser = PARSER;
                        if (parser == null) {
                            synchronized (Result.class) {
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

            public String getInstitutionId() {
                return this.institutionId_;
            }

            public ByteString getInstitutionIdBytes() {
                return ByteString.copyFromUtf8(this.institutionId_);
            }

            public static a newBuilder(Result result) {
                return DEFAULT_INSTANCE.createBuilder(result);
            }

            public static Result parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Result) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Result parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Result parseFrom(ByteString byteString) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Result parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Result parseFrom(byte[] bArr) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Result parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Result parseFrom(InputStream inputStream) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Result parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Result parseFrom(CodedInputStream codedInputStream) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Result parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<SearchSuccess, a> implements MessageLiteOrBuilder {
            public a() {
                super(SearchSuccess.DEFAULT_INSTANCE);
            }
        }

        /* loaded from: classes2.dex */
        public interface b extends MessageLiteOrBuilder {
        }

        static {
            SearchSuccess searchSuccess = new SearchSuccess();
            DEFAULT_INSTANCE = searchSuccess;
            GeneratedMessageLite.registerDefaultInstance(SearchSuccess.class, searchSuccess);
        }

        private SearchSuccess() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllResults(Iterable<? extends Result> iterable) {
            ensureResultsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.results_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResults(Result result) {
            result.getClass();
            ensureResultsIsMutable();
            this.results_.add(result);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuery() {
            this.query_ = getDefaultInstance().getQuery();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResultCount() {
            this.resultCount_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResults() {
            this.results_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureResultsIsMutable() {
            Internal.ProtobufList<Result> protobufList = this.results_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.results_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static SearchSuccess getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SearchSuccess parseDelimitedFrom(InputStream inputStream) {
            return (SearchSuccess) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SearchSuccess parseFrom(ByteBuffer byteBuffer) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SearchSuccess> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeResults(int i11) {
            ensureResultsIsMutable();
            this.results_.remove(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuery(String str) {
            str.getClass();
            this.query_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQueryBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.query_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultCount(long j11) {
            this.resultCount_ = j11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResults(int i11, Result result) {
            result.getClass();
            ensureResultsIsMutable();
            this.results_.set(i11, result);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SearchSuccess();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0002\u0003\u001b", new Object[]{"query_", "resultCount_", "results_", Result.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SearchSuccess> parser = PARSER;
                    if (parser == null) {
                        synchronized (SearchSuccess.class) {
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

        public String getQuery() {
            return this.query_;
        }

        public ByteString getQueryBytes() {
            return ByteString.copyFromUtf8(this.query_);
        }

        public long getResultCount() {
            return this.resultCount_;
        }

        public Result getResults(int i11) {
            return this.results_.get(i11);
        }

        public int getResultsCount() {
            return this.results_.size();
        }

        public List<Result> getResultsList() {
            return this.results_;
        }

        public b getResultsOrBuilder(int i11) {
            return this.results_.get(i11);
        }

        public List<? extends b> getResultsOrBuilderList() {
            return this.results_;
        }

        public static a newBuilder(SearchSuccess searchSuccess) {
            return DEFAULT_INSTANCE.createBuilder(searchSuccess);
        }

        public static SearchSuccess parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchSuccess) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SearchSuccess parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SearchSuccess parseFrom(ByteString byteString) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResults(int i11, Result result) {
            result.getClass();
            ensureResultsIsMutable();
            this.results_.add(i11, result);
        }

        public static SearchSuccess parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SearchSuccess parseFrom(byte[] bArr) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SearchSuccess parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SearchSuccess parseFrom(InputStream inputStream) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SearchSuccess parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SearchSuccess parseFrom(CodedInputStream codedInputStream) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SearchSuccess parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SecureInputToggle extends GeneratedMessageLite<SecureInputToggle, a> implements MessageLiteOrBuilder {
        private static final SecureInputToggle DEFAULT_INSTANCE;
        public static final int INPUT_ID_FIELD_NUMBER = 1;
        public static final int INPUT_MASKED_FIELD_NUMBER = 2;
        private static volatile Parser<SecureInputToggle> PARSER;
        private String inputId_ = "";
        private boolean inputMasked_;

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<SecureInputToggle, a> implements MessageLiteOrBuilder {
            public a() {
                super(SecureInputToggle.DEFAULT_INSTANCE);
            }
        }

        static {
            SecureInputToggle secureInputToggle = new SecureInputToggle();
            DEFAULT_INSTANCE = secureInputToggle;
            GeneratedMessageLite.registerDefaultInstance(SecureInputToggle.class, secureInputToggle);
        }

        private SecureInputToggle() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInputId() {
            this.inputId_ = getDefaultInstance().getInputId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInputMasked() {
            this.inputMasked_ = false;
        }

        public static SecureInputToggle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SecureInputToggle parseDelimitedFrom(InputStream inputStream) {
            return (SecureInputToggle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SecureInputToggle parseFrom(ByteBuffer byteBuffer) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SecureInputToggle> parser() {
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
        public void setInputMasked(boolean z11) {
            this.inputMasked_ = z11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SecureInputToggle();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"inputId_", "inputMasked_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SecureInputToggle> parser = PARSER;
                    if (parser == null) {
                        synchronized (SecureInputToggle.class) {
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

        public boolean getInputMasked() {
            return this.inputMasked_;
        }

        public static a newBuilder(SecureInputToggle secureInputToggle) {
            return DEFAULT_INSTANCE.createBuilder(secureInputToggle);
        }

        public static SecureInputToggle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureInputToggle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SecureInputToggle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SecureInputToggle parseFrom(ByteString byteString) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SecureInputToggle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SecureInputToggle parseFrom(byte[] bArr) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SecureInputToggle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SecureInputToggle parseFrom(InputStream inputStream) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SecureInputToggle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SecureInputToggle parseFrom(CodedInputStream codedInputStream) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SecureInputToggle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SessionExpired extends GeneratedMessageLite<SessionExpired, a> implements MessageLiteOrBuilder {
        private static final SessionExpired DEFAULT_INSTANCE;
        private static volatile Parser<SessionExpired> PARSER;

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<SessionExpired, a> implements MessageLiteOrBuilder {
            public a() {
                super(SessionExpired.DEFAULT_INSTANCE);
            }
        }

        static {
            SessionExpired sessionExpired = new SessionExpired();
            DEFAULT_INSTANCE = sessionExpired;
            GeneratedMessageLite.registerDefaultInstance(SessionExpired.class, sessionExpired);
        }

        private SessionExpired() {
        }

        public static SessionExpired getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SessionExpired parseDelimitedFrom(InputStream inputStream) {
            return (SessionExpired) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionExpired parseFrom(ByteBuffer byteBuffer) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SessionExpired> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SessionExpired();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SessionExpired> parser = PARSER;
                    if (parser == null) {
                        synchronized (SessionExpired.class) {
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

        public static a newBuilder(SessionExpired sessionExpired) {
            return DEFAULT_INSTANCE.createBuilder(sessionExpired);
        }

        public static SessionExpired parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionExpired) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionExpired parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SessionExpired parseFrom(ByteString byteString) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SessionExpired parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SessionExpired parseFrom(byte[] bArr) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SessionExpired parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SessionExpired parseFrom(InputStream inputStream) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionExpired parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionExpired parseFrom(CodedInputStream codedInputStream) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SessionExpired parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class TrackEventWithOptimizely extends GeneratedMessageLite<TrackEventWithOptimizely, a> implements MessageLiteOrBuilder {
        private static final TrackEventWithOptimizely DEFAULT_INSTANCE;
        public static final int EVENT_NAME_FIELD_NUMBER = 1;
        private static volatile Parser<TrackEventWithOptimizely> PARSER;
        private String eventName_ = "";

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<TrackEventWithOptimizely, a> implements MessageLiteOrBuilder {
            public a() {
                super(TrackEventWithOptimizely.DEFAULT_INSTANCE);
            }
        }

        static {
            TrackEventWithOptimizely trackEventWithOptimizely = new TrackEventWithOptimizely();
            DEFAULT_INSTANCE = trackEventWithOptimizely;
            GeneratedMessageLite.registerDefaultInstance(TrackEventWithOptimizely.class, trackEventWithOptimizely);
        }

        private TrackEventWithOptimizely() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventName() {
            this.eventName_ = getDefaultInstance().getEventName();
        }

        public static TrackEventWithOptimizely getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TrackEventWithOptimizely parseDelimitedFrom(InputStream inputStream) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TrackEventWithOptimizely parseFrom(ByteBuffer byteBuffer) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<TrackEventWithOptimizely> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventName(String str) {
            str.getClass();
            this.eventName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.eventName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new TrackEventWithOptimizely();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"eventName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TrackEventWithOptimizely> parser = PARSER;
                    if (parser == null) {
                        synchronized (TrackEventWithOptimizely.class) {
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

        public String getEventName() {
            return this.eventName_;
        }

        public ByteString getEventNameBytes() {
            return ByteString.copyFromUtf8(this.eventName_);
        }

        public static a newBuilder(TrackEventWithOptimizely trackEventWithOptimizely) {
            return DEFAULT_INSTANCE.createBuilder(trackEventWithOptimizely);
        }

        public static TrackEventWithOptimizely parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TrackEventWithOptimizely parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TrackEventWithOptimizely parseFrom(ByteString byteString) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TrackEventWithOptimizely parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TrackEventWithOptimizely parseFrom(byte[] bArr) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TrackEventWithOptimizely parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TrackEventWithOptimizely parseFrom(InputStream inputStream) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TrackEventWithOptimizely parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TrackEventWithOptimizely parseFrom(CodedInputStream codedInputStream) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TrackEventWithOptimizely parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public interface b extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface c extends MessageLiteOrBuilder {
    }

    static {
        Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest = new Workflow$LinkWorkflowEventRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowEventRequest;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowEventRequest.class, workflow$LinkWorkflowEventRequest);
    }

    private Workflow$LinkWorkflowEventRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvents(Iterable<? extends Event> iterable) {
        ensureEventsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.events_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLegacyAnalytics(Iterable<? extends LegacyAnalytics> iterable) {
        ensureLegacyAnalyticsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.legacyAnalytics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(Event event) {
        event.getClass();
        ensureEventsIsMutable();
        this.events_.add(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLegacyAnalytics(LegacyAnalytics legacyAnalytics) {
        legacyAnalytics.getClass();
        ensureLegacyAnalyticsIsMutable();
        this.legacyAnalytics_.add(legacyAnalytics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvents() {
        this.events_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacyAnalytics() {
        this.legacyAnalytics_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    private void ensureEventsIsMutable() {
        Internal.ProtobufList<Event> protobufList = this.events_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.events_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureLegacyAnalyticsIsMutable() {
        Internal.ProtobufList<LegacyAnalytics> protobufList = this.legacyAnalytics_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.legacyAnalytics_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Workflow$LinkWorkflowEventRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowEventRequest parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowEventRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEvents(int i11) {
        ensureEventsIsMutable();
        this.events_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLegacyAnalytics(int i11) {
        ensureLegacyAnalyticsIsMutable();
        this.legacyAnalytics_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvents(int i11, Event event) {
        event.getClass();
        ensureEventsIsMutable();
        this.events_.set(i11, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyAnalytics(int i11, LegacyAnalytics legacyAnalytics) {
        legacyAnalytics.getClass();
        ensureLegacyAnalyticsIsMutable();
        this.legacyAnalytics_.set(i11, legacyAnalytics);
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
                return new Workflow$LinkWorkflowEventRequest();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002Ȉ\u0003\u001b", new Object[]{"legacyAnalytics_", LegacyAnalytics.class, "workflowSessionId_", "events_", Event.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowEventRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (Workflow$LinkWorkflowEventRequest.class) {
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

    public Event getEvents(int i11) {
        return this.events_.get(i11);
    }

    public int getEventsCount() {
        return this.events_.size();
    }

    public List<Event> getEventsList() {
        return this.events_;
    }

    public b getEventsOrBuilder(int i11) {
        return this.events_.get(i11);
    }

    public List<? extends b> getEventsOrBuilderList() {
        return this.events_;
    }

    public LegacyAnalytics getLegacyAnalytics(int i11) {
        return this.legacyAnalytics_.get(i11);
    }

    public int getLegacyAnalyticsCount() {
        return this.legacyAnalytics_.size();
    }

    public List<LegacyAnalytics> getLegacyAnalyticsList() {
        return this.legacyAnalytics_;
    }

    public c getLegacyAnalyticsOrBuilder(int i11) {
        return this.legacyAnalytics_.get(i11);
    }

    public List<? extends c> getLegacyAnalyticsOrBuilderList() {
        return this.legacyAnalytics_;
    }

    public String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public ByteString getWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowEventRequest, a> implements MessageLiteOrBuilder {
        public a() {
            super(Workflow$LinkWorkflowEventRequest.DEFAULT_INSTANCE);
        }

        public a a(String str) {
            copyOnWrite();
            ((Workflow$LinkWorkflowEventRequest) this.instance).setWorkflowSessionId(str);
            return this;
        }

        public a a(Iterable<? extends Event> iterable) {
            copyOnWrite();
            ((Workflow$LinkWorkflowEventRequest) this.instance).addAllEvents(iterable);
            return this;
        }
    }

    public static a newBuilder(Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowEventRequest);
    }

    public static Workflow$LinkWorkflowEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(int i11, Event event) {
        event.getClass();
        ensureEventsIsMutable();
        this.events_.add(i11, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLegacyAnalytics(int i11, LegacyAnalytics legacyAnalytics) {
        legacyAnalytics.getClass();
        ensureLegacyAnalyticsIsMutable();
        this.legacyAnalytics_.add(i11, legacyAnalytics);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}