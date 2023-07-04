package androidx.work;

import ch.qos.logback.core.CoreConstants;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private UUID f6483a;

    /* renamed from: b  reason: collision with root package name */
    private a f6484b;

    /* renamed from: c  reason: collision with root package name */
    private e f6485c;

    /* renamed from: d  reason: collision with root package name */
    private Set<String> f6486d;

    /* renamed from: e  reason: collision with root package name */
    private e f6487e;

    /* renamed from: f  reason: collision with root package name */
    private int f6488f;

    /* loaded from: classes.dex */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public a0(UUID uuid, a aVar, e eVar, List<String> list, e eVar2, int i11) {
        this.f6483a = uuid;
        this.f6484b = aVar;
        this.f6485c = eVar;
        this.f6486d = new HashSet(list);
        this.f6487e = eVar2;
        this.f6488f = i11;
    }

    public a a() {
        return this.f6484b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f6488f == a0Var.f6488f && this.f6483a.equals(a0Var.f6483a) && this.f6484b == a0Var.f6484b && this.f6485c.equals(a0Var.f6485c) && this.f6486d.equals(a0Var.f6486d)) {
            return this.f6487e.equals(a0Var.f6487e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f6483a.hashCode() * 31) + this.f6484b.hashCode()) * 31) + this.f6485c.hashCode()) * 31) + this.f6486d.hashCode()) * 31) + this.f6487e.hashCode()) * 31) + this.f6488f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f6483a + CoreConstants.SINGLE_QUOTE_CHAR + ", mState=" + this.f6484b + ", mOutputData=" + this.f6485c + ", mTags=" + this.f6486d + ", mProgress=" + this.f6487e + CoreConstants.CURLY_RIGHT;
    }
}