package q10;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import m00.i;
import wz.e0;
import wz.n0;
import wz.x;

/* loaded from: classes5.dex */
public final class a extends r10.a {

    /* renamed from: f  reason: collision with root package name */
    public static final C1018a f47328f = new C1018a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final a f47329g = new a(1, 0, 7);

    /* renamed from: q10.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C1018a {
        private C1018a() {
        }

        public /* synthetic */ C1018a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(InputStream stream) {
            int t11;
            int[] N0;
            s.g(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            i iVar = new i(1, dataInputStream.readInt());
            t11 = x.t(iVar, 10);
            ArrayList arrayList = new ArrayList(t11);
            Iterator<Integer> it2 = iVar.iterator();
            while (it2.hasNext()) {
                ((n0) it2).a();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            N0 = e0.N0(arrayList);
            return new a(Arrays.copyOf(N0, N0.length));
        }
    }

    static {
        new a(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        s.g(numbers, "numbers");
    }

    public boolean h() {
        return f(f47329g);
    }
}