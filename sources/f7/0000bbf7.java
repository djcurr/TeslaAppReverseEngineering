package w10;

import java.util.Collection;
import java.util.LinkedList;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes5.dex */
public final class l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [H] */
    /* loaded from: classes5.dex */
    public static final class a<H> extends u implements h00.l<H, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s20.f<H> f55395a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s20.f<H> fVar) {
            super(1);
            this.f55395a = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(Object obj) {
            invoke2((a<H>) obj);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(H it2) {
            s20.f<H> fVar = this.f55395a;
            s.f(it2, "it");
            fVar.add(it2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> a(Collection<? extends H> collection, h00.l<? super H, ? extends kotlin.reflect.jvm.internal.impl.descriptors.a> descriptorByHandle) {
        s.g(collection, "<this>");
        s.g(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        s20.f a11 = s20.f.f50187c.a();
        while (!linkedList.isEmpty()) {
            Object b02 = wz.u.b0(linkedList);
            s20.f a12 = s20.f.f50187c.a();
            Collection<? super H> q11 = j.q(b02, linkedList, descriptorByHandle, new a(a12));
            s.f(q11, "val conflictedHandles = …nflictedHandles.add(it) }");
            if (q11.size() == 1 && a12.isEmpty()) {
                Object B0 = wz.u.B0(q11);
                s.f(B0, "overridableGroup.single()");
                a11.add(B0);
            } else {
                Object obj = (Object) j.M(q11, descriptorByHandle);
                s.f(obj, "selectMostSpecificMember…roup, descriptorByHandle)");
                kotlin.reflect.jvm.internal.impl.descriptors.a invoke = descriptorByHandle.invoke(obj);
                for (Object it2 : q11) {
                    s.f(it2, "it");
                    if (!j.C(invoke, descriptorByHandle.invoke(it2))) {
                        a12.add(it2);
                    }
                }
                if (!a12.isEmpty()) {
                    a11.addAll(a12);
                }
                a11.add(obj);
            }
        }
        return a11;
    }
}