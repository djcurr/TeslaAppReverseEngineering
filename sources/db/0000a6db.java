package ot;

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
public final class a extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<a> f43994d;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f43995a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final boolean f43996b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final boolean f43997c;

    /* renamed from: ot.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0874a extends ProtoAdapter<a> {
        C0874a(com.squareup.wire.b bVar, n00.d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.AddKeyPayload", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public a decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            boolean z11 = false;
            boolean z12 = false;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new a(iVar, z11, z12, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 == 2) {
                    z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    z12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, a value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!s.c(value.c(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.c());
            }
            if (value.d()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.d()));
            }
            if (value.e()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.e()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(a value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!s.c(value.c(), okio.i.f42656d)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.c());
            }
            if (value.d()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.d()));
            }
            return value.e() ? z11 + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.e())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public a redact(a value) {
            s.g(value, "value");
            return a.b(value, null, false, false, okio.i.f42656d, 7, null);
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
        f43994d = new C0874a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(a.class), o.PROTO_3);
    }

    public a() {
        this(null, false, false, null, 15, null);
    }

    public /* synthetic */ a(okio.i iVar, boolean z11, boolean z12, okio.i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.i.f42656d : iVar, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ a b(a aVar, okio.i iVar, boolean z11, boolean z12, okio.i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = aVar.f43995a;
        }
        if ((i11 & 2) != 0) {
            z11 = aVar.f43996b;
        }
        if ((i11 & 4) != 0) {
            z12 = aVar.f43997c;
        }
        if ((i11 & 8) != 0) {
            iVar2 = aVar.unknownFields();
        }
        return aVar.a(iVar, z11, z12, iVar2);
    }

    public final a a(okio.i publicKey, boolean z11, boolean z12, okio.i unknownFields) {
        s.g(publicKey, "publicKey");
        s.g(unknownFields, "unknownFields");
        return new a(publicKey, z11, z12, unknownFields);
    }

    public final okio.i c() {
        return this.f43995a;
    }

    public final boolean d() {
        return this.f43996b;
    }

    public final boolean e() {
        return this.f43997c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(unknownFields(), aVar.unknownFields()) && s.c(this.f43995a, aVar.f43995a) && this.f43996b == aVar.f43996b && this.f43997c == aVar.f43997c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + this.f43995a.hashCode()) * 37) + Boolean.hashCode(this.f43996b)) * 37) + Boolean.hashCode(this.f43997c);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m957newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f43995a;
        arrayList.add("publicKey=" + iVar);
        boolean z11 = this.f43996b;
        arrayList.add("isBackupKey=" + z11);
        boolean z12 = this.f43997c;
        arrayList.add("isFleetKey=" + z12);
        l02 = e0.l0(arrayList, ", ", "AddKeyPayload{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m957newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(okio.i publicKey, boolean z11, boolean z12, okio.i unknownFields) {
        super(f43994d, unknownFields);
        s.g(publicKey, "publicKey");
        s.g(unknownFields, "unknownFields");
        this.f43995a = publicKey;
        this.f43996b = z11;
        this.f43997c = z12;
    }
}