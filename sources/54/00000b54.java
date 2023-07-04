package au;

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
public final class b extends f {

    /* renamed from: e  reason: collision with root package name */
    public static final ProtoAdapter<b> f6970e;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f6971a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "publicUsername", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f6972b;
    @q(adapter = "com.tesla.generated.vault.info.UnencryptedItem#ADAPTER", jsonName = "publicProfilePicture", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final au.a f6973c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "publicGamername", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final String f6974d;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.VaultInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            String str = "";
            String str2 = "";
            au.a aVar = null;
            String str3 = str2;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b(str, str3, aVar, str2, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 == 2) {
                    str3 = ProtoAdapter.STRING.decode(reader);
                } else if (g11 == 3) {
                    aVar = au.a.f6967c.decode(reader);
                } else if (g11 != 4) {
                    reader.m(g11);
                } else {
                    str2 = ProtoAdapter.STRING.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, b value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!s.c(value.f(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.f());
            }
            if (!s.c(value.e(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.e());
            }
            if (value.d() != null) {
                au.a.f6967c.encodeWithTag(writer, 3, value.d());
            }
            if (!s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 4, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!s.c(value.f(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.f());
            }
            if (!s.c(value.e(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(2, value.e());
            }
            if (value.d() != null) {
                z11 += au.a.f6967c.encodedSizeWithTag(3, value.d());
            }
            return !s.c(value.c(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(4, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b redact(b value) {
            s.g(value, "value");
            au.a d11 = value.d();
            return b.b(value, null, null, d11 == null ? null : au.a.f6967c.redact(d11), null, i.f42656d, 11, null);
        }
    }

    /* renamed from: au.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0130b {
        private C0130b() {
        }

        public /* synthetic */ C0130b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0130b(null);
        f6970e = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(b.class), o.PROTO_3);
    }

    public b() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ b(String str, String str2, au.a aVar, String str3, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? null : aVar, (i11 & 8) == 0 ? str3 : "", (i11 & 16) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ b b(b bVar, String str, String str2, au.a aVar, String str3, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bVar.f6971a;
        }
        if ((i11 & 2) != 0) {
            str2 = bVar.f6972b;
        }
        String str4 = str2;
        if ((i11 & 4) != 0) {
            aVar = bVar.f6973c;
        }
        au.a aVar2 = aVar;
        if ((i11 & 8) != 0) {
            str3 = bVar.f6974d;
        }
        String str5 = str3;
        if ((i11 & 16) != 0) {
            iVar = bVar.unknownFields();
        }
        return bVar.a(str, str4, aVar2, str5, iVar);
    }

    public final b a(String uuid, String public_username, au.a aVar, String public_gamername, i unknownFields) {
        s.g(uuid, "uuid");
        s.g(public_username, "public_username");
        s.g(public_gamername, "public_gamername");
        s.g(unknownFields, "unknownFields");
        return new b(uuid, public_username, aVar, public_gamername, unknownFields);
    }

    public final String c() {
        return this.f6974d;
    }

    public final au.a d() {
        return this.f6973c;
    }

    public final String e() {
        return this.f6972b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return s.c(unknownFields(), bVar.unknownFields()) && s.c(this.f6971a, bVar.f6971a) && s.c(this.f6972b, bVar.f6972b) && s.c(this.f6973c, bVar.f6973c) && s.c(this.f6974d, bVar.f6974d);
        }
        return false;
    }

    public final String f() {
        return this.f6971a;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((unknownFields().hashCode() * 37) + this.f6971a.hashCode()) * 37) + this.f6972b.hashCode()) * 37;
            au.a aVar = this.f6973c;
            int hashCode2 = ((hashCode + (aVar != null ? aVar.hashCode() : 0)) * 37) + this.f6974d.hashCode();
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m7newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f6971a);
        arrayList.add("uuid=" + i11);
        String i12 = mr.d.i(this.f6972b);
        arrayList.add("public_username=" + i12);
        au.a aVar = this.f6973c;
        if (aVar != null) {
            arrayList.add("public_profile_picture=" + aVar);
        }
        String i13 = mr.d.i(this.f6974d);
        arrayList.add("public_gamername=" + i13);
        l02 = e0.l0(arrayList, ", ", "VaultInfo{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m7newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String uuid, String public_username, au.a aVar, String public_gamername, i unknownFields) {
        super(f6970e, unknownFields);
        s.g(uuid, "uuid");
        s.g(public_username, "public_username");
        s.g(public_gamername, "public_gamername");
        s.g(unknownFields, "unknownFields");
        this.f6971a = uuid;
        this.f6972b = public_username;
        this.f6973c = aVar;
        this.f6974d = public_gamername;
    }
}