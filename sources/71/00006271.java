package com.withpersona.sdk.inquiry.database.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.withpersona.sdk.inquiry.database.network.CreateDatabaseVerificationRequest;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kr.b;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/database/network/CreateDatabaseVerificationRequest_DataJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/database/network/CreateDatabaseVerificationRequest$Data;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "database_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CreateDatabaseVerificationRequest_DataJsonAdapter extends f<CreateDatabaseVerificationRequest.Data> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22300a;

    /* renamed from: b  reason: collision with root package name */
    private final f<CreateDatabaseVerificationRequest.Attributes> f22301b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Constructor<CreateDatabaseVerificationRequest.Data> f22302c;

    public CreateDatabaseVerificationRequest_DataJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("attributes");
        s.f(a11, "of(\"attributes\")");
        this.f22300a = a11;
        d11 = x0.d();
        f<CreateDatabaseVerificationRequest.Attributes> f11 = moshi.f(CreateDatabaseVerificationRequest.Attributes.class, d11, "attributes");
        s.f(f11, "moshi.adapter(CreateData…et(),\n      \"attributes\")");
        this.f22301b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public CreateDatabaseVerificationRequest.Data b(h reader) {
        s.g(reader, "reader");
        reader.g();
        int i11 = -1;
        CreateDatabaseVerificationRequest.Attributes attributes = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22300a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                attributes = this.f22301b.b(reader);
                if (attributes == null) {
                    JsonDataException v11 = b.v("attributes", "attributes", reader);
                    s.f(v11, "unexpectedNull(\"attribut…    \"attributes\", reader)");
                    throw v11;
                }
                i11 &= -2;
            } else {
                continue;
            }
        }
        reader.l();
        if (i11 == -2) {
            Objects.requireNonNull(attributes, "null cannot be cast to non-null type com.withpersona.sdk.inquiry.database.network.CreateDatabaseVerificationRequest.Attributes");
            return new CreateDatabaseVerificationRequest.Data(attributes);
        }
        Constructor<CreateDatabaseVerificationRequest.Data> constructor = this.f22302c;
        if (constructor == null) {
            constructor = CreateDatabaseVerificationRequest.Data.class.getDeclaredConstructor(CreateDatabaseVerificationRequest.Attributes.class, Integer.TYPE, b.f35691c);
            this.f22302c = constructor;
            s.f(constructor, "CreateDatabaseVerificati…his.constructorRef = it }");
        }
        CreateDatabaseVerificationRequest.Data newInstance = constructor.newInstance(attributes, Integer.valueOf(i11), null);
        s.f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, CreateDatabaseVerificationRequest.Data data) {
        s.g(writer, "writer");
        Objects.requireNonNull(data, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("attributes");
        this.f22301b.j(writer, data.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CreateDatabaseVerificationRequest.Data");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}