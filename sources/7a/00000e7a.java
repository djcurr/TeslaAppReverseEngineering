package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class z3 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<z3> f8300d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f8301a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: b  reason: collision with root package name */
    private final int f8302b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyIdentifier#ADAPTER", label = q.a.REPEATED, tag = 2)

    /* renamed from: c  reason: collision with root package name */
    private final List<e1> f8303c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<z3> {
        a(com.squareup.wire.b bVar, n00.d<z3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.WhitelistInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public z3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new z3(i11, arrayList, i12, reader.e(d11));
                }
                if (g11 == 1) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 == 2) {
                    arrayList.add(e1.f7982b.decode(reader));
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    i12 = ProtoAdapter.UINT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, z3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.c()));
            }
            e1.f7982b.asRepeated().encodeWithTag(writer, 2, value.e());
            if (value.d() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.d()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(z3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.c()));
            }
            int encodedSizeWithTag = z11 + e1.f7982b.asRepeated().encodedSizeWithTag(2, value.e());
            return value.d() != 0 ? encodedSizeWithTag + ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.d())) : encodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public z3 redact(z3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return z3.b(value, 0, mr.d.a(value.e(), e1.f7982b), 0, okio.i.f42656d, 5, null);
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
        f8300d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(z3.class), com.squareup.wire.o.PROTO_3);
    }

    public z3() {
        this(0, null, 0, null, 15, null);
    }

    public /* synthetic */ z3(int i11, List list, int i12, okio.i iVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? wz.w.i() : list, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ z3 b(z3 z3Var, int i11, List list, int i12, okio.i iVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = z3Var.f8301a;
        }
        if ((i13 & 2) != 0) {
            list = z3Var.f8303c;
        }
        if ((i13 & 4) != 0) {
            i12 = z3Var.f8302b;
        }
        if ((i13 & 8) != 0) {
            iVar = z3Var.unknownFields();
        }
        return z3Var.a(i11, list, i12, iVar);
    }

    public final z3 a(int i11, List<e1> whitelistEntries, int i12, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(whitelistEntries, "whitelistEntries");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new z3(i11, whitelistEntries, i12, unknownFields);
    }

    public final int c() {
        return this.f8301a;
    }

    public final int d() {
        return this.f8302b;
    }

    public final List<e1> e() {
        return this.f8303c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z3) {
            z3 z3Var = (z3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), z3Var.unknownFields()) && this.f8301a == z3Var.f8301a && kotlin.jvm.internal.s.c(this.f8303c, z3Var.f8303c) && this.f8302b == z3Var.f8302b;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + Integer.hashCode(this.f8301a)) * 37) + this.f8303c.hashCode()) * 37) + Integer.hashCode(this.f8302b);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m92newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f8301a;
        arrayList.add("numberOfEntries=" + i11);
        if (!this.f8303c.isEmpty()) {
            List<e1> list = this.f8303c;
            arrayList.add("whitelistEntries=" + list);
        }
        int i12 = this.f8302b;
        arrayList.add("slotMask=" + i12);
        l02 = wz.e0.l0(arrayList, ", ", "WhitelistInfo{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m92newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(int i11, List<e1> whitelistEntries, int i12, okio.i unknownFields) {
        super(f8300d, unknownFields);
        kotlin.jvm.internal.s.g(whitelistEntries, "whitelistEntries");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8301a = i11;
        this.f8302b = i12;
        this.f8303c = mr.d.g("whitelistEntries", whitelistEntries);
    }
}