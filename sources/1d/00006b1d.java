package expo.modules.kotlin.records;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.allocators.ObjectConstructor;
import expo.modules.kotlin.allocators.ObjectConstructorFactory;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.FieldCastException;
import expo.modules.kotlin.exception.FieldRequiredException;
import expo.modules.kotlin.exception.RecordCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.types.TypeConverter;
import expo.modules.kotlin.types.TypeConverterProvider;
import g00.a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import n00.d;
import n00.f;
import n00.o;
import n00.p;
import o00.b;
import p00.c;
import vz.b0;
import vz.v;
import wz.e0;
import wz.s0;
import wz.x;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001#B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002J&\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\t\u0012\u0002\b\u00030\bH\u0002J\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\t\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lexpo/modules/kotlin/records/RecordTypeConverter;", "Lexpo/modules/kotlin/records/Record;", "T", "Lexpo/modules/kotlin/types/TypeConverter;", "Ljava/lang/Class;", "clazz", "Lexpo/modules/kotlin/allocators/ObjectConstructor;", "getObjectConstructor", "Ln00/o;", "", "property", "", "Lexpo/modules/kotlin/records/FieldValidator;", "getValidators", "Lcom/facebook/react/bridge/Dynamic;", "value", "convertNonOptional", "(Lcom/facebook/react/bridge/Dynamic;)Lexpo/modules/kotlin/records/Record;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "Lexpo/modules/kotlin/allocators/ObjectConstructorFactory;", "objectConstructorFactory", "Lexpo/modules/kotlin/allocators/ObjectConstructorFactory;", "", "Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;", "propertyDescriptors", "Ljava/util/Map;", "Ln00/p;", "type", "Ln00/p;", "getType", "()Ln00/p;", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Ln00/p;)V", "PropertyDescriptor", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class RecordTypeConverter<T extends Record> extends TypeConverter<T> {
    private final TypeConverterProvider converterProvider;
    private final ObjectConstructorFactory objectConstructorFactory;
    private final Map<o<? extends Object, ?>, PropertyDescriptor> propertyDescriptors;
    private final p type;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\u0004\b!\u0010\"J\r\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bHÆ\u0003J?\u0010\u000f\u001a\u00020\u00002\f\b\u0002\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\u0012\b\u0002\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\r\u0010\u001dR#\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;", "", "Lexpo/modules/kotlin/types/TypeConverter;", "component1", "Lexpo/modules/kotlin/records/Field;", "component2", "", "component3", "", "Lexpo/modules/kotlin/records/FieldValidator;", "component4", "typeConverter", "fieldAnnotation", "isRequired", "validators", "copy", "", "toString", "", "hashCode", "other", "equals", "Lexpo/modules/kotlin/types/TypeConverter;", "getTypeConverter", "()Lexpo/modules/kotlin/types/TypeConverter;", "Lexpo/modules/kotlin/records/Field;", "getFieldAnnotation", "()Lexpo/modules/kotlin/records/Field;", "Z", "()Z", "Ljava/util/List;", "getValidators", "()Ljava/util/List;", "<init>", "(Lexpo/modules/kotlin/types/TypeConverter;Lexpo/modules/kotlin/records/Field;ZLjava/util/List;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public static final class PropertyDescriptor {
        private final Field fieldAnnotation;
        private final boolean isRequired;
        private final TypeConverter<?> typeConverter;
        private final List<FieldValidator<?>> validators;

        /* JADX WARN: Multi-variable type inference failed */
        public PropertyDescriptor(TypeConverter<?> typeConverter, Field fieldAnnotation, boolean z11, List<? extends FieldValidator<?>> validators) {
            s.g(typeConverter, "typeConverter");
            s.g(fieldAnnotation, "fieldAnnotation");
            s.g(validators, "validators");
            this.typeConverter = typeConverter;
            this.fieldAnnotation = fieldAnnotation;
            this.isRequired = z11;
            this.validators = validators;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PropertyDescriptor copy$default(PropertyDescriptor propertyDescriptor, TypeConverter typeConverter, Field field, boolean z11, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                typeConverter = propertyDescriptor.typeConverter;
            }
            if ((i11 & 2) != 0) {
                field = propertyDescriptor.fieldAnnotation;
            }
            if ((i11 & 4) != 0) {
                z11 = propertyDescriptor.isRequired;
            }
            if ((i11 & 8) != 0) {
                list = propertyDescriptor.validators;
            }
            return propertyDescriptor.copy(typeConverter, field, z11, list);
        }

        public final TypeConverter<?> component1() {
            return this.typeConverter;
        }

        public final Field component2() {
            return this.fieldAnnotation;
        }

        public final boolean component3() {
            return this.isRequired;
        }

        public final List<FieldValidator<?>> component4() {
            return this.validators;
        }

        public final PropertyDescriptor copy(TypeConverter<?> typeConverter, Field fieldAnnotation, boolean z11, List<? extends FieldValidator<?>> validators) {
            s.g(typeConverter, "typeConverter");
            s.g(fieldAnnotation, "fieldAnnotation");
            s.g(validators, "validators");
            return new PropertyDescriptor(typeConverter, fieldAnnotation, z11, validators);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PropertyDescriptor) {
                PropertyDescriptor propertyDescriptor = (PropertyDescriptor) obj;
                return s.c(this.typeConverter, propertyDescriptor.typeConverter) && s.c(this.fieldAnnotation, propertyDescriptor.fieldAnnotation) && this.isRequired == propertyDescriptor.isRequired && s.c(this.validators, propertyDescriptor.validators);
            }
            return false;
        }

        public final Field getFieldAnnotation() {
            return this.fieldAnnotation;
        }

        public final TypeConverter<?> getTypeConverter() {
            return this.typeConverter;
        }

        public final List<FieldValidator<?>> getValidators() {
            return this.validators;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.typeConverter.hashCode() * 31) + this.fieldAnnotation.hashCode()) * 31;
            boolean z11 = this.isRequired;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return ((hashCode + i11) * 31) + this.validators.hashCode();
        }

        public final boolean isRequired() {
            return this.isRequired;
        }

        public String toString() {
            TypeConverter<?> typeConverter = this.typeConverter;
            Field field = this.fieldAnnotation;
            boolean z11 = this.isRequired;
            List<FieldValidator<?>> list = this.validators;
            return "PropertyDescriptor(typeConverter=" + typeConverter + ", fieldAnnotation=" + field + ", isRequired=" + z11 + ", validators=" + list + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecordTypeConverter(TypeConverterProvider converterProvider, p type) {
        super(type.e());
        int t11;
        List Y;
        Map<o<? extends Object, ?>, PropertyDescriptor> t12;
        vz.p pVar;
        Object obj;
        s.g(converterProvider, "converterProvider");
        s.g(type, "type");
        this.converterProvider = converterProvider;
        this.type = type;
        this.objectConstructorFactory = new ObjectConstructorFactory();
        f c11 = type.c();
        Objects.requireNonNull(c11, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        Collection<o<? extends Object, ?>> c12 = b.c((d) c11);
        t11 = x.t(c12, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (o<? extends Object, ?> oVar : c12) {
            Iterator<T> it2 = oVar.getAnnotations().iterator();
            while (true) {
                pVar = null;
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((Annotation) obj) instanceof Field) {
                    break;
                }
            }
            Field field = (Field) obj;
            if (field != null) {
                TypeConverter<?> obtainTypeConverter = this.converterProvider.obtainTypeConverter(oVar.getReturnType());
                Iterator<T> it3 = oVar.getAnnotations().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (((Annotation) next) instanceof Required) {
                        pVar = next;
                        break;
                    }
                }
                pVar = v.a(oVar, new PropertyDescriptor(obtainTypeConverter, field, ((Required) pVar) != null, getValidators(oVar)));
            }
            arrayList.add(pVar);
        }
        Y = e0.Y(arrayList);
        t12 = s0.t(Y);
        this.propertyDescriptors = t12;
    }

    private final <T> ObjectConstructor<T> getObjectConstructor(Class<T> cls) {
        return this.objectConstructorFactory.get(cls);
    }

    private final List<FieldValidator<?>> getValidators(o<? extends Object, ?> oVar) {
        int t11;
        List<vz.p> Y;
        int t12;
        vz.p pVar;
        Object obj;
        List<Annotation> annotations = oVar.getAnnotations();
        t11 = x.t(annotations, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (Annotation annotation : annotations) {
            Iterator<T> it2 = a.a(annotation).getAnnotations().iterator();
            while (true) {
                pVar = null;
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((Annotation) obj) instanceof BindUsing) {
                    break;
                }
            }
            BindUsing bindUsing = (BindUsing) obj;
            if (bindUsing != null) {
                pVar = v.a(annotation, bindUsing);
            }
            arrayList.add(pVar);
        }
        Y = e0.Y(arrayList);
        t12 = x.t(Y, 10);
        ArrayList arrayList2 = new ArrayList(t12);
        for (vz.p pVar2 : Y) {
            arrayList2.add(((ValidationBinder) b.a(m0.b(((BindUsing) pVar2.b()).binder()))).bind((Annotation) pVar2.a(), oVar.getReturnType()));
        }
        return arrayList2;
    }

    public final p getType() {
        return this.type;
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public T convertNonOptional(Dynamic value) {
        boolean w11;
        s.g(value, "value");
        try {
            ReadableMap asMap = value.asMap();
            f c11 = getType().c();
            if (c11 != null) {
                T construct = getObjectConstructor(a.b((d) c11)).construct();
                for (Map.Entry<o<? extends Object, ?>, PropertyDescriptor> entry : this.propertyDescriptors.entrySet()) {
                    o<? extends Object, ?> key = entry.getKey();
                    PropertyDescriptor value2 = entry.getValue();
                    String key2 = value2.getFieldAnnotation().key();
                    w11 = kotlin.text.v.w(key2);
                    if (w11) {
                        key2 = null;
                    }
                    if (key2 == null) {
                        key2 = key.getName();
                    }
                    if (!asMap.hasKey(key2)) {
                        if (value2.isRequired()) {
                            throw new FieldRequiredException(key);
                        }
                    } else {
                        Dynamic dynamic = asMap.getDynamic(key2);
                        s.f(dynamic, "jsMap.getDynamic(jsKey)");
                        try {
                            java.lang.reflect.Field b11 = c.b(key);
                            s.e(b11);
                            try {
                                Object convert = value2.getTypeConverter().convert(dynamic);
                                if (convert != null) {
                                    Iterator<T> it2 = value2.getValidators().iterator();
                                    while (it2.hasNext()) {
                                        ((FieldValidator) it2.next()).validate(convert);
                                    }
                                }
                                b11.setAccessible(true);
                                b11.set(construct, convert);
                                b0 b0Var = b0.f54756a;
                            } catch (CodedException e11) {
                                String name = key.getName();
                                p returnType = key.getReturnType();
                                ReadableType type = dynamic.getType();
                                s.f(type, "type");
                                throw new FieldCastException(name, returnType, type, e11);
                            } catch (Throwable th2) {
                                UnexpectedException unexpectedException = new UnexpectedException(th2);
                                String name2 = key.getName();
                                p returnType2 = key.getReturnType();
                                ReadableType type2 = dynamic.getType();
                                s.f(type2, "type");
                                throw new FieldCastException(name2, returnType2, type2, unexpectedException);
                            }
                        } finally {
                            dynamic.recycle();
                        }
                    }
                }
                return construct;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        } catch (CodedException e12) {
            throw new RecordCastException(getType(), e12);
        } catch (Throwable th3) {
            throw new RecordCastException(getType(), new UnexpectedException(th3));
        }
    }
}