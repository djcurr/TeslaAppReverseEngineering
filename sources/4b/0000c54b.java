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
public final class j extends com.squareup.wire.f {

    /* renamed from: d */
    public static final ProtoAdapter<j> f60752d;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a */
    private final String f60753a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b */
    private final okio.i f60754b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pubkeyId", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c */
    private final String f60755c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<j> {
        a(com.squareup.wire.b bVar, n00.d<j> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.WrappedClassKey", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public j decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            String str = "";
            String str2 = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new j(str, iVar, str2, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 == 2) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    str2 = ProtoAdapter.STRING.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, j value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!s.c(value.getName(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getName());
            }
            if (!s.c(value.c(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.c());
            }
            if (!s.c(value.d(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(j value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!s.c(value.getName(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
            }
            if (!s.c(value.c(), okio.i.f42656d)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.c());
            }
            return !s.c(value.d(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(3, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public j redact(j value) {
            s.g(value, "value");
            return j.b(value, null, null, null, okio.i.f42656d, 7, null);
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
        f60752d = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(j.class), o.PROTO_3);
    }

    public j() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ j(String str, okio.i iVar, String str2, okio.i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? okio.i.f42656d : iVar, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ j b(j jVar, String str, okio.i iVar, String str2, okio.i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = jVar.f60753a;
        }
        if ((i11 & 2) != 0) {
            iVar = jVar.f60754b;
        }
        if ((i11 & 4) != 0) {
            str2 = jVar.f60755c;
        }
        if ((i11 & 8) != 0) {
            iVar2 = jVar.unknownFields();
        }
        return jVar.a(str, iVar, str2, iVar2);
    }

    public final j a(String name, okio.i key, String pubkey_id, okio.i unknownFields) {
        s.g(name, "name");
        s.g(key, "key");
        s.g(pubkey_id, "pubkey_id");
        s.g(unknownFields, "unknownFields");
        return new j(name, key, pubkey_id, unknownFields);
    }

    public final okio.i c() {
        return this.f60754b;
    }

    public final String d() {
        return this.f60755c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return s.c(unknownFields(), jVar.unknownFields()) && s.c(this.f60753a, jVar.f60753a) && s.c(this.f60754b, jVar.f60754b) && s.c(this.f60755c, jVar.f60755c);
        }
        return false;
    }

    public final String getName() {
        return this.f60753a;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + this.f60753a.hashCode()) * 37) + this.f60754b.hashCode()) * 37) + this.f60755c.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1148newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f60753a);
        arrayList.add("name=" + i11);
        okio.i iVar = this.f60754b;
        arrayList.add("key=" + iVar);
        String i12 = mr.d.i(this.f60755c);
        arrayList.add("pubkey_id=" + i12);
        l02 = e0.l0(arrayList, ", ", "WrappedClassKey{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m1148newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String name, okio.i key, String pubkey_id, okio.i unknownFields) {
        super(f60752d, unknownFields);
        s.g(name, "name");
        s.g(key, "key");
        s.g(pubkey_id, "pubkey_id");
        s.g(unknownFields, "unknownFields");
        this.f60753a = name;
        this.f60754b = key;
        this.f60755c = pubkey_id;
    }
}