package atd.y;

import atd.z.d;
import com.adyen.threeds2.RuntimeErrorEvent;

/* loaded from: classes.dex */
public enum b {
    UNKNOWN(atd.s0.a.a(-803827563162176L), atd.s0.a.a(-803861922900544L)),
    MESSAGE_VERSIONS_MISMATCH(atd.s0.a.a(-804063786363456L), atd.s0.a.a(-803333641923136L)),
    MESSAGE_INDICES_MISMATCH(atd.s0.a.a(-803720188979776L), atd.s0.a.a(-803544095320640L)),
    ACTIVITY_WEAK_REFERENCE_MISSING(atd.s0.a.a(-803080238852672L), atd.s0.a.a(-802942799899200L)),
    ACTIVITY_REFERENCE_MISSING(atd.s0.a.a(-802135346047552L), atd.s0.a.a(-802534778006080L));
    
    private final String mErrorCode;
    private final String mErrorMessage;

    b(String str, String str2) {
        this.mErrorCode = str;
        this.mErrorMessage = str2;
    }

    public RuntimeErrorEvent a() {
        return new d(this.mErrorCode, this.mErrorMessage);
    }

    public RuntimeErrorEvent a(String str) {
        return new d(this.mErrorCode, this.mErrorMessage);
    }
}