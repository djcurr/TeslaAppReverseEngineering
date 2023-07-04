package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.WrappersProto;

/* loaded from: classes6.dex */
public final class Powergate {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n1tesla/proto/energy/powergate/v1/live_status.proto\u0012\u001ftesla.proto.energy.powergate.v1\u001a\u001egoogle/protobuf/wrappers.proto\"\u0086\u0005\n\nLiveStatus\u0012B\n\fsolar_status\u0018\u0002 \u0001(\u000b2,.tesla.proto.energy.powergate.v1.SolarStatus\u0012F\n\u000ebattery_status\u0018\u0003 \u0001(\u000b2..tesla.proto.energy.powergate.v1.BatteryStatus\u0012@\n\u000bload_status\u0018\u0004 \u0001(\u000b2+.tesla.proto.energy.powergate.v1.LoadStatus\u0012@\n\u000bgrid_status\u0018\u0005 \u0001(\u000b2+.tesla.proto.energy.powergate.v1.GridStatus\u0012J\n\u0010generator_status\u0018\u0006 \u0001(\u000b20.tesla.proto.energy.powergate.v1.GeneratorStatus\u0012D\n\risland_status\u0018\u0007 \u0001(\u000e2-.tesla.proto.energy.powergate.v1.IslandStatus\u0012\u0019\n\u0011storm_mode_active\u0018\b \u0001(\b\u0012Q\n\u0011storm_mode_states\u0018\t \u0003(\u000b26.tesla.proto.energy.powergate.v1.StormWatchActiveState\u0012\u0011\n\ttimestamp\u0018\n \u0001(\t\u0012U\n\u0017wall_connector_statuses\u0018\u000b \u0003(\u000b24.tesla.proto.energy.powergate.v1.WallConnectorStatus\"b\n\u000bSolarStatus\u0012\u0013\n\u000bsolar_power\u0018\u0001 \u0001(\u0001\u0012>\n\nsolar_type\u0018\u0002 \u0001(\u000e2*.tesla.proto.energy.powergate.v1.SolarType\"ì\u0001\n\rBatteryStatus\u0012B\n\fbattery_type\u0018\u0001 \u0001(\u000e2,.tesla.proto.energy.powergate.v1.BatteryType\u0012\u0013\n\u000benergy_left\u0018\u0002 \u0001(\u0001\u0012\u0019\n\u0011total_pack_energy\u0018\u0003 \u0001(\u0001\u0012\u001a\n\u0012percentage_charged\u0018\u0004 \u0001(\u0001\u0012\u0015\n\rbattery_power\u0018\u0005 \u0001(\u0001\u0012\u0016\n\u000ebackup_capable\u0018\u0006 \u0001(\b\u0012\u001c\n\u0014battery_breaker_open\u0018\u0007 \u0001(\b\" \n\nLoadStatus\u0012\u0012\n\nload_power\u0018\u0001 \u0001(\u0001\"p\n\nGridStatus\u0012\u0013\n\u000bgrid_status\u0018\u0001 \u0001(\t\u0012\u001c\n\u0014grid_services_active\u0018\u0002 \u0001(\b\u0012\u0012\n\ngrid_power\u0018\u0003 \u0001(\u0001\u0012\u001b\n\u0013grid_services_power\u0018\u0004 \u0001(\u0001\"*\n\u000fGeneratorStatus\u0012\u0017\n\u000fgenerator_power\u0018\u0001 \u0001(\u0001\"©\u0002\n\u0013WallConnectorStatus\u0012)\n\u0003vin\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012F\n\u0014wall_connector_state\u0018\u0002 \u0001(\u000e2(.tesla.proto.energy.powergate.v1.WCState\u0012W\n\u001awall_connector_fault_state\u0018\u0003 \u0001(\u000e23.tesla.proto.energy.powergate.v1.WCFaultStatusState\u00129\n\u0014wall_connector_power\u0018\u0004 \u0001(\u000b2\u001b.google.protobuf.FloatValue\u0012\u000b\n\u0003din\u0018\u0005 \u0001(\t\"|\n\u0015StormWatchActiveState\u0012\u0016\n\u000ewatch_event_id\u0018\u0001 \u0001(\t\u0012\u0012\n\nstart_time\u0018\u0002 \u0001(\t\u0012\u0010\n\bend_time\u0018\u0003 \u0001(\t\u0012\u0012\n\nstorm_type\u0018\u0004 \u0001(\t\u0012\u0011\n\topted_out\u0018\u0005 \u0001(\b*£\u0001\n\u000bBatteryType\u0012\u0018\n\u0014BATTERY_TYPE_INVALID\u0010\u0000\u0012\u001d\n\u0019BATTERY_TYPE_DC_POWERWALL\u0010\u0001\u0012\u001d\n\u0019BATTERY_TYPE_AC_POWERWALL\u0010\u0002\u0012\u001a\n\u0016BATTERY_TYPE_POWERPACK\u0010\u0003\u0012 \n\u001cBATTERY_TYPE_SOLAR_POWERWALL\u0010\u0004*W\n\tSolarType\u0012\u0016\n\u0012SOLAR_TYPE_INVALID\u0010\u0000\u0012\u0017\n\u0013SOLAR_TYPE_PV_PANEL\u0010\u0001\u0012\u0019\n\u0015SOLAR_TYPE_SOLARGLASS\u0010\u0002*ô\u0003\n\fIslandStatus\u0012\u0019\n\u0015ISLAND_STATUS_INVALID\u0010\u0000\u0012\u0019\n\u0015ISLAND_STATUS_ON_GRID\u0010\u0001\u0012'\n#ISLAND_STATUS_TRANSITIONING_ON_GRID\u0010\u0002\u0012(\n$ISLAND_STATUS_TRANSITIONING_OFF_GRID\u0010\u0003\u0012&\n\"ISLAND_STATUS_OFF_GRID_INTENTIONAL\u0010\u0004\u0012(\n$ISLAND_STATUS_OFF_GRID_UNINTENTIONAL\u0010\u0005\u00121\n-ISLAND_STATUS_OFF_GRID_UNINTENTIONAL_OVERLOAD\u0010\u0006\u00127\n3ISLAND_STATUS_OFF_GRID_UNINTENTIONAL_WAIT_FOR_SOLAR\u0010\u0007\u00126\n2ISLAND_STATUS_OFF_GRID_UNINTENTIONAL_WAIT_FOR_USER\u0010\b\u0012'\n#ISLAND_STATUS_ISLAND_STATUS_UNKNOWN\u0010\t\u0012<\n8ISLAND_STATUS_OFF_GRID_UNINTENTIONAL_WAIT_FOR_JUMP_START\u0010\n*\u0081\u0002\n\u0007WCState\u0012\u0014\n\u0010WC_STATE_INVALID\u0010\u0000\u0012\u0015\n\u0011WC_STATE_CHARGING\u0010\u0001\u0012\u0016\n\u0012WC_STATE_UNPLUGGED\u0010\u0002\u0012\u001e\n\u001aWC_STATE_UNPLUGGED_FAULTED\u0010\u0003\u0012 \n\u001cWC_STATE_WAITING_FOR_VEHICLE\u0010\u0004\u0012\u001c\n\u0018WC_STATE_TIME_RESTRICTED\u0010\u0005\u0012\u001b\n\u0017WC_STATE_FAULT_CHARGING\u0010\u0006\u0012\u001e\n\u001aWC_STATE_FAULT_NO_CHARGING\u0010\u0007\u0012\u0014\n\u0010WC_STATE_OFFLINE\u0010\b*\u0099\u0003\n\u0012WCFaultStatusState\u0012!\n\u001dWC_FAULT_STATUS_STATE_INVALID\u0010\u0000\u0012!\n\u001dWC_FAULT_STATUS_STATE_STARTUP\u0010\u0001\u0012\u001f\n\u001bWC_FAULT_STATUS_STATE_READY\u0010\u0002\u0012(\n$WC_FAULT_STATUS_STATE_CRITICAL_FAULT\u0010\u0003\u0012,\n(WC_FAULT_STATUS_STATE_NON_CRITICAL_FAULT\u0010\u0004\u0012'\n#WC_FAULT_STATUS_STATE_RETRY_PENDING\u0010\u0005\u0012!\n\u001dWC_FAULT_STATUS_STATE_LOCKOUT\u0010\u0006\u0012\"\n\u001eWC_FAULT_STATUS_STATE_FOLDBACK\u0010\u0007\u0012\"\n\u001eWC_FAULT_STATUS_STATE_CHARGING\u0010\b\u00120\n,WC_FAULT_STATUS_STATE_CONFIGURATION_REQUIRED\u0010\tB?\n#com.tesla.proto.energy.powergate.v1B\tPowergateP\u0001Z\u000bpowergatev1b\u0006proto3"}, new Descriptors.FileDescriptor[]{WrappersProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_tesla_proto_energy_powergate_v1_BatteryStatus_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_tesla_proto_energy_powergate_v1_BatteryStatus_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_tesla_proto_energy_powergate_v1_GeneratorStatus_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_tesla_proto_energy_powergate_v1_GeneratorStatus_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_tesla_proto_energy_powergate_v1_GridStatus_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_tesla_proto_energy_powergate_v1_GridStatus_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_tesla_proto_energy_powergate_v1_LiveStatus_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_tesla_proto_energy_powergate_v1_LiveStatus_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_tesla_proto_energy_powergate_v1_LoadStatus_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_tesla_proto_energy_powergate_v1_LoadStatus_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_tesla_proto_energy_powergate_v1_SolarStatus_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_tesla_proto_energy_powergate_v1_SolarStatus_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_tesla_proto_energy_powergate_v1_StormWatchActiveState_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_tesla_proto_energy_powergate_v1_StormWatchActiveState_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_tesla_proto_energy_powergate_v1_WallConnectorStatus_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_tesla_proto_energy_powergate_v1_WallConnectorStatus_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_tesla_proto_energy_powergate_v1_LiveStatus_descriptor = descriptor2;
        internal_static_tesla_proto_energy_powergate_v1_LiveStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SolarStatus", "BatteryStatus", "LoadStatus", "GridStatus", "GeneratorStatus", "IslandStatus", "StormModeActive", "StormModeStates", "Timestamp", "WallConnectorStatuses"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_tesla_proto_energy_powergate_v1_SolarStatus_descriptor = descriptor3;
        internal_static_tesla_proto_energy_powergate_v1_SolarStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"SolarPower", "SolarType"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_tesla_proto_energy_powergate_v1_BatteryStatus_descriptor = descriptor4;
        internal_static_tesla_proto_energy_powergate_v1_BatteryStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"BatteryType", "EnergyLeft", "TotalPackEnergy", "PercentageCharged", "BatteryPower", "BackupCapable", "BatteryBreakerOpen"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_tesla_proto_energy_powergate_v1_LoadStatus_descriptor = descriptor5;
        internal_static_tesla_proto_energy_powergate_v1_LoadStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"LoadPower"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_tesla_proto_energy_powergate_v1_GridStatus_descriptor = descriptor6;
        internal_static_tesla_proto_energy_powergate_v1_GridStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"GridStatus", "GridServicesActive", "GridPower", "GridServicesPower"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_tesla_proto_energy_powergate_v1_GeneratorStatus_descriptor = descriptor7;
        internal_static_tesla_proto_energy_powergate_v1_GeneratorStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"GeneratorPower"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_tesla_proto_energy_powergate_v1_WallConnectorStatus_descriptor = descriptor8;
        internal_static_tesla_proto_energy_powergate_v1_WallConnectorStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Vin", "WallConnectorState", "WallConnectorFaultState", "WallConnectorPower", "Din"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_tesla_proto_energy_powergate_v1_StormWatchActiveState_descriptor = descriptor9;
        internal_static_tesla_proto_energy_powergate_v1_StormWatchActiveState_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"WatchEventId", "StartTime", "EndTime", "StormType", "OptedOut"});
        WrappersProto.getDescriptor();
    }

    private Powergate() {
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