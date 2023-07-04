package com.tesla.messagebuilder.util;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import ir.b;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vu.c;
import zu.j;

@g(generateAdapter = true)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u001cB\u0013\b\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001b\u0010\u001fJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J@\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001a\u0010\u0007¨\u0006 "}, d2 = {"Lcom/tesla/messagebuilder/util/VehicleSessionInfoDataBody;", "", "", "component1", "component2", "", "component3", "()Ljava/lang/Integer;", "component4", "epoch", "publicKey", "clockTime", "counter", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/tesla/messagebuilder/util/VehicleSessionInfoDataBody;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getEpoch", "()Ljava/lang/String;", "getPublicKey", "Ljava/lang/Integer;", "getClockTime", "getCounter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lvu/c;", "vehicleSessionInfo", "(Lvu/c;)V", "messagebuilder_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class VehicleSessionInfoDataBody {
    private final Integer clockTime;
    private final Integer counter;
    private final String epoch;
    private final String publicKey;

    public VehicleSessionInfoDataBody(@b(name = "epoch") String str, @b(name = "public_key") String str2, @b(name = "clock_time") Integer num, @b(name = "counter") Integer num2) {
        this.epoch = str;
        this.publicKey = str2;
        this.clockTime = num;
        this.counter = num2;
    }

    public static /* synthetic */ VehicleSessionInfoDataBody copy$default(VehicleSessionInfoDataBody vehicleSessionInfoDataBody, String str, String str2, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = vehicleSessionInfoDataBody.epoch;
        }
        if ((i11 & 2) != 0) {
            str2 = vehicleSessionInfoDataBody.publicKey;
        }
        if ((i11 & 4) != 0) {
            num = vehicleSessionInfoDataBody.clockTime;
        }
        if ((i11 & 8) != 0) {
            num2 = vehicleSessionInfoDataBody.counter;
        }
        return vehicleSessionInfoDataBody.copy(str, str2, num, num2);
    }

    public final String component1() {
        return this.epoch;
    }

    public final String component2() {
        return this.publicKey;
    }

    public final Integer component3() {
        return this.clockTime;
    }

    public final Integer component4() {
        return this.counter;
    }

    public final VehicleSessionInfoDataBody copy(@b(name = "epoch") String str, @b(name = "public_key") String str2, @b(name = "clock_time") Integer num, @b(name = "counter") Integer num2) {
        return new VehicleSessionInfoDataBody(str, str2, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VehicleSessionInfoDataBody) {
            VehicleSessionInfoDataBody vehicleSessionInfoDataBody = (VehicleSessionInfoDataBody) obj;
            return s.c(this.epoch, vehicleSessionInfoDataBody.epoch) && s.c(this.publicKey, vehicleSessionInfoDataBody.publicKey) && s.c(this.clockTime, vehicleSessionInfoDataBody.clockTime) && s.c(this.counter, vehicleSessionInfoDataBody.counter);
        }
        return false;
    }

    public final Integer getClockTime() {
        return this.clockTime;
    }

    public final Integer getCounter() {
        return this.counter;
    }

    public final String getEpoch() {
        return this.epoch;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        String str = this.epoch;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.publicKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.clockTime;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.counter;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.epoch;
        String str2 = this.publicKey;
        Integer num = this.clockTime;
        Integer num2 = this.counter;
        return "VehicleSessionInfoDataBody(epoch=" + str + ", publicKey=" + str2 + ", clockTime=" + num + ", counter=" + num2 + ")";
    }

    public VehicleSessionInfoDataBody(c cVar) {
        this((cVar == null || (r3 = cVar.f()) == null || (r3 = j.f(r3)) == null) ? null : j.c(r3, 0, 1, null), (cVar == null || (r4 = cVar.h()) == null || (r4 = j.f(r4)) == null) ? null : j.c(r4, 0, 1, null), cVar == null ? null : Integer.valueOf(cVar.c()), cVar != null ? Integer.valueOf(cVar.d()) : null);
        String f11;
        byte[] f12;
        String h11;
        byte[] f13;
    }
}