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
import n00.d;
import okio.i;
import wz.e0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BE\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0017J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016JD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012R\u001c\u0010\f\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\r\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u000e\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u000f\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/Season;", "Lcom/squareup/wire/f;", "", "newBuilder", "", "other", "", "equals", "", "hashCode", "", "toString", "from_day", "to_day", "from_month", "to_month", "Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriods;", "tou_periods", "Lokio/i;", "unknownFields", "copy", "I", "getFrom_day", "()I", "getTo_day", "getFrom_month", "getTo_month", "Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriods;", "getTou_periods", "()Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriods;", "<init>", "(IIIILcom/tesla/proto/energy/rate_tariff/v1/TOUPeriods;Lokio/i;)V", "Companion", "generated_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class Season extends f {
    public static final ProtoAdapter<Season> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "fromDay", label = q.a.OMIT_IDENTITY, tag = 1)
    private final int from_day;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "fromMonth", label = q.a.OMIT_IDENTITY, tag = 3)
    private final int from_month;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "toDay", label = q.a.OMIT_IDENTITY, tag = 2)
    private final int to_day;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "toMonth", label = q.a.OMIT_IDENTITY, tag = 4)
    private final int to_month;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.TOUPeriods#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 5)
    private final TOUPeriods tou_periods;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/Season$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/tesla/proto/energy/rate_tariff/v1/Season;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "", "serialVersionUID", "J", "<init>", "()V", "generated_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        final b bVar = b.LENGTH_DELIMITED;
        final d b11 = m0.b(Season.class);
        final o oVar = o.PROTO_3;
        ADAPTER = new ProtoAdapter<Season>(bVar, b11, oVar) { // from class: com.tesla.proto.energy.rate_tariff.v1.Season$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Season decode(k reader) {
                s.g(reader, "reader");
                long d11 = reader.d();
                TOUPeriods tOUPeriods = null;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new Season(i11, i12, i13, i14, tOUPeriods, reader.e(d11));
                    } else if (g11 == 1) {
                        i11 = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (g11 == 2) {
                        i12 = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (g11 == 3) {
                        i13 = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (g11 == 4) {
                        i14 = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (g11 != 5) {
                        reader.m(g11);
                    } else {
                        tOUPeriods = TOUPeriods.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(l writer, Season value) {
                s.g(writer, "writer");
                s.g(value, "value");
                if (value.getFrom_day() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getFrom_day()));
                }
                if (value.getTo_day() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(value.getTo_day()));
                }
                if (value.getFrom_month() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getFrom_month()));
                }
                if (value.getTo_month() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, Integer.valueOf(value.getTo_month()));
                }
                if (value.getTou_periods() != null) {
                    TOUPeriods.ADAPTER.encodeWithTag(writer, 5, value.getTou_periods());
                }
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Season value) {
                s.g(value, "value");
                int z11 = value.unknownFields().z();
                if (value.getFrom_day() != 0) {
                    z11 += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getFrom_day()));
                }
                if (value.getTo_day() != 0) {
                    z11 += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getTo_day()));
                }
                if (value.getFrom_month() != 0) {
                    z11 += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getFrom_month()));
                }
                if (value.getTo_month() != 0) {
                    z11 += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getTo_month()));
                }
                return value.getTou_periods() != null ? z11 + TOUPeriods.ADAPTER.encodedSizeWithTag(5, value.getTou_periods()) : z11;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Season redact(Season value) {
                s.g(value, "value");
                TOUPeriods tou_periods = value.getTou_periods();
                return Season.copy$default(value, 0, 0, 0, 0, tou_periods == null ? null : TOUPeriods.ADAPTER.redact(tou_periods), i.f42656d, 15, null);
            }
        };
    }

    public Season() {
        this(0, 0, 0, 0, null, null, 63, null);
    }

    public /* synthetic */ Season(int i11, int i12, int i13, int i14, TOUPeriods tOUPeriods, i iVar, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) == 0 ? i14 : 0, (i15 & 16) != 0 ? null : tOUPeriods, (i15 & 32) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ Season copy$default(Season season, int i11, int i12, int i13, int i14, TOUPeriods tOUPeriods, i iVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = season.from_day;
        }
        if ((i15 & 2) != 0) {
            i12 = season.to_day;
        }
        int i16 = i12;
        if ((i15 & 4) != 0) {
            i13 = season.from_month;
        }
        int i17 = i13;
        if ((i15 & 8) != 0) {
            i14 = season.to_month;
        }
        int i18 = i14;
        if ((i15 & 16) != 0) {
            tOUPeriods = season.tou_periods;
        }
        TOUPeriods tOUPeriods2 = tOUPeriods;
        if ((i15 & 32) != 0) {
            iVar = season.unknownFields();
        }
        return season.copy(i11, i16, i17, i18, tOUPeriods2, iVar);
    }

    public final Season copy(int i11, int i12, int i13, int i14, TOUPeriods tOUPeriods, i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new Season(i11, i12, i13, i14, tOUPeriods, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Season) {
            Season season = (Season) obj;
            return s.c(unknownFields(), season.unknownFields()) && this.from_day == season.from_day && this.to_day == season.to_day && this.from_month == season.from_month && this.to_month == season.to_month && s.c(this.tou_periods, season.tou_periods);
        }
        return false;
    }

    public final int getFrom_day() {
        return this.from_day;
    }

    public final int getFrom_month() {
        return this.from_month;
    }

    public final int getTo_day() {
        return this.to_day;
    }

    public final int getTo_month() {
        return this.to_month;
    }

    public final TOUPeriods getTou_periods() {
        return this.tou_periods;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.from_day)) * 37) + Integer.hashCode(this.to_day)) * 37) + Integer.hashCode(this.from_month)) * 37) + Integer.hashCode(this.to_month)) * 37;
            TOUPeriods tOUPeriods = this.tou_periods;
            int hashCode2 = hashCode + (tOUPeriods != null ? tOUPeriods.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m581newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.from_day;
        arrayList.add("from_day=" + i11);
        int i12 = this.to_day;
        arrayList.add("to_day=" + i12);
        int i13 = this.from_month;
        arrayList.add("from_month=" + i13);
        int i14 = this.to_month;
        arrayList.add("to_month=" + i14);
        TOUPeriods tOUPeriods = this.tou_periods;
        if (tOUPeriods != null) {
            arrayList.add("tou_periods=" + tOUPeriods);
        }
        l02 = e0.l0(arrayList, ", ", "Season{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m581newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Season(int i11, int i12, int i13, int i14, TOUPeriods tOUPeriods, i unknownFields) {
        super(ADAPTER, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.from_day = i11;
        this.to_day = i12;
        this.from_month = i13;
        this.to_month = i14;
        this.tou_periods = tOUPeriods;
    }
}