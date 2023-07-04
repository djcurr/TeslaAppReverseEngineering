package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.plaid.internal.c1;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Common$RenderedAsset extends GeneratedMessageLite<Common$RenderedAsset, a> implements MessageLiteOrBuilder {
    public static final int ASSET_FIELD_NUMBER = 8;
    public static final int BYTES_FIELD_NUMBER = 6;
    private static final Common$RenderedAsset DEFAULT_INSTANCE;
    public static final int DIMENSIONS_FIELD_NUMBER = 3;
    public static final int EXPIRY_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_TEMPLATE_FIELD_NUMBER = 4;
    private static volatile Parser<Common$RenderedAsset> PARSER = null;
    public static final int URL_FIELD_NUMBER = 5;
    private Object content_;
    private Dimensions dimensions_;
    private Timestamp expiry_;
    private boolean isTemplate_;
    private int contentCase_ = 0;
    private String id_ = "";

    /* loaded from: classes2.dex */
    public static final class Dimensions extends GeneratedMessageLite<Dimensions, a> implements MessageLiteOrBuilder {
        private static final Dimensions DEFAULT_INSTANCE;
        public static final int HEIGHT_FIELD_NUMBER = 2;
        private static volatile Parser<Dimensions> PARSER = null;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private int height_;
        private int width_;

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<Dimensions, a> implements MessageLiteOrBuilder {
            public a() {
                super(Dimensions.DEFAULT_INSTANCE);
            }
        }

        static {
            Dimensions dimensions = new Dimensions();
            DEFAULT_INSTANCE = dimensions;
            GeneratedMessageLite.registerDefaultInstance(Dimensions.class, dimensions);
        }

        private Dimensions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeight() {
            this.height_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidth() {
            this.width_ = 0;
        }

        public static Dimensions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Dimensions parseDelimitedFrom(InputStream inputStream) {
            return (Dimensions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Dimensions parseFrom(ByteBuffer byteBuffer) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Dimensions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(int i11) {
            this.height_ = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(int i11) {
            this.width_ = i11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (c1.f18233a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Dimensions();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"width_", "height_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Dimensions> parser = PARSER;
                    if (parser == null) {
                        synchronized (Dimensions.class) {
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

        public int getHeight() {
            return this.height_;
        }

        public int getWidth() {
            return this.width_;
        }

        public static a newBuilder(Dimensions dimensions) {
            return DEFAULT_INSTANCE.createBuilder(dimensions);
        }

        public static Dimensions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Dimensions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Dimensions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Dimensions parseFrom(ByteString byteString) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Dimensions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Dimensions parseFrom(byte[] bArr) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Dimensions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Dimensions parseFrom(InputStream inputStream) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Dimensions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Dimensions parseFrom(CodedInputStream codedInputStream) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Dimensions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$RenderedAsset, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$RenderedAsset.DEFAULT_INSTANCE);
        }

        public a a(com.plaid.internal.d dVar) {
            copyOnWrite();
            ((Common$RenderedAsset) this.instance).setAsset(dVar);
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        URL(5),
        BYTES(6),
        ASSET(8),
        CONTENT_NOT_SET(0);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f18355a;

        b(int i11) {
            this.f18355a = i11;
        }

        public static b forNumber(int i11) {
            if (i11 != 0) {
                if (i11 != 8) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            return null;
                        }
                        return BYTES;
                    }
                    return URL;
                }
                return ASSET;
            }
            return CONTENT_NOT_SET;
        }

        public int getNumber() {
            return this.f18355a;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        Common$RenderedAsset common$RenderedAsset = new Common$RenderedAsset();
        DEFAULT_INSTANCE = common$RenderedAsset;
        GeneratedMessageLite.registerDefaultInstance(Common$RenderedAsset.class, common$RenderedAsset);
    }

    private Common$RenderedAsset() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAsset() {
        if (this.contentCase_ == 8) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBytes() {
        if (this.contentCase_ == 6) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.contentCase_ = 0;
        this.content_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDimensions() {
        this.dimensions_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpiry() {
        this.expiry_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsTemplate() {
        this.isTemplate_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        if (this.contentCase_ == 5) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    public static Common$RenderedAsset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDimensions(Dimensions dimensions) {
        dimensions.getClass();
        Dimensions dimensions2 = this.dimensions_;
        if (dimensions2 != null && dimensions2 != Dimensions.getDefaultInstance()) {
            this.dimensions_ = Dimensions.newBuilder(this.dimensions_).mergeFrom((Dimensions.a) dimensions).buildPartial();
        } else {
            this.dimensions_ = dimensions;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeExpiry(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.expiry_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            this.expiry_ = (Timestamp) ((Timestamp.Builder) Timestamp.newBuilder(this.expiry_).mergeFrom((GeneratedMessageLite) timestamp)).buildPartial();
        } else {
            this.expiry_ = timestamp;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$RenderedAsset parseDelimitedFrom(InputStream inputStream) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$RenderedAsset parseFrom(ByteBuffer byteBuffer) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$RenderedAsset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAsset(com.plaid.internal.d dVar) {
        this.content_ = Integer.valueOf(dVar.getNumber());
        this.contentCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssetValue(int i11) {
        this.contentCase_ = 8;
        this.content_ = Integer.valueOf(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBytes(ByteString byteString) {
        byteString.getClass();
        this.contentCase_ = 6;
        this.content_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDimensions(Dimensions dimensions) {
        dimensions.getClass();
        this.dimensions_ = dimensions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpiry(Timestamp timestamp) {
        timestamp.getClass();
        this.expiry_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsTemplate(boolean z11) {
        this.isTemplate_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.contentCase_ = 5;
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.toStringUtf8();
        this.contentCase_ = 5;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$RenderedAsset();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t\u0004\u0007\u0005Ȼ\u0000\u0006=\u0000\b?\u0000", new Object[]{"content_", "contentCase_", "id_", "expiry_", "dimensions_", "isTemplate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$RenderedAsset> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$RenderedAsset.class) {
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

    public com.plaid.internal.d getAsset() {
        if (this.contentCase_ == 8) {
            com.plaid.internal.d forNumber = com.plaid.internal.d.forNumber(((Integer) this.content_).intValue());
            return forNumber == null ? com.plaid.internal.d.UNRECOGNIZED : forNumber;
        }
        return com.plaid.internal.d.SDK_ASSET_UNKNOWN;
    }

    public int getAssetValue() {
        if (this.contentCase_ == 8) {
            return ((Integer) this.content_).intValue();
        }
        return 0;
    }

    public ByteString getBytes() {
        if (this.contentCase_ == 6) {
            return (ByteString) this.content_;
        }
        return ByteString.EMPTY;
    }

    public b getContentCase() {
        return b.forNumber(this.contentCase_);
    }

    public Dimensions getDimensions() {
        Dimensions dimensions = this.dimensions_;
        return dimensions == null ? Dimensions.getDefaultInstance() : dimensions;
    }

    public Timestamp getExpiry() {
        Timestamp timestamp = this.expiry_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public boolean getIsTemplate() {
        return this.isTemplate_;
    }

    public String getUrl() {
        return this.contentCase_ == 5 ? (String) this.content_ : "";
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.contentCase_ == 5 ? (String) this.content_ : "");
    }

    public boolean hasAsset() {
        return this.contentCase_ == 8;
    }

    public boolean hasBytes() {
        return this.contentCase_ == 6;
    }

    public boolean hasDimensions() {
        return this.dimensions_ != null;
    }

    public boolean hasExpiry() {
        return this.expiry_ != null;
    }

    public boolean hasUrl() {
        return this.contentCase_ == 5;
    }

    public static a newBuilder(Common$RenderedAsset common$RenderedAsset) {
        return DEFAULT_INSTANCE.createBuilder(common$RenderedAsset);
    }

    public static Common$RenderedAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$RenderedAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$RenderedAsset parseFrom(ByteString byteString) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$RenderedAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$RenderedAsset parseFrom(byte[] bArr) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$RenderedAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$RenderedAsset parseFrom(InputStream inputStream) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$RenderedAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$RenderedAsset parseFrom(CodedInputStream codedInputStream) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$RenderedAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}