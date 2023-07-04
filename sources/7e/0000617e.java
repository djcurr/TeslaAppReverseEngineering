package com.tesla.proto.energy.rate_tariff.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.b;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import okio.i;
import wz.e0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBC\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0017J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012R\u001c\u0010\r\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000e\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u000f\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0010\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\u0011\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;", "Lcom/squareup/wire/f;", "", "newBuilder", "", "other", "", "equals", "", "hashCode", "", "toString", "", "all", "on_peak", "partial_peak", "off_peak", "super_off_peak", "Lokio/i;", "unknownFields", "copy", "D", "getAll", "()D", "getOn_peak", "getPartial_peak", "getOff_peak", "getSuper_off_peak", "<init>", "(DDDDDLokio/i;)V", "Companion", "generated_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class RateBand extends f {
    private static final long serialVersionUID = 0;
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "ALL", label = q.a.OMIT_IDENTITY, tag = 1)
    private final double all;
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "OFF_PEAK", label = q.a.OMIT_IDENTITY, tag = 4)
    private final double off_peak;
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "ON_PEAK", label = q.a.OMIT_IDENTITY, tag = 2)
    private final double on_peak;
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "PARTIAL_PEAK", label = q.a.OMIT_IDENTITY, tag = 3)
    private final double partial_peak;
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "SUPER_OFF_PEAK", label = q.a.OMIT_IDENTITY, tag = 5)
    private final double super_off_peak;
    public static final Companion Companion = new Companion(null);
    public static final ProtoAdapter<RateBand> ADAPTER = new ProtoAdapter<RateBand>(b.LENGTH_DELIMITED, m0.b(RateBand.class), o.PROTO_3) { // from class: com.tesla.proto.energy.rate_tariff.v1.RateBand$Companion$ADAPTER$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public RateBand decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            double d12 = 0.0d;
            double d13 = 0.0d;
            double d14 = 0.0d;
            double d15 = 0.0d;
            double d16 = 0.0d;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new RateBand(d12, d13, d14, d15, d16, reader.e(d11));
                }
                if (g11 == 1) {
                    d12 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                } else if (g11 == 2) {
                    d13 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                } else if (g11 == 3) {
                    d14 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                } else if (g11 == 4) {
                    d15 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                } else if (g11 != 5) {
                    reader.m(g11);
                } else {
                    d16 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(l writer, RateBand value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!(value.getAll() == 0.0d)) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, Double.valueOf(value.getAll()));
            }
            if (!(value.getOn_peak() == 0.0d)) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, Double.valueOf(value.getOn_peak()));
            }
            if (!(value.getPartial_peak() == 0.0d)) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, Double.valueOf(value.getPartial_peak()));
            }
            if (!(value.getOff_peak() == 0.0d)) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, Double.valueOf(value.getOff_peak()));
            }
            if (!(value.getSuper_off_peak() == 0.0d)) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, Double.valueOf(value.getSuper_off_peak()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(RateBand value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!(value.getAll() == 0.0d)) {
                z11 += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getAll()));
            }
            if (!(value.getOn_peak() == 0.0d)) {
                z11 += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getOn_peak()));
            }
            if (!(value.getPartial_peak() == 0.0d)) {
                z11 += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getPartial_peak()));
            }
            if (!(value.getOff_peak() == 0.0d)) {
                z11 += ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getOff_peak()));
            }
            return !(value.getSuper_off_peak() == 0.0d) ? z11 + ProtoAdapter.DOUBLE.encodedSizeWithTag(5, Double.valueOf(value.getSuper_off_peak())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public RateBand redact(RateBand value) {
            s.g(value, "value");
            return RateBand.copy$default(value, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, i.f42656d, 31, null);
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/RateBand$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "", "serialVersionUID", "J", "<init>", "()V", "generated_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RateBand() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 63, null);
    }

    public /* synthetic */ RateBand(double d11, double d12, double d13, double d14, double d15, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d11, (i11 & 2) != 0 ? 0.0d : d12, (i11 & 4) != 0 ? 0.0d : d13, (i11 & 8) != 0 ? 0.0d : d14, (i11 & 16) == 0 ? d15 : 0.0d, (i11 & 32) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ RateBand copy$default(RateBand rateBand, double d11, double d12, double d13, double d14, double d15, i iVar, int i11, Object obj) {
        return rateBand.copy((i11 & 1) != 0 ? rateBand.all : d11, (i11 & 2) != 0 ? rateBand.on_peak : d12, (i11 & 4) != 0 ? rateBand.partial_peak : d13, (i11 & 8) != 0 ? rateBand.off_peak : d14, (i11 & 16) != 0 ? rateBand.super_off_peak : d15, (i11 & 32) != 0 ? rateBand.unknownFields() : iVar);
    }

    public final RateBand copy(double d11, double d12, double d13, double d14, double d15, i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new RateBand(d11, d12, d13, d14, d15, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RateBand) {
            RateBand rateBand = (RateBand) obj;
            if (s.c(unknownFields(), rateBand.unknownFields())) {
                if (this.all == rateBand.all) {
                    if (this.on_peak == rateBand.on_peak) {
                        if (this.partial_peak == rateBand.partial_peak) {
                            if (this.off_peak == rateBand.off_peak) {
                                return (this.super_off_peak > rateBand.super_off_peak ? 1 : (this.super_off_peak == rateBand.super_off_peak ? 0 : -1)) == 0;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final double getAll() {
        return this.all;
    }

    public final double getOff_peak() {
        return this.off_peak;
    }

    public final double getOn_peak() {
        return this.on_peak;
    }

    public final double getPartial_peak() {
        return this.partial_peak;
    }

    public final double getSuper_off_peak() {
        return this.super_off_peak;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((((unknownFields().hashCode() * 37) + Double.hashCode(this.all)) * 37) + Double.hashCode(this.on_peak)) * 37) + Double.hashCode(this.partial_peak)) * 37) + Double.hashCode(this.off_peak)) * 37) + Double.hashCode(this.super_off_peak);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m579newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        double d11 = this.all;
        arrayList.add("all=" + d11);
        double d12 = this.on_peak;
        arrayList.add("on_peak=" + d12);
        double d13 = this.partial_peak;
        arrayList.add("partial_peak=" + d13);
        double d14 = this.off_peak;
        arrayList.add("off_peak=" + d14);
        double d15 = this.super_off_peak;
        arrayList.add("super_off_peak=" + d15);
        l02 = e0.l0(arrayList, ", ", "RateBand{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m579newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateBand(double d11, double d12, double d13, double d14, double d15, i unknownFields) {
        super(ADAPTER, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.all = d11;
        this.on_peak = d12;
        this.partial_peak = d13;
        this.off_peak = d14;
        this.super_off_peak = d15;
    }
}