package nu;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f41872a;

    /* renamed from: b  reason: collision with root package name */
    private final int f41873b;

    public c(int i11, int i12) {
        this.f41872a = i11;
        this.f41873b = i12;
    }

    public final int a() {
        return this.f41873b;
    }

    public final int b() {
        return this.f41872a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f41872a == cVar.f41872a && this.f41873b == cVar.f41873b;
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f41872a) * 31) + Integer.hashCode(this.f41873b);
    }

    public String toString() {
        int i11 = this.f41872a;
        int i12 = this.f41873b;
        return "NotificationContent(title=" + i11 + ", icon=" + i12 + ")";
    }

    public /* synthetic */ c(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i13 & 2) != 0 ? e.f41874a : i12);
    }
}