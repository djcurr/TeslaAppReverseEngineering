package m10;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.w;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final s f38318a;

    /* renamed from: b  reason: collision with root package name */
    private final List<s> f38319b;

    public k() {
        this(null, null, 3, null);
    }

    public k(s sVar, List<s> parametersInfo) {
        kotlin.jvm.internal.s.g(parametersInfo, "parametersInfo");
        this.f38318a = sVar;
        this.f38319b = parametersInfo;
    }

    public final List<s> a() {
        return this.f38319b;
    }

    public final s b() {
        return this.f38318a;
    }

    public /* synthetic */ k(s sVar, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : sVar, (i11 & 2) != 0 ? w.i() : list);
    }
}