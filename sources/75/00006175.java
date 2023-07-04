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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BY\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016JX\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u0014R\u001e\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006$"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/Charges;", "Lcom/squareup/wire/f;", "", "newBuilder", "", "other", "", "equals", "", "hashCode", "", "toString", "Lcom/tesla/proto/energy/rate_tariff/v1/FixedCharge;", "all", "Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;", "summer", "winter", "season3", "season4", "season5", "Lokio/i;", "unknownFields", "copy", "Lcom/tesla/proto/energy/rate_tariff/v1/FixedCharge;", "getAll", "()Lcom/tesla/proto/energy/rate_tariff/v1/FixedCharge;", "Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;", "getSummer", "()Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;", "getWinter", "getSeason3", "getSeason4", "getSeason5", "<init>", "(Lcom/tesla/proto/energy/rate_tariff/v1/FixedCharge;Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;Lokio/i;)V", "Companion", "generated_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class Charges extends f {
    private static final long serialVersionUID = 0;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.FixedCharge#ADAPTER", jsonName = "ALL", label = q.a.OMIT_IDENTITY, tag = 1)
    private final FixedCharge all;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.RateBand#ADAPTER", jsonName = "Season3", label = q.a.OMIT_IDENTITY, tag = 4)
    private final RateBand season3;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.RateBand#ADAPTER", jsonName = "Season4", label = q.a.OMIT_IDENTITY, tag = 5)
    private final RateBand season4;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.RateBand#ADAPTER", jsonName = "Season5", label = q.a.OMIT_IDENTITY, tag = 6)
    private final RateBand season5;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.RateBand#ADAPTER", jsonName = "Summer", label = q.a.OMIT_IDENTITY, tag = 2)
    private final RateBand summer;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.RateBand#ADAPTER", jsonName = "Winter", label = q.a.OMIT_IDENTITY, tag = 3)
    private final RateBand winter;
    public static final Companion Companion = new Companion(null);
    public static final ProtoAdapter<Charges> ADAPTER = new ProtoAdapter<Charges>(b.LENGTH_DELIMITED, m0.b(Charges.class), o.PROTO_3) { // from class: com.tesla.proto.energy.rate_tariff.v1.Charges$Companion$ADAPTER$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Charges decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            FixedCharge fixedCharge = null;
            RateBand rateBand = null;
            RateBand rateBand2 = null;
            RateBand rateBand3 = null;
            RateBand rateBand4 = null;
            RateBand rateBand5 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new Charges(fixedCharge, rateBand, rateBand2, rateBand3, rateBand4, rateBand5, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        fixedCharge = FixedCharge.ADAPTER.decode(reader);
                        break;
                    case 2:
                        rateBand = RateBand.ADAPTER.decode(reader);
                        break;
                    case 3:
                        rateBand2 = RateBand.ADAPTER.decode(reader);
                        break;
                    case 4:
                        rateBand3 = RateBand.ADAPTER.decode(reader);
                        break;
                    case 5:
                        rateBand4 = RateBand.ADAPTER.decode(reader);
                        break;
                    case 6:
                        rateBand5 = RateBand.ADAPTER.decode(reader);
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(l writer, Charges value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.getAll() != null) {
                FixedCharge.ADAPTER.encodeWithTag(writer, 1, value.getAll());
            }
            if (value.getSummer() != null) {
                RateBand.ADAPTER.encodeWithTag(writer, 2, value.getSummer());
            }
            if (value.getWinter() != null) {
                RateBand.ADAPTER.encodeWithTag(writer, 3, value.getWinter());
            }
            if (value.getSeason3() != null) {
                RateBand.ADAPTER.encodeWithTag(writer, 4, value.getSeason3());
            }
            if (value.getSeason4() != null) {
                RateBand.ADAPTER.encodeWithTag(writer, 5, value.getSeason4());
            }
            if (value.getSeason5() != null) {
                RateBand.ADAPTER.encodeWithTag(writer, 6, value.getSeason5());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Charges value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.getAll() != null) {
                z11 += FixedCharge.ADAPTER.encodedSizeWithTag(1, value.getAll());
            }
            if (value.getSummer() != null) {
                z11 += RateBand.ADAPTER.encodedSizeWithTag(2, value.getSummer());
            }
            if (value.getWinter() != null) {
                z11 += RateBand.ADAPTER.encodedSizeWithTag(3, value.getWinter());
            }
            if (value.getSeason3() != null) {
                z11 += RateBand.ADAPTER.encodedSizeWithTag(4, value.getSeason3());
            }
            if (value.getSeason4() != null) {
                z11 += RateBand.ADAPTER.encodedSizeWithTag(5, value.getSeason4());
            }
            return value.getSeason5() != null ? z11 + RateBand.ADAPTER.encodedSizeWithTag(6, value.getSeason5()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Charges redact(Charges value) {
            s.g(value, "value");
            FixedCharge all = value.getAll();
            FixedCharge redact = all == null ? null : FixedCharge.ADAPTER.redact(all);
            RateBand summer = value.getSummer();
            RateBand redact2 = summer == null ? null : RateBand.ADAPTER.redact(summer);
            RateBand winter = value.getWinter();
            RateBand redact3 = winter == null ? null : RateBand.ADAPTER.redact(winter);
            RateBand season3 = value.getSeason3();
            RateBand redact4 = season3 == null ? null : RateBand.ADAPTER.redact(season3);
            RateBand season4 = value.getSeason4();
            RateBand redact5 = season4 == null ? null : RateBand.ADAPTER.redact(season4);
            RateBand season5 = value.getSeason5();
            return value.copy(redact, redact2, redact3, redact4, redact5, season5 != null ? RateBand.ADAPTER.redact(season5) : null, i.f42656d);
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/Charges$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/tesla/proto/energy/rate_tariff/v1/Charges;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "", "serialVersionUID", "J", "<init>", "()V", "generated_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Charges() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public /* synthetic */ Charges(FixedCharge fixedCharge, RateBand rateBand, RateBand rateBand2, RateBand rateBand3, RateBand rateBand4, RateBand rateBand5, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : fixedCharge, (i11 & 2) != 0 ? null : rateBand, (i11 & 4) != 0 ? null : rateBand2, (i11 & 8) != 0 ? null : rateBand3, (i11 & 16) != 0 ? null : rateBand4, (i11 & 32) == 0 ? rateBand5 : null, (i11 & 64) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ Charges copy$default(Charges charges, FixedCharge fixedCharge, RateBand rateBand, RateBand rateBand2, RateBand rateBand3, RateBand rateBand4, RateBand rateBand5, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fixedCharge = charges.all;
        }
        if ((i11 & 2) != 0) {
            rateBand = charges.summer;
        }
        RateBand rateBand6 = rateBand;
        if ((i11 & 4) != 0) {
            rateBand2 = charges.winter;
        }
        RateBand rateBand7 = rateBand2;
        if ((i11 & 8) != 0) {
            rateBand3 = charges.season3;
        }
        RateBand rateBand8 = rateBand3;
        if ((i11 & 16) != 0) {
            rateBand4 = charges.season4;
        }
        RateBand rateBand9 = rateBand4;
        if ((i11 & 32) != 0) {
            rateBand5 = charges.season5;
        }
        RateBand rateBand10 = rateBand5;
        if ((i11 & 64) != 0) {
            iVar = charges.unknownFields();
        }
        return charges.copy(fixedCharge, rateBand6, rateBand7, rateBand8, rateBand9, rateBand10, iVar);
    }

    public final Charges copy(FixedCharge fixedCharge, RateBand rateBand, RateBand rateBand2, RateBand rateBand3, RateBand rateBand4, RateBand rateBand5, i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new Charges(fixedCharge, rateBand, rateBand2, rateBand3, rateBand4, rateBand5, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Charges) {
            Charges charges = (Charges) obj;
            return s.c(unknownFields(), charges.unknownFields()) && s.c(this.all, charges.all) && s.c(this.summer, charges.summer) && s.c(this.winter, charges.winter) && s.c(this.season3, charges.season3) && s.c(this.season4, charges.season4) && s.c(this.season5, charges.season5);
        }
        return false;
    }

    public final FixedCharge getAll() {
        return this.all;
    }

    public final RateBand getSeason3() {
        return this.season3;
    }

    public final RateBand getSeason4() {
        return this.season4;
    }

    public final RateBand getSeason5() {
        return this.season5;
    }

    public final RateBand getSummer() {
        return this.summer;
    }

    public final RateBand getWinter() {
        return this.winter;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            FixedCharge fixedCharge = this.all;
            int hashCode2 = (hashCode + (fixedCharge != null ? fixedCharge.hashCode() : 0)) * 37;
            RateBand rateBand = this.summer;
            int hashCode3 = (hashCode2 + (rateBand != null ? rateBand.hashCode() : 0)) * 37;
            RateBand rateBand2 = this.winter;
            int hashCode4 = (hashCode3 + (rateBand2 != null ? rateBand2.hashCode() : 0)) * 37;
            RateBand rateBand3 = this.season3;
            int hashCode5 = (hashCode4 + (rateBand3 != null ? rateBand3.hashCode() : 0)) * 37;
            RateBand rateBand4 = this.season4;
            int hashCode6 = (hashCode5 + (rateBand4 != null ? rateBand4.hashCode() : 0)) * 37;
            RateBand rateBand5 = this.season5;
            int hashCode7 = hashCode6 + (rateBand5 != null ? rateBand5.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m576newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        FixedCharge fixedCharge = this.all;
        if (fixedCharge != null) {
            arrayList.add("all=" + fixedCharge);
        }
        RateBand rateBand = this.summer;
        if (rateBand != null) {
            arrayList.add("summer=" + rateBand);
        }
        RateBand rateBand2 = this.winter;
        if (rateBand2 != null) {
            arrayList.add("winter=" + rateBand2);
        }
        RateBand rateBand3 = this.season3;
        if (rateBand3 != null) {
            arrayList.add("season3=" + rateBand3);
        }
        RateBand rateBand4 = this.season4;
        if (rateBand4 != null) {
            arrayList.add("season4=" + rateBand4);
        }
        RateBand rateBand5 = this.season5;
        if (rateBand5 != null) {
            arrayList.add("season5=" + rateBand5);
        }
        l02 = e0.l0(arrayList, ", ", "Charges{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m576newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Charges(FixedCharge fixedCharge, RateBand rateBand, RateBand rateBand2, RateBand rateBand3, RateBand rateBand4, RateBand rateBand5, i unknownFields) {
        super(ADAPTER, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.all = fixedCharge;
        this.summer = rateBand;
        this.winter = rateBand2;
        this.season3 = rateBand3;
        this.season4 = rateBand4;
        this.season5 = rateBand5;
    }
}