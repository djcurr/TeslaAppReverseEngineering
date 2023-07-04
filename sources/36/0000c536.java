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
public final class c extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<c> f60726b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f60727a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, n00.d<c> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.OpenVault", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public c decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new c(str, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
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
            if (!s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(c value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            return !s.c(value.c(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public c redact(c value) {
            s.g(value, "value");
            return c.b(value, null, okio.i.f42656d, 1, null);
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
        f60726b = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(c.class), o.PROTO_3);
    }

    public c() {
        this(null, null, 3, null);
    }

    public /* synthetic */ c(String str, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ c b(c cVar, String str, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cVar.f60727a;
        }
        if ((i11 & 2) != 0) {
            iVar = cVar.unknownFields();
        }
        return cVar.a(str, iVar);
    }

    public final c a(String uuid, okio.i unknownFields) {
        s.g(uuid, "uuid");
        s.g(unknownFields, "unknownFields");
        return new c(uuid, unknownFields);
    }

    public final String c() {
        return this.f60727a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return s.c(unknownFields(), cVar.unknownFields()) && s.c(this.f60727a, cVar.f60727a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f60727a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1141newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f60727a);
        arrayList.add("uuid=" + i11);
        l02 = e0.l0(arrayList, ", ", "OpenVault{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1141newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String uuid, okio.i unknownFields) {
        super(f60726b, unknownFields);
        s.g(uuid, "uuid");
        s.g(unknownFields, "unknownFields");
        this.f60727a = uuid;
    }
}