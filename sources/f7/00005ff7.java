package com.tesla.data.oapi;

import io.realm.internal.Keep;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/tesla/data/oapi/SeatHeater;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "UNKNOWN", "FRONT_LEFT", "FRONT_RIGHT", "REAR_LEFT", "REAR_LEFT_BACK", "REAR_CENTER", "REAR_RIGHT", "REAR_RIGHT_BACK", "THIRD_ROW_LEFT", "THIRD_ROW_RIGHT", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
@Keep
/* loaded from: classes6.dex */
public enum SeatHeater {
    UNKNOWN(10),
    FRONT_LEFT(0),
    FRONT_RIGHT(1),
    REAR_LEFT(2),
    REAR_LEFT_BACK(3),
    REAR_CENTER(4),
    REAR_RIGHT(5),
    REAR_RIGHT_BACK(6),
    THIRD_ROW_LEFT(7),
    THIRD_ROW_RIGHT(8);
    
    private final int value;

    SeatHeater(int i11) {
        this.value = i11;
    }

    public final int getValue() {
        return this.value;
    }
}