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
public final class h extends com.squareup.wire.f {

    /* renamed from: f */
    public static final ProtoAdapter<h> f60743f;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a */
    private final String f60744a;
    @q(adapter = "com.tesla.generated.vault.EncryptedData#ADAPTER", jsonName = "labelKey", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b */
    private final zt.a f60745b;
    @q(adapter = "com.tesla.generated.vault.EncryptedData#ADAPTER", jsonName = "dataKey", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c */
    private final zt.a f60746c;
    @q(adapter = "com.tesla.generated.vault.Item#ADAPTER", label = q.a.REPEATED, tag = 4)

    /* renamed from: d */
    private final List<zt.b> f60747d;
    @q(adapter = "com.tesla.generated.vault.WrappedClassKey#ADAPTER", jsonName = "wrappedClassKeys", label = q.a.REPEATED, tag = 5)

    /* renamed from: e */
    private final List<j> f60748e;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<h> {
        a(com.squareup.wire.b bVar, n00.d<h> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.VaultClass", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public h decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long d11 = reader.d();
            zt.a aVar = null;
            String str = "";
            zt.a aVar2 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new h(str, aVar, aVar2, arrayList, arrayList2, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 == 2) {
                    aVar = zt.a.f60715d.decode(reader);
                } else if (g11 == 3) {
                    aVar2 = zt.a.f60715d.decode(reader);
                } else if (g11 == 4) {
                    arrayList.add(zt.b.f60719g.decode(reader));
                } else if (g11 != 5) {
                    reader.m(g11);
                } else {
                    arrayList2.add(j.f60752d.decode(reader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, h value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!s.c(value.getName(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getName());
            }
            if (value.e() != null) {
                zt.a.f60715d.encodeWithTag(writer, 2, value.e());
            }
            if (value.c() != null) {
                zt.a.f60715d.encodeWithTag(writer, 3, value.c());
            }
            zt.b.f60719g.asRepeated().encodeWithTag(writer, 4, value.d());
            j.f60752d.asRepeated().encodeWithTag(writer, 5, value.f());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(h value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!s.c(value.getName(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
            }
            if (value.e() != null) {
                z11 += zt.a.f60715d.encodedSizeWithTag(2, value.e());
            }
            if (value.c() != null) {
                z11 += zt.a.f60715d.encodedSizeWithTag(3, value.c());
            }
            return z11 + zt.b.f60719g.asRepeated().encodedSizeWithTag(4, value.d()) + j.f60752d.asRepeated().encodedSizeWithTag(5, value.f());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public h redact(h value) {
            s.g(value, "value");
            zt.a e11 = value.e();
            zt.a redact = e11 == null ? null : zt.a.f60715d.redact(e11);
            zt.a c11 = value.c();
            return h.b(value, null, redact, c11 != null ? zt.a.f60715d.redact(c11) : null, mr.d.a(value.d(), zt.b.f60719g), mr.d.a(value.f(), j.f60752d), okio.i.f42656d, 1, null);
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
        f60743f = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(h.class), o.PROTO_3);
    }

    public h() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ h(String str, zt.a aVar, zt.a aVar2, List list, List list2, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : aVar, (i11 & 4) == 0 ? aVar2 : null, (i11 & 8) != 0 ? w.i() : list, (i11 & 16) != 0 ? w.i() : list2, (i11 & 32) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ h b(h hVar, String str, zt.a aVar, zt.a aVar2, List list, List list2, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hVar.f60744a;
        }
        if ((i11 & 2) != 0) {
            aVar = hVar.f60745b;
        }
        zt.a aVar3 = aVar;
        if ((i11 & 4) != 0) {
            aVar2 = hVar.f60746c;
        }
        zt.a aVar4 = aVar2;
        List<zt.b> list3 = list;
        if ((i11 & 8) != 0) {
            list3 = hVar.f60747d;
        }
        List list4 = list3;
        List<j> list5 = list2;
        if ((i11 & 16) != 0) {
            list5 = hVar.f60748e;
        }
        List list6 = list5;
        if ((i11 & 32) != 0) {
            iVar = hVar.unknownFields();
        }
        return hVar.a(str, aVar3, aVar4, list4, list6, iVar);
    }

    public final h a(String name, zt.a aVar, zt.a aVar2, List<zt.b> items, List<j> wrapped_class_keys, okio.i unknownFields) {
        s.g(name, "name");
        s.g(items, "items");
        s.g(wrapped_class_keys, "wrapped_class_keys");
        s.g(unknownFields, "unknownFields");
        return new h(name, aVar, aVar2, items, wrapped_class_keys, unknownFields);
    }

    public final zt.a c() {
        return this.f60746c;
    }

    public final List<zt.b> d() {
        return this.f60747d;
    }

    public final zt.a e() {
        return this.f60745b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return s.c(unknownFields(), hVar.unknownFields()) && s.c(this.f60744a, hVar.f60744a) && s.c(this.f60745b, hVar.f60745b) && s.c(this.f60746c, hVar.f60746c) && s.c(this.f60747d, hVar.f60747d) && s.c(this.f60748e, hVar.f60748e);
        }
        return false;
    }

    public final List<j> f() {
        return this.f60748e;
    }

    public final String getName() {
        return this.f60744a;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.f60744a.hashCode()) * 37;
            zt.a aVar = this.f60745b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 37;
            zt.a aVar2 = this.f60746c;
            int hashCode3 = ((((hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 37) + this.f60747d.hashCode()) * 37) + this.f60748e.hashCode();
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1146newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f60744a);
        arrayList.add("name=" + i11);
        zt.a aVar = this.f60745b;
        if (aVar != null) {
            arrayList.add("label_key=" + aVar);
        }
        zt.a aVar2 = this.f60746c;
        if (aVar2 != null) {
            arrayList.add("data_key=" + aVar2);
        }
        if (!this.f60747d.isEmpty()) {
            List<zt.b> list = this.f60747d;
            arrayList.add("items=" + list);
        }
        if (!this.f60748e.isEmpty()) {
            List<j> list2 = this.f60748e;
            arrayList.add("wrapped_class_keys=" + list2);
        }
        l02 = e0.l0(arrayList, ", ", "VaultClass{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m1146newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String name, zt.a aVar, zt.a aVar2, List<zt.b> items, List<j> wrapped_class_keys, okio.i unknownFields) {
        super(f60743f, unknownFields);
        s.g(name, "name");
        s.g(items, "items");
        s.g(wrapped_class_keys, "wrapped_class_keys");
        s.g(unknownFields, "unknownFields");
        this.f60744a = name;
        this.f60745b = aVar;
        this.f60746c = aVar2;
        this.f60747d = mr.d.g("items", items);
        this.f60748e = mr.d.g("wrapped_class_keys", wrapped_class_keys);
    }
}