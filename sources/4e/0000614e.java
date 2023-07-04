package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class StormWatchActiveState extends GeneratedMessageV3 implements StormWatchActiveStateOrBuilder {
    public static final int END_TIME_FIELD_NUMBER = 3;
    public static final int OPTED_OUT_FIELD_NUMBER = 5;
    public static final int START_TIME_FIELD_NUMBER = 2;
    public static final int STORM_TYPE_FIELD_NUMBER = 4;
    public static final int WATCH_EVENT_ID_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile Object endTime_;
    private byte memoizedIsInitialized;
    private boolean optedOut_;
    private volatile Object startTime_;
    private volatile Object stormType_;
    private volatile Object watchEventId_;
    private static final StormWatchActiveState DEFAULT_INSTANCE = new StormWatchActiveState();
    private static final Parser<StormWatchActiveState> PARSER = new AbstractParser<StormWatchActiveState>() { // from class: com.tesla.proto.energy.powergate.v1.StormWatchActiveState.1
        @Override // com.google.protobuf.Parser
        public StormWatchActiveState parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return new StormWatchActiveState(codedInputStream, extensionRegistryLite);
        }
    };

    private StormWatchActiveState(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static StormWatchActiveState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Powergate.internal_static_tesla_proto_energy_powergate_v1_StormWatchActiveState_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static StormWatchActiveState parseDelimitedFrom(InputStream inputStream) {
        return (StormWatchActiveState) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static StormWatchActiveState parseFrom(ByteBuffer byteBuffer) {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<StormWatchActiveState> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StormWatchActiveState)) {
            return super.equals(obj);
        }
        StormWatchActiveState stormWatchActiveState = (StormWatchActiveState) obj;
        return getWatchEventId().equals(stormWatchActiveState.getWatchEventId()) && getStartTime().equals(stormWatchActiveState.getStartTime()) && getEndTime().equals(stormWatchActiveState.getEndTime()) && getStormType().equals(stormWatchActiveState.getStormType()) && getOptedOut() == stormWatchActiveState.getOptedOut() && this.unknownFields.equals(stormWatchActiveState.unknownFields);
    }

    @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
    public String getEndTime() {
        Object obj = this.endTime_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.endTime_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
    public ByteString getEndTimeBytes() {
        Object obj = this.endTime_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.endTime_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
    public boolean getOptedOut() {
        return this.optedOut_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<StormWatchActiveState> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int computeStringSize = GeneratedMessageV3.isStringEmpty(this.watchEventId_) ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.watchEventId_);
        if (!GeneratedMessageV3.isStringEmpty(this.startTime_)) {
            computeStringSize += GeneratedMessageV3.computeStringSize(2, this.startTime_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.endTime_)) {
            computeStringSize += GeneratedMessageV3.computeStringSize(3, this.endTime_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.stormType_)) {
            computeStringSize += GeneratedMessageV3.computeStringSize(4, this.stormType_);
        }
        boolean z11 = this.optedOut_;
        if (z11) {
            computeStringSize += CodedOutputStream.computeBoolSize(5, z11);
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
    public String getStartTime() {
        Object obj = this.startTime_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.startTime_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
    public ByteString getStartTimeBytes() {
        Object obj = this.startTime_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.startTime_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
    public String getStormType() {
        Object obj = this.stormType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.stormType_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
    public ByteString getStormTypeBytes() {
        Object obj = this.stormType_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.stormType_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
    public String getWatchEventId() {
        Object obj = this.watchEventId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.watchEventId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
    public ByteString getWatchEventIdBytes() {
        Object obj = this.watchEventId_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.watchEventId_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getWatchEventId().hashCode()) * 37) + 2) * 53) + getStartTime().hashCode()) * 37) + 3) * 53) + getEndTime().hashCode()) * 37) + 4) * 53) + getStormType().hashCode()) * 37) + 5) * 53) + Internal.hashBoolean(getOptedOut())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Powergate.internal_static_tesla_proto_energy_powergate_v1_StormWatchActiveState_fieldAccessorTable.ensureFieldAccessorsInitialized(StormWatchActiveState.class, Builder.class);
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
        return new StormWatchActiveState();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!GeneratedMessageV3.isStringEmpty(this.watchEventId_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.watchEventId_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.startTime_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.startTime_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.endTime_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.endTime_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.stormType_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.stormType_);
        }
        boolean z11 = this.optedOut_;
        if (z11) {
            codedOutputStream.writeBool(5, z11);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StormWatchActiveStateOrBuilder {
        private Object endTime_;
        private boolean optedOut_;
        private Object startTime_;
        private Object stormType_;
        private Object watchEventId_;

        private Builder() {
            this.watchEventId_ = "";
            this.startTime_ = "";
            this.endTime_ = "";
            this.stormType_ = "";
            maybeForceBuilderInitialization();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_StormWatchActiveState_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clearEndTime() {
            this.endTime_ = StormWatchActiveState.getDefaultInstance().getEndTime();
            onChanged();
            return this;
        }

        public Builder clearOptedOut() {
            this.optedOut_ = false;
            onChanged();
            return this;
        }

        public Builder clearStartTime() {
            this.startTime_ = StormWatchActiveState.getDefaultInstance().getStartTime();
            onChanged();
            return this;
        }

        public Builder clearStormType() {
            this.stormType_ = StormWatchActiveState.getDefaultInstance().getStormType();
            onChanged();
            return this;
        }

        public Builder clearWatchEventId() {
            this.watchEventId_ = StormWatchActiveState.getDefaultInstance().getWatchEventId();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_StormWatchActiveState_descriptor;
        }

        @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
        public String getEndTime() {
            Object obj = this.endTime_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.endTime_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
        public ByteString getEndTimeBytes() {
            Object obj = this.endTime_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.endTime_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
        public boolean getOptedOut() {
            return this.optedOut_;
        }

        @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
        public String getStartTime() {
            Object obj = this.startTime_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.startTime_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
        public ByteString getStartTimeBytes() {
            Object obj = this.startTime_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.startTime_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
        public String getStormType() {
            Object obj = this.stormType_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.stormType_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
        public ByteString getStormTypeBytes() {
            Object obj = this.stormType_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.stormType_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
        public String getWatchEventId() {
            Object obj = this.watchEventId_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.watchEventId_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.tesla.proto.energy.powergate.v1.StormWatchActiveStateOrBuilder
        public ByteString getWatchEventIdBytes() {
            Object obj = this.watchEventId_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.watchEventId_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Powergate.internal_static_tesla_proto_energy_powergate_v1_StormWatchActiveState_fieldAccessorTable.ensureFieldAccessorsInitialized(StormWatchActiveState.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setEndTime(String str) {
            Objects.requireNonNull(str);
            this.endTime_ = str;
            onChanged();
            return this;
        }

        public Builder setEndTimeBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.endTime_ = byteString;
            onChanged();
            return this;
        }

        public Builder setOptedOut(boolean z11) {
            this.optedOut_ = z11;
            onChanged();
            return this;
        }

        public Builder setStartTime(String str) {
            Objects.requireNonNull(str);
            this.startTime_ = str;
            onChanged();
            return this;
        }

        public Builder setStartTimeBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.startTime_ = byteString;
            onChanged();
            return this;
        }

        public Builder setStormType(String str) {
            Objects.requireNonNull(str);
            this.stormType_ = str;
            onChanged();
            return this;
        }

        public Builder setStormTypeBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.stormType_ = byteString;
            onChanged();
            return this;
        }

        public Builder setWatchEventId(String str) {
            Objects.requireNonNull(str);
            this.watchEventId_ = str;
            onChanged();
            return this;
        }

        public Builder setWatchEventIdBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.watchEventId_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public StormWatchActiveState build() {
            StormWatchActiveState buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public StormWatchActiveState buildPartial() {
            StormWatchActiveState stormWatchActiveState = new StormWatchActiveState(this);
            stormWatchActiveState.watchEventId_ = this.watchEventId_;
            stormWatchActiveState.startTime_ = this.startTime_;
            stormWatchActiveState.endTime_ = this.endTime_;
            stormWatchActiveState.stormType_ = this.stormType_;
            stormWatchActiveState.optedOut_ = this.optedOut_;
            onBuilt();
            return stormWatchActiveState;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StormWatchActiveState getDefaultInstanceForType() {
            return StormWatchActiveState.getDefaultInstance();
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
            this.watchEventId_ = "";
            this.startTime_ = "";
            this.endTime_ = "";
            this.stormType_ = "";
            this.optedOut_ = false;
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.watchEventId_ = "";
            this.startTime_ = "";
            this.endTime_ = "";
            this.stormType_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public Builder mo112clone() {
            return (Builder) super.mo112clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof StormWatchActiveState) {
                return mergeFrom((StormWatchActiveState) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(StormWatchActiveState stormWatchActiveState) {
            if (stormWatchActiveState == StormWatchActiveState.getDefaultInstance()) {
                return this;
            }
            if (!stormWatchActiveState.getWatchEventId().isEmpty()) {
                this.watchEventId_ = stormWatchActiveState.watchEventId_;
                onChanged();
            }
            if (!stormWatchActiveState.getStartTime().isEmpty()) {
                this.startTime_ = stormWatchActiveState.startTime_;
                onChanged();
            }
            if (!stormWatchActiveState.getEndTime().isEmpty()) {
                this.endTime_ = stormWatchActiveState.endTime_;
                onChanged();
            }
            if (!stormWatchActiveState.getStormType().isEmpty()) {
                this.stormType_ = stormWatchActiveState.stormType_;
                onChanged();
            }
            if (stormWatchActiveState.getOptedOut()) {
                setOptedOut(stormWatchActiveState.getOptedOut());
            }
            mergeUnknownFields(((GeneratedMessageV3) stormWatchActiveState).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.tesla.proto.energy.powergate.v1.StormWatchActiveState.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.tesla.proto.energy.powergate.v1.StormWatchActiveState.j()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                com.tesla.proto.energy.powergate.v1.StormWatchActiveState r3 = (com.tesla.proto.energy.powergate.v1.StormWatchActiveState) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
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
                com.tesla.proto.energy.powergate.v1.StormWatchActiveState r4 = (com.tesla.proto.energy.powergate.v1.StormWatchActiveState) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.tesla.proto.energy.powergate.v1.StormWatchActiveState.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.tesla.proto.energy.powergate.v1.StormWatchActiveState$Builder");
        }
    }

    public static Builder newBuilder(StormWatchActiveState stormWatchActiveState) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(stormWatchActiveState);
    }

    public static StormWatchActiveState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private StormWatchActiveState() {
        this.memoizedIsInitialized = (byte) -1;
        this.watchEventId_ = "";
        this.startTime_ = "";
        this.endTime_ = "";
        this.stormType_ = "";
    }

    public static StormWatchActiveState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (StormWatchActiveState) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static StormWatchActiveState parseFrom(ByteString byteString) {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public StormWatchActiveState getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static StormWatchActiveState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static StormWatchActiveState parseFrom(byte[] bArr) {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static StormWatchActiveState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static StormWatchActiveState parseFrom(InputStream inputStream) {
        return (StormWatchActiveState) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private StormWatchActiveState(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.watchEventId_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.startTime_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.endTime_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.stormType_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag != 40) {
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                this.optedOut_ = codedInputStream.readBool();
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

    public static StormWatchActiveState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (StormWatchActiveState) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static StormWatchActiveState parseFrom(CodedInputStream codedInputStream) {
        return (StormWatchActiveState) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static StormWatchActiveState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (StormWatchActiveState) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}