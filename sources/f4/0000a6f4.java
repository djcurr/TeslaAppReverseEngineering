package ot;

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
public final class i extends com.squareup.wire.f {

    /* renamed from: e  reason: collision with root package name */
    public static final ProtoAdapter<i> f44028e;
    @q(adapter = "com.tesla.generated.commandcenter.ProxyCommandAction#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final j f44029a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: b  reason: collision with root package name */
    private final String f44030b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: c  reason: collision with root package name */
    private final int f44031c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: d  reason: collision with root package name */
    private final int f44032d;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<i> {
        a(com.squareup.wire.b bVar, n00.d<i> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.ProxyCommand", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public i decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            j jVar = null;
            String str = "";
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new i(jVar, str, i11, i12, reader.e(d11));
                } else if (g11 == 1) {
                    jVar = j.f44033e.decode(reader);
                } else if (g11 == 3) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 == 4) {
                    i11 = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (g11 != 5) {
                    reader.m(g11);
                } else {
                    i12 = ProtoAdapter.INT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, i value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.c() != null) {
                j.f44033e.encodeWithTag(writer, 1, value.c());
            }
            if (!s.c(value.f(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.f());
            }
            if (value.e() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 4, Integer.valueOf(value.e()));
            }
            if (value.d() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 5, Integer.valueOf(value.d()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(i value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != null) {
                z11 += j.f44033e.encodedSizeWithTag(1, value.c());
            }
            if (!s.c(value.f(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(3, value.f());
            }
            if (value.e() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.e()));
            }
            return value.d() != 0 ? z11 + ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.d())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public i redact(i value) {
            s.g(value, "value");
            j c11 = value.c();
            return i.b(value, c11 == null ? null : j.f44033e.redact(c11), null, 0, 0, okio.i.f42656d, 14, null);
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
        f44028e = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(i.class), o.PROTO_3);
    }

    public i() {
        this(null, null, 0, 0, null, 31, null);
    }

    public /* synthetic */ i(j jVar, String str, int i11, int i12, okio.i iVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : jVar, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) == 0 ? i12 : 0, (i13 & 16) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ i b(i iVar, j jVar, String str, int i11, int i12, okio.i iVar2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            jVar = iVar.f44029a;
        }
        if ((i13 & 2) != 0) {
            str = iVar.f44030b;
        }
        String str2 = str;
        if ((i13 & 4) != 0) {
            i11 = iVar.f44031c;
        }
        int i14 = i11;
        if ((i13 & 8) != 0) {
            i12 = iVar.f44032d;
        }
        int i15 = i12;
        if ((i13 & 16) != 0) {
            iVar2 = iVar.unknownFields();
        }
        return iVar.a(jVar, str2, i14, i15, iVar2);
    }

    public final i a(j jVar, String vin, int i11, int i12, okio.i unknownFields) {
        s.g(vin, "vin");
        s.g(unknownFields, "unknownFields");
        return new i(jVar, vin, i11, i12, unknownFields);
    }

    public final j c() {
        return this.f44029a;
    }

    public final int d() {
        return this.f44032d;
    }

    public final int e() {
        return this.f44031c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return s.c(unknownFields(), iVar.unknownFields()) && s.c(this.f44029a, iVar.f44029a) && s.c(this.f44030b, iVar.f44030b) && this.f44031c == iVar.f44031c && this.f44032d == iVar.f44032d;
        }
        return false;
    }

    public final String f() {
        return this.f44030b;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            j jVar = this.f44029a;
            int hashCode2 = ((((((hashCode + (jVar != null ? jVar.hashCode() : 0)) * 37) + this.f44030b.hashCode()) * 37) + Integer.hashCode(this.f44031c)) * 37) + Integer.hashCode(this.f44032d);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m961newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        j jVar = this.f44029a;
        if (jVar != null) {
            arrayList.add("action=" + jVar);
        }
        String i11 = mr.d.i(this.f44030b);
        arrayList.add("vin=" + i11);
        int i12 = this.f44031c;
        arrayList.add("keyVersion=" + i12);
        int i13 = this.f44032d;
        arrayList.add("apiVersion=" + i13);
        l02 = e0.l0(arrayList, ", ", "ProxyCommand{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m961newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, String vin, int i11, int i12, okio.i unknownFields) {
        super(f44028e, unknownFields);
        s.g(vin, "vin");
        s.g(unknownFields, "unknownFields");
        this.f44029a = jVar;
        this.f44030b = vin;
        this.f44031c = i11;
        this.f44032d = i12;
    }
}