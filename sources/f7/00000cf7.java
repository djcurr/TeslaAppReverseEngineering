package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class a3 extends com.squareup.wire.f {

    /* renamed from: g  reason: collision with root package name */
    public static final ProtoAdapter<a3> f7924g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final boolean f7925a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7926b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7927c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7928d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final boolean f7929e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final boolean f7930f;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<a3> {
        a(com.squareup.wire.b bVar, n00.d<a3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.TPMSAlarms", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public a3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new a3(z11, z12, z13, z14, z15, z16, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 2:
                        z12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 3:
                        z13 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 4:
                        z14 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 5:
                        z15 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 6:
                        z16 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, a3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.e()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.e()));
            }
            if (value.f()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.f()));
            }
            if (value.c()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.c()));
            }
            if (value.g()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.g()));
            }
            if (value.d()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.d()));
            }
            if (value.h()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.h()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(a3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.e()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.e()));
            }
            if (value.f()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.f()));
            }
            if (value.c()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.c()));
            }
            if (value.g()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.g()));
            }
            if (value.d()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.d()));
            }
            return value.h() ? z11 + ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.h())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public a3 redact(a3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return a3.b(value, false, false, false, false, false, false, okio.i.f42656d, 63, null);
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
        f7924g = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(a3.class), com.squareup.wire.o.PROTO_3);
    }

    public a3() {
        this(false, false, false, false, false, false, null, 127, null);
    }

    public /* synthetic */ a3(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? false : z14, (i11 & 16) != 0 ? false : z15, (i11 & 32) == 0 ? z16 : false, (i11 & 64) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ a3 b(a3 a3Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = a3Var.f7925a;
        }
        if ((i11 & 2) != 0) {
            z12 = a3Var.f7926b;
        }
        boolean z17 = z12;
        if ((i11 & 4) != 0) {
            z13 = a3Var.f7927c;
        }
        boolean z18 = z13;
        if ((i11 & 8) != 0) {
            z14 = a3Var.f7928d;
        }
        boolean z19 = z14;
        if ((i11 & 16) != 0) {
            z15 = a3Var.f7929e;
        }
        boolean z21 = z15;
        if ((i11 & 32) != 0) {
            z16 = a3Var.f7930f;
        }
        boolean z22 = z16;
        if ((i11 & 64) != 0) {
            iVar = a3Var.unknownFields();
        }
        return a3Var.a(z11, z17, z18, z19, z21, z22, iVar);
    }

    public final a3 a(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new a3(z11, z12, z13, z14, z15, z16, unknownFields);
    }

    public final boolean c() {
        return this.f7927c;
    }

    public final boolean d() {
        return this.f7929e;
    }

    public final boolean e() {
        return this.f7925a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a3) {
            a3 a3Var = (a3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), a3Var.unknownFields()) && this.f7925a == a3Var.f7925a && this.f7926b == a3Var.f7926b && this.f7927c == a3Var.f7927c && this.f7928d == a3Var.f7928d && this.f7929e == a3Var.f7929e && this.f7930f == a3Var.f7930f;
        }
        return false;
    }

    public final boolean f() {
        return this.f7926b;
    }

    public final boolean g() {
        return this.f7928d;
    }

    public final boolean h() {
        return this.f7930f;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f7925a)) * 37) + Boolean.hashCode(this.f7926b)) * 37) + Boolean.hashCode(this.f7927c)) * 37) + Boolean.hashCode(this.f7928d)) * 37) + Boolean.hashCode(this.f7929e)) * 37) + Boolean.hashCode(this.f7930f);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m11newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f7925a;
        arrayList.add("pressure=" + z11);
        boolean z12 = this.f7926b;
        arrayList.add("temperature=" + z12);
        boolean z13 = this.f7927c;
        arrayList.add("acceleration=" + z13);
        boolean z14 = this.f7928d;
        arrayList.add("voltage=" + z14);
        boolean z15 = this.f7929e;
        arrayList.add("LFDetect=" + z15);
        boolean z16 = this.f7930f;
        arrayList.add("wheelMotion=" + z16);
        l02 = wz.e0.l0(arrayList, ", ", "TPMSAlarms{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m11newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, okio.i unknownFields) {
        super(f7924g, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f7925a = z11;
        this.f7926b = z12;
        this.f7927c = z13;
        this.f7928d = z14;
        this.f7929e = z15;
        this.f7930f = z16;
    }
}