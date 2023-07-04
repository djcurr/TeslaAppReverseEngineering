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
import com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview;
import com.plaid.internal.hd;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Workflow$LinkWorkflowPreviewResponse extends GeneratedMessageLite<Workflow$LinkWorkflowPreviewResponse, a> implements MessageLiteOrBuilder {
    private static final Workflow$LinkWorkflowPreviewResponse DEFAULT_INSTANCE;
    private static volatile Parser<Workflow$LinkWorkflowPreviewResponse> PARSER = null;
    public static final int RENDERED_PRESETS_FIELD_NUMBER = 1;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    private Internal.ProtobufList<RenderedPreset> renderedPresets_ = GeneratedMessageLite.emptyProtobufList();
    private String requestId_ = "";

    /* loaded from: classes2.dex */
    public static final class RenderedPreset extends GeneratedMessageLite<RenderedPreset, a> implements b {
        private static final RenderedPreset DEFAULT_INSTANCE;
        public static final int PANE_FIELD_NUMBER = 2;
        private static volatile Parser<RenderedPreset> PARSER = null;
        public static final int PRESET_FIELD_NUMBER = 1;
        public static final int RENDERING_OPTIONS_FIELD_NUMBER = 3;
        private Pane$PaneRendering pane_;
        private int preset_;
        private PreviewOuterClass$Preview.RenderingOptions renderingOptions_;

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<RenderedPreset, a> implements b {
            public a() {
                super(RenderedPreset.DEFAULT_INSTANCE);
            }
        }

        static {
            RenderedPreset renderedPreset = new RenderedPreset();
            DEFAULT_INSTANCE = renderedPreset;
            GeneratedMessageLite.registerDefaultInstance(RenderedPreset.class, renderedPreset);
        }

        private RenderedPreset() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPane() {
            this.pane_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPreset() {
            this.preset_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRenderingOptions() {
            this.renderingOptions_ = null;
        }

        public static RenderedPreset getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePane(Pane$PaneRendering pane$PaneRendering) {
            pane$PaneRendering.getClass();
            Pane$PaneRendering pane$PaneRendering2 = this.pane_;
            if (pane$PaneRendering2 != null && pane$PaneRendering2 != Pane$PaneRendering.getDefaultInstance()) {
                this.pane_ = Pane$PaneRendering.newBuilder(this.pane_).mergeFrom((Pane$PaneRendering.a) pane$PaneRendering).buildPartial();
            } else {
                this.pane_ = pane$PaneRendering;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRenderingOptions(PreviewOuterClass$Preview.RenderingOptions renderingOptions) {
            renderingOptions.getClass();
            PreviewOuterClass$Preview.RenderingOptions renderingOptions2 = this.renderingOptions_;
            if (renderingOptions2 != null && renderingOptions2 != PreviewOuterClass$Preview.RenderingOptions.getDefaultInstance()) {
                this.renderingOptions_ = PreviewOuterClass$Preview.RenderingOptions.newBuilder(this.renderingOptions_).mergeFrom((PreviewOuterClass$Preview.RenderingOptions.a) renderingOptions).buildPartial();
            } else {
                this.renderingOptions_ = renderingOptions;
            }
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RenderedPreset parseDelimitedFrom(InputStream inputStream) {
            return (RenderedPreset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RenderedPreset parseFrom(ByteBuffer byteBuffer) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RenderedPreset> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPane(Pane$PaneRendering pane$PaneRendering) {
            pane$PaneRendering.getClass();
            this.pane_ = pane$PaneRendering;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPreset(PreviewOuterClass$Preview.b bVar) {
            this.preset_ = bVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPresetValue(int i11) {
            this.preset_ = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRenderingOptions(PreviewOuterClass$Preview.RenderingOptions renderingOptions) {
            renderingOptions.getClass();
            this.renderingOptions_ = renderingOptions;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (hd.f18720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new RenderedPreset();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"preset_", "pane_", "renderingOptions_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RenderedPreset> parser = PARSER;
                    if (parser == null) {
                        synchronized (RenderedPreset.class) {
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

        public Pane$PaneRendering getPane() {
            Pane$PaneRendering pane$PaneRendering = this.pane_;
            return pane$PaneRendering == null ? Pane$PaneRendering.getDefaultInstance() : pane$PaneRendering;
        }

        public PreviewOuterClass$Preview.b getPreset() {
            PreviewOuterClass$Preview.b forNumber = PreviewOuterClass$Preview.b.forNumber(this.preset_);
            return forNumber == null ? PreviewOuterClass$Preview.b.UNRECOGNIZED : forNumber;
        }

        public int getPresetValue() {
            return this.preset_;
        }

        public PreviewOuterClass$Preview.RenderingOptions getRenderingOptions() {
            PreviewOuterClass$Preview.RenderingOptions renderingOptions = this.renderingOptions_;
            return renderingOptions == null ? PreviewOuterClass$Preview.RenderingOptions.getDefaultInstance() : renderingOptions;
        }

        public boolean hasPane() {
            return this.pane_ != null;
        }

        public boolean hasRenderingOptions() {
            return this.renderingOptions_ != null;
        }

        public static a newBuilder(RenderedPreset renderedPreset) {
            return DEFAULT_INSTANCE.createBuilder(renderedPreset);
        }

        public static RenderedPreset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderedPreset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RenderedPreset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RenderedPreset parseFrom(ByteString byteString) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RenderedPreset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RenderedPreset parseFrom(byte[] bArr) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RenderedPreset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RenderedPreset parseFrom(InputStream inputStream) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RenderedPreset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RenderedPreset parseFrom(CodedInputStream codedInputStream) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RenderedPreset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowPreviewResponse, a> implements MessageLiteOrBuilder {
        public a() {
            super(Workflow$LinkWorkflowPreviewResponse.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes2.dex */
    public interface b extends MessageLiteOrBuilder {
    }

    static {
        Workflow$LinkWorkflowPreviewResponse workflow$LinkWorkflowPreviewResponse = new Workflow$LinkWorkflowPreviewResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowPreviewResponse;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowPreviewResponse.class, workflow$LinkWorkflowPreviewResponse);
    }

    private Workflow$LinkWorkflowPreviewResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRenderedPresets(Iterable<? extends RenderedPreset> iterable) {
        ensureRenderedPresetsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.renderedPresets_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRenderedPresets(RenderedPreset renderedPreset) {
        renderedPreset.getClass();
        ensureRenderedPresetsIsMutable();
        this.renderedPresets_.add(renderedPreset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRenderedPresets() {
        this.renderedPresets_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void ensureRenderedPresetsIsMutable() {
        Internal.ProtobufList<RenderedPreset> protobufList = this.renderedPresets_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.renderedPresets_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Workflow$LinkWorkflowPreviewResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowPreviewResponse parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowPreviewResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRenderedPresets(int i11) {
        ensureRenderedPresetsIsMutable();
        this.renderedPresets_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenderedPresets(int i11, RenderedPreset renderedPreset) {
        renderedPreset.getClass();
        ensureRenderedPresetsIsMutable();
        this.renderedPresets_.set(i11, renderedPreset);
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (hd.f18720a[methodToInvoke.ordinal()]) {
            case 1:
                return new Workflow$LinkWorkflowPreviewResponse();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"renderedPresets_", RenderedPreset.class, "requestId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowPreviewResponse> parser = PARSER;
                if (parser == null) {
                    synchronized (Workflow$LinkWorkflowPreviewResponse.class) {
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

    public RenderedPreset getRenderedPresets(int i11) {
        return this.renderedPresets_.get(i11);
    }

    public int getRenderedPresetsCount() {
        return this.renderedPresets_.size();
    }

    public List<RenderedPreset> getRenderedPresetsList() {
        return this.renderedPresets_;
    }

    public b getRenderedPresetsOrBuilder(int i11) {
        return this.renderedPresets_.get(i11);
    }

    public List<? extends b> getRenderedPresetsOrBuilderList() {
        return this.renderedPresets_;
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public static a newBuilder(Workflow$LinkWorkflowPreviewResponse workflow$LinkWorkflowPreviewResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowPreviewResponse);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRenderedPresets(int i11, RenderedPreset renderedPreset) {
        renderedPreset.getClass();
        ensureRenderedPresetsIsMutable();
        this.renderedPresets_.add(i11, renderedPreset);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}