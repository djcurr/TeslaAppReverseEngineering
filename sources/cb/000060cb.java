package com.tesla.messagebuilder.util;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagebuilder/util/VehicleSessionInfoDataBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/messagebuilder/util/VehicleSessionInfoDataBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "messagebuilder_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class VehicleSessionInfoDataBodyJsonAdapter extends f<VehicleSessionInfoDataBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21889a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f21890b;

    /* renamed from: c  reason: collision with root package name */
    private final f<Integer> f21891c;

    public VehicleSessionInfoDataBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("epoch", "public_key", "clock_time", "counter");
        s.f(a11, "of(\"epoch\", \"public_key\"… \"clock_time\", \"counter\")");
        this.f21889a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, "epoch");
        s.f(f11, "moshi.adapter(String::cl…     emptySet(), \"epoch\")");
        this.f21890b = f11;
        d12 = x0.d();
        f<Integer> f12 = moshi.f(Integer.class, d12, "clockTime");
        s.f(f12, "moshi.adapter(Int::class… emptySet(), \"clockTime\")");
        this.f21891c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public VehicleSessionInfoDataBody b(h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21889a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f21890b.b(reader);
            } else if (G0 == 1) {
                str2 = this.f21890b.b(reader);
            } else if (G0 == 2) {
                num = this.f21891c.b(reader);
            } else if (G0 == 3) {
                num2 = this.f21891c.b(reader);
            }
        }
        reader.l();
        return new VehicleSessionInfoDataBody(str, str2, num, num2);
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, VehicleSessionInfoDataBody vehicleSessionInfoDataBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(vehicleSessionInfoDataBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("epoch");
        this.f21890b.j(writer, vehicleSessionInfoDataBody.getEpoch());
        writer.L("public_key");
        this.f21890b.j(writer, vehicleSessionInfoDataBody.getPublicKey());
        writer.L("clock_time");
        this.f21891c.j(writer, vehicleSessionInfoDataBody.getClockTime());
        writer.L("counter");
        this.f21891c.j(writer, vehicleSessionInfoDataBody.getCounter());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("VehicleSessionInfoDataBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}