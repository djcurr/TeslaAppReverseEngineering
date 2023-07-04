package pv;

import android.graphics.Bitmap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f46999a;

    /* loaded from: classes2.dex */
    public static final class a extends z {
        public a(Bitmap bitmap) {
            super(bitmap, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends z {
        public b(Bitmap bitmap) {
            super(bitmap, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends z {

        /* renamed from: b  reason: collision with root package name */
        public static final c f47000b = new c();

        private c() {
            super(null, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends z {
        public d(Bitmap bitmap) {
            super(bitmap, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends z {

        /* renamed from: b  reason: collision with root package name */
        public static final e f47001b = new e();

        private e() {
            super(null, null);
        }
    }

    private z(Bitmap bitmap) {
        this.f46999a = bitmap;
    }

    public /* synthetic */ z(Bitmap bitmap, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap);
    }

    public final Bitmap a() {
        return this.f46999a;
    }
}