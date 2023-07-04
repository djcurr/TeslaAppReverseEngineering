package atd.i;

/* loaded from: classes.dex */
public class c extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final a f6880a;

    /* loaded from: classes.dex */
    public enum a {
        MARKET_OR_REGIONAL_RESTRICTION(atd.s0.a.a(-75036037540416L)),
        UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED(atd.s0.a.a(-75229311068736L)),
        MISSING_PERMISSION(atd.s0.a.a(-75057512376896L)),
        PARAMETER_NULL_OR_BLANK(atd.s0.a.a(-75173476493888L));
        
        private final String mCode;

        a(String str) {
            this.mCode = str;
        }

        public String a() {
            return this.mCode;
        }
    }

    public c(a aVar, Throwable th2) {
        super(th2);
        this.f6880a = aVar;
    }

    public String a() {
        return this.f6880a.a();
    }
}