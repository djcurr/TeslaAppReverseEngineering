package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class g extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<g> f37410c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f37411a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final okio.i f37412b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<g> {
        a(com.squareup.wire.b bVar, n00.d<g> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.BluetoothClassicPairingRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public g decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new g(str, iVar, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, g value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.d(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.d());
            }
            if (!kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(g value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!kotlin.jvm.internal.s.c(value.d(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.d());
            }
            return !kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public g redact(g value) {
            kotlin.jvm.internal.s.g(value, "value");
            return g.b(value, null, null, okio.i.f42656d, 3, null);
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
        f37410c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(g.class), com.squareup.wire.o.PROTO_3);
    }

    public g() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ g(String str, okio.i iVar, okio.i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? okio.i.f42656d : iVar, (i11 & 4) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ g b(g gVar, String str, okio.i iVar, okio.i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = gVar.f37411a;
        }
        if ((i11 & 2) != 0) {
            iVar = gVar.f37412b;
        }
        if ((i11 & 4) != 0) {
            iVar2 = gVar.unknownFields();
        }
        return gVar.a(str, iVar, iVar2);
    }

    public final g a(String utf8Name, okio.i macAddress, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(utf8Name, "utf8Name");
        kotlin.jvm.internal.s.g(macAddress, "macAddress");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new g(utf8Name, macAddress, unknownFields);
    }

    public final okio.i c() {
        return this.f37412b;
    }

    public final String d() {
        return this.f37411a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), gVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f37411a, gVar.f37411a) && kotlin.jvm.internal.s.c(this.f37412b, gVar.f37412b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + this.f37411a.hashCode()) * 37) + this.f37412b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m679newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f37411a);
        arrayList.add("utf8Name=" + i11);
        okio.i iVar = this.f37412b;
        arrayList.add("macAddress=" + iVar);
        l02 = wz.e0.l0(arrayList, ", ", "BluetoothClassicPairingRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m679newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String utf8Name, okio.i macAddress, okio.i unknownFields) {
        super(f37410c, unknownFields);
        kotlin.jvm.internal.s.g(utf8Name, "utf8Name");
        kotlin.jvm.internal.s.g(macAddress, "macAddress");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37411a = utf8Name;
        this.f37412b = macAddress;
    }
}