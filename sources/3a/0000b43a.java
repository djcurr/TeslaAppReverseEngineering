package t1;

import android.graphics.Shader;

/* loaded from: classes.dex */
public final class t {

    /* loaded from: classes.dex */
    public static final class a extends z0 {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Shader f51507c;

        a(Shader shader) {
            this.f51507c = shader;
        }

        @Override // t1.z0
        public Shader b(long j11) {
            return this.f51507c;
        }
    }

    public static final z0 a(Shader shader) {
        kotlin.jvm.internal.s.g(shader, "shader");
        return new a(shader);
    }
}