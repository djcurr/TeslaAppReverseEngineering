package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class t2 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<t2> f8206d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f8207a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f8208b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.BLEAdditionalTRIMApplied_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final p f8209c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<t2> {
        a(com.squareup.wire.b bVar, n00.d<t2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.SleepManagerStats", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public t2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            p pVar = p.BLE_ADDITIONAL_TRIM_APPLIED_NONE;
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new t2(i11, i12, pVar, reader.e(d11));
                } else if (g11 == 1) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 == 2) {
                    i12 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    try {
                        pVar = p.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, t2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.d()));
            }
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.c()));
            }
            if (value.e() != p.BLE_ADDITIONAL_TRIM_APPLIED_NONE) {
                p.ADAPTER.encodeWithTag(writer, 3, value.e());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(t2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.d()));
            }
            if (value.c() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.c()));
            }
            return value.e() != p.BLE_ADDITIONAL_TRIM_APPLIED_NONE ? z11 + p.ADAPTER.encodedSizeWithTag(3, value.e()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public t2 redact(t2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return t2.b(value, 0, 0, null, okio.i.f42656d, 7, null);
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
        f8206d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(t2.class), com.squareup.wire.o.PROTO_3);
    }

    public t2() {
        this(0, 0, null, null, 15, null);
    }

    public /* synthetic */ t2(int i11, int i12, p pVar, okio.i iVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? p.BLE_ADDITIONAL_TRIM_APPLIED_NONE : pVar, (i13 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ t2 b(t2 t2Var, int i11, int i12, p pVar, okio.i iVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = t2Var.f8207a;
        }
        if ((i13 & 2) != 0) {
            i12 = t2Var.f8208b;
        }
        if ((i13 & 4) != 0) {
            pVar = t2Var.f8209c;
        }
        if ((i13 & 8) != 0) {
            iVar = t2Var.unknownFields();
        }
        return t2Var.a(i11, i12, pVar, iVar);
    }

    public final t2 a(int i11, int i12, p isBLETrimApplied, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(isBLETrimApplied, "isBLETrimApplied");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new t2(i11, i12, isBLETrimApplied, unknownFields);
    }

    public final int c() {
        return this.f8208b;
    }

    public final int d() {
        return this.f8207a;
    }

    public final p e() {
        return this.f8209c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t2) {
            t2 t2Var = (t2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), t2Var.unknownFields()) && this.f8207a == t2Var.f8207a && this.f8208b == t2Var.f8208b && this.f8209c == t2Var.f8209c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + Integer.hashCode(this.f8207a)) * 37) + Integer.hashCode(this.f8208b)) * 37) + this.f8209c.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m73newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f8207a;
        arrayList.add("totalCPUTime=" + i11);
        int i12 = this.f8208b;
        arrayList.add("totalAwakeTime=" + i12);
        p pVar = this.f8209c;
        arrayList.add("isBLETrimApplied=" + pVar);
        l02 = wz.e0.l0(arrayList, ", ", "SleepManagerStats{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m73newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(int i11, int i12, p isBLETrimApplied, okio.i unknownFields) {
        super(f8206d, unknownFields);
        kotlin.jvm.internal.s.g(isBLETrimApplied, "isBLETrimApplied");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8207a = i11;
        this.f8208b = i12;
        this.f8209c = isBLETrimApplied;
    }
}