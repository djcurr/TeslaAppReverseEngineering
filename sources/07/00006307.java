package com.withpersona.sdk.inquiry.governmentid.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.withpersona.sdk.inquiry.governmentid.network.CreateVerificationRequest;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/governmentid/network/CreateVerificationRequestJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/governmentid/network/CreateVerificationRequest;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "government-id_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CreateVerificationRequestJsonAdapter extends f<CreateVerificationRequest> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22522a;

    /* renamed from: b  reason: collision with root package name */
    private final f<CreateVerificationRequest.Data> f22523b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Constructor<CreateVerificationRequest> f22524c;

    public CreateVerificationRequestJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a(MessageExtension.FIELD_DATA);
        s.f(a11, "of(\"data\")");
        this.f22522a = a11;
        d11 = x0.d();
        f<CreateVerificationRequest.Data> f11 = moshi.f(CreateVerificationRequest.Data.class, d11, MessageExtension.FIELD_DATA);
        s.f(f11, "moshi.adapter(CreateVeri…java, emptySet(), \"data\")");
        this.f22523b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public CreateVerificationRequest b(h reader) {
        s.g(reader, "reader");
        reader.g();
        int i11 = -1;
        CreateVerificationRequest.Data data = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22522a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                data = this.f22523b.b(reader);
                if (data == null) {
                    JsonDataException v11 = kr.b.v("data_", MessageExtension.FIELD_DATA, reader);
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
            Objects.requireNonNull(data, "null cannot be cast to non-null type com.withpersona.sdk.inquiry.governmentid.network.CreateVerificationRequest.Data");
            return new CreateVerificationRequest(data);
        }
        Constructor<CreateVerificationRequest> constructor = this.f22524c;
        if (constructor == null) {
            constructor = CreateVerificationRequest.class.getDeclaredConstructor(CreateVerificationRequest.Data.class, Integer.TYPE, kr.b.f35691c);
            this.f22524c = constructor;
            s.f(constructor, "CreateVerificationReques…his.constructorRef = it }");
        }
        CreateVerificationRequest newInstance = constructor.newInstance(data, Integer.valueOf(i11), null);
        s.f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, CreateVerificationRequest createVerificationRequest) {
        s.g(writer, "writer");
        Objects.requireNonNull(createVerificationRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L(MessageExtension.FIELD_DATA);
        this.f22523b.j(writer, createVerificationRequest.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CreateVerificationRequest");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}