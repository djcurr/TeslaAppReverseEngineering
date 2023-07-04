package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.e;
import com.plaid.internal.hd;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Workflow$LinkWorkflowNextResponse extends GeneratedMessageLite<Workflow$LinkWorkflowNextResponse, a> implements MessageLiteOrBuilder {
    public static final int ADDITIONAL_PANES_FIELD_NUMBER = 3;
    public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 5;
    private static final Workflow$LinkWorkflowNextResponse DEFAULT_INSTANCE;
    public static final int NEXT_PANE_FIELD_NUMBER = 2;
    private static volatile Parser<Workflow$LinkWorkflowNextResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 4;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private Pane$PaneRendering nextPane_;
    private String workflowSessionId_ = "";
    private String continuationToken_ = "";
    private Internal.ProtobufList<Pane$PaneRendering> additionalPanes_ = GeneratedMessageLite.emptyProtobufList();
    private String requestId_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowNextResponse, a> implements MessageLiteOrBuilder {
        public a() {
            super(Workflow$LinkWorkflowNextResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        Workflow$LinkWorkflowNextResponse workflow$LinkWorkflowNextResponse = new Workflow$LinkWorkflowNextResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowNextResponse;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowNextResponse.class, workflow$LinkWorkflowNextResponse);
    }

    private Workflow$LinkWorkflowNextResponse() {
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
    public void clearNextPane() {
        this.nextPane_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
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

    public static Workflow$LinkWorkflowNextResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowNextResponse parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowNextResponse> parser() {
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
                return new Workflow$LinkWorkflowNextResponse();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0003\u001b\u0004Ȉ\u0005Ȉ", new Object[]{"workflowSessionId_", "nextPane_", "additionalPanes_", Pane$PaneRendering.class, "requestId_", "continuationToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowNextResponse> parser = PARSER;
                if (parser == null) {
                    synchronized (Workflow$LinkWorkflowNextResponse.class) {
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

    public String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public ByteString getWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public boolean hasNextPane() {
        return this.nextPane_ != null;
    }

    public static a newBuilder(Workflow$LinkWorkflowNextResponse workflow$LinkWorkflowNextResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowNextResponse);
    }

    public static Workflow$LinkWorkflowNextResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdditionalPanes(int i11, Pane$PaneRendering pane$PaneRendering) {
        pane$PaneRendering.getClass();
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.add(i11, pane$PaneRendering);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}