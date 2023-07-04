package atd.e;

/* loaded from: classes.dex */
public enum e {
    Y(atd.s0.a.a(-86585204599360L)),
    N(atd.s0.a.a(-86327506561600L));
    
    public static final String INVALID_TRANS_STATUS_MSG = atd.s0.a.a(-87263809432128L);
    private final String mValue;

    e(String str) {
        this.mValue = str;
    }

    public static e a(String str) {
        e[] values;
        if (str == null || str.isEmpty()) {
            return null;
        }
        for (e eVar : values()) {
            if (str.equalsIgnoreCase(eVar.mValue)) {
                return eVar;
            }
        }
        throw new atd.a0.a(atd.s0.a.a(-87143550347840L) + str, c.DATA_ELEMENT_INVALID_FORMAT);
    }

    public String a() {
        return this.mValue;
    }
}