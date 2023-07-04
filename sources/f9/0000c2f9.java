package yt;

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
import okio.i;
import wz.e0;

/* loaded from: classes6.dex */
public final class a extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<a> f59748c;
    @q(adapter = "com.tesla.generated.universalmessage.Domain#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final yt.b f59749a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "routingAddress", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final i f59750b;

    /* renamed from: yt.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1360a extends ProtoAdapter<a> {
        C1360a(com.squareup.wire.b bVar, n00.d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/UniversalMessage.Destination", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public a decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            yt.b bVar = null;
            i iVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new a(bVar, iVar, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        bVar = yt.b.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 != 2) {
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
            yt.b.ADAPTER.encodeWithTag(writer, 1, value.c());
            ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.d());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(a value) {
            s.g(value, "value");
            return value.unknownFields().z() + yt.b.ADAPTER.encodedSizeWithTag(1, value.c()) + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.d());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public a redact(a value) {
            s.g(value, "value");
            return a.b(value, null, null, i.f42656d, 3, null);
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
        f59748c = new C1360a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(a.class), o.PROTO_3);
    }

    public a() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ a(yt.b bVar, i iVar, i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bVar, (i11 & 2) != 0 ? null : iVar, (i11 & 4) != 0 ? i.f42656d : iVar2);
    }

    public static /* synthetic */ a b(a aVar, yt.b bVar, i iVar, i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = aVar.f59749a;
        }
        if ((i11 & 2) != 0) {
            iVar = aVar.f59750b;
        }
        if ((i11 & 4) != 0) {
            iVar2 = aVar.unknownFields();
        }
        return aVar.a(bVar, iVar, iVar2);
    }

    public final a a(yt.b bVar, i iVar, i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new a(bVar, iVar, unknownFields);
    }

    public final yt.b c() {
        return this.f59749a;
    }

    public final i d() {
        return this.f59750b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(unknownFields(), aVar.unknownFields()) && this.f59749a == aVar.f59749a && s.c(this.f59750b, aVar.f59750b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            yt.b bVar = this.f59749a;
            int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 37;
            i iVar = this.f59750b;
            int hashCode3 = hashCode2 + (iVar != null ? iVar.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1135newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        yt.b bVar = this.f59749a;
        if (bVar != null) {
            arrayList.add("domain=" + bVar);
        }
        i iVar = this.f59750b;
        if (iVar != null) {
            arrayList.add("routing_address=" + iVar);
        }
        l02 = e0.l0(arrayList, ", ", "Destination{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1135newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yt.b bVar, i iVar, i unknownFields) {
        super(f59748c, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f59749a = bVar;
        this.f59750b = iVar;
        if (!(mr.d.c(bVar, iVar) <= 1)) {
            throw new IllegalArgumentException("At most one of domain, routing_address may be non-null".toString());
        }
    }
}