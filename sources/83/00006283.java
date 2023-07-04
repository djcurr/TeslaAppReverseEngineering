package com.withpersona.sdk.inquiry.database.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.withpersona.sdk.inquiry.database.network.SubmitDatabaseVerificationRequest;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kr.b;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/database/network/SubmitDatabaseVerificationRequestJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/database/network/SubmitDatabaseVerificationRequest;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "database_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SubmitDatabaseVerificationRequestJsonAdapter extends f<SubmitDatabaseVerificationRequest> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22323a;

    /* renamed from: b  reason: collision with root package name */
    private final f<SubmitDatabaseVerificationRequest.Data> f22324b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Constructor<SubmitDatabaseVerificationRequest> f22325c;

    public SubmitDatabaseVerificationRequestJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a(MessageExtension.FIELD_DATA);
        s.f(a11, "of(\"data\")");
        this.f22323a = a11;
        d11 = x0.d();
        f<SubmitDatabaseVerificationRequest.Data> f11 = moshi.f(SubmitDatabaseVerificationRequest.Data.class, d11, MessageExtension.FIELD_DATA);
        s.f(f11, "moshi.adapter(SubmitData…java, emptySet(), \"data\")");
        this.f22324b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public SubmitDatabaseVerificationRequest b(h reader) {
        s.g(reader, "reader");
        reader.g();
        int i11 = -1;
        SubmitDatabaseVerificationRequest.Data data = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22323a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                data = this.f22324b.b(reader);
                if (data == null) {
                    JsonDataException v11 = b.v("data_", MessageExtension.FIELD_DATA, reader);
                    s.f(v11, "unexpectedNull(\"data_\", \"data\", reader)");
                    throw v11;
                }
                i11 &= -2;
            } else {
                continue;
            }
        }
        reader.l();
        if (i11 == -2) {
            Objects.requireNonNull(data, "null cannot be cast to non-null type com.withpersona.sdk.inquiry.database.network.SubmitDatabaseVerificationRequest.Data");
            return new SubmitDatabaseVerificationRequest(data);
        }
        Constructor<SubmitDatabaseVerificationRequest> constructor = this.f22325c;
        if (constructor == null) {
            constructor = SubmitDatabaseVerificationRequest.class.getDeclaredConstructor(SubmitDatabaseVerificationRequest.Data.class, Integer.TYPE, b.f35691c);
            this.f22325c = constructor;
            s.f(constructor, "SubmitDatabaseVerificati…his.constructorRef = it }");
        }
        SubmitDatabaseVerificationRequest newInstance = constructor.newInstance(data, Integer.valueOf(i11), null);
        s.f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, SubmitDatabaseVerificationRequest submitDatabaseVerificationRequest) {
        s.g(writer, "writer");
        Objects.requireNonNull(submitDatabaseVerificationRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L(MessageExtension.FIELD_DATA);
        this.f22324b.j(writer, submitDatabaseVerificationRequest.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SubmitDatabaseVerificationRequest");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}