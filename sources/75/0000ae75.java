package qt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import okio.i;
import wz.e0;
import wz.w;

/* loaded from: classes6.dex */
public final class b extends com.squareup.wire.f {

    /* renamed from: e  reason: collision with root package name */
    public static final ProtoAdapter<b> f48441e;
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: a  reason: collision with root package name */
    private final int f48442a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: b  reason: collision with root package name */
    private final i f48443b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: c  reason: collision with root package name */
    private final i f48444c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "responseSubscribed", label = q.a.PACKED, tag = 1)

    /* renamed from: d  reason: collision with root package name */
    private final List<Integer> f48445d;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, n00.d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.FlatbuffersMessageOptions", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b decode(k reader) {
            s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            i iVar = i.f42656d;
            long d11 = reader.d();
            int i11 = 0;
            i iVar2 = iVar;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b(arrayList, i11, iVar, iVar2, reader.e(d11));
                } else if (g11 == 1) {
                    arrayList.add(ProtoAdapter.UINT32.decode(reader));
                } else if (g11 == 2) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 == 3) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 != 4) {
                    reader.m(g11);
                } else {
                    iVar2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, b value) {
            s.g(writer, "writer");
            s.g(value, "value");
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.asPacked().encodeWithTag(writer, 1, value.d());
            if (value.c() != 0) {
                protoAdapter.encodeWithTag(writer, 2, Integer.valueOf(value.c()));
            }
            i f11 = value.f();
            i iVar = i.f42656d;
            if (!s.c(f11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.f());
            }
            if (!s.c(value.e(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 4, value.e());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            int encodedSizeWithTag = z11 + protoAdapter.asPacked().encodedSizeWithTag(1, value.d());
            if (value.c() != 0) {
                encodedSizeWithTag += protoAdapter.encodedSizeWithTag(2, Integer.valueOf(value.c()));
            }
            i f11 = value.f();
            i iVar = i.f42656d;
            if (!s.c(f11, iVar)) {
                encodedSizeWithTag += ProtoAdapter.BYTES.encodedSizeWithTag(3, value.f());
            }
            return !s.c(value.e(), iVar) ? encodedSizeWithTag + ProtoAdapter.BYTES.encodedSizeWithTag(4, value.e()) : encodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b redact(b value) {
            s.g(value, "value");
            return b.b(value, null, 0, null, null, i.f42656d, 15, null);
        }
    }

    /* renamed from: qt.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1035b {
        private C1035b() {
        }

        public /* synthetic */ C1035b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1035b(null);
        f48441e = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(b.class), o.PROTO_3);
    }

    public b() {
        this(null, 0, null, null, null, 31, null);
    }

    public /* synthetic */ b(List list, int i11, i iVar, i iVar2, i iVar3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? w.i() : list, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? i.f42656d : iVar, (i12 & 8) != 0 ? i.f42656d : iVar2, (i12 & 16) != 0 ? i.f42656d : iVar3);
    }

    public static /* synthetic */ b b(b bVar, List list, int i11, i iVar, i iVar2, i iVar3, int i12, Object obj) {
        List<Integer> list2 = list;
        if ((i12 & 1) != 0) {
            list2 = bVar.f48445d;
        }
        if ((i12 & 2) != 0) {
            i11 = bVar.f48442a;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            iVar = bVar.f48443b;
        }
        i iVar4 = iVar;
        if ((i12 & 8) != 0) {
            iVar2 = bVar.f48444c;
        }
        i iVar5 = iVar2;
        if ((i12 & 16) != 0) {
            iVar3 = bVar.unknownFields();
        }
        return bVar.a(list2, i13, iVar4, iVar5, iVar3);
    }

    public final b a(List<Integer> response_subscribed, int i11, i token, i signature, i unknownFields) {
        s.g(response_subscribed, "response_subscribed");
        s.g(token, "token");
        s.g(signature, "signature");
        s.g(unknownFields, "unknownFields");
        return new b(response_subscribed, i11, token, signature, unknownFields);
    }

    public final int c() {
        return this.f48442a;
    }

    public final List<Integer> d() {
        return this.f48445d;
    }

    public final i e() {
        return this.f48444c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return s.c(unknownFields(), bVar.unknownFields()) && s.c(this.f48445d, bVar.f48445d) && this.f48442a == bVar.f48442a && s.c(this.f48443b, bVar.f48443b) && s.c(this.f48444c, bVar.f48444c);
        }
        return false;
    }

    public final i f() {
        return this.f48443b;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((unknownFields().hashCode() * 37) + this.f48445d.hashCode()) * 37) + Integer.hashCode(this.f48442a)) * 37) + this.f48443b.hashCode()) * 37) + this.f48444c.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1093newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        if (!this.f48445d.isEmpty()) {
            List<Integer> list = this.f48445d;
            arrayList.add("response_subscribed=" + list);
        }
        int i11 = this.f48442a;
        arrayList.add("qos=" + i11);
        i iVar = this.f48443b;
        arrayList.add("token=" + iVar);
        i iVar2 = this.f48444c;
        arrayList.add("signature=" + iVar2);
        l02 = e0.l0(arrayList, ", ", "FlatbuffersMessageOptions{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1093newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List<Integer> response_subscribed, int i11, i token, i signature, i unknownFields) {
        super(f48441e, unknownFields);
        s.g(response_subscribed, "response_subscribed");
        s.g(token, "token");
        s.g(signature, "signature");
        s.g(unknownFields, "unknownFields");
        this.f48442a = i11;
        this.f48443b = token;
        this.f48444c = signature;
        this.f48445d = mr.d.g("response_subscribed", response_subscribed);
    }
}