package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class s extends r {
    public static StringBuilder j(StringBuilder sb2, String... value) {
        kotlin.jvm.internal.s.g(sb2, "<this>");
        kotlin.jvm.internal.s.g(value, "value");
        for (String str : value) {
            sb2.append(str);
        }
        return sb2;
    }
}