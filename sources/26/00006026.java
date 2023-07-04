package com.tesla.data.oapi;

import com.squareup.moshi.p;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21724a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final p f21725b;

    static {
        p d11 = new p.b().b(SeatHeaterAdapter.f21645a).b(SeatHeaterLevelAdapter.f21646a).b(DoorAdapter.f21596a).b(ClimateKeeperModeLevelAdapter.f21590a).b(StwHeatLevelAdapter.f21698a).b(SeatPositionAdapter.f21647a).b(OverrideModeAdapter.f21624a).b(ClimateOverrideModeAdapter.f21594a).b(CoolingLevelAdapter.f21595a).b(TrunkAdapter.f21710a).b(WindowControlCommandAdapter.f21723a).b(SunroofStateChangeAdapter.f21702a).d();
        s.f(d11, "Builder()\n    .add(SeatH…angeAdapter)\n    .build()");
        f21725b = d11;
    }

    private a() {
    }

    public final p a() {
        return f21725b;
    }
}