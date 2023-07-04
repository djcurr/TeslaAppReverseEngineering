package com.withpersona.sdk.inquiry.governmentid;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/governmentid/RawExtractionJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/governmentid/RawExtraction;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "government-id_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class RawExtractionJsonAdapter extends f<RawExtraction> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22398a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f22399b;

    public RawExtractionJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("type", "value");
        s.f(a11, "of(\"type\", \"value\")");
        this.f22398a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, "type");
        s.f(f11, "moshi.adapter(String::cl…emptySet(),\n      \"type\")");
        this.f22399b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public RawExtraction b(h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        String str2 = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22398a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f22399b.b(reader);
                if (str == null) {
                    JsonDataException v11 = kr.b.v("type", "type", reader);
                    s.f(v11, "unexpectedNull(\"type\", \"type\",\n            reader)");
                    throw v11;
                }
            } else if (G0 == 1 && (str2 = this.f22399b.b(reader)) == null) {
                JsonDataException v12 = kr.b.v("value__", "value", reader);
                s.f(v12, "unexpectedNull(\"value__\"…         \"value\", reader)");
                throw v12;
            }
        }
        reader.l();
        if (str == null) {
            JsonDataException m11 = kr.b.m("type", "type", reader);
            s.f(m11, "missingProperty(\"type\", \"type\", reader)");
            throw m11;
        } else if (str2 != null) {
            return new RawExtraction(str, str2);
        } else {
            JsonDataException m12 = kr.b.m("value__", "value", reader);
            s.f(m12, "missingProperty(\"value__\", \"value\", reader)");
            throw m12;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, RawExtraction rawExtraction) {
        s.g(writer, "writer");
        Objects.requireNonNull(rawExtraction, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("type");
        this.f22399b.j(writer, rawExtraction.a());
        writer.L("value");
        this.f22399b.j(writer, rawExtraction.b());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("RawExtraction");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}