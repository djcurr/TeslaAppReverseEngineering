package c1;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class g1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final i f8472a;

    private /* synthetic */ g1(i iVar) {
        this.f8472a = iVar;
    }

    public static final /* synthetic */ g1 a(i iVar) {
        return new g1(iVar);
    }

    public static <T> i b(i composer) {
        kotlin.jvm.internal.s.g(composer, "composer");
        return composer;
    }

    public static boolean c(i iVar, Object obj) {
        return (obj instanceof g1) && kotlin.jvm.internal.s.c(iVar, ((g1) obj).f());
    }

    public static int d(i iVar) {
        return iVar.hashCode();
    }

    public static String e(i iVar) {
        return "SkippableUpdater(composer=" + iVar + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return c(this.f8472a, obj);
    }

    public final /* synthetic */ i f() {
        return this.f8472a;
    }

    public int hashCode() {
        return d(this.f8472a);
    }

    public String toString() {
        return e(this.f8472a);
    }
}