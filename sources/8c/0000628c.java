package com.withpersona.sdk.inquiry.document;

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
import kr.b;
import org.spongycastle.i18n.MessageBundle;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/document/DocumentDescriptionJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/document/DocumentDescription;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "document_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class DocumentDescriptionJsonAdapter extends f<DocumentDescription> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22338a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f22339b;

    public DocumentDescriptionJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("kind", MessageBundle.TITLE_ENTRY, "prompt", "description");
        s.f(a11, "of(\"kind\", \"title\", \"prompt\",\n      \"description\")");
        this.f22338a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, "kind");
        s.f(f11, "moshi.adapter(String::cl…emptySet(),\n      \"kind\")");
        this.f22339b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public DocumentDescription b(h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22338a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f22339b.b(reader);
                if (str == null) {
                    JsonDataException v11 = b.v("kind", "kind", reader);
                    s.f(v11, "unexpectedNull(\"kind\", \"kind\",\n            reader)");
                    throw v11;
                }
            } else if (G0 == 1) {
                str2 = this.f22339b.b(reader);
                if (str2 == null) {
                    JsonDataException v12 = b.v(MessageBundle.TITLE_ENTRY, MessageBundle.TITLE_ENTRY, reader);
                    s.f(v12, "unexpectedNull(\"title\", …tle\",\n            reader)");
                    throw v12;
                }
            } else if (G0 == 2) {
                str3 = this.f22339b.b(reader);
                if (str3 == null) {
                    JsonDataException v13 = b.v("prompt", "prompt", reader);
                    s.f(v13, "unexpectedNull(\"prompt\",…        \"prompt\", reader)");
                    throw v13;
                }
            } else if (G0 == 3 && (str4 = this.f22339b.b(reader)) == null) {
                JsonDataException v14 = b.v("description", "description", reader);
                s.f(v14, "unexpectedNull(\"descript…\", \"description\", reader)");
                throw v14;
            }
        }
        reader.l();
        if (str == null) {
            JsonDataException m11 = b.m("kind", "kind", reader);
            s.f(m11, "missingProperty(\"kind\", \"kind\", reader)");
            throw m11;
        } else if (str2 == null) {
            JsonDataException m12 = b.m(MessageBundle.TITLE_ENTRY, MessageBundle.TITLE_ENTRY, reader);
            s.f(m12, "missingProperty(\"title\", \"title\", reader)");
            throw m12;
        } else if (str3 == null) {
            JsonDataException m13 = b.m("prompt", "prompt", reader);
            s.f(m13, "missingProperty(\"prompt\", \"prompt\", reader)");
            throw m13;
        } else if (str4 != null) {
            return new DocumentDescription(str, str2, str3, str4);
        } else {
            JsonDataException m14 = b.m("description", "description", reader);
            s.f(m14, "missingProperty(\"descrip…ion\",\n            reader)");
            throw m14;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, DocumentDescription documentDescription) {
        s.g(writer, "writer");
        Objects.requireNonNull(documentDescription, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("kind");
        this.f22339b.j(writer, documentDescription.a());
        writer.L(MessageBundle.TITLE_ENTRY);
        this.f22339b.j(writer, documentDescription.c());
        writer.L("prompt");
        this.f22339b.j(writer, documentDescription.b());
        writer.L("description");
        this.f22339b.j(writer, documentDescription.getDescription());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("DocumentDescription");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}