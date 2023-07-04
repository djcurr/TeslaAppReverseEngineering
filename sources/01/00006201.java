package com.teslamotors.plugins.ble;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class c {

    /* loaded from: classes6.dex */
    public static abstract class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private final String f22185a;

        /* renamed from: com.teslamotors.plugins.ble.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0406a extends a {

            /* renamed from: b  reason: collision with root package name */
            private final String f22186b;

            /* renamed from: c  reason: collision with root package name */
            private final EnumC0407a f22187c;

            /* renamed from: com.teslamotors.plugins.ble.c$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public enum EnumC0407a {
                SERVICE_NOT_BOUND,
                SERVICE_NULL,
                SERVICE_REMOTE_EXCEPTION
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0406a(String id2, EnumC0407a type) {
                super(id2, null);
                s.g(id2, "id");
                s.g(type, "type");
                this.f22186b = id2;
                this.f22187c = type;
            }

            @Override // com.teslamotors.plugins.ble.c.a
            public String a() {
                return this.f22186b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0406a) {
                    C0406a c0406a = (C0406a) obj;
                    return s.c(a(), c0406a.a()) && this.f22187c == c0406a.f22187c;
                }
                return false;
            }

            public int hashCode() {
                return (a().hashCode() * 31) + this.f22187c.hashCode();
            }

            public String toString() {
                String a11 = a();
                EnumC0407a enumC0407a = this.f22187c;
                return "TransmissionError(id=" + a11 + ", type=" + enumC0407a + ")";
            }
        }

        private a(String str) {
            super(null);
            this.f22185a = str;
        }

        public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public String a() {
            return this.f22185a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f22188a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(byte[] data) {
            super(null);
            s.g(data, "data");
            this.f22188a = data;
        }

        public final byte[] a() {
            return this.f22188a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.c(this.f22188a, ((b) obj).f22188a);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f22188a);
        }

        public String toString() {
            String arrays = Arrays.toString(this.f22188a);
            return "ReceivedData(data=" + arrays + ")";
        }
    }

    private c() {
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}