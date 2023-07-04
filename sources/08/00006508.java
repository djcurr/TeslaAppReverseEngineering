package d20;

import d20.d;

/* loaded from: classes5.dex */
public abstract class c {

    /* loaded from: classes5.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f23443a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final int f23444b;

        static {
            d.a aVar = d.f23446c;
            f23444b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        private a() {
        }

        @Override // d20.c
        public int a() {
            return f23444b;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f23445a = new b();

        private b() {
        }

        @Override // d20.c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}