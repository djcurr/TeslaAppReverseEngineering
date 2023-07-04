package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.d;
import com.plaid.internal.hd;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Workflow$LinkWorkflowNextRequest extends GeneratedMessageLite<Workflow$LinkWorkflowNextRequest, a> implements MessageLiteOrBuilder {
    public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 3;
    private static final Workflow$LinkWorkflowNextRequest DEFAULT_INSTANCE;
    public static final int PANE_OUTPUTS_FIELD_NUMBER = 2;
    private static volatile Parser<Workflow$LinkWorkflowNextRequest> PARSER = null;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private String workflowSessionId_ = "";
    private String continuationToken_ = "";
    private Internal.ProtobufList<Pane$PaneOutput> paneOutputs_ = GeneratedMessageLite.emptyProtobufList();

    static {
        Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest = new Workflow$LinkWorkflowNextRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowNextRequest;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowNextRequest.class, workflow$LinkWorkflowNextRequest);
    }

    private Workflow$LinkWorkflowNextRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaneOutputs(Iterable<? extends Pane$PaneOutput> iterable) {
        ensurePaneOutputsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.paneOutputs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaneOutputs(Pane$PaneOutput pane$PaneOutput) {
        pane$PaneOutput.getClass();
        ensurePaneOutputsIsMutable();
        this.paneOutputs_.add(pane$PaneOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContinuationToken() {
        this.continuationToken_ = getDefaultInstance().getContinuationToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaneOutputs() {
        this.paneOutputs_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    private void ensurePaneOutputsIsMutable() {
        Internal.ProtobufList<Pane$PaneOutput> protobufList = this.paneOutputs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.paneOutputs_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Workflow$LinkWorkflowNextRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowNextRequest parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowNextRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePaneOutputs(int i11) {
        ensurePaneOutputsIsMutable();
        this.paneOutputs_.remove(i11);
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
    public void setPaneOutputs(int i11, Pane$PaneOutput pane$PaneOutput) {
        pane$PaneOutput.getClass();
        ensurePaneOutputsIsMutable();
        this.paneOutputs_.set(i11, pane$PaneOutput);
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
                return new Workflow$LinkWorkflowNextRequest();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new Object[]{"workflowSessionId_", "paneOutputs_", Pane$PaneOutput.class, "continuationToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowNextRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (Workflow$LinkWorkflowNextRequest.class) {
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

    public String getContinuationToken() {
        return this.continuationToken_;
    }

    public ByteString getContinuationTokenBytes() {
        return ByteString.copyFromUtf8(this.continuationToken_);
    }

    public Pane$PaneOutput getPaneOutputs(int i11) {
        return this.paneOutputs_.get(i11);
    }

    public int getPaneOutputsCount() {
        return this.paneOutputs_.size();
    }

    public List<Pane$PaneOutput> getPaneOutputsList() {
        return this.paneOutputs_;
    }

    public d getPaneOutputsOrBuilder(int i11) {
        return this.paneOutputs_.get(i11);
    }

    public List<? extends d> getPaneOutputsOrBuilderList() {
        return this.paneOutputs_;
    }

    public String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public ByteString getWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowNextRequest, a> implements MessageLiteOrBuilder {
        public a() {
            super(Workflow$LinkWorkflowNextRequest.DEFAULT_INSTANCE);
        }

        public a a(String str) {
            copyOnWrite();
            ((Workflow$LinkWorkflowNextRequest) this.instance).setContinuationToken(str);
            return this;
        }

        public a b(String str) {
            copyOnWrite();
            ((Workflow$LinkWorkflowNextRequest) this.instance).setWorkflowSessionId(str);
            return this;
        }

        public a a(Iterable<? extends Pane$PaneOutput> iterable) {
            copyOnWrite();
            ((Workflow$LinkWorkflowNextRequest) this.instance).addAllPaneOutputs(iterable);
            return this;
        }
    }

    public static a newBuilder(Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowNextRequest);
    }

    public static Workflow$LinkWorkflowNextRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaneOutputs(int i11, Pane$PaneOutput pane$PaneOutput) {
        pane$PaneOutput.getClass();
        ensurePaneOutputsIsMutable();
        this.paneOutputs_.add(i11, pane$PaneOutput);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}