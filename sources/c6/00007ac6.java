package j$.time.temporal;

import j$.time.ZoneOffset;

/* loaded from: classes7.dex */
public final /* synthetic */ class p implements u {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ p f32965a = new p();

    private /* synthetic */ p() {
    }

    @Override // j$.time.temporal.u
    public final Object a(k kVar) {
        int i11 = t.f32969a;
        a aVar = a.OFFSET_SECONDS;
        if (kVar.c(aVar)) {
            return ZoneOffset.q(kVar.b(aVar));
        }
        return null;
    }
}