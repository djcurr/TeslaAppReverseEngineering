package o00;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.m0;
import n00.g;
import n00.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class a extends e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final o f42035a = new a();

    a() {
    }

    @Override // n00.o
    public Object get(Object obj) {
        return b.f((n00.d) obj);
    }

    @Override // kotlin.jvm.internal.f, n00.c
    public String getName() {
        return "superclasses";
    }

    @Override // kotlin.jvm.internal.f
    public g getOwner() {
        return m0.d(b.class, "kotlin-reflection");
    }

    @Override // kotlin.jvm.internal.f
    public String getSignature() {
        return "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;";
    }
}