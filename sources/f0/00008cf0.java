package nt;

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
import okio.i;
import wz.e0;

/* loaded from: classes6.dex */
public final class c extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<c> f41868b;
    @q(adapter = "com.tesla.generated.centerdisplay.server.StatusCode#ADAPTER", jsonName = "statusCode", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final d f41869a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, n00.d<c> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/center_display.Response", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public c decode(k reader) {
            s.g(reader, "reader");
            d dVar = d.STATUS_CODE_UNSPECIFIED;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new c(dVar, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        dVar = d.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, c value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.c() != d.STATUS_CODE_UNSPECIFIED) {
                d.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(c value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.c() != d.STATUS_CODE_UNSPECIFIED ? z11 + d.ADAPTER.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public c redact(c value) {
            s.g(value, "value");
            return c.b(value, null, i.f42656d, 1, null);
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
        f41868b = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(c.class), o.PROTO_3);
    }

    public c() {
        this(null, null, 3, null);
    }

    public /* synthetic */ c(d dVar, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? d.STATUS_CODE_UNSPECIFIED : dVar, (i11 & 2) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ c b(c cVar, d dVar, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = cVar.f41869a;
        }
        if ((i11 & 2) != 0) {
            iVar = cVar.unknownFields();
        }
        return cVar.a(dVar, iVar);
    }

    public final c a(d status_code, i unknownFields) {
        s.g(status_code, "status_code");
        s.g(unknownFields, "unknownFields");
        return new c(status_code, unknownFields);
    }

    public final d c() {
        return this.f41869a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return s.c(unknownFields(), cVar.unknownFields()) && this.f41869a == cVar.f41869a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f41869a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m815newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        d dVar = this.f41869a;
        arrayList.add("status_code=" + dVar);
        l02 = e0.l0(arrayList, ", ", "Response{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m815newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d status_code, i unknownFields) {
        super(f41868b, unknownFields);
        s.g(status_code, "status_code");
        s.g(unknownFields, "unknownFields");
        this.f41869a = status_code;
    }
}