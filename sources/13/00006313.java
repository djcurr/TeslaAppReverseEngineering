package com.withpersona.sdk.inquiry.governmentid.network;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.squareup.moshi.r;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/governmentid/network/IdJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/governmentid/network/Id;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "government-id_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class IdJsonAdapter extends f<Id> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22542a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f22543b;

    /* renamed from: c  reason: collision with root package name */
    private final f<List<String>> f22544c;

    public IdJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a(Action.CLASS_ATTRIBUTE, "requiresSides");
        s.f(a11, "of(\"class\", \"requiresSides\")");
        this.f22542a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, Action.CLASS_ATTRIBUTE);
        s.f(f11, "moshi.adapter(String::cl…mptySet(),\n      \"class\")");
        this.f22543b = f11;
        ParameterizedType k11 = r.k(List.class, String.class);
        d12 = x0.d();
        f<List<String>> f12 = moshi.f(k11, d12, "requiresSides");
        s.f(f12, "moshi.adapter(Types.newP…),\n      \"requiresSides\")");
        this.f22544c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public Id b(h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        List<String> list = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22542a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f22543b.b(reader);
                if (str == null) {
                    JsonDataException v11 = kr.b.v("class_", Action.CLASS_ATTRIBUTE, reader);
                    s.f(v11, "unexpectedNull(\"class_\",…ass\",\n            reader)");
                    throw v11;
                }
            } else if (G0 == 1 && (list = this.f22544c.b(reader)) == null) {
                JsonDataException v12 = kr.b.v("requiresSides", "requiresSides", reader);
                s.f(v12, "unexpectedNull(\"requires… \"requiresSides\", reader)");
                throw v12;
            }
        }
        reader.l();
        if (str == null) {
            JsonDataException m11 = kr.b.m("class_", Action.CLASS_ATTRIBUTE, reader);
            s.f(m11, "missingProperty(\"class_\", \"class\", reader)");
            throw m11;
        } else if (list != null) {
            return new Id(str, list);
        } else {
            JsonDataException m12 = kr.b.m("requiresSides", "requiresSides", reader);
            s.f(m12, "missingProperty(\"require… \"requiresSides\", reader)");
            throw m12;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, Id id2) {
        s.g(writer, "writer");
        Objects.requireNonNull(id2, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L(Action.CLASS_ATTRIBUTE);
        this.f22543b.j(writer, id2.a());
        writer.L("requiresSides");
        this.f22544c.j(writer, id2.b());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Id");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}