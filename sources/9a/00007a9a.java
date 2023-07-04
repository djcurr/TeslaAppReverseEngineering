package j$.time.format;

import j$.time.ZoneOffset;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements j$.time.temporal.u {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f32890a = new a();

    private /* synthetic */ a() {
    }

    @Override // j$.time.temporal.u
    public final Object a(j$.time.temporal.k kVar) {
        int i11 = f.f32896f;
        int i12 = j$.time.temporal.t.f32969a;
        j$.time.k kVar2 = (j$.time.k) kVar.d(j$.time.temporal.m.f32962a);
        if (kVar2 == null || (kVar2 instanceof ZoneOffset)) {
            return null;
        }
        return kVar2;
    }
}