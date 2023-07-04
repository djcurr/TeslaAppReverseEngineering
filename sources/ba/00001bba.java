package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a */
    public final String f13567a;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private String f13568a;

        public j0 a() {
            return new j0(this.f13568a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        return ak.k0.c(this.f13567a, ((j0) obj).f13567a);
    }

    public int hashCode() {
        String str = this.f13567a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    private j0(String str) {
        this.f13567a = str;
    }
}