package androidx.room;

import v4.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final h.c f5792a;

    /* renamed from: b  reason: collision with root package name */
    private final a f5793b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(h.c cVar, a aVar) {
        this.f5792a = cVar;
        this.f5793b = aVar;
    }

    @Override // v4.h.c
    /* renamed from: b */
    public i a(h.b bVar) {
        return new i(this.f5792a.a(bVar), this.f5793b);
    }
}