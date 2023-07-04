package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/tesla/data/oapi/SeatHeaterAdapter;", "", "Lcom/tesla/data/oapi/SeatHeater;", "heater", "", "toJson", "value", "fromJson", "<init>", "()V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SeatHeaterAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static final SeatHeaterAdapter f21645a = new SeatHeaterAdapter();

    private SeatHeaterAdapter() {
    }

    @ir.a
    public final SeatHeater fromJson(int i11) {
        SeatHeater seatHeater;
        SeatHeater[] values = SeatHeater.values();
        int length = values.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                seatHeater = null;
                break;
            }
            seatHeater = values[i12];
            if (seatHeater.getValue() == i11) {
                break;
            }
            i12++;
        }
        return seatHeater == null ? SeatHeater.UNKNOWN : seatHeater;
    }

    @ir.d
    public final int toJson(SeatHeater heater) {
        s.g(heater, "heater");
        return heater.getValue();
    }
}