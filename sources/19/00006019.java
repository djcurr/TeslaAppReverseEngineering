package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/tesla/data/oapi/SunroofStateChangeAdapter;", "", "Lcom/tesla/data/oapi/SunroofStateChange;", "change", "", "toJson", "value", "fromJson", "<init>", "()V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SunroofStateChangeAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static final SunroofStateChangeAdapter f21702a = new SunroofStateChangeAdapter();

    private SunroofStateChangeAdapter() {
    }

    @ir.a
    public final SunroofStateChange fromJson(String value) {
        SunroofStateChange sunroofStateChange;
        s.g(value, "value");
        SunroofStateChange[] values = SunroofStateChange.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                sunroofStateChange = null;
                break;
            }
            sunroofStateChange = values[i11];
            if (s.c(sunroofStateChange.getValue(), value)) {
                break;
            }
            i11++;
        }
        s.e(sunroofStateChange);
        return sunroofStateChange;
    }

    @ir.d
    public final String toJson(SunroofStateChange change) {
        s.g(change, "change");
        return change.getValue();
    }
}