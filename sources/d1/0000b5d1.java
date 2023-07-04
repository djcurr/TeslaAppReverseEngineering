package tt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import wz.e0;

/* loaded from: classes6.dex */
public final class f extends com.squareup.wire.f {

    /* renamed from: e  reason: collision with root package name */
    public static final ProtoAdapter<f> f52534e;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f52535a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f52536b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final long f52537c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final String f52538d;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<f> {
        a(com.squareup.wire.b bVar, n00.d<f> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/monitoring.HTTPTraceEnd", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public f decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            String str = "";
            int i11 = 0;
            long j11 = 0;
            String str2 = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new f(str, i11, j11, str2, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 == 2) {
                    i11 = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (g11 == 3) {
                    j11 = ProtoAdapter.INT64.decode(reader).longValue();
                } else if (g11 != 4) {
                    reader.m(g11);
                } else {
                    str2 = ProtoAdapter.STRING.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, f value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!s.c(value.f(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.f());
            }
            if (value.c() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(value.c()));
            }
            if (value.e() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 3, Long.valueOf(value.e()));
            }
            if (!s.c(value.d(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 4, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(f value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!s.c(value.f(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.f());
            }
            if (value.c() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.c()));
            }
            if (value.e() != 0) {
                z11 += ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(value.e()));
            }
            return !s.c(value.d(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(4, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public f redact(f value) {
            s.g(value, "value");
            return f.b(value, null, 0, 0L, null, okio.i.f42656d, 15, null);
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
        f52534e = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(f.class), o.PROTO_3);
    }

    public f() {
        this(null, 0, 0L, null, null, 31, null);
    }

    public /* synthetic */ f(String str, int i11, long j11, String str2, okio.i iVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? 0L : j11, (i12 & 8) == 0 ? str2 : "", (i12 & 16) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ f b(f fVar, String str, int i11, long j11, String str2, okio.i iVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = fVar.f52535a;
        }
        if ((i12 & 2) != 0) {
            i11 = fVar.f52536b;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            j11 = fVar.f52537c;
        }
        long j12 = j11;
        if ((i12 & 8) != 0) {
            str2 = fVar.f52538d;
        }
        String str3 = str2;
        if ((i12 & 16) != 0) {
            iVar = fVar.unknownFields();
        }
        return fVar.a(str, i13, j12, str3, iVar);
    }

    public final f a(String url, int i11, long j11, String responseContentType, okio.i unknownFields) {
        s.g(url, "url");
        s.g(responseContentType, "responseContentType");
        s.g(unknownFields, "unknownFields");
        return new f(url, i11, j11, responseContentType, unknownFields);
    }

    public final int c() {
        return this.f52536b;
    }

    public final String d() {
        return this.f52538d;
    }

    public final long e() {
        return this.f52537c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return s.c(unknownFields(), fVar.unknownFields()) && s.c(this.f52535a, fVar.f52535a) && this.f52536b == fVar.f52536b && this.f52537c == fVar.f52537c && s.c(this.f52538d, fVar.f52538d);
        }
        return false;
    }

    public final String f() {
        return this.f52535a;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((unknownFields().hashCode() * 37) + this.f52535a.hashCode()) * 37) + Integer.hashCode(this.f52536b)) * 37) + Long.hashCode(this.f52537c)) * 37) + this.f52538d.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1110newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f52535a);
        arrayList.add("url=" + i11);
        int i12 = this.f52536b;
        arrayList.add("code=" + i12);
        long j11 = this.f52537c;
        arrayList.add("responsePayloadSize=" + j11);
        String i13 = mr.d.i(this.f52538d);
        arrayList.add("responseContentType=" + i13);
        l02 = e0.l0(arrayList, ", ", "HTTPTraceEnd{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1110newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String url, int i11, long j11, String responseContentType, okio.i unknownFields) {
        super(f52534e, unknownFields);
        s.g(url, "url");
        s.g(responseContentType, "responseContentType");
        s.g(unknownFields, "unknownFields");
        this.f52535a = url;
        this.f52536b = i11;
        this.f52537c = j11;
        this.f52538d = responseContentType;
    }
}