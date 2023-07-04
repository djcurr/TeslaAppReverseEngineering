package com.tesla.proto.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

/* loaded from: classes6.dex */
public final class UUID {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n tesla/proto/common/v1/uuid.proto\u0012\u0015tesla.proto.common.v1\"\u001c\n\u000bUUIDv4Bytes\u0012\r\n\u0005value\u0018\u0001 \u0001(\f\"\u0016\n\u0006UUIDv4\u0012\f\n\u0004text\u0018\u0001 \u0001(\tBc\n\u0019com.tesla.proto.common.v1B\u0004UUIDP\u0001Z\bcommonv1¢\u0002\u0003TPCª\u0002\u0015Tesla.Proto.Common.V1Ê\u0002\u0015Tesla\\Proto\\Common\\V1b\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    static final Descriptors.Descriptor internal_static_tesla_proto_common_v1_UUIDv4Bytes_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_tesla_proto_common_v1_UUIDv4Bytes_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_tesla_proto_common_v1_UUIDv4_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_tesla_proto_common_v1_UUIDv4_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_tesla_proto_common_v1_UUIDv4Bytes_descriptor = descriptor2;
        internal_static_tesla_proto_common_v1_UUIDv4Bytes_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Value"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_tesla_proto_common_v1_UUIDv4_descriptor = descriptor3;
        internal_static_tesla_proto_common_v1_UUIDv4_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Text"});
    }

    private UUID() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}