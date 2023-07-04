package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview;
import com.plaid.internal.xa;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class PreviewOuterClass$PreviewWrapper extends GeneratedMessageLite<PreviewOuterClass$PreviewWrapper, a> implements MessageLiteOrBuilder {
    private static final PreviewOuterClass$PreviewWrapper DEFAULT_INSTANCE;
    private static volatile Parser<PreviewOuterClass$PreviewWrapper> PARSER = null;
    public static final int PREVIEW_FIELD_NUMBER = 1;
    public static final int PREVIEW_RENDERING_OPTIONS_FIELD_NUMBER = 2;
    private PreviewOuterClass$Preview.RenderingOptions previewRenderingOptions_;
    private PreviewOuterClass$Preview preview_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<PreviewOuterClass$PreviewWrapper, a> implements MessageLiteOrBuilder {
        public a() {
            super(PreviewOuterClass$PreviewWrapper.DEFAULT_INSTANCE);
        }
    }

    static {
        PreviewOuterClass$PreviewWrapper previewOuterClass$PreviewWrapper = new PreviewOuterClass$PreviewWrapper();
        DEFAULT_INSTANCE = previewOuterClass$PreviewWrapper;
        GeneratedMessageLite.registerDefaultInstance(PreviewOuterClass$PreviewWrapper.class, previewOuterClass$PreviewWrapper);
    }

    private PreviewOuterClass$PreviewWrapper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreview() {
        this.preview_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewRenderingOptions() {
        this.previewRenderingOptions_ = null;
    }

    public static PreviewOuterClass$PreviewWrapper getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePreview(PreviewOuterClass$Preview previewOuterClass$Preview) {
        previewOuterClass$Preview.getClass();
        PreviewOuterClass$Preview previewOuterClass$Preview2 = this.preview_;
        if (previewOuterClass$Preview2 != null && previewOuterClass$Preview2 != PreviewOuterClass$Preview.getDefaultInstance()) {
            this.preview_ = PreviewOuterClass$Preview.newBuilder(this.preview_).mergeFrom((PreviewOuterClass$Preview.a) previewOuterClass$Preview).buildPartial();
        } else {
            this.preview_ = previewOuterClass$Preview;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePreviewRenderingOptions(PreviewOuterClass$Preview.RenderingOptions renderingOptions) {
        renderingOptions.getClass();
        PreviewOuterClass$Preview.RenderingOptions renderingOptions2 = this.previewRenderingOptions_;
        if (renderingOptions2 != null && renderingOptions2 != PreviewOuterClass$Preview.RenderingOptions.getDefaultInstance()) {
            this.previewRenderingOptions_ = PreviewOuterClass$Preview.RenderingOptions.newBuilder(this.previewRenderingOptions_).mergeFrom((PreviewOuterClass$Preview.RenderingOptions.a) renderingOptions).buildPartial();
        } else {
            this.previewRenderingOptions_ = renderingOptions;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PreviewOuterClass$PreviewWrapper parseDelimitedFrom(InputStream inputStream) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(ByteBuffer byteBuffer) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PreviewOuterClass$PreviewWrapper> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreview(PreviewOuterClass$Preview previewOuterClass$Preview) {
        previewOuterClass$Preview.getClass();
        this.preview_ = previewOuterClass$Preview;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewRenderingOptions(PreviewOuterClass$Preview.RenderingOptions renderingOptions) {
        renderingOptions.getClass();
        this.previewRenderingOptions_ = renderingOptions;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (xa.f19836a[methodToInvoke.ordinal()]) {
            case 1:
                return new PreviewOuterClass$PreviewWrapper();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"preview_", "previewRenderingOptions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PreviewOuterClass$PreviewWrapper> parser = PARSER;
                if (parser == null) {
                    synchronized (PreviewOuterClass$PreviewWrapper.class) {
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

    public PreviewOuterClass$Preview getPreview() {
        PreviewOuterClass$Preview previewOuterClass$Preview = this.preview_;
        return previewOuterClass$Preview == null ? PreviewOuterClass$Preview.getDefaultInstance() : previewOuterClass$Preview;
    }

    public PreviewOuterClass$Preview.RenderingOptions getPreviewRenderingOptions() {
        PreviewOuterClass$Preview.RenderingOptions renderingOptions = this.previewRenderingOptions_;
        return renderingOptions == null ? PreviewOuterClass$Preview.RenderingOptions.getDefaultInstance() : renderingOptions;
    }

    public boolean hasPreview() {
        return this.preview_ != null;
    }

    public boolean hasPreviewRenderingOptions() {
        return this.previewRenderingOptions_ != null;
    }

    public static a newBuilder(PreviewOuterClass$PreviewWrapper previewOuterClass$PreviewWrapper) {
        return DEFAULT_INSTANCE.createBuilder(previewOuterClass$PreviewWrapper);
    }

    public static PreviewOuterClass$PreviewWrapper parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(ByteString byteString) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(byte[] bArr) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(InputStream inputStream) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(CodedInputStream codedInputStream) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}