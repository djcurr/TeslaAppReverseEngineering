package p20;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public interface g {

    /* loaded from: classes5.dex */
    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f45914a = new a();

        private a() {
        }

        @Override // p20.g
        public boolean a(w00.i what, w00.i from) {
            s.g(what, "what");
            s.g(from, "from");
            return true;
        }
    }

    boolean a(w00.i iVar, w00.i iVar2);
}