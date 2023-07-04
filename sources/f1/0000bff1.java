package xt;

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
public final class h extends com.squareup.wire.f {

    /* renamed from: f  reason: collision with root package name */
    public static final ProtoAdapter<h> f57714f;
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f57715a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final okio.i f57716b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final okio.i f57717c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#FIXED32", jsonName = "clockTime", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final int f57718d;
    @q(adapter = "com.tesla.generated.signatures.Session_Info_Status#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final i f57719e;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<h> {
        a(com.squareup.wire.b bVar, n00.d<h> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/Signatures.SessionInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public h decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            i iVar2 = i.SESSION_INFO_STATUS_OK;
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            i iVar3 = iVar2;
            okio.i iVar4 = iVar;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new h(i11, iVar, iVar4, i12, iVar3, reader.e(d11));
                } else if (g11 == 1) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 == 2) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 == 3) {
                    iVar4 = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 == 4) {
                    i12 = ProtoAdapter.FIXED32.decode(reader).intValue();
                } else if (g11 != 5) {
                    reader.m(g11);
                } else {
                    try {
                        iVar3 = i.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, h value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.d() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.d()));
            }
            okio.i f11 = value.f();
            okio.i iVar = okio.i.f42656d;
            if (!s.c(f11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.f());
            }
            if (!s.c(value.e(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.e());
            }
            if (value.c() != 0) {
                ProtoAdapter.FIXED32.encodeWithTag(writer, 4, Integer.valueOf(value.c()));
            }
            if (value.g() != i.SESSION_INFO_STATUS_OK) {
                i.ADAPTER.encodeWithTag(writer, 5, value.g());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(h value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.d()));
            }
            okio.i f11 = value.f();
            okio.i iVar = okio.i.f42656d;
            if (!s.c(f11, iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.f());
            }
            if (!s.c(value.e(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(3, value.e());
            }
            if (value.c() != 0) {
                z11 += ProtoAdapter.FIXED32.encodedSizeWithTag(4, Integer.valueOf(value.c()));
            }
            return value.g() != i.SESSION_INFO_STATUS_OK ? z11 + i.ADAPTER.encodedSizeWithTag(5, value.g()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public h redact(h value) {
            s.g(value, "value");
            return h.b(value, 0, null, null, 0, null, okio.i.f42656d, 31, null);
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
        f57714f = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(h.class), o.PROTO_3);
    }

    public h() {
        this(0, null, null, 0, null, null, 63, null);
    }

    public /* synthetic */ h(int i11, okio.i iVar, okio.i iVar2, int i12, i iVar3, okio.i iVar4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? okio.i.f42656d : iVar, (i13 & 4) != 0 ? okio.i.f42656d : iVar2, (i13 & 8) == 0 ? i12 : 0, (i13 & 16) != 0 ? i.SESSION_INFO_STATUS_OK : iVar3, (i13 & 32) != 0 ? okio.i.f42656d : iVar4);
    }

    public static /* synthetic */ h b(h hVar, int i11, okio.i iVar, okio.i iVar2, int i12, i iVar3, okio.i iVar4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = hVar.f57715a;
        }
        if ((i13 & 2) != 0) {
            iVar = hVar.f57716b;
        }
        okio.i iVar5 = iVar;
        if ((i13 & 4) != 0) {
            iVar2 = hVar.f57717c;
        }
        okio.i iVar6 = iVar2;
        if ((i13 & 8) != 0) {
            i12 = hVar.f57718d;
        }
        int i14 = i12;
        if ((i13 & 16) != 0) {
            iVar3 = hVar.f57719e;
        }
        i iVar7 = iVar3;
        if ((i13 & 32) != 0) {
            iVar4 = hVar.unknownFields();
        }
        return hVar.a(i11, iVar5, iVar6, i14, iVar7, iVar4);
    }

    public final h a(int i11, okio.i publicKey, okio.i epoch, int i12, i status, okio.i unknownFields) {
        s.g(publicKey, "publicKey");
        s.g(epoch, "epoch");
        s.g(status, "status");
        s.g(unknownFields, "unknownFields");
        return new h(i11, publicKey, epoch, i12, status, unknownFields);
    }

    public final int c() {
        return this.f57718d;
    }

    public final int d() {
        return this.f57715a;
    }

    public final okio.i e() {
        return this.f57717c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return s.c(unknownFields(), hVar.unknownFields()) && this.f57715a == hVar.f57715a && s.c(this.f57716b, hVar.f57716b) && s.c(this.f57717c, hVar.f57717c) && this.f57718d == hVar.f57718d && this.f57719e == hVar.f57719e;
        }
        return false;
    }

    public final okio.i f() {
        return this.f57716b;
    }

    public final i g() {
        return this.f57719e;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.f57715a)) * 37) + this.f57716b.hashCode()) * 37) + this.f57717c.hashCode()) * 37) + Integer.hashCode(this.f57718d)) * 37) + this.f57719e.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1132newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f57715a;
        arrayList.add("counter=" + i11);
        okio.i iVar = this.f57716b;
        arrayList.add("publicKey=" + iVar);
        okio.i iVar2 = this.f57717c;
        arrayList.add("epoch=" + iVar2);
        int i12 = this.f57718d;
        arrayList.add("clock_time=" + i12);
        i iVar3 = this.f57719e;
        arrayList.add("status=" + iVar3);
        l02 = e0.l0(arrayList, ", ", "SessionInfo{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1132newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i11, okio.i publicKey, okio.i epoch, int i12, i status, okio.i unknownFields) {
        super(f57714f, unknownFields);
        s.g(publicKey, "publicKey");
        s.g(epoch, "epoch");
        s.g(status, "status");
        s.g(unknownFields, "unknownFields");
        this.f57715a = i11;
        this.f57716b = publicKey;
        this.f57717c = epoch;
        this.f57718d = i12;
        this.f57719e = status;
    }
}