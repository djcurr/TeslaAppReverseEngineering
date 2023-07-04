package com.tesla.domain.model;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/domain/model/DriveStateJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/domain/model/DriveState;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "domain_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class DriveStateJsonAdapter extends f<DriveState> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21818a;

    /* renamed from: b  reason: collision with root package name */
    private final f<Double> f21819b;

    /* renamed from: c  reason: collision with root package name */
    private final f<Integer> f21820c;

    /* renamed from: d  reason: collision with root package name */
    private final f<String> f21821d;

    public DriveStateJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        Set<? extends Annotation> d13;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("corrected_latitude", "corrected_longitude", "latitude", "longitude", "native_latitude", "native_longitude", "native_location_supported", "native_type", "shift_state");
        s.f(a11, "of(\"corrected_latitude\",…ive_type\", \"shift_state\")");
        this.f21818a = a11;
        d11 = x0.d();
        f<Double> f11 = moshi.f(Double.class, d11, "correctedLatitude");
        s.f(f11, "moshi.adapter(Double::cl…t(), \"correctedLatitude\")");
        this.f21819b = f11;
        d12 = x0.d();
        f<Integer> f12 = moshi.f(Integer.class, d12, "nativeLocationSupported");
        s.f(f12, "moshi.adapter(Int::class…nativeLocationSupported\")");
        this.f21820c = f12;
        d13 = x0.d();
        f<String> f13 = moshi.f(String.class, d13, "nativeType");
        s.f(f13, "moshi.adapter(String::cl…emptySet(), \"nativeType\")");
        this.f21821d = f13;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public DriveState b(h reader) {
        s.g(reader, "reader");
        reader.g();
        Double d11 = null;
        Double d12 = null;
        Double d13 = null;
        Double d14 = null;
        Double d15 = null;
        Double d16 = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        while (reader.p()) {
            switch (reader.G0(this.f21818a)) {
                case -1:
                    reader.Q0();
                    reader.R0();
                    break;
                case 0:
                    d11 = this.f21819b.b(reader);
                    break;
                case 1:
                    d12 = this.f21819b.b(reader);
                    break;
                case 2:
                    d13 = this.f21819b.b(reader);
                    break;
                case 3:
                    d14 = this.f21819b.b(reader);
                    break;
                case 4:
                    d15 = this.f21819b.b(reader);
                    break;
                case 5:
                    d16 = this.f21819b.b(reader);
                    break;
                case 6:
                    num = this.f21820c.b(reader);
                    break;
                case 7:
                    str = this.f21821d.b(reader);
                    break;
                case 8:
                    str2 = this.f21821d.b(reader);
                    break;
            }
        }
        reader.l();
        return new DriveState(d11, d12, d13, d14, d15, d16, num, str, str2);
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, DriveState driveState) {
        s.g(writer, "writer");
        Objects.requireNonNull(driveState, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("corrected_latitude");
        this.f21819b.j(writer, driveState.getCorrectedLatitude());
        writer.L("corrected_longitude");
        this.f21819b.j(writer, driveState.getCorrectedLongitude());
        writer.L("latitude");
        this.f21819b.j(writer, driveState.getLatitude());
        writer.L("longitude");
        this.f21819b.j(writer, driveState.getLongitude());
        writer.L("native_latitude");
        this.f21819b.j(writer, driveState.getNativeLatitude());
        writer.L("native_longitude");
        this.f21819b.j(writer, driveState.getNativeLongitude());
        writer.L("native_location_supported");
        this.f21820c.j(writer, driveState.getNativeLocationSupported());
        writer.L("native_type");
        this.f21821d.j(writer, driveState.getNativeType());
        writer.L("shift_state");
        this.f21821d.j(writer, driveState.getShiftState());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("DriveState");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}