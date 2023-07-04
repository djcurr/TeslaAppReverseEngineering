package x00;

import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.descriptors.h;

/* loaded from: classes5.dex */
public interface c {

    /* loaded from: classes5.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f56635a = new a();

        private a() {
        }

        @Override // x00.c
        public boolean b(w00.c classDescriptor, h functionDescriptor) {
            s.g(classDescriptor, "classDescriptor");
            s.g(functionDescriptor, "functionDescriptor");
            return true;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f56636a = new b();

        private b() {
        }

        @Override // x00.c
        public boolean b(w00.c classDescriptor, h functionDescriptor) {
            s.g(classDescriptor, "classDescriptor");
            s.g(functionDescriptor, "functionDescriptor");
            return !functionDescriptor.getAnnotations().b1(d.a());
        }
    }

    boolean b(w00.c cVar, h hVar);
}