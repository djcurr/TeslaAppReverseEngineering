package io.grpc;

import expo.modules.interfaces.permissions.PermissionsResponse;
import io.grpc.a;
import io.grpc.m0;

/* loaded from: classes5.dex */
public abstract class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a.c<d0> f30547a = a.c.a("io.grpc.config-selector");

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final f1 f30548a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f30549b;

        /* renamed from: c  reason: collision with root package name */
        public h f30550c;

        /* loaded from: classes5.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Object f30551a;

            /* renamed from: b  reason: collision with root package name */
            private h f30552b;

            public b a() {
                com.google.common.base.u.v(this.f30551a != null, "config is not set");
                return new b(f1.f30562f, this.f30551a, this.f30552b);
            }

            public a b(Object obj) {
                this.f30551a = com.google.common.base.u.p(obj, "config");
                return this;
            }

            private a() {
            }
        }

        public static a d() {
            return new a();
        }

        public Object a() {
            return this.f30549b;
        }

        public h b() {
            return this.f30550c;
        }

        public f1 c() {
            return this.f30548a;
        }

        private b(f1 f1Var, Object obj, h hVar) {
            this.f30548a = (f1) com.google.common.base.u.p(f1Var, PermissionsResponse.STATUS_KEY);
            this.f30549b = obj;
            this.f30550c = hVar;
        }
    }

    public abstract b a(m0.f fVar);
}