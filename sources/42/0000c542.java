package zt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import wz.e0;
import wz.w;

/* loaded from: classes6.dex */
public final class g extends com.squareup.wire.f {

    /* renamed from: f */
    public static final ProtoAdapter<g> f60737f;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a */
    private final String f60738a;
    @q(adapter = "com.tesla.generated.vault.info.VaultInfo#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: b */
    private final au.b f60739b;
    @q(adapter = "com.tesla.generated.vault.RemoteClientKey#ADAPTER", jsonName = "remoteClientKey", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: c */
    private final d f60740c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "pubkeysReferenceId", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: d */
    private final okio.i f60741d;
    @q(adapter = "com.tesla.generated.vault.VaultClass#ADAPTER", label = q.a.REPEATED, tag = 2)

    /* renamed from: e */
    private final List<h> f60742e;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<g> {
        a(com.squareup.wire.b bVar, n00.d<g> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.Vault", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public g decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            au.b bVar = null;
            String str = "";
            d dVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new g(str, arrayList, bVar, dVar, iVar, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 == 2) {
                    arrayList.add(h.f60743f.decode(reader));
                } else if (g11 == 3) {
                    bVar = au.b.f6970e.decode(reader);
                } else if (g11 == 4) {
                    dVar = d.f60728b.decode(reader);
                } else if (g11 != 5) {
                    reader.m(g11);
                } else {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, g value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!s.c(value.f(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.f());
            }
            h.f60743f.asRepeated().encodeWithTag(writer, 2, value.c());
            if (value.g() != null) {
                au.b.f6970e.encodeWithTag(writer, 3, value.g());
            }
            if (value.e() != null) {
                d.f60728b.encodeWithTag(writer, 4, value.e());
            }
            if (!s.c(value.d(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 5, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(g value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!s.c(value.f(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.f());
            }
            int encodedSizeWithTag = z11 + h.f60743f.asRepeated().encodedSizeWithTag(2, value.c());
            if (value.g() != null) {
                encodedSizeWithTag += au.b.f6970e.encodedSizeWithTag(3, value.g());
            }
            if (value.e() != null) {
                encodedSizeWithTag += d.f60728b.encodedSizeWithTag(4, value.e());
            }
            return !s.c(value.d(), okio.i.f42656d) ? encodedSizeWithTag + ProtoAdapter.BYTES.encodedSizeWithTag(5, value.d()) : encodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public g redact(g value) {
            s.g(value, "value");
            List a11 = mr.d.a(value.c(), h.f60743f);
            au.b g11 = value.g();
            au.b redact = g11 == null ? null : au.b.f6970e.redact(g11);
            d e11 = value.e();
            return g.b(value, null, a11, redact, e11 == null ? null : d.f60728b.redact(e11), null, okio.i.f42656d, 17, null);
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
        f60737f = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(g.class), o.PROTO_3);
    }

    public g() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ g(String str, List list, au.b bVar, d dVar, okio.i iVar, okio.i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? w.i() : list, (i11 & 4) != 0 ? null : bVar, (i11 & 8) == 0 ? dVar : null, (i11 & 16) != 0 ? okio.i.f42656d : iVar, (i11 & 32) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ g b(g gVar, String str, List list, au.b bVar, d dVar, okio.i iVar, okio.i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = gVar.f60738a;
        }
        List<h> list2 = list;
        if ((i11 & 2) != 0) {
            list2 = gVar.f60742e;
        }
        List list3 = list2;
        if ((i11 & 4) != 0) {
            bVar = gVar.f60739b;
        }
        au.b bVar2 = bVar;
        if ((i11 & 8) != 0) {
            dVar = gVar.f60740c;
        }
        d dVar2 = dVar;
        if ((i11 & 16) != 0) {
            iVar = gVar.f60741d;
        }
        okio.i iVar3 = iVar;
        if ((i11 & 32) != 0) {
            iVar2 = gVar.unknownFields();
        }
        return gVar.a(str, list3, bVar2, dVar2, iVar3, iVar2);
    }

    public final g a(String uuid, List<h> classes, au.b bVar, d dVar, okio.i pubkeys_reference_id, okio.i unknownFields) {
        s.g(uuid, "uuid");
        s.g(classes, "classes");
        s.g(pubkeys_reference_id, "pubkeys_reference_id");
        s.g(unknownFields, "unknownFields");
        return new g(uuid, classes, bVar, dVar, pubkeys_reference_id, unknownFields);
    }

    public final List<h> c() {
        return this.f60742e;
    }

    public final okio.i d() {
        return this.f60741d;
    }

    public final d e() {
        return this.f60740c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return s.c(unknownFields(), gVar.unknownFields()) && s.c(this.f60738a, gVar.f60738a) && s.c(this.f60742e, gVar.f60742e) && s.c(this.f60739b, gVar.f60739b) && s.c(this.f60740c, gVar.f60740c) && s.c(this.f60741d, gVar.f60741d);
        }
        return false;
    }

    public final String f() {
        return this.f60738a;
    }

    public final au.b g() {
        return this.f60739b;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((unknownFields().hashCode() * 37) + this.f60738a.hashCode()) * 37) + this.f60742e.hashCode()) * 37;
            au.b bVar = this.f60739b;
            int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 37;
            d dVar = this.f60740c;
            int hashCode3 = ((hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 37) + this.f60741d.hashCode();
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1145newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f60738a);
        arrayList.add("uuid=" + i11);
        if (!this.f60742e.isEmpty()) {
            List<h> list = this.f60742e;
            arrayList.add("classes=" + list);
        }
        au.b bVar = this.f60739b;
        if (bVar != null) {
            arrayList.add("vaultInfo=" + bVar);
        }
        d dVar = this.f60740c;
        if (dVar != null) {
            arrayList.add("remote_client_key=" + dVar);
        }
        okio.i iVar = this.f60741d;
        arrayList.add("pubkeys_reference_id=" + iVar);
        l02 = e0.l0(arrayList, ", ", "Vault{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m1145newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String uuid, List<h> classes, au.b bVar, d dVar, okio.i pubkeys_reference_id, okio.i unknownFields) {
        super(f60737f, unknownFields);
        s.g(uuid, "uuid");
        s.g(classes, "classes");
        s.g(pubkeys_reference_id, "pubkeys_reference_id");
        s.g(unknownFields, "unknownFields");
        this.f60738a = uuid;
        this.f60739b = bVar;
        this.f60740c = dVar;
        this.f60741d = pubkeys_reference_id;
        this.f60742e = mr.d.g("classes", classes);
    }
}