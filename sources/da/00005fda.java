package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/tesla/data/oapi/ClimateOverrideModeAdapter;", "", "Lcom/tesla/data/oapi/ClimateOverrideMode;", "mode", "", "toJson", "value", "fromJson", "<init>", "()V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ClimateOverrideModeAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static final ClimateOverrideModeAdapter f21594a = new ClimateOverrideModeAdapter();

    private ClimateOverrideModeAdapter() {
    }

    @ir.a
    public final ClimateOverrideMode fromJson(String value) {
        ClimateOverrideMode climateOverrideMode;
        s.g(value, "value");
        ClimateOverrideMode[] values = ClimateOverrideMode.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                climateOverrideMode = null;
                break;
            }
            climateOverrideMode = values[i11];
            if (s.c(climateOverrideMode.getValue(), value)) {
                break;
            }
            i11++;
        }
        return climateOverrideMode == null ? ClimateOverrideMode.NONE : climateOverrideMode;
    }

    @ir.d
    public final String toJson(ClimateOverrideMode mode) {
        s.g(mode, "mode");
        return mode.getValue();
    }
}