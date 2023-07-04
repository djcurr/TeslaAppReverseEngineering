package zt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import wz.e0;

/* loaded from: classes6.dex */
public final class f extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<f> f60733d;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f60734a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final okio.i f60735b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final okio.i f60736c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<f> {
        a(com.squareup.wire.b bVar, n00.d<f> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.RemoteData", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public f decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            String str = "";
            okio.i iVar2 = iVar;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new f(str, iVar, iVar2, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 == 2) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    iVar2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, f value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!s.c(value.e(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.e());
            }
            okio.i c11 = value.c();
            okio.i iVar = okio.i.f42656d;
            if (!s.c(c11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.c());
            }
            if (!s.c(value.d(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(f value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!s.c(value.e(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.e());
            }
            okio.i c11 = value.c();
            okio.i iVar = okio.i.f42656d;
            if (!s.c(c11, iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.c());
            }
            return !s.c(value.d(), iVar) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(3, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public f redact(f value) {
            s.g(value, "value");
            return f.b(value, null, null, null, okio.i.f42656d, 7, null);
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
        f60733d = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(f.class), o.PROTO_3);
    }

    public f() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ f(String str, okio.i iVar, okio.i iVar2, okio.i iVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? okio.i.f42656d : iVar, (i11 & 4) != 0 ? okio.i.f42656d : iVar2, (i11 & 8) != 0 ? okio.i.f42656d : iVar3);
    }

    public static /* synthetic */ f b(f fVar, String str, okio.i iVar, okio.i iVar2, okio.i iVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fVar.f60734a;
        }
        if ((i11 & 2) != 0) {
            iVar = fVar.f60735b;
        }
        if ((i11 & 4) != 0) {
            iVar2 = fVar.f60736c;
        }
        if ((i11 & 8) != 0) {
            iVar3 = fVar.unknownFields();
        }
        return fVar.a(str, iVar, iVar2, iVar3);
    }

    public final f a(String url, okio.i ETag, okio.i sha, okio.i unknownFields) {
        s.g(url, "url");
        s.g(ETag, "ETag");
        s.g(sha, "sha");
        s.g(unknownFields, "unknownFields");
        return new f(url, ETag, sha, unknownFields);
    }

    public final okio.i c() {
        return this.f60735b;
    }

    public final okio.i d() {
        return this.f60736c;
    }

    public final String e() {
        return this.f60734a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return s.c(unknownFields(), fVar.unknownFields()) && s.c(this.f60734a, fVar.f60734a) && s.c(this.f60735b, fVar.f60735b) && s.c(this.f60736c, fVar.f60736c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + this.f60734a.hashCode()) * 37) + this.f60735b.hashCode()) * 37) + this.f60736c.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1144newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f60734a);
        arrayList.add("url=" + i11);
        okio.i iVar = this.f60735b;
        arrayList.add("ETag=" + iVar);
        okio.i iVar2 = this.f60736c;
        arrayList.add("sha=" + iVar2);
        l02 = e0.l0(arrayList, ", ", "RemoteData{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1144newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String url, okio.i ETag, okio.i sha, okio.i unknownFields) {
        super(f60733d, unknownFields);
        s.g(url, "url");
        s.g(ETag, "ETag");
        s.g(sha, "sha");
        s.g(unknownFields, "unknownFields");
        this.f60734a = url;
        this.f60735b = ETag;
        this.f60736c = sha;
    }
}