package wt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import n00.d;
import okio.i;
import wz.e0;

/* loaded from: classes6.dex */
public final class c extends f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<c> f56177d;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "reportId", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f56178a;
    @q(adapter = "com.tesla.generated.reportservice.LogUploadRequestPayload#ADAPTER", jsonName = "logUploadPayload", tag = 101)

    /* renamed from: b  reason: collision with root package name */
    private final wt.b f56179b;
    @q(adapter = "com.tesla.generated.reportservice.FileUploadRequestPayload#ADAPTER", jsonName = "fileUploadPayload", tag = 102)

    /* renamed from: c  reason: collision with root package name */
    private final wt.a f56180c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, d<c> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/ReportRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public c decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            wt.b bVar = null;
            String str = "";
            wt.a aVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new c(str, bVar, aVar, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 == 101) {
                    bVar = wt.b.f56176a.decode(reader);
                } else if (g11 != 102) {
                    reader.m(g11);
                } else {
                    aVar = wt.a.f56174b.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, c value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!s.c(value.e(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.e());
            }
            wt.b.f56176a.encodeWithTag(writer, 101, value.d());
            wt.a.f56174b.encodeWithTag(writer, 102, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(c value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!s.c(value.e(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.e());
            }
            return z11 + wt.b.f56176a.encodedSizeWithTag(101, value.d()) + wt.a.f56174b.encodedSizeWithTag(102, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public c redact(c value) {
            s.g(value, "value");
            wt.b d11 = value.d();
            wt.b redact = d11 == null ? null : wt.b.f56176a.redact(d11);
            wt.a c11 = value.c();
            return c.b(value, null, redact, c11 != null ? wt.a.f56174b.redact(c11) : null, i.f42656d, 1, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new b(null);
        f56177d = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(c.class), o.PROTO_3);
    }

    public c() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ c(String str, wt.b bVar, wt.a aVar, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : bVar, (i11 & 4) != 0 ? null : aVar, (i11 & 8) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ c b(c cVar, String str, wt.b bVar, wt.a aVar, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cVar.f56178a;
        }
        if ((i11 & 2) != 0) {
            bVar = cVar.f56179b;
        }
        if ((i11 & 4) != 0) {
            aVar = cVar.f56180c;
        }
        if ((i11 & 8) != 0) {
            iVar = cVar.unknownFields();
        }
        return cVar.a(str, bVar, aVar, iVar);
    }

    public final c a(String report_id, wt.b bVar, wt.a aVar, i unknownFields) {
        s.g(report_id, "report_id");
        s.g(unknownFields, "unknownFields");
        return new c(report_id, bVar, aVar, unknownFields);
    }

    public final wt.a c() {
        return this.f56180c;
    }

    public final wt.b d() {
        return this.f56179b;
    }

    public final String e() {
        return this.f56178a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return s.c(unknownFields(), cVar.unknownFields()) && s.c(this.f56178a, cVar.f56178a) && s.c(this.f56179b, cVar.f56179b) && s.c(this.f56180c, cVar.f56180c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.f56178a.hashCode()) * 37;
            wt.b bVar = this.f56179b;
            int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 37;
            wt.a aVar = this.f56180c;
            int hashCode3 = hashCode2 + (aVar != null ? aVar.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1124newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f56178a);
        arrayList.add("report_id=" + i11);
        wt.b bVar = this.f56179b;
        if (bVar != null) {
            arrayList.add("log_upload_payload=" + bVar);
        }
        wt.a aVar = this.f56180c;
        if (aVar != null) {
            arrayList.add("file_upload_payload=" + aVar);
        }
        l02 = e0.l0(arrayList, ", ", "ReportRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1124newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String report_id, wt.b bVar, wt.a aVar, i unknownFields) {
        super(f56177d, unknownFields);
        s.g(report_id, "report_id");
        s.g(unknownFields, "unknownFields");
        this.f56178a = report_id;
        this.f56179b = bVar;
        this.f56180c = aVar;
        if (!(mr.d.c(bVar, aVar) <= 1)) {
            throw new IllegalArgumentException("At most one of log_upload_payload, file_upload_payload may be non-null".toString());
        }
    }
}