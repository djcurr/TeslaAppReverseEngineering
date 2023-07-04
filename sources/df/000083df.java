package lt;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class i extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<i> f37429d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final boolean f37430a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "lowerChargeLimit", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final float f37431b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "upperChargeLimit", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final float f37432c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<i> {
        a(com.squareup.wire.b bVar, n00.d<i> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ChargeOnSolarFeature", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public i decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            float f11 = BitmapDescriptorFactory.HUE_RED;
            boolean z11 = false;
            float f12 = 0.0f;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new i(z11, f11, f12, reader.e(d11));
                }
                if (g11 == 1) {
                    z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (g11 == 2) {
                    f11 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    f12 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, i value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.c()));
            }
            if (!(value.d() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 2, Float.valueOf(value.d()));
            }
            if (!(value.e() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 3, Float.valueOf(value.e()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(i value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.c()));
            }
            if (!(value.d() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.d()));
            }
            return !(value.e() == BitmapDescriptorFactory.HUE_RED) ? z11 + ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.e())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public i redact(i value) {
            kotlin.jvm.internal.s.g(value, "value");
            return i.b(value, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, okio.i.f42656d, 7, null);
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
        f37429d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(i.class), com.squareup.wire.o.PROTO_3);
    }

    public i() {
        this(false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 15, null);
    }

    public /* synthetic */ i(boolean z11, float f11, float f12, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? 0.0f : f11, (i11 & 4) != 0 ? 0.0f : f12, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ i b(i iVar, boolean z11, float f11, float f12, okio.i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = iVar.f37430a;
        }
        if ((i11 & 2) != 0) {
            f11 = iVar.f37431b;
        }
        if ((i11 & 4) != 0) {
            f12 = iVar.f37432c;
        }
        if ((i11 & 8) != 0) {
            iVar2 = iVar.unknownFields();
        }
        return iVar.a(z11, f11, f12, iVar2);
    }

    public final i a(boolean z11, float f11, float f12, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new i(z11, f11, f12, unknownFields);
    }

    public final boolean c() {
        return this.f37430a;
    }

    public final float d() {
        return this.f37431b;
    }

    public final float e() {
        return this.f37432c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (kotlin.jvm.internal.s.c(unknownFields(), iVar.unknownFields()) && this.f37430a == iVar.f37430a) {
                if (this.f37431b == iVar.f37431b) {
                    return (this.f37432c > iVar.f37432c ? 1 : (this.f37432c == iVar.f37432c ? 0 : -1)) == 0;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f37430a)) * 37) + Float.hashCode(this.f37431b)) * 37) + Float.hashCode(this.f37432c);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m687newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f37430a;
        arrayList.add("enabled=" + z11);
        float f11 = this.f37431b;
        arrayList.add("lower_charge_limit=" + f11);
        float f12 = this.f37432c;
        arrayList.add("upper_charge_limit=" + f12);
        l02 = wz.e0.l0(arrayList, ", ", "ChargeOnSolarFeature{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m687newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z11, float f11, float f12, okio.i unknownFields) {
        super(f37429d, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37430a = z11;
        this.f37431b = f11;
        this.f37432c = f12;
    }
}