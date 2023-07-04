package tt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import wz.e0;

/* loaded from: classes6.dex */
public final class j extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<j> f52546d;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final boolean f52547a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f52548b;
    @q(adapter = "com.tesla.generated.monitoring.TimeToInteractiveDestination#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final k f52549c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<j> {
        a(com.squareup.wire.b bVar, n00.d<j> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/monitoring.TimeToInteractiveAttributes", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public j decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            k kVar = k.VEHICLE;
            long d11 = reader.d();
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new j(z11, i11, kVar, reader.e(d11));
                } else if (g11 == 1) {
                    z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (g11 == 2) {
                    i11 = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    try {
                        kVar = k.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, j value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.d()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.d()));
            }
            if (value.e() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(value.e()));
            }
            if (value.c() != k.VEHICLE) {
                k.ADAPTER.encodeWithTag(writer, 3, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(j value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.d()));
            }
            if (value.e() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.e()));
            }
            return value.c() != k.VEHICLE ? z11 + k.ADAPTER.encodedSizeWithTag(3, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public j redact(j value) {
            s.g(value, "value");
            return j.b(value, false, 0, null, okio.i.f42656d, 7, null);
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
        f52546d = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(j.class), o.PROTO_3);
    }

    public j() {
        this(false, 0, null, null, 15, null);
    }

    public /* synthetic */ j(boolean z11, int i11, k kVar, okio.i iVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? k.VEHICLE : kVar, (i12 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ j b(j jVar, boolean z11, int i11, k kVar, okio.i iVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = jVar.f52547a;
        }
        if ((i12 & 2) != 0) {
            i11 = jVar.f52548b;
        }
        if ((i12 & 4) != 0) {
            kVar = jVar.f52549c;
        }
        if ((i12 & 8) != 0) {
            iVar = jVar.unknownFields();
        }
        return jVar.a(z11, i11, kVar, iVar);
    }

    public final j a(boolean z11, int i11, k destination, okio.i unknownFields) {
        s.g(destination, "destination");
        s.g(unknownFields, "unknownFields");
        return new j(z11, i11, destination, unknownFields);
    }

    public final k c() {
        return this.f52549c;
    }

    public final boolean d() {
        return this.f52547a;
    }

    public final int e() {
        return this.f52548b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return s.c(unknownFields(), jVar.unknownFields()) && this.f52547a == jVar.f52547a && this.f52548b == jVar.f52548b && this.f52549c == jVar.f52549c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f52547a)) * 37) + Integer.hashCode(this.f52548b)) * 37) + this.f52549c.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1113newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f52547a;
        arrayList.add("initialProductListFetch=" + z11);
        int i11 = this.f52548b;
        arrayList.add("productCount=" + i11);
        k kVar = this.f52549c;
        arrayList.add("destination=" + kVar);
        l02 = e0.l0(arrayList, ", ", "TimeToInteractiveAttributes{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1113newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z11, int i11, k destination, okio.i unknownFields) {
        super(f52546d, unknownFields);
        s.g(destination, "destination");
        s.g(unknownFields, "unknownFields");
        this.f52547a = z11;
        this.f52548b = i11;
        this.f52549c = destination;
    }
}