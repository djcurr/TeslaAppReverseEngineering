package atd.e;

import java.util.Locale;

/* loaded from: classes.dex */
public enum d {
    CHALLENGE_REQUEST(atd.s0.a.a(-86971751656000L)),
    CHALLENGE_RESPONSE(atd.s0.a.a(-87349708778048L)),
    ERROR(atd.s0.a.a(-87405543352896L));
    
    private final String mValue;

    d(String str) {
        this.mValue = str;
    }

    public static d a(String str) {
        d[] dVarArr;
        for (d dVar : (d[]) d.class.getEnumConstants()) {
            if (dVar.a().equals(str)) {
                return dVar;
            }
        }
        throw new atd.a0.a(String.format(Locale.ENGLISH, atd.s0.a.a(-87023291263552L), str), c.MESSAGE_RECEIVED_INVALID);
    }

    public String a() {
        return this.mValue;
    }
}