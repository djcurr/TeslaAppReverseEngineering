package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.tesla.proto.common.v1.UUID;

/* loaded from: classes6.dex */
public final class Powerstream {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n7tesla/proto/energy/powerstream/v1/powerstream_api.proto\u0012!tesla.proto.energy.powerstream.v1\u001a tesla/proto/common/v1/uuid.proto\u001a1tesla/proto/energy/powergate/v1/live_status.proto\"\u0012\n\u0010GetHealthRequest\"\u001f\n\u0011GetHealthResponse\u0012\n\n\u0002ok\u0018\u0001 \u0001(\b\"\u007f\n\u0014GetLiveStatusRequest\u00121\n\nrequest_id\u0018\u0001 \u0001(\u000b2\u001d.tesla.proto.common.v1.UUIDv4\u00124\n\rasset_site_id\u0018\u0003 \u0001(\u000b2\u001d.tesla.proto.common.v1.UUIDv4\"\u008c\u0001\n\u0015GetLiveStatusResponse\u00121\n\nrequest_id\u0018\u0001 \u0001(\u000b2\u001d.tesla.proto.common.v1.UUIDv4\u0012@\n\u000blive_status\u0018\u0002 \u0001(\u000b2+.tesla.proto.energy.powergate.v1.LiveStatus2\u008f\u0002\n\u000ePowerstreamAPI\u0012v\n\tGetHealth\u00123.tesla.proto.energy.powerstream.v1.GetHealthRequest\u001a4.tesla.proto.energy.powerstream.v1.GetHealthResponse\u0012\u0084\u0001\n\rGetLiveStatus\u00127.tesla.proto.energy.powerstream.v1.GetLiveStatusRequest\u001a8.tesla.proto.energy.powerstream.v1.GetLiveStatusResponse0\u0001BC\n#com.tesla.proto.energy.powergate.v1B\u000bPowerstreamP\u0001Z\rpowerstreamv1b\u0006proto3"}, new Descriptors.FileDescriptor[]{UUID.getDescriptor(), Powergate.getDescriptor()});
    static final Descriptors.Descriptor internal_static_tesla_proto_energy_powerstream_v1_GetHealthRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_tesla_proto_energy_powerstream_v1_GetHealthRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_tesla_proto_energy_powerstream_v1_GetHealthResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_tesla_proto_energy_powerstream_v1_GetHealthResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusResponse_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_tesla_proto_energy_powerstream_v1_GetHealthRequest_descriptor = descriptor2;
        internal_static_tesla_proto_energy_powerstream_v1_GetHealthRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[0]);
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_tesla_proto_energy_powerstream_v1_GetHealthResponse_descriptor = descriptor3;
        internal_static_tesla_proto_energy_powerstream_v1_GetHealthResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Ok"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusRequest_descriptor = descriptor4;
        internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"RequestId", "AssetSiteId"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusResponse_descriptor = descriptor5;
        internal_static_tesla_proto_energy_powerstream_v1_GetLiveStatusResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"RequestId", "LiveStatus"});
        UUID.getDescriptor();
        Powergate.getDescriptor();
    }

    private Powerstream() {
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