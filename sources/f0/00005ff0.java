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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/RemoteSeatHeaterBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/RemoteSeatHeaterBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class RemoteSeatHeaterBodyJsonAdapter extends com.squareup.moshi.f<RemoteSeatHeaterBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21631a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<SeatHeater> f21632b;

    /* renamed from: c  reason: collision with root package name */
    private final com.squareup.moshi.f<SeatHeaterLevel> f21633c;

    public RemoteSeatHeaterBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("heater", "level");
        s.f(a11, "of(\"heater\", \"level\")");
        this.f21631a = a11;
        d11 = x0.d();
        com.squareup.moshi.f<SeatHeater> f11 = moshi.f(SeatHeater.class, d11, "heater");
        s.f(f11, "moshi.adapter(SeatHeater…    emptySet(), \"heater\")");
        this.f21632b = f11;
        d12 = x0.d();
        com.squareup.moshi.f<SeatHeaterLevel> f12 = moshi.f(SeatHeaterLevel.class, d12, "level");
        s.f(f12, "moshi.adapter(SeatHeater…ava, emptySet(), \"level\")");
        this.f21633c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public RemoteSeatHeaterBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        SeatHeater seatHeater = null;
        SeatHeaterLevel seatHeaterLevel = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21631a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                seatHeater = this.f21632b.b(reader);
                if (seatHeater == null) {
                    JsonDataException v11 = kr.b.v("heater", "heater", reader);
                    s.f(v11, "unexpectedNull(\"heater\",…        \"heater\", reader)");
                    throw v11;
                }
            } else if (G0 == 1 && (seatHeaterLevel = this.f21633c.b(reader)) == null) {
                JsonDataException v12 = kr.b.v("level", "level", reader);
                s.f(v12, "unexpectedNull(\"level\",\n…         \"level\", reader)");
                throw v12;
            }
        }
        reader.l();
        if (seatHeater == null) {
            JsonDataException m11 = kr.b.m("heater", "heater", reader);
            s.f(m11, "missingProperty(\"heater\", \"heater\", reader)");
            throw m11;
        } else if (seatHeaterLevel != null) {
            return new RemoteSeatHeaterBody(seatHeater, seatHeaterLevel);
        } else {
            JsonDataException m12 = kr.b.m("level", "level", reader);
            s.f(m12, "missingProperty(\"level\", \"level\", reader)");
            throw m12;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, RemoteSeatHeaterBody remoteSeatHeaterBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(remoteSeatHeaterBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("heater");
        this.f21632b.j(writer, remoteSeatHeaterBody.a());
        writer.L("level");
        this.f21633c.j(writer, remoteSeatHeaterBody.b());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("RemoteSeatHeaterBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}