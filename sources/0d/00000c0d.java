package b6;

import kotlin.jvm.internal.s;
import v20.a2;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final a2 f7410a;

    public a(a2 job) {
        s.g(job, "job");
        this.f7410a = job;
    }

    public boolean a() {
        return !this.f7410a.a();
    }

    @Override // b6.d
    public void dispose() {
        if (a()) {
            return;
        }
        a2.a.a(this.f7410a, null, 1, null);
    }
}