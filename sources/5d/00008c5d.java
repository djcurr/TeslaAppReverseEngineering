package nf;

/* loaded from: classes3.dex */
public enum f {
    NOT_SET("not_set"),
    NETWORK("network"),
    DISK("disk"),
    ENCODED_MEM_CACHE("encoded_mem_cache");
    
    private final String mOrigin;

    f(String str) {
        this.mOrigin = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mOrigin;
    }
}