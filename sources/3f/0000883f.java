package mz;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f39654a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39655b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str, String str2) {
        this.f39654a = str;
        this.f39655b = str2;
    }

    public String a() {
        return this.f39655b;
    }

    public String b() {
        return this.f39654a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return Objects.equals(b(), cVar.b()) && Objects.equals(a(), cVar.a());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(b(), a());
    }
}