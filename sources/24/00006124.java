package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.tesla.proto.common.v1.UUIDv4;
import com.tesla.proto.common.v1.UUIDv4OrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class GetLiveStatusRequest extends GeneratedMessageV3 implements GetLiveStatusRequestOrBuilder {
    public static final int ASSET_SITE_ID_FIELD_NUMBER = 3;
    private static final GetLiveStatusRequest DEFAULT_INSTANCE = new GetLiveStatusRequest();
    private static final Parser<GetLiveStatusRequest> PARSER = new AbstractParser<GetLiveStatusRequest>() { // from class: com.tesla.proto.energy.powergate.v1.GetLiveStatusRequest.1
        @Override // com.google.protobuf.Parser
        public GetLiveStatusRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return new GetLiveStatusRequest(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private UUIDv4 assetSiteId_;
    private byte memoizedIsInitialized;
    private UUIDv4 requestId_;

    private GetLiveStatusRequest(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static GetLiveStatusRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Powerstream.internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusRequest_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static GetLiveStatusRequest parseDelimitedFrom(InputStream inputStream) {
        return (GetLiveStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static GetLiveStatusRequest parseFrom(ByteBuffer byteBuffer) {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<GetLiveStatusRequest> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetLiveStatusRequest)) {
            return super.equals(obj);
        }
        GetLiveStatusRequest getLiveStatusRequest = (GetLiveStatusRequest) obj;
        if (hasRequestId() != getLiveStatusRequest.hasRequestId()) {
            return false;
        }
        if ((!hasRequestId() || getRequestId().equals(getLiveStatusRequest.getRequestId())) && hasAssetSiteId() == getLiveStatusRequest.hasAssetSiteId()) {
            return (!hasAssetSiteId() || getAssetSiteId().equals(getLiveStatusRequest.getAssetSiteId())) && this.unknownFields.equals(getLiveStatusRequest.unknownFields);
        }
        return false;
    }

    @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusRequestOrBuilder
    public UUIDv4 getAssetSiteId() {
        UUIDv4 uUIDv4 = this.assetSiteId_;
        return uUIDv4 == null ? UUIDv4.getDefaultInstance() : uUIDv4;
    }

    @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusRequestOrBuilder
    public UUIDv4OrBuilder getAssetSiteIdOrBuilder() {
        return getAssetSiteId();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<GetLiveStatusRequest> getParserForType() {
        return PARSER;
    }

    @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusRequestOrBuilder
    public UUIDv4 getRequestId() {
        UUIDv4 uUIDv4 = this.requestId_;
        return uUIDv4 == null ? UUIDv4.getDefaultInstance() : uUIDv4;
    }

    @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusRequestOrBuilder
    public UUIDv4OrBuilder getRequestIdOrBuilder() {
        return getRequestId();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int computeMessageSize = this.requestId_ != null ? 0 + CodedOutputStream.computeMessageSize(1, getRequestId()) : 0;
        if (this.assetSiteId_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(3, getAssetSiteId());
        }
        int serializedSize = computeMessageSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusRequestOrBuilder
    public boolean hasAssetSiteId() {
        return this.assetSiteId_ != null;
    }

    @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusRequestOrBuilder
    public boolean hasRequestId() {
        return this.requestId_ != null;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasRequestId()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getRequestId().hashCode();
        }
        if (hasAssetSiteId()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getAssetSiteId().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Powerstream.internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLiveStatusRequest.class, Builder.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b11 = this.memoizedIsInitialized;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new GetLiveStatusRequest();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.requestId_ != null) {
            codedOutputStream.writeMessage(1, getRequestId());
        }
        if (this.assetSiteId_ != null) {
            codedOutputStream.writeMessage(3, getAssetSiteId());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetLiveStatusRequestOrBuilder {
        private SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> assetSiteIdBuilder_;
        private UUIDv4 assetSiteId_;
        private SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> requestIdBuilder_;
        private UUIDv4 requestId_;

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> getAssetSiteIdFieldBuilder() {
            if (this.assetSiteIdBuilder_ == null) {
                this.assetSiteIdBuilder_ = new SingleFieldBuilderV3<>(getAssetSiteId(), getParentForChildren(), isClean());
                this.assetSiteId_ = null;
            }
            return this.assetSiteIdBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Powerstream.internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusRequest_descriptor;
        }

        private SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> getRequestIdFieldBuilder() {
            if (this.requestIdBuilder_ == null) {
                this.requestIdBuilder_ = new SingleFieldBuilderV3<>(getRequestId(), getParentForChildren(), isClean());
                this.requestId_ = null;
            }
            return this.requestIdBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clearAssetSiteId() {
            if (this.assetSiteIdBuilder_ == null) {
                this.assetSiteId_ = null;
                onChanged();
            } else {
                this.assetSiteId_ = null;
                this.assetSiteIdBuilder_ = null;
            }
            return this;
        }

        public Builder clearRequestId() {
            if (this.requestIdBuilder_ == null) {
                this.requestId_ = null;
                onChanged();
            } else {
                this.requestId_ = null;
                this.requestIdBuilder_ = null;
            }
            return this;
        }

        @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusRequestOrBuilder
        public UUIDv4 getAssetSiteId() {
            SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> singleFieldBuilderV3 = this.assetSiteIdBuilder_;
            if (singleFieldBuilderV3 == null) {
                UUIDv4 uUIDv4 = this.assetSiteId_;
                return uUIDv4 == null ? UUIDv4.getDefaultInstance() : uUIDv4;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public UUIDv4.Builder getAssetSiteIdBuilder() {
            onChanged();
            return getAssetSiteIdFieldBuilder().getBuilder();
        }

        @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusRequestOrBuilder
        public UUIDv4OrBuilder getAssetSiteIdOrBuilder() {
            SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> singleFieldBuilderV3 = this.assetSiteIdBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            UUIDv4 uUIDv4 = this.assetSiteId_;
            return uUIDv4 == null ? UUIDv4.getDefaultInstance() : uUIDv4;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Powerstream.internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusRequest_descriptor;
        }

        @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusRequestOrBuilder
        public UUIDv4 getRequestId() {
            SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> singleFieldBuilderV3 = this.requestIdBuilder_;
            if (singleFieldBuilderV3 == null) {
                UUIDv4 uUIDv4 = this.requestId_;
                return uUIDv4 == null ? UUIDv4.getDefaultInstance() : uUIDv4;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public UUIDv4.Builder getRequestIdBuilder() {
            onChanged();
            return getRequestIdFieldBuilder().getBuilder();
        }

        @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusRequestOrBuilder
        public UUIDv4OrBuilder getRequestIdOrBuilder() {
            SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> singleFieldBuilderV3 = this.requestIdBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            UUIDv4 uUIDv4 = this.requestId_;
            return uUIDv4 == null ? UUIDv4.getDefaultInstance() : uUIDv4;
        }

        @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusRequestOrBuilder
        public boolean hasAssetSiteId() {
            return (this.assetSiteIdBuilder_ == null && this.assetSiteId_ == null) ? false : true;
        }

        @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusRequestOrBuilder
        public boolean hasRequestId() {
            return (this.requestIdBuilder_ == null && this.requestId_ == null) ? false : true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Powerstream.internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLiveStatusRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAssetSiteId(UUIDv4 uUIDv4) {
            SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> singleFieldBuilderV3 = this.assetSiteIdBuilder_;
            if (singleFieldBuilderV3 == null) {
                UUIDv4 uUIDv42 = this.assetSiteId_;
                if (uUIDv42 != null) {
                    this.assetSiteId_ = UUIDv4.newBuilder(uUIDv42).mergeFrom(uUIDv4).buildPartial();
                } else {
                    this.assetSiteId_ = uUIDv4;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(uUIDv4);
            }
            return this;
        }

        public Builder mergeRequestId(UUIDv4 uUIDv4) {
            SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> singleFieldBuilderV3 = this.requestIdBuilder_;
            if (singleFieldBuilderV3 == null) {
                UUIDv4 uUIDv42 = this.requestId_;
                if (uUIDv42 != null) {
                    this.requestId_ = UUIDv4.newBuilder(uUIDv42).mergeFrom(uUIDv4).buildPartial();
                } else {
                    this.requestId_ = uUIDv4;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(uUIDv4);
            }
            return this;
        }

        public Builder setAssetSiteId(UUIDv4 uUIDv4) {
            SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> singleFieldBuilderV3 = this.assetSiteIdBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(uUIDv4);
                this.assetSiteId_ = uUIDv4;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(uUIDv4);
            }
            return this;
        }

        public Builder setRequestId(UUIDv4 uUIDv4) {
            SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> singleFieldBuilderV3 = this.requestIdBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(uUIDv4);
                this.requestId_ = uUIDv4;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(uUIDv4);
            }
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GetLiveStatusRequest build() {
            GetLiveStatusRequest buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GetLiveStatusRequest buildPartial() {
            GetLiveStatusRequest getLiveStatusRequest = new GetLiveStatusRequest(this);
            SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> singleFieldBuilderV3 = this.requestIdBuilder_;
            if (singleFieldBuilderV3 == null) {
                getLiveStatusRequest.requestId_ = this.requestId_;
            } else {
                getLiveStatusRequest.requestId_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> singleFieldBuilderV32 = this.assetSiteIdBuilder_;
            if (singleFieldBuilderV32 == null) {
                getLiveStatusRequest.assetSiteId_ = this.assetSiteId_;
            } else {
                getLiveStatusRequest.assetSiteId_ = singleFieldBuilderV32.build();
            }
            onBuilt();
            return getLiveStatusRequest;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetLiveStatusRequest getDefaultInstanceForType() {
            return GetLiveStatusRequest.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i11, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i11, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            if (this.requestIdBuilder_ == null) {
                this.requestId_ = null;
            } else {
                this.requestId_ = null;
                this.requestIdBuilder_ = null;
            }
            if (this.assetSiteIdBuilder_ == null) {
                this.assetSiteId_ = null;
            } else {
                this.assetSiteId_ = null;
                this.assetSiteIdBuilder_ = null;
            }
            return this;
        }

        public Builder setAssetSiteId(UUIDv4.Builder builder) {
            SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> singleFieldBuilderV3 = this.assetSiteIdBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.assetSiteId_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder setRequestId(UUIDv4.Builder builder) {
            SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> singleFieldBuilderV3 = this.requestIdBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.requestId_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public Builder mo112clone() {
            return (Builder) super.mo112clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof GetLiveStatusRequest) {
                return mergeFrom((GetLiveStatusRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(GetLiveStatusRequest getLiveStatusRequest) {
            if (getLiveStatusRequest == GetLiveStatusRequest.getDefaultInstance()) {
                return this;
            }
            if (getLiveStatusRequest.hasRequestId()) {
                mergeRequestId(getLiveStatusRequest.getRequestId());
            }
            if (getLiveStatusRequest.hasAssetSiteId()) {
                mergeAssetSiteId(getLiveStatusRequest.getAssetSiteId());
            }
            mergeUnknownFields(((GeneratedMessageV3) getLiveStatusRequest).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.tesla.proto.energy.powergate.v1.GetLiveStatusRequest.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.tesla.proto.energy.powergate.v1.GetLiveStatusRequest.c()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                com.tesla.proto.energy.powergate.v1.GetLiveStatusRequest r3 = (com.tesla.proto.energy.powergate.v1.GetLiveStatusRequest) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.mergeFrom(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                com.tesla.proto.energy.powergate.v1.GetLiveStatusRequest r4 = (com.tesla.proto.energy.powergate.v1.GetLiveStatusRequest) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.mergeFrom(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tesla.proto.energy.powergate.v1.GetLiveStatusRequest.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.tesla.proto.energy.powergate.v1.GetLiveStatusRequest$Builder");
        }
    }

    public static Builder newBuilder(GetLiveStatusRequest getLiveStatusRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(getLiveStatusRequest);
    }

    public static GetLiveStatusRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private GetLiveStatusRequest() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static GetLiveStatusRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (GetLiveStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetLiveStatusRequest parseFrom(ByteString byteString) {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public GetLiveStatusRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static GetLiveStatusRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private GetLiveStatusRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        UUIDv4.Builder builder;
        Objects.requireNonNull(extensionRegistryLite);
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z11 = false;
        while (!z11) {
            try {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                UUIDv4 uUIDv4 = this.requestId_;
                                builder = uUIDv4 != null ? uUIDv4.toBuilder() : null;
                                UUIDv4 uUIDv42 = (UUIDv4) codedInputStream.readMessage(UUIDv4.parser(), extensionRegistryLite);
                                this.requestId_ = uUIDv42;
                                if (builder != null) {
                                    builder.mergeFrom(uUIDv42);
                                    this.requestId_ = builder.buildPartial();
                                }
                            } else if (readTag != 26) {
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                UUIDv4 uUIDv43 = this.assetSiteId_;
                                builder = uUIDv43 != null ? uUIDv43.toBuilder() : null;
                                UUIDv4 uUIDv44 = (UUIDv4) codedInputStream.readMessage(UUIDv4.parser(), extensionRegistryLite);
                                this.assetSiteId_ = uUIDv44;
                                if (builder != null) {
                                    builder.mergeFrom(uUIDv44);
                                    this.assetSiteId_ = builder.buildPartial();
                                }
                            }
                        }
                        z11 = true;
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(this);
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e13) {
                    throw e13.setUnfinishedMessage(this);
                }
            } finally {
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static GetLiveStatusRequest parseFrom(byte[] bArr) {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static GetLiveStatusRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static GetLiveStatusRequest parseFrom(InputStream inputStream) {
        return (GetLiveStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static GetLiveStatusRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (GetLiveStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetLiveStatusRequest parseFrom(CodedInputStream codedInputStream) {
        return (GetLiveStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static GetLiveStatusRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (GetLiveStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}