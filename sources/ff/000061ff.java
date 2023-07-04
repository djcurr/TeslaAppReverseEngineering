package com.teslamotors.plugins.ble.beacon;

import androidx.annotation.Keep;
import jv.a;
import jv.b;
import kotlin.Metadata;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/teslamotors/plugins/ble/beacon/BeaconInjector;", "", "Ljv/a;", "inject", "<init>", "()V", "tesla-ble_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class BeaconInjector {
    public static final BeaconInjector INSTANCE = new BeaconInjector();

    private BeaconInjector() {
    }

    public final a inject() {
        return b.a();
    }
}