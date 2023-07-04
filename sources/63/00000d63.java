package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class h0 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<h0> f8029d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UpdaterLocation#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final p3 f8030a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f8031b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final okio.i f8032c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<h0> {
        a(com.squareup.wire.b bVar, n00.d<h0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.CodeDescriptor", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public h0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            p3 p3Var = p3.UPDATER_LOCATION_NONE;
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            int i11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new h0(p3Var, i11, iVar, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        p3Var = p3.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 == 2) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, h0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d() != p3.UPDATER_LOCATION_NONE) {
                p3.ADAPTER.encodeWithTag(writer, 1, value.d());
            }
            if (value.e() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.e()));
            }
            if (!kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(h0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d() != p3.UPDATER_LOCATION_NONE) {
                z11 += p3.ADAPTER.encodedSizeWithTag(1, value.d());
            }
            if (value.e() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.e()));
            }
            return !kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(3, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public h0 redact(h0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return h0.b(value, null, 0, null, okio.i.f42656d, 7, null);
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
        f8029d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(h0.class), com.squareup.wire.o.PROTO_3);
    }

    public h0() {
        this(null, 0, null, null, 15, null);
    }

    public /* synthetic */ h0(p3 p3Var, int i11, okio.i iVar, okio.i iVar2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? p3.UPDATER_LOCATION_NONE : p3Var, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? okio.i.f42656d : iVar, (i12 & 8) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ h0 b(h0 h0Var, p3 p3Var, int i11, okio.i iVar, okio.i iVar2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            p3Var = h0Var.f8030a;
        }
        if ((i12 & 2) != 0) {
            i11 = h0Var.f8031b;
        }
        if ((i12 & 4) != 0) {
            iVar = h0Var.f8032c;
        }
        if ((i12 & 8) != 0) {
            iVar2 = h0Var.unknownFields();
        }
        return h0Var.a(p3Var, i11, iVar, iVar2);
    }

    public final h0 a(p3 codeDescriptorLocation, int i11, okio.i codeDescriptorBytes, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(codeDescriptorLocation, "codeDescriptorLocation");
        kotlin.jvm.internal.s.g(codeDescriptorBytes, "codeDescriptorBytes");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new h0(codeDescriptorLocation, i11, codeDescriptorBytes, unknownFields);
    }

    public final okio.i c() {
        return this.f8032c;
    }

    public final p3 d() {
        return this.f8030a;
    }

    public final int e() {
        return this.f8031b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), h0Var.unknownFields()) && this.f8030a == h0Var.f8030a && this.f8031b == h0Var.f8031b && kotlin.jvm.internal.s.c(this.f8032c, h0Var.f8032c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + this.f8030a.hashCode()) * 37) + Integer.hashCode(this.f8031b)) * 37) + this.f8032c.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m34newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        p3 p3Var = this.f8030a;
        arrayList.add("codeDescriptorLocation=" + p3Var);
        int i11 = this.f8031b;
        arrayList.add("version=" + i11);
        okio.i iVar = this.f8032c;
        arrayList.add("codeDescriptorBytes=" + iVar);
        l02 = wz.e0.l0(arrayList, ", ", "CodeDescriptor{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m34newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(p3 codeDescriptorLocation, int i11, okio.i codeDescriptorBytes, okio.i unknownFields) {
        super(f8029d, unknownFields);
        kotlin.jvm.internal.s.g(codeDescriptorLocation, "codeDescriptorLocation");
        kotlin.jvm.internal.s.g(codeDescriptorBytes, "codeDescriptorBytes");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8030a = codeDescriptorLocation;
        this.f8031b = i11;
        this.f8032c = codeDescriptorBytes;
    }
}