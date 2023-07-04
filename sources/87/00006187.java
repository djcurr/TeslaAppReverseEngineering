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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBM\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0017J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016JL\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012R\u001e\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/Seasons;", "Lcom/squareup/wire/f;", "", "newBuilder", "", "other", "", "equals", "", "hashCode", "", "toString", "Lcom/tesla/proto/energy/rate_tariff/v1/Season;", "summer", "winter", "season3", "season4", "season5", "Lokio/i;", "unknownFields", "copy", "Lcom/tesla/proto/energy/rate_tariff/v1/Season;", "getSummer", "()Lcom/tesla/proto/energy/rate_tariff/v1/Season;", "getWinter", "getSeason3", "getSeason4", "getSeason5", "<init>", "(Lcom/tesla/proto/energy/rate_tariff/v1/Season;Lcom/tesla/proto/energy/rate_tariff/v1/Season;Lcom/tesla/proto/energy/rate_tariff/v1/Season;Lcom/tesla/proto/energy/rate_tariff/v1/Season;Lcom/tesla/proto/energy/rate_tariff/v1/Season;Lokio/i;)V", "Companion", "generated_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class Seasons extends f {
    private static final long serialVersionUID = 0;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Season#ADAPTER", jsonName = "Season3", label = q.a.OMIT_IDENTITY, tag = 3)
    private final Season season3;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Season#ADAPTER", jsonName = "Season4", label = q.a.OMIT_IDENTITY, tag = 4)
    private final Season season4;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Season#ADAPTER", jsonName = "Season5", label = q.a.OMIT_IDENTITY, tag = 5)
    private final Season season5;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Season#ADAPTER", jsonName = "Summer", label = q.a.OMIT_IDENTITY, tag = 1)
    private final Season summer;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Season#ADAPTER", jsonName = "Winter", label = q.a.OMIT_IDENTITY, tag = 2)
    private final Season winter;
    public static final Companion Companion = new Companion(null);
    public static final ProtoAdapter<Seasons> ADAPTER = new ProtoAdapter<Seasons>(b.LENGTH_DELIMITED, m0.b(Seasons.class), o.PROTO_3) { // from class: com.tesla.proto.energy.rate_tariff.v1.Seasons$Companion$ADAPTER$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Seasons decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            Season season = null;
            Season season2 = null;
            Season season3 = null;
            Season season4 = null;
            Season season5 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new Seasons(season, season2, season3, season4, season5, reader.e(d11));
                } else if (g11 == 1) {
                    season = Season.ADAPTER.decode(reader);
                } else if (g11 == 2) {
                    season2 = Season.ADAPTER.decode(reader);
                } else if (g11 == 3) {
                    season3 = Season.ADAPTER.decode(reader);
                } else if (g11 == 4) {
                    season4 = Season.ADAPTER.decode(reader);
                } else if (g11 != 5) {
                    reader.m(g11);
                } else {
                    season5 = Season.ADAPTER.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(l writer, Seasons value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.getSummer() != null) {
                Season.ADAPTER.encodeWithTag(writer, 1, value.getSummer());
            }
            if (value.getWinter() != null) {
                Season.ADAPTER.encodeWithTag(writer, 2, value.getWinter());
            }
            if (value.getSeason3() != null) {
                Season.ADAPTER.encodeWithTag(writer, 3, value.getSeason3());
            }
            if (value.getSeason4() != null) {
                Season.ADAPTER.encodeWithTag(writer, 4, value.getSeason4());
            }
            if (value.getSeason5() != null) {
                Season.ADAPTER.encodeWithTag(writer, 5, value.getSeason5());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Seasons value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.getSummer() != null) {
                z11 += Season.ADAPTER.encodedSizeWithTag(1, value.getSummer());
            }
            if (value.getWinter() != null) {
                z11 += Season.ADAPTER.encodedSizeWithTag(2, value.getWinter());
            }
            if (value.getSeason3() != null) {
                z11 += Season.ADAPTER.encodedSizeWithTag(3, value.getSeason3());
            }
            if (value.getSeason4() != null) {
                z11 += Season.ADAPTER.encodedSizeWithTag(4, value.getSeason4());
            }
            return value.getSeason5() != null ? z11 + Season.ADAPTER.encodedSizeWithTag(5, value.getSeason5()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Seasons redact(Seasons value) {
            s.g(value, "value");
            Season summer = value.getSummer();
            Season redact = summer == null ? null : Season.ADAPTER.redact(summer);
            Season winter = value.getWinter();
            Season redact2 = winter == null ? null : Season.ADAPTER.redact(winter);
            Season season3 = value.getSeason3();
            Season redact3 = season3 == null ? null : Season.ADAPTER.redact(season3);
            Season season4 = value.getSeason4();
            Season redact4 = season4 == null ? null : Season.ADAPTER.redact(season4);
            Season season5 = value.getSeason5();
            return value.copy(redact, redact2, redact3, redact4, season5 != null ? Season.ADAPTER.redact(season5) : null, i.f42656d);
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/Seasons$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/tesla/proto/energy/rate_tariff/v1/Seasons;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "", "serialVersionUID", "J", "<init>", "()V", "generated_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Seasons() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ Seasons(Season season, Season season2, Season season3, Season season4, Season season5, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : season, (i11 & 2) != 0 ? null : season2, (i11 & 4) != 0 ? null : season3, (i11 & 8) != 0 ? null : season4, (i11 & 16) == 0 ? season5 : null, (i11 & 32) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ Seasons copy$default(Seasons seasons, Season season, Season season2, Season season3, Season season4, Season season5, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            season = seasons.summer;
        }
        if ((i11 & 2) != 0) {
            season2 = seasons.winter;
        }
        Season season6 = season2;
        if ((i11 & 4) != 0) {
            season3 = seasons.season3;
        }
        Season season7 = season3;
        if ((i11 & 8) != 0) {
            season4 = seasons.season4;
        }
        Season season8 = season4;
        if ((i11 & 16) != 0) {
            season5 = seasons.season5;
        }
        Season season9 = season5;
        if ((i11 & 32) != 0) {
            iVar = seasons.unknownFields();
        }
        return seasons.copy(season, season6, season7, season8, season9, iVar);
    }

    public final Seasons copy(Season season, Season season2, Season season3, Season season4, Season season5, i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new Seasons(season, season2, season3, season4, season5, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Seasons) {
            Seasons seasons = (Seasons) obj;
            return s.c(unknownFields(), seasons.unknownFields()) && s.c(this.summer, seasons.summer) && s.c(this.winter, seasons.winter) && s.c(this.season3, seasons.season3) && s.c(this.season4, seasons.season4) && s.c(this.season5, seasons.season5);
        }
        return false;
    }

    public final Season getSeason3() {
        return this.season3;
    }

    public final Season getSeason4() {
        return this.season4;
    }

    public final Season getSeason5() {
        return this.season5;
    }

    public final Season getSummer() {
        return this.summer;
    }

    public final Season getWinter() {
        return this.winter;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Season season = this.summer;
            int hashCode2 = (hashCode + (season != null ? season.hashCode() : 0)) * 37;
            Season season2 = this.winter;
            int hashCode3 = (hashCode2 + (season2 != null ? season2.hashCode() : 0)) * 37;
            Season season3 = this.season3;
            int hashCode4 = (hashCode3 + (season3 != null ? season3.hashCode() : 0)) * 37;
            Season season4 = this.season4;
            int hashCode5 = (hashCode4 + (season4 != null ? season4.hashCode() : 0)) * 37;
            Season season5 = this.season5;
            int hashCode6 = hashCode5 + (season5 != null ? season5.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m582newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        Season season = this.summer;
        if (season != null) {
            arrayList.add("summer=" + season);
        }
        Season season2 = this.winter;
        if (season2 != null) {
            arrayList.add("winter=" + season2);
        }
        Season season3 = this.season3;
        if (season3 != null) {
            arrayList.add("season3=" + season3);
        }
        Season season4 = this.season4;
        if (season4 != null) {
            arrayList.add("season4=" + season4);
        }
        Season season5 = this.season5;
        if (season5 != null) {
            arrayList.add("season5=" + season5);
        }
        l02 = e0.l0(arrayList, ", ", "Seasons{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m582newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Seasons(Season season, Season season2, Season season3, Season season4, Season season5, i unknownFields) {
        super(ADAPTER, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.summer = season;
        this.winter = season2;
        this.season3 = season3;
        this.season4 = season4;
        this.season5 = season5;
    }
}