package net.time4j.engine;

/* loaded from: classes5.dex */
public class RuleNotFoundException extends ChronoException {
    private static final long serialVersionUID = -5638437652574160520L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RuleNotFoundException(w<?> wVar, p<?> pVar) {
        super(b(wVar, pVar));
    }

    private static String a(w<?> wVar, Object obj) {
        return "Cannot find any rule for chronological unit \"" + c(obj) + "\" in: " + wVar.p().getName();
    }

    private static String b(w<?> wVar, p<?> pVar) {
        return "Cannot find any rule for chronological element \"" + pVar.name() + "\" in: " + wVar.p().getName();
    }

    private static String c(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) Enum.class.cast(obj)).name();
        }
        return obj.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RuleNotFoundException(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RuleNotFoundException(w<?> wVar, Object obj) {
        super(a(wVar, obj));
    }
}