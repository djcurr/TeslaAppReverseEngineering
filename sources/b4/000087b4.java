package mt;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class t extends com.squareup.wire.f {

    /* renamed from: k */
    public static final ProtoAdapter<t> f39271k;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "activeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: a */
    private final boolean f39272a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "pinCodeSetOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: b */
    private final boolean f39273b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "maxLimitMphOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: c */
    private final float f39274c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "minLimitMphOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: d */
    private final float f39275d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "currentLimitMphOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: e */
    private final float f39276e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 103)

    /* renamed from: f */
    private final Boolean f39277f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "pinCodeSet", tag = 104)

    /* renamed from: g */
    private final Boolean f39278g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "maxLimitMph", tag = 106)

    /* renamed from: h */
    private final Float f39279h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "minLimitMph", tag = 107)

    /* renamed from: i */
    private final Float f39280i;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "currentLimitMph", tag = 108)

    /* renamed from: j */
    private final Float f39281j;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<t> {
        a(com.squareup.wire.b bVar, n00.d<t> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.SpeedLimitMode", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public t decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            Boolean bool = null;
            boolean z11 = false;
            boolean z12 = false;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            Boolean bool2 = null;
            Float f14 = null;
            Float f15 = null;
            Float f16 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new t(z11, z12, f11, f12, f13, bool, bool2, f14, f15, f16, reader.e(d11));
                } else if (g11 == 3) {
                    z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (g11 == 4) {
                    z12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (g11 == 6) {
                    f11 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                } else if (g11 == 7) {
                    f12 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                } else if (g11 == 8) {
                    f13 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                } else if (g11 == 103) {
                    bool = ProtoAdapter.BOOL.decode(reader);
                } else if (g11 != 104) {
                    switch (g11) {
                        case 106:
                            f14 = ProtoAdapter.FLOAT.decode(reader);
                            continue;
                        case 107:
                            f15 = ProtoAdapter.FLOAT.decode(reader);
                            continue;
                        case 108:
                            f16 = ProtoAdapter.FLOAT.decode(reader);
                            continue;
                        default:
                            reader.m(g11);
                            continue;
                    }
                } else {
                    bool2 = ProtoAdapter.BOOL.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, t value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.d()));
            }
            if (value.l()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.l()));
            }
            if (!(value.h() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 6, Float.valueOf(value.h()));
            }
            if (!(value.j() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 7, Float.valueOf(value.j()));
            }
            if (!(value.f() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 8, Float.valueOf(value.f()));
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(writer, 103, value.c());
            protoAdapter.encodeWithTag(writer, 104, value.k());
            ProtoAdapter<Float> protoAdapter2 = ProtoAdapter.FLOAT;
            protoAdapter2.encodeWithTag(writer, 106, value.g());
            protoAdapter2.encodeWithTag(writer, 107, value.i());
            protoAdapter2.encodeWithTag(writer, 108, value.e());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(t value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.d()));
            }
            if (value.l()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.l()));
            }
            if (!(value.h() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(6, Float.valueOf(value.h()));
            }
            if (!(value.j() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(7, Float.valueOf(value.j()));
            }
            if (!(value.f() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(8, Float.valueOf(value.f()));
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int encodedSizeWithTag = z11 + protoAdapter.encodedSizeWithTag(103, value.c()) + protoAdapter.encodedSizeWithTag(104, value.k());
            ProtoAdapter<Float> protoAdapter2 = ProtoAdapter.FLOAT;
            return encodedSizeWithTag + protoAdapter2.encodedSizeWithTag(106, value.g()) + protoAdapter2.encodedSizeWithTag(107, value.i()) + protoAdapter2.encodedSizeWithTag(108, value.e());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public t redact(t value) {
            kotlin.jvm.internal.s.g(value, "value");
            return t.b(value, false, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, okio.i.f42656d, 1023, null);
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
        f39271k = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(t.class), com.squareup.wire.o.PROTO_3);
    }

    public t() {
        this(false, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, 2047, null);
    }

    public /* synthetic */ t(boolean z11, boolean z12, float f11, float f12, float f13, Boolean bool, Boolean bool2, Float f14, Float f15, Float f16, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) == 0 ? z12 : false, (i11 & 4) != 0 ? 0.0f : f11, (i11 & 8) != 0 ? 0.0f : f12, (i11 & 16) == 0 ? f13 : BitmapDescriptorFactory.HUE_RED, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? null : bool2, (i11 & 128) != 0 ? null : f14, (i11 & 256) != 0 ? null : f15, (i11 & 512) == 0 ? f16 : null, (i11 & 1024) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ t b(t tVar, boolean z11, boolean z12, float f11, float f12, float f13, Boolean bool, Boolean bool2, Float f14, Float f15, Float f16, okio.i iVar, int i11, Object obj) {
        return tVar.a((i11 & 1) != 0 ? tVar.f39272a : z11, (i11 & 2) != 0 ? tVar.f39273b : z12, (i11 & 4) != 0 ? tVar.f39274c : f11, (i11 & 8) != 0 ? tVar.f39275d : f12, (i11 & 16) != 0 ? tVar.f39276e : f13, (i11 & 32) != 0 ? tVar.f39277f : bool, (i11 & 64) != 0 ? tVar.f39278g : bool2, (i11 & 128) != 0 ? tVar.f39279h : f14, (i11 & 256) != 0 ? tVar.f39280i : f15, (i11 & 512) != 0 ? tVar.f39281j : f16, (i11 & 1024) != 0 ? tVar.unknownFields() : iVar);
    }

    public final t a(boolean z11, boolean z12, float f11, float f12, float f13, Boolean bool, Boolean bool2, Float f14, Float f15, Float f16, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new t(z11, z12, f11, f12, f13, bool, bool2, f14, f15, f16, unknownFields);
    }

    public final Boolean c() {
        return this.f39277f;
    }

    public final boolean d() {
        return this.f39272a;
    }

    public final Float e() {
        return this.f39281j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (kotlin.jvm.internal.s.c(unknownFields(), tVar.unknownFields()) && this.f39272a == tVar.f39272a && this.f39273b == tVar.f39273b) {
                if (this.f39274c == tVar.f39274c) {
                    if (this.f39275d == tVar.f39275d) {
                        return ((this.f39276e > tVar.f39276e ? 1 : (this.f39276e == tVar.f39276e ? 0 : -1)) == 0) && kotlin.jvm.internal.s.c(this.f39277f, tVar.f39277f) && kotlin.jvm.internal.s.c(this.f39278g, tVar.f39278g) && kotlin.jvm.internal.s.b(this.f39279h, tVar.f39279h) && kotlin.jvm.internal.s.b(this.f39280i, tVar.f39280i) && kotlin.jvm.internal.s.b(this.f39281j, tVar.f39281j);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final float f() {
        return this.f39276e;
    }

    public final Float g() {
        return this.f39279h;
    }

    public final float h() {
        return this.f39274c;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f39272a)) * 37) + Boolean.hashCode(this.f39273b)) * 37) + Float.hashCode(this.f39274c)) * 37) + Float.hashCode(this.f39275d)) * 37) + Float.hashCode(this.f39276e)) * 37;
            Boolean bool = this.f39277f;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 37;
            Boolean bool2 = this.f39278g;
            int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
            Float f11 = this.f39279h;
            int hashCode4 = (hashCode3 + (f11 != null ? f11.hashCode() : 0)) * 37;
            Float f12 = this.f39280i;
            int hashCode5 = (hashCode4 + (f12 != null ? f12.hashCode() : 0)) * 37;
            Float f13 = this.f39281j;
            int hashCode6 = hashCode5 + (f13 != null ? f13.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }
        return i11;
    }

    public final Float i() {
        return this.f39280i;
    }

    public final float j() {
        return this.f39275d;
    }

    public final Boolean k() {
        return this.f39278g;
    }

    public final boolean l() {
        return this.f39273b;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m798newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f39272a;
        arrayList.add("active_OBSOLETE=" + z11);
        boolean z12 = this.f39273b;
        arrayList.add("pin_code_set_OBSOLETE=" + z12);
        float f11 = this.f39274c;
        arrayList.add("max_limit_mph_OBSOLETE=" + f11);
        float f12 = this.f39275d;
        arrayList.add("min_limit_mph_OBSOLETE=" + f12);
        float f13 = this.f39276e;
        arrayList.add("current_limit_mph_OBSOLETE=" + f13);
        Boolean bool = this.f39277f;
        if (bool != null) {
            arrayList.add("active=" + bool);
        }
        Boolean bool2 = this.f39278g;
        if (bool2 != null) {
            arrayList.add("pin_code_set=" + bool2);
        }
        Float f14 = this.f39279h;
        if (f14 != null) {
            arrayList.add("max_limit_mph=" + f14);
        }
        Float f15 = this.f39280i;
        if (f15 != null) {
            arrayList.add("min_limit_mph=" + f15);
        }
        Float f16 = this.f39281j;
        if (f16 != null) {
            arrayList.add("current_limit_mph=" + f16);
        }
        l02 = e0.l0(arrayList, ", ", "SpeedLimitMode{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m798newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z11, boolean z12, float f11, float f12, float f13, Boolean bool, Boolean bool2, Float f14, Float f15, Float f16, okio.i unknownFields) {
        super(f39271k, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f39272a = z11;
        this.f39273b = z12;
        this.f39274c = f11;
        this.f39275d = f12;
        this.f39276e = f13;
        this.f39277f = bool;
        this.f39278g = bool2;
        this.f39279h = f14;
        this.f39280i = f15;
        this.f39281j = f16;
    }
}