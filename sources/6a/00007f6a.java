package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class n {
    public static <T> void a(Appendable appendable, T t11, h00.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.s.g(appendable, "<this>");
        if (lVar != null) {
            appendable.append(lVar.invoke(t11));
            return;
        }
        if (t11 == null ? true : t11 instanceof CharSequence) {
            appendable.append((CharSequence) t11);
        } else if (t11 instanceof Character) {
            appendable.append(((Character) t11).charValue());
        } else {
            appendable.append(String.valueOf(t11));
        }
    }
}