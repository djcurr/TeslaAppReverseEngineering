package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.jb;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class SdkIncrementalResult$SDKIncrementalResult extends GeneratedMessageLite<SdkIncrementalResult$SDKIncrementalResult, a> implements com.plaid.internal.core.protos.link.workflow.primitives.a {
    private static final SdkIncrementalResult$SDKIncrementalResult DEFAULT_INSTANCE;
    public static final int ITEM_ADD_RESULT_FIELD_NUMBER = 1;
    private static volatile Parser<SdkIncrementalResult$SDKIncrementalResult> PARSER;
    private int resultCase_ = 0;
    private Object result_;

    /* loaded from: classes2.dex */
    public static final class ItemAddResult extends GeneratedMessageLite<ItemAddResult, a> implements MessageLiteOrBuilder {
        private static final ItemAddResult DEFAULT_INSTANCE;
        public static final int METADATA_FIELD_NUMBER = 2;
        private static volatile Parser<ItemAddResult> PARSER = null;
        public static final int PUBLIC_TOKEN_FIELD_NUMBER = 1;
        private Metadata metadata_;
        private String publicToken_ = "";

        /* loaded from: classes2.dex */
        public static final class Metadata extends GeneratedMessageLite<Metadata, a> implements MessageLiteOrBuilder {
            private static final Metadata DEFAULT_INSTANCE;
            public static final int INSTITUTION_FIELD_NUMBER = 2;
            public static final int LINK_SESSION_ID_FIELD_NUMBER = 1;
            private static volatile Parser<Metadata> PARSER;
            private Institution institution_;
            private String linkSessionId_ = "";

            /* loaded from: classes2.dex */
            public static final class Institution extends GeneratedMessageLite<Institution, a> implements MessageLiteOrBuilder {
                private static final Institution DEFAULT_INSTANCE;
                public static final int INSTITUTION_ID_FIELD_NUMBER = 2;
                public static final int NAME_FIELD_NUMBER = 1;
                private static volatile Parser<Institution> PARSER;
                private String name_ = "";
                private String institutionId_ = "";

                /* loaded from: classes2.dex */
                public static final class a extends GeneratedMessageLite.Builder<Institution, a> implements MessageLiteOrBuilder {
                    public a() {
                        super(Institution.DEFAULT_INSTANCE);
                    }
                }

                static {
                    Institution institution = new Institution();
                    DEFAULT_INSTANCE = institution;
                    GeneratedMessageLite.registerDefaultInstance(Institution.class, institution);
                }

                private Institution() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearInstitutionId() {
                    this.institutionId_ = getDefaultInstance().getInstitutionId();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearName() {
                    this.name_ = getDefaultInstance().getName();
                }

                public static Institution getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static Institution parseDelimitedFrom(InputStream inputStream) {
                    return (Institution) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Institution parseFrom(ByteBuffer byteBuffer) {
                    return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<Institution> parser() {
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

                /* JADX INFO: Access modifiers changed from: private */
                public void setName(String str) {
                    str.getClass();
                    this.name_ = str;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setNameBytes(ByteString byteString) {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.name_ = byteString.toStringUtf8();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    switch (jb.f18898a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Institution();
                        case 2:
                            return new a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "institutionId_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<Institution> parser = PARSER;
                            if (parser == null) {
                                synchronized (Institution.class) {
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

                public String getName() {
                    return this.name_;
                }

                public ByteString getNameBytes() {
                    return ByteString.copyFromUtf8(this.name_);
                }

                public static a newBuilder(Institution institution) {
                    return DEFAULT_INSTANCE.createBuilder(institution);
                }

                public static Institution parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (Institution) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Institution parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                    return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static Institution parseFrom(ByteString byteString) {
                    return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static Institution parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static Institution parseFrom(byte[] bArr) {
                    return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static Institution parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                    return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static Institution parseFrom(InputStream inputStream) {
                    return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Institution parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Institution parseFrom(CodedInputStream codedInputStream) {
                    return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static Institution parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<Metadata, a> implements MessageLiteOrBuilder {
                public a() {
                    super(Metadata.DEFAULT_INSTANCE);
                }
            }

            static {
                Metadata metadata = new Metadata();
                DEFAULT_INSTANCE = metadata;
                GeneratedMessageLite.registerDefaultInstance(Metadata.class, metadata);
            }

            private Metadata() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInstitution() {
                this.institution_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLinkSessionId() {
                this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
            }

            public static Metadata getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeInstitution(Institution institution) {
                institution.getClass();
                Institution institution2 = this.institution_;
                if (institution2 != null && institution2 != Institution.getDefaultInstance()) {
                    this.institution_ = Institution.newBuilder(this.institution_).mergeFrom((Institution.a) institution).buildPartial();
                } else {
                    this.institution_ = institution;
                }
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Metadata parseDelimitedFrom(InputStream inputStream) {
                return (Metadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Metadata parseFrom(ByteBuffer byteBuffer) {
                return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Metadata> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInstitution(Institution institution) {
                institution.getClass();
                this.institution_ = institution;
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
                switch (jb.f18898a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Metadata();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"linkSessionId_", "institution_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Metadata> parser = PARSER;
                        if (parser == null) {
                            synchronized (Metadata.class) {
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

            public Institution getInstitution() {
                Institution institution = this.institution_;
                return institution == null ? Institution.getDefaultInstance() : institution;
            }

            public String getLinkSessionId() {
                return this.linkSessionId_;
            }

            public ByteString getLinkSessionIdBytes() {
                return ByteString.copyFromUtf8(this.linkSessionId_);
            }

            public boolean hasInstitution() {
                return this.institution_ != null;
            }

            public static a newBuilder(Metadata metadata) {
                return DEFAULT_INSTANCE.createBuilder(metadata);
            }

            public static Metadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Metadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Metadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Metadata parseFrom(ByteString byteString) {
                return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Metadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Metadata parseFrom(byte[] bArr) {
                return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Metadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Metadata parseFrom(InputStream inputStream) {
                return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Metadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Metadata parseFrom(CodedInputStream codedInputStream) {
                return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Metadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ItemAddResult, a> implements MessageLiteOrBuilder {
            public a() {
                super(ItemAddResult.DEFAULT_INSTANCE);
            }
        }

        static {
            ItemAddResult itemAddResult = new ItemAddResult();
            DEFAULT_INSTANCE = itemAddResult;
            GeneratedMessageLite.registerDefaultInstance(ItemAddResult.class, itemAddResult);
        }

        private ItemAddResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetadata() {
            this.metadata_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPublicToken() {
            this.publicToken_ = getDefaultInstance().getPublicToken();
        }

        public static ItemAddResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMetadata(Metadata metadata) {
            metadata.getClass();
            Metadata metadata2 = this.metadata_;
            if (metadata2 != null && metadata2 != Metadata.getDefaultInstance()) {
                this.metadata_ = Metadata.newBuilder(this.metadata_).mergeFrom((Metadata.a) metadata).buildPartial();
            } else {
                this.metadata_ = metadata;
            }
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ItemAddResult parseDelimitedFrom(InputStream inputStream) {
            return (ItemAddResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ItemAddResult parseFrom(ByteBuffer byteBuffer) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ItemAddResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetadata(Metadata metadata) {
            metadata.getClass();
            this.metadata_ = metadata;
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (jb.f18898a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ItemAddResult();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"publicToken_", "metadata_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ItemAddResult> parser = PARSER;
                    if (parser == null) {
                        synchronized (ItemAddResult.class) {
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

        public Metadata getMetadata() {
            Metadata metadata = this.metadata_;
            return metadata == null ? Metadata.getDefaultInstance() : metadata;
        }

        public String getPublicToken() {
            return this.publicToken_;
        }

        public ByteString getPublicTokenBytes() {
            return ByteString.copyFromUtf8(this.publicToken_);
        }

        public boolean hasMetadata() {
            return this.metadata_ != null;
        }

        public static a newBuilder(ItemAddResult itemAddResult) {
            return DEFAULT_INSTANCE.createBuilder(itemAddResult);
        }

        public static ItemAddResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemAddResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ItemAddResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ItemAddResult parseFrom(ByteString byteString) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ItemAddResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ItemAddResult parseFrom(byte[] bArr) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ItemAddResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ItemAddResult parseFrom(InputStream inputStream) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ItemAddResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ItemAddResult parseFrom(CodedInputStream codedInputStream) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ItemAddResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<SdkIncrementalResult$SDKIncrementalResult, a> implements com.plaid.internal.core.protos.link.workflow.primitives.a {
        public a() {
            super(SdkIncrementalResult$SDKIncrementalResult.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        ITEM_ADD_RESULT(1),
        RESULT_NOT_SET(0);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f18417a;

        b(int i11) {
            this.f18417a = i11;
        }

        public static b forNumber(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    return null;
                }
                return ITEM_ADD_RESULT;
            }
            return RESULT_NOT_SET;
        }

        public int getNumber() {
            return this.f18417a;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        SdkIncrementalResult$SDKIncrementalResult sdkIncrementalResult$SDKIncrementalResult = new SdkIncrementalResult$SDKIncrementalResult();
        DEFAULT_INSTANCE = sdkIncrementalResult$SDKIncrementalResult;
        GeneratedMessageLite.registerDefaultInstance(SdkIncrementalResult$SDKIncrementalResult.class, sdkIncrementalResult$SDKIncrementalResult);
    }

    private SdkIncrementalResult$SDKIncrementalResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemAddResult() {
        if (this.resultCase_ == 1) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    public static SdkIncrementalResult$SDKIncrementalResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeItemAddResult(ItemAddResult itemAddResult) {
        itemAddResult.getClass();
        if (this.resultCase_ == 1 && this.result_ != ItemAddResult.getDefaultInstance()) {
            this.result_ = ItemAddResult.newBuilder((ItemAddResult) this.result_).mergeFrom((ItemAddResult.a) itemAddResult).buildPartial();
        } else {
            this.result_ = itemAddResult;
        }
        this.resultCase_ = 1;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseDelimitedFrom(InputStream inputStream) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(ByteBuffer byteBuffer) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SdkIncrementalResult$SDKIncrementalResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemAddResult(ItemAddResult itemAddResult) {
        itemAddResult.getClass();
        this.result_ = itemAddResult;
        this.resultCase_ = 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (jb.f18898a[methodToInvoke.ordinal()]) {
            case 1:
                return new SdkIncrementalResult$SDKIncrementalResult();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"result_", "resultCase_", ItemAddResult.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SdkIncrementalResult$SDKIncrementalResult> parser = PARSER;
                if (parser == null) {
                    synchronized (SdkIncrementalResult$SDKIncrementalResult.class) {
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

    public ItemAddResult getItemAddResult() {
        if (this.resultCase_ == 1) {
            return (ItemAddResult) this.result_;
        }
        return ItemAddResult.getDefaultInstance();
    }

    public b getResultCase() {
        return b.forNumber(this.resultCase_);
    }

    public boolean hasItemAddResult() {
        return this.resultCase_ == 1;
    }

    public static a newBuilder(SdkIncrementalResult$SDKIncrementalResult sdkIncrementalResult$SDKIncrementalResult) {
        return DEFAULT_INSTANCE.createBuilder(sdkIncrementalResult$SDKIncrementalResult);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(ByteString byteString) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(byte[] bArr) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(InputStream inputStream) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(CodedInputStream codedInputStream) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}