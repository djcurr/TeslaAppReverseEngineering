package com.withpersona.sdk.inquiry.governmentid.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.squareup.moshi.r;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.withpersona.sdk.inquiry.governmentid.network.CheckVerificationResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/governmentid/network/CheckVerificationResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/governmentid/network/CheckVerificationResponse;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "government-id_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CheckVerificationResponseJsonAdapter extends f<CheckVerificationResponse> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22510a;

    /* renamed from: b  reason: collision with root package name */
    private final f<CheckVerificationResponse.Data> f22511b;

    /* renamed from: c  reason: collision with root package name */
    private final f<List<CheckVerificationResponse.Data>> f22512c;

    public CheckVerificationResponseJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a(MessageExtension.FIELD_DATA, "included");
        s.f(a11, "of(\"data\", \"included\")");
        this.f22510a = a11;
        d11 = x0.d();
        f<CheckVerificationResponse.Data> f11 = moshi.f(CheckVerificationResponse.Data.class, d11, MessageExtension.FIELD_DATA);
        s.f(f11, "moshi.adapter(CheckVerif…java, emptySet(), \"data\")");
        this.f22511b = f11;
        ParameterizedType k11 = r.k(List.class, CheckVerificationResponse.Data.class);
        d12 = x0.d();
        f<List<CheckVerificationResponse.Data>> f12 = moshi.f(k11, d12, "included");
        s.f(f12, "moshi.adapter(Types.newP…, emptySet(), \"included\")");
        this.f22512c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public CheckVerificationResponse b(h reader) {
        s.g(reader, "reader");
        reader.g();
        CheckVerificationResponse.Data data = null;
        List<CheckVerificationResponse.Data> list = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22510a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                data = this.f22511b.b(reader);
                if (data == null) {
                    JsonDataException v11 = kr.b.v("data_", MessageExtension.FIELD_DATA, reader);
                    s.f(v11, "unexpectedNull(\"data_\", …ata\",\n            reader)");
                    throw v11;
                }
            } else if (G0 == 1 && (list = this.f22512c.b(reader)) == null) {
                JsonDataException v12 = kr.b.v("included", "included", reader);
                s.f(v12, "unexpectedNull(\"included…      \"included\", reader)");
                throw v12;
            }
        }
        reader.l();
        if (data == null) {
            JsonDataException m11 = kr.b.m("data_", MessageExtension.FIELD_DATA, reader);
            s.f(m11, "missingProperty(\"data_\", \"data\", reader)");
            throw m11;
        } else if (list != null) {
            return new CheckVerificationResponse(data, list);
        } else {
            JsonDataException m12 = kr.b.m("included", "included", reader);
            s.f(m12, "missingProperty(\"included\", \"included\", reader)");
            throw m12;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, CheckVerificationResponse checkVerificationResponse) {
        s.g(writer, "writer");
        Objects.requireNonNull(checkVerificationResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L(MessageExtension.FIELD_DATA);
        this.f22511b.j(writer, checkVerificationResponse.a());
        writer.L("included");
        this.f22512c.j(writer, checkVerificationResponse.b());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CheckVerificationResponse");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}