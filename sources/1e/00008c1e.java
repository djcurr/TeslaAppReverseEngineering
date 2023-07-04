package net.time4j.tz;

import java.io.Serializable;

/* loaded from: classes5.dex */
class e implements k, Serializable {
    private static final long serialVersionUID = -4889632013137688471L;
    private final String tzid;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str) {
        this.tzid = str;
    }

    @Override // net.time4j.tz.k
    public String a() {
        return this.tzid;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.tzid.equals(((e) obj).tzid);
        }
        return false;
    }

    public int hashCode() {
        return this.tzid.hashCode();
    }

    public String toString() {
        return e.class.getName() + "@" + this.tzid;
    }
}