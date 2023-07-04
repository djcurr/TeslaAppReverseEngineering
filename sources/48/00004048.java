package com.plaid.internal.core.protos.analyticalcore;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Analytical$Meta extends GeneratedMessageLite<Analytical$Meta, a> implements MessageLiteOrBuilder {
    public static final int AWS_INSTANCE_ID_FIELD_NUMBER = 6;
    public static final int AWS_LOCAL_HOSTNAME_FIELD_NUMBER = 7;
    public static final int BUILD_TAG_FIELD_NUMBER = 5;
    private static final Analytical$Meta DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGE_NAME_FIELD_NUMBER = 8;
    public static final int K8S_METADATA_POD_NAME_FIELD_NUMBER = 9;
    private static volatile Parser<Analytical$Meta> PARSER = null;
    public static final int PUBLISHED_AT_FIELD_NUMBER = 3;
    public static final int SOURCE_SERVICE_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private Timestamp publishedAt_;
    private long timestamp_;
    private String id_ = "";
    private String sourceService_ = "";
    private String buildTag_ = "";
    private String awsInstanceId_ = "";
    private String awsLocalHostname_ = "";
    private String imageName_ = "";
    private String k8SMetadataPodName_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Analytical$Meta, a> implements MessageLiteOrBuilder {
        public a() {
            super(Analytical$Meta.DEFAULT_INSTANCE);
        }
    }

    static {
        Analytical$Meta analytical$Meta = new Analytical$Meta();
        DEFAULT_INSTANCE = analytical$Meta;
        GeneratedMessageLite.registerDefaultInstance(Analytical$Meta.class, analytical$Meta);
    }

    private Analytical$Meta() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAwsInstanceId() {
        this.awsInstanceId_ = getDefaultInstance().getAwsInstanceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAwsLocalHostname() {
        this.awsLocalHostname_ = getDefaultInstance().getAwsLocalHostname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildTag() {
        this.buildTag_ = getDefaultInstance().getBuildTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageName() {
        this.imageName_ = getDefaultInstance().getImageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearK8SMetadataPodName() {
        this.k8SMetadataPodName_ = getDefaultInstance().getK8SMetadataPodName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublishedAt() {
        this.publishedAt_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceService() {
        this.sourceService_ = getDefaultInstance().getSourceService();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0L;
    }

    public static Analytical$Meta getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergePublishedAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.publishedAt_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            this.publishedAt_ = (Timestamp) ((Timestamp.Builder) Timestamp.newBuilder(this.publishedAt_).mergeFrom((GeneratedMessageLite) timestamp)).buildPartial();
        } else {
            this.publishedAt_ = timestamp;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Analytical$Meta parseDelimitedFrom(InputStream inputStream) {
        return (Analytical$Meta) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$Meta parseFrom(ByteBuffer byteBuffer) {
        return (Analytical$Meta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Analytical$Meta> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAwsInstanceId(String str) {
        str.getClass();
        this.awsInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAwsInstanceIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.awsInstanceId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAwsLocalHostname(String str) {
        str.getClass();
        this.awsLocalHostname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAwsLocalHostnameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.awsLocalHostname_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildTag(String str) {
        str.getClass();
        this.buildTag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildTagBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.buildTag_ = byteString.toStringUtf8();
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
    public void setImageName(String str) {
        str.getClass();
        this.imageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.imageName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setK8SMetadataPodName(String str) {
        str.getClass();
        this.k8SMetadataPodName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setK8SMetadataPodNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.k8SMetadataPodName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublishedAt(Timestamp timestamp) {
        timestamp.getClass();
        this.publishedAt_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceService(String str) {
        str.getClass();
        this.sourceService_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceServiceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sourceService_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j11) {
        this.timestamp_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.plaid.internal.a.f18151a[methodToInvoke.ordinal()]) {
            case 1:
                return new Analytical$Meta();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\t\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ", new Object[]{"id_", "timestamp_", "publishedAt_", "sourceService_", "buildTag_", "awsInstanceId_", "awsLocalHostname_", "imageName_", "k8SMetadataPodName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Analytical$Meta> parser = PARSER;
                if (parser == null) {
                    synchronized (Analytical$Meta.class) {
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

    public String getAwsInstanceId() {
        return this.awsInstanceId_;
    }

    public ByteString getAwsInstanceIdBytes() {
        return ByteString.copyFromUtf8(this.awsInstanceId_);
    }

    public String getAwsLocalHostname() {
        return this.awsLocalHostname_;
    }

    public ByteString getAwsLocalHostnameBytes() {
        return ByteString.copyFromUtf8(this.awsLocalHostname_);
    }

    public String getBuildTag() {
        return this.buildTag_;
    }

    public ByteString getBuildTagBytes() {
        return ByteString.copyFromUtf8(this.buildTag_);
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public String getImageName() {
        return this.imageName_;
    }

    public ByteString getImageNameBytes() {
        return ByteString.copyFromUtf8(this.imageName_);
    }

    public String getK8SMetadataPodName() {
        return this.k8SMetadataPodName_;
    }

    public ByteString getK8SMetadataPodNameBytes() {
        return ByteString.copyFromUtf8(this.k8SMetadataPodName_);
    }

    public Timestamp getPublishedAt() {
        Timestamp timestamp = this.publishedAt_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getSourceService() {
        return this.sourceService_;
    }

    public ByteString getSourceServiceBytes() {
        return ByteString.copyFromUtf8(this.sourceService_);
    }

    public long getTimestamp() {
        return this.timestamp_;
    }

    public boolean hasPublishedAt() {
        return this.publishedAt_ != null;
    }

    public static a newBuilder(Analytical$Meta analytical$Meta) {
        return DEFAULT_INSTANCE.createBuilder(analytical$Meta);
    }

    public static Analytical$Meta parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$Meta) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$Meta parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$Meta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Analytical$Meta parseFrom(ByteString byteString) {
        return (Analytical$Meta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Analytical$Meta parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$Meta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Analytical$Meta parseFrom(byte[] bArr) {
        return (Analytical$Meta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Analytical$Meta parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$Meta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Analytical$Meta parseFrom(InputStream inputStream) {
        return (Analytical$Meta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$Meta parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$Meta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$Meta parseFrom(CodedInputStream codedInputStream) {
        return (Analytical$Meta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Analytical$Meta parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$Meta) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}