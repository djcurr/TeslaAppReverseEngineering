package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.MessageOrBuilder;

/* loaded from: classes6.dex */
public interface BatteryStatusOrBuilder extends MessageOrBuilder {
    boolean getBackupCapable();

    boolean getBatteryBreakerOpen();

    double getBatteryPower();

    BatteryType getBatteryType();

    int getBatteryTypeValue();

    double getEnergyLeft();

    double getPercentageCharged();

    double getTotalPackEnergy();
}