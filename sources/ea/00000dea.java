package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class q0 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<q0> f8181c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f8182a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final okio.i f8183b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<q0> {
        a(com.squareup.wire.b bVar, n00.d<q0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.Genealogy", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public q0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            okio.i iVar2 = iVar;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new q0(iVar, iVar2, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    iVar2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, q0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            okio.i d11 = value.d();
            okio.i iVar = okio.i.f42656d;
            if (!kotlin.jvm.internal.s.c(d11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.d());
            }
            if (!kotlin.jvm.internal.s.c(value.c(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(q0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            okio.i d11 = value.d();
            okio.i iVar = okio.i.f42656d;
            if (!kotlin.jvm.internal.s.c(d11, iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.d());
            }
            return !kotlin.jvm.internal.s.c(value.c(), iVar) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public q0 redact(q0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return q0.b(value, null, null, okio.i.f42656d, 3, null);
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
        f8181c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(q0.class), com.squareup.wire.o.PROTO_3);
    }

    public q0() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ q0(okio.i iVar, okio.i iVar2, okio.i iVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.i.f42656d : iVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar2, (i11 & 4) != 0 ? okio.i.f42656d : iVar3);
    }

    public static /* synthetic */ q0 b(q0 q0Var, okio.i iVar, okio.i iVar2, okio.i iVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = q0Var.f8182a;
        }
        if ((i11 & 2) != 0) {
            iVar2 = q0Var.f8183b;
        }
        if ((i11 & 4) != 0) {
            iVar3 = q0Var.unknownFields();
        }
        return q0Var.a(iVar, iVar2, iVar3);
    }

    public final q0 a(okio.i serialNumber, okio.i partNumber, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(serialNumber, "serialNumber");
        kotlin.jvm.internal.s.g(partNumber, "partNumber");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new q0(serialNumber, partNumber, unknownFields);
    }

    public final okio.i c() {
        return this.f8183b;
    }

    public final okio.i d() {
        return this.f8182a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), q0Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8182a, q0Var.f8182a) && kotlin.jvm.internal.s.c(this.f8183b, q0Var.f8183b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + this.f8182a.hashCode()) * 37) + this.f8183b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m65newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f8182a;
        arrayList.add("serialNumber=" + iVar);
        okio.i iVar2 = this.f8183b;
        arrayList.add("partNumber=" + iVar2);
        l02 = wz.e0.l0(arrayList, ", ", "Genealogy{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m65newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(okio.i serialNumber, okio.i partNumber, okio.i unknownFields) {
        super(f8181c, unknownFields);
        kotlin.jvm.internal.s.g(serialNumber, "serialNumber");
        kotlin.jvm.internal.s.g(partNumber, "partNumber");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8182a = serialNumber;
        this.f8183b = partNumber;
    }
}