package com.tesla.proto.energy.rate_tariff.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.b;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import mr.d;
import okio.i;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import wz.e0;
import wz.w;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B¡\u0001\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b8\u00109J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J \u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001eR\u001c\u0010\f\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\r\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b$\u0010#R\u001c\u0010\u000e\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b%\u0010#R\u001c\u0010\u000f\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b&\u0010#R\u001c\u0010\u0014\u001a\u00020\u00138\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0015\u001a\u00020\u00138\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b*\u0010)R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010+\u001a\u0004\b,\u0010-R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b.\u0010-R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b/\u0010-R\u001c\u0010\u001a\u001a\u00020\u00138\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b0\u0010)R\u001c\u0010\u001b\u001a\u00020\u00138\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b1\u0010)R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00102\u001a\u0004\b3\u00104R\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/Tariff;", "Lcom/squareup/wire/f;", "", "newBuilder", "", "other", "", "equals", "", "hashCode", "", "toString", PaymentMethodOptionsParams.Blik.PARAM_CODE, "name", "utility", "currency", "", "Lcom/tesla/proto/energy/rate_tariff/v1/DailyCharge;", "daily_charges", "", "monthly_charges", "monthly_minimum_bill", "Lcom/tesla/proto/energy/rate_tariff/v1/Charges;", "demand_charges", "daily_demand_charges", "energy_charges", "max_applicable_demand", "min_applicable_demand", "Lcom/tesla/proto/energy/rate_tariff/v1/Seasons;", "seasons", "Lokio/i;", "unknownFields", "copy", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "getName", "getUtility", "getCurrency", "D", "getMonthly_charges", "()D", "getMonthly_minimum_bill", "Lcom/tesla/proto/energy/rate_tariff/v1/Charges;", "getDemand_charges", "()Lcom/tesla/proto/energy/rate_tariff/v1/Charges;", "getDaily_demand_charges", "getEnergy_charges", "getMax_applicable_demand", "getMin_applicable_demand", "Lcom/tesla/proto/energy/rate_tariff/v1/Seasons;", "getSeasons", "()Lcom/tesla/proto/energy/rate_tariff/v1/Seasons;", "Ljava/util/List;", "getDaily_charges", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;DDLcom/tesla/proto/energy/rate_tariff/v1/Charges;Lcom/tesla/proto/energy/rate_tariff/v1/Charges;Lcom/tesla/proto/energy/rate_tariff/v1/Charges;DDLcom/tesla/proto/energy/rate_tariff/v1/Seasons;Lokio/i;)V", "Companion", "generated_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class Tariff extends f {
    private static final long serialVersionUID = 0;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)
    private final String code;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 4)
    private final String currency;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.DailyCharge#ADAPTER", label = q.a.REPEATED, tag = 5)
    private final List<DailyCharge> daily_charges;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Charges#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 9)
    private final Charges daily_demand_charges;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Charges#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 8)
    private final Charges demand_charges;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Charges#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 10)
    private final Charges energy_charges;
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = q.a.OMIT_IDENTITY, tag = 11)
    private final double max_applicable_demand;
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = q.a.OMIT_IDENTITY, tag = 12)
    private final double min_applicable_demand;
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = q.a.OMIT_IDENTITY, tag = 6)
    private final double monthly_charges;
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = q.a.OMIT_IDENTITY, tag = 7)
    private final double monthly_minimum_bill;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 2)
    private final String name;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Seasons#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 13)
    private final Seasons seasons;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 3)
    private final String utility;
    public static final Companion Companion = new Companion(null);
    public static final ProtoAdapter<Tariff> ADAPTER = new ProtoAdapter<Tariff>(b.LENGTH_DELIMITED, m0.b(Tariff.class), o.PROTO_3) { // from class: com.tesla.proto.energy.rate_tariff.v1.Tariff$Companion$ADAPTER$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Tariff decode(k reader) {
            s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            String str = "";
            Charges charges = null;
            Charges charges2 = null;
            Charges charges3 = null;
            Seasons seasons = null;
            double d12 = 0.0d;
            double d13 = 0.0d;
            double d14 = 0.0d;
            double d15 = 0.0d;
            String str2 = "";
            String str3 = str2;
            String str4 = str3;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new Tariff(str, str2, str3, str4, arrayList, d12, d13, charges, charges2, charges3, d14, d15, seasons, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        str = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 2:
                        str2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 3:
                        str3 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 4:
                        str4 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 5:
                        arrayList.add(DailyCharge.ADAPTER.decode(reader));
                        break;
                    case 6:
                        d12 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        break;
                    case 7:
                        d13 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        break;
                    case 8:
                        charges = Charges.ADAPTER.decode(reader);
                        break;
                    case 9:
                        charges2 = Charges.ADAPTER.decode(reader);
                        break;
                    case 10:
                        charges3 = Charges.ADAPTER.decode(reader);
                        break;
                    case 11:
                        d14 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        break;
                    case 12:
                        d15 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        break;
                    case 13:
                        seasons = Seasons.ADAPTER.decode(reader);
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(l writer, Tariff value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!s.c(value.getCode(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getCode());
            }
            if (!s.c(value.getName(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getName());
            }
            if (!s.c(value.getUtility(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getUtility());
            }
            if (!s.c(value.getCurrency(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getCurrency());
            }
            DailyCharge.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.getDaily_charges());
            if (!(value.getMonthly_charges() == 0.0d)) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, Double.valueOf(value.getMonthly_charges()));
            }
            if (!(value.getMonthly_minimum_bill() == 0.0d)) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, Double.valueOf(value.getMonthly_minimum_bill()));
            }
            if (value.getDemand_charges() != null) {
                Charges.ADAPTER.encodeWithTag(writer, 8, value.getDemand_charges());
            }
            if (value.getDaily_demand_charges() != null) {
                Charges.ADAPTER.encodeWithTag(writer, 9, value.getDaily_demand_charges());
            }
            if (value.getEnergy_charges() != null) {
                Charges.ADAPTER.encodeWithTag(writer, 10, value.getEnergy_charges());
            }
            if (!(value.getMax_applicable_demand() == 0.0d)) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 11, Double.valueOf(value.getMax_applicable_demand()));
            }
            if (!(value.getMin_applicable_demand() == 0.0d)) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 12, Double.valueOf(value.getMin_applicable_demand()));
            }
            if (value.getSeasons() != null) {
                Seasons.ADAPTER.encodeWithTag(writer, 13, value.getSeasons());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Tariff value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!s.c(value.getCode(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCode());
            }
            if (!s.c(value.getName(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
            }
            if (!s.c(value.getUtility(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getUtility());
            }
            if (!s.c(value.getCurrency(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCurrency());
            }
            int encodedSizeWithTag = z11 + DailyCharge.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getDaily_charges());
            if (!(value.getMonthly_charges() == 0.0d)) {
                encodedSizeWithTag += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, Double.valueOf(value.getMonthly_charges()));
            }
            if (!(value.getMonthly_minimum_bill() == 0.0d)) {
                encodedSizeWithTag += ProtoAdapter.DOUBLE.encodedSizeWithTag(7, Double.valueOf(value.getMonthly_minimum_bill()));
            }
            if (value.getDemand_charges() != null) {
                encodedSizeWithTag += Charges.ADAPTER.encodedSizeWithTag(8, value.getDemand_charges());
            }
            if (value.getDaily_demand_charges() != null) {
                encodedSizeWithTag += Charges.ADAPTER.encodedSizeWithTag(9, value.getDaily_demand_charges());
            }
            if (value.getEnergy_charges() != null) {
                encodedSizeWithTag += Charges.ADAPTER.encodedSizeWithTag(10, value.getEnergy_charges());
            }
            if (!(value.getMax_applicable_demand() == 0.0d)) {
                encodedSizeWithTag += ProtoAdapter.DOUBLE.encodedSizeWithTag(11, Double.valueOf(value.getMax_applicable_demand()));
            }
            if (!(value.getMin_applicable_demand() == 0.0d)) {
                encodedSizeWithTag += ProtoAdapter.DOUBLE.encodedSizeWithTag(12, Double.valueOf(value.getMin_applicable_demand()));
            }
            return value.getSeasons() != null ? encodedSizeWithTag + Seasons.ADAPTER.encodedSizeWithTag(13, value.getSeasons()) : encodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Tariff redact(Tariff value) {
            s.g(value, "value");
            List a11 = d.a(value.getDaily_charges(), DailyCharge.ADAPTER);
            Charges demand_charges = value.getDemand_charges();
            Charges redact = demand_charges == null ? null : Charges.ADAPTER.redact(demand_charges);
            Charges daily_demand_charges = value.getDaily_demand_charges();
            Charges redact2 = daily_demand_charges == null ? null : Charges.ADAPTER.redact(daily_demand_charges);
            Charges energy_charges = value.getEnergy_charges();
            Charges redact3 = energy_charges == null ? null : Charges.ADAPTER.redact(energy_charges);
            Seasons seasons = value.getSeasons();
            return Tariff.copy$default(value, null, null, null, null, a11, 0.0d, 0.0d, redact, redact2, redact3, 0.0d, 0.0d, seasons == null ? null : Seasons.ADAPTER.redact(seasons), i.f42656d, 3183, null);
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/Tariff$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/tesla/proto/energy/rate_tariff/v1/Tariff;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "", "serialVersionUID", "J", "<init>", "()V", "generated_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Tariff() {
        this(null, null, null, null, null, 0.0d, 0.0d, null, null, null, 0.0d, 0.0d, null, null, 16383, null);
    }

    public /* synthetic */ Tariff(String str, String str2, String str3, String str4, List list, double d11, double d12, Charges charges, Charges charges2, Charges charges3, double d13, double d14, Seasons seasons, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) == 0 ? str4 : "", (i11 & 16) != 0 ? w.i() : list, (i11 & 32) != 0 ? 0.0d : d11, (i11 & 64) != 0 ? 0.0d : d12, (i11 & 128) != 0 ? null : charges, (i11 & 256) != 0 ? null : charges2, (i11 & 512) != 0 ? null : charges3, (i11 & 1024) != 0 ? 0.0d : d13, (i11 & 2048) != 0 ? 0.0d : d14, (i11 & 4096) != 0 ? null : seasons, (i11 & PKIFailureInfo.certRevoked) != 0 ? i.f42656d : iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Tariff copy$default(Tariff tariff, String str, String str2, String str3, String str4, List list, double d11, double d12, Charges charges, Charges charges2, Charges charges3, double d13, double d14, Seasons seasons, i iVar, int i11, Object obj) {
        return tariff.copy((i11 & 1) != 0 ? tariff.code : str, (i11 & 2) != 0 ? tariff.name : str2, (i11 & 4) != 0 ? tariff.utility : str3, (i11 & 8) != 0 ? tariff.currency : str4, (i11 & 16) != 0 ? tariff.daily_charges : list, (i11 & 32) != 0 ? tariff.monthly_charges : d11, (i11 & 64) != 0 ? tariff.monthly_minimum_bill : d12, (i11 & 128) != 0 ? tariff.demand_charges : charges, (i11 & 256) != 0 ? tariff.daily_demand_charges : charges2, (i11 & 512) != 0 ? tariff.energy_charges : charges3, (i11 & 1024) != 0 ? tariff.max_applicable_demand : d13, (i11 & 2048) != 0 ? tariff.min_applicable_demand : d14, (i11 & 4096) != 0 ? tariff.seasons : seasons, (i11 & PKIFailureInfo.certRevoked) != 0 ? tariff.unknownFields() : iVar);
    }

    public final Tariff copy(String code, String name, String utility, String currency, List<DailyCharge> daily_charges, double d11, double d12, Charges charges, Charges charges2, Charges charges3, double d13, double d14, Seasons seasons, i unknownFields) {
        s.g(code, "code");
        s.g(name, "name");
        s.g(utility, "utility");
        s.g(currency, "currency");
        s.g(daily_charges, "daily_charges");
        s.g(unknownFields, "unknownFields");
        return new Tariff(code, name, utility, currency, daily_charges, d11, d12, charges, charges2, charges3, d13, d14, seasons, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Tariff) {
            Tariff tariff = (Tariff) obj;
            if (s.c(unknownFields(), tariff.unknownFields()) && s.c(this.code, tariff.code) && s.c(this.name, tariff.name) && s.c(this.utility, tariff.utility) && s.c(this.currency, tariff.currency) && s.c(this.daily_charges, tariff.daily_charges)) {
                if (this.monthly_charges == tariff.monthly_charges) {
                    if ((this.monthly_minimum_bill == tariff.monthly_minimum_bill) && s.c(this.demand_charges, tariff.demand_charges) && s.c(this.daily_demand_charges, tariff.daily_demand_charges) && s.c(this.energy_charges, tariff.energy_charges)) {
                        if (this.max_applicable_demand == tariff.max_applicable_demand) {
                            return ((this.min_applicable_demand > tariff.min_applicable_demand ? 1 : (this.min_applicable_demand == tariff.min_applicable_demand ? 0 : -1)) == 0) && s.c(this.seasons, tariff.seasons);
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

    public final String getCode() {
        return this.code;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final List<DailyCharge> getDaily_charges() {
        return this.daily_charges;
    }

    public final Charges getDaily_demand_charges() {
        return this.daily_demand_charges;
    }

    public final Charges getDemand_charges() {
        return this.demand_charges;
    }

    public final Charges getEnergy_charges() {
        return this.energy_charges;
    }

    public final double getMax_applicable_demand() {
        return this.max_applicable_demand;
    }

    public final double getMin_applicable_demand() {
        return this.min_applicable_demand;
    }

    public final double getMonthly_charges() {
        return this.monthly_charges;
    }

    public final double getMonthly_minimum_bill() {
        return this.monthly_minimum_bill;
    }

    public final String getName() {
        return this.name;
    }

    public final Seasons getSeasons() {
        return this.seasons;
    }

    public final String getUtility() {
        return this.utility;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.code.hashCode()) * 37) + this.name.hashCode()) * 37) + this.utility.hashCode()) * 37) + this.currency.hashCode()) * 37) + this.daily_charges.hashCode()) * 37) + Double.hashCode(this.monthly_charges)) * 37) + Double.hashCode(this.monthly_minimum_bill)) * 37;
            Charges charges = this.demand_charges;
            int hashCode2 = (hashCode + (charges != null ? charges.hashCode() : 0)) * 37;
            Charges charges2 = this.daily_demand_charges;
            int hashCode3 = (hashCode2 + (charges2 != null ? charges2.hashCode() : 0)) * 37;
            Charges charges3 = this.energy_charges;
            int hashCode4 = (((((hashCode3 + (charges3 != null ? charges3.hashCode() : 0)) * 37) + Double.hashCode(this.max_applicable_demand)) * 37) + Double.hashCode(this.min_applicable_demand)) * 37;
            Seasons seasons = this.seasons;
            int hashCode5 = hashCode4 + (seasons != null ? seasons.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m585newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = d.i(this.code);
        arrayList.add("code=" + i11);
        String i12 = d.i(this.name);
        arrayList.add("name=" + i12);
        String i13 = d.i(this.utility);
        arrayList.add("utility=" + i13);
        String i14 = d.i(this.currency);
        arrayList.add("currency=" + i14);
        if (!this.daily_charges.isEmpty()) {
            List<DailyCharge> list = this.daily_charges;
            arrayList.add("daily_charges=" + list);
        }
        double d11 = this.monthly_charges;
        arrayList.add("monthly_charges=" + d11);
        double d12 = this.monthly_minimum_bill;
        arrayList.add("monthly_minimum_bill=" + d12);
        Charges charges = this.demand_charges;
        if (charges != null) {
            arrayList.add("demand_charges=" + charges);
        }
        Charges charges2 = this.daily_demand_charges;
        if (charges2 != null) {
            arrayList.add("daily_demand_charges=" + charges2);
        }
        Charges charges3 = this.energy_charges;
        if (charges3 != null) {
            arrayList.add("energy_charges=" + charges3);
        }
        double d13 = this.max_applicable_demand;
        arrayList.add("max_applicable_demand=" + d13);
        double d14 = this.min_applicable_demand;
        arrayList.add("min_applicable_demand=" + d14);
        Seasons seasons = this.seasons;
        if (seasons != null) {
            arrayList.add("seasons=" + seasons);
        }
        l02 = e0.l0(arrayList, ", ", "Tariff{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m585newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tariff(String code, String name, String utility, String currency, List<DailyCharge> daily_charges, double d11, double d12, Charges charges, Charges charges2, Charges charges3, double d13, double d14, Seasons seasons, i unknownFields) {
        super(ADAPTER, unknownFields);
        s.g(code, "code");
        s.g(name, "name");
        s.g(utility, "utility");
        s.g(currency, "currency");
        s.g(daily_charges, "daily_charges");
        s.g(unknownFields, "unknownFields");
        this.code = code;
        this.name = name;
        this.utility = utility;
        this.currency = currency;
        this.monthly_charges = d11;
        this.monthly_minimum_bill = d12;
        this.demand_charges = charges;
        this.daily_demand_charges = charges2;
        this.energy_charges = charges3;
        this.max_applicable_demand = d13;
        this.min_applicable_demand = d14;
        this.seasons = seasons;
        this.daily_charges = d.g("daily_charges", daily_charges);
    }
}