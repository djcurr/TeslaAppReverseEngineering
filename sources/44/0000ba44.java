package vt;

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
public final class a extends f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<a> f54613d;
    @q(adapter = "com.tesla.generated.vault.info.VaultInfo#ADAPTER", jsonName = "vaultInfo", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final au.b f54614a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: b  reason: collision with root package name */
    private final String f54615b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: c  reason: collision with root package name */
    private final i f54616c;

    /* renamed from: vt.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1230a extends ProtoAdapter<a> {
        C1230a(com.squareup.wire.b bVar, d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.OptIn", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public a decode(k reader) {
            s.g(reader, "reader");
            i iVar = i.f42656d;
            long d11 = reader.d();
            au.b bVar = null;
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new a(bVar, str, iVar, reader.e(d11));
                } else if (g11 == 1) {
                    bVar = au.b.f6970e.decode(reader);
                } else if (g11 == 4) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 != 5) {
                    reader.m(g11);
                } else {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, a value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.e() != null) {
                au.b.f6970e.encodeWithTag(writer, 1, value.e());
            }
            if (!s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 4, value.c());
            }
            if (!s.c(value.d(), i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 5, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(a value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.e() != null) {
                z11 += au.b.f6970e.encodedSizeWithTag(1, value.e());
            }
            if (!s.c(value.c(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(4, value.c());
            }
            return !s.c(value.d(), i.f42656d) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(5, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public a redact(a value) {
            s.g(value, "value");
            au.b e11 = value.e();
            return a.b(value, e11 == null ? null : au.b.f6970e.redact(e11), null, null, i.f42656d, 6, null);
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
        f54613d = new C1230a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(a.class), o.PROTO_3);
    }

    public a() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ a(au.b bVar, String str, i iVar, i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bVar, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? i.f42656d : iVar, (i11 & 8) != 0 ? i.f42656d : iVar2);
    }

    public static /* synthetic */ a b(a aVar, au.b bVar, String str, i iVar, i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = aVar.f54614a;
        }
        if ((i11 & 2) != 0) {
            str = aVar.f54615b;
        }
        if ((i11 & 4) != 0) {
            iVar = aVar.f54616c;
        }
        if ((i11 & 8) != 0) {
            iVar2 = aVar.unknownFields();
        }
        return aVar.a(bVar, str, iVar, iVar2);
    }

    public final a a(au.b bVar, String pin, i pubkey, i unknownFields) {
        s.g(pin, "pin");
        s.g(pubkey, "pubkey");
        s.g(unknownFields, "unknownFields");
        return new a(bVar, pin, pubkey, unknownFields);
    }

    public final String c() {
        return this.f54615b;
    }

    public final i d() {
        return this.f54616c;
    }

    public final au.b e() {
        return this.f54614a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(unknownFields(), aVar.unknownFields()) && s.c(this.f54614a, aVar.f54614a) && s.c(this.f54615b, aVar.f54615b) && s.c(this.f54616c, aVar.f54616c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            au.b bVar = this.f54614a;
            int hashCode2 = ((((hashCode + (bVar != null ? bVar.hashCode() : 0)) * 37) + this.f54615b.hashCode()) * 37) + this.f54616c.hashCode();
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1116newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        au.b bVar = this.f54614a;
        if (bVar != null) {
            arrayList.add("vault_info=" + bVar);
        }
        String i11 = mr.d.i(this.f54615b);
        arrayList.add("pin=" + i11);
        i iVar = this.f54616c;
        arrayList.add("pubkey=" + iVar);
        l02 = e0.l0(arrayList, ", ", "OptIn{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1116newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(au.b bVar, String pin, i pubkey, i unknownFields) {
        super(f54613d, unknownFields);
        s.g(pin, "pin");
        s.g(pubkey, "pubkey");
        s.g(unknownFields, "unknownFields");
        this.f54614a = bVar;
        this.f54615b = pin;
        this.f54616c = pubkey;
    }
}