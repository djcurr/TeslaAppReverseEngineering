package com.tesla.data.oapi;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/AutoSeatClimateBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/AutoSeatClimateBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class AutoSeatClimateBodyJsonAdapter extends com.squareup.moshi.f<AutoSeatClimateBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21523a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<SeatPosition> f21524b;

    /* renamed from: c  reason: collision with root package name */
    private final com.squareup.moshi.f<Boolean> f21525c;

    public AutoSeatClimateBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("auto_seat_position", "auto_climate_on");
        s.f(a11, "of(\"auto_seat_position\",\n      \"auto_climate_on\")");
        this.f21523a = a11;
        d11 = x0.d();
        com.squareup.moshi.f<SeatPosition> f11 = moshi.f(SeatPosition.class, d11, "autoSeatPosition");
        s.f(f11, "moshi.adapter(SeatPositi…et(), \"autoSeatPosition\")");
        this.f21524b = f11;
        Class cls = Boolean.TYPE;
        d12 = x0.d();
        com.squareup.moshi.f<Boolean> f12 = moshi.f(cls, d12, "autoClimateOn");
        s.f(f12, "moshi.adapter(Boolean::c…),\n      \"autoClimateOn\")");
        this.f21525c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public AutoSeatClimateBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        SeatPosition seatPosition = null;
        Boolean bool = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21523a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                seatPosition = this.f21524b.b(reader);
                if (seatPosition == null) {
                    JsonDataException v11 = kr.b.v("autoSeatPosition", "auto_seat_position", reader);
                    s.f(v11, "unexpectedNull(\"autoSeat…o_seat_position\", reader)");
                    throw v11;
                }
            } else if (G0 == 1 && (bool = this.f21525c.b(reader)) == null) {
                JsonDataException v12 = kr.b.v("autoClimateOn", "auto_climate_on", reader);
                s.f(v12, "unexpectedNull(\"autoClim…auto_climate_on\", reader)");
                throw v12;
            }
        }
        reader.l();
        if (seatPosition == null) {
            JsonDataException m11 = kr.b.m("autoSeatPosition", "auto_seat_position", reader);
            s.f(m11, "missingProperty(\"autoSea…o_seat_position\", reader)");
            throw m11;
        } else if (bool != null) {
            return new AutoSeatClimateBody(seatPosition, bool.booleanValue());
        } else {
            JsonDataException m12 = kr.b.m("autoClimateOn", "auto_climate_on", reader);
            s.f(m12, "missingProperty(\"autoCli…auto_climate_on\", reader)");
            throw m12;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, AutoSeatClimateBody autoSeatClimateBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(autoSeatClimateBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("auto_seat_position");
        this.f21524b.j(writer, autoSeatClimateBody.b());
        writer.L("auto_climate_on");
        this.f21525c.j(writer, Boolean.valueOf(autoSeatClimateBody.a()));
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("AutoSeatClimateBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}