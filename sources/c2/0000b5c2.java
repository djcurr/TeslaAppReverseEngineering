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
public final class a extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<a> f52521c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f52522a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f52523b;

    /* renamed from: tt.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1160a extends ProtoAdapter<a> {
        C1160a(com.squareup.wire.b bVar, n00.d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/monitoring.Attribute", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public a decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            String str = "";
            String str2 = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new a(str, str2, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    str2 = ProtoAdapter.STRING.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, a value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!s.c(value.getName(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getName());
            }
            if (!s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(a value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!s.c(value.getName(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
            }
            return !s.c(value.c(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(2, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public a redact(a value) {
            s.g(value, "value");
            return a.b(value, null, null, okio.i.f42656d, 3, null);
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
        f52521c = new C1160a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(a.class), o.PROTO_3);
    }

    public a() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ a(String str, String str2, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ a b(a aVar, String str, String str2, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.f52522a;
        }
        if ((i11 & 2) != 0) {
            str2 = aVar.f52523b;
        }
        if ((i11 & 4) != 0) {
            iVar = aVar.unknownFields();
        }
        return aVar.a(str, str2, iVar);
    }

    public final a a(String name, String value, okio.i unknownFields) {
        s.g(name, "name");
        s.g(value, "value");
        s.g(unknownFields, "unknownFields");
        return new a(name, value, unknownFields);
    }

    public final String c() {
        return this.f52523b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(unknownFields(), aVar.unknownFields()) && s.c(this.f52522a, aVar.f52522a) && s.c(this.f52523b, aVar.f52523b);
        }
        return false;
    }

    public final String getName() {
        return this.f52522a;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + this.f52522a.hashCode()) * 37) + this.f52523b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1106newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f52522a);
        arrayList.add("name=" + i11);
        String i12 = mr.d.i(this.f52523b);
        arrayList.add("value=" + i12);
        l02 = e0.l0(arrayList, ", ", "Attribute{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1106newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String name, String value, okio.i unknownFields) {
        super(f52521c, unknownFields);
        s.g(name, "name");
        s.g(value, "value");
        s.g(unknownFields, "unknownFields");
        this.f52522a = name;
        this.f52523b = value;
    }
}