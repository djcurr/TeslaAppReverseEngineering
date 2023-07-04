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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/SetCopTempBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/SetCopTempBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SetCopTempBodyJsonAdapter extends com.squareup.moshi.f<SetCopTempBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21657a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<Integer> f21658b;

    public SetCopTempBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("cop_temp");
        s.f(a11, "of(\"cop_temp\")");
        this.f21657a = a11;
        Class cls = Integer.TYPE;
        d11 = x0.d();
        com.squareup.moshi.f<Integer> f11 = moshi.f(cls, d11, "copTemp");
        s.f(f11, "moshi.adapter(Int::class…a, emptySet(), \"copTemp\")");
        this.f21658b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public SetCopTempBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        Integer num = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21657a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0 && (num = this.f21658b.b(reader)) == null) {
                JsonDataException v11 = kr.b.v("copTemp", "cop_temp", reader);
                s.f(v11, "unexpectedNull(\"copTemp\"…      \"cop_temp\", reader)");
                throw v11;
            }
        }
        reader.l();
        if (num != null) {
            return new SetCopTempBody(num.intValue());
        }
        JsonDataException m11 = kr.b.m("copTemp", "cop_temp", reader);
        s.f(m11, "missingProperty(\"copTemp\", \"cop_temp\", reader)");
        throw m11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, SetCopTempBody setCopTempBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(setCopTempBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("cop_temp");
        this.f21658b.j(writer, Integer.valueOf(setCopTempBody.a()));
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SetCopTempBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}