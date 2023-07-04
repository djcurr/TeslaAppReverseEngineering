package vz;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class i implements Comparable<i> {

    /* renamed from: e  reason: collision with root package name */
    public static final i f54764e;

    /* renamed from: a  reason: collision with root package name */
    private final int f54765a;

    /* renamed from: b  reason: collision with root package name */
    private final int f54766b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54767c;

    /* renamed from: d  reason: collision with root package name */
    private final int f54768d;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        f54764e = j.a();
    }

    public i(int i11, int i12, int i13) {
        this.f54765a = i11;
        this.f54766b = i12;
        this.f54767c = i13;
        this.f54768d = b(i11, i12, i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001d, code lost:
        if ((r7 >= 0 && r7 < 256) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int b(int r5, int r6, int r7) {
        /*
            r4 = this;
            r0 = 256(0x100, float:3.59E-43)
            r1 = 1
            r2 = 0
            if (r5 < 0) goto La
            if (r5 >= r0) goto La
            r3 = r1
            goto Lb
        La:
            r3 = r2
        Lb:
            if (r3 == 0) goto L20
            if (r6 < 0) goto L13
            if (r6 >= r0) goto L13
            r3 = r1
            goto L14
        L13:
            r3 = r2
        L14:
            if (r3 == 0) goto L20
            if (r7 < 0) goto L1c
            if (r7 >= r0) goto L1c
            r0 = r1
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 == 0) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            if (r1 == 0) goto L2a
            int r5 = r5 << 16
            int r6 = r6 << 8
            int r5 = r5 + r6
            int r5 = r5 + r7
            return r5
        L2a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Version components are out of range: "
            r0.append(r1)
            r0.append(r5)
            r5 = 46
            r0.append(r5)
            r0.append(r6)
            r0.append(r5)
            r0.append(r7)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vz.i.b(int, int, int):int");
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(i other) {
        kotlin.jvm.internal.s.g(other, "other");
        return this.f54768d - other.f54768d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i iVar = obj instanceof i ? (i) obj : null;
        return iVar != null && this.f54768d == iVar.f54768d;
    }

    public int hashCode() {
        return this.f54768d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f54765a);
        sb2.append(CoreConstants.DOT);
        sb2.append(this.f54766b);
        sb2.append(CoreConstants.DOT);
        sb2.append(this.f54767c);
        return sb2.toString();
    }

    public i(int i11, int i12) {
        this(i11, i12, 0);
    }
}