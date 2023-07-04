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
import com.tesla.proto.energy.powergate.v1.LiveStatus;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class GetLiveStatusResponse extends GeneratedMessageV3 implements GetLiveStatusResponseOrBuilder {
    public static final int LIVE_STATUS_FIELD_NUMBER = 2;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private LiveStatus liveStatus_;
    private byte memoizedIsInitialized;
    private UUIDv4 requestId_;
    private static final GetLiveStatusResponse DEFAULT_INSTANCE = new GetLiveStatusResponse();
    private static final Parser<GetLiveStatusResponse> PARSER = new AbstractParser<GetLiveStatusResponse>() { // from class: com.tesla.proto.energy.powergate.v1.GetLiveStatusResponse.1
        @Override // com.google.protobuf.Parser
        public GetLiveStatusResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return new GetLiveStatusResponse(codedInputStream, extensionRegistryLite);
        }
    };

    private GetLiveStatusResponse(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static GetLiveStatusResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Powerstream.internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusResponse_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static GetLiveStatusResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetLiveStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static GetLiveStatusResponse parseFrom(ByteBuffer byteBuffer) {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<GetLiveStatusResponse> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetLiveStatusResponse)) {
            return super.equals(obj);
        }
        GetLiveStatusResponse getLiveStatusResponse = (GetLiveStatusResponse) obj;
        if (hasRequestId() != getLiveStatusResponse.hasRequestId()) {
            return false;
        }
        if ((!hasRequestId() || getRequestId().equals(getLiveStatusResponse.getRequestId())) && hasLiveStatus() == getLiveStatusResponse.hasLiveStatus()) {
            return (!hasLiveStatus() || getLiveStatus().equals(getLiveStatusResponse.getLiveStatus())) && this.unknownFields.equals(getLiveStatusResponse.unknownFields);
        }
        return false;
    }

    @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusResponseOrBuilder
    public LiveStatus getLiveStatus() {
        LiveStatus liveStatus = this.liveStatus_;
        return liveStatus == null ? LiveStatus.getDefaultInstance() : liveStatus;
    }

    @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusResponseOrBuilder
    public LiveStatusOrBuilder getLiveStatusOrBuilder() {
        return getLiveStatus();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<GetLiveStatusResponse> getParserForType() {
        return PARSER;
    }

    @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusResponseOrBuilder
    public UUIDv4 getRequestId() {
        UUIDv4 uUIDv4 = this.requestId_;
        return uUIDv4 == null ? UUIDv4.getDefaultInstance() : uUIDv4;
    }

    @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusResponseOrBuilder
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
        if (this.liveStatus_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, getLiveStatus());
        }
        int serializedSize = computeMessageSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusResponseOrBuilder
    public boolean hasLiveStatus() {
        return this.liveStatus_ != null;
    }

    @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusResponseOrBuilder
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
        if (hasLiveStatus()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getLiveStatus().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Powerstream.internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLiveStatusResponse.class, Builder.class);
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
        return new GetLiveStatusResponse();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.requestId_ != null) {
            codedOutputStream.writeMessage(1, getRequestId());
        }
        if (this.liveStatus_ != null) {
            codedOutputStream.writeMessage(2, getLiveStatus());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetLiveStatusResponseOrBuilder {
        private SingleFieldBuilderV3<LiveStatus, LiveStatus.Builder, LiveStatusOrBuilder> liveStatusBuilder_;
        private LiveStatus liveStatus_;
        private SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> requestIdBuilder_;
        private UUIDv4 requestId_;

        private Builder() {
            maybeForceBuilderInitialization();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Powerstream.internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusResponse_descriptor;
        }

        private SingleFieldBuilderV3<LiveStatus, LiveStatus.Builder, LiveStatusOrBuilder> getLiveStatusFieldBuilder() {
            if (this.liveStatusBuilder_ == null) {
                this.liveStatusBuilder_ = new SingleFieldBuilderV3<>(getLiveStatus(), getParentForChildren(), isClean());
                this.liveStatus_ = null;
            }
            return this.liveStatusBuilder_;
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

        public Builder clearLiveStatus() {
            if (this.liveStatusBuilder_ == null) {
                this.liveStatus_ = null;
                onChanged();
            } else {
                this.liveStatus_ = null;
                this.liveStatusBuilder_ = null;
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

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Powerstream.internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusResponse_descriptor;
        }

        @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusResponseOrBuilder
        public LiveStatus getLiveStatus() {
            SingleFieldBuilderV3<LiveStatus, LiveStatus.Builder, LiveStatusOrBuilder> singleFieldBuilderV3 = this.liveStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                LiveStatus liveStatus = this.liveStatus_;
                return liveStatus == null ? LiveStatus.getDefaultInstance() : liveStatus;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public LiveStatus.Builder getLiveStatusBuilder() {
            onChanged();
            return getLiveStatusFieldBuilder().getBuilder();
        }

        @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusResponseOrBuilder
        public LiveStatusOrBuilder getLiveStatusOrBuilder() {
            SingleFieldBuilderV3<LiveStatus, LiveStatus.Builder, LiveStatusOrBuilder> singleFieldBuilderV3 = this.liveStatusBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            LiveStatus liveStatus = this.liveStatus_;
            return liveStatus == null ? LiveStatus.getDefaultInstance() : liveStatus;
        }

        @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusResponseOrBuilder
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

        @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusResponseOrBuilder
        public UUIDv4OrBuilder getRequestIdOrBuilder() {
            SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> singleFieldBuilderV3 = this.requestIdBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            UUIDv4 uUIDv4 = this.requestId_;
            return uUIDv4 == null ? UUIDv4.getDefaultInstance() : uUIDv4;
        }

        @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusResponseOrBuilder
        public boolean hasLiveStatus() {
            return (this.liveStatusBuilder_ == null && this.liveStatus_ == null) ? false : true;
        }

        @Override // com.tesla.proto.energy.powergate.v1.GetLiveStatusResponseOrBuilder
        public boolean hasRequestId() {
            return (this.requestIdBuilder_ == null && this.requestId_ == null) ? false : true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Powerstream.internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLiveStatusResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeLiveStatus(LiveStatus liveStatus) {
            SingleFieldBuilderV3<LiveStatus, LiveStatus.Builder, LiveStatusOrBuilder> singleFieldBuilderV3 = this.liveStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                LiveStatus liveStatus2 = this.liveStatus_;
                if (liveStatus2 != null) {
                    this.liveStatus_ = LiveStatus.newBuilder(liveStatus2).mergeFrom(liveStatus).buildPartial();
                } else {
                    this.liveStatus_ = liveStatus;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(liveStatus);
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

        public Builder setLiveStatus(LiveStatus liveStatus) {
            SingleFieldBuilderV3<LiveStatus, LiveStatus.Builder, LiveStatusOrBuilder> singleFieldBuilderV3 = this.liveStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(liveStatus);
                this.liveStatus_ = liveStatus;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(liveStatus);
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
        public GetLiveStatusResponse build() {
            GetLiveStatusResponse buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GetLiveStatusResponse buildPartial() {
            GetLiveStatusResponse getLiveStatusResponse = new GetLiveStatusResponse(this);
            SingleFieldBuilderV3<UUIDv4, UUIDv4.Builder, UUIDv4OrBuilder> singleFieldBuilderV3 = this.requestIdBuilder_;
            if (singleFieldBuilderV3 == null) {
                getLiveStatusResponse.requestId_ = this.requestId_;
            } else {
                getLiveStatusResponse.requestId_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<LiveStatus, LiveStatus.Builder, LiveStatusOrBuilder> singleFieldBuilderV32 = this.liveStatusBuilder_;
            if (singleFieldBuilderV32 == null) {
                getLiveStatusResponse.liveStatus_ = this.liveStatus_;
            } else {
                getLiveStatusResponse.liveStatus_ = singleFieldBuilderV32.build();
            }
            onBuilt();
            return getLiveStatusResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetLiveStatusResponse getDefaultInstanceForType() {
            return GetLiveStatusResponse.getDefaultInstance();
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
            if (this.liveStatusBuilder_ == null) {
                this.liveStatus_ = null;
            } else {
                this.liveStatus_ = null;
                this.liveStatusBuilder_ = null;
            }
            return this;
        }

        public Builder setLiveStatus(LiveStatus.Builder builder) {
            SingleFieldBuilderV3<LiveStatus, LiveStatus.Builder, LiveStatusOrBuilder> singleFieldBuilderV3 = this.liveStatusBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.liveStatus_ = builder.build();
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
            if (message instanceof GetLiveStatusResponse) {
                return mergeFrom((GetLiveStatusResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(GetLiveStatusResponse getLiveStatusResponse) {
            if (getLiveStatusResponse == GetLiveStatusResponse.getDefaultInstance()) {
                return this;
            }
            if (getLiveStatusResponse.hasRequestId()) {
                mergeRequestId(getLiveStatusResponse.getRequestId());
            }
            if (getLiveStatusResponse.hasLiveStatus()) {
                mergeLiveStatus(getLiveStatusResponse.getLiveStatus());
            }
            mergeUnknownFields(((GeneratedMessageV3) getLiveStatusResponse).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.tesla.proto.energy.powergate.v1.GetLiveStatusResponse.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.tesla.proto.energy.powergate.v1.GetLiveStatusResponse.c()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                com.tesla.proto.energy.powergate.v1.GetLiveStatusResponse r3 = (com.tesla.proto.energy.powergate.v1.GetLiveStatusResponse) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                com.tesla.proto.energy.powergate.v1.GetLiveStatusResponse r4 = (com.tesla.proto.energy.powergate.v1.GetLiveStatusResponse) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.tesla.proto.energy.powergate.v1.GetLiveStatusResponse.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.tesla.proto.energy.powergate.v1.GetLiveStatusResponse$Builder");
        }
    }

    public static Builder newBuilder(GetLiveStatusResponse getLiveStatusResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(getLiveStatusResponse);
    }

    public static GetLiveStatusResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private GetLiveStatusResponse() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static GetLiveStatusResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (GetLiveStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetLiveStatusResponse parseFrom(ByteString byteString) {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public GetLiveStatusResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static GetLiveStatusResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private GetLiveStatusResponse(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
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
                                UUIDv4.Builder builder = uUIDv4 != null ? uUIDv4.toBuilder() : null;
                                UUIDv4 uUIDv42 = (UUIDv4) codedInputStream.readMessage(UUIDv4.parser(), extensionRegistryLite);
                                this.requestId_ = uUIDv42;
                                if (builder != null) {
                                    builder.mergeFrom(uUIDv42);
                                    this.requestId_ = builder.buildPartial();
                                }
                            } else if (readTag != 18) {
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                LiveStatus liveStatus = this.liveStatus_;
                                LiveStatus.Builder builder2 = liveStatus != null ? liveStatus.toBuilder() : null;
                                LiveStatus liveStatus2 = (LiveStatus) codedInputStream.readMessage(LiveStatus.parser(), extensionRegistryLite);
                                this.liveStatus_ = liveStatus2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(liveStatus2);
                                    this.liveStatus_ = builder2.buildPartial();
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

    public static GetLiveStatusResponse parseFrom(byte[] bArr) {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static GetLiveStatusResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static GetLiveStatusResponse parseFrom(InputStream inputStream) {
        return (GetLiveStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static GetLiveStatusResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (GetLiveStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetLiveStatusResponse parseFrom(CodedInputStream codedInputStream) {
        return (GetLiveStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static GetLiveStatusResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (GetLiveStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}