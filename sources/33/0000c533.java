package zt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import wz.e0;

/* loaded from: classes6.dex */
public final class b extends com.squareup.wire.f {

    /* renamed from: g  reason: collision with root package name */
    public static final ProtoAdapter<b> f60719g;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "modifiedAt", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final long f60720a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final okio.i f60721b;
    @q(adapter = "com.tesla.generated.vault.EncryptedData#ADAPTER", declaredName = MessageExtension.FIELD_DATA, label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final zt.a f60722c;
    @q(adapter = "com.tesla.generated.vault.RemoteData#ADAPTER", jsonName = "remoteData", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final f f60723d;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "referenceId", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final okio.i f60724e;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "labelIsPlaintext", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final boolean f60725f;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, n00.d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.Item", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            long j11 = 0;
            boolean z11 = false;
            zt.a aVar = null;
            f fVar = null;
            okio.i iVar2 = iVar;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b(j11, iVar, aVar, fVar, iVar2, z11, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        j11 = ProtoAdapter.INT64.decode(reader).longValue();
                        break;
                    case 2:
                        iVar = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 3:
                        aVar = zt.a.f60715d.decode(reader);
                        break;
                    case 4:
                        fVar = f.f60733d.decode(reader);
                        break;
                    case 5:
                        iVar2 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 6:
                        z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, b value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.f() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(value.f()));
            }
            okio.i d11 = value.d();
            okio.i iVar = okio.i.f42656d;
            if (!s.c(d11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.d());
            }
            if (value.c() != null) {
                zt.a.f60715d.encodeWithTag(writer, 3, value.c());
            }
            if (value.h() != null) {
                f.f60733d.encodeWithTag(writer, 4, value.h());
            }
            if (!s.c(value.g(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 5, value.g());
            }
            if (value.e()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.e()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.f() != 0) {
                z11 += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.f()));
            }
            okio.i d11 = value.d();
            okio.i iVar = okio.i.f42656d;
            if (!s.c(d11, iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.d());
            }
            if (value.c() != null) {
                z11 += zt.a.f60715d.encodedSizeWithTag(3, value.c());
            }
            if (value.h() != null) {
                z11 += f.f60733d.encodedSizeWithTag(4, value.h());
            }
            if (!s.c(value.g(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(5, value.g());
            }
            return value.e() ? z11 + ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.e())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b redact(b value) {
            s.g(value, "value");
            zt.a c11 = value.c();
            zt.a redact = c11 == null ? null : zt.a.f60715d.redact(c11);
            f h11 = value.h();
            return b.b(value, 0L, null, redact, h11 != null ? f.f60733d.redact(h11) : null, null, false, okio.i.f42656d, 51, null);
        }
    }

    /* renamed from: zt.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1390b {
        private C1390b() {
        }

        public /* synthetic */ C1390b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1390b(null);
        f60719g = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(b.class), o.PROTO_3);
    }

    public b() {
        this(0L, null, null, null, null, false, null, 127, null);
    }

    public /* synthetic */ b(long j11, okio.i iVar, zt.a aVar, f fVar, okio.i iVar2, boolean z11, okio.i iVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? okio.i.f42656d : iVar, (i11 & 4) != 0 ? null : aVar, (i11 & 8) == 0 ? fVar : null, (i11 & 16) != 0 ? okio.i.f42656d : iVar2, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? okio.i.f42656d : iVar3);
    }

    public static /* synthetic */ b b(b bVar, long j11, okio.i iVar, zt.a aVar, f fVar, okio.i iVar2, boolean z11, okio.i iVar3, int i11, Object obj) {
        return bVar.a((i11 & 1) != 0 ? bVar.f60720a : j11, (i11 & 2) != 0 ? bVar.f60721b : iVar, (i11 & 4) != 0 ? bVar.f60722c : aVar, (i11 & 8) != 0 ? bVar.f60723d : fVar, (i11 & 16) != 0 ? bVar.f60724e : iVar2, (i11 & 32) != 0 ? bVar.f60725f : z11, (i11 & 64) != 0 ? bVar.unknownFields() : iVar3);
    }

    public final b a(long j11, okio.i label, zt.a aVar, f fVar, okio.i reference_id, boolean z11, okio.i unknownFields) {
        s.g(label, "label");
        s.g(reference_id, "reference_id");
        s.g(unknownFields, "unknownFields");
        return new b(j11, label, aVar, fVar, reference_id, z11, unknownFields);
    }

    public final zt.a c() {
        return this.f60722c;
    }

    public final okio.i d() {
        return this.f60721b;
    }

    public final boolean e() {
        return this.f60725f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return s.c(unknownFields(), bVar.unknownFields()) && this.f60720a == bVar.f60720a && s.c(this.f60721b, bVar.f60721b) && s.c(this.f60722c, bVar.f60722c) && s.c(this.f60723d, bVar.f60723d) && s.c(this.f60724e, bVar.f60724e) && this.f60725f == bVar.f60725f;
        }
        return false;
    }

    public final long f() {
        return this.f60720a;
    }

    public final okio.i g() {
        return this.f60724e;
    }

    public final f h() {
        return this.f60723d;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((unknownFields().hashCode() * 37) + Long.hashCode(this.f60720a)) * 37) + this.f60721b.hashCode()) * 37;
            zt.a aVar = this.f60722c;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 37;
            f fVar = this.f60723d;
            int hashCode3 = ((((hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 37) + this.f60724e.hashCode()) * 37) + Boolean.hashCode(this.f60725f);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1140newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        long j11 = this.f60720a;
        arrayList.add("modified_at=" + j11);
        okio.i iVar = this.f60721b;
        arrayList.add("label=" + iVar);
        zt.a aVar = this.f60722c;
        if (aVar != null) {
            arrayList.add("data_=" + aVar);
        }
        f fVar = this.f60723d;
        if (fVar != null) {
            arrayList.add("remote_data=" + fVar);
        }
        okio.i iVar2 = this.f60724e;
        arrayList.add("reference_id=" + iVar2);
        boolean z11 = this.f60725f;
        arrayList.add("label_is_plaintext=" + z11);
        l02 = e0.l0(arrayList, ", ", "Item{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1140newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j11, okio.i label, zt.a aVar, f fVar, okio.i reference_id, boolean z11, okio.i unknownFields) {
        super(f60719g, unknownFields);
        s.g(label, "label");
        s.g(reference_id, "reference_id");
        s.g(unknownFields, "unknownFields");
        this.f60720a = j11;
        this.f60721b = label;
        this.f60722c = aVar;
        this.f60723d = fVar;
        this.f60724e = reference_id;
        this.f60725f = z11;
    }
}