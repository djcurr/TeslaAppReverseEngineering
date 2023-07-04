package lr;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.p;
import ir.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.s;
import lr.a;
import n00.d;
import n00.h;
import n00.k;
import n00.l;
import n00.o;
import wz.b0;
import wz.e0;
import wz.r0;
import wz.x;

/* loaded from: classes2.dex */
public final class b implements f.d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object] */
    @Override // com.squareup.moshi.f.d
    public f<?> a(Type type, Set<? extends Annotation> annotations, p moshi) {
        Class<? extends Annotation> cls;
        int t11;
        int e11;
        int d11;
        List<a.C0707a> Y;
        int t12;
        List Q0;
        Object obj;
        String name;
        String name2;
        ?? r14;
        s.g(type, "type");
        s.g(annotations, "annotations");
        s.g(moshi, "moshi");
        boolean z11 = true;
        Object obj2 = null;
        if (!annotations.isEmpty()) {
            return null;
        }
        Class<?> a11 = e.a(type);
        if (a11.isInterface() || a11.isEnum()) {
            return null;
        }
        cls = c.f37309a;
        if (a11.isAnnotationPresent(cls) && !kr.b.j(a11)) {
            try {
                f<?> d12 = kr.b.d(moshi, type, a11);
                if (d12 != null) {
                    return d12;
                }
            } catch (RuntimeException e12) {
                if (!(e12.getCause() instanceof ClassNotFoundException)) {
                    throw e12;
                }
            }
            if (!a11.isLocalClass()) {
                d e13 = g00.a.e(a11);
                if (!e13.isAbstract()) {
                    if (!e13.j()) {
                        if (e13.l() == null) {
                            if (!e13.i()) {
                                h d13 = o00.b.d(e13);
                                if (d13 != null) {
                                    List<l> parameters = d13.getParameters();
                                    t11 = x.t(parameters, 10);
                                    e11 = r0.e(t11);
                                    d11 = m00.l.d(e11, 16);
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
                                    for (Object obj3 : parameters) {
                                        linkedHashMap.put(((l) obj3).getName(), obj3);
                                    }
                                    p00.a.a(d13, true);
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    for (o oVar : o00.b.c(e13)) {
                                        l lVar = (l) linkedHashMap.get(oVar.getName());
                                        Field b11 = p00.c.b(oVar);
                                        if (Modifier.isTransient(b11 != null ? b11.getModifiers() : 0)) {
                                            if (!((lVar == null || lVar.q()) ? z11 : false)) {
                                                throw new IllegalArgumentException(("No default value for transient constructor " + lVar).toString());
                                            }
                                        } else if ((lVar == null || s.c(lVar.getType(), oVar.getReturnType())) ? z11 : false) {
                                            if ((oVar instanceof k) || lVar != null) {
                                                p00.a.a(oVar, z11);
                                                Q0 = e0.Q0(oVar.getAnnotations());
                                                Iterator it2 = oVar.getAnnotations().iterator();
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        obj = obj2;
                                                        break;
                                                    }
                                                    obj = it2.next();
                                                    if (((Annotation) obj) instanceof ir.b) {
                                                        break;
                                                    }
                                                }
                                                ir.b bVar = (ir.b) obj;
                                                if (lVar != null) {
                                                    b0.z(Q0, lVar.getAnnotations());
                                                    if (bVar == null) {
                                                        Iterator it3 = lVar.getAnnotations().iterator();
                                                        while (true) {
                                                            if (!it3.hasNext()) {
                                                                r14 = 0;
                                                                break;
                                                            }
                                                            r14 = it3.next();
                                                            if (((Annotation) r14) instanceof ir.b) {
                                                                break;
                                                            }
                                                        }
                                                        bVar = r14;
                                                    }
                                                }
                                                if (bVar == null || (name = bVar.name()) == null) {
                                                    name = oVar.getName();
                                                }
                                                String str = name;
                                                Type o11 = kr.b.o(type, a11, p00.c.f(oVar.getReturnType()));
                                                Object[] array = Q0.toArray(new Annotation[0]);
                                                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                                                f adapter = moshi.f(o11, kr.b.l((Annotation[]) array), oVar.getName());
                                                String name3 = oVar.getName();
                                                String str2 = (bVar == null || (name2 = bVar.name()) == null) ? str : name2;
                                                s.f(adapter, "adapter");
                                                linkedHashMap2.put(name3, new a.C0707a(str, str2, adapter, oVar, lVar, lVar != null ? lVar.getIndex() : -1));
                                            }
                                        } else {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(CoreConstants.SINGLE_QUOTE_CHAR);
                                            sb2.append(oVar.getName());
                                            sb2.append("' has a constructor parameter of type ");
                                            s.e(lVar);
                                            sb2.append(lVar.getType());
                                            sb2.append(" but a property of type ");
                                            sb2.append(oVar.getReturnType());
                                            sb2.append(CoreConstants.DOT);
                                            throw new IllegalArgumentException(sb2.toString().toString());
                                        }
                                        z11 = true;
                                        obj2 = null;
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    for (l lVar2 : d13.getParameters()) {
                                        a.C0707a c0707a = (a.C0707a) kotlin.jvm.internal.r0.d(linkedHashMap2).remove(lVar2.getName());
                                        if (c0707a != null || lVar2.q()) {
                                            arrayList.add(c0707a);
                                        } else {
                                            throw new IllegalArgumentException(("No property for required constructor " + lVar2).toString());
                                        }
                                    }
                                    int size = arrayList.size();
                                    Iterator it4 = linkedHashMap2.entrySet().iterator();
                                    while (true) {
                                        int i11 = size;
                                        if (!it4.hasNext()) {
                                            break;
                                        }
                                        size = i11 + 1;
                                        arrayList.add(a.C0707a.b((a.C0707a) ((Map.Entry) it4.next()).getValue(), null, null, null, null, null, i11, 31, null));
                                    }
                                    Y = e0.Y(arrayList);
                                    t12 = x.t(Y, 10);
                                    ArrayList arrayList2 = new ArrayList(t12);
                                    for (a.C0707a c0707a2 : Y) {
                                        arrayList2.add(c0707a2.f());
                                    }
                                    Object[] array2 = arrayList2.toArray(new String[0]);
                                    Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                                    String[] strArr = (String[]) array2;
                                    h.b options = h.b.a((String[]) Arrays.copyOf(strArr, strArr.length));
                                    s.f(options, "options");
                                    return new a(d13, arrayList, Y, options).g();
                                }
                                return null;
                            }
                            throw new IllegalArgumentException(("Cannot reflectively serialize sealed class " + a11.getName() + ". Please register an adapter.").toString());
                        }
                        throw new IllegalArgumentException(("Cannot serialize object declaration " + a11.getName()).toString());
                    }
                    throw new IllegalArgumentException(("Cannot serialize inner class " + a11.getName()).toString());
                }
                throw new IllegalArgumentException(("Cannot serialize abstract class " + a11.getName()).toString());
            }
            throw new IllegalArgumentException(("Cannot serialize local class or object expression " + a11.getName()).toString());
        }
        return null;
    }
}