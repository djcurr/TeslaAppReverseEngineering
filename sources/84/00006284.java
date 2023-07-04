package com.withpersona.sdk.inquiry.database.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.withpersona.sdk.inquiry.database.network.SubmitDatabaseVerificationRequest;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/database/network/SubmitDatabaseVerificationRequest_DataJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/database/network/SubmitDatabaseVerificationRequest$Data;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "database_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SubmitDatabaseVerificationRequest_DataJsonAdapter extends f<SubmitDatabaseVerificationRequest.Data> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22326a;

    public SubmitDatabaseVerificationRequest_DataJsonAdapter(p moshi) {
        s.g(moshi, "moshi");
        h.b a11 = h.b.a(new String[0]);
        s.f(a11, "of()");
        this.f22326a = a11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public SubmitDatabaseVerificationRequest.Data b(h reader) {
        s.g(reader, "reader");
        reader.g();
        while (reader.p()) {
            if (reader.G0(this.f22326a) == -1) {
                reader.Q0();
                reader.R0();
            }
        }
        reader.l();
        return new SubmitDatabaseVerificationRequest.Data();
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, SubmitDatabaseVerificationRequest.Data data) {
        s.g(writer, "writer");
        Objects.requireNonNull(data, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SubmitDatabaseVerificationRequest.Data");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}