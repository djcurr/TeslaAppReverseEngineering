package com.withpersona.sdk.inquiry.internal.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.withpersona.sdk.inquiry.internal.network.ContactSupportRequest;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kr.b;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/ContactSupportRequest_MetaJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/internal/network/ContactSupportRequest$Meta;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ContactSupportRequest_MetaJsonAdapter extends f<ContactSupportRequest.Meta> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22645a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f22646b;

    public ContactSupportRequest_MetaJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("name", "emailAddress", "comment");
        s.f(a11, "of(\"name\", \"emailAddress\", \"comment\")");
        this.f22645a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, "name");
        s.f(f11, "moshi.adapter(String::cl…emptySet(),\n      \"name\")");
        this.f22646b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public ContactSupportRequest.Meta b(h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22645a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f22646b.b(reader);
                if (str == null) {
                    JsonDataException v11 = b.v("name", "name", reader);
                    s.f(v11, "unexpectedNull(\"name\", \"name\",\n            reader)");
                    throw v11;
                }
            } else if (G0 == 1) {
                str2 = this.f22646b.b(reader);
                if (str2 == null) {
                    JsonDataException v12 = b.v("emailAddress", "emailAddress", reader);
                    s.f(v12, "unexpectedNull(\"emailAdd…, \"emailAddress\", reader)");
                    throw v12;
                }
            } else if (G0 == 2 && (str3 = this.f22646b.b(reader)) == null) {
                JsonDataException v13 = b.v("comment", "comment", reader);
                s.f(v13, "unexpectedNull(\"comment\"…       \"comment\", reader)");
                throw v13;
            }
        }
        reader.l();
        if (str == null) {
            JsonDataException m11 = b.m("name", "name", reader);
            s.f(m11, "missingProperty(\"name\", \"name\", reader)");
            throw m11;
        } else if (str2 == null) {
            JsonDataException m12 = b.m("emailAddress", "emailAddress", reader);
            s.f(m12, "missingProperty(\"emailAd…ess\",\n            reader)");
            throw m12;
        } else if (str3 != null) {
            return new ContactSupportRequest.Meta(str, str2, str3);
        } else {
            JsonDataException m13 = b.m("comment", "comment", reader);
            s.f(m13, "missingProperty(\"comment\", \"comment\", reader)");
            throw m13;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, ContactSupportRequest.Meta meta) {
        s.g(writer, "writer");
        Objects.requireNonNull(meta, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("name");
        this.f22646b.j(writer, meta.c());
        writer.L("emailAddress");
        this.f22646b.j(writer, meta.b());
        writer.L("comment");
        this.f22646b.j(writer, meta.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ContactSupportRequest.Meta");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}