package b6;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public abstract class h {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final z5.l f7494a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f7495b;

        /* renamed from: c  reason: collision with root package name */
        private final v5.b f7496c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f7497d;

        public a(z5.l lVar, boolean z11, v5.b dataSource, boolean z12) {
            s.g(dataSource, "dataSource");
            this.f7494a = lVar;
            this.f7495b = z11;
            this.f7496c = dataSource;
            this.f7497d = z12;
        }

        public final v5.b a() {
            return this.f7496c;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    return s.c(this.f7494a, aVar.f7494a) && this.f7495b == aVar.f7495b && s.c(this.f7496c, aVar.f7496c) && this.f7497d == aVar.f7497d;
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            z5.l lVar = this.f7494a;
            int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
            boolean z11 = this.f7495b;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode + i11) * 31;
            v5.b bVar = this.f7496c;
            int hashCode2 = (i12 + (bVar != null ? bVar.hashCode() : 0)) * 31;
            boolean z12 = this.f7497d;
            return hashCode2 + (z12 ? 1 : z12 ? 1 : 0);
        }

        public String toString() {
            return "Metadata(memoryCacheKey=" + this.f7494a + ", isSampled=" + this.f7495b + ", dataSource=" + this.f7496c + ", isPlaceholderMemoryCacheKeyPresent=" + this.f7497d + ")";
        }
    }

    private h() {
    }

    public abstract Drawable a();

    public abstract g b();

    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}