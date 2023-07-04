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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/SeatCoolingBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/SeatCoolingBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SeatCoolingBodyJsonAdapter extends com.squareup.moshi.f<SeatCoolingBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21642a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<SeatPosition> f21643b;

    /* renamed from: c  reason: collision with root package name */
    private final com.squareup.moshi.f<CoolingLevel> f21644c;

    public SeatCoolingBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("seat_position", "seat_cooler_level");
        s.f(a11, "of(\"seat_position\",\n      \"seat_cooler_level\")");
        this.f21642a = a11;
        d11 = x0.d();
        com.squareup.moshi.f<SeatPosition> f11 = moshi.f(SeatPosition.class, d11, "seatPosition");
        s.f(f11, "moshi.adapter(SeatPositi…ptySet(), \"seatPosition\")");
        this.f21643b = f11;
        d12 = x0.d();
        com.squareup.moshi.f<CoolingLevel> f12 = moshi.f(CoolingLevel.class, d12, "seatCoolerLevel");
        s.f(f12, "moshi.adapter(CoolingLev…Set(), \"seatCoolerLevel\")");
        this.f21644c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public SeatCoolingBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        SeatPosition seatPosition = null;
        CoolingLevel coolingLevel = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21642a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                seatPosition = this.f21643b.b(reader);
                if (seatPosition == null) {
                    JsonDataException v11 = kr.b.v("seatPosition", "seat_position", reader);
                    s.f(v11, "unexpectedNull(\"seatPosi… \"seat_position\", reader)");
                    throw v11;
                }
            } else if (G0 == 1 && (coolingLevel = this.f21644c.b(reader)) == null) {
                JsonDataException v12 = kr.b.v("seatCoolerLevel", "seat_cooler_level", reader);
                s.f(v12, "unexpectedNull(\"seatCool…at_cooler_level\", reader)");
                throw v12;
            }
        }
        reader.l();
        if (seatPosition == null) {
            JsonDataException m11 = kr.b.m("seatPosition", "seat_position", reader);
            s.f(m11, "missingProperty(\"seatPos…ion\",\n            reader)");
            throw m11;
        } else if (coolingLevel != null) {
            return new SeatCoolingBody(seatPosition, coolingLevel);
        } else {
            JsonDataException m12 = kr.b.m("seatCoolerLevel", "seat_cooler_level", reader);
            s.f(m12, "missingProperty(\"seatCoo…at_cooler_level\", reader)");
            throw m12;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, SeatCoolingBody seatCoolingBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(seatCoolingBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("seat_position");
        this.f21643b.j(writer, seatCoolingBody.b());
        writer.L("seat_cooler_level");
        this.f21644c.j(writer, seatCoolingBody.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SeatCoolingBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}