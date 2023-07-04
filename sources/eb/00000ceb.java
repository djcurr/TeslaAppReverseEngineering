package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class a extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<a> f7918d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f7919a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", declaredName = MessageExtension.FIELD_DATA, label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f7920b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final int f7921c;

    /* renamed from: bu.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0156a extends ProtoAdapter<a> {
        C0156a(com.squareup.wire.b bVar, n00.d<a> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.ASICSPIRead", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public a decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new a(i11, i12, i13, reader.e(d11));
                }
                if (g11 == 1) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 == 2) {
                    i12 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    i13 = ProtoAdapter.UINT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, a value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.e() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.e()));
            }
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.c()));
            }
            if (value.d() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.d()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(a value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.e() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.e()));
            }
            if (value.c() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.c()));
            }
            return value.d() != 0 ? z11 + ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.d())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public a redact(a value) {
            kotlin.jvm.internal.s.g(value, "value");
            return a.b(value, 0, 0, 0, okio.i.f42656d, 7, null);
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
        f7918d = new C0156a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(a.class), com.squareup.wire.o.PROTO_3);
    }

    public a() {
        this(0, 0, 0, null, 15, null);
    }

    public /* synthetic */ a(int i11, int i12, int i13, okio.i iVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ a b(a aVar, int i11, int i12, int i13, okio.i iVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = aVar.f7919a;
        }
        if ((i14 & 2) != 0) {
            i12 = aVar.f7920b;
        }
        if ((i14 & 4) != 0) {
            i13 = aVar.f7921c;
        }
        if ((i14 & 8) != 0) {
            iVar = aVar.unknownFields();
        }
        return aVar.a(i11, i12, i13, iVar);
    }

    public final a a(int i11, int i12, int i13, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new a(i11, i12, i13, unknownFields);
    }

    public final int c() {
        return this.f7920b;
    }

    public final int d() {
        return this.f7921c;
    }

    public final int e() {
        return this.f7919a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), aVar.unknownFields()) && this.f7919a == aVar.f7919a && this.f7920b == aVar.f7920b && this.f7921c == aVar.f7921c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + Integer.hashCode(this.f7919a)) * 37) + Integer.hashCode(this.f7920b)) * 37) + Integer.hashCode(this.f7921c);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m9newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f7919a;
        arrayList.add("response=" + i11);
        int i12 = this.f7920b;
        arrayList.add("data_=" + i12);
        int i13 = this.f7921c;
        arrayList.add("opCode=" + i13);
        l02 = wz.e0.l0(arrayList, ", ", "ASICSPIRead{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m9newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i11, int i12, int i13, okio.i unknownFields) {
        super(f7918d, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f7919a = i11;
        this.f7920b = i12;
        this.f7921c = i13;
    }
}