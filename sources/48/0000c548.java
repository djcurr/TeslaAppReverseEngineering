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
public final class i extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<i> f60749c;
    @q(adapter = "com.tesla.generated.vault.vaultKeyType#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final k f60750a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f60751b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<i> {
        a(com.squareup.wire.b bVar, n00.d<i> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.VaultKey", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public i decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            k kVar = k.VEHICLE_CERT;
            long d11 = reader.d();
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new i(kVar, str, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        kVar = k.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    str = ProtoAdapter.STRING.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, i value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.d() != k.VEHICLE_CERT) {
                k.ADAPTER.encodeWithTag(writer, 1, value.d());
            }
            if (!s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(i value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d() != k.VEHICLE_CERT) {
                z11 += k.ADAPTER.encodedSizeWithTag(1, value.d());
            }
            return !s.c(value.c(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(2, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public i redact(i value) {
            s.g(value, "value");
            return i.b(value, null, null, okio.i.f42656d, 3, null);
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
        f60749c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(i.class), o.PROTO_3);
    }

    public i() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ i(k kVar, String str, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? k.VEHICLE_CERT : kVar, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ i b(i iVar, k kVar, String str, okio.i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = iVar.f60750a;
        }
        if ((i11 & 2) != 0) {
            str = iVar.f60751b;
        }
        if ((i11 & 4) != 0) {
            iVar2 = iVar.unknownFields();
        }
        return iVar.a(kVar, str, iVar2);
    }

    public final i a(k type, String pubkey, okio.i unknownFields) {
        s.g(type, "type");
        s.g(pubkey, "pubkey");
        s.g(unknownFields, "unknownFields");
        return new i(type, pubkey, unknownFields);
    }

    public final String c() {
        return this.f60751b;
    }

    public final k d() {
        return this.f60750a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return s.c(unknownFields(), iVar.unknownFields()) && this.f60750a == iVar.f60750a && s.c(this.f60751b, iVar.f60751b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + this.f60750a.hashCode()) * 37) + this.f60751b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1147newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        k kVar = this.f60750a;
        arrayList.add("type=" + kVar);
        String i11 = mr.d.i(this.f60751b);
        arrayList.add("pubkey=" + i11);
        l02 = e0.l0(arrayList, ", ", "VaultKey{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1147newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k type, String pubkey, okio.i unknownFields) {
        super(f60749c, unknownFields);
        s.g(type, "type");
        s.g(pubkey, "pubkey");
        s.g(unknownFields, "unknownFields");
        this.f60750a = type;
        this.f60751b = pubkey;
    }
}